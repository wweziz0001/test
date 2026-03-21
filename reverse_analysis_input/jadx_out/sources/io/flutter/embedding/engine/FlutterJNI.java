package io.flutter.embedding.engine;

import B0.l;
import Z1.c;
import Z1.i;
import a0.C0200z;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.res.AssetManager;
import android.graphics.Bitmap;
import android.graphics.ColorSpace;
import android.graphics.ImageDecoder;
import android.os.Build;
import android.os.Looper;
import android.util.Log;
import android.util.Size;
import android.util.SparseArray;
import android.view.Choreographer;
import android.view.Surface;
import android.view.SurfaceControl;
import android.view.View;
import android.widget.FrameLayout;
import b3.AbstractC0307a;
import e3.InterfaceC0393b;
import e3.InterfaceC0400i;
import e3.InterfaceC0401j;
import f3.f;
import f3.j;
import f3.k;
import g.InterfaceC0434a;
import g3.InterfaceC0440a;
import i3.b;
import io.flutter.embedding.android.C;
import io.flutter.embedding.android.C0503w;
import io.flutter.embedding.android.D;
import io.flutter.embedding.engine.FlutterJNI;
import io.flutter.embedding.engine.mutatorsstack.FlutterMutatorsStack;
import io.flutter.embedding.engine.renderer.SurfaceTextureWrapper;
import io.flutter.embedding.engine.renderer.m;
import io.flutter.plugin.platform.d;
import io.flutter.plugin.platform.g;
import io.flutter.plugin.platform.n;
import io.flutter.plugin.platform.o;
import io.flutter.plugin.platform.p;
import io.flutter.view.FlutterCallbackInformation;
import io.flutter.view.TextureRegistry$ImageConsumer;
import io.flutter.view.a;
import io.flutter.view.e;
import io.flutter.view.q;
import io.flutter.view.r;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.ref.WeakReference;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import k2.C0540a;
import m.B0;
import n3.InterfaceC0695e;
import n3.w;
import o3.C0721a;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC0434a
public class FlutterJNI {
    private static final String TAG = "FlutterJNI";
    private static InterfaceC0401j asyncWaitForVsyncDelegate = null;
    private static float displayDensity = -1.0f;
    private static float displayHeight = -1.0f;
    private static float displayWidth = -1.0f;
    private static boolean initCalled = false;
    private static boolean loadLibraryCalled = false;
    private static boolean prefetchDefaultFontManagerCalled = false;
    private static float refreshRateFPS = 60.0f;
    private static String vmServiceUri;
    private InterfaceC0400i accessibilityDelegate;
    private InterfaceC0440a deferredComponentManager;
    private C0721a localizationPlugin;
    private Long nativeShellHolderId;
    private k platformMessageHandler;
    private p platformViewsController;
    private o platformViewsController2;
    private ReentrantReadWriteLock shellHolderLock = new ReentrantReadWriteLock();
    private final Set<InterfaceC0393b> engineLifecycleListeners = new CopyOnWriteArraySet();
    private final Set<m> flutterUiDisplayListeners = new CopyOnWriteArraySet();
    private final Looper mainLooper = Looper.getMainLooper();

    private static void asyncWaitForVsync(long j5) {
        InterfaceC0401j interfaceC0401j = asyncWaitForVsyncDelegate;
        if (interfaceC0401j == null) {
            throw new IllegalStateException("An AsyncWaitForVsyncDelegate must be registered with FlutterJNI before asyncWaitForVsync() is invoked.");
        }
        a aVar = (a) interfaceC0401j;
        aVar.getClass();
        Choreographer choreographer = Choreographer.getInstance();
        r rVar = (r) aVar.f6843a;
        q qVar = rVar.f6966c;
        if (qVar != null) {
            qVar.f6960l = j5;
            rVar.f6966c = null;
        } else {
            qVar = new q(rVar, j5);
        }
        choreographer.postFrameCallback(qVar);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [e3.h] */
    public static Bitmap decodeImage(ByteBuffer byteBuffer, final long j5) {
        if (Build.VERSION.SDK_INT >= 28) {
            try {
                return ImageDecoder.decodeBitmap(ImageDecoder.createSource(byteBuffer), new ImageDecoder.OnHeaderDecodedListener() { // from class: e3.h
                    @Override // android.graphics.ImageDecoder.OnHeaderDecodedListener
                    public final void onHeaderDecoded(ImageDecoder imageDecoder, ImageDecoder.ImageInfo imageInfo, ImageDecoder.Source source) {
                        FlutterJNI.lambda$decodeImage$1(j5, imageDecoder, imageInfo, source);
                    }
                });
            } catch (IOException e5) {
                Log.e(TAG, "Failed to decode image", e5);
            }
        }
        return null;
    }

    private void ensureAttachedToNative() {
        if (this.nativeShellHolderId == null) {
            throw new RuntimeException("Cannot execute operation because FlutterJNI is not attached to native.");
        }
    }

    private void ensureNotAttachedToNative() {
        if (this.nativeShellHolderId != null) {
            throw new RuntimeException("Cannot execute operation because FlutterJNI is attached to native.");
        }
    }

    private void ensureRunningOnMainThread() {
        if (Looper.myLooper() == this.mainLooper) {
            return;
        }
        throw new RuntimeException("Methods marked with @UiThread must be executed on the main thread. Current thread: " + Thread.currentThread().getName());
    }

    public static String getVMServiceUri() {
        return vmServiceUri;
    }

    private void handlePlatformMessageResponse(int i, ByteBuffer byteBuffer) {
        InterfaceC0695e interfaceC0695e;
        k kVar = this.platformMessageHandler;
        if (kVar == null || (interfaceC0695e = (InterfaceC0695e) ((j) kVar).f5777q.remove(Integer.valueOf(i))) == null) {
            return;
        }
        try {
            interfaceC0695e.a(byteBuffer);
            if (byteBuffer == null || !byteBuffer.isDirect()) {
                return;
            }
            byteBuffer.limit(0);
        } catch (Error e5) {
            Thread threadCurrentThread = Thread.currentThread();
            if (threadCurrentThread.getUncaughtExceptionHandler() == null) {
                throw e5;
            }
            threadCurrentThread.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread, e5);
        } catch (Exception e6) {
            Log.e("DartMessenger", "Uncaught exception in binary message reply handler", e6);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$decodeImage$1(long j5, ImageDecoder imageDecoder, ImageDecoder.ImageInfo imageInfo, ImageDecoder.Source source) {
        imageDecoder.setTargetColorSpace(ColorSpace.get(ColorSpace.Named.SRGB));
        imageDecoder.setAllocator(1);
        Size size = imageInfo.getSize();
        nativeImageHeaderCallback(j5, size.getWidth(), size.getHeight());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$loadLibrary$0(String str) {
    }

    private native long nativeAttach(FlutterJNI flutterJNI);

    private native void nativeCleanupMessageData(long j5);

    private native void nativeDeferredComponentInstallFailure(int i, String str, boolean z4);

    private native void nativeDestroy(long j5);

    private native void nativeDispatchEmptyPlatformMessage(long j5, String str, int i);

    private native void nativeDispatchPlatformMessage(long j5, String str, ByteBuffer byteBuffer, int i, int i5);

    private native void nativeDispatchPointerDataPacket(long j5, ByteBuffer byteBuffer, int i);

    private native void nativeDispatchSemanticsAction(long j5, int i, int i5, ByteBuffer byteBuffer, int i6);

    private native boolean nativeFlutterTextUtilsIsEmoji(int i);

    private native boolean nativeFlutterTextUtilsIsEmojiModifier(int i);

    private native boolean nativeFlutterTextUtilsIsEmojiModifierBase(int i);

    private native boolean nativeFlutterTextUtilsIsRegionalIndicator(int i);

    private native boolean nativeFlutterTextUtilsIsVariationSelector(int i);

    private native Bitmap nativeGetBitmap(long j5);

    private native boolean nativeGetIsSoftwareRenderingEnabled();

    public static native void nativeImageHeaderCallback(long j5, int i, int i5);

    private static native void nativeInit(Context context, String[] strArr, String str, String str2, String str3, long j5, int i);

    private native void nativeInvokePlatformMessageEmptyResponseCallback(long j5, int i);

    private native void nativeInvokePlatformMessageResponseCallback(long j5, int i, ByteBuffer byteBuffer, int i5);

    private native boolean nativeIsSurfaceControlEnabled(long j5);

    private native void nativeLoadDartDeferredLibrary(long j5, int i, String[] strArr);

    @Deprecated
    public static native FlutterCallbackInformation nativeLookupCallbackInformation(long j5);

    private native void nativeMarkTextureFrameAvailable(long j5, long j6);

    private native void nativeNotifyLowMemoryWarning(long j5);

    private native void nativeOnVsync(long j5, long j6, long j7);

    private static native void nativePrefetchDefaultFontManager();

    private native void nativeRegisterImageTexture(long j5, long j6, WeakReference<TextureRegistry$ImageConsumer> weakReference, boolean z4);

    private native void nativeRegisterTexture(long j5, long j6, WeakReference<SurfaceTextureWrapper> weakReference);

    private native void nativeRunBundleAndSnapshotFromLibrary(long j5, String str, String str2, String str3, AssetManager assetManager, List<String> list, long j6);

    private native void nativeScheduleFrame(long j5);

    private native void nativeSetAccessibilityFeatures(long j5, int i);

    private native void nativeSetSemanticsEnabled(long j5, boolean z4);

    private native void nativeSetViewportMetrics(long j5, float f2, int i, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int[] iArr, int[] iArr2, int[] iArr3);

    private native FlutterJNI nativeSpawn(long j5, String str, String str2, String str3, List<String> list, long j6);

    private native void nativeSurfaceChanged(long j5, int i, int i5);

    private native void nativeSurfaceCreated(long j5, Surface surface);

    private native void nativeSurfaceDestroyed(long j5);

    private native void nativeSurfaceWindowChanged(long j5, Surface surface);

    private native void nativeUnregisterTexture(long j5, long j6);

    private native void nativeUpdateDisplayMetrics(long j5);

    private native void nativeUpdateJavaAssetManager(long j5, AssetManager assetManager, String str);

    private native void nativeUpdateRefreshRate(float f2);

    private void onPreEngineRestart() {
        Iterator<InterfaceC0393b> it = this.engineLifecycleListeners.iterator();
        while (it.hasNext()) {
            it.next().onPreEngineRestart();
        }
    }

    private void updateCustomAccessibilityActions(ByteBuffer byteBuffer, String[] strArr) {
        ensureRunningOnMainThread();
        InterfaceC0400i interfaceC0400i = this.accessibilityDelegate;
        if (interfaceC0400i != null) {
            a aVar = (a) interfaceC0400i;
            aVar.getClass();
            byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
            io.flutter.view.k kVar = (io.flutter.view.k) aVar.f6843a;
            kVar.getClass();
            while (byteBuffer.hasRemaining()) {
                e eVarB = kVar.b(byteBuffer.getInt());
                eVarB.f6872c = byteBuffer.getInt();
                int i = byteBuffer.getInt();
                String str = null;
                eVarB.f6873d = i == -1 ? null : strArr[i];
                int i5 = byteBuffer.getInt();
                if (i5 != -1) {
                    str = strArr[i5];
                }
                eVarB.f6874e = str;
            }
        }
    }

    private void updateSemantics(ByteBuffer byteBuffer, String[] strArr, ByteBuffer[] byteBufferArr) {
        ensureRunningOnMainThread();
        InterfaceC0400i interfaceC0400i = this.accessibilityDelegate;
        if (interfaceC0400i != null) {
            ((a) interfaceC0400i).a(byteBuffer, strArr, byteBufferArr);
        }
    }

    public boolean IsSurfaceControlEnabled() {
        return nativeIsSurfaceControlEnabled(this.nativeShellHolderId.longValue());
    }

    public void addEngineLifecycleListener(InterfaceC0393b interfaceC0393b) {
        ensureRunningOnMainThread();
        this.engineLifecycleListeners.add(interfaceC0393b);
    }

    public void addIsDisplayingFlutterUiListener(m mVar) {
        ensureRunningOnMainThread();
        this.flutterUiDisplayListeners.add(mVar);
    }

    @SuppressLint({"NewApi"})
    public void applyTransactions() {
        o oVar = this.platformViewsController2;
        if (oVar == null) {
            throw new RuntimeException("");
        }
        oVar.getClass();
        SurfaceControl.Transaction transactionH = n.h();
        int i = 0;
        while (true) {
            ArrayList arrayList = oVar.f6788l;
            if (i >= arrayList.size()) {
                transactionH.apply();
                arrayList.clear();
                return;
            } else {
                transactionH = transactionH.merge(n.i(arrayList.get(i)));
                i++;
            }
        }
    }

    public void attachToNative() {
        ensureRunningOnMainThread();
        ensureNotAttachedToNative();
        this.shellHolderLock.writeLock().lock();
        try {
            this.nativeShellHolderId = Long.valueOf(performNativeAttach(this));
        } finally {
            this.shellHolderLock.writeLock().unlock();
        }
    }

    public void cleanupMessageData(long j5) {
        nativeCleanupMessageData(j5);
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x0134, code lost:
    
        r4 = r0.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x013c, code lost:
    
        if (r4.hasNext() == false) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x013e, code lost:
    
        r5 = (java.util.Locale) r4.next();
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0150, code lost:
    
        if (r3.getLanguage().equals(r5.toLanguageTag()) == false) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0153, code lost:
    
        r4 = r0.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x015b, code lost:
    
        if (r4.hasNext() == false) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x015d, code lost:
    
        r5 = (java.util.Locale) r4.next();
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x016f, code lost:
    
        if (r3.getLanguage().equals(r5.getLanguage()) == false) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0172, code lost:
    
        r2 = r2 + 1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.String[] computePlatformResolvedLocale(java.lang.String[] r10) {
        /*
            Method dump skipped, instruction units count: 401
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.flutter.embedding.engine.FlutterJNI.computePlatformResolvedLocale(java.lang.String[]):java.lang.String[]");
    }

    public FlutterOverlaySurface createOverlaySurface() {
        ensureRunningOnMainThread();
        p pVar = this.platformViewsController;
        if (pVar == null) {
            throw new RuntimeException("platformViewsController must be set before attempting to position an overlay surface");
        }
        d dVar = new d(pVar.f6797d.getContext(), pVar.f6797d.getWidth(), pVar.f6797d.getHeight(), 2);
        dVar.f6751r = pVar.i;
        int i = pVar.f6808p;
        pVar.f6808p = i + 1;
        pVar.f6806n.put(i, dVar);
        return new FlutterOverlaySurface(i, dVar.getSurface());
    }

    @SuppressLint({"NewApi"})
    public FlutterOverlaySurface createOverlaySurface2() {
        o oVar = this.platformViewsController2;
        if (oVar == null) {
            throw new RuntimeException("platformViewsController must be set before attempting to position an overlay surface");
        }
        if (oVar.f6790n == null) {
            SurfaceControl.Builder builderG = n.g();
            builderG.setBufferSize(oVar.f6781d.getWidth(), oVar.f6781d.getHeight());
            builderG.setFormat(1);
            builderG.setName("Flutter Overlay Surface");
            builderG.setOpaque(false);
            builderG.setHidden(false);
            SurfaceControl surfaceControlBuild = builderG.build();
            SurfaceControl.Transaction transactionBuildReparentTransaction = oVar.f6781d.getRootSurfaceControl().buildReparentTransaction(surfaceControlBuild);
            transactionBuildReparentTransaction.setLayer(surfaceControlBuild, 1000);
            transactionBuildReparentTransaction.apply();
            oVar.f6790n = n.f(surfaceControlBuild);
            oVar.f6791o = surfaceControlBuild;
        }
        return new FlutterOverlaySurface(0, oVar.f6790n);
    }

    @SuppressLint({"NewApi"})
    public SurfaceControl.Transaction createTransaction() {
        o oVar = this.platformViewsController2;
        if (oVar == null) {
            throw new RuntimeException("");
        }
        oVar.getClass();
        SurfaceControl.Transaction transactionH = n.h();
        oVar.f6788l.add(transactionH);
        return transactionH;
    }

    public void deferredComponentInstallFailure(int i, String str, boolean z4) {
        ensureRunningOnMainThread();
        nativeDeferredComponentInstallFailure(i, str, z4);
    }

    @SuppressLint({"NewApi"})
    public void destroyOverlaySurface2() {
        ensureRunningOnMainThread();
        o oVar = this.platformViewsController2;
        if (oVar == null) {
            throw new RuntimeException("platformViewsController must be set before attempting to destroy an overlay surface");
        }
        Surface surface = oVar.f6790n;
        if (surface != null) {
            surface.release();
            oVar.f6790n = null;
            oVar.f6791o = null;
        }
    }

    public void destroyOverlaySurfaces() {
        ensureRunningOnMainThread();
        p pVar = this.platformViewsController;
        if (pVar == null) {
            throw new RuntimeException("platformViewsController must be set before attempting to destroy an overlay surface");
        }
        pVar.c();
    }

    public void detachFromNativeAndReleaseResources() {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        this.shellHolderLock.writeLock().lock();
        try {
            nativeDestroy(this.nativeShellHolderId.longValue());
            this.nativeShellHolderId = null;
        } finally {
            this.shellHolderLock.writeLock().unlock();
        }
    }

    public void dispatchEmptyPlatformMessage(String str, int i) {
        ensureRunningOnMainThread();
        if (isAttached()) {
            nativeDispatchEmptyPlatformMessage(this.nativeShellHolderId.longValue(), str, i);
            return;
        }
        Log.w(TAG, "Tried to send a platform message to Flutter, but FlutterJNI was detached from native C++. Could not send. Channel: " + str + ". Response ID: " + i);
    }

    public void dispatchPlatformMessage(String str, ByteBuffer byteBuffer, int i, int i5) {
        ensureRunningOnMainThread();
        if (isAttached()) {
            nativeDispatchPlatformMessage(this.nativeShellHolderId.longValue(), str, byteBuffer, i, i5);
            return;
        }
        Log.w(TAG, "Tried to send a platform message to Flutter, but FlutterJNI was detached from native C++. Could not send. Channel: " + str + ". Response ID: " + i5);
    }

    public void dispatchPointerDataPacket(ByteBuffer byteBuffer, int i) {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeDispatchPointerDataPacket(this.nativeShellHolderId.longValue(), byteBuffer, i);
    }

    public void dispatchSemanticsAction(int i, io.flutter.view.d dVar) {
        dispatchSemanticsAction(i, dVar, null);
    }

    @SuppressLint({"NewApi"})
    public void endFrame2() {
        o oVar = this.platformViewsController2;
        if (oVar == null) {
            throw new RuntimeException("");
        }
        SurfaceControl.Transaction transactionH = n.h();
        int i = 0;
        while (true) {
            ArrayList arrayList = oVar.f6789m;
            if (i >= arrayList.size()) {
                arrayList.clear();
                oVar.f6781d.invalidate();
                oVar.f6781d.getRootSurfaceControl().applyTransactionOnDraw(transactionH);
                return;
            }
            transactionH = transactionH.merge(n.i(arrayList.get(i)));
            i++;
        }
    }

    public Bitmap getBitmap() {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        return nativeGetBitmap(this.nativeShellHolderId.longValue());
    }

    public boolean getIsSoftwareRenderingEnabled() {
        return nativeGetIsSoftwareRenderingEnabled();
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0098  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public float getScaledFontSize(float r7, int r8) {
        /*
            r6 = this;
            Z1.s r0 = m3.C0678l.f8722b
            java.lang.Object r1 = r0.f3086n
            m3.k r1 = (m3.C0677k) r1
            java.lang.Object r2 = r0.f3085m
            java.util.concurrent.ConcurrentLinkedQueue r2 = (java.util.concurrent.ConcurrentLinkedQueue) r2
            if (r1 != 0) goto L14
            java.lang.Object r1 = r2.poll()
            m3.k r1 = (m3.C0677k) r1
            r0.f3086n = r1
        L14:
            java.lang.Object r1 = r0.f3086n
            m3.k r1 = (m3.C0677k) r1
            if (r1 == 0) goto L27
            int r3 = r1.f8720a
            if (r3 >= r8) goto L27
            java.lang.Object r1 = r2.poll()
            m3.k r1 = (m3.C0677k) r1
            r0.f3086n = r1
            goto L14
        L27:
            r2 = 0
            java.lang.String r3 = "Cannot find config with generation: "
            java.lang.String r4 = "SettingsChannel"
            if (r1 != 0) goto L48
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r3)
            java.lang.String r1 = java.lang.String.valueOf(r8)
            r0.append(r1)
            java.lang.String r1 = ", after exhausting the queue."
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            android.util.Log.e(r4, r0)
        L46:
            r1 = r2
            goto L72
        L48:
            int r5 = r1.f8720a
            if (r5 == r8) goto L72
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r3)
            java.lang.String r3 = java.lang.String.valueOf(r8)
            r1.append(r3)
            java.lang.String r3 = ", the oldest config is now: "
            r1.append(r3)
            java.lang.Object r0 = r0.f3086n
            m3.k r0 = (m3.C0677k) r0
            int r0 = r0.f8720a
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            android.util.Log.e(r4, r0)
            goto L46
        L72:
            if (r1 != 0) goto L75
            goto L77
        L75:
            android.util.DisplayMetrics r2 = r1.f8721b
        L77:
            if (r2 != 0) goto L98
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r0 = "getScaledFontSize called with configurationId "
            r7.<init>(r0)
            java.lang.String r8 = java.lang.String.valueOf(r8)
            r7.append(r8)
            java.lang.String r8 = ", which can't be found."
            r7.append(r8)
            java.lang.String r7 = r7.toString()
            java.lang.String r8 = "FlutterJNI"
            android.util.Log.e(r8, r7)
            r7 = -1082130432(0xffffffffbf800000, float:-1.0)
            return r7
        L98:
            r8 = 2
            float r7 = android.util.TypedValue.applyDimension(r8, r7, r2)
            float r8 = r2.density
            float r7 = r7 / r8
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: io.flutter.embedding.engine.FlutterJNI.getScaledFontSize(float, int):float");
    }

    public void handlePlatformMessage(String str, ByteBuffer byteBuffer, int i, long j5) {
        f fVar;
        boolean z4;
        k kVar = this.platformMessageHandler;
        if (kVar == null) {
            nativeCleanupMessageData(j5);
            return;
        }
        j jVar = (j) kVar;
        synchronized (jVar.f5775o) {
            try {
                fVar = (f) jVar.f5773m.get(str);
                z4 = jVar.f5776p.get() && fVar == null;
                if (z4) {
                    if (!jVar.f5774n.containsKey(str)) {
                        jVar.f5774n.put(str, new LinkedList());
                    }
                    ((List) jVar.f5774n.get(str)).add(new f3.d(j5, byteBuffer, i));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z4) {
            return;
        }
        jVar.a(str, fVar, byteBuffer, i, j5);
    }

    @SuppressLint({"NewApi"})
    public void hideOverlaySurface2() {
        o oVar = this.platformViewsController2;
        if (oVar == null) {
            throw new RuntimeException("platformViewsController must be set before attempting to destroy an overlay surface");
        }
        if (oVar.f6791o == null) {
            return;
        }
        SurfaceControl.Transaction transactionH = n.h();
        transactionH.setVisibility(oVar.f6791o, false);
        transactionH.apply();
    }

    public void init(Context context, String[] strArr, String str, String str2, String str3, long j5, int i) {
        if (initCalled) {
            Log.w(TAG, "FlutterJNI.init called more than once");
        }
        nativeInit(context, strArr, str, str2, str3, j5, i);
        initCalled = true;
    }

    public void invokePlatformMessageEmptyResponseCallback(int i) {
        this.shellHolderLock.readLock().lock();
        try {
            if (isAttached()) {
                nativeInvokePlatformMessageEmptyResponseCallback(this.nativeShellHolderId.longValue(), i);
            } else {
                Log.w(TAG, "Tried to send a platform message response, but FlutterJNI was detached from native C++. Could not send. Response ID: " + i);
            }
            this.shellHolderLock.readLock().unlock();
        } catch (Throwable th) {
            this.shellHolderLock.readLock().unlock();
            throw th;
        }
    }

    public void invokePlatformMessageResponseCallback(int i, ByteBuffer byteBuffer, int i5) {
        if (!byteBuffer.isDirect()) {
            throw new IllegalArgumentException("Expected a direct ByteBuffer.");
        }
        this.shellHolderLock.readLock().lock();
        try {
            if (isAttached()) {
                nativeInvokePlatformMessageResponseCallback(this.nativeShellHolderId.longValue(), i, byteBuffer, i5);
            } else {
                Log.w(TAG, "Tried to send a platform message response, but FlutterJNI was detached from native C++. Could not send. Response ID: " + i);
            }
            this.shellHolderLock.readLock().unlock();
        } catch (Throwable th) {
            this.shellHolderLock.readLock().unlock();
            throw th;
        }
    }

    public boolean isAttached() {
        return this.nativeShellHolderId != null;
    }

    public boolean isCodePointEmoji(int i) {
        return nativeFlutterTextUtilsIsEmoji(i);
    }

    public boolean isCodePointEmojiModifier(int i) {
        return nativeFlutterTextUtilsIsEmojiModifier(i);
    }

    public boolean isCodePointEmojiModifierBase(int i) {
        return nativeFlutterTextUtilsIsEmojiModifierBase(i);
    }

    public boolean isCodePointRegionalIndicator(int i) {
        return nativeFlutterTextUtilsIsRegionalIndicator(i);
    }

    public boolean isCodePointVariantSelector(int i) {
        return nativeFlutterTextUtilsIsVariationSelector(i);
    }

    public void loadDartDeferredLibrary(int i, String[] strArr) {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeLoadDartDeferredLibrary(this.nativeShellHolderId.longValue(), i, strArr);
    }

    public void loadLibrary(Context context) throws Throwable {
        c cVar;
        String[] strArrU;
        ZipFile zipFile;
        InputStream inputStream;
        InputStream inputStream2;
        FileOutputStream fileOutputStream;
        FileOutputStream fileOutputStream2;
        if (loadLibraryCalled) {
            Log.w(TAG, "FlutterJNI.loadLibrary called more than once");
        }
        l lVar = new l(1);
        i iVar = new i(12);
        iVar.f3015o = lVar;
        if (context == null) {
            throw new IllegalArgumentException("Given context is null");
        }
        iVar.r("Beginning load of %s...", "flutter");
        C0200z c0200z = (C0200z) iVar.f3013m;
        HashSet hashSet = (HashSet) iVar.f3012l;
        if (hashSet.contains("flutter")) {
            iVar.r("%s already loaded previously!", "flutter");
        } else {
            try {
                c0200z.getClass();
                System.loadLibrary("flutter");
                hashSet.add("flutter");
                iVar.r("%s (%s) was loaded normally!", "flutter", null);
            } catch (UnsatisfiedLinkError e5) {
                iVar.r("Loading the library normally failed: %s", Log.getStackTraceString(e5));
                iVar.r("%s (%s) was not loaded normally, re-linking...", "flutter", null);
                File fileP = iVar.p(context);
                if (!fileP.exists()) {
                    File dir = context.getDir("lib", 0);
                    File fileP2 = iVar.p(context);
                    c0200z.getClass();
                    File[] fileArrListFiles = dir.listFiles(new C0540a(System.mapLibraryName("flutter")));
                    if (fileArrListFiles != null) {
                        for (File file : fileArrListFiles) {
                            if (!file.getAbsolutePath().equals(fileP2.getAbsolutePath())) {
                                file.delete();
                            }
                        }
                    }
                    String[] strArr = Build.SUPPORTED_ABIS;
                    if (strArr.length <= 0) {
                        String str = Build.CPU_ABI2;
                        strArr = (str == null || str.length() == 0) ? new String[]{Build.CPU_ABI} : new String[]{Build.CPU_ABI, str};
                    }
                    String strMapLibraryName = System.mapLibraryName("flutter");
                    ((C0200z) iVar.f3014n).getClass();
                    try {
                        c cVarR = C0200z.r(context, strArr, strMapLibraryName, iVar);
                        try {
                            if (cVarR == null) {
                                try {
                                    strArrU = C0200z.u(context, strMapLibraryName);
                                } catch (Exception e6) {
                                    strArrU = new String[]{e6.toString()};
                                }
                                StringBuilder sbM = AbstractC0307a.m("Could not find '", strMapLibraryName, "'. Looked for: ");
                                sbM.append(Arrays.toString(strArr));
                                sbM.append(", but only found: ");
                                throw new A1.c(B0.i(sbM, Arrays.toString(strArrU), "."));
                            }
                            int i = 0;
                            while (true) {
                                int i5 = i + 1;
                                zipFile = (ZipFile) cVarR.f2996l;
                                if (i >= 5) {
                                    if (((l) iVar.f3015o) != null) {
                                        lambda$loadLibrary$0("FATAL! Couldn't extract the library from the APK!");
                                    }
                                    if (zipFile != null) {
                                        break;
                                    }
                                } else {
                                    iVar.r("Found %s! Extracting...", strMapLibraryName);
                                    try {
                                        if (fileP.exists() || fileP.createNewFile()) {
                                            try {
                                                inputStream2 = zipFile.getInputStream((ZipEntry) cVarR.f2997m);
                                            } catch (FileNotFoundException unused) {
                                                inputStream2 = null;
                                            } catch (IOException unused2) {
                                                inputStream2 = null;
                                            } catch (Throwable th) {
                                                th = th;
                                                inputStream = null;
                                            }
                                            try {
                                                fileOutputStream2 = new FileOutputStream(fileP);
                                                try {
                                                    byte[] bArr = new byte[4096];
                                                    long j5 = 0;
                                                    while (true) {
                                                        int i6 = inputStream2.read(bArr);
                                                        if (i6 == -1) {
                                                            break;
                                                        }
                                                        fileOutputStream2.write(bArr, 0, i6);
                                                        j5 += (long) i6;
                                                    }
                                                    fileOutputStream2.flush();
                                                    fileOutputStream2.getFD().sync();
                                                    if (j5 == fileP.length()) {
                                                        C0200z.p(inputStream2);
                                                        C0200z.p(fileOutputStream2);
                                                        fileP.setReadable(true, false);
                                                        fileP.setExecutable(true, false);
                                                        fileP.setWritable(true);
                                                        break;
                                                    }
                                                    C0200z.p(inputStream2);
                                                    C0200z.p(fileOutputStream2);
                                                } catch (FileNotFoundException unused3) {
                                                    C0200z.p(inputStream2);
                                                    C0200z.p(fileOutputStream2);
                                                    i = i5;
                                                } catch (IOException unused4) {
                                                    C0200z.p(inputStream2);
                                                    C0200z.p(fileOutputStream2);
                                                    i = i5;
                                                } catch (Throwable th2) {
                                                    th = th2;
                                                    inputStream = inputStream2;
                                                    fileOutputStream = fileOutputStream2;
                                                    C0200z.p(inputStream);
                                                    C0200z.p(fileOutputStream);
                                                    throw th;
                                                }
                                            } catch (FileNotFoundException unused5) {
                                                fileOutputStream2 = null;
                                                C0200z.p(inputStream2);
                                                C0200z.p(fileOutputStream2);
                                                i = i5;
                                            } catch (IOException unused6) {
                                                fileOutputStream2 = null;
                                                C0200z.p(inputStream2);
                                                C0200z.p(fileOutputStream2);
                                                i = i5;
                                            } catch (Throwable th3) {
                                                th = th3;
                                                inputStream = inputStream2;
                                                fileOutputStream = null;
                                                C0200z.p(inputStream);
                                                C0200z.p(fileOutputStream);
                                                throw th;
                                            }
                                        }
                                    } catch (IOException unused7) {
                                    }
                                    i = i5;
                                }
                            }
                            try {
                                zipFile.close();
                            } catch (IOException unused8) {
                            }
                        } catch (Throwable th4) {
                            th = th4;
                            cVar = cVarR;
                            if (cVar != null) {
                                try {
                                    ZipFile zipFile2 = (ZipFile) cVar.f2996l;
                                    if (zipFile2 != null) {
                                        zipFile2.close();
                                    }
                                } catch (IOException unused9) {
                                }
                            }
                            throw th;
                        }
                    } catch (Throwable th5) {
                        th = th5;
                        cVar = null;
                    }
                }
                String absolutePath = fileP.getAbsolutePath();
                c0200z.getClass();
                System.load(absolutePath);
                hashSet.add("flutter");
                iVar.r("%s (%s) was re-linked!", "flutter", null);
            }
        }
        loadLibraryCalled = true;
    }

    public void markTextureFrameAvailable(long j5) {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeMarkTextureFrameAvailable(this.nativeShellHolderId.longValue(), j5);
    }

    public void notifyLowMemoryWarning() {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeNotifyLowMemoryWarning(this.nativeShellHolderId.longValue());
    }

    public void onBeginFrame() {
        ensureRunningOnMainThread();
        p pVar = this.platformViewsController;
        if (pVar == null) {
            throw new RuntimeException("platformViewsController must be set before attempting to begin the frame");
        }
        pVar.f6811s.clear();
        pVar.f6812t.clear();
    }

    public void onDisplayOverlaySurface(int i, int i5, int i6, int i7, int i8) {
        ensureRunningOnMainThread();
        p pVar = this.platformViewsController;
        if (pVar == null) {
            throw new RuntimeException("platformViewsController must be set before attempting to position an overlay surface");
        }
        SparseArray sparseArray = pVar.f6806n;
        if (sparseArray.get(i) == null) {
            throw new IllegalStateException(AbstractC0307a.h(i, "The overlay surface (id:", ") doesn't exist"));
        }
        pVar.i();
        View view = (d) sparseArray.get(i);
        if (view.getParent() == null) {
            pVar.f6797d.addView(view);
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i7, i8);
        layoutParams.leftMargin = i5;
        layoutParams.topMargin = i6;
        view.setLayoutParams(layoutParams);
        view.setVisibility(0);
        view.bringToFront();
        pVar.f6811s.add(Integer.valueOf(i));
    }

    public void onDisplayPlatformView(int i, int i5, int i6, int i7, int i8, int i9, int i10, FlutterMutatorsStack flutterMutatorsStack) {
        ensureRunningOnMainThread();
        p pVar = this.platformViewsController;
        if (pVar == null) {
            throw new RuntimeException("platformViewsController must be set before attempting to position a platform view");
        }
        pVar.i();
        SparseArray sparseArray = pVar.f6804l;
        g gVar = (g) sparseArray.get(i);
        if (gVar == null) {
            return;
        }
        SparseArray sparseArray2 = pVar.f6805m;
        if (sparseArray2.get(i) == null) {
            View view = gVar.getView();
            if (view == null) {
                throw new IllegalStateException("PlatformView#getView() returned null, but an Android view reference was expected.");
            }
            if (view.getParent() != null) {
                throw new IllegalStateException("The Android view returned from PlatformView#getView() was already added to a parent view.");
            }
            Activity activity = pVar.f6796c;
            b bVar = new b(activity, activity.getResources().getDisplayMetrics().density, pVar.f6795b);
            bVar.setOnDescendantFocusChangeListener(new io.flutter.plugin.platform.j(i, 0, pVar));
            sparseArray2.put(i, bVar);
            view.setImportantForAccessibility(4);
            bVar.addView(view);
            pVar.f6797d.addView(bVar);
        }
        b bVar2 = (b) sparseArray2.get(i);
        bVar2.f6479l = flutterMutatorsStack;
        bVar2.f6481n = i5;
        bVar2.f6482o = i6;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i7, i8);
        layoutParams.leftMargin = i5;
        layoutParams.topMargin = i6;
        bVar2.setLayoutParams(layoutParams);
        bVar2.setWillNotDraw(false);
        bVar2.setVisibility(0);
        bVar2.bringToFront();
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(i9, i10);
        View view2 = ((g) sparseArray.get(i)).getView();
        if (view2 != null) {
            view2.setLayoutParams(layoutParams2);
            view2.bringToFront();
        }
        pVar.f6812t.add(Integer.valueOf(i));
    }

    @SuppressLint({"NewApi"})
    public void onDisplayPlatformView2(int i, int i5, int i6, int i7, int i8, int i9, int i10, FlutterMutatorsStack flutterMutatorsStack) {
        ensureRunningOnMainThread();
        o oVar = this.platformViewsController2;
        if (oVar == null) {
            throw new RuntimeException("platformViewsController must be set before attempting to position a platform view");
        }
        SparseArray sparseArray = oVar.i;
        g gVar = (g) sparseArray.get(i);
        if (gVar == null) {
            return;
        }
        SparseArray sparseArray2 = oVar.f6786j;
        if (sparseArray2.get(i) == null) {
            View view = gVar.getView();
            if (view == null) {
                throw new IllegalStateException("PlatformView#getView() returned null, but an Android view reference was expected.");
            }
            if (view.getParent() != null) {
                throw new IllegalStateException("The Android view returned from PlatformView#getView() was already added to a parent view.");
            }
            Activity activity = oVar.f6780c;
            b bVar = new b(activity, activity.getResources().getDisplayMetrics().density, oVar.f6779b);
            bVar.setOnDescendantFocusChangeListener(new io.flutter.plugin.platform.j(i, 1, oVar));
            sparseArray2.put(i, bVar);
            view.setImportantForAccessibility(4);
            bVar.addView(view);
            oVar.f6781d.addView(bVar);
        }
        b bVar2 = (b) sparseArray2.get(i);
        bVar2.f6479l = flutterMutatorsStack;
        bVar2.f6481n = i5;
        bVar2.f6482o = i6;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i7, i8);
        layoutParams.leftMargin = i5;
        layoutParams.topMargin = i6;
        bVar2.setLayoutParams(layoutParams);
        bVar2.setWillNotDraw(false);
        bVar2.setVisibility(0);
        bVar2.bringToFront();
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(i9, i10);
        View view2 = ((g) sparseArray.get(i)).getView();
        if (view2 != null) {
            view2.setLayoutParams(layoutParams2);
            view2.bringToFront();
        }
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [android.view.View, io.flutter.embedding.engine.renderer.n] */
    public void onEndFrame() {
        ?? r32;
        ensureRunningOnMainThread();
        p pVar = this.platformViewsController;
        if (pVar == null) {
            throw new RuntimeException("platformViewsController must be set before attempting to end the frame");
        }
        boolean z4 = false;
        if (!pVar.f6809q || !pVar.f6812t.isEmpty()) {
            if (pVar.f6809q) {
                C0503w c0503w = pVar.f6797d.f6507n;
                if (c0503w != null ? c0503w.e() : false) {
                    z4 = true;
                }
            }
            pVar.f(z4);
            return;
        }
        pVar.f6809q = false;
        D d5 = pVar.f6797d;
        A3.c cVar = new A3.c(pVar, 15);
        C0503w c0503w2 = d5.f6507n;
        if (c0503w2 == null || (r32 = d5.f6509p) == 0) {
            return;
        }
        d5.f6508o = r32;
        d5.f6509p = null;
        io.flutter.embedding.engine.renderer.l lVar = d5.f6512s.f5606b;
        if (lVar != null) {
            r32.d();
            lVar.a(new C(d5, lVar, cVar));
            return;
        }
        c0503w2.c();
        C0503w c0503w3 = d5.f6507n;
        if (c0503w3 != null) {
            c0503w3.f6611l.close();
            d5.removeView(d5.f6507n);
            d5.f6507n = null;
        }
        cVar.run();
    }

    public void onFirstFrame() {
        ensureRunningOnMainThread();
        Iterator<m> it = this.flutterUiDisplayListeners.iterator();
        while (it.hasNext()) {
            it.next().onFlutterUiDisplayed();
        }
    }

    public void onRenderingStopped() {
        ensureRunningOnMainThread();
        Iterator<m> it = this.flutterUiDisplayListeners.iterator();
        while (it.hasNext()) {
            it.next().onFlutterUiNoLongerDisplayed();
        }
    }

    public void onSurfaceChanged(int i, int i5) {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeSurfaceChanged(this.nativeShellHolderId.longValue(), i, i5);
    }

    public void onSurfaceCreated(Surface surface) {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeSurfaceCreated(this.nativeShellHolderId.longValue(), surface);
    }

    public void onSurfaceDestroyed() {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        onRenderingStopped();
        nativeSurfaceDestroyed(this.nativeShellHolderId.longValue());
    }

    public void onSurfaceWindowChanged(Surface surface) {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeSurfaceWindowChanged(this.nativeShellHolderId.longValue(), surface);
    }

    public void onVsync(long j5, long j6, long j7) {
        nativeOnVsync(j5, j6, j7);
    }

    public long performNativeAttach(FlutterJNI flutterJNI) {
        return nativeAttach(flutterJNI);
    }

    public void prefetchDefaultFontManager() {
        if (prefetchDefaultFontManagerCalled) {
            Log.w(TAG, "FlutterJNI.prefetchDefaultFontManager called more than once");
        }
        nativePrefetchDefaultFontManager();
        prefetchDefaultFontManagerCalled = true;
    }

    public void registerImageTexture(long j5, TextureRegistry$ImageConsumer textureRegistry$ImageConsumer, boolean z4) {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeRegisterImageTexture(this.nativeShellHolderId.longValue(), j5, new WeakReference<>(textureRegistry$ImageConsumer), z4);
    }

    public void registerTexture(long j5, SurfaceTextureWrapper surfaceTextureWrapper) {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeRegisterTexture(this.nativeShellHolderId.longValue(), j5, new WeakReference<>(surfaceTextureWrapper));
    }

    public void removeEngineLifecycleListener(InterfaceC0393b interfaceC0393b) {
        ensureRunningOnMainThread();
        this.engineLifecycleListeners.remove(interfaceC0393b);
    }

    public void removeIsDisplayingFlutterUiListener(m mVar) {
        ensureRunningOnMainThread();
        this.flutterUiDisplayListeners.remove(mVar);
    }

    public void requestDartDeferredLibrary(int i) {
        Log.e(TAG, "No DeferredComponentManager found. Android setup must be completed before using split AOT deferred components.");
    }

    public void runBundleAndSnapshotFromLibrary(String str, String str2, String str3, AssetManager assetManager, List<String> list, long j5) {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeRunBundleAndSnapshotFromLibrary(this.nativeShellHolderId.longValue(), str, str2, str3, assetManager, list, j5);
    }

    public void scheduleFrame() {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeScheduleFrame(this.nativeShellHolderId.longValue());
    }

    public void setAccessibilityDelegate(InterfaceC0400i interfaceC0400i) {
        ensureRunningOnMainThread();
        this.accessibilityDelegate = interfaceC0400i;
    }

    public void setAccessibilityFeatures(int i) {
        ensureRunningOnMainThread();
        if (isAttached()) {
            setAccessibilityFeaturesInNative(i);
        }
    }

    public void setAccessibilityFeaturesInNative(int i) {
        nativeSetAccessibilityFeatures(this.nativeShellHolderId.longValue(), i);
    }

    public void setAsyncWaitForVsyncDelegate(InterfaceC0401j interfaceC0401j) {
        asyncWaitForVsyncDelegate = interfaceC0401j;
    }

    public void setDeferredComponentManager(InterfaceC0440a interfaceC0440a) {
        ensureRunningOnMainThread();
        if (interfaceC0440a != null) {
            interfaceC0440a.a();
        }
    }

    public void setLocalizationPlugin(C0721a c0721a) {
        ensureRunningOnMainThread();
        this.localizationPlugin = c0721a;
    }

    public void setPlatformMessageHandler(k kVar) {
        ensureRunningOnMainThread();
        this.platformMessageHandler = kVar;
    }

    public void setPlatformViewsController(p pVar) {
        ensureRunningOnMainThread();
        this.platformViewsController = pVar;
    }

    public void setPlatformViewsController2(o oVar) {
        ensureRunningOnMainThread();
        this.platformViewsController2 = oVar;
    }

    public void setRefreshRateFPS(float f2) {
        refreshRateFPS = f2;
        updateRefreshRate();
    }

    public void setSemanticsEnabled(boolean z4) {
        ensureRunningOnMainThread();
        if (isAttached()) {
            setSemanticsEnabledInNative(z4);
        }
    }

    public void setSemanticsEnabledInNative(boolean z4) {
        nativeSetSemanticsEnabled(this.nativeShellHolderId.longValue(), z4);
    }

    public void setViewportMetrics(float f2, int i, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int[] iArr, int[] iArr2, int[] iArr3) {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeSetViewportMetrics(this.nativeShellHolderId.longValue(), f2, i, i5, i6, i7, i8, i9, i10, i11, i12, i13, i14, i15, i16, i17, i18, iArr, iArr2, iArr3);
    }

    @SuppressLint({"NewApi"})
    public void showOverlaySurface2() {
        o oVar = this.platformViewsController2;
        if (oVar == null) {
            throw new RuntimeException("platformViewsController must be set before attempting to destroy an overlay surface");
        }
        if (oVar.f6791o == null) {
            return;
        }
        SurfaceControl.Transaction transactionH = n.h();
        transactionH.setVisibility(oVar.f6791o, true);
        transactionH.apply();
    }

    public FlutterJNI spawn(String str, String str2, String str3, List<String> list, long j5) {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        FlutterJNI flutterJNINativeSpawn = nativeSpawn(this.nativeShellHolderId.longValue(), str, str2, str3, list, j5);
        Long l3 = flutterJNINativeSpawn.nativeShellHolderId;
        if ((l3 == null || l3.longValue() == 0) ? false : true) {
            return flutterJNINativeSpawn;
        }
        throw new IllegalStateException("Failed to spawn new JNI connected shell from existing shell.");
    }

    @SuppressLint({"NewApi"})
    public void swapTransactions() {
        o oVar = this.platformViewsController2;
        if (oVar == null) {
            throw new RuntimeException("");
        }
        synchronized (oVar) {
            try {
                oVar.f6789m.clear();
                for (int i = 0; i < oVar.f6788l.size(); i++) {
                    oVar.f6789m.add(n.i(oVar.f6788l.get(i)));
                }
                oVar.f6788l.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void unregisterTexture(long j5) {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeUnregisterTexture(this.nativeShellHolderId.longValue(), j5);
    }

    public void updateDisplayMetrics(int i, float f2, float f5, float f6) {
        displayWidth = f2;
        displayHeight = f5;
        displayDensity = f6;
        if (loadLibraryCalled) {
            nativeUpdateDisplayMetrics(this.nativeShellHolderId.longValue());
        }
    }

    public void updateJavaAssetManager(AssetManager assetManager, String str) {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeUpdateJavaAssetManager(this.nativeShellHolderId.longValue(), assetManager, str);
    }

    public void updateRefreshRate() {
        if (loadLibraryCalled) {
            nativeUpdateRefreshRate(refreshRateFPS);
        }
    }

    public void dispatchSemanticsAction(int i, io.flutter.view.d dVar, Object obj) {
        ByteBuffer byteBufferB;
        int iPosition;
        ensureAttachedToNative();
        if (obj != null) {
            byteBufferB = w.f8944a.b(obj);
            iPosition = byteBufferB.position();
        } else {
            byteBufferB = null;
            iPosition = 0;
        }
        dispatchSemanticsAction(i, dVar.f6869l, byteBufferB, iPosition);
    }

    public void dispatchSemanticsAction(int i, int i5, ByteBuffer byteBuffer, int i6) {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeDispatchSemanticsAction(this.nativeShellHolderId.longValue(), i, i5, byteBuffer, i6);
    }
}

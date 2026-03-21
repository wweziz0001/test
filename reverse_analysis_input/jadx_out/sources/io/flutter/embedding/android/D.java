package io.flutter.embedding.android;

import V3.AbstractC0144v;
import V3.C0142t;
import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Rect;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.Surface;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewStructure;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeProvider;
import android.view.autofill.AutofillId;
import android.view.autofill.AutofillValue;
import android.view.textservice.SpellCheckerSession;
import android.view.textservice.TextServicesManager;
import android.widget.FrameLayout;
import c2.ExecutorC0319a;
import e3.C0394c;
import io.flutter.embedding.engine.FlutterJNI;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.ReentrantLock;
import m3.C0679m;
import m3.C0680n;
import n3.C0707q;
import n3.InterfaceC0696f;
import o3.C0721a;
import p3.InterfaceC0730a;

/* JADX INFO: loaded from: classes.dex */
public final class D extends FrameLayout implements InterfaceC0730a, M {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public io.flutter.view.k f6496A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public TextServicesManager f6497B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public androidx.lifecycle.E f6498C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public final io.flutter.embedding.engine.renderer.k f6499D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public final androidx.lifecycle.E f6500E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public final J.a f6501F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public final C0489h f6502G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public K1.i f6503H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public F f6504I;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final y f6505l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final A f6506m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public C0503w f6507n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public View f6508o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public View f6509p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final HashSet f6510q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f6511r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public C0394c f6512s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final HashSet f6513t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public Z1.c f6514u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public io.flutter.plugin.editing.i f6515v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public io.flutter.plugin.editing.g f6516w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public C0721a f6517x;
    public Z1.m y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public C0482a f6518z;

    public D(Context context, y yVar) {
        super(context, null);
        this.f6510q = new HashSet();
        this.f6513t = new HashSet();
        this.f6499D = new io.flutter.embedding.engine.renderer.k();
        this.f6500E = new androidx.lifecycle.E(this, 5);
        this.f6501F = new J.a(this, new Handler(Looper.getMainLooper()), 1);
        this.f6502G = new C0489h(this, 1);
        this.f6504I = new F();
        this.f6505l = yVar;
        this.f6508o = yVar;
        b();
    }

    /* JADX WARN: Type inference failed for: r0v33, types: [android.view.View, io.flutter.embedding.engine.renderer.n] */
    public final void a() {
        SparseArray sparseArray;
        Objects.toString(this.f6512s);
        if (c()) {
            Iterator it = this.f6513t.iterator();
            if (it.hasNext()) {
                it.next().getClass();
                throw new ClassCastException();
            }
            getContext().getContentResolver().unregisterContentObserver(this.f6501F);
            io.flutter.plugin.platform.p pVar = this.f6512s.f5622s;
            int i = 0;
            while (true) {
                SparseArray sparseArray2 = pVar.f6807o;
                if (i >= sparseArray2.size()) {
                    break;
                }
                pVar.f6797d.removeView((io.flutter.plugin.platform.i) sparseArray2.valueAt(i));
                i++;
            }
            int i5 = 0;
            while (true) {
                SparseArray sparseArray3 = pVar.f6805m;
                if (i5 >= sparseArray3.size()) {
                    break;
                }
                pVar.f6797d.removeView((i3.b) sparseArray3.valueAt(i5));
                i5++;
            }
            pVar.c();
            if (pVar.f6797d == null) {
                Log.e("PlatformViewsController", "removeOverlaySurfaces called while flutter view is null");
            } else {
                int i6 = 0;
                while (true) {
                    sparseArray = pVar.f6806n;
                    if (i6 >= sparseArray.size()) {
                        break;
                    }
                    pVar.f6797d.removeView((View) sparseArray.valueAt(i6));
                    i6++;
                }
                sparseArray.clear();
            }
            pVar.f6797d = null;
            pVar.f6809q = false;
            int i7 = 0;
            while (true) {
                SparseArray sparseArray4 = pVar.f6804l;
                if (i7 >= sparseArray4.size()) {
                    break;
                }
                ((io.flutter.plugin.platform.g) sparseArray4.valueAt(i7)).getClass();
                i7++;
            }
            io.flutter.plugin.platform.o oVar = this.f6512s.f5623t;
            int i8 = 0;
            while (true) {
                SparseArray sparseArray5 = oVar.f6786j;
                if (i8 >= sparseArray5.size()) {
                    break;
                }
                oVar.f6781d.removeView((i3.b) sparseArray5.valueAt(i8));
                i8++;
            }
            Surface surface = oVar.f6790n;
            if (surface != null) {
                surface.release();
                oVar.f6790n = null;
                oVar.f6791o = null;
            }
            oVar.f6781d = null;
            int i9 = 0;
            while (true) {
                SparseArray sparseArray6 = oVar.i;
                if (i9 >= sparseArray6.size()) {
                    break;
                }
                ((io.flutter.plugin.platform.g) sparseArray6.valueAt(i9)).getClass();
                i9++;
            }
            this.f6512s.f5622s.d();
            this.f6512s.f5623t.a();
            io.flutter.view.k kVar = this.f6496A;
            kVar.f6947t = true;
            Z1.l lVar = kVar.f6933e;
            ((io.flutter.plugin.platform.p) lVar.f3020l).d();
            ((io.flutter.plugin.platform.o) lVar.f3021m).a();
            kVar.f6945r = null;
            AccessibilityManager accessibilityManager = kVar.f6931c;
            accessibilityManager.removeAccessibilityStateChangeListener(kVar.f6949v);
            accessibilityManager.removeTouchExplorationStateChangeListener(kVar.f6950w);
            kVar.f6934f.unregisterContentObserver(kVar.f6951x);
            Z1.m mVar = kVar.f6930b;
            mVar.f3026o = null;
            ((FlutterJNI) mVar.f3025n).setAccessibilityDelegate(null);
            this.f6496A = null;
            this.f6515v.f6719b.restartInput(this);
            this.f6515v.c();
            int size = ((HashSet) this.y.f3025n).size();
            if (size > 0) {
                Log.w("KeyboardManager", "A KeyboardManager was destroyed with " + String.valueOf(size) + " unhandled redispatch event(s).");
            }
            io.flutter.plugin.editing.g gVar = this.f6516w;
            if (gVar != null) {
                gVar.f6706a.f8712m = null;
                SpellCheckerSession spellCheckerSession = gVar.f6708c;
                if (spellCheckerSession != null) {
                    spellCheckerSession.close();
                }
            }
            Z1.c cVar = this.f6514u;
            if (cVar != null) {
                ((androidx.lifecycle.E) cVar.f2997m).f4474m = null;
            }
            io.flutter.embedding.engine.renderer.l lVar2 = this.f6512s.f5606b;
            this.f6511r = false;
            lVar2.g(this.f6502G);
            lVar2.h();
            lVar2.f6663a.setSemanticsEnabled(false);
            View view = this.f6509p;
            if (view != null && this.f6508o == this.f6507n) {
                this.f6508o = view;
            }
            this.f6508o.c();
            C0503w c0503w = this.f6507n;
            if (c0503w != null) {
                c0503w.f6611l.close();
                removeView(this.f6507n);
                this.f6507n = null;
            }
            this.f6509p = null;
            this.f6512s = null;
        }
    }

    @Override // android.view.View
    public final void autofill(SparseArray sparseArray) {
        Z1.i iVar;
        Z1.i iVar2;
        io.flutter.plugin.editing.i iVar3 = this.f6515v;
        if (Build.VERSION.SDK_INT < 26) {
            iVar3.getClass();
            return;
        }
        C0679m c0679m = iVar3.f6723f;
        if (c0679m == null || iVar3.f6724g == null || (iVar = c0679m.f8732j) == null) {
            return;
        }
        HashMap map = new HashMap();
        for (int i = 0; i < sparseArray.size(); i++) {
            C0679m c0679m2 = (C0679m) iVar3.f6724g.get(sparseArray.keyAt(i));
            if (c0679m2 != null && (iVar2 = c0679m2.f8732j) != null) {
                String string = B.b(sparseArray.valueAt(i)).getTextValue().toString();
                C0680n c0680n = new C0680n(string, string.length(), string.length(), -1, -1);
                String str = (String) iVar.f3012l;
                String str2 = (String) iVar2.f3012l;
                if (str2.equals(str)) {
                    iVar3.f6725h.f(c0680n);
                } else {
                    map.put(str2, c0680n);
                }
            }
        }
        int i5 = iVar3.f6722e.f361c;
        Z1.e eVar = iVar3.f6721d;
        eVar.getClass();
        String.valueOf(map.size());
        HashMap map2 = new HashMap();
        for (Map.Entry entry : map.entrySet()) {
            C0680n c0680n2 = (C0680n) entry.getValue();
            map2.put((String) entry.getKey(), Z1.e.m(c0680n2.f8736a, c0680n2.f8737b, c0680n2.f8738c, -1, -1));
        }
        ((C0707q) eVar.f3001m).a("TextInputClient.updateEditingStateWithTag", Arrays.asList(Integer.valueOf(i5), map2), null);
    }

    public final void b() {
        y yVar = this.f6505l;
        if (yVar != null) {
            addView(yVar);
        } else {
            A a5 = this.f6506m;
            if (a5 != null) {
                addView(a5);
            } else {
                addView(this.f6507n);
            }
        }
        setFocusable(true);
        setFocusableInTouchMode(true);
        if (Build.VERSION.SDK_INT >= 26) {
            setImportantForAutofill(1);
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [android.view.View, io.flutter.embedding.engine.renderer.n] */
    public final boolean c() {
        C0394c c0394c = this.f6512s;
        if (c0394c != null) {
            if (c0394c.f5606b == this.f6508o.getAttachedRenderer()) {
                return true;
            }
        }
        return false;
    }

    @Override // android.view.View
    public final boolean checkInputConnectionProxy(View view) {
        C0394c c0394c = this.f6512s;
        if (c0394c == null) {
            return super.checkInputConnectionProxy(view);
        }
        io.flutter.plugin.platform.p pVar = c0394c.f5622s;
        if (view == null) {
            pVar.getClass();
            return false;
        }
        HashMap map = pVar.f6803k;
        if (!map.containsKey(view.getContext())) {
            return false;
        }
        View view2 = (View) map.get(view.getContext());
        if (view2 == view) {
            return true;
        }
        return view2.checkInputConnectionProxy(view);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x004e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d() {
        /*
            Method dump skipped, instruction units count: 272
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.flutter.embedding.android.D.d():void");
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
            getKeyDispatcherState().startTracking(keyEvent, this);
        } else if (keyEvent.getAction() == 1) {
            getKeyDispatcherState().handleUpEvent(keyEvent);
        }
        return (c() && this.y.w(keyEvent)) || super.dispatchKeyEvent(keyEvent);
    }

    public final void e() {
        if (!c()) {
            Log.w("FlutterView", "Tried to send viewport metrics from Android to Flutter but this FlutterView was not attached to a FlutterEngine.");
            return;
        }
        float f2 = getResources().getDisplayMetrics().density;
        io.flutter.embedding.engine.renderer.k kVar = this.f6499D;
        kVar.f6646a = f2;
        kVar.f6660p = ViewConfiguration.get(getContext()).getScaledTouchSlop();
        io.flutter.embedding.engine.renderer.l lVar = this.f6512s.f5606b;
        lVar.getClass();
        if (kVar.f6647b <= 0 || kVar.f6648c <= 0 || kVar.f6646a <= 0.0f) {
            return;
        }
        ArrayList arrayList = kVar.f6661q;
        arrayList.size();
        ArrayList arrayList2 = kVar.f6662r;
        arrayList2.size();
        int size = arrayList2.size() + arrayList.size();
        int[] iArr = new int[size * 4];
        int[] iArr2 = new int[size];
        int[] iArr3 = new int[size];
        for (int i = 0; i < arrayList.size(); i++) {
            io.flutter.embedding.engine.renderer.c cVar = (io.flutter.embedding.engine.renderer.c) arrayList.get(i);
            int i5 = i * 4;
            Rect rect = cVar.f6626a;
            iArr[i5] = rect.left;
            iArr[i5 + 1] = rect.top;
            iArr[i5 + 2] = rect.right;
            iArr[i5 + 3] = rect.bottom;
            iArr2[i] = O.i.b(cVar.f6627b);
            iArr3[i] = O.i.b(cVar.f6628c);
        }
        int size2 = arrayList.size() * 4;
        for (int i6 = 0; i6 < arrayList2.size(); i6++) {
            io.flutter.embedding.engine.renderer.c cVar2 = (io.flutter.embedding.engine.renderer.c) arrayList2.get(i6);
            int i7 = (i6 * 4) + size2;
            Rect rect2 = cVar2.f6626a;
            iArr[i7] = rect2.left;
            iArr[i7 + 1] = rect2.top;
            iArr[i7 + 2] = rect2.right;
            iArr[i7 + 3] = rect2.bottom;
            iArr2[arrayList.size() + i6] = O.i.b(cVar2.f6627b);
            iArr3[arrayList.size() + i6] = O.i.b(cVar2.f6628c);
        }
        lVar.f6663a.setViewportMetrics(kVar.f6646a, kVar.f6647b, kVar.f6648c, kVar.f6649d, kVar.f6650e, kVar.f6651f, kVar.f6652g, kVar.f6653h, kVar.i, kVar.f6654j, kVar.f6655k, kVar.f6656l, kVar.f6657m, kVar.f6658n, kVar.f6659o, kVar.f6660p, iArr, iArr2, iArr3);
    }

    @Override // android.view.View
    public AccessibilityNodeProvider getAccessibilityNodeProvider() {
        io.flutter.view.k kVar = this.f6496A;
        if (kVar == null || !kVar.f6931c.isEnabled()) {
            return null;
        }
        return this.f6496A;
    }

    public C0394c getAttachedFlutterEngine() {
        return this.f6512s;
    }

    public InterfaceC0696f getBinaryMessenger() {
        return this.f6512s.f5607c;
    }

    public C0503w getCurrentImageSurface() {
        return this.f6507n;
    }

    public io.flutter.embedding.engine.renderer.k getViewportMetrics() {
        return this.f6499D;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0173  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.WindowInsets onApplyWindowInsets(android.view.WindowInsets r16) {
        /*
            Method dump skipped, instruction units count: 564
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.flutter.embedding.android.D.onApplyWindowInsets(android.view.WindowInsets):android.view.WindowInsets");
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        androidx.lifecycle.E e5;
        int i = 6;
        int i5 = 1;
        super.onAttachedToWindow();
        try {
            K1.g gVar = K1.h.f1250c;
            Context context = getContext();
            gVar.getClass();
            K1.b bVarA = K1.g.a(context);
            Z1.c cVar = new Z1.c(3);
            Z1.l lVar = new Z1.l();
            lVar.f3020l = bVarA;
            lVar.f3021m = cVar;
            e5 = new androidx.lifecycle.E(lVar, i);
        } catch (NoClassDefFoundError unused) {
            e5 = null;
        }
        this.f6498C = e5;
        Activity activityY = i4.a.y(getContext());
        androidx.lifecycle.E e6 = this.f6498C;
        if (e6 == null || activityY == null) {
            return;
        }
        this.f6503H = new K1.i(this, i5);
        Context context2 = getContext();
        Executor executorA = Build.VERSION.SDK_INT >= 28 ? u.d.a(context2) : new ExecutorC0319a(new Handler(context2.getMainLooper()), i5);
        K1.i iVar = this.f6503H;
        Z1.l lVar2 = (Z1.l) e6.f4474m;
        N3.h.e(executorA, "executor");
        N3.h.e(iVar, "consumer");
        K1.b bVar = (K1.b) lVar2.f3020l;
        bVar.getClass();
        K1.k kVar = new K1.k(bVar, activityY, null);
        E3.j jVar = E3.j.f675l;
        Y3.c cVar2 = new Y3.c(kVar, jVar, -2, 1);
        c4.d dVar = V3.B.f2372a;
        W3.c cVar3 = a4.o.f3618a;
        if (cVar3.l(C0142t.f2444m) != null) {
            throw new IllegalArgumentException(("Flow context cannot contain job in it. Had " + cVar3).toString());
        }
        Y3.g gVarA = cVar2;
        if (!cVar3.equals(jVar)) {
            gVarA = Z3.q.a(cVar2, cVar3, 0, 0, 6);
        }
        Z1.c cVar4 = (Z1.c) lVar2.f3021m;
        cVar4.getClass();
        N3.h.e(gVarA, "flow");
        ReentrantLock reentrantLock = (ReentrantLock) cVar4.f2996l;
        reentrantLock.lock();
        LinkedHashMap linkedHashMap = (LinkedHashMap) cVar4.f2997m;
        try {
            if (linkedHashMap.get(iVar) == null) {
                linkedHashMap.put(iVar, AbstractC0144v.j(AbstractC0144v.a(new V3.J(executorA)), new I1.b(gVarA, iVar, null)));
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (this.f6512s != null) {
            this.f6517x.b(configuration);
            d();
            i4.a.e(getContext(), this.f6512s);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:72:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00b9  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.inputmethod.InputConnection onCreateInputConnection(android.view.inputmethod.EditorInfo r11) {
        /*
            Method dump skipped, instruction units count: 354
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.flutter.embedding.android.D.onCreateInputConnection(android.view.inputmethod.EditorInfo):android.view.inputmethod.InputConnection");
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        K1.i iVar;
        androidx.lifecycle.E e5 = this.f6498C;
        if (e5 != null && (iVar = this.f6503H) != null) {
            Z1.c cVar = (Z1.c) ((Z1.l) e5.f4474m).f3021m;
            cVar.getClass();
            ReentrantLock reentrantLock = (ReentrantLock) cVar.f2996l;
            reentrantLock.lock();
            LinkedHashMap linkedHashMap = (LinkedHashMap) cVar.f2997m;
            try {
                V3.P p4 = (V3.P) linkedHashMap.get(iVar);
                if (p4 != null) {
                    p4.b(null);
                }
            } finally {
                reentrantLock.unlock();
            }
        }
        this.f6503H = null;
        this.f6498C = null;
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public final boolean onGenericMotionEvent(MotionEvent motionEvent) {
        if (c()) {
            C0482a c0482a = this.f6518z;
            Context context = getContext();
            c0482a.getClass();
            boolean zIsFromSource = motionEvent.isFromSource(2);
            boolean z4 = motionEvent.getActionMasked() == 7 || motionEvent.getActionMasked() == 8;
            if (zIsFromSource && z4) {
                int iB = C0482a.b(motionEvent.getActionMasked());
                ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(motionEvent.getPointerCount() * 288);
                byteBufferAllocateDirect.order(ByteOrder.LITTLE_ENDIAN);
                c0482a.a(motionEvent, motionEvent.getActionIndex(), iB, 0, C0482a.f6561f, byteBufferAllocateDirect, context);
                if (byteBufferAllocateDirect.position() % 288 != 0) {
                    throw new AssertionError("Packet position is not on field boundary.");
                }
                c0482a.f6562a.f6663a.dispatchPointerDataPacket(byteBufferAllocateDirect, byteBufferAllocateDirect.position());
                return true;
            }
        }
        return super.onGenericMotionEvent(motionEvent);
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        return !c() ? super.onHoverEvent(motionEvent) : this.f6496A.e(motionEvent, false);
    }

    @Override // android.view.View
    public final void onProvideAutofillVirtualStructure(ViewStructure viewStructure, int i) {
        Rect rect;
        super.onProvideAutofillVirtualStructure(viewStructure, i);
        io.flutter.plugin.editing.i iVar = this.f6515v;
        if (Build.VERSION.SDK_INT < 26) {
            iVar.getClass();
            return;
        }
        if (iVar.f6724g != null) {
            String str = (String) iVar.f6723f.f8732j.f3012l;
            AutofillId autofillId = viewStructure.getAutofillId();
            for (int i5 = 0; i5 < iVar.f6724g.size(); i5++) {
                int iKeyAt = iVar.f6724g.keyAt(i5);
                Z1.i iVar2 = ((C0679m) iVar.f6724g.valueAt(i5)).f8732j;
                if (iVar2 != null) {
                    viewStructure.addChildCount(1);
                    ViewStructure viewStructureNewChild = viewStructure.newChild(i5);
                    viewStructureNewChild.setAutofillId(autofillId, iKeyAt);
                    String[] strArr = (String[]) iVar2.f3013m;
                    if (strArr.length > 0) {
                        viewStructureNewChild.setAutofillHints(strArr);
                    }
                    viewStructureNewChild.setAutofillType(1);
                    viewStructureNewChild.setVisibility(0);
                    String str2 = (String) iVar2.f3015o;
                    if (str2 != null) {
                        viewStructureNewChild.setHint(str2);
                    }
                    if (str.hashCode() != iKeyAt || (rect = iVar.f6729m) == null) {
                        viewStructureNewChild.setDimens(0, 0, 0, 0, 1, 1);
                        viewStructureNewChild.setAutofillValue(AutofillValue.forText(((C0680n) iVar2.f3014n).f8736a));
                    } else {
                        viewStructureNewChild.setDimens(rect.left, rect.top, 0, 0, rect.width(), iVar.f6729m.height());
                        viewStructureNewChild.setAutofillValue(AutofillValue.forText(iVar.f6725h));
                    }
                }
            }
        }
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i5, int i6, int i7) {
        super.onSizeChanged(i, i5, i6, i7);
        io.flutter.embedding.engine.renderer.k kVar = this.f6499D;
        kVar.f6647b = i;
        kVar.f6648c = i5;
        e();
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!c()) {
            return super.onTouchEvent(motionEvent);
        }
        requestUnbufferedDispatch(motionEvent);
        this.f6518z.d(motionEvent, C0482a.f6561f);
        return true;
    }

    public void setDelegate(F f2) {
        this.f6504I = f2;
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        View view = this.f6508o;
        if (view instanceof y) {
            ((y) view).setVisibility(i);
        }
    }

    /* JADX WARN: Type inference failed for: r8v1, types: [java.lang.Object, java.util.List] */
    public void setWindowInfoListenerDisplayFeatures(K1.l lVar) {
        ?? r8 = lVar.f1260a;
        ArrayList arrayList = new ArrayList();
        for (K1.c cVar : r8) {
            cVar.f1238a.c().toString();
            H1.b bVar = cVar.f1238a;
            int iB = bVar.b();
            K1.b bVar2 = K1.b.f1231o;
            int i = 2;
            int i5 = ((iB == 0 || bVar.a() == 0) ? K1.b.f1230n : bVar2) == bVar2 ? 3 : 2;
            K1.b bVar3 = K1.b.f1232p;
            K1.b bVar4 = cVar.f1240c;
            if (bVar4 != bVar3) {
                i = bVar4 == K1.b.f1233q ? 3 : 1;
            }
            arrayList.add(new io.flutter.embedding.engine.renderer.c(bVar.c(), i5, i));
        }
        ArrayList arrayList2 = this.f6499D.f6661q;
        arrayList2.clear();
        arrayList2.addAll(arrayList);
        e();
    }

    public D(Context context, A a5) {
        super(context, null);
        this.f6510q = new HashSet();
        this.f6513t = new HashSet();
        this.f6499D = new io.flutter.embedding.engine.renderer.k();
        this.f6500E = new androidx.lifecycle.E(this, 5);
        this.f6501F = new J.a(this, new Handler(Looper.getMainLooper()), 1);
        this.f6502G = new C0489h(this, 1);
        this.f6504I = new F();
        this.f6506m = a5;
        this.f6508o = a5;
        b();
    }
}

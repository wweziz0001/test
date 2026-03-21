package io.flutter.embedding.engine.renderer;

import android.media.Image;
import android.media.ImageReader;
import android.os.Build;
import android.view.Surface;
import g.InterfaceC0434a;
import h0.C0448G;
import io.flutter.view.TextureRegistry$ImageConsumer;
import io.flutter.view.TextureRegistry$SurfaceProducer;
import io.flutter.view.p;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import x3.C0992b;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC0434a
final class FlutterRenderer$ImageReaderSurfaceProducer implements TextureRegistry$SurfaceProducer, TextureRegistry$ImageConsumer, io.flutter.view.o {
    private static final boolean CLEANUP_ON_MEMORY_PRESSURE = true;
    private static final int MAX_DEQUEUED_IMAGES = 2;
    private static final int MAX_IMAGES = 6;
    private static final String TAG = "ImageReaderSurfaceProducer";
    private static final boolean VERBOSE_LOGS = false;
    private static final boolean trimOnMemoryPressure = true;
    private final long id;
    private boolean released;
    final /* synthetic */ l this$0;
    private boolean ignoringFence = VERBOSE_LOGS;
    private int requestedWidth = 1;
    private int requestedHeight = 1;
    private boolean createNewReader = true;
    private boolean notifiedDestroy = VERBOSE_LOGS;
    private long lastDequeueTime = 0;
    private long lastQueueTime = 0;
    private long lastScheduleTime = 0;
    private int numTrims = 0;
    private final Object lock = new Object();
    private final ArrayDeque<g> imageReaderQueue = new ArrayDeque<>();
    private final HashMap<ImageReader, g> perImageReaders = new HashMap<>();
    private ArrayList<e> lastDequeuedImage = new ArrayList<>();
    private g lastReaderDequeuedFrom = null;
    private p callback = null;

    public FlutterRenderer$ImageReaderSurfaceProducer(l lVar, long j5) {
        this.this$0 = lVar;
        this.id = j5;
    }

    private void cleanup() {
        synchronized (this.lock) {
            try {
                for (g gVar : this.perImageReaders.values()) {
                    if (this.lastReaderDequeuedFrom == gVar) {
                        this.lastReaderDequeuedFrom = null;
                    }
                    gVar.f6636c = true;
                    gVar.f6634a.close();
                    gVar.f6635b.clear();
                }
                this.perImageReaders.clear();
                if (this.lastDequeuedImage.size() > 0) {
                    Iterator<e> it = this.lastDequeuedImage.iterator();
                    while (it.hasNext()) {
                        it.next().f6631a.close();
                    }
                    this.lastDequeuedImage.clear();
                }
                g gVar2 = this.lastReaderDequeuedFrom;
                if (gVar2 != null) {
                    gVar2.f6636c = true;
                    gVar2.f6634a.close();
                    gVar2.f6635b.clear();
                    this.lastReaderDequeuedFrom = null;
                }
                this.imageReaderQueue.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private ImageReader createImageReader29() {
        return ImageReader.newInstance(this.requestedWidth, this.requestedHeight, 34, 6, 256L);
    }

    private ImageReader createImageReader33() {
        E.b.l();
        ImageReader.Builder builderE = E.b.e(this.requestedWidth, this.requestedHeight);
        builderE.setMaxImages(6);
        builderE.setImageFormat(34);
        builderE.setUsage(256L);
        return builderE.build();
    }

    private g getActiveReader() {
        synchronized (this.lock) {
            try {
                if (!this.createNewReader) {
                    g gVarPeekLast = this.imageReaderQueue.peekLast();
                    if (gVarPeekLast.f6634a.getSurface().isValid()) {
                        return gVarPeekLast;
                    }
                }
                this.createNewReader = VERBOSE_LOGS;
                return getOrCreatePerImageReader(createImageReader());
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private g getOrCreatePerImageReader(ImageReader imageReader) {
        g gVar = this.perImageReaders.get(imageReader);
        if (gVar != null) {
            return gVar;
        }
        g gVarCreatePerImageReader = createPerImageReader(imageReader);
        this.perImageReaders.put(imageReader, gVarCreatePerImageReader);
        this.imageReaderQueue.add(gVarCreatePerImageReader);
        return gVarCreatePerImageReader;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lambda$dequeueImage$0() {
        if (this.released) {
            return;
        }
        this.this$0.f6663a.scheduleFrame();
    }

    private void maybeWaitOnFence(Image image) {
        if (image == null || this.ignoringFence) {
            return;
        }
        if (Build.VERSION.SDK_INT >= 33) {
            waitOnFence(image);
        } else {
            this.ignoringFence = true;
        }
    }

    private void releaseInternal() {
        cleanup();
        this.released = true;
        HashSet hashSet = this.this$0.f6668f;
        Iterator it = hashSet.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            WeakReference weakReference = (WeakReference) it.next();
            if (weakReference.get() == this) {
                hashSet.remove(weakReference);
                break;
            }
        }
        this.this$0.f6669g.remove(this);
    }

    private void waitOnFence(Image image) {
        try {
            image.getFence().awaitForever();
        } catch (IOException unused) {
        }
    }

    @Override // io.flutter.view.TextureRegistry$ImageConsumer
    public Image acquireLatestImage() {
        e eVarDequeueImage = dequeueImage();
        if (eVarDequeueImage == null) {
            return null;
        }
        Image image = eVarDequeueImage.f6631a;
        maybeWaitOnFence(image);
        return image;
    }

    public ImageReader createImageReader() {
        int i = Build.VERSION.SDK_INT;
        if (i >= 33) {
            return createImageReader33();
        }
        if (i >= 29) {
            return createImageReader29();
        }
        throw new UnsupportedOperationException("ImageReaderPlatformViewRenderTarget requires API version 29+");
    }

    public g createPerImageReader(ImageReader imageReader) {
        return new g(this, imageReader);
    }

    public double deltaMillis(long j5) {
        return j5 / 1000000.0d;
    }

    public e dequeueImage() {
        e eVar;
        boolean z4;
        synchronized (this.lock) {
            try {
                Iterator<g> it = this.imageReaderQueue.iterator();
                eVar = null;
                while (true) {
                    boolean zHasNext = it.hasNext();
                    z4 = VERBOSE_LOGS;
                    if (!zHasNext) {
                        break;
                    }
                    g next = it.next();
                    ArrayDeque arrayDeque = next.f6635b;
                    e eVar2 = arrayDeque.isEmpty() ? null : (e) arrayDeque.removeFirst();
                    if (eVar2 == null) {
                        eVar = eVar2;
                    } else {
                        while (this.lastDequeuedImage.size() > 2) {
                            this.lastDequeuedImage.remove(0).f6631a.close();
                        }
                        this.lastDequeuedImage.add(eVar2);
                        this.lastReaderDequeuedFrom = next;
                        eVar = eVar2;
                    }
                }
                pruneImageReaderQueue();
                Iterator<g> it2 = this.imageReaderQueue.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    if (!it2.next().f6635b.isEmpty()) {
                        z4 = true;
                        break;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z4) {
            this.this$0.f6667e.post(new d(this, 0));
        }
        return eVar;
    }

    public void disableFenceForTest() {
        this.ignoringFence = true;
    }

    public void finalize() throws Throwable {
        try {
            if (this.released) {
                return;
            }
            releaseInternal();
            l lVar = this.this$0;
            lVar.f6667e.post(new j(this.id, lVar.f6663a));
        } finally {
            super.finalize();
        }
    }

    @Override // io.flutter.view.TextureRegistry$SurfaceProducer
    public Surface getForcedNewSurface() {
        this.createNewReader = true;
        return getSurface();
    }

    @Override // io.flutter.view.TextureRegistry$SurfaceProducer
    public int getHeight() {
        return this.requestedHeight;
    }

    @Override // io.flutter.view.TextureRegistry$SurfaceProducer
    public Surface getSurface() {
        return getActiveReader().f6634a.getSurface();
    }

    @Override // io.flutter.view.TextureRegistry$SurfaceProducer
    public int getWidth() {
        return this.requestedWidth;
    }

    @Override // io.flutter.view.TextureRegistry$SurfaceProducer
    public boolean handlesCropAndRotation() {
        return VERBOSE_LOGS;
    }

    @Override // io.flutter.view.TextureRegistry$SurfaceProducer
    public long id() {
        return this.id;
    }

    public int numImageReaders() {
        int size;
        synchronized (this.lock) {
            size = this.imageReaderQueue.size();
        }
        return size;
    }

    public int numImages() {
        int size;
        synchronized (this.lock) {
            try {
                Iterator<g> it = this.imageReaderQueue.iterator();
                size = 0;
                while (it.hasNext()) {
                    size += it.next().f6635b.size();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return size;
    }

    public int numTrims() {
        int i;
        synchronized (this.lock) {
            i = this.numTrims;
        }
        return i;
    }

    public void onImage(ImageReader imageReader, Image image) {
        e eVar;
        synchronized (this.lock) {
            g orCreatePerImageReader = getOrCreatePerImageReader(imageReader);
            if (orCreatePerImageReader.f6636c) {
                eVar = null;
            } else {
                FlutterRenderer$ImageReaderSurfaceProducer flutterRenderer$ImageReaderSurfaceProducer = orCreatePerImageReader.f6637d;
                System.nanoTime();
                e eVar2 = new e(flutterRenderer$ImageReaderSurfaceProducer, image);
                ArrayDeque arrayDeque = orCreatePerImageReader.f6635b;
                arrayDeque.add(eVar2);
                while (arrayDeque.size() > 2) {
                    ((e) arrayDeque.removeFirst()).f6631a.close();
                }
                eVar = eVar2;
            }
        }
        if (eVar == null) {
            return;
        }
        this.this$0.f6663a.scheduleFrame();
    }

    @Override // io.flutter.view.o
    public void onTrimMemory(int i) {
        if (i < 40) {
            return;
        }
        synchronized (this.lock) {
            this.numTrims++;
        }
        p pVar = this.callback;
        if (pVar != null) {
            this.notifiedDestroy = true;
            C0992b c0992b = (C0992b) pVar;
            ((C0448G) c0992b.f10394d).W(null);
            c0992b.f10830e = true;
        }
        cleanup();
        this.createNewReader = true;
    }

    public int pendingDequeuedImages() {
        return this.lastDequeuedImage.size();
    }

    public void pruneImageReaderQueue() {
        g gVarPeekFirst;
        while (this.imageReaderQueue.size() > 1 && (gVarPeekFirst = this.imageReaderQueue.peekFirst()) != null) {
            ArrayDeque arrayDeque = gVarPeekFirst.f6635b;
            if (!arrayDeque.isEmpty() || gVarPeekFirst.f6637d.lastReaderDequeuedFrom == gVarPeekFirst) {
                return;
            }
            this.imageReaderQueue.removeFirst();
            HashMap<ImageReader, g> map = this.perImageReaders;
            ImageReader imageReader = gVarPeekFirst.f6634a;
            map.remove(imageReader);
            gVarPeekFirst.f6636c = true;
            imageReader.close();
            arrayDeque.clear();
        }
    }

    @Override // io.flutter.view.TextureRegistry$SurfaceProducer
    public void release() {
        if (this.released) {
            return;
        }
        releaseInternal();
        l lVar = this.this$0;
        lVar.f6663a.unregisterTexture(this.id);
    }

    @Override // io.flutter.view.TextureRegistry$SurfaceProducer
    public void scheduleFrame() {
        this.this$0.f6663a.scheduleFrame();
    }

    @Override // io.flutter.view.TextureRegistry$SurfaceProducer
    public void setCallback(p pVar) {
        this.callback = pVar;
    }

    @Override // io.flutter.view.TextureRegistry$SurfaceProducer
    public void setSize(int i, int i5) {
        int iMax = Math.max(1, i);
        int iMax2 = Math.max(1, i5);
        if (this.requestedWidth == iMax && this.requestedHeight == iMax2) {
            return;
        }
        this.createNewReader = true;
        this.requestedHeight = iMax2;
        this.requestedWidth = iMax;
    }
}

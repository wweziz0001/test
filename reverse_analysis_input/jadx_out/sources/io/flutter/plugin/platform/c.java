package io.flutter.plugin.platform;

import android.media.ImageReader;
import android.os.Build;
import android.os.Handler;
import android.view.Surface;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import b3.AbstractC0307a;
import io.flutter.view.TextureRegistry$ImageTextureEntry;
import java.util.ArrayList;
import java.util.Collections;
import r1.AbstractC0778s;
import r1.C0750A;

/* JADX INFO: loaded from: classes.dex */
public final class c implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f6745a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f6746b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f6747c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f6748d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Object f6749e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Object f6750f;

    public c(TextureRegistry$ImageTextureEntry textureRegistry$ImageTextureEntry) {
        this.f6745a = 0;
        this.f6746b = 0;
        this.f6749e = new Handler();
        this.f6750f = new C0505b(this);
        if (Build.VERSION.SDK_INT < 29) {
            throw new UnsupportedOperationException("ImageReaderPlatformViewRenderTarget requires API version 29+");
        }
        this.f6747c = textureRegistry$ImageTextureEntry;
    }

    @Override // io.flutter.plugin.platform.h
    public long a() {
        return ((TextureRegistry$ImageTextureEntry) this.f6747c).id();
    }

    @Override // io.flutter.plugin.platform.h
    public void b(int i, int i5) {
        ImageReader imageReaderNewInstance;
        ImageReader imageReader = (ImageReader) this.f6748d;
        if (imageReader != null && this.f6745a == i && this.f6746b == i5) {
            return;
        }
        if (imageReader != null) {
            ((TextureRegistry$ImageTextureEntry) this.f6747c).pushImage(null);
            ((ImageReader) this.f6748d).close();
            this.f6748d = null;
        }
        this.f6745a = i;
        this.f6746b = i5;
        int i6 = Build.VERSION.SDK_INT;
        Handler handler = (Handler) this.f6749e;
        C0505b c0505b = (C0505b) this.f6750f;
        if (i6 >= 33) {
            E.b.l();
            ImageReader.Builder builderE = E.b.e(this.f6745a, this.f6746b);
            builderE.setMaxImages(4);
            builderE.setImageFormat(34);
            builderE.setUsage(256L);
            imageReaderNewInstance = builderE.build();
            imageReaderNewInstance.setOnImageAvailableListener(c0505b, handler);
        } else {
            if (i6 < 29) {
                throw new UnsupportedOperationException("ImageReaderPlatformViewRenderTarget requires API version 29+");
            }
            imageReaderNewInstance = ImageReader.newInstance(i, i5, 34, 4, 256L);
            imageReaderNewInstance.setOnImageAvailableListener(c0505b, handler);
        }
        this.f6748d = imageReaderNewInstance;
    }

    public void c(int i) {
        RecyclerView recyclerView = (RecyclerView) this.f6750f;
        if (i < 0 || i >= recyclerView.f4727i0.a()) {
            throw new IndexOutOfBoundsException("Invalid item position " + i + "(" + i + "). Item count:" + recyclerView.f4727i0.a() + recyclerView.h());
        }
        C0750A c0750a = recyclerView.f4727i0;
        boolean z4 = c0750a.f9421c;
        ArrayList arrayList = (ArrayList) this.f6747c;
        if (arrayList.size() > 0) {
            arrayList.get(0).getClass();
            throw new ClassCastException();
        }
        ArrayList arrayList2 = (ArrayList) recyclerView.f4736o.f3087o;
        if (arrayList2.size() > 0) {
            RecyclerView.j((View) arrayList2.get(0));
            throw null;
        }
        ArrayList arrayList3 = (ArrayList) this.f6748d;
        if (arrayList3.size() > 0) {
            arrayList3.get(0).getClass();
            throw new ClassCastException();
        }
        int iR = recyclerView.f4734n.r(i, 0);
        if (iR >= 0) {
            throw null;
        }
        throw new IndexOutOfBoundsException("Inconsistency detected. Invalid item position " + i + "(offset:" + iR + ").state:" + c0750a.a() + recyclerView.h());
    }

    public void d() {
        AbstractC0778s abstractC0778s = ((RecyclerView) this.f6750f).f4745t;
        this.f6746b = this.f6745a;
        ArrayList arrayList = (ArrayList) this.f6748d;
        int size = arrayList.size() - 1;
        if (size < 0 || arrayList.size() <= this.f6746b) {
            return;
        }
        AbstractC0307a.q(arrayList.get(size));
        int[] iArr = RecyclerView.f4693s0;
        throw null;
    }

    @Override // io.flutter.plugin.platform.h
    public int getHeight() {
        return this.f6746b;
    }

    @Override // io.flutter.plugin.platform.h
    public Surface getSurface() {
        return ((ImageReader) this.f6748d).getSurface();
    }

    @Override // io.flutter.plugin.platform.h
    public int getWidth() {
        return this.f6745a;
    }

    @Override // io.flutter.plugin.platform.h
    public void release() {
        if (((ImageReader) this.f6748d) != null) {
            ((TextureRegistry$ImageTextureEntry) this.f6747c).pushImage(null);
            ((ImageReader) this.f6748d).close();
            this.f6748d = null;
        }
        this.f6747c = null;
    }

    public c(RecyclerView recyclerView) {
        this.f6750f = recyclerView;
        ArrayList arrayList = new ArrayList();
        this.f6747c = arrayList;
        this.f6748d = new ArrayList();
        Collections.unmodifiableList(arrayList);
        this.f6745a = 2;
        this.f6746b = 2;
    }
}

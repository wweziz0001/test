package f0;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import d0.AbstractC0360m;
import d0.AbstractC0370w;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: renamed from: f0.m, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0418m implements InterfaceC0413h {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Context f5694l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final ArrayList f5695m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final InterfaceC0413h f5696n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public C0423r f5697o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public C0407b f5698p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public C0410e f5699q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public InterfaceC0413h f5700r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public C0405C f5701s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public C0411f f5702t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public C0430y f5703u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public InterfaceC0413h f5704v;

    public C0418m(Context context, InterfaceC0413h interfaceC0413h) {
        this.f5694l = context.getApplicationContext();
        interfaceC0413h.getClass();
        this.f5696n = interfaceC0413h;
        this.f5695m = new ArrayList();
    }

    public static void c(InterfaceC0413h interfaceC0413h, InterfaceC0403A interfaceC0403A) {
        if (interfaceC0413h != null) {
            interfaceC0413h.b(interfaceC0403A);
        }
    }

    public final void a(InterfaceC0413h interfaceC0413h) {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f5695m;
            if (i >= arrayList.size()) {
                return;
            }
            interfaceC0413h.b((InterfaceC0403A) arrayList.get(i));
            i++;
        }
    }

    @Override // f0.InterfaceC0413h
    public final void b(InterfaceC0403A interfaceC0403A) {
        interfaceC0403A.getClass();
        this.f5696n.b(interfaceC0403A);
        this.f5695m.add(interfaceC0403A);
        c(this.f5697o, interfaceC0403A);
        c(this.f5698p, interfaceC0403A);
        c(this.f5699q, interfaceC0403A);
        c(this.f5700r, interfaceC0403A);
        c(this.f5701s, interfaceC0403A);
        c(this.f5702t, interfaceC0403A);
        c(this.f5703u, interfaceC0403A);
    }

    @Override // f0.InterfaceC0413h
    public final void close() {
        InterfaceC0413h interfaceC0413h = this.f5704v;
        if (interfaceC0413h != null) {
            try {
                interfaceC0413h.close();
            } finally {
                this.f5704v = null;
            }
        }
    }

    @Override // f0.InterfaceC0413h
    public final long p(C0417l c0417l) {
        AbstractC0360m.h(this.f5704v == null);
        String scheme = c0417l.f5686a.getScheme();
        int i = AbstractC0370w.f5326a;
        Uri uri = c0417l.f5686a;
        String scheme2 = uri.getScheme();
        boolean zIsEmpty = TextUtils.isEmpty(scheme2);
        Context context = this.f5694l;
        if (zIsEmpty || "file".equals(scheme2)) {
            String path = uri.getPath();
            if (path == null || !path.startsWith("/android_asset/")) {
                if (this.f5697o == null) {
                    C0423r c0423r = new C0423r(false);
                    this.f5697o = c0423r;
                    a(c0423r);
                }
                this.f5704v = this.f5697o;
            } else {
                if (this.f5698p == null) {
                    C0407b c0407b = new C0407b(context);
                    this.f5698p = c0407b;
                    a(c0407b);
                }
                this.f5704v = this.f5698p;
            }
        } else if ("asset".equals(scheme)) {
            if (this.f5698p == null) {
                C0407b c0407b2 = new C0407b(context);
                this.f5698p = c0407b2;
                a(c0407b2);
            }
            this.f5704v = this.f5698p;
        } else if ("content".equals(scheme)) {
            if (this.f5699q == null) {
                C0410e c0410e = new C0410e(context);
                this.f5699q = c0410e;
                a(c0410e);
            }
            this.f5704v = this.f5699q;
        } else {
            boolean zEquals = "rtmp".equals(scheme);
            InterfaceC0413h interfaceC0413h = this.f5696n;
            if (zEquals) {
                if (this.f5700r == null) {
                    try {
                        InterfaceC0413h interfaceC0413h2 = (InterfaceC0413h) Class.forName("androidx.media3.datasource.rtmp.RtmpDataSource").getConstructor(null).newInstance(null);
                        this.f5700r = interfaceC0413h2;
                        a(interfaceC0413h2);
                    } catch (ClassNotFoundException unused) {
                        AbstractC0360m.y("DefaultDataSource", "Attempting to play RTMP stream without depending on the RTMP extension");
                    } catch (Exception e5) {
                        throw new RuntimeException("Error instantiating RTMP extension", e5);
                    }
                    if (this.f5700r == null) {
                        this.f5700r = interfaceC0413h;
                    }
                }
                this.f5704v = this.f5700r;
            } else if ("udp".equals(scheme)) {
                if (this.f5701s == null) {
                    C0405C c0405c = new C0405C(8000);
                    this.f5701s = c0405c;
                    a(c0405c);
                }
                this.f5704v = this.f5701s;
            } else if ("data".equals(scheme)) {
                if (this.f5702t == null) {
                    C0411f c0411f = new C0411f(false);
                    this.f5702t = c0411f;
                    a(c0411f);
                }
                this.f5704v = this.f5702t;
            } else if ("rawresource".equals(scheme) || "android.resource".equals(scheme)) {
                if (this.f5703u == null) {
                    C0430y c0430y = new C0430y(context);
                    this.f5703u = c0430y;
                    a(c0430y);
                }
                this.f5704v = this.f5703u;
            } else {
                this.f5704v = interfaceC0413h;
            }
        }
        return this.f5704v.p(c0417l);
    }

    @Override // f0.InterfaceC0413h
    public final Uri r() {
        InterfaceC0413h interfaceC0413h = this.f5704v;
        if (interfaceC0413h == null) {
            return null;
        }
        return interfaceC0413h.r();
    }

    @Override // a0.InterfaceC0182h
    public final int read(byte[] bArr, int i, int i5) {
        InterfaceC0413h interfaceC0413h = this.f5704v;
        interfaceC0413h.getClass();
        return interfaceC0413h.read(bArr, i, i5);
    }

    @Override // f0.InterfaceC0413h
    public final Map y() {
        InterfaceC0413h interfaceC0413h = this.f5704v;
        return interfaceC0413h == null ? Collections.emptyMap() : interfaceC0413h.y();
    }
}

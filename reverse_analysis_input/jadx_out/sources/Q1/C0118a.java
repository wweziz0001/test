package Q1;

import android.media.MediaCodec;
import d0.AbstractC0370w;

/* JADX INFO: renamed from: Q1.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0118a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f1795a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f1796b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f1797c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f1798d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Object f1799e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Object f1800f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Object f1801g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Object f1802h;
    public final Object i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Object f1803j;

    public C0118a(r rVar) {
        this.f1799e = C.c(false);
        this.f1800f = C.c(true);
        this.f1801g = new r();
        this.f1802h = new F();
        this.i = r.f1839a;
        this.f1803j = new B0.d(15);
        this.f1795a = 4;
        this.f1796b = Integer.MAX_VALUE;
        this.f1798d = 20;
        this.f1797c = 8;
    }

    public C0118a() {
        Z1.c cVar;
        MediaCodec.CryptoInfo cryptoInfo = new MediaCodec.CryptoInfo();
        this.i = cryptoInfo;
        if (AbstractC0370w.f5326a >= 24) {
            cVar = new Z1.c();
            cVar.f2996l = cryptoInfo;
            cVar.f2997m = new MediaCodec.CryptoInfo.Pattern(0, 0);
        } else {
            cVar = null;
        }
        this.f1803j = cVar;
    }
}

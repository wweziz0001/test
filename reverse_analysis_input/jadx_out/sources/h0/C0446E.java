package h0;

/* JADX INFO: renamed from: h0.E, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0446E implements k0 {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public C0446E f5910l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public C0446E f5911m;

    public final void a(long j5, float[] fArr) {
        C0446E c0446e = this.f5911m;
        if (c0446e != null) {
            c0446e.a(j5, fArr);
        }
    }

    public final void b() {
        C0446E c0446e = this.f5911m;
        if (c0446e != null) {
            c0446e.b();
        }
    }

    public final void c(long j5, long j6) {
        C0446E c0446e = this.f5910l;
        if (c0446e != null) {
            c0446e.c(j5, j6);
        }
    }

    @Override // h0.k0
    public final void handleMessage(int i, Object obj) {
        if (i == 7) {
            this.f5910l = (C0446E) obj;
        } else if (i == 8) {
            this.f5911m = (C0446E) obj;
        } else if (i == 10000 && obj != null) {
            throw new ClassCastException();
        }
    }
}

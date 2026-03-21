package k0;

import y0.AbstractC0994b;

/* JADX INFO: loaded from: classes.dex */
public final class j extends AbstractC0994b {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f7601o = 0;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final Object f7602p;

    public j(w0.b bVar, int i) {
        super(i, bVar.f10436k - 1);
        this.f7602p = bVar;
    }

    @Override // y0.m
    public final long a() {
        switch (this.f7601o) {
            case 0:
                b();
                return ((i) this.f7602p).e(this.f10836n);
            default:
                return ((w0.b) this.f7602p).b((int) this.f10836n) + g();
        }
    }

    @Override // y0.m
    public final long g() {
        switch (this.f7601o) {
            case 0:
                b();
                return ((i) this.f7602p).f(this.f10836n);
            default:
                b();
                return ((w0.b) this.f7602p).f10440o[(int) this.f10836n];
        }
    }

    public j(i iVar, long j5, long j6) {
        super(j5, j6);
        this.f7602p = iVar;
    }
}

package c1;

import java.util.List;
import p0.C0726b;

/* JADX INFO: loaded from: classes.dex */
public final class c extends g0.f implements d {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public d f5035p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public long f5036q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f5037r = 1;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public Object f5038s;

    public /* synthetic */ c() {
    }

    @Override // c1.d
    public final int a(long j5) {
        d dVar = this.f5035p;
        dVar.getClass();
        return dVar.a(j5 - this.f5036q);
    }

    @Override // c1.d
    public final List d(long j5) {
        d dVar = this.f5035p;
        dVar.getClass();
        return dVar.d(j5 - this.f5036q);
    }

    @Override // g0.f
    public final void f() {
        this.f5494m = 0;
        this.f5792n = 0L;
        this.f5793o = false;
        this.f5035p = null;
    }

    @Override // c1.d
    public final long g(int i) {
        d dVar = this.f5035p;
        dVar.getClass();
        return dVar.g(i) + this.f5036q;
    }

    @Override // c1.d
    public final int h() {
        d dVar = this.f5035p;
        dVar.getClass();
        return dVar.h();
    }

    @Override // g0.f
    public final void i() {
        switch (this.f5037r) {
            case 0:
                ((C0726b) this.f5038s).k(this);
                break;
            default:
                I2.g gVar = (I2.g) this.f5038s;
                gVar.getClass();
                d1.h hVar = (d1.h) gVar.f1034m;
                hVar.getClass();
                f();
                hVar.f5419b.add(this);
                break;
        }
    }

    public c(C0726b c0726b) {
        this.f5038s = c0726b;
    }
}

package e3;

import a0.C0159J;
import android.content.Context;
import d0.C0365r;
import h0.N;
import h0.U;
import h0.u0;

/* JADX INFO: renamed from: e3.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0396e implements U {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f5629l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f5630m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Object f5631n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public Object f5632o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public Object f5633p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public Object f5634q;

    public C0396e(N n4, C0365r c0365r) {
        this.f5632o = n4;
        this.f5631n = new u0(c0365r);
        this.f5629l = true;
    }

    @Override // h0.U
    public void a(C0159J c0159j) {
        U u4 = (U) this.f5634q;
        if (u4 != null) {
            u4.a(c0159j);
            c0159j = ((U) this.f5634q).d();
        }
        ((u0) this.f5631n).a(c0159j);
    }

    @Override // h0.U
    public C0159J d() {
        U u4 = (U) this.f5634q;
        return u4 != null ? u4.d() : ((u0) this.f5631n).f6289p;
    }

    @Override // h0.U
    public boolean f() {
        if (this.f5629l) {
            ((u0) this.f5631n).getClass();
            return false;
        }
        U u4 = (U) this.f5634q;
        u4.getClass();
        return u4.f();
    }

    @Override // h0.U
    public long h() {
        if (this.f5629l) {
            return ((u0) this.f5631n).h();
        }
        U u4 = (U) this.f5634q;
        u4.getClass();
        return u4.h();
    }

    public C0396e(Context context) {
        this.f5629l = true;
        this.f5630m = false;
        this.f5631n = context;
    }
}

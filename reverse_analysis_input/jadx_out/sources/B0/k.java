package B0;

import F0.C0066m;
import d0.AbstractC0360m;
import d0.C0363p;

/* JADX INFO: loaded from: classes.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f226a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f227b;

    public /* synthetic */ k(int i, long j5, boolean z4) {
        this.f226a = i;
        this.f227b = j5;
    }

    public static k b(C0066m c0066m, C0363p c0363p) {
        c0066m.t(c0363p.f5313a, 0, 8, false);
        c0363p.H(0);
        return new k(c0363p.i(), c0363p.m(), false);
    }

    public boolean a() {
        int i = this.f226a;
        return i == 0 || i == 1;
    }

    public k(long j5, int i) {
        AbstractC0360m.c(j5 >= 0);
        this.f226a = i;
        this.f227b = j5;
    }
}

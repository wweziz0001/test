package A0;

import a0.C0190p;
import h0.q0;
import m2.AbstractC0666z;

/* JADX INFO: loaded from: classes.dex */
public final class k implements Comparable {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final boolean f100l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final boolean f101m;

    public k(C0190p c0190p, int i) {
        this.f100l = (c0190p.f3416e & 1) != 0;
        this.f101m = q0.g(i, false);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        k kVar = (k) obj;
        return AbstractC0666z.f8669a.c(this.f101m, kVar.f101m).c(this.f100l, kVar.f100l).e();
    }
}

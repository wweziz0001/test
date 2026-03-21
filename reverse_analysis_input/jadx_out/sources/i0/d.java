package i0;

import a0.AbstractC0169U;
import a0.C0168T;
import x0.H;

/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f6371a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f6372b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f6373c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final H f6374d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f6375e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f6376f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ e f6377g;

    public d(e eVar, String str, int i, H h2) {
        this.f6377g = eVar;
        this.f6371a = str;
        this.f6372b = i;
        this.f6373c = h2 == null ? -1L : h2.f10534d;
        if (h2 == null || !h2.b()) {
            return;
        }
        this.f6374d = h2;
    }

    public final boolean a(C0477a c0477a) {
        H h2 = c0477a.f6355d;
        if (h2 == null) {
            return this.f6372b != c0477a.f6354c;
        }
        long j5 = this.f6373c;
        if (j5 == -1) {
            return false;
        }
        if (h2.f10534d > j5) {
            return true;
        }
        H h5 = this.f6374d;
        if (h5 == null) {
            return false;
        }
        AbstractC0169U abstractC0169U = c0477a.f6353b;
        int iB = abstractC0169U.b(h2.f10531a);
        int iB2 = abstractC0169U.b(h5.f10531a);
        if (h2.f10534d < h5.f10534d || iB < iB2) {
            return false;
        }
        if (iB > iB2) {
            return true;
        }
        boolean zB = h2.b();
        int i = h5.f10532b;
        if (!zB) {
            int i5 = h2.f10535e;
            return i5 == -1 || i5 > i;
        }
        int i6 = h2.f10532b;
        if (i6 > i) {
            return true;
        }
        if (i6 == i) {
            if (h2.f10533c > h5.f10533c) {
                return true;
            }
        }
        return false;
    }

    public final boolean b(AbstractC0169U abstractC0169U, AbstractC0169U abstractC0169U2) {
        int i = this.f6372b;
        if (i < abstractC0169U.o()) {
            e eVar = this.f6377g;
            abstractC0169U.n(i, eVar.f6379a);
            C0168T c0168t = eVar.f6379a;
            for (int i5 = c0168t.f3257n; i5 <= c0168t.f3258o; i5++) {
                int iB = abstractC0169U2.b(abstractC0169U.l(i5));
                if (iB != -1) {
                    i = abstractC0169U2.f(iB, eVar.f6380b, false).f3238c;
                    break;
                }
            }
            i = -1;
        } else if (i >= abstractC0169U2.o()) {
            i = -1;
        }
        this.f6372b = i;
        if (i == -1) {
            return false;
        }
        H h2 = this.f6374d;
        return h2 == null || abstractC0169U2.b(h2.f10531a) != -1;
    }
}

package y0;

import F0.E;
import F0.K;
import F0.q;
import F0.s;
import F0.u;
import a0.C0187m;
import a0.C0190p;
import a0.C0200z;
import android.util.SparseArray;
import d0.AbstractC0360m;

/* JADX INFO: renamed from: y0.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0996d implements s, InterfaceC0998f {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final C0187m f10843u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final u f10844v;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final q f10845l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final int f10846m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final C0190p f10847n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final SparseArray f10848o = new SparseArray();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f10849p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public Z1.e f10850q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public long f10851r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public E f10852s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public C0190p[] f10853t;

    static {
        C0187m c0187m = new C0187m();
        c0187m.f3363b = new C0200z(7);
        f10843u = c0187m;
        f10844v = new u();
    }

    public C0996d(q qVar, int i, C0190p c0190p) {
        this.f10845l = qVar;
        this.f10846m = i;
        this.f10847n = c0190p;
    }

    public final void a(Z1.e eVar, long j5, long j6) {
        this.f10850q = eVar;
        this.f10851r = j6;
        boolean z4 = this.f10849p;
        q qVar = this.f10845l;
        if (!z4) {
            qVar.j(this);
            if (j5 != -9223372036854775807L) {
                qVar.b(0L, j5);
            }
            this.f10849p = true;
            return;
        }
        if (j5 == -9223372036854775807L) {
            j5 = 0;
        }
        qVar.b(0L, j5);
        int i = 0;
        while (true) {
            SparseArray sparseArray = this.f10848o;
            if (i >= sparseArray.size()) {
                return;
            }
            C0995c c0995c = (C0995c) sparseArray.valueAt(i);
            if (eVar == null) {
                c0995c.f10841e = c0995c.f10839c;
            } else {
                c0995c.f10842f = j6;
                K kW = eVar.w(c0995c.f10837a);
                c0995c.f10841e = kW;
                C0190p c0190p = c0995c.f10840d;
                if (c0190p != null) {
                    kW.c(c0190p);
                }
            }
            i++;
        }
    }

    @Override // F0.s
    public final void d(E e5) {
        this.f10852s = e5;
    }

    @Override // F0.s
    public final void j() {
        SparseArray sparseArray = this.f10848o;
        C0190p[] c0190pArr = new C0190p[sparseArray.size()];
        for (int i = 0; i < sparseArray.size(); i++) {
            C0190p c0190p = ((C0995c) sparseArray.valueAt(i)).f10840d;
            AbstractC0360m.i(c0190p);
            c0190pArr[i] = c0190p;
        }
        this.f10853t = c0190pArr;
    }

    @Override // F0.s
    public final K k(int i, int i5) {
        SparseArray sparseArray = this.f10848o;
        C0995c c0995c = (C0995c) sparseArray.get(i);
        if (c0995c == null) {
            AbstractC0360m.h(this.f10853t == null);
            c0995c = new C0995c(i, i5, i5 == this.f10846m ? this.f10847n : null);
            Z1.e eVar = this.f10850q;
            long j5 = this.f10851r;
            if (eVar == null) {
                c0995c.f10841e = c0995c.f10839c;
            } else {
                c0995c.f10842f = j5;
                K kW = eVar.w(i5);
                c0995c.f10841e = kW;
                C0190p c0190p = c0995c.f10840d;
                if (c0190p != null) {
                    kW.c(c0190p);
                }
            }
            sparseArray.put(i, c0995c);
        }
        return c0995c;
    }
}

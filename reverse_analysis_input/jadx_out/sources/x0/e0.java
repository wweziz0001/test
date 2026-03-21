package x0;

import a0.C0186l;
import a0.C0189o;
import a0.C0190p;
import a0.InterfaceC0182h;
import android.util.SparseArray;
import com.google.crypto.tink.shaded.protobuf.C0324d;
import d0.AbstractC0360m;
import d0.C0363p;
import java.io.EOFException;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public class e0 implements F0.K {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public C0190p f10675A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public C0190p f10676B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public long f10677C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public boolean f10678D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public boolean f10679E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public long f10680F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public boolean f10681G;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b0 f10682a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final D0.d f10684c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final m0.i f10685d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final m0.e f10686e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public d0 f10687f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public C0190p f10688g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public androidx.lifecycle.E f10689h;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f10696p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f10697q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f10698r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f10699s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public long f10700t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public long f10701u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public long f10702v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f10703w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f10704x;
    public boolean y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public boolean f10705z;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C0324d f10683b = new C0324d();
    public int i = 1000;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public long[] f10690j = new long[1000];

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long[] f10691k = new long[1000];

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public long[] f10694n = new long[1000];

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int[] f10693m = new int[1000];

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int[] f10692l = new int[1000];

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public F0.J[] f10695o = new F0.J[1000];

    public e0(B0.f fVar, m0.i iVar, m0.e eVar) {
        this.f10685d = iVar;
        this.f10686e = eVar;
        this.f10682a = new b0(fVar);
        s2.l lVar = new s2.l(10);
        D0.d dVar = new D0.d();
        dVar.f395m = new SparseArray();
        dVar.f396n = lVar;
        dVar.f394l = -1;
        this.f10684c = dVar;
        this.f10700t = Long.MIN_VALUE;
        this.f10701u = Long.MIN_VALUE;
        this.f10702v = Long.MIN_VALUE;
        this.y = true;
        this.f10704x = true;
        this.f10678D = true;
    }

    public final synchronized boolean A(int i) {
        synchronized (this) {
            this.f10699s = 0;
            b0 b0Var = this.f10682a;
            b0Var.f10656e = b0Var.f10655d;
        }
        int i5 = this.f10697q;
        if (i >= i5 && i <= this.f10696p + i5) {
            this.f10700t = Long.MIN_VALUE;
            this.f10699s = i - i5;
            return true;
        }
        return false;
    }

    public final synchronized boolean B(long j5, boolean z4) {
        int iJ;
        try {
            synchronized (this) {
                this.f10699s = 0;
                b0 b0Var = this.f10682a;
                b0Var.f10656e = b0Var.f10655d;
            }
        } finally {
        }
        int iO = o(0);
        if (r() && j5 >= this.f10694n[iO] && (j5 <= this.f10702v || z4)) {
            if (this.f10678D) {
                int i = this.f10696p - this.f10699s;
                iJ = 0;
                while (true) {
                    if (iJ >= i) {
                        if (!z4) {
                            i = -1;
                        }
                        iJ = i;
                    } else if (this.f10694n[iO] < j5) {
                        iO++;
                        if (iO == this.i) {
                            iO = 0;
                        }
                        iJ++;
                    }
                }
            } else {
                iJ = j(iO, this.f10696p - this.f10699s, j5, true);
            }
            if (iJ == -1) {
                return false;
            }
            this.f10700t = j5;
            this.f10699s += iJ;
            return true;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x000e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized void C(int r3) {
        /*
            r2 = this;
            monitor-enter(r2)
            if (r3 < 0) goto Le
            int r0 = r2.f10699s     // Catch: java.lang.Throwable -> Lc
            int r0 = r0 + r3
            int r1 = r2.f10696p     // Catch: java.lang.Throwable -> Lc
            if (r0 > r1) goto Le
            r0 = 1
            goto Lf
        Lc:
            r3 = move-exception
            goto L19
        Le:
            r0 = 0
        Lf:
            d0.AbstractC0360m.c(r0)     // Catch: java.lang.Throwable -> Lc
            int r0 = r2.f10699s     // Catch: java.lang.Throwable -> Lc
            int r0 = r0 + r3
            r2.f10699s = r0     // Catch: java.lang.Throwable -> Lc
            monitor-exit(r2)
            return
        L19:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> Lc
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: x0.e0.C(int):void");
    }

    @Override // F0.K
    public final void a(C0363p c0363p, int i, int i5) {
        while (true) {
            b0 b0Var = this.f10682a;
            if (i <= 0) {
                b0Var.getClass();
                return;
            }
            int iC = b0Var.c(i);
            Z0.b bVar = b0Var.f10657f;
            B0.a aVar = (B0.a) bVar.f2830n;
            c0363p.g(aVar.f181a, ((int) (b0Var.f10658g - bVar.f2828l)) + aVar.f182b, iC);
            i -= iC;
            long j5 = b0Var.f10658g + ((long) iC);
            b0Var.f10658g = j5;
            Z0.b bVar2 = b0Var.f10657f;
            if (j5 == bVar2.f2829m) {
                b0Var.f10657f = (Z0.b) bVar2.f2831o;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x013d A[Catch: all -> 0x00dc, TryCatch #1 {all -> 0x00dc, blocks: (B:69:0x00be, B:71:0x00c2, B:75:0x00d8, B:78:0x00df, B:82:0x00e7, B:87:0x0122, B:110:0x019c, B:112:0x01a5, B:89:0x013d, B:91:0x0146, B:93:0x014e, B:95:0x0162, B:99:0x016b, B:100:0x0170, B:102:0x0176, B:106:0x0184, B:108:0x0189, B:109:0x0199, B:92:0x014c), top: B:118:0x00be }] */
    @Override // F0.K
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void b(long r17, int r19, int r20, int r21, F0.J r22) {
        /*
            Method dump skipped, instruction units count: 530
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: x0.e0.b(long, int, int, int, F0.J):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x005b A[Catch: all -> 0x0059, TryCatch #0 {all -> 0x0059, blocks: (B:4:0x000a, B:8:0x0018, B:13:0x002a, B:15:0x0043, B:19:0x005d, B:18:0x005b), top: B:29:0x000a }] */
    @Override // F0.K
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(a0.C0190p r5) {
        /*
            r4 = this;
            a0.p r0 = r4.k(r5)
            r1 = 0
            r4.f10705z = r1
            r4.f10675A = r5
            monitor-enter(r4)
            r4.y = r1     // Catch: java.lang.Throwable -> L59
            a0.p r5 = r4.f10676B     // Catch: java.lang.Throwable -> L59
            int r2 = d0.AbstractC0370w.f5326a     // Catch: java.lang.Throwable -> L59
            boolean r5 = java.util.Objects.equals(r0, r5)     // Catch: java.lang.Throwable -> L59
            if (r5 == 0) goto L18
            monitor-exit(r4)
            goto L70
        L18:
            D0.d r5 = r4.f10684c     // Catch: java.lang.Throwable -> L59
            java.lang.Object r5 = r5.f395m     // Catch: java.lang.Throwable -> L59
            android.util.SparseArray r5 = (android.util.SparseArray) r5     // Catch: java.lang.Throwable -> L59
            int r5 = r5.size()     // Catch: java.lang.Throwable -> L59
            r2 = 1
            if (r5 != 0) goto L27
            r5 = r2
            goto L28
        L27:
            r5 = r1
        L28:
            if (r5 != 0) goto L5b
            D0.d r5 = r4.f10684c     // Catch: java.lang.Throwable -> L59
            java.lang.Object r5 = r5.f395m     // Catch: java.lang.Throwable -> L59
            android.util.SparseArray r5 = (android.util.SparseArray) r5     // Catch: java.lang.Throwable -> L59
            int r3 = r5.size()     // Catch: java.lang.Throwable -> L59
            int r3 = r3 - r2
            java.lang.Object r5 = r5.valueAt(r3)     // Catch: java.lang.Throwable -> L59
            x0.c0 r5 = (x0.c0) r5     // Catch: java.lang.Throwable -> L59
            a0.p r5 = r5.f10662a     // Catch: java.lang.Throwable -> L59
            boolean r5 = r5.equals(r0)     // Catch: java.lang.Throwable -> L59
            if (r5 == 0) goto L5b
            D0.d r5 = r4.f10684c     // Catch: java.lang.Throwable -> L59
            java.lang.Object r5 = r5.f395m     // Catch: java.lang.Throwable -> L59
            android.util.SparseArray r5 = (android.util.SparseArray) r5     // Catch: java.lang.Throwable -> L59
            int r0 = r5.size()     // Catch: java.lang.Throwable -> L59
            int r0 = r0 - r2
            java.lang.Object r5 = r5.valueAt(r0)     // Catch: java.lang.Throwable -> L59
            x0.c0 r5 = (x0.c0) r5     // Catch: java.lang.Throwable -> L59
            a0.p r5 = r5.f10662a     // Catch: java.lang.Throwable -> L59
            r4.f10676B = r5     // Catch: java.lang.Throwable -> L59
            goto L5d
        L59:
            r5 = move-exception
            goto L7a
        L5b:
            r4.f10676B = r0     // Catch: java.lang.Throwable -> L59
        L5d:
            boolean r5 = r4.f10678D     // Catch: java.lang.Throwable -> L59
            a0.p r0 = r4.f10676B     // Catch: java.lang.Throwable -> L59
            java.lang.String r3 = r0.f3424n     // Catch: java.lang.Throwable -> L59
            java.lang.String r0 = r0.f3421k     // Catch: java.lang.Throwable -> L59
            boolean r0 = a0.AbstractC0156G.a(r3, r0)     // Catch: java.lang.Throwable -> L59
            r5 = r5 & r0
            r4.f10678D = r5     // Catch: java.lang.Throwable -> L59
            r4.f10679E = r1     // Catch: java.lang.Throwable -> L59
            monitor-exit(r4)
            r1 = r2
        L70:
            x0.d0 r5 = r4.f10687f
            if (r5 == 0) goto L79
            if (r1 == 0) goto L79
            r5.m()
        L79:
            return
        L7a:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L59
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: x0.e0.c(a0.p):void");
    }

    @Override // F0.K
    public final int d(InterfaceC0182h interfaceC0182h, int i, boolean z4) throws EOFException {
        b0 b0Var = this.f10682a;
        int iC = b0Var.c(i);
        Z0.b bVar = b0Var.f10657f;
        B0.a aVar = (B0.a) bVar.f2830n;
        int i5 = interfaceC0182h.read(aVar.f181a, ((int) (b0Var.f10658g - bVar.f2828l)) + aVar.f182b, iC);
        if (i5 == -1) {
            if (z4) {
                return -1;
            }
            throw new EOFException();
        }
        long j5 = b0Var.f10658g + ((long) i5);
        b0Var.f10658g = j5;
        Z0.b bVar2 = b0Var.f10657f;
        if (j5 != bVar2.f2829m) {
            return i5;
        }
        b0Var.f10657f = (Z0.b) bVar2.f2831o;
        return i5;
    }

    public final long e(int i) {
        this.f10701u = Math.max(this.f10701u, m(i));
        this.f10696p -= i;
        int i5 = this.f10697q + i;
        this.f10697q = i5;
        int i6 = this.f10698r + i;
        this.f10698r = i6;
        int i7 = this.i;
        if (i6 >= i7) {
            this.f10698r = i6 - i7;
        }
        int i8 = this.f10699s - i;
        this.f10699s = i8;
        int i9 = 0;
        if (i8 < 0) {
            this.f10699s = 0;
        }
        while (true) {
            D0.d dVar = this.f10684c;
            SparseArray sparseArray = (SparseArray) dVar.f395m;
            if (i9 >= sparseArray.size() - 1) {
                break;
            }
            int i10 = i9 + 1;
            if (i5 < sparseArray.keyAt(i10)) {
                break;
            }
            ((s2.l) dVar.f396n).accept(sparseArray.valueAt(i9));
            sparseArray.removeAt(i9);
            int i11 = dVar.f394l;
            if (i11 > 0) {
                dVar.f394l = i11 - 1;
            }
            i9 = i10;
        }
        if (this.f10696p != 0) {
            return this.f10691k[this.f10698r];
        }
        int i12 = this.f10698r;
        if (i12 == 0) {
            i12 = this.i;
        }
        int i13 = i12 - 1;
        return this.f10691k[i13] + ((long) this.f10692l[i13]);
    }

    public final void f(long j5, boolean z4) {
        long jE;
        int i;
        b0 b0Var = this.f10682a;
        synchronized (this) {
            try {
                int i5 = this.f10696p;
                jE = -1;
                if (i5 != 0) {
                    long[] jArr = this.f10694n;
                    int i6 = this.f10698r;
                    if (j5 >= jArr[i6]) {
                        if (z4 && (i = this.f10699s) != i5) {
                            i5 = i + 1;
                        }
                        int iJ = j(i6, i5, j5, false);
                        if (iJ != -1) {
                            jE = e(iJ);
                        }
                    }
                }
            } finally {
            }
        }
        b0Var.b(jE);
    }

    public final void g() {
        long jE;
        b0 b0Var = this.f10682a;
        synchronized (this) {
            int i = this.f10696p;
            jE = i == 0 ? -1L : e(i);
        }
        b0Var.b(jE);
    }

    public final long h(int i) {
        int i5 = this.f10697q;
        int i6 = this.f10696p;
        int i7 = (i5 + i6) - i;
        boolean z4 = false;
        AbstractC0360m.c(i7 >= 0 && i7 <= i6 - this.f10699s);
        int i8 = this.f10696p - i7;
        this.f10696p = i8;
        this.f10702v = Math.max(this.f10701u, m(i8));
        if (i7 == 0 && this.f10703w) {
            z4 = true;
        }
        this.f10703w = z4;
        D0.d dVar = this.f10684c;
        SparseArray sparseArray = (SparseArray) dVar.f395m;
        for (int size = sparseArray.size() - 1; size >= 0 && i < sparseArray.keyAt(size); size--) {
            ((s2.l) dVar.f396n).accept(sparseArray.valueAt(size));
            sparseArray.removeAt(size);
        }
        dVar.f394l = sparseArray.size() > 0 ? Math.min(dVar.f394l, sparseArray.size() - 1) : -1;
        int i9 = this.f10696p;
        if (i9 == 0) {
            return 0L;
        }
        int iO = o(i9 - 1);
        return this.f10691k[iO] + ((long) this.f10692l[iO]);
    }

    public final void i(int i) {
        long jH = h(i);
        b0 b0Var = this.f10682a;
        AbstractC0360m.c(jH <= b0Var.f10658g);
        b0Var.f10658g = jH;
        int i5 = b0Var.f10653b;
        if (jH != 0) {
            Z0.b bVar = b0Var.f10655d;
            if (jH != bVar.f2828l) {
                while (b0Var.f10658g > bVar.f2829m) {
                    bVar = (Z0.b) bVar.f2831o;
                }
                Z0.b bVar2 = (Z0.b) bVar.f2831o;
                bVar2.getClass();
                b0Var.a(bVar2);
                Z0.b bVar3 = new Z0.b(bVar.f2829m, i5);
                bVar.f2831o = bVar3;
                if (b0Var.f10658g == bVar.f2829m) {
                    bVar = bVar3;
                }
                b0Var.f10657f = bVar;
                if (b0Var.f10656e == bVar2) {
                    b0Var.f10656e = bVar3;
                    return;
                }
                return;
            }
        }
        b0Var.a(b0Var.f10655d);
        Z0.b bVar4 = new Z0.b(b0Var.f10658g, i5);
        b0Var.f10655d = bVar4;
        b0Var.f10656e = bVar4;
        b0Var.f10657f = bVar4;
    }

    public final int j(int i, int i5, long j5, boolean z4) {
        int i6 = -1;
        for (int i7 = 0; i7 < i5; i7++) {
            long j6 = this.f10694n[i];
            if (j6 > j5) {
                break;
            }
            if (!z4 || (this.f10693m[i] & 1) != 0) {
                i6 = i7;
                if (j6 == j5) {
                    break;
                }
            }
            i++;
            if (i == this.i) {
                i = 0;
            }
        }
        return i6;
    }

    public C0190p k(C0190p c0190p) {
        if (this.f10680F == 0 || c0190p.f3429s == Long.MAX_VALUE) {
            return c0190p;
        }
        C0189o c0189oA = c0190p.a();
        c0189oA.f3392r = c0190p.f3429s + this.f10680F;
        return new C0190p(c0189oA);
    }

    public final synchronized long l() {
        return this.f10702v;
    }

    public final long m(int i) {
        long jMax = Long.MIN_VALUE;
        if (i == 0) {
            return Long.MIN_VALUE;
        }
        int iO = o(i - 1);
        for (int i5 = 0; i5 < i; i5++) {
            jMax = Math.max(jMax, this.f10694n[iO]);
            if ((this.f10693m[iO] & 1) != 0) {
                break;
            }
            iO--;
            if (iO == -1) {
                iO = this.i - 1;
            }
        }
        return jMax;
    }

    public final int n() {
        return this.f10697q + this.f10699s;
    }

    public final int o(int i) {
        int i5 = this.f10698r + i;
        int i6 = this.i;
        return i5 < i6 ? i5 : i5 - i6;
    }

    public final synchronized int p(long j5, boolean z4) {
        int iO = o(this.f10699s);
        if (r() && j5 >= this.f10694n[iO]) {
            if (j5 > this.f10702v && z4) {
                return this.f10696p - this.f10699s;
            }
            int iJ = j(iO, this.f10696p - this.f10699s, j5, true);
            if (iJ == -1) {
                return 0;
            }
            return iJ;
        }
        return 0;
    }

    public final synchronized C0190p q() {
        return this.y ? null : this.f10676B;
    }

    public final boolean r() {
        return this.f10699s != this.f10696p;
    }

    public final synchronized boolean s(boolean z4) {
        C0190p c0190p;
        boolean z5 = true;
        if (r()) {
            if (((c0) this.f10684c.h(n())).f10662a != this.f10688g) {
                return true;
            }
            return t(o(this.f10699s));
        }
        if (!z4 && !this.f10703w && ((c0190p = this.f10676B) == null || c0190p == this.f10688g)) {
            z5 = false;
        }
        return z5;
    }

    public final boolean t(int i) {
        androidx.lifecycle.E e5 = this.f10689h;
        if (e5 == null || e5.E() == 4) {
            return true;
        }
        if ((this.f10693m[i] & 1073741824) == 0) {
            this.f10689h.getClass();
        }
        return false;
    }

    public final void u() throws m0.c {
        androidx.lifecycle.E e5 = this.f10689h;
        if (e5 == null || e5.E() != 1) {
            return;
        }
        m0.c cVarZ = this.f10689h.z();
        cVarZ.getClass();
        throw cVarZ;
    }

    public final void v(C0190p c0190p, Z1.e eVar) {
        C0190p c0190p2;
        C0190p c0190p3 = this.f10688g;
        boolean z4 = c0190p3 == null;
        C0186l c0186l = c0190p3 == null ? null : c0190p3.f3428r;
        this.f10688g = c0190p;
        C0186l c0186l2 = c0190p.f3428r;
        m0.i iVar = this.f10685d;
        if (iVar != null) {
            int iB = iVar.b(c0190p);
            C0189o c0189oA = c0190p.a();
            c0189oA.f3375K = iB;
            c0190p2 = new C0190p(c0189oA);
        } else {
            c0190p2 = c0190p;
        }
        eVar.f3002n = c0190p2;
        eVar.f3001m = this.f10689h;
        if (iVar == null) {
            return;
        }
        if (z4 || !Objects.equals(c0186l, c0186l2)) {
            androidx.lifecycle.E e5 = this.f10689h;
            m0.e eVar2 = this.f10686e;
            androidx.lifecycle.E eD = iVar.d(eVar2, c0190p);
            this.f10689h = eD;
            eVar.f3001m = eD;
            if (e5 != null) {
                e5.I(eVar2);
            }
        }
    }

    public final synchronized long w() {
        try {
        } catch (Throwable th) {
            throw th;
        }
        return r() ? this.f10690j[o(this.f10699s)] : this.f10677C;
    }

    public final int x(Z1.e eVar, g0.e eVar2, int i, boolean z4) {
        int i5;
        boolean z5 = (i & 2) != 0;
        C0324d c0324d = this.f10683b;
        synchronized (this) {
            try {
                eVar2.f5788q = false;
                i5 = -3;
                if (r()) {
                    C0190p c0190p = ((c0) this.f10684c.h(n())).f10662a;
                    if (!z5 && c0190p == this.f10688g) {
                        int iO = o(this.f10699s);
                        if (t(iO)) {
                            eVar2.f5494m = this.f10693m[iO];
                            if (this.f10699s == this.f10696p - 1 && (z4 || this.f10703w)) {
                                eVar2.b(536870912);
                            }
                            eVar2.f5789r = this.f10694n[iO];
                            c0324d.f5187a = this.f10692l[iO];
                            c0324d.f5188b = this.f10691k[iO];
                            c0324d.f5189c = this.f10695o[iO];
                            i5 = -4;
                        } else {
                            eVar2.f5788q = true;
                        }
                    }
                    v(c0190p, eVar);
                    i5 = -5;
                } else {
                    if (!z4 && !this.f10703w) {
                        C0190p c0190p2 = this.f10676B;
                        if (c0190p2 == null || (!z5 && c0190p2 == this.f10688g)) {
                        }
                        v(c0190p2, eVar);
                        i5 = -5;
                    }
                    eVar2.f5494m = 4;
                    eVar2.f5789r = Long.MIN_VALUE;
                    i5 = -4;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (i5 == -4 && !eVar2.e(4)) {
            boolean z6 = (i & 1) != 0;
            if ((i & 4) == 0) {
                if (z6) {
                    b0 b0Var = this.f10682a;
                    b0.f(b0Var.f10656e, eVar2, this.f10683b, b0Var.f10654c);
                } else {
                    b0 b0Var2 = this.f10682a;
                    b0Var2.f10656e = b0.f(b0Var2.f10656e, eVar2, this.f10683b, b0Var2.f10654c);
                }
            }
            if (!z6) {
                this.f10699s++;
            }
        }
        return i5;
    }

    public final void y() {
        z(true);
        androidx.lifecycle.E e5 = this.f10689h;
        if (e5 != null) {
            e5.I(this.f10686e);
            this.f10689h = null;
            this.f10688g = null;
        }
    }

    public final void z(boolean z4) {
        D0.d dVar;
        SparseArray sparseArray;
        b0 b0Var = this.f10682a;
        b0Var.a(b0Var.f10655d);
        Z0.b bVar = b0Var.f10655d;
        int i = 0;
        AbstractC0360m.h(((B0.a) bVar.f2830n) == null);
        bVar.f2828l = 0L;
        bVar.f2829m = b0Var.f10653b;
        Z0.b bVar2 = b0Var.f10655d;
        b0Var.f10656e = bVar2;
        b0Var.f10657f = bVar2;
        b0Var.f10658g = 0L;
        b0Var.f10652a.b();
        this.f10696p = 0;
        this.f10697q = 0;
        this.f10698r = 0;
        this.f10699s = 0;
        this.f10704x = true;
        this.f10700t = Long.MIN_VALUE;
        this.f10701u = Long.MIN_VALUE;
        this.f10702v = Long.MIN_VALUE;
        this.f10703w = false;
        while (true) {
            dVar = this.f10684c;
            sparseArray = (SparseArray) dVar.f395m;
            if (i >= sparseArray.size()) {
                break;
            }
            ((s2.l) dVar.f396n).accept(sparseArray.valueAt(i));
            i++;
        }
        dVar.f394l = -1;
        sparseArray.clear();
        if (z4) {
            this.f10675A = null;
            this.f10676B = null;
            this.y = true;
            this.f10678D = true;
        }
    }
}

package x0;

import a0.C0170V;
import a0.C0189o;
import a0.C0190p;
import d0.AbstractC0360m;
import h0.t0;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.IdentityHashMap;
import m2.C0640G;

/* JADX INFO: loaded from: classes.dex */
public final class P implements F, InterfaceC0959E {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final F[] f10549l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final IdentityHashMap f10550m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final p1.b f10551n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final ArrayList f10552o = new ArrayList();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final HashMap f10553p = new HashMap();

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public InterfaceC0959E f10554q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public q0 f10555r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public F[] f10556s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public C0972m f10557t;

    public P(p1.b bVar, long[] jArr, F... fArr) {
        this.f10551n = bVar;
        this.f10549l = fArr;
        bVar.getClass();
        C0640G c0640g = m2.I.f8549m;
        m2.b0 b0Var = m2.b0.f8583p;
        this.f10557t = new C0972m(b0Var, b0Var);
        this.f10550m = new IdentityHashMap();
        this.f10556s = new F[0];
        for (int i = 0; i < fArr.length; i++) {
            long j5 = jArr[i];
            if (j5 != 0) {
                this.f10549l[i] = new p0(fArr[i], j5);
            }
        }
    }

    @Override // x0.InterfaceC0959E
    public final void a(F f2) {
        ArrayList arrayList = this.f10552o;
        arrayList.remove(f2);
        if (arrayList.isEmpty()) {
            F[] fArr = this.f10549l;
            int i = 0;
            for (F f5 : fArr) {
                i += f5.e().f10776a;
            }
            C0170V[] c0170vArr = new C0170V[i];
            int i5 = 0;
            for (int i6 = 0; i6 < fArr.length; i6++) {
                q0 q0VarE = fArr[i6].e();
                int i7 = q0VarE.f10776a;
                int i8 = 0;
                while (i8 < i7) {
                    C0170V c0170vA = q0VarE.a(i8);
                    int i9 = c0170vA.f3261a;
                    C0190p[] c0190pArr = new C0190p[i9];
                    for (int i10 = 0; i10 < i9; i10++) {
                        C0190p c0190p = c0170vA.f3264d[i10];
                        C0189o c0189oA = c0190p.a();
                        StringBuilder sb = new StringBuilder();
                        sb.append(i6);
                        sb.append(":");
                        String str = c0190p.f3412a;
                        if (str == null) {
                            str = "";
                        }
                        sb.append(str);
                        c0189oA.f3376a = sb.toString();
                        c0190pArr[i10] = new C0190p(c0189oA);
                    }
                    C0170V c0170v = new C0170V(i6 + ":" + c0170vA.f3262b, c0190pArr);
                    this.f10553p.put(c0170v, c0170vA);
                    c0170vArr[i5] = c0170v;
                    i8++;
                    i5++;
                }
            }
            this.f10555r = new q0(c0170vArr);
            InterfaceC0959E interfaceC0959E = this.f10554q;
            interfaceC0959E.getClass();
            interfaceC0959E.a(this);
        }
    }

    @Override // x0.F
    public final long b(long j5, t0 t0Var) {
        F[] fArr = this.f10556s;
        return (fArr.length > 0 ? fArr[0] : this.f10549l[0]).b(j5, t0Var);
    }

    @Override // x0.h0
    public final boolean c() {
        return this.f10557t.c();
    }

    @Override // x0.g0
    public final void d(h0 h0Var) {
        InterfaceC0959E interfaceC0959E = this.f10554q;
        interfaceC0959E.getClass();
        interfaceC0959E.d(this);
    }

    @Override // x0.F
    public final q0 e() {
        q0 q0Var = this.f10555r;
        q0Var.getClass();
        return q0Var;
    }

    @Override // x0.F
    public final long f(A0.w[] wVarArr, boolean[] zArr, f0[] f0VarArr, boolean[] zArr2, long j5) {
        IdentityHashMap identityHashMap;
        ArrayList arrayList;
        int[] iArr = new int[wVarArr.length];
        int[] iArr2 = new int[wVarArr.length];
        int i = 0;
        int i5 = 0;
        while (true) {
            int length = wVarArr.length;
            identityHashMap = this.f10550m;
            if (i5 >= length) {
                break;
            }
            f0 f0Var = f0VarArr[i5];
            Integer num = f0Var == null ? null : (Integer) identityHashMap.get(f0Var);
            iArr[i5] = num == null ? -1 : num.intValue();
            A0.w wVar = wVarArr[i5];
            if (wVar != null) {
                String str = wVar.b().f3262b;
                iArr2[i5] = Integer.parseInt(str.substring(0, str.indexOf(":")));
            } else {
                iArr2[i5] = -1;
            }
            i5++;
        }
        identityHashMap.clear();
        int length2 = wVarArr.length;
        f0[] f0VarArr2 = new f0[length2];
        f0[] f0VarArr3 = new f0[wVarArr.length];
        A0.w[] wVarArr2 = new A0.w[wVarArr.length];
        F[] fArr = this.f10549l;
        ArrayList arrayList2 = new ArrayList(fArr.length);
        long j6 = j5;
        int i6 = 0;
        while (i6 < fArr.length) {
            int i7 = i;
            while (i7 < wVarArr.length) {
                f0VarArr3[i7] = iArr[i7] == i6 ? f0VarArr[i7] : null;
                if (iArr2[i7] == i6) {
                    A0.w wVar2 = wVarArr[i7];
                    wVar2.getClass();
                    arrayList = arrayList2;
                    C0170V c0170v = (C0170V) this.f10553p.get(wVar2.b());
                    c0170v.getClass();
                    wVarArr2[i7] = new O(wVar2, c0170v);
                } else {
                    arrayList = arrayList2;
                    wVarArr2[i7] = null;
                }
                i7++;
                arrayList2 = arrayList;
            }
            ArrayList arrayList3 = arrayList2;
            int i8 = i6;
            F[] fArr2 = fArr;
            A0.w[] wVarArr3 = wVarArr2;
            long jF = fArr[i6].f(wVarArr2, zArr, f0VarArr3, zArr2, j6);
            if (i8 == 0) {
                j6 = jF;
            } else if (jF != j6) {
                throw new IllegalStateException("Children enabled at different positions.");
            }
            boolean z4 = false;
            for (int i9 = 0; i9 < wVarArr.length; i9++) {
                if (iArr2[i9] == i8) {
                    f0 f0Var2 = f0VarArr3[i9];
                    f0Var2.getClass();
                    f0VarArr2[i9] = f0VarArr3[i9];
                    identityHashMap.put(f0Var2, Integer.valueOf(i8));
                    z4 = true;
                } else if (iArr[i9] == i8) {
                    AbstractC0360m.h(f0VarArr3[i9] == null);
                }
            }
            if (z4) {
                arrayList3.add(fArr2[i8]);
            }
            i6 = i8 + 1;
            arrayList2 = arrayList3;
            fArr = fArr2;
            wVarArr2 = wVarArr3;
            i = 0;
        }
        int i10 = i;
        ArrayList arrayList4 = arrayList2;
        System.arraycopy(f0VarArr2, i10, f0VarArr, i10, length2);
        this.f10556s = (F[]) arrayList4.toArray(new F[i10]);
        AbstractList abstractListW = m2.r.w(arrayList4, new s2.l(9));
        this.f10551n.getClass();
        this.f10557t = new C0972m(arrayList4, abstractListW);
        return j6;
    }

    @Override // x0.h0
    public final long h() {
        return this.f10557t.h();
    }

    @Override // x0.F
    public final void l() {
        for (F f2 : this.f10549l) {
            f2.l();
        }
    }

    @Override // x0.F
    public final long o(long j5) {
        long jO = this.f10556s[0].o(j5);
        int i = 1;
        while (true) {
            F[] fArr = this.f10556s;
            if (i >= fArr.length) {
                return jO;
            }
            if (fArr[i].o(jO) != jO) {
                throw new IllegalStateException("Unexpected child seekToUs result.");
            }
            i++;
        }
    }

    @Override // x0.F
    public final void p(long j5) {
        for (F f2 : this.f10556s) {
            f2.p(j5);
        }
    }

    @Override // x0.h0
    public final long r() {
        return this.f10557t.r();
    }

    @Override // x0.F
    public final long s() {
        long j5 = -9223372036854775807L;
        for (F f2 : this.f10556s) {
            long jS = f2.s();
            if (jS == -9223372036854775807L) {
                if (j5 != -9223372036854775807L && f2.o(j5) != j5) {
                    throw new IllegalStateException("Unexpected child seekToUs result.");
                }
            } else if (j5 == -9223372036854775807L) {
                for (F f5 : this.f10556s) {
                    if (f5 == f2) {
                        break;
                    }
                    if (f5.o(jS) != jS) {
                        throw new IllegalStateException("Unexpected child seekToUs result.");
                    }
                }
                j5 = jS;
            } else if (jS != j5) {
                throw new IllegalStateException("Conflicting discontinuities.");
            }
        }
        return j5;
    }

    @Override // x0.F
    public final void t(InterfaceC0959E interfaceC0959E, long j5) {
        this.f10554q = interfaceC0959E;
        ArrayList arrayList = this.f10552o;
        F[] fArr = this.f10549l;
        Collections.addAll(arrayList, fArr);
        for (F f2 : fArr) {
            f2.t(this, j5);
        }
    }

    @Override // x0.h0
    public final void u(long j5) {
        this.f10557t.u(j5);
    }

    @Override // x0.h0
    public final boolean v(h0.T t4) {
        ArrayList arrayList = this.f10552o;
        if (arrayList.isEmpty()) {
            return this.f10557t.v(t4);
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((F) arrayList.get(i)).v(t4);
        }
        return false;
    }
}

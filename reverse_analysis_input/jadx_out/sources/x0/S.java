package x0;

import a0.AbstractC0169U;
import a0.C0150A;
import a0.C0153D;
import a0.C0194t;
import a0.C0195u;
import a0.C0196v;
import a0.C0198x;
import d0.AbstractC0370w;
import f0.InterfaceC0403A;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import m2.C0640G;

/* JADX INFO: loaded from: classes.dex */
public final class S extends AbstractC0970k {

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public static final C0150A f10560D;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public int f10561A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public long[][] f10562B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public K3.b f10563C;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final J[] f10564v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final ArrayList f10565w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final AbstractC0169U[] f10566x;
    public final ArrayList y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final p1.b f10567z;

    static {
        F0.u uVar = new F0.u();
        C0640G c0640g = m2.I.f8549m;
        m2.b0 b0Var = m2.b0.f8583p;
        Collections.emptyList();
        m2.b0 b0Var2 = m2.b0.f8583p;
        C0195u c0195u = new C0195u();
        f10560D = new C0150A("MergingMediaSource", new C0194t(uVar), null, new C0196v(c0195u), C0153D.f3185B, C0198x.f3466a);
    }

    public S(J... jArr) {
        p1.b bVar = new p1.b(17);
        this.f10564v = jArr;
        this.f10567z = bVar;
        this.y = new ArrayList(Arrays.asList(jArr));
        this.f10561A = -1;
        this.f10565w = new ArrayList(jArr.length);
        for (int i = 0; i < jArr.length; i++) {
            this.f10565w.add(new ArrayList());
        }
        this.f10566x = new AbstractC0169U[jArr.length];
        this.f10562B = new long[0][];
        new HashMap();
        m2.r.e("expectedKeys", 8);
        new m2.V().a().x();
    }

    @Override // x0.J
    public final C0150A a() {
        J[] jArr = this.f10564v;
        return jArr.length > 0 ? jArr[0].a() : f10560D;
    }

    @Override // x0.J
    public final void b(C0150A c0150a) {
        this.f10564v[0].b(c0150a);
    }

    @Override // x0.J
    public final F c(H h2, B0.f fVar, long j5) {
        J[] jArr = this.f10564v;
        int length = jArr.length;
        F[] fArr = new F[length];
        AbstractC0169U[] abstractC0169UArr = this.f10566x;
        int iB = abstractC0169UArr[0].b(h2.f10531a);
        for (int i = 0; i < length; i++) {
            H hA = h2.a(abstractC0169UArr[i].l(iB));
            fArr[i] = jArr[i].c(hA, fVar, j5 - this.f10562B[iB][i]);
            ((List) this.f10565w.get(i)).add(new Q(hA, fArr[i]));
        }
        return new P(this.f10567z, this.f10562B[iB], fArr);
    }

    @Override // x0.J
    public final void d(F f2) {
        P p4 = (P) f2;
        int i = 0;
        while (true) {
            J[] jArr = this.f10564v;
            if (i >= jArr.length) {
                return;
            }
            List list = (List) this.f10565w.get(i);
            int i5 = 0;
            while (true) {
                if (i5 >= list.size()) {
                    break;
                }
                if (((Q) list.get(i5)).f10559b.equals(f2)) {
                    list.remove(i5);
                    break;
                }
                i5++;
            }
            J j5 = jArr[i];
            F f5 = p4.f10549l[i];
            if (f5 instanceof p0) {
                f5 = ((p0) f5).f10766l;
            }
            j5.d(f5);
            i++;
        }
    }

    @Override // x0.AbstractC0970k, x0.J
    public final void e() throws K3.b {
        K3.b bVar = this.f10563C;
        if (bVar != null) {
            throw bVar;
        }
        super.e();
    }

    @Override // x0.AbstractC0960a
    public final void p(InterfaceC0403A interfaceC0403A) {
        this.f10728u = interfaceC0403A;
        this.f10727t = AbstractC0370w.m(null);
        int i = 0;
        while (true) {
            J[] jArr = this.f10564v;
            if (i >= jArr.length) {
                return;
            }
            A(Integer.valueOf(i), jArr[i]);
            i++;
        }
    }

    @Override // x0.AbstractC0970k, x0.AbstractC0960a
    public final void t() {
        super.t();
        Arrays.fill(this.f10566x, (Object) null);
        this.f10561A = -1;
        this.f10563C = null;
        ArrayList arrayList = this.y;
        arrayList.clear();
        Collections.addAll(arrayList, this.f10564v);
    }

    @Override // x0.AbstractC0970k
    public final H w(Object obj, H h2) {
        ArrayList arrayList = this.f10565w;
        List list = (List) arrayList.get(((Integer) obj).intValue());
        for (int i = 0; i < list.size(); i++) {
            if (((Q) list.get(i)).f10558a.equals(h2)) {
                return ((Q) ((List) arrayList.get(0)).get(i)).f10558a;
            }
        }
        return null;
    }

    @Override // x0.AbstractC0970k
    public final void z(Object obj, AbstractC0960a abstractC0960a, AbstractC0169U abstractC0169U) {
        Integer num = (Integer) obj;
        if (this.f10563C != null) {
            return;
        }
        if (this.f10561A == -1) {
            this.f10561A = abstractC0169U.h();
        } else if (abstractC0169U.h() != this.f10561A) {
            this.f10563C = new K3.b();
            return;
        }
        int length = this.f10562B.length;
        AbstractC0169U[] abstractC0169UArr = this.f10566x;
        if (length == 0) {
            this.f10562B = (long[][]) Array.newInstance((Class<?>) Long.TYPE, this.f10561A, abstractC0169UArr.length);
        }
        ArrayList arrayList = this.y;
        arrayList.remove(abstractC0960a);
        abstractC0169UArr[num.intValue()] = abstractC0169U;
        if (arrayList.isEmpty()) {
            r(abstractC0169UArr[0]);
        }
    }
}

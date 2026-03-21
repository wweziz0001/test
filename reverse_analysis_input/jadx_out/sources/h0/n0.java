package h0;

import a0.AbstractC0169U;
import d0.AbstractC0370w;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class n0 extends AbstractC0450a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f6239e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f6240f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int[] f6241g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int[] f6242h;
    public final AbstractC0169U[] i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Object[] f6243j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final HashMap f6244k;

    public n0(AbstractC0169U[] abstractC0169UArr, Object[] objArr, x0.j0 j0Var) {
        super(j0Var);
        int length = abstractC0169UArr.length;
        this.i = abstractC0169UArr;
        this.f6241g = new int[length];
        this.f6242h = new int[length];
        this.f6243j = objArr;
        this.f6244k = new HashMap();
        int length2 = abstractC0169UArr.length;
        int i = 0;
        int iO = 0;
        int iH = 0;
        int i5 = 0;
        while (i < length2) {
            AbstractC0169U abstractC0169U = abstractC0169UArr[i];
            this.i[i5] = abstractC0169U;
            this.f6242h[i5] = iO;
            this.f6241g[i5] = iH;
            iO += abstractC0169U.o();
            iH += this.i[i5].h();
            this.f6244k.put(objArr[i5], Integer.valueOf(i5));
            i++;
            i5++;
        }
        this.f6239e = iO;
        this.f6240f = iH;
    }

    @Override // a0.AbstractC0169U
    public final int h() {
        return this.f6240f;
    }

    @Override // a0.AbstractC0169U
    public final int o() {
        return this.f6239e;
    }

    @Override // h0.AbstractC0450a
    public final int q(Object obj) {
        Integer num = (Integer) this.f6244k.get(obj);
        if (num == null) {
            return -1;
        }
        return num.intValue();
    }

    @Override // h0.AbstractC0450a
    public final int r(int i) {
        return AbstractC0370w.d(this.f6241g, i + 1, false, false);
    }

    @Override // h0.AbstractC0450a
    public final int s(int i) {
        return AbstractC0370w.d(this.f6242h, i + 1, false, false);
    }

    @Override // h0.AbstractC0450a
    public final Object t(int i) {
        return this.f6243j[i];
    }

    @Override // h0.AbstractC0450a
    public final int u(int i) {
        return this.f6241g[i];
    }

    @Override // h0.AbstractC0450a
    public final int v(int i) {
        return this.f6242h[i];
    }

    @Override // h0.AbstractC0450a
    public final AbstractC0169U y(int i) {
        return this.i[i];
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public n0(ArrayList arrayList, x0.j0 j0Var) {
        AbstractC0169U[] abstractC0169UArr = new AbstractC0169U[arrayList.size()];
        Iterator it = arrayList.iterator();
        int i = 0;
        int i5 = 0;
        while (it.hasNext()) {
            abstractC0169UArr[i5] = ((Y) it.next()).b();
            i5++;
        }
        Object[] objArr = new Object[arrayList.size()];
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            objArr[i] = ((Y) it2.next()).a();
            i++;
        }
        this(abstractC0169UArr, objArr, j0Var);
    }
}

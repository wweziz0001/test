package x0;

import a0.AbstractC0169U;
import d0.AbstractC0370w;
import h0.AbstractC0450a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: renamed from: x0.n, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0973n extends AbstractC0450a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f10744e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f10745f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int[] f10746g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int[] f10747h;
    public final AbstractC0169U[] i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Object[] f10748j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final HashMap f10749k;

    public C0973n(ArrayList arrayList, j0 j0Var) {
        super(j0Var);
        int size = arrayList.size();
        this.f10746g = new int[size];
        this.f10747h = new int[size];
        this.i = new AbstractC0169U[size];
        this.f10748j = new Object[size];
        this.f10749k = new HashMap();
        Iterator it = arrayList.iterator();
        int iO = 0;
        int iH = 0;
        int i = 0;
        while (it.hasNext()) {
            C0976q c0976q = (C0976q) it.next();
            AbstractC0169U[] abstractC0169UArr = this.i;
            C0956B c0956b = c0976q.f10769a.f10530z;
            abstractC0169UArr[i] = c0956b;
            this.f10747h[i] = iO;
            this.f10746g[i] = iH;
            iO += c0956b.f10811b.o();
            iH += this.i[i].h();
            Object[] objArr = this.f10748j;
            Object obj = c0976q.f10770b;
            objArr[i] = obj;
            this.f10749k.put(obj, Integer.valueOf(i));
            i++;
        }
        this.f10744e = iO;
        this.f10745f = iH;
    }

    @Override // a0.AbstractC0169U
    public final int h() {
        return this.f10745f;
    }

    @Override // a0.AbstractC0169U
    public final int o() {
        return this.f10744e;
    }

    @Override // h0.AbstractC0450a
    public final int q(Object obj) {
        Integer num = (Integer) this.f10749k.get(obj);
        if (num == null) {
            return -1;
        }
        return num.intValue();
    }

    @Override // h0.AbstractC0450a
    public final int r(int i) {
        return AbstractC0370w.d(this.f10746g, i + 1, false, false);
    }

    @Override // h0.AbstractC0450a
    public final int s(int i) {
        return AbstractC0370w.d(this.f10747h, i + 1, false, false);
    }

    @Override // h0.AbstractC0450a
    public final Object t(int i) {
        return this.f10748j[i];
    }

    @Override // h0.AbstractC0450a
    public final int u(int i) {
        return this.f10746g[i];
    }

    @Override // h0.AbstractC0450a
    public final int v(int i) {
        return this.f10747h[i];
    }

    @Override // h0.AbstractC0450a
    public final AbstractC0169U y(int i) {
        return this.i[i];
    }
}

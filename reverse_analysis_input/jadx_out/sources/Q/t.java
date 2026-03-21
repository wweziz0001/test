package Q;

import android.util.SparseArray;

/* JADX INFO: loaded from: classes.dex */
public final class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SparseArray f1753a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public p f1754b;

    public t(int i) {
        this.f1753a = new SparseArray(i);
    }

    public final void a(p pVar, int i, int i5) {
        int iA = pVar.a(i);
        SparseArray sparseArray = this.f1753a;
        t tVar = sparseArray == null ? null : (t) sparseArray.get(iA);
        if (tVar == null) {
            tVar = new t(1);
            sparseArray.put(pVar.a(i), tVar);
        }
        if (i5 > i) {
            tVar.a(pVar, i + 1, i5);
        } else {
            tVar.f1754b = pVar;
        }
    }
}

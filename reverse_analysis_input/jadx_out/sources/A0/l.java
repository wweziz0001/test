package A0;

import a0.C0173Y;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class l extends C0173Y {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f102r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f103s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f104t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f105u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f106v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f107w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f108x;
    public final SparseArray y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final SparseBooleanArray f109z;

    /* JADX WARN: Removed duplicated region for block: B:46:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00f5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public l(android.content.Context r9) {
        /*
            Method dump skipped, instruction units count: 273
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: A0.l.<init>(android.content.Context):void");
    }

    @Override // a0.C0173Y
    public final C0173Y b(int i, int i5) {
        super.b(i, i5);
        return this;
    }

    public final void c() {
        this.f102r = true;
        this.f103s = true;
        this.f104t = true;
        this.f105u = true;
        this.f106v = true;
        this.f107w = true;
        this.f108x = true;
    }

    public l(m mVar) {
        a(mVar);
        this.f102r = mVar.f111r;
        this.f103s = mVar.f112s;
        this.f104t = mVar.f113t;
        this.f105u = mVar.f114u;
        this.f106v = mVar.f115v;
        this.f107w = mVar.f116w;
        this.f108x = mVar.f117x;
        SparseArray sparseArray = new SparseArray();
        int i = 0;
        while (true) {
            SparseArray sparseArray2 = mVar.y;
            if (i < sparseArray2.size()) {
                sparseArray.put(sparseArray2.keyAt(i), new HashMap((Map) sparseArray2.valueAt(i)));
                i++;
            } else {
                this.y = sparseArray;
                this.f109z = mVar.f118z.clone();
                return;
            }
        }
    }

    public l() {
        this.y = new SparseArray();
        this.f109z = new SparseBooleanArray();
        c();
    }
}

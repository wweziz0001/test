package A0;

import a0.C0174Z;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import b3.AbstractC0307a;
import d0.AbstractC0370w;
import java.util.Map;
import java.util.Objects;
import x0.q0;

/* JADX INFO: loaded from: classes.dex */
public final class m extends C0174Z {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public static final /* synthetic */ int f110A = 0;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final boolean f111r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final boolean f112s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final boolean f113t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final boolean f114u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final boolean f115v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final boolean f116w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final boolean f117x;
    public final SparseArray y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final SparseBooleanArray f118z;

    static {
        new m(new l());
        AbstractC0370w.G(1000);
        AbstractC0370w.G(1001);
        AbstractC0370w.G(1002);
        AbstractC0370w.G(1003);
        AbstractC0307a.n(1004, 1005, 1006, 1007, 1008);
        AbstractC0307a.n(1009, 1010, 1011, 1012, 1013);
        AbstractC0307a.n(1014, 1015, 1016, 1017, 1018);
    }

    public m(l lVar) {
        super(lVar);
        this.f111r = lVar.f102r;
        this.f112s = lVar.f103s;
        this.f113t = lVar.f104t;
        this.f114u = lVar.f105u;
        this.f115v = lVar.f106v;
        this.f116w = lVar.f107w;
        this.f117x = lVar.f108x;
        this.y = lVar.y;
        this.f118z = lVar.f109z;
    }

    @Override // a0.C0174Z
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || m.class != obj.getClass()) {
            return false;
        }
        m mVar = (m) obj;
        if (super.equals(mVar) && this.f111r == mVar.f111r && this.f112s == mVar.f112s && this.f113t == mVar.f113t && this.f114u == mVar.f114u && this.f115v == mVar.f115v && this.f116w == mVar.f116w && this.f117x == mVar.f117x) {
            SparseBooleanArray sparseBooleanArray = this.f118z;
            int size = sparseBooleanArray.size();
            SparseBooleanArray sparseBooleanArray2 = mVar.f118z;
            if (sparseBooleanArray2.size() == size) {
                int i = 0;
                while (true) {
                    if (i >= size) {
                        SparseArray sparseArray = this.y;
                        int size2 = sparseArray.size();
                        SparseArray sparseArray2 = mVar.y;
                        if (sparseArray2.size() == size2) {
                            for (int i5 = 0; i5 < size2; i5++) {
                                int iIndexOfKey = sparseArray2.indexOfKey(sparseArray.keyAt(i5));
                                if (iIndexOfKey >= 0) {
                                    Map map = (Map) sparseArray.valueAt(i5);
                                    Map map2 = (Map) sparseArray2.valueAt(iIndexOfKey);
                                    if (map2.size() == map.size()) {
                                        for (Map.Entry entry : map.entrySet()) {
                                            q0 q0Var = (q0) entry.getKey();
                                            if (map2.containsKey(q0Var)) {
                                                Object value = entry.getValue();
                                                Object obj2 = map2.get(q0Var);
                                                int i6 = AbstractC0370w.f5326a;
                                                if (!Objects.equals(value, obj2)) {
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            return true;
                        }
                    } else {
                        if (sparseBooleanArray2.indexOfKey(sparseBooleanArray.keyAt(i)) < 0) {
                            break;
                        }
                        i++;
                    }
                }
            }
        }
        return false;
    }

    @Override // a0.C0174Z
    public final int hashCode() {
        return (((((((((((((((super.hashCode() + 31) * 31) + (this.f111r ? 1 : 0)) * 961) + (this.f112s ? 1 : 0)) * 961) + (this.f113t ? 1 : 0)) * 28629151) + (this.f114u ? 1 : 0)) * 31) + (this.f115v ? 1 : 0)) * 31) + (this.f116w ? 1 : 0)) * 961) + (this.f117x ? 1 : 0)) * 31;
    }
}

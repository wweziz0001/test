package Q;

import android.util.SparseArray;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f1735a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t f1736b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public t f1737c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public t f1738d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f1739e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f1740f;

    public q(t tVar) {
        this.f1736b = tVar;
        this.f1737c = tVar;
    }

    public final int a(int i) {
        SparseArray sparseArray = this.f1737c.f1753a;
        t tVar = sparseArray == null ? null : (t) sparseArray.get(i);
        int i5 = 1;
        int i6 = 2;
        if (this.f1735a == 2) {
            if (tVar != null) {
                this.f1737c = tVar;
                this.f1740f++;
            } else if (i == 65038) {
                b();
            } else if (i != 65039) {
                t tVar2 = this.f1737c;
                if (tVar2.f1754b != null) {
                    i6 = 3;
                    if (this.f1740f != 1) {
                        this.f1738d = tVar2;
                        b();
                    } else if (c()) {
                        this.f1738d = this.f1737c;
                        b();
                    } else {
                        b();
                    }
                } else {
                    b();
                }
            }
            i5 = i6;
        } else if (tVar == null) {
            b();
        } else {
            this.f1735a = 2;
            this.f1737c = tVar;
            this.f1740f = 1;
            i5 = i6;
        }
        this.f1739e = i;
        return i5;
    }

    public final void b() {
        this.f1735a = 1;
        this.f1737c = this.f1736b;
        this.f1740f = 0;
    }

    public final boolean c() {
        R.a aVarC = this.f1737c.f1754b.c();
        int iA = aVarC.a(6);
        return !(iA == 0 || ((ByteBuffer) aVarC.f376o).get(iA + aVarC.f373l) == 0) || this.f1739e == 65039;
    }
}

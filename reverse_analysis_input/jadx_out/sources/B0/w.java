package B0;

import java.util.ArrayList;
import java.util.Collections;

/* JADX INFO: loaded from: classes.dex */
public final class w {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final A.c f254h = new A.c(9);
    public static final A.c i = new A.c(10);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f255a;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f259e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f260f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f261g;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final v[] f257c = new v[5];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f256b = new ArrayList();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f258d = -1;

    public w(int i5) {
        this.f255a = i5;
    }

    public final void a(float f2, int i5) {
        v vVar;
        int i6 = this.f258d;
        ArrayList arrayList = this.f256b;
        if (i6 != 1) {
            Collections.sort(arrayList, f254h);
            this.f258d = 1;
        }
        int i7 = this.f261g;
        v[] vVarArr = this.f257c;
        if (i7 > 0) {
            int i8 = i7 - 1;
            this.f261g = i8;
            vVar = vVarArr[i8];
        } else {
            vVar = new v();
        }
        int i9 = this.f259e;
        this.f259e = i9 + 1;
        vVar.f251a = i9;
        vVar.f252b = i5;
        vVar.f253c = f2;
        arrayList.add(vVar);
        this.f260f += i5;
        while (true) {
            int i10 = this.f260f;
            int i11 = this.f255a;
            if (i10 <= i11) {
                return;
            }
            int i12 = i10 - i11;
            v vVar2 = (v) arrayList.get(0);
            int i13 = vVar2.f252b;
            if (i13 <= i12) {
                this.f260f -= i13;
                arrayList.remove(0);
                int i14 = this.f261g;
                if (i14 < 5) {
                    this.f261g = i14 + 1;
                    vVarArr[i14] = vVar2;
                }
            } else {
                vVar2.f252b = i13 - i12;
                this.f260f -= i12;
            }
        }
    }

    public final float b() {
        int i5 = this.f258d;
        ArrayList arrayList = this.f256b;
        if (i5 != 0) {
            Collections.sort(arrayList, i);
            this.f258d = 0;
        }
        float f2 = 0.5f * this.f260f;
        int i6 = 0;
        for (int i7 = 0; i7 < arrayList.size(); i7++) {
            v vVar = (v) arrayList.get(i7);
            i6 += vVar.f252b;
            if (i6 >= f2) {
                return vVar.f253c;
            }
        }
        if (arrayList.isEmpty()) {
            return Float.NaN;
        }
        return ((v) arrayList.get(arrayList.size() - 1)).f253c;
    }
}

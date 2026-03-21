package e0;

import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class b extends d {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final long f5489n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final ArrayList f5490o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final ArrayList f5491p;

    public b(long j5, int i) {
        super(i);
        this.f5489n = j5;
        this.f5490o = new ArrayList();
        this.f5491p = new ArrayList();
    }

    public final b f(int i) {
        ArrayList arrayList = this.f5491p;
        int size = arrayList.size();
        for (int i5 = 0; i5 < size; i5++) {
            b bVar = (b) arrayList.get(i5);
            if (bVar.f5494m == i) {
                return bVar;
            }
        }
        return null;
    }

    public final c i(int i) {
        ArrayList arrayList = this.f5490o;
        int size = arrayList.size();
        for (int i5 = 0; i5 < size; i5++) {
            c cVar = (c) arrayList.get(i5);
            if (cVar.f5494m == i) {
                return cVar;
            }
        }
        return null;
    }

    @Override // e0.d
    public final String toString() {
        return d.c(this.f5494m) + " leaves: " + Arrays.toString(this.f5490o.toArray()) + " containers: " + Arrays.toString(this.f5491p.toArray());
    }
}

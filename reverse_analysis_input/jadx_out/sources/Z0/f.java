package Z0;

import a0.C0190p;
import android.util.SparseArray;
import d0.AbstractC0360m;
import d0.AbstractC0370w;
import d0.C0363p;

/* JADX INFO: loaded from: classes.dex */
public final class f implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f2839a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f2840b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f2841c;

    public f(int i, int i5, SparseArray sparseArray) {
        this.f2839a = i;
        this.f2840b = i5;
        this.f2841c = sparseArray;
    }

    @Override // Z0.c
    public int a() {
        return this.f2839a;
    }

    @Override // Z0.c
    public int b() {
        return this.f2840b;
    }

    @Override // Z0.c
    public int c() {
        int i = this.f2839a;
        return i == -1 ? ((C0363p) this.f2841c).z() : i;
    }

    public f(e0.c cVar, C0190p c0190p) {
        C0363p c0363p = cVar.f5492n;
        this.f2841c = c0363p;
        c0363p.H(12);
        int iZ = c0363p.z();
        if ("audio/raw".equals(c0190p.f3424n)) {
            int iA = AbstractC0370w.A(c0190p.f3404E, c0190p.f3402C);
            if (iZ == 0 || iZ % iA != 0) {
                AbstractC0360m.y("BoxParsers", "Audio sample size mismatch. stsd sample size: " + iA + ", stsz sample size: " + iZ);
                iZ = iA;
            }
        }
        this.f2839a = iZ == 0 ? -1 : iZ;
        this.f2840b = c0363p.z();
    }
}

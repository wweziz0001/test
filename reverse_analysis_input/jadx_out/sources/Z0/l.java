package Z0;

import F0.K;
import d0.AbstractC0370w;
import d0.C0363p;

/* JADX INFO: loaded from: classes.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final K f2857a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public w f2860d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public i f2861e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f2862f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f2863g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f2864h;
    public int i;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f2867l;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final v f2858b = new v();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C0363p f2859c = new C0363p();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final C0363p f2865j = new C0363p(1);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final C0363p f2866k = new C0363p();

    public l(K k4, w wVar, i iVar) {
        this.f2857a = k4;
        this.f2860d = wVar;
        this.f2861e = iVar;
        this.f2860d = wVar;
        this.f2861e = iVar;
        k4.c(wVar.f2983a.f2957g);
        e();
    }

    public final int a() {
        int i = !this.f2867l ? this.f2860d.f2989g[this.f2862f] : this.f2858b.f2975j[this.f2862f] ? 1 : 0;
        return b() != null ? i | 1073741824 : i;
    }

    public final u b() {
        if (!this.f2867l) {
            return null;
        }
        v vVar = this.f2858b;
        i iVar = vVar.f2967a;
        int i = AbstractC0370w.f5326a;
        int i5 = iVar.f2849a;
        u uVar = vVar.f2978m;
        if (uVar == null) {
            u[] uVarArr = this.f2860d.f2983a.f2961l;
            uVar = uVarArr == null ? null : uVarArr[i5];
        }
        if (uVar == null || !uVar.f2962a) {
            return null;
        }
        return uVar;
    }

    public final boolean c() {
        this.f2862f++;
        if (!this.f2867l) {
            return false;
        }
        int i = this.f2863g + 1;
        this.f2863g = i;
        int[] iArr = this.f2858b.f2973g;
        int i5 = this.f2864h;
        if (i != iArr[i5]) {
            return true;
        }
        this.f2864h = i5 + 1;
        this.f2863g = 0;
        return false;
    }

    public final int d(int i, int i5) {
        C0363p c0363p;
        u uVarB = b();
        if (uVarB == null) {
            return 0;
        }
        v vVar = this.f2858b;
        int length = uVarB.f2965d;
        if (length != 0) {
            c0363p = vVar.f2979n;
        } else {
            int i6 = AbstractC0370w.f5326a;
            byte[] bArr = uVarB.f2966e;
            int length2 = bArr.length;
            C0363p c0363p2 = this.f2866k;
            c0363p2.F(length2, bArr);
            length = bArr.length;
            c0363p = c0363p2;
        }
        boolean z4 = vVar.f2976k && vVar.f2977l[this.f2862f];
        boolean z5 = z4 || i5 != 0;
        C0363p c0363p3 = this.f2865j;
        c0363p3.f5313a[0] = (byte) ((z5 ? 128 : 0) | length);
        c0363p3.H(0);
        K k4 = this.f2857a;
        k4.a(c0363p3, 1, 1);
        k4.a(c0363p, length, 1);
        if (!z5) {
            return length + 1;
        }
        C0363p c0363p4 = this.f2859c;
        if (!z4) {
            c0363p4.E(8);
            byte[] bArr2 = c0363p4.f5313a;
            bArr2[0] = 0;
            bArr2[1] = 1;
            bArr2[2] = (byte) 0;
            bArr2[3] = (byte) (i5 & 255);
            bArr2[4] = (byte) ((i >> 24) & 255);
            bArr2[5] = (byte) ((i >> 16) & 255);
            bArr2[6] = (byte) ((i >> 8) & 255);
            bArr2[7] = (byte) (i & 255);
            k4.a(c0363p4, 8, 1);
            return length + 9;
        }
        C0363p c0363p5 = vVar.f2979n;
        int iB = c0363p5.B();
        c0363p5.I(-2);
        int i7 = (iB * 6) + 2;
        if (i5 != 0) {
            c0363p4.E(i7);
            byte[] bArr3 = c0363p4.f5313a;
            c0363p5.g(bArr3, 0, i7);
            int i8 = (((bArr3[2] & 255) << 8) | (bArr3[3] & 255)) + i5;
            bArr3[2] = (byte) ((i8 >> 8) & 255);
            bArr3[3] = (byte) (i8 & 255);
        } else {
            c0363p4 = c0363p5;
        }
        k4.a(c0363p4, i7, 1);
        return length + 1 + i7;
    }

    public final void e() {
        v vVar = this.f2858b;
        vVar.f2970d = 0;
        vVar.f2981p = 0L;
        vVar.f2982q = false;
        vVar.f2976k = false;
        vVar.f2980o = false;
        vVar.f2978m = null;
        this.f2862f = 0;
        this.f2864h = 0;
        this.f2863g = 0;
        this.i = 0;
        this.f2867l = false;
    }
}

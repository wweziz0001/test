package F0;

import d0.AbstractC0360m;

/* JADX INFO: loaded from: classes.dex */
public final class L {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f703a = new byte[10];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f704b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f705c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f706d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f707e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f708f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f709g;

    public final void a(K k4, J j5) {
        if (this.f705c > 0) {
            k4.b(this.f706d, this.f707e, this.f708f, this.f709g, j5);
            this.f705c = 0;
        }
    }

    public final void b(K k4, long j5, int i, int i5, int i6, J j6) {
        AbstractC0360m.g("TrueHD chunk samples must be contiguous in the sample queue.", this.f709g <= i5 + i6);
        if (this.f704b) {
            int i7 = this.f705c;
            int i8 = i7 + 1;
            this.f705c = i8;
            if (i7 == 0) {
                this.f706d = j5;
                this.f707e = i;
                this.f708f = 0;
            }
            this.f708f += i5;
            this.f709g = i6;
            if (i8 >= 16) {
                a(k4, j6);
            }
        }
    }

    public final void c(r rVar) {
        if (this.f704b) {
            return;
        }
        byte[] bArr = this.f703a;
        int i = 0;
        rVar.z(bArr, 0, 10);
        rVar.e();
        if (bArr[4] == -8 && bArr[5] == 114 && bArr[6] == 111) {
            byte b4 = bArr[7];
            if ((b4 & 254) == 186) {
                i = 40 << ((bArr[(b4 & 255) == 187 ? '\t' : '\b'] >> 4) & 7);
            }
        }
        if (i == 0) {
            return;
        }
        this.f704b = true;
    }
}

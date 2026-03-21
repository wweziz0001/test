package g4;

/* JADX INFO: loaded from: classes.dex */
public final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f5866a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f5867b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f5868c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f5869d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f5870e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public q f5871f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public q f5872g;

    public q() {
        this.f5866a = new byte[8192];
        this.f5870e = true;
        this.f5869d = false;
    }

    public final q a() {
        q qVar = this.f5871f;
        if (qVar == this) {
            qVar = null;
        }
        q qVar2 = this.f5872g;
        N3.h.b(qVar2);
        qVar2.f5871f = this.f5871f;
        q qVar3 = this.f5871f;
        N3.h.b(qVar3);
        qVar3.f5872g = this.f5872g;
        this.f5871f = null;
        this.f5872g = null;
        return qVar;
    }

    public final void b(q qVar) {
        N3.h.e(qVar, "segment");
        qVar.f5872g = this;
        qVar.f5871f = this.f5871f;
        q qVar2 = this.f5871f;
        N3.h.b(qVar2);
        qVar2.f5872g = qVar;
        this.f5871f = qVar;
    }

    public final q c() {
        this.f5869d = true;
        return new q(this.f5866a, this.f5867b, this.f5868c, true);
    }

    public final void d(q qVar, int i) {
        N3.h.e(qVar, "sink");
        if (!qVar.f5870e) {
            throw new IllegalStateException("only owner can write");
        }
        int i5 = qVar.f5868c;
        int i6 = i5 + i;
        byte[] bArr = qVar.f5866a;
        if (i6 > 8192) {
            if (qVar.f5869d) {
                throw new IllegalArgumentException();
            }
            int i7 = qVar.f5867b;
            if (i6 - i7 > 8192) {
                throw new IllegalArgumentException();
            }
            C3.e.T(0, i7, i5, bArr, bArr);
            qVar.f5868c -= qVar.f5867b;
            qVar.f5867b = 0;
        }
        int i8 = qVar.f5868c;
        int i9 = this.f5867b;
        C3.e.T(i8, i9, i9 + i, this.f5866a, bArr);
        qVar.f5868c += i;
        this.f5867b += i;
    }

    public q(byte[] bArr, int i, int i5, boolean z4) {
        N3.h.e(bArr, "data");
        this.f5866a = bArr;
        this.f5867b = i;
        this.f5868c = i5;
        this.f5869d = z4;
        this.f5870e = false;
    }
}

package n0;

import F0.J;
import F0.K;
import a0.AbstractC0156G;
import a0.C0189o;
import a0.C0190p;
import a0.InterfaceC0182h;
import b3.AbstractC0307a;
import d0.AbstractC0360m;
import d0.C0363p;
import java.io.EOFException;
import java.util.Arrays;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class o implements K {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final C0190p f8853f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final C0190p f8854g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final K f8855a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C0190p f8856b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public C0190p f8857c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public byte[] f8858d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f8859e;

    static {
        C0189o c0189o = new C0189o();
        c0189o.f3387m = AbstractC0156G.m("application/id3");
        f8853f = new C0190p(c0189o);
        C0189o c0189o2 = new C0189o();
        c0189o2.f3387m = AbstractC0156G.m("application/x-emsg");
        f8854g = new C0190p(c0189o2);
    }

    public o(K k4, int i) {
        this.f8855a = k4;
        if (i == 1) {
            this.f8856b = f8853f;
        } else {
            if (i != 3) {
                throw new IllegalArgumentException(AbstractC0307a.i("Unknown metadataType: ", i));
            }
            this.f8856b = f8854g;
        }
        this.f8858d = new byte[0];
        this.f8859e = 0;
    }

    @Override // F0.K
    public final void a(C0363p c0363p, int i, int i5) {
        int i6 = this.f8859e + i;
        byte[] bArr = this.f8858d;
        if (bArr.length < i6) {
            this.f8858d = Arrays.copyOf(bArr, (i6 / 2) + i6);
        }
        c0363p.g(this.f8858d, this.f8859e, i);
        this.f8859e += i;
    }

    @Override // F0.K
    public final void b(long j5, int i, int i5, int i6, J j6) {
        this.f8857c.getClass();
        int i7 = this.f8859e - i6;
        C0363p c0363p = new C0363p(Arrays.copyOfRange(this.f8858d, i7 - i5, i7));
        byte[] bArr = this.f8858d;
        System.arraycopy(bArr, i7, bArr, 0, i6);
        this.f8859e = i6;
        String str = this.f8857c.f3424n;
        C0190p c0190p = this.f8856b;
        if (!Objects.equals(str, c0190p.f3424n)) {
            if (!"application/x-emsg".equals(this.f8857c.f3424n)) {
                AbstractC0360m.y("HlsSampleStreamWrapper", "Ignoring sample for unsupported format: " + this.f8857c.f3424n);
                return;
            }
            Q0.a aVarE0 = P0.b.E0(c0363p);
            C0190p c0190pC = aVarE0.c();
            String str2 = c0190p.f3424n;
            if (c0190pC == null || !Objects.equals(str2, c0190pC.f3424n)) {
                AbstractC0360m.y("HlsSampleStreamWrapper", "Ignoring EMSG. Expected it to contain wrapped " + str2 + " but actual wrapped format: " + aVarE0.c());
                return;
            }
            byte[] bArrA = aVarE0.a();
            bArrA.getClass();
            c0363p = new C0363p(bArrA);
        }
        int iA = c0363p.a();
        K k4 = this.f8855a;
        k4.a(c0363p, iA, 0);
        k4.b(j5, i, iA, 0, j6);
    }

    @Override // F0.K
    public final void c(C0190p c0190p) {
        this.f8857c = c0190p;
        this.f8855a.c(this.f8856b);
    }

    @Override // F0.K
    public final int d(InterfaceC0182h interfaceC0182h, int i, boolean z4) throws EOFException {
        int i5 = this.f8859e + i;
        byte[] bArr = this.f8858d;
        if (bArr.length < i5) {
            this.f8858d = Arrays.copyOf(bArr, (i5 / 2) + i5);
        }
        int i6 = interfaceC0182h.read(this.f8858d, this.f8859e, i);
        if (i6 != -1) {
            this.f8859e += i6;
            return i6;
        }
        if (z4) {
            return -1;
        }
        throw new EOFException();
    }
}

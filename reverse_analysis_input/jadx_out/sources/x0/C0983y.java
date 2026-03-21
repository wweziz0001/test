package x0;

import android.net.Uri;
import d0.AbstractC0360m;
import d0.C0363p;
import f0.C0417l;
import f0.InterfaceC0403A;
import f0.InterfaceC0413h;
import java.util.Map;

/* JADX INFO: renamed from: x0.y, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0983y implements InterfaceC0413h {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final InterfaceC0413h f10812l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final int f10813m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final V f10814n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final byte[] f10815o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f10816p;

    public C0983y(InterfaceC0413h interfaceC0413h, int i, V v4) {
        AbstractC0360m.c(i > 0);
        this.f10812l = interfaceC0413h;
        this.f10813m = i;
        this.f10814n = v4;
        this.f10815o = new byte[1];
        this.f10816p = i;
    }

    @Override // f0.InterfaceC0413h
    public final void b(InterfaceC0403A interfaceC0403A) {
        interfaceC0403A.getClass();
        this.f10812l.b(interfaceC0403A);
    }

    @Override // f0.InterfaceC0413h
    public final void close() {
        throw new UnsupportedOperationException();
    }

    @Override // f0.InterfaceC0413h
    public final long p(C0417l c0417l) {
        throw new UnsupportedOperationException();
    }

    @Override // f0.InterfaceC0413h
    public final Uri r() {
        return this.f10812l.r();
    }

    @Override // a0.InterfaceC0182h
    public final int read(byte[] bArr, int i, int i5) {
        int i6 = this.f10816p;
        InterfaceC0413h interfaceC0413h = this.f10812l;
        if (i6 == 0) {
            byte[] bArr2 = this.f10815o;
            if (interfaceC0413h.read(bArr2, 0, 1) != -1) {
                int i7 = (bArr2[0] & 255) << 4;
                if (i7 != 0) {
                    byte[] bArr3 = new byte[i7];
                    int i8 = i7;
                    int i9 = 0;
                    while (i8 > 0) {
                        int i10 = interfaceC0413h.read(bArr3, i9, i8);
                        if (i10 != -1) {
                            i9 += i10;
                            i8 -= i10;
                        }
                    }
                    while (i7 > 0 && bArr3[i7 - 1] == 0) {
                        i7--;
                    }
                    if (i7 > 0) {
                        C0363p c0363p = new C0363p(i7, bArr3);
                        V v4 = this.f10814n;
                        long jMax = !v4.f10583x ? v4.f10580u : Math.max(v4.y.x(true), v4.f10580u);
                        int iA = c0363p.a();
                        F0.K k4 = v4.f10582w;
                        k4.getClass();
                        k4.a(c0363p, iA, 0);
                        k4.b(jMax, 1, iA, 0, null);
                        v4.f10583x = true;
                    }
                }
                this.f10816p = this.f10813m;
            }
            return -1;
        }
        int i11 = interfaceC0413h.read(bArr, i, Math.min(this.f10816p, i5));
        if (i11 != -1) {
            this.f10816p -= i11;
        }
        return i11;
    }

    @Override // f0.InterfaceC0413h
    public final Map y() {
        return this.f10812l.y();
    }
}

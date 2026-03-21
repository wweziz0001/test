package F0;

import a0.C0155F;
import c0.C0316a;
import c0.C0317b;
import c1.C0318a;
import d0.AbstractC0360m;
import d0.AbstractC0370w;
import d0.C0363p;
import d0.InterfaceC0351d;
import java.io.EOFException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.regex.Pattern;
import k1.AbstractC0538h;
import k1.C0537g;

/* JADX INFO: loaded from: classes.dex */
public final class A implements c1.l {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final C0363p f676l;

    public A(int i) {
        switch (i) {
            case 1:
                this.f676l = new C0363p();
                break;
            default:
                this.f676l = new C0363p(10);
                break;
        }
    }

    public C0155F a(C0066m c0066m, B0.l lVar) {
        C0363p c0363p = this.f676l;
        C0155F c0155fE0 = null;
        int i = 0;
        while (true) {
            try {
                c0066m.t(c0363p.f5313a, 0, 10, false);
                c0363p.H(0);
                if (c0363p.y() != 4801587) {
                    break;
                }
                c0363p.I(3);
                int iU = c0363p.u();
                int i5 = iU + 10;
                if (c0155fE0 == null) {
                    byte[] bArr = new byte[i5];
                    System.arraycopy(c0363p.f5313a, 0, bArr, 0, 10);
                    c0066m.t(bArr, 10, iU, false);
                    c0155fE0 = new T0.h(lVar).E0(i5, bArr);
                } else {
                    c0066m.a(iU, false);
                }
                i += i5;
            } catch (EOFException unused) {
            }
        }
        c0066m.f801q = 0;
        c0066m.a(i, false);
        return c0155fE0;
    }

    @Override // c1.l
    public int o() {
        return 2;
    }

    @Override // c1.l
    public void x(byte[] bArr, int i, int i5, c1.k kVar, InterfaceC0351d interfaceC0351d) {
        C0317b c0317bA;
        C0363p c0363p = this.f676l;
        c0363p.F(i + i5, bArr);
        c0363p.H(i);
        ArrayList arrayList = new ArrayList();
        while (c0363p.a() > 0) {
            AbstractC0360m.b("Incomplete Mp4Webvtt Top Level box header found.", c0363p.a() >= 8);
            int i6 = c0363p.i();
            if (c0363p.i() == 1987343459) {
                int i7 = i6 - 8;
                CharSequence charSequenceF = null;
                C0316a c0316aA = null;
                while (i7 > 0) {
                    AbstractC0360m.b("Incomplete vtt cue box header found.", i7 >= 8);
                    int i8 = c0363p.i();
                    int i9 = c0363p.i();
                    int i10 = i8 - 8;
                    byte[] bArr2 = c0363p.f5313a;
                    int i11 = c0363p.f5314b;
                    int i12 = AbstractC0370w.f5326a;
                    String str = new String(bArr2, i11, i10, StandardCharsets.UTF_8);
                    c0363p.I(i10);
                    i7 = (i7 - 8) - i10;
                    if (i9 == 1937011815) {
                        C0537g c0537g = new C0537g();
                        AbstractC0538h.e(str, c0537g);
                        c0316aA = c0537g.a();
                    } else if (i9 == 1885436268) {
                        charSequenceF = AbstractC0538h.f(null, str.trim(), Collections.emptyList());
                    }
                }
                if (charSequenceF == null) {
                    charSequenceF = "";
                }
                if (c0316aA != null) {
                    c0316aA.f4959a = charSequenceF;
                    c0317bA = c0316aA.a();
                } else {
                    Pattern pattern = AbstractC0538h.f7682a;
                    C0537g c0537g2 = new C0537g();
                    c0537g2.f7674c = charSequenceF;
                    c0317bA = c0537g2.a().a();
                }
                arrayList.add(c0317bA);
            } else {
                c0363p.I(i6 - 8);
            }
        }
        interfaceC0351d.accept(new C0318a(arrayList, -9223372036854775807L, -9223372036854775807L));
    }
}

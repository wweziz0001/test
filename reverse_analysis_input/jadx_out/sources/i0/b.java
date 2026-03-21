package i0;

import A0.m;
import F0.t;
import Q1.C;
import a0.C0157H;
import a0.C0200z;
import android.graphics.Bitmap;
import d0.C0368u;
import d0.InterfaceC0356i;
import java.io.IOException;
import l1.C0569a;
import l1.C0571c;
import l1.C0572d;
import l1.z;
import m1.C0632d;
import m2.C0640G;
import m2.I;
import m2.b0;
import m2.r;
import n0.q;
import s2.l;
import x0.q0;
import y0.C1000h;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b implements InterfaceC0356i, l2.d, t {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f6361l;

    public /* synthetic */ b(int i) {
        this.f6361l = i;
    }

    public static Bitmap d(int i, byte[] bArr) throws p0.d {
        try {
            return C.o(i, bArr);
        } catch (C0157H e5) {
            throw new p0.d("Could not decode image data with BitmapFactory. (data.length = " + bArr.length + ", input length = " + i + ")", e5);
        } catch (IOException e6) {
            throw new p0.d(e6);
        }
    }

    @Override // l2.d
    public Object apply(Object obj) {
        switch (this.f6361l) {
            case 21:
                return I.u(Integer.valueOf(((C1000h) obj).f10878l));
            default:
                q qVar = (q) obj;
                qVar.a();
                q0 q0Var = qVar.f8881T;
                return I.p(r.w(q0Var.f10777b, new l(11)));
        }
    }

    @Override // F0.t
    public F0.q[] b() {
        int i = 0;
        switch (this.f6361l) {
            case 22:
                return new F0.q[]{new C0569a()};
            case 23:
                return new F0.q[]{new C0571c()};
            case 24:
                return new F0.q[]{new C0572d(0)};
            case 25:
                return new F0.q[]{new z()};
            case 26:
                C0200z c0200z = c1.j.f5051h;
                C0368u c0368u = new C0368u(0L);
                C0640G c0640g = I.f8549m;
                return new F0.q[]{new l1.C(1, 1, c0200z, c0368u, new A.j(i, b0.f8583p))};
            default:
                return new F0.q[]{new C0632d()};
        }
    }

    @Override // d0.InterfaceC0356i
    public void c(Object obj) {
        h hVar = (h) obj;
        switch (this.f6361l) {
            case 0:
                hVar.getClass();
                break;
            case 1:
                hVar.getClass();
                break;
            case 2:
                hVar.getClass();
                break;
            case 3:
                hVar.getClass();
                break;
            case 4:
                hVar.getClass();
                break;
            case 5:
                hVar.getClass();
                break;
            case O.j.STRING_SET_FIELD_NUMBER /* 6 */:
                hVar.getClass();
                break;
            case O.j.DOUBLE_FIELD_NUMBER /* 7 */:
                hVar.getClass();
                break;
            case O.j.BYTES_FIELD_NUMBER /* 8 */:
                hVar.getClass();
                break;
            case 9:
                hVar.getClass();
                break;
            case 10:
                hVar.getClass();
                break;
            case 11:
                hVar.getClass();
                break;
            case 12:
                hVar.getClass();
                break;
            case 13:
                hVar.getClass();
                break;
            case 14:
                hVar.getClass();
                break;
            case 15:
                hVar.getClass();
                break;
            case 16:
                hVar.getClass();
                break;
            case 17:
                hVar.getClass();
                break;
            case 18:
                hVar.getClass();
                break;
            case 19:
                hVar.getClass();
                break;
            default:
                hVar.getClass();
                break;
        }
    }

    public /* synthetic */ b(C0477a c0477a, m mVar) {
        this.f6361l = 16;
    }
}

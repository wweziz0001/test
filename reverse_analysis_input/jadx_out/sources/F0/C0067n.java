package F0;

import a0.C0200z;
import android.net.Uri;
import d0.C0368u;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import l1.C0569a;
import l1.C0571c;
import l1.C0572d;
import m1.C0632d;
import m2.C0640G;
import m2.b0;

/* JADX INFO: renamed from: F0.n, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0067n implements t {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final int[] f803s = {5, 4, 12, 8, 3, 10, 9, 11, 6, 2, 0, 1, 7, 16, 15, 14, 17, 18, 19, 20, 21};

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final Z1.e f804t = new Z1.e(new B0.l(2));

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final Z1.e f805u = new Z1.e(new B0.l(3));

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f806l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f807m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f808n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public b0 f809o;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f812r;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public C0200z f811q = new C0200z(7);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f810p = true;

    @Override // F0.t
    public final synchronized q[] a(Uri uri, Map map) {
        ArrayList arrayList;
        try {
            int[] iArr = f803s;
            arrayList = new ArrayList(21);
            List list = (List) map.get("Content-Type");
            int iY = Z1.f.y((list == null || list.isEmpty()) ? null : (String) list.get(0));
            if (iY != -1) {
                c(iY, arrayList);
            }
            int iZ = Z1.f.z(uri);
            if (iZ != -1 && iZ != iY) {
                c(iZ, arrayList);
            }
            for (int i = 0; i < 21; i++) {
                int i5 = iArr[i];
                if (i5 != iY && i5 != iZ) {
                    c(i5, arrayList);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return (q[]) arrayList.toArray(new q[arrayList.size()]);
    }

    @Override // F0.t
    public final synchronized q[] b() {
        return a(Uri.EMPTY, new HashMap());
    }

    public final void c(int i, ArrayList arrayList) {
        switch (i) {
            case 0:
                arrayList.add(new C0569a());
                break;
            case 1:
                arrayList.add(new C0571c());
                break;
            case 2:
                arrayList.add(new C0572d((this.f806l ? 1 : 0) | (this.f807m ? 2 : 0)));
                break;
            case 3:
                arrayList.add(new G0.a((this.f806l ? 1 : 0) | (this.f807m ? 2 : 0)));
                break;
            case 4:
                q qVarQ = f804t.q(0);
                if (qVarQ == null) {
                    arrayList.add(new K0.c());
                } else {
                    arrayList.add(qVarQ);
                }
                break;
            case 5:
                arrayList.add(new L0.b());
                break;
            case O.j.STRING_SET_FIELD_NUMBER /* 6 */:
                arrayList.add(new X0.d(this.f811q, this.f810p ? 0 : 2));
                break;
            case O.j.DOUBLE_FIELD_NUMBER /* 7 */:
                arrayList.add(new Y0.d(this.f808n | (this.f806l ? 1 : 0) | (this.f807m ? 2 : 0)));
                break;
            case O.j.BYTES_FIELD_NUMBER /* 8 */:
                C0200z c0200z = this.f811q;
                int i5 = this.f810p ? 0 : 32;
                C0640G c0640g = m2.I.f8549m;
                arrayList.add(new Z0.m(c0200z, i5, null, null, b0.f8583p, null));
                arrayList.add(new Z0.p(this.f811q, this.f810p ? 0 : 16));
                break;
            case 9:
                arrayList.add(new a1.d());
                break;
            case 10:
                arrayList.add(new l1.z());
                break;
            case 11:
                if (this.f809o == null) {
                    C0640G c0640g2 = m2.I.f8549m;
                    this.f809o = b0.f8583p;
                }
                arrayList.add(new l1.C(1, !this.f810p ? 1 : 0, this.f811q, new C0368u(0L), new A.j(0, this.f809o)));
                break;
            case 12:
                arrayList.add(new C0632d());
                break;
            case 14:
                arrayList.add(new J0.a(this.f812r));
                break;
            case 15:
                q qVarQ2 = f805u.q(new Object[0]);
                if (qVarQ2 != null) {
                    arrayList.add(qVarQ2);
                }
                break;
            case 16:
                arrayList.add(new H0.b(1 ^ (this.f810p ? 1 : 0), this.f811q));
                break;
            case 17:
                arrayList.add(new J0.a(1, (byte) 0));
                break;
            case 18:
                arrayList.add(new I0.a(2));
                break;
            case 19:
                arrayList.add(new J0.a(0, (byte) 0));
                break;
            case 20:
                arrayList.add(new I0.a(1));
                break;
            case 21:
                arrayList.add(new I0.a(0));
                break;
        }
    }
}

package B0;

import D0.y;
import android.content.Context;
import android.os.Handler;
import d0.C0362o;
import d0.C0365r;
import f0.InterfaceC0403A;
import i0.C0477a;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import m2.I;
import m2.b0;
import m2.g0;
import x0.H;

/* JADX INFO: loaded from: classes.dex */
public final class i implements e, InterfaceC0403A {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final b0 f203n = I.t(4300000L, 3200000L, 2400000L, 1700000L, 860000L);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final b0 f204o = I.t(1500000L, 980000L, 750000L, 520000L, 290000L);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final b0 f205p = I.t(2000000L, 1300000L, 1000000L, 860000L, 610000L);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final b0 f206q = I.t(2500000L, 1700000L, 1200000L, 970000L, 680000L);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final b0 f207r = I.t(4700000L, 2800000L, 2100000L, 1700000L, 980000L);

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final b0 f208s = I.t(2700000L, 2000000L, 1600000L, 1300000L, 1000000L);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static i f209t;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g0 f210a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f211b = new d(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C0365r f212c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f213d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final w f214e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f215f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f216g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f217h;
    public long i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public long f218j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long f219k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long f220l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f221m;

    public i(Context context, HashMap map, int i, C0365r c0365r, boolean z4) {
        this.f210a = g0.a(map);
        this.f214e = new w(i);
        this.f212c = c0365r;
        this.f213d = z4;
        if (context == null) {
            this.f221m = 0;
            this.f219k = b(0);
            return;
        }
        C0362o c0362oC = C0362o.c(context);
        int iD = c0362oC.d();
        this.f221m = iD;
        this.f219k = b(iD);
        g gVar = new g(this);
        CopyOnWriteArrayList<WeakReference> copyOnWriteArrayList = (CopyOnWriteArrayList) c0362oC.f5308n;
        for (WeakReference weakReference : copyOnWriteArrayList) {
            if (weakReference.get() == null) {
                copyOnWriteArrayList.remove(weakReference);
            }
        }
        copyOnWriteArrayList.add(new WeakReference(gVar));
        ((Handler) c0362oC.f5307m).post(new y(c0362oC, 12, gVar));
    }

    public static int[] a(String str) {
        str.getClass();
        switch (str) {
            case "AD":
            case "AI":
            case "BB":
            case "BQ":
            case "CW":
            case "DM":
            case "KN":
            case "KY":
            case "SX":
            case "VC":
                return new int[]{1, 2, 0, 0, 2, 2};
            case "AE":
                return new int[]{1, 4, 2, 3, 4, 1};
            case "AF":
            case "SZ":
                return new int[]{4, 4, 3, 4, 2, 2};
            case "AG":
            case "CI":
                return new int[]{2, 4, 3, 4, 2, 2};
            case "AL":
                return new int[]{1, 1, 1, 2, 2, 2};
            case "AM":
            case "PA":
                return new int[]{2, 3, 2, 3, 2, 2};
            case "AO":
                return new int[]{3, 4, 4, 3, 2, 2};
            case "AQ":
            case "ER":
            case "NU":
            case "SC":
            case "SH":
                return new int[]{4, 2, 2, 2, 2, 2};
            case "AR":
                return new int[]{2, 2, 2, 2, 1, 2};
            case "AS":
                return new int[]{2, 2, 3, 3, 2, 2};
            case "AT":
            case "EE":
            case "HU":
            case "IS":
            case "LV":
            case "MT":
            case "SE":
                return new int[]{0, 0, 0, 0, 0, 2};
            case "AU":
                return new int[]{0, 3, 1, 1, 3, 0};
            case "AW":
                return new int[]{2, 2, 3, 4, 2, 2};
            case "AX":
            case "CX":
            case "LI":
            case "MS":
            case "PM":
            case "SM":
            case "VA":
                return new int[]{0, 2, 2, 2, 2, 2};
            case "AZ":
            case "DJ":
            case "LY":
            case "SL":
                return new int[]{4, 2, 3, 3, 2, 2};
            case "BA":
            case "JO":
            case "TR":
                return new int[]{1, 1, 1, 1, 2, 2};
            case "BD":
                return new int[]{2, 1, 3, 2, 4, 2};
            case "BE":
                return new int[]{0, 0, 1, 0, 1, 2};
            case "BF":
            case "SD":
            case "SY":
            case "TD":
                return new int[]{4, 3, 4, 4, 2, 2};
            case "BG":
            case "PT":
            case "SI":
                return new int[]{0, 0, 0, 0, 1, 2};
            case "BH":
                return new int[]{1, 3, 1, 3, 4, 2};
            case "BI":
            case "GQ":
            case "HT":
            case "NE":
            case "VE":
            case "YE":
                return new int[]{4, 4, 4, 4, 2, 2};
            case "BJ":
                return new int[]{4, 4, 2, 3, 2, 2};
            case "BL":
            case "MP":
            case "PY":
                return new int[]{1, 2, 2, 2, 2, 2};
            case "BM":
                return new int[]{0, 2, 0, 0, 2, 2};
            case "BN":
                return new int[]{3, 2, 0, 0, 2, 2};
            case "BO":
                return new int[]{1, 2, 4, 4, 2, 2};
            case "BR":
                return new int[]{1, 1, 1, 1, 2, 4};
            case "BS":
                return new int[]{3, 2, 1, 1, 2, 2};
            case "BT":
                return new int[]{3, 1, 2, 2, 3, 2};
            case "BW":
                return new int[]{3, 2, 1, 0, 2, 2};
            case "BY":
                return new int[]{1, 2, 3, 3, 2, 2};
            case "BZ":
            case "CK":
                return new int[]{2, 2, 2, 1, 2, 2};
            case "CA":
            case "UA":
                return new int[]{0, 2, 1, 2, 3, 3};
            case "CD":
            case "ML":
                return new int[]{3, 3, 2, 2, 2, 2};
            case "CF":
                return new int[]{4, 2, 4, 2, 2, 2};
            case "CG":
            case "EG":
            case "MG":
                return new int[]{3, 4, 3, 3, 2, 2};
            case "CH":
                return new int[]{0, 1, 0, 0, 0, 2};
            case "CL":
            case "TH":
                return new int[]{0, 1, 2, 2, 2, 2};
            case "CM":
            case "MR":
                return new int[]{4, 3, 3, 4, 2, 2};
            case "CN":
                return new int[]{2, 0, 1, 1, 3, 1};
            case "CO":
                return new int[]{2, 3, 3, 2, 2, 2};
            case "CR":
            case "NI":
                return new int[]{2, 4, 4, 4, 2, 2};
            case "CU":
            case "KI":
            case "NR":
            case "TL":
                return new int[]{4, 2, 4, 4, 2, 2};
            case "CV":
                return new int[]{2, 3, 0, 1, 2, 2};
            case "CY":
                return new int[]{1, 0, 1, 0, 0, 2};
            case "CZ":
                return new int[]{0, 0, 2, 0, 1, 2};
            case "DE":
                return new int[]{0, 1, 4, 2, 2, 1};
            case "DK":
                return new int[]{0, 0, 2, 0, 0, 2};
            case "DO":
            case "LR":
                return new int[]{3, 4, 4, 4, 2, 2};
            case "DZ":
            case "TJ":
                return new int[]{3, 3, 4, 4, 2, 2};
            case "EC":
                return new int[]{1, 3, 2, 1, 2, 2};
            case "ES":
                return new int[]{0, 0, 0, 0, 1, 0};
            case "ET":
                return new int[]{4, 3, 4, 4, 4, 2};
            case "FI":
                return new int[]{0, 0, 0, 1, 0, 2};
            case "FJ":
                return new int[]{3, 2, 2, 3, 2, 2};
            case "FK":
            case "NF":
            case "SJ":
                return new int[]{3, 2, 2, 2, 2, 2};
            case "FM":
                return new int[]{4, 2, 4, 0, 2, 2};
            case "FO":
                return new int[]{0, 2, 2, 0, 2, 2};
            case "FR":
                return new int[]{1, 1, 1, 1, 0, 2};
            case "GA":
                return new int[]{3, 4, 0, 0, 2, 2};
            case "GB":
                return new int[]{1, 1, 3, 2, 2, 2};
            case "GD":
                return new int[]{2, 2, 0, 0, 2, 2};
            case "GE":
                return new int[]{1, 1, 0, 2, 2, 2};
            case "GF":
                return new int[]{3, 2, 3, 3, 2, 2};
            case "GG":
                return new int[]{0, 2, 1, 1, 2, 2};
            case "GH":
                return new int[]{3, 3, 3, 2, 2, 2};
            case "GI":
            case "IM":
            case "JE":
                return new int[]{0, 2, 0, 1, 2, 2};
            case "GL":
            case "MC":
                return new int[]{1, 2, 2, 0, 2, 2};
            case "GM":
            case "SS":
                return new int[]{4, 3, 2, 4, 2, 2};
            case "GN":
                return new int[]{3, 4, 4, 2, 2, 2};
            case "GP":
                return new int[]{2, 1, 1, 3, 2, 2};
            case "GR":
                return new int[]{1, 0, 0, 0, 1, 2};
            case "GT":
                return new int[]{2, 1, 2, 1, 2, 2};
            case "GU":
                return new int[]{2, 2, 4, 3, 3, 2};
            case "GW":
                return new int[]{4, 4, 1, 2, 2, 2};
            case "GY":
                return new int[]{3, 1, 1, 3, 2, 2};
            case "HK":
                return new int[]{0, 1, 0, 1, 1, 0};
            case "HR":
            case "KW":
                return new int[]{1, 0, 0, 0, 0, 2};
            case "ID":
                return new int[]{3, 1, 3, 3, 2, 4};
            case "IE":
                return new int[]{1, 1, 1, 1, 1, 2};
            case "IL":
                return new int[]{1, 2, 2, 3, 4, 2};
            case "IN":
                return new int[]{1, 1, 3, 2, 2, 3};
            case "IO":
                return new int[]{3, 2, 2, 0, 2, 2};
            case "IQ":
                return new int[]{3, 2, 3, 2, 2, 2};
            case "IR":
                return new int[]{4, 2, 3, 3, 4, 3};
            case "IT":
                return new int[]{0, 1, 1, 2, 1, 2};
            case "JM":
                return new int[]{2, 4, 3, 1, 2, 2};
            case "JP":
                return new int[]{0, 3, 2, 3, 4, 2};
            case "KE":
                return new int[]{3, 2, 1, 1, 1, 2};
            case "KG":
                return new int[]{2, 1, 1, 2, 2, 2};
            case "KH":
                return new int[]{1, 0, 4, 2, 2, 2};
            case "KM":
            case "VU":
                return new int[]{4, 3, 3, 2, 2, 2};
            case "KR":
                return new int[]{0, 2, 2, 4, 4, 4};
            case "KZ":
                return new int[]{2, 1, 2, 2, 3, 2};
            case "LA":
                return new int[]{1, 2, 1, 3, 2, 2};
            case "LB":
                return new int[]{3, 1, 1, 2, 2, 2};
            case "LC":
                return new int[]{2, 2, 1, 1, 2, 2};
            case "LK":
            case "MM":
                return new int[]{3, 2, 3, 3, 4, 2};
            case "LS":
            case "PG":
                return new int[]{4, 3, 3, 3, 2, 2};
            case "LT":
                return new int[]{0, 1, 0, 1, 0, 2};
            case "LU":
                return new int[]{4, 0, 3, 2, 1, 3};
            case "MA":
                return new int[]{3, 3, 1, 1, 2, 2};
            case "MD":
                return new int[]{1, 0, 0, 0, 2, 2};
            case "ME":
                return new int[]{2, 0, 0, 1, 3, 2};
            case "MF":
                return new int[]{1, 2, 2, 3, 2, 2};
            case "MH":
            case "TM":
            case "TV":
            case "WF":
                return new int[]{4, 2, 2, 4, 2, 2};
            case "MK":
                return new int[]{1, 0, 0, 1, 3, 2};
            case "MN":
                return new int[]{2, 0, 2, 2, 2, 2};
            case "MO":
                return new int[]{0, 2, 4, 4, 3, 1};
            case "MQ":
                return new int[]{2, 1, 2, 3, 2, 2};
            case "MU":
                return new int[]{3, 1, 0, 2, 2, 2};
            case "MV":
                return new int[]{3, 2, 1, 3, 4, 2};
            case "MW":
                return new int[]{3, 2, 2, 1, 2, 2};
            case "MX":
                return new int[]{2, 4, 4, 4, 3, 2};
            case "MY":
                return new int[]{1, 0, 4, 1, 1, 0};
            case "MZ":
            case "WS":
                return new int[]{3, 1, 2, 2, 2, 2};
            case "NA":
                return new int[]{3, 4, 3, 2, 2, 2};
            case "NC":
            case "YT":
                return new int[]{2, 3, 3, 4, 2, 2};
            case "NG":
                return new int[]{3, 4, 2, 1, 2, 2};
            case "NL":
                return new int[]{2, 1, 4, 3, 0, 4};
            case "NO":
                return new int[]{0, 0, 3, 0, 0, 2};
            case "NP":
                return new int[]{2, 2, 4, 3, 2, 2};
            case "NZ":
                return new int[]{0, 0, 1, 2, 4, 2};
            case "OM":
                return new int[]{2, 3, 1, 2, 4, 2};
            case "PE":
                return new int[]{1, 2, 4, 4, 3, 2};
            case "PF":
                return new int[]{2, 2, 3, 1, 2, 2};
            case "PH":
                return new int[]{2, 1, 2, 3, 2, 1};
            case "PK":
                return new int[]{3, 3, 3, 3, 2, 2};
            case "PL":
                return new int[]{1, 0, 2, 2, 4, 4};
            case "PR":
                return new int[]{2, 0, 2, 1, 2, 0};
            case "PS":
                return new int[]{3, 4, 1, 3, 2, 2};
            case "PW":
                return new int[]{2, 2, 4, 1, 2, 2};
            case "QA":
                return new int[]{1, 4, 4, 4, 4, 2};
            case "RE":
                return new int[]{0, 3, 2, 3, 1, 2};
            case "RO":
                return new int[]{0, 0, 1, 1, 3, 2};
            case "RS":
                return new int[]{1, 0, 0, 1, 2, 2};
            case "RU":
                return new int[]{1, 0, 0, 1, 3, 3};
            case "RW":
                return new int[]{3, 3, 2, 0, 2, 2};
            case "SA":
                return new int[]{3, 1, 1, 2, 2, 0};
            case "SB":
            case "ZW":
                return new int[]{4, 2, 4, 3, 2, 2};
            case "SG":
                return new int[]{2, 3, 3, 3, 1, 1};
            case "SK":
                return new int[]{0, 1, 1, 1, 2, 2};
            case "SN":
                return new int[]{4, 4, 3, 2, 2, 2};
            case "SO":
                return new int[]{2, 2, 3, 4, 4, 2};
            case "SR":
                return new int[]{2, 4, 4, 1, 2, 2};
            case "ST":
                return new int[]{2, 2, 1, 2, 2, 2};
            case "SV":
                return new int[]{2, 3, 2, 1, 2, 2};
            case "TC":
                return new int[]{3, 2, 1, 2, 2, 2};
            case "TG":
                return new int[]{3, 4, 1, 0, 2, 2};
            case "TN":
                return new int[]{3, 1, 1, 1, 2, 2};
            case "TO":
                return new int[]{3, 2, 4, 3, 2, 2};
            case "TT":
                return new int[]{2, 4, 1, 0, 2, 2};
            case "TW":
                return new int[]{0, 0, 0, 0, 0, 0};
            case "TZ":
                return new int[]{3, 4, 2, 1, 3, 2};
            case "UG":
                return new int[]{3, 3, 2, 3, 4, 2};
            case "US":
                return new int[]{2, 2, 4, 1, 3, 1};
            case "UY":
                return new int[]{2, 1, 1, 2, 1, 2};
            case "UZ":
                return new int[]{1, 2, 3, 4, 3, 2};
            case "VG":
                return new int[]{2, 2, 1, 1, 2, 4};
            case "VI":
                return new int[]{0, 2, 1, 2, 2, 2};
            case "VN":
                return new int[]{0, 0, 1, 2, 2, 2};
            case "XK":
                return new int[]{1, 2, 1, 1, 2, 2};
            case "ZA":
                return new int[]{2, 4, 2, 1, 1, 2};
            case "ZM":
                return new int[]{4, 4, 4, 3, 2, 2};
            default:
                return new int[]{2, 2, 2, 2, 2, 2};
        }
    }

    public final long b(int i) {
        Integer numValueOf = Integer.valueOf(i);
        g0 g0Var = this.f210a;
        Long l3 = (Long) g0Var.get(numValueOf);
        if (l3 == null) {
            l3 = (Long) g0Var.get(0);
        }
        if (l3 == null) {
            l3 = 1000000L;
        }
        return l3.longValue();
    }

    public final void c(final int i, final long j5, final long j6) {
        if (i == 0 && j5 == 0 && j6 == this.f220l) {
            return;
        }
        this.f220l = j6;
        for (final c cVar : (CopyOnWriteArrayList) this.f211b.f190l) {
            if (!cVar.f189c) {
                cVar.f187a.post(new Runnable() { // from class: B0.b
                    @Override // java.lang.Runnable
                    public final void run() {
                        i0.c cVar2 = cVar.f188b;
                        y2.n nVar = cVar2.f6365o;
                        C0477a c0477aI = cVar2.i(((I) nVar.f10955b).isEmpty() ? null : (H) m2.r.l((I) nVar.f10955b));
                        cVar2.l(c0477aI, 1006, new c1.m(c0477aI, i, j5, j6));
                    }
                });
            }
        }
    }
}

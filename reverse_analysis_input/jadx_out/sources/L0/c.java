package L0;

import d0.C0363p;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final class c extends e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f1476b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long[] f1477c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long[] f1478d;

    public static Serializable p(int i, C0363p c0363p) {
        if (i == 0) {
            return Double.valueOf(Double.longBitsToDouble(c0363p.p()));
        }
        if (i == 1) {
            return Boolean.valueOf(c0363p.v() == 1);
        }
        if (i == 2) {
            return r(c0363p);
        }
        if (i != 3) {
            if (i == 8) {
                return q(c0363p);
            }
            if (i != 10) {
                if (i != 11) {
                    return null;
                }
                Date date = new Date((long) Double.longBitsToDouble(c0363p.p()));
                c0363p.I(2);
                return date;
            }
            int iZ = c0363p.z();
            ArrayList arrayList = new ArrayList(iZ);
            for (int i5 = 0; i5 < iZ; i5++) {
                Serializable serializableP = p(c0363p.v(), c0363p);
                if (serializableP != null) {
                    arrayList.add(serializableP);
                }
            }
            return arrayList;
        }
        HashMap map = new HashMap();
        while (true) {
            String strR = r(c0363p);
            int iV = c0363p.v();
            if (iV == 9) {
                return map;
            }
            Serializable serializableP2 = p(iV, c0363p);
            if (serializableP2 != null) {
                map.put(strR, serializableP2);
            }
        }
    }

    public static HashMap q(C0363p c0363p) {
        int iZ = c0363p.z();
        HashMap map = new HashMap(iZ);
        for (int i = 0; i < iZ; i++) {
            String strR = r(c0363p);
            Serializable serializableP = p(c0363p.v(), c0363p);
            if (serializableP != null) {
                map.put(strR, serializableP);
            }
        }
        return map;
    }

    public static String r(C0363p c0363p) {
        int iB = c0363p.B();
        int i = c0363p.f5314b;
        c0363p.I(iB);
        return new String(c0363p.f5313a, i, iB);
    }
}

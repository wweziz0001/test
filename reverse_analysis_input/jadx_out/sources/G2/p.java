package G2;

import b3.AbstractC0307a;
import java.io.IOException;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public abstract class p {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final l f908l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final m f909m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ p[] f910n;

    static {
        l lVar = new l();
        f908l = lVar;
        m mVar = new m();
        f909m = mVar;
        f910n = new p[]{lVar, mVar, new p() { // from class: G2.n
            public static Double b(String str, O2.a aVar) throws O2.c {
                try {
                    Double dValueOf = Double.valueOf(str);
                    if (dValueOf.isInfinite() || dValueOf.isNaN()) {
                        boolean z4 = true;
                        if (aVar.f1650z != 1) {
                            z4 = false;
                        }
                        if (!z4) {
                            throw new O2.c("JSON forbids NaN and infinities: " + dValueOf + "; at path " + aVar.q());
                        }
                    }
                    return dValueOf;
                } catch (NumberFormatException e5) {
                    StringBuilder sbM = AbstractC0307a.m("Cannot parse ", str, "; at path ");
                    sbM.append(aVar.q());
                    throw new A1.c(sbM.toString(), e5);
                }
            }

            @Override // G2.p
            public final Number a(O2.a aVar) throws IOException {
                String strC = aVar.C();
                if (strC.indexOf(46) >= 0) {
                    return b(strC, aVar);
                }
                try {
                    return Long.valueOf(Long.parseLong(strC));
                } catch (NumberFormatException unused) {
                    return b(strC, aVar);
                }
            }
        }, new p() { // from class: G2.o
            @Override // G2.p
            public final Number a(O2.a aVar) throws IOException {
                String strC = aVar.C();
                try {
                    return I2.d.j(strC);
                } catch (NumberFormatException e5) {
                    StringBuilder sbM = AbstractC0307a.m("Cannot parse ", strC, "; at path ");
                    sbM.append(aVar.q());
                    throw new A1.c(sbM.toString(), e5);
                }
            }
        }};
    }

    public static p valueOf(String str) {
        return (p) Enum.valueOf(p.class, str);
    }

    public static p[] values() {
        return (p[]) f910n.clone();
    }

    public abstract Number a(O2.a aVar);
}

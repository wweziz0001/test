package z2;

import D2.O;
import D2.r0;
import java.security.GeneralSecurityException;
import y2.C1005a;
import y2.s;
import y3.C1013H;

/* JADX INFO: loaded from: classes.dex */
public abstract class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final y2.j f11179a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final y2.i f11180b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final y2.c f11181c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final C1005a f11182d;

    static {
        F2.a aVarB = s.b("type.googleapis.com/google.crypto.tink.HmacKey");
        f11179a = new y2.j(k.class);
        f11180b = new y2.i(aVarB);
        f11181c = new y2.c(j.class);
        f11182d = new C1005a(aVarB, new C1013H(24));
    }

    public static d a(O o4) throws GeneralSecurityException {
        int iOrdinal = o4.ordinal();
        if (iOrdinal == 1) {
            return d.f11155g;
        }
        if (iOrdinal == 2) {
            return d.f11157j;
        }
        if (iOrdinal == 3) {
            return d.i;
        }
        if (iOrdinal == 4) {
            return d.f11158k;
        }
        if (iOrdinal == 5) {
            return d.f11156h;
        }
        throw new GeneralSecurityException("Unable to parse HashType: " + o4.a());
    }

    public static d b(r0 r0Var) throws GeneralSecurityException {
        int iOrdinal = r0Var.ordinal();
        if (iOrdinal == 1) {
            return d.f11159l;
        }
        if (iOrdinal == 2) {
            return d.f11161n;
        }
        if (iOrdinal == 3) {
            return d.f11162o;
        }
        if (iOrdinal == 4) {
            return d.f11160m;
        }
        throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + r0Var.b());
    }
}

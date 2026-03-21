package z2;

import D2.r0;
import java.security.GeneralSecurityException;
import y2.C1005a;
import y2.s;
import y3.C1013H;

/* JADX INFO: loaded from: classes.dex */
public abstract class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final y2.j f11168a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final y2.i f11169b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final y2.c f11170c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final C1005a f11171d;

    static {
        F2.a aVarB = s.b("type.googleapis.com/google.crypto.tink.AesCmacKey");
        f11168a = new y2.j(e.class);
        f11169b = new y2.i(aVarB);
        f11170c = new y2.c(C1065a.class);
        f11171d = new C1005a(aVarB, new C1013H(22));
    }

    public static d a(r0 r0Var) throws GeneralSecurityException {
        int iOrdinal = r0Var.ordinal();
        if (iOrdinal == 1) {
            return d.f11151c;
        }
        if (iOrdinal == 2) {
            return d.f11153e;
        }
        if (iOrdinal == 3) {
            return d.f11154f;
        }
        if (iOrdinal == 4) {
            return d.f11152d;
        }
        throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + r0Var.b());
    }
}

package s2;

import D2.O;
import java.security.GeneralSecurityException;
import y2.C1005a;

/* JADX INFO: loaded from: classes.dex */
public abstract class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final y2.j f9654a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final y2.i f9655b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final y2.c f9656c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final C1005a f9657d;

    static {
        F2.a aVarB = y2.s.b("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey");
        f9654a = new y2.j(k.class);
        f9655b = new y2.i(aVarB);
        f9656c = new y2.c(C0797f.class);
        f9657d = new C1005a(aVarB, new l(0));
    }

    public static j a(O o4) throws GeneralSecurityException {
        int iOrdinal = o4.ordinal();
        if (iOrdinal == 1) {
            return j.f9625c;
        }
        if (iOrdinal == 2) {
            return j.f9628f;
        }
        if (iOrdinal == 3) {
            return j.f9627e;
        }
        if (iOrdinal == 4) {
            return j.f9629g;
        }
        if (iOrdinal == 5) {
            return j.f9626d;
        }
        throw new GeneralSecurityException("Unable to parse HashType: " + o4.a());
    }
}

package D2;

import com.google.crypto.tink.shaded.protobuf.AbstractC0329i;
import com.google.crypto.tink.shaded.protobuf.AbstractC0342w;
import com.google.crypto.tink.shaded.protobuf.C0335o;
import com.google.crypto.tink.shaded.protobuf.C0341v;

/* JADX INFO: renamed from: D2.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0036h extends AbstractC0342w {
    public static final int AES_CTR_KEY_FIELD_NUMBER = 2;
    private static final C0036h DEFAULT_INSTANCE;
    public static final int HMAC_KEY_FIELD_NUMBER = 3;
    private static volatile com.google.crypto.tink.shaded.protobuf.X PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 1;
    private C0040l aesCtrKey_;
    private Q hmacKey_;
    private int version_;

    static {
        C0036h c0036h = new C0036h();
        DEFAULT_INSTANCE = c0036h;
        AbstractC0342w.v(C0036h.class, c0036h);
    }

    public static void A(C0036h c0036h, Q q4) {
        c0036h.getClass();
        q4.getClass();
        c0036h.hmacKey_ = q4;
    }

    public static C0035g E() {
        return (C0035g) DEFAULT_INSTANCE.j();
    }

    public static C0036h F(AbstractC0329i abstractC0329i, C0335o c0335o) {
        return (C0036h) AbstractC0342w.t(DEFAULT_INSTANCE, abstractC0329i, c0335o);
    }

    public static void y(C0036h c0036h) {
        c0036h.version_ = 0;
    }

    public static void z(C0036h c0036h, C0040l c0040l) {
        c0036h.getClass();
        c0040l.getClass();
        c0036h.aesCtrKey_ = c0040l;
    }

    public final C0040l B() {
        C0040l c0040l = this.aesCtrKey_;
        return c0040l == null ? C0040l.B() : c0040l;
    }

    public final Q C() {
        Q q4 = this.hmacKey_;
        return q4 == null ? Q.B() : q4;
    }

    public final int D() {
        return this.version_;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC0342w
    public final Object k(int i) {
        switch (O.i.b(i)) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new com.google.crypto.tink.shaded.protobuf.b0(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\t", new Object[]{"version_", "aesCtrKey_", "hmacKey_"});
            case 3:
                return new C0036h();
            case 4:
                return new C0035g(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case O.j.STRING_SET_FIELD_NUMBER /* 6 */:
                com.google.crypto.tink.shaded.protobuf.X c0341v = PARSER;
                if (c0341v == null) {
                    synchronized (C0036h.class) {
                        try {
                            c0341v = PARSER;
                            if (c0341v == null) {
                                c0341v = new C0341v();
                                PARSER = c0341v;
                            }
                        } finally {
                        }
                        break;
                    }
                }
                return c0341v;
            default:
                throw new UnsupportedOperationException();
        }
    }
}

package D2;

import com.google.crypto.tink.shaded.protobuf.AbstractC0342w;
import com.google.crypto.tink.shaded.protobuf.C0341v;

/* JADX INFO: loaded from: classes.dex */
public final class j0 extends AbstractC0342w {
    private static final j0 DEFAULT_INSTANCE;
    public static final int KEY_ID_FIELD_NUMBER = 3;
    public static final int OUTPUT_PREFIX_TYPE_FIELD_NUMBER = 4;
    private static volatile com.google.crypto.tink.shaded.protobuf.X PARSER = null;
    public static final int STATUS_FIELD_NUMBER = 2;
    public static final int TYPE_URL_FIELD_NUMBER = 1;
    private int keyId_;
    private int outputPrefixType_;
    private int status_;
    private String typeUrl_ = "";

    static {
        j0 j0Var = new j0();
        DEFAULT_INSTANCE = j0Var;
        AbstractC0342w.v(j0.class, j0Var);
    }

    public static void A(j0 j0Var, Z z4) {
        j0Var.getClass();
        j0Var.status_ = z4.a();
    }

    public static void B(j0 j0Var, int i) {
        j0Var.keyId_ = i;
    }

    public static i0 D() {
        return (i0) DEFAULT_INSTANCE.j();
    }

    public static void y(j0 j0Var, String str) {
        j0Var.getClass();
        str.getClass();
        j0Var.typeUrl_ = str;
    }

    public static void z(j0 j0Var, r0 r0Var) {
        j0Var.getClass();
        j0Var.outputPrefixType_ = r0Var.b();
    }

    public final int C() {
        return this.keyId_;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC0342w
    public final Object k(int i) {
        switch (O.i.b(i)) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new com.google.crypto.tink.shaded.protobuf.b0(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002\f\u0003\u000b\u0004\f", new Object[]{"typeUrl_", "status_", "keyId_", "outputPrefixType_"});
            case 3:
                return new j0();
            case 4:
                return new i0(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case O.j.STRING_SET_FIELD_NUMBER /* 6 */:
                com.google.crypto.tink.shaded.protobuf.X c0341v = PARSER;
                if (c0341v == null) {
                    synchronized (j0.class) {
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

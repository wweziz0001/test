package D2;

import com.google.crypto.tink.shaded.protobuf.AbstractC0329i;
import com.google.crypto.tink.shaded.protobuf.AbstractC0342w;
import com.google.crypto.tink.shaded.protobuf.C0328h;
import com.google.crypto.tink.shaded.protobuf.C0331k;
import com.google.crypto.tink.shaded.protobuf.C0335o;
import com.google.crypto.tink.shaded.protobuf.C0341v;
import java.io.ByteArrayInputStream;

/* JADX INFO: loaded from: classes.dex */
public final class N extends AbstractC0342w {
    private static final N DEFAULT_INSTANCE;
    public static final int ENCRYPTED_KEYSET_FIELD_NUMBER = 2;
    public static final int KEYSET_INFO_FIELD_NUMBER = 3;
    private static volatile com.google.crypto.tink.shaded.protobuf.X PARSER;
    private AbstractC0329i encryptedKeyset_ = AbstractC0329i.f5205m;
    private k0 keysetInfo_;

    static {
        N n4 = new N();
        DEFAULT_INSTANCE = n4;
        AbstractC0342w.v(N.class, n4);
    }

    public static M B() {
        return (M) DEFAULT_INSTANCE.j();
    }

    public static N C(ByteArrayInputStream byteArrayInputStream, C0335o c0335o) throws com.google.crypto.tink.shaded.protobuf.C {
        AbstractC0342w abstractC0342wU = AbstractC0342w.u(DEFAULT_INSTANCE, new C0331k(byteArrayInputStream), c0335o);
        AbstractC0342w.g(abstractC0342wU);
        return (N) abstractC0342wU;
    }

    public static void y(N n4, C0328h c0328h) {
        n4.getClass();
        n4.encryptedKeyset_ = c0328h;
    }

    public static void z(N n4, k0 k0Var) {
        n4.getClass();
        n4.keysetInfo_ = k0Var;
    }

    public final AbstractC0329i A() {
        return this.encryptedKeyset_;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC0342w
    public final Object k(int i) {
        switch (O.i.b(i)) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new com.google.crypto.tink.shaded.protobuf.b0(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0002\u0003\u0002\u0000\u0000\u0000\u0002\n\u0003\t", new Object[]{"encryptedKeyset_", "keysetInfo_"});
            case 3:
                return new N();
            case 4:
                return new M(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case O.j.STRING_SET_FIELD_NUMBER /* 6 */:
                com.google.crypto.tink.shaded.protobuf.X c0341v = PARSER;
                if (c0341v == null) {
                    synchronized (N.class) {
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

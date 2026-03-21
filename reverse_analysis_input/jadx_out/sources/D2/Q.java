package D2;

import com.google.crypto.tink.shaded.protobuf.AbstractC0329i;
import com.google.crypto.tink.shaded.protobuf.AbstractC0342w;
import com.google.crypto.tink.shaded.protobuf.C0328h;
import com.google.crypto.tink.shaded.protobuf.C0335o;
import com.google.crypto.tink.shaded.protobuf.C0341v;

/* JADX INFO: loaded from: classes.dex */
public final class Q extends AbstractC0342w {
    private static final Q DEFAULT_INSTANCE;
    public static final int KEY_VALUE_FIELD_NUMBER = 3;
    public static final int PARAMS_FIELD_NUMBER = 2;
    private static volatile com.google.crypto.tink.shaded.protobuf.X PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 1;
    private AbstractC0329i keyValue_ = AbstractC0329i.f5205m;
    private V params_;
    private int version_;

    static {
        Q q4 = new Q();
        DEFAULT_INSTANCE = q4;
        AbstractC0342w.v(Q.class, q4);
    }

    public static void A(Q q4, C0328h c0328h) {
        q4.getClass();
        q4.keyValue_ = c0328h;
    }

    public static Q B() {
        return DEFAULT_INSTANCE;
    }

    public static P F() {
        return (P) DEFAULT_INSTANCE.j();
    }

    public static Q G(AbstractC0329i abstractC0329i, C0335o c0335o) {
        return (Q) AbstractC0342w.t(DEFAULT_INSTANCE, abstractC0329i, c0335o);
    }

    public static void y(Q q4) {
        q4.version_ = 0;
    }

    public static void z(Q q4, V v4) {
        q4.getClass();
        v4.getClass();
        q4.params_ = v4;
    }

    public final AbstractC0329i C() {
        return this.keyValue_;
    }

    public final V D() {
        V v4 = this.params_;
        return v4 == null ? V.A() : v4;
    }

    public final int E() {
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
                return new com.google.crypto.tink.shaded.protobuf.b0(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\n", new Object[]{"version_", "params_", "keyValue_"});
            case 3:
                return new Q();
            case 4:
                return new P(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case O.j.STRING_SET_FIELD_NUMBER /* 6 */:
                com.google.crypto.tink.shaded.protobuf.X c0341v = PARSER;
                if (c0341v == null) {
                    synchronized (Q.class) {
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

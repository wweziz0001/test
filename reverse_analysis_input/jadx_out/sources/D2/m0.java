package D2;

import com.google.crypto.tink.shaded.protobuf.AbstractC0329i;
import com.google.crypto.tink.shaded.protobuf.AbstractC0342w;
import com.google.crypto.tink.shaded.protobuf.C0335o;
import com.google.crypto.tink.shaded.protobuf.C0341v;

/* JADX INFO: loaded from: classes.dex */
public final class m0 extends AbstractC0342w {
    private static final m0 DEFAULT_INSTANCE;
    public static final int PARAMS_FIELD_NUMBER = 2;
    private static volatile com.google.crypto.tink.shaded.protobuf.X PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 1;
    private n0 params_;
    private int version_;

    static {
        m0 m0Var = new m0();
        DEFAULT_INSTANCE = m0Var;
        AbstractC0342w.v(m0.class, m0Var);
    }

    public static l0 C() {
        return (l0) DEFAULT_INSTANCE.j();
    }

    public static m0 D(AbstractC0329i abstractC0329i, C0335o c0335o) {
        return (m0) AbstractC0342w.t(DEFAULT_INSTANCE, abstractC0329i, c0335o);
    }

    public static void y(m0 m0Var) {
        m0Var.version_ = 0;
    }

    public static void z(m0 m0Var, n0 n0Var) {
        m0Var.getClass();
        n0Var.getClass();
        m0Var.params_ = n0Var;
    }

    public final n0 A() {
        n0 n0Var = this.params_;
        return n0Var == null ? n0.y() : n0Var;
    }

    public final int B() {
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
                return new com.google.crypto.tink.shaded.protobuf.b0(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\t", new Object[]{"version_", "params_"});
            case 3:
                return new m0();
            case 4:
                return new l0(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case O.j.STRING_SET_FIELD_NUMBER /* 6 */:
                com.google.crypto.tink.shaded.protobuf.X c0341v = PARSER;
                if (c0341v == null) {
                    synchronized (m0.class) {
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

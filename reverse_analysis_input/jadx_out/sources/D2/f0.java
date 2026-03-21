package D2;

import com.google.crypto.tink.shaded.protobuf.AbstractC0342w;
import com.google.crypto.tink.shaded.protobuf.C0341v;

/* JADX INFO: loaded from: classes.dex */
public final class f0 extends AbstractC0342w {
    private static final f0 DEFAULT_INSTANCE;
    public static final int KEY_DATA_FIELD_NUMBER = 1;
    public static final int KEY_ID_FIELD_NUMBER = 3;
    public static final int OUTPUT_PREFIX_TYPE_FIELD_NUMBER = 4;
    private static volatile com.google.crypto.tink.shaded.protobuf.X PARSER = null;
    public static final int STATUS_FIELD_NUMBER = 2;
    private Y keyData_;
    private int keyId_;
    private int outputPrefixType_;
    private int status_;

    static {
        f0 f0Var = new f0();
        DEFAULT_INSTANCE = f0Var;
        AbstractC0342w.v(f0.class, f0Var);
    }

    public static void A(f0 f0Var) {
        Z z4 = Z.f571n;
        f0Var.getClass();
        f0Var.status_ = z4.a();
    }

    public static void B(f0 f0Var, int i) {
        f0Var.keyId_ = i;
    }

    public static e0 H() {
        return (e0) DEFAULT_INSTANCE.j();
    }

    public static void y(f0 f0Var, Y y) {
        f0Var.getClass();
        f0Var.keyData_ = y;
    }

    public static void z(f0 f0Var, r0 r0Var) {
        f0Var.getClass();
        f0Var.outputPrefixType_ = r0Var.b();
    }

    public final Y C() {
        Y y = this.keyData_;
        return y == null ? Y.B() : y;
    }

    public final int D() {
        return this.keyId_;
    }

    public final r0 E() {
        r0 r0VarA = r0.a(this.outputPrefixType_);
        return r0VarA == null ? r0.f582r : r0VarA;
    }

    public final Z F() {
        int i = this.status_;
        Z z4 = i != 0 ? i != 1 ? i != 2 ? i != 3 ? null : Z.f573p : Z.f572o : Z.f571n : Z.f570m;
        return z4 == null ? Z.f574q : z4;
    }

    public final boolean G() {
        return this.keyData_ != null;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC0342w
    public final Object k(int i) {
        switch (O.i.b(i)) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new com.google.crypto.tink.shaded.protobuf.b0(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\t\u0002\f\u0003\u000b\u0004\f", new Object[]{"keyData_", "status_", "keyId_", "outputPrefixType_"});
            case 3:
                return new f0();
            case 4:
                return new e0(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case O.j.STRING_SET_FIELD_NUMBER /* 6 */:
                com.google.crypto.tink.shaded.protobuf.X c0341v = PARSER;
                if (c0341v == null) {
                    synchronized (f0.class) {
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

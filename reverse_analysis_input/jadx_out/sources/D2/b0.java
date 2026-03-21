package D2;

import com.google.crypto.tink.shaded.protobuf.AbstractC0329i;
import com.google.crypto.tink.shaded.protobuf.AbstractC0342w;
import com.google.crypto.tink.shaded.protobuf.C0328h;
import com.google.crypto.tink.shaded.protobuf.C0341v;

/* JADX INFO: loaded from: classes.dex */
public final class b0 extends AbstractC0342w {
    private static final b0 DEFAULT_INSTANCE;
    public static final int OUTPUT_PREFIX_TYPE_FIELD_NUMBER = 3;
    private static volatile com.google.crypto.tink.shaded.protobuf.X PARSER = null;
    public static final int TYPE_URL_FIELD_NUMBER = 1;
    public static final int VALUE_FIELD_NUMBER = 2;
    private int outputPrefixType_;
    private String typeUrl_ = "";
    private AbstractC0329i value_ = AbstractC0329i.f5205m;

    static {
        b0 b0Var = new b0();
        DEFAULT_INSTANCE = b0Var;
        AbstractC0342w.v(b0.class, b0Var);
    }

    public static void A(b0 b0Var, r0 r0Var) {
        b0Var.getClass();
        b0Var.outputPrefixType_ = r0Var.b();
    }

    public static b0 B() {
        return DEFAULT_INSTANCE;
    }

    public static a0 F() {
        return (a0) DEFAULT_INSTANCE.j();
    }

    public static void y(b0 b0Var, String str) {
        b0Var.getClass();
        str.getClass();
        b0Var.typeUrl_ = str;
    }

    public static void z(b0 b0Var, C0328h c0328h) {
        b0Var.getClass();
        b0Var.value_ = c0328h;
    }

    public final r0 C() {
        r0 r0VarA = r0.a(this.outputPrefixType_);
        return r0VarA == null ? r0.f582r : r0VarA;
    }

    public final String D() {
        return this.typeUrl_;
    }

    public final AbstractC0329i E() {
        return this.value_;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC0342w
    public final Object k(int i) {
        switch (O.i.b(i)) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new com.google.crypto.tink.shaded.protobuf.b0(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\n\u0003\f", new Object[]{"typeUrl_", "value_", "outputPrefixType_"});
            case 3:
                return new b0();
            case 4:
                return new a0(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case O.j.STRING_SET_FIELD_NUMBER /* 6 */:
                com.google.crypto.tink.shaded.protobuf.X c0341v = PARSER;
                if (c0341v == null) {
                    synchronized (b0.class) {
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

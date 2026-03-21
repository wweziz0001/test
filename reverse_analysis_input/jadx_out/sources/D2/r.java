package D2;

import com.google.crypto.tink.shaded.protobuf.AbstractC0329i;
import com.google.crypto.tink.shaded.protobuf.AbstractC0342w;
import com.google.crypto.tink.shaded.protobuf.C0328h;
import com.google.crypto.tink.shaded.protobuf.C0335o;
import com.google.crypto.tink.shaded.protobuf.C0341v;

/* JADX INFO: loaded from: classes.dex */
public final class r extends AbstractC0342w {
    private static final r DEFAULT_INSTANCE;
    public static final int KEY_VALUE_FIELD_NUMBER = 3;
    public static final int PARAMS_FIELD_NUMBER = 2;
    private static volatile com.google.crypto.tink.shaded.protobuf.X PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 1;
    private AbstractC0329i keyValue_ = AbstractC0329i.f5205m;
    private C0049v params_;
    private int version_;

    static {
        r rVar = new r();
        DEFAULT_INSTANCE = rVar;
        AbstractC0342w.v(r.class, rVar);
    }

    public static void A(r rVar, C0328h c0328h) {
        rVar.getClass();
        rVar.keyValue_ = c0328h;
    }

    public static C0045q E() {
        return (C0045q) DEFAULT_INSTANCE.j();
    }

    public static r F(AbstractC0329i abstractC0329i, C0335o c0335o) {
        return (r) AbstractC0342w.t(DEFAULT_INSTANCE, abstractC0329i, c0335o);
    }

    public static void y(r rVar) {
        rVar.version_ = 0;
    }

    public static void z(r rVar, C0049v c0049v) {
        rVar.getClass();
        c0049v.getClass();
        rVar.params_ = c0049v;
    }

    public final AbstractC0329i B() {
        return this.keyValue_;
    }

    public final C0049v C() {
        C0049v c0049v = this.params_;
        return c0049v == null ? C0049v.z() : c0049v;
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
                return new com.google.crypto.tink.shaded.protobuf.b0(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\n", new Object[]{"version_", "params_", "keyValue_"});
            case 3:
                return new r();
            case 4:
                return new C0045q(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case O.j.STRING_SET_FIELD_NUMBER /* 6 */:
                com.google.crypto.tink.shaded.protobuf.X c0341v = PARSER;
                if (c0341v == null) {
                    synchronized (r.class) {
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

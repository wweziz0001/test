package D2;

import com.google.crypto.tink.shaded.protobuf.AbstractC0329i;
import com.google.crypto.tink.shaded.protobuf.AbstractC0342w;
import com.google.crypto.tink.shaded.protobuf.C0328h;
import com.google.crypto.tink.shaded.protobuf.C0335o;
import com.google.crypto.tink.shaded.protobuf.C0341v;

/* JADX INFO: renamed from: D2.l, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0040l extends AbstractC0342w {
    private static final C0040l DEFAULT_INSTANCE;
    public static final int KEY_VALUE_FIELD_NUMBER = 3;
    public static final int PARAMS_FIELD_NUMBER = 2;
    private static volatile com.google.crypto.tink.shaded.protobuf.X PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 1;
    private AbstractC0329i keyValue_ = AbstractC0329i.f5205m;
    private C0044p params_;
    private int version_;

    static {
        C0040l c0040l = new C0040l();
        DEFAULT_INSTANCE = c0040l;
        AbstractC0342w.v(C0040l.class, c0040l);
    }

    public static void A(C0040l c0040l, C0328h c0328h) {
        c0040l.getClass();
        c0040l.keyValue_ = c0328h;
    }

    public static C0040l B() {
        return DEFAULT_INSTANCE;
    }

    public static C0039k F() {
        return (C0039k) DEFAULT_INSTANCE.j();
    }

    public static C0040l G(AbstractC0329i abstractC0329i, C0335o c0335o) {
        return (C0040l) AbstractC0342w.t(DEFAULT_INSTANCE, abstractC0329i, c0335o);
    }

    public static void y(C0040l c0040l) {
        c0040l.version_ = 0;
    }

    public static void z(C0040l c0040l, C0044p c0044p) {
        c0040l.getClass();
        c0044p.getClass();
        c0040l.params_ = c0044p;
    }

    public final AbstractC0329i C() {
        return this.keyValue_;
    }

    public final C0044p D() {
        C0044p c0044p = this.params_;
        return c0044p == null ? C0044p.z() : c0044p;
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
                return new C0040l();
            case 4:
                return new C0039k(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case O.j.STRING_SET_FIELD_NUMBER /* 6 */:
                com.google.crypto.tink.shaded.protobuf.X c0341v = PARSER;
                if (c0341v == null) {
                    synchronized (C0040l.class) {
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

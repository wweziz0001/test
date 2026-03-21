package D2;

import com.google.crypto.tink.shaded.protobuf.AbstractC0329i;
import com.google.crypto.tink.shaded.protobuf.AbstractC0342w;
import com.google.crypto.tink.shaded.protobuf.C0328h;
import com.google.crypto.tink.shaded.protobuf.C0335o;
import com.google.crypto.tink.shaded.protobuf.C0341v;

/* JADX INFO: renamed from: D2.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0030b extends AbstractC0342w {
    private static final C0030b DEFAULT_INSTANCE;
    public static final int KEY_VALUE_FIELD_NUMBER = 2;
    public static final int PARAMS_FIELD_NUMBER = 3;
    private static volatile com.google.crypto.tink.shaded.protobuf.X PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 1;
    private AbstractC0329i keyValue_ = AbstractC0329i.f5205m;
    private C0034f params_;
    private int version_;

    static {
        C0030b c0030b = new C0030b();
        DEFAULT_INSTANCE = c0030b;
        AbstractC0342w.v(C0030b.class, c0030b);
    }

    public static void A(C0030b c0030b, C0034f c0034f) {
        c0030b.getClass();
        c0034f.getClass();
        c0030b.params_ = c0034f;
    }

    public static C0029a E() {
        return (C0029a) DEFAULT_INSTANCE.j();
    }

    public static C0030b F(AbstractC0329i abstractC0329i, C0335o c0335o) {
        return (C0030b) AbstractC0342w.t(DEFAULT_INSTANCE, abstractC0329i, c0335o);
    }

    public static void y(C0030b c0030b) {
        c0030b.version_ = 0;
    }

    public static void z(C0030b c0030b, C0328h c0328h) {
        c0030b.getClass();
        c0030b.keyValue_ = c0328h;
    }

    public final AbstractC0329i B() {
        return this.keyValue_;
    }

    public final C0034f C() {
        C0034f c0034f = this.params_;
        return c0034f == null ? C0034f.z() : c0034f;
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
                return new com.google.crypto.tink.shaded.protobuf.b0(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\n\u0003\t", new Object[]{"version_", "keyValue_", "params_"});
            case 3:
                return new C0030b();
            case 4:
                return new C0029a(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case O.j.STRING_SET_FIELD_NUMBER /* 6 */:
                com.google.crypto.tink.shaded.protobuf.X c0341v = PARSER;
                if (c0341v == null) {
                    synchronized (C0030b.class) {
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

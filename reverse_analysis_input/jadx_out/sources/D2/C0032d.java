package D2;

import com.google.crypto.tink.shaded.protobuf.AbstractC0329i;
import com.google.crypto.tink.shaded.protobuf.AbstractC0342w;
import com.google.crypto.tink.shaded.protobuf.C0335o;
import com.google.crypto.tink.shaded.protobuf.C0341v;

/* JADX INFO: renamed from: D2.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0032d extends AbstractC0342w {
    private static final C0032d DEFAULT_INSTANCE;
    public static final int KEY_SIZE_FIELD_NUMBER = 1;
    public static final int PARAMS_FIELD_NUMBER = 2;
    private static volatile com.google.crypto.tink.shaded.protobuf.X PARSER;
    private int keySize_;
    private C0034f params_;

    static {
        C0032d c0032d = new C0032d();
        DEFAULT_INSTANCE = c0032d;
        AbstractC0342w.v(C0032d.class, c0032d);
    }

    public static C0031c C() {
        return (C0031c) DEFAULT_INSTANCE.j();
    }

    public static C0032d D(AbstractC0329i abstractC0329i, C0335o c0335o) {
        return (C0032d) AbstractC0342w.t(DEFAULT_INSTANCE, abstractC0329i, c0335o);
    }

    public static void y(C0032d c0032d) {
        c0032d.keySize_ = 32;
    }

    public static void z(C0032d c0032d, C0034f c0034f) {
        c0032d.getClass();
        c0032d.params_ = c0034f;
    }

    public final int A() {
        return this.keySize_;
    }

    public final C0034f B() {
        C0034f c0034f = this.params_;
        return c0034f == null ? C0034f.z() : c0034f;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC0342w
    public final Object k(int i) {
        switch (O.i.b(i)) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new com.google.crypto.tink.shaded.protobuf.b0(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\t", new Object[]{"keySize_", "params_"});
            case 3:
                return new C0032d();
            case 4:
                return new C0031c(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case O.j.STRING_SET_FIELD_NUMBER /* 6 */:
                com.google.crypto.tink.shaded.protobuf.X c0341v = PARSER;
                if (c0341v == null) {
                    synchronized (C0032d.class) {
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

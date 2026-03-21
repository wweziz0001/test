package D2;

import com.google.crypto.tink.shaded.protobuf.AbstractC0329i;
import com.google.crypto.tink.shaded.protobuf.AbstractC0342w;
import com.google.crypto.tink.shaded.protobuf.C0335o;
import com.google.crypto.tink.shaded.protobuf.C0341v;

/* JADX INFO: renamed from: D2.n, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0042n extends AbstractC0342w {
    private static final C0042n DEFAULT_INSTANCE;
    public static final int KEY_SIZE_FIELD_NUMBER = 2;
    public static final int PARAMS_FIELD_NUMBER = 1;
    private static volatile com.google.crypto.tink.shaded.protobuf.X PARSER;
    private int keySize_;
    private C0044p params_;

    static {
        C0042n c0042n = new C0042n();
        DEFAULT_INSTANCE = c0042n;
        AbstractC0342w.v(C0042n.class, c0042n);
    }

    public static C0042n A() {
        return DEFAULT_INSTANCE;
    }

    public static C0041m D() {
        return (C0041m) DEFAULT_INSTANCE.j();
    }

    public static C0042n E(AbstractC0329i abstractC0329i, C0335o c0335o) {
        return (C0042n) AbstractC0342w.t(DEFAULT_INSTANCE, abstractC0329i, c0335o);
    }

    public static void y(C0042n c0042n, C0044p c0044p) {
        c0042n.getClass();
        c0042n.params_ = c0044p;
    }

    public static void z(C0042n c0042n, int i) {
        c0042n.keySize_ = i;
    }

    public final int B() {
        return this.keySize_;
    }

    public final C0044p C() {
        C0044p c0044p = this.params_;
        return c0044p == null ? C0044p.z() : c0044p;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC0342w
    public final Object k(int i) {
        switch (O.i.b(i)) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new com.google.crypto.tink.shaded.protobuf.b0(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002\u000b", new Object[]{"params_", "keySize_"});
            case 3:
                return new C0042n();
            case 4:
                return new C0041m(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case O.j.STRING_SET_FIELD_NUMBER /* 6 */:
                com.google.crypto.tink.shaded.protobuf.X c0341v = PARSER;
                if (c0341v == null) {
                    synchronized (C0042n.class) {
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

package D2;

import com.google.crypto.tink.shaded.protobuf.AbstractC0329i;
import com.google.crypto.tink.shaded.protobuf.AbstractC0342w;
import com.google.crypto.tink.shaded.protobuf.C0335o;
import com.google.crypto.tink.shaded.protobuf.C0341v;

/* JADX INFO: renamed from: D2.t, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0047t extends AbstractC0342w {
    private static final C0047t DEFAULT_INSTANCE;
    public static final int KEY_SIZE_FIELD_NUMBER = 2;
    public static final int PARAMS_FIELD_NUMBER = 1;
    private static volatile com.google.crypto.tink.shaded.protobuf.X PARSER;
    private int keySize_;
    private C0049v params_;

    static {
        C0047t c0047t = new C0047t();
        DEFAULT_INSTANCE = c0047t;
        AbstractC0342w.v(C0047t.class, c0047t);
    }

    public static C0046s C() {
        return (C0046s) DEFAULT_INSTANCE.j();
    }

    public static C0047t D(AbstractC0329i abstractC0329i, C0335o c0335o) {
        return (C0047t) AbstractC0342w.t(DEFAULT_INSTANCE, abstractC0329i, c0335o);
    }

    public static void y(C0047t c0047t, C0049v c0049v) {
        c0047t.getClass();
        c0047t.params_ = c0049v;
    }

    public static void z(C0047t c0047t, int i) {
        c0047t.keySize_ = i;
    }

    public final int A() {
        return this.keySize_;
    }

    public final C0049v B() {
        C0049v c0049v = this.params_;
        return c0049v == null ? C0049v.z() : c0049v;
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
                return new C0047t();
            case 4:
                return new C0046s(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case O.j.STRING_SET_FIELD_NUMBER /* 6 */:
                com.google.crypto.tink.shaded.protobuf.X c0341v = PARSER;
                if (c0341v == null) {
                    synchronized (C0047t.class) {
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

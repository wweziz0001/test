package D2;

import com.google.crypto.tink.shaded.protobuf.AbstractC0342w;
import com.google.crypto.tink.shaded.protobuf.C0341v;

/* JADX INFO: renamed from: D2.v, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0049v extends AbstractC0342w {
    private static final C0049v DEFAULT_INSTANCE;
    public static final int IV_SIZE_FIELD_NUMBER = 1;
    private static volatile com.google.crypto.tink.shaded.protobuf.X PARSER;
    private int ivSize_;

    static {
        C0049v c0049v = new C0049v();
        DEFAULT_INSTANCE = c0049v;
        AbstractC0342w.v(C0049v.class, c0049v);
    }

    public static C0048u B() {
        return (C0048u) DEFAULT_INSTANCE.j();
    }

    public static void y(C0049v c0049v) {
        c0049v.ivSize_ = 16;
    }

    public static C0049v z() {
        return DEFAULT_INSTANCE;
    }

    public final int A() {
        return this.ivSize_;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC0342w
    public final Object k(int i) {
        switch (O.i.b(i)) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new com.google.crypto.tink.shaded.protobuf.b0(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", new Object[]{"ivSize_"});
            case 3:
                return new C0049v();
            case 4:
                return new C0048u(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case O.j.STRING_SET_FIELD_NUMBER /* 6 */:
                com.google.crypto.tink.shaded.protobuf.X c0341v = PARSER;
                if (c0341v == null) {
                    synchronized (C0049v.class) {
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

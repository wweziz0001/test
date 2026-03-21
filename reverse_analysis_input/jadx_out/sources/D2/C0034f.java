package D2;

import com.google.crypto.tink.shaded.protobuf.AbstractC0342w;
import com.google.crypto.tink.shaded.protobuf.C0341v;

/* JADX INFO: renamed from: D2.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0034f extends AbstractC0342w {
    private static final C0034f DEFAULT_INSTANCE;
    private static volatile com.google.crypto.tink.shaded.protobuf.X PARSER = null;
    public static final int TAG_SIZE_FIELD_NUMBER = 1;
    private int tagSize_;

    static {
        C0034f c0034f = new C0034f();
        DEFAULT_INSTANCE = c0034f;
        AbstractC0342w.v(C0034f.class, c0034f);
    }

    public static C0033e B() {
        return (C0033e) DEFAULT_INSTANCE.j();
    }

    public static void y(C0034f c0034f) {
        c0034f.tagSize_ = 16;
    }

    public static C0034f z() {
        return DEFAULT_INSTANCE;
    }

    public final int A() {
        return this.tagSize_;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC0342w
    public final Object k(int i) {
        switch (O.i.b(i)) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new com.google.crypto.tink.shaded.protobuf.b0(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", new Object[]{"tagSize_"});
            case 3:
                return new C0034f();
            case 4:
                return new C0033e(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case O.j.STRING_SET_FIELD_NUMBER /* 6 */:
                com.google.crypto.tink.shaded.protobuf.X c0341v = PARSER;
                if (c0341v == null) {
                    synchronized (C0034f.class) {
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

package D2;

import com.google.crypto.tink.shaded.protobuf.AbstractC0342w;
import com.google.crypto.tink.shaded.protobuf.C0341v;

/* JADX INFO: loaded from: classes.dex */
public final class V extends AbstractC0342w {
    private static final V DEFAULT_INSTANCE;
    public static final int HASH_FIELD_NUMBER = 1;
    private static volatile com.google.crypto.tink.shaded.protobuf.X PARSER = null;
    public static final int TAG_SIZE_FIELD_NUMBER = 2;
    private int hash_;
    private int tagSize_;

    static {
        V v4 = new V();
        DEFAULT_INSTANCE = v4;
        AbstractC0342w.v(V.class, v4);
    }

    public static V A() {
        return DEFAULT_INSTANCE;
    }

    public static U D() {
        return (U) DEFAULT_INSTANCE.j();
    }

    public static void y(V v4, O o4) {
        v4.getClass();
        v4.hash_ = o4.a();
    }

    public static void z(V v4, int i) {
        v4.tagSize_ = i;
    }

    public final O B() {
        int i = this.hash_;
        O o4 = i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? null : O.f558r : O.f557q : O.f556p : O.f555o : O.f554n : O.f553m;
        return o4 == null ? O.f559s : o4;
    }

    public final int C() {
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
                return new com.google.crypto.tink.shaded.protobuf.b0(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002\u000b", new Object[]{"hash_", "tagSize_"});
            case 3:
                return new V();
            case 4:
                return new U(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case O.j.STRING_SET_FIELD_NUMBER /* 6 */:
                com.google.crypto.tink.shaded.protobuf.X c0341v = PARSER;
                if (c0341v == null) {
                    synchronized (V.class) {
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

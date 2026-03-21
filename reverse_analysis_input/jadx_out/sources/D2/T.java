package D2;

import com.google.crypto.tink.shaded.protobuf.AbstractC0329i;
import com.google.crypto.tink.shaded.protobuf.AbstractC0342w;
import com.google.crypto.tink.shaded.protobuf.C0335o;
import com.google.crypto.tink.shaded.protobuf.C0341v;

/* JADX INFO: loaded from: classes.dex */
public final class T extends AbstractC0342w {
    private static final T DEFAULT_INSTANCE;
    public static final int KEY_SIZE_FIELD_NUMBER = 2;
    public static final int PARAMS_FIELD_NUMBER = 1;
    private static volatile com.google.crypto.tink.shaded.protobuf.X PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 3;
    private int keySize_;
    private V params_;
    private int version_;

    static {
        T t4 = new T();
        DEFAULT_INSTANCE = t4;
        AbstractC0342w.v(T.class, t4);
    }

    public static T A() {
        return DEFAULT_INSTANCE;
    }

    public static S D() {
        return (S) DEFAULT_INSTANCE.j();
    }

    public static T E(AbstractC0329i abstractC0329i, C0335o c0335o) {
        return (T) AbstractC0342w.t(DEFAULT_INSTANCE, abstractC0329i, c0335o);
    }

    public static void y(T t4, V v4) {
        t4.getClass();
        t4.params_ = v4;
    }

    public static void z(T t4, int i) {
        t4.keySize_ = i;
    }

    public final int B() {
        return this.keySize_;
    }

    public final V C() {
        V v4 = this.params_;
        return v4 == null ? V.A() : v4;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC0342w
    public final Object k(int i) {
        switch (O.i.b(i)) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new com.google.crypto.tink.shaded.protobuf.b0(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\t\u0002\u000b\u0003\u000b", new Object[]{"params_", "keySize_", "version_"});
            case 3:
                return new T();
            case 4:
                return new S(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case O.j.STRING_SET_FIELD_NUMBER /* 6 */:
                com.google.crypto.tink.shaded.protobuf.X c0341v = PARSER;
                if (c0341v == null) {
                    synchronized (T.class) {
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

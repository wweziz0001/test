package D2;

import com.google.crypto.tink.shaded.protobuf.AbstractC0329i;
import com.google.crypto.tink.shaded.protobuf.AbstractC0342w;
import com.google.crypto.tink.shaded.protobuf.C0335o;
import com.google.crypto.tink.shaded.protobuf.C0341v;

/* JADX INFO: renamed from: D2.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0038j extends AbstractC0342w {
    public static final int AES_CTR_KEY_FORMAT_FIELD_NUMBER = 1;
    private static final C0038j DEFAULT_INSTANCE;
    public static final int HMAC_KEY_FORMAT_FIELD_NUMBER = 2;
    private static volatile com.google.crypto.tink.shaded.protobuf.X PARSER;
    private C0042n aesCtrKeyFormat_;
    private T hmacKeyFormat_;

    static {
        C0038j c0038j = new C0038j();
        DEFAULT_INSTANCE = c0038j;
        AbstractC0342w.v(C0038j.class, c0038j);
    }

    public static C0037i C() {
        return (C0037i) DEFAULT_INSTANCE.j();
    }

    public static C0038j D(AbstractC0329i abstractC0329i, C0335o c0335o) {
        return (C0038j) AbstractC0342w.t(DEFAULT_INSTANCE, abstractC0329i, c0335o);
    }

    public static void y(C0038j c0038j, C0042n c0042n) {
        c0038j.getClass();
        c0038j.aesCtrKeyFormat_ = c0042n;
    }

    public static void z(C0038j c0038j, T t4) {
        c0038j.getClass();
        c0038j.hmacKeyFormat_ = t4;
    }

    public final C0042n A() {
        C0042n c0042n = this.aesCtrKeyFormat_;
        return c0042n == null ? C0042n.A() : c0042n;
    }

    public final T B() {
        T t4 = this.hmacKeyFormat_;
        return t4 == null ? T.A() : t4;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC0342w
    public final Object k(int i) {
        switch (O.i.b(i)) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new com.google.crypto.tink.shaded.protobuf.b0(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002\t", new Object[]{"aesCtrKeyFormat_", "hmacKeyFormat_"});
            case 3:
                return new C0038j();
            case 4:
                return new C0037i(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case O.j.STRING_SET_FIELD_NUMBER /* 6 */:
                com.google.crypto.tink.shaded.protobuf.X c0341v = PARSER;
                if (c0341v == null) {
                    synchronized (C0038j.class) {
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

package D2;

import com.google.crypto.tink.shaded.protobuf.AbstractC0329i;
import com.google.crypto.tink.shaded.protobuf.AbstractC0342w;
import com.google.crypto.tink.shaded.protobuf.C0335o;
import com.google.crypto.tink.shaded.protobuf.C0341v;

/* JADX INFO: loaded from: classes.dex */
public final class L extends AbstractC0342w {
    private static final L DEFAULT_INSTANCE;
    private static volatile com.google.crypto.tink.shaded.protobuf.X PARSER;

    static {
        L l3 = new L();
        DEFAULT_INSTANCE = l3;
        AbstractC0342w.v(L.class, l3);
    }

    public static L y() {
        return DEFAULT_INSTANCE;
    }

    public static L z(AbstractC0329i abstractC0329i, C0335o c0335o) {
        return (L) AbstractC0342w.t(DEFAULT_INSTANCE, abstractC0329i, c0335o);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC0342w
    public final Object k(int i) {
        switch (O.i.b(i)) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new com.google.crypto.tink.shaded.protobuf.b0(DEFAULT_INSTANCE, "\u0000\u0000", null);
            case 3:
                return new L();
            case 4:
                return new K(DEFAULT_INSTANCE, 0);
            case 5:
                return DEFAULT_INSTANCE;
            case O.j.STRING_SET_FIELD_NUMBER /* 6 */:
                com.google.crypto.tink.shaded.protobuf.X c0341v = PARSER;
                if (c0341v == null) {
                    synchronized (L.class) {
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

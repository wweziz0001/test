package D2;

import com.google.crypto.tink.shaded.protobuf.AbstractC0329i;
import com.google.crypto.tink.shaded.protobuf.AbstractC0342w;
import com.google.crypto.tink.shaded.protobuf.C0328h;
import com.google.crypto.tink.shaded.protobuf.C0341v;

/* JADX INFO: loaded from: classes.dex */
public final class Y extends AbstractC0342w {
    private static final Y DEFAULT_INSTANCE;
    public static final int KEY_MATERIAL_TYPE_FIELD_NUMBER = 3;
    private static volatile com.google.crypto.tink.shaded.protobuf.X PARSER = null;
    public static final int TYPE_URL_FIELD_NUMBER = 1;
    public static final int VALUE_FIELD_NUMBER = 2;
    private int keyMaterialType_;
    private String typeUrl_ = "";
    private AbstractC0329i value_ = AbstractC0329i.f5205m;

    static {
        Y y = new Y();
        DEFAULT_INSTANCE = y;
        AbstractC0342w.v(Y.class, y);
    }

    public static void A(Y y, X x4) {
        y.getClass();
        if (x4 != X.f567r) {
            y.keyMaterialType_ = x4.f569l;
        } else {
            x4.getClass();
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }
    }

    public static Y B() {
        return DEFAULT_INSTANCE;
    }

    public static W F() {
        return (W) DEFAULT_INSTANCE.j();
    }

    public static void y(Y y, String str) {
        y.getClass();
        str.getClass();
        y.typeUrl_ = str;
    }

    public static void z(Y y, C0328h c0328h) {
        y.getClass();
        y.value_ = c0328h;
    }

    public final X C() {
        int i = this.keyMaterialType_;
        X x4 = i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 4 ? null : X.f566q : X.f565p : X.f564o : X.f563n : X.f562m;
        return x4 == null ? X.f567r : x4;
    }

    public final String D() {
        return this.typeUrl_;
    }

    public final AbstractC0329i E() {
        return this.value_;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC0342w
    public final Object k(int i) {
        switch (O.i.b(i)) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new com.google.crypto.tink.shaded.protobuf.b0(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\n\u0003\f", new Object[]{"typeUrl_", "value_", "keyMaterialType_"});
            case 3:
                return new Y();
            case 4:
                return new W(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case O.j.STRING_SET_FIELD_NUMBER /* 6 */:
                com.google.crypto.tink.shaded.protobuf.X c0341v = PARSER;
                if (c0341v == null) {
                    synchronized (Y.class) {
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

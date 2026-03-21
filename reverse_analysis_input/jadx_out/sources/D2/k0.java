package D2;

import com.google.crypto.tink.shaded.protobuf.AbstractC0322b;
import com.google.crypto.tink.shaded.protobuf.AbstractC0342w;
import com.google.crypto.tink.shaded.protobuf.C0341v;
import com.google.crypto.tink.shaded.protobuf.InterfaceC0345z;

/* JADX INFO: loaded from: classes.dex */
public final class k0 extends AbstractC0342w {
    private static final k0 DEFAULT_INSTANCE;
    public static final int KEY_INFO_FIELD_NUMBER = 2;
    private static volatile com.google.crypto.tink.shaded.protobuf.X PARSER = null;
    public static final int PRIMARY_KEY_ID_FIELD_NUMBER = 1;
    private InterfaceC0345z keyInfo_ = com.google.crypto.tink.shaded.protobuf.a0.f5177o;
    private int primaryKeyId_;

    static {
        k0 k0Var = new k0();
        DEFAULT_INSTANCE = k0Var;
        AbstractC0342w.v(k0.class, k0Var);
    }

    public static h0 B() {
        return (h0) DEFAULT_INSTANCE.j();
    }

    public static void y(k0 k0Var, int i) {
        k0Var.primaryKeyId_ = i;
    }

    public static void z(k0 k0Var, j0 j0Var) {
        k0Var.getClass();
        InterfaceC0345z interfaceC0345z = k0Var.keyInfo_;
        if (!((AbstractC0322b) interfaceC0345z).f5180l) {
            int size = interfaceC0345z.size();
            k0Var.keyInfo_ = interfaceC0345z.c(size == 0 ? 10 : size * 2);
        }
        k0Var.keyInfo_.add(j0Var);
    }

    public final j0 A() {
        return (j0) this.keyInfo_.get(0);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC0342w
    public final Object k(int i) {
        switch (O.i.b(i)) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new com.google.crypto.tink.shaded.protobuf.b0(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u000b\u0002\u001b", new Object[]{"primaryKeyId_", "keyInfo_", j0.class});
            case 3:
                return new k0();
            case 4:
                return new h0(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case O.j.STRING_SET_FIELD_NUMBER /* 6 */:
                com.google.crypto.tink.shaded.protobuf.X c0341v = PARSER;
                if (c0341v == null) {
                    synchronized (k0.class) {
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

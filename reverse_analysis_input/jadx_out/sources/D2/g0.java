package D2;

import com.google.crypto.tink.shaded.protobuf.AbstractC0322b;
import com.google.crypto.tink.shaded.protobuf.AbstractC0342w;
import com.google.crypto.tink.shaded.protobuf.C0324d;
import com.google.crypto.tink.shaded.protobuf.C0331k;
import com.google.crypto.tink.shaded.protobuf.C0335o;
import com.google.crypto.tink.shaded.protobuf.C0341v;
import com.google.crypto.tink.shaded.protobuf.InterfaceC0345z;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class g0 extends AbstractC0342w {
    private static final g0 DEFAULT_INSTANCE;
    public static final int KEY_FIELD_NUMBER = 2;
    private static volatile com.google.crypto.tink.shaded.protobuf.X PARSER = null;
    public static final int PRIMARY_KEY_ID_FIELD_NUMBER = 1;
    private InterfaceC0345z key_ = com.google.crypto.tink.shaded.protobuf.a0.f5177o;
    private int primaryKeyId_;

    static {
        g0 g0Var = new g0();
        DEFAULT_INSTANCE = g0Var;
        AbstractC0342w.v(g0.class, g0Var);
    }

    public static d0 E() {
        return (d0) DEFAULT_INSTANCE.j();
    }

    public static g0 F(ByteArrayInputStream byteArrayInputStream, C0335o c0335o) throws com.google.crypto.tink.shaded.protobuf.C {
        AbstractC0342w abstractC0342wU = AbstractC0342w.u(DEFAULT_INSTANCE, new C0331k(byteArrayInputStream), c0335o);
        AbstractC0342w.g(abstractC0342wU);
        return (g0) abstractC0342wU;
    }

    public static g0 G(byte[] bArr, C0335o c0335o) {
        g0 g0Var = DEFAULT_INSTANCE;
        int length = bArr.length;
        AbstractC0342w abstractC0342wS = g0Var.s();
        try {
            com.google.crypto.tink.shaded.protobuf.Z z4 = com.google.crypto.tink.shaded.protobuf.Z.f5174c;
            z4.getClass();
            com.google.crypto.tink.shaded.protobuf.c0 c0VarA = z4.a(abstractC0342wS.getClass());
            C0324d c0324d = new C0324d();
            c0335o.getClass();
            c0VarA.g(abstractC0342wS, bArr, 0, length, c0324d);
            c0VarA.d(abstractC0342wS);
            AbstractC0342w.g(abstractC0342wS);
            return (g0) abstractC0342wS;
        } catch (com.google.crypto.tink.shaded.protobuf.C e5) {
            if (e5.f5130l) {
                throw new com.google.crypto.tink.shaded.protobuf.C(e5.getMessage(), e5);
            }
            throw e5;
        } catch (com.google.crypto.tink.shaded.protobuf.e0 e6) {
            throw new com.google.crypto.tink.shaded.protobuf.C(e6.getMessage());
        } catch (IOException e7) {
            if (e7.getCause() instanceof com.google.crypto.tink.shaded.protobuf.C) {
                throw ((com.google.crypto.tink.shaded.protobuf.C) e7.getCause());
            }
            throw new com.google.crypto.tink.shaded.protobuf.C(e7.getMessage(), e7);
        } catch (IndexOutOfBoundsException unused) {
            throw com.google.crypto.tink.shaded.protobuf.C.g();
        }
    }

    public static void y(g0 g0Var, int i) {
        g0Var.primaryKeyId_ = i;
    }

    public static void z(g0 g0Var, f0 f0Var) {
        g0Var.getClass();
        InterfaceC0345z interfaceC0345z = g0Var.key_;
        if (!((AbstractC0322b) interfaceC0345z).f5180l) {
            int size = interfaceC0345z.size();
            g0Var.key_ = interfaceC0345z.c(size == 0 ? 10 : size * 2);
        }
        g0Var.key_.add(f0Var);
    }

    public final f0 A(int i) {
        return (f0) this.key_.get(i);
    }

    public final int B() {
        return this.key_.size();
    }

    public final List C() {
        return this.key_;
    }

    public final int D() {
        return this.primaryKeyId_;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC0342w
    public final Object k(int i) {
        switch (O.i.b(i)) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new com.google.crypto.tink.shaded.protobuf.b0(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u000b\u0002\u001b", new Object[]{"primaryKeyId_", "key_", f0.class});
            case 3:
                return new g0();
            case 4:
                return new d0(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case O.j.STRING_SET_FIELD_NUMBER /* 6 */:
                com.google.crypto.tink.shaded.protobuf.X c0341v = PARSER;
                if (c0341v == null) {
                    synchronized (g0.class) {
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

package O;

import androidx.datastore.preferences.protobuf.AbstractC0227t;
import androidx.datastore.preferences.protobuf.AbstractC0229v;
import androidx.datastore.preferences.protobuf.C0217i;
import androidx.datastore.preferences.protobuf.C0219k;
import androidx.datastore.preferences.protobuf.C0222n;
import androidx.datastore.preferences.protobuf.C0228u;
import androidx.datastore.preferences.protobuf.C0233z;
import androidx.datastore.preferences.protobuf.H;
import androidx.datastore.preferences.protobuf.Q;
import androidx.datastore.preferences.protobuf.S;
import androidx.datastore.preferences.protobuf.U;
import androidx.datastore.preferences.protobuf.V;
import androidx.datastore.preferences.protobuf.b0;
import java.io.IOException;
import java.io.InputStream;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class e extends AbstractC0229v {
    private static final e DEFAULT_INSTANCE;
    private static volatile Q PARSER = null;
    public static final int PREFERENCES_FIELD_NUMBER = 1;
    private H preferences_ = H.f4075m;

    static {
        e eVar = new e();
        DEFAULT_INSTANCE = eVar;
        AbstractC0229v.l(e.class, eVar);
    }

    public static H n(e eVar) {
        H h2 = eVar.preferences_;
        if (!h2.f4076l) {
            eVar.preferences_ = h2.b();
        }
        return eVar.preferences_;
    }

    public static c p() {
        return (c) ((AbstractC0227t) DEFAULT_INSTANCE.e(5));
    }

    public static e q(InputStream inputStream) {
        e eVar = DEFAULT_INSTANCE;
        C0217i c0217i = new C0217i(inputStream);
        C0222n c0222nA = C0222n.a();
        AbstractC0229v abstractC0229vK = eVar.k();
        try {
            S s4 = S.f4099c;
            s4.getClass();
            V vA = s4.a(abstractC0229vK.getClass());
            C0219k c0219k = (C0219k) c0217i.f4169b;
            if (c0219k == null) {
                c0219k = new C0219k(c0217i);
            }
            vA.e(abstractC0229vK, c0219k, c0222nA);
            vA.d(abstractC0229vK);
            if (AbstractC0229v.h(abstractC0229vK, true)) {
                return (e) abstractC0229vK;
            }
            throw new C0233z(new b0().getMessage());
        } catch (b0 e5) {
            throw new C0233z(e5.getMessage());
        } catch (C0233z e6) {
            if (e6.f4219l) {
                throw new C0233z(e6.getMessage(), e6);
            }
            throw e6;
        } catch (IOException e7) {
            if (e7.getCause() instanceof C0233z) {
                throw ((C0233z) e7.getCause());
            }
            throw new C0233z(e7.getMessage(), e7);
        } catch (RuntimeException e8) {
            if (e8.getCause() instanceof C0233z) {
                throw ((C0233z) e8.getCause());
            }
            throw e8;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0229v
    public final Object e(int i) {
        switch (i.b(i)) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new U(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"preferences_", d.f1633a});
            case 3:
                return new e();
            case 4:
                return new c(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case j.STRING_SET_FIELD_NUMBER /* 6 */:
                Q c0228u = PARSER;
                if (c0228u == null) {
                    synchronized (e.class) {
                        try {
                            c0228u = PARSER;
                            if (c0228u == null) {
                                c0228u = new C0228u();
                                PARSER = c0228u;
                            }
                        } finally {
                        }
                        break;
                    }
                }
                return c0228u;
            default:
                throw new UnsupportedOperationException();
        }
    }

    public final Map o() {
        return Collections.unmodifiableMap(this.preferences_);
    }
}

package O;

import androidx.datastore.preferences.protobuf.AbstractC0210b;
import androidx.datastore.preferences.protobuf.AbstractC0227t;
import androidx.datastore.preferences.protobuf.AbstractC0229v;
import androidx.datastore.preferences.protobuf.AbstractC0231x;
import androidx.datastore.preferences.protobuf.C0228u;
import androidx.datastore.preferences.protobuf.InterfaceC0230w;
import androidx.datastore.preferences.protobuf.Q;
import androidx.datastore.preferences.protobuf.T;
import androidx.datastore.preferences.protobuf.U;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.RandomAccess;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class g extends AbstractC0229v {
    private static final g DEFAULT_INSTANCE;
    private static volatile Q PARSER = null;
    public static final int STRINGS_FIELD_NUMBER = 1;
    private InterfaceC0230w strings_ = T.f4102o;

    static {
        g gVar = new g();
        DEFAULT_INSTANCE = gVar;
        AbstractC0229v.l(g.class, gVar);
    }

    public static void n(g gVar, Set set) {
        InterfaceC0230w interfaceC0230w = gVar.strings_;
        if (!((AbstractC0210b) interfaceC0230w).f4127l) {
            T t4 = (T) interfaceC0230w;
            int i = t4.f4104n;
            gVar.strings_ = t4.h(i == 0 ? 10 : i * 2);
        }
        RandomAccess randomAccess = gVar.strings_;
        Charset charset = AbstractC0231x.f4217a;
        set.getClass();
        if (randomAccess instanceof ArrayList) {
            ((ArrayList) randomAccess).ensureCapacity(set.size() + ((T) randomAccess).f4104n);
        }
        T t5 = (T) randomAccess;
        int i5 = t5.f4104n;
        for (Object obj : set) {
            if (obj == null) {
                String str = "Element at index " + (t5.f4104n - i5) + " is null.";
                for (int i6 = t5.f4104n - 1; i6 >= i5; i6--) {
                    t5.remove(i6);
                }
                throw new NullPointerException(str);
            }
            t5.add(obj);
        }
    }

    public static g o() {
        return DEFAULT_INSTANCE;
    }

    public static f q() {
        return (f) ((AbstractC0227t) DEFAULT_INSTANCE.e(5));
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0229v
    public final Object e(int i) {
        switch (i.b(i)) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new U(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a", new Object[]{"strings_"});
            case 3:
                return new g();
            case 4:
                return new f(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case j.STRING_SET_FIELD_NUMBER /* 6 */:
                Q c0228u = PARSER;
                if (c0228u == null) {
                    synchronized (g.class) {
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

    public final InterfaceC0230w p() {
        return this.strings_;
    }
}

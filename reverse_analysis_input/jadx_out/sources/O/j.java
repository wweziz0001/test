package O;

import androidx.datastore.preferences.protobuf.AbstractC0227t;
import androidx.datastore.preferences.protobuf.AbstractC0229v;
import androidx.datastore.preferences.protobuf.C0215g;
import androidx.datastore.preferences.protobuf.C0228u;
import androidx.datastore.preferences.protobuf.Q;
import androidx.datastore.preferences.protobuf.U;

/* JADX INFO: loaded from: classes.dex */
public final class j extends AbstractC0229v {
    public static final int BOOLEAN_FIELD_NUMBER = 1;
    public static final int BYTES_FIELD_NUMBER = 8;
    private static final j DEFAULT_INSTANCE;
    public static final int DOUBLE_FIELD_NUMBER = 7;
    public static final int FLOAT_FIELD_NUMBER = 2;
    public static final int INTEGER_FIELD_NUMBER = 3;
    public static final int LONG_FIELD_NUMBER = 4;
    private static volatile Q PARSER = null;
    public static final int STRING_FIELD_NUMBER = 5;
    public static final int STRING_SET_FIELD_NUMBER = 6;
    private int valueCase_ = 0;
    private Object value_;

    static {
        j jVar = new j();
        DEFAULT_INSTANCE = jVar;
        AbstractC0229v.l(j.class, jVar);
    }

    public static h F() {
        return (h) ((AbstractC0227t) DEFAULT_INSTANCE.e(5));
    }

    public static void n(j jVar, long j5) {
        jVar.valueCase_ = 4;
        jVar.value_ = Long.valueOf(j5);
    }

    public static void o(j jVar, String str) {
        jVar.getClass();
        str.getClass();
        jVar.valueCase_ = 5;
        jVar.value_ = str;
    }

    public static void p(j jVar, g gVar) {
        jVar.getClass();
        jVar.value_ = gVar;
        jVar.valueCase_ = 6;
    }

    public static void q(j jVar, double d5) {
        jVar.valueCase_ = 7;
        jVar.value_ = Double.valueOf(d5);
    }

    public static void r(j jVar, C0215g c0215g) {
        jVar.getClass();
        jVar.valueCase_ = 8;
        jVar.value_ = c0215g;
    }

    public static void s(j jVar, boolean z4) {
        jVar.valueCase_ = 1;
        jVar.value_ = Boolean.valueOf(z4);
    }

    public static void t(j jVar, float f2) {
        jVar.valueCase_ = 2;
        jVar.value_ = Float.valueOf(f2);
    }

    public static void u(j jVar, int i) {
        jVar.valueCase_ = 3;
        jVar.value_ = Integer.valueOf(i);
    }

    public static j x() {
        return DEFAULT_INSTANCE;
    }

    public final int A() {
        if (this.valueCase_ == 3) {
            return ((Integer) this.value_).intValue();
        }
        return 0;
    }

    public final long B() {
        if (this.valueCase_ == 4) {
            return ((Long) this.value_).longValue();
        }
        return 0L;
    }

    public final String C() {
        return this.valueCase_ == 5 ? (String) this.value_ : "";
    }

    public final g D() {
        return this.valueCase_ == 6 ? (g) this.value_ : g.o();
    }

    public final int E() {
        switch (this.valueCase_) {
            case 0:
                return 9;
            case 1:
                return 1;
            case 2:
                return 2;
            case 3:
                return 3;
            case 4:
                return 4;
            case 5:
                return 5;
            case STRING_SET_FIELD_NUMBER /* 6 */:
                return 6;
            case DOUBLE_FIELD_NUMBER /* 7 */:
                return 7;
            case BYTES_FIELD_NUMBER /* 8 */:
                return 8;
            default:
                return 0;
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
                return new U(DEFAULT_INSTANCE, "\u0001\b\u0001\u0000\u0001\b\b\u0000\u0000\u0000\u0001:\u0000\u00024\u0000\u00037\u0000\u00045\u0000\u0005;\u0000\u0006<\u0000\u00073\u0000\b=\u0000", new Object[]{"value_", "valueCase_", g.class});
            case 3:
                return new j();
            case 4:
                return new h(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case STRING_SET_FIELD_NUMBER /* 6 */:
                Q c0228u = PARSER;
                if (c0228u == null) {
                    synchronized (j.class) {
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

    public final boolean v() {
        if (this.valueCase_ == 1) {
            return ((Boolean) this.value_).booleanValue();
        }
        return false;
    }

    public final C0215g w() {
        return this.valueCase_ == 8 ? (C0215g) this.value_ : C0215g.f4144n;
    }

    public final double y() {
        if (this.valueCase_ == 7) {
            return ((Double) this.value_).doubleValue();
        }
        return 0.0d;
    }

    public final float z() {
        if (this.valueCase_ == 2) {
            return ((Float) this.value_).floatValue();
        }
        return 0.0f;
    }
}

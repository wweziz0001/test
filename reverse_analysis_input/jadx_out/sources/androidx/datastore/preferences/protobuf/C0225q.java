package androidx.datastore.preferences.protobuf;

import java.util.Collections;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.q, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0225q {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f4189c = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final X f4190a = X.f();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f4191b;

    static {
        new C0225q(0);
    }

    public C0225q() {
    }

    public static void b(C0220l c0220l, q0 q0Var, int i, Object obj) {
        if (q0Var == q0.f4193o) {
            c0220l.H0(i, 3);
            ((AbstractC0209a) obj).b(c0220l);
            c0220l.H0(i, 4);
            return;
        }
        c0220l.H0(i, q0Var.f4197m);
        switch (q0Var.ordinal()) {
            case 0:
                c0220l.C0(Double.doubleToRawLongBits(((Double) obj).doubleValue()));
                break;
            case 1:
                c0220l.A0(Float.floatToRawIntBits(((Float) obj).floatValue()));
                break;
            case 2:
                c0220l.L0(((Long) obj).longValue());
                break;
            case 3:
                c0220l.L0(((Long) obj).longValue());
                break;
            case 4:
                c0220l.E0(((Integer) obj).intValue());
                break;
            case 5:
                c0220l.C0(((Long) obj).longValue());
                break;
            case O.j.STRING_SET_FIELD_NUMBER /* 6 */:
                c0220l.A0(((Integer) obj).intValue());
                break;
            case O.j.DOUBLE_FIELD_NUMBER /* 7 */:
                c0220l.u0(((Boolean) obj).booleanValue() ? (byte) 1 : (byte) 0);
                break;
            case O.j.BYTES_FIELD_NUMBER /* 8 */:
                if (!(obj instanceof C0215g)) {
                    c0220l.G0((String) obj);
                } else {
                    c0220l.y0((C0215g) obj);
                }
                break;
            case 9:
                ((AbstractC0209a) obj).b(c0220l);
                break;
            case 10:
                AbstractC0209a abstractC0209a = (AbstractC0209a) obj;
                c0220l.getClass();
                c0220l.J0(((AbstractC0229v) abstractC0209a).a(null));
                abstractC0209a.b(c0220l);
                break;
            case 11:
                if (!(obj instanceof C0215g)) {
                    byte[] bArr = (byte[]) obj;
                    int length = bArr.length;
                    c0220l.J0(length);
                    c0220l.v0(bArr, 0, length);
                } else {
                    c0220l.y0((C0215g) obj);
                }
                break;
            case 12:
                c0220l.J0(((Integer) obj).intValue());
                break;
            case 13:
                c0220l.E0(((Integer) obj).intValue());
                break;
            case 14:
                c0220l.A0(((Integer) obj).intValue());
                break;
            case 15:
                c0220l.C0(((Long) obj).longValue());
                break;
            case 16:
                int iIntValue = ((Integer) obj).intValue();
                c0220l.J0((iIntValue >> 31) ^ (iIntValue << 1));
                break;
            case 17:
                long jLongValue = ((Long) obj).longValue();
                c0220l.L0((jLongValue >> 63) ^ (jLongValue << 1));
                break;
        }
    }

    public final void a() {
        if (this.f4191b) {
            return;
        }
        X x4 = this.f4190a;
        int size = x4.f4113l.size();
        for (int i = 0; i < size; i++) {
            Map.Entry entryC = x4.c(i);
            if (entryC.getValue() instanceof AbstractC0229v) {
                AbstractC0229v abstractC0229v = (AbstractC0229v) entryC.getValue();
                abstractC0229v.getClass();
                S s4 = S.f4099c;
                s4.getClass();
                s4.a(abstractC0229v.getClass()).d(abstractC0229v);
                abstractC0229v.j();
            }
        }
        if (!x4.f4115n) {
            if (x4.f4113l.size() > 0) {
                x4.c(0).getKey().getClass();
                throw new ClassCastException();
            }
            Iterator it = x4.d().iterator();
            if (it.hasNext()) {
                ((Map.Entry) it.next()).getKey().getClass();
                throw new ClassCastException();
            }
        }
        if (!x4.f4115n) {
            x4.f4114m = x4.f4114m.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(x4.f4114m);
            x4.f4117p = x4.f4117p.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(x4.f4117p);
            x4.f4115n = true;
        }
        this.f4191b = true;
    }

    public final Object clone() {
        C0225q c0225q = new C0225q();
        X x4 = this.f4190a;
        if (x4.f4113l.size() > 0) {
            Map.Entry entryC = x4.c(0);
            if (entryC.getKey() != null) {
                throw new ClassCastException();
            }
            entryC.getValue();
            throw null;
        }
        Iterator it = x4.d().iterator();
        if (!it.hasNext()) {
            return c0225q;
        }
        Map.Entry entry = (Map.Entry) it.next();
        if (entry.getKey() != null) {
            throw new ClassCastException();
        }
        entry.getValue();
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C0225q) {
            return this.f4190a.equals(((C0225q) obj).f4190a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f4190a.hashCode();
    }

    public C0225q(int i) {
        a();
        a();
    }
}

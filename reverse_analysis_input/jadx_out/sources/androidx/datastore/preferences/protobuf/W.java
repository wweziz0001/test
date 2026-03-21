package androidx.datastore.preferences.protobuf;

import java.util.Arrays;
import java.util.List;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes.dex */
public abstract class W {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Class f4109a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final d0 f4110b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final d0 f4111c;

    static {
        Class<?> cls;
        Class<?> cls2;
        S s4 = S.f4099c;
        d0 d0Var = null;
        try {
            cls = Class.forName("androidx.datastore.preferences.protobuf.GeneratedMessage");
        } catch (Throwable unused) {
            cls = null;
        }
        f4109a = cls;
        try {
            S s5 = S.f4099c;
            try {
                cls2 = Class.forName("androidx.datastore.preferences.protobuf.UnknownFieldSetSchema");
            } catch (Throwable unused2) {
                cls2 = null;
            }
            if (cls2 != null) {
                d0Var = (d0) cls2.getConstructor(null).newInstance(null);
            }
        } catch (Throwable unused3) {
        }
        f4110b = d0Var;
        f4111c = new d0();
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public static void A(d0 d0Var, Object obj, Object obj2) {
        d0Var.getClass();
        AbstractC0229v abstractC0229v = (AbstractC0229v) obj;
        c0 c0Var = abstractC0229v.unknownFields;
        c0 c0Var2 = ((AbstractC0229v) obj2).unknownFields;
        c0 c0Var3 = c0.f4130f;
        if (!c0Var3.equals(c0Var2)) {
            if (c0Var3.equals(c0Var)) {
                int i = c0Var.f4131a + c0Var2.f4131a;
                int[] iArrCopyOf = Arrays.copyOf(c0Var.f4132b, i);
                System.arraycopy(c0Var2.f4132b, 0, iArrCopyOf, c0Var.f4131a, c0Var2.f4131a);
                Object[] objArrCopyOf = Arrays.copyOf(c0Var.f4133c, i);
                System.arraycopy(c0Var2.f4133c, 0, objArrCopyOf, c0Var.f4131a, c0Var2.f4131a);
                c0Var = new c0(i, iArrCopyOf, objArrCopyOf, true);
            } else {
                c0Var.getClass();
                if (!c0Var2.equals(c0Var3)) {
                    if (!c0Var.f4135e) {
                        throw new UnsupportedOperationException();
                    }
                    int i5 = c0Var.f4131a + c0Var2.f4131a;
                    c0Var.a(i5);
                    System.arraycopy(c0Var2.f4132b, 0, c0Var.f4132b, c0Var.f4131a, c0Var2.f4131a);
                    System.arraycopy(c0Var2.f4133c, 0, c0Var.f4133c, c0Var.f4131a, c0Var2.f4131a);
                    c0Var.f4131a = i5;
                }
            }
        }
        abstractC0229v.unknownFields = c0Var;
    }

    public static boolean B(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    public static void C(int i, List list, E e5, boolean z4) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C0220l c0220l = (C0220l) e5.f4070a;
        int i5 = 0;
        if (!z4) {
            while (i5 < list.size()) {
                c0220l.w0(i, ((Boolean) list.get(i5)).booleanValue());
                i5++;
            }
            return;
        }
        c0220l.H0(i, 2);
        int i6 = 0;
        for (int i7 = 0; i7 < list.size(); i7++) {
            ((Boolean) list.get(i7)).getClass();
            Logger logger = C0220l.f4176v;
            i6++;
        }
        c0220l.J0(i6);
        while (i5 < list.size()) {
            c0220l.u0(((Boolean) list.get(i5)).booleanValue() ? (byte) 1 : (byte) 0);
            i5++;
        }
    }

    public static void D(int i, List list, E e5) {
        if (list == null || list.isEmpty()) {
            return;
        }
        e5.getClass();
        for (int i5 = 0; i5 < list.size(); i5++) {
            ((C0220l) e5.f4070a).x0(i, (C0215g) list.get(i5));
        }
    }

    public static void E(int i, List list, E e5, boolean z4) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C0220l c0220l = (C0220l) e5.f4070a;
        int i5 = 0;
        if (!z4) {
            while (i5 < list.size()) {
                double dDoubleValue = ((Double) list.get(i5)).doubleValue();
                c0220l.getClass();
                c0220l.B0(Double.doubleToRawLongBits(dDoubleValue), i);
                i5++;
            }
            return;
        }
        c0220l.H0(i, 2);
        int i6 = 0;
        for (int i7 = 0; i7 < list.size(); i7++) {
            ((Double) list.get(i7)).getClass();
            Logger logger = C0220l.f4176v;
            i6 += 8;
        }
        c0220l.J0(i6);
        while (i5 < list.size()) {
            c0220l.C0(Double.doubleToRawLongBits(((Double) list.get(i5)).doubleValue()));
            i5++;
        }
    }

    public static void F(int i, List list, E e5, boolean z4) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C0220l c0220l = (C0220l) e5.f4070a;
        int i5 = 0;
        if (!z4) {
            while (i5 < list.size()) {
                c0220l.D0(i, ((Integer) list.get(i5)).intValue());
                i5++;
            }
            return;
        }
        c0220l.H0(i, 2);
        int iR0 = 0;
        for (int i6 = 0; i6 < list.size(); i6++) {
            iR0 += C0220l.r0(((Integer) list.get(i6)).intValue());
        }
        c0220l.J0(iR0);
        while (i5 < list.size()) {
            c0220l.E0(((Integer) list.get(i5)).intValue());
            i5++;
        }
    }

    public static void G(int i, List list, E e5, boolean z4) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C0220l c0220l = (C0220l) e5.f4070a;
        int i5 = 0;
        if (!z4) {
            while (i5 < list.size()) {
                c0220l.z0(i, ((Integer) list.get(i5)).intValue());
                i5++;
            }
            return;
        }
        c0220l.H0(i, 2);
        int i6 = 0;
        for (int i7 = 0; i7 < list.size(); i7++) {
            ((Integer) list.get(i7)).getClass();
            Logger logger = C0220l.f4176v;
            i6 += 4;
        }
        c0220l.J0(i6);
        while (i5 < list.size()) {
            c0220l.A0(((Integer) list.get(i5)).intValue());
            i5++;
        }
    }

    public static void H(int i, List list, E e5, boolean z4) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C0220l c0220l = (C0220l) e5.f4070a;
        int i5 = 0;
        if (!z4) {
            while (i5 < list.size()) {
                c0220l.B0(((Long) list.get(i5)).longValue(), i);
                i5++;
            }
            return;
        }
        c0220l.H0(i, 2);
        int i6 = 0;
        for (int i7 = 0; i7 < list.size(); i7++) {
            ((Long) list.get(i7)).getClass();
            Logger logger = C0220l.f4176v;
            i6 += 8;
        }
        c0220l.J0(i6);
        while (i5 < list.size()) {
            c0220l.C0(((Long) list.get(i5)).longValue());
            i5++;
        }
    }

    public static void I(int i, List list, E e5, boolean z4) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C0220l c0220l = (C0220l) e5.f4070a;
        int i5 = 0;
        if (!z4) {
            while (i5 < list.size()) {
                float fFloatValue = ((Float) list.get(i5)).floatValue();
                c0220l.getClass();
                c0220l.z0(i, Float.floatToRawIntBits(fFloatValue));
                i5++;
            }
            return;
        }
        c0220l.H0(i, 2);
        int i6 = 0;
        for (int i7 = 0; i7 < list.size(); i7++) {
            ((Float) list.get(i7)).getClass();
            Logger logger = C0220l.f4176v;
            i6 += 4;
        }
        c0220l.J0(i6);
        while (i5 < list.size()) {
            c0220l.A0(Float.floatToRawIntBits(((Float) list.get(i5)).floatValue()));
            i5++;
        }
    }

    public static void J(int i, List list, E e5, V v4) {
        if (list == null || list.isEmpty()) {
            return;
        }
        e5.getClass();
        for (int i5 = 0; i5 < list.size(); i5++) {
            e5.h(i, list.get(i5), v4);
        }
    }

    public static void K(int i, List list, E e5, boolean z4) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C0220l c0220l = (C0220l) e5.f4070a;
        int i5 = 0;
        if (!z4) {
            while (i5 < list.size()) {
                c0220l.D0(i, ((Integer) list.get(i5)).intValue());
                i5++;
            }
            return;
        }
        c0220l.H0(i, 2);
        int iR0 = 0;
        for (int i6 = 0; i6 < list.size(); i6++) {
            iR0 += C0220l.r0(((Integer) list.get(i6)).intValue());
        }
        c0220l.J0(iR0);
        while (i5 < list.size()) {
            c0220l.E0(((Integer) list.get(i5)).intValue());
            i5++;
        }
    }

    public static void L(int i, List list, E e5, boolean z4) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C0220l c0220l = (C0220l) e5.f4070a;
        int i5 = 0;
        if (!z4) {
            while (i5 < list.size()) {
                c0220l.K0(((Long) list.get(i5)).longValue(), i);
                i5++;
            }
            return;
        }
        c0220l.H0(i, 2);
        int iR0 = 0;
        for (int i6 = 0; i6 < list.size(); i6++) {
            iR0 += C0220l.r0(((Long) list.get(i6)).longValue());
        }
        c0220l.J0(iR0);
        while (i5 < list.size()) {
            c0220l.L0(((Long) list.get(i5)).longValue());
            i5++;
        }
    }

    public static void M(int i, List list, E e5, V v4) {
        if (list == null || list.isEmpty()) {
            return;
        }
        e5.getClass();
        for (int i5 = 0; i5 < list.size(); i5++) {
            e5.k(i, list.get(i5), v4);
        }
    }

    public static void N(int i, List list, E e5, boolean z4) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C0220l c0220l = (C0220l) e5.f4070a;
        int i5 = 0;
        if (!z4) {
            while (i5 < list.size()) {
                c0220l.z0(i, ((Integer) list.get(i5)).intValue());
                i5++;
            }
            return;
        }
        c0220l.H0(i, 2);
        int i6 = 0;
        for (int i7 = 0; i7 < list.size(); i7++) {
            ((Integer) list.get(i7)).getClass();
            Logger logger = C0220l.f4176v;
            i6 += 4;
        }
        c0220l.J0(i6);
        while (i5 < list.size()) {
            c0220l.A0(((Integer) list.get(i5)).intValue());
            i5++;
        }
    }

    public static void O(int i, List list, E e5, boolean z4) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C0220l c0220l = (C0220l) e5.f4070a;
        int i5 = 0;
        if (!z4) {
            while (i5 < list.size()) {
                c0220l.B0(((Long) list.get(i5)).longValue(), i);
                i5++;
            }
            return;
        }
        c0220l.H0(i, 2);
        int i6 = 0;
        for (int i7 = 0; i7 < list.size(); i7++) {
            ((Long) list.get(i7)).getClass();
            Logger logger = C0220l.f4176v;
            i6 += 8;
        }
        c0220l.J0(i6);
        while (i5 < list.size()) {
            c0220l.C0(((Long) list.get(i5)).longValue());
            i5++;
        }
    }

    public static void P(int i, List list, E e5, boolean z4) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C0220l c0220l = (C0220l) e5.f4070a;
        int i5 = 0;
        if (!z4) {
            while (i5 < list.size()) {
                int iIntValue = ((Integer) list.get(i5)).intValue();
                c0220l.I0(i, (iIntValue >> 31) ^ (iIntValue << 1));
                i5++;
            }
            return;
        }
        c0220l.H0(i, 2);
        int iP0 = 0;
        for (int i6 = 0; i6 < list.size(); i6++) {
            int iIntValue2 = ((Integer) list.get(i6)).intValue();
            iP0 += C0220l.p0((iIntValue2 >> 31) ^ (iIntValue2 << 1));
        }
        c0220l.J0(iP0);
        while (i5 < list.size()) {
            int iIntValue3 = ((Integer) list.get(i5)).intValue();
            c0220l.J0((iIntValue3 >> 31) ^ (iIntValue3 << 1));
            i5++;
        }
    }

    public static void Q(int i, List list, E e5, boolean z4) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C0220l c0220l = (C0220l) e5.f4070a;
        int i5 = 0;
        if (!z4) {
            while (i5 < list.size()) {
                long jLongValue = ((Long) list.get(i5)).longValue();
                c0220l.K0((jLongValue >> 63) ^ (jLongValue << 1), i);
                i5++;
            }
            return;
        }
        c0220l.H0(i, 2);
        int iR0 = 0;
        for (int i6 = 0; i6 < list.size(); i6++) {
            long jLongValue2 = ((Long) list.get(i6)).longValue();
            iR0 += C0220l.r0((jLongValue2 >> 63) ^ (jLongValue2 << 1));
        }
        c0220l.J0(iR0);
        while (i5 < list.size()) {
            long jLongValue3 = ((Long) list.get(i5)).longValue();
            c0220l.L0((jLongValue3 >> 63) ^ (jLongValue3 << 1));
            i5++;
        }
    }

    public static void R(int i, List list, E e5) {
        if (list == null || list.isEmpty()) {
            return;
        }
        e5.getClass();
        for (int i5 = 0; i5 < list.size(); i5++) {
            ((C0220l) e5.f4070a).F0((String) list.get(i5), i);
        }
    }

    public static void S(int i, List list, E e5, boolean z4) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C0220l c0220l = (C0220l) e5.f4070a;
        int i5 = 0;
        if (!z4) {
            while (i5 < list.size()) {
                c0220l.I0(i, ((Integer) list.get(i5)).intValue());
                i5++;
            }
            return;
        }
        c0220l.H0(i, 2);
        int iP0 = 0;
        for (int i6 = 0; i6 < list.size(); i6++) {
            iP0 += C0220l.p0(((Integer) list.get(i6)).intValue());
        }
        c0220l.J0(iP0);
        while (i5 < list.size()) {
            c0220l.J0(((Integer) list.get(i5)).intValue());
            i5++;
        }
    }

    public static void T(int i, List list, E e5, boolean z4) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C0220l c0220l = (C0220l) e5.f4070a;
        int i5 = 0;
        if (!z4) {
            while (i5 < list.size()) {
                c0220l.K0(((Long) list.get(i5)).longValue(), i);
                i5++;
            }
            return;
        }
        c0220l.H0(i, 2);
        int iR0 = 0;
        for (int i6 = 0; i6 < list.size(); i6++) {
            iR0 += C0220l.r0(((Long) list.get(i6)).longValue());
        }
        c0220l.J0(iR0);
        while (i5 < list.size()) {
            c0220l.L0(((Long) list.get(i5)).longValue());
            i5++;
        }
    }

    public static int a(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return C0220l.X(i) * size;
    }

    public static int b(List list) {
        return list.size();
    }

    public static int c(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iN0 = C0220l.n0(i) * size;
        for (int i5 = 0; i5 < list.size(); i5++) {
            int size2 = ((C0215g) list.get(i5)).size();
            iN0 += C0220l.p0(size2) + size2;
        }
        return iN0;
    }

    public static int d(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (C0220l.n0(i) * size) + e(list);
    }

    public static int e(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iR0 = 0;
        for (int i = 0; i < size; i++) {
            iR0 += C0220l.r0(((Integer) list.get(i)).intValue());
        }
        return iR0;
    }

    public static int f(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return C0220l.b0(i) * size;
    }

    public static int g(List list) {
        return list.size() * 4;
    }

    public static int h(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return C0220l.c0(i) * size;
    }

    public static int i(List list) {
        return list.size() * 8;
    }

    public static int j(int i, List list, V v4) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iE0 = 0;
        for (int i5 = 0; i5 < size; i5++) {
            iE0 += C0220l.e0(i, (AbstractC0209a) list.get(i5), v4);
        }
        return iE0;
    }

    public static int k(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (C0220l.n0(i) * size) + l(list);
    }

    public static int l(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iR0 = 0;
        for (int i = 0; i < size; i++) {
            iR0 += C0220l.r0(((Integer) list.get(i)).intValue());
        }
        return iR0;
    }

    public static int m(int i, List list) {
        if (list.size() == 0) {
            return 0;
        }
        return (C0220l.n0(i) * list.size()) + n(list);
    }

    public static int n(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iR0 = 0;
        for (int i = 0; i < size; i++) {
            iR0 += C0220l.r0(((Long) list.get(i)).longValue());
        }
        return iR0;
    }

    public static int o(int i, Object obj, V v4) {
        int iN0 = C0220l.n0(i);
        int iA = ((AbstractC0209a) obj).a(v4);
        return C0220l.p0(iA) + iA + iN0;
    }

    public static int p(int i, List list, V v4) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iN0 = C0220l.n0(i) * size;
        for (int i5 = 0; i5 < size; i5++) {
            int iA = ((AbstractC0209a) list.get(i5)).a(v4);
            iN0 += C0220l.p0(iA) + iA;
        }
        return iN0;
    }

    public static int q(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (C0220l.n0(i) * size) + r(list);
    }

    public static int r(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iP0 = 0;
        for (int i = 0; i < size; i++) {
            int iIntValue = ((Integer) list.get(i)).intValue();
            iP0 += C0220l.p0((iIntValue >> 31) ^ (iIntValue << 1));
        }
        return iP0;
    }

    public static int s(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (C0220l.n0(i) * size) + t(list);
    }

    public static int t(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iR0 = 0;
        for (int i = 0; i < size; i++) {
            long jLongValue = ((Long) list.get(i)).longValue();
            iR0 += C0220l.r0((jLongValue >> 63) ^ (jLongValue << 1));
        }
        return iR0;
    }

    public static int u(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iN0 = C0220l.n0(i) * size;
        for (int i5 = 0; i5 < size; i5++) {
            Object obj = list.get(i5);
            if (obj instanceof C0215g) {
                int size2 = ((C0215g) obj).size();
                iN0 = C0220l.p0(size2) + size2 + iN0;
            } else {
                iN0 = C0220l.m0((String) obj) + iN0;
            }
        }
        return iN0;
    }

    public static int v(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (C0220l.n0(i) * size) + w(list);
    }

    public static int w(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iP0 = 0;
        for (int i = 0; i < size; i++) {
            iP0 += C0220l.p0(((Integer) list.get(i)).intValue());
        }
        return iP0;
    }

    public static int x(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (C0220l.n0(i) * size) + y(list);
    }

    public static int y(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iR0 = 0;
        for (int i = 0; i < size; i++) {
            iR0 += C0220l.r0(((Long) list.get(i)).longValue());
        }
        return iR0;
    }

    public static Object z(Object obj, int i, InterfaceC0230w interfaceC0230w, Object obj2, d0 d0Var) {
        return obj2;
    }
}

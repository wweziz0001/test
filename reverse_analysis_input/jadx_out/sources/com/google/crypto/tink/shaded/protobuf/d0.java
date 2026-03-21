package com.google.crypto.tink.shaded.protobuf;

import java.util.Arrays;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes.dex */
public abstract class d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Class f5190a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final g0 f5191b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final g0 f5192c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final g0 f5193d;

    static {
        Class<?> cls;
        try {
            cls = Class.forName("com.google.crypto.tink.shaded.protobuf.GeneratedMessageV3");
        } catch (Throwable unused) {
            cls = null;
        }
        f5190a = cls;
        f5191b = A(false);
        f5192c = A(true);
        f5193d = new g0();
    }

    public static g0 A(boolean z4) {
        Class<?> cls;
        try {
            cls = Class.forName("com.google.crypto.tink.shaded.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused) {
            cls = null;
        }
        if (cls == null) {
            return null;
        }
        try {
            return (g0) cls.getConstructor(Boolean.TYPE).newInstance(Boolean.valueOf(z4));
        } catch (Throwable unused2) {
            return null;
        }
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
    public static void B(g0 g0Var, Object obj, Object obj2) {
        g0Var.getClass();
        AbstractC0342w abstractC0342w = (AbstractC0342w) obj;
        f0 f0Var = abstractC0342w.unknownFields;
        f0 f0Var2 = ((AbstractC0342w) obj2).unknownFields;
        f0 f0Var3 = f0.f5195f;
        if (!f0Var3.equals(f0Var2)) {
            if (f0Var3.equals(f0Var)) {
                int i = f0Var.f5196a + f0Var2.f5196a;
                int[] iArrCopyOf = Arrays.copyOf(f0Var.f5197b, i);
                System.arraycopy(f0Var2.f5197b, 0, iArrCopyOf, f0Var.f5196a, f0Var2.f5196a);
                Object[] objArrCopyOf = Arrays.copyOf(f0Var.f5198c, i);
                System.arraycopy(f0Var2.f5198c, 0, objArrCopyOf, f0Var.f5196a, f0Var2.f5196a);
                f0Var = new f0(i, iArrCopyOf, objArrCopyOf, true);
            } else {
                f0Var.getClass();
                if (!f0Var2.equals(f0Var3)) {
                    if (!f0Var.f5200e) {
                        throw new UnsupportedOperationException();
                    }
                    int i5 = f0Var.f5196a + f0Var2.f5196a;
                    f0Var.a(i5);
                    System.arraycopy(f0Var2.f5197b, 0, f0Var.f5197b, f0Var.f5196a, f0Var2.f5196a);
                    System.arraycopy(f0Var2.f5198c, 0, f0Var.f5198c, f0Var.f5196a, f0Var2.f5196a);
                    f0Var.f5196a = i5;
                }
            }
        }
        abstractC0342w.unknownFields = f0Var;
    }

    public static boolean C(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    public static void D(int i, List list, L l3, boolean z4) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C0332l c0332l = (C0332l) l3.f5148a;
        if (!z4) {
            for (int i5 = 0; i5 < list.size(); i5++) {
                boolean zBooleanValue = ((Boolean) list.get(i5)).booleanValue();
                c0332l.x0(i, 0);
                c0332l.p0(zBooleanValue ? (byte) 1 : (byte) 0);
            }
            return;
        }
        c0332l.x0(i, 2);
        int i6 = 0;
        for (int i7 = 0; i7 < list.size(); i7++) {
            ((Boolean) list.get(i7)).getClass();
            Logger logger = C0332l.f5223u;
            i6++;
        }
        c0332l.y0(i6);
        for (int i8 = 0; i8 < list.size(); i8++) {
            c0332l.p0(((Boolean) list.get(i8)).booleanValue() ? (byte) 1 : (byte) 0);
        }
    }

    public static void E(int i, List list, L l3) {
        if (list == null || list.isEmpty()) {
            return;
        }
        l3.getClass();
        for (int i5 = 0; i5 < list.size(); i5++) {
            AbstractC0329i abstractC0329i = (AbstractC0329i) list.get(i5);
            C0332l c0332l = (C0332l) l3.f5148a;
            c0332l.x0(i, 2);
            c0332l.r0(abstractC0329i);
        }
    }

    public static void F(int i, List list, L l3, boolean z4) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C0332l c0332l = (C0332l) l3.f5148a;
        int i5 = 0;
        if (!z4) {
            while (i5 < list.size()) {
                double dDoubleValue = ((Double) list.get(i5)).doubleValue();
                c0332l.getClass();
                c0332l.u0(Double.doubleToRawLongBits(dDoubleValue), i);
                i5++;
            }
            return;
        }
        c0332l.x0(i, 2);
        int i6 = 0;
        for (int i7 = 0; i7 < list.size(); i7++) {
            ((Double) list.get(i7)).getClass();
            Logger logger = C0332l.f5223u;
            i6 += 8;
        }
        c0332l.y0(i6);
        while (i5 < list.size()) {
            c0332l.v0(Double.doubleToRawLongBits(((Double) list.get(i5)).doubleValue()));
            i5++;
        }
    }

    public static void G(int i, List list, L l3, boolean z4) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C0332l c0332l = (C0332l) l3.f5148a;
        if (!z4) {
            for (int i5 = 0; i5 < list.size(); i5++) {
                int iIntValue = ((Integer) list.get(i5)).intValue();
                c0332l.x0(i, 0);
                c0332l.w0(iIntValue);
            }
            return;
        }
        c0332l.x0(i, 2);
        int iC0 = 0;
        for (int i6 = 0; i6 < list.size(); i6++) {
            iC0 += C0332l.c0(((Integer) list.get(i6)).intValue());
        }
        c0332l.y0(iC0);
        for (int i7 = 0; i7 < list.size(); i7++) {
            c0332l.w0(((Integer) list.get(i7)).intValue());
        }
    }

    public static void H(int i, List list, L l3, boolean z4) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C0332l c0332l = (C0332l) l3.f5148a;
        int i5 = 0;
        if (!z4) {
            while (i5 < list.size()) {
                c0332l.s0(i, ((Integer) list.get(i5)).intValue());
                i5++;
            }
            return;
        }
        c0332l.x0(i, 2);
        int i6 = 0;
        for (int i7 = 0; i7 < list.size(); i7++) {
            ((Integer) list.get(i7)).getClass();
            Logger logger = C0332l.f5223u;
            i6 += 4;
        }
        c0332l.y0(i6);
        while (i5 < list.size()) {
            c0332l.t0(((Integer) list.get(i5)).intValue());
            i5++;
        }
    }

    public static void I(int i, List list, L l3, boolean z4) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C0332l c0332l = (C0332l) l3.f5148a;
        int i5 = 0;
        if (!z4) {
            while (i5 < list.size()) {
                c0332l.u0(((Long) list.get(i5)).longValue(), i);
                i5++;
            }
            return;
        }
        c0332l.x0(i, 2);
        int i6 = 0;
        for (int i7 = 0; i7 < list.size(); i7++) {
            ((Long) list.get(i7)).getClass();
            Logger logger = C0332l.f5223u;
            i6 += 8;
        }
        c0332l.y0(i6);
        while (i5 < list.size()) {
            c0332l.v0(((Long) list.get(i5)).longValue());
            i5++;
        }
    }

    public static void J(int i, List list, L l3, boolean z4) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C0332l c0332l = (C0332l) l3.f5148a;
        int i5 = 0;
        if (!z4) {
            while (i5 < list.size()) {
                float fFloatValue = ((Float) list.get(i5)).floatValue();
                c0332l.getClass();
                c0332l.s0(i, Float.floatToRawIntBits(fFloatValue));
                i5++;
            }
            return;
        }
        c0332l.x0(i, 2);
        int i6 = 0;
        for (int i7 = 0; i7 < list.size(); i7++) {
            ((Float) list.get(i7)).getClass();
            Logger logger = C0332l.f5223u;
            i6 += 4;
        }
        c0332l.y0(i6);
        while (i5 < list.size()) {
            c0332l.t0(Float.floatToRawIntBits(((Float) list.get(i5)).floatValue()));
            i5++;
        }
    }

    public static void K(int i, List list, L l3, c0 c0Var) {
        if (list == null || list.isEmpty()) {
            return;
        }
        l3.getClass();
        for (int i5 = 0; i5 < list.size(); i5++) {
            l3.h(i, list.get(i5), c0Var);
        }
    }

    public static void L(int i, List list, L l3, boolean z4) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C0332l c0332l = (C0332l) l3.f5148a;
        if (!z4) {
            for (int i5 = 0; i5 < list.size(); i5++) {
                int iIntValue = ((Integer) list.get(i5)).intValue();
                c0332l.x0(i, 0);
                c0332l.w0(iIntValue);
            }
            return;
        }
        c0332l.x0(i, 2);
        int iC0 = 0;
        for (int i6 = 0; i6 < list.size(); i6++) {
            iC0 += C0332l.c0(((Integer) list.get(i6)).intValue());
        }
        c0332l.y0(iC0);
        for (int i7 = 0; i7 < list.size(); i7++) {
            c0332l.w0(((Integer) list.get(i7)).intValue());
        }
    }

    public static void M(int i, List list, L l3, boolean z4) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C0332l c0332l = (C0332l) l3.f5148a;
        int i5 = 0;
        if (!z4) {
            while (i5 < list.size()) {
                c0332l.z0(((Long) list.get(i5)).longValue(), i);
                i5++;
            }
            return;
        }
        c0332l.x0(i, 2);
        int iO0 = 0;
        for (int i6 = 0; i6 < list.size(); i6++) {
            iO0 += C0332l.o0(((Long) list.get(i6)).longValue());
        }
        c0332l.y0(iO0);
        while (i5 < list.size()) {
            c0332l.A0(((Long) list.get(i5)).longValue());
            i5++;
        }
    }

    public static void N(int i, List list, L l3, c0 c0Var) {
        if (list == null || list.isEmpty()) {
            return;
        }
        l3.getClass();
        for (int i5 = 0; i5 < list.size(); i5++) {
            l3.k(i, list.get(i5), c0Var);
        }
    }

    public static void O(int i, List list, L l3, boolean z4) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C0332l c0332l = (C0332l) l3.f5148a;
        int i5 = 0;
        if (!z4) {
            while (i5 < list.size()) {
                c0332l.s0(i, ((Integer) list.get(i5)).intValue());
                i5++;
            }
            return;
        }
        c0332l.x0(i, 2);
        int i6 = 0;
        for (int i7 = 0; i7 < list.size(); i7++) {
            ((Integer) list.get(i7)).getClass();
            Logger logger = C0332l.f5223u;
            i6 += 4;
        }
        c0332l.y0(i6);
        while (i5 < list.size()) {
            c0332l.t0(((Integer) list.get(i5)).intValue());
            i5++;
        }
    }

    public static void P(int i, List list, L l3, boolean z4) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C0332l c0332l = (C0332l) l3.f5148a;
        int i5 = 0;
        if (!z4) {
            while (i5 < list.size()) {
                c0332l.u0(((Long) list.get(i5)).longValue(), i);
                i5++;
            }
            return;
        }
        c0332l.x0(i, 2);
        int i6 = 0;
        for (int i7 = 0; i7 < list.size(); i7++) {
            ((Long) list.get(i7)).getClass();
            Logger logger = C0332l.f5223u;
            i6 += 8;
        }
        c0332l.y0(i6);
        while (i5 < list.size()) {
            c0332l.v0(((Long) list.get(i5)).longValue());
            i5++;
        }
    }

    public static void Q(int i, List list, L l3, boolean z4) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C0332l c0332l = (C0332l) l3.f5148a;
        if (!z4) {
            for (int i5 = 0; i5 < list.size(); i5++) {
                int iIntValue = ((Integer) list.get(i5)).intValue();
                c0332l.x0(i, 0);
                c0332l.y0((iIntValue >> 31) ^ (iIntValue << 1));
            }
            return;
        }
        c0332l.x0(i, 2);
        int iM0 = 0;
        for (int i6 = 0; i6 < list.size(); i6++) {
            int iIntValue2 = ((Integer) list.get(i6)).intValue();
            iM0 += C0332l.m0((iIntValue2 >> 31) ^ (iIntValue2 << 1));
        }
        c0332l.y0(iM0);
        for (int i7 = 0; i7 < list.size(); i7++) {
            int iIntValue3 = ((Integer) list.get(i7)).intValue();
            c0332l.y0((iIntValue3 >> 31) ^ (iIntValue3 << 1));
        }
    }

    public static void R(int i, List list, L l3, boolean z4) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C0332l c0332l = (C0332l) l3.f5148a;
        int i5 = 0;
        if (!z4) {
            while (i5 < list.size()) {
                long jLongValue = ((Long) list.get(i5)).longValue();
                c0332l.z0((jLongValue >> 63) ^ (jLongValue << 1), i);
                i5++;
            }
            return;
        }
        c0332l.x0(i, 2);
        int iO0 = 0;
        for (int i6 = 0; i6 < list.size(); i6++) {
            long jLongValue2 = ((Long) list.get(i6)).longValue();
            iO0 += C0332l.o0((jLongValue2 >> 63) ^ (jLongValue2 << 1));
        }
        c0332l.y0(iO0);
        while (i5 < list.size()) {
            long jLongValue3 = ((Long) list.get(i5)).longValue();
            c0332l.A0((jLongValue3 >> 63) ^ (jLongValue3 << 1));
            i5++;
        }
    }

    public static void S(int i, List list, L l3) {
        if (list == null || list.isEmpty()) {
            return;
        }
        l3.getClass();
        boolean z4 = list instanceof F;
        C0332l c0332l = (C0332l) l3.f5148a;
        if (!z4) {
            for (int i5 = 0; i5 < list.size(); i5++) {
                String str = (String) list.get(i5);
                c0332l.x0(i, 2);
                int i6 = c0332l.f5228t;
                try {
                    int iM0 = C0332l.m0(str.length() * 3);
                    int iM02 = C0332l.m0(str.length());
                    byte[] bArr = c0332l.f5226r;
                    int i7 = c0332l.f5227s;
                    if (iM02 == iM0) {
                        int i8 = i6 + iM02;
                        c0332l.f5228t = i8;
                        int iV = r0.f5248a.v(str, bArr, i8, i7 - i8);
                        c0332l.f5228t = i6;
                        c0332l.y0((iV - i6) - iM02);
                        c0332l.f5228t = iV;
                    } else {
                        c0332l.y0(r0.b(str));
                        int i9 = c0332l.f5228t;
                        c0332l.f5228t = r0.f5248a.v(str, bArr, i9, i7 - i9);
                    }
                } catch (q0 e5) {
                    c0332l.f5228t = i6;
                    C0332l.f5223u.log(Level.WARNING, "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) e5);
                    byte[] bytes = str.getBytes(A.f5128a);
                    try {
                        c0332l.y0(bytes.length);
                        c0332l.q0(bytes, 0, bytes.length);
                    } catch (IndexOutOfBoundsException e6) {
                        throw new K3.b(e6);
                    }
                } catch (IndexOutOfBoundsException e7) {
                    throw new K3.b(e7);
                }
            }
            return;
        }
        F f2 = (F) list;
        for (int i10 = 0; i10 < list.size(); i10++) {
            Object objB = f2.b(i10);
            if (objB instanceof String) {
                String str2 = (String) objB;
                c0332l.x0(i, 2);
                int i11 = c0332l.f5228t;
                try {
                    int iM03 = C0332l.m0(str2.length() * 3);
                    int iM04 = C0332l.m0(str2.length());
                    byte[] bArr2 = c0332l.f5226r;
                    int i12 = c0332l.f5227s;
                    if (iM04 == iM03) {
                        int i13 = i11 + iM04;
                        c0332l.f5228t = i13;
                        int iV2 = r0.f5248a.v(str2, bArr2, i13, i12 - i13);
                        c0332l.f5228t = i11;
                        c0332l.y0((iV2 - i11) - iM04);
                        c0332l.f5228t = iV2;
                    } else {
                        c0332l.y0(r0.b(str2));
                        int i14 = c0332l.f5228t;
                        c0332l.f5228t = r0.f5248a.v(str2, bArr2, i14, i12 - i14);
                    }
                } catch (q0 e8) {
                    c0332l.f5228t = i11;
                    C0332l.f5223u.log(Level.WARNING, "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) e8);
                    byte[] bytes2 = str2.getBytes(A.f5128a);
                    try {
                        c0332l.y0(bytes2.length);
                        c0332l.q0(bytes2, 0, bytes2.length);
                    } catch (IndexOutOfBoundsException e9) {
                        throw new K3.b(e9);
                    }
                } catch (IndexOutOfBoundsException e10) {
                    throw new K3.b(e10);
                }
            } else {
                c0332l.x0(i, 2);
                c0332l.r0((AbstractC0329i) objB);
            }
        }
    }

    public static void T(int i, List list, L l3, boolean z4) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C0332l c0332l = (C0332l) l3.f5148a;
        if (!z4) {
            for (int i5 = 0; i5 < list.size(); i5++) {
                int iIntValue = ((Integer) list.get(i5)).intValue();
                c0332l.x0(i, 0);
                c0332l.y0(iIntValue);
            }
            return;
        }
        c0332l.x0(i, 2);
        int iM0 = 0;
        for (int i6 = 0; i6 < list.size(); i6++) {
            iM0 += C0332l.m0(((Integer) list.get(i6)).intValue());
        }
        c0332l.y0(iM0);
        for (int i7 = 0; i7 < list.size(); i7++) {
            c0332l.y0(((Integer) list.get(i7)).intValue());
        }
    }

    public static void U(int i, List list, L l3, boolean z4) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C0332l c0332l = (C0332l) l3.f5148a;
        int i5 = 0;
        if (!z4) {
            while (i5 < list.size()) {
                c0332l.z0(((Long) list.get(i5)).longValue(), i);
                i5++;
            }
            return;
        }
        c0332l.x0(i, 2);
        int iO0 = 0;
        for (int i6 = 0; i6 < list.size(); i6++) {
            iO0 += C0332l.o0(((Long) list.get(i6)).longValue());
        }
        c0332l.y0(iO0);
        while (i5 < list.size()) {
            c0332l.A0(((Long) list.get(i5)).longValue());
            i5++;
        }
    }

    public static int a(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return C0332l.S(i) * size;
    }

    public static int b(List list) {
        return list.size();
    }

    public static int c(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iK0 = C0332l.k0(i) * size;
        for (int i5 = 0; i5 < list.size(); i5++) {
            iK0 += C0332l.U((AbstractC0329i) list.get(i5));
        }
        return iK0;
    }

    public static int d(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (C0332l.k0(i) * size) + e(list);
    }

    public static int e(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof AbstractC0343x) {
            AbstractC0343x abstractC0343x = (AbstractC0343x) list;
            if (size <= 0) {
                return 0;
            }
            abstractC0343x.i(0);
            throw null;
        }
        int iC0 = 0;
        for (int i = 0; i < size; i++) {
            iC0 += C0332l.c0(((Integer) list.get(i)).intValue());
        }
        return iC0;
    }

    public static int f(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return C0332l.X(i) * size;
    }

    public static int g(List list) {
        return list.size() * 4;
    }

    public static int h(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return C0332l.Y(i) * size;
    }

    public static int i(List list) {
        return list.size() * 8;
    }

    public static int j(int i, List list, c0 c0Var) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iA0 = 0;
        for (int i5 = 0; i5 < size; i5++) {
            iA0 += C0332l.a0(i, (AbstractC0321a) list.get(i5), c0Var);
        }
        return iA0;
    }

    public static int k(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (C0332l.k0(i) * size) + l(list);
    }

    public static int l(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof AbstractC0343x) {
            AbstractC0343x abstractC0343x = (AbstractC0343x) list;
            if (size <= 0) {
                return 0;
            }
            abstractC0343x.i(0);
            throw null;
        }
        int iC0 = 0;
        for (int i = 0; i < size; i++) {
            iC0 += C0332l.c0(((Integer) list.get(i)).intValue());
        }
        return iC0;
    }

    public static int m(int i, List list) {
        if (list.size() == 0) {
            return 0;
        }
        return (C0332l.k0(i) * list.size()) + n(list);
    }

    public static int n(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof J) {
            J j5 = (J) list;
            if (size <= 0) {
                return 0;
            }
            j5.i(0);
            throw null;
        }
        int iO0 = 0;
        for (int i = 0; i < size; i++) {
            iO0 += C0332l.o0(((Long) list.get(i)).longValue());
        }
        return iO0;
    }

    public static int o(int i, Object obj, c0 c0Var) {
        int iK0 = C0332l.k0(i);
        int iB = ((AbstractC0321a) obj).b(c0Var);
        return C0332l.m0(iB) + iB + iK0;
    }

    public static int p(int i, List list, c0 c0Var) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iK0 = C0332l.k0(i) * size;
        for (int i5 = 0; i5 < size; i5++) {
            int iB = ((AbstractC0321a) list.get(i5)).b(c0Var);
            iK0 += C0332l.m0(iB) + iB;
        }
        return iK0;
    }

    public static int q(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (C0332l.k0(i) * size) + r(list);
    }

    public static int r(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof AbstractC0343x) {
            AbstractC0343x abstractC0343x = (AbstractC0343x) list;
            if (size <= 0) {
                return 0;
            }
            abstractC0343x.i(0);
            throw null;
        }
        int iM0 = 0;
        for (int i = 0; i < size; i++) {
            int iIntValue = ((Integer) list.get(i)).intValue();
            iM0 += C0332l.m0((iIntValue >> 31) ^ (iIntValue << 1));
        }
        return iM0;
    }

    public static int s(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (C0332l.k0(i) * size) + t(list);
    }

    public static int t(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof J) {
            J j5 = (J) list;
            if (size <= 0) {
                return 0;
            }
            j5.i(0);
            throw null;
        }
        int iO0 = 0;
        for (int i = 0; i < size; i++) {
            long jLongValue = ((Long) list.get(i)).longValue();
            iO0 += C0332l.o0((jLongValue >> 63) ^ (jLongValue << 1));
        }
        return iO0;
    }

    public static int u(int i, List list) {
        int size = list.size();
        int i5 = 0;
        if (size == 0) {
            return 0;
        }
        int iK0 = C0332l.k0(i) * size;
        if (list instanceof F) {
            F f2 = (F) list;
            while (i5 < size) {
                Object objB = f2.b(i5);
                iK0 = (objB instanceof AbstractC0329i ? C0332l.U((AbstractC0329i) objB) : C0332l.j0((String) objB)) + iK0;
                i5++;
            }
        } else {
            while (i5 < size) {
                Object obj = list.get(i5);
                iK0 = (obj instanceof AbstractC0329i ? C0332l.U((AbstractC0329i) obj) : C0332l.j0((String) obj)) + iK0;
                i5++;
            }
        }
        return iK0;
    }

    public static int v(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (C0332l.k0(i) * size) + w(list);
    }

    public static int w(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof AbstractC0343x) {
            AbstractC0343x abstractC0343x = (AbstractC0343x) list;
            if (size <= 0) {
                return 0;
            }
            abstractC0343x.i(0);
            throw null;
        }
        int iM0 = 0;
        for (int i = 0; i < size; i++) {
            iM0 += C0332l.m0(((Integer) list.get(i)).intValue());
        }
        return iM0;
    }

    public static int x(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (C0332l.k0(i) * size) + y(list);
    }

    public static int y(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof J) {
            J j5 = (J) list;
            if (size <= 0) {
                return 0;
            }
            j5.i(0);
            throw null;
        }
        int iO0 = 0;
        for (int i = 0; i < size; i++) {
            iO0 += C0332l.o0(((Long) list.get(i)).longValue());
        }
        return iO0;
    }

    public static Object z(Object obj, int i, List list, Object obj2, g0 g0Var) {
        return obj2;
    }
}

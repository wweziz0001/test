package androidx.datastore.preferences.protobuf;

import b3.AbstractC0307a;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes.dex */
public final class M implements V {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int[] f4080n = new int[0];

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final Unsafe f4081o = i0.i();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int[] f4082a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object[] f4083b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f4084c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f4085d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final AbstractC0209a f4086e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f4087f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int[] f4088g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f4089h;
    public final int i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final O f4090j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final B f4091k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final d0 f4092l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final I f4093m;

    public M(int[] iArr, Object[] objArr, int i, int i5, AbstractC0209a abstractC0209a, int[] iArr2, int i6, int i7, O o4, B b4, d0 d0Var, C0223o c0223o, I i8) {
        this.f4082a = iArr;
        this.f4083b = objArr;
        this.f4084c = i;
        this.f4085d = i5;
        this.f4087f = abstractC0209a instanceof AbstractC0229v;
        this.f4088g = iArr2;
        this.f4089h = i6;
        this.i = i7;
        this.f4090j = o4;
        this.f4091k = b4;
        this.f4092l = d0Var;
        this.f4086e = abstractC0209a;
        this.f4093m = i8;
    }

    public static long A(long j5, Object obj) {
        return ((Long) i0.f4163b.h(j5, obj)).longValue();
    }

    public static Field G(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            StringBuilder sbM = AbstractC0307a.m("Field ", str, " for ");
            sbM.append(cls.getName());
            sbM.append(" not found. Known fields are ");
            sbM.append(Arrays.toString(declaredFields));
            throw new RuntimeException(sbM.toString());
        }
    }

    public static int L(int i) {
        return (i & 267386880) >>> 20;
    }

    public static boolean p(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof AbstractC0229v) {
            return ((AbstractC0229v) obj).i();
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:121:0x024c  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0250  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0268  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x026c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static androidx.datastore.preferences.protobuf.M x(androidx.datastore.preferences.protobuf.U r33, androidx.datastore.preferences.protobuf.O r34, androidx.datastore.preferences.protobuf.B r35, androidx.datastore.preferences.protobuf.d0 r36, androidx.datastore.preferences.protobuf.C0223o r37, androidx.datastore.preferences.protobuf.I r38) {
        /*
            Method dump skipped, instruction units count: 1004
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.M.x(androidx.datastore.preferences.protobuf.U, androidx.datastore.preferences.protobuf.O, androidx.datastore.preferences.protobuf.B, androidx.datastore.preferences.protobuf.d0, androidx.datastore.preferences.protobuf.o, androidx.datastore.preferences.protobuf.I):androidx.datastore.preferences.protobuf.M");
    }

    public static long y(int i) {
        return i & 1048575;
    }

    public static int z(long j5, Object obj) {
        return ((Integer) i0.f4163b.h(j5, obj)).intValue();
    }

    public final int B(int i) {
        if (i < this.f4084c || i > this.f4085d) {
            return -1;
        }
        int[] iArr = this.f4082a;
        int length = (iArr.length / 3) - 1;
        int i5 = 0;
        while (i5 <= length) {
            int i6 = (length + i5) >>> 1;
            int i7 = i6 * 3;
            int i8 = iArr[i7];
            if (i == i8) {
                return i7;
            }
            if (i < i8) {
                length = i6 - 1;
            } else {
                i5 = i6 + 1;
            }
        }
        return -1;
    }

    public final void C(Object obj, long j5, C0219k c0219k, V v4, C0222n c0222n) throws C0232y {
        int iC;
        this.f4091k.getClass();
        InterfaceC0230w interfaceC0230wB = B.b(j5, obj);
        int i = c0219k.f4172b;
        if ((i & 7) != 3) {
            throw C0233z.b();
        }
        do {
            AbstractC0229v abstractC0229vC = v4.c();
            c0219k.c(abstractC0229vC, v4, c0222n);
            v4.d(abstractC0229vC);
            ((T) interfaceC0230wB).add(abstractC0229vC);
            AbstractC0218j abstractC0218j = (AbstractC0218j) c0219k.f4175e;
            if (abstractC0218j.g() || c0219k.f4174d != 0) {
                return;
            } else {
                iC = abstractC0218j.C();
            }
        } while (iC == i);
        c0219k.f4174d = iC;
    }

    public final void D(Object obj, int i, C0219k c0219k, V v4, C0222n c0222n) throws C0233z {
        int iC;
        this.f4091k.getClass();
        InterfaceC0230w interfaceC0230wB = B.b(i & 1048575, obj);
        int i5 = c0219k.f4172b;
        if ((i5 & 7) != 2) {
            throw C0233z.b();
        }
        do {
            AbstractC0229v abstractC0229vC = v4.c();
            c0219k.e(abstractC0229vC, v4, c0222n);
            v4.d(abstractC0229vC);
            ((T) interfaceC0230wB).add(abstractC0229vC);
            AbstractC0218j abstractC0218j = (AbstractC0218j) c0219k.f4175e;
            if (abstractC0218j.g() || c0219k.f4174d != 0) {
                return;
            } else {
                iC = abstractC0218j.C();
            }
        } while (iC == i5);
        c0219k.f4174d = iC;
    }

    public final void E(int i, C0219k c0219k, Object obj) throws C0232y, com.google.crypto.tink.shaded.protobuf.B {
        if ((536870912 & i) != 0) {
            c0219k.R(2);
            i0.o(i & 1048575, obj, ((AbstractC0218j) c0219k.f4175e).B());
        } else if (!this.f4087f) {
            i0.o(i & 1048575, obj, c0219k.i());
        } else {
            c0219k.R(2);
            i0.o(i & 1048575, obj, ((AbstractC0218j) c0219k.f4175e).A());
        }
    }

    public final void F(int i, C0219k c0219k, Object obj) throws C0232y, com.google.crypto.tink.shaded.protobuf.B {
        boolean z4 = (536870912 & i) != 0;
        B b4 = this.f4091k;
        if (z4) {
            b4.getClass();
            c0219k.J(B.b(i & 1048575, obj), true);
        } else {
            b4.getClass();
            c0219k.J(B.b(i & 1048575, obj), false);
        }
    }

    public final void H(int i, Object obj) {
        int i5 = this.f4082a[i + 2];
        long j5 = 1048575 & i5;
        if (j5 == 1048575) {
            return;
        }
        i0.m(j5, obj, (1 << (i5 >>> 20)) | i0.f4163b.f(j5, obj));
    }

    public final void I(int i, int i5, Object obj) {
        i0.m(this.f4082a[i5 + 2] & 1048575, obj, i);
    }

    public final void J(Object obj, int i, AbstractC0209a abstractC0209a) {
        f4081o.putObject(obj, M(i) & 1048575, abstractC0209a);
        H(i, obj);
    }

    public final void K(Object obj, int i, int i5, AbstractC0209a abstractC0209a) {
        f4081o.putObject(obj, M(i5) & 1048575, abstractC0209a);
        I(i, i5, obj);
    }

    public final int M(int i) {
        return this.f4082a[i + 1];
    }

    public final void N(Object obj, E e5) throws IOException {
        int i;
        int i5;
        int i6;
        int i7;
        int[] iArr = this.f4082a;
        int length = iArr.length;
        Unsafe unsafe = f4081o;
        int i8 = 1048575;
        int i9 = 1048575;
        int i10 = 0;
        int i11 = 0;
        while (i11 < length) {
            int iM = M(i11);
            int i12 = iArr[i11];
            int iL = L(iM);
            if (iL <= 17) {
                int i13 = iArr[i11 + 2];
                int i14 = i13 & i8;
                if (i14 != i9) {
                    i10 = i14 == i8 ? 0 : unsafe.getInt(obj, i14);
                    i9 = i14;
                }
                i = i9;
                i5 = i10;
                i6 = 1 << (i13 >>> 20);
            } else {
                i = i9;
                i5 = i10;
                i6 = 0;
            }
            long j5 = iM & i8;
            switch (iL) {
                case 0:
                    i7 = i;
                    if (o(obj, i11, i7, i5, i6)) {
                        e5.c(i12, i0.f4163b.d(j5, obj));
                        continue;
                    }
                    i11 += 3;
                    i9 = i7;
                    i10 = i5;
                    i8 = 1048575;
                    break;
                case 1:
                    i7 = i;
                    if (o(obj, i11, i7, i5, i6)) {
                        e5.g(i0.f4163b.e(j5, obj), i12);
                    } else {
                        continue;
                    }
                    i11 += 3;
                    i9 = i7;
                    i10 = i5;
                    i8 = 1048575;
                    break;
                case 2:
                    i7 = i;
                    if (o(obj, i11, i7, i5, i6)) {
                        e5.j(unsafe.getLong(obj, j5), i12);
                    } else {
                        continue;
                    }
                    i11 += 3;
                    i9 = i7;
                    i10 = i5;
                    i8 = 1048575;
                    break;
                case 3:
                    i7 = i;
                    if (o(obj, i11, i7, i5, i6)) {
                        e5.q(unsafe.getLong(obj, j5), i12);
                    } else {
                        continue;
                    }
                    i11 += 3;
                    i9 = i7;
                    i10 = i5;
                    i8 = 1048575;
                    break;
                case 4:
                    i7 = i;
                    if (o(obj, i11, i7, i5, i6)) {
                        e5.i(i12, unsafe.getInt(obj, j5));
                    } else {
                        continue;
                    }
                    i11 += 3;
                    i9 = i7;
                    i10 = i5;
                    i8 = 1048575;
                    break;
                case 5:
                    i7 = i;
                    if (o(obj, i11, i7, i5, i6)) {
                        e5.f(unsafe.getLong(obj, j5), i12);
                    } else {
                        continue;
                    }
                    i11 += 3;
                    i9 = i7;
                    i10 = i5;
                    i8 = 1048575;
                    break;
                case O.j.STRING_SET_FIELD_NUMBER /* 6 */:
                    i7 = i;
                    if (o(obj, i11, i7, i5, i6)) {
                        e5.e(i12, unsafe.getInt(obj, j5));
                    } else {
                        continue;
                    }
                    i11 += 3;
                    i9 = i7;
                    i10 = i5;
                    i8 = 1048575;
                    break;
                case O.j.DOUBLE_FIELD_NUMBER /* 7 */:
                    i7 = i;
                    if (o(obj, i11, i7, i5, i6)) {
                        e5.a(i12, i0.f4163b.c(j5, obj));
                    } else {
                        continue;
                    }
                    i11 += 3;
                    i9 = i7;
                    i10 = i5;
                    i8 = 1048575;
                    break;
                case O.j.BYTES_FIELD_NUMBER /* 8 */:
                    i7 = i;
                    if (o(obj, i11, i7, i5, i6)) {
                        Object object = unsafe.getObject(obj, j5);
                        if (object instanceof String) {
                            ((C0220l) e5.f4070a).F0((String) object, i12);
                        } else {
                            e5.b(i12, (C0215g) object);
                        }
                    } else {
                        continue;
                    }
                    i11 += 3;
                    i9 = i7;
                    i10 = i5;
                    i8 = 1048575;
                    break;
                case 9:
                    i7 = i;
                    if (o(obj, i11, i7, i5, i6)) {
                        e5.k(i12, unsafe.getObject(obj, j5), m(i11));
                    } else {
                        continue;
                    }
                    i11 += 3;
                    i9 = i7;
                    i10 = i5;
                    i8 = 1048575;
                    break;
                case 10:
                    i7 = i;
                    if (o(obj, i11, i7, i5, i6)) {
                        e5.b(i12, (C0215g) unsafe.getObject(obj, j5));
                    } else {
                        continue;
                    }
                    i11 += 3;
                    i9 = i7;
                    i10 = i5;
                    i8 = 1048575;
                    break;
                case 11:
                    i7 = i;
                    if (o(obj, i11, i7, i5, i6)) {
                        e5.p(i12, unsafe.getInt(obj, j5));
                    } else {
                        continue;
                    }
                    i11 += 3;
                    i9 = i7;
                    i10 = i5;
                    i8 = 1048575;
                    break;
                case 12:
                    i7 = i;
                    if (o(obj, i11, i7, i5, i6)) {
                        e5.d(i12, unsafe.getInt(obj, j5));
                    } else {
                        continue;
                    }
                    i11 += 3;
                    i9 = i7;
                    i10 = i5;
                    i8 = 1048575;
                    break;
                case 13:
                    i7 = i;
                    if (o(obj, i11, i7, i5, i6)) {
                        e5.l(i12, unsafe.getInt(obj, j5));
                    } else {
                        continue;
                    }
                    i11 += 3;
                    i9 = i7;
                    i10 = i5;
                    i8 = 1048575;
                    break;
                case 14:
                    i7 = i;
                    if (o(obj, i11, i7, i5, i6)) {
                        e5.m(unsafe.getLong(obj, j5), i12);
                    } else {
                        continue;
                    }
                    i11 += 3;
                    i9 = i7;
                    i10 = i5;
                    i8 = 1048575;
                    break;
                case 15:
                    i7 = i;
                    if (o(obj, i11, i7, i5, i6)) {
                        e5.n(i12, unsafe.getInt(obj, j5));
                    } else {
                        continue;
                    }
                    i11 += 3;
                    i9 = i7;
                    i10 = i5;
                    i8 = 1048575;
                    break;
                case 16:
                    i7 = i;
                    if (o(obj, i11, i7, i5, i6)) {
                        e5.o(unsafe.getLong(obj, j5), i12);
                    } else {
                        continue;
                    }
                    i11 += 3;
                    i9 = i7;
                    i10 = i5;
                    i8 = 1048575;
                    break;
                case 17:
                    i7 = i;
                    if (o(obj, i11, i, i5, i6)) {
                        e5.h(i12, unsafe.getObject(obj, j5), m(i11));
                    } else {
                        continue;
                    }
                    i11 += 3;
                    i9 = i7;
                    i10 = i5;
                    i8 = 1048575;
                    break;
                case 18:
                    W.E(iArr[i11], (List) unsafe.getObject(obj, j5), e5, false);
                    break;
                case 19:
                    W.I(iArr[i11], (List) unsafe.getObject(obj, j5), e5, false);
                    break;
                case 20:
                    W.L(iArr[i11], (List) unsafe.getObject(obj, j5), e5, false);
                    break;
                case 21:
                    W.T(iArr[i11], (List) unsafe.getObject(obj, j5), e5, false);
                    break;
                case 22:
                    W.K(iArr[i11], (List) unsafe.getObject(obj, j5), e5, false);
                    break;
                case 23:
                    W.H(iArr[i11], (List) unsafe.getObject(obj, j5), e5, false);
                    break;
                case 24:
                    W.G(iArr[i11], (List) unsafe.getObject(obj, j5), e5, false);
                    break;
                case 25:
                    W.C(iArr[i11], (List) unsafe.getObject(obj, j5), e5, false);
                    break;
                case 26:
                    W.R(iArr[i11], (List) unsafe.getObject(obj, j5), e5);
                    break;
                case 27:
                    W.M(iArr[i11], (List) unsafe.getObject(obj, j5), e5, m(i11));
                    break;
                case 28:
                    W.D(iArr[i11], (List) unsafe.getObject(obj, j5), e5);
                    break;
                case 29:
                    W.S(iArr[i11], (List) unsafe.getObject(obj, j5), e5, false);
                    break;
                case 30:
                    W.F(iArr[i11], (List) unsafe.getObject(obj, j5), e5, false);
                    break;
                case 31:
                    W.N(iArr[i11], (List) unsafe.getObject(obj, j5), e5, false);
                    break;
                case 32:
                    W.O(iArr[i11], (List) unsafe.getObject(obj, j5), e5, false);
                    break;
                case 33:
                    W.P(iArr[i11], (List) unsafe.getObject(obj, j5), e5, false);
                    break;
                case 34:
                    W.Q(iArr[i11], (List) unsafe.getObject(obj, j5), e5, false);
                    break;
                case 35:
                    W.E(iArr[i11], (List) unsafe.getObject(obj, j5), e5, true);
                    break;
                case 36:
                    W.I(iArr[i11], (List) unsafe.getObject(obj, j5), e5, true);
                    break;
                case 37:
                    W.L(iArr[i11], (List) unsafe.getObject(obj, j5), e5, true);
                    break;
                case 38:
                    W.T(iArr[i11], (List) unsafe.getObject(obj, j5), e5, true);
                    break;
                case 39:
                    W.K(iArr[i11], (List) unsafe.getObject(obj, j5), e5, true);
                    break;
                case 40:
                    W.H(iArr[i11], (List) unsafe.getObject(obj, j5), e5, true);
                    break;
                case 41:
                    W.G(iArr[i11], (List) unsafe.getObject(obj, j5), e5, true);
                    break;
                case 42:
                    W.C(iArr[i11], (List) unsafe.getObject(obj, j5), e5, true);
                    break;
                case 43:
                    W.S(iArr[i11], (List) unsafe.getObject(obj, j5), e5, true);
                    break;
                case 44:
                    W.F(iArr[i11], (List) unsafe.getObject(obj, j5), e5, true);
                    break;
                case 45:
                    W.N(iArr[i11], (List) unsafe.getObject(obj, j5), e5, true);
                    break;
                case 46:
                    W.O(iArr[i11], (List) unsafe.getObject(obj, j5), e5, true);
                    break;
                case 47:
                    W.P(iArr[i11], (List) unsafe.getObject(obj, j5), e5, true);
                    break;
                case 48:
                    W.Q(iArr[i11], (List) unsafe.getObject(obj, j5), e5, true);
                    break;
                case 49:
                    W.J(iArr[i11], (List) unsafe.getObject(obj, j5), e5, m(i11));
                    break;
                case 50:
                    Object object2 = unsafe.getObject(obj, j5);
                    if (object2 != null) {
                        int i15 = 2;
                        Object obj2 = this.f4083b[(i11 / 3) * 2];
                        this.f4093m.getClass();
                        F f2 = ((G) obj2).f4074a;
                        C0220l c0220l = (C0220l) e5.f4070a;
                        c0220l.getClass();
                        for (Map.Entry entry : ((H) object2).entrySet()) {
                            c0220l.H0(i12, i15);
                            c0220l.J0(G.a(f2, entry.getKey(), entry.getValue()));
                            Object key = entry.getKey();
                            Object value = entry.getValue();
                            C0225q.b(c0220l, f2.f4071a, 1, key);
                            C0225q.b(c0220l, f2.f4072b, 2, value);
                            i15 = 2;
                        }
                    }
                    break;
                case 51:
                    if (q(i12, i11, obj)) {
                        e5.c(i12, ((Double) i0.f4163b.h(j5, obj)).doubleValue());
                    }
                    break;
                case 52:
                    if (q(i12, i11, obj)) {
                        e5.g(((Float) i0.f4163b.h(j5, obj)).floatValue(), i12);
                    }
                    break;
                case 53:
                    if (q(i12, i11, obj)) {
                        e5.j(A(j5, obj), i12);
                    }
                    break;
                case 54:
                    if (q(i12, i11, obj)) {
                        e5.q(A(j5, obj), i12);
                    }
                    break;
                case 55:
                    if (q(i12, i11, obj)) {
                        e5.i(i12, z(j5, obj));
                    }
                    break;
                case 56:
                    if (q(i12, i11, obj)) {
                        e5.f(A(j5, obj), i12);
                    }
                    break;
                case 57:
                    if (q(i12, i11, obj)) {
                        e5.e(i12, z(j5, obj));
                    }
                    break;
                case 58:
                    if (q(i12, i11, obj)) {
                        e5.a(i12, ((Boolean) i0.f4163b.h(j5, obj)).booleanValue());
                    }
                    break;
                case 59:
                    if (q(i12, i11, obj)) {
                        Object object3 = unsafe.getObject(obj, j5);
                        if (object3 instanceof String) {
                            ((C0220l) e5.f4070a).F0((String) object3, i12);
                        } else {
                            e5.b(i12, (C0215g) object3);
                        }
                    }
                    break;
                case 60:
                    if (q(i12, i11, obj)) {
                        e5.k(i12, unsafe.getObject(obj, j5), m(i11));
                    }
                    break;
                case 61:
                    if (q(i12, i11, obj)) {
                        e5.b(i12, (C0215g) unsafe.getObject(obj, j5));
                    }
                    break;
                case 62:
                    if (q(i12, i11, obj)) {
                        e5.p(i12, z(j5, obj));
                    }
                    break;
                case 63:
                    if (q(i12, i11, obj)) {
                        e5.d(i12, z(j5, obj));
                    }
                    break;
                case 64:
                    if (q(i12, i11, obj)) {
                        e5.l(i12, z(j5, obj));
                    }
                    break;
                case 65:
                    if (q(i12, i11, obj)) {
                        e5.m(A(j5, obj), i12);
                    }
                    break;
                case 66:
                    if (q(i12, i11, obj)) {
                        e5.n(i12, z(j5, obj));
                    }
                    break;
                case 67:
                    if (q(i12, i11, obj)) {
                        e5.o(A(j5, obj), i12);
                    }
                    break;
                case 68:
                    if (q(i12, i11, obj)) {
                        e5.h(i12, unsafe.getObject(obj, j5), m(i11));
                    }
                    break;
            }
            i7 = i;
            i11 += 3;
            i9 = i7;
            i10 = i5;
            i8 = 1048575;
        }
        this.f4092l.getClass();
        ((AbstractC0229v) obj).unknownFields.d(e5);
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x00dd  */
    @Override // androidx.datastore.preferences.protobuf.V
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean a(java.lang.Object r18) {
        /*
            Method dump skipped, instruction units count: 307
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.M.a(java.lang.Object):boolean");
    }

    @Override // androidx.datastore.preferences.protobuf.V
    public final void b(Object obj, Object obj2) {
        if (!p(obj)) {
            throw new IllegalArgumentException("Mutating immutable message: " + obj);
        }
        obj2.getClass();
        int i = 0;
        while (true) {
            int[] iArr = this.f4082a;
            if (i >= iArr.length) {
                W.A(this.f4092l, obj, obj2);
                return;
            }
            int iM = M(i);
            long j5 = 1048575 & iM;
            int i5 = iArr[i];
            switch (L(iM)) {
                case 0:
                    if (n(i, obj2)) {
                        h0 h0Var = i0.f4163b;
                        h0Var.l(obj, j5, h0Var.d(j5, obj2));
                        H(i, obj);
                    }
                    break;
                case 1:
                    if (n(i, obj2)) {
                        h0 h0Var2 = i0.f4163b;
                        h0Var2.m(obj, j5, h0Var2.e(j5, obj2));
                        H(i, obj);
                    }
                    break;
                case 2:
                    if (n(i, obj2)) {
                        i0.n(obj, j5, i0.f4163b.g(j5, obj2));
                        H(i, obj);
                    }
                    break;
                case 3:
                    if (n(i, obj2)) {
                        i0.n(obj, j5, i0.f4163b.g(j5, obj2));
                        H(i, obj);
                    }
                    break;
                case 4:
                    if (n(i, obj2)) {
                        i0.m(j5, obj, i0.f4163b.f(j5, obj2));
                        H(i, obj);
                    }
                    break;
                case 5:
                    if (n(i, obj2)) {
                        i0.n(obj, j5, i0.f4163b.g(j5, obj2));
                        H(i, obj);
                    }
                    break;
                case O.j.STRING_SET_FIELD_NUMBER /* 6 */:
                    if (n(i, obj2)) {
                        i0.m(j5, obj, i0.f4163b.f(j5, obj2));
                        H(i, obj);
                    }
                    break;
                case O.j.DOUBLE_FIELD_NUMBER /* 7 */:
                    if (n(i, obj2)) {
                        h0 h0Var3 = i0.f4163b;
                        h0Var3.j(obj, j5, h0Var3.c(j5, obj2));
                        H(i, obj);
                    }
                    break;
                case O.j.BYTES_FIELD_NUMBER /* 8 */:
                    if (n(i, obj2)) {
                        i0.o(j5, obj, i0.f4163b.h(j5, obj2));
                        H(i, obj);
                    }
                    break;
                case 9:
                    t(obj, i, obj2);
                    break;
                case 10:
                    if (n(i, obj2)) {
                        i0.o(j5, obj, i0.f4163b.h(j5, obj2));
                        H(i, obj);
                    }
                    break;
                case 11:
                    if (n(i, obj2)) {
                        i0.m(j5, obj, i0.f4163b.f(j5, obj2));
                        H(i, obj);
                    }
                    break;
                case 12:
                    if (n(i, obj2)) {
                        i0.m(j5, obj, i0.f4163b.f(j5, obj2));
                        H(i, obj);
                    }
                    break;
                case 13:
                    if (n(i, obj2)) {
                        i0.m(j5, obj, i0.f4163b.f(j5, obj2));
                        H(i, obj);
                    }
                    break;
                case 14:
                    if (n(i, obj2)) {
                        i0.n(obj, j5, i0.f4163b.g(j5, obj2));
                        H(i, obj);
                    }
                    break;
                case 15:
                    if (n(i, obj2)) {
                        i0.m(j5, obj, i0.f4163b.f(j5, obj2));
                        H(i, obj);
                    }
                    break;
                case 16:
                    if (n(i, obj2)) {
                        i0.n(obj, j5, i0.f4163b.g(j5, obj2));
                        H(i, obj);
                    }
                    break;
                case 17:
                    t(obj, i, obj2);
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    this.f4091k.getClass();
                    h0 h0Var4 = i0.f4163b;
                    InterfaceC0230w interfaceC0230wH = (InterfaceC0230w) h0Var4.h(j5, obj);
                    InterfaceC0230w interfaceC0230w = (InterfaceC0230w) h0Var4.h(j5, obj2);
                    T t4 = (T) interfaceC0230wH;
                    int i6 = t4.f4104n;
                    int i7 = ((T) interfaceC0230w).f4104n;
                    if (i6 > 0 && i7 > 0) {
                        if (!((AbstractC0210b) interfaceC0230wH).f4127l) {
                            interfaceC0230wH = t4.h(i7 + i6);
                        }
                        ((AbstractC0210b) interfaceC0230wH).addAll(interfaceC0230w);
                    }
                    if (i6 > 0) {
                        interfaceC0230w = interfaceC0230wH;
                    }
                    i0.o(j5, obj, interfaceC0230w);
                    break;
                case 50:
                    Class cls = W.f4109a;
                    h0 h0Var5 = i0.f4163b;
                    Object objH = h0Var5.h(j5, obj);
                    Object objH2 = h0Var5.h(j5, obj2);
                    this.f4093m.getClass();
                    i0.o(j5, obj, I.b(objH, objH2));
                    break;
                case 51:
                case 52:
                case 53:
                case 54:
                case 55:
                case 56:
                case 57:
                case 58:
                case 59:
                    if (q(i5, i, obj2)) {
                        i0.o(j5, obj, i0.f4163b.h(j5, obj2));
                        I(i5, i, obj);
                    }
                    break;
                case 60:
                    u(obj, i, obj2);
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (q(i5, i, obj2)) {
                        i0.o(j5, obj, i0.f4163b.h(j5, obj2));
                        I(i5, i, obj);
                    }
                    break;
                case 68:
                    u(obj, i, obj2);
                    break;
            }
            i += 3;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.V
    public final AbstractC0229v c() {
        this.f4090j.getClass();
        return ((AbstractC0229v) this.f4086e).k();
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x006d  */
    @Override // androidx.datastore.preferences.protobuf.V
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d(java.lang.Object r9) {
        /*
            Method dump skipped, instruction units count: 212
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.M.d(java.lang.Object):void");
    }

    @Override // androidx.datastore.preferences.protobuf.V
    public final void e(Object obj, C0219k c0219k, C0222n c0222n) throws Throwable {
        c0222n.getClass();
        if (p(obj)) {
            r(this.f4092l, obj, c0219k, c0222n);
        } else {
            throw new IllegalArgumentException("Mutating immutable message: " + obj);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.V
    public final void f(Object obj, E e5) throws IOException {
        e5.getClass();
        N(obj, e5);
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x00e1 A[PHI: r3
      0x00e1: PHI (r3v32 int) = (r3v10 int), (r3v33 int) binds: [B:83:0x0216, B:41:0x00df] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // androidx.datastore.preferences.protobuf.V
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int g(androidx.datastore.preferences.protobuf.AbstractC0229v r12) {
        /*
            Method dump skipped, instruction units count: 794
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.M.g(androidx.datastore.preferences.protobuf.v):int");
    }

    @Override // androidx.datastore.preferences.protobuf.V
    public final int h(AbstractC0229v abstractC0229v) {
        int i;
        int i5;
        int i6;
        int iZ;
        int iY;
        int i7;
        int iN0;
        int iP0;
        Unsafe unsafe = f4081o;
        int i8 = 1048575;
        int i9 = 1048575;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        while (true) {
            int[] iArr = this.f4082a;
            if (i11 >= iArr.length) {
                this.f4092l.getClass();
                return abstractC0229v.unknownFields.b() + i12;
            }
            int iM = M(i11);
            int iL = L(iM);
            int i13 = iArr[i11];
            int i14 = iArr[i11 + 2];
            int i15 = i14 & i8;
            if (iL <= 17) {
                if (i15 != i9) {
                    i10 = i15 == i8 ? 0 : unsafe.getInt(abstractC0229v, i15);
                    i9 = i15;
                }
                i = i9;
                i5 = i10;
                i6 = 1 << (i14 >>> 20);
            } else {
                i = i9;
                i5 = i10;
                i6 = 0;
            }
            long j5 = iM & i8;
            if (iL >= r.f4198m.a()) {
                r.f4199n.a();
            }
            switch (iL) {
                case 0:
                    if (o(abstractC0229v, i11, i, i5, i6)) {
                        iZ = C0220l.Z(i13);
                        i12 += iZ;
                    }
                    break;
                case 1:
                    if (o(abstractC0229v, i11, i, i5, i6)) {
                        iZ = C0220l.d0(i13);
                        i12 += iZ;
                    }
                    break;
                case 2:
                    if (o(abstractC0229v, i11, i, i5, i6)) {
                        iZ = C0220l.g0(unsafe.getLong(abstractC0229v, j5), i13);
                        i12 += iZ;
                    }
                    break;
                case 3:
                    if (o(abstractC0229v, i11, i, i5, i6)) {
                        iZ = C0220l.q0(unsafe.getLong(abstractC0229v, j5), i13);
                        i12 += iZ;
                    }
                    break;
                case 4:
                    if (o(abstractC0229v, i11, i, i5, i6)) {
                        iZ = C0220l.f0(i13, unsafe.getInt(abstractC0229v, j5));
                        i12 += iZ;
                    }
                    break;
                case 5:
                    if (o(abstractC0229v, i11, i, i5, i6)) {
                        iZ = C0220l.c0(i13);
                        i12 += iZ;
                    }
                    break;
                case O.j.STRING_SET_FIELD_NUMBER /* 6 */:
                    if (o(abstractC0229v, i11, i, i5, i6)) {
                        iZ = C0220l.b0(i13);
                        i12 += iZ;
                    }
                    break;
                case O.j.DOUBLE_FIELD_NUMBER /* 7 */:
                    if (o(abstractC0229v, i11, i, i5, i6)) {
                        iZ = C0220l.X(i13);
                        i12 += iZ;
                    }
                    break;
                case O.j.BYTES_FIELD_NUMBER /* 8 */:
                    if (o(abstractC0229v, i11, i, i5, i6)) {
                        Object object = unsafe.getObject(abstractC0229v, j5);
                        iY = object instanceof C0215g ? C0220l.Y(i13, (C0215g) object) : C0220l.l0((String) object, i13);
                        i12 = iY + i12;
                    }
                    break;
                case 9:
                    if (o(abstractC0229v, i11, i, i5, i6)) {
                        iZ = W.o(i13, unsafe.getObject(abstractC0229v, j5), m(i11));
                        i12 += iZ;
                    }
                    break;
                case 10:
                    if (o(abstractC0229v, i11, i, i5, i6)) {
                        iZ = C0220l.Y(i13, (C0215g) unsafe.getObject(abstractC0229v, j5));
                        i12 += iZ;
                    }
                    break;
                case 11:
                    if (o(abstractC0229v, i11, i, i5, i6)) {
                        iZ = C0220l.o0(i13, unsafe.getInt(abstractC0229v, j5));
                        i12 += iZ;
                    }
                    break;
                case 12:
                    if (o(abstractC0229v, i11, i, i5, i6)) {
                        iZ = C0220l.a0(i13, unsafe.getInt(abstractC0229v, j5));
                        i12 += iZ;
                    }
                    break;
                case 13:
                    if (o(abstractC0229v, i11, i, i5, i6)) {
                        iZ = C0220l.h0(i13);
                        i12 += iZ;
                    }
                    break;
                case 14:
                    if (o(abstractC0229v, i11, i, i5, i6)) {
                        iZ = C0220l.i0(i13);
                        i12 += iZ;
                    }
                    break;
                case 15:
                    if (o(abstractC0229v, i11, i, i5, i6)) {
                        iZ = C0220l.j0(i13, unsafe.getInt(abstractC0229v, j5));
                        i12 += iZ;
                    }
                    break;
                case 16:
                    if (o(abstractC0229v, i11, i, i5, i6)) {
                        iZ = C0220l.k0(unsafe.getLong(abstractC0229v, j5), i13);
                        i12 += iZ;
                    }
                    break;
                case 17:
                    if (o(abstractC0229v, i11, i, i5, i6)) {
                        iZ = C0220l.e0(i13, (AbstractC0209a) unsafe.getObject(abstractC0229v, j5), m(i11));
                        i12 += iZ;
                    }
                    break;
                case 18:
                    iZ = W.h(i13, (List) unsafe.getObject(abstractC0229v, j5));
                    i12 += iZ;
                    break;
                case 19:
                    iZ = W.f(i13, (List) unsafe.getObject(abstractC0229v, j5));
                    i12 += iZ;
                    break;
                case 20:
                    iZ = W.m(i13, (List) unsafe.getObject(abstractC0229v, j5));
                    i12 += iZ;
                    break;
                case 21:
                    iZ = W.x(i13, (List) unsafe.getObject(abstractC0229v, j5));
                    i12 += iZ;
                    break;
                case 22:
                    iZ = W.k(i13, (List) unsafe.getObject(abstractC0229v, j5));
                    i12 += iZ;
                    break;
                case 23:
                    iZ = W.h(i13, (List) unsafe.getObject(abstractC0229v, j5));
                    i12 += iZ;
                    break;
                case 24:
                    iZ = W.f(i13, (List) unsafe.getObject(abstractC0229v, j5));
                    i12 += iZ;
                    break;
                case 25:
                    iZ = W.a(i13, (List) unsafe.getObject(abstractC0229v, j5));
                    i12 += iZ;
                    break;
                case 26:
                    iZ = W.u(i13, (List) unsafe.getObject(abstractC0229v, j5));
                    i12 += iZ;
                    break;
                case 27:
                    iZ = W.p(i13, (List) unsafe.getObject(abstractC0229v, j5), m(i11));
                    i12 += iZ;
                    break;
                case 28:
                    iZ = W.c(i13, (List) unsafe.getObject(abstractC0229v, j5));
                    i12 += iZ;
                    break;
                case 29:
                    iZ = W.v(i13, (List) unsafe.getObject(abstractC0229v, j5));
                    i12 += iZ;
                    break;
                case 30:
                    iZ = W.d(i13, (List) unsafe.getObject(abstractC0229v, j5));
                    i12 += iZ;
                    break;
                case 31:
                    iZ = W.f(i13, (List) unsafe.getObject(abstractC0229v, j5));
                    i12 += iZ;
                    break;
                case 32:
                    iZ = W.h(i13, (List) unsafe.getObject(abstractC0229v, j5));
                    i12 += iZ;
                    break;
                case 33:
                    iZ = W.q(i13, (List) unsafe.getObject(abstractC0229v, j5));
                    i12 += iZ;
                    break;
                case 34:
                    iZ = W.s(i13, (List) unsafe.getObject(abstractC0229v, j5));
                    i12 += iZ;
                    break;
                case 35:
                    i7 = W.i((List) unsafe.getObject(abstractC0229v, j5));
                    if (i7 > 0) {
                        iN0 = C0220l.n0(i13);
                        iP0 = C0220l.p0(i7);
                        i12 += iP0 + iN0 + i7;
                    }
                    break;
                case 36:
                    i7 = W.g((List) unsafe.getObject(abstractC0229v, j5));
                    if (i7 > 0) {
                        iN0 = C0220l.n0(i13);
                        iP0 = C0220l.p0(i7);
                        i12 += iP0 + iN0 + i7;
                    }
                    break;
                case 37:
                    i7 = W.n((List) unsafe.getObject(abstractC0229v, j5));
                    if (i7 > 0) {
                        iN0 = C0220l.n0(i13);
                        iP0 = C0220l.p0(i7);
                        i12 += iP0 + iN0 + i7;
                    }
                    break;
                case 38:
                    i7 = W.y((List) unsafe.getObject(abstractC0229v, j5));
                    if (i7 > 0) {
                        iN0 = C0220l.n0(i13);
                        iP0 = C0220l.p0(i7);
                        i12 += iP0 + iN0 + i7;
                    }
                    break;
                case 39:
                    i7 = W.l((List) unsafe.getObject(abstractC0229v, j5));
                    if (i7 > 0) {
                        iN0 = C0220l.n0(i13);
                        iP0 = C0220l.p0(i7);
                        i12 += iP0 + iN0 + i7;
                    }
                    break;
                case 40:
                    i7 = W.i((List) unsafe.getObject(abstractC0229v, j5));
                    if (i7 > 0) {
                        iN0 = C0220l.n0(i13);
                        iP0 = C0220l.p0(i7);
                        i12 += iP0 + iN0 + i7;
                    }
                    break;
                case 41:
                    i7 = W.g((List) unsafe.getObject(abstractC0229v, j5));
                    if (i7 > 0) {
                        iN0 = C0220l.n0(i13);
                        iP0 = C0220l.p0(i7);
                        i12 += iP0 + iN0 + i7;
                    }
                    break;
                case 42:
                    i7 = W.b((List) unsafe.getObject(abstractC0229v, j5));
                    if (i7 > 0) {
                        iN0 = C0220l.n0(i13);
                        iP0 = C0220l.p0(i7);
                        i12 += iP0 + iN0 + i7;
                    }
                    break;
                case 43:
                    i7 = W.w((List) unsafe.getObject(abstractC0229v, j5));
                    if (i7 > 0) {
                        iN0 = C0220l.n0(i13);
                        iP0 = C0220l.p0(i7);
                        i12 += iP0 + iN0 + i7;
                    }
                    break;
                case 44:
                    i7 = W.e((List) unsafe.getObject(abstractC0229v, j5));
                    if (i7 > 0) {
                        iN0 = C0220l.n0(i13);
                        iP0 = C0220l.p0(i7);
                        i12 += iP0 + iN0 + i7;
                    }
                    break;
                case 45:
                    i7 = W.g((List) unsafe.getObject(abstractC0229v, j5));
                    if (i7 > 0) {
                        iN0 = C0220l.n0(i13);
                        iP0 = C0220l.p0(i7);
                        i12 += iP0 + iN0 + i7;
                    }
                    break;
                case 46:
                    i7 = W.i((List) unsafe.getObject(abstractC0229v, j5));
                    if (i7 > 0) {
                        iN0 = C0220l.n0(i13);
                        iP0 = C0220l.p0(i7);
                        i12 += iP0 + iN0 + i7;
                    }
                    break;
                case 47:
                    i7 = W.r((List) unsafe.getObject(abstractC0229v, j5));
                    if (i7 > 0) {
                        iN0 = C0220l.n0(i13);
                        iP0 = C0220l.p0(i7);
                        i12 += iP0 + iN0 + i7;
                    }
                    break;
                case 48:
                    i7 = W.t((List) unsafe.getObject(abstractC0229v, j5));
                    if (i7 > 0) {
                        iN0 = C0220l.n0(i13);
                        iP0 = C0220l.p0(i7);
                        i12 += iP0 + iN0 + i7;
                    }
                    break;
                case 49:
                    iZ = W.j(i13, (List) unsafe.getObject(abstractC0229v, j5), m(i11));
                    i12 += iZ;
                    break;
                case 50:
                    Object object2 = unsafe.getObject(abstractC0229v, j5);
                    Object obj = this.f4083b[(i11 / 3) * 2];
                    this.f4093m.getClass();
                    iZ = I.a(object2, i13, obj);
                    i12 += iZ;
                    break;
                case 51:
                    if (q(i13, i11, abstractC0229v)) {
                        iZ = C0220l.Z(i13);
                        i12 += iZ;
                    }
                    break;
                case 52:
                    if (q(i13, i11, abstractC0229v)) {
                        iZ = C0220l.d0(i13);
                        i12 += iZ;
                    }
                    break;
                case 53:
                    if (q(i13, i11, abstractC0229v)) {
                        iZ = C0220l.g0(A(j5, abstractC0229v), i13);
                        i12 += iZ;
                    }
                    break;
                case 54:
                    if (q(i13, i11, abstractC0229v)) {
                        iZ = C0220l.q0(A(j5, abstractC0229v), i13);
                        i12 += iZ;
                    }
                    break;
                case 55:
                    if (q(i13, i11, abstractC0229v)) {
                        iZ = C0220l.f0(i13, z(j5, abstractC0229v));
                        i12 += iZ;
                    }
                    break;
                case 56:
                    if (q(i13, i11, abstractC0229v)) {
                        iZ = C0220l.c0(i13);
                        i12 += iZ;
                    }
                    break;
                case 57:
                    if (q(i13, i11, abstractC0229v)) {
                        iZ = C0220l.b0(i13);
                        i12 += iZ;
                    }
                    break;
                case 58:
                    if (q(i13, i11, abstractC0229v)) {
                        iZ = C0220l.X(i13);
                        i12 += iZ;
                    }
                    break;
                case 59:
                    if (q(i13, i11, abstractC0229v)) {
                        Object object3 = unsafe.getObject(abstractC0229v, j5);
                        iY = object3 instanceof C0215g ? C0220l.Y(i13, (C0215g) object3) : C0220l.l0((String) object3, i13);
                        i12 = iY + i12;
                    }
                    break;
                case 60:
                    if (q(i13, i11, abstractC0229v)) {
                        iZ = W.o(i13, unsafe.getObject(abstractC0229v, j5), m(i11));
                        i12 += iZ;
                    }
                    break;
                case 61:
                    if (q(i13, i11, abstractC0229v)) {
                        iZ = C0220l.Y(i13, (C0215g) unsafe.getObject(abstractC0229v, j5));
                        i12 += iZ;
                    }
                    break;
                case 62:
                    if (q(i13, i11, abstractC0229v)) {
                        iZ = C0220l.o0(i13, z(j5, abstractC0229v));
                        i12 += iZ;
                    }
                    break;
                case 63:
                    if (q(i13, i11, abstractC0229v)) {
                        iZ = C0220l.a0(i13, z(j5, abstractC0229v));
                        i12 += iZ;
                    }
                    break;
                case 64:
                    if (q(i13, i11, abstractC0229v)) {
                        iZ = C0220l.h0(i13);
                        i12 += iZ;
                    }
                    break;
                case 65:
                    if (q(i13, i11, abstractC0229v)) {
                        iZ = C0220l.i0(i13);
                        i12 += iZ;
                    }
                    break;
                case 66:
                    if (q(i13, i11, abstractC0229v)) {
                        iZ = C0220l.j0(i13, z(j5, abstractC0229v));
                        i12 += iZ;
                    }
                    break;
                case 67:
                    if (q(i13, i11, abstractC0229v)) {
                        iZ = C0220l.k0(A(j5, abstractC0229v), i13);
                        i12 += iZ;
                    }
                    break;
                case 68:
                    if (q(i13, i11, abstractC0229v)) {
                        iZ = C0220l.e0(i13, (AbstractC0209a) unsafe.getObject(abstractC0229v, j5), m(i11));
                        i12 += iZ;
                    }
                    break;
            }
            i11 += 3;
            i9 = i;
            i10 = i5;
            i8 = 1048575;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x003d  */
    @Override // androidx.datastore.preferences.protobuf.V
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean i(androidx.datastore.preferences.protobuf.AbstractC0229v r12, java.lang.Object r13) {
        /*
            Method dump skipped, instruction units count: 662
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.M.i(androidx.datastore.preferences.protobuf.v, java.lang.Object):boolean");
    }

    public final boolean j(AbstractC0229v abstractC0229v, Object obj, int i) {
        return n(i, abstractC0229v) == n(i, obj);
    }

    public final void k(Object obj, int i, Object obj2) {
        int i5 = this.f4082a[i];
        if (i0.f4163b.h(M(i) & 1048575, obj) == null) {
            return;
        }
        l(i);
    }

    public final void l(int i) {
        if (this.f4083b[((i / 3) * 2) + 1] != null) {
            throw new ClassCastException();
        }
    }

    public final V m(int i) {
        int i5 = (i / 3) * 2;
        Object[] objArr = this.f4083b;
        V v4 = (V) objArr[i5];
        if (v4 != null) {
            return v4;
        }
        V vA = S.f4099c.a((Class) objArr[i5 + 1]);
        objArr[i5] = vA;
        return vA;
    }

    public final boolean n(int i, Object obj) {
        int i5 = this.f4082a[i + 2];
        long j5 = i5 & 1048575;
        if (j5 != 1048575) {
            return ((1 << (i5 >>> 20)) & i0.f4163b.f(j5, obj)) != 0;
        }
        int iM = M(i);
        long j6 = iM & 1048575;
        switch (L(iM)) {
            case 0:
                return Double.doubleToRawLongBits(i0.f4163b.d(j6, obj)) != 0;
            case 1:
                return Float.floatToRawIntBits(i0.f4163b.e(j6, obj)) != 0;
            case 2:
                return i0.f4163b.g(j6, obj) != 0;
            case 3:
                return i0.f4163b.g(j6, obj) != 0;
            case 4:
                return i0.f4163b.f(j6, obj) != 0;
            case 5:
                return i0.f4163b.g(j6, obj) != 0;
            case O.j.STRING_SET_FIELD_NUMBER /* 6 */:
                return i0.f4163b.f(j6, obj) != 0;
            case O.j.DOUBLE_FIELD_NUMBER /* 7 */:
                return i0.f4163b.c(j6, obj);
            case O.j.BYTES_FIELD_NUMBER /* 8 */:
                Object objH = i0.f4163b.h(j6, obj);
                if (objH instanceof String) {
                    return !((String) objH).isEmpty();
                }
                if (objH instanceof C0215g) {
                    return !C0215g.f4144n.equals(objH);
                }
                throw new IllegalArgumentException();
            case 9:
                return i0.f4163b.h(j6, obj) != null;
            case 10:
                return !C0215g.f4144n.equals(i0.f4163b.h(j6, obj));
            case 11:
                return i0.f4163b.f(j6, obj) != 0;
            case 12:
                return i0.f4163b.f(j6, obj) != 0;
            case 13:
                return i0.f4163b.f(j6, obj) != 0;
            case 14:
                return i0.f4163b.g(j6, obj) != 0;
            case 15:
                return i0.f4163b.f(j6, obj) != 0;
            case 16:
                return i0.f4163b.g(j6, obj) != 0;
            case 17:
                return i0.f4163b.h(j6, obj) != null;
            default:
                throw new IllegalArgumentException();
        }
    }

    public final boolean o(Object obj, int i, int i5, int i6, int i7) {
        return i5 == 1048575 ? n(i, obj) : (i6 & i7) != 0;
    }

    public final boolean q(int i, int i5, Object obj) {
        return i0.f4163b.f((long) (this.f4082a[i5 + 2] & 1048575), obj) == i;
    }

    /* JADX WARN: Removed duplicated region for block: B:124:0x064b A[Catch: all -> 0x025f, TryCatch #5 {all -> 0x025f, blocks: (B:122:0x0646, B:124:0x064b, B:125:0x0650, B:69:0x025a, B:72:0x0262, B:73:0x0275, B:74:0x0288, B:75:0x029b, B:76:0x02ae, B:77:0x02c7, B:78:0x02da, B:79:0x02ed, B:80:0x0300, B:81:0x0313, B:82:0x0326, B:83:0x0339, B:84:0x034c, B:85:0x035f, B:86:0x0372, B:87:0x0385, B:88:0x0398, B:89:0x03ab, B:90:0x03be, B:91:0x03d7, B:92:0x03ea, B:93:0x03fd, B:94:0x0411, B:95:0x0419, B:96:0x042c, B:97:0x043f, B:98:0x0452, B:99:0x0465, B:100:0x0478, B:101:0x048b, B:102:0x049e, B:103:0x04b1, B:104:0x04ca, B:105:0x04e0, B:106:0x04f6, B:107:0x050d, B:108:0x0524, B:109:0x053d, B:110:0x0553, B:111:0x0566, B:112:0x057f, B:113:0x058a, B:114:0x05a2, B:115:0x05b9, B:116:0x05d0, B:117:0x05e6, B:118:0x05fc, B:119:0x0611, B:120:0x0629), top: B:152:0x0646 }] */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0656 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void r(androidx.datastore.preferences.protobuf.d0 r20, java.lang.Object r21, androidx.datastore.preferences.protobuf.C0219k r22, androidx.datastore.preferences.protobuf.C0222n r23) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1812
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.M.r(androidx.datastore.preferences.protobuf.d0, java.lang.Object, androidx.datastore.preferences.protobuf.k, androidx.datastore.preferences.protobuf.n):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x009b, code lost:
    
        r10.put(r2, r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x009e, code lost:
    
        r0.j(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00a1, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void s(java.lang.Object r9, int r10, java.lang.Object r11, androidx.datastore.preferences.protobuf.C0222n r12, androidx.datastore.preferences.protobuf.C0219k r13) throws androidx.datastore.preferences.protobuf.C0232y, com.google.crypto.tink.shaded.protobuf.B {
        /*
            r8 = this;
            int r10 = r8.M(r10)
            r0 = 1048575(0xfffff, float:1.469367E-39)
            r10 = r10 & r0
            long r0 = (long) r10
            androidx.datastore.preferences.protobuf.h0 r10 = androidx.datastore.preferences.protobuf.i0.f4163b
            java.lang.Object r10 = r10.h(r0, r9)
            androidx.datastore.preferences.protobuf.I r2 = r8.f4093m
            if (r10 != 0) goto L20
            r2.getClass()
            androidx.datastore.preferences.protobuf.H r10 = androidx.datastore.preferences.protobuf.H.f4075m
            androidx.datastore.preferences.protobuf.H r10 = r10.b()
            androidx.datastore.preferences.protobuf.i0.o(r0, r9, r10)
            goto L37
        L20:
            r2.getClass()
            r3 = r10
            androidx.datastore.preferences.protobuf.H r3 = (androidx.datastore.preferences.protobuf.H) r3
            boolean r3 = r3.f4076l
            if (r3 != 0) goto L37
            androidx.datastore.preferences.protobuf.H r3 = androidx.datastore.preferences.protobuf.H.f4075m
            androidx.datastore.preferences.protobuf.H r3 = r3.b()
            androidx.datastore.preferences.protobuf.I.b(r3, r10)
            androidx.datastore.preferences.protobuf.i0.o(r0, r9, r3)
            r10 = r3
        L37:
            r2.getClass()
            androidx.datastore.preferences.protobuf.H r10 = (androidx.datastore.preferences.protobuf.H) r10
            androidx.datastore.preferences.protobuf.G r11 = (androidx.datastore.preferences.protobuf.G) r11
            androidx.datastore.preferences.protobuf.F r9 = r11.f4074a
            r11 = 2
            r13.R(r11)
            java.lang.Object r0 = r13.f4175e
            androidx.datastore.preferences.protobuf.j r0 = (androidx.datastore.preferences.protobuf.AbstractC0218j) r0
            int r1 = r0.D()
            int r1 = r0.l(r1)
            java.lang.String r2 = ""
            O.j r3 = r9.f4073c
            r4 = r3
        L55:
            int r5 = r13.b()     // Catch: java.lang.Throwable -> L79
            r6 = 2147483647(0x7fffffff, float:NaN)
            if (r5 == r6) goto L9b
            boolean r6 = r0.g()     // Catch: java.lang.Throwable -> L79
            if (r6 == 0) goto L65
            goto L9b
        L65:
            r6 = 1
            java.lang.String r7 = "Unable to parse map entry."
            if (r5 == r6) goto L86
            if (r5 == r11) goto L7b
            boolean r5 = r13.S()     // Catch: java.lang.Throwable -> L79 androidx.datastore.preferences.protobuf.C0232y -> L8e
            if (r5 == 0) goto L73
            goto L55
        L73:
            androidx.datastore.preferences.protobuf.z r5 = new androidx.datastore.preferences.protobuf.z     // Catch: java.lang.Throwable -> L79 androidx.datastore.preferences.protobuf.C0232y -> L8e
            r5.<init>(r7)     // Catch: java.lang.Throwable -> L79 androidx.datastore.preferences.protobuf.C0232y -> L8e
            throw r5     // Catch: java.lang.Throwable -> L79 androidx.datastore.preferences.protobuf.C0232y -> L8e
        L79:
            r9 = move-exception
            goto La2
        L7b:
            androidx.datastore.preferences.protobuf.o0 r5 = r9.f4072b     // Catch: java.lang.Throwable -> L79 androidx.datastore.preferences.protobuf.C0232y -> L8e
            java.lang.Class r6 = r3.getClass()     // Catch: java.lang.Throwable -> L79 androidx.datastore.preferences.protobuf.C0232y -> L8e
            java.lang.Object r4 = r13.q(r5, r6, r12)     // Catch: java.lang.Throwable -> L79 androidx.datastore.preferences.protobuf.C0232y -> L8e
            goto L55
        L86:
            androidx.datastore.preferences.protobuf.m0 r5 = r9.f4071a     // Catch: java.lang.Throwable -> L79 androidx.datastore.preferences.protobuf.C0232y -> L8e
            r6 = 0
            java.lang.Object r2 = r13.q(r5, r6, r6)     // Catch: java.lang.Throwable -> L79 androidx.datastore.preferences.protobuf.C0232y -> L8e
            goto L55
        L8e:
            boolean r5 = r13.S()     // Catch: java.lang.Throwable -> L79
            if (r5 == 0) goto L95
            goto L55
        L95:
            androidx.datastore.preferences.protobuf.z r9 = new androidx.datastore.preferences.protobuf.z     // Catch: java.lang.Throwable -> L79
            r9.<init>(r7)     // Catch: java.lang.Throwable -> L79
            throw r9     // Catch: java.lang.Throwable -> L79
        L9b:
            r10.put(r2, r4)     // Catch: java.lang.Throwable -> L79
            r0.j(r1)
            return
        La2:
            r0.j(r1)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.M.s(java.lang.Object, int, java.lang.Object, androidx.datastore.preferences.protobuf.n, androidx.datastore.preferences.protobuf.k):void");
    }

    public final void t(Object obj, int i, Object obj2) {
        if (n(i, obj2)) {
            long jM = M(i) & 1048575;
            Unsafe unsafe = f4081o;
            Object object = unsafe.getObject(obj2, jM);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + this.f4082a[i] + " is present but null: " + obj2);
            }
            V vM = m(i);
            if (!n(i, obj)) {
                if (p(object)) {
                    AbstractC0229v abstractC0229vC = vM.c();
                    vM.b(abstractC0229vC, object);
                    unsafe.putObject(obj, jM, abstractC0229vC);
                } else {
                    unsafe.putObject(obj, jM, object);
                }
                H(i, obj);
                return;
            }
            Object object2 = unsafe.getObject(obj, jM);
            if (!p(object2)) {
                AbstractC0229v abstractC0229vC2 = vM.c();
                vM.b(abstractC0229vC2, object2);
                unsafe.putObject(obj, jM, abstractC0229vC2);
                object2 = abstractC0229vC2;
            }
            vM.b(object2, object);
        }
    }

    public final void u(Object obj, int i, Object obj2) {
        int[] iArr = this.f4082a;
        int i5 = iArr[i];
        if (q(i5, i, obj2)) {
            long jM = M(i) & 1048575;
            Unsafe unsafe = f4081o;
            Object object = unsafe.getObject(obj2, jM);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + iArr[i] + " is present but null: " + obj2);
            }
            V vM = m(i);
            if (!q(i5, i, obj)) {
                if (p(object)) {
                    AbstractC0229v abstractC0229vC = vM.c();
                    vM.b(abstractC0229vC, object);
                    unsafe.putObject(obj, jM, abstractC0229vC);
                } else {
                    unsafe.putObject(obj, jM, object);
                }
                I(i5, i, obj);
                return;
            }
            Object object2 = unsafe.getObject(obj, jM);
            if (!p(object2)) {
                AbstractC0229v abstractC0229vC2 = vM.c();
                vM.b(abstractC0229vC2, object2);
                unsafe.putObject(obj, jM, abstractC0229vC2);
                object2 = abstractC0229vC2;
            }
            vM.b(object2, object);
        }
    }

    public final Object v(int i, Object obj) {
        V vM = m(i);
        long jM = M(i) & 1048575;
        if (!n(i, obj)) {
            return vM.c();
        }
        Object object = f4081o.getObject(obj, jM);
        if (p(object)) {
            return object;
        }
        AbstractC0229v abstractC0229vC = vM.c();
        if (object != null) {
            vM.b(abstractC0229vC, object);
        }
        return abstractC0229vC;
    }

    public final Object w(int i, int i5, Object obj) {
        V vM = m(i5);
        if (!q(i, i5, obj)) {
            return vM.c();
        }
        Object object = f4081o.getObject(obj, M(i5) & 1048575);
        if (p(object)) {
            return object;
        }
        AbstractC0229v abstractC0229vC = vM.c();
        if (object != null) {
            vM.b(abstractC0229vC, object);
        }
        return abstractC0229vC;
    }
}

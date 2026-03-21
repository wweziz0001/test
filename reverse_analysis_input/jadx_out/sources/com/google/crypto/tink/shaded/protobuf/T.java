package com.google.crypto.tink.shaded.protobuf;

import androidx.datastore.preferences.protobuf.AbstractC0218j;
import androidx.datastore.preferences.protobuf.C0219k;
import androidx.datastore.preferences.protobuf.C0232y;
import b3.AbstractC0307a;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Level;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes.dex */
public final class T implements c0 {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final int[] f5154o = new int[0];

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final Unsafe f5155p = o0.m();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int[] f5156a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object[] f5157b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f5158c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f5159d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final AbstractC0321a f5160e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f5161f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f5162g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int[] f5163h;
    public final int i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f5164j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final V f5165k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final I f5166l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final g0 f5167m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final N f5168n;

    public T(int[] iArr, Object[] objArr, int i, int i5, AbstractC0321a abstractC0321a, boolean z4, int[] iArr2, int i6, int i7, V v4, I i8, g0 g0Var, C0336p c0336p, N n4) {
        this.f5156a = iArr;
        this.f5157b = objArr;
        this.f5158c = i;
        this.f5159d = i5;
        this.f5161f = abstractC0321a instanceof AbstractC0342w;
        this.f5162g = z4;
        this.f5163h = iArr2;
        this.i = i6;
        this.f5164j = i7;
        this.f5165k = v4;
        this.f5166l = i8;
        this.f5167m = g0Var;
        this.f5160e = abstractC0321a;
        this.f5168n = n4;
    }

    public static T C(b0 b0Var, V v4, I i, g0 g0Var, C0336p c0336p, N n4) {
        if (b0Var instanceof b0) {
            return D(b0Var, v4, i, g0Var, c0336p, n4);
        }
        b0Var.getClass();
        throw new ClassCastException();
    }

    public static T D(b0 b0Var, V v4, I i, g0 g0Var, C0336p c0336p, N n4) {
        int i5;
        int iCharAt;
        int iCharAt2;
        int iCharAt3;
        int i6;
        int i7;
        int i8;
        int[] iArr;
        int i9;
        char cCharAt;
        int i10;
        char cCharAt2;
        int i11;
        char cCharAt3;
        int i12;
        char cCharAt4;
        int i13;
        char cCharAt5;
        int i14;
        char cCharAt6;
        int i15;
        char cCharAt7;
        int i16;
        char cCharAt8;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int iObjectFieldOffset;
        int i23;
        int i24;
        int iObjectFieldOffset2;
        int i25;
        Field fieldQ;
        char cCharAt9;
        int i26;
        int i27;
        int i28;
        Field fieldQ2;
        Field fieldQ3;
        int i29;
        char cCharAt10;
        int i30;
        char cCharAt11;
        int i31;
        char cCharAt12;
        int i32;
        char cCharAt13;
        int i33 = 0;
        boolean z4 = b0Var.d() == 2;
        String strC = b0Var.c();
        int length = strC.length();
        if (strC.charAt(0) >= 55296) {
            int i34 = 1;
            while (true) {
                i5 = i34 + 1;
                if (strC.charAt(i34) < 55296) {
                    break;
                }
                i34 = i5;
            }
        } else {
            i5 = 1;
        }
        int i35 = i5 + 1;
        int iCharAt4 = strC.charAt(i5);
        if (iCharAt4 >= 55296) {
            int i36 = iCharAt4 & 8191;
            int i37 = 13;
            while (true) {
                i32 = i35 + 1;
                cCharAt13 = strC.charAt(i35);
                if (cCharAt13 < 55296) {
                    break;
                }
                i36 |= (cCharAt13 & 8191) << i37;
                i37 += 13;
                i35 = i32;
            }
            iCharAt4 = i36 | (cCharAt13 << i37);
            i35 = i32;
        }
        if (iCharAt4 == 0) {
            i8 = 0;
            iCharAt = 0;
            iCharAt2 = 0;
            i6 = 0;
            iCharAt3 = 0;
            iArr = f5154o;
            i7 = 0;
        } else {
            int i38 = i35 + 1;
            int iCharAt5 = strC.charAt(i35);
            if (iCharAt5 >= 55296) {
                int i39 = iCharAt5 & 8191;
                int i40 = 13;
                while (true) {
                    i16 = i38 + 1;
                    cCharAt8 = strC.charAt(i38);
                    if (cCharAt8 < 55296) {
                        break;
                    }
                    i39 |= (cCharAt8 & 8191) << i40;
                    i40 += 13;
                    i38 = i16;
                }
                iCharAt5 = i39 | (cCharAt8 << i40);
                i38 = i16;
            }
            int i41 = i38 + 1;
            int iCharAt6 = strC.charAt(i38);
            if (iCharAt6 >= 55296) {
                int i42 = iCharAt6 & 8191;
                int i43 = 13;
                while (true) {
                    i15 = i41 + 1;
                    cCharAt7 = strC.charAt(i41);
                    if (cCharAt7 < 55296) {
                        break;
                    }
                    i42 |= (cCharAt7 & 8191) << i43;
                    i43 += 13;
                    i41 = i15;
                }
                iCharAt6 = i42 | (cCharAt7 << i43);
                i41 = i15;
            }
            int i44 = i41 + 1;
            int iCharAt7 = strC.charAt(i41);
            if (iCharAt7 >= 55296) {
                int i45 = iCharAt7 & 8191;
                int i46 = 13;
                while (true) {
                    i14 = i44 + 1;
                    cCharAt6 = strC.charAt(i44);
                    if (cCharAt6 < 55296) {
                        break;
                    }
                    i45 |= (cCharAt6 & 8191) << i46;
                    i46 += 13;
                    i44 = i14;
                }
                iCharAt7 = i45 | (cCharAt6 << i46);
                i44 = i14;
            }
            int i47 = i44 + 1;
            iCharAt = strC.charAt(i44);
            if (iCharAt >= 55296) {
                int i48 = iCharAt & 8191;
                int i49 = 13;
                while (true) {
                    i13 = i47 + 1;
                    cCharAt5 = strC.charAt(i47);
                    if (cCharAt5 < 55296) {
                        break;
                    }
                    i48 |= (cCharAt5 & 8191) << i49;
                    i49 += 13;
                    i47 = i13;
                }
                iCharAt = i48 | (cCharAt5 << i49);
                i47 = i13;
            }
            int i50 = i47 + 1;
            int iCharAt8 = strC.charAt(i47);
            if (iCharAt8 >= 55296) {
                int i51 = iCharAt8 & 8191;
                int i52 = 13;
                while (true) {
                    i12 = i50 + 1;
                    cCharAt4 = strC.charAt(i50);
                    if (cCharAt4 < 55296) {
                        break;
                    }
                    i51 |= (cCharAt4 & 8191) << i52;
                    i52 += 13;
                    i50 = i12;
                }
                iCharAt8 = i51 | (cCharAt4 << i52);
                i50 = i12;
            }
            int i53 = i50 + 1;
            iCharAt2 = strC.charAt(i50);
            if (iCharAt2 >= 55296) {
                int i54 = iCharAt2 & 8191;
                int i55 = 13;
                while (true) {
                    i11 = i53 + 1;
                    cCharAt3 = strC.charAt(i53);
                    if (cCharAt3 < 55296) {
                        break;
                    }
                    i54 |= (cCharAt3 & 8191) << i55;
                    i55 += 13;
                    i53 = i11;
                }
                iCharAt2 = i54 | (cCharAt3 << i55);
                i53 = i11;
            }
            int i56 = i53 + 1;
            int iCharAt9 = strC.charAt(i53);
            if (iCharAt9 >= 55296) {
                int i57 = iCharAt9 & 8191;
                int i58 = 13;
                while (true) {
                    i10 = i56 + 1;
                    cCharAt2 = strC.charAt(i56);
                    if (cCharAt2 < 55296) {
                        break;
                    }
                    i57 |= (cCharAt2 & 8191) << i58;
                    i58 += 13;
                    i56 = i10;
                }
                iCharAt9 = i57 | (cCharAt2 << i58);
                i56 = i10;
            }
            int i59 = i56 + 1;
            iCharAt3 = strC.charAt(i56);
            if (iCharAt3 >= 55296) {
                int i60 = iCharAt3 & 8191;
                int i61 = i59;
                int i62 = 13;
                while (true) {
                    i9 = i61 + 1;
                    cCharAt = strC.charAt(i61);
                    if (cCharAt < 55296) {
                        break;
                    }
                    i60 |= (cCharAt & 8191) << i62;
                    i62 += 13;
                    i61 = i9;
                }
                iCharAt3 = i60 | (cCharAt << i62);
                i59 = i9;
            }
            int[] iArr2 = new int[iCharAt3 + iCharAt2 + iCharAt9];
            i6 = (iCharAt5 * 2) + iCharAt6;
            i7 = iCharAt7;
            i8 = iCharAt8;
            iArr = iArr2;
            i33 = iCharAt5;
            i35 = i59;
        }
        Unsafe unsafe = f5155p;
        Object[] objArrB = b0Var.b();
        Class<?> cls = b0Var.a().getClass();
        int[] iArr3 = new int[i8 * 3];
        Object[] objArr = new Object[i8 * 2];
        int i63 = iCharAt2 + iCharAt3;
        int i64 = i63;
        int i65 = iCharAt3;
        int i66 = 0;
        int i67 = 0;
        while (i35 < length) {
            int i68 = i35 + 1;
            int iCharAt10 = strC.charAt(i35);
            if (iCharAt10 >= 55296) {
                int i69 = iCharAt10 & 8191;
                int i70 = i68;
                int i71 = 13;
                while (true) {
                    i31 = i70 + 1;
                    cCharAt12 = strC.charAt(i70);
                    i17 = length;
                    if (cCharAt12 < 55296) {
                        break;
                    }
                    i69 |= (cCharAt12 & 8191) << i71;
                    i71 += 13;
                    i70 = i31;
                    length = i17;
                }
                iCharAt10 = i69 | (cCharAt12 << i71);
                i18 = i31;
            } else {
                i17 = length;
                i18 = i68;
            }
            int i72 = i18 + 1;
            int iCharAt11 = strC.charAt(i18);
            if (iCharAt11 >= 55296) {
                int i73 = iCharAt11 & 8191;
                int i74 = i72;
                int i75 = 13;
                while (true) {
                    i30 = i74 + 1;
                    cCharAt11 = strC.charAt(i74);
                    i19 = i63;
                    if (cCharAt11 < 55296) {
                        break;
                    }
                    i73 |= (cCharAt11 & 8191) << i75;
                    i75 += 13;
                    i74 = i30;
                    i63 = i19;
                }
                iCharAt11 = i73 | (cCharAt11 << i75);
                i20 = i30;
            } else {
                i19 = i63;
                i20 = i72;
            }
            int i76 = iCharAt11 & 255;
            int i77 = iCharAt3;
            if ((iCharAt11 & 1024) != 0) {
                iArr[i66] = i67;
                i66++;
            }
            if (i76 >= 51) {
                int i78 = i20 + 1;
                int iCharAt12 = strC.charAt(i20);
                if (iCharAt12 >= 55296) {
                    int i79 = iCharAt12 & 8191;
                    int i80 = i78;
                    int i81 = 13;
                    while (true) {
                        i29 = i80 + 1;
                        cCharAt10 = strC.charAt(i80);
                        i21 = iCharAt;
                        if (cCharAt10 < 55296) {
                            break;
                        }
                        i79 |= (cCharAt10 & 8191) << i81;
                        i81 += 13;
                        i80 = i29;
                        iCharAt = i21;
                    }
                    iCharAt12 = i79 | (cCharAt10 << i81);
                    i27 = i29;
                } else {
                    i21 = iCharAt;
                    i27 = i78;
                }
                int i82 = i76 - 51;
                int i83 = i27;
                if (i82 == 9 || i82 == 17) {
                    i28 = 2;
                    objArr[((i67 / 3) * 2) + 1] = objArrB[i6];
                    i6++;
                } else {
                    if (i82 == 12 && !z4) {
                        objArr[((i67 / 3) * 2) + 1] = objArrB[i6];
                        i6++;
                    }
                    i28 = 2;
                }
                int i84 = iCharAt12 * i28;
                Object obj = objArrB[i84];
                if (obj instanceof Field) {
                    fieldQ2 = (Field) obj;
                } else {
                    fieldQ2 = Q(cls, (String) obj);
                    objArrB[i84] = fieldQ2;
                }
                int i85 = i6;
                iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldQ2);
                int i86 = i84 + 1;
                Object obj2 = objArrB[i86];
                if (obj2 instanceof Field) {
                    fieldQ3 = (Field) obj2;
                } else {
                    fieldQ3 = Q(cls, (String) obj2);
                    objArrB[i86] = fieldQ3;
                }
                iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldQ3);
                i24 = 0;
                i22 = i7;
                i25 = i85;
                i23 = i83;
            } else {
                i21 = iCharAt;
                int i87 = i6 + 1;
                Field fieldQ4 = Q(cls, (String) objArrB[i6]);
                i22 = i7;
                if (i76 == 9 || i76 == 17) {
                    objArr[((i67 / 3) * 2) + 1] = fieldQ4.getType();
                } else {
                    if (i76 == 27 || i76 == 49) {
                        i26 = i6 + 2;
                        objArr[((i67 / 3) * 2) + 1] = objArrB[i87];
                    } else if (i76 == 12 || i76 == 30 || i76 == 44) {
                        if (!z4) {
                            i26 = i6 + 2;
                            objArr[((i67 / 3) * 2) + 1] = objArrB[i87];
                        }
                    } else if (i76 == 50) {
                        int i88 = i65 + 1;
                        iArr[i65] = i67;
                        int i89 = (i67 / 3) * 2;
                        int i90 = i6 + 2;
                        objArr[i89] = objArrB[i87];
                        if ((iCharAt11 & 2048) != 0) {
                            i87 = i6 + 3;
                            objArr[i89 + 1] = objArrB[i90];
                            i65 = i88;
                        } else {
                            i65 = i88;
                            i87 = i90;
                        }
                    }
                    i87 = i26;
                }
                int iObjectFieldOffset3 = (int) unsafe.objectFieldOffset(fieldQ4);
                if ((iCharAt11 & 4096) != 4096 || i76 > 17) {
                    iObjectFieldOffset = 1048575;
                    i23 = i20;
                    i24 = 0;
                } else {
                    int i91 = i20 + 1;
                    int iCharAt13 = strC.charAt(i20);
                    if (iCharAt13 >= 55296) {
                        int i92 = iCharAt13 & 8191;
                        int i93 = 13;
                        while (true) {
                            i23 = i91 + 1;
                            cCharAt9 = strC.charAt(i91);
                            if (cCharAt9 < 55296) {
                                break;
                            }
                            i92 |= (cCharAt9 & 8191) << i93;
                            i93 += 13;
                            i91 = i23;
                        }
                        iCharAt13 = i92 | (cCharAt9 << i93);
                    } else {
                        i23 = i91;
                    }
                    int i94 = (iCharAt13 / 32) + (i33 * 2);
                    Object obj3 = objArrB[i94];
                    if (obj3 instanceof Field) {
                        fieldQ = (Field) obj3;
                    } else {
                        fieldQ = Q(cls, (String) obj3);
                        objArrB[i94] = fieldQ;
                    }
                    iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldQ);
                    i24 = iCharAt13 % 32;
                }
                if (i76 >= 18 && i76 <= 49) {
                    iArr[i64] = iObjectFieldOffset3;
                    i64++;
                }
                int i95 = i87;
                iObjectFieldOffset2 = iObjectFieldOffset3;
                i25 = i95;
            }
            int i96 = i67 + 1;
            iArr3[i67] = iCharAt10;
            int i97 = i67 + 2;
            String str = strC;
            iArr3[i96] = ((iCharAt11 & 512) != 0 ? 536870912 : 0) | ((iCharAt11 & 256) != 0 ? 268435456 : 0) | (i76 << 20) | iObjectFieldOffset2;
            i67 += 3;
            iArr3[i97] = (i24 << 20) | iObjectFieldOffset;
            i6 = i25;
            iCharAt3 = i77;
            strC = str;
            i7 = i22;
            length = i17;
            i63 = i19;
            i35 = i23;
            iCharAt = i21;
        }
        return new T(iArr3, objArr, i7, iCharAt, b0Var.a(), z4, iArr, iCharAt3, i63, v4, i, g0Var, c0336p, n4);
    }

    public static long E(int i) {
        return i & 1048575;
    }

    public static int F(long j5, Object obj) {
        return ((Integer) o0.f5235b.i(j5, obj)).intValue();
    }

    public static long G(long j5, Object obj) {
        return ((Long) o0.f5235b.i(j5, obj)).longValue();
    }

    public static Field Q(Class cls, String str) {
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

    public static int W(int i) {
        return (i & 267386880) >>> 20;
    }

    public static void Z(int i, Object obj, L l3) throws K3.b {
        if (!(obj instanceof String)) {
            l3.b(i, (AbstractC0329i) obj);
            return;
        }
        String str = (String) obj;
        C0332l c0332l = (C0332l) l3.f5148a;
        c0332l.x0(i, 2);
        int i5 = c0332l.f5228t;
        try {
            int iM0 = C0332l.m0(str.length() * 3);
            int iM02 = C0332l.m0(str.length());
            byte[] bArr = c0332l.f5226r;
            int i6 = c0332l.f5227s;
            if (iM02 == iM0) {
                int i7 = i5 + iM02;
                c0332l.f5228t = i7;
                int iV = r0.f5248a.v(str, bArr, i7, i6 - i7);
                c0332l.f5228t = i5;
                c0332l.y0((iV - i5) - iM02);
                c0332l.f5228t = iV;
            } else {
                c0332l.y0(r0.b(str));
                int i8 = c0332l.f5228t;
                c0332l.f5228t = r0.f5248a.v(str, bArr, i8, i6 - i8);
            }
        } catch (q0 e5) {
            c0332l.f5228t = i5;
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

    public static void l(Object obj) {
        if (t(obj)) {
            return;
        }
        throw new IllegalArgumentException("Mutating immutable message: " + obj);
    }

    public static boolean t(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof AbstractC0342w) {
            return ((AbstractC0342w) obj).p();
        }
        return true;
    }

    public static List v(AbstractC0342w abstractC0342w, long j5) {
        return (List) o0.f5235b.i(j5, abstractC0342w);
    }

    public final Object A(int i, Object obj) {
        c0 c0VarP = p(i);
        long jX = X(i) & 1048575;
        if (!s(i, obj)) {
            return c0VarP.c();
        }
        Object object = f5155p.getObject(obj, jX);
        if (t(object)) {
            return object;
        }
        Object objC = c0VarP.c();
        if (object != null) {
            c0VarP.b(objC, object);
        }
        return objC;
    }

    public final Object B(int i, int i5, Object obj) {
        c0 c0VarP = p(i5);
        if (!u(i, i5, obj)) {
            return c0VarP.c();
        }
        Object object = f5155p.getObject(obj, X(i5) & 1048575);
        if (t(object)) {
            return object;
        }
        Object objC = c0VarP.c();
        if (object != null) {
            c0VarP.b(objC, object);
        }
        return objC;
    }

    public final void H(long j5, Object obj, int i) {
        Unsafe unsafe = f5155p;
        Object objO = o(i);
        Object object = unsafe.getObject(obj, j5);
        this.f5168n.getClass();
        if (N.c(object)) {
            M mE = N.e();
            N.d(mE, object);
            unsafe.putObject(obj, j5, mE);
        }
        N.a(objO);
        throw null;
    }

    public final int I(Object obj, byte[] bArr, int i, int i5, int i6, int i7, int i8, int i9, int i10, long j5, int i11, C0324d c0324d) throws C {
        Unsafe unsafe = f5155p;
        long j6 = this.f5156a[i11 + 2] & 1048575;
        switch (i10) {
            case 51:
                if (i8 != 1) {
                    return i;
                }
                unsafe.putObject(obj, j5, Double.valueOf(Q1.C.s(i, bArr)));
                int i12 = i + 8;
                unsafe.putInt(obj, j6, i7);
                return i12;
            case 52:
                if (i8 != 5) {
                    return i;
                }
                unsafe.putObject(obj, j5, Float.valueOf(Q1.C.y(i, bArr)));
                int i13 = i + 4;
                unsafe.putInt(obj, j6, i7);
                return i13;
            case 53:
            case 54:
                if (i8 != 0) {
                    return i;
                }
                int iV = Q1.C.V(bArr, i, c0324d);
                unsafe.putObject(obj, j5, Long.valueOf(c0324d.f5188b));
                unsafe.putInt(obj, j6, i7);
                return iV;
            case 55:
            case 62:
                if (i8 != 0) {
                    return i;
                }
                int iT = Q1.C.T(bArr, i, c0324d);
                unsafe.putObject(obj, j5, Integer.valueOf(c0324d.f5187a));
                unsafe.putInt(obj, j6, i7);
                return iT;
            case 56:
            case 65:
                if (i8 != 1) {
                    return i;
                }
                unsafe.putObject(obj, j5, Long.valueOf(Q1.C.w(i, bArr)));
                int i14 = i + 8;
                unsafe.putInt(obj, j6, i7);
                return i14;
            case 57:
            case 64:
                if (i8 != 5) {
                    return i;
                }
                unsafe.putObject(obj, j5, Integer.valueOf(Q1.C.u(i, bArr)));
                int i15 = i + 4;
                unsafe.putInt(obj, j6, i7);
                return i15;
            case 58:
                if (i8 != 0) {
                    return i;
                }
                int iV2 = Q1.C.V(bArr, i, c0324d);
                unsafe.putObject(obj, j5, Boolean.valueOf(c0324d.f5188b != 0));
                unsafe.putInt(obj, j6, i7);
                return iV2;
            case 59:
                if (i8 != 2) {
                    return i;
                }
                int iT2 = Q1.C.T(bArr, i, c0324d);
                int i16 = c0324d.f5187a;
                if (i16 == 0) {
                    unsafe.putObject(obj, j5, "");
                } else {
                    if ((i9 & 536870912) != 0 && !r0.e(bArr, iT2, iT2 + i16)) {
                        throw C.b();
                    }
                    unsafe.putObject(obj, j5, new String(bArr, iT2, i16, A.f5128a));
                    iT2 += i16;
                }
                unsafe.putInt(obj, j6, i7);
                return iT2;
            case 60:
                if (i8 != 2) {
                    return i;
                }
                Object objB = B(i7, i11, obj);
                int iJ0 = Q1.C.j0(objB, p(i11), bArr, i, i5, c0324d);
                V(obj, i7, objB, i11);
                return iJ0;
            case 61:
                if (i8 != 2) {
                    return i;
                }
                int iQ = Q1.C.q(bArr, i, c0324d);
                unsafe.putObject(obj, j5, c0324d.f5189c);
                unsafe.putInt(obj, j6, i7);
                return iQ;
            case 63:
                if (i8 != 0) {
                    return i;
                }
                int iT3 = Q1.C.T(bArr, i, c0324d);
                int i17 = c0324d.f5187a;
                n(i11);
                unsafe.putObject(obj, j5, Integer.valueOf(i17));
                unsafe.putInt(obj, j6, i7);
                return iT3;
            case 66:
                if (i8 != 0) {
                    return i;
                }
                int iT4 = Q1.C.T(bArr, i, c0324d);
                unsafe.putObject(obj, j5, Integer.valueOf(AbstractC0218j.d(c0324d.f5187a)));
                unsafe.putInt(obj, j6, i7);
                return iT4;
            case 67:
                if (i8 != 0) {
                    return i;
                }
                int iV3 = Q1.C.V(bArr, i, c0324d);
                unsafe.putObject(obj, j5, Long.valueOf(AbstractC0218j.e(c0324d.f5188b)));
                unsafe.putInt(obj, j6, i7);
                return iV3;
            case 68:
                if (i8 != 3) {
                    return i;
                }
                Object objB2 = B(i7, i11, obj);
                int iI0 = Q1.C.i0(objB2, p(i11), bArr, i, i5, (i6 & (-8)) | 4, c0324d);
                V(obj, i7, objB2, i11);
                return iI0;
            default:
                return i;
        }
    }

    /* JADX WARN: Type update failed for variable: r31v0 'this'  ??, new type: com.google.crypto.tink.shaded.protobuf.T
    jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 11201. Try increasing type updates limit count.
    	at jadx.core.dex.visitors.typeinference.TypeUpdateInfo.requestUpdate(TypeUpdateInfo.java:37)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:224)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.suggestAllSameListener(TypeUpdate.java:513)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.arithListener(TypeUpdate.java:497)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.applyInvokeTypes(TypeUpdate.java:399)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.invokeListener(TypeUpdate.java:364)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:86)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.applyWithWiderIgnSame(TypeUpdate.java:72)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setImmutableType(TypeInferenceVisitor.java:111)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$1(TypeInferenceVisitor.java:102)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:102)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
     */
    public final int J(Object obj, byte[] bArr, int i, int i5, int i6, C0324d c0324d) {
        Unsafe unsafe;
        int i7;
        int i8;
        int iS;
        int i9;
        int iT;
        int iT2;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int iV;
        int i23;
        int i24;
        T t4 = this;
        byte[] bArr2 = bArr;
        int i25 = i5;
        int i26 = i6;
        C0324d c0324d2 = c0324d;
        l(obj);
        Unsafe unsafe2 = f5155p;
        int iR = i;
        int i27 = -1;
        int i28 = 0;
        int i29 = 0;
        int i30 = 0;
        int i31 = 1048575;
        while (true) {
            if (iR < i25) {
                int i32 = iR + 1;
                byte b4 = bArr2[iR];
                if (b4 < 0) {
                    iS = Q1.C.S(b4, bArr2, i32, c0324d2);
                    i8 = c0324d2.f5187a;
                } else {
                    i8 = b4;
                    iS = i32;
                }
                int i33 = i8 >>> 3;
                int i34 = i8 & 7;
                int i35 = t4.f5159d;
                int i36 = iS;
                int i37 = t4.f5158c;
                int i38 = i8;
                if (i33 > i27) {
                    iT2 = (i33 < i37 || i33 > i35) ? -1 : t4.T(i33, i28 / 3);
                    i10 = -1;
                    i9 = 0;
                } else {
                    if (i33 < i37 || i33 > i35) {
                        i9 = 0;
                        iT = -1;
                    } else {
                        i9 = 0;
                        iT = t4.T(i33, 0);
                    }
                    iT2 = iT;
                    i10 = -1;
                }
                if (iT2 == i10) {
                    i11 = i31;
                    i12 = i33;
                    i13 = i9;
                    unsafe = unsafe2;
                    i7 = i26;
                    i14 = i36;
                    i15 = i38;
                    i16 = i30;
                } else {
                    int[] iArr = t4.f5156a;
                    int i39 = iArr[iT2 + 1];
                    int iW = W(i39);
                    long j5 = i39 & 1048575;
                    if (iW <= 17) {
                        int i40 = iArr[iT2 + 2];
                        int i41 = 1 << (i40 >>> 20);
                        int i42 = i40 & 1048575;
                        if (i42 != i31) {
                            if (i31 != 1048575) {
                                unsafe2.putInt(obj, i31, i30);
                            }
                            i18 = i42;
                            i17 = unsafe2.getInt(obj, i42);
                        } else {
                            i17 = i30;
                            i18 = i31;
                        }
                        switch (iW) {
                            case 0:
                                i12 = i33;
                                i19 = i36;
                                i20 = i38;
                                i21 = i18;
                                i22 = iT2;
                                if (i34 == 1) {
                                    o0.r(obj, j5, Q1.C.s(i19, bArr2));
                                    iR = i19 + 8;
                                    i30 = i17 | i41;
                                    i25 = i5;
                                    i28 = i22;
                                    i27 = i12;
                                    i29 = i20;
                                    i31 = i21;
                                    i26 = i6;
                                } else {
                                    i14 = i19;
                                    unsafe = unsafe2;
                                    i13 = i22;
                                    i15 = i20;
                                    i11 = i21;
                                    i7 = i6;
                                    i16 = i17;
                                }
                                break;
                            case 1:
                                i12 = i33;
                                i19 = i36;
                                i20 = i38;
                                i21 = i18;
                                i22 = iT2;
                                if (i34 == 5) {
                                    o0.s(obj, j5, Q1.C.y(i19, bArr2));
                                    iR = i19 + 4;
                                    i30 = i17 | i41;
                                    i25 = i5;
                                    i28 = i22;
                                    i27 = i12;
                                    i29 = i20;
                                    i31 = i21;
                                    i26 = i6;
                                } else {
                                    i14 = i19;
                                    unsafe = unsafe2;
                                    i13 = i22;
                                    i15 = i20;
                                    i11 = i21;
                                    i7 = i6;
                                    i16 = i17;
                                }
                                break;
                            case 2:
                            case 3:
                                i12 = i33;
                                i19 = i36;
                                i20 = i38;
                                i21 = i18;
                                i22 = iT2;
                                if (i34 == 0) {
                                    iV = Q1.C.V(bArr2, i19, c0324d2);
                                    unsafe2.putLong(obj, j5, c0324d2.f5188b);
                                    i30 = i17 | i41;
                                    i25 = i5;
                                    iR = iV;
                                    i28 = i22;
                                    i27 = i12;
                                    i29 = i20;
                                    i31 = i21;
                                    i26 = i6;
                                } else {
                                    i14 = i19;
                                    unsafe = unsafe2;
                                    i13 = i22;
                                    i15 = i20;
                                    i11 = i21;
                                    i7 = i6;
                                    i16 = i17;
                                }
                                break;
                            case 4:
                            case 11:
                                i12 = i33;
                                i19 = i36;
                                i20 = i38;
                                i21 = i18;
                                i22 = iT2;
                                if (i34 == 0) {
                                    iR = Q1.C.T(bArr2, i19, c0324d2);
                                    unsafe2.putInt(obj, j5, c0324d2.f5187a);
                                    i30 = i17 | i41;
                                    i25 = i5;
                                    i28 = i22;
                                    i27 = i12;
                                    i29 = i20;
                                    i31 = i21;
                                    i26 = i6;
                                } else {
                                    i14 = i19;
                                    unsafe = unsafe2;
                                    i13 = i22;
                                    i15 = i20;
                                    i11 = i21;
                                    i7 = i6;
                                    i16 = i17;
                                }
                                break;
                            case 5:
                            case 14:
                                i12 = i33;
                                i23 = i36;
                                i20 = i38;
                                i21 = i18;
                                i22 = iT2;
                                if (i34 == 1) {
                                    unsafe2.putLong(obj, j5, Q1.C.w(i23, bArr2));
                                    iR = i23 + 8;
                                    i30 = i17 | i41;
                                    i25 = i5;
                                    i28 = i22;
                                    i27 = i12;
                                    i29 = i20;
                                    i31 = i21;
                                    i26 = i6;
                                } else {
                                    i19 = i23;
                                    i14 = i19;
                                    unsafe = unsafe2;
                                    i13 = i22;
                                    i15 = i20;
                                    i11 = i21;
                                    i7 = i6;
                                    i16 = i17;
                                }
                                break;
                            case O.j.STRING_SET_FIELD_NUMBER /* 6 */:
                            case 13:
                                i12 = i33;
                                i23 = i36;
                                i20 = i38;
                                i21 = i18;
                                i22 = iT2;
                                if (i34 == 5) {
                                    unsafe2.putInt(obj, j5, Q1.C.u(i23, bArr2));
                                    iR = i23 + 4;
                                    i30 = i17 | i41;
                                    i25 = i5;
                                    i28 = i22;
                                    i27 = i12;
                                    i29 = i20;
                                    i31 = i21;
                                    i26 = i6;
                                } else {
                                    i19 = i23;
                                    i14 = i19;
                                    unsafe = unsafe2;
                                    i13 = i22;
                                    i15 = i20;
                                    i11 = i21;
                                    i7 = i6;
                                    i16 = i17;
                                }
                                break;
                            case O.j.DOUBLE_FIELD_NUMBER /* 7 */:
                                i12 = i33;
                                i23 = i36;
                                i20 = i38;
                                i21 = i18;
                                i22 = iT2;
                                if (i34 == 0) {
                                    int iV2 = Q1.C.V(bArr2, i23, c0324d2);
                                    o0.n(obj, j5, c0324d2.f5188b != 0);
                                    i30 = i17 | i41;
                                    i25 = i5;
                                    iR = iV2;
                                    i28 = i22;
                                    i27 = i12;
                                    i29 = i20;
                                    i31 = i21;
                                    i26 = i6;
                                } else {
                                    i19 = i23;
                                    i14 = i19;
                                    unsafe = unsafe2;
                                    i13 = i22;
                                    i15 = i20;
                                    i11 = i21;
                                    i7 = i6;
                                    i16 = i17;
                                }
                                break;
                            case O.j.BYTES_FIELD_NUMBER /* 8 */:
                                i12 = i33;
                                i23 = i36;
                                i20 = i38;
                                i21 = i18;
                                i22 = iT2;
                                if (i34 == 2) {
                                    iR = (i39 & 536870912) == 0 ? Q1.C.N(bArr2, i23, c0324d2) : Q1.C.Q(bArr2, i23, c0324d2);
                                    unsafe2.putObject(obj, j5, c0324d2.f5189c);
                                    i30 = i17 | i41;
                                    i25 = i5;
                                    i28 = i22;
                                    i27 = i12;
                                    i29 = i20;
                                    i31 = i21;
                                    i26 = i6;
                                } else {
                                    i19 = i23;
                                    i14 = i19;
                                    unsafe = unsafe2;
                                    i13 = i22;
                                    i15 = i20;
                                    i11 = i21;
                                    i7 = i6;
                                    i16 = i17;
                                }
                                break;
                            case 9:
                                i12 = i33;
                                i23 = i36;
                                i20 = i38;
                                i21 = i18;
                                i22 = iT2;
                                if (i34 == 2) {
                                    Object objA = t4.A(i22, obj);
                                    iR = Q1.C.j0(objA, t4.p(i22), bArr, i23, i5, c0324d);
                                    t4.U(obj, i22, objA);
                                    i30 = i17 | i41;
                                    i25 = i5;
                                    i28 = i22;
                                    i27 = i12;
                                    i29 = i20;
                                    i31 = i21;
                                    i26 = i6;
                                } else {
                                    i19 = i23;
                                    i14 = i19;
                                    unsafe = unsafe2;
                                    i13 = i22;
                                    i15 = i20;
                                    i11 = i21;
                                    i7 = i6;
                                    i16 = i17;
                                }
                                break;
                            case 10:
                                i12 = i33;
                                i23 = i36;
                                i20 = i38;
                                i21 = i18;
                                i22 = iT2;
                                if (i34 == 2) {
                                    iR = Q1.C.q(bArr2, i23, c0324d2);
                                    unsafe2.putObject(obj, j5, c0324d2.f5189c);
                                    i30 = i17 | i41;
                                    i25 = i5;
                                    i28 = i22;
                                    i27 = i12;
                                    i29 = i20;
                                    i31 = i21;
                                    i26 = i6;
                                } else {
                                    i19 = i23;
                                    i14 = i19;
                                    unsafe = unsafe2;
                                    i13 = i22;
                                    i15 = i20;
                                    i11 = i21;
                                    i7 = i6;
                                    i16 = i17;
                                }
                                break;
                            case 12:
                                i12 = i33;
                                i23 = i36;
                                i20 = i38;
                                i21 = i18;
                                i22 = iT2;
                                if (i34 == 0) {
                                    iR = Q1.C.T(bArr2, i23, c0324d2);
                                    int i43 = c0324d2.f5187a;
                                    t4.n(i22);
                                    unsafe2.putInt(obj, j5, i43);
                                    i30 = i17 | i41;
                                    i25 = i5;
                                    i28 = i22;
                                    i27 = i12;
                                    i29 = i20;
                                    i31 = i21;
                                    i26 = i6;
                                } else {
                                    i19 = i23;
                                    i14 = i19;
                                    unsafe = unsafe2;
                                    i13 = i22;
                                    i15 = i20;
                                    i11 = i21;
                                    i7 = i6;
                                    i16 = i17;
                                }
                                break;
                            case 15:
                                i12 = i33;
                                i23 = i36;
                                i20 = i38;
                                i21 = i18;
                                i22 = iT2;
                                if (i34 == 0) {
                                    iR = Q1.C.T(bArr2, i23, c0324d2);
                                    unsafe2.putInt(obj, j5, AbstractC0218j.d(c0324d2.f5187a));
                                    i30 = i17 | i41;
                                    i25 = i5;
                                    i28 = i22;
                                    i27 = i12;
                                    i29 = i20;
                                    i31 = i21;
                                    i26 = i6;
                                } else {
                                    i19 = i23;
                                    i14 = i19;
                                    unsafe = unsafe2;
                                    i13 = i22;
                                    i15 = i20;
                                    i11 = i21;
                                    i7 = i6;
                                    i16 = i17;
                                }
                                break;
                            case 16:
                                i12 = i33;
                                i23 = i36;
                                i20 = i38;
                                i21 = i18;
                                i22 = iT2;
                                if (i34 == 0) {
                                    iV = Q1.C.V(bArr2, i23, c0324d2);
                                    unsafe2.putLong(obj, j5, AbstractC0218j.e(c0324d2.f5188b));
                                    i30 = i17 | i41;
                                    i25 = i5;
                                    iR = iV;
                                    i28 = i22;
                                    i27 = i12;
                                    i29 = i20;
                                    i31 = i21;
                                    i26 = i6;
                                } else {
                                    i19 = i23;
                                    i14 = i19;
                                    unsafe = unsafe2;
                                    i13 = i22;
                                    i15 = i20;
                                    i11 = i21;
                                    i7 = i6;
                                    i16 = i17;
                                }
                                break;
                            case 17:
                                if (i34 == 3) {
                                    Object objA2 = t4.A(iT2, obj);
                                    i21 = i18;
                                    i20 = i38;
                                    i22 = iT2;
                                    i12 = i33;
                                    iR = Q1.C.i0(objA2, t4.p(iT2), bArr, i36, i5, (i33 << 3) | 4, c0324d);
                                    t4.U(obj, i22, objA2);
                                    i30 = i17 | i41;
                                    i25 = i5;
                                    i28 = i22;
                                    i27 = i12;
                                    i29 = i20;
                                    i31 = i21;
                                    i26 = i6;
                                } else {
                                    i12 = i33;
                                    i23 = i36;
                                    i20 = i38;
                                    i21 = i18;
                                    i22 = iT2;
                                    i19 = i23;
                                    i14 = i19;
                                    unsafe = unsafe2;
                                    i13 = i22;
                                    i15 = i20;
                                    i11 = i21;
                                    i7 = i6;
                                    i16 = i17;
                                }
                                break;
                            default:
                                i12 = i33;
                                i19 = i36;
                                i20 = i38;
                                i21 = i18;
                                i22 = iT2;
                                i14 = i19;
                                unsafe = unsafe2;
                                i13 = i22;
                                i15 = i20;
                                i11 = i21;
                                i7 = i6;
                                i16 = i17;
                                break;
                        }
                    } else {
                        i12 = i33;
                        int i44 = iT2;
                        if (iW != 27) {
                            i16 = i30;
                            i11 = i31;
                            if (iW <= 49) {
                                unsafe = unsafe2;
                                i13 = i44;
                                iR = L(obj, bArr, i36, i5, i38, i34, i44, i39, iW, j5, c0324d);
                                if (iR != i36) {
                                    t4 = this;
                                    bArr2 = bArr;
                                    i25 = i5;
                                    i26 = i6;
                                    c0324d2 = c0324d;
                                    i27 = i12;
                                    i29 = i38;
                                    i30 = i16;
                                    i31 = i11;
                                    unsafe2 = unsafe;
                                    i28 = i13;
                                } else {
                                    i7 = i6;
                                    i14 = iR;
                                }
                            } else {
                                i24 = i36;
                                unsafe = unsafe2;
                                i13 = i44;
                                if (iW != 50) {
                                    iR = I(obj, bArr, i24, i5, i38, i12, i34, i39, iW, j5, i13, c0324d);
                                    if (iR != i24) {
                                        t4 = this;
                                        bArr2 = bArr;
                                        i25 = i5;
                                        i26 = i6;
                                        c0324d2 = c0324d;
                                        i28 = i13;
                                        i27 = i12;
                                        i29 = i38;
                                        i30 = i16;
                                        i31 = i11;
                                        unsafe2 = unsafe;
                                    } else {
                                        i7 = i6;
                                        i14 = iR;
                                        i13 = i13;
                                    }
                                } else if (i34 == 2) {
                                    H(j5, obj, i13);
                                    throw null;
                                }
                            }
                            i15 = i38;
                        } else if (i34 == 2) {
                            AbstractC0322b abstractC0322b = (AbstractC0322b) ((InterfaceC0345z) unsafe2.getObject(obj, j5));
                            boolean zG = abstractC0322b.g();
                            AbstractC0322b abstractC0322b2 = abstractC0322b;
                            if (!zG) {
                                int size = abstractC0322b.size();
                                InterfaceC0345z interfaceC0345zC = abstractC0322b.c(size == 0 ? 10 : size * 2);
                                unsafe2.putObject(obj, j5, interfaceC0345zC);
                                abstractC0322b2 = interfaceC0345zC;
                            }
                            iR = Q1.C.B(t4.p(i44), i38, bArr, i36, i5, abstractC0322b2, c0324d);
                            i25 = i5;
                            i28 = i44;
                            i27 = i12;
                            i29 = i38;
                            i30 = i30;
                            i31 = i31;
                            i26 = i6;
                        } else {
                            i16 = i30;
                            i11 = i31;
                            i24 = i36;
                            unsafe = unsafe2;
                            i13 = i44;
                        }
                        i7 = i6;
                        i14 = i24;
                        i15 = i38;
                    }
                }
                if (i15 != i7 || i7 == 0) {
                    AbstractC0342w abstractC0342w = (AbstractC0342w) obj;
                    f0 f0VarC = abstractC0342w.unknownFields;
                    if (f0VarC == f0.f5195f) {
                        f0VarC = f0.c();
                        abstractC0342w.unknownFields = f0VarC;
                    }
                    iR = Q1.C.R(i15, bArr, i14, i5, f0VarC, c0324d);
                    t4 = this;
                    bArr2 = bArr;
                    i25 = i5;
                    c0324d2 = c0324d;
                    i26 = i7;
                    i29 = i15;
                    i27 = i12;
                    i30 = i16;
                    i31 = i11;
                    unsafe2 = unsafe;
                    i28 = i13;
                } else {
                    iR = i14;
                    i29 = i15;
                    i30 = i16;
                    i31 = i11;
                }
            } else {
                unsafe = unsafe2;
                i7 = i26;
            }
        }
        if (i31 != 1048575) {
            unsafe.putInt(obj, i31, i30);
        }
        for (int i45 = this.i; i45 < this.f5164j; i45++) {
            m(obj, this.f5163h[i45], null);
        }
        if (i7 == 0) {
            if (iR != i5) {
                throw C.f();
            }
        } else if (iR > i5 || i29 != i7) {
            throw C.f();
        }
        return iR;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:33:0x009c. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0042  */
    /* JADX WARN: Type update failed for variable: r30v0 'this'  ??, new type: com.google.crypto.tink.shaded.protobuf.T
    jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 8321. Try increasing type updates limit count.
    	at jadx.core.dex.visitors.typeinference.TypeUpdateInfo.requestUpdate(TypeUpdateInfo.java:37)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:224)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.suggestAllSameListener(TypeUpdate.java:513)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.arithListener(TypeUpdate.java:497)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.suggestAllSameListener(TypeUpdate.java:507)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.arithListener(TypeUpdate.java:497)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.ifListener(TypeUpdate.java:640)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.suggestAllSameListener(TypeUpdate.java:513)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.arithListener(TypeUpdate.java:497)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.ifListener(TypeUpdate.java:640)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.applyInvokeTypes(TypeUpdate.java:381)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.invokeListener(TypeUpdate.java:364)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:86)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.applyWithWiderIgnSame(TypeUpdate.java:72)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setImmutableType(TypeInferenceVisitor.java:111)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$1(TypeInferenceVisitor.java:102)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:102)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void K(java.lang.Object r31, byte[] r32, int r33, int r34, com.google.crypto.tink.shaded.protobuf.C0324d r35) throws com.google.crypto.tink.shaded.protobuf.C {
        /*
            Method dump skipped, instruction units count: 832
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.crypto.tink.shaded.protobuf.T.K(java.lang.Object, byte[], int, int, com.google.crypto.tink.shaded.protobuf.d):void");
    }

    public final int L(Object obj, byte[] bArr, int i, int i5, int i6, int i7, int i8, long j5, int i9, long j6, C0324d c0324d) throws C {
        int iU;
        Unsafe unsafe = f5155p;
        AbstractC0322b abstractC0322b = (AbstractC0322b) ((InterfaceC0345z) unsafe.getObject(obj, j6));
        boolean zG = abstractC0322b.g();
        AbstractC0322b abstractC0322b2 = abstractC0322b;
        if (!zG) {
            int size = abstractC0322b.size();
            InterfaceC0345z interfaceC0345zC = abstractC0322b.c(size == 0 ? 10 : size * 2);
            unsafe.putObject(obj, j6, interfaceC0345zC);
            abstractC0322b2 = interfaceC0345zC;
        }
        switch (i9) {
            case 18:
            case 35:
                return i7 == 2 ? Q1.C.D(bArr, i, abstractC0322b2, c0324d) : i7 == 1 ? Q1.C.t(i6, bArr, i, i5, abstractC0322b2, c0324d) : i;
            case 19:
            case 36:
                return i7 == 2 ? Q1.C.G(bArr, i, abstractC0322b2, c0324d) : i7 == 5 ? Q1.C.z(i6, bArr, i, i5, abstractC0322b2, c0324d) : i;
            case 20:
            case 21:
            case 37:
            case 38:
                return i7 == 2 ? Q1.C.K(bArr, i, abstractC0322b2, c0324d) : i7 == 0 ? Q1.C.W(i6, bArr, i, i5, abstractC0322b2, c0324d) : i;
            case 22:
            case 29:
            case 39:
            case 43:
                return i7 == 2 ? Q1.C.J(bArr, i, abstractC0322b2, c0324d) : i7 == 0 ? Q1.C.U(i6, bArr, i, i5, abstractC0322b2, c0324d) : i;
            case 23:
            case 32:
            case 40:
            case 46:
                return i7 == 2 ? Q1.C.F(bArr, i, abstractC0322b2, c0324d) : i7 == 1 ? Q1.C.x(i6, bArr, i, i5, abstractC0322b2, c0324d) : i;
            case 24:
            case 31:
            case 41:
            case 45:
                return i7 == 2 ? Q1.C.E(bArr, i, abstractC0322b2, c0324d) : i7 == 5 ? Q1.C.v(i6, bArr, i, i5, abstractC0322b2, c0324d) : i;
            case 25:
            case 42:
                return i7 == 2 ? Q1.C.C(bArr, i, abstractC0322b2, c0324d) : i7 == 0 ? Q1.C.p(i6, bArr, i, i5, abstractC0322b2, c0324d) : i;
            case 26:
                return i7 == 2 ? (j5 & 536870912) == 0 ? Q1.C.O(i6, bArr, i, i5, abstractC0322b2, c0324d) : Q1.C.P(i6, bArr, i, i5, abstractC0322b2, c0324d) : i;
            case 27:
                return i7 == 2 ? Q1.C.B(p(i8), i6, bArr, i, i5, abstractC0322b2, c0324d) : i;
            case 28:
                return i7 == 2 ? Q1.C.r(i6, bArr, i, i5, abstractC0322b2, c0324d) : i;
            case 30:
            case 44:
                if (i7 == 2) {
                    iU = Q1.C.J(bArr, i, abstractC0322b2, c0324d);
                } else {
                    if (i7 != 0) {
                        return i;
                    }
                    iU = Q1.C.U(i6, bArr, i, i5, abstractC0322b2, c0324d);
                }
                n(i8);
                Class cls = d0.f5190a;
                return iU;
            case 33:
            case 47:
                return i7 == 2 ? Q1.C.H(bArr, i, abstractC0322b2, c0324d) : i7 == 0 ? Q1.C.L(i6, bArr, i, i5, abstractC0322b2, c0324d) : i;
            case 34:
            case 48:
                return i7 == 2 ? Q1.C.I(bArr, i, abstractC0322b2, c0324d) : i7 == 0 ? Q1.C.M(i6, bArr, i, i5, abstractC0322b2, c0324d) : i;
            case 49:
                return i7 == 3 ? Q1.C.A(p(i8), i6, bArr, i, i5, abstractC0322b2, c0324d) : i;
            default:
                return i;
        }
    }

    public final void M(Object obj, long j5, C0219k c0219k, c0 c0Var, C0335o c0335o) throws B {
        int iC;
        List listC = this.f5166l.c(j5, obj);
        int i = c0219k.f4172b;
        if ((i & 7) != 3) {
            throw C.c();
        }
        do {
            Object objC = c0Var.c();
            c0219k.d(objC, c0Var, c0335o);
            c0Var.d(objC);
            listC.add(objC);
            AbstractC0218j abstractC0218j = (AbstractC0218j) c0219k.f4175e;
            if (abstractC0218j.g() || c0219k.f4174d != 0) {
                return;
            } else {
                iC = abstractC0218j.C();
            }
        } while (iC == i);
        c0219k.f4174d = iC;
    }

    public final void N(Object obj, int i, C0219k c0219k, c0 c0Var, C0335o c0335o) throws C {
        int iC;
        List listC = this.f5166l.c(i & 1048575, obj);
        int i5 = c0219k.f4172b;
        if ((i5 & 7) != 2) {
            throw C.c();
        }
        do {
            Object objC = c0Var.c();
            c0219k.f(objC, c0Var, c0335o);
            c0Var.d(objC);
            listC.add(objC);
            AbstractC0218j abstractC0218j = (AbstractC0218j) c0219k.f4175e;
            if (abstractC0218j.g() || c0219k.f4174d != 0) {
                return;
            } else {
                iC = abstractC0218j.C();
            }
        } while (iC == i5);
        c0219k.f4174d = iC;
    }

    public final void O(int i, C0219k c0219k, Object obj) throws C0232y, B {
        if ((536870912 & i) != 0) {
            c0219k.R(2);
            o0.v(i & 1048575, obj, ((AbstractC0218j) c0219k.f4175e).B());
        } else if (!this.f5161f) {
            o0.v(i & 1048575, obj, c0219k.j());
        } else {
            c0219k.R(2);
            o0.v(i & 1048575, obj, ((AbstractC0218j) c0219k.f4175e).A());
        }
    }

    public final void P(int i, C0219k c0219k, Object obj) throws C0232y, B {
        boolean z4 = (536870912 & i) != 0;
        I i5 = this.f5166l;
        if (z4) {
            c0219k.K(i5.c(i & 1048575, obj), true);
        } else {
            c0219k.K(i5.c(i & 1048575, obj), false);
        }
    }

    public final void R(int i, Object obj) {
        int i5 = this.f5156a[i + 2];
        long j5 = 1048575 & i5;
        if (j5 == 1048575) {
            return;
        }
        o0.t(j5, obj, (1 << (i5 >>> 20)) | o0.f5235b.g(j5, obj));
    }

    public final void S(int i, int i5, Object obj) {
        o0.t(this.f5156a[i5 + 2] & 1048575, obj, i);
    }

    public final int T(int i, int i5) {
        int[] iArr = this.f5156a;
        int length = (iArr.length / 3) - 1;
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

    public final void U(Object obj, int i, Object obj2) {
        f5155p.putObject(obj, X(i) & 1048575, obj2);
        R(i, obj);
    }

    public final void V(Object obj, int i, Object obj2, int i5) {
        f5155p.putObject(obj, X(i5) & 1048575, obj2);
        S(i, i5, obj);
    }

    public final int X(int i) {
        return this.f5156a[i + 1];
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final void Y(Object obj, L l3) throws K3.b {
        int i;
        boolean z4;
        int[] iArr = this.f5156a;
        int length = iArr.length;
        Unsafe unsafe = f5155p;
        int i5 = 1048575;
        int i6 = 1048575;
        int i7 = 0;
        int i8 = 0;
        while (i7 < length) {
            int iX = X(i7);
            int i9 = iArr[i7];
            int iW = W(iX);
            if (iW <= 17) {
                int i10 = iArr[i7 + 2];
                int i11 = i10 & i5;
                if (i11 != i6) {
                    i8 = unsafe.getInt(obj, i11);
                    i6 = i11;
                }
                i = 1 << (i10 >>> 20);
            } else {
                i = 0;
            }
            int i12 = i;
            long j5 = iX & i5;
            switch (iW) {
                case 0:
                    if ((i8 & i12) != 0) {
                        l3.c(i9, o0.f5235b.e(j5, obj));
                    }
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 1:
                    if ((i8 & i12) != 0) {
                        l3.g(o0.f5235b.f(j5, obj), i9);
                    }
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 2:
                    if ((i8 & i12) != 0) {
                        l3.j(unsafe.getLong(obj, j5), i9);
                    }
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 3:
                    if ((i8 & i12) != 0) {
                        l3.q(unsafe.getLong(obj, j5), i9);
                    }
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 4:
                    if ((i8 & i12) != 0) {
                        l3.i(i9, unsafe.getInt(obj, j5));
                    }
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 5:
                    if ((i8 & i12) != 0) {
                        l3.f(unsafe.getLong(obj, j5), i9);
                    }
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case O.j.STRING_SET_FIELD_NUMBER /* 6 */:
                    if ((i8 & i12) != 0) {
                        l3.e(i9, unsafe.getInt(obj, j5));
                    }
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case O.j.DOUBLE_FIELD_NUMBER /* 7 */:
                    if ((i8 & i12) != 0) {
                        l3.a(i9, o0.f5235b.c(j5, obj));
                    }
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case O.j.BYTES_FIELD_NUMBER /* 8 */:
                    if ((i8 & i12) != 0) {
                        Z(i9, unsafe.getObject(obj, j5), l3);
                    }
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 9:
                    if ((i8 & i12) != 0) {
                        l3.k(i9, unsafe.getObject(obj, j5), p(i7));
                    }
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 10:
                    if ((i8 & i12) != 0) {
                        l3.b(i9, (AbstractC0329i) unsafe.getObject(obj, j5));
                    }
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 11:
                    if ((i8 & i12) != 0) {
                        l3.p(i9, unsafe.getInt(obj, j5));
                    }
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 12:
                    if ((i8 & i12) != 0) {
                        l3.d(i9, unsafe.getInt(obj, j5));
                    }
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 13:
                    if ((i8 & i12) != 0) {
                        l3.l(i9, unsafe.getInt(obj, j5));
                    }
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 14:
                    if ((i8 & i12) != 0) {
                        l3.m(unsafe.getLong(obj, j5), i9);
                    }
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 15:
                    if ((i8 & i12) != 0) {
                        l3.n(i9, unsafe.getInt(obj, j5));
                    }
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 16:
                    if ((i8 & i12) != 0) {
                        l3.o(unsafe.getLong(obj, j5), i9);
                    }
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 17:
                    if ((i8 & i12) != 0) {
                        l3.h(i9, unsafe.getObject(obj, j5), p(i7));
                    }
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 18:
                    d0.F(iArr[i7], (List) unsafe.getObject(obj, j5), l3, false);
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 19:
                    d0.J(iArr[i7], (List) unsafe.getObject(obj, j5), l3, false);
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 20:
                    d0.M(iArr[i7], (List) unsafe.getObject(obj, j5), l3, false);
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 21:
                    d0.U(iArr[i7], (List) unsafe.getObject(obj, j5), l3, false);
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 22:
                    d0.L(iArr[i7], (List) unsafe.getObject(obj, j5), l3, false);
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 23:
                    d0.I(iArr[i7], (List) unsafe.getObject(obj, j5), l3, false);
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 24:
                    d0.H(iArr[i7], (List) unsafe.getObject(obj, j5), l3, false);
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 25:
                    d0.D(iArr[i7], (List) unsafe.getObject(obj, j5), l3, false);
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 26:
                    d0.S(iArr[i7], (List) unsafe.getObject(obj, j5), l3);
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 27:
                    d0.N(iArr[i7], (List) unsafe.getObject(obj, j5), l3, p(i7));
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 28:
                    d0.E(iArr[i7], (List) unsafe.getObject(obj, j5), l3);
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 29:
                    z4 = false;
                    d0.T(iArr[i7], (List) unsafe.getObject(obj, j5), l3, false);
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 30:
                    z4 = false;
                    d0.G(iArr[i7], (List) unsafe.getObject(obj, j5), l3, false);
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 31:
                    z4 = false;
                    d0.O(iArr[i7], (List) unsafe.getObject(obj, j5), l3, false);
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 32:
                    z4 = false;
                    d0.P(iArr[i7], (List) unsafe.getObject(obj, j5), l3, false);
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 33:
                    z4 = false;
                    d0.Q(iArr[i7], (List) unsafe.getObject(obj, j5), l3, false);
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 34:
                    z4 = false;
                    d0.R(iArr[i7], (List) unsafe.getObject(obj, j5), l3, false);
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 35:
                    d0.F(iArr[i7], (List) unsafe.getObject(obj, j5), l3, true);
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 36:
                    d0.J(iArr[i7], (List) unsafe.getObject(obj, j5), l3, true);
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 37:
                    d0.M(iArr[i7], (List) unsafe.getObject(obj, j5), l3, true);
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 38:
                    d0.U(iArr[i7], (List) unsafe.getObject(obj, j5), l3, true);
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 39:
                    d0.L(iArr[i7], (List) unsafe.getObject(obj, j5), l3, true);
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 40:
                    d0.I(iArr[i7], (List) unsafe.getObject(obj, j5), l3, true);
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 41:
                    d0.H(iArr[i7], (List) unsafe.getObject(obj, j5), l3, true);
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 42:
                    d0.D(iArr[i7], (List) unsafe.getObject(obj, j5), l3, true);
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 43:
                    d0.T(iArr[i7], (List) unsafe.getObject(obj, j5), l3, true);
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 44:
                    d0.G(iArr[i7], (List) unsafe.getObject(obj, j5), l3, true);
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 45:
                    d0.O(iArr[i7], (List) unsafe.getObject(obj, j5), l3, true);
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 46:
                    d0.P(iArr[i7], (List) unsafe.getObject(obj, j5), l3, true);
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 47:
                    d0.Q(iArr[i7], (List) unsafe.getObject(obj, j5), l3, true);
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 48:
                    d0.R(iArr[i7], (List) unsafe.getObject(obj, j5), l3, true);
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 49:
                    d0.K(iArr[i7], (List) unsafe.getObject(obj, j5), l3, p(i7));
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 50:
                    if (unsafe.getObject(obj, j5) != null) {
                        Object objO = o(i7);
                        this.f5168n.getClass();
                        AbstractC0307a.q(objO);
                        throw null;
                    }
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 51:
                    if (u(i9, i7, obj)) {
                        l3.c(i9, ((Double) o0.f5235b.i(j5, obj)).doubleValue());
                    }
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 52:
                    if (u(i9, i7, obj)) {
                        l3.g(((Float) o0.f5235b.i(j5, obj)).floatValue(), i9);
                    }
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 53:
                    if (u(i9, i7, obj)) {
                        l3.j(G(j5, obj), i9);
                    }
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 54:
                    if (u(i9, i7, obj)) {
                        l3.q(G(j5, obj), i9);
                    }
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 55:
                    if (u(i9, i7, obj)) {
                        l3.i(i9, F(j5, obj));
                    }
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 56:
                    if (u(i9, i7, obj)) {
                        l3.f(G(j5, obj), i9);
                    }
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 57:
                    if (u(i9, i7, obj)) {
                        l3.e(i9, F(j5, obj));
                    }
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 58:
                    if (u(i9, i7, obj)) {
                        l3.a(i9, ((Boolean) o0.f5235b.i(j5, obj)).booleanValue());
                    }
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 59:
                    if (u(i9, i7, obj)) {
                        Z(i9, unsafe.getObject(obj, j5), l3);
                    }
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 60:
                    if (u(i9, i7, obj)) {
                        l3.k(i9, unsafe.getObject(obj, j5), p(i7));
                    }
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 61:
                    if (u(i9, i7, obj)) {
                        l3.b(i9, (AbstractC0329i) unsafe.getObject(obj, j5));
                    }
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 62:
                    if (u(i9, i7, obj)) {
                        l3.p(i9, F(j5, obj));
                    }
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 63:
                    if (u(i9, i7, obj)) {
                        l3.d(i9, F(j5, obj));
                    }
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 64:
                    if (u(i9, i7, obj)) {
                        l3.l(i9, F(j5, obj));
                    }
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 65:
                    if (u(i9, i7, obj)) {
                        l3.m(G(j5, obj), i9);
                    }
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 66:
                    if (u(i9, i7, obj)) {
                        l3.n(i9, F(j5, obj));
                    }
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 67:
                    if (u(i9, i7, obj)) {
                        l3.o(G(j5, obj), i9);
                    }
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 68:
                    if (u(i9, i7, obj)) {
                        l3.h(i9, unsafe.getObject(obj, j5), p(i7));
                    }
                    i7 += 3;
                    i5 = 1048575;
                    break;
                default:
                    i7 += 3;
                    i5 = 1048575;
                    break;
            }
        }
        this.f5167m.getClass();
        ((AbstractC0342w) obj).unknownFields.e(l3);
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x00a1  */
    @Override // com.google.crypto.tink.shaded.protobuf.c0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean a(java.lang.Object r14) {
        /*
            Method dump skipped, instruction units count: 243
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.crypto.tink.shaded.protobuf.T.a(java.lang.Object):boolean");
    }

    @Override // com.google.crypto.tink.shaded.protobuf.c0
    public final void b(Object obj, Object obj2) {
        l(obj);
        obj2.getClass();
        int i = 0;
        while (true) {
            int[] iArr = this.f5156a;
            if (i >= iArr.length) {
                d0.B(this.f5167m, obj, obj2);
                return;
            }
            int iX = X(i);
            long j5 = 1048575 & iX;
            int i5 = iArr[i];
            switch (W(iX)) {
                case 0:
                    if (s(i, obj2)) {
                        o0.r(obj, j5, o0.f5235b.e(j5, obj2));
                        R(i, obj);
                    }
                    break;
                case 1:
                    if (s(i, obj2)) {
                        o0.s(obj, j5, o0.f5235b.f(j5, obj2));
                        R(i, obj);
                    }
                    break;
                case 2:
                    if (s(i, obj2)) {
                        o0.u(obj, j5, o0.f5235b.h(j5, obj2));
                        R(i, obj);
                    }
                    break;
                case 3:
                    if (s(i, obj2)) {
                        o0.u(obj, j5, o0.f5235b.h(j5, obj2));
                        R(i, obj);
                    }
                    break;
                case 4:
                    if (s(i, obj2)) {
                        o0.t(j5, obj, o0.f5235b.g(j5, obj2));
                        R(i, obj);
                    }
                    break;
                case 5:
                    if (s(i, obj2)) {
                        o0.u(obj, j5, o0.f5235b.h(j5, obj2));
                        R(i, obj);
                    }
                    break;
                case O.j.STRING_SET_FIELD_NUMBER /* 6 */:
                    if (s(i, obj2)) {
                        o0.t(j5, obj, o0.f5235b.g(j5, obj2));
                        R(i, obj);
                    }
                    break;
                case O.j.DOUBLE_FIELD_NUMBER /* 7 */:
                    if (s(i, obj2)) {
                        o0.n(obj, j5, o0.f5235b.c(j5, obj2));
                        R(i, obj);
                    }
                    break;
                case O.j.BYTES_FIELD_NUMBER /* 8 */:
                    if (s(i, obj2)) {
                        o0.v(j5, obj, o0.f5235b.i(j5, obj2));
                        R(i, obj);
                    }
                    break;
                case 9:
                    y(obj, i, obj2);
                    break;
                case 10:
                    if (s(i, obj2)) {
                        o0.v(j5, obj, o0.f5235b.i(j5, obj2));
                        R(i, obj);
                    }
                    break;
                case 11:
                    if (s(i, obj2)) {
                        o0.t(j5, obj, o0.f5235b.g(j5, obj2));
                        R(i, obj);
                    }
                    break;
                case 12:
                    if (s(i, obj2)) {
                        o0.t(j5, obj, o0.f5235b.g(j5, obj2));
                        R(i, obj);
                    }
                    break;
                case 13:
                    if (s(i, obj2)) {
                        o0.t(j5, obj, o0.f5235b.g(j5, obj2));
                        R(i, obj);
                    }
                    break;
                case 14:
                    if (s(i, obj2)) {
                        o0.u(obj, j5, o0.f5235b.h(j5, obj2));
                        R(i, obj);
                    }
                    break;
                case 15:
                    if (s(i, obj2)) {
                        o0.t(j5, obj, o0.f5235b.g(j5, obj2));
                        R(i, obj);
                    }
                    break;
                case 16:
                    if (s(i, obj2)) {
                        o0.u(obj, j5, o0.f5235b.h(j5, obj2));
                        R(i, obj);
                    }
                    break;
                case 17:
                    y(obj, i, obj2);
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
                    this.f5166l.b(j5, obj, obj2);
                    break;
                case 50:
                    Class cls = d0.f5190a;
                    n0 n0Var = o0.f5235b;
                    Object objI = n0Var.i(j5, obj);
                    Object objI2 = n0Var.i(j5, obj2);
                    this.f5168n.getClass();
                    o0.v(j5, obj, N.d(objI, objI2));
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
                    if (u(i5, i, obj2)) {
                        o0.v(j5, obj, o0.f5235b.i(j5, obj2));
                        S(i5, i, obj);
                    }
                    break;
                case 60:
                    z(obj, i, obj2);
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (u(i5, i, obj2)) {
                        o0.v(j5, obj, o0.f5235b.i(j5, obj2));
                        S(i5, i, obj);
                    }
                    break;
                case 68:
                    z(obj, i, obj2);
                    break;
            }
            i += 3;
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.c0
    public final Object c() {
        this.f5165k.getClass();
        return ((AbstractC0342w) this.f5160e).s();
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x004c  */
    @Override // com.google.crypto.tink.shaded.protobuf.c0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d(java.lang.Object r8) {
        /*
            r7 = this;
            boolean r0 = t(r8)
            if (r0 != 0) goto L7
            return
        L7:
            boolean r0 = r8 instanceof com.google.crypto.tink.shaded.protobuf.AbstractC0342w
            if (r0 == 0) goto L17
            r0 = r8
            com.google.crypto.tink.shaded.protobuf.w r0 = (com.google.crypto.tink.shaded.protobuf.AbstractC0342w) r0
            r0.i()
            r0.h()
            r0.q()
        L17:
            int[] r0 = r7.f5156a
            int r0 = r0.length
            r1 = 0
        L1b:
            if (r1 >= r0) goto L62
            int r2 = r7.X(r1)
            r3 = 1048575(0xfffff, float:1.469367E-39)
            r3 = r3 & r2
            long r3 = (long) r3
            int r2 = W(r2)
            r5 = 9
            if (r2 == r5) goto L4c
            switch(r2) {
                case 17: goto L4c;
                case 18: goto L46;
                case 19: goto L46;
                case 20: goto L46;
                case 21: goto L46;
                case 22: goto L46;
                case 23: goto L46;
                case 24: goto L46;
                case 25: goto L46;
                case 26: goto L46;
                case 27: goto L46;
                case 28: goto L46;
                case 29: goto L46;
                case 30: goto L46;
                case 31: goto L46;
                case 32: goto L46;
                case 33: goto L46;
                case 34: goto L46;
                case 35: goto L46;
                case 36: goto L46;
                case 37: goto L46;
                case 38: goto L46;
                case 39: goto L46;
                case 40: goto L46;
                case 41: goto L46;
                case 42: goto L46;
                case 43: goto L46;
                case 44: goto L46;
                case 45: goto L46;
                case 46: goto L46;
                case 47: goto L46;
                case 48: goto L46;
                case 49: goto L46;
                case 50: goto L32;
                default: goto L31;
            }
        L31:
            goto L5f
        L32:
            sun.misc.Unsafe r2 = com.google.crypto.tink.shaded.protobuf.T.f5155p
            java.lang.Object r5 = r2.getObject(r8, r3)
            if (r5 == 0) goto L5f
            com.google.crypto.tink.shaded.protobuf.N r6 = r7.f5168n
            r6.getClass()
            com.google.crypto.tink.shaded.protobuf.N.f(r5)
            r2.putObject(r8, r3, r5)
            goto L5f
        L46:
            com.google.crypto.tink.shaded.protobuf.I r2 = r7.f5166l
            r2.a(r3, r8)
            goto L5f
        L4c:
            boolean r2 = r7.s(r1, r8)
            if (r2 == 0) goto L5f
            com.google.crypto.tink.shaded.protobuf.c0 r2 = r7.p(r1)
            sun.misc.Unsafe r5 = com.google.crypto.tink.shaded.protobuf.T.f5155p
            java.lang.Object r3 = r5.getObject(r8, r3)
            r2.d(r3)
        L5f:
            int r1 = r1 + 3
            goto L1b
        L62:
            com.google.crypto.tink.shaded.protobuf.g0 r0 = r7.f5167m
            r0.getClass()
            com.google.crypto.tink.shaded.protobuf.g0.b(r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.crypto.tink.shaded.protobuf.T.d(java.lang.Object):void");
    }

    @Override // com.google.crypto.tink.shaded.protobuf.c0
    public final int e(AbstractC0342w abstractC0342w) {
        return this.f5162g ? r(abstractC0342w) : q(abstractC0342w);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x003d  */
    @Override // com.google.crypto.tink.shaded.protobuf.c0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean f(com.google.crypto.tink.shaded.protobuf.AbstractC0342w r12, java.lang.Object r13) {
        /*
            Method dump skipped, instruction units count: 662
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.crypto.tink.shaded.protobuf.T.f(com.google.crypto.tink.shaded.protobuf.w, java.lang.Object):boolean");
    }

    @Override // com.google.crypto.tink.shaded.protobuf.c0
    public final void g(Object obj, byte[] bArr, int i, int i5, C0324d c0324d) throws C {
        if (this.f5162g) {
            K(obj, bArr, i, i5, c0324d);
        } else {
            J(obj, bArr, i, i5, 0, c0324d);
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.c0
    public final void h(Object obj, L l3) throws K3.b {
        l3.getClass();
        if (!this.f5162g) {
            Y(obj, l3);
            return;
        }
        int[] iArr = this.f5156a;
        int length = iArr.length;
        for (int i = 0; i < length; i += 3) {
            int iX = X(i);
            int i5 = iArr[i];
            switch (W(iX)) {
                case 0:
                    if (s(i, obj)) {
                        l3.c(i5, o0.f5235b.e(iX & 1048575, obj));
                    }
                    break;
                case 1:
                    if (s(i, obj)) {
                        l3.g(o0.f5235b.f(iX & 1048575, obj), i5);
                    }
                    break;
                case 2:
                    if (s(i, obj)) {
                        l3.j(o0.f5235b.h(iX & 1048575, obj), i5);
                    }
                    break;
                case 3:
                    if (s(i, obj)) {
                        l3.q(o0.f5235b.h(iX & 1048575, obj), i5);
                    }
                    break;
                case 4:
                    if (s(i, obj)) {
                        l3.i(i5, o0.f5235b.g(iX & 1048575, obj));
                    }
                    break;
                case 5:
                    if (s(i, obj)) {
                        l3.f(o0.f5235b.h(iX & 1048575, obj), i5);
                    }
                    break;
                case O.j.STRING_SET_FIELD_NUMBER /* 6 */:
                    if (s(i, obj)) {
                        l3.e(i5, o0.f5235b.g(iX & 1048575, obj));
                    }
                    break;
                case O.j.DOUBLE_FIELD_NUMBER /* 7 */:
                    if (s(i, obj)) {
                        l3.a(i5, o0.f5235b.c(iX & 1048575, obj));
                    }
                    break;
                case O.j.BYTES_FIELD_NUMBER /* 8 */:
                    if (s(i, obj)) {
                        Z(i5, o0.f5235b.i(iX & 1048575, obj), l3);
                    }
                    break;
                case 9:
                    if (s(i, obj)) {
                        l3.k(i5, o0.f5235b.i(iX & 1048575, obj), p(i));
                    }
                    break;
                case 10:
                    if (s(i, obj)) {
                        l3.b(i5, (AbstractC0329i) o0.f5235b.i(iX & 1048575, obj));
                    }
                    break;
                case 11:
                    if (s(i, obj)) {
                        l3.p(i5, o0.f5235b.g(iX & 1048575, obj));
                    }
                    break;
                case 12:
                    if (s(i, obj)) {
                        l3.d(i5, o0.f5235b.g(iX & 1048575, obj));
                    }
                    break;
                case 13:
                    if (s(i, obj)) {
                        l3.l(i5, o0.f5235b.g(iX & 1048575, obj));
                    }
                    break;
                case 14:
                    if (s(i, obj)) {
                        l3.m(o0.f5235b.h(iX & 1048575, obj), i5);
                    }
                    break;
                case 15:
                    if (s(i, obj)) {
                        l3.n(i5, o0.f5235b.g(iX & 1048575, obj));
                    }
                    break;
                case 16:
                    if (s(i, obj)) {
                        l3.o(o0.f5235b.h(iX & 1048575, obj), i5);
                    }
                    break;
                case 17:
                    if (s(i, obj)) {
                        l3.h(i5, o0.f5235b.i(iX & 1048575, obj), p(i));
                    }
                    break;
                case 18:
                    d0.F(iArr[i], (List) o0.f5235b.i(iX & 1048575, obj), l3, false);
                    break;
                case 19:
                    d0.J(iArr[i], (List) o0.f5235b.i(iX & 1048575, obj), l3, false);
                    break;
                case 20:
                    d0.M(iArr[i], (List) o0.f5235b.i(iX & 1048575, obj), l3, false);
                    break;
                case 21:
                    d0.U(iArr[i], (List) o0.f5235b.i(iX & 1048575, obj), l3, false);
                    break;
                case 22:
                    d0.L(iArr[i], (List) o0.f5235b.i(iX & 1048575, obj), l3, false);
                    break;
                case 23:
                    d0.I(iArr[i], (List) o0.f5235b.i(iX & 1048575, obj), l3, false);
                    break;
                case 24:
                    d0.H(iArr[i], (List) o0.f5235b.i(iX & 1048575, obj), l3, false);
                    break;
                case 25:
                    d0.D(iArr[i], (List) o0.f5235b.i(iX & 1048575, obj), l3, false);
                    break;
                case 26:
                    d0.S(iArr[i], (List) o0.f5235b.i(iX & 1048575, obj), l3);
                    break;
                case 27:
                    d0.N(iArr[i], (List) o0.f5235b.i(iX & 1048575, obj), l3, p(i));
                    break;
                case 28:
                    d0.E(iArr[i], (List) o0.f5235b.i(iX & 1048575, obj), l3);
                    break;
                case 29:
                    d0.T(iArr[i], (List) o0.f5235b.i(iX & 1048575, obj), l3, false);
                    break;
                case 30:
                    d0.G(iArr[i], (List) o0.f5235b.i(iX & 1048575, obj), l3, false);
                    break;
                case 31:
                    d0.O(iArr[i], (List) o0.f5235b.i(iX & 1048575, obj), l3, false);
                    break;
                case 32:
                    d0.P(iArr[i], (List) o0.f5235b.i(iX & 1048575, obj), l3, false);
                    break;
                case 33:
                    d0.Q(iArr[i], (List) o0.f5235b.i(iX & 1048575, obj), l3, false);
                    break;
                case 34:
                    d0.R(iArr[i], (List) o0.f5235b.i(iX & 1048575, obj), l3, false);
                    break;
                case 35:
                    d0.F(iArr[i], (List) o0.f5235b.i(iX & 1048575, obj), l3, true);
                    break;
                case 36:
                    d0.J(iArr[i], (List) o0.f5235b.i(iX & 1048575, obj), l3, true);
                    break;
                case 37:
                    d0.M(iArr[i], (List) o0.f5235b.i(iX & 1048575, obj), l3, true);
                    break;
                case 38:
                    d0.U(iArr[i], (List) o0.f5235b.i(iX & 1048575, obj), l3, true);
                    break;
                case 39:
                    d0.L(iArr[i], (List) o0.f5235b.i(iX & 1048575, obj), l3, true);
                    break;
                case 40:
                    d0.I(iArr[i], (List) o0.f5235b.i(iX & 1048575, obj), l3, true);
                    break;
                case 41:
                    d0.H(iArr[i], (List) o0.f5235b.i(iX & 1048575, obj), l3, true);
                    break;
                case 42:
                    d0.D(iArr[i], (List) o0.f5235b.i(iX & 1048575, obj), l3, true);
                    break;
                case 43:
                    d0.T(iArr[i], (List) o0.f5235b.i(iX & 1048575, obj), l3, true);
                    break;
                case 44:
                    d0.G(iArr[i], (List) o0.f5235b.i(iX & 1048575, obj), l3, true);
                    break;
                case 45:
                    d0.O(iArr[i], (List) o0.f5235b.i(iX & 1048575, obj), l3, true);
                    break;
                case 46:
                    d0.P(iArr[i], (List) o0.f5235b.i(iX & 1048575, obj), l3, true);
                    break;
                case 47:
                    d0.Q(iArr[i], (List) o0.f5235b.i(iX & 1048575, obj), l3, true);
                    break;
                case 48:
                    d0.R(iArr[i], (List) o0.f5235b.i(iX & 1048575, obj), l3, true);
                    break;
                case 49:
                    d0.K(iArr[i], (List) o0.f5235b.i(iX & 1048575, obj), l3, p(i));
                    break;
                case 50:
                    if (o0.f5235b.i(iX & 1048575, obj) != null) {
                        Object objO = o(i);
                        this.f5168n.getClass();
                        AbstractC0307a.q(objO);
                        throw null;
                    }
                    break;
                    break;
                case 51:
                    if (u(i5, i, obj)) {
                        l3.c(i5, ((Double) o0.f5235b.i(iX & 1048575, obj)).doubleValue());
                    }
                    break;
                case 52:
                    if (u(i5, i, obj)) {
                        l3.g(((Float) o0.f5235b.i(iX & 1048575, obj)).floatValue(), i5);
                    }
                    break;
                case 53:
                    if (u(i5, i, obj)) {
                        l3.j(G(iX & 1048575, obj), i5);
                    }
                    break;
                case 54:
                    if (u(i5, i, obj)) {
                        l3.q(G(iX & 1048575, obj), i5);
                    }
                    break;
                case 55:
                    if (u(i5, i, obj)) {
                        l3.i(i5, F(iX & 1048575, obj));
                    }
                    break;
                case 56:
                    if (u(i5, i, obj)) {
                        l3.f(G(iX & 1048575, obj), i5);
                    }
                    break;
                case 57:
                    if (u(i5, i, obj)) {
                        l3.e(i5, F(iX & 1048575, obj));
                    }
                    break;
                case 58:
                    if (u(i5, i, obj)) {
                        l3.a(i5, ((Boolean) o0.f5235b.i(iX & 1048575, obj)).booleanValue());
                    }
                    break;
                case 59:
                    if (u(i5, i, obj)) {
                        Z(i5, o0.f5235b.i(iX & 1048575, obj), l3);
                    }
                    break;
                case 60:
                    if (u(i5, i, obj)) {
                        l3.k(i5, o0.f5235b.i(iX & 1048575, obj), p(i));
                    }
                    break;
                case 61:
                    if (u(i5, i, obj)) {
                        l3.b(i5, (AbstractC0329i) o0.f5235b.i(iX & 1048575, obj));
                    }
                    break;
                case 62:
                    if (u(i5, i, obj)) {
                        l3.p(i5, F(iX & 1048575, obj));
                    }
                    break;
                case 63:
                    if (u(i5, i, obj)) {
                        l3.d(i5, F(iX & 1048575, obj));
                    }
                    break;
                case 64:
                    if (u(i5, i, obj)) {
                        l3.l(i5, F(iX & 1048575, obj));
                    }
                    break;
                case 65:
                    if (u(i5, i, obj)) {
                        l3.m(G(iX & 1048575, obj), i5);
                    }
                    break;
                case 66:
                    if (u(i5, i, obj)) {
                        l3.n(i5, F(iX & 1048575, obj));
                    }
                    break;
                case 67:
                    if (u(i5, i, obj)) {
                        l3.o(G(iX & 1048575, obj), i5);
                    }
                    break;
                case 68:
                    if (u(i5, i, obj)) {
                        l3.h(i5, o0.f5235b.i(iX & 1048575, obj), p(i));
                    }
                    break;
            }
        }
        this.f5167m.getClass();
        ((AbstractC0342w) obj).unknownFields.e(l3);
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x00e1 A[PHI: r3
      0x00e1: PHI (r3v32 int) = (r3v10 int), (r3v33 int) binds: [B:83:0x0216, B:41:0x00df] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.google.crypto.tink.shaded.protobuf.c0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int i(com.google.crypto.tink.shaded.protobuf.AbstractC0342w r12) {
        /*
            Method dump skipped, instruction units count: 794
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.crypto.tink.shaded.protobuf.T.i(com.google.crypto.tink.shaded.protobuf.w):int");
    }

    @Override // com.google.crypto.tink.shaded.protobuf.c0
    public final void j(Object obj, C0219k c0219k, C0335o c0335o) throws Throwable {
        c0335o.getClass();
        l(obj);
        w(this.f5167m, obj, c0219k, c0335o);
    }

    public final boolean k(AbstractC0342w abstractC0342w, Object obj, int i) {
        return s(i, abstractC0342w) == s(i, obj);
    }

    public final void m(Object obj, int i, Object obj2) {
        int i5 = this.f5156a[i];
        if (o0.f5235b.i(X(i) & 1048575, obj) == null) {
            return;
        }
        n(i);
    }

    public final void n(int i) {
        if (this.f5157b[((i / 3) * 2) + 1] != null) {
            throw new ClassCastException();
        }
    }

    public final Object o(int i) {
        return this.f5157b[(i / 3) * 2];
    }

    public final c0 p(int i) {
        int i5 = (i / 3) * 2;
        Object[] objArr = this.f5157b;
        c0 c0Var = (c0) objArr[i5];
        if (c0Var != null) {
            return c0Var;
        }
        c0 c0VarA = Z.f5174c.a((Class) objArr[i5 + 1]);
        objArr[i5] = c0VarA;
        return c0VarA;
    }

    public final int q(AbstractC0342w abstractC0342w) {
        int i;
        int iV;
        int iT;
        Unsafe unsafe = f5155p;
        int i5 = 0;
        int iD = 0;
        int i6 = 0;
        int i7 = 1048575;
        while (true) {
            int[] iArr = this.f5156a;
            if (i5 >= iArr.length) {
                this.f5167m.getClass();
                return abstractC0342w.unknownFields.b() + iD;
            }
            int iX = X(i5);
            int i8 = iArr[i5];
            int iW = W(iX);
            if (iW <= 17) {
                int i9 = iArr[i5 + 2];
                int i10 = i9 & 1048575;
                i = 1 << (i9 >>> 20);
                if (i10 != i7) {
                    i6 = unsafe.getInt(abstractC0342w, i10);
                    i7 = i10;
                }
            } else {
                i = 0;
            }
            long j5 = iX & 1048575;
            switch (iW) {
                case 0:
                    if ((i & i6) != 0) {
                        iV = C0332l.V(i8);
                        iD += iV;
                    }
                    break;
                case 1:
                    if ((i & i6) != 0) {
                        iV = C0332l.Z(i8);
                        iD += iV;
                    }
                    break;
                case 2:
                    if ((i & i6) != 0) {
                        iV = C0332l.d0(unsafe.getLong(abstractC0342w, j5), i8);
                        iD += iV;
                    }
                    break;
                case 3:
                    if ((i & i6) != 0) {
                        iV = C0332l.n0(unsafe.getLong(abstractC0342w, j5), i8);
                        iD += iV;
                    }
                    break;
                case 4:
                    if ((i & i6) != 0) {
                        iV = C0332l.b0(i8, unsafe.getInt(abstractC0342w, j5));
                        iD += iV;
                    }
                    break;
                case 5:
                    if ((i & i6) != 0) {
                        iV = C0332l.Y(i8);
                        iD += iV;
                    }
                    break;
                case O.j.STRING_SET_FIELD_NUMBER /* 6 */:
                    if ((i & i6) != 0) {
                        iV = C0332l.X(i8);
                        iD += iV;
                    }
                    break;
                case O.j.DOUBLE_FIELD_NUMBER /* 7 */:
                    if ((i & i6) != 0) {
                        iV = C0332l.S(i8);
                        iD += iV;
                    }
                    break;
                case O.j.BYTES_FIELD_NUMBER /* 8 */:
                    if ((i & i6) != 0) {
                        Object object = unsafe.getObject(abstractC0342w, j5);
                        iT = object instanceof AbstractC0329i ? C0332l.T(i8, (AbstractC0329i) object) : C0332l.i0((String) object, i8);
                        iD = iT + iD;
                    }
                    break;
                case 9:
                    if ((i & i6) != 0) {
                        iV = d0.o(i8, unsafe.getObject(abstractC0342w, j5), p(i5));
                        iD += iV;
                    }
                    break;
                case 10:
                    if ((i & i6) != 0) {
                        iV = C0332l.T(i8, (AbstractC0329i) unsafe.getObject(abstractC0342w, j5));
                        iD += iV;
                    }
                    break;
                case 11:
                    if ((i & i6) != 0) {
                        iV = C0332l.l0(i8, unsafe.getInt(abstractC0342w, j5));
                        iD += iV;
                    }
                    break;
                case 12:
                    if ((i & i6) != 0) {
                        iV = C0332l.W(i8, unsafe.getInt(abstractC0342w, j5));
                        iD += iV;
                    }
                    break;
                case 13:
                    if ((i & i6) != 0) {
                        iV = C0332l.e0(i8);
                        iD += iV;
                    }
                    break;
                case 14:
                    if ((i & i6) != 0) {
                        iV = C0332l.f0(i8);
                        iD += iV;
                    }
                    break;
                case 15:
                    if ((i & i6) != 0) {
                        iV = C0332l.g0(i8, unsafe.getInt(abstractC0342w, j5));
                        iD += iV;
                    }
                    break;
                case 16:
                    if ((i & i6) != 0) {
                        iV = C0332l.h0(unsafe.getLong(abstractC0342w, j5), i8);
                        iD += iV;
                    }
                    break;
                case 17:
                    if ((i & i6) != 0) {
                        iV = C0332l.a0(i8, (AbstractC0321a) unsafe.getObject(abstractC0342w, j5), p(i5));
                        iD += iV;
                    }
                    break;
                case 18:
                    iV = d0.h(i8, (List) unsafe.getObject(abstractC0342w, j5));
                    iD += iV;
                    break;
                case 19:
                    iV = d0.f(i8, (List) unsafe.getObject(abstractC0342w, j5));
                    iD += iV;
                    break;
                case 20:
                    iV = d0.m(i8, (List) unsafe.getObject(abstractC0342w, j5));
                    iD += iV;
                    break;
                case 21:
                    iV = d0.x(i8, (List) unsafe.getObject(abstractC0342w, j5));
                    iD += iV;
                    break;
                case 22:
                    iV = d0.k(i8, (List) unsafe.getObject(abstractC0342w, j5));
                    iD += iV;
                    break;
                case 23:
                    iV = d0.h(i8, (List) unsafe.getObject(abstractC0342w, j5));
                    iD += iV;
                    break;
                case 24:
                    iV = d0.f(i8, (List) unsafe.getObject(abstractC0342w, j5));
                    iD += iV;
                    break;
                case 25:
                    iV = d0.a(i8, (List) unsafe.getObject(abstractC0342w, j5));
                    iD += iV;
                    break;
                case 26:
                    iV = d0.u(i8, (List) unsafe.getObject(abstractC0342w, j5));
                    iD += iV;
                    break;
                case 27:
                    iV = d0.p(i8, (List) unsafe.getObject(abstractC0342w, j5), p(i5));
                    iD += iV;
                    break;
                case 28:
                    iV = d0.c(i8, (List) unsafe.getObject(abstractC0342w, j5));
                    iD += iV;
                    break;
                case 29:
                    iV = d0.v(i8, (List) unsafe.getObject(abstractC0342w, j5));
                    iD += iV;
                    break;
                case 30:
                    iV = d0.d(i8, (List) unsafe.getObject(abstractC0342w, j5));
                    iD += iV;
                    break;
                case 31:
                    iV = d0.f(i8, (List) unsafe.getObject(abstractC0342w, j5));
                    iD += iV;
                    break;
                case 32:
                    iV = d0.h(i8, (List) unsafe.getObject(abstractC0342w, j5));
                    iD += iV;
                    break;
                case 33:
                    iV = d0.q(i8, (List) unsafe.getObject(abstractC0342w, j5));
                    iD += iV;
                    break;
                case 34:
                    iV = d0.s(i8, (List) unsafe.getObject(abstractC0342w, j5));
                    iD += iV;
                    break;
                case 35:
                    int i11 = d0.i((List) unsafe.getObject(abstractC0342w, j5));
                    if (i11 > 0) {
                        iD = AbstractC0307a.d(i11, C0332l.k0(i8), i11, iD);
                    }
                    break;
                case 36:
                    int iG = d0.g((List) unsafe.getObject(abstractC0342w, j5));
                    if (iG > 0) {
                        iD = AbstractC0307a.d(iG, C0332l.k0(i8), iG, iD);
                    }
                    break;
                case 37:
                    int iN = d0.n((List) unsafe.getObject(abstractC0342w, j5));
                    if (iN > 0) {
                        iD = AbstractC0307a.d(iN, C0332l.k0(i8), iN, iD);
                    }
                    break;
                case 38:
                    int iY = d0.y((List) unsafe.getObject(abstractC0342w, j5));
                    if (iY > 0) {
                        iD = AbstractC0307a.d(iY, C0332l.k0(i8), iY, iD);
                    }
                    break;
                case 39:
                    int iL = d0.l((List) unsafe.getObject(abstractC0342w, j5));
                    if (iL > 0) {
                        iD = AbstractC0307a.d(iL, C0332l.k0(i8), iL, iD);
                    }
                    break;
                case 40:
                    int i12 = d0.i((List) unsafe.getObject(abstractC0342w, j5));
                    if (i12 > 0) {
                        iD = AbstractC0307a.d(i12, C0332l.k0(i8), i12, iD);
                    }
                    break;
                case 41:
                    int iG2 = d0.g((List) unsafe.getObject(abstractC0342w, j5));
                    if (iG2 > 0) {
                        iD = AbstractC0307a.d(iG2, C0332l.k0(i8), iG2, iD);
                    }
                    break;
                case 42:
                    int iB = d0.b((List) unsafe.getObject(abstractC0342w, j5));
                    if (iB > 0) {
                        iD = AbstractC0307a.d(iB, C0332l.k0(i8), iB, iD);
                    }
                    break;
                case 43:
                    int iW2 = d0.w((List) unsafe.getObject(abstractC0342w, j5));
                    if (iW2 > 0) {
                        iD = AbstractC0307a.d(iW2, C0332l.k0(i8), iW2, iD);
                    }
                    break;
                case 44:
                    int iE = d0.e((List) unsafe.getObject(abstractC0342w, j5));
                    if (iE > 0) {
                        iD = AbstractC0307a.d(iE, C0332l.k0(i8), iE, iD);
                    }
                    break;
                case 45:
                    int iG3 = d0.g((List) unsafe.getObject(abstractC0342w, j5));
                    if (iG3 > 0) {
                        iD = AbstractC0307a.d(iG3, C0332l.k0(i8), iG3, iD);
                    }
                    break;
                case 46:
                    int i13 = d0.i((List) unsafe.getObject(abstractC0342w, j5));
                    if (i13 > 0) {
                        iD = AbstractC0307a.d(i13, C0332l.k0(i8), i13, iD);
                    }
                    break;
                case 47:
                    int iR = d0.r((List) unsafe.getObject(abstractC0342w, j5));
                    if (iR > 0) {
                        iD = AbstractC0307a.d(iR, C0332l.k0(i8), iR, iD);
                    }
                    break;
                case 48:
                    int iT2 = d0.t((List) unsafe.getObject(abstractC0342w, j5));
                    if (iT2 > 0) {
                        iD = AbstractC0307a.d(iT2, C0332l.k0(i8), iT2, iD);
                    }
                    break;
                case 49:
                    iV = d0.j(i8, (List) unsafe.getObject(abstractC0342w, j5), p(i5));
                    iD += iV;
                    break;
                case 50:
                    Object object2 = unsafe.getObject(abstractC0342w, j5);
                    Object objO = o(i5);
                    this.f5168n.getClass();
                    N.b(object2, objO);
                    break;
                case 51:
                    if (u(i8, i5, abstractC0342w)) {
                        iV = C0332l.V(i8);
                        iD += iV;
                    }
                    break;
                case 52:
                    if (u(i8, i5, abstractC0342w)) {
                        iV = C0332l.Z(i8);
                        iD += iV;
                    }
                    break;
                case 53:
                    if (u(i8, i5, abstractC0342w)) {
                        iV = C0332l.d0(G(j5, abstractC0342w), i8);
                        iD += iV;
                    }
                    break;
                case 54:
                    if (u(i8, i5, abstractC0342w)) {
                        iV = C0332l.n0(G(j5, abstractC0342w), i8);
                        iD += iV;
                    }
                    break;
                case 55:
                    if (u(i8, i5, abstractC0342w)) {
                        iV = C0332l.b0(i8, F(j5, abstractC0342w));
                        iD += iV;
                    }
                    break;
                case 56:
                    if (u(i8, i5, abstractC0342w)) {
                        iV = C0332l.Y(i8);
                        iD += iV;
                    }
                    break;
                case 57:
                    if (u(i8, i5, abstractC0342w)) {
                        iV = C0332l.X(i8);
                        iD += iV;
                    }
                    break;
                case 58:
                    if (u(i8, i5, abstractC0342w)) {
                        iV = C0332l.S(i8);
                        iD += iV;
                    }
                    break;
                case 59:
                    if (u(i8, i5, abstractC0342w)) {
                        Object object3 = unsafe.getObject(abstractC0342w, j5);
                        iT = object3 instanceof AbstractC0329i ? C0332l.T(i8, (AbstractC0329i) object3) : C0332l.i0((String) object3, i8);
                        iD = iT + iD;
                    }
                    break;
                case 60:
                    if (u(i8, i5, abstractC0342w)) {
                        iV = d0.o(i8, unsafe.getObject(abstractC0342w, j5), p(i5));
                        iD += iV;
                    }
                    break;
                case 61:
                    if (u(i8, i5, abstractC0342w)) {
                        iV = C0332l.T(i8, (AbstractC0329i) unsafe.getObject(abstractC0342w, j5));
                        iD += iV;
                    }
                    break;
                case 62:
                    if (u(i8, i5, abstractC0342w)) {
                        iV = C0332l.l0(i8, F(j5, abstractC0342w));
                        iD += iV;
                    }
                    break;
                case 63:
                    if (u(i8, i5, abstractC0342w)) {
                        iV = C0332l.W(i8, F(j5, abstractC0342w));
                        iD += iV;
                    }
                    break;
                case 64:
                    if (u(i8, i5, abstractC0342w)) {
                        iV = C0332l.e0(i8);
                        iD += iV;
                    }
                    break;
                case 65:
                    if (u(i8, i5, abstractC0342w)) {
                        iV = C0332l.f0(i8);
                        iD += iV;
                    }
                    break;
                case 66:
                    if (u(i8, i5, abstractC0342w)) {
                        iV = C0332l.g0(i8, F(j5, abstractC0342w));
                        iD += iV;
                    }
                    break;
                case 67:
                    if (u(i8, i5, abstractC0342w)) {
                        iV = C0332l.h0(G(j5, abstractC0342w), i8);
                        iD += iV;
                    }
                    break;
                case 68:
                    if (u(i8, i5, abstractC0342w)) {
                        iV = C0332l.a0(i8, (AbstractC0321a) unsafe.getObject(abstractC0342w, j5), p(i5));
                        iD += iV;
                    }
                    break;
            }
            i5 += 3;
        }
    }

    public final int r(AbstractC0342w abstractC0342w) {
        int iV;
        Unsafe unsafe = f5155p;
        int i = 0;
        int iD = 0;
        while (true) {
            int[] iArr = this.f5156a;
            if (i >= iArr.length) {
                this.f5167m.getClass();
                return abstractC0342w.unknownFields.b() + iD;
            }
            int iX = X(i);
            int iW = W(iX);
            int i5 = iArr[i];
            long j5 = iX & 1048575;
            if (iW >= r.f5243m.a() && iW <= r.f5244n.a()) {
                int i6 = iArr[i + 2];
            }
            switch (iW) {
                case 0:
                    if (!s(i, abstractC0342w)) {
                        i += 3;
                    } else {
                        iV = C0332l.V(i5);
                    }
                    break;
                case 1:
                    if (!s(i, abstractC0342w)) {
                        i += 3;
                    } else {
                        iV = C0332l.Z(i5);
                    }
                    break;
                case 2:
                    if (!s(i, abstractC0342w)) {
                        i += 3;
                    } else {
                        iV = C0332l.d0(o0.k(abstractC0342w, j5), i5);
                    }
                    break;
                case 3:
                    if (!s(i, abstractC0342w)) {
                        i += 3;
                    } else {
                        iV = C0332l.n0(o0.k(abstractC0342w, j5), i5);
                    }
                    break;
                case 4:
                    if (!s(i, abstractC0342w)) {
                        i += 3;
                    } else {
                        iV = C0332l.b0(i5, o0.j(abstractC0342w, j5));
                    }
                    break;
                case 5:
                    if (!s(i, abstractC0342w)) {
                        i += 3;
                    } else {
                        iV = C0332l.Y(i5);
                    }
                    break;
                case O.j.STRING_SET_FIELD_NUMBER /* 6 */:
                    if (!s(i, abstractC0342w)) {
                        i += 3;
                    } else {
                        iV = C0332l.X(i5);
                    }
                    break;
                case O.j.DOUBLE_FIELD_NUMBER /* 7 */:
                    if (!s(i, abstractC0342w)) {
                        i += 3;
                    } else {
                        iV = C0332l.S(i5);
                    }
                    break;
                case O.j.BYTES_FIELD_NUMBER /* 8 */:
                    if (!s(i, abstractC0342w)) {
                        i += 3;
                    } else {
                        Object objL = o0.l(abstractC0342w, j5);
                        iV = !(objL instanceof AbstractC0329i) ? C0332l.i0((String) objL, i5) : C0332l.T(i5, (AbstractC0329i) objL);
                    }
                    break;
                case 9:
                    if (!s(i, abstractC0342w)) {
                        i += 3;
                    } else {
                        iV = d0.o(i5, o0.l(abstractC0342w, j5), p(i));
                    }
                    break;
                case 10:
                    if (!s(i, abstractC0342w)) {
                        i += 3;
                    } else {
                        iV = C0332l.T(i5, (AbstractC0329i) o0.l(abstractC0342w, j5));
                    }
                    break;
                case 11:
                    if (!s(i, abstractC0342w)) {
                        i += 3;
                    } else {
                        iV = C0332l.l0(i5, o0.j(abstractC0342w, j5));
                    }
                    break;
                case 12:
                    if (!s(i, abstractC0342w)) {
                        i += 3;
                    } else {
                        iV = C0332l.W(i5, o0.j(abstractC0342w, j5));
                    }
                    break;
                case 13:
                    if (!s(i, abstractC0342w)) {
                        i += 3;
                    } else {
                        iV = C0332l.e0(i5);
                    }
                    break;
                case 14:
                    if (!s(i, abstractC0342w)) {
                        i += 3;
                    } else {
                        iV = C0332l.f0(i5);
                    }
                    break;
                case 15:
                    if (!s(i, abstractC0342w)) {
                        i += 3;
                    } else {
                        iV = C0332l.g0(i5, o0.j(abstractC0342w, j5));
                    }
                    break;
                case 16:
                    if (!s(i, abstractC0342w)) {
                        i += 3;
                    } else {
                        iV = C0332l.h0(o0.k(abstractC0342w, j5), i5);
                    }
                    break;
                case 17:
                    if (!s(i, abstractC0342w)) {
                        i += 3;
                    } else {
                        iV = C0332l.a0(i5, (AbstractC0321a) o0.l(abstractC0342w, j5), p(i));
                    }
                    break;
                case 18:
                    iV = d0.h(i5, v(abstractC0342w, j5));
                    break;
                case 19:
                    iV = d0.f(i5, v(abstractC0342w, j5));
                    break;
                case 20:
                    iV = d0.m(i5, v(abstractC0342w, j5));
                    break;
                case 21:
                    iV = d0.x(i5, v(abstractC0342w, j5));
                    break;
                case 22:
                    iV = d0.k(i5, v(abstractC0342w, j5));
                    break;
                case 23:
                    iV = d0.h(i5, v(abstractC0342w, j5));
                    break;
                case 24:
                    iV = d0.f(i5, v(abstractC0342w, j5));
                    break;
                case 25:
                    iV = d0.a(i5, v(abstractC0342w, j5));
                    break;
                case 26:
                    iV = d0.u(i5, v(abstractC0342w, j5));
                    break;
                case 27:
                    iV = d0.p(i5, v(abstractC0342w, j5), p(i));
                    break;
                case 28:
                    iV = d0.c(i5, v(abstractC0342w, j5));
                    break;
                case 29:
                    iV = d0.v(i5, v(abstractC0342w, j5));
                    break;
                case 30:
                    iV = d0.d(i5, v(abstractC0342w, j5));
                    break;
                case 31:
                    iV = d0.f(i5, v(abstractC0342w, j5));
                    break;
                case 32:
                    iV = d0.h(i5, v(abstractC0342w, j5));
                    break;
                case 33:
                    iV = d0.q(i5, v(abstractC0342w, j5));
                    break;
                case 34:
                    iV = d0.s(i5, v(abstractC0342w, j5));
                    break;
                case 35:
                    int i7 = d0.i((List) unsafe.getObject(abstractC0342w, j5));
                    if (i7 > 0) {
                        iD = AbstractC0307a.d(i7, C0332l.k0(i5), i7, iD);
                    } else {
                        continue;
                    }
                    i += 3;
                    break;
                case 36:
                    int iG = d0.g((List) unsafe.getObject(abstractC0342w, j5));
                    if (iG > 0) {
                        iD = AbstractC0307a.d(iG, C0332l.k0(i5), iG, iD);
                    } else {
                        continue;
                    }
                    i += 3;
                    break;
                case 37:
                    int iN = d0.n((List) unsafe.getObject(abstractC0342w, j5));
                    if (iN > 0) {
                        iD = AbstractC0307a.d(iN, C0332l.k0(i5), iN, iD);
                    } else {
                        continue;
                    }
                    i += 3;
                    break;
                case 38:
                    int iY = d0.y((List) unsafe.getObject(abstractC0342w, j5));
                    if (iY > 0) {
                        iD = AbstractC0307a.d(iY, C0332l.k0(i5), iY, iD);
                    } else {
                        continue;
                    }
                    i += 3;
                    break;
                case 39:
                    int iL = d0.l((List) unsafe.getObject(abstractC0342w, j5));
                    if (iL > 0) {
                        iD = AbstractC0307a.d(iL, C0332l.k0(i5), iL, iD);
                    } else {
                        continue;
                    }
                    i += 3;
                    break;
                case 40:
                    int i8 = d0.i((List) unsafe.getObject(abstractC0342w, j5));
                    if (i8 > 0) {
                        iD = AbstractC0307a.d(i8, C0332l.k0(i5), i8, iD);
                    } else {
                        continue;
                    }
                    i += 3;
                    break;
                case 41:
                    int iG2 = d0.g((List) unsafe.getObject(abstractC0342w, j5));
                    if (iG2 > 0) {
                        iD = AbstractC0307a.d(iG2, C0332l.k0(i5), iG2, iD);
                    } else {
                        continue;
                    }
                    i += 3;
                    break;
                case 42:
                    int iB = d0.b((List) unsafe.getObject(abstractC0342w, j5));
                    if (iB > 0) {
                        iD = AbstractC0307a.d(iB, C0332l.k0(i5), iB, iD);
                    } else {
                        continue;
                    }
                    i += 3;
                    break;
                case 43:
                    int iW2 = d0.w((List) unsafe.getObject(abstractC0342w, j5));
                    if (iW2 > 0) {
                        iD = AbstractC0307a.d(iW2, C0332l.k0(i5), iW2, iD);
                    } else {
                        continue;
                    }
                    i += 3;
                    break;
                case 44:
                    int iE = d0.e((List) unsafe.getObject(abstractC0342w, j5));
                    if (iE > 0) {
                        iD = AbstractC0307a.d(iE, C0332l.k0(i5), iE, iD);
                    } else {
                        continue;
                    }
                    i += 3;
                    break;
                case 45:
                    int iG3 = d0.g((List) unsafe.getObject(abstractC0342w, j5));
                    if (iG3 > 0) {
                        iD = AbstractC0307a.d(iG3, C0332l.k0(i5), iG3, iD);
                    } else {
                        continue;
                    }
                    i += 3;
                    break;
                case 46:
                    int i9 = d0.i((List) unsafe.getObject(abstractC0342w, j5));
                    if (i9 > 0) {
                        iD = AbstractC0307a.d(i9, C0332l.k0(i5), i9, iD);
                    } else {
                        continue;
                    }
                    i += 3;
                    break;
                case 47:
                    int iR = d0.r((List) unsafe.getObject(abstractC0342w, j5));
                    if (iR > 0) {
                        iD = AbstractC0307a.d(iR, C0332l.k0(i5), iR, iD);
                    } else {
                        continue;
                    }
                    i += 3;
                    break;
                case 48:
                    int iT = d0.t((List) unsafe.getObject(abstractC0342w, j5));
                    if (iT > 0) {
                        iD = AbstractC0307a.d(iT, C0332l.k0(i5), iT, iD);
                    } else {
                        continue;
                    }
                    i += 3;
                    break;
                case 49:
                    iV = d0.j(i5, v(abstractC0342w, j5), p(i));
                    break;
                case 50:
                    Object objL2 = o0.l(abstractC0342w, j5);
                    Object objO = o(i);
                    this.f5168n.getClass();
                    N.b(objL2, objO);
                    continue;
                    i += 3;
                    break;
                case 51:
                    if (!u(i5, i, abstractC0342w)) {
                        i += 3;
                    } else {
                        iV = C0332l.V(i5);
                    }
                    break;
                case 52:
                    if (!u(i5, i, abstractC0342w)) {
                        i += 3;
                    } else {
                        iV = C0332l.Z(i5);
                    }
                    break;
                case 53:
                    if (!u(i5, i, abstractC0342w)) {
                        i += 3;
                    } else {
                        iV = C0332l.d0(G(j5, abstractC0342w), i5);
                    }
                    break;
                case 54:
                    if (!u(i5, i, abstractC0342w)) {
                        i += 3;
                    } else {
                        iV = C0332l.n0(G(j5, abstractC0342w), i5);
                    }
                    break;
                case 55:
                    if (!u(i5, i, abstractC0342w)) {
                        i += 3;
                    } else {
                        iV = C0332l.b0(i5, F(j5, abstractC0342w));
                    }
                    break;
                case 56:
                    if (!u(i5, i, abstractC0342w)) {
                        i += 3;
                    } else {
                        iV = C0332l.Y(i5);
                    }
                    break;
                case 57:
                    if (!u(i5, i, abstractC0342w)) {
                        i += 3;
                    } else {
                        iV = C0332l.X(i5);
                    }
                    break;
                case 58:
                    if (!u(i5, i, abstractC0342w)) {
                        i += 3;
                    } else {
                        iV = C0332l.S(i5);
                    }
                    break;
                case 59:
                    if (!u(i5, i, abstractC0342w)) {
                        i += 3;
                    } else {
                        Object objL3 = o0.l(abstractC0342w, j5);
                        iV = !(objL3 instanceof AbstractC0329i) ? C0332l.i0((String) objL3, i5) : C0332l.T(i5, (AbstractC0329i) objL3);
                    }
                    break;
                case 60:
                    if (!u(i5, i, abstractC0342w)) {
                        i += 3;
                    } else {
                        iV = d0.o(i5, o0.l(abstractC0342w, j5), p(i));
                    }
                    break;
                case 61:
                    if (!u(i5, i, abstractC0342w)) {
                        i += 3;
                    } else {
                        iV = C0332l.T(i5, (AbstractC0329i) o0.l(abstractC0342w, j5));
                    }
                    break;
                case 62:
                    if (!u(i5, i, abstractC0342w)) {
                        i += 3;
                    } else {
                        iV = C0332l.l0(i5, F(j5, abstractC0342w));
                    }
                    break;
                case 63:
                    if (!u(i5, i, abstractC0342w)) {
                        i += 3;
                    } else {
                        iV = C0332l.W(i5, F(j5, abstractC0342w));
                    }
                    break;
                case 64:
                    if (!u(i5, i, abstractC0342w)) {
                        i += 3;
                    } else {
                        iV = C0332l.e0(i5);
                    }
                    break;
                case 65:
                    if (!u(i5, i, abstractC0342w)) {
                        i += 3;
                    } else {
                        iV = C0332l.f0(i5);
                    }
                    break;
                case 66:
                    if (!u(i5, i, abstractC0342w)) {
                        i += 3;
                    } else {
                        iV = C0332l.g0(i5, F(j5, abstractC0342w));
                    }
                    break;
                case 67:
                    if (!u(i5, i, abstractC0342w)) {
                        i += 3;
                    } else {
                        iV = C0332l.h0(G(j5, abstractC0342w), i5);
                    }
                    break;
                case 68:
                    if (!u(i5, i, abstractC0342w)) {
                        i += 3;
                    } else {
                        iV = C0332l.a0(i5, (AbstractC0321a) o0.l(abstractC0342w, j5), p(i));
                    }
                    break;
                default:
                    i += 3;
                    break;
            }
            iD = iV + iD;
            i += 3;
        }
    }

    public final boolean s(int i, Object obj) {
        int i5 = this.f5156a[i + 2];
        long j5 = i5 & 1048575;
        if (j5 != 1048575) {
            return ((1 << (i5 >>> 20)) & o0.f5235b.g(j5, obj)) != 0;
        }
        int iX = X(i);
        long j6 = iX & 1048575;
        switch (W(iX)) {
            case 0:
                return Double.doubleToRawLongBits(o0.f5235b.e(j6, obj)) != 0;
            case 1:
                return Float.floatToRawIntBits(o0.f5235b.f(j6, obj)) != 0;
            case 2:
                return o0.f5235b.h(j6, obj) != 0;
            case 3:
                return o0.f5235b.h(j6, obj) != 0;
            case 4:
                return o0.f5235b.g(j6, obj) != 0;
            case 5:
                return o0.f5235b.h(j6, obj) != 0;
            case O.j.STRING_SET_FIELD_NUMBER /* 6 */:
                return o0.f5235b.g(j6, obj) != 0;
            case O.j.DOUBLE_FIELD_NUMBER /* 7 */:
                return o0.f5235b.c(j6, obj);
            case O.j.BYTES_FIELD_NUMBER /* 8 */:
                Object objI = o0.f5235b.i(j6, obj);
                if (objI instanceof String) {
                    return !((String) objI).isEmpty();
                }
                if (objI instanceof AbstractC0329i) {
                    return !AbstractC0329i.f5205m.equals(objI);
                }
                throw new IllegalArgumentException();
            case 9:
                return o0.f5235b.i(j6, obj) != null;
            case 10:
                return !AbstractC0329i.f5205m.equals(o0.f5235b.i(j6, obj));
            case 11:
                return o0.f5235b.g(j6, obj) != 0;
            case 12:
                return o0.f5235b.g(j6, obj) != 0;
            case 13:
                return o0.f5235b.g(j6, obj) != 0;
            case 14:
                return o0.f5235b.h(j6, obj) != 0;
            case 15:
                return o0.f5235b.g(j6, obj) != 0;
            case 16:
                return o0.f5235b.h(j6, obj) != 0;
            case 17:
                return o0.f5235b.i(j6, obj) != null;
            default:
                throw new IllegalArgumentException();
        }
    }

    public final boolean u(int i, int i5, Object obj) {
        return o0.f5235b.g((long) (this.f5156a[i5 + 2] & 1048575), obj) == i;
    }

    /* JADX WARN: Removed duplicated region for block: B:132:0x05dd A[Catch: all -> 0x0023, TryCatch #2 {all -> 0x0023, blocks: (B:3:0x0011, B:5:0x001a, B:7:0x001e, B:20:0x0043, B:22:0x0048, B:23:0x004c, B:31:0x0065, B:32:0x0069, B:36:0x0079, B:38:0x0085, B:45:0x00a0, B:47:0x00b7, B:48:0x00ce, B:49:0x00e5, B:50:0x00fc, B:51:0x0113, B:52:0x012d, B:53:0x0145, B:54:0x0155, B:55:0x016b, B:56:0x0173, B:57:0x018b, B:58:0x01a3, B:59:0x01bb, B:60:0x01d3, B:61:0x01eb, B:62:0x0203, B:63:0x021b, B:64:0x0233, B:66:0x023c, B:130:0x05d8, B:132:0x05dd, B:133:0x05e2, B:111:0x0458, B:112:0x046d, B:113:0x0483, B:114:0x0499, B:115:0x04af, B:116:0x04c5, B:117:0x04de, B:118:0x04f4, B:119:0x0506, B:120:0x051e, B:121:0x0528, B:122:0x053e, B:123:0x0554, B:124:0x056a, B:125:0x0580, B:126:0x0596, B:127:0x05ac, B:128:0x05c2), top: B:148:0x0011 }] */
    /* JADX WARN: Removed duplicated region for block: B:212:0x05e8 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:234:0x0011 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void w(com.google.crypto.tink.shaded.protobuf.g0 r18, java.lang.Object r19, androidx.datastore.preferences.protobuf.C0219k r20, com.google.crypto.tink.shaded.protobuf.C0335o r21) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1694
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.crypto.tink.shaded.protobuf.T.w(com.google.crypto.tink.shaded.protobuf.g0, java.lang.Object, androidx.datastore.preferences.protobuf.k, com.google.crypto.tink.shaded.protobuf.o):void");
    }

    public final void x(Object obj, int i, Object obj2) {
        long jX = X(i) & 1048575;
        Object objI = o0.f5235b.i(jX, obj);
        N n4 = this.f5168n;
        if (objI != null) {
            n4.getClass();
            if (N.c(objI)) {
                M mC = M.f5149m.c();
                N.d(mC, objI);
                o0.v(jX, obj, mC);
                objI = mC;
            }
        } else {
            n4.getClass();
            objI = M.f5149m.c();
            o0.v(jX, obj, objI);
        }
        n4.getClass();
        AbstractC0307a.q(obj2);
        throw null;
    }

    public final void y(Object obj, int i, Object obj2) {
        if (s(i, obj2)) {
            long jX = X(i) & 1048575;
            Unsafe unsafe = f5155p;
            Object object = unsafe.getObject(obj2, jX);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + this.f5156a[i] + " is present but null: " + obj2);
            }
            c0 c0VarP = p(i);
            if (!s(i, obj)) {
                if (t(object)) {
                    Object objC = c0VarP.c();
                    c0VarP.b(objC, object);
                    unsafe.putObject(obj, jX, objC);
                } else {
                    unsafe.putObject(obj, jX, object);
                }
                R(i, obj);
                return;
            }
            Object object2 = unsafe.getObject(obj, jX);
            if (!t(object2)) {
                Object objC2 = c0VarP.c();
                c0VarP.b(objC2, object2);
                unsafe.putObject(obj, jX, objC2);
                object2 = objC2;
            }
            c0VarP.b(object2, object);
        }
    }

    public final void z(Object obj, int i, Object obj2) {
        int[] iArr = this.f5156a;
        int i5 = iArr[i];
        if (u(i5, i, obj2)) {
            long jX = X(i) & 1048575;
            Unsafe unsafe = f5155p;
            Object object = unsafe.getObject(obj2, jX);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + iArr[i] + " is present but null: " + obj2);
            }
            c0 c0VarP = p(i);
            if (!u(i5, i, obj)) {
                if (t(object)) {
                    Object objC = c0VarP.c();
                    c0VarP.b(objC, object);
                    unsafe.putObject(obj, jX, objC);
                } else {
                    unsafe.putObject(obj, jX, object);
                }
                S(i5, i, obj);
                return;
            }
            Object object2 = unsafe.getObject(obj, jX);
            if (!t(object2)) {
                Object objC2 = c0VarP.c();
                c0VarP.b(objC2, object2);
                unsafe.putObject(obj, jX, objC2);
                object2 = objC2;
            }
            c0VarP.b(object2, object);
        }
    }
}

package h4;

import C3.r;
import N3.h;
import N3.m;
import N3.o;
import a.AbstractC0149a;
import a0.C0200z;
import b3.AbstractC0307a;
import g4.l;
import g4.p;
import g4.s;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.GregorianCalendar;
import java.util.LinkedHashMap;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final char[] f6328a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    public static final LinkedHashMap a(ArrayList arrayList) {
        List<d> listS;
        String str = l.f5856m;
        l lVarS = C0200z.s("/", false);
        B3.b[] bVarArr = {new B3.b(lVarS, new d(lVarS))};
        LinkedHashMap linkedHashMap = new LinkedHashMap(r.b0(1));
        r.d0(linkedHashMap, bVarArr);
        I2.l lVar = new I2.l(1);
        if (arrayList.size() <= 1) {
            listS = C3.f.X(arrayList);
        } else {
            Object[] array = arrayList.toArray(new Object[0]);
            h.e(array, "<this>");
            if (array.length > 1) {
                Arrays.sort(array, lVar);
            }
            listS = C3.e.S(array);
        }
        for (d dVar : listS) {
            if (((d) linkedHashMap.put(dVar.f6336a, dVar)) == null) {
                while (true) {
                    l lVar2 = dVar.f6336a;
                    l lVarC = lVar2.c();
                    if (lVarC != null) {
                        d dVar2 = (d) linkedHashMap.get(lVarC);
                        if (dVar2 != null) {
                            dVar2.f6341f.add(lVar2);
                            break;
                        }
                        d dVar3 = new d(lVarC);
                        linkedHashMap.put(lVarC, dVar3);
                        dVar3.f6341f.add(lVar2);
                        dVar = dVar3;
                    }
                }
            }
        }
        return linkedHashMap;
    }

    public static final String b(int i) {
        AbstractC0149a.g(16);
        String string = Integer.toString(i, 16);
        h.d(string, "toString(this, checkRadix(radix))");
        return "0x".concat(string);
    }

    public static final d c(p pVar) throws IOException {
        Long lValueOf;
        int i;
        long j5;
        int iA = pVar.a();
        if (iA != 33639248) {
            throw new IOException("bad zip: expected " + b(33639248) + " but was " + b(iA));
        }
        pVar.l(4L);
        short sC = pVar.c();
        int i5 = sC & 65535;
        if ((sC & 1) != 0) {
            throw new IOException("unsupported zip: general purpose bit flag=" + b(i5));
        }
        int iC = pVar.c() & 65535;
        short sC2 = pVar.c();
        int i6 = sC2 & 65535;
        short sC3 = pVar.c();
        int i7 = sC3 & 65535;
        if (i6 == -1) {
            lValueOf = null;
        } else {
            GregorianCalendar gregorianCalendar = new GregorianCalendar();
            gregorianCalendar.set(14, 0);
            gregorianCalendar.set(((i7 >> 9) & 127) + 1980, ((i7 >> 5) & 15) - 1, sC3 & 31, (i6 >> 11) & 31, (i6 >> 5) & 63, (sC2 & 31) << 1);
            lValueOf = Long.valueOf(gregorianCalendar.getTime().getTime());
        }
        Long l3 = lValueOf;
        pVar.a();
        o oVar = new o();
        oVar.f1625l = ((long) pVar.a()) & 4294967295L;
        o oVar2 = new o();
        oVar2.f1625l = ((long) pVar.a()) & 4294967295L;
        int iC2 = pVar.c() & 65535;
        int iC3 = pVar.c() & 65535;
        int iC4 = pVar.c() & 65535;
        pVar.l(8L);
        o oVar3 = new o();
        oVar3.f1625l = ((long) pVar.a()) & 4294967295L;
        String strF = pVar.f(iC2);
        if (U3.l.h0(strF, (char) 0, false, 2) >= 0) {
            throw new IOException("bad zip: filename contains 0x00");
        }
        if (oVar2.f1625l == 4294967295L) {
            j5 = 8;
            i = iC;
        } else {
            i = iC;
            j5 = 0;
        }
        if (oVar.f1625l == 4294967295L) {
            j5 += (long) 8;
        }
        if (oVar3.f1625l == 4294967295L) {
            j5 += (long) 8;
        }
        long j6 = j5;
        m mVar = new m();
        d(pVar, iC3, new e(mVar, j6, oVar2, pVar, oVar, oVar3));
        if (j6 > 0 && !mVar.f1623l) {
            throw new IOException("bad zip: zip64 extra required but absent");
        }
        String strF2 = pVar.f(iC4);
        String str = l.f5856m;
        return new d(C0200z.s("/", false).d(strF), U3.l.d0(strF, "/", false), strF2, oVar.f1625l, oVar2.f1625l, i, l3, oVar3.f1625l);
    }

    public static final void d(p pVar, int i, M3.p pVar2) {
        long j5 = i;
        while (j5 != 0) {
            if (j5 < 4) {
                throw new IOException("bad zip: truncated header in extra field");
            }
            int iC = pVar.c() & 65535;
            long jC = ((long) pVar.c()) & 65535;
            long j6 = j5 - ((long) 4);
            if (j6 < jC) {
                throw new IOException("bad zip: truncated value in extra field");
            }
            pVar.k(jC);
            g4.a aVar = pVar.f5864m;
            long j7 = aVar.f5830m;
            pVar2.i(Integer.valueOf(iC), Long.valueOf(jC));
            long j8 = (aVar.f5830m + jC) - j7;
            if (j8 < 0) {
                throw new IOException(AbstractC0307a.i("unsupported zip: too many bytes processed for ", iC));
            }
            if (j8 > 0) {
                aVar.o(j8);
            }
            j5 = j6 - jC;
        }
    }

    public static final int e(s sVar, int i) {
        int i5;
        h.e(sVar, "<this>");
        int i6 = i + 1;
        int length = sVar.f5876p.length;
        int[] iArr = sVar.f5877q;
        h.e(iArr, "<this>");
        int i7 = length - 1;
        int i8 = 0;
        while (true) {
            if (i8 <= i7) {
                i5 = (i8 + i7) >>> 1;
                int i9 = iArr[i5];
                if (i9 >= i6) {
                    if (i9 <= i6) {
                        break;
                    }
                    i7 = i5 - 1;
                } else {
                    i8 = i5 + 1;
                }
            } else {
                i5 = (-i8) - 1;
                break;
            }
        }
        return i5 >= 0 ? i5 : ~i5;
    }
}

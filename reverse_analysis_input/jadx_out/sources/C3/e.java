package C3;

import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes.dex */
public abstract class e extends Z1.f {
    public static List S(Object[] objArr) {
        N3.h.e(objArr, "<this>");
        List listAsList = Arrays.asList(objArr);
        N3.h.d(listAsList, "asList(...)");
        return listAsList;
    }

    public static void T(int i, int i5, int i6, byte[] bArr, byte[] bArr2) {
        N3.h.e(bArr, "<this>");
        N3.h.e(bArr2, "destination");
        System.arraycopy(bArr, i5, bArr2, i, i6 - i5);
    }

    public static void U(int i, int i5, int i6, Object[] objArr, Object[] objArr2) {
        N3.h.e(objArr, "<this>");
        N3.h.e(objArr2, "destination");
        System.arraycopy(objArr, i5, objArr2, i, i6 - i5);
    }

    public static Object[] V(Object[] objArr, int i, int i5) {
        N3.h.e(objArr, "<this>");
        Z1.f.i(i5, objArr.length);
        Object[] objArrCopyOfRange = Arrays.copyOfRange(objArr, i, i5);
        N3.h.d(objArrCopyOfRange, "copyOfRange(...)");
        return objArrCopyOfRange;
    }

    public static final void W(Object[] objArr, F0.p pVar, int i, int i5) {
        N3.h.e(objArr, "<this>");
        Arrays.fill(objArr, i, i5, pVar);
    }

    public static Object X(Object[] objArr) {
        N3.h.e(objArr, "<this>");
        if (objArr.length != 0) {
            return objArr[0];
        }
        throw new NoSuchElementException("Array is empty.");
    }

    public static void Y(Object[] objArr, AbstractCollection abstractCollection) {
        for (Object obj : objArr) {
            abstractCollection.add(obj);
        }
    }

    public static ArrayList Z(Object[] objArr) {
        return new ArrayList(new c(objArr, false));
    }
}

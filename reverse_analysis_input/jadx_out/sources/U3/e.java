package U3;

import C3.n;
import a.AbstractC0149a;
import b3.AbstractC0307a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class e extends i4.a {
    public static String b0(String str) {
        List listY;
        int length;
        Comparable comparable;
        String strSubstring;
        N3.h.e(str, "<this>");
        d dVar = new d(str);
        if (dVar.hasNext()) {
            Object next = dVar.next();
            if (dVar.hasNext()) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(next);
                while (dVar.hasNext()) {
                    arrayList.add(dVar.next());
                }
                listY = arrayList;
            } else {
                listY = AbstractC0149a.y(next);
            }
        } else {
            listY = n.f291l;
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : listY) {
            if (!l.i0((String) obj)) {
                arrayList2.add(obj);
            }
        }
        ArrayList arrayList3 = new ArrayList(C3.h.R(arrayList2));
        Iterator it = arrayList2.iterator();
        while (true) {
            length = 0;
            if (!it.hasNext()) {
                break;
            }
            String str2 = (String) it.next();
            int length2 = str2.length();
            while (true) {
                if (length >= length2) {
                    length = -1;
                    break;
                }
                char cCharAt = str2.charAt(length);
                if (!Character.isWhitespace(cCharAt) && !Character.isSpaceChar(cCharAt)) {
                    break;
                }
                length++;
            }
            if (length == -1) {
                length = str2.length();
            }
            arrayList3.add(Integer.valueOf(length));
        }
        Iterator it2 = arrayList3.iterator();
        if (it2.hasNext()) {
            comparable = (Comparable) it2.next();
            while (it2.hasNext()) {
                Comparable comparable2 = (Comparable) it2.next();
                if (comparable.compareTo(comparable2) > 0) {
                    comparable = comparable2;
                }
            }
        } else {
            comparable = null;
        }
        Integer num = (Integer) comparable;
        int iIntValue = num != null ? num.intValue() : 0;
        int length3 = str.length();
        listY.size();
        int size = listY.size() - 1;
        ArrayList arrayList4 = new ArrayList();
        for (Object obj2 : listY) {
            int i = length + 1;
            if (length < 0) {
                throw new ArithmeticException("Index overflow has happened.");
            }
            String str3 = (String) obj2;
            if ((length == 0 || length == size) && l.i0(str3)) {
                strSubstring = null;
            } else {
                N3.h.e(str3, "<this>");
                if (iIntValue < 0) {
                    throw new IllegalArgumentException(AbstractC0307a.h(iIntValue, "Requested character count ", " is less than zero.").toString());
                }
                int length4 = str3.length();
                if (iIntValue <= length4) {
                    length4 = iIntValue;
                }
                strSubstring = str3.substring(length4);
                N3.h.d(strSubstring, "substring(...)");
            }
            if (strSubstring != null) {
                arrayList4.add(strSubstring);
            }
            length = i;
        }
        StringBuilder sb = new StringBuilder(length3);
        C3.f.U(arrayList4, sb, "\n", "", "", -1, "...", null);
        return sb.toString();
    }
}

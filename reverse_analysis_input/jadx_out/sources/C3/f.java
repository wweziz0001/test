package C3;

import a.AbstractC0149a;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public abstract class f extends l {
    public static Object T(ArrayList arrayList) {
        N3.h.e(arrayList, "<this>");
        if (arrayList.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        return arrayList.get(0);
    }

    public static final void U(Collection collection, StringBuilder sb, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, M3.l lVar) {
        N3.h.e(collection, "<this>");
        N3.h.e(charSequence, "separator");
        N3.h.e(charSequence2, "prefix");
        N3.h.e(charSequence3, "postfix");
        N3.h.e(charSequence4, "truncated");
        sb.append(charSequence2);
        int i5 = 0;
        for (Object obj : collection) {
            i5++;
            if (i5 > 1) {
                sb.append(charSequence);
            }
            if (i >= 0 && i5 > i) {
                break;
            } else {
                i4.a.d(sb, obj, lVar);
            }
        }
        if (i >= 0 && i5 > i) {
            sb.append(charSequence4);
        }
        sb.append(charSequence3);
    }

    public static String V(Collection collection, String str, String str2, String str3, M3.l lVar, int i) {
        if ((i & 1) != 0) {
            str = ", ";
        }
        String str4 = str;
        String str5 = (i & 2) != 0 ? "" : str2;
        String str6 = (i & 4) != 0 ? "" : str3;
        if ((i & 32) != 0) {
            lVar = null;
        }
        N3.h.e(collection, "<this>");
        N3.h.e(str4, "separator");
        N3.h.e(str5, "prefix");
        N3.h.e(str6, "postfix");
        StringBuilder sb = new StringBuilder();
        U(collection, sb, str4, str5, str6, -1, "...", lVar);
        return sb.toString();
    }

    public static void W(Iterable iterable, AbstractCollection abstractCollection) {
        N3.h.e(iterable, "<this>");
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            abstractCollection.add(it.next());
        }
    }

    public static List X(Iterable iterable) {
        ArrayList arrayListY;
        N3.h.e(iterable, "<this>");
        boolean z4 = iterable instanceof Collection;
        n nVar = n.f291l;
        if (z4) {
            Collection collection = (Collection) iterable;
            int size = collection.size();
            if (size == 0) {
                return nVar;
            }
            if (size != 1) {
                return Y(collection);
            }
            return AbstractC0149a.y(iterable instanceof List ? ((List) iterable).get(0) : collection.iterator().next());
        }
        if (z4) {
            arrayListY = Y((Collection) iterable);
        } else {
            ArrayList arrayList = new ArrayList();
            W(iterable, arrayList);
            arrayListY = arrayList;
        }
        int size2 = arrayListY.size();
        return size2 != 0 ? size2 != 1 ? arrayListY : AbstractC0149a.y(arrayListY.get(0)) : nVar;
    }

    public static ArrayList Y(Collection collection) {
        N3.h.e(collection, "<this>");
        return new ArrayList(collection);
    }

    public static Set Z(Collection collection) {
        N3.h.e(collection, "<this>");
        p pVar = p.f293l;
        int size = collection.size();
        if (size == 0) {
            return pVar;
        }
        if (size != 1) {
            LinkedHashSet linkedHashSet = new LinkedHashSet(r.b0(collection.size()));
            W(collection, linkedHashSet);
            return linkedHashSet;
        }
        Set setSingleton = Collections.singleton(collection instanceof List ? ((List) collection).get(0) : collection.iterator().next());
        N3.h.d(setSingleton, "singleton(...)");
        return setSingleton;
    }
}

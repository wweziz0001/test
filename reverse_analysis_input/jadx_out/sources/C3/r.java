package C3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public abstract class r extends i4.a {
    public static int b0(int i) {
        if (i < 0) {
            return i;
        }
        if (i < 3) {
            return i + 1;
        }
        if (i < 1073741824) {
            return (int) ((i / 0.75f) + 1.0f);
        }
        return Integer.MAX_VALUE;
    }

    public static Map c0(B3.b... bVarArr) {
        if (bVarArr.length <= 0) {
            return o.f292l;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(b0(bVarArr.length));
        d0(linkedHashMap, bVarArr);
        return linkedHashMap;
    }

    public static final void d0(LinkedHashMap linkedHashMap, B3.b[] bVarArr) {
        for (B3.b bVar : bVarArr) {
            linkedHashMap.put(bVar.f268l, bVar.f269m);
        }
    }

    public static Map e0(ArrayList arrayList) {
        o oVar = o.f292l;
        int size = arrayList.size();
        if (size == 0) {
            return oVar;
        }
        if (size == 1) {
            B3.b bVar = (B3.b) arrayList.get(0);
            N3.h.e(bVar, "pair");
            Map mapSingletonMap = Collections.singletonMap(bVar.f268l, bVar.f269m);
            N3.h.d(mapSingletonMap, "singletonMap(...)");
            return mapSingletonMap;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(b0(arrayList.size()));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            B3.b bVar2 = (B3.b) it.next();
            linkedHashMap.put(bVar2.f268l, bVar2.f269m);
        }
        return linkedHashMap;
    }
}

package androidx.work;

import N3.h;
import Q1.g;
import Q1.i;
import e3.C0398g;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class OverwritingInputMerger extends i {
    @Override // Q1.i
    public final g a(ArrayList arrayList) throws Throwable {
        C0398g c0398g = new C0398g(1);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Map mapUnmodifiableMap = Collections.unmodifiableMap(((g) it.next()).f1824a);
            h.d(mapUnmodifiableMap, "input.keyValueMap");
            linkedHashMap.putAll(mapUnmodifiableMap);
        }
        c0398g.c(linkedHashMap);
        g gVar = new g(c0398g.f5638a);
        g.b(gVar);
        return gVar;
    }
}

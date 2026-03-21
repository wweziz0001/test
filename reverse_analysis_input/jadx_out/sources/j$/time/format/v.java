package j$.time.format;

import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
final class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map f7112a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final HashMap f7113b;

    v(Map map) {
        this.f7112a = map;
        HashMap map2 = new HashMap();
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : map.entrySet()) {
            HashMap map3 = new HashMap();
            for (Map.Entry entry2 : ((Map) entry.getValue()).entrySet()) {
                String str = (String) entry2.getValue();
                String str2 = (String) entry2.getValue();
                Long l3 = (Long) entry2.getKey();
                int i = b.f7062c;
                map3.put(str, new AbstractMap.SimpleImmutableEntry(str2, l3));
            }
            ArrayList arrayList2 = new ArrayList(map3.values());
            Collections.sort(arrayList2, b.f7061b);
            map2.put((A) entry.getKey(), arrayList2);
            arrayList.addAll(arrayList2);
            map2.put(null, arrayList);
        }
        Collections.sort(arrayList, b.f7061b);
        this.f7113b = map2;
    }

    final String a(long j5, A a5) {
        Map map = (Map) this.f7112a.get(a5);
        if (map != null) {
            return (String) map.get(Long.valueOf(j5));
        }
        return null;
    }

    final Iterator b(A a5) {
        List list = (List) this.f7113b.get(a5);
        if (list != null) {
            return list.iterator();
        }
        return null;
    }
}

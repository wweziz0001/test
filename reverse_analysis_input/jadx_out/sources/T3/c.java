package T3;

import C3.n;
import a.AbstractC0149a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class c extends d {
    public static List E0(b bVar) {
        Iterator it = bVar.iterator();
        if (!it.hasNext()) {
            return n.f291l;
        }
        Object next = it.next();
        if (!it.hasNext()) {
            return AbstractC0149a.y(next);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(next);
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        return arrayList;
    }
}

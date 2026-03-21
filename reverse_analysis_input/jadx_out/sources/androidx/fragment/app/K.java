package androidx.fragment.app;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* JADX INFO: loaded from: classes.dex */
public final class K implements J {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ L f4237a;

    public K(L l3) {
        this.f4237a = l3;
    }

    @Override // androidx.fragment.app.J
    public final boolean a(ArrayList arrayList, ArrayList arrayList2) {
        L l3 = this.f4237a;
        ArrayList arrayList3 = l3.f4255d;
        C0234a c0234a = (C0234a) arrayList3.get(arrayList3.size() - 1);
        l3.f4259h = c0234a;
        Iterator it = c0234a.f4339a.iterator();
        while (it.hasNext()) {
            r rVar = ((U) it.next()).f4311b;
            if (rVar != null) {
                rVar.f4451x = true;
            }
        }
        boolean zQ = l3.Q(arrayList, arrayList2);
        if (!l3.f4263m.isEmpty() && arrayList.size() > 0) {
            ((Boolean) arrayList2.get(arrayList.size() - 1)).getClass();
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                linkedHashSet.addAll(L.E((C0234a) it2.next()));
            }
            Iterator it3 = l3.f4263m.iterator();
            while (it3.hasNext()) {
                if (it3.next() != null) {
                    throw new ClassCastException();
                }
                Iterator it4 = linkedHashSet.iterator();
                if (it4.hasNext()) {
                    throw null;
                }
            }
        }
        return zQ;
    }
}

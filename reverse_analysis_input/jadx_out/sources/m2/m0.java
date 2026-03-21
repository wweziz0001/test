package m2;

import java.util.Comparator;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.SortedSet;

/* JADX INFO: loaded from: classes.dex */
public final class m0 extends l0 implements SortedSet {
    @Override // java.util.SortedSet
    public final Comparator comparator() {
        return ((SortedSet) this.f8635l).comparator();
    }

    @Override // java.util.SortedSet
    public final Object first() {
        Iterator it = this.f8635l.iterator();
        it.getClass();
        l2.e eVar = this.f8636m;
        eVar.getClass();
        while (it.hasNext()) {
            Object next = it.next();
            if (eVar.apply(next)) {
                return next;
            }
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.SortedSet
    public final SortedSet headSet(Object obj) {
        return new m0(((SortedSet) this.f8635l).headSet(obj), this.f8636m);
    }

    @Override // java.util.SortedSet
    public final Object last() {
        SortedSet sortedSetHeadSet = (SortedSet) this.f8635l;
        while (true) {
            Object objLast = sortedSetHeadSet.last();
            if (this.f8636m.apply(objLast)) {
                return objLast;
            }
            sortedSetHeadSet = sortedSetHeadSet.headSet(objLast);
        }
    }

    @Override // java.util.SortedSet
    public final SortedSet subSet(Object obj, Object obj2) {
        return new m0(((SortedSet) this.f8635l).subSet(obj, obj2), this.f8636m);
    }

    @Override // java.util.SortedSet
    public final SortedSet tailSet(Object obj) {
        return new m0(((SortedSet) this.f8635l).tailSet(obj), this.f8636m);
    }
}

package m2;

import java.util.Comparator;
import java.util.SortedMap;
import java.util.SortedSet;

/* JADX INFO: renamed from: m2.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0650i extends C0645d implements SortedMap {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public SortedSet f8621p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ Y f8622q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0650i(Y y, SortedMap sortedMap) {
        super(y, sortedMap);
        this.f8622q = y;
    }

    public SortedSet b() {
        return new C0651j(this.f8622q, d());
    }

    @Override // m2.C0645d, java.util.AbstractMap, java.util.Map
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public SortedSet keySet() {
        SortedSet sortedSet = this.f8621p;
        if (sortedSet != null) {
            return sortedSet;
        }
        SortedSet sortedSetB = b();
        this.f8621p = sortedSetB;
        return sortedSetB;
    }

    @Override // java.util.SortedMap
    public final Comparator comparator() {
        return d().comparator();
    }

    public SortedMap d() {
        return (SortedMap) this.f8593n;
    }

    @Override // java.util.SortedMap
    public final Object firstKey() {
        return d().firstKey();
    }

    public SortedMap headMap(Object obj) {
        return new C0650i(this.f8622q, d().headMap(obj));
    }

    @Override // java.util.SortedMap
    public final Object lastKey() {
        return d().lastKey();
    }

    public SortedMap subMap(Object obj, Object obj2) {
        return new C0650i(this.f8622q, d().subMap(obj, obj2));
    }

    public SortedMap tailMap(Object obj) {
        return new C0650i(this.f8622q, d().tailMap(obj));
    }
}

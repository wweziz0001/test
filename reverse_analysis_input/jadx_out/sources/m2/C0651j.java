package m2;

import java.util.Comparator;
import java.util.SortedMap;
import java.util.SortedSet;

/* JADX INFO: renamed from: m2.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0651j extends C0646e implements SortedSet {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Y f8624n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0651j(Y y, SortedMap sortedMap) {
        super(y, sortedMap);
        this.f8624n = y;
    }

    @Override // java.util.SortedSet
    public final Comparator comparator() {
        return f().comparator();
    }

    public SortedMap f() {
        return (SortedMap) this.f8598l;
    }

    @Override // java.util.SortedSet
    public final Object first() {
        return f().firstKey();
    }

    public SortedSet headSet(Object obj) {
        return new C0651j(this.f8624n, f().headMap(obj));
    }

    @Override // java.util.SortedSet
    public final Object last() {
        return f().lastKey();
    }

    public SortedSet subSet(Object obj, Object obj2) {
        return new C0651j(this.f8624n, f().subMap(obj, obj2));
    }

    public SortedSet tailSet(Object obj) {
        return new C0651j(this.f8624n, f().tailMap(obj));
    }
}

package m2;

import java.util.AbstractList;
import java.util.ListIterator;

/* JADX INFO: loaded from: classes.dex */
public final class Q extends p0 implements ListIterator {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f8565m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ AbstractList f8566n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ Q(AbstractList abstractList, ListIterator listIterator, int i) {
        super(listIterator);
        this.f8565m = i;
        this.f8566n = abstractList;
    }

    @Override // m2.p0
    public final Object a(Object obj) {
        switch (this.f8565m) {
            case 0:
                return ((S) this.f8566n).f8568m.apply(obj);
            default:
                return ((T) this.f8566n).f8570m.apply(obj);
        }
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return ((ListIterator) this.f8643l).hasPrevious();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return ((ListIterator) this.f8643l).nextIndex();
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        return a(((ListIterator) this.f8643l).previous());
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return ((ListIterator) this.f8643l).previousIndex();
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        throw new UnsupportedOperationException();
    }
}

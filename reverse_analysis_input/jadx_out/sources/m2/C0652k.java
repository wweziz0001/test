package m2;

import java.util.List;
import java.util.ListIterator;

/* JADX INFO: renamed from: m2.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0652k extends C0644c implements ListIterator {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ C0653l f8626p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0652k(C0653l c0653l) {
        super(c0653l);
        this.f8626p = c0653l;
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        C0653l c0653l = this.f8626p;
        boolean zIsEmpty = c0653l.isEmpty();
        b().add(obj);
        c0653l.f8634q.f8574p++;
        if (zIsEmpty) {
            c0653l.f();
        }
    }

    public final ListIterator b() {
        a();
        return (ListIterator) this.f8587m;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return b().hasPrevious();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return b().nextIndex();
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        return b().previous();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return b().previousIndex();
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        b().set(obj);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0652k(C0653l c0653l, int i) {
        super(c0653l, ((List) c0653l.f8630m).listIterator(i));
        this.f8626p = c0653l;
    }
}

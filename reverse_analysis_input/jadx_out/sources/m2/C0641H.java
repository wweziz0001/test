package m2;

import java.util.Iterator;
import java.util.ListIterator;

/* JADX INFO: renamed from: m2.H, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0641H extends I {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final transient int f8546n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final transient int f8547o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ I f8548p;

    public C0641H(I i, int i5, int i6) {
        this.f8548p = i;
        this.f8546n = i5;
        this.f8547o = i6;
    }

    @Override // java.util.List
    public final Object get(int i) {
        D1.b.l(i, this.f8547o);
        return this.f8548p.get(i + this.f8546n);
    }

    @Override // m2.AbstractC0637D
    public final Object[] h() {
        return this.f8548p.h();
    }

    @Override // m2.AbstractC0637D
    public final int i() {
        return this.f8548p.j() + this.f8546n + this.f8547o;
    }

    @Override // m2.I, m2.AbstractC0637D, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return listIterator(0);
    }

    @Override // m2.AbstractC0637D
    public final int j() {
        return this.f8548p.j() + this.f8546n;
    }

    @Override // m2.AbstractC0637D
    public final boolean k() {
        return true;
    }

    @Override // m2.I, java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f8547o;
    }

    @Override // m2.I, java.util.List
    /* JADX INFO: renamed from: y */
    public final I subList(int i, int i5) {
        D1.b.p(i, i5, this.f8547o);
        int i6 = this.f8546n;
        return this.f8548p.subList(i + i6, i5 + i6);
    }

    @Override // m2.I, java.util.List
    public final /* bridge */ /* synthetic */ ListIterator listIterator(int i) {
        return listIterator(i);
    }
}

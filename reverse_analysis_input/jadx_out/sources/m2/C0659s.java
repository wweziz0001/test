package m2;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: m2.s, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0659s implements Iterator {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f8646l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f8647m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f8648n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ C0662v f8649o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ int f8650p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ C0662v f8651q;

    public C0659s(C0662v c0662v, int i) {
        this.f8650p = i;
        this.f8651q = c0662v;
        this.f8649o = c0662v;
        this.f8646l = c0662v.f8662p;
        this.f8647m = c0662v.isEmpty() ? -1 : 0;
        this.f8648n = -1;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f8647m >= 0;
    }

    @Override // java.util.Iterator
    public final Object next() {
        Object c0661u;
        C0662v c0662v = this.f8649o;
        if (c0662v.f8662p != this.f8646l) {
            throw new ConcurrentModificationException();
        }
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i = this.f8647m;
        this.f8648n = i;
        switch (this.f8650p) {
            case 0:
                c0661u = this.f8651q.j()[i];
                break;
            case 1:
                c0661u = new C0661u(this.f8651q, i);
                break;
            default:
                c0661u = this.f8651q.k()[i];
                break;
        }
        int i5 = this.f8647m + 1;
        if (i5 >= c0662v.f8663q) {
            i5 = -1;
        }
        this.f8647m = i5;
        return c0661u;
    }

    @Override // java.util.Iterator
    public final void remove() {
        C0662v c0662v = this.f8649o;
        int i = c0662v.f8662p;
        int i5 = this.f8646l;
        if (i != i5) {
            throw new ConcurrentModificationException();
        }
        int i6 = this.f8648n;
        if (i6 < 0) {
            throw new IllegalStateException("no calls to next() since the last call to remove()");
        }
        this.f8646l = i5 + 32;
        c0662v.remove(c0662v.j()[i6]);
        this.f8647m--;
        this.f8648n = -1;
    }
}

package m2;

import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;

/* JADX INFO: renamed from: m2.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0644c implements Iterator {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f8586l = 0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Iterator f8587m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public Object f8588n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Object f8589o;

    public C0644c(C0653l c0653l) {
        this.f8589o = c0653l;
        Collection collection = c0653l.f8630m;
        this.f8588n = collection;
        this.f8587m = collection instanceof List ? ((List) collection).listIterator() : collection.iterator();
    }

    public void a() {
        C0653l c0653l = (C0653l) this.f8589o;
        c0653l.g();
        if (c0653l.f8630m != ((Collection) this.f8588n)) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f8586l) {
            case 0:
                break;
            case 1:
                break;
            default:
                a();
                break;
        }
        return this.f8587m.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f8586l) {
            case 0:
                Map.Entry entry = (Map.Entry) this.f8587m.next();
                this.f8588n = (Collection) entry.getValue();
                return ((C0645d) this.f8589o).a(entry);
            case 1:
                Map.Entry entry2 = (Map.Entry) this.f8587m.next();
                this.f8588n = entry2;
                return entry2.getKey();
            default:
                a();
                return this.f8587m.next();
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f8586l) {
            case 0:
                if (!(((Collection) this.f8588n) != null)) {
                    throw new IllegalStateException("no calls to next() since the last call to remove()");
                }
                this.f8587m.remove();
                ((C0645d) this.f8589o).f8594o.f8574p -= ((Collection) this.f8588n).size();
                ((Collection) this.f8588n).clear();
                this.f8588n = null;
                return;
            case 1:
                Map.Entry entry = (Map.Entry) this.f8588n;
                if (!(entry != null)) {
                    throw new IllegalStateException("no calls to next() since the last call to remove()");
                }
                Collection collection = (Collection) entry.getValue();
                this.f8587m.remove();
                ((C0646e) this.f8589o).f8599m.f8574p -= collection.size();
                collection.clear();
                this.f8588n = null;
                return;
            default:
                this.f8587m.remove();
                C0653l c0653l = (C0653l) this.f8589o;
                Y y = c0653l.f8633p;
                y.f8574p--;
                c0653l.h();
                return;
        }
    }

    public C0644c(C0653l c0653l, ListIterator listIterator) {
        this.f8589o = c0653l;
        this.f8588n = c0653l.f8630m;
        this.f8587m = listIterator;
    }

    public C0644c(C0646e c0646e, Iterator it) {
        this.f8587m = it;
        this.f8589o = c0646e;
    }

    public C0644c(C0645d c0645d) {
        this.f8589o = c0645d;
        this.f8587m = c0645d.f8593n.entrySet().iterator();
    }
}

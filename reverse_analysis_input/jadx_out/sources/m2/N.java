package m2;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes.dex */
public final class N extends q0 {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f8556l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public Object f8557m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f8558n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Iterator f8559o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ Object f8560p;

    public N() {
        this.f8556l = 2;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // java.util.Iterator
    public final boolean hasNext() {
        Object next;
        int i = this.f8556l;
        if (i == 4) {
            throw new IllegalStateException();
        }
        int iB = O.i.b(i);
        if (iB == 0) {
            return true;
        }
        if (iB == 2) {
            return false;
        }
        this.f8556l = 4;
        switch (this.f8558n) {
            case 0:
                do {
                    Iterator it = this.f8559o;
                    if (!it.hasNext()) {
                        this.f8556l = 3;
                        next = null;
                    } else {
                        next = it.next();
                    }
                    break;
                } while (!((l2.e) this.f8560p).apply(next));
                break;
            default:
                do {
                    Iterator it2 = this.f8559o;
                    if (!it2.hasNext()) {
                        this.f8556l = 3;
                        next = null;
                    } else {
                        next = it2.next();
                    }
                    break;
                } while (!((k0) this.f8560p).f8628m.contains(next));
                break;
        }
        this.f8557m = next;
        if (this.f8556l == 3) {
            return false;
        }
        this.f8556l = 1;
        return true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.f8556l = 2;
        Object obj = this.f8557m;
        this.f8557m = null;
        return obj;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public N(Iterator it, l2.e eVar) {
        this();
        this.f8558n = 0;
        this.f8559o = it;
        this.f8560p = eVar;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public N(k0 k0Var) {
        this();
        this.f8558n = 1;
        this.f8560p = k0Var;
        this.f8559o = k0Var.f8627l.iterator();
    }
}

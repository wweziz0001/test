package I2;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes.dex */
public final class m implements Iterator {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public o f1047l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public o f1048m = null;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f1049n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ p f1050o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ int f1051p;

    public m(p pVar, int i) {
        this.f1051p = i;
        this.f1050o = pVar;
        this.f1047l = pVar.f1069q.f1057o;
        this.f1049n = pVar.f1068p;
    }

    public final Object a() {
        return b();
    }

    public final o b() {
        o oVar = this.f1047l;
        p pVar = this.f1050o;
        if (oVar == pVar.f1069q) {
            throw new NoSuchElementException();
        }
        if (pVar.f1068p != this.f1049n) {
            throw new ConcurrentModificationException();
        }
        this.f1047l = oVar.f1057o;
        this.f1048m = oVar;
        return oVar;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f1047l != this.f1050o.f1069q;
    }

    @Override // java.util.Iterator
    public Object next() {
        switch (this.f1051p) {
            case 1:
                return b().f1059q;
            default:
                return a();
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        o oVar = this.f1048m;
        if (oVar == null) {
            throw new IllegalStateException();
        }
        p pVar = this.f1050o;
        pVar.c(oVar, true);
        this.f1048m = null;
        this.f1049n = pVar.f1068p;
    }
}

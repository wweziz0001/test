package D3;

import D.AbstractC0022w;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes.dex */
public final class d extends AbstractC0022w implements Iterator, O3.a {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ int f599p;

    public d(f fVar, int i) {
        this.f599p = i;
        N3.h.e(fVar, "map");
        this.f376o = fVar;
        this.f374m = -1;
        this.f375n = fVar.f610s;
        e();
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f599p) {
            case 0:
                b();
                int i = this.f373l;
                f fVar = (f) this.f376o;
                if (i >= fVar.f608q) {
                    throw new NoSuchElementException();
                }
                this.f373l = i + 1;
                this.f374m = i;
                e eVar = new e(fVar, i);
                e();
                return eVar;
            case 1:
                b();
                int i5 = this.f373l;
                f fVar2 = (f) this.f376o;
                if (i5 >= fVar2.f608q) {
                    throw new NoSuchElementException();
                }
                this.f373l = i5 + 1;
                this.f374m = i5;
                Object obj = fVar2.f603l[i5];
                e();
                return obj;
            default:
                b();
                int i6 = this.f373l;
                f fVar3 = (f) this.f376o;
                if (i6 >= fVar3.f608q) {
                    throw new NoSuchElementException();
                }
                this.f373l = i6 + 1;
                this.f374m = i6;
                Object[] objArr = fVar3.f604m;
                N3.h.b(objArr);
                Object obj2 = objArr[this.f374m];
                e();
                return obj2;
        }
    }
}

package G2;

import b3.AbstractC0307a;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class f extends g implements Iterable {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final ArrayList f904l = new ArrayList();

    public final boolean equals(Object obj) {
        return obj == this || ((obj instanceof f) && ((f) obj).f904l.equals(this.f904l));
    }

    @Override // G2.g
    public final boolean f() {
        return i().f();
    }

    @Override // G2.g
    public final String h() {
        return i().h();
    }

    public final int hashCode() {
        return this.f904l.hashCode();
    }

    public final g i() {
        ArrayList arrayList = this.f904l;
        int size = arrayList.size();
        if (size == 1) {
            return (g) arrayList.get(0);
        }
        throw new IllegalStateException(AbstractC0307a.i("Array must have size 1, but has size ", size));
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return this.f904l.iterator();
    }
}

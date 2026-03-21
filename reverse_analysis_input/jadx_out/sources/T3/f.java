package T3;

import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class f implements Iterable, O3.a {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ U3.c f2256l;

    public f(U3.c cVar) {
        this.f2256l = cVar;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new U3.b(this.f2256l);
    }
}

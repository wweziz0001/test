package m2;

import java.util.AbstractMap;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class c0 extends I {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ d0 f8590n;

    public c0(d0 d0Var) {
        this.f8590n = d0Var;
    }

    @Override // java.util.List
    public final Object get(int i) {
        d0 d0Var = this.f8590n;
        D1.b.l(i, d0Var.f8597q);
        int i5 = i * 2;
        Object[] objArr = d0Var.f8596p;
        Object obj = objArr[i5];
        Objects.requireNonNull(obj);
        Object obj2 = objArr[i5 + 1];
        Objects.requireNonNull(obj2);
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    @Override // m2.AbstractC0637D
    public final boolean k() {
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f8590n.f8597q;
    }
}

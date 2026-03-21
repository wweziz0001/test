package C3;

import java.util.AbstractList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class a extends AbstractList implements List, O3.a {
    public abstract int f();

    public abstract Object g(int i);

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ Object remove(int i) {
        return g(i);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ int size() {
        return f();
    }
}

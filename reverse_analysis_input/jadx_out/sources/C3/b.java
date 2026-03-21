package C3;

import java.util.AbstractSet;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public abstract class b extends AbstractSet implements Set, O3.a {
    public abstract int f();

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final /* bridge */ int size() {
        return f();
    }
}

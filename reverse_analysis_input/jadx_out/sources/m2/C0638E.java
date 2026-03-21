package m2;

import java.io.Serializable;

/* JADX INFO: renamed from: m2.E, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0638E extends AbstractC0654m implements Serializable {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Object f8541l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Object f8542m;

    public C0638E(Object obj, Object obj2) {
        this.f8541l = obj;
        this.f8542m = obj2;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f8541l;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f8542m;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException();
    }
}

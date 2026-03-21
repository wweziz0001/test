package q;

import androidx.datastore.preferences.protobuf.a0;
import java.lang.reflect.Array;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: q.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0735e extends C0739i implements Map {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public a0 f9212s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public C0732b f9213t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public C0734d f9214u;

    @Override // java.util.Map
    public final Set entrySet() {
        a0 a0Var = this.f9212s;
        if (a0Var != null) {
            return a0Var;
        }
        a0 a0Var2 = new a0(1, this);
        this.f9212s = a0Var2;
        return a0Var2;
    }

    public final Object[] j(int i, Object[] objArr) {
        int i5 = this.f9237n;
        if (objArr.length < i5) {
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), i5);
        }
        for (int i6 = 0; i6 < i5; i6++) {
            objArr[i6] = this.f9236m[(i6 << 1) + i];
        }
        if (objArr.length > i5) {
            objArr[i5] = null;
        }
        return objArr;
    }

    @Override // java.util.Map
    public final Set keySet() {
        C0732b c0732b = this.f9213t;
        if (c0732b != null) {
            return c0732b;
        }
        C0732b c0732b2 = new C0732b(this);
        this.f9213t = c0732b2;
        return c0732b2;
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        int size = map.size() + this.f9237n;
        int i = this.f9237n;
        int[] iArr = this.f9235l;
        if (iArr.length < size) {
            Object[] objArr = this.f9236m;
            a(size);
            if (this.f9237n > 0) {
                System.arraycopy(iArr, 0, this.f9235l, 0, i);
                System.arraycopy(objArr, 0, this.f9236m, 0, i << 1);
            }
            C0739i.b(iArr, objArr, i);
        }
        if (this.f9237n != i) {
            throw new ConcurrentModificationException();
        }
        for (Map.Entry entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    @Override // java.util.Map
    public final Collection values() {
        C0734d c0734d = this.f9214u;
        if (c0734d != null) {
            return c0734d;
        }
        C0734d c0734d2 = new C0734d(this);
        this.f9214u = c0734d2;
        return c0734d2;
    }
}

package m2;

import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.Arrays;
import java.util.Collection;
import java.util.Spliterator;
import java.util.Spliterators;

/* JADX INFO: renamed from: m2.D, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0637D extends AbstractCollection implements Serializable {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final Object[] f8540l = new Object[0];

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public abstract boolean contains(Object obj);

    public abstract I f();

    public abstract int g(int i, Object[] objArr);

    public Object[] h() {
        return null;
    }

    public int i() {
        throw new UnsupportedOperationException();
    }

    public int j() {
        throw new UnsupportedOperationException();
    }

    public abstract boolean k();

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public abstract q0 iterator();

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Spliterator spliterator() {
        return Spliterators.spliterator(this, 1296);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final Object[] toArray() {
        return toArray(f8540l);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        objArr.getClass();
        int size = size();
        if (objArr.length < size) {
            Object[] objArrH = h();
            if (objArrH != null) {
                return Arrays.copyOfRange(objArrH, j(), i(), objArr.getClass());
            }
            if (objArr.length != 0) {
                objArr = Arrays.copyOf(objArr, 0);
            }
            objArr = Arrays.copyOf(objArr, size);
        } else if (objArr.length > size) {
            objArr[size] = null;
        }
        g(0, objArr);
        return objArr;
    }
}

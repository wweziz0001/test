package com.google.crypto.tink.shaded.protobuf;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;
import m.B0;

/* JADX INFO: loaded from: classes.dex */
public final class a0 extends AbstractC0322b implements RandomAccess {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final a0 f5177o;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public Object[] f5178m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f5179n;

    static {
        a0 a0Var = new a0(0, new Object[0]);
        f5177o = a0Var;
        a0Var.f5180l = false;
    }

    public a0(int i, Object[] objArr) {
        this.f5178m = objArr;
        this.f5179n = i;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC0322b, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        f();
        int i = this.f5179n;
        Object[] objArr = this.f5178m;
        if (i == objArr.length) {
            this.f5178m = Arrays.copyOf(objArr, ((i * 3) / 2) + 1);
        }
        Object[] objArr2 = this.f5178m;
        int i5 = this.f5179n;
        this.f5179n = i5 + 1;
        objArr2[i5] = obj;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC0345z
    public final InterfaceC0345z c(int i) {
        if (i < this.f5179n) {
            throw new IllegalArgumentException();
        }
        return new a0(this.f5179n, Arrays.copyOf(this.f5178m, i));
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        h(i);
        return this.f5178m[i];
    }

    public final void h(int i) {
        if (i < 0 || i >= this.f5179n) {
            StringBuilder sbJ = B0.j(i, "Index:", ", Size:");
            sbJ.append(this.f5179n);
            throw new IndexOutOfBoundsException(sbJ.toString());
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC0322b, java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        f();
        h(i);
        Object[] objArr = this.f5178m;
        Object obj = objArr[i];
        if (i < this.f5179n - 1) {
            System.arraycopy(objArr, i + 1, objArr, i, (r2 - i) - 1);
        }
        this.f5179n--;
        ((AbstractList) this).modCount++;
        return obj;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        f();
        h(i);
        Object[] objArr = this.f5178m;
        Object obj2 = objArr[i];
        objArr[i] = obj;
        ((AbstractList) this).modCount++;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f5179n;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        int i5;
        f();
        if (i >= 0 && i <= (i5 = this.f5179n)) {
            Object[] objArr = this.f5178m;
            if (i5 < objArr.length) {
                System.arraycopy(objArr, i, objArr, i + 1, i5 - i);
            } else {
                Object[] objArr2 = new Object[((i5 * 3) / 2) + 1];
                System.arraycopy(objArr, 0, objArr2, 0, i);
                System.arraycopy(this.f5178m, i, objArr2, i + 1, this.f5179n - i);
                this.f5178m = objArr2;
            }
            this.f5178m[i] = obj;
            this.f5179n++;
            ((AbstractList) this).modCount++;
            return;
        }
        StringBuilder sbJ = B0.j(i, "Index:", ", Size:");
        sbJ.append(this.f5179n);
        throw new IndexOutOfBoundsException(sbJ.toString());
    }
}

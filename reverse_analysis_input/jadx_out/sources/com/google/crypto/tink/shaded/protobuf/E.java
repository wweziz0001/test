package com.google.crypto.tink.shaded.protobuf;

import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes.dex */
public final class E extends AbstractC0322b implements F, RandomAccess {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final ArrayList f5142m;

    static {
        new E(10).f5180l = false;
    }

    public E(int i) {
        this(new ArrayList(i));
    }

    @Override // com.google.crypto.tink.shaded.protobuf.F
    public final F a() {
        return this.f5180l ? new j0(this) : this;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        f();
        this.f5142m.add(i, (String) obj);
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC0322b, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        return addAll(this.f5142m.size(), collection);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.F
    public final Object b(int i) {
        return this.f5142m.get(i);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC0345z
    public final InterfaceC0345z c(int i) {
        ArrayList arrayList = this.f5142m;
        if (i < arrayList.size()) {
            throw new IllegalArgumentException();
        }
        ArrayList arrayList2 = new ArrayList(i);
        arrayList2.addAll(arrayList);
        return new E(arrayList2);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC0322b, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        f();
        this.f5142m.clear();
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.F
    public final List d() {
        return Collections.unmodifiableList(this.f5142m);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.F
    public final void e(AbstractC0329i abstractC0329i) {
        f();
        this.f5142m.add(abstractC0329i);
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        String str;
        ArrayList arrayList = this.f5142m;
        Object obj = arrayList.get(i);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof AbstractC0329i) {
            AbstractC0329i abstractC0329i = (AbstractC0329i) obj;
            abstractC0329i.getClass();
            Charset charset = A.f5128a;
            if (abstractC0329i.size() == 0) {
                str = "";
            } else {
                C0328h c0328h = (C0328h) abstractC0329i;
                str = new String(c0328h.f5203o, c0328h.k(), c0328h.size(), charset);
            }
            C0328h c0328h2 = (C0328h) abstractC0329i;
            int iK = c0328h2.k();
            if (r0.f5248a.J(c0328h2.f5203o, iK, c0328h2.size() + iK) == 0) {
                arrayList.set(i, str);
            }
        } else {
            byte[] bArr = (byte[]) obj;
            str = new String(bArr, A.f5128a);
            D1.b bVar = r0.f5248a;
            if (r0.f5248a.J(bArr, 0, bArr.length) == 0) {
                arrayList.set(i, str);
            }
        }
        return str;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC0322b, java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        f();
        Object objRemove = this.f5142m.remove(i);
        ((AbstractList) this).modCount++;
        if (objRemove instanceof String) {
            return (String) objRemove;
        }
        if (!(objRemove instanceof AbstractC0329i)) {
            return new String((byte[]) objRemove, A.f5128a);
        }
        AbstractC0329i abstractC0329i = (AbstractC0329i) objRemove;
        abstractC0329i.getClass();
        Charset charset = A.f5128a;
        if (abstractC0329i.size() == 0) {
            return "";
        }
        C0328h c0328h = (C0328h) abstractC0329i;
        return new String(c0328h.f5203o, c0328h.k(), c0328h.size(), charset);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        f();
        Object obj2 = this.f5142m.set(i, (String) obj);
        if (obj2 instanceof String) {
            return (String) obj2;
        }
        if (!(obj2 instanceof AbstractC0329i)) {
            return new String((byte[]) obj2, A.f5128a);
        }
        AbstractC0329i abstractC0329i = (AbstractC0329i) obj2;
        abstractC0329i.getClass();
        Charset charset = A.f5128a;
        if (abstractC0329i.size() == 0) {
            return "";
        }
        C0328h c0328h = (C0328h) abstractC0329i;
        return new String(c0328h.f5203o, c0328h.k(), c0328h.size(), charset);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f5142m.size();
    }

    public E(ArrayList arrayList) {
        this.f5142m = arrayList;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC0322b, java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection collection) {
        f();
        if (collection instanceof F) {
            collection = ((F) collection).d();
        }
        boolean zAddAll = this.f5142m.addAll(i, collection);
        ((AbstractList) this).modCount++;
        return zAddAll;
    }
}

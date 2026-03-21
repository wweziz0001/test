package com.google.crypto.tink.shaded.protobuf;

import java.util.AbstractList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes.dex */
public final class j0 extends AbstractList implements F, RandomAccess {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final E f5215l;

    public j0(E e5) {
        this.f5215l = e5;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.F
    public final F a() {
        return this;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.F
    public final Object b(int i) {
        return this.f5215l.f5142m.get(i);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.F
    public final List d() {
        return Collections.unmodifiableList(this.f5215l.f5142m);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.F
    public final void e(AbstractC0329i abstractC0329i) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        return (String) this.f5215l.get(i);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return new i0(this);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i) {
        return new h0(this, i);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f5215l.size();
    }
}

package com.google.crypto.tink.shaded.protobuf;

import java.util.ListIterator;

/* JADX INFO: loaded from: classes.dex */
public final class h0 implements ListIterator {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final ListIterator f5204l;

    public h0(j0 j0Var, int i) {
        this.f5204l = j0Var.f5215l.listIterator(i);
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.f5204l.hasNext();
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f5204l.hasPrevious();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        return (String) this.f5204l.next();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f5204l.nextIndex();
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        return (String) this.f5204l.previous();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f5204l.previousIndex();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        throw new UnsupportedOperationException();
    }
}

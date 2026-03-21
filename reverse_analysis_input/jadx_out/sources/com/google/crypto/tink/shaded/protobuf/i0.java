package com.google.crypto.tink.shaded.protobuf;

import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class i0 implements Iterator {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Iterator f5208l;

    public i0(j0 j0Var) {
        this.f5208l = j0Var.f5215l.iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f5208l.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        return (String) this.f5208l.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}

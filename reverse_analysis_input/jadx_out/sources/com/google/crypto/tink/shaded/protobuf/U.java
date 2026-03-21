package com.google.crypto.tink.shaded.protobuf;

import androidx.datastore.preferences.protobuf.C0219k;
import b3.AbstractC0307a;

/* JADX INFO: loaded from: classes.dex */
public final class U implements c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AbstractC0321a f5169a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g0 f5170b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C0336p f5171c;

    public U(g0 g0Var, C0336p c0336p, AbstractC0321a abstractC0321a) {
        this.f5170b = g0Var;
        c0336p.getClass();
        this.f5171c = c0336p;
        this.f5169a = abstractC0321a;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.c0
    public final boolean a(Object obj) {
        this.f5171c.getClass();
        AbstractC0307a.q(obj);
        throw null;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.c0
    public final void b(Object obj, Object obj2) {
        d0.B(this.f5170b, obj, obj2);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.c0
    public final Object c() {
        AbstractC0321a abstractC0321a = this.f5169a;
        return abstractC0321a instanceof AbstractC0342w ? ((AbstractC0342w) abstractC0321a).s() : abstractC0321a.d().c();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.c0
    public final void d(Object obj) {
        this.f5170b.getClass();
        g0.b(obj);
        this.f5171c.getClass();
        AbstractC0307a.q(obj);
        throw null;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.c0
    public final int e(AbstractC0342w abstractC0342w) {
        this.f5170b.getClass();
        f0 f0Var = abstractC0342w.unknownFields;
        int i = f0Var.f5199d;
        if (i != -1) {
            return i;
        }
        int iT = 0;
        for (int i5 = 0; i5 < f0Var.f5196a; i5++) {
            int i6 = f0Var.f5197b[i5] >>> 3;
            iT += C0332l.T(3, (AbstractC0329i) f0Var.f5198c[i5]) + C0332l.l0(2, i6) + (C0332l.k0(1) * 2);
        }
        f0Var.f5199d = iT;
        return iT;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.c0
    public final boolean f(AbstractC0342w abstractC0342w, Object obj) {
        this.f5170b.getClass();
        return abstractC0342w.unknownFields.equals(((AbstractC0342w) obj).unknownFields);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.c0
    public final void g(Object obj, byte[] bArr, int i, int i5, C0324d c0324d) {
        AbstractC0342w abstractC0342w = (AbstractC0342w) obj;
        if (abstractC0342w.unknownFields == f0.f5195f) {
            abstractC0342w.unknownFields = f0.c();
        }
        obj.getClass();
        throw new ClassCastException();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.c0
    public final void h(Object obj, L l3) {
        this.f5171c.getClass();
        AbstractC0307a.q(obj);
        throw null;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.c0
    public final int i(AbstractC0342w abstractC0342w) {
        this.f5170b.getClass();
        return abstractC0342w.unknownFields.hashCode();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.c0
    public final void j(Object obj, C0219k c0219k, C0335o c0335o) {
        this.f5170b.getClass();
        g0.a(obj);
        this.f5171c.getClass();
        obj.getClass();
        throw new ClassCastException();
    }
}

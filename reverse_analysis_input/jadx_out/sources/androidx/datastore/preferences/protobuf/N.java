package androidx.datastore.preferences.protobuf;

import b3.AbstractC0307a;

/* JADX INFO: loaded from: classes.dex */
public final class N implements V {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AbstractC0229v f4094a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d0 f4095b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C0223o f4096c;

    public N(d0 d0Var, C0223o c0223o, AbstractC0229v abstractC0229v) {
        this.f4095b = d0Var;
        c0223o.getClass();
        this.f4096c = c0223o;
        this.f4094a = abstractC0229v;
    }

    @Override // androidx.datastore.preferences.protobuf.V
    public final boolean a(Object obj) {
        this.f4096c.getClass();
        AbstractC0307a.q(obj);
        throw null;
    }

    @Override // androidx.datastore.preferences.protobuf.V
    public final void b(Object obj, Object obj2) {
        W.A(this.f4095b, obj, obj2);
    }

    @Override // androidx.datastore.preferences.protobuf.V
    public final AbstractC0229v c() {
        AbstractC0229v abstractC0229v = this.f4094a;
        return abstractC0229v != null ? abstractC0229v.k() : ((AbstractC0227t) abstractC0229v.e(5)).b();
    }

    @Override // androidx.datastore.preferences.protobuf.V
    public final void d(Object obj) {
        this.f4095b.getClass();
        d0.b(obj);
        this.f4096c.getClass();
        AbstractC0307a.q(obj);
        throw null;
    }

    @Override // androidx.datastore.preferences.protobuf.V
    public final void e(Object obj, C0219k c0219k, C0222n c0222n) {
        this.f4095b.getClass();
        d0.a(obj);
        this.f4096c.getClass();
        obj.getClass();
        throw new ClassCastException();
    }

    @Override // androidx.datastore.preferences.protobuf.V
    public final void f(Object obj, E e5) {
        this.f4096c.getClass();
        AbstractC0307a.q(obj);
        throw null;
    }

    @Override // androidx.datastore.preferences.protobuf.V
    public final int g(AbstractC0229v abstractC0229v) {
        this.f4095b.getClass();
        return abstractC0229v.unknownFields.hashCode();
    }

    @Override // androidx.datastore.preferences.protobuf.V
    public final int h(AbstractC0229v abstractC0229v) {
        this.f4095b.getClass();
        c0 c0Var = abstractC0229v.unknownFields;
        int i = c0Var.f4134d;
        if (i != -1) {
            return i;
        }
        int iY = 0;
        for (int i5 = 0; i5 < c0Var.f4131a; i5++) {
            int i6 = c0Var.f4132b[i5] >>> 3;
            iY += C0220l.Y(3, (C0215g) c0Var.f4133c[i5]) + C0220l.o0(2, i6) + (C0220l.n0(1) * 2);
        }
        c0Var.f4134d = iY;
        return iY;
    }

    @Override // androidx.datastore.preferences.protobuf.V
    public final boolean i(AbstractC0229v abstractC0229v, Object obj) {
        this.f4095b.getClass();
        return abstractC0229v.unknownFields.equals(((AbstractC0229v) obj).unknownFields);
    }
}

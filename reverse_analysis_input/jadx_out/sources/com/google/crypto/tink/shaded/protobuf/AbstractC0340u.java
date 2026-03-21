package com.google.crypto.tink.shaded.protobuf;

/* JADX INFO: renamed from: com.google.crypto.tink.shaded.protobuf.u, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0340u implements Q, Cloneable {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final AbstractC0342w f5251l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public AbstractC0342w f5252m;

    public AbstractC0340u(AbstractC0342w abstractC0342w) {
        this.f5251l = abstractC0342w;
        if (abstractC0342w.p()) {
            throw new IllegalArgumentException("Default instance must be immutable.");
        }
        this.f5252m = abstractC0342w.s();
    }

    public static void f(Object obj, Object obj2) {
        Z z4 = Z.f5174c;
        z4.getClass();
        z4.a(obj.getClass()).b(obj, obj2);
    }

    public final AbstractC0342w b() {
        AbstractC0342w abstractC0342wC = c();
        abstractC0342wC.getClass();
        if (AbstractC0342w.o(abstractC0342wC, true)) {
            return abstractC0342wC;
        }
        throw new e0();
    }

    public final AbstractC0342w c() {
        if (!this.f5252m.p()) {
            return this.f5252m;
        }
        AbstractC0342w abstractC0342w = this.f5252m;
        abstractC0342w.getClass();
        Z z4 = Z.f5174c;
        z4.getClass();
        z4.a(abstractC0342w.getClass()).d(abstractC0342w);
        abstractC0342w.q();
        return this.f5252m;
    }

    public final AbstractC0340u d() {
        AbstractC0340u abstractC0340uD = this.f5251l.d();
        abstractC0340uD.f5252m = c();
        return abstractC0340uD;
    }

    public final void e() {
        if (this.f5252m.p()) {
            return;
        }
        AbstractC0342w abstractC0342wS = this.f5251l.s();
        f(abstractC0342wS, this.f5252m);
        this.f5252m = abstractC0342wS;
    }
}

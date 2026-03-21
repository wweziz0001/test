package androidx.datastore.preferences.protobuf;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.t, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0227t implements Cloneable {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final AbstractC0229v f4215l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public AbstractC0229v f4216m;

    public AbstractC0227t(AbstractC0229v abstractC0229v) {
        this.f4215l = abstractC0229v;
        if (abstractC0229v.i()) {
            throw new IllegalArgumentException("Default instance must be immutable.");
        }
        this.f4216m = abstractC0229v.k();
    }

    public final AbstractC0229v a() {
        AbstractC0229v abstractC0229vB = b();
        abstractC0229vB.getClass();
        if (AbstractC0229v.h(abstractC0229vB, true)) {
            return abstractC0229vB;
        }
        throw new b0();
    }

    public final AbstractC0229v b() {
        if (!this.f4216m.i()) {
            return this.f4216m;
        }
        AbstractC0229v abstractC0229v = this.f4216m;
        abstractC0229v.getClass();
        S s4 = S.f4099c;
        s4.getClass();
        s4.a(abstractC0229v.getClass()).d(abstractC0229v);
        abstractC0229v.j();
        return this.f4216m;
    }

    public final void c() {
        if (this.f4216m.i()) {
            return;
        }
        AbstractC0229v abstractC0229vK = this.f4215l.k();
        AbstractC0229v abstractC0229v = this.f4216m;
        S s4 = S.f4099c;
        s4.getClass();
        s4.a(abstractC0229vK.getClass()).b(abstractC0229vK, abstractC0229v);
        this.f4216m = abstractC0229vK;
    }

    public final Object clone() {
        AbstractC0227t abstractC0227t = (AbstractC0227t) this.f4215l.e(5);
        abstractC0227t.f4216m = b();
        return abstractC0227t;
    }
}

package a4;

import V3.A;
import V3.AbstractC0141s;
import V3.AbstractC0144v;
import V3.C0137n;
import V3.C0138o;
import V3.H;
import V3.h0;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: loaded from: classes.dex */
public final class h extends A implements G3.c, E3.d {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f3596s = AtomicReferenceFieldUpdater.newUpdater(h.class, Object.class, "_reusableCancellableContinuation");
    private volatile Object _reusableCancellableContinuation;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final AbstractC0141s f3597o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final G3.b f3598p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public Object f3599q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final Object f3600r;

    public h(AbstractC0141s abstractC0141s, G3.b bVar) {
        super(-1);
        this.f3597o = abstractC0141s;
        this.f3598p = bVar;
        this.f3599q = a.f3585c;
        this.f3600r = a.l(bVar.getContext());
    }

    @Override // V3.A
    public final void b(Object obj, CancellationException cancellationException) {
        if (obj instanceof C0138o) {
            ((C0138o) obj).f2435b.c(cancellationException);
        }
    }

    @Override // G3.c
    public final G3.c f() {
        G3.b bVar = this.f3598p;
        if (bVar != null) {
            return bVar;
        }
        return null;
    }

    @Override // E3.d
    public final E3.i getContext() {
        return this.f3598p.getContext();
    }

    @Override // E3.d
    public final void j(Object obj) {
        G3.b bVar = this.f3598p;
        E3.i context = bVar.getContext();
        Throwable thA = B3.d.a(obj);
        Object c0137n = thA == null ? obj : new C0137n(thA, false);
        AbstractC0141s abstractC0141s = this.f3597o;
        if (abstractC0141s.q()) {
            this.f3599q = c0137n;
            this.f2371n = 0;
            abstractC0141s.n(context, this);
            return;
        }
        H hA = h0.a();
        if (hA.v()) {
            this.f3599q = c0137n;
            this.f2371n = 0;
            hA.s(this);
            return;
        }
        hA.u(true);
        try {
            E3.i context2 = bVar.getContext();
            Object objM = a.m(context2, this.f3600r);
            try {
                bVar.j(obj);
                while (hA.x()) {
                }
            } finally {
                a.g(context2, objM);
            }
        } finally {
            try {
            } finally {
            }
        }
    }

    @Override // V3.A
    public final Object k() {
        Object obj = this.f3599q;
        this.f3599q = a.f3585c;
        return obj;
    }

    public final String toString() {
        return "DispatchedContinuation[" + this.f3597o + ", " + AbstractC0144v.n(this.f3598p) + ']';
    }

    @Override // V3.A
    public final E3.d c() {
        return this;
    }
}

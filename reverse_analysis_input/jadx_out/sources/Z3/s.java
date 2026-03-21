package Z3;

import V3.AbstractC0144v;

/* JADX INFO: loaded from: classes.dex */
public final class s extends G3.b implements Y3.h {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Y3.h f3138o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final E3.i f3139p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final int f3140q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public E3.i f3141r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public E3.d f3142s;

    public s(Y3.h hVar, E3.i iVar) {
        super(p.f3134l, E3.j.f675l);
        this.f3138o = hVar;
        this.f3139p = iVar;
        this.f3140q = ((Number) iVar.k(0, r.f3137m)).intValue();
    }

    @Override // G3.b
    public final StackTraceElement b() {
        return null;
    }

    @Override // G3.b, G3.c
    public final G3.c f() {
        E3.d dVar = this.f3142s;
        if (dVar instanceof G3.c) {
            return (G3.c) dVar;
        }
        return null;
    }

    @Override // G3.b, E3.d
    public final E3.i getContext() {
        E3.i iVar = this.f3141r;
        return iVar == null ? E3.j.f675l : iVar;
    }

    @Override // Y3.h
    public final Object k(Object obj, E3.d dVar) {
        try {
            Object objN = n(dVar, obj);
            return objN == F3.a.f861l ? objN : B3.g.f275a;
        } catch (Throwable th) {
            this.f3141r = new m(dVar.getContext(), th);
            throw th;
        }
    }

    @Override // G3.b
    public final Object l(Object obj) {
        Throwable thA = B3.d.a(obj);
        if (thA != null) {
            this.f3141r = new m(getContext(), thA);
        }
        E3.d dVar = this.f3142s;
        if (dVar != null) {
            dVar.j(obj);
        }
        return F3.a.f861l;
    }

    public final Object n(E3.d dVar, Object obj) {
        E3.i context = dVar.getContext();
        AbstractC0144v.c(context);
        E3.i iVar = this.f3141r;
        if (iVar != context) {
            if (iVar instanceof m) {
                throw new IllegalStateException(U3.e.b0("\n            Flow exception transparency is violated:\n                Previous 'emit' call has thrown exception " + ((m) iVar).f3132l + ", but then emission attempt of value '" + obj + "' has been detected.\n                Emissions from 'catch' blocks are prohibited in order to avoid unspecified behaviour, 'Flow.catch' operator can be used instead.\n                For a more detailed explanation, please refer to Flow documentation.\n            ").toString());
            }
            if (((Number) context.k(0, new v(this))).intValue() != this.f3140q) {
                throw new IllegalStateException(("Flow invariant is violated:\n\t\tFlow was collected in " + this.f3139p + ",\n\t\tbut emission happened in " + context + ".\n\t\tPlease refer to 'flow' documentation or use 'flowOn' instead").toString());
            }
            this.f3141r = context;
        }
        this.f3142s = dVar;
        t tVar = u.f3144a;
        Y3.h hVar = this.f3138o;
        N3.h.c(hVar, "null cannot be cast to non-null type kotlinx.coroutines.flow.FlowCollector<kotlin.Any?>");
        tVar.getClass();
        Object objK = hVar.k(obj, this);
        if (!N3.h.a(objK, F3.a.f861l)) {
            this.f3142s = null;
        }
        return objK;
    }
}

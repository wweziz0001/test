package V3;

/* JADX INFO: renamed from: V3.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0124a extends Z implements E3.d, InterfaceC0143u {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final E3.i f2408n;

    public AbstractC0124a(E3.i iVar, boolean z4) {
        super(z4);
        I((P) iVar.l(C0142t.f2444m));
        this.f2408n = iVar.o(this);
    }

    @Override // V3.Z
    public final void H(A1.c cVar) {
        AbstractC0144v.g(this.f2408n, cVar);
    }

    @Override // V3.Z
    public final void P(Object obj) {
        if (!(obj instanceof C0137n)) {
            W(obj);
            return;
        }
        C0137n c0137n = (C0137n) obj;
        Throwable th = c0137n.f2433a;
        c0137n.getClass();
        V(th, C0137n.f2432b.get(c0137n) != 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void X(int i, AbstractC0124a abstractC0124a, M3.p pVar) {
        int iB = O.i.b(i);
        if (iB == 0) {
            Z1.f.M(pVar, abstractC0124a, this);
            return;
        }
        if (iB != 1) {
            if (iB == 2) {
                Z1.f.A(((G3.b) pVar).a(this, abstractC0124a)).j(B3.g.f275a);
                return;
            }
            if (iB != 3) {
                throw new A1.c();
            }
            try {
                E3.i iVar = this.f2408n;
                Object objM = a4.a.m(iVar, null);
                try {
                    N3.s.a(2, pVar);
                    Object objI = pVar.i(abstractC0124a, this);
                    if (objI != F3.a.f861l) {
                        j(objI);
                    }
                } finally {
                    a4.a.g(iVar, objM);
                }
            } catch (Throwable th) {
                j(i4.a.p(th));
            }
        }
    }

    @Override // E3.d
    public final E3.i getContext() {
        return this.f2408n;
    }

    @Override // V3.InterfaceC0143u
    public final E3.i i() {
        return this.f2408n;
    }

    @Override // E3.d
    public final void j(Object obj) {
        Throwable thA = B3.d.a(obj);
        if (thA != null) {
            obj = new C0137n(thA, false);
        }
        Object objM = M(obj);
        if (objM == AbstractC0144v.f2448d) {
            return;
        }
        s(objM);
    }

    @Override // V3.Z
    public final String w() {
        return getClass().getSimpleName().concat(" was cancelled");
    }

    public void W(Object obj) {
    }

    public void V(Throwable th, boolean z4) {
    }
}

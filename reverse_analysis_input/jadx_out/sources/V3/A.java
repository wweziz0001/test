package V3;

import a.AbstractC0149a;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes.dex */
public abstract class A extends c4.h {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f2371n;

    public A(int i) {
        super(0L, c4.k.f5104g);
        this.f2371n = i;
    }

    public abstract void b(Object obj, CancellationException cancellationException);

    public abstract E3.d c();

    public Throwable d(Object obj) {
        C0137n c0137n = obj instanceof C0137n ? (C0137n) obj : null;
        if (c0137n != null) {
            return c0137n.f2433a;
        }
        return null;
    }

    public final void i(Throwable th, Throwable th2) {
        if (th == null && th2 == null) {
            return;
        }
        if (th != null && th2 != null) {
            AbstractC0149a.c(th, th2);
        }
        if (th == null) {
            th = th2;
        }
        N3.h.b(th);
        AbstractC0144v.g(c().getContext(), new L3.a("Fatal exception in coroutines machinery for " + this + ". Please read KDoc to 'handleFatalException' method and report this incident to maintainers", th));
    }

    public abstract Object k();

    @Override // java.lang.Runnable
    public final void run() {
        Object objP = B3.g.f275a;
        c4.i iVar = this.f5095m;
        try {
            E3.d dVarC = c();
            N3.h.c(dVarC, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<T of kotlinx.coroutines.DispatchedTask>");
            a4.h hVar = (a4.h) dVarC;
            G3.b bVar = hVar.f3598p;
            Object obj = hVar.f3600r;
            E3.i context = bVar.getContext();
            Object objM = a4.a.m(context, obj);
            j0 j0VarP = objM != a4.a.f3588f ? AbstractC0144v.p(bVar, context, objM) : null;
            try {
                E3.i context2 = bVar.getContext();
                Object objK = k();
                Throwable thD = d(objK);
                P p4 = (thD == null && AbstractC0144v.i(this.f2371n)) ? (P) context2.l(C0142t.f2444m) : null;
                if (p4 != null && !p4.a()) {
                    CancellationException cancellationExceptionB = ((Z) p4).B();
                    b(objK, cancellationExceptionB);
                    bVar.j(i4.a.p(cancellationExceptionB));
                } else if (thD != null) {
                    bVar.j(i4.a.p(thD));
                } else {
                    bVar.j(e(objK));
                }
                if (j0VarP == null || j0VarP.Y()) {
                    a4.a.g(context, objM);
                }
                try {
                    iVar.getClass();
                } catch (Throwable th) {
                    objP = i4.a.p(th);
                }
                i(null, B3.d.a(objP));
            } catch (Throwable th2) {
                if (j0VarP == null || j0VarP.Y()) {
                    a4.a.g(context, objM);
                }
                throw th2;
            }
        } catch (Throwable th3) {
            try {
                iVar.getClass();
            } catch (Throwable th4) {
                objP = i4.a.p(th4);
            }
            i(th3, B3.d.a(objP));
        }
    }

    public Object e(Object obj) {
        return obj;
    }
}

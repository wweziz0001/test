package b2;

import q2.InterfaceFutureC0744b;

/* JADX INFO: loaded from: classes.dex */
public final class k extends i {
    public final boolean j(Object obj) {
        if (obj == null) {
            obj = i.f4902g;
        }
        if (!i.f4901f.h(this, null, obj)) {
            return false;
        }
        i.c(this);
        return true;
    }

    public final boolean k(Throwable th) {
        if (!i.f4901f.h(this, null, new c(th))) {
            return false;
        }
        i.c(this);
        return true;
    }

    public final boolean l(InterfaceFutureC0744b interfaceFutureC0744b) {
        c cVar;
        interfaceFutureC0744b.getClass();
        Object obj = this.f4903a;
        if (obj == null) {
            if (interfaceFutureC0744b.isDone()) {
                if (!i.f4901f.h(this, null, i.f(interfaceFutureC0744b))) {
                    return false;
                }
                i.c(this);
            } else {
                f fVar = new f(this, interfaceFutureC0744b);
                if (i.f4901f.h(this, null, fVar)) {
                    try {
                        interfaceFutureC0744b.a(fVar, j.f4906l);
                    } catch (Throwable th) {
                        try {
                            cVar = new c(th);
                        } catch (Throwable unused) {
                            cVar = c.f4883b;
                        }
                        i.f4901f.h(this, fVar, cVar);
                    }
                } else {
                    obj = this.f4903a;
                }
            }
            return true;
        }
        if (!(obj instanceof C0305a)) {
            return false;
        }
        interfaceFutureC0744b.cancel(((C0305a) obj).f4880a);
        return false;
    }
}

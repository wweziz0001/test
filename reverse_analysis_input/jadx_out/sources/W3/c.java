package W3;

import E3.i;
import N3.h;
import V3.AbstractC0141s;
import V3.B;
import V3.C0142t;
import V3.InterfaceC0147y;
import V3.P;
import a4.o;
import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.CancellationException;
import m.B0;

/* JADX INFO: loaded from: classes.dex */
public final class c extends AbstractC0141s implements InterfaceC0147y {
    private volatile c _immediate;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Handler f2479n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final String f2480o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final boolean f2481p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final c f2482q;

    public c(Handler handler, String str, boolean z4) {
        this.f2479n = handler;
        this.f2480o = str;
        this.f2481p = z4;
        this._immediate = z4 ? this : null;
        c cVar = this._immediate;
        if (cVar == null) {
            cVar = new c(handler, str, true);
            this._immediate = cVar;
        }
        this.f2482q = cVar;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof c) && ((c) obj).f2479n == this.f2479n;
    }

    public final int hashCode() {
        return System.identityHashCode(this.f2479n);
    }

    @Override // V3.AbstractC0141s
    public final void n(i iVar, Runnable runnable) {
        if (this.f2479n.post(runnable)) {
            return;
        }
        CancellationException cancellationException = new CancellationException("The task was rejected, the handler underlying the dispatcher '" + this + "' was closed");
        P p4 = (P) iVar.l(C0142t.f2444m);
        if (p4 != null) {
            p4.b(cancellationException);
        }
        B.f2373b.n(iVar, runnable);
    }

    @Override // V3.AbstractC0141s
    public final boolean q() {
        return (this.f2481p && h.a(Looper.myLooper(), this.f2479n.getLooper())) ? false : true;
    }

    @Override // V3.AbstractC0141s
    public final String toString() {
        c cVar;
        String str;
        c4.d dVar = B.f2372a;
        c cVar2 = o.f3618a;
        if (this == cVar2) {
            str = "Dispatchers.Main";
        } else {
            try {
                cVar = cVar2.f2482q;
            } catch (UnsupportedOperationException unused) {
                cVar = null;
            }
            str = this == cVar ? "Dispatchers.Main.immediate" : null;
        }
        if (str != null) {
            return str;
        }
        String string = this.f2480o;
        if (string == null) {
            string = this.f2479n.toString();
        }
        return this.f2481p ? B0.h(string, ".immediate") : string;
    }

    public c(Handler handler) {
        this(handler, null, false);
    }
}

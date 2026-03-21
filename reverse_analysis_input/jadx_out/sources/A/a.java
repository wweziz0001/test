package A;

import D.InterfaceC0011k;
import Q1.o;
import Q1.q;
import R1.u;
import V3.AbstractC0144v;
import V3.J;
import Z1.p;
import a2.v;
import a2.w;
import android.content.Context;
import android.graphics.Typeface;
import android.util.Log;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import androidx.lifecycle.E;
import androidx.work.Worker;
import b2.C0305a;
import java.util.Iterator;
import java.util.UUID;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import l.MenuC0550h;
import m.C0588f;
import m.C0594i;
import m.L0;
import m3.C0675i;

/* JADX INFO: loaded from: classes.dex */
public final class a implements Runnable {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f0l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public Object f1m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Object f2n;

    public /* synthetic */ a(Object obj, int i, Object obj2) {
        this.f0l = i;
        this.f1m = obj;
        this.f2n = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        p pVar;
        a4.i iVar;
        E e5;
        L0 l02;
        C0588f c0588f;
        switch (this.f0l) {
            case 0:
                Z0.e eVar = (Z0.e) ((C0675i) this.f1m).f8712m;
                if (eVar != null) {
                    eVar.e((Typeface) this.f2n);
                    return;
                }
                return;
            case 1:
                ((g) this.f1m).accept(this.f2n);
                return;
            case 2:
                try {
                    ((Worker) this.f2n).getClass();
                    throw new IllegalStateException("Expedited WorkRequests require a Worker to provide an implementation for \n `getForegroundInfo()`");
                } catch (Throwable th) {
                    ((b2.k) this.f1m).k(th);
                    return;
                }
            case 3:
                if (((u) this.f2n).f1937A.f4903a instanceof C0305a) {
                    return;
                }
                try {
                    ((b2.k) this.f1m).get();
                    q.d().a(u.f1936C, "Starting work for " + ((u) this.f2n).f1941n.f3048c);
                    u uVar = (u) this.f2n;
                    uVar.f1937A.l(uVar.f1942o.c());
                    return;
                } catch (Throwable th2) {
                    ((u) this.f2n).f1937A.k(th2);
                    return;
                }
            case 4:
                String str = (String) this.f1m;
                u uVar2 = (u) this.f2n;
                try {
                    try {
                        o oVar = (o) uVar2.f1937A.get();
                        if (oVar == null) {
                            q.d().b(u.f1936C, uVar2.f1941n.f3048c + " returned a null result. Treating it as a failure.");
                        } else {
                            q.d().a(u.f1936C, uVar2.f1941n.f3048c + " returned a " + oVar + ".");
                            uVar2.f1944q = oVar;
                        }
                    } catch (Throwable th3) {
                        uVar2.b();
                        throw th3;
                    }
                    break;
                } catch (InterruptedException e6) {
                    e = e6;
                    q.d().c(u.f1936C, str + " failed because it threw an exception/error", e);
                } catch (CancellationException e7) {
                    q qVarD = q.d();
                    String str2 = u.f1936C;
                    String str3 = str + " was cancelled";
                    if (qVarD.f1838a <= 4) {
                        Log.i(str2, str3, e7);
                    }
                } catch (ExecutionException e8) {
                    e = e8;
                    q.d().c(u.f1936C, str + " failed because it threw an exception/error", e);
                }
                uVar2.b();
                return;
            case 5:
                q qVarD2 = q.d();
                String str4 = S1.a.f1996e;
                StringBuilder sb = new StringBuilder("Scheduling work ");
                p pVar2 = (p) this.f1m;
                sb.append(pVar2.f3046a);
                qVarD2.a(str4, sb.toString());
                ((S1.a) this.f2n).f1997a.b(pVar2);
                return;
            case O.j.STRING_SET_FIELD_NUMBER /* 6 */:
                R1.f fVar = ((Y1.a) this.f2n).f2725l.f1915h;
                String str5 = (String) this.f1m;
                synchronized (fVar.f1886k) {
                    try {
                        u uVarC = fVar.c(str5);
                        pVar = uVarC != null ? uVarC.f1941n : null;
                    } finally {
                    }
                }
                if (pVar == null || !pVar.c()) {
                    return;
                }
                synchronized (((Y1.a) this.f2n).f2727n) {
                    ((Y1.a) this.f2n).f2730q.put(D1.b.z(pVar), pVar);
                    Y1.a aVar = (Y1.a) this.f2n;
                    ((Y1.a) this.f2n).f2731r.put(D1.b.z(pVar), V1.k.a(aVar.f2732s, pVar, (J) aVar.f2726m.f3013m, aVar));
                    break;
                }
                return;
            case O.j.DOUBLE_FIELD_NUMBER /* 7 */:
                try {
                    ((Runnable) this.f2n).run();
                    synchronized (((a2.p) this.f1m).f3557o) {
                        ((a2.p) this.f1m).a();
                        break;
                    }
                    return;
                } catch (Throwable th4) {
                    synchronized (((a2.p) this.f1m).f3557o) {
                        ((a2.p) this.f1m).a();
                        throw th4;
                    }
                }
            case O.j.BYTES_FIELD_NUMBER /* 8 */:
                if (((a2.u) this.f2n).f3566l.f4903a instanceof C0305a) {
                    return;
                }
                try {
                    Q1.h hVar = (Q1.h) ((b2.k) this.f1m).get();
                    if (hVar == null) {
                        throw new IllegalStateException("Worker was marked important (" + ((a2.u) this.f2n).f3568n.f3048c + ") but did not provide ForegroundInfo");
                    }
                    q.d().a(a2.u.f3565r, "Updating notification for " + ((a2.u) this.f2n).f3568n.f3048c);
                    a2.u uVar3 = (a2.u) this.f2n;
                    b2.k kVar = uVar3.f3566l;
                    w wVar = uVar3.f3570p;
                    Context context = uVar3.f3567m;
                    UUID uuid = uVar3.f3569o.f1833m.f4778a;
                    wVar.getClass();
                    b2.k kVar2 = new b2.k();
                    wVar.f3577a.h(new v(wVar, kVar2, uuid, hVar, context));
                    kVar.l(kVar2);
                    return;
                } catch (Throwable th5) {
                    ((a2.u) this.f2n).f3566l.k(th5);
                    return;
                }
            case 9:
                int i = 0;
                do {
                    try {
                        ((Runnable) this.f1m).run();
                    } catch (Throwable th6) {
                        AbstractC0144v.g(E3.j.f675l, th6);
                    }
                    iVar = (a4.i) this.f2n;
                    Runnable runnableR = iVar.r();
                    if (runnableR == null) {
                        return;
                    }
                    this.f1m = runnableR;
                    i++;
                    break;
                } while (i < 16);
                c4.l lVar = iVar.f3602n;
                lVar.getClass();
                lVar.n(iVar, this);
                return;
            default:
                C0594i c0594i = (C0594i) this.f2n;
                MenuC0550h menuC0550h = c0594i.f8419n;
                if (menuC0550h != null && (e5 = menuC0550h.f7739e) != null && (l02 = ((ActionMenuView) e5.f4474m).f3858E) != null) {
                    Toolbar toolbar = l02.f8290a;
                    C0594i c0594i2 = toolbar.f3988l.f3857D;
                    if (c0594i2 == null || (c0588f = c0594i2.f8412C) == null || !c0588f.b()) {
                        Iterator it = toolbar.f3978R.f352b.iterator();
                        while (it.hasNext()) {
                            ((androidx.fragment.app.E) ((InterfaceC0011k) it.next())).f4230a.t();
                        }
                    }
                }
                ActionMenuView actionMenuView = c0594i.f8423r;
                if (actionMenuView != null && actionMenuView.getWindowToken() != null) {
                    C0588f c0588f2 = (C0588f) this.f1m;
                    if (c0588f2.b()) {
                        c0594i.f8412C = c0588f2;
                    } else if (c0588f2.f7786e != null) {
                        c0588f2.d(0, 0, false, false);
                        c0594i.f8412C = c0588f2;
                    }
                }
                c0594i.f8414E = null;
                return;
        }
    }

    public /* synthetic */ a(Object obj, Object obj2, int i, boolean z4) {
        this.f0l = i;
        this.f2n = obj;
        this.f1m = obj2;
    }
}

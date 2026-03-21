package D0;

import a0.e0;
import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;
import android.view.Surface;
import d0.AbstractC0370w;
import h0.C0464o;

/* JADX INFO: loaded from: classes.dex */
public final class f implements Handler.Callback {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Handler f400l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ g f401m;

    public f(g gVar, q0.l lVar) {
        this.f401m = gVar;
        Handler handlerM = AbstractC0370w.m(this);
        this.f400l = handlerM;
        lVar.s(this, handlerM);
    }

    public final void a(long j5) {
        Surface surface;
        g gVar = this.f401m;
        if (this != gVar.f434s1 || gVar.f9335V == null) {
            return;
        }
        if (j5 == Long.MAX_VALUE) {
            gVar.f9316G0 = true;
            return;
        }
        try {
            gVar.l0(j5);
            e0 e0Var = gVar.n1;
            boolean zEquals = e0Var.equals(e0.f3333d);
            Z1.c cVar = gVar.f407P0;
            if (!zEquals && !e0Var.equals(gVar.f430o1)) {
                gVar.f430o1 = e0Var;
                cVar.m(e0Var);
            }
            gVar.f9320I0.f6166e++;
            s sVar = gVar.f410S0;
            boolean z4 = sVar.f493d != 3;
            sVar.f493d = 3;
            sVar.f499k.getClass();
            sVar.f495f = AbstractC0370w.M(SystemClock.elapsedRealtime());
            if (z4 && (surface = gVar.f418a1) != null) {
                Handler handler = (Handler) cVar.f2996l;
                if (handler != null) {
                    handler.post(new z(cVar, surface, SystemClock.elapsedRealtime()));
                }
                gVar.f420d1 = true;
            }
            gVar.S(j5);
        } catch (C0464o e5) {
            gVar.f9318H0 = e5;
        }
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (message.what != 0) {
            return false;
        }
        int i = message.arg1;
        int i5 = message.arg2;
        int i6 = AbstractC0370w.f5326a;
        a(((((long) i) & 4294967295L) << 32) | (4294967295L & ((long) i5)));
        return true;
    }
}

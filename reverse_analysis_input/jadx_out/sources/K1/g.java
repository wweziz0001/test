package K1;

import N3.q;
import android.content.Context;
import java.math.BigInteger;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ g f1247a = new g();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final B3.e f1248b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f1249c;

    static {
        q.a(h.class).b();
        f1248b = new B3.e(f.f1246m);
        f1249c = a.f1228a;
    }

    public static b a(Context context) {
        N3.h.e(context, "context");
        L1.a aVar = (L1.a) f1248b.a();
        if (aVar == null) {
            N1.l lVar = N1.l.f1597c;
            if (N1.l.f1597c == null) {
                ReentrantLock reentrantLock = N1.l.f1598d;
                reentrantLock.lock();
                try {
                    if (N1.l.f1597c == null) {
                        N1.j jVar = null;
                        try {
                            H1.i iVarC = N1.h.c();
                            if (iVarC != null) {
                                H1.i iVar = H1.i.f975q;
                                N3.h.e(iVar, "other");
                                Object objA = iVarC.f980p.a();
                                N3.h.d(objA, "<get-bigInteger>(...)");
                                Object objA2 = iVar.f980p.a();
                                N3.h.d(objA2, "<get-bigInteger>(...)");
                                if (((BigInteger) objA).compareTo((BigInteger) objA2) >= 0) {
                                    N1.j jVar2 = new N1.j(context);
                                    if (jVar2.i()) {
                                        jVar = jVar2;
                                    }
                                }
                            }
                        } catch (Throwable unused) {
                        }
                        N1.l.f1597c = new N1.l(jVar);
                    }
                } finally {
                    reentrantLock.unlock();
                }
            }
            aVar = N1.l.f1597c;
            N3.h.b(aVar);
        }
        int i = o.f1264b;
        b bVar = new b(aVar);
        f1249c.getClass();
        return bVar;
    }
}

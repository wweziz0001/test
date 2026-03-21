package y2;

import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final g f10942b = new g();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AtomicReference f10943a = new AtomicReference(new m(new Z1.l(22)));

    public final Class a(Class cls) {
        HashMap map = ((m) this.f10943a.get()).f10953b;
        if (map.containsKey(cls)) {
            return ((r2.m) map.get(cls)).a();
        }
        throw new GeneralSecurityException("No input primitive class for " + cls + " available");
    }

    public final synchronized void b(k kVar) {
        Z1.l lVar = new Z1.l((m) this.f10943a.get());
        lVar.b0(kVar);
        this.f10943a.set(new m(lVar));
    }
}

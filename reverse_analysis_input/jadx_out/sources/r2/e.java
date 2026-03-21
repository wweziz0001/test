package r2;

import java.security.GeneralSecurityException;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.logging.Logger;
import m.B0;

/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Logger f9525b = Logger.getLogger(e.class.getName());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConcurrentHashMap f9526a;

    public e(e eVar) {
        this.f9526a = new ConcurrentHashMap(eVar.f9526a);
    }

    public final synchronized d a(String str) {
        if (!this.f9526a.containsKey(str)) {
            throw new GeneralSecurityException("No key manager found for key type " + str);
        }
        return (d) this.f9526a.get(str);
    }

    public final synchronized void b(s1.l lVar) {
        int iD = lVar.d();
        if (!(iD != 1 ? B0.f(iD) : B0.e(iD))) {
            throw new GeneralSecurityException("failed to register key manager " + lVar.getClass() + " as it is not FIPS compatible.");
        }
        c(new d(lVar));
    }

    public final synchronized void c(d dVar) {
        try {
            s1.l lVar = dVar.f9524a;
            Class cls = (Class) lVar.f9610c;
            if (!((Map) lVar.f9609b).keySet().contains(cls) && !Void.class.equals(cls)) {
                throw new IllegalArgumentException("Given internalKeyMananger " + lVar.toString() + " does not support primitive class " + cls.getName());
            }
            String strE = lVar.e();
            d dVar2 = (d) this.f9526a.get(strE);
            if (dVar2 != null && !dVar2.f9524a.getClass().equals(dVar.f9524a.getClass())) {
                f9525b.warning("Attempted overwrite of a registered key manager for key type ".concat(strE));
                throw new GeneralSecurityException("typeUrl (" + strE + ") is already registered with " + dVar2.f9524a.getClass().getName() + ", cannot be re-registered with " + dVar.f9524a.getClass().getName());
            }
            this.f9526a.putIfAbsent(strE, dVar);
        } catch (Throwable th) {
            throw th;
        }
    }

    public e() {
        this.f9526a = new ConcurrentHashMap();
    }
}

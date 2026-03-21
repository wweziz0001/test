package z2;

import Z1.s;
import java.security.GeneralSecurityException;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class i implements r2.m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final i f11172a = new i();

    @Override // r2.m
    public final Class a() {
        return g.class;
    }

    @Override // r2.m
    public final Object b(s sVar) throws GeneralSecurityException {
        if (((r2.k) sVar.f3086n) == null) {
            throw new GeneralSecurityException("no primary in primitive set");
        }
        Iterator it = ((ConcurrentHashMap) sVar.f3085m).values().iterator();
        while (it.hasNext()) {
            Iterator it2 = ((List) it.next()).iterator();
            while (it2.hasNext()) {
            }
        }
        return new h();
    }

    @Override // r2.m
    public final Class c() {
        return g.class;
    }
}

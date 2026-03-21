package z2;

import Z1.s;
import java.security.GeneralSecurityException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes.dex */
public final class p implements r2.m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Logger f11186a = Logger.getLogger(p.class.getName());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final byte[] f11187b = {0};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final p f11188c = new p();

    @Override // r2.m
    public final Class a() {
        return r2.j.class;
    }

    @Override // r2.m
    public final Object b(s sVar) throws GeneralSecurityException {
        Iterator it = ((ConcurrentHashMap) sVar.f3085m).values().iterator();
        while (it.hasNext()) {
            for (r2.k kVar : (List) it.next()) {
                r2.b bVar = kVar.f9542h;
                if (bVar instanceof n) {
                    n nVar = (n) bVar;
                    byte[] bArr = kVar.f9537c;
                    F2.a aVarA = F2.a.a(bArr == null ? null : Arrays.copyOf(bArr, bArr.length));
                    if (!aVarA.equals(nVar.b())) {
                        throw new GeneralSecurityException("Mac Key with parameters " + nVar.c() + " has wrong output prefix (" + nVar.b() + ") instead of (" + aVarA + ")");
                    }
                }
            }
        }
        return new o(sVar);
    }

    @Override // r2.m
    public final Class c() {
        return r2.j.class;
    }
}

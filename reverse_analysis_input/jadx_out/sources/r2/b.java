package r2;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final byte[] f9523a = new byte[0];

    public static g a(String str) throws GeneralSecurityException {
        Map mapUnmodifiableMap;
        AtomicReference atomicReference = n.f9544a;
        synchronized (n.class) {
            mapUnmodifiableMap = Collections.unmodifiableMap(n.f9547d);
        }
        g gVar = (g) mapUnmodifiableMap.get(str);
        if (gVar != null) {
            return gVar;
        }
        throw new GeneralSecurityException("cannot find key template: ".concat(str));
    }
}

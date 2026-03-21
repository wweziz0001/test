package r2;

import b3.AbstractC0307a;
import java.security.GeneralSecurityException;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes.dex */
public abstract class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final CopyOnWriteArrayList f9534a = new CopyOnWriteArrayList();

    public static x2.c a(String str) throws GeneralSecurityException {
        boolean zStartsWith;
        for (x2.c cVar : f9534a) {
            synchronized (cVar) {
                zStartsWith = str.toLowerCase(Locale.US).startsWith("android-keystore://");
            }
            if (zStartsWith) {
                return cVar;
            }
        }
        throw new GeneralSecurityException(AbstractC0307a.j("No KMS client does support: ", str));
    }
}

package E2;

import d0.C0362o;
import java.security.GeneralSecurityException;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes.dex */
public final class l extends ThreadLocal {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C0362o f666a;

    public l(C0362o c0362o) {
        this.f666a = c0362o;
    }

    @Override // java.lang.ThreadLocal
    public final Object initialValue() {
        C0362o c0362o = this.f666a;
        try {
            j jVar = j.f664c;
            Mac mac = (Mac) jVar.f665a.a((String) c0362o.f5308n);
            mac.init((SecretKeySpec) c0362o.f5309o);
            return mac;
        } catch (GeneralSecurityException e5) {
            throw new IllegalStateException(e5);
        }
    }
}

package E2;

import java.security.GeneralSecurityException;
import java.security.Provider;
import java.security.Security;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f661a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final A0.b f662b;

    public /* synthetic */ i(A0.b bVar, int i) {
        this.f661a = i;
        this.f662b = bVar;
    }

    public final Object a(String str) throws GeneralSecurityException {
        switch (this.f661a) {
            case 0:
                String[] strArr = {"GmsCore_OpenSSL", "AndroidOpenSSL"};
                ArrayList arrayList = new ArrayList();
                for (int i = 0; i < 2; i++) {
                    Provider provider = Security.getProvider(strArr[i]);
                    if (provider != null) {
                        arrayList.add(provider);
                    }
                }
                Iterator it = arrayList.iterator();
                Exception exc = null;
                while (true) {
                    boolean zHasNext = it.hasNext();
                    A0.b bVar = this.f662b;
                    if (!zHasNext) {
                        return bVar.n(str, null);
                    }
                    try {
                        return bVar.n(str, (Provider) it.next());
                    } catch (Exception e5) {
                        if (exc == null) {
                            exc = e5;
                        }
                    }
                }
                break;
            case 1:
                return this.f662b.n(str, null);
            default:
                String[] strArr2 = {"GmsCore_OpenSSL", "AndroidOpenSSL", "Conscrypt"};
                ArrayList arrayList2 = new ArrayList();
                for (int i5 = 0; i5 < 3; i5++) {
                    Provider provider2 = Security.getProvider(strArr2[i5]);
                    if (provider2 != null) {
                        arrayList2.add(provider2);
                    }
                }
                Iterator it2 = arrayList2.iterator();
                Exception exc2 = null;
                while (it2.hasNext()) {
                    try {
                        return this.f662b.n(str, (Provider) it2.next());
                    } catch (Exception e6) {
                        if (exc2 == null) {
                            exc2 = e6;
                        }
                    }
                }
                throw new GeneralSecurityException("No good Provider found.", exc2);
        }
    }
}

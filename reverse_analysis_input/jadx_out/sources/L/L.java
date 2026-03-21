package L;

import V3.C0137n;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes.dex */
public final class L extends N3.i implements M3.p {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final L f1316m = new L(2);

    @Override // M3.p
    public final Object i(Object obj, Object obj2) {
        S s4 = (S) obj;
        Throwable cancellationException = (Throwable) obj2;
        N3.h.e(s4, "msg");
        if (cancellationException == null) {
            cancellationException = new CancellationException("DataStore scope was cancelled before updateData could complete");
        }
        s4.f1345b.L(new C0137n(cancellationException, false));
        return B3.g.f275a;
    }
}

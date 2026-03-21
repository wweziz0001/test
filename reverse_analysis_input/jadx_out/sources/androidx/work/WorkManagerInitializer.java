package androidx.work;

import A1.b;
import Q1.C0118a;
import Q1.q;
import Q1.r;
import android.content.Context;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class WorkManagerInitializer implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f4776a = q.f("WrkMgrInitializer");

    @Override // A1.b
    public final List a() {
        return Collections.emptyList();
    }

    @Override // A1.b
    public final Object b(Context context) {
        q.d().a(f4776a, "Initializing WorkManager with default configuration.");
        C0118a c0118a = new C0118a(new r());
        synchronized (R1.q.f1909o) {
            try {
                R1.q qVar = R1.q.f1907m;
                if (qVar != null && R1.q.f1908n != null) {
                    throw new IllegalStateException("WorkManager is already initialized.  Did you try to initialize it manually without disabling WorkManagerInitializer? See WorkManager#initialize(Context, Configuration) or the class level Javadoc for more information.");
                }
                if (qVar == null) {
                    Context applicationContext = context.getApplicationContext();
                    if (R1.q.f1908n == null) {
                        R1.q.f1908n = D1.b.s(applicationContext, c0118a);
                    }
                    R1.q.f1907m = R1.q.f1908n;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return R1.q.E0(context);
    }
}

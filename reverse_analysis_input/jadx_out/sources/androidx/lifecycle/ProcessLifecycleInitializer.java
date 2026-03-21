package androidx.lifecycle;

import android.app.Application;
import android.content.Context;
import android.os.Handler;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class ProcessLifecycleInitializer implements A1.b {
    @Override // A1.b
    public final List a() {
        return C3.n.f291l;
    }

    @Override // A1.b
    public final Object b(Context context) {
        N3.h.e(context, "context");
        A1.a aVarC = A1.a.c(context);
        N3.h.d(aVarC, "getInstance(context)");
        if (!aVarC.f171b.contains(ProcessLifecycleInitializer.class)) {
            throw new IllegalStateException("ProcessLifecycleInitializer cannot be initialized lazily.\n               Please ensure that you have:\n               <meta-data\n                   android:name='androidx.lifecycle.ProcessLifecycleInitializer'\n                   android:value='androidx.startup' />\n               under InitializationProvider in your AndroidManifest.xml");
        }
        if (!r.f4540a.getAndSet(true)) {
            Context applicationContext = context.getApplicationContext();
            N3.h.c(applicationContext, "null cannot be cast to non-null type android.app.Application");
            ((Application) applicationContext).registerActivityLifecycleCallbacks(new C0275q());
        }
        F f2 = F.f4475t;
        f2.getClass();
        f2.f4480p = new Handler();
        f2.f4481q.e(EnumC0272n.ON_CREATE);
        Context applicationContext2 = context.getApplicationContext();
        N3.h.c(applicationContext2, "null cannot be cast to non-null type android.app.Application");
        ((Application) applicationContext2).registerActivityLifecycleCallbacks(new D(f2));
        return f2;
    }
}

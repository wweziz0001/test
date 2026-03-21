package V;

import N3.h;
import android.util.Log;
import androidx.fragment.app.r;

/* JADX INFO: loaded from: classes.dex */
public abstract class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c f2312a = c.f2311a;

    public static c a(r rVar) {
        while (rVar != null) {
            if (rVar.h()) {
                rVar.e();
            }
            rVar = rVar.f4416G;
        }
        return f2312a;
    }

    public static void b(a aVar) {
        if (Log.isLoggable("FragmentManager", 3)) {
            Log.d("FragmentManager", "StrictMode violation in ".concat(aVar.f2305l.getClass().getName()), aVar);
        }
    }

    public static final void c(r rVar, String str) {
        h.e(rVar, "fragment");
        h.e(str, "previousFragmentId");
        b(new a(rVar, "Attempting to reuse fragment " + rVar + " with previous ID " + str));
        a(rVar).getClass();
    }
}

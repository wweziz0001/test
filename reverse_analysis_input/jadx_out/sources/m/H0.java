package m;

import android.content.Context;
import android.content.ContextWrapper;

/* JADX INFO: loaded from: classes.dex */
public abstract class H0 extends ContextWrapper {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Object f8277a = null;

    public static void a(Context context) {
        if (context.getResources() instanceof J0) {
            return;
        }
        context.getResources();
        int i = X0.f8371a;
    }
}

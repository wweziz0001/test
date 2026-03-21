package X1;

import D0.y;
import android.content.Context;
import c2.ExecutorC0319a;
import java.util.LinkedHashSet;

/* JADX INFO: loaded from: classes.dex */
public abstract class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Z1.i f2614a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f2615b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f2616c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final LinkedHashSet f2617d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Object f2618e;

    public f(Context context, Z1.i iVar) {
        N3.h.e(iVar, "taskExecutor");
        this.f2614a = iVar;
        Context applicationContext = context.getApplicationContext();
        N3.h.d(applicationContext, "context.applicationContext");
        this.f2615b = applicationContext;
        this.f2616c = new Object();
        this.f2617d = new LinkedHashSet();
    }

    public abstract Object a();

    public final void b(Object obj) {
        synchronized (this.f2616c) {
            Object obj2 = this.f2618e;
            if (obj2 == null || !obj2.equals(obj)) {
                this.f2618e = obj;
                ((ExecutorC0319a) this.f2614a.f3015o).execute(new y(C3.f.X(this.f2617d), 10, this));
            }
        }
    }

    public abstract void c();

    public abstract void d();
}

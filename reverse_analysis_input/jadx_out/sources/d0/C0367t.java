package d0;

import android.os.Handler;
import java.util.ArrayList;

/* JADX INFO: renamed from: d0.t, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0367t {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final ArrayList f5320b = new ArrayList(50);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Handler f5321a;

    public C0367t(Handler handler) {
        this.f5321a = handler;
    }

    public static C0366s b() {
        C0366s c0366s;
        ArrayList arrayList = f5320b;
        synchronized (arrayList) {
            try {
                c0366s = arrayList.isEmpty() ? new C0366s() : (C0366s) arrayList.remove(arrayList.size() - 1);
            } catch (Throwable th) {
                throw th;
            }
        }
        return c0366s;
    }

    public final C0366s a(int i, Object obj) {
        C0366s c0366sB = b();
        c0366sB.f5319a = this.f5321a.obtainMessage(i, obj);
        return c0366sB;
    }

    public final boolean c(Runnable runnable) {
        return this.f5321a.post(runnable);
    }

    public final void d(int i) {
        AbstractC0360m.c(i != 0);
        this.f5321a.removeMessages(i);
    }

    public final boolean e(int i) {
        return this.f5321a.sendEmptyMessage(i);
    }
}

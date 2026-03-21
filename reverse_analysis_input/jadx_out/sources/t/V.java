package t;

import android.app.Notification;
import android.app.NotificationManager;
import android.content.Context;
import android.os.Bundle;
import java.util.HashSet;

/* JADX INFO: loaded from: classes.dex */
public final class V {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static String f9719d;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static U f9722g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f9723a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final NotificationManager f9724b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Object f9718c = new Object();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static HashSet f9720e = new HashSet();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Object f9721f = new Object();

    public V(Context context) {
        this.f9723a = context;
        this.f9724b = (NotificationManager) context.getSystemService("notification");
    }

    public final void a(String str, int i) {
        this.f9724b.cancel(str, i);
    }

    public final void b(String str, int i, Notification notification) {
        Bundle bundle = notification.extras;
        NotificationManager notificationManager = this.f9724b;
        if (bundle == null || !bundle.getBoolean("android.support.useSideChannel")) {
            notificationManager.notify(str, i, notification);
            return;
        }
        Q q4 = new Q(this.f9723a.getPackageName(), i, str, notification);
        synchronized (f9721f) {
            try {
                if (f9722g == null) {
                    f9722g = new U(this.f9723a.getApplicationContext());
                }
                f9722g.f9715m.obtainMessage(0, q4).sendToTarget();
            } catch (Throwable th) {
                throw th;
            }
        }
        notificationManager.cancel(str, i);
    }
}

package b3;

import android.R;
import android.app.NotificationManager;
import android.content.Context;
import android.os.Build;
import java.text.DateFormat;
import t.C0827p;

/* JADX INFO: renamed from: b3.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0311e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final DateFormat f4915a = DateFormat.getDateTimeInstance(3, 2);

    public static void a(Context context, int i, String str, String str2) {
        Object systemService = context.getSystemService("notification");
        N3.h.c(systemService, "null cannot be cast to non-null type android.app.NotificationManager");
        NotificationManager notificationManager = (NotificationManager) systemService;
        if (Build.VERSION.SDK_INT >= 26) {
            com.dexterous.flutterlocalnotifications.b.r();
            notificationManager.createNotificationChannel(B.a.b());
        }
        t.r rVar = new t.r(context, "WorkmanagerDebugChannelId");
        rVar.f9773e = t.r.b(str);
        rVar.f9774f = t.r.b(str2);
        C0827p c0827p = new C0827p(0);
        c0827p.f9760f = t.r.b(str2);
        rVar.e(c0827p);
        rVar.f9766F.icon = R.drawable.stat_notify_sync;
        notificationManager.notify(i, rVar.a());
    }
}

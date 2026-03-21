package t;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.os.Build;
import android.os.Bundle;
import androidx.core.graphics.drawable.IconCompat;
import com.example.hqp_mobile_app.R;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class r {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final String f9761A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public String f9762B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public long f9763C;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public final boolean f9765E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public final Notification f9766F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public boolean f9767G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public final ArrayList f9768H;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f9769a;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public CharSequence f9773e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public CharSequence f9774f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public PendingIntent f9775g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public PendingIntent f9776h;
    public IconCompat i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f9777j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f9778k;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f9780m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public Q1.D f9781n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public CharSequence f9782o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f9783p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f9784q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f9785r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public String f9786s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f9787t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f9788u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f9789v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public String f9790w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public Bundle f9791x;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f9770b = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f9771c = new ArrayList();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayList f9772d = new ArrayList();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f9779l = true;
    public int y = 0;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public int f9792z = 0;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public int f9764D = 0;

    public r(Context context, String str) {
        Notification notification = new Notification();
        this.f9766F = notification;
        this.f9769a = context;
        this.f9761A = str;
        notification.when = System.currentTimeMillis();
        notification.audioStreamType = -1;
        this.f9778k = 0;
        this.f9768H = new ArrayList();
        this.f9765E = true;
    }

    public static CharSequence b(CharSequence charSequence) {
        return (charSequence != null && charSequence.length() > 5120) ? charSequence.subSequence(0, 5120) : charSequence;
    }

    public final Notification a() {
        Notification notificationBuild;
        Bundle bundle;
        a1.j jVar = new a1.j(this);
        r rVar = (r) jVar.f3518o;
        Q1.D d5 = rVar.f9781n;
        if (d5 != null) {
            d5.b(jVar);
        }
        int i = Build.VERSION.SDK_INT;
        Notification.Builder builder = (Notification.Builder) jVar.f3517n;
        if (i >= 26) {
            notificationBuild = builder.build();
        } else {
            Notification notificationBuild2 = builder.build();
            int i5 = jVar.f3515l;
            if (i5 != 0) {
                if (AbstractC0809G.f(notificationBuild2) != null && (notificationBuild2.flags & 512) != 0 && i5 == 2) {
                    notificationBuild2.sound = null;
                    notificationBuild2.vibrate = null;
                    notificationBuild2.defaults &= -4;
                }
                if (AbstractC0809G.f(notificationBuild2) != null && (notificationBuild2.flags & 512) == 0 && i5 == 1) {
                    notificationBuild2.sound = null;
                    notificationBuild2.vibrate = null;
                    notificationBuild2.defaults &= -4;
                }
            }
            notificationBuild = notificationBuild2;
        }
        if (d5 != null) {
            rVar.f9781n.getClass();
        }
        if (d5 != null && (bundle = notificationBuild.extras) != null) {
            d5.a(bundle);
        }
        return notificationBuild;
    }

    public final void c(int i, boolean z4) {
        Notification notification = this.f9766F;
        if (z4) {
            notification.flags = i | notification.flags;
        } else {
            notification.flags = (~i) & notification.flags;
        }
    }

    public final void d(Bitmap bitmap) {
        IconCompat iconCompatF;
        if (bitmap == null) {
            iconCompatF = null;
        } else {
            if (Build.VERSION.SDK_INT < 27) {
                Resources resources = this.f9769a.getResources();
                int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.compat_notification_large_icon_max_width);
                int dimensionPixelSize2 = resources.getDimensionPixelSize(R.dimen.compat_notification_large_icon_max_height);
                if (bitmap.getWidth() > dimensionPixelSize || bitmap.getHeight() > dimensionPixelSize2) {
                    double dMin = Math.min(((double) dimensionPixelSize) / ((double) Math.max(1, bitmap.getWidth())), ((double) dimensionPixelSize2) / ((double) Math.max(1, bitmap.getHeight())));
                    bitmap = Bitmap.createScaledBitmap(bitmap, (int) Math.ceil(((double) bitmap.getWidth()) * dMin), (int) Math.ceil(((double) bitmap.getHeight()) * dMin), true);
                }
            }
            iconCompatF = IconCompat.f(bitmap);
        }
        this.i = iconCompatF;
    }

    public final void e(Q1.D d5) {
        if (this.f9781n != d5) {
            this.f9781n = d5;
            if (d5 == null || ((r) d5.f1788b) == this) {
                return;
            }
            d5.f1788b = this;
            e(d5);
        }
    }
}

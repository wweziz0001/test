package Y;

import Q1.D;
import a1.j;
import android.app.Notification;
import android.os.Build;
import android.support.v4.media.session.MediaSessionCompat$Token;

/* JADX INFO: loaded from: classes.dex */
public final class c extends D {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int[] f2679e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public MediaSessionCompat$Token f2680f;

    @Override // Q1.D
    public final void b(j jVar) {
        int i = Build.VERSION.SDK_INT;
        Notification.Builder builder = (Notification.Builder) jVar.f3517n;
        if (i >= 34) {
            a.d(builder, a.b(b.a(a.a(), null, 0, null, Boolean.FALSE), this.f2679e, this.f2680f));
        } else {
            a.d(builder, a.b(a.a(), this.f2679e, this.f2680f));
        }
    }
}

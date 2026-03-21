package android.support.v4.media;

import android.content.ComponentName;
import android.content.Context;
import android.os.Build;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;

/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final boolean f3667b = Log.isLoggable("MediaBrowserCompat", 3);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f3668a;

    public g(Context context, ComponentName componentName, d dVar) {
        if (Build.VERSION.SDK_INT >= 26) {
            this.f3668a = new f(context, componentName, dVar);
        } else {
            this.f3668a = new e(context, componentName, dVar);
        }
    }

    public final void a() {
        Messenger messenger;
        e eVar = this.f3668a;
        Z1.c cVar = eVar.f3664f;
        if (cVar != null && (messenger = eVar.f3665g) != null) {
            try {
                cVar.l(7, null, messenger);
            } catch (RemoteException unused) {
                Log.i("MediaBrowserCompat", "Remote error unregistering client messenger.");
            }
        }
        eVar.f3660b.disconnect();
    }
}

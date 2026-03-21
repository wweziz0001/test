package android.support.v4.media.session;

import android.app.Activity;
import android.content.Context;
import android.media.session.MediaController;
import android.media.session.MediaSession;
import android.os.Build;
import android.os.Handler;
import android.os.RemoteException;
import android.util.Log;
import com.example.hqp_mobile_app.R;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i f3711a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final MediaSessionCompat$Token f3712b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Set f3713c;

    public l(Context context, MediaSessionCompat$Token mediaSessionCompat$Token) {
        if (mediaSessionCompat$Token == null) {
            throw new IllegalArgumentException("sessionToken must not be null");
        }
        this.f3713c = Collections.synchronizedSet(new HashSet());
        this.f3712b = mediaSessionCompat$Token;
        if (Build.VERSION.SDK_INT >= 29) {
            this.f3711a = new j(context, mediaSessionCompat$Token);
        } else {
            this.f3711a = new i(context, mediaSessionCompat$Token);
        }
    }

    public static void b(Activity activity, l lVar) {
        activity.getWindow().getDecorView().setTag(R.id.media_controller_compat_view_tag, lVar);
        activity.setMediaController(lVar != null ? new MediaController(activity, (MediaSession.Token) lVar.f3712b.f3675m) : null);
    }

    public final void a(g gVar) {
        if (gVar == null) {
            throw new IllegalArgumentException("callback must not be null");
        }
        if (!this.f3713c.add(gVar)) {
            Log.w("MediaControllerCompat", "the callback has already been registered");
            return;
        }
        Handler handler = new Handler();
        gVar.setHandler(handler);
        i iVar = this.f3711a;
        iVar.f3706a.registerCallback(gVar.mCallbackFwk, handler);
        synchronized (iVar.f3707b) {
            if (iVar.f3710e.d() != null) {
                h hVar = new h(gVar);
                iVar.f3709d.put(gVar, hVar);
                gVar.mIControllerCallback = hVar;
                try {
                    iVar.f3710e.d().j(hVar);
                    gVar.postToHandler(13, null, null);
                } catch (RemoteException e5) {
                    Log.e("MediaControllerCompat", "Dead object in registerCallback.", e5);
                }
            } else {
                gVar.mIControllerCallback = null;
                iVar.f3708c.add(gVar);
            }
        }
    }
}

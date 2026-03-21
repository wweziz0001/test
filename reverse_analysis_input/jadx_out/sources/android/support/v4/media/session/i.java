package android.support.v4.media.session;

import android.content.Context;
import android.media.session.MediaController;
import android.media.session.MediaSession;
import android.os.RemoteException;
import android.util.Log;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MediaController f3706a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f3707b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f3708c = new ArrayList();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final HashMap f3709d = new HashMap();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final MediaSessionCompat$Token f3710e;

    public i(Context context, MediaSessionCompat$Token mediaSessionCompat$Token) {
        this.f3710e = mediaSessionCompat$Token;
        MediaController mediaController = new MediaController(context, (MediaSession.Token) mediaSessionCompat$Token.f3675m);
        this.f3706a = mediaController;
        if (mediaSessionCompat$Token.d() == null) {
            MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver mediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver = new MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver(null);
            mediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver.f3669l = new WeakReference(this);
            mediaController.sendCommand("android.support.v4.media.session.command.GET_EXTRA_BINDER", null, mediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver);
        }
    }

    public final void a() {
        MediaSessionCompat$Token mediaSessionCompat$Token = this.f3710e;
        if (mediaSessionCompat$Token.d() == null) {
            return;
        }
        ArrayList<g> arrayList = this.f3708c;
        for (g gVar : arrayList) {
            h hVar = new h(gVar);
            this.f3709d.put(gVar, hVar);
            gVar.mIControllerCallback = hVar;
            try {
                mediaSessionCompat$Token.d().j(hVar);
                gVar.postToHandler(13, null, null);
            } catch (RemoteException e5) {
                Log.e("MediaControllerCompat", "Dead object in registerCallback.", e5);
            }
        }
        arrayList.clear();
    }

    public final void b(g gVar) {
        this.f3706a.unregisterCallback(gVar.mCallbackFwk);
        synchronized (this.f3707b) {
            if (this.f3710e.d() != null) {
                try {
                    h hVar = (h) this.f3709d.remove(gVar);
                    if (hVar != null) {
                        gVar.mIControllerCallback = null;
                        this.f3710e.d().p(hVar);
                    }
                } catch (RemoteException e5) {
                    Log.e("MediaControllerCompat", "Dead object in unregisterCallback.", e5);
                }
            }
            this.f3708c.remove(gVar);
        }
    }
}

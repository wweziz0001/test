package android.support.v4.media;

import android.content.Context;
import android.media.browse.MediaBrowser;
import android.media.session.MediaSession;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Messenger;
import android.os.Process;
import android.os.RemoteException;
import android.support.v4.media.session.MediaSessionCompat$Token;
import android.support.v4.media.session.r;
import android.util.Log;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
public final class b extends MediaBrowser.ConnectionCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ d f3658a;

    public b(d dVar) {
        this.f3658a = dVar;
    }

    @Override // android.media.browse.MediaBrowser.ConnectionCallback
    public final void onConnected() {
        android.support.v4.media.session.d dVar;
        d dVar2 = this.f3658a;
        c cVar = dVar2.mConnectionCallbackInternal;
        if (cVar != null) {
            e eVar = (e) cVar;
            MediaBrowser mediaBrowser = eVar.f3660b;
            try {
                Bundle extras = mediaBrowser.getExtras();
                if (extras != null) {
                    extras.getInt("extra_service_version", 0);
                    IBinder binder = extras.getBinder("extra_messenger");
                    if (binder != null) {
                        Z1.c cVar2 = new Z1.c();
                        cVar2.f2996l = new Messenger(binder);
                        cVar2.f2997m = eVar.f3661c;
                        eVar.f3664f = cVar2;
                        a aVar = eVar.f3662d;
                        Messenger messenger = new Messenger(aVar);
                        eVar.f3665g = messenger;
                        aVar.getClass();
                        aVar.f3657b = new WeakReference(messenger);
                        try {
                            Z1.c cVar3 = eVar.f3664f;
                            Context context = eVar.f3659a;
                            Messenger messenger2 = eVar.f3665g;
                            cVar3.getClass();
                            Bundle bundle = new Bundle();
                            bundle.putString("data_package_name", context.getPackageName());
                            bundle.putInt("data_calling_pid", Process.myPid());
                            bundle.putBundle("data_root_hints", (Bundle) cVar3.f2997m);
                            cVar3.l(6, bundle, messenger2);
                        } catch (RemoteException unused) {
                            Log.i("MediaBrowserCompat", "Remote error registering client messenger.");
                        }
                    }
                    IBinder binder2 = extras.getBinder("extra_session_binder");
                    int i = r.f3716d;
                    if (binder2 == null) {
                        dVar = null;
                    } else {
                        IInterface iInterfaceQueryLocalInterface = binder2.queryLocalInterface("android.support.v4.media.session.IMediaSession");
                        if (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof android.support.v4.media.session.d)) {
                            android.support.v4.media.session.c cVar4 = new android.support.v4.media.session.c();
                            cVar4.f3701c = binder2;
                            dVar = cVar4;
                        } else {
                            dVar = (android.support.v4.media.session.d) iInterfaceQueryLocalInterface;
                        }
                    }
                    if (dVar != null) {
                        MediaSession.Token sessionToken = mediaBrowser.getSessionToken();
                        eVar.f3666h = sessionToken != null ? new MediaSessionCompat$Token(sessionToken, dVar) : null;
                    }
                }
            } catch (IllegalStateException e5) {
                Log.e("MediaBrowserCompat", "Unexpected IllegalStateException", e5);
            }
        }
        dVar2.onConnected();
    }

    @Override // android.media.browse.MediaBrowser.ConnectionCallback
    public final void onConnectionFailed() {
        d dVar = this.f3658a;
        c cVar = dVar.mConnectionCallbackInternal;
        if (cVar != null) {
            cVar.getClass();
        }
        dVar.onConnectionFailed();
    }

    @Override // android.media.browse.MediaBrowser.ConnectionCallback
    public final void onConnectionSuspended() {
        d dVar = this.f3658a;
        c cVar = dVar.mConnectionCallbackInternal;
        if (cVar != null) {
            e eVar = (e) cVar;
            eVar.f3664f = null;
            eVar.f3665g = null;
            eVar.f3666h = null;
            a aVar = eVar.f3662d;
            aVar.getClass();
            aVar.f3657b = new WeakReference(null);
        }
        dVar.onConnectionSuspended();
    }
}

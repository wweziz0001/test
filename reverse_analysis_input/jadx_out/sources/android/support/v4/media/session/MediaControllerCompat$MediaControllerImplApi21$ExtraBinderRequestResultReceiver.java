package android.support.v4.media.session;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcelable;
import android.os.ResultReceiver;
import androidx.versionedparcelable.ParcelImpl;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
class MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver extends ResultReceiver {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public WeakReference f3669l;

    @Override // android.os.ResultReceiver
    public final void onReceiveResult(int i, Bundle bundle) {
        d dVar;
        i iVar = (i) this.f3669l.get();
        if (iVar == null || bundle == null) {
            return;
        }
        synchronized (iVar.f3707b) {
            MediaSessionCompat$Token mediaSessionCompat$Token = iVar.f3710e;
            IBinder binder = bundle.getBinder("android.support.v4.media.session.EXTRA_BINDER");
            int i5 = r.f3716d;
            D1.e eVar = null;
            if (binder == null) {
                dVar = null;
            } else {
                IInterface iInterfaceQueryLocalInterface = binder.queryLocalInterface("android.support.v4.media.session.IMediaSession");
                if (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof d)) {
                    c cVar = new c();
                    cVar.f3701c = binder;
                    dVar = cVar;
                } else {
                    dVar = (d) iInterfaceQueryLocalInterface;
                }
            }
            synchronized (mediaSessionCompat$Token.f3674l) {
                mediaSessionCompat$Token.f3676n = dVar;
            }
            MediaSessionCompat$Token mediaSessionCompat$Token2 = iVar.f3710e;
            try {
                Bundle bundle2 = (Bundle) bundle.getParcelable("android.support.v4.media.session.SESSION_TOKEN2");
                if (bundle2 != null) {
                    bundle2.setClassLoader(D1.b.class.getClassLoader());
                    Parcelable parcelable = bundle2.getParcelable("a");
                    if (!(parcelable instanceof ParcelImpl)) {
                        throw new IllegalArgumentException("Invalid parcel");
                    }
                    eVar = ((ParcelImpl) parcelable).f4766l;
                }
            } catch (RuntimeException unused) {
            }
            synchronized (mediaSessionCompat$Token2.f3674l) {
                mediaSessionCompat$Token2.f3677o = eVar;
            }
            iVar.a();
        }
    }
}

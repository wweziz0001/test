package androidx.media;

import android.media.session.MediaSession;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Messenger;
import android.support.v4.media.session.MediaSessionCompat$Token;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class w implements Runnable {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f4634l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Object f4635m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Object f4636n;

    public /* synthetic */ w(Object obj, int i, Object obj2) {
        this.f4634l = i;
        this.f4636n = obj;
        this.f4635m = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f4634l) {
            case 0:
                k kVar = (k) ((y) this.f4636n).f4643a.mConnections.remove(((Messenger) ((C0284a) this.f4635m).f4576a).getBinder());
                if (kVar != null) {
                    ((Messenger) kVar.f4600f.f4576a).getBinder().unlinkToDeath(kVar, 0);
                }
                break;
            case 1:
                IBinder binder = ((Messenger) ((C0284a) this.f4635m).f4576a).getBinder();
                k kVar2 = (k) ((y) this.f4636n).f4643a.mConnections.remove(binder);
                if (kVar2 != null) {
                    binder.unlinkToDeath(kVar2, 0);
                }
                break;
            default:
                q qVar = (q) this.f4636n;
                ArrayList arrayList = qVar.f4615a;
                boolean zIsEmpty = arrayList.isEmpty();
                MediaSessionCompat$Token mediaSessionCompat$Token = (MediaSessionCompat$Token) this.f4635m;
                if (!zIsEmpty) {
                    android.support.v4.media.session.d dVarD = mediaSessionCompat$Token.d();
                    if (dVarD != null) {
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            ((Bundle) it.next()).putBinder("extra_session_binder", dVarD.asBinder());
                        }
                    }
                    arrayList.clear();
                }
                qVar.f4616b.setSessionToken((MediaSession.Token) mediaSessionCompat$Token.f3675m);
                break;
        }
    }
}

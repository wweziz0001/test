package androidx.media;

import android.content.Context;
import android.os.Bundle;
import android.os.Messenger;
import android.service.media.MediaBrowserService;
import android.support.v4.media.session.MediaSessionCompat$Token;

/* JADX INFO: loaded from: classes.dex */
public class p extends MediaBrowserService {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ q f4613l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ q f4614m;

    public p(q qVar, Context context) {
        this.f4614m = qVar;
        this.f4613l = qVar;
        attachBaseContext(context);
    }

    @Override // android.service.media.MediaBrowserService
    public final MediaBrowserService.BrowserRoot onGetRoot(String str, int i, Bundle bundle) {
        Bundle bundle2;
        int i5;
        C0292i c0292i;
        android.support.v4.media.session.y.a(bundle);
        Bundle bundle3 = bundle == null ? null : new Bundle(bundle);
        q qVar = this.f4613l;
        A a5 = qVar.f4618d;
        if (bundle3 == null || bundle3.getInt("extra_client_version", 0) == 0) {
            bundle2 = null;
            i5 = -1;
        } else {
            bundle3.remove("extra_client_version");
            qVar.f4617c = new Messenger(a5.mHandler);
            Bundle bundle4 = new Bundle();
            bundle4.putInt("extra_service_version", 2);
            bundle4.putBinder("extra_messenger", qVar.f4617c.getBinder());
            MediaSessionCompat$Token mediaSessionCompat$Token = a5.mSession;
            if (mediaSessionCompat$Token != null) {
                android.support.v4.media.session.d dVarD = mediaSessionCompat$Token.d();
                bundle4.putBinder("extra_session_binder", dVarD == null ? null : dVarD.asBinder());
            } else {
                qVar.f4615a.add(bundle4);
            }
            int i6 = bundle3.getInt("extra_calling_pid", -1);
            bundle3.remove("extra_calling_pid");
            i5 = i6;
            bundle2 = bundle4;
        }
        k kVar = new k(qVar.f4618d, str, i5, i, bundle3, null);
        a5.mCurConnection = kVar;
        C0292i c0292iOnGetRoot = a5.onGetRoot(str, i, bundle3);
        a5.mCurConnection = null;
        if (c0292iOnGetRoot == null) {
            c0292i = null;
        } else {
            if (qVar.f4617c != null) {
                a5.mPendingConnections.add(kVar);
            }
            Bundle bundle5 = c0292iOnGetRoot.f4593b;
            if (bundle2 == null) {
                bundle2 = bundle5;
            } else if (bundle5 != null) {
                bundle2.putAll(bundle5);
            }
            c0292i = new C0292i(c0292iOnGetRoot.f4592a, bundle2);
        }
        if (c0292i == null) {
            return null;
        }
        return new MediaBrowserService.BrowserRoot(c0292i.f4592a, c0292i.f4593b);
    }

    @Override // android.service.media.MediaBrowserService
    public final void onLoadChildren(String str, MediaBrowserService.Result result) {
        C0284a c0284a = new C0284a(result);
        q qVar = this.f4613l;
        qVar.getClass();
        m mVar = new m(str, c0284a, 0);
        A a5 = qVar.f4618d;
        a5.mCurConnection = a5.mConnectionFromFwk;
        a5.onLoadChildren(str, mVar);
        a5.mCurConnection = null;
    }

    @Override // android.service.media.MediaBrowserService
    public final void onLoadItem(String str, MediaBrowserService.Result result) {
        C0284a c0284a = new C0284a(result);
        q qVar = this.f4614m;
        qVar.getClass();
        m mVar = new m(str, c0284a, 1);
        A a5 = qVar.f4619e;
        a5.mCurConnection = a5.mConnectionFromFwk;
        a5.onLoadItem(str, mVar);
        a5.mCurConnection = null;
    }
}

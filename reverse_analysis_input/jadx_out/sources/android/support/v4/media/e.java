package android.support.v4.media;

import android.content.ComponentName;
import android.content.Context;
import android.media.browse.MediaBrowser;
import android.os.Bundle;
import android.os.Messenger;
import android.os.Process;
import android.support.v4.media.session.MediaSessionCompat$Token;
import q.C0735e;

/* JADX INFO: loaded from: classes.dex */
public class e implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f3659a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final MediaBrowser f3660b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Bundle f3661c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final a f3662d = new a(this);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final C0735e f3663e = new C0735e();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Z1.c f3664f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Messenger f3665g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public MediaSessionCompat$Token f3666h;

    public e(Context context, ComponentName componentName, d dVar) {
        this.f3659a = context;
        Bundle bundle = new Bundle();
        this.f3661c = bundle;
        bundle.putInt("extra_client_version", 1);
        bundle.putInt("extra_calling_pid", Process.myPid());
        dVar.setInternalConnectionCallback(this);
        this.f3660b = new MediaBrowser(context, componentName, dVar.mConnectionCallbackFwk, bundle);
    }
}

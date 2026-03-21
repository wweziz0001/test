package Z;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.media.session.MediaSession;
import android.os.Build;
import android.support.v4.media.d;
import android.support.v4.media.e;
import android.support.v4.media.g;
import android.support.v4.media.session.MediaSessionCompat$Token;
import android.support.v4.media.session.i;
import android.support.v4.media.session.j;
import android.view.KeyEvent;
import java.util.Collections;
import java.util.HashSet;

/* JADX INFO: loaded from: classes.dex */
public final class b extends d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f2816a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Intent f2817b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final BroadcastReceiver.PendingResult f2818c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public g f2819d;

    public b(BroadcastReceiver.PendingResult pendingResult, Context context, Intent intent) {
        this.f2816a = context;
        this.f2817b = intent;
        this.f2818c = pendingResult;
    }

    @Override // android.support.v4.media.d
    public final void onConnected() {
        e eVar = this.f2819d.f3668a;
        if (eVar.f3666h == null) {
            MediaSession.Token sessionToken = eVar.f3660b.getSessionToken();
            eVar.f3666h = sessionToken != null ? new MediaSessionCompat$Token(sessionToken, null) : null;
        }
        MediaSessionCompat$Token mediaSessionCompat$Token = eVar.f3666h;
        if (mediaSessionCompat$Token == null) {
            throw new IllegalArgumentException("sessionToken must not be null");
        }
        Collections.synchronizedSet(new HashSet());
        int i = Build.VERSION.SDK_INT;
        Context context = this.f2816a;
        i jVar = i >= 29 ? new j(context, mediaSessionCompat$Token) : new i(context, mediaSessionCompat$Token);
        KeyEvent keyEvent = (KeyEvent) this.f2817b.getParcelableExtra("android.intent.extra.KEY_EVENT");
        if (keyEvent == null) {
            throw new IllegalArgumentException("KeyEvent may not be null");
        }
        jVar.f3706a.dispatchMediaButtonEvent(keyEvent);
        this.f2819d.a();
        this.f2818c.finish();
    }

    @Override // android.support.v4.media.d
    public final void onConnectionFailed() {
        this.f2819d.a();
        this.f2818c.finish();
    }

    @Override // android.support.v4.media.d
    public final void onConnectionSuspended() {
        this.f2819d.a();
        this.f2818c.finish();
    }
}

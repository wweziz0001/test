package android.support.v4.media.session;

import android.media.session.MediaSession;
import android.os.Handler;
import android.os.RemoteCallbackList;
import android.support.v4.media.MediaMetadataCompat;
import com.ryanheise.audioservice.AudioService;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class s implements q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MediaSession f3718a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final r f3719b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final MediaSessionCompat$Token f3720c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f3721d = new Object();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final RemoteCallbackList f3722e = new RemoteCallbackList();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public PlaybackStateCompat f3723f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public List f3724g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public MediaMetadataCompat f3725h;
    public boolean i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f3726j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f3727k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public p f3728l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public androidx.media.B f3729m;

    public s(AudioService audioService) {
        MediaSession mediaSessionE = e(audioService);
        this.f3718a = mediaSessionE;
        r rVar = new r(this);
        this.f3719b = rVar;
        this.f3720c = new MediaSessionCompat$Token(mediaSessionE.getSessionToken(), rVar);
        mediaSessionE.setFlags(3);
    }

    @Override // android.support.v4.media.session.q
    public final p a() {
        p pVar;
        synchronized (this.f3721d) {
            pVar = this.f3728l;
        }
        return pVar;
    }

    @Override // android.support.v4.media.session.q
    public final PlaybackStateCompat b() {
        return this.f3723f;
    }

    @Override // android.support.v4.media.session.q
    public androidx.media.B c() {
        androidx.media.B b4;
        synchronized (this.f3721d) {
            b4 = this.f3729m;
        }
        return b4;
    }

    @Override // android.support.v4.media.session.q
    public void d(androidx.media.B b4) {
        synchronized (this.f3721d) {
            this.f3729m = b4;
        }
    }

    public MediaSession e(AudioService audioService) {
        return new MediaSession(audioService, "media-session");
    }

    public final void f(p pVar, Handler handler) {
        synchronized (this.f3721d) {
            try {
                this.f3728l = pVar;
                this.f3718a.setCallback(pVar == null ? null : pVar.mCallbackFwk, handler);
                if (pVar != null) {
                    pVar.setSessionImpl(this, handler);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}

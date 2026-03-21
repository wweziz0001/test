package h0;

import android.media.AudioManager;
import android.os.Handler;

/* JADX INFO: renamed from: h0.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0455f implements AudioManager.OnAudioFocusChangeListener {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Handler f6120l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ C0456g f6121m;

    public C0455f(C0456g c0456g, Handler handler) {
        this.f6121m = c0456g;
        this.f6120l = handler;
    }

    @Override // android.media.AudioManager.OnAudioFocusChangeListener
    public final void onAudioFocusChange(int i) {
        this.f6120l.post(new RunnableC0454e(i, 0, this));
    }
}

package androidx.media;

import android.media.AudioManager;
import android.os.Handler;
import android.os.Message;

/* JADX INFO: renamed from: androidx.media.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0287d implements Handler.Callback, AudioManager.OnAudioFocusChangeListener {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Handler f4577l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final S2.d f4578m;

    public C0287d(S2.d dVar, Handler handler) {
        this.f4578m = dVar;
        this.f4577l = new Handler(handler.getLooper(), this);
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (message.what != 2782386) {
            return false;
        }
        this.f4578m.onAudioFocusChange(message.arg1);
        return true;
    }

    @Override // android.media.AudioManager.OnAudioFocusChangeListener
    public final void onAudioFocusChange(int i) {
        Handler handler = this.f4577l;
        handler.sendMessage(Message.obtain(handler, 2782386, i, 0));
    }
}

package androidx.media;

import android.media.AudioAttributes;
import android.media.AudioFocusRequest;
import android.media.AudioManager;
import android.os.Handler;

/* JADX INFO: renamed from: androidx.media.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0286c {
    public static AudioFocusRequest a(int i, AudioAttributes audioAttributes, boolean z4, AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener, Handler handler) {
        return new AudioFocusRequest.Builder(i).setAudioAttributes(audioAttributes).setWillPauseWhenDucked(z4).setOnAudioFocusChangeListener(onAudioFocusChangeListener, handler).build();
    }
}

package androidx.media;

import android.media.AudioFocusRequest;
import android.media.AudioManager;

/* JADX INFO: renamed from: androidx.media.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0289f {
    public static int a(AudioManager audioManager, AudioFocusRequest audioFocusRequest) {
        return audioManager.abandonAudioFocusRequest(audioFocusRequest);
    }

    public static int b(AudioManager audioManager, AudioFocusRequest audioFocusRequest) {
        return audioManager.requestAudioFocus(audioFocusRequest);
    }
}

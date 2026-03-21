package androidx.media;

import android.media.VolumeProvider;

/* JADX INFO: loaded from: classes.dex */
public abstract class H {
    public static void a(VolumeProvider volumeProvider, int i) {
        volumeProvider.setCurrentVolume(i);
    }
}

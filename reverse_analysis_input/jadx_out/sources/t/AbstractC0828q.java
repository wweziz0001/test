package t;

import android.media.AudioAttributes;

/* JADX INFO: renamed from: t.q, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0828q {
    public static AudioAttributes a(AudioAttributes.Builder builder) {
        return builder.build();
    }

    public static AudioAttributes.Builder b() {
        return new AudioAttributes.Builder();
    }

    public static AudioAttributes.Builder c(AudioAttributes.Builder builder, int i) {
        return builder.setContentType(i);
    }

    public static AudioAttributes.Builder d(AudioAttributes.Builder builder, int i) {
        return builder.setLegacyStreamType(i);
    }

    public static AudioAttributes.Builder e(AudioAttributes.Builder builder, int i) {
        return builder.setUsage(i);
    }
}

package androidx.media;

import android.media.AudioAttributes;

/* JADX INFO: loaded from: classes.dex */
public class AudioAttributesImplApi26Parcelizer {
    public static AudioAttributesImplApi26 read(D1.c cVar) {
        AudioAttributesImplApi26 audioAttributesImplApi26 = new AudioAttributesImplApi26();
        audioAttributesImplApi26.f4564a = (AudioAttributes) cVar.g(audioAttributesImplApi26.f4564a, 1);
        audioAttributesImplApi26.f4565b = cVar.f(audioAttributesImplApi26.f4565b, 2);
        return audioAttributesImplApi26;
    }

    public static void write(AudioAttributesImplApi26 audioAttributesImplApi26, D1.c cVar) {
        cVar.getClass();
        cVar.k(audioAttributesImplApi26.f4564a, 1);
        cVar.j(audioAttributesImplApi26.f4565b, 2);
    }
}

package androidx.media;

import android.media.AudioAttributes;

/* JADX INFO: loaded from: classes.dex */
public class AudioAttributesImplApi21Parcelizer {
    public static AudioAttributesImplApi21 read(D1.c cVar) {
        AudioAttributesImplApi21 audioAttributesImplApi21 = new AudioAttributesImplApi21();
        audioAttributesImplApi21.f4564a = (AudioAttributes) cVar.g(audioAttributesImplApi21.f4564a, 1);
        audioAttributesImplApi21.f4565b = cVar.f(audioAttributesImplApi21.f4565b, 2);
        return audioAttributesImplApi21;
    }

    public static void write(AudioAttributesImplApi21 audioAttributesImplApi21, D1.c cVar) {
        cVar.getClass();
        cVar.k(audioAttributesImplApi21.f4564a, 1);
        cVar.j(audioAttributesImplApi21.f4565b, 2);
    }
}

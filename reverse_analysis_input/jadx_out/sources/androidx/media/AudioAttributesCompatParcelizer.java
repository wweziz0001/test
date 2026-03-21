package androidx.media;

/* JADX INFO: loaded from: classes.dex */
public class AudioAttributesCompatParcelizer {
    public static AudioAttributesCompat read(D1.c cVar) {
        AudioAttributesCompat audioAttributesCompat = new AudioAttributesCompat();
        D1.e eVarH = audioAttributesCompat.f4563a;
        if (cVar.e(1)) {
            eVarH = cVar.h();
        }
        audioAttributesCompat.f4563a = (AudioAttributesImpl) eVarH;
        return audioAttributesCompat;
    }

    public static void write(AudioAttributesCompat audioAttributesCompat, D1.c cVar) {
        cVar.getClass();
        AudioAttributesImpl audioAttributesImpl = audioAttributesCompat.f4563a;
        cVar.i(1);
        cVar.l(audioAttributesImpl);
    }
}

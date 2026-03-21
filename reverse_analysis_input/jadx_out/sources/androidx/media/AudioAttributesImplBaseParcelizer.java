package androidx.media;

/* JADX INFO: loaded from: classes.dex */
public class AudioAttributesImplBaseParcelizer {
    public static AudioAttributesImplBase read(D1.c cVar) {
        AudioAttributesImplBase audioAttributesImplBase = new AudioAttributesImplBase();
        audioAttributesImplBase.f4566a = cVar.f(audioAttributesImplBase.f4566a, 1);
        audioAttributesImplBase.f4567b = cVar.f(audioAttributesImplBase.f4567b, 2);
        audioAttributesImplBase.f4568c = cVar.f(audioAttributesImplBase.f4568c, 3);
        audioAttributesImplBase.f4569d = cVar.f(audioAttributesImplBase.f4569d, 4);
        return audioAttributesImplBase;
    }

    public static void write(AudioAttributesImplBase audioAttributesImplBase, D1.c cVar) {
        cVar.getClass();
        cVar.j(audioAttributesImplBase.f4566a, 1);
        cVar.j(audioAttributesImplBase.f4567b, 2);
        cVar.j(audioAttributesImplBase.f4568c, 3);
        cVar.j(audioAttributesImplBase.f4569d, 4);
    }
}

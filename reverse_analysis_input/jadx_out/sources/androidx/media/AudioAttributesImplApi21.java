package androidx.media;

import android.media.AudioAttributes;

/* JADX INFO: loaded from: classes.dex */
public class AudioAttributesImplApi21 implements AudioAttributesImpl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public AudioAttributes f4564a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f4565b = -1;

    public AudioAttributesImplApi21() {
    }

    @Override // androidx.media.AudioAttributesImpl
    public final int a() {
        int i = this.f4565b;
        return i != -1 ? i : AudioAttributesCompat.c(this.f4564a.getFlags(), this.f4564a.getUsage());
    }

    @Override // androidx.media.AudioAttributesImpl
    public final Object b() {
        return this.f4564a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof AudioAttributesImplApi21) {
            return this.f4564a.equals(((AudioAttributesImplApi21) obj).f4564a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f4564a.hashCode();
    }

    public final String toString() {
        return "AudioAttributesCompat: audioattributes=" + this.f4564a;
    }

    public AudioAttributesImplApi21(AudioAttributes audioAttributes) {
        this.f4564a = audioAttributes;
    }
}

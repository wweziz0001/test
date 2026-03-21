package androidx.media;

import android.media.AudioAttributes;

/* JADX INFO: renamed from: androidx.media.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0285b extends C0284a {
    @Override // androidx.media.C0284a
    public final AudioAttributesImpl a() {
        return new AudioAttributesImplApi26(((AudioAttributes.Builder) this.f4576a).build());
    }

    @Override // androidx.media.C0284a
    public final C0284a e(int i) {
        ((AudioAttributes.Builder) this.f4576a).setUsage(i);
        return this;
    }

    @Override // androidx.media.C0284a
    public final C0284a f(int i) {
        ((AudioAttributes.Builder) this.f4576a).setUsage(i);
        return this;
    }
}

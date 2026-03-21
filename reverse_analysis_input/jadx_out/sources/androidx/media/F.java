package androidx.media;

import android.media.VolumeProvider;

/* JADX INFO: loaded from: classes.dex */
public final class F extends VolumeProvider {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ J f4574a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public F(J j5, int i, int i5, int i6, String str) {
        super(i, i5, i6, str);
        this.f4574a = j5;
    }

    @Override // android.media.VolumeProvider
    public final void onAdjustVolume(int i) {
        this.f4574a.onAdjustVolume(i);
    }

    @Override // android.media.VolumeProvider
    public final void onSetVolumeTo(int i) {
        this.f4574a.onSetVolumeTo(i);
    }
}

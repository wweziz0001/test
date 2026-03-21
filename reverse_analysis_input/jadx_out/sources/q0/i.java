package q0;

import android.media.LoudnessCodecController$OnLoudnessCodecUpdateListener;
import android.media.MediaCodec;
import android.os.Bundle;

/* JADX INFO: loaded from: classes.dex */
public final class i implements LoudnessCodecController$OnLoudnessCodecUpdateListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Z1.s f9284a;

    public i(Z1.s sVar) {
        this.f9284a = sVar;
    }

    public final Bundle onLoudnessCodecUpdate(MediaCodec mediaCodec, Bundle bundle) {
        ((j) this.f9284a.f3086n).getClass();
        return bundle;
    }
}

package android.support.v4.media.session;

import android.os.Bundle;
import android.os.IInterface;
import android.support.v4.media.MediaMetadataCompat;
import java.util.List;

/* JADX INFO: renamed from: android.support.v4.media.session.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC0208b extends IInterface {
    void N(boolean z4);

    void T(int i);

    void U(Bundle bundle);

    void V(PlaybackStateCompat playbackStateCompat);

    void c0(ParcelableVolumeInfo parcelableVolumeInfo);

    void d(List list);

    void g(CharSequence charSequence);

    void n();

    void onRepeatModeChanged(int i);

    void r(MediaMetadataCompat mediaMetadataCompat);
}

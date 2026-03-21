package android.support.v4.media;

import android.os.Bundle;
import android.os.Parcelable;
import android.support.v4.media.session.y;
import androidx.media.A;

/* JADX INFO: loaded from: classes.dex */
class MediaBrowserCompat$ItemReceiver extends c.d {
    @Override // c.d
    public final void d(int i, Bundle bundle) {
        if (bundle != null) {
            bundle = y.f(bundle);
        }
        if (i != 0 || bundle == null || !bundle.containsKey(A.KEY_MEDIA_ITEM)) {
            throw null;
        }
        Parcelable parcelable = bundle.getParcelable(A.KEY_MEDIA_ITEM);
        if (parcelable != null && !(parcelable instanceof MediaBrowserCompat$MediaItem)) {
            throw null;
        }
        throw null;
    }
}

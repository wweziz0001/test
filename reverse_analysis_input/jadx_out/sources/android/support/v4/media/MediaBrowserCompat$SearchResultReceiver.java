package android.support.v4.media;

import android.os.Bundle;
import android.os.Parcelable;
import android.support.v4.media.session.y;
import androidx.media.A;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
class MediaBrowserCompat$SearchResultReceiver extends c.d {
    @Override // c.d
    public final void d(int i, Bundle bundle) {
        if (bundle != null) {
            bundle = y.f(bundle);
        }
        if (i != 0 || bundle == null || !bundle.containsKey(A.KEY_SEARCH_RESULTS)) {
            throw null;
        }
        Parcelable[] parcelableArray = bundle.getParcelableArray(A.KEY_SEARCH_RESULTS);
        parcelableArray.getClass();
        ArrayList arrayList = new ArrayList(parcelableArray.length);
        for (Parcelable parcelable : parcelableArray) {
            arrayList.add((MediaBrowserCompat$MediaItem) parcelable);
        }
        throw null;
    }
}

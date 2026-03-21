package android.support.v4.media;

import a0.C0184j;
import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"BanParcelableUsage"})
public class MediaBrowserCompat$MediaItem implements Parcelable {
    public static final Parcelable.Creator<MediaBrowserCompat$MediaItem> CREATOR = new C0184j(3);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f3635l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final MediaDescriptionCompat f3636m;

    public MediaBrowserCompat$MediaItem(MediaDescriptionCompat mediaDescriptionCompat, int i) {
        if (mediaDescriptionCompat == null) {
            throw new IllegalArgumentException("description cannot be null");
        }
        if (TextUtils.isEmpty(mediaDescriptionCompat.f3637l)) {
            throw new IllegalArgumentException("description must have a non-empty media id");
        }
        this.f3635l = i;
        this.f3636m = mediaDescriptionCompat;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return "MediaItem{mFlags=" + this.f3635l + ", mDescription=" + this.f3636m + '}';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f3635l);
        this.f3636m.writeToParcel(parcel, i);
    }

    public MediaBrowserCompat$MediaItem(Parcel parcel) {
        this.f3635l = parcel.readInt();
        this.f3636m = MediaDescriptionCompat.CREATOR.createFromParcel(parcel);
    }
}

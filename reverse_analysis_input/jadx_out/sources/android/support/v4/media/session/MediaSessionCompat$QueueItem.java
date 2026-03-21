package android.support.v4.media.session;

import android.annotation.SuppressLint;
import android.media.session.MediaSession;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.MediaDescriptionCompat;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"BanParcelableUsage"})
public final class MediaSessionCompat$QueueItem implements Parcelable {
    public static final Parcelable.Creator<MediaSessionCompat$QueueItem> CREATOR = new x(1);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final MediaDescriptionCompat f3670l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final long f3671m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public MediaSession.QueueItem f3672n;

    public MediaSessionCompat$QueueItem(MediaSession.QueueItem queueItem, MediaDescriptionCompat mediaDescriptionCompat, long j5) {
        if (mediaDescriptionCompat == null) {
            throw new IllegalArgumentException("Description cannot be null");
        }
        if (j5 == -1) {
            throw new IllegalArgumentException("Id cannot be QueueItem.UNKNOWN_ID");
        }
        this.f3670l = mediaDescriptionCompat;
        this.f3671m = j5;
        this.f3672n = queueItem;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return "MediaSession.QueueItem {Description=" + this.f3670l + ", Id=" + this.f3671m + " }";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.f3670l.writeToParcel(parcel, i);
        parcel.writeLong(this.f3671m);
    }

    public MediaSessionCompat$QueueItem(Parcel parcel) {
        this.f3670l = MediaDescriptionCompat.CREATOR.createFromParcel(parcel);
        this.f3671m = parcel.readLong();
    }
}

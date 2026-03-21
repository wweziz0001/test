package android.support.v4.media.session;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"BanParcelableUsage"})
public class ParcelableVolumeInfo implements Parcelable {
    public static final Parcelable.Creator<ParcelableVolumeInfo> CREATOR = new x(3);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f3678l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f3679m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f3680n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f3681o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f3682p;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f3678l);
        parcel.writeInt(this.f3680n);
        parcel.writeInt(this.f3681o);
        parcel.writeInt(this.f3682p);
        parcel.writeInt(this.f3679m);
    }
}

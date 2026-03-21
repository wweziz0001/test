package r1;

import a0.C0184j;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: r1.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0770k implements Parcelable {
    public static final Parcelable.Creator<C0770k> CREATOR = new C0184j(20);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f9501l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f9502m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f9503n;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f9501l);
        parcel.writeInt(this.f9502m);
        parcel.writeInt(this.f9503n ? 1 : 0);
    }
}

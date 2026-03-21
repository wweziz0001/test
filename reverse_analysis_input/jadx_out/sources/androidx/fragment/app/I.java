package androidx.fragment.app;

import a0.C0184j;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class I implements Parcelable {
    public static final Parcelable.Creator<I> CREATOR = new C0184j(9);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public String f4235l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f4236m;

    public I(String str, int i) {
        this.f4235l = str;
        this.f4236m = i;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f4235l);
        parcel.writeInt(this.f4236m);
    }
}

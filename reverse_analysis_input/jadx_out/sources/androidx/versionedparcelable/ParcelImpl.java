package androidx.versionedparcelable;

import D1.a;
import D1.d;
import D1.e;
import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"BanParcelableUsage"})
public class ParcelImpl implements Parcelable {
    public static final Parcelable.Creator<ParcelImpl> CREATOR = new a(0);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final e f4766l;

    public ParcelImpl(e eVar) {
        this.f4766l = eVar;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        new d(parcel).l(this.f4766l);
    }

    public ParcelImpl(Parcel parcel) {
        this.f4766l = new d(parcel).h();
    }
}

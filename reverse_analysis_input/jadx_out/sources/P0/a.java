package P0;

import a0.InterfaceC0154E;
import android.os.Parcel;
import android.os.Parcelable;
import m.B0;

/* JADX INFO: loaded from: classes.dex */
public final class a implements InterfaceC0154E {
    public static final Parcelable.Creator<a> CREATOR = new D1.a(2);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f1676l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final String f1677m;

    public a(String str, int i) {
        this.f1676l = i;
        this.f1677m = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Ait(controlCode=");
        sb.append(this.f1676l);
        sb.append(",url=");
        return B0.i(sb, this.f1677m, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f1677m);
        parcel.writeInt(this.f1676l);
    }
}

package S0;

import a0.C0152C;
import a0.InterfaceC0154E;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class c implements InterfaceC0154E {
    public static final Parcelable.Creator<c> CREATOR = new D1.a(7);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final byte[] f1993l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final String f1994m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final String f1995n;

    public c(byte[] bArr, String str, String str2) {
        this.f1993l = bArr;
        this.f1994m = str;
        this.f1995n = str2;
    }

    @Override // a0.InterfaceC0154E
    public final void b(C0152C c0152c) {
        String str = this.f1994m;
        if (str != null) {
            c0152c.f3161a = str;
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || c.class != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.f1993l, ((c) obj).f1993l);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f1993l);
    }

    public final String toString() {
        return "ICY: title=\"" + this.f1994m + "\", url=\"" + this.f1995n + "\", rawMetadata.length=\"" + this.f1993l.length + "\"";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeByteArray(this.f1993l);
        parcel.writeString(this.f1994m);
        parcel.writeString(this.f1995n);
    }

    public c(Parcel parcel) {
        byte[] bArrCreateByteArray = parcel.createByteArray();
        bArrCreateByteArray.getClass();
        this.f1993l = bArrCreateByteArray;
        this.f1994m = parcel.readString();
        this.f1995n = parcel.readString();
    }
}

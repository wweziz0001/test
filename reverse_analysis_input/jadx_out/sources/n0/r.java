package n0;

import a0.C0184j;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;

/* JADX INFO: loaded from: classes.dex */
public final class r implements Parcelable {
    public static final Parcelable.Creator<r> CREATOR = new C0184j(19);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f8911l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final int f8912m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final String f8913n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final String f8914o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final String f8915p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final String f8916q;

    public r(int i, int i5, String str, String str2, String str3, String str4) {
        this.f8911l = i;
        this.f8912m = i5;
        this.f8913n = str;
        this.f8914o = str2;
        this.f8915p = str3;
        this.f8916q = str4;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || r.class != obj.getClass()) {
            return false;
        }
        r rVar = (r) obj;
        return this.f8911l == rVar.f8911l && this.f8912m == rVar.f8912m && TextUtils.equals(this.f8913n, rVar.f8913n) && TextUtils.equals(this.f8914o, rVar.f8914o) && TextUtils.equals(this.f8915p, rVar.f8915p) && TextUtils.equals(this.f8916q, rVar.f8916q);
    }

    public final int hashCode() {
        int i = ((this.f8911l * 31) + this.f8912m) * 31;
        String str = this.f8913n;
        int iHashCode = (i + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f8914o;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f8915p;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.f8916q;
        return iHashCode3 + (str4 != null ? str4.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f8911l);
        parcel.writeInt(this.f8912m);
        parcel.writeString(this.f8913n);
        parcel.writeString(this.f8914o);
        parcel.writeString(this.f8915p);
        parcel.writeString(this.f8916q);
    }

    public r(Parcel parcel) {
        this.f8911l = parcel.readInt();
        this.f8912m = parcel.readInt();
        this.f8913n = parcel.readString();
        this.f8914o = parcel.readString();
        this.f8915p = parcel.readString();
        this.f8916q = parcel.readString();
    }
}

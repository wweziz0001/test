package T0;

import android.os.Parcel;
import android.os.Parcelable;
import d0.AbstractC0370w;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class k extends i {
    public static final Parcelable.Creator<k> CREATOR = new D1.a(14);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final String f2126m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final String f2127n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final String f2128o;

    public k(String str, String str2, String str3) {
        super("----");
        this.f2126m = str;
        this.f2127n = str2;
        this.f2128o = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || k.class != obj.getClass()) {
            return false;
        }
        k kVar = (k) obj;
        int i = AbstractC0370w.f5326a;
        return Objects.equals(this.f2127n, kVar.f2127n) && Objects.equals(this.f2126m, kVar.f2126m) && Objects.equals(this.f2128o, kVar.f2128o);
    }

    public final int hashCode() {
        String str = this.f2126m;
        int iHashCode = (527 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f2127n;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f2128o;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    @Override // T0.i
    public final String toString() {
        return this.f2124l + ": domain=" + this.f2126m + ", description=" + this.f2127n;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f2124l);
        parcel.writeString(this.f2126m);
        parcel.writeString(this.f2128o);
    }

    public k(Parcel parcel) {
        super("----");
        String string = parcel.readString();
        int i = AbstractC0370w.f5326a;
        this.f2126m = string;
        this.f2127n = parcel.readString();
        this.f2128o = parcel.readString();
    }
}

package T0;

import android.os.Parcel;
import android.os.Parcelable;
import d0.AbstractC0370w;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class e extends i {
    public static final Parcelable.Creator<e> CREATOR = new D1.a(12);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final String f2112m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final String f2113n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final String f2114o;

    public e(String str, String str2, String str3) {
        super("COMM");
        this.f2112m = str;
        this.f2113n = str2;
        this.f2114o = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || e.class != obj.getClass()) {
            return false;
        }
        e eVar = (e) obj;
        int i = AbstractC0370w.f5326a;
        return Objects.equals(this.f2113n, eVar.f2113n) && Objects.equals(this.f2112m, eVar.f2112m) && Objects.equals(this.f2114o, eVar.f2114o);
    }

    public final int hashCode() {
        String str = this.f2112m;
        int iHashCode = (527 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f2113n;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f2114o;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    @Override // T0.i
    public final String toString() {
        return this.f2124l + ": language=" + this.f2112m + ", description=" + this.f2113n + ", text=" + this.f2114o;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f2124l);
        parcel.writeString(this.f2112m);
        parcel.writeString(this.f2114o);
    }

    public e(Parcel parcel) {
        super("COMM");
        String string = parcel.readString();
        int i = AbstractC0370w.f5326a;
        this.f2112m = string;
        this.f2113n = parcel.readString();
        this.f2114o = parcel.readString();
    }
}

package T0;

import android.os.Parcel;
import android.os.Parcelable;
import b3.AbstractC0307a;
import d0.AbstractC0370w;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class o extends i {
    public static final Parcelable.Creator<o> CREATOR = new D1.a(18);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final String f2138m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final String f2139n;

    public o(String str, String str2, String str3) {
        super(str);
        this.f2138m = str2;
        this.f2139n = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || o.class != obj.getClass()) {
            return false;
        }
        o oVar = (o) obj;
        if (this.f2124l.equals(oVar.f2124l)) {
            int i = AbstractC0370w.f5326a;
            if (Objects.equals(this.f2138m, oVar.f2138m) && Objects.equals(this.f2139n, oVar.f2139n)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iE = AbstractC0307a.e(527, this.f2124l, 31);
        String str = this.f2138m;
        int iHashCode = (iE + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f2139n;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // T0.i
    public final String toString() {
        return this.f2124l + ": url=" + this.f2139n;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f2124l);
        parcel.writeString(this.f2138m);
        parcel.writeString(this.f2139n);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public o(Parcel parcel) {
        String string = parcel.readString();
        int i = AbstractC0370w.f5326a;
        super(string);
        this.f2138m = parcel.readString();
        this.f2139n = parcel.readString();
    }
}

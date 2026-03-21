package T0;

import android.os.Parcel;
import android.os.Parcelable;
import d0.AbstractC0370w;
import java.util.Arrays;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class f extends i {
    public static final Parcelable.Creator<f> CREATOR = new D1.a(13);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final String f2115m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final String f2116n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final String f2117o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final byte[] f2118p;

    public f(String str, String str2, String str3, byte[] bArr) {
        super("GEOB");
        this.f2115m = str;
        this.f2116n = str2;
        this.f2117o = str3;
        this.f2118p = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || f.class != obj.getClass()) {
            return false;
        }
        f fVar = (f) obj;
        int i = AbstractC0370w.f5326a;
        return Objects.equals(this.f2115m, fVar.f2115m) && Objects.equals(this.f2116n, fVar.f2116n) && Objects.equals(this.f2117o, fVar.f2117o) && Arrays.equals(this.f2118p, fVar.f2118p);
    }

    public final int hashCode() {
        String str = this.f2115m;
        int iHashCode = (527 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f2116n;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f2117o;
        return Arrays.hashCode(this.f2118p) + ((iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31);
    }

    @Override // T0.i
    public final String toString() {
        return this.f2124l + ": mimeType=" + this.f2115m + ", filename=" + this.f2116n + ", description=" + this.f2117o;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f2115m);
        parcel.writeString(this.f2116n);
        parcel.writeString(this.f2117o);
        parcel.writeByteArray(this.f2118p);
    }

    public f(Parcel parcel) {
        super("GEOB");
        String string = parcel.readString();
        int i = AbstractC0370w.f5326a;
        this.f2115m = string;
        this.f2116n = parcel.readString();
        this.f2117o = parcel.readString();
        this.f2118p = parcel.createByteArray();
    }
}

package T0;

import android.os.Parcel;
import android.os.Parcelable;
import d0.AbstractC0370w;
import java.util.Arrays;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class c extends i {
    public static final Parcelable.Creator<c> CREATOR = new D1.a(10);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final String f2101m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final int f2102n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final int f2103o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final long f2104p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final long f2105q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final i[] f2106r;

    public c(String str, int i, int i5, long j5, long j6, i[] iVarArr) {
        super("CHAP");
        this.f2101m = str;
        this.f2102n = i;
        this.f2103o = i5;
        this.f2104p = j5;
        this.f2105q = j6;
        this.f2106r = iVarArr;
    }

    @Override // T0.i, android.os.Parcelable
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
        c cVar = (c) obj;
        if (this.f2102n == cVar.f2102n && this.f2103o == cVar.f2103o && this.f2104p == cVar.f2104p && this.f2105q == cVar.f2105q) {
            int i = AbstractC0370w.f5326a;
            if (Objects.equals(this.f2101m, cVar.f2101m) && Arrays.equals(this.f2106r, cVar.f2106r)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = (((((((527 + this.f2102n) * 31) + this.f2103o) * 31) + ((int) this.f2104p)) * 31) + ((int) this.f2105q)) * 31;
        String str = this.f2101m;
        return i + (str != null ? str.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f2101m);
        parcel.writeInt(this.f2102n);
        parcel.writeInt(this.f2103o);
        parcel.writeLong(this.f2104p);
        parcel.writeLong(this.f2105q);
        i[] iVarArr = this.f2106r;
        parcel.writeInt(iVarArr.length);
        for (i iVar : iVarArr) {
            parcel.writeParcelable(iVar, 0);
        }
    }

    public c(Parcel parcel) {
        super("CHAP");
        String string = parcel.readString();
        int i = AbstractC0370w.f5326a;
        this.f2101m = string;
        this.f2102n = parcel.readInt();
        this.f2103o = parcel.readInt();
        this.f2104p = parcel.readLong();
        this.f2105q = parcel.readLong();
        int i5 = parcel.readInt();
        this.f2106r = new i[i5];
        for (int i6 = 0; i6 < i5; i6++) {
            this.f2106r[i6] = (i) parcel.readParcelable(i.class.getClassLoader());
        }
    }
}

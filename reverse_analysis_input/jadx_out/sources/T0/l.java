package T0;

import android.os.Parcel;
import android.os.Parcelable;
import d0.AbstractC0370w;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class l extends i {
    public static final Parcelable.Creator<l> CREATOR = new D1.a(15);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final int f2129m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final int f2130n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final int f2131o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final int[] f2132p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final int[] f2133q;

    public l(int i, int i5, int i6, int[] iArr, int[] iArr2) {
        super("MLLT");
        this.f2129m = i;
        this.f2130n = i5;
        this.f2131o = i6;
        this.f2132p = iArr;
        this.f2133q = iArr2;
    }

    @Override // T0.i, android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || l.class != obj.getClass()) {
            return false;
        }
        l lVar = (l) obj;
        return this.f2129m == lVar.f2129m && this.f2130n == lVar.f2130n && this.f2131o == lVar.f2131o && Arrays.equals(this.f2132p, lVar.f2132p) && Arrays.equals(this.f2133q, lVar.f2133q);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f2133q) + ((Arrays.hashCode(this.f2132p) + ((((((527 + this.f2129m) * 31) + this.f2130n) * 31) + this.f2131o) * 31)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f2129m);
        parcel.writeInt(this.f2130n);
        parcel.writeInt(this.f2131o);
        parcel.writeIntArray(this.f2132p);
        parcel.writeIntArray(this.f2133q);
    }

    public l(Parcel parcel) {
        super("MLLT");
        this.f2129m = parcel.readInt();
        this.f2130n = parcel.readInt();
        this.f2131o = parcel.readInt();
        int[] iArrCreateIntArray = parcel.createIntArray();
        int i = AbstractC0370w.f5326a;
        this.f2132p = iArrCreateIntArray;
        this.f2133q = parcel.createIntArray();
    }
}

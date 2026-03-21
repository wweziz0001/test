package a0;

import android.os.Parcel;
import android.os.Parcelable;
import d0.AbstractC0370w;

/* JADX INFO: renamed from: a0.P, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0165P implements Comparable, Parcelable {
    public static final Parcelable.Creator<C0165P> CREATOR = new C0184j(2);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f3233l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final int f3234m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final int f3235n;

    static {
        AbstractC0370w.G(0);
        AbstractC0370w.G(1);
        AbstractC0370w.G(2);
    }

    public C0165P() {
        this.f3233l = -1;
        this.f3234m = -1;
        this.f3235n = -1;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        C0165P c0165p = (C0165P) obj;
        int i = this.f3233l - c0165p.f3233l;
        if (i != 0) {
            return i;
        }
        int i5 = this.f3234m - c0165p.f3234m;
        return i5 == 0 ? this.f3235n - c0165p.f3235n : i5;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0165P.class != obj.getClass()) {
            return false;
        }
        C0165P c0165p = (C0165P) obj;
        return this.f3233l == c0165p.f3233l && this.f3234m == c0165p.f3234m && this.f3235n == c0165p.f3235n;
    }

    public final int hashCode() {
        return (((this.f3233l * 31) + this.f3234m) * 31) + this.f3235n;
    }

    public final String toString() {
        return this.f3233l + "." + this.f3234m + "." + this.f3235n;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f3233l);
        parcel.writeInt(this.f3234m);
        parcel.writeInt(this.f3235n);
    }

    public C0165P(Parcel parcel) {
        this.f3233l = parcel.readInt();
        this.f3234m = parcel.readInt();
        this.f3235n = parcel.readInt();
    }
}

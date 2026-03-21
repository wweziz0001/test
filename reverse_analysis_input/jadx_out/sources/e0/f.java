package e0;

import a0.C0184j;
import a0.InterfaceC0154E;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class f implements InterfaceC0154E {
    public static final Parcelable.Creator<f> CREATOR = new C0184j(17);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final long f5497l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final long f5498m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final long f5499n;

    public f(long j5, long j6, long j7) {
        this.f5497l = j5;
        this.f5498m = j6;
        this.f5499n = j7;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return this.f5497l == fVar.f5497l && this.f5498m == fVar.f5498m && this.f5499n == fVar.f5499n;
    }

    public final int hashCode() {
        return Z1.f.x(this.f5499n) + ((Z1.f.x(this.f5498m) + ((Z1.f.x(this.f5497l) + 527) * 31)) * 31);
    }

    public final String toString() {
        return "Mp4Timestamp: creation time=" + this.f5497l + ", modification time=" + this.f5498m + ", timescale=" + this.f5499n;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.f5497l);
        parcel.writeLong(this.f5498m);
        parcel.writeLong(this.f5499n);
    }

    public f(Parcel parcel) {
        this.f5497l = parcel.readLong();
        this.f5498m = parcel.readLong();
        this.f5499n = parcel.readLong();
    }
}

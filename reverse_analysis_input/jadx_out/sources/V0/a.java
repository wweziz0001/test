package V0;

import android.os.Parcel;
import android.os.Parcelable;
import d0.AbstractC0370w;

/* JADX INFO: loaded from: classes.dex */
public final class a extends b {
    public static final Parcelable.Creator<a> CREATOR = new D1.a(23);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final long f2313l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final long f2314m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final byte[] f2315n;

    public a(long j5, byte[] bArr, long j6) {
        this.f2313l = j6;
        this.f2314m = j5;
        this.f2315n = bArr;
    }

    @Override // V0.b
    public final String toString() {
        return "SCTE-35 PrivateCommand { ptsAdjustment=" + this.f2313l + ", identifier= " + this.f2314m + " }";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.f2313l);
        parcel.writeLong(this.f2314m);
        parcel.writeByteArray(this.f2315n);
    }

    public a(Parcel parcel) {
        this.f2313l = parcel.readLong();
        this.f2314m = parcel.readLong();
        byte[] bArrCreateByteArray = parcel.createByteArray();
        int i = AbstractC0370w.f5326a;
        this.f2315n = bArrCreateByteArray;
    }
}

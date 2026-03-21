package V0;

import android.os.Parcel;
import android.os.Parcelable;
import d0.C0363p;

/* JADX INFO: loaded from: classes.dex */
public final class j extends b {
    public static final Parcelable.Creator<j> CREATOR = new D1.a(27);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final long f2348l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final long f2349m;

    public j(long j5, long j6) {
        this.f2348l = j5;
        this.f2349m = j6;
    }

    public static long d(long j5, C0363p c0363p) {
        long jV = c0363p.v();
        if ((128 & jV) != 0) {
            return 8589934591L & ((((jV & 1) << 32) | c0363p.x()) + j5);
        }
        return -9223372036854775807L;
    }

    @Override // V0.b
    public final String toString() {
        return "SCTE-35 TimeSignalCommand { ptsTime=" + this.f2348l + ", playbackPositionUs= " + this.f2349m + " }";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.f2348l);
        parcel.writeLong(this.f2349m);
    }
}

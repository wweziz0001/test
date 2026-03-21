package U0;

import Z1.f;
import a0.InterfaceC0154E;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class a implements InterfaceC0154E {
    public static final Parcelable.Creator<a> CREATOR = new D1.a(19);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final long f2259l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final long f2260m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final long f2261n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final long f2262o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final long f2263p;

    public a(long j5, long j6, long j7, long j8, long j9) {
        this.f2259l = j5;
        this.f2260m = j6;
        this.f2261n = j7;
        this.f2262o = j8;
        this.f2263p = j9;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || a.class != obj.getClass()) {
            return false;
        }
        a aVar = (a) obj;
        return this.f2259l == aVar.f2259l && this.f2260m == aVar.f2260m && this.f2261n == aVar.f2261n && this.f2262o == aVar.f2262o && this.f2263p == aVar.f2263p;
    }

    public final int hashCode() {
        return f.x(this.f2263p) + ((f.x(this.f2262o) + ((f.x(this.f2261n) + ((f.x(this.f2260m) + ((f.x(this.f2259l) + 527) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "Motion photo metadata: photoStartPosition=" + this.f2259l + ", photoSize=" + this.f2260m + ", photoPresentationTimestampUs=" + this.f2261n + ", videoStartPosition=" + this.f2262o + ", videoSize=" + this.f2263p;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.f2259l);
        parcel.writeLong(this.f2260m);
        parcel.writeLong(this.f2261n);
        parcel.writeLong(this.f2262o);
        parcel.writeLong(this.f2263p);
    }

    public a(Parcel parcel) {
        this.f2259l = parcel.readLong();
        this.f2260m = parcel.readLong();
        this.f2261n = parcel.readLong();
        this.f2262o = parcel.readLong();
        this.f2263p = parcel.readLong();
    }
}

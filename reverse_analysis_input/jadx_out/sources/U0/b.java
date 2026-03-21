package U0;

import android.os.Parcel;
import android.os.Parcelable;
import d0.AbstractC0360m;
import d0.AbstractC0370w;
import java.util.Arrays;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public final class b implements Parcelable {
    public static final Parcelable.Creator<b> CREATOR = new D1.a(21);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final long f2264l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final long f2265m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final int f2266n;

    public b(int i, long j5, long j6) {
        AbstractC0360m.c(j5 < j6);
        this.f2264l = j5;
        this.f2265m = j6;
        this.f2266n = i;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || b.class != obj.getClass()) {
            return false;
        }
        b bVar = (b) obj;
        return this.f2264l == bVar.f2264l && this.f2265m == bVar.f2265m && this.f2266n == bVar.f2266n;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.f2264l), Long.valueOf(this.f2265m), Integer.valueOf(this.f2266n)});
    }

    public final String toString() {
        int i = AbstractC0370w.f5326a;
        Locale locale = Locale.US;
        return "Segment: startTimeMs=" + this.f2264l + ", endTimeMs=" + this.f2265m + ", speedDivisor=" + this.f2266n;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.f2264l);
        parcel.writeLong(this.f2265m);
        parcel.writeInt(this.f2266n);
    }
}

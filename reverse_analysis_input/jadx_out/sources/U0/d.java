package U0;

import a0.InterfaceC0154E;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class d implements InterfaceC0154E {
    public static final Parcelable.Creator<d> CREATOR = new D1.a(22);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final float f2268l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final int f2269m;

    public d(float f2, int i) {
        this.f2268l = f2;
        this.f2269m = i;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || d.class != obj.getClass()) {
            return false;
        }
        d dVar = (d) obj;
        return this.f2268l == dVar.f2268l && this.f2269m == dVar.f2269m;
    }

    public final int hashCode() {
        return ((Float.valueOf(this.f2268l).hashCode() + 527) * 31) + this.f2269m;
    }

    public final String toString() {
        return "smta: captureFrameRate=" + this.f2268l + ", svcTemporalLayerCount=" + this.f2269m;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeFloat(this.f2268l);
        parcel.writeInt(this.f2269m);
    }

    public d(Parcel parcel) {
        this.f2268l = parcel.readFloat();
        this.f2269m = parcel.readInt();
    }
}

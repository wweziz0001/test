package e0;

import a0.C0184j;
import a0.InterfaceC0154E;
import android.os.Parcel;
import android.os.Parcelable;
import d0.AbstractC0360m;

/* JADX INFO: loaded from: classes.dex */
public final class e implements InterfaceC0154E {
    public static final Parcelable.Creator<e> CREATOR = new C0184j(16);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final float f5495l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final float f5496m;

    public e(float f2, float f5) {
        AbstractC0360m.b("Invalid latitude or longitude", f2 >= -90.0f && f2 <= 90.0f && f5 >= -180.0f && f5 <= 180.0f);
        this.f5495l = f2;
        this.f5496m = f5;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || e.class != obj.getClass()) {
            return false;
        }
        e eVar = (e) obj;
        return this.f5495l == eVar.f5495l && this.f5496m == eVar.f5496m;
    }

    public final int hashCode() {
        return Float.valueOf(this.f5496m).hashCode() + ((Float.valueOf(this.f5495l).hashCode() + 527) * 31);
    }

    public final String toString() {
        return "xyz: latitude=" + this.f5495l + ", longitude=" + this.f5496m;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeFloat(this.f5495l);
        parcel.writeFloat(this.f5496m);
    }

    public e(Parcel parcel) {
        this.f5495l = parcel.readFloat();
        this.f5496m = parcel.readFloat();
    }
}

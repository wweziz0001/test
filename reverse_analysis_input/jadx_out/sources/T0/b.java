package T0;

import android.os.Parcel;
import android.os.Parcelable;
import b3.AbstractC0307a;
import d0.AbstractC0370w;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class b extends i {
    public static final Parcelable.Creator<b> CREATOR = new D1.a(9);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final byte[] f2100m;

    public b(String str, byte[] bArr) {
        super(str);
        this.f2100m = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || b.class != obj.getClass()) {
            return false;
        }
        b bVar = (b) obj;
        return this.f2124l.equals(bVar.f2124l) && Arrays.equals(this.f2100m, bVar.f2100m);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f2100m) + AbstractC0307a.e(527, this.f2124l, 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f2124l);
        parcel.writeByteArray(this.f2100m);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public b(Parcel parcel) {
        String string = parcel.readString();
        int i = AbstractC0370w.f5326a;
        super(string);
        this.f2100m = parcel.createByteArray();
    }
}

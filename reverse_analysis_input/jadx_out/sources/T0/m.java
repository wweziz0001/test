package T0;

import android.os.Parcel;
import android.os.Parcelable;
import d0.AbstractC0370w;
import java.util.Arrays;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class m extends i {
    public static final Parcelable.Creator<m> CREATOR = new D1.a(16);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final String f2134m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final byte[] f2135n;

    public m(String str, byte[] bArr) {
        super("PRIV");
        this.f2134m = str;
        this.f2135n = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || m.class != obj.getClass()) {
            return false;
        }
        m mVar = (m) obj;
        int i = AbstractC0370w.f5326a;
        return Objects.equals(this.f2134m, mVar.f2134m) && Arrays.equals(this.f2135n, mVar.f2135n);
    }

    public final int hashCode() {
        String str = this.f2134m;
        return Arrays.hashCode(this.f2135n) + ((527 + (str != null ? str.hashCode() : 0)) * 31);
    }

    @Override // T0.i
    public final String toString() {
        return this.f2124l + ": owner=" + this.f2134m;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f2134m);
        parcel.writeByteArray(this.f2135n);
    }

    public m(Parcel parcel) {
        super("PRIV");
        String string = parcel.readString();
        int i = AbstractC0370w.f5326a;
        this.f2134m = string;
        this.f2135n = parcel.createByteArray();
    }
}

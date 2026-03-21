package T0;

import a0.C0152C;
import android.os.Parcel;
import android.os.Parcelable;
import d0.AbstractC0370w;
import java.util.Arrays;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class a extends i {
    public static final Parcelable.Creator<a> CREATOR = new D1.a(8);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final String f2096m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final String f2097n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final int f2098o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final byte[] f2099p;

    public a(String str, String str2, int i, byte[] bArr) {
        super("APIC");
        this.f2096m = str;
        this.f2097n = str2;
        this.f2098o = i;
        this.f2099p = bArr;
    }

    @Override // a0.InterfaceC0154E
    public final void b(C0152C c0152c) {
        c0152c.a(this.f2098o, this.f2099p);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || a.class != obj.getClass()) {
            return false;
        }
        a aVar = (a) obj;
        if (this.f2098o == aVar.f2098o) {
            int i = AbstractC0370w.f5326a;
            if (Objects.equals(this.f2096m, aVar.f2096m) && Objects.equals(this.f2097n, aVar.f2097n) && Arrays.equals(this.f2099p, aVar.f2099p)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = (527 + this.f2098o) * 31;
        String str = this.f2096m;
        int iHashCode = (i + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f2097n;
        return Arrays.hashCode(this.f2099p) + ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    @Override // T0.i
    public final String toString() {
        return this.f2124l + ": mimeType=" + this.f2096m + ", description=" + this.f2097n;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f2096m);
        parcel.writeString(this.f2097n);
        parcel.writeInt(this.f2098o);
        parcel.writeByteArray(this.f2099p);
    }

    public a(Parcel parcel) {
        super("APIC");
        String string = parcel.readString();
        int i = AbstractC0370w.f5326a;
        this.f2096m = string;
        this.f2097n = parcel.readString();
        this.f2098o = parcel.readInt();
        this.f2099p = parcel.createByteArray();
    }
}

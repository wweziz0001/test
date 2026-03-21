package R0;

import Q1.C;
import a.AbstractC0149a;
import a0.C0152C;
import a0.InterfaceC0154E;
import android.os.Parcel;
import android.os.Parcelable;
import b3.AbstractC0307a;
import d0.AbstractC0370w;

/* JADX INFO: loaded from: classes.dex */
public class b implements InterfaceC0154E {
    public static final Parcelable.Creator<b> CREATOR = new D1.a(5);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final String f1859l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final String f1860m;

    public b(String str, String str2) {
        this.f1859l = AbstractC0149a.J(str);
        this.f1860m = str2;
    }

    @Override // a0.InterfaceC0154E
    public final void b(C0152C c0152c) {
        String str;
        String str2 = this.f1859l;
        str2.getClass();
        str = this.f1860m;
        switch (str2) {
            case "TOTALTRACKS":
                Integer numZ0 = C.z0(str);
                if (numZ0 != null) {
                    c0152c.i = numZ0;
                    break;
                }
                break;
            case "TOTALDISCS":
                Integer numZ02 = C.z0(str);
                if (numZ02 != null) {
                    c0152c.f3181v = numZ02;
                    break;
                }
                break;
            case "TRACKNUMBER":
                Integer numZ03 = C.z0(str);
                if (numZ03 != null) {
                    c0152c.f3168h = numZ03;
                    break;
                }
                break;
            case "ALBUM":
                c0152c.f3163c = str;
                break;
            case "GENRE":
                c0152c.f3182w = str;
                break;
            case "TITLE":
                c0152c.f3161a = str;
                break;
            case "DESCRIPTION":
                c0152c.f3165e = str;
                break;
            case "DISCNUMBER":
                Integer numZ04 = C.z0(str);
                if (numZ04 != null) {
                    c0152c.f3180u = numZ04;
                    break;
                }
                break;
            case "ALBUMARTIST":
                c0152c.f3164d = str;
                break;
            case "ARTIST":
                c0152c.f3162b = str;
                break;
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        b bVar = (b) obj;
        return this.f1859l.equals(bVar.f1859l) && this.f1860m.equals(bVar.f1860m);
    }

    public final int hashCode() {
        return this.f1860m.hashCode() + AbstractC0307a.e(527, this.f1859l, 31);
    }

    public final String toString() {
        return "VC: " + this.f1859l + "=" + this.f1860m;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f1859l);
        parcel.writeString(this.f1860m);
    }

    public b(Parcel parcel) {
        String string = parcel.readString();
        int i = AbstractC0370w.f5326a;
        this.f1859l = string;
        this.f1860m = parcel.readString();
    }
}

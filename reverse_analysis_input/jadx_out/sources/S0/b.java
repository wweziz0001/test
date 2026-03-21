package S0;

import a0.C0152C;
import a0.InterfaceC0154E;
import android.os.Parcel;
import android.os.Parcelable;
import b3.AbstractC0307a;
import d0.AbstractC0360m;
import d0.AbstractC0370w;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class b implements InterfaceC0154E {
    public static final Parcelable.Creator<b> CREATOR = new D1.a(6);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f1987l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final String f1988m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final String f1989n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final String f1990o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final boolean f1991p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final int f1992q;

    public b(int i, int i5, String str, String str2, String str3, boolean z4) {
        AbstractC0360m.c(i5 == -1 || i5 > 0);
        this.f1987l = i;
        this.f1988m = str;
        this.f1989n = str2;
        this.f1990o = str3;
        this.f1991p = z4;
        this.f1992q = i5;
    }

    public static b d(Map map) {
        boolean z4;
        int i;
        String str;
        String str2;
        String str3;
        boolean zEquals;
        int i5;
        List list = (List) map.get("icy-br");
        boolean z5 = true;
        int i6 = -1;
        if (list != null) {
            String str4 = (String) list.get(0);
            try {
                i5 = Integer.parseInt(str4) * 1000;
                if (i5 > 0) {
                    z4 = true;
                } else {
                    try {
                        AbstractC0360m.y("IcyHeaders", "Invalid bitrate: " + str4);
                        z4 = false;
                        i5 = -1;
                    } catch (NumberFormatException unused) {
                        AbstractC0307a.s("Invalid bitrate header: ", str4, "IcyHeaders");
                        z4 = false;
                    }
                }
            } catch (NumberFormatException unused2) {
                i5 = -1;
            }
            i = i5;
        } else {
            z4 = false;
            i = -1;
        }
        List list2 = (List) map.get("icy-genre");
        if (list2 != null) {
            str = (String) list2.get(0);
            z4 = true;
        } else {
            str = null;
        }
        List list3 = (List) map.get("icy-name");
        if (list3 != null) {
            str2 = (String) list3.get(0);
            z4 = true;
        } else {
            str2 = null;
        }
        List list4 = (List) map.get("icy-url");
        if (list4 != null) {
            str3 = (String) list4.get(0);
            z4 = true;
        } else {
            str3 = null;
        }
        List list5 = (List) map.get("icy-pub");
        if (list5 != null) {
            zEquals = ((String) list5.get(0)).equals("1");
            z4 = true;
        } else {
            zEquals = false;
        }
        List list6 = (List) map.get("icy-metaint");
        if (list6 != null) {
            String str5 = (String) list6.get(0);
            try {
                int i7 = Integer.parseInt(str5);
                if (i7 > 0) {
                    i6 = i7;
                } else {
                    try {
                        AbstractC0360m.y("IcyHeaders", "Invalid metadata interval: " + str5);
                        z5 = z4;
                    } catch (NumberFormatException unused3) {
                        i6 = i7;
                        AbstractC0307a.s("Invalid metadata interval: ", str5, "IcyHeaders");
                    }
                }
                z4 = z5;
            } catch (NumberFormatException unused4) {
            }
        }
        int i8 = i6;
        if (z4) {
            return new b(i, i8, str, str2, str3, zEquals);
        }
        return null;
    }

    @Override // a0.InterfaceC0154E
    public final void b(C0152C c0152c) {
        String str = this.f1989n;
        if (str != null) {
            c0152c.f3183x = str;
        }
        String str2 = this.f1988m;
        if (str2 != null) {
            c0152c.f3182w = str2;
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
        if (obj == null || b.class != obj.getClass()) {
            return false;
        }
        b bVar = (b) obj;
        if (this.f1987l == bVar.f1987l) {
            int i = AbstractC0370w.f5326a;
            if (Objects.equals(this.f1988m, bVar.f1988m) && Objects.equals(this.f1989n, bVar.f1989n) && Objects.equals(this.f1990o, bVar.f1990o) && this.f1991p == bVar.f1991p && this.f1992q == bVar.f1992q) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = (527 + this.f1987l) * 31;
        String str = this.f1988m;
        int iHashCode = (i + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f1989n;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f1990o;
        return ((((iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31) + (this.f1991p ? 1 : 0)) * 31) + this.f1992q;
    }

    public final String toString() {
        return "IcyHeaders: name=\"" + this.f1989n + "\", genre=\"" + this.f1988m + "\", bitrate=" + this.f1987l + ", metadataInterval=" + this.f1992q;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f1987l);
        parcel.writeString(this.f1988m);
        parcel.writeString(this.f1989n);
        parcel.writeString(this.f1990o);
        int i5 = AbstractC0370w.f5326a;
        parcel.writeInt(this.f1991p ? 1 : 0);
        parcel.writeInt(this.f1992q);
    }

    public b(Parcel parcel) {
        this.f1987l = parcel.readInt();
        this.f1988m = parcel.readString();
        this.f1989n = parcel.readString();
        this.f1990o = parcel.readString();
        int i = AbstractC0370w.f5326a;
        this.f1991p = parcel.readInt() != 0;
        this.f1992q = parcel.readInt();
    }
}

package T0;

import android.os.Parcel;
import android.os.Parcelable;
import d0.AbstractC0370w;
import java.util.Arrays;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class d extends i {
    public static final Parcelable.Creator<d> CREATOR = new D1.a(11);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final String f2107m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final boolean f2108n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final boolean f2109o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final String[] f2110p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final i[] f2111q;

    public d(String str, boolean z4, boolean z5, String[] strArr, i[] iVarArr) {
        super("CTOC");
        this.f2107m = str;
        this.f2108n = z4;
        this.f2109o = z5;
        this.f2110p = strArr;
        this.f2111q = iVarArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || d.class != obj.getClass()) {
            return false;
        }
        d dVar = (d) obj;
        if (this.f2108n == dVar.f2108n && this.f2109o == dVar.f2109o) {
            int i = AbstractC0370w.f5326a;
            if (Objects.equals(this.f2107m, dVar.f2107m) && Arrays.equals(this.f2110p, dVar.f2110p) && Arrays.equals(this.f2111q, dVar.f2111q)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = (((527 + (this.f2108n ? 1 : 0)) * 31) + (this.f2109o ? 1 : 0)) * 31;
        String str = this.f2107m;
        return i + (str != null ? str.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f2107m);
        parcel.writeByte(this.f2108n ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f2109o ? (byte) 1 : (byte) 0);
        parcel.writeStringArray(this.f2110p);
        i[] iVarArr = this.f2111q;
        parcel.writeInt(iVarArr.length);
        for (i iVar : iVarArr) {
            parcel.writeParcelable(iVar, 0);
        }
    }

    public d(Parcel parcel) {
        super("CTOC");
        String string = parcel.readString();
        int i = AbstractC0370w.f5326a;
        this.f2107m = string;
        this.f2108n = parcel.readByte() != 0;
        this.f2109o = parcel.readByte() != 0;
        this.f2110p = parcel.createStringArray();
        int i5 = parcel.readInt();
        this.f2111q = new i[i5];
        for (int i6 = 0; i6 < i5; i6++) {
            this.f2111q[i6] = (i) parcel.readParcelable(i.class.getClassLoader());
        }
    }
}

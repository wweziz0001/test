package n0;

import a0.C0184j;
import a0.InterfaceC0154E;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import b3.AbstractC0307a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import m.B0;

/* JADX INFO: loaded from: classes.dex */
public final class s implements InterfaceC0154E {
    public static final Parcelable.Creator<s> CREATOR = new C0184j(18);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final String f8917l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final String f8918m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final List f8919n;

    public s(String str, String str2, List list) {
        this.f8917l = str;
        this.f8918m = str2;
        this.f8919n = Collections.unmodifiableList(new ArrayList(list));
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || s.class != obj.getClass()) {
            return false;
        }
        s sVar = (s) obj;
        return TextUtils.equals(this.f8917l, sVar.f8917l) && TextUtils.equals(this.f8918m, sVar.f8918m) && this.f8919n.equals(sVar.f8919n);
    }

    public final int hashCode() {
        String str = this.f8917l;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f8918m;
        return this.f8919n.hashCode() + ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("HlsTrackMetadataEntry");
        String str = this.f8917l;
        sb.append(str != null ? B0.i(AbstractC0307a.m(" [", str, ", "), this.f8918m, "]") : "");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f8917l);
        parcel.writeString(this.f8918m);
        List list = this.f8919n;
        int size = list.size();
        parcel.writeInt(size);
        for (int i5 = 0; i5 < size; i5++) {
            parcel.writeParcelable((Parcelable) list.get(i5), 0);
        }
    }

    public s(Parcel parcel) {
        this.f8917l = parcel.readString();
        this.f8918m = parcel.readString();
        int i = parcel.readInt();
        ArrayList arrayList = new ArrayList(i);
        for (int i5 = 0; i5 < i; i5++) {
            arrayList.add((r) parcel.readParcelable(r.class.getClassLoader()));
        }
        this.f8919n = Collections.unmodifiableList(arrayList);
    }
}

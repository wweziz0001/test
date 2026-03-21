package a0;

import android.os.Parcel;
import android.os.Parcelable;
import d0.AbstractC0370w;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Objects;
import java.util.UUID;

/* JADX INFO: renamed from: a0.l, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0186l implements Comparator, Parcelable {
    public static final Parcelable.Creator<C0186l> CREATOR = new D1.a(29);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final C0185k[] f3358l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f3359m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final String f3360n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final int f3361o;

    public C0186l(String str, ArrayList arrayList) {
        this(str, false, (C0185k[]) arrayList.toArray(new C0185k[0]));
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        C0185k c0185k = (C0185k) obj;
        C0185k c0185k2 = (C0185k) obj2;
        UUID uuid = AbstractC0179e.f3328a;
        return uuid.equals(c0185k.f3354m) ? uuid.equals(c0185k2.f3354m) ? 0 : 1 : c0185k.f3354m.compareTo(c0185k2.f3354m);
    }

    public final C0186l d(String str) {
        int i = AbstractC0370w.f5326a;
        return Objects.equals(this.f3360n, str) ? this : new C0186l(str, false, this.f3358l);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0186l.class != obj.getClass()) {
            return false;
        }
        C0186l c0186l = (C0186l) obj;
        int i = AbstractC0370w.f5326a;
        return Objects.equals(this.f3360n, c0186l.f3360n) && Arrays.equals(this.f3358l, c0186l.f3358l);
    }

    public final int hashCode() {
        if (this.f3359m == 0) {
            String str = this.f3360n;
            this.f3359m = ((str == null ? 0 : str.hashCode()) * 31) + Arrays.hashCode(this.f3358l);
        }
        return this.f3359m;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f3360n);
        parcel.writeTypedArray(this.f3358l, 0);
    }

    public C0186l(C0185k... c0185kArr) {
        this(null, true, c0185kArr);
    }

    public C0186l(String str, boolean z4, C0185k... c0185kArr) {
        this.f3360n = str;
        c0185kArr = z4 ? (C0185k[]) c0185kArr.clone() : c0185kArr;
        this.f3358l = c0185kArr;
        this.f3361o = c0185kArr.length;
        Arrays.sort(c0185kArr, this);
    }

    public C0186l(Parcel parcel) {
        this.f3360n = parcel.readString();
        C0185k[] c0185kArr = (C0185k[]) parcel.createTypedArray(C0185k.CREATOR);
        int i = AbstractC0370w.f5326a;
        this.f3358l = c0185kArr;
        this.f3361o = c0185kArr.length;
    }
}

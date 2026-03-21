package r1;

import a0.C0184j;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* JADX INFO: renamed from: r1.G, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0756G implements Parcelable {
    public static final Parcelable.Creator<C0756G> CREATOR = new C0184j(21);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f9433l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f9434m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int[] f9435n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f9436o;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return "FullSpanItem{mPosition=" + this.f9433l + ", mGapDir=" + this.f9434m + ", mHasUnwantedGapAfter=" + this.f9436o + ", mGapPerSpan=" + Arrays.toString(this.f9435n) + '}';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f9433l);
        parcel.writeInt(this.f9434m);
        parcel.writeInt(this.f9436o ? 1 : 0);
        int[] iArr = this.f9435n;
        if (iArr == null || iArr.length <= 0) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(iArr.length);
            parcel.writeIntArray(this.f9435n);
        }
    }
}

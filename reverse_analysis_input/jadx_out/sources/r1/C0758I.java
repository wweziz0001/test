package r1;

import a0.C0184j;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* JADX INFO: renamed from: r1.I, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0758I implements Parcelable {
    public static final Parcelable.Creator<C0758I> CREATOR = new C0184j(22);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f9438l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f9439m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f9440n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int[] f9441o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f9442p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int[] f9443q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public ArrayList f9444r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f9445s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f9446t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f9447u;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f9438l);
        parcel.writeInt(this.f9439m);
        parcel.writeInt(this.f9440n);
        if (this.f9440n > 0) {
            parcel.writeIntArray(this.f9441o);
        }
        parcel.writeInt(this.f9442p);
        if (this.f9442p > 0) {
            parcel.writeIntArray(this.f9443q);
        }
        parcel.writeInt(this.f9445s ? 1 : 0);
        parcel.writeInt(this.f9446t ? 1 : 0);
        parcel.writeInt(this.f9447u ? 1 : 0);
        parcel.writeList(this.f9444r);
    }
}

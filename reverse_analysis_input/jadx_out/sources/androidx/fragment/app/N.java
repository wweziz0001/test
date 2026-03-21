package androidx.fragment.app;

import a0.C0184j;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class N implements Parcelable {
    public static final Parcelable.Creator<N> CREATOR = new C0184j(10);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public ArrayList f4276l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public ArrayList f4277m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public C0235b[] f4278n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f4279o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public String f4280p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public ArrayList f4281q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public ArrayList f4282r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public ArrayList f4283s;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeStringList(this.f4276l);
        parcel.writeStringList(this.f4277m);
        parcel.writeTypedArray(this.f4278n, i);
        parcel.writeInt(this.f4279o);
        parcel.writeString(this.f4280p);
        parcel.writeStringList(this.f4281q);
        parcel.writeTypedList(this.f4282r);
        parcel.writeTypedList(this.f4283s);
    }
}

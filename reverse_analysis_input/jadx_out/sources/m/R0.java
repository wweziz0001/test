package m;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class R0 extends K.c {
    public static final Parcelable.Creator<R0> CREATOR = new K.b(2);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f8307n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f8308o;

    public R0(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f8307n = parcel.readInt();
        this.f8308o = parcel.readInt() != 0;
    }

    @Override // K.c, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.f8307n);
        parcel.writeInt(this.f8308o ? 1 : 0);
    }
}

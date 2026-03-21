package r1;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class z extends K.c {
    public static final Parcelable.Creator<z> CREATOR = new K.b(3);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public Parcelable f9522n;

    public z(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f9522n = parcel.readParcelable(classLoader == null ? AbstractC0778s.class.getClassLoader() : classLoader);
    }

    @Override // K.c, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeParcelable(this.f9522n, 0);
    }
}

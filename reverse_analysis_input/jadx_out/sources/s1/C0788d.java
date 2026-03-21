package s1;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: renamed from: s1.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0788d implements IInterface {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public IBinder f9569c;

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f9569c;
    }

    public final void e0(String[] strArr) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("androidx.room.IMultiInstanceInvalidationCallback");
            parcelObtain.writeStringArray(strArr);
            this.f9569c.transact(1, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }
}

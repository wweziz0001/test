package c;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
public final class c extends Binder implements InterfaceC0315b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f4956d = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ d f4957c;

    public c(d dVar) {
        this.f4957c = dVar;
        attachInterface(this, InterfaceC0315b.f4955b);
    }

    @Override // c.InterfaceC0315b
    public final void a0(int i, Bundle bundle) {
        d dVar = this.f4957c;
        dVar.getClass();
        dVar.d(i, bundle);
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i5) {
        String str = InterfaceC0315b.f4955b;
        if (i >= 1 && i <= 16777215) {
            parcel.enforceInterface(str);
        }
        if (i == 1598968902) {
            parcel2.writeString(str);
            return true;
        }
        if (i != 1) {
            return super.onTransact(i, parcel, parcel2, i5);
        }
        a0(parcel.readInt(), (Bundle) (parcel.readInt() != 0 ? Bundle.CREATOR.createFromParcel(parcel) : null));
        return true;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }
}

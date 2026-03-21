package s1;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import androidx.room.MultiInstanceInvalidationService;

/* JADX INFO: loaded from: classes.dex */
public final class g extends Binder implements IInterface {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ MultiInstanceInvalidationService f9582c;

    public g(MultiInstanceInvalidationService multiInstanceInvalidationService) {
        this.f9582c = multiInstanceInvalidationService;
        attachInterface(this, "androidx.room.IMultiInstanceInvalidationService");
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i5) {
        if (i >= 1 && i <= 16777215) {
            parcel.enforceInterface("androidx.room.IMultiInstanceInvalidationService");
        }
        if (i == 1598968902) {
            parcel2.writeString("androidx.room.IMultiInstanceInvalidationService");
            return true;
        }
        C0788d c0788d = null;
        if (i == 1) {
            IBinder strongBinder = parcel.readStrongBinder();
            if (strongBinder != null) {
                IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("androidx.room.IMultiInstanceInvalidationCallback");
                if (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof C0788d)) {
                    c0788d = new C0788d();
                    c0788d.f9569c = strongBinder;
                } else {
                    c0788d = (C0788d) iInterfaceQueryLocalInterface;
                }
            }
            String string = parcel.readString();
            N3.h.e(c0788d, "callback");
            int i6 = 0;
            if (string != null) {
                MultiInstanceInvalidationService multiInstanceInvalidationService = this.f9582c;
                synchronized (multiInstanceInvalidationService.f4764n) {
                    try {
                        int i7 = multiInstanceInvalidationService.f4762l + 1;
                        multiInstanceInvalidationService.f4762l = i7;
                        if (multiInstanceInvalidationService.f4764n.register(c0788d, Integer.valueOf(i7))) {
                            multiInstanceInvalidationService.f4763m.put(Integer.valueOf(i7), string);
                            i6 = i7;
                        } else {
                            multiInstanceInvalidationService.f4762l--;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            parcel2.writeNoException();
            parcel2.writeInt(i6);
        } else if (i == 2) {
            IBinder strongBinder2 = parcel.readStrongBinder();
            if (strongBinder2 != null) {
                IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("androidx.room.IMultiInstanceInvalidationCallback");
                if (iInterfaceQueryLocalInterface2 == null || !(iInterfaceQueryLocalInterface2 instanceof C0788d)) {
                    c0788d = new C0788d();
                    c0788d.f9569c = strongBinder2;
                } else {
                    c0788d = (C0788d) iInterfaceQueryLocalInterface2;
                }
            }
            int i8 = parcel.readInt();
            N3.h.e(c0788d, "callback");
            MultiInstanceInvalidationService multiInstanceInvalidationService2 = this.f9582c;
            synchronized (multiInstanceInvalidationService2.f4764n) {
                multiInstanceInvalidationService2.f4764n.unregister(c0788d);
            }
            parcel2.writeNoException();
        } else {
            if (i != 3) {
                return super.onTransact(i, parcel, parcel2, i5);
            }
            int i9 = parcel.readInt();
            String[] strArrCreateStringArray = parcel.createStringArray();
            N3.h.e(strArrCreateStringArray, "tables");
            MultiInstanceInvalidationService multiInstanceInvalidationService3 = this.f9582c;
            synchronized (multiInstanceInvalidationService3.f4764n) {
                String str = (String) multiInstanceInvalidationService3.f4763m.get(Integer.valueOf(i9));
                if (str == null) {
                    Log.w("ROOM", "Remote invalidation client ID not registered");
                } else {
                    int iBeginBroadcast = multiInstanceInvalidationService3.f4764n.beginBroadcast();
                    for (int i10 = 0; i10 < iBeginBroadcast; i10++) {
                        try {
                            Object broadcastCookie = multiInstanceInvalidationService3.f4764n.getBroadcastCookie(i10);
                            N3.h.c(broadcastCookie, "null cannot be cast to non-null type kotlin.Int");
                            Integer num = (Integer) broadcastCookie;
                            int iIntValue = num.intValue();
                            String str2 = (String) multiInstanceInvalidationService3.f4763m.get(num);
                            if (i9 != iIntValue && str.equals(str2)) {
                                try {
                                    ((C0788d) multiInstanceInvalidationService3.f4764n.getBroadcastItem(i10)).e0(strArrCreateStringArray);
                                } catch (RemoteException e5) {
                                    Log.w("ROOM", "Error invoking a remote callback", e5);
                                }
                            }
                        } finally {
                            multiInstanceInvalidationService3.f4764n.finishBroadcast();
                        }
                    }
                }
            }
        }
        return true;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }
}

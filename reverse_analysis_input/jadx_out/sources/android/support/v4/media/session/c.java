package android.support.v4.media.session;

import android.app.PendingIntent;
import android.os.IBinder;
import android.os.Parcel;
import android.view.KeyEvent;

/* JADX INFO: loaded from: classes.dex */
public final class c implements d {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public IBinder f3701c;

    @Override // android.support.v4.media.session.d
    public final PendingIntent J() {
        throw null;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f3701c;
    }

    @Override // android.support.v4.media.session.d
    public final boolean d0(KeyEvent keyEvent) {
        throw null;
    }

    @Override // android.support.v4.media.session.d
    public final void j(InterfaceC0208b interfaceC0208b) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
            parcelObtain.writeStrongInterface(interfaceC0208b);
            this.f3701c.transact(3, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // android.support.v4.media.session.d
    public final void p(InterfaceC0208b interfaceC0208b) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
            parcelObtain.writeStrongInterface(interfaceC0208b);
            this.f3701c.transact(4, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }
}

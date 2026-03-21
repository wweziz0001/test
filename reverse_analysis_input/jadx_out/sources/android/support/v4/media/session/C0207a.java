package android.support.v4.media.session;

import android.os.IBinder;
import android.os.Parcel;
import android.support.v4.media.MediaMetadataCompat;
import java.util.List;

/* JADX INFO: renamed from: android.support.v4.media.session.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0207a implements InterfaceC0208b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public IBinder f3700c;

    @Override // android.support.v4.media.session.InterfaceC0208b
    public final void N(boolean z4) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
            parcelObtain.writeInt(z4 ? 1 : 0);
            this.f3700c.transact(11, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // android.support.v4.media.session.InterfaceC0208b
    public final void T(int i) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
            parcelObtain.writeInt(i);
            this.f3700c.transact(12, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // android.support.v4.media.session.InterfaceC0208b
    public final void V(PlaybackStateCompat playbackStateCompat) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
            D1.b.W(parcelObtain, playbackStateCompat);
            this.f3700c.transact(3, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f3700c;
    }

    @Override // android.support.v4.media.session.InterfaceC0208b
    public final void c0(ParcelableVolumeInfo parcelableVolumeInfo) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
            D1.b.W(parcelObtain, parcelableVolumeInfo);
            this.f3700c.transact(8, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // android.support.v4.media.session.InterfaceC0208b
    public final void d(List list) {
        throw null;
    }

    @Override // android.support.v4.media.session.InterfaceC0208b
    public final void n() {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
            this.f3700c.transact(2, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // android.support.v4.media.session.InterfaceC0208b
    public final void onRepeatModeChanged(int i) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
            parcelObtain.writeInt(i);
            this.f3700c.transact(9, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // android.support.v4.media.session.InterfaceC0208b
    public final void r(MediaMetadataCompat mediaMetadataCompat) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
            D1.b.W(parcelObtain, mediaMetadataCompat);
            this.f3700c.transact(4, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }
}

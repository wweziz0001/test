package android.support.v4.media.session;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.support.v4.media.MediaMetadataCompat;
import android.text.TextUtils;
import java.lang.ref.WeakReference;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class h extends Binder implements InterfaceC0208b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final WeakReference f3705c;

    public h(g gVar) {
        attachInterface(this, "android.support.v4.media.session.IMediaControllerCallback");
        this.f3705c = new WeakReference(gVar);
    }

    @Override // android.support.v4.media.session.InterfaceC0208b
    public final void N(boolean z4) {
        g gVar = (g) this.f3705c.get();
        if (gVar != null) {
            gVar.postToHandler(11, Boolean.valueOf(z4), null);
        }
    }

    @Override // android.support.v4.media.session.InterfaceC0208b
    public final void T(int i) {
        g gVar = (g) this.f3705c.get();
        if (gVar != null) {
            gVar.postToHandler(12, Integer.valueOf(i), null);
        }
    }

    @Override // android.support.v4.media.session.InterfaceC0208b
    public final void U(Bundle bundle) {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.InterfaceC0208b
    public final void V(PlaybackStateCompat playbackStateCompat) {
        g gVar = (g) this.f3705c.get();
        if (gVar != null) {
            gVar.postToHandler(2, playbackStateCompat, null);
        }
    }

    @Override // android.support.v4.media.session.InterfaceC0208b
    public final void c0(ParcelableVolumeInfo parcelableVolumeInfo) {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.InterfaceC0208b
    public final void d(List list) {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.InterfaceC0208b
    public final void g(CharSequence charSequence) {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.InterfaceC0208b
    public final void n() {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.InterfaceC0208b
    public final void onRepeatModeChanged(int i) {
        g gVar = (g) this.f3705c.get();
        if (gVar != null) {
            gVar.postToHandler(9, Integer.valueOf(i), null);
        }
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i5) {
        if (i >= 1 && i <= 16777215) {
            parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
        }
        if (i == 1598968902) {
            parcel2.writeString("android.support.v4.media.session.IMediaControllerCallback");
            return true;
        }
        WeakReference weakReference = this.f3705c;
        switch (i) {
            case 1:
                String string = parcel.readString();
                Bundle bundle = (Bundle) D1.b.a(parcel, Bundle.CREATOR);
                g gVar = (g) weakReference.get();
                if (gVar != null) {
                    gVar.postToHandler(1, string, bundle);
                }
                return true;
            case 2:
                n();
                return true;
            case 3:
                V((PlaybackStateCompat) D1.b.a(parcel, PlaybackStateCompat.CREATOR));
                return true;
            case 4:
                r((MediaMetadataCompat) D1.b.a(parcel, MediaMetadataCompat.CREATOR));
                return true;
            case 5:
                d(parcel.createTypedArrayList(MediaSessionCompat$QueueItem.CREATOR));
                return true;
            case O.j.STRING_SET_FIELD_NUMBER /* 6 */:
                g((CharSequence) D1.b.a(parcel, TextUtils.CHAR_SEQUENCE_CREATOR));
                return true;
            case O.j.DOUBLE_FIELD_NUMBER /* 7 */:
                U((Bundle) D1.b.a(parcel, Bundle.CREATOR));
                return true;
            case O.j.BYTES_FIELD_NUMBER /* 8 */:
                c0((ParcelableVolumeInfo) D1.b.a(parcel, ParcelableVolumeInfo.CREATOR));
                return true;
            case 9:
                onRepeatModeChanged(parcel.readInt());
                return true;
            case 10:
                parcel.readInt();
                return true;
            case 11:
                N(parcel.readInt() != 0);
                return true;
            case 12:
                T(parcel.readInt());
                return true;
            case 13:
                g gVar2 = (g) weakReference.get();
                if (gVar2 != null) {
                    gVar2.postToHandler(13, null, null);
                }
                return true;
            default:
                return super.onTransact(i, parcel, parcel2, i5);
        }
    }

    @Override // android.support.v4.media.session.InterfaceC0208b
    public final void r(MediaMetadataCompat mediaMetadataCompat) {
        throw new AssertionError();
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }
}

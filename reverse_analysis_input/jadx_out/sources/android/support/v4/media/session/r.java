package android.support.v4.media.session;

import Q1.C;
import android.app.PendingIntent;
import android.net.Uri;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.support.v4.media.MediaDescriptionCompat;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.RatingCompat;
import android.text.TextUtils;
import android.view.KeyEvent;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public final class r extends Binder implements d {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f3716d = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AtomicReference f3717c;

    public r(s sVar) {
        attachInterface(this, "android.support.v4.media.session.IMediaSession");
        this.f3717c = new AtomicReference(sVar);
    }

    @Override // android.support.v4.media.session.d
    public final void A(String str, Bundle bundle) {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.d
    public final void B(int i, int i5) {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.d
    public final ParcelableVolumeInfo C() {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.d
    public final void D() {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.d
    public final Bundle E() {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.d
    public final void F(Uri uri, Bundle bundle) {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.d
    public final void G(MediaDescriptionCompat mediaDescriptionCompat) {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.d
    public final boolean H() {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.d
    public final void I(MediaDescriptionCompat mediaDescriptionCompat) {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.d
    public final PendingIntent J() {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.d
    public final int K() {
        s sVar = (s) this.f3717c.get();
        if (sVar != null) {
            return sVar.f3727k;
        }
        return -1;
    }

    @Override // android.support.v4.media.session.d
    public final void L(long j5) {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.d
    public final void M(int i) {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.d
    public final void O(int i) {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.d
    public final void P() {
    }

    @Override // android.support.v4.media.session.d
    public final void Q(String str, Bundle bundle) {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.d
    public final boolean R() {
        s sVar = (s) this.f3717c.get();
        return sVar != null && sVar.i;
    }

    @Override // android.support.v4.media.session.d
    public final String S() {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.d
    public final void W() {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.d
    public final void X(float f2) {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.d
    public final void Y(String str, Bundle bundle, MediaSessionCompat$ResultReceiverWrapper mediaSessionCompat$ResultReceiverWrapper) {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.d
    public final List Z() {
        return null;
    }

    @Override // android.support.v4.media.session.d
    public final void a() {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.d
    public final PlaybackStateCompat b() {
        s sVar = (s) this.f3717c.get();
        if (sVar == null) {
            return null;
        }
        PlaybackStateCompat playbackStateCompat = sVar.f3723f;
        MediaMetadataCompat mediaMetadataCompat = sVar.f3725h;
        if (playbackStateCompat == null) {
            return playbackStateCompat;
        }
        long j5 = playbackStateCompat.f3684m;
        long j6 = -1;
        if (j5 == -1) {
            return playbackStateCompat;
        }
        int i = playbackStateCompat.f3683l;
        if (i != 3 && i != 4 && i != 5) {
            return playbackStateCompat;
        }
        if (playbackStateCompat.f3690s <= 0) {
            return playbackStateCompat;
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        long j7 = ((long) (playbackStateCompat.f3686o * (jElapsedRealtime - r7))) + j5;
        if (mediaMetadataCompat != null) {
            Bundle bundle = mediaMetadataCompat.f3650l;
            if (bundle.containsKey("android.media.metadata.DURATION")) {
                j6 = bundle.getLong("android.media.metadata.DURATION", 0L);
            }
        }
        long j8 = (j6 < 0 || j7 <= j6) ? j7 < 0 ? 0L : j7 : j6;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = playbackStateCompat.f3691t;
        if (arrayList2 != null) {
            arrayList.addAll(arrayList2);
        }
        return new PlaybackStateCompat(playbackStateCompat.f3683l, j8, playbackStateCompat.f3685n, playbackStateCompat.f3686o, playbackStateCompat.f3687p, playbackStateCompat.f3688q, playbackStateCompat.f3689r, jElapsedRealtime, arrayList, playbackStateCompat.f3692u, playbackStateCompat.f3693v);
    }

    @Override // android.support.v4.media.session.d
    public final void b0(int i, int i5) {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.d
    public final void c() {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.d
    public final boolean d0(KeyEvent keyEvent) {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.d
    public final void e(int i) {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.d
    public final void f() {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.d
    public final CharSequence h() {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.d
    public final void i(String str, Bundle bundle) {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.d
    public final void j(InterfaceC0208b interfaceC0208b) {
        s sVar = (s) this.f3717c.get();
        if (sVar == null) {
            return;
        }
        sVar.f3722e.register(interfaceC0208b, new androidx.media.B(Binder.getCallingPid(), "android.media.session.MediaController", Binder.getCallingUid()));
        synchronized (sVar.f3721d) {
        }
    }

    @Override // android.support.v4.media.session.d
    public final void k(RatingCompat ratingCompat, Bundle bundle) {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.d
    public final MediaMetadataCompat l() {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.d
    public final void m(String str, Bundle bundle) {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.d
    public final void next() {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.d
    public final Bundle o() {
        ((s) this.f3717c.get()).getClass();
        return null;
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i5) {
        if (i >= 1 && i <= 16777215) {
            parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
        }
        if (i == 1598968902) {
            parcel2.writeString("android.support.v4.media.session.IMediaSession");
            return true;
        }
        InterfaceC0208b interfaceC0208b = null;
        InterfaceC0208b interfaceC0208b2 = null;
        switch (i) {
            case 1:
                Y(parcel.readString(), (Bundle) C.b(parcel, Bundle.CREATOR), (MediaSessionCompat$ResultReceiverWrapper) C.b(parcel, MediaSessionCompat$ResultReceiverWrapper.CREATOR));
                parcel2.writeNoException();
                return true;
            case 2:
                boolean zD0 = d0((KeyEvent) C.b(parcel, KeyEvent.CREATOR));
                parcel2.writeNoException();
                parcel2.writeInt(zD0 ? 1 : 0);
                return true;
            case 3:
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder != null) {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("android.support.v4.media.session.IMediaControllerCallback");
                    if (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof InterfaceC0208b)) {
                        C0207a c0207a = new C0207a();
                        c0207a.f3700c = strongBinder;
                        interfaceC0208b = c0207a;
                    } else {
                        interfaceC0208b = (InterfaceC0208b) iInterfaceQueryLocalInterface;
                    }
                }
                j(interfaceC0208b);
                parcel2.writeNoException();
                return true;
            case 4:
                IBinder strongBinder2 = parcel.readStrongBinder();
                if (strongBinder2 != null) {
                    IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("android.support.v4.media.session.IMediaControllerCallback");
                    if (iInterfaceQueryLocalInterface2 == null || !(iInterfaceQueryLocalInterface2 instanceof InterfaceC0208b)) {
                        C0207a c0207a2 = new C0207a();
                        c0207a2.f3700c = strongBinder2;
                        interfaceC0208b2 = c0207a2;
                    } else {
                        interfaceC0208b2 = (InterfaceC0208b) iInterfaceQueryLocalInterface2;
                    }
                }
                p(interfaceC0208b2);
                parcel2.writeNoException();
                return true;
            case 5:
                boolean zH = H();
                parcel2.writeNoException();
                parcel2.writeInt(zH ? 1 : 0);
                return true;
            case O.j.STRING_SET_FIELD_NUMBER /* 6 */:
                String strS = S();
                parcel2.writeNoException();
                parcel2.writeString(strS);
                return true;
            case O.j.DOUBLE_FIELD_NUMBER /* 7 */:
                String strS2 = s();
                parcel2.writeNoException();
                parcel2.writeString(strS2);
                return true;
            case O.j.BYTES_FIELD_NUMBER /* 8 */:
                PendingIntent pendingIntentJ = J();
                parcel2.writeNoException();
                C.D0(parcel2, pendingIntentJ, 1);
                return true;
            case 9:
                long jW = w();
                parcel2.writeNoException();
                parcel2.writeLong(jW);
                return true;
            case 10:
                ParcelableVolumeInfo parcelableVolumeInfoC = C();
                parcel2.writeNoException();
                C.D0(parcel2, parcelableVolumeInfoC, 1);
                return true;
            case 11:
                int i6 = parcel.readInt();
                int i7 = parcel.readInt();
                parcel.readString();
                b0(i6, i7);
                parcel2.writeNoException();
                return true;
            case 12:
                int i8 = parcel.readInt();
                int i9 = parcel.readInt();
                parcel.readString();
                B(i8, i9);
                parcel2.writeNoException();
                return true;
            case 13:
                W();
                parcel2.writeNoException();
                return true;
            case 14:
                v(parcel.readString(), (Bundle) C.b(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                return true;
            case 15:
                A(parcel.readString(), (Bundle) C.b(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                return true;
            case 16:
                F((Uri) C.b(parcel, Uri.CREATOR), (Bundle) C.b(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                return true;
            case 17:
                z(parcel.readLong());
                parcel2.writeNoException();
                return true;
            case 18:
                a();
                parcel2.writeNoException();
                return true;
            case 19:
                stop();
                parcel2.writeNoException();
                return true;
            case 20:
                next();
                parcel2.writeNoException();
                return true;
            case 21:
                previous();
                parcel2.writeNoException();
                return true;
            case 22:
                D();
                parcel2.writeNoException();
                return true;
            case 23:
                f();
                parcel2.writeNoException();
                return true;
            case 24:
                L(parcel.readLong());
                parcel2.writeNoException();
                return true;
            case 25:
                u((RatingCompat) C.b(parcel, RatingCompat.CREATOR));
                parcel2.writeNoException();
                return true;
            case 26:
                i(parcel.readString(), (Bundle) C.b(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                return true;
            case 27:
                MediaMetadataCompat mediaMetadataCompatL = l();
                parcel2.writeNoException();
                C.D0(parcel2, mediaMetadataCompatL, 1);
                return true;
            case 28:
                PlaybackStateCompat playbackStateCompatB = b();
                parcel2.writeNoException();
                C.D0(parcel2, playbackStateCompatB, 1);
                return true;
            case 29:
                List listZ = Z();
                parcel2.writeNoException();
                if (listZ == null) {
                    parcel2.writeInt(-1);
                } else {
                    int size = listZ.size();
                    parcel2.writeInt(size);
                    for (int i10 = 0; i10 < size; i10++) {
                        C.D0(parcel2, (Parcelable) listZ.get(i10), 1);
                    }
                }
                return true;
            case 30:
                CharSequence charSequenceH = h();
                parcel2.writeNoException();
                if (charSequenceH != null) {
                    parcel2.writeInt(1);
                    TextUtils.writeToParcel(charSequenceH, parcel2, 1);
                } else {
                    parcel2.writeInt(0);
                }
                return true;
            case 31:
                Bundle bundleE = E();
                parcel2.writeNoException();
                C.D0(parcel2, bundleE, 1);
                return true;
            case 32:
                P();
                parcel2.writeNoException();
                parcel2.writeInt(0);
                return true;
            case 33:
                c();
                parcel2.writeNoException();
                return true;
            case 34:
                m(parcel.readString(), (Bundle) C.b(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                return true;
            case 35:
                Q(parcel.readString(), (Bundle) C.b(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                return true;
            case 36:
                x((Uri) C.b(parcel, Uri.CREATOR), (Bundle) C.b(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                return true;
            case 37:
                int iY = y();
                parcel2.writeNoException();
                parcel2.writeInt(iY);
                return true;
            case 38:
                parcel2.writeNoException();
                parcel2.writeInt(0);
                return true;
            case 39:
                e(parcel.readInt());
                parcel2.writeNoException();
                return true;
            case 40:
                parcel.readInt();
                parcel2.writeNoException();
                return true;
            case 41:
                I((MediaDescriptionCompat) C.b(parcel, MediaDescriptionCompat.CREATOR));
                parcel2.writeNoException();
                return true;
            case 42:
                q((MediaDescriptionCompat) C.b(parcel, MediaDescriptionCompat.CREATOR), parcel.readInt());
                parcel2.writeNoException();
                return true;
            case 43:
                G((MediaDescriptionCompat) C.b(parcel, MediaDescriptionCompat.CREATOR));
                parcel2.writeNoException();
                return true;
            case 44:
                O(parcel.readInt());
                parcel2.writeNoException();
                return true;
            case 45:
                boolean zR = R();
                parcel2.writeNoException();
                parcel2.writeInt(zR ? 1 : 0);
                return true;
            case 46:
                t(parcel.readInt() != 0);
                parcel2.writeNoException();
                return true;
            case 47:
                int iK = K();
                parcel2.writeNoException();
                parcel2.writeInt(iK);
                return true;
            case 48:
                M(parcel.readInt());
                parcel2.writeNoException();
                return true;
            case 49:
                X(parcel.readFloat());
                parcel2.writeNoException();
                return true;
            case 50:
                Bundle bundleO = o();
                parcel2.writeNoException();
                C.D0(parcel2, bundleO, 1);
                return true;
            case 51:
                k((RatingCompat) C.b(parcel, RatingCompat.CREATOR), (Bundle) C.b(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                return true;
            default:
                return super.onTransact(i, parcel, parcel2, i5);
        }
    }

    @Override // android.support.v4.media.session.d
    public final void p(InterfaceC0208b interfaceC0208b) {
        s sVar = (s) this.f3717c.get();
        if (sVar == null) {
            return;
        }
        sVar.f3722e.unregister(interfaceC0208b);
        Binder.getCallingPid();
        Binder.getCallingUid();
        synchronized (sVar.f3721d) {
        }
    }

    @Override // android.support.v4.media.session.d
    public final void previous() {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.d
    public final void q(MediaDescriptionCompat mediaDescriptionCompat, int i) {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.d
    public final String s() {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.d
    public final void stop() {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.d
    public final void t(boolean z4) {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.d
    public final void u(RatingCompat ratingCompat) {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.d
    public final void v(String str, Bundle bundle) {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.d
    public final long w() {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.d
    public final void x(Uri uri, Bundle bundle) {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.d
    public final int y() {
        s sVar = (s) this.f3717c.get();
        if (sVar != null) {
            return sVar.f3726j;
        }
        return -1;
    }

    @Override // android.support.v4.media.session.d
    public final void z(long j5) {
        throw new AssertionError();
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }
}

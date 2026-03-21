package a0;

import android.content.Intent;
import android.content.IntentSender;
import android.media.MediaDescription;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.MediaBrowserCompat$MediaItem;
import android.support.v4.media.MediaDescriptionCompat;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.RatingCompat;
import androidx.fragment.app.C0235b;
import androidx.fragment.app.C0236c;
import c.C0314a;
import c.InterfaceC0315b;
import e.C0379a;
import e.C0388j;
import e0.C0389a;
import java.util.ArrayList;
import r1.C0756G;
import r1.C0758I;
import r1.C0770k;

/* JADX INFO: renamed from: a0.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0184j implements Parcelable.Creator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3352a;

    public /* synthetic */ C0184j(int i) {
        this.f3352a = i;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        InterfaceC0315b interfaceC0315b = null;
        switch (this.f3352a) {
            case 0:
                return new C0185k(parcel);
            case 1:
                return new C0155F(parcel);
            case 2:
                return new C0165P(parcel);
            case 3:
                return new MediaBrowserCompat$MediaItem(parcel);
            case 4:
                return MediaDescriptionCompat.d(MediaDescription.CREATOR.createFromParcel(parcel));
            case 5:
                return new MediaMetadataCompat(parcel);
            case O.j.STRING_SET_FIELD_NUMBER /* 6 */:
                return new RatingCompat(parcel.readFloat(), parcel.readInt());
            case O.j.DOUBLE_FIELD_NUMBER /* 7 */:
                return new C0235b(parcel);
            case O.j.BYTES_FIELD_NUMBER /* 8 */:
                return new C0236c(parcel);
            case 9:
                androidx.fragment.app.I i = new androidx.fragment.app.I();
                i.f4235l = parcel.readString();
                i.f4236m = parcel.readInt();
                return i;
            case 10:
                androidx.fragment.app.N n4 = new androidx.fragment.app.N();
                n4.f4280p = null;
                n4.f4281q = new ArrayList();
                n4.f4282r = new ArrayList();
                n4.f4276l = parcel.createStringArrayList();
                n4.f4277m = parcel.createStringArrayList();
                n4.f4278n = (C0235b[]) parcel.createTypedArray(C0235b.CREATOR);
                n4.f4279o = parcel.readInt();
                n4.f4280p = parcel.readString();
                n4.f4281q = parcel.createStringArrayList();
                n4.f4282r = parcel.createTypedArrayList(C0236c.CREATOR);
                n4.f4283s = parcel.createTypedArrayList(androidx.fragment.app.I.CREATOR);
                return n4;
            case 11:
                return new androidx.fragment.app.Q(parcel);
            case 12:
                c.d dVar = new c.d();
                IBinder strongBinder = parcel.readStrongBinder();
                int i5 = c.c.f4956d;
                if (strongBinder != null) {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface(InterfaceC0315b.f4955b);
                    if (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof InterfaceC0315b)) {
                        C0314a c0314a = new C0314a();
                        c0314a.f4954c = strongBinder;
                        interfaceC0315b = c0314a;
                    } else {
                        interfaceC0315b = (InterfaceC0315b) iInterfaceQueryLocalInterface;
                    }
                }
                dVar.f4958l = interfaceC0315b;
                return dVar;
            case 13:
                return new C0379a(parcel);
            case 14:
                N3.h.e(parcel, "inParcel");
                Parcelable parcelable = parcel.readParcelable(IntentSender.class.getClassLoader());
                N3.h.b(parcelable);
                return new C0388j((IntentSender) parcelable, (Intent) parcel.readParcelable(Intent.class.getClassLoader()), parcel.readInt(), parcel.readInt());
            case 15:
                return new C0389a(parcel);
            case 16:
                return new e0.e(parcel);
            case 17:
                return new e0.f(parcel);
            case 18:
                return new n0.s(parcel);
            case 19:
                return new n0.r(parcel);
            case 20:
                C0770k c0770k = new C0770k();
                c0770k.f9501l = parcel.readInt();
                c0770k.f9502m = parcel.readInt();
                c0770k.f9503n = parcel.readInt() == 1;
                return c0770k;
            case 21:
                C0756G c0756g = new C0756G();
                c0756g.f9433l = parcel.readInt();
                c0756g.f9434m = parcel.readInt();
                c0756g.f9436o = parcel.readInt() == 1;
                int i6 = parcel.readInt();
                if (i6 > 0) {
                    int[] iArr = new int[i6];
                    c0756g.f9435n = iArr;
                    parcel.readIntArray(iArr);
                }
                return c0756g;
            default:
                C0758I c0758i = new C0758I();
                c0758i.f9438l = parcel.readInt();
                c0758i.f9439m = parcel.readInt();
                int i7 = parcel.readInt();
                c0758i.f9440n = i7;
                if (i7 > 0) {
                    int[] iArr2 = new int[i7];
                    c0758i.f9441o = iArr2;
                    parcel.readIntArray(iArr2);
                }
                int i8 = parcel.readInt();
                c0758i.f9442p = i8;
                if (i8 > 0) {
                    int[] iArr3 = new int[i8];
                    c0758i.f9443q = iArr3;
                    parcel.readIntArray(iArr3);
                }
                c0758i.f9445s = parcel.readInt() == 1;
                c0758i.f9446t = parcel.readInt() == 1;
                c0758i.f9447u = parcel.readInt() == 1;
                c0758i.f9444r = parcel.readArrayList(C0756G.class.getClassLoader());
                return c0758i;
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.f3352a) {
            case 0:
                return new C0185k[i];
            case 1:
                return new C0155F[i];
            case 2:
                return new C0165P[i];
            case 3:
                return new MediaBrowserCompat$MediaItem[i];
            case 4:
                return new MediaDescriptionCompat[i];
            case 5:
                return new MediaMetadataCompat[i];
            case O.j.STRING_SET_FIELD_NUMBER /* 6 */:
                return new RatingCompat[i];
            case O.j.DOUBLE_FIELD_NUMBER /* 7 */:
                return new C0235b[i];
            case O.j.BYTES_FIELD_NUMBER /* 8 */:
                return new C0236c[i];
            case 9:
                return new androidx.fragment.app.I[i];
            case 10:
                return new androidx.fragment.app.N[i];
            case 11:
                return new androidx.fragment.app.Q[i];
            case 12:
                return new c.d[i];
            case 13:
                return new C0379a[i];
            case 14:
                return new C0388j[i];
            case 15:
                return new C0389a[i];
            case 16:
                return new e0.e[i];
            case 17:
                return new e0.f[i];
            case 18:
                return new n0.s[i];
            case 19:
                return new n0.r[i];
            case 20:
                return new C0770k[i];
            case 21:
                return new C0756G[i];
            default:
                return new C0758I[i];
        }
    }
}

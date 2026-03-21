package K;

import android.os.Parcel;
import android.os.Parcelable;
import m.C0628z0;
import m.R0;
import r1.z;

/* JADX INFO: loaded from: classes.dex */
public final class b implements Parcelable.ClassLoaderCreator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1205a;

    public /* synthetic */ b(int i) {
        this.f1205a = i;
    }

    @Override // android.os.Parcelable.ClassLoaderCreator
    public final Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
        switch (this.f1205a) {
            case 0:
                if (parcel.readParcelable(classLoader) == null) {
                    return c.f1206m;
                }
                throw new IllegalStateException("superState must be null");
            case 1:
                return new C0628z0(parcel, classLoader);
            case 2:
                return new R0(parcel, classLoader);
            default:
                return new z(parcel, classLoader);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.f1205a) {
            case 0:
                return new c[i];
            case 1:
                return new C0628z0[i];
            case 2:
                return new R0[i];
            default:
                return new z[i];
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f1205a) {
            case 0:
                if (parcel.readParcelable(null) == null) {
                    return c.f1206m;
                }
                throw new IllegalStateException("superState must be null");
            case 1:
                return new C0628z0(parcel, null);
            case 2:
                return new R0(parcel, null);
            default:
                return new z(parcel, null);
        }
    }
}

package D1;

import I.i;
import O.j;
import T0.f;
import T0.k;
import T0.l;
import T0.m;
import T0.n;
import T0.o;
import a0.C0186l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.versionedparcelable.ParcelImpl;
import java.util.ArrayList;
import m2.I;

/* JADX INFO: loaded from: classes.dex */
public final class a implements Parcelable.Creator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f541a;

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f541a) {
            case 0:
                return new ParcelImpl(parcel);
            case 1:
                i iVar = new i(parcel);
                iVar.f1007l = parcel.readInt();
                return iVar;
            case 2:
                String string = parcel.readString();
                string.getClass();
                return new P0.a(string, parcel.readInt());
            case 3:
                return new Q0.a(parcel);
            case 4:
                return new R0.a(parcel);
            case 5:
                return new R0.b(parcel);
            case j.STRING_SET_FIELD_NUMBER /* 6 */:
                return new S0.b(parcel);
            case j.DOUBLE_FIELD_NUMBER /* 7 */:
                return new S0.c(parcel);
            case j.BYTES_FIELD_NUMBER /* 8 */:
                return new T0.a(parcel);
            case 9:
                return new T0.b(parcel);
            case 10:
                return new T0.c(parcel);
            case 11:
                return new T0.d(parcel);
            case 12:
                return new T0.e(parcel);
            case 13:
                return new f(parcel);
            case 14:
                return new k(parcel);
            case 15:
                return new l(parcel);
            case 16:
                return new m(parcel);
            case 17:
                String string2 = parcel.readString();
                string2.getClass();
                String string3 = parcel.readString();
                String[] strArrCreateStringArray = parcel.createStringArray();
                strArrCreateStringArray.getClass();
                return new n(string2, string3, I.q(strArrCreateStringArray));
            case 18:
                return new o(parcel);
            case 19:
                return new U0.a(parcel);
            case 20:
                ArrayList arrayList = new ArrayList();
                parcel.readList(arrayList, U0.b.class.getClassLoader());
                return new U0.c(arrayList);
            case 21:
                return new U0.b(parcel.readInt(), parcel.readLong(), parcel.readLong());
            case 22:
                return new U0.d(parcel);
            case 23:
                return new V0.a(parcel);
            case 24:
                return new V0.e(parcel);
            case 25:
                return new V0.f();
            case 26:
                return new V0.i(parcel);
            case 27:
                return new V0.j(parcel.readLong(), parcel.readLong());
            case 28:
                return new W0.a(parcel);
            default:
                return new C0186l(parcel);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.f541a) {
            case 0:
                return new ParcelImpl[i];
            case 1:
                return new i[i];
            case 2:
                return new P0.a[i];
            case 3:
                return new Q0.a[i];
            case 4:
                return new R0.a[i];
            case 5:
                return new R0.b[i];
            case j.STRING_SET_FIELD_NUMBER /* 6 */:
                return new S0.b[i];
            case j.DOUBLE_FIELD_NUMBER /* 7 */:
                return new S0.c[i];
            case j.BYTES_FIELD_NUMBER /* 8 */:
                return new T0.a[i];
            case 9:
                return new T0.b[i];
            case 10:
                return new T0.c[i];
            case 11:
                return new T0.d[i];
            case 12:
                return new T0.e[i];
            case 13:
                return new f[i];
            case 14:
                return new k[i];
            case 15:
                return new l[i];
            case 16:
                return new m[i];
            case 17:
                return new n[i];
            case 18:
                return new o[i];
            case 19:
                return new U0.a[i];
            case 20:
                return new U0.c[i];
            case 21:
                return new U0.b[i];
            case 22:
                return new U0.d[i];
            case 23:
                return new V0.a[i];
            case 24:
                return new V0.e[i];
            case 25:
                return new V0.f[i];
            case 26:
                return new V0.i[i];
            case 27:
                return new V0.j[i];
            case 28:
                return new W0.a[i];
            default:
                return new C0186l[i];
        }
    }
}

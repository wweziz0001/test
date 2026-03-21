package a0;

import android.os.Parcel;
import android.os.Parcelable;
import d0.AbstractC0370w;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: renamed from: a0.F, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0155F implements Parcelable {
    public static final Parcelable.Creator<C0155F> CREATOR = new C0184j(1);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final InterfaceC0154E[] f3211l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final long f3212m;

    public C0155F(InterfaceC0154E... interfaceC0154EArr) {
        this(-9223372036854775807L, interfaceC0154EArr);
    }

    public final C0155F d(InterfaceC0154E... interfaceC0154EArr) {
        if (interfaceC0154EArr.length == 0) {
            return this;
        }
        int i = AbstractC0370w.f5326a;
        InterfaceC0154E[] interfaceC0154EArr2 = this.f3211l;
        Object[] objArrCopyOf = Arrays.copyOf(interfaceC0154EArr2, interfaceC0154EArr2.length + interfaceC0154EArr.length);
        System.arraycopy(interfaceC0154EArr, 0, objArrCopyOf, interfaceC0154EArr2.length, interfaceC0154EArr.length);
        return new C0155F(this.f3212m, (InterfaceC0154E[]) objArrCopyOf);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final C0155F e(C0155F c0155f) {
        return c0155f == null ? this : d(c0155f.f3211l);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0155F.class != obj.getClass()) {
            return false;
        }
        C0155F c0155f = (C0155F) obj;
        return Arrays.equals(this.f3211l, c0155f.f3211l) && this.f3212m == c0155f.f3212m;
    }

    public final InterfaceC0154E f(int i) {
        return this.f3211l[i];
    }

    public final int g() {
        return this.f3211l.length;
    }

    public final int hashCode() {
        return Z1.f.x(this.f3212m) + (Arrays.hashCode(this.f3211l) * 31);
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("entries=");
        sb.append(Arrays.toString(this.f3211l));
        long j5 = this.f3212m;
        if (j5 == -9223372036854775807L) {
            str = "";
        } else {
            str = ", presentationTimeUs=" + j5;
        }
        sb.append(str);
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        InterfaceC0154E[] interfaceC0154EArr = this.f3211l;
        parcel.writeInt(interfaceC0154EArr.length);
        for (InterfaceC0154E interfaceC0154E : interfaceC0154EArr) {
            parcel.writeParcelable(interfaceC0154E, 0);
        }
        parcel.writeLong(this.f3212m);
    }

    public C0155F(long j5, InterfaceC0154E... interfaceC0154EArr) {
        this.f3212m = j5;
        this.f3211l = interfaceC0154EArr;
    }

    public C0155F(List list) {
        this((InterfaceC0154E[]) list.toArray(new InterfaceC0154E[0]));
    }

    public C0155F(Parcel parcel) {
        this.f3211l = new InterfaceC0154E[parcel.readInt()];
        int i = 0;
        while (true) {
            InterfaceC0154E[] interfaceC0154EArr = this.f3211l;
            if (i < interfaceC0154EArr.length) {
                interfaceC0154EArr[i] = (InterfaceC0154E) parcel.readParcelable(InterfaceC0154E.class.getClassLoader());
                i++;
            } else {
                this.f3212m = parcel.readLong();
                return;
            }
        }
    }
}

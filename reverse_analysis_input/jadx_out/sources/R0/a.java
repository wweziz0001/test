package R0;

import a0.AbstractC0156G;
import a0.C0152C;
import a0.InterfaceC0154E;
import android.os.Parcel;
import android.os.Parcelable;
import b3.AbstractC0307a;
import d0.AbstractC0370w;
import d0.C0363p;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class a implements InterfaceC0154E {
    public static final Parcelable.Creator<a> CREATOR = new D1.a(4);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f1851l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final String f1852m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final String f1853n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final int f1854o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final int f1855p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final int f1856q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final int f1857r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final byte[] f1858s;

    public a(int i, String str, String str2, int i5, int i6, int i7, int i8, byte[] bArr) {
        this.f1851l = i;
        this.f1852m = str;
        this.f1853n = str2;
        this.f1854o = i5;
        this.f1855p = i6;
        this.f1856q = i7;
        this.f1857r = i8;
        this.f1858s = bArr;
    }

    public static a d(C0363p c0363p) {
        int i = c0363p.i();
        String strM = AbstractC0156G.m(c0363p.t(c0363p.i(), StandardCharsets.US_ASCII));
        String strT = c0363p.t(c0363p.i(), StandardCharsets.UTF_8);
        int i5 = c0363p.i();
        int i6 = c0363p.i();
        int i7 = c0363p.i();
        int i8 = c0363p.i();
        int i9 = c0363p.i();
        byte[] bArr = new byte[i9];
        c0363p.g(bArr, 0, i9);
        return new a(i, strM, strT, i5, i6, i7, i8, bArr);
    }

    @Override // a0.InterfaceC0154E
    public final void b(C0152C c0152c) {
        c0152c.a(this.f1851l, this.f1858s);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || a.class != obj.getClass()) {
            return false;
        }
        a aVar = (a) obj;
        return this.f1851l == aVar.f1851l && this.f1852m.equals(aVar.f1852m) && this.f1853n.equals(aVar.f1853n) && this.f1854o == aVar.f1854o && this.f1855p == aVar.f1855p && this.f1856q == aVar.f1856q && this.f1857r == aVar.f1857r && Arrays.equals(this.f1858s, aVar.f1858s);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f1858s) + ((((((((AbstractC0307a.e(AbstractC0307a.e((527 + this.f1851l) * 31, this.f1852m, 31), this.f1853n, 31) + this.f1854o) * 31) + this.f1855p) * 31) + this.f1856q) * 31) + this.f1857r) * 31);
    }

    public final String toString() {
        return "Picture: mimeType=" + this.f1852m + ", description=" + this.f1853n;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f1851l);
        parcel.writeString(this.f1852m);
        parcel.writeString(this.f1853n);
        parcel.writeInt(this.f1854o);
        parcel.writeInt(this.f1855p);
        parcel.writeInt(this.f1856q);
        parcel.writeInt(this.f1857r);
        parcel.writeByteArray(this.f1858s);
    }

    public a(Parcel parcel) {
        this.f1851l = parcel.readInt();
        String string = parcel.readString();
        int i = AbstractC0370w.f5326a;
        this.f1852m = string;
        this.f1853n = parcel.readString();
        this.f1854o = parcel.readInt();
        this.f1855p = parcel.readInt();
        this.f1856q = parcel.readInt();
        this.f1857r = parcel.readInt();
        this.f1858s = parcel.createByteArray();
    }
}

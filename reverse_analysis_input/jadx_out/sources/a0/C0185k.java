package a0;

import android.os.Parcel;
import android.os.Parcelable;
import b3.AbstractC0307a;
import d0.AbstractC0370w;
import java.util.Arrays;
import java.util.Objects;
import java.util.UUID;

/* JADX INFO: renamed from: a0.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0185k implements Parcelable {
    public static final Parcelable.Creator<C0185k> CREATOR = new C0184j(0);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f3353l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final UUID f3354m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final String f3355n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final String f3356o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final byte[] f3357p;

    public C0185k(UUID uuid, String str, String str2, byte[] bArr) {
        uuid.getClass();
        this.f3354m = uuid;
        this.f3355n = str;
        str2.getClass();
        this.f3356o = AbstractC0156G.m(str2);
        this.f3357p = bArr;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C0185k)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        C0185k c0185k = (C0185k) obj;
        String str = c0185k.f3355n;
        int i = AbstractC0370w.f5326a;
        return Objects.equals(this.f3355n, str) && Objects.equals(this.f3356o, c0185k.f3356o) && Objects.equals(this.f3354m, c0185k.f3354m) && Arrays.equals(this.f3357p, c0185k.f3357p);
    }

    public final int hashCode() {
        if (this.f3353l == 0) {
            int iHashCode = this.f3354m.hashCode() * 31;
            String str = this.f3355n;
            this.f3353l = Arrays.hashCode(this.f3357p) + AbstractC0307a.e((iHashCode + (str == null ? 0 : str.hashCode())) * 31, this.f3356o, 31);
        }
        return this.f3353l;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        UUID uuid = this.f3354m;
        parcel.writeLong(uuid.getMostSignificantBits());
        parcel.writeLong(uuid.getLeastSignificantBits());
        parcel.writeString(this.f3355n);
        parcel.writeString(this.f3356o);
        parcel.writeByteArray(this.f3357p);
    }

    public C0185k(Parcel parcel) {
        this.f3354m = new UUID(parcel.readLong(), parcel.readLong());
        this.f3355n = parcel.readString();
        String string = parcel.readString();
        int i = AbstractC0370w.f5326a;
        this.f3356o = string;
        this.f3357p = parcel.createByteArray();
    }
}

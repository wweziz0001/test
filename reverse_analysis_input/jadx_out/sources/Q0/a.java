package Q0;

import a0.AbstractC0156G;
import a0.C0189o;
import a0.C0190p;
import a0.InterfaceC0154E;
import android.os.Parcel;
import android.os.Parcelable;
import d0.AbstractC0370w;
import java.util.Arrays;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class a implements InterfaceC0154E {
    public static final Parcelable.Creator<a> CREATOR;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final C0190p f1764r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final C0190p f1765s;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final String f1766l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final String f1767m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final long f1768n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final long f1769o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final byte[] f1770p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f1771q;

    static {
        C0189o c0189o = new C0189o();
        c0189o.f3387m = AbstractC0156G.m("application/id3");
        f1764r = new C0190p(c0189o);
        C0189o c0189o2 = new C0189o();
        c0189o2.f3387m = AbstractC0156G.m("application/x-scte35");
        f1765s = new C0190p(c0189o2);
        CREATOR = new D1.a(3);
    }

    public a(String str, String str2, long j5, long j6, byte[] bArr) {
        this.f1766l = str;
        this.f1767m = str2;
        this.f1768n = j5;
        this.f1769o = j6;
        this.f1770p = bArr;
    }

    @Override // a0.InterfaceC0154E
    public final byte[] a() {
        if (c() != null) {
            return this.f1770p;
        }
        return null;
    }

    @Override // a0.InterfaceC0154E
    public final C0190p c() {
        String str = this.f1766l;
        str.getClass();
        switch (str) {
            case "urn:scte:scte35:2014:bin":
                return f1765s;
            case "https://aomedia.org/emsg/ID3":
            case "https://developer.apple.com/streaming/emsg-id3":
                return f1764r;
            default:
                return null;
        }
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
        if (this.f1768n == aVar.f1768n && this.f1769o == aVar.f1769o) {
            int i = AbstractC0370w.f5326a;
            if (Objects.equals(this.f1766l, aVar.f1766l) && Objects.equals(this.f1767m, aVar.f1767m) && Arrays.equals(this.f1770p, aVar.f1770p)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        if (this.f1771q == 0) {
            String str = this.f1766l;
            int iHashCode = (527 + (str != null ? str.hashCode() : 0)) * 31;
            String str2 = this.f1767m;
            int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
            long j5 = this.f1768n;
            int i = (iHashCode2 + ((int) (j5 ^ (j5 >>> 32)))) * 31;
            long j6 = this.f1769o;
            this.f1771q = Arrays.hashCode(this.f1770p) + ((i + ((int) (j6 ^ (j6 >>> 32)))) * 31);
        }
        return this.f1771q;
    }

    public final String toString() {
        return "EMSG: scheme=" + this.f1766l + ", id=" + this.f1769o + ", durationMs=" + this.f1768n + ", value=" + this.f1767m;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f1766l);
        parcel.writeString(this.f1767m);
        parcel.writeLong(this.f1768n);
        parcel.writeLong(this.f1769o);
        parcel.writeByteArray(this.f1770p);
    }

    public a(Parcel parcel) {
        String string = parcel.readString();
        int i = AbstractC0370w.f5326a;
        this.f1766l = string;
        this.f1767m = parcel.readString();
        this.f1768n = parcel.readLong();
        this.f1769o = parcel.readLong();
        this.f1770p = parcel.createByteArray();
    }
}

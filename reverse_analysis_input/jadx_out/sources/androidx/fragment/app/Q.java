package androidx.fragment.app;

import a0.C0184j;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class Q implements Parcelable {
    public static final Parcelable.Creator<Q> CREATOR = new C0184j(11);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final String f4290l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final String f4291m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final boolean f4292n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final int f4293o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final int f4294p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final String f4295q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final boolean f4296r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final boolean f4297s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final boolean f4298t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final boolean f4299u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final int f4300v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final String f4301w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final int f4302x;
    public final boolean y;

    public Q(r rVar) {
        this.f4290l = rVar.getClass().getName();
        this.f4291m = rVar.f4443p;
        this.f4292n = rVar.y;
        this.f4293o = rVar.f4417H;
        this.f4294p = rVar.f4418I;
        this.f4295q = rVar.f4419J;
        this.f4296r = rVar.M;
        this.f4297s = rVar.f4450w;
        this.f4298t = rVar.f4421L;
        this.f4299u = rVar.f4420K;
        this.f4300v = rVar.f4432X.ordinal();
        this.f4301w = rVar.f4446s;
        this.f4302x = rVar.f4447t;
        this.y = rVar.f4427S;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentState{");
        sb.append(this.f4290l);
        sb.append(" (");
        sb.append(this.f4291m);
        sb.append(")}:");
        if (this.f4292n) {
            sb.append(" fromLayout");
        }
        int i = this.f4294p;
        if (i != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(i));
        }
        String str = this.f4295q;
        if (str != null && !str.isEmpty()) {
            sb.append(" tag=");
            sb.append(str);
        }
        if (this.f4296r) {
            sb.append(" retainInstance");
        }
        if (this.f4297s) {
            sb.append(" removing");
        }
        if (this.f4298t) {
            sb.append(" detached");
        }
        if (this.f4299u) {
            sb.append(" hidden");
        }
        String str2 = this.f4301w;
        if (str2 != null) {
            sb.append(" targetWho=");
            sb.append(str2);
            sb.append(" targetRequestCode=");
            sb.append(this.f4302x);
        }
        if (this.y) {
            sb.append(" userVisibleHint");
        }
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f4290l);
        parcel.writeString(this.f4291m);
        parcel.writeInt(this.f4292n ? 1 : 0);
        parcel.writeInt(this.f4293o);
        parcel.writeInt(this.f4294p);
        parcel.writeString(this.f4295q);
        parcel.writeInt(this.f4296r ? 1 : 0);
        parcel.writeInt(this.f4297s ? 1 : 0);
        parcel.writeInt(this.f4298t ? 1 : 0);
        parcel.writeInt(this.f4299u ? 1 : 0);
        parcel.writeInt(this.f4300v);
        parcel.writeString(this.f4301w);
        parcel.writeInt(this.f4302x);
        parcel.writeInt(this.y ? 1 : 0);
    }

    public Q(Parcel parcel) {
        this.f4290l = parcel.readString();
        this.f4291m = parcel.readString();
        this.f4292n = parcel.readInt() != 0;
        this.f4293o = parcel.readInt();
        this.f4294p = parcel.readInt();
        this.f4295q = parcel.readString();
        this.f4296r = parcel.readInt() != 0;
        this.f4297s = parcel.readInt() != 0;
        this.f4298t = parcel.readInt() != 0;
        this.f4299u = parcel.readInt() != 0;
        this.f4300v = parcel.readInt();
        this.f4301w = parcel.readString();
        this.f4302x = parcel.readInt();
        this.y = parcel.readInt() != 0;
    }
}

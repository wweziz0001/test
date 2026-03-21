package V0;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class e extends b {
    public static final Parcelable.Creator<e> CREATOR = new D1.a(24);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final long f2322l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final boolean f2323m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final boolean f2324n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final boolean f2325o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final boolean f2326p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final long f2327q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final long f2328r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final List f2329s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final boolean f2330t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final long f2331u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final int f2332v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final int f2333w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final int f2334x;

    public e(long j5, boolean z4, boolean z5, boolean z6, boolean z7, long j6, long j7, List list, boolean z8, long j8, int i, int i5, int i6) {
        this.f2322l = j5;
        this.f2323m = z4;
        this.f2324n = z5;
        this.f2325o = z6;
        this.f2326p = z7;
        this.f2327q = j6;
        this.f2328r = j7;
        this.f2329s = Collections.unmodifiableList(list);
        this.f2330t = z8;
        this.f2331u = j8;
        this.f2332v = i;
        this.f2333w = i5;
        this.f2334x = i6;
    }

    @Override // V0.b
    public final String toString() {
        return "SCTE-35 SpliceInsertCommand { programSplicePts=" + this.f2327q + ", programSplicePlaybackPositionUs= " + this.f2328r + " }";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.f2322l);
        parcel.writeByte(this.f2323m ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f2324n ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f2325o ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f2326p ? (byte) 1 : (byte) 0);
        parcel.writeLong(this.f2327q);
        parcel.writeLong(this.f2328r);
        List list = this.f2329s;
        int size = list.size();
        parcel.writeInt(size);
        for (int i5 = 0; i5 < size; i5++) {
            d dVar = (d) list.get(i5);
            parcel.writeInt(dVar.f2319a);
            parcel.writeLong(dVar.f2320b);
            parcel.writeLong(dVar.f2321c);
        }
        parcel.writeByte(this.f2330t ? (byte) 1 : (byte) 0);
        parcel.writeLong(this.f2331u);
        parcel.writeInt(this.f2332v);
        parcel.writeInt(this.f2333w);
        parcel.writeInt(this.f2334x);
    }

    public e(Parcel parcel) {
        this.f2322l = parcel.readLong();
        this.f2323m = parcel.readByte() == 1;
        this.f2324n = parcel.readByte() == 1;
        this.f2325o = parcel.readByte() == 1;
        this.f2326p = parcel.readByte() == 1;
        this.f2327q = parcel.readLong();
        this.f2328r = parcel.readLong();
        int i = parcel.readInt();
        ArrayList arrayList = new ArrayList(i);
        for (int i5 = 0; i5 < i; i5++) {
            arrayList.add(new d(parcel.readInt(), parcel.readLong(), parcel.readLong()));
        }
        this.f2329s = Collections.unmodifiableList(arrayList);
        this.f2330t = parcel.readByte() == 1;
        this.f2331u = parcel.readLong();
        this.f2332v = parcel.readInt();
        this.f2333w = parcel.readInt();
        this.f2334x = parcel.readInt();
    }
}

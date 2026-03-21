package D1;

import android.os.Parcel;
import android.util.SparseIntArray;
import m.B0;
import q.C0735e;

/* JADX INFO: loaded from: classes.dex */
public final class d extends c {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final SparseIntArray f545d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Parcel f546e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f547f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f548g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f549h;
    public int i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f550j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f551k;

    public d(Parcel parcel) {
        this(parcel, parcel.dataPosition(), parcel.dataSize(), "", new C0735e(), new C0735e(), new C0735e());
    }

    @Override // D1.c
    public final d a() {
        Parcel parcel = this.f546e;
        int iDataPosition = parcel.dataPosition();
        int i = this.f550j;
        if (i == this.f547f) {
            i = this.f548g;
        }
        return new d(parcel, iDataPosition, i, B0.i(new StringBuilder(), this.f549h, "  "), this.f542a, this.f543b, this.f544c);
    }

    @Override // D1.c
    public final boolean e(int i) {
        while (this.f550j < this.f548g) {
            int i5 = this.f551k;
            if (i5 == i) {
                return true;
            }
            if (String.valueOf(i5).compareTo(String.valueOf(i)) > 0) {
                return false;
            }
            int i6 = this.f550j;
            Parcel parcel = this.f546e;
            parcel.setDataPosition(i6);
            int i7 = parcel.readInt();
            this.f551k = parcel.readInt();
            this.f550j += i7;
        }
        return this.f551k == i;
    }

    @Override // D1.c
    public final void i(int i) {
        int i5 = this.i;
        SparseIntArray sparseIntArray = this.f545d;
        Parcel parcel = this.f546e;
        if (i5 >= 0) {
            int i6 = sparseIntArray.get(i5);
            int iDataPosition = parcel.dataPosition();
            parcel.setDataPosition(i6);
            parcel.writeInt(iDataPosition - i6);
            parcel.setDataPosition(iDataPosition);
        }
        this.i = i;
        sparseIntArray.put(i, parcel.dataPosition());
        parcel.writeInt(0);
        parcel.writeInt(i);
    }

    public d(Parcel parcel, int i, int i5, String str, C0735e c0735e, C0735e c0735e2, C0735e c0735e3) {
        super(c0735e, c0735e2, c0735e3);
        this.f545d = new SparseIntArray();
        this.i = -1;
        this.f551k = -1;
        this.f546e = parcel;
        this.f547f = i;
        this.f548g = i5;
        this.f550j = i;
        this.f549h = str;
    }
}

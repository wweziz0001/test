package e0;

import a0.C0184j;
import a0.InterfaceC0154E;
import android.os.Parcel;
import android.os.Parcelable;
import b3.AbstractC0307a;
import d0.AbstractC0360m;
import d0.AbstractC0370w;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: renamed from: e0.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0389a implements InterfaceC0154E {
    public static final Parcelable.Creator<C0389a> CREATOR = new C0184j(15);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final String f5485l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final byte[] f5486m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final int f5487n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final int f5488o;

    public C0389a(String str, byte[] bArr, int i, int i5) {
        e(str, bArr, i5);
        this.f5485l = str;
        this.f5486m = bArr;
        this.f5487n = i;
        this.f5488o = i5;
    }

    public static void e(String str, byte[] bArr, int i) {
        boolean z4;
        byte b4;
        str.getClass();
        switch (str) {
            case "com.android.capture.fps":
                if (i == 23 && bArr.length == 4) {
                    z4 = true;
                }
                AbstractC0360m.c(z4);
                break;
            case "editable.tracks.samples.location":
                if (i == 75 && bArr.length == 1 && ((b4 = bArr[0]) == 0 || b4 == 1)) {
                    z4 = true;
                }
                AbstractC0360m.c(z4);
                break;
            case "editable.tracks.length":
            case "editable.tracks.offset":
                if (i == 78 && bArr.length == 8) {
                    z4 = true;
                }
                AbstractC0360m.c(z4);
                break;
            case "editable.tracks.map":
                AbstractC0360m.c(i == 0);
                break;
        }
    }

    public final ArrayList d() {
        AbstractC0360m.g("Metadata is not an editable tracks map", this.f5485l.equals("editable.tracks.map"));
        byte[] bArr = this.f5486m;
        byte b4 = bArr[1];
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < b4; i++) {
            arrayList.add(Integer.valueOf(bArr[i + 2]));
        }
        return arrayList;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0389a.class != obj.getClass()) {
            return false;
        }
        C0389a c0389a = (C0389a) obj;
        return this.f5485l.equals(c0389a.f5485l) && Arrays.equals(this.f5486m, c0389a.f5486m) && this.f5487n == c0389a.f5487n && this.f5488o == c0389a.f5488o;
    }

    public final int hashCode() {
        return ((((Arrays.hashCode(this.f5486m) + AbstractC0307a.e(527, this.f5485l, 31)) * 31) + this.f5487n) * 31) + this.f5488o;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x007d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String toString() {
        /*
            r6 = this;
            java.lang.String r0 = r6.f5485l
            byte[] r1 = r6.f5486m
            int r2 = r6.f5488o
            if (r2 == 0) goto L4f
            r3 = 1
            if (r2 == r3) goto L4a
            r3 = 23
            if (r2 == r3) goto L3d
            r3 = 67
            if (r2 == r3) goto L34
            r3 = 75
            if (r2 == r3) goto L2a
            r3 = 78
            if (r2 == r3) goto L1c
            goto L7d
        L1c:
            d0.p r2 = new d0.p
            r2.<init>(r1)
            long r1 = r2.A()
            java.lang.String r1 = java.lang.String.valueOf(r1)
            goto L81
        L2a:
            r2 = 0
            r1 = r1[r2]
            r1 = r1 & 255(0xff, float:3.57E-43)
            java.lang.String r1 = java.lang.String.valueOf(r1)
            goto L81
        L34:
            int r1 = Q1.C.Z(r1)
            java.lang.String r1 = java.lang.String.valueOf(r1)
            goto L81
        L3d:
            int r1 = Q1.C.Z(r1)
            float r1 = java.lang.Float.intBitsToFloat(r1)
            java.lang.String r1 = java.lang.String.valueOf(r1)
            goto L81
        L4a:
            java.lang.String r1 = d0.AbstractC0370w.o(r1)
            goto L81
        L4f:
            java.lang.String r2 = "editable.tracks.map"
            boolean r2 = r0.equals(r2)
            if (r2 == 0) goto L7d
            java.util.ArrayList r1 = r6.d()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "track types = "
            r2.append(r3)
            F0.p r3 = new F0.p
            r4 = 44
            java.lang.String r4 = java.lang.String.valueOf(r4)
            r5 = 2
            r3.<init>(r4, r5)
            java.util.Iterator r1 = r1.iterator()
            r3.c(r2, r1)
            java.lang.String r1 = r2.toString()
            goto L81
        L7d:
            java.lang.String r1 = d0.AbstractC0370w.Y(r1)
        L81:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "mdta: key="
            r2.<init>(r3)
            r2.append(r0)
            java.lang.String r0 = ", value="
            r2.append(r0)
            r2.append(r1)
            java.lang.String r0 = r2.toString()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: e0.C0389a.toString():java.lang.String");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f5485l);
        parcel.writeByteArray(this.f5486m);
        parcel.writeInt(this.f5487n);
        parcel.writeInt(this.f5488o);
    }

    public C0389a(Parcel parcel) {
        String string = parcel.readString();
        int i = AbstractC0370w.f5326a;
        this.f5485l = string;
        byte[] bArrCreateByteArray = parcel.createByteArray();
        this.f5486m = bArrCreateByteArray;
        this.f5487n = parcel.readInt();
        int i5 = parcel.readInt();
        this.f5488o = i5;
        e(string, bArrCreateByteArray, i5);
    }
}

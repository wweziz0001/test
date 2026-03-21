package V0;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class i extends b {
    public static final Parcelable.Creator<i> CREATOR = new D1.a(26);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final List f2347l;

    public i(Parcel parcel) {
        int i = parcel.readInt();
        ArrayList arrayList = new ArrayList(i);
        for (int i5 = 0; i5 < i; i5++) {
            arrayList.add(new h(parcel));
        }
        this.f2347l = Collections.unmodifiableList(arrayList);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        List list = this.f2347l;
        int size = list.size();
        parcel.writeInt(size);
        for (int i5 = 0; i5 < size; i5++) {
            h hVar = (h) list.get(i5);
            parcel.writeLong(hVar.f2337a);
            parcel.writeByte(hVar.f2338b ? (byte) 1 : (byte) 0);
            parcel.writeByte(hVar.f2339c ? (byte) 1 : (byte) 0);
            parcel.writeByte(hVar.f2340d ? (byte) 1 : (byte) 0);
            List list2 = hVar.f2342f;
            int size2 = list2.size();
            parcel.writeInt(size2);
            for (int i6 = 0; i6 < size2; i6++) {
                g gVar = (g) list2.get(i6);
                parcel.writeInt(gVar.f2335a);
                parcel.writeLong(gVar.f2336b);
            }
            parcel.writeLong(hVar.f2341e);
            parcel.writeByte(hVar.f2343g ? (byte) 1 : (byte) 0);
            parcel.writeLong(hVar.f2344h);
            parcel.writeInt(hVar.i);
            parcel.writeInt(hVar.f2345j);
            parcel.writeInt(hVar.f2346k);
        }
    }

    public i(ArrayList arrayList) {
        this.f2347l = Collections.unmodifiableList(arrayList);
    }
}

package V0;

import android.os.Parcel;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f2337a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f2338b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f2339c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f2340d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f2341e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final List f2342f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f2343g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f2344h;
    public final int i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f2345j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final int f2346k;

    public h(long j5, boolean z4, boolean z5, boolean z6, ArrayList arrayList, long j6, boolean z7, long j7, int i, int i5, int i6) {
        this.f2337a = j5;
        this.f2338b = z4;
        this.f2339c = z5;
        this.f2340d = z6;
        this.f2342f = Collections.unmodifiableList(arrayList);
        this.f2341e = j6;
        this.f2343g = z7;
        this.f2344h = j7;
        this.i = i;
        this.f2345j = i5;
        this.f2346k = i6;
    }

    public h(Parcel parcel) {
        this.f2337a = parcel.readLong();
        this.f2338b = parcel.readByte() == 1;
        this.f2339c = parcel.readByte() == 1;
        this.f2340d = parcel.readByte() == 1;
        int i = parcel.readInt();
        ArrayList arrayList = new ArrayList(i);
        for (int i5 = 0; i5 < i; i5++) {
            arrayList.add(new g(parcel.readLong(), parcel.readInt()));
        }
        this.f2342f = Collections.unmodifiableList(arrayList);
        this.f2341e = parcel.readLong();
        this.f2343g = parcel.readByte() == 1;
        this.f2344h = parcel.readLong();
        this.i = parcel.readInt();
        this.f2345j = parcel.readInt();
        this.f2346k = parcel.readInt();
    }
}

package U0;

import a0.InterfaceC0154E;
import android.os.Parcel;
import android.os.Parcelable;
import d0.AbstractC0360m;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class c implements InterfaceC0154E {
    public static final Parcelable.Creator<c> CREATOR = new D1.a(20);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final ArrayList f2267l;

    public c(ArrayList arrayList) {
        this.f2267l = arrayList;
        boolean z4 = false;
        if (!arrayList.isEmpty()) {
            long j5 = ((b) arrayList.get(0)).f2265m;
            int i = 1;
            while (true) {
                if (i >= arrayList.size()) {
                    break;
                }
                if (((b) arrayList.get(i)).f2264l < j5) {
                    z4 = true;
                    break;
                } else {
                    j5 = ((b) arrayList.get(i)).f2265m;
                    i++;
                }
            }
        }
        AbstractC0360m.c(!z4);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || c.class != obj.getClass()) {
            return false;
        }
        return this.f2267l.equals(((c) obj).f2267l);
    }

    public final int hashCode() {
        return this.f2267l.hashCode();
    }

    public final String toString() {
        return "SlowMotion: segments=" + this.f2267l;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeList(this.f2267l);
    }
}

package m;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: m.z0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0628z0 extends K.c {
    public static final Parcelable.Creator<C0628z0> CREATOR = new K.b(1);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f8493n;

    public C0628z0(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f8493n = ((Boolean) parcel.readValue(null)).booleanValue();
    }

    public final String toString() {
        return "SearchView.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " isIconified=" + this.f8493n + "}";
    }

    @Override // K.c, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeValue(Boolean.valueOf(this.f8493n));
    }
}

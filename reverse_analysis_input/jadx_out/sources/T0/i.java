package T0;

import a0.InterfaceC0154E;

/* JADX INFO: loaded from: classes.dex */
public abstract class i implements InterfaceC0154E {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final String f2124l;

    public i(String str) {
        this.f2124l = str;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        return this.f2124l;
    }
}

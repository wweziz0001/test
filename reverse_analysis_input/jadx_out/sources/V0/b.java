package V0;

import a0.InterfaceC0154E;

/* JADX INFO: loaded from: classes.dex */
public abstract class b implements InterfaceC0154E {
    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public String toString() {
        return "SCTE-35 splice command: type=".concat(getClass().getSimpleName());
    }
}

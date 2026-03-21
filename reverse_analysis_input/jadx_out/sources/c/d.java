package c;

import a0.C0184j;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public class d implements Parcelable {
    public static final Parcelable.Creator<d> CREATOR = new C0184j(12);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public InterfaceC0315b f4958l;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        synchronized (this) {
            try {
                if (this.f4958l == null) {
                    this.f4958l = new c(this);
                }
                parcel.writeStrongBinder(this.f4958l.asBinder());
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void d(int i, Bundle bundle) {
    }
}

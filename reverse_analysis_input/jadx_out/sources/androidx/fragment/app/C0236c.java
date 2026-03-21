package androidx.fragment.app;

import a0.C0184j;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* JADX INFO: renamed from: androidx.fragment.app.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0236c implements Parcelable {
    public static final Parcelable.Creator<C0236c> CREATOR = new C0184j(8);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final ArrayList f4369l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final ArrayList f4370m;

    public C0236c(Parcel parcel) {
        this.f4369l = parcel.createStringArrayList();
        this.f4370m = parcel.createTypedArrayList(C0235b.CREATOR);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeStringList(this.f4369l);
        parcel.writeTypedList(this.f4370m);
    }
}

package e;

import a0.C0184j;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: e.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0388j implements Parcelable {
    public static final Parcelable.Creator<C0388j> CREATOR = new C0184j(14);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final IntentSender f5481l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Intent f5482m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final int f5483n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final int f5484o;

    public C0388j(IntentSender intentSender, Intent intent, int i, int i5) {
        N3.h.e(intentSender, "intentSender");
        this.f5481l = intentSender;
        this.f5482m = intent;
        this.f5483n = i;
        this.f5484o = i5;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        N3.h.e(parcel, "dest");
        parcel.writeParcelable(this.f5481l, i);
        parcel.writeParcelable(this.f5482m, i);
        parcel.writeInt(this.f5483n);
        parcel.writeInt(this.f5484o);
    }
}

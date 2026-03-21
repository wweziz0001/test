package e;

import a0.C0184j;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: e.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0379a implements Parcelable {
    public static final Parcelable.Creator<C0379a> CREATOR = new C0184j(13);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f5461l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Intent f5462m;

    public C0379a(Intent intent, int i) {
        this.f5461l = i;
        this.f5462m = intent;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ActivityResult{resultCode=");
        int i = this.f5461l;
        sb.append(i != -1 ? i != 0 ? String.valueOf(i) : "RESULT_CANCELED" : "RESULT_OK");
        sb.append(", data=");
        sb.append(this.f5462m);
        sb.append('}');
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f5461l);
        Intent intent = this.f5462m;
        parcel.writeInt(intent == null ? 0 : 1);
        if (intent != null) {
            intent.writeToParcel(parcel, i);
        }
    }

    public C0379a(Parcel parcel) {
        this.f5461l = parcel.readInt();
        this.f5462m = parcel.readInt() == 0 ? null : (Intent) Intent.CREATOR.createFromParcel(parcel);
    }
}

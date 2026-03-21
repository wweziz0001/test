package I;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import b3.AbstractC0307a;

/* JADX INFO: loaded from: classes.dex */
public final class i extends View.BaseSavedState {
    public static final Parcelable.Creator<i> CREATOR = new D1.a(1);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f1007l;

    public final String toString() {
        StringBuilder sb = new StringBuilder("HorizontalScrollView.SavedState{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" scrollPosition=");
        return AbstractC0307a.l(sb, this.f1007l, "}");
    }

    @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.f1007l);
    }
}

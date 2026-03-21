package android.support.v4.media.session;

import android.annotation.SuppressLint;
import android.media.session.PlaybackState;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"BanParcelableUsage"})
public final class PlaybackStateCompat implements Parcelable {
    public static final Parcelable.Creator<PlaybackStateCompat> CREATOR = new x(4);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f3683l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final long f3684m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final long f3685n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final float f3686o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final long f3687p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final int f3688q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final CharSequence f3689r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final long f3690s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final ArrayList f3691t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final long f3692u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final Bundle f3693v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public PlaybackState f3694w;

    public PlaybackStateCompat(int i, long j5, long j6, float f2, long j7, int i5, CharSequence charSequence, long j8, ArrayList arrayList, long j9, Bundle bundle) {
        this.f3683l = i;
        this.f3684m = j5;
        this.f3685n = j6;
        this.f3686o = f2;
        this.f3687p = j7;
        this.f3688q = i5;
        this.f3689r = charSequence;
        this.f3690s = j8;
        this.f3691t = new ArrayList(arrayList);
        this.f3692u = j9;
        this.f3693v = bundle;
    }

    public static int d(long j5) {
        if (j5 == 4) {
            return 126;
        }
        if (j5 == 2) {
            return 127;
        }
        if (j5 == 32) {
            return 87;
        }
        if (j5 == 16) {
            return 88;
        }
        if (j5 == 1) {
            return 86;
        }
        if (j5 == 64) {
            return 90;
        }
        if (j5 == 8) {
            return 89;
        }
        return j5 == 512 ? 85 : 0;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return "PlaybackState {state=" + this.f3683l + ", position=" + this.f3684m + ", buffered position=" + this.f3685n + ", speed=" + this.f3686o + ", updated=" + this.f3690s + ", actions=" + this.f3687p + ", error code=" + this.f3688q + ", error message=" + this.f3689r + ", custom actions=" + this.f3691t + ", active item id=" + this.f3692u + "}";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f3683l);
        parcel.writeLong(this.f3684m);
        parcel.writeFloat(this.f3686o);
        parcel.writeLong(this.f3690s);
        parcel.writeLong(this.f3685n);
        parcel.writeLong(this.f3687p);
        TextUtils.writeToParcel(this.f3689r, parcel, i);
        parcel.writeTypedList(this.f3691t);
        parcel.writeLong(this.f3692u);
        parcel.writeBundle(this.f3693v);
        parcel.writeInt(this.f3688q);
    }

    public static final class CustomAction implements Parcelable {
        public static final Parcelable.Creator<CustomAction> CREATOR = new B();

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final String f3695l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public final CharSequence f3696m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final int f3697n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public final Bundle f3698o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public PlaybackState.CustomAction f3699p;

        public CustomAction(String str, CharSequence charSequence, int i, Bundle bundle) {
            this.f3695l = str;
            this.f3696m = charSequence;
            this.f3697n = i;
            this.f3698o = bundle;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final String toString() {
            return "Action:mName='" + ((Object) this.f3696m) + ", mIcon=" + this.f3697n + ", mExtras=" + this.f3698o;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.f3695l);
            TextUtils.writeToParcel(this.f3696m, parcel, i);
            parcel.writeInt(this.f3697n);
            parcel.writeBundle(this.f3698o);
        }

        public CustomAction(Parcel parcel) {
            this.f3695l = parcel.readString();
            this.f3696m = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            this.f3697n = parcel.readInt();
            this.f3698o = parcel.readBundle(y.class.getClassLoader());
        }
    }

    public PlaybackStateCompat(Parcel parcel) {
        this.f3683l = parcel.readInt();
        this.f3684m = parcel.readLong();
        this.f3686o = parcel.readFloat();
        this.f3690s = parcel.readLong();
        this.f3685n = parcel.readLong();
        this.f3687p = parcel.readLong();
        this.f3689r = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f3691t = parcel.createTypedArrayList(CustomAction.CREATOR);
        this.f3692u = parcel.readLong();
        this.f3693v = parcel.readBundle(y.class.getClassLoader());
        this.f3688q = parcel.readInt();
    }
}

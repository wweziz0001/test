package android.support.v4.media;

import a0.C0184j;
import android.annotation.SuppressLint;
import android.media.Rating;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"BanParcelableUsage"})
public final class RatingCompat implements Parcelable {
    public static final Parcelable.Creator<RatingCompat> CREATOR = new C0184j(6);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f3653l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final float f3654m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public Object f3655n;

    public RatingCompat(float f2, int i) {
        this.f3653l = i;
        this.f3654m = f2;
    }

    public static RatingCompat d(Object obj) {
        RatingCompat ratingCompat;
        RatingCompat ratingCompat2 = null;
        if (obj != null) {
            Rating rating = (Rating) obj;
            int iB = j.b(rating);
            if (!j.e(rating)) {
                switch (iB) {
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case O.j.STRING_SET_FIELD_NUMBER /* 6 */:
                        ratingCompat2 = new RatingCompat(-1.0f, iB);
                        break;
                }
            } else {
                switch (iB) {
                    case 1:
                        ratingCompat = new RatingCompat(j.d(rating) ? 1.0f : 0.0f, 1);
                        ratingCompat2 = ratingCompat;
                        break;
                    case 2:
                        ratingCompat = new RatingCompat(j.f(rating) ? 1.0f : 0.0f, 2);
                        ratingCompat2 = ratingCompat;
                        break;
                    case 3:
                    case 4:
                    case 5:
                        ratingCompat2 = g(j.c(rating), iB);
                        break;
                    case O.j.STRING_SET_FIELD_NUMBER /* 6 */:
                        ratingCompat2 = f(j.a(rating));
                        break;
                    default:
                        return null;
                }
            }
            ratingCompat2.f3655n = obj;
        }
        return ratingCompat2;
    }

    public static RatingCompat f(float f2) {
        if (f2 >= 0.0f && f2 <= 100.0f) {
            return new RatingCompat(f2, 6);
        }
        Log.e("Rating", "Invalid percentage-based rating value");
        return null;
    }

    public static RatingCompat g(float f2, int i) {
        float f5;
        if (i == 3) {
            f5 = 3.0f;
        } else if (i == 4) {
            f5 = 4.0f;
        } else {
            if (i != 5) {
                Log.e("Rating", "Invalid rating style (" + i + ") for a star rating");
                return null;
            }
            f5 = 5.0f;
        }
        if (f2 >= 0.0f && f2 <= f5) {
            return new RatingCompat(f2, i);
        }
        Log.e("Rating", "Trying to set out of range star-based rating");
        return null;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return this.f3653l;
    }

    public final boolean e() {
        return this.f3654m >= 0.0f;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Rating:style=");
        sb.append(this.f3653l);
        sb.append(" rating=");
        float f2 = this.f3654m;
        sb.append(f2 < 0.0f ? "unrated" : String.valueOf(f2));
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f3653l);
        parcel.writeFloat(this.f3654m);
    }
}

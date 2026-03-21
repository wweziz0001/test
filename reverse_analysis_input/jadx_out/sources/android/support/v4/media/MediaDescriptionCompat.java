package android.support.v4.media;

import a0.C0184j;
import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import android.media.MediaDescription;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.session.y;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"BanParcelableUsage"})
public final class MediaDescriptionCompat implements Parcelable {
    public static final Parcelable.Creator<MediaDescriptionCompat> CREATOR = new C0184j(4);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final String f3637l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final CharSequence f3638m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final CharSequence f3639n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final CharSequence f3640o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final Bitmap f3641p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final Uri f3642q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final Bundle f3643r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final Uri f3644s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public MediaDescription f3645t;

    public MediaDescriptionCompat(String str, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, Bitmap bitmap, Uri uri, Bundle bundle, Uri uri2) {
        this.f3637l = str;
        this.f3638m = charSequence;
        this.f3639n = charSequence2;
        this.f3640o = charSequence3;
        this.f3641p = bitmap;
        this.f3642q = uri;
        this.f3643r = bundle;
        this.f3644s = uri2;
    }

    public static MediaDescriptionCompat d(Object obj) {
        Bundle bundle;
        if (obj == null) {
            return null;
        }
        MediaDescription mediaDescription = (MediaDescription) obj;
        String strG = h.g(mediaDescription);
        CharSequence charSequenceI = h.i(mediaDescription);
        CharSequence charSequenceH = h.h(mediaDescription);
        CharSequence charSequenceC = h.c(mediaDescription);
        Bitmap bitmapE = h.e(mediaDescription);
        Uri uriF = h.f(mediaDescription);
        Bundle bundleD = h.d(mediaDescription);
        if (bundleD != null) {
            bundleD = y.f(bundleD);
        }
        Uri uriA = bundleD != null ? (Uri) bundleD.getParcelable("android.support.v4.media.description.MEDIA_URI") : null;
        if (uriA == null) {
            bundle = bundleD;
        } else if (bundleD.containsKey("android.support.v4.media.description.NULL_BUNDLE_FLAG") && bundleD.size() == 2) {
            bundle = null;
        } else {
            bundleD.remove("android.support.v4.media.description.MEDIA_URI");
            bundleD.remove("android.support.v4.media.description.NULL_BUNDLE_FLAG");
            bundle = bundleD;
        }
        if (uriA == null) {
            uriA = i.a(mediaDescription);
        }
        MediaDescriptionCompat mediaDescriptionCompat = new MediaDescriptionCompat(strG, charSequenceI, charSequenceH, charSequenceC, bitmapE, uriF, bundle, uriA);
        mediaDescriptionCompat.f3645t = mediaDescription;
        return mediaDescriptionCompat;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final MediaDescription e() {
        MediaDescription mediaDescription = this.f3645t;
        if (mediaDescription != null) {
            return mediaDescription;
        }
        MediaDescription.Builder builderB = h.b();
        h.n(builderB, this.f3637l);
        h.p(builderB, this.f3638m);
        h.o(builderB, this.f3639n);
        h.j(builderB, this.f3640o);
        h.l(builderB, this.f3641p);
        h.m(builderB, this.f3642q);
        h.k(builderB, this.f3643r);
        i.b(builderB, this.f3644s);
        MediaDescription mediaDescriptionA = h.a(builderB);
        this.f3645t = mediaDescriptionA;
        return mediaDescriptionA;
    }

    public final String toString() {
        return ((Object) this.f3638m) + ", " + ((Object) this.f3639n) + ", " + ((Object) this.f3640o);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        e().writeToParcel(parcel, i);
    }
}

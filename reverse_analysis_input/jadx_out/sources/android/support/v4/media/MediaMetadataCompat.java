package android.support.v4.media;

import a0.C0184j;
import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import android.media.MediaMetadata;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.session.y;
import android.text.TextUtils;
import android.util.Log;
import q.C0735e;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"BanParcelableUsage"})
public final class MediaMetadataCompat implements Parcelable {
    public static final Parcelable.Creator<MediaMetadataCompat> CREATOR;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final C0735e f3646o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final String[] f3647p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final String[] f3648q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final String[] f3649r;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Bundle f3650l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public MediaMetadata f3651m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public MediaDescriptionCompat f3652n;

    static {
        C0735e c0735e = new C0735e();
        f3646o = c0735e;
        c0735e.put("android.media.metadata.TITLE", 1);
        c0735e.put("android.media.metadata.ARTIST", 1);
        c0735e.put("android.media.metadata.DURATION", 0);
        c0735e.put("android.media.metadata.ALBUM", 1);
        c0735e.put("android.media.metadata.AUTHOR", 1);
        c0735e.put("android.media.metadata.WRITER", 1);
        c0735e.put("android.media.metadata.COMPOSER", 1);
        c0735e.put("android.media.metadata.COMPILATION", 1);
        c0735e.put("android.media.metadata.DATE", 1);
        c0735e.put("android.media.metadata.YEAR", 0);
        c0735e.put("android.media.metadata.GENRE", 1);
        c0735e.put("android.media.metadata.TRACK_NUMBER", 0);
        c0735e.put("android.media.metadata.NUM_TRACKS", 0);
        c0735e.put("android.media.metadata.DISC_NUMBER", 0);
        c0735e.put("android.media.metadata.ALBUM_ARTIST", 1);
        c0735e.put("android.media.metadata.ART", 2);
        c0735e.put("android.media.metadata.ART_URI", 1);
        c0735e.put("android.media.metadata.ALBUM_ART", 2);
        c0735e.put("android.media.metadata.ALBUM_ART_URI", 1);
        c0735e.put("android.media.metadata.USER_RATING", 3);
        c0735e.put("android.media.metadata.RATING", 3);
        c0735e.put("android.media.metadata.DISPLAY_TITLE", 1);
        c0735e.put("android.media.metadata.DISPLAY_SUBTITLE", 1);
        c0735e.put("android.media.metadata.DISPLAY_DESCRIPTION", 1);
        c0735e.put("android.media.metadata.DISPLAY_ICON", 2);
        c0735e.put("android.media.metadata.DISPLAY_ICON_URI", 1);
        c0735e.put("android.media.metadata.MEDIA_ID", 1);
        c0735e.put("android.media.metadata.BT_FOLDER_TYPE", 0);
        c0735e.put("android.media.metadata.MEDIA_URI", 1);
        c0735e.put("android.media.metadata.ADVERTISEMENT", 0);
        c0735e.put("android.media.metadata.DOWNLOAD_STATUS", 0);
        f3647p = new String[]{"android.media.metadata.TITLE", "android.media.metadata.ARTIST", "android.media.metadata.ALBUM", "android.media.metadata.ALBUM_ARTIST", "android.media.metadata.WRITER", "android.media.metadata.AUTHOR", "android.media.metadata.COMPOSER"};
        f3648q = new String[]{"android.media.metadata.DISPLAY_ICON", "android.media.metadata.ART", "android.media.metadata.ALBUM_ART"};
        f3649r = new String[]{"android.media.metadata.DISPLAY_ICON_URI", "android.media.metadata.ART_URI", "android.media.metadata.ALBUM_ART_URI"};
        CREATOR = new C0184j(5);
    }

    public MediaMetadataCompat(Bundle bundle) {
        Bundle bundle2 = new Bundle(bundle);
        this.f3650l = bundle2;
        y.a(bundle2);
    }

    public final MediaDescriptionCompat d() {
        Bitmap bitmap;
        Uri uri;
        Bitmap bitmap2;
        MediaDescriptionCompat mediaDescriptionCompat = this.f3652n;
        if (mediaDescriptionCompat != null) {
            return mediaDescriptionCompat;
        }
        String strE = e("android.media.metadata.MEDIA_ID");
        CharSequence[] charSequenceArr = new CharSequence[3];
        Bundle bundle = this.f3650l;
        CharSequence charSequence = bundle.getCharSequence("android.media.metadata.DISPLAY_TITLE");
        if (TextUtils.isEmpty(charSequence)) {
            int i = 0;
            int i5 = 0;
            while (i < 3) {
                String[] strArr = f3647p;
                if (i5 >= strArr.length) {
                    break;
                }
                int i6 = i5 + 1;
                CharSequence charSequence2 = bundle.getCharSequence(strArr[i5]);
                if (!TextUtils.isEmpty(charSequence2)) {
                    charSequenceArr[i] = charSequence2;
                    i++;
                }
                i5 = i6;
            }
        } else {
            charSequenceArr[0] = charSequence;
            charSequenceArr[1] = bundle.getCharSequence("android.media.metadata.DISPLAY_SUBTITLE");
            charSequenceArr[2] = bundle.getCharSequence("android.media.metadata.DISPLAY_DESCRIPTION");
        }
        int i7 = 0;
        while (true) {
            String[] strArr2 = f3648q;
            if (i7 >= strArr2.length) {
                bitmap = null;
                break;
            }
            try {
                bitmap2 = (Bitmap) bundle.getParcelable(strArr2[i7]);
            } catch (Exception e5) {
                Log.w("MediaMetadata", "Failed to retrieve a key as Bitmap.", e5);
                bitmap2 = null;
            }
            if (bitmap2 != null) {
                bitmap = bitmap2;
                break;
            }
            i7++;
        }
        int i8 = 0;
        while (true) {
            String[] strArr3 = f3649r;
            if (i8 >= strArr3.length) {
                uri = null;
                break;
            }
            String strE2 = e(strArr3[i8]);
            if (!TextUtils.isEmpty(strE2)) {
                uri = Uri.parse(strE2);
                break;
            }
            i8++;
        }
        String strE3 = e("android.media.metadata.MEDIA_URI");
        Uri uri2 = !TextUtils.isEmpty(strE3) ? Uri.parse(strE3) : null;
        CharSequence charSequence3 = charSequenceArr[0];
        CharSequence charSequence4 = charSequenceArr[1];
        CharSequence charSequence5 = charSequenceArr[2];
        Bundle bundle2 = new Bundle();
        if (bundle.containsKey("android.media.metadata.BT_FOLDER_TYPE")) {
            bundle2.putLong("android.media.extra.BT_FOLDER_TYPE", bundle.getLong("android.media.metadata.BT_FOLDER_TYPE", 0L));
        }
        if (bundle.containsKey("android.media.metadata.DOWNLOAD_STATUS")) {
            bundle2.putLong("android.media.extra.DOWNLOAD_STATUS", bundle.getLong("android.media.metadata.DOWNLOAD_STATUS", 0L));
        }
        MediaDescriptionCompat mediaDescriptionCompat2 = new MediaDescriptionCompat(strE, charSequence3, charSequence4, charSequence5, bitmap, uri, !bundle2.isEmpty() ? bundle2 : null, uri2);
        this.f3652n = mediaDescriptionCompat2;
        return mediaDescriptionCompat2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String e(String str) {
        CharSequence charSequence = this.f3650l.getCharSequence(str);
        if (charSequence != null) {
            return charSequence.toString();
        }
        return null;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeBundle(this.f3650l);
    }

    public MediaMetadataCompat(Parcel parcel) {
        this.f3650l = parcel.readBundle(y.class.getClassLoader());
    }
}

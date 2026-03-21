package androidx.media;

import android.util.SparseIntArray;

/* JADX INFO: loaded from: classes.dex */
public class AudioAttributesCompat implements D1.e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f4562b = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public AudioAttributesImpl f4563a;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        sparseIntArray.put(5, 1);
        sparseIntArray.put(6, 2);
        sparseIntArray.put(7, 2);
        sparseIntArray.put(8, 1);
        sparseIntArray.put(9, 1);
        sparseIntArray.put(10, 1);
    }

    public AudioAttributesCompat() {
    }

    public static int c(int i, int i5) {
        if ((i & 1) == 1) {
            return 7;
        }
        if ((i & 4) == 4) {
            return 6;
        }
        switch (i5) {
            case 0:
            case 1:
            case 12:
            case 14:
            case 16:
                return 3;
            case 2:
                return 0;
            case 3:
                return 8;
            case 4:
                return 4;
            case 5:
            case O.j.DOUBLE_FIELD_NUMBER /* 7 */:
            case O.j.BYTES_FIELD_NUMBER /* 8 */:
            case 9:
            case 10:
                return 5;
            case O.j.STRING_SET_FIELD_NUMBER /* 6 */:
                return 2;
            case 11:
                return 10;
            case 13:
                return 1;
            case 15:
            default:
                return 3;
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof AudioAttributesCompat)) {
            return false;
        }
        AudioAttributesCompat audioAttributesCompat = (AudioAttributesCompat) obj;
        AudioAttributesImpl audioAttributesImpl = this.f4563a;
        return audioAttributesImpl == null ? audioAttributesCompat.f4563a == null : audioAttributesImpl.equals(audioAttributesCompat.f4563a);
    }

    public final int hashCode() {
        return this.f4563a.hashCode();
    }

    public final String toString() {
        return this.f4563a.toString();
    }

    public AudioAttributesCompat(AudioAttributesImpl audioAttributesImpl) {
        this.f4563a = audioAttributesImpl;
    }
}

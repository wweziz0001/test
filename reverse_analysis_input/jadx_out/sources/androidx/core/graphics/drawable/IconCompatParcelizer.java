package androidx.core.graphics.drawable;

import D1.c;
import D1.d;
import O.j;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.media.A;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes.dex */
public class IconCompatParcelizer {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static IconCompat read(c cVar) {
        IconCompat iconCompat = new IconCompat();
        iconCompat.f4018a = cVar.f(iconCompat.f4018a, 1);
        byte[] bArr = iconCompat.f4020c;
        if (cVar.e(2)) {
            Parcel parcel = ((d) cVar).f546e;
            int i = parcel.readInt();
            if (i < 0) {
                bArr = null;
            } else {
                byte[] bArr2 = new byte[i];
                parcel.readByteArray(bArr2);
                bArr = bArr2;
            }
        }
        iconCompat.f4020c = bArr;
        iconCompat.f4021d = cVar.g(iconCompat.f4021d, 3);
        iconCompat.f4022e = cVar.f(iconCompat.f4022e, 4);
        iconCompat.f4023f = cVar.f(iconCompat.f4023f, 5);
        iconCompat.f4024g = (ColorStateList) cVar.g(iconCompat.f4024g, 6);
        String string = iconCompat.i;
        if (cVar.e(7)) {
            string = ((d) cVar).f546e.readString();
        }
        iconCompat.i = string;
        String string2 = iconCompat.f4026j;
        if (cVar.e(8)) {
            string2 = ((d) cVar).f546e.readString();
        }
        iconCompat.f4026j = string2;
        iconCompat.f4025h = PorterDuff.Mode.valueOf(iconCompat.i);
        switch (iconCompat.f4018a) {
            case A.RESULT_ERROR /* -1 */:
                Parcelable parcelable = iconCompat.f4021d;
                if (parcelable == null) {
                    throw new IllegalArgumentException("Invalid icon");
                }
                iconCompat.f4019b = parcelable;
                return iconCompat;
            case 0:
            default:
                return iconCompat;
            case 1:
            case 5:
                Parcelable parcelable2 = iconCompat.f4021d;
                if (parcelable2 != null) {
                    iconCompat.f4019b = parcelable2;
                } else {
                    byte[] bArr3 = iconCompat.f4020c;
                    iconCompat.f4019b = bArr3;
                    iconCompat.f4018a = 3;
                    iconCompat.f4022e = 0;
                    iconCompat.f4023f = bArr3.length;
                }
                return iconCompat;
            case 2:
            case 4:
            case j.STRING_SET_FIELD_NUMBER /* 6 */:
                String str = new String(iconCompat.f4020c, Charset.forName("UTF-16"));
                iconCompat.f4019b = str;
                if (iconCompat.f4018a == 2 && iconCompat.f4026j == null) {
                    iconCompat.f4026j = str.split(":", -1)[0];
                }
                return iconCompat;
            case 3:
                iconCompat.f4019b = iconCompat.f4020c;
                return iconCompat;
        }
    }

    public static void write(IconCompat iconCompat, c cVar) {
        cVar.getClass();
        iconCompat.i = iconCompat.f4025h.name();
        switch (iconCompat.f4018a) {
            case A.RESULT_ERROR /* -1 */:
                iconCompat.f4021d = (Parcelable) iconCompat.f4019b;
                break;
            case 1:
            case 5:
                iconCompat.f4021d = (Parcelable) iconCompat.f4019b;
                break;
            case 2:
                iconCompat.f4020c = ((String) iconCompat.f4019b).getBytes(Charset.forName("UTF-16"));
                break;
            case 3:
                iconCompat.f4020c = (byte[]) iconCompat.f4019b;
                break;
            case 4:
            case j.STRING_SET_FIELD_NUMBER /* 6 */:
                iconCompat.f4020c = iconCompat.f4019b.toString().getBytes(Charset.forName("UTF-16"));
                break;
        }
        int i = iconCompat.f4018a;
        if (-1 != i) {
            cVar.j(i, 1);
        }
        byte[] bArr = iconCompat.f4020c;
        if (bArr != null) {
            cVar.i(2);
            int length = bArr.length;
            Parcel parcel = ((d) cVar).f546e;
            parcel.writeInt(length);
            parcel.writeByteArray(bArr);
        }
        Parcelable parcelable = iconCompat.f4021d;
        if (parcelable != null) {
            cVar.k(parcelable, 3);
        }
        int i5 = iconCompat.f4022e;
        if (i5 != 0) {
            cVar.j(i5, 4);
        }
        int i6 = iconCompat.f4023f;
        if (i6 != 0) {
            cVar.j(i6, 5);
        }
        ColorStateList colorStateList = iconCompat.f4024g;
        if (colorStateList != null) {
            cVar.k(colorStateList, 6);
        }
        String str = iconCompat.i;
        if (str != null) {
            cVar.i(7);
            ((d) cVar).f546e.writeString(str);
        }
        String str2 = iconCompat.f4026j;
        if (str2 != null) {
            cVar.i(8);
            ((d) cVar).f546e.writeString(str2);
        }
    }
}

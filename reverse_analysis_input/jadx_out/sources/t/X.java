package t;

import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.core.graphics.drawable.IconCompat;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class X {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public CharSequence f9725a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public IconCompat f9726b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f9727c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f9728d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f9729e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f9730f;

    public static X a(Bundle bundle) {
        Bundle bundle2 = bundle.getBundle("icon");
        CharSequence charSequence = bundle.getCharSequence("name");
        IconCompat iconCompatC = bundle2 != null ? IconCompat.c(bundle2) : null;
        String string = bundle.getString("uri");
        String string2 = bundle.getString("key");
        boolean z4 = bundle.getBoolean("isBot");
        boolean z5 = bundle.getBoolean("isImportant");
        X x4 = new X();
        x4.f9725a = charSequence;
        x4.f9726b = iconCompatC;
        x4.f9727c = string;
        x4.f9728d = string2;
        x4.f9729e = z4;
        x4.f9730f = z5;
        return x4;
    }

    public final Bundle b() {
        Bundle bundle;
        Bundle bundle2 = new Bundle();
        bundle2.putCharSequence("name", this.f9725a);
        IconCompat iconCompat = this.f9726b;
        if (iconCompat != null) {
            bundle = new Bundle();
            switch (iconCompat.f4018a) {
                case androidx.media.A.RESULT_ERROR /* -1 */:
                    bundle.putParcelable("obj", (Parcelable) iconCompat.f4019b);
                    break;
                case 0:
                default:
                    throw new IllegalArgumentException("Invalid icon");
                case 1:
                case 5:
                    bundle.putParcelable("obj", (Bitmap) iconCompat.f4019b);
                    break;
                case 2:
                case 4:
                case O.j.STRING_SET_FIELD_NUMBER /* 6 */:
                    bundle.putString("obj", (String) iconCompat.f4019b);
                    break;
                case 3:
                    bundle.putByteArray("obj", (byte[]) iconCompat.f4019b);
                    break;
            }
            bundle.putInt("type", iconCompat.f4018a);
            bundle.putInt("int1", iconCompat.f4022e);
            bundle.putInt("int2", iconCompat.f4023f);
            bundle.putString("string1", iconCompat.f4026j);
            ColorStateList colorStateList = iconCompat.f4024g;
            if (colorStateList != null) {
                bundle.putParcelable("tint_list", colorStateList);
            }
            PorterDuff.Mode mode = iconCompat.f4025h;
            if (mode != IconCompat.f4017k) {
                bundle.putString("tint_mode", mode.name());
            }
        } else {
            bundle = null;
        }
        bundle2.putBundle("icon", bundle);
        bundle2.putString("uri", this.f9727c);
        bundle2.putString("key", this.f9728d);
        bundle2.putBoolean("isBot", this.f9729e);
        bundle2.putBoolean("isImportant", this.f9730f);
        return bundle2;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof X)) {
            return false;
        }
        X x4 = (X) obj;
        String str = this.f9728d;
        String str2 = x4.f9728d;
        return (str == null && str2 == null) ? Objects.equals(Objects.toString(this.f9725a), Objects.toString(x4.f9725a)) && Objects.equals(this.f9727c, x4.f9727c) && Boolean.valueOf(this.f9729e).equals(Boolean.valueOf(x4.f9729e)) && Boolean.valueOf(this.f9730f).equals(Boolean.valueOf(x4.f9730f)) : Objects.equals(str, str2);
    }

    public final int hashCode() {
        String str = this.f9728d;
        if (str != null) {
            return str.hashCode();
        }
        return Objects.hash(this.f9725a, this.f9727c, Boolean.valueOf(this.f9729e), Boolean.valueOf(this.f9730f));
    }
}

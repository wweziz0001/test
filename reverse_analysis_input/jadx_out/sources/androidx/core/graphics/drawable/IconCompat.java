package androidx.core.graphics.drawable;

import O.j;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Shader;
import android.graphics.drawable.Icon;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import androidx.media.A;
import androidx.versionedparcelable.CustomVersionedParcelable;
import x.AbstractC0953b;

/* JADX INFO: loaded from: classes.dex */
public class IconCompat extends CustomVersionedParcelable {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final PorterDuff.Mode f4017k = PorterDuff.Mode.SRC_IN;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f4018a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f4019b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public byte[] f4020c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Parcelable f4021d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f4022e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f4023f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ColorStateList f4024g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public PorterDuff.Mode f4025h;
    public String i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public String f4026j;

    public IconCompat() {
        this.f4018a = -1;
        this.f4020c = null;
        this.f4021d = null;
        this.f4022e = 0;
        this.f4023f = 0;
        this.f4024g = null;
        this.f4025h = f4017k;
        this.i = null;
    }

    public static IconCompat c(Bundle bundle) {
        int i = bundle.getInt("type");
        IconCompat iconCompat = new IconCompat(i);
        iconCompat.f4022e = bundle.getInt("int1");
        iconCompat.f4023f = bundle.getInt("int2");
        iconCompat.f4026j = bundle.getString("string1");
        if (bundle.containsKey("tint_list")) {
            iconCompat.f4024g = (ColorStateList) bundle.getParcelable("tint_list");
        }
        if (bundle.containsKey("tint_mode")) {
            iconCompat.f4025h = PorterDuff.Mode.valueOf(bundle.getString("tint_mode"));
        }
        switch (i) {
            case A.RESULT_ERROR /* -1 */:
            case 1:
            case 5:
                iconCompat.f4019b = bundle.getParcelable("obj");
                return iconCompat;
            case 0:
            default:
                Log.w("IconCompat", "Unknown type " + i);
                return null;
            case 2:
            case 4:
            case j.STRING_SET_FIELD_NUMBER /* 6 */:
                iconCompat.f4019b = bundle.getString("obj");
                return iconCompat;
            case 3:
                iconCompat.f4019b = bundle.getByteArray("obj");
                return iconCompat;
        }
    }

    public static IconCompat d(Icon icon) {
        icon.getClass();
        int iC = AbstractC0953b.c(icon);
        if (iC == 2) {
            return g(null, AbstractC0953b.b(icon), AbstractC0953b.a(icon));
        }
        if (iC == 4) {
            Uri uriD = AbstractC0953b.d(icon);
            uriD.getClass();
            String string = uriD.toString();
            string.getClass();
            IconCompat iconCompat = new IconCompat(4);
            iconCompat.f4019b = string;
            return iconCompat;
        }
        if (iC != 6) {
            IconCompat iconCompat2 = new IconCompat(-1);
            iconCompat2.f4019b = icon;
            return iconCompat2;
        }
        Uri uriD2 = AbstractC0953b.d(icon);
        uriD2.getClass();
        String string2 = uriD2.toString();
        string2.getClass();
        IconCompat iconCompat3 = new IconCompat(6);
        iconCompat3.f4019b = string2;
        return iconCompat3;
    }

    public static Bitmap e(Bitmap bitmap, boolean z4) {
        int iMin = (int) (Math.min(bitmap.getWidth(), bitmap.getHeight()) * 0.6666667f);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iMin, iMin, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        Paint paint = new Paint(3);
        float f2 = iMin;
        float f5 = 0.5f * f2;
        float f6 = 0.9166667f * f5;
        if (z4) {
            float f7 = 0.010416667f * f2;
            paint.setColor(0);
            paint.setShadowLayer(f7, 0.0f, f2 * 0.020833334f, 1023410176);
            canvas.drawCircle(f5, f5, f6, paint);
            paint.setShadowLayer(f7, 0.0f, 0.0f, 503316480);
            canvas.drawCircle(f5, f5, f6, paint);
            paint.clearShadowLayer();
        }
        paint.setColor(-16777216);
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
        Matrix matrix = new Matrix();
        matrix.setTranslate((-(bitmap.getWidth() - iMin)) / 2.0f, (-(bitmap.getHeight() - iMin)) / 2.0f);
        bitmapShader.setLocalMatrix(matrix);
        paint.setShader(bitmapShader);
        canvas.drawCircle(f5, f5, f6, paint);
        canvas.setBitmap(null);
        return bitmapCreateBitmap;
    }

    public static IconCompat f(Bitmap bitmap) {
        bitmap.getClass();
        IconCompat iconCompat = new IconCompat(1);
        iconCompat.f4019b = bitmap;
        return iconCompat;
    }

    public static IconCompat g(Resources resources, String str, int i) {
        str.getClass();
        if (i == 0) {
            throw new IllegalArgumentException("Drawable resource ID must not be 0");
        }
        IconCompat iconCompat = new IconCompat(2);
        iconCompat.f4022e = i;
        if (resources != null) {
            try {
                iconCompat.f4019b = resources.getResourceName(i);
            } catch (Resources.NotFoundException unused) {
                throw new IllegalArgumentException("Icon resource cannot be found");
            }
        } else {
            iconCompat.f4019b = str;
        }
        iconCompat.f4026j = str;
        return iconCompat;
    }

    public final int h() {
        int i = this.f4018a;
        if (i == -1) {
            return AbstractC0953b.a(this.f4019b);
        }
        if (i == 2) {
            return this.f4022e;
        }
        throw new IllegalStateException("called getResId() on " + this);
    }

    public final Uri i() {
        int i = this.f4018a;
        if (i == -1) {
            return AbstractC0953b.d(this.f4019b);
        }
        if (i == 4 || i == 6) {
            return Uri.parse((String) this.f4019b);
        }
        throw new IllegalStateException("called getUri() on " + this);
    }

    public final String toString() {
        String str;
        if (this.f4018a == -1) {
            return String.valueOf(this.f4019b);
        }
        StringBuilder sb = new StringBuilder("Icon(typ=");
        switch (this.f4018a) {
            case 1:
                str = "BITMAP";
                break;
            case 2:
                str = "RESOURCE";
                break;
            case 3:
                str = "DATA";
                break;
            case 4:
                str = "URI";
                break;
            case 5:
                str = "BITMAP_MASKABLE";
                break;
            case j.STRING_SET_FIELD_NUMBER /* 6 */:
                str = "URI_MASKABLE";
                break;
            default:
                str = "UNKNOWN";
                break;
        }
        sb.append(str);
        switch (this.f4018a) {
            case 1:
            case 5:
                sb.append(" size=");
                sb.append(((Bitmap) this.f4019b).getWidth());
                sb.append("x");
                sb.append(((Bitmap) this.f4019b).getHeight());
                break;
            case 2:
                sb.append(" pkg=");
                sb.append(this.f4026j);
                sb.append(" id=");
                sb.append(String.format("0x%08x", Integer.valueOf(h())));
                break;
            case 3:
                sb.append(" len=");
                sb.append(this.f4022e);
                if (this.f4023f != 0) {
                    sb.append(" off=");
                    sb.append(this.f4023f);
                }
                break;
            case 4:
            case j.STRING_SET_FIELD_NUMBER /* 6 */:
                sb.append(" uri=");
                sb.append(this.f4019b);
                break;
        }
        if (this.f4024g != null) {
            sb.append(" tint=");
            sb.append(this.f4024g);
        }
        if (this.f4025h != f4017k) {
            sb.append(" mode=");
            sb.append(this.f4025h);
        }
        sb.append(")");
        return sb.toString();
    }

    public IconCompat(int i) {
        this.f4020c = null;
        this.f4021d = null;
        this.f4022e = 0;
        this.f4023f = 0;
        this.f4024g = null;
        this.f4025h = f4017k;
        this.i = null;
        this.f4018a = i;
    }
}

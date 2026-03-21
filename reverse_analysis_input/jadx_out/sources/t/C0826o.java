package t;

import android.app.Notification;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Icon;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.core.graphics.drawable.IconCompat;
import x.AbstractC0953b;

/* JADX INFO: renamed from: t.o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0826o extends Q1.D {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public IconCompat f9755e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public IconCompat f9756f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f9757g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f9758h;

    public static IconCompat j(Parcelable parcelable) {
        if (parcelable == null) {
            return null;
        }
        if (parcelable instanceof Icon) {
            return IconCompat.d((Icon) parcelable);
        }
        if (parcelable instanceof Bitmap) {
            return IconCompat.f((Bitmap) parcelable);
        }
        return null;
    }

    @Override // Q1.D
    public final void b(a1.j jVar) {
        Bitmap bitmapE;
        Notification.BigPictureStyle bigContentTitle = new Notification.BigPictureStyle((Notification.Builder) jVar.f3517n).setBigContentTitle((CharSequence) this.f1789c);
        IconCompat iconCompat = this.f9755e;
        Context context = (Context) jVar.f3516m;
        if (iconCompat != null) {
            if (Build.VERSION.SDK_INT >= 31) {
                AbstractC0825n.a(bigContentTitle, AbstractC0953b.f(iconCompat, context));
            } else {
                int iC = iconCompat.f4018a;
                if (iC == -1) {
                    iC = AbstractC0953b.c(iconCompat.f4019b);
                }
                if (iC == 1) {
                    IconCompat iconCompat2 = this.f9755e;
                    int i = iconCompat2.f4018a;
                    if (i == -1) {
                        Object obj = iconCompat2.f4019b;
                        bitmapE = obj instanceof Bitmap ? (Bitmap) obj : null;
                    } else if (i == 1) {
                        bitmapE = (Bitmap) iconCompat2.f4019b;
                    } else {
                        if (i != 5) {
                            throw new IllegalStateException("called getBitmap() on " + iconCompat2);
                        }
                        bitmapE = IconCompat.e((Bitmap) iconCompat2.f4019b, true);
                    }
                    bigContentTitle = bigContentTitle.bigPicture(bitmapE);
                }
            }
        }
        if (this.f9757g) {
            IconCompat iconCompat3 = this.f9756f;
            if (iconCompat3 == null) {
                bigContentTitle.bigLargeIcon((Bitmap) null);
            } else {
                AbstractC0824m.a(bigContentTitle, AbstractC0953b.f(iconCompat3, context));
            }
        }
        if (this.f1787a) {
            bigContentTitle.setSummaryText((CharSequence) this.f1790d);
        }
        if (Build.VERSION.SDK_INT >= 31) {
            AbstractC0825n.c(bigContentTitle, this.f9758h);
            AbstractC0825n.b(bigContentTitle, null);
        }
    }

    @Override // Q1.D
    public final String e() {
        return "androidx.core.app.NotificationCompat$BigPictureStyle";
    }

    @Override // Q1.D
    public final void g(Bundle bundle) {
        super.g(bundle);
        if (bundle.containsKey("android.largeIcon.big")) {
            this.f9756f = j(bundle.getParcelable("android.largeIcon.big"));
            this.f9757g = true;
        }
        Parcelable parcelable = bundle.getParcelable("android.picture");
        this.f9755e = parcelable != null ? j(parcelable) : j(bundle.getParcelable("android.pictureIcon"));
        this.f9758h = bundle.getBoolean("android.showBigPictureWhenCollapsed");
    }
}

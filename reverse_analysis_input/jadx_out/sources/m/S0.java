package m;

import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.Window;
import androidx.appcompat.widget.Toolbar;

/* JADX INFO: loaded from: classes.dex */
public final class S0 implements J {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Toolbar f8310a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f8311b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public View f8312c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Drawable f8313d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Drawable f8314e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Drawable f8315f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f8316g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public CharSequence f8317h;
    public CharSequence i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public CharSequence f8318j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Window.Callback f8319k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f8320l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public Drawable f8321m;

    public final void a(int i) {
        View view;
        int i5 = this.f8311b ^ i;
        this.f8311b = i;
        if (i5 != 0) {
            if ((i5 & 4) != 0) {
                if ((i & 4) != 0) {
                    b();
                }
                int i6 = this.f8311b & 4;
                Toolbar toolbar = this.f8310a;
                if (i6 != 0) {
                    Drawable drawable = this.f8315f;
                    if (drawable == null) {
                        drawable = this.f8321m;
                    }
                    toolbar.setNavigationIcon(drawable);
                } else {
                    toolbar.setNavigationIcon((Drawable) null);
                }
            }
            if ((i5 & 3) != 0) {
                c();
            }
            int i7 = i5 & 8;
            Toolbar toolbar2 = this.f8310a;
            if (i7 != 0) {
                if ((i & 8) != 0) {
                    toolbar2.setTitle(this.f8317h);
                    toolbar2.setSubtitle(this.i);
                } else {
                    toolbar2.setTitle((CharSequence) null);
                    toolbar2.setSubtitle((CharSequence) null);
                }
            }
            if ((i5 & 16) == 0 || (view = this.f8312c) == null) {
                return;
            }
            if ((i & 16) != 0) {
                toolbar2.addView(view);
            } else {
                toolbar2.removeView(view);
            }
        }
    }

    public final void b() {
        if ((this.f8311b & 4) != 0) {
            boolean zIsEmpty = TextUtils.isEmpty(this.f8318j);
            Toolbar toolbar = this.f8310a;
            if (zIsEmpty) {
                toolbar.setNavigationContentDescription(this.f8320l);
            } else {
                toolbar.setNavigationContentDescription(this.f8318j);
            }
        }
    }

    public final void c() {
        Drawable drawable;
        int i = this.f8311b;
        if ((i & 2) == 0) {
            drawable = null;
        } else if ((i & 1) == 0 || (drawable = this.f8314e) == null) {
            drawable = this.f8313d;
        }
        this.f8310a.setLogo(drawable);
    }
}

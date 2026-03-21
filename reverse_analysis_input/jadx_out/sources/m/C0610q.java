package m;

import a.AbstractC0149a;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.net.Uri;
import android.widget.ImageView;

/* JADX INFO: renamed from: m.q, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0610q extends ImageView {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final A0.y f8470l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final D0.d f8471m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f8472n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0610q(Context context, int i) {
        super(context, null, i);
        H0.a(context);
        this.f8472n = false;
        G0.a(this, getContext());
        A0.y yVar = new A0.y(this);
        this.f8470l = yVar;
        yVar.d(null, i);
        D0.d dVar = new D0.d(this);
        this.f8471m = dVar;
        dVar.j(i);
    }

    @Override // android.widget.ImageView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        A0.y yVar = this.f8470l;
        if (yVar != null) {
            yVar.b();
        }
        D0.d dVar = this.f8471m;
        if (dVar != null) {
            dVar.d();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        I0 i02;
        A0.y yVar = this.f8470l;
        if (yVar == null || (i02 = (I0) yVar.f164e) == null) {
            return null;
        }
        return i02.f8278a;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        I0 i02;
        A0.y yVar = this.f8470l;
        if (yVar == null || (i02 = (I0) yVar.f164e) == null) {
            return null;
        }
        return i02.f8279b;
    }

    public ColorStateList getSupportImageTintList() {
        I0 i02;
        D0.d dVar = this.f8471m;
        if (dVar == null || (i02 = (I0) dVar.f396n) == null) {
            return null;
        }
        return i02.f8278a;
    }

    public PorterDuff.Mode getSupportImageTintMode() {
        I0 i02;
        D0.d dVar = this.f8471m;
        if (dVar == null || (i02 = (I0) dVar.f396n) == null) {
            return null;
        }
        return i02.f8279b;
    }

    @Override // android.widget.ImageView, android.view.View
    public final boolean hasOverlappingRendering() {
        return !(((ImageView) this.f8471m.f395m).getBackground() instanceof RippleDrawable) && super.hasOverlappingRendering();
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        A0.y yVar = this.f8470l;
        if (yVar != null) {
            yVar.f160a = -1;
            yVar.f(null);
            yVar.b();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        A0.y yVar = this.f8470l;
        if (yVar != null) {
            yVar.e(i);
        }
    }

    @Override // android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        D0.d dVar = this.f8471m;
        if (dVar != null) {
            dVar.d();
        }
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        D0.d dVar = this.f8471m;
        if (dVar != null && drawable != null && !this.f8472n) {
            dVar.f394l = drawable.getLevel();
        }
        super.setImageDrawable(drawable);
        if (dVar != null) {
            dVar.d();
            if (this.f8472n) {
                return;
            }
            ImageView imageView = (ImageView) dVar.f395m;
            if (imageView.getDrawable() != null) {
                imageView.getDrawable().setLevel(dVar.f394l);
            }
        }
    }

    @Override // android.widget.ImageView
    public void setImageLevel(int i) {
        super.setImageLevel(i);
        this.f8472n = true;
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i) {
        D0.d dVar = this.f8471m;
        if (dVar != null) {
            ImageView imageView = (ImageView) dVar.f395m;
            if (i != 0) {
                Drawable drawableU = AbstractC0149a.u(imageView.getContext(), i);
                if (drawableU != null) {
                    M.a(drawableU);
                }
                imageView.setImageDrawable(drawableU);
            } else {
                imageView.setImageDrawable(null);
            }
            dVar.d();
        }
    }

    @Override // android.widget.ImageView
    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        D0.d dVar = this.f8471m;
        if (dVar != null) {
            dVar.d();
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        A0.y yVar = this.f8470l;
        if (yVar != null) {
            yVar.g(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        A0.y yVar = this.f8470l;
        if (yVar != null) {
            yVar.h(mode);
        }
    }

    public void setSupportImageTintList(ColorStateList colorStateList) {
        D0.d dVar = this.f8471m;
        if (dVar != null) {
            if (((I0) dVar.f396n) == null) {
                dVar.f396n = new I0();
            }
            I0 i02 = (I0) dVar.f396n;
            i02.f8278a = colorStateList;
            i02.f8281d = true;
            dVar.d();
        }
    }

    public void setSupportImageTintMode(PorterDuff.Mode mode) {
        D0.d dVar = this.f8471m;
        if (dVar != null) {
            if (((I0) dVar.f396n) == null) {
                dVar.f396n = new I0();
            }
            I0 i02 = (I0) dVar.f396n;
            i02.f8279b = mode;
            i02.f8280c = true;
            dVar.d();
        }
    }
}

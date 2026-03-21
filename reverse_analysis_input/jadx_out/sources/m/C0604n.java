package m;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.Log;

/* JADX INFO: renamed from: m.n, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0604n {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final PorterDuff.Mode f8454b = PorterDuff.Mode.SRC_IN;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static C0604n f8455c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public C0603m0 f8456a;

    public static synchronized void b() {
        if (f8455c == null) {
            C0604n c0604n = new C0604n();
            f8455c = c0604n;
            c0604n.f8456a = C0603m0.b();
            C0603m0 c0603m0 = f8455c.f8456a;
            y2.n nVar = new y2.n();
            synchronized (c0603m0) {
                c0603m0.f8453e = nVar;
            }
        }
    }

    public static void c(Drawable drawable, I0 i02, int[] iArr) {
        PorterDuff.Mode mode = C0603m0.f8446f;
        int[] state = drawable.getState();
        int[] iArr2 = M.f8291a;
        if (drawable.mutate() != drawable) {
            Log.d("ResourceManagerInternal", "Mutated drawable is not the same instance as the input.");
            return;
        }
        if ((drawable instanceof LayerDrawable) && drawable.isStateful()) {
            drawable.setState(new int[0]);
            drawable.setState(state);
        }
        boolean z4 = i02.f8281d;
        if (!z4 && !i02.f8280c) {
            drawable.clearColorFilter();
            return;
        }
        PorterDuffColorFilter porterDuffColorFilterE = null;
        ColorStateList colorStateList = z4 ? i02.f8278a : null;
        PorterDuff.Mode mode2 = i02.f8280c ? i02.f8279b : C0603m0.f8446f;
        if (colorStateList != null && mode2 != null) {
            porterDuffColorFilterE = C0603m0.e(colorStateList.getColorForState(iArr, 0), mode2);
        }
        drawable.setColorFilter(porterDuffColorFilterE);
    }

    public final synchronized Drawable a(Context context, int i) {
        return this.f8456a.c(context, i);
    }
}

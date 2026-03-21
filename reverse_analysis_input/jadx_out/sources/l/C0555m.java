package l;

import D.I;
import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.Display;
import android.view.Gravity;
import android.view.View;
import android.view.WindowManager;
import com.example.hqp_mobile_app.R;
import java.lang.reflect.Field;

/* JADX INFO: renamed from: l.m, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0555m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f7782a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final MenuC0550h f7783b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f7784c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f7785d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public View f7786e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f7788g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public InterfaceC0556n f7789h;
    public AbstractC0552j i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public C0553k f7790j;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f7787f = 8388611;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final C0553k f7791k = new C0553k(this);

    public C0555m(int i, Context context, View view, MenuC0550h menuC0550h, boolean z4) {
        this.f7782a = context;
        this.f7783b = menuC0550h;
        this.f7786e = view;
        this.f7784c = z4;
        this.f7785d = i;
    }

    public final AbstractC0552j a() {
        AbstractC0552j viewOnKeyListenerC0560r;
        if (this.i == null) {
            Context context = this.f7782a;
            Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
            Point point = new Point();
            AbstractC0554l.a(defaultDisplay, point);
            if (Math.min(point.x, point.y) >= context.getResources().getDimensionPixelSize(R.dimen.abc_cascading_menus_min_smallest_width)) {
                viewOnKeyListenerC0560r = new ViewOnKeyListenerC0547e(context, this.f7786e, this.f7785d, this.f7784c);
            } else {
                View view = this.f7786e;
                Context context2 = this.f7782a;
                boolean z4 = this.f7784c;
                viewOnKeyListenerC0560r = new ViewOnKeyListenerC0560r(this.f7785d, context2, view, this.f7783b, z4);
            }
            viewOnKeyListenerC0560r.l(this.f7783b);
            viewOnKeyListenerC0560r.r(this.f7791k);
            viewOnKeyListenerC0560r.n(this.f7786e);
            viewOnKeyListenerC0560r.i(this.f7789h);
            viewOnKeyListenerC0560r.o(this.f7788g);
            viewOnKeyListenerC0560r.p(this.f7787f);
            this.i = viewOnKeyListenerC0560r;
        }
        return this.i;
    }

    public final boolean b() {
        AbstractC0552j abstractC0552j = this.i;
        return abstractC0552j != null && abstractC0552j.g();
    }

    public void c() {
        this.i = null;
        C0553k c0553k = this.f7790j;
        if (c0553k != null) {
            c0553k.onDismiss();
        }
    }

    public final void d(int i, int i5, boolean z4, boolean z5) {
        AbstractC0552j abstractC0552jA = a();
        abstractC0552jA.s(z5);
        if (z4) {
            int i6 = this.f7787f;
            View view = this.f7786e;
            Field field = I.f300a;
            if ((Gravity.getAbsoluteGravity(i6, view.getLayoutDirection()) & 7) == 5) {
                i -= this.f7786e.getWidth();
            }
            abstractC0552jA.q(i);
            abstractC0552jA.t(i5);
            int i7 = (int) ((this.f7782a.getResources().getDisplayMetrics().density * 48.0f) / 2.0f);
            abstractC0552jA.f7780l = new Rect(i - i7, i5 - i7, i + i7, i5 + i7);
        }
        abstractC0552jA.c();
    }
}

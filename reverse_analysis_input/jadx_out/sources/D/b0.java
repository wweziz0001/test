package D;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import java.lang.reflect.Field;
import java.util.Objects;
import w.C0939c;

/* JADX INFO: loaded from: classes.dex */
public final class b0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final b0 f330b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a0 f331a;

    static {
        if (Build.VERSION.SDK_INT >= 30) {
            f330b = Z.f323l;
        } else {
            f330b = a0.f325b;
        }
    }

    public b0(WindowInsets windowInsets) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 30) {
            this.f331a = new Z(this, windowInsets);
            return;
        }
        if (i >= 29) {
            this.f331a = new Y(this, windowInsets);
        } else if (i >= 28) {
            this.f331a = new X(this, windowInsets);
        } else {
            this.f331a = new W(this, windowInsets);
        }
    }

    public static C0939c a(C0939c c0939c, int i, int i5, int i6, int i7) {
        int iMax = Math.max(0, c0939c.f10402a - i);
        int iMax2 = Math.max(0, c0939c.f10403b - i5);
        int iMax3 = Math.max(0, c0939c.f10404c - i6);
        int iMax4 = Math.max(0, c0939c.f10405d - i7);
        return (iMax == i && iMax2 == i5 && iMax3 == i6 && iMax4 == i7) ? c0939c : C0939c.a(iMax, iMax2, iMax3, iMax4);
    }

    public static b0 c(WindowInsets windowInsets, View view) {
        windowInsets.getClass();
        b0 b0Var = new b0(windowInsets);
        if (view != null && view.isAttachedToWindow()) {
            Field field = I.f300a;
            b0 b0VarA = A.a(view);
            a0 a0Var = b0Var.f331a;
            a0Var.l(b0VarA);
            a0Var.d(view.getRootView());
        }
        return b0Var;
    }

    public final WindowInsets b() {
        a0 a0Var = this.f331a;
        if (a0Var instanceof V) {
            return ((V) a0Var).f319c;
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b0)) {
            return false;
        }
        return Objects.equals(this.f331a, ((b0) obj).f331a);
    }

    public final int hashCode() {
        a0 a0Var = this.f331a;
        if (a0Var == null) {
            return 0;
        }
        return a0Var.hashCode();
    }

    public b0() {
        this.f331a = new a0(this);
    }
}

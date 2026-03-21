package D;

import android.view.View;
import android.view.WindowInsets;

/* JADX INFO: loaded from: classes.dex */
public abstract class A {
    public static b0 a(View view) {
        WindowInsets rootWindowInsets = view.getRootWindowInsets();
        if (rootWindowInsets == null) {
            return null;
        }
        b0 b0VarC = b0.c(rootWindowInsets, null);
        a0 a0Var = b0VarC.f331a;
        a0Var.l(b0VarC);
        a0Var.d(view.getRootView());
        return b0VarC;
    }

    public static int b(View view) {
        return view.getScrollIndicators();
    }

    public static void c(View view, int i) {
        view.setScrollIndicators(i);
    }

    public static void d(View view, int i, int i5) {
        view.setScrollIndicators(i, i5);
    }
}

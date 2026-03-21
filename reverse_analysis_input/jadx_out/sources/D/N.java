package D;

import android.view.View;
import android.view.ViewParent;

/* JADX INFO: loaded from: classes.dex */
public abstract class N {
    public static boolean a(ViewParent viewParent, View view, float f2, float f5, boolean z4) {
        return viewParent.onNestedFling(view, f2, f5, z4);
    }

    public static boolean b(ViewParent viewParent, View view, float f2, float f5) {
        return viewParent.onNestedPreFling(view, f2, f5);
    }

    public static void c(ViewParent viewParent, View view, int i, int i5, int[] iArr) {
        viewParent.onNestedPreScroll(view, i, i5, iArr);
    }

    public static void d(ViewParent viewParent, View view, int i, int i5, int i6, int i7) {
        viewParent.onNestedScroll(view, i, i5, i6, i7);
    }

    public static void e(ViewParent viewParent, View view, View view2, int i) {
        viewParent.onNestedScrollAccepted(view, view2, i);
    }

    public static boolean f(ViewParent viewParent, View view, View view2, int i) {
        return viewParent.onStartNestedScroll(view, view2, i);
    }

    public static void g(ViewParent viewParent, View view) {
        viewParent.onStopNestedScroll(view);
    }
}

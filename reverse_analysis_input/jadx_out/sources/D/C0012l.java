package D;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;

/* JADX INFO: renamed from: D.l, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0012l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ViewParent f354a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ViewParent f355b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ViewGroup f356c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f357d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int[] f358e;

    public C0012l(ViewGroup viewGroup) {
        this.f356c = viewGroup;
    }

    public final boolean a(float f2, float f5, boolean z4) {
        ViewParent viewParentE;
        if (!this.f357d || (viewParentE = e(0)) == null) {
            return false;
        }
        try {
            return N.a(viewParentE, this.f356c, f2, f5, z4);
        } catch (AbstractMethodError e5) {
            Log.e("ViewParentCompat", "ViewParent " + viewParentE + " does not implement interface method onNestedFling", e5);
            return false;
        }
    }

    public final boolean b(float f2, float f5) {
        ViewParent viewParentE;
        if (!this.f357d || (viewParentE = e(0)) == null) {
            return false;
        }
        try {
            return N.b(viewParentE, this.f356c, f2, f5);
        } catch (AbstractMethodError e5) {
            Log.e("ViewParentCompat", "ViewParent " + viewParentE + " does not implement interface method onNestedPreFling", e5);
            return false;
        }
    }

    public final boolean c(int i, int i5, int i6, int[] iArr, int[] iArr2) {
        ViewParent viewParentE;
        int i7;
        int i8;
        if (!this.f357d || (viewParentE = e(i6)) == null) {
            return false;
        }
        if (i == 0 && i5 == 0) {
            if (iArr2 == null) {
                return false;
            }
            iArr2[0] = 0;
            iArr2[1] = 0;
            return false;
        }
        ViewGroup viewGroup = this.f356c;
        if (iArr2 != null) {
            viewGroup.getLocationInWindow(iArr2);
            i7 = iArr2[0];
            i8 = iArr2[1];
        } else {
            i7 = 0;
            i8 = 0;
        }
        if (iArr == null) {
            if (this.f358e == null) {
                this.f358e = new int[2];
            }
            iArr = this.f358e;
        }
        iArr[0] = 0;
        iArr[1] = 0;
        if (viewParentE instanceof InterfaceC0013m) {
            ((InterfaceC0013m) viewParentE).e(i, i5, i6, iArr);
        } else if (i6 == 0) {
            try {
                N.c(viewParentE, viewGroup, i, i5, iArr);
            } catch (AbstractMethodError e5) {
                Log.e("ViewParentCompat", "ViewParent " + viewParentE + " does not implement interface method onNestedPreScroll", e5);
            }
        }
        if (iArr2 != null) {
            viewGroup.getLocationInWindow(iArr2);
            iArr2[0] = iArr2[0] - i7;
            iArr2[1] = iArr2[1] - i8;
        }
        return (iArr[0] == 0 && iArr[1] == 0) ? false : true;
    }

    public final boolean d(int i, int i5, int i6, int i7, int[] iArr, int i8, int[] iArr2) {
        ViewParent viewParentE;
        int i9;
        int i10;
        int[] iArr3;
        if (!this.f357d || (viewParentE = e(i8)) == null) {
            return false;
        }
        if (i == 0 && i5 == 0 && i6 == 0 && i7 == 0) {
            if (iArr != null) {
                iArr[0] = 0;
                iArr[1] = 0;
            }
            return false;
        }
        ViewGroup viewGroup = this.f356c;
        if (iArr != null) {
            viewGroup.getLocationInWindow(iArr);
            i9 = iArr[0];
            i10 = iArr[1];
        } else {
            i9 = 0;
            i10 = 0;
        }
        if (iArr2 == null) {
            if (this.f358e == null) {
                this.f358e = new int[2];
            }
            int[] iArr4 = this.f358e;
            iArr4[0] = 0;
            iArr4[1] = 0;
            iArr3 = iArr4;
        } else {
            iArr3 = iArr2;
        }
        if (viewParentE instanceof InterfaceC0014n) {
            ((InterfaceC0014n) viewParentE).d(viewGroup, i, i5, i6, i7, i8, iArr3);
        } else {
            iArr3[0] = iArr3[0] + i6;
            iArr3[1] = iArr3[1] + i7;
            if (viewParentE instanceof InterfaceC0013m) {
                ((InterfaceC0013m) viewParentE).b(viewGroup, i, i5, i6, i7, i8);
            } else if (i8 == 0) {
                try {
                    N.d(viewParentE, viewGroup, i, i5, i6, i7);
                } catch (AbstractMethodError e5) {
                    Log.e("ViewParentCompat", "ViewParent " + viewParentE + " does not implement interface method onNestedScroll", e5);
                }
            }
        }
        if (iArr != null) {
            viewGroup.getLocationInWindow(iArr);
            iArr[0] = iArr[0] - i9;
            iArr[1] = iArr[1] - i10;
        }
        return true;
    }

    public final ViewParent e(int i) {
        if (i == 0) {
            return this.f354a;
        }
        if (i != 1) {
            return null;
        }
        return this.f355b;
    }

    public final boolean f(int i) {
        return e(i) != null;
    }

    public final boolean g(int i, int i5) {
        boolean zF;
        if (f(i5)) {
            return true;
        }
        if (this.f357d) {
            ViewGroup viewGroup = this.f356c;
            View view = viewGroup;
            for (ViewParent parent = viewGroup.getParent(); parent != null; parent = parent.getParent()) {
                boolean z4 = parent instanceof InterfaceC0013m;
                if (z4) {
                    zF = ((InterfaceC0013m) parent).f(view, viewGroup, i, i5);
                } else if (i5 == 0) {
                    try {
                        zF = N.f(parent, view, viewGroup, i);
                    } catch (AbstractMethodError e5) {
                        Log.e("ViewParentCompat", "ViewParent " + parent + " does not implement interface method onStartNestedScroll", e5);
                        zF = false;
                    }
                } else {
                    zF = false;
                }
                if (zF) {
                    if (i5 == 0) {
                        this.f354a = parent;
                    } else if (i5 == 1) {
                        this.f355b = parent;
                    }
                    if (z4) {
                        ((InterfaceC0013m) parent).a(view, viewGroup, i, i5);
                    } else if (i5 == 0) {
                        try {
                            N.e(parent, view, viewGroup, i);
                        } catch (AbstractMethodError e6) {
                            Log.e("ViewParentCompat", "ViewParent " + parent + " does not implement interface method onNestedScrollAccepted", e6);
                        }
                    }
                    return true;
                }
                if (parent instanceof View) {
                    view = (View) parent;
                }
            }
        }
        return false;
    }

    public final void h(int i) {
        ViewParent viewParentE = e(i);
        if (viewParentE != null) {
            boolean z4 = viewParentE instanceof InterfaceC0013m;
            ViewGroup viewGroup = this.f356c;
            if (z4) {
                ((InterfaceC0013m) viewParentE).c(viewGroup, i);
            } else if (i == 0) {
                try {
                    N.g(viewParentE, viewGroup);
                } catch (AbstractMethodError e5) {
                    Log.e("ViewParentCompat", "ViewParent " + viewParentE + " does not implement interface method onStopNestedScroll", e5);
                }
            }
            if (i == 0) {
                this.f354a = null;
            } else {
                if (i != 1) {
                    return;
                }
                this.f355b = null;
            }
        }
    }
}

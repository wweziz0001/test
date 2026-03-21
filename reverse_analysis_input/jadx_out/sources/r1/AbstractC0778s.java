package r1;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;
import b3.AbstractC0307a;
import java.lang.reflect.Field;
import java.util.ArrayList;
import m3.C0675i;
import q1.AbstractC0742a;

/* JADX INFO: renamed from: r1.s, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0778s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Z1.s f9511a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public RecyclerView f9512b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Z1.c f9513c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Z1.c f9514d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f9515e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f9516f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f9517g;

    public AbstractC0778s() {
        C0777r c0777r = new C0777r(this, 0);
        C0777r c0777r2 = new C0777r(this, 1);
        this.f9513c = new Z1.c(c0777r);
        this.f9514d = new Z1.c(c0777r2);
        this.f9515e = false;
    }

    public static int e(int i, int i5, int i6) {
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        return mode != Integer.MIN_VALUE ? mode != 1073741824 ? Math.max(i5, i6) : size : Math.min(size, Math.max(i5, i6));
    }

    public static void v(View view) {
        ((C0779t) view.getLayoutParams()).getClass();
        throw null;
    }

    public static C0769j w(Context context, AttributeSet attributeSet, int i, int i5) {
        C0769j c0769j = new C0769j(1);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0742a.f9371a, i, i5);
        c0769j.f9497b = typedArrayObtainStyledAttributes.getInt(0, 1);
        c0769j.f9498c = typedArrayObtainStyledAttributes.getInt(9, 1);
        c0769j.f9499d = typedArrayObtainStyledAttributes.getBoolean(8, false);
        c0769j.f9500e = typedArrayObtainStyledAttributes.getBoolean(10, false);
        typedArrayObtainStyledAttributes.recycle();
        return c0769j;
    }

    public void A(AccessibilityEvent accessibilityEvent) {
        RecyclerView recyclerView = this.f9512b;
        io.flutter.plugin.platform.c cVar = recyclerView.f4730l;
        C0750A c0750a = recyclerView.f4727i0;
        if (recyclerView == null || accessibilityEvent == null) {
            return;
        }
        boolean z4 = true;
        if (!recyclerView.canScrollVertically(1) && !this.f9512b.canScrollVertically(-1) && !this.f9512b.canScrollHorizontally(-1) && !this.f9512b.canScrollHorizontally(1)) {
            z4 = false;
        }
        accessibilityEvent.setScrollable(z4);
        this.f9512b.getClass();
    }

    public abstract void B(Parcelable parcelable);

    public abstract Parcelable C();

    public final void E() {
        int iP = p() - 1;
        if (iP < 0) {
            return;
        }
        RecyclerView.j(o(iP));
        throw null;
    }

    public final void F(io.flutter.plugin.platform.c cVar) {
        int size = ((ArrayList) cVar.f6747c).size();
        int i = size - 1;
        ArrayList arrayList = (ArrayList) cVar.f6747c;
        if (i >= 0) {
            AbstractC0307a.q(arrayList.get(i));
            throw null;
        }
        arrayList.clear();
        if (size > 0) {
            this.f9512b.invalidate();
        }
    }

    public final boolean G(RecyclerView recyclerView, View view, Rect rect, boolean z4, boolean z5) {
        int iS = s();
        int iU = u();
        int iT = this.f9516f - t();
        int iR = this.f9517g - r();
        int left = (view.getLeft() + rect.left) - view.getScrollX();
        int top = (view.getTop() + rect.top) - view.getScrollY();
        int iWidth = rect.width() + left;
        int iHeight = rect.height() + top;
        int i = left - iS;
        int iMin = Math.min(0, i);
        int i5 = top - iU;
        int iMin2 = Math.min(0, i5);
        int i6 = iWidth - iT;
        int iMax = Math.max(0, i6);
        int iMax2 = Math.max(0, iHeight - iR);
        RecyclerView recyclerView2 = this.f9512b;
        Field field = D.I.f300a;
        if (recyclerView2.getLayoutDirection() != 1) {
            if (iMin == 0) {
                iMin = Math.min(i, iMax);
            }
            iMax = iMin;
        } else if (iMax == 0) {
            iMax = Math.max(iMin, i6);
        }
        if (iMin2 == 0) {
            iMin2 = Math.min(i5, iMax2);
        }
        int[] iArr = {iMax, iMin2};
        int i7 = iArr[0];
        int i8 = iArr[1];
        if (z5) {
            View focusedChild = recyclerView.getFocusedChild();
            if (focusedChild == null) {
                return false;
            }
            int iS2 = s();
            int iU2 = u();
            int iT2 = this.f9516f - t();
            int iR2 = this.f9517g - r();
            Rect rect2 = this.f9512b.f4742r;
            int[] iArr2 = RecyclerView.f4693s0;
            C0779t c0779t = (C0779t) focusedChild.getLayoutParams();
            Rect rect3 = c0779t.f9518a;
            rect2.set((focusedChild.getLeft() - rect3.left) - ((ViewGroup.MarginLayoutParams) c0779t).leftMargin, (focusedChild.getTop() - rect3.top) - ((ViewGroup.MarginLayoutParams) c0779t).topMargin, focusedChild.getRight() + rect3.right + ((ViewGroup.MarginLayoutParams) c0779t).rightMargin, focusedChild.getBottom() + rect3.bottom + ((ViewGroup.MarginLayoutParams) c0779t).bottomMargin);
            if (rect2.left - i7 >= iT2 || rect2.right - i7 <= iS2 || rect2.top - i8 >= iR2 || rect2.bottom - i8 <= iU2) {
                return false;
            }
        }
        if (i7 == 0 && i8 == 0) {
            return false;
        }
        if (z4) {
            recyclerView.scrollBy(i7, i8);
            return true;
        }
        recyclerView.r(i7, i8);
        return true;
    }

    public final void H() {
        RecyclerView recyclerView = this.f9512b;
        if (recyclerView != null) {
            recyclerView.requestLayout();
        }
    }

    public final void I(RecyclerView recyclerView) {
        if (recyclerView == null) {
            this.f9512b = null;
            this.f9511a = null;
            this.f9516f = 0;
            this.f9517g = 0;
            return;
        }
        this.f9512b = recyclerView;
        this.f9511a = recyclerView.f4736o;
        this.f9516f = recyclerView.getWidth();
        this.f9517g = recyclerView.getHeight();
    }

    public abstract void a(String str);

    public abstract boolean b();

    public abstract boolean c();

    public boolean d(C0779t c0779t) {
        return c0779t != null;
    }

    public abstract int f(C0750A c0750a);

    public abstract void g(C0750A c0750a);

    public abstract int h(C0750A c0750a);

    public abstract int i(C0750A c0750a);

    public abstract void j(C0750A c0750a);

    public abstract int k(C0750A c0750a);

    public abstract C0779t l();

    public C0779t m(Context context, AttributeSet attributeSet) {
        return new C0779t(context, attributeSet);
    }

    public C0779t n(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C0779t ? new C0779t((C0779t) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new C0779t((ViewGroup.MarginLayoutParams) layoutParams) : new C0779t(layoutParams);
    }

    public final View o(int i) {
        Z1.s sVar = this.f9511a;
        if (sVar == null) {
            return null;
        }
        int i5 = -1;
        if (i >= 0) {
            int childCount = ((RecyclerView) ((C0675i) sVar.f3085m).f8712m).getChildCount();
            int i6 = i;
            while (true) {
                if (i6 >= childCount) {
                    break;
                }
                N0.c cVar = (N0.c) sVar.f3086n;
                int iE = i - (i6 - cVar.E(i6));
                if (iE == 0) {
                    i5 = i6;
                    while (cVar.F(i5)) {
                        i5++;
                    }
                } else {
                    i6 += iE;
                }
            }
        }
        return ((RecyclerView) ((C0675i) sVar.f3085m).f8712m).getChildAt(i5);
    }

    public final int p() {
        Z1.s sVar = this.f9511a;
        if (sVar != null) {
            return ((RecyclerView) ((C0675i) sVar.f3085m).f8712m).getChildCount() - ((ArrayList) sVar.f3087o).size();
        }
        return 0;
    }

    public int q(io.flutter.plugin.platform.c cVar, C0750A c0750a) {
        RecyclerView recyclerView = this.f9512b;
        if (recyclerView == null) {
            return 1;
        }
        recyclerView.getClass();
        return 1;
    }

    public final int r() {
        RecyclerView recyclerView = this.f9512b;
        if (recyclerView != null) {
            return recyclerView.getPaddingBottom();
        }
        return 0;
    }

    public final int s() {
        RecyclerView recyclerView = this.f9512b;
        if (recyclerView != null) {
            return recyclerView.getPaddingLeft();
        }
        return 0;
    }

    public final int t() {
        RecyclerView recyclerView = this.f9512b;
        if (recyclerView != null) {
            return recyclerView.getPaddingRight();
        }
        return 0;
    }

    public final int u() {
        RecyclerView recyclerView = this.f9512b;
        if (recyclerView != null) {
            return recyclerView.getPaddingTop();
        }
        return 0;
    }

    public int x(io.flutter.plugin.platform.c cVar, C0750A c0750a) {
        RecyclerView recyclerView = this.f9512b;
        if (recyclerView == null) {
            return 1;
        }
        recyclerView.getClass();
        return 1;
    }

    public abstract boolean y();

    public abstract void z(RecyclerView recyclerView);

    public void D(int i) {
    }
}

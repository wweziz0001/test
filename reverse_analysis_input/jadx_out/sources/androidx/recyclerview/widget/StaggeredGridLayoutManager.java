package androidx.recyclerview.widget;

import A.b;
import D.C0015o;
import D.I;
import L0.e;
import Q1.C;
import android.content.Context;
import android.graphics.Rect;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import io.flutter.plugin.platform.c;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.BitSet;
import l1.E;
import r1.AbstractC0778s;
import r1.C0750A;
import r1.C0755F;
import r1.C0757H;
import r1.C0758I;
import r1.C0769j;
import r1.C0779t;

/* JADX INFO: loaded from: classes.dex */
public class StaggeredGridLayoutManager extends AbstractC0778s {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f4751h;
    public final E[] i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e f4752j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final e f4753k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f4754l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final boolean f4755m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final boolean f4756n = false;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final C0757H f4757o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final int f4758p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public C0758I f4759q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final boolean f4760r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final b f4761s;

    public StaggeredGridLayoutManager(Context context, AttributeSet attributeSet, int i, int i5) {
        this.f4751h = -1;
        this.f4755m = false;
        C0757H c0757h = new C0757H();
        this.f4757o = c0757h;
        this.f4758p = 2;
        new Rect();
        new p1.b(this, 9);
        this.f4760r = true;
        this.f4761s = new b(this, 11);
        C0769j c0769jW = AbstractC0778s.w(context, attributeSet, i, i5);
        int i6 = c0769jW.f9497b;
        if (i6 != 0 && i6 != 1) {
            throw new IllegalArgumentException("invalid orientation.");
        }
        a(null);
        if (i6 != this.f4754l) {
            this.f4754l = i6;
            e eVar = this.f4752j;
            this.f4752j = this.f4753k;
            this.f4753k = eVar;
            H();
        }
        int i7 = c0769jW.f9498c;
        a(null);
        if (i7 != this.f4751h) {
            c0757h.f9437a = null;
            H();
            this.f4751h = i7;
            new BitSet(this.f4751h);
            this.i = new E[this.f4751h];
            for (int i8 = 0; i8 < this.f4751h; i8++) {
                this.i[i8] = new E(this, i8);
            }
            H();
        }
        boolean z4 = c0769jW.f9499d;
        a(null);
        C0758I c0758i = this.f4759q;
        if (c0758i != null && c0758i.f9445s != z4) {
            c0758i.f9445s = z4;
        }
        this.f4755m = z4;
        H();
        C0015o c0015o = new C0015o(7);
        c0015o.f360b = 0;
        c0015o.f361c = 0;
        this.f4752j = e.b(this, this.f4754l);
        this.f4753k = e.b(this, 1 - this.f4754l);
    }

    @Override // r1.AbstractC0778s
    public final void A(AccessibilityEvent accessibilityEvent) {
        super.A(accessibilityEvent);
        if (p() > 0) {
            View viewO = O(false);
            View viewN = N(false);
            if (viewO == null || viewN == null) {
                return;
            }
            ((C0779t) viewO.getLayoutParams()).getClass();
            throw null;
        }
    }

    @Override // r1.AbstractC0778s
    public final void B(Parcelable parcelable) {
        if (parcelable instanceof C0758I) {
            this.f4759q = (C0758I) parcelable;
            H();
        }
    }

    @Override // r1.AbstractC0778s
    public final Parcelable C() {
        C0758I c0758i = this.f4759q;
        if (c0758i != null) {
            C0758I c0758i2 = new C0758I();
            c0758i2.f9440n = c0758i.f9440n;
            c0758i2.f9438l = c0758i.f9438l;
            c0758i2.f9439m = c0758i.f9439m;
            c0758i2.f9441o = c0758i.f9441o;
            c0758i2.f9442p = c0758i.f9442p;
            c0758i2.f9443q = c0758i.f9443q;
            c0758i2.f9445s = c0758i.f9445s;
            c0758i2.f9446t = c0758i.f9446t;
            c0758i2.f9447u = c0758i.f9447u;
            c0758i2.f9444r = c0758i.f9444r;
            return c0758i2;
        }
        C0758I c0758i3 = new C0758I();
        c0758i3.f9445s = this.f4755m;
        c0758i3.f9446t = false;
        c0758i3.f9447u = false;
        c0758i3.f9442p = 0;
        if (p() > 0) {
            P();
            c0758i3.f9438l = 0;
            View viewN = this.f4756n ? N(true) : O(true);
            if (viewN != null) {
                ((C0779t) viewN.getLayoutParams()).getClass();
                throw null;
            }
            c0758i3.f9439m = -1;
            int i = this.f4751h;
            c0758i3.f9440n = i;
            c0758i3.f9441o = new int[i];
            for (int i5 = 0; i5 < this.f4751h; i5++) {
                E e5 = this.i[i5];
                int iH = e5.f7917a;
                if (iH == Integer.MIN_VALUE) {
                    if (((ArrayList) e5.f7920d).size() == 0) {
                        iH = Integer.MIN_VALUE;
                    } else {
                        View view = (View) ((ArrayList) e5.f7920d).get(0);
                        C0755F c0755f = (C0755F) view.getLayoutParams();
                        e5.f7917a = ((StaggeredGridLayoutManager) e5.f7921e).f4752j.d(view);
                        c0755f.getClass();
                        iH = e5.f7917a;
                    }
                }
                if (iH != Integer.MIN_VALUE) {
                    iH -= this.f4752j.h();
                }
                c0758i3.f9441o[i5] = iH;
            }
        } else {
            c0758i3.f9438l = -1;
            c0758i3.f9439m = -1;
            c0758i3.f9440n = 0;
        }
        return c0758i3;
    }

    @Override // r1.AbstractC0778s
    public final void D(int i) {
        if (i == 0) {
            J();
        }
    }

    public final boolean J() {
        int i = this.f4751h;
        boolean z4 = this.f4756n;
        if (p() == 0 || this.f4758p == 0 || !this.f9515e) {
            return false;
        }
        if (z4) {
            Q();
            P();
        } else {
            P();
            Q();
        }
        int iP = p();
        int i5 = iP - 1;
        new BitSet(i).set(0, i, true);
        if (this.f4754l == 1) {
            RecyclerView recyclerView = this.f9512b;
            Field field = I.f300a;
            if (recyclerView.getLayoutDirection() != 1) {
            }
        }
        if (z4) {
            iP = -1;
        } else {
            i5 = 0;
        }
        if (i5 == iP) {
            return false;
        }
        ((C0755F) o(i5).getLayoutParams()).getClass();
        throw null;
    }

    public final int K(C0750A c0750a) {
        if (p() == 0) {
            return 0;
        }
        e eVar = this.f4752j;
        boolean z4 = !this.f4760r;
        return C.i(c0750a, eVar, O(z4), N(z4), this, this.f4760r);
    }

    public final void L(C0750A c0750a) {
        if (p() == 0) {
            return;
        }
        boolean z4 = !this.f4760r;
        View viewO = O(z4);
        View viewN = N(z4);
        if (p() == 0 || c0750a.a() == 0 || viewO == null || viewN == null) {
            return;
        }
        ((C0779t) viewO.getLayoutParams()).getClass();
        throw null;
    }

    public final int M(C0750A c0750a) {
        if (p() == 0) {
            return 0;
        }
        e eVar = this.f4752j;
        boolean z4 = !this.f4760r;
        return C.j(c0750a, eVar, O(z4), N(z4), this, this.f4760r);
    }

    public final View N(boolean z4) {
        int iH = this.f4752j.h();
        int iE = this.f4752j.e();
        View view = null;
        for (int iP = p() - 1; iP >= 0; iP--) {
            View viewO = o(iP);
            int iD = this.f4752j.d(viewO);
            int iC = this.f4752j.c(viewO);
            if (iC > iH && iD < iE) {
                if (iC <= iE || !z4) {
                    return viewO;
                }
                if (view == null) {
                    view = viewO;
                }
            }
        }
        return view;
    }

    public final View O(boolean z4) {
        int iH = this.f4752j.h();
        int iE = this.f4752j.e();
        int iP = p();
        View view = null;
        for (int i = 0; i < iP; i++) {
            View viewO = o(i);
            int iD = this.f4752j.d(viewO);
            if (this.f4752j.c(viewO) > iH && iD < iE) {
                if (iD >= iH || !z4) {
                    return viewO;
                }
                if (view == null) {
                    view = viewO;
                }
            }
        }
        return view;
    }

    public final void P() {
        if (p() == 0) {
            return;
        }
        AbstractC0778s.v(o(0));
        throw null;
    }

    public final void Q() {
        int iP = p();
        if (iP == 0) {
            return;
        }
        AbstractC0778s.v(o(iP - 1));
        throw null;
    }

    @Override // r1.AbstractC0778s
    public final void a(String str) {
        RecyclerView recyclerView;
        if (this.f4759q != null || (recyclerView = this.f9512b) == null) {
            return;
        }
        recyclerView.b(str);
    }

    @Override // r1.AbstractC0778s
    public final boolean b() {
        return this.f4754l == 0;
    }

    @Override // r1.AbstractC0778s
    public final boolean c() {
        return this.f4754l == 1;
    }

    @Override // r1.AbstractC0778s
    public final boolean d(C0779t c0779t) {
        return c0779t instanceof C0755F;
    }

    @Override // r1.AbstractC0778s
    public final int f(C0750A c0750a) {
        return K(c0750a);
    }

    @Override // r1.AbstractC0778s
    public final void g(C0750A c0750a) {
        L(c0750a);
    }

    @Override // r1.AbstractC0778s
    public final int h(C0750A c0750a) {
        return M(c0750a);
    }

    @Override // r1.AbstractC0778s
    public final int i(C0750A c0750a) {
        return K(c0750a);
    }

    @Override // r1.AbstractC0778s
    public final void j(C0750A c0750a) {
        L(c0750a);
    }

    @Override // r1.AbstractC0778s
    public final int k(C0750A c0750a) {
        return M(c0750a);
    }

    @Override // r1.AbstractC0778s
    public final C0779t l() {
        return this.f4754l == 0 ? new C0755F(-2, -1) : new C0755F(-1, -2);
    }

    @Override // r1.AbstractC0778s
    public final C0779t m(Context context, AttributeSet attributeSet) {
        return new C0755F(context, attributeSet);
    }

    @Override // r1.AbstractC0778s
    public final C0779t n(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new C0755F((ViewGroup.MarginLayoutParams) layoutParams) : new C0755F(layoutParams);
    }

    @Override // r1.AbstractC0778s
    public final int q(c cVar, C0750A c0750a) {
        if (this.f4754l == 1) {
            return this.f4751h;
        }
        super.q(cVar, c0750a);
        return 1;
    }

    @Override // r1.AbstractC0778s
    public final int x(c cVar, C0750A c0750a) {
        if (this.f4754l == 0) {
            return this.f4751h;
        }
        super.x(cVar, c0750a);
        return 1;
    }

    @Override // r1.AbstractC0778s
    public final boolean y() {
        return this.f4758p != 0;
    }

    @Override // r1.AbstractC0778s
    public final void z(RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.f9512b;
        if (recyclerView2 != null) {
            recyclerView2.removeCallbacks(this.f4761s);
        }
        for (int i = 0; i < this.f4751h; i++) {
            E e5 = this.i[i];
            ((ArrayList) e5.f7920d).clear();
            e5.f7917a = Integer.MIN_VALUE;
            e5.f7918b = Integer.MIN_VALUE;
        }
        recyclerView.requestLayout();
    }
}

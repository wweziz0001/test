package androidx.recyclerview.widget;

import L0.e;
import Q1.C;
import android.content.Context;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import b3.AbstractC0307a;
import p1.b;
import r1.AbstractC0778s;
import r1.C0750A;
import r1.C0769j;
import r1.C0770k;
import r1.C0779t;

/* JADX INFO: loaded from: classes.dex */
public class LinearLayoutManager extends AbstractC0778s {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f4686h;
    public b i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e f4687j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final boolean f4688k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final boolean f4689l = false;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f4690m = false;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final boolean f4691n = true;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public C0770k f4692o = null;

    public LinearLayoutManager(Context context, AttributeSet attributeSet, int i, int i5) {
        this.f4686h = 1;
        this.f4688k = false;
        C0769j c0769j = new C0769j(0);
        c0769j.f9497b = -1;
        c0769j.f9498c = Integer.MIN_VALUE;
        c0769j.f9499d = false;
        c0769j.f9500e = false;
        C0769j c0769jW = AbstractC0778s.w(context, attributeSet, i, i5);
        int i6 = c0769jW.f9497b;
        if (i6 != 0 && i6 != 1) {
            throw new IllegalArgumentException(AbstractC0307a.i("invalid orientation:", i6));
        }
        a(null);
        if (i6 != this.f4686h || this.f4687j == null) {
            this.f4687j = e.b(this, i6);
            this.f4686h = i6;
            H();
        }
        boolean z4 = c0769jW.f9499d;
        a(null);
        if (z4 != this.f4688k) {
            this.f4688k = z4;
            H();
        }
        Q(c0769jW.f9500e);
    }

    @Override // r1.AbstractC0778s
    public final void A(AccessibilityEvent accessibilityEvent) {
        super.A(accessibilityEvent);
        if (p() > 0) {
            View viewP = P(0, p(), false);
            if (viewP != null) {
                ((C0779t) viewP.getLayoutParams()).getClass();
                throw null;
            }
            accessibilityEvent.setFromIndex(-1);
            View viewP2 = P(p() - 1, -1, false);
            if (viewP2 == null) {
                accessibilityEvent.setToIndex(-1);
            } else {
                ((C0779t) viewP2.getLayoutParams()).getClass();
                throw null;
            }
        }
    }

    @Override // r1.AbstractC0778s
    public final void B(Parcelable parcelable) {
        if (parcelable instanceof C0770k) {
            this.f4692o = (C0770k) parcelable;
            H();
        }
    }

    @Override // r1.AbstractC0778s
    public final Parcelable C() {
        C0770k c0770k = this.f4692o;
        if (c0770k != null) {
            C0770k c0770k2 = new C0770k();
            c0770k2.f9501l = c0770k.f9501l;
            c0770k2.f9502m = c0770k.f9502m;
            c0770k2.f9503n = c0770k.f9503n;
            return c0770k2;
        }
        C0770k c0770k3 = new C0770k();
        if (p() <= 0) {
            c0770k3.f9501l = -1;
            return c0770k3;
        }
        M();
        boolean z4 = this.f4689l;
        c0770k3.f9503n = z4;
        if (!z4) {
            AbstractC0778s.v(o(z4 ? p() - 1 : 0));
            throw null;
        }
        View viewO = o(z4 ? 0 : p() - 1);
        c0770k3.f9502m = this.f4687j.e() - this.f4687j.c(viewO);
        AbstractC0778s.v(viewO);
        throw null;
    }

    public final int J(C0750A c0750a) {
        if (p() == 0) {
            return 0;
        }
        M();
        e eVar = this.f4687j;
        boolean z4 = !this.f4691n;
        return C.i(c0750a, eVar, O(z4), N(z4), this, this.f4691n);
    }

    public final void K(C0750A c0750a) {
        if (p() == 0) {
            return;
        }
        M();
        boolean z4 = !this.f4691n;
        View viewO = O(z4);
        View viewN = N(z4);
        if (p() == 0 || c0750a.a() == 0 || viewO == null || viewN == null) {
            return;
        }
        ((C0779t) viewO.getLayoutParams()).getClass();
        throw null;
    }

    public final int L(C0750A c0750a) {
        if (p() == 0) {
            return 0;
        }
        M();
        e eVar = this.f4687j;
        boolean z4 = !this.f4691n;
        return C.j(c0750a, eVar, O(z4), N(z4), this, this.f4691n);
    }

    public final void M() {
        if (this.i == null) {
            this.i = new b(5);
        }
    }

    public final View N(boolean z4) {
        return this.f4689l ? P(0, p(), z4) : P(p() - 1, -1, z4);
    }

    public final View O(boolean z4) {
        return this.f4689l ? P(p() - 1, -1, z4) : P(0, p(), z4);
    }

    public final View P(int i, int i5, boolean z4) {
        M();
        int i6 = z4 ? 24579 : 320;
        return this.f4686h == 0 ? this.f9513c.f(i, i5, i6, 320) : this.f9514d.f(i, i5, i6, 320);
    }

    public void Q(boolean z4) {
        a(null);
        if (this.f4690m == z4) {
            return;
        }
        this.f4690m = z4;
        H();
    }

    @Override // r1.AbstractC0778s
    public final void a(String str) {
        RecyclerView recyclerView;
        if (this.f4692o != null || (recyclerView = this.f9512b) == null) {
            return;
        }
        recyclerView.b(str);
    }

    @Override // r1.AbstractC0778s
    public final boolean b() {
        return this.f4686h == 0;
    }

    @Override // r1.AbstractC0778s
    public final boolean c() {
        return this.f4686h == 1;
    }

    @Override // r1.AbstractC0778s
    public final int f(C0750A c0750a) {
        return J(c0750a);
    }

    @Override // r1.AbstractC0778s
    public final void g(C0750A c0750a) {
        K(c0750a);
    }

    @Override // r1.AbstractC0778s
    public final int h(C0750A c0750a) {
        return L(c0750a);
    }

    @Override // r1.AbstractC0778s
    public final int i(C0750A c0750a) {
        return J(c0750a);
    }

    @Override // r1.AbstractC0778s
    public final void j(C0750A c0750a) {
        K(c0750a);
    }

    @Override // r1.AbstractC0778s
    public final int k(C0750A c0750a) {
        return L(c0750a);
    }

    @Override // r1.AbstractC0778s
    public C0779t l() {
        return new C0779t(-2, -2);
    }

    @Override // r1.AbstractC0778s
    public final boolean y() {
        return true;
    }

    @Override // r1.AbstractC0778s
    public final void z(RecyclerView recyclerView) {
    }
}

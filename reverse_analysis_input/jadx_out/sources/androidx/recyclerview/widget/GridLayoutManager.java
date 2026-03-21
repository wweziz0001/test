package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.ViewGroup;
import b3.AbstractC0307a;
import io.flutter.plugin.platform.c;
import m.B0;
import m3.C0675i;
import r1.AbstractC0778s;
import r1.C0750A;
import r1.C0768i;
import r1.C0779t;

/* JADX INFO: loaded from: classes.dex */
public class GridLayoutManager extends LinearLayoutManager {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final int f4684p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final C0675i f4685q;

    public GridLayoutManager(Context context, AttributeSet attributeSet, int i, int i5) {
        super(context, attributeSet, i, i5);
        this.f4684p = -1;
        new SparseIntArray();
        new SparseIntArray();
        C0675i c0675i = new C0675i(18);
        this.f4685q = c0675i;
        new Rect();
        int i6 = AbstractC0778s.w(context, attributeSet, i, i5).f9498c;
        if (i6 == this.f4684p) {
            return;
        }
        if (i6 < 1) {
            throw new IllegalArgumentException(AbstractC0307a.i("Span count should be at least 1. Provided ", i6));
        }
        this.f4684p = i6;
        ((SparseIntArray) c0675i.f8712m).clear();
        H();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void Q(boolean z4) {
        if (z4) {
            throw new UnsupportedOperationException("GridLayoutManager does not support stack from end. Consider using reverse layout");
        }
        super.Q(false);
    }

    public final int R(c cVar, C0750A c0750a, int i) {
        boolean z4 = c0750a.f9421c;
        C0675i c0675i = this.f4685q;
        if (!z4) {
            int i5 = this.f4684p;
            c0675i.getClass();
            return C0675i.k(i, i5);
        }
        RecyclerView recyclerView = (RecyclerView) cVar.f6750f;
        if (i < 0 || i >= recyclerView.f4727i0.a()) {
            StringBuilder sbJ = B0.j(i, "invalid position ", ". State item count is ");
            sbJ.append(recyclerView.f4727i0.a());
            sbJ.append(recyclerView.h());
            throw new IndexOutOfBoundsException(sbJ.toString());
        }
        int iR = !recyclerView.f4727i0.f9421c ? i : recyclerView.f4734n.r(i, 0);
        if (iR != -1) {
            int i6 = this.f4684p;
            c0675i.getClass();
            return C0675i.k(iR, i6);
        }
        Log.w("GridLayoutManager", "Cannot find span size for pre layout position. " + i);
        return 0;
    }

    @Override // r1.AbstractC0778s
    public final boolean d(C0779t c0779t) {
        return c0779t instanceof C0768i;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, r1.AbstractC0778s
    public final C0779t l() {
        return this.f4686h == 0 ? new C0768i(-2, -1) : new C0768i(-1, -2);
    }

    @Override // r1.AbstractC0778s
    public final C0779t m(Context context, AttributeSet attributeSet) {
        return new C0768i(context, attributeSet);
    }

    @Override // r1.AbstractC0778s
    public final C0779t n(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new C0768i((ViewGroup.MarginLayoutParams) layoutParams) : new C0768i(layoutParams);
    }

    @Override // r1.AbstractC0778s
    public final int q(c cVar, C0750A c0750a) {
        if (this.f4686h == 1) {
            return this.f4684p;
        }
        if (c0750a.a() < 1) {
            return 0;
        }
        return R(cVar, c0750a, c0750a.a() - 1) + 1;
    }

    @Override // r1.AbstractC0778s
    public final int x(c cVar, C0750A c0750a) {
        if (this.f4686h == 0) {
            return this.f4684p;
        }
        if (c0750a.a() < 1) {
            return 0;
        }
        return R(cVar, c0750a, c0750a.a() - 1) + 1;
    }
}

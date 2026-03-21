package r1;

import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: renamed from: r1.l, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0771l extends L0.e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f9504b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0771l(AbstractC0778s abstractC0778s, int i) {
        super(abstractC0778s);
        this.f9504b = i;
    }

    @Override // L0.e
    public final int c(View view) {
        switch (this.f9504b) {
            case 0:
                C0779t c0779t = (C0779t) view.getLayoutParams();
                ((AbstractC0778s) this.f1479a).getClass();
                return view.getRight() + ((C0779t) view.getLayoutParams()).f9518a.right + ((ViewGroup.MarginLayoutParams) c0779t).rightMargin;
            default:
                C0779t c0779t2 = (C0779t) view.getLayoutParams();
                ((AbstractC0778s) this.f1479a).getClass();
                return view.getBottom() + ((C0779t) view.getLayoutParams()).f9518a.bottom + ((ViewGroup.MarginLayoutParams) c0779t2).bottomMargin;
        }
    }

    @Override // L0.e
    public final int d(View view) {
        switch (this.f9504b) {
            case 0:
                C0779t c0779t = (C0779t) view.getLayoutParams();
                ((AbstractC0778s) this.f1479a).getClass();
                return (view.getLeft() - ((C0779t) view.getLayoutParams()).f9518a.left) - ((ViewGroup.MarginLayoutParams) c0779t).leftMargin;
            default:
                C0779t c0779t2 = (C0779t) view.getLayoutParams();
                ((AbstractC0778s) this.f1479a).getClass();
                return (view.getTop() - ((C0779t) view.getLayoutParams()).f9518a.top) - ((ViewGroup.MarginLayoutParams) c0779t2).topMargin;
        }
    }

    @Override // L0.e
    public final int e() {
        switch (this.f9504b) {
            case 0:
                AbstractC0778s abstractC0778s = (AbstractC0778s) this.f1479a;
                return abstractC0778s.f9516f - abstractC0778s.t();
            default:
                AbstractC0778s abstractC0778s2 = (AbstractC0778s) this.f1479a;
                return abstractC0778s2.f9517g - abstractC0778s2.r();
        }
    }

    @Override // L0.e
    public final int h() {
        switch (this.f9504b) {
            case 0:
                return ((AbstractC0778s) this.f1479a).s();
            default:
                return ((AbstractC0778s) this.f1479a).u();
        }
    }

    @Override // L0.e
    public final int i() {
        switch (this.f9504b) {
            case 0:
                AbstractC0778s abstractC0778s = (AbstractC0778s) this.f1479a;
                return (abstractC0778s.f9516f - abstractC0778s.s()) - abstractC0778s.t();
            default:
                AbstractC0778s abstractC0778s2 = (AbstractC0778s) this.f1479a;
                return (abstractC0778s2.f9517g - abstractC0778s2.u()) - abstractC0778s2.r();
        }
    }
}

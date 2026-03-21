package m;

import android.content.Context;
import android.view.View;
import com.example.hqp_mobile_app.R;
import l.AbstractC0552j;
import l.C0555m;
import l.MenuC0550h;
import l.SubMenuC0561s;

/* JADX INFO: renamed from: m.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0588f extends C0555m {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f8406l = 1;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ C0594i f8407m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0588f(C0594i c0594i, Context context, MenuC0550h menuC0550h, View view) {
        super(R.attr.actionOverflowMenuStyle, context, view, menuC0550h, true);
        this.f8407m = c0594i;
        this.f7787f = 8388613;
        androidx.lifecycle.E e5 = c0594i.f8416G;
        this.f7789h = e5;
        AbstractC0552j abstractC0552j = this.i;
        if (abstractC0552j != null) {
            abstractC0552j.i(e5);
        }
    }

    @Override // l.C0555m
    public final void c() {
        switch (this.f8406l) {
            case 0:
                C0594i c0594i = this.f8407m;
                c0594i.f8413D = null;
                c0594i.getClass();
                super.c();
                break;
            default:
                C0594i c0594i2 = this.f8407m;
                MenuC0550h menuC0550h = c0594i2.f8419n;
                if (menuC0550h != null) {
                    menuC0550h.c(true);
                }
                c0594i2.f8412C = null;
                super.c();
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0588f(C0594i c0594i, Context context, SubMenuC0561s subMenuC0561s, View view) {
        super(R.attr.actionOverflowMenuStyle, context, view, subMenuC0561s, false);
        this.f8407m = c0594i;
        if (!subMenuC0561s.f7811w.d()) {
            View view2 = c0594i.f8424s;
            this.f7786e = view2 == null ? c0594i.f8423r : view2;
        }
        androidx.lifecycle.E e5 = c0594i.f8416G;
        this.f7789h = e5;
        AbstractC0552j abstractC0552j = this.i;
        if (abstractC0552j != null) {
            abstractC0552j.i(e5);
        }
    }
}

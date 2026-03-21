package androidx.appcompat.view.menu;

import Z1.s;
import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import l.InterfaceC0549g;
import l.MenuItemC0551i;

/* JADX INFO: loaded from: classes.dex */
public final class ExpandedMenuView extends ListView implements InterfaceC0549g, AdapterView.OnItemClickListener {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int[] f3792l = {R.attr.background, R.attr.divider};

    public ExpandedMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setOnItemClickListener(this);
        s sVarM = s.M(context, attributeSet, f3792l, R.attr.listViewStyle);
        TypedArray typedArray = (TypedArray) sVarM.f3086n;
        if (typedArray.hasValue(0)) {
            setBackgroundDrawable(sVarM.D(0));
        }
        if (typedArray.hasValue(1)) {
            setDivider(sVarM.D(1));
        }
        sVarM.O();
    }

    @Override // l.InterfaceC0549g
    public final boolean a(MenuItemC0551i menuItemC0551i) {
        throw null;
    }

    public int getWindowAnimations() {
        return 0;
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setChildrenDrawingCacheEnabled(false);
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j5) {
        throw null;
    }
}

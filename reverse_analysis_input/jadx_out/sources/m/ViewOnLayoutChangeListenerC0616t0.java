package m;

import android.content.res.Resources;
import android.graphics.Rect;
import android.view.View;
import androidx.appcompat.widget.SearchView;
import com.example.hqp_mobile_app.R;

/* JADX INFO: renamed from: m.t0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnLayoutChangeListenerC0616t0 implements View.OnLayoutChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ SearchView f8477a;

    public ViewOnLayoutChangeListenerC0616t0(SearchView searchView) {
        this.f8477a = searchView;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i5, int i6, int i7, int i8, int i9, int i10, int i11) {
        SearchView searchView = this.f8477a;
        View view2 = searchView.f3884I;
        if (view2.getWidth() > 1) {
            Resources resources = searchView.getContext().getResources();
            int paddingLeft = searchView.f3878C.getPaddingLeft();
            Rect rect = new Rect();
            boolean zA = Z0.a(searchView);
            int dimensionPixelSize = searchView.f3898a0 ? resources.getDimensionPixelSize(R.dimen.abc_dropdownitem_text_padding_left) + resources.getDimensionPixelSize(R.dimen.abc_dropdownitem_icon_width) : 0;
            SearchView.SearchAutoComplete searchAutoComplete = searchView.f3876A;
            searchAutoComplete.getDropDownBackground().getPadding(rect);
            searchAutoComplete.setDropDownHorizontalOffset(zA ? -rect.left : paddingLeft - (rect.left + dimensionPixelSize));
            searchAutoComplete.setDropDownWidth((((view2.getWidth() + rect.left) + rect.right) + dimensionPixelSize) - paddingLeft);
        }
    }
}

package androidx.browser.browseractions;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.example.hqp_mobile_app.R;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public class BrowserActionsFallbackMenuView extends LinearLayout {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f4009l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final int f4010m;

    public BrowserActionsFallbackMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f4009l = getResources().getDimensionPixelOffset(R.dimen.browser_actions_context_menu_min_padding);
        this.f4010m = getResources().getDimensionPixelOffset(R.dimen.browser_actions_context_menu_max_width);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i5) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(Math.min(getResources().getDisplayMetrics().widthPixels - (this.f4009l * 2), this.f4010m), 1073741824), i5);
    }
}

package androidx.preference;

import android.content.Context;
import android.util.AttributeSet;
import com.example.hqp_mobile_app.R;
import v.AbstractC0905b;

/* JADX INFO: loaded from: classes.dex */
public class PreferenceCategory extends PreferenceGroup {
    public PreferenceCategory(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, AbstractC0905b.a(context, R.attr.preferenceCategoryStyle, android.R.attr.preferenceCategoryStyle));
    }
}

package androidx.preference;

import a0.C0200z;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import com.example.hqp_mobile_app.R;
import o1.AbstractC0717a;
import v.AbstractC0905b;

/* JADX INFO: loaded from: classes.dex */
public class EditTextPreference extends DialogPreference {
    /* JADX WARN: Illegal instructions before constructor call */
    public EditTextPreference(Context context, AttributeSet attributeSet) {
        int iA = AbstractC0905b.a(context, R.attr.editTextPreferenceStyle, android.R.attr.editTextPreferenceStyle);
        super(context, attributeSet, iA);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0717a.f9107c, iA, 0);
        if (typedArrayObtainStyledAttributes.getBoolean(0, typedArrayObtainStyledAttributes.getBoolean(0, false))) {
            if (C0200z.f3467m == null) {
                C0200z.f3467m = new C0200z(27);
            }
            this.f4679r = C0200z.f3467m;
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // androidx.preference.Preference
    public final Object c(TypedArray typedArray, int i) {
        return typedArray.getString(i);
    }
}

package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import com.example.hqp_mobile_app.R;
import o1.AbstractC0717a;

/* JADX INFO: loaded from: classes.dex */
public class SeekBarPreference extends Preference {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final int f4680s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final int f4681t;

    public SeekBarPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.seekBarPreferenceStyle);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0717a.i, R.attr.seekBarPreferenceStyle, 0);
        int i = typedArrayObtainStyledAttributes.getInt(3, 0);
        int i5 = typedArrayObtainStyledAttributes.getInt(1, 100);
        i5 = i5 < i ? i : i5;
        if (i5 != this.f4680s) {
            this.f4680s = i5;
        }
        int i6 = typedArrayObtainStyledAttributes.getInt(4, 0);
        if (i6 != this.f4681t) {
            this.f4681t = Math.min(this.f4680s - i, Math.abs(i6));
        }
        typedArrayObtainStyledAttributes.getBoolean(2, true);
        typedArrayObtainStyledAttributes.getBoolean(5, false);
        typedArrayObtainStyledAttributes.getBoolean(6, false);
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // androidx.preference.Preference
    public final Object c(TypedArray typedArray, int i) {
        return Integer.valueOf(typedArray.getInt(i, 0));
    }
}

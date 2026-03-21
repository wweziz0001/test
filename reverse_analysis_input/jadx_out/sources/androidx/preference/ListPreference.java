package androidx.preference;

import a0.C0200z;
import android.content.Context;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import com.example.hqp_mobile_app.R;
import o1.AbstractC0717a;
import v.AbstractC0905b;

/* JADX INFO: loaded from: classes.dex */
public class ListPreference extends DialogPreference {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final CharSequence[] f4671s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final String f4672t;

    public ListPreference(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0717a.f9108d, i, 0);
        CharSequence[] textArray = typedArrayObtainStyledAttributes.getTextArray(2);
        this.f4671s = textArray == null ? typedArrayObtainStyledAttributes.getTextArray(0) : textArray;
        if (typedArrayObtainStyledAttributes.getTextArray(3) == null) {
            typedArrayObtainStyledAttributes.getTextArray(1);
        }
        if (typedArrayObtainStyledAttributes.getBoolean(4, typedArrayObtainStyledAttributes.getBoolean(4, false))) {
            if (C0200z.f3468n == null) {
                C0200z.f3468n = new C0200z(28);
            }
            this.f4679r = C0200z.f3468n;
            b();
        }
        typedArrayObtainStyledAttributes.recycle();
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, AbstractC0717a.f9110f, i, 0);
        this.f4672t = AbstractC0905b.b(typedArrayObtainStyledAttributes2, 33, 7);
        typedArrayObtainStyledAttributes2.recycle();
    }

    @Override // androidx.preference.Preference
    public final CharSequence a() {
        C0200z c0200z = this.f4679r;
        if (c0200z != null) {
            return c0200z.v(this);
        }
        CharSequence charSequenceA = super.a();
        String str = this.f4672t;
        if (str == null) {
            return charSequenceA;
        }
        String str2 = String.format(str, "");
        if (TextUtils.equals(str2, charSequenceA)) {
            return charSequenceA;
        }
        Log.w("ListPreference", "Setting a summary with a String formatting marker is no longer supported. You should use a SummaryProvider instead.");
        return str2;
    }

    @Override // androidx.preference.Preference
    public final Object c(TypedArray typedArray, int i) {
        return typedArray.getString(i);
    }

    public ListPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, AbstractC0905b.a(context, R.attr.dialogPreferenceStyle, android.R.attr.dialogPreferenceStyle));
    }
}

package B;

import android.text.PrecomputedText;
import android.text.TextPaint;
import android.view.DisplayCutout;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class b {
    public static /* synthetic */ PrecomputedText.Params.Builder g(TextPaint textPaint) {
        return new PrecomputedText.Params.Builder(textPaint);
    }

    public static /* bridge */ /* synthetic */ DisplayCutout k(Object obj) {
        return (DisplayCutout) obj;
    }

    public static /* bridge */ /* synthetic */ boolean s(CharSequence charSequence) {
        return charSequence instanceof PrecomputedText;
    }

    public static /* bridge */ /* synthetic */ boolean t(Object obj) {
        return obj instanceof DisplayCutout;
    }
}

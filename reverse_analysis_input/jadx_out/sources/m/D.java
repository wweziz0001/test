package m;

import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.util.Log;
import android.widget.TextView;

/* JADX INFO: loaded from: classes.dex */
public abstract class D {
    public static StaticLayout a(CharSequence charSequence, Layout.Alignment alignment, int i, int i5, TextView textView, TextPaint textPaint, G g5) {
        StaticLayout.Builder builderObtain = StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), textPaint, i);
        StaticLayout.Builder hyphenationFrequency = builderObtain.setAlignment(alignment).setLineSpacing(textView.getLineSpacingExtra(), textView.getLineSpacingMultiplier()).setIncludePad(textView.getIncludeFontPadding()).setBreakStrategy(textView.getBreakStrategy()).setHyphenationFrequency(textView.getHyphenationFrequency());
        if (i5 == -1) {
            i5 = Integer.MAX_VALUE;
        }
        hyphenationFrequency.setMaxLines(i5);
        try {
            g5.a(builderObtain, textView);
        } catch (ClassCastException unused) {
            Log.w("ACTVAutoSizeHelper", "Failed to obtain TextDirectionHeuristic, auto size may be incorrect");
        }
        return builderObtain.build();
    }
}

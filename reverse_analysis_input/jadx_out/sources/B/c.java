package B;

import android.os.Build;
import android.text.PrecomputedText;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextPaint f177a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextDirectionHeuristic f178b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f179c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f180d;

    public c(TextPaint textPaint, TextDirectionHeuristic textDirectionHeuristic, int i, int i5) {
        if (Build.VERSION.SDK_INT >= 29) {
            b.g(textPaint).setBreakStrategy(i).setHyphenationFrequency(i5).setTextDirection(textDirectionHeuristic).build();
        }
        this.f177a = textPaint;
        this.f178b = textDirectionHeuristic;
        this.f179c = i;
        this.f180d = i5;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        if (this.f179c == cVar.f179c && this.f180d == cVar.f180d) {
            TextPaint textPaint = this.f177a;
            float textSize = textPaint.getTextSize();
            TextPaint textPaint2 = cVar.f177a;
            return textSize == textPaint2.getTextSize() && textPaint.getTextScaleX() == textPaint2.getTextScaleX() && textPaint.getTextSkewX() == textPaint2.getTextSkewX() && textPaint.getLetterSpacing() == textPaint2.getLetterSpacing() && TextUtils.equals(textPaint.getFontFeatureSettings(), textPaint2.getFontFeatureSettings()) && textPaint.getFlags() == textPaint2.getFlags() && textPaint.getTextLocales().equals(textPaint2.getTextLocales()) && (textPaint.getTypeface() != null ? textPaint.getTypeface().equals(textPaint2.getTypeface()) : textPaint2.getTypeface() == null) && this.f178b == cVar.f178b;
        }
        return false;
    }

    public final int hashCode() {
        TextPaint textPaint = this.f177a;
        return Objects.hash(Float.valueOf(textPaint.getTextSize()), Float.valueOf(textPaint.getTextScaleX()), Float.valueOf(textPaint.getTextSkewX()), Float.valueOf(textPaint.getLetterSpacing()), Integer.valueOf(textPaint.getFlags()), textPaint.getTextLocales(), textPaint.getTypeface(), Boolean.valueOf(textPaint.isElegantTextHeight()), this.f178b, Integer.valueOf(this.f179c), Integer.valueOf(this.f180d));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("{");
        StringBuilder sb2 = new StringBuilder("textSize=");
        TextPaint textPaint = this.f177a;
        sb2.append(textPaint.getTextSize());
        sb.append(sb2.toString());
        sb.append(", textScaleX=" + textPaint.getTextScaleX());
        sb.append(", textSkewX=" + textPaint.getTextSkewX());
        int i = Build.VERSION.SDK_INT;
        sb.append(", letterSpacing=" + textPaint.getLetterSpacing());
        sb.append(", elegantTextHeight=" + textPaint.isElegantTextHeight());
        sb.append(", textLocale=" + textPaint.getTextLocales());
        sb.append(", typeface=" + textPaint.getTypeface());
        if (i >= 26) {
            sb.append(", variationSettings=" + textPaint.getFontVariationSettings());
        }
        sb.append(", textDir=" + this.f178b);
        sb.append(", breakStrategy=" + this.f179c);
        sb.append(", hyphenationFrequency=" + this.f180d);
        sb.append("}");
        return sb.toString();
    }

    public c(PrecomputedText.Params params) {
        this.f177a = params.getTextPaint();
        this.f178b = params.getTextDirection();
        this.f179c = params.getBreakStrategy();
        this.f180d = params.getHyphenationFrequency();
    }
}

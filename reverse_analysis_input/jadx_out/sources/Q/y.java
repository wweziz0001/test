package Q;

import android.os.Build;
import android.text.Spannable;
import android.text.SpannableString;
import java.util.stream.IntStream;

/* JADX INFO: loaded from: classes.dex */
public final class y implements Spannable {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f1762l = false;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public Spannable f1763m;

    public y(Spannable spannable) {
        this.f1763m = spannable;
    }

    public final void a() {
        Spannable spannable = this.f1763m;
        if (!this.f1762l) {
            if ((Build.VERSION.SDK_INT < 28 ? new A0.b(22) : new x(22)).s(spannable)) {
                this.f1763m = new SpannableString(spannable);
            }
        }
        this.f1762l = true;
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i) {
        return this.f1763m.charAt(i);
    }

    @Override // java.lang.CharSequence
    public final IntStream chars() {
        return this.f1763m.chars();
    }

    @Override // java.lang.CharSequence
    public final IntStream codePoints() {
        return this.f1763m.codePoints();
    }

    @Override // android.text.Spanned
    public final int getSpanEnd(Object obj) {
        return this.f1763m.getSpanEnd(obj);
    }

    @Override // android.text.Spanned
    public final int getSpanFlags(Object obj) {
        return this.f1763m.getSpanFlags(obj);
    }

    @Override // android.text.Spanned
    public final int getSpanStart(Object obj) {
        return this.f1763m.getSpanStart(obj);
    }

    @Override // android.text.Spanned
    public final Object[] getSpans(int i, int i5, Class cls) {
        return this.f1763m.getSpans(i, i5, cls);
    }

    @Override // java.lang.CharSequence
    public final int length() {
        return this.f1763m.length();
    }

    @Override // android.text.Spanned
    public final int nextSpanTransition(int i, int i5, Class cls) {
        return this.f1763m.nextSpanTransition(i, i5, cls);
    }

    @Override // android.text.Spannable
    public final void removeSpan(Object obj) {
        a();
        this.f1763m.removeSpan(obj);
    }

    @Override // android.text.Spannable
    public final void setSpan(Object obj, int i, int i5, int i6) {
        a();
        this.f1763m.setSpan(obj, i, i5, i6);
    }

    @Override // java.lang.CharSequence
    public final CharSequence subSequence(int i, int i5) {
        return this.f1763m.subSequence(i, i5);
    }

    @Override // java.lang.CharSequence
    public final String toString() {
        return this.f1763m.toString();
    }

    public y(CharSequence charSequence) {
        this.f1763m = new SpannableString(charSequence);
    }
}

package S;

import android.text.InputFilter;
import android.text.Spanned;
import android.widget.TextView;

/* JADX INFO: loaded from: classes.dex */
public final class d implements InputFilter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextView f1970a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public c f1971b;

    public d(TextView textView) {
        this.f1970a = textView;
    }

    @Override // android.text.InputFilter
    public final CharSequence filter(CharSequence charSequence, int i, int i5, Spanned spanned, int i6, int i7) {
        TextView textView = this.f1970a;
        if (textView.isInEditMode()) {
            return charSequence;
        }
        int iB = Q.j.a().b();
        if (iB != 0) {
            if (iB == 1) {
                if ((i7 == 0 && i6 == 0 && spanned.length() == 0 && charSequence == textView.getText()) || charSequence == null) {
                    return charSequence;
                }
                if (i != 0 || i5 != charSequence.length()) {
                    charSequence = charSequence.subSequence(i, i5);
                }
                return Q.j.a().e(charSequence, 0, charSequence.length());
            }
            if (iB != 3) {
                return charSequence;
            }
        }
        Q.j jVarA = Q.j.a();
        if (this.f1971b == null) {
            this.f1971b = new c(textView, this);
        }
        jVarA.f(this.f1971b);
        return charSequence;
    }
}

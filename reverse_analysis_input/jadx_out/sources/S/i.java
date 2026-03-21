package S;

import android.text.Editable;
import android.text.Selection;
import android.text.Spannable;
import android.text.TextWatcher;
import android.widget.EditText;
import m.AbstractC0602m;

/* JADX INFO: loaded from: classes.dex */
public final class i implements TextWatcher {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final AbstractC0602m f1980l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public h f1981m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f1982n = true;

    public i(AbstractC0602m abstractC0602m) {
        this.f1980l = abstractC0602m;
    }

    public static void a(EditText editText, int i) {
        int length;
        if (i == 1 && editText != null && editText.isAttachedToWindow()) {
            Editable editableText = editText.getEditableText();
            int selectionStart = Selection.getSelectionStart(editableText);
            int selectionEnd = Selection.getSelectionEnd(editableText);
            Q.j jVarA = Q.j.a();
            if (editableText == null) {
                length = 0;
            } else {
                jVarA.getClass();
                length = editableText.length();
            }
            jVarA.e(editableText, 0, length);
            if (selectionStart >= 0 && selectionEnd >= 0) {
                Selection.setSelection(editableText, selectionStart, selectionEnd);
            } else if (selectionStart >= 0) {
                Selection.setSelection(editableText, selectionStart);
            } else if (selectionEnd >= 0) {
                Selection.setSelection(editableText, selectionEnd);
            }
        }
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i5, int i6) {
        AbstractC0602m abstractC0602m = this.f1980l;
        if (abstractC0602m.isInEditMode() || !this.f1982n || Q.j.f1713j == null || i5 > i6 || !(charSequence instanceof Spannable)) {
            return;
        }
        int iB = Q.j.a().b();
        if (iB != 0) {
            if (iB == 1) {
                Q.j.a().e((Spannable) charSequence, i, i6 + i);
                return;
            } else if (iB != 3) {
                return;
            }
        }
        Q.j jVarA = Q.j.a();
        if (this.f1981m == null) {
            this.f1981m = new h(abstractC0602m);
        }
        jVarA.f(this.f1981m);
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i5, int i6) {
    }
}

package m;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import androidx.appcompat.widget.SearchView;

/* JADX INFO: renamed from: m.q0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0611q0 implements TextWatcher {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ SearchView f8473l;

    public C0611q0(SearchView searchView) {
        this.f8473l = searchView;
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i5, int i6) {
        SearchView searchView = this.f8473l;
        Editable text = searchView.f3876A.getText();
        searchView.f3907j0 = text;
        boolean zIsEmpty = TextUtils.isEmpty(text);
        searchView.t(!zIsEmpty);
        int i7 = 8;
        if (searchView.f3906i0 && !searchView.f3899b0 && zIsEmpty) {
            searchView.f3881F.setVisibility(8);
            i7 = 0;
        }
        searchView.f3883H.setVisibility(i7);
        searchView.p();
        searchView.s();
        charSequence.toString();
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i5, int i6) {
    }
}

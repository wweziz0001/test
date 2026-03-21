package androidx.appcompat.widget;

import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import androidx.appcompat.widget.SearchView;

/* JADX INFO: loaded from: classes.dex */
public final class b implements View.OnKeyListener {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ SearchView f4007l;

    public b(SearchView searchView) {
        this.f4007l = searchView;
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(View view, int i, KeyEvent keyEvent) {
        SearchView searchView = this.f4007l;
        if (searchView.f3910m0 == null) {
            return false;
        }
        SearchView.SearchAutoComplete searchAutoComplete = searchView.f3876A;
        if (!searchAutoComplete.isPopupShowing() || searchAutoComplete.getListSelection() == -1) {
            if (TextUtils.getTrimmedLength(searchAutoComplete.getText()) == 0 || !keyEvent.hasNoModifiers() || keyEvent.getAction() != 1 || i != 66) {
                return false;
            }
            view.cancelLongPress();
            searchView.getContext().startActivity(searchView.h("android.intent.action.SEARCH", null, null, searchAutoComplete.getText().toString()));
            return true;
        }
        if (searchView.f3910m0 == null || searchView.f3900c0 == null || keyEvent.getAction() != 0 || !keyEvent.hasNoModifiers()) {
            return false;
        }
        if (i == 66 || i == 84 || i == 61) {
            searchView.l(searchAutoComplete.getListSelection());
        } else {
            if (i != 21 && i != 22) {
                if (i != 19) {
                    return false;
                }
                searchAutoComplete.getListSelection();
                return false;
            }
            searchAutoComplete.setSelection(i == 21 ? 0 : searchAutoComplete.length());
            searchAutoComplete.setListSelection(0);
            searchAutoComplete.clearListSelection();
            searchAutoComplete.a();
        }
        return true;
    }
}

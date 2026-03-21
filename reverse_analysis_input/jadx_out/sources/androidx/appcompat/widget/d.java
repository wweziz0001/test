package androidx.appcompat.widget;

import android.view.inputmethod.InputMethodManager;
import androidx.appcompat.widget.SearchView;

/* JADX INFO: loaded from: classes.dex */
public final class d implements Runnable {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ SearchView.SearchAutoComplete f4008l;

    public d(SearchView.SearchAutoComplete searchAutoComplete) {
        this.f4008l = searchAutoComplete;
    }

    @Override // java.lang.Runnable
    public final void run() {
        SearchView.SearchAutoComplete searchAutoComplete = this.f4008l;
        if (searchAutoComplete.f3917r) {
            ((InputMethodManager) searchAutoComplete.getContext().getSystemService("input_method")).showSoftInput(searchAutoComplete, 0);
            searchAutoComplete.f3917r = false;
        }
    }
}

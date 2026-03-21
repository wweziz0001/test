package androidx.appcompat.widget;

import android.app.SearchableInfo;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Intent;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import androidx.appcompat.widget.SearchView;

/* JADX INFO: loaded from: classes.dex */
public final class a implements View.OnClickListener {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ SearchView f4006l;

    public a(SearchView searchView) {
        this.f4006l = searchView;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        SearchView searchView = this.f4006l;
        ImageView imageView = searchView.f3880E;
        SearchView.SearchAutoComplete searchAutoComplete = searchView.f3876A;
        if (view == imageView) {
            searchView.u(false);
            searchAutoComplete.requestFocus();
            searchAutoComplete.setImeVisibility(true);
            View.OnClickListener onClickListener = searchView.f3897W;
            if (onClickListener != null) {
                onClickListener.onClick(searchView);
                return;
            }
            return;
        }
        if (view == searchView.f3882G) {
            searchView.k();
            return;
        }
        if (view == searchView.f3881F) {
            searchView.o();
            return;
        }
        if (view != searchView.f3883H) {
            if (view == searchAutoComplete) {
                searchView.j();
                return;
            }
            return;
        }
        SearchableInfo searchableInfo = searchView.f3910m0;
        if (searchableInfo == null) {
            return;
        }
        try {
            if (!searchableInfo.getVoiceSearchLaunchWebSearch()) {
                if (searchableInfo.getVoiceSearchLaunchRecognizer()) {
                    searchView.getContext().startActivity(searchView.i(searchView.f3894T, searchableInfo));
                }
            } else {
                Intent intent = new Intent(searchView.f3893S);
                ComponentName searchActivity = searchableInfo.getSearchActivity();
                intent.putExtra("calling_package", searchActivity == null ? null : searchActivity.flattenToShortString());
                searchView.getContext().startActivity(intent);
            }
        } catch (ActivityNotFoundException unused) {
            Log.w("SearchView", "Could not find voice search activity");
        }
    }
}

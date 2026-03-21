package androidx.appcompat.widget;

import D.I;
import Z1.m;
import Z1.s;
import a.AbstractC0149a;
import android.app.PendingIntent;
import android.app.SearchableInfo;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.Cursor;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ImageSpan;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.widget.AutoCompleteTextView;
import android.widget.ImageView;
import com.example.hqp_mobile_app.R;
import h.AbstractC0441a;
import java.lang.reflect.Method;
import java.util.WeakHashMap;
import k.InterfaceC0525a;
import m.A0;
import m.AbstractC0602m;
import m.C0611q0;
import m.C0618u0;
import m.C0620v0;
import m.C0628z0;
import m.D0;
import m.InterfaceC0622w0;
import m.InterfaceC0624x0;
import m.InterfaceC0626y0;
import m.RunnableC0612r0;
import m.ViewOnFocusChangeListenerC0614s0;
import m.ViewOnLayoutChangeListenerC0616t0;
import m.X;
import m.Y;

/* JADX INFO: loaded from: classes.dex */
public class SearchView extends X implements InterfaceC0525a {

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public static final m f3875r0;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final SearchAutoComplete f3876A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final View f3877B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final View f3878C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public final View f3879D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public final ImageView f3880E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public final ImageView f3881F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public final ImageView f3882G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public final ImageView f3883H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public final View f3884I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public A0 f3885J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public final Rect f3886K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public final Rect f3887L;
    public final int[] M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public final int[] f3888N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public final ImageView f3889O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public final Drawable f3890P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public final int f3891Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    public final int f3892R;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public final Intent f3893S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    public final Intent f3894T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public final CharSequence f3895U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public View.OnFocusChangeListener f3896V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public View.OnClickListener f3897W;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public boolean f3898a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public boolean f3899b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public J.c f3900c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public boolean f3901d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public CharSequence f3902e0;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public boolean f3903f0;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public boolean f3904g0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public int f3905h0;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public boolean f3906i0;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public CharSequence f3907j0;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public boolean f3908k0;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public int f3909l0;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    public SearchableInfo f3910m0;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public Bundle f3911n0;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    public final RunnableC0612r0 f3912o0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final RunnableC0612r0 f3913p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final WeakHashMap f3914q0;

    public static class SearchAutoComplete extends AbstractC0602m {

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public int f3915p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public SearchView f3916q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public boolean f3917r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public final d f3918s;

        public SearchAutoComplete(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f3918s = new d(this);
            this.f3915p = getThreshold();
        }

        private int getSearchViewTextMinWidthDp() {
            Configuration configuration = getResources().getConfiguration();
            int i = configuration.screenWidthDp;
            int i5 = configuration.screenHeightDp;
            if (i >= 960 && i5 >= 720 && configuration.orientation == 2) {
                return 256;
            }
            if (i < 600) {
                return (i < 640 || i5 < 480) ? 160 : 192;
            }
            return 192;
        }

        public final void a() {
            if (Build.VERSION.SDK_INT >= 29) {
                c.b(this, 1);
                if (enoughToFilter()) {
                    showDropDown();
                    return;
                }
                return;
            }
            m mVar = SearchView.f3875r0;
            mVar.getClass();
            m.E();
            Method method = (Method) mVar.f3026o;
            if (method != null) {
                try {
                    method.invoke(this, Boolean.TRUE);
                } catch (Exception unused) {
                }
            }
        }

        @Override // android.widget.AutoCompleteTextView
        public final boolean enoughToFilter() {
            return this.f3915p <= 0 || super.enoughToFilter();
        }

        @Override // m.AbstractC0602m, android.widget.TextView, android.view.View
        public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
            InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
            if (this.f3917r) {
                d dVar = this.f3918s;
                removeCallbacks(dVar);
                post(dVar);
            }
            return inputConnectionOnCreateInputConnection;
        }

        @Override // android.view.View
        public final void onFinishInflate() {
            super.onFinishInflate();
            setMinWidth((int) TypedValue.applyDimension(1, getSearchViewTextMinWidthDp(), getResources().getDisplayMetrics()));
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public final void onFocusChanged(boolean z4, int i, Rect rect) {
            super.onFocusChanged(z4, i, rect);
            SearchView searchView = this.f3916q;
            searchView.u(searchView.f3899b0);
            searchView.post(searchView.f3912o0);
            if (searchView.f3876A.hasFocus()) {
                searchView.j();
            }
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public final boolean onKeyPreIme(int i, KeyEvent keyEvent) {
            if (i == 4) {
                if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                    KeyEvent.DispatcherState keyDispatcherState = getKeyDispatcherState();
                    if (keyDispatcherState != null) {
                        keyDispatcherState.startTracking(keyEvent, this);
                    }
                    return true;
                }
                if (keyEvent.getAction() == 1) {
                    KeyEvent.DispatcherState keyDispatcherState2 = getKeyDispatcherState();
                    if (keyDispatcherState2 != null) {
                        keyDispatcherState2.handleUpEvent(keyEvent);
                    }
                    if (keyEvent.isTracking() && !keyEvent.isCanceled()) {
                        this.f3916q.clearFocus();
                        setImeVisibility(false);
                        return true;
                    }
                }
            }
            return super.onKeyPreIme(i, keyEvent);
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public final void onWindowFocusChanged(boolean z4) {
            super.onWindowFocusChanged(z4);
            if (z4 && this.f3916q.hasFocus() && getVisibility() == 0) {
                this.f3917r = true;
                Context context = getContext();
                m mVar = SearchView.f3875r0;
                if (context.getResources().getConfiguration().orientation == 2) {
                    a();
                }
            }
        }

        @Override // android.widget.AutoCompleteTextView
        public final void performCompletion() {
        }

        @Override // android.widget.AutoCompleteTextView
        public final void replaceText(CharSequence charSequence) {
        }

        public void setImeVisibility(boolean z4) {
            InputMethodManager inputMethodManager = (InputMethodManager) getContext().getSystemService("input_method");
            d dVar = this.f3918s;
            if (!z4) {
                this.f3917r = false;
                removeCallbacks(dVar);
                inputMethodManager.hideSoftInputFromWindow(getWindowToken(), 0);
            } else {
                if (!inputMethodManager.isActive(this)) {
                    this.f3917r = true;
                    return;
                }
                this.f3917r = false;
                removeCallbacks(dVar);
                inputMethodManager.showSoftInput(this, 0);
            }
        }

        public void setSearchView(SearchView searchView) {
            this.f3916q = searchView;
        }

        @Override // android.widget.AutoCompleteTextView
        public void setThreshold(int i) {
            super.setThreshold(i);
            this.f3915p = i;
        }
    }

    static {
        m mVar = null;
        if (Build.VERSION.SDK_INT < 29) {
            m mVar2 = new m(10);
            mVar2.f3024m = null;
            mVar2.f3025n = null;
            mVar2.f3026o = null;
            m.E();
            try {
                Method declaredMethod = AutoCompleteTextView.class.getDeclaredMethod("doBeforeTextChanged", null);
                mVar2.f3024m = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException unused) {
            }
            try {
                Method declaredMethod2 = AutoCompleteTextView.class.getDeclaredMethod("doAfterTextChanged", null);
                mVar2.f3025n = declaredMethod2;
                declaredMethod2.setAccessible(true);
            } catch (NoSuchMethodException unused2) {
            }
            try {
                Method method = AutoCompleteTextView.class.getMethod("ensureImeVisible", Boolean.TYPE);
                mVar2.f3026o = method;
                method.setAccessible(true);
            } catch (NoSuchMethodException unused3) {
            }
            mVar = mVar2;
        }
        f3875r0 = mVar;
    }

    public SearchView(Context context) {
        this(context, null);
    }

    private int getPreferredHeight() {
        return getContext().getResources().getDimensionPixelSize(R.dimen.abc_search_view_preferred_height);
    }

    private int getPreferredWidth() {
        return getContext().getResources().getDimensionPixelSize(R.dimen.abc_search_view_preferred_width);
    }

    private void setQuery(CharSequence charSequence) {
        SearchAutoComplete searchAutoComplete = this.f3876A;
        searchAutoComplete.setText(charSequence);
        searchAutoComplete.setSelection(TextUtils.isEmpty(charSequence) ? 0 : charSequence.length());
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void clearFocus() {
        this.f3904g0 = true;
        super.clearFocus();
        SearchAutoComplete searchAutoComplete = this.f3876A;
        searchAutoComplete.clearFocus();
        searchAutoComplete.setImeVisibility(false);
        this.f3904g0 = false;
    }

    public int getImeOptions() {
        return this.f3876A.getImeOptions();
    }

    public int getInputType() {
        return this.f3876A.getInputType();
    }

    public int getMaxWidth() {
        return this.f3905h0;
    }

    public CharSequence getQuery() {
        return this.f3876A.getText();
    }

    public CharSequence getQueryHint() {
        CharSequence charSequence = this.f3902e0;
        if (charSequence != null) {
            return charSequence;
        }
        SearchableInfo searchableInfo = this.f3910m0;
        return (searchableInfo == null || searchableInfo.getHintId() == 0) ? this.f3895U : getContext().getText(this.f3910m0.getHintId());
    }

    public int getSuggestionCommitIconResId() {
        return this.f3892R;
    }

    public int getSuggestionRowLayout() {
        return this.f3891Q;
    }

    public J.c getSuggestionsAdapter() {
        return this.f3900c0;
    }

    public final Intent h(String str, Uri uri, String str2, String str3) {
        Intent intent = new Intent(str);
        intent.addFlags(268435456);
        if (uri != null) {
            intent.setData(uri);
        }
        intent.putExtra("user_query", this.f3907j0);
        if (str3 != null) {
            intent.putExtra("query", str3);
        }
        if (str2 != null) {
            intent.putExtra("intent_extra_data_key", str2);
        }
        Bundle bundle = this.f3911n0;
        if (bundle != null) {
            intent.putExtra("app_data", bundle);
        }
        intent.setComponent(this.f3910m0.getSearchActivity());
        return intent;
    }

    public final Intent i(Intent intent, SearchableInfo searchableInfo) {
        ComponentName searchActivity = searchableInfo.getSearchActivity();
        Intent intent2 = new Intent("android.intent.action.SEARCH");
        intent2.setComponent(searchActivity);
        PendingIntent activity = PendingIntent.getActivity(getContext(), 0, intent2, 1107296256);
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.f3911n0;
        if (bundle2 != null) {
            bundle.putParcelable("app_data", bundle2);
        }
        Intent intent3 = new Intent(intent);
        Resources resources = getResources();
        String string = searchableInfo.getVoiceLanguageModeId() != 0 ? resources.getString(searchableInfo.getVoiceLanguageModeId()) : "free_form";
        String string2 = searchableInfo.getVoicePromptTextId() != 0 ? resources.getString(searchableInfo.getVoicePromptTextId()) : null;
        String string3 = searchableInfo.getVoiceLanguageId() != 0 ? resources.getString(searchableInfo.getVoiceLanguageId()) : null;
        int voiceMaxResults = searchableInfo.getVoiceMaxResults() != 0 ? searchableInfo.getVoiceMaxResults() : 1;
        intent3.putExtra("android.speech.extra.LANGUAGE_MODEL", string);
        intent3.putExtra("android.speech.extra.PROMPT", string2);
        intent3.putExtra("android.speech.extra.LANGUAGE", string3);
        intent3.putExtra("android.speech.extra.MAX_RESULTS", voiceMaxResults);
        intent3.putExtra("calling_package", searchActivity != null ? searchActivity.flattenToShortString() : null);
        intent3.putExtra("android.speech.extra.RESULTS_PENDINGINTENT", activity);
        intent3.putExtra("android.speech.extra.RESULTS_PENDINGINTENT_BUNDLE", bundle);
        return intent3;
    }

    public final void j() {
        int i = Build.VERSION.SDK_INT;
        SearchAutoComplete searchAutoComplete = this.f3876A;
        if (i >= 29) {
            c.a(searchAutoComplete);
            return;
        }
        m mVar = f3875r0;
        mVar.getClass();
        m.E();
        Method method = (Method) mVar.f3024m;
        if (method != null) {
            try {
                method.invoke(searchAutoComplete, null);
            } catch (Exception unused) {
            }
        }
        mVar.getClass();
        m.E();
        Method method2 = (Method) mVar.f3025n;
        if (method2 != null) {
            try {
                method2.invoke(searchAutoComplete, null);
            } catch (Exception unused2) {
            }
        }
    }

    public final void k() {
        SearchAutoComplete searchAutoComplete = this.f3876A;
        if (!TextUtils.isEmpty(searchAutoComplete.getText())) {
            searchAutoComplete.setText("");
            searchAutoComplete.requestFocus();
            searchAutoComplete.setImeVisibility(true);
        } else if (this.f3898a0) {
            clearFocus();
            u(true);
        }
    }

    public final void l(int i) {
        int position;
        String strH;
        Cursor cursor = this.f3900c0.f1087n;
        if (cursor != null && cursor.moveToPosition(i)) {
            Intent intentH = null;
            try {
                int i5 = D0.f8242I;
                String strH2 = D0.h(cursor, cursor.getColumnIndex("suggest_intent_action"));
                if (strH2 == null) {
                    strH2 = this.f3910m0.getSuggestIntentAction();
                }
                if (strH2 == null) {
                    strH2 = "android.intent.action.SEARCH";
                }
                String strH3 = D0.h(cursor, cursor.getColumnIndex("suggest_intent_data"));
                if (strH3 == null) {
                    strH3 = this.f3910m0.getSuggestIntentData();
                }
                if (strH3 != null && (strH = D0.h(cursor, cursor.getColumnIndex("suggest_intent_data_id"))) != null) {
                    strH3 = strH3 + "/" + Uri.encode(strH);
                }
                intentH = h(strH2, strH3 == null ? null : Uri.parse(strH3), D0.h(cursor, cursor.getColumnIndex("suggest_intent_extra_data")), D0.h(cursor, cursor.getColumnIndex("suggest_intent_query")));
            } catch (RuntimeException e5) {
                try {
                    position = cursor.getPosition();
                } catch (RuntimeException unused) {
                    position = -1;
                }
                Log.w("SearchView", "Search suggestions cursor at row " + position + " returned exception.", e5);
            }
            if (intentH != null) {
                try {
                    getContext().startActivity(intentH);
                } catch (RuntimeException e6) {
                    Log.e("SearchView", "Failed launch activity: " + intentH, e6);
                }
            }
        }
        SearchAutoComplete searchAutoComplete = this.f3876A;
        searchAutoComplete.setImeVisibility(false);
        searchAutoComplete.dismissDropDown();
    }

    public final void m(int i) {
        Editable text = this.f3876A.getText();
        Cursor cursor = this.f3900c0.f1087n;
        if (cursor == null) {
            return;
        }
        if (!cursor.moveToPosition(i)) {
            setQuery(text);
            return;
        }
        String strC = this.f3900c0.c(cursor);
        if (strC != null) {
            setQuery(strC);
        } else {
            setQuery(text);
        }
    }

    public final void n(CharSequence charSequence) {
        setQuery(charSequence);
    }

    public final void o() {
        SearchAutoComplete searchAutoComplete = this.f3876A;
        Editable text = searchAutoComplete.getText();
        if (text == null || TextUtils.getTrimmedLength(text) <= 0) {
            return;
        }
        if (this.f3910m0 != null) {
            getContext().startActivity(h("android.intent.action.SEARCH", null, null, text.toString()));
        }
        searchAutoComplete.setImeVisibility(false);
        searchAutoComplete.dismissDropDown();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        removeCallbacks(this.f3912o0);
        post(this.f3913p0);
        super.onDetachedFromWindow();
    }

    @Override // m.X, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z4, int i, int i5, int i6, int i7) {
        super.onLayout(z4, i, i5, i6, i7);
        if (z4) {
            int[] iArr = this.M;
            SearchAutoComplete searchAutoComplete = this.f3876A;
            searchAutoComplete.getLocationInWindow(iArr);
            int[] iArr2 = this.f3888N;
            getLocationInWindow(iArr2);
            int i8 = iArr[1] - iArr2[1];
            int i9 = iArr[0] - iArr2[0];
            int width = searchAutoComplete.getWidth() + i9;
            int height = searchAutoComplete.getHeight() + i8;
            Rect rect = this.f3886K;
            rect.set(i9, i8, width, height);
            int i10 = rect.left;
            int i11 = rect.right;
            int i12 = i7 - i5;
            Rect rect2 = this.f3887L;
            rect2.set(i10, 0, i11, i12);
            A0 a02 = this.f3885J;
            if (a02 == null) {
                A0 a03 = new A0(rect2, rect, searchAutoComplete);
                this.f3885J = a03;
                setTouchDelegate(a03);
            } else {
                a02.f8232b.set(rect2);
                Rect rect3 = a02.f8234d;
                rect3.set(rect2);
                int i13 = -a02.f8235e;
                rect3.inset(i13, i13);
                a02.f8233c.set(rect);
            }
        }
    }

    @Override // m.X, android.view.View
    public final void onMeasure(int i, int i5) {
        int i6;
        if (this.f3899b0) {
            super.onMeasure(i, i5);
            return;
        }
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        if (mode == Integer.MIN_VALUE) {
            int i7 = this.f3905h0;
            size = i7 > 0 ? Math.min(i7, size) : Math.min(getPreferredWidth(), size);
        } else if (mode == 0) {
            size = this.f3905h0;
            if (size <= 0) {
                size = getPreferredWidth();
            }
        } else if (mode == 1073741824 && (i6 = this.f3905h0) > 0) {
            size = Math.min(i6, size);
        }
        int mode2 = View.MeasureSpec.getMode(i5);
        int size2 = View.MeasureSpec.getSize(i5);
        if (mode2 == Integer.MIN_VALUE) {
            size2 = Math.min(getPreferredHeight(), size2);
        } else if (mode2 == 0) {
            size2 = getPreferredHeight();
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof C0628z0)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C0628z0 c0628z0 = (C0628z0) parcelable;
        super.onRestoreInstanceState(c0628z0.f1207l);
        u(c0628z0.f8493n);
        requestLayout();
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        C0628z0 c0628z0 = new C0628z0(super.onSaveInstanceState());
        c0628z0.f8493n = this.f3899b0;
        return c0628z0;
    }

    @Override // android.view.View
    public final void onWindowFocusChanged(boolean z4) {
        super.onWindowFocusChanged(z4);
        post(this.f3912o0);
    }

    public final void p() {
        boolean zIsEmpty = TextUtils.isEmpty(this.f3876A.getText());
        int i = (!zIsEmpty || (this.f3898a0 && !this.f3908k0)) ? 0 : 8;
        ImageView imageView = this.f3882G;
        imageView.setVisibility(i);
        Drawable drawable = imageView.getDrawable();
        if (drawable != null) {
            drawable.setState(!zIsEmpty ? ViewGroup.ENABLED_STATE_SET : ViewGroup.EMPTY_STATE_SET);
        }
    }

    public final void q() {
        int[] iArr = this.f3876A.hasFocus() ? ViewGroup.FOCUSED_STATE_SET : ViewGroup.EMPTY_STATE_SET;
        Drawable background = this.f3878C.getBackground();
        if (background != null) {
            background.setState(iArr);
        }
        Drawable background2 = this.f3879D.getBackground();
        if (background2 != null) {
            background2.setState(iArr);
        }
        invalidate();
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void r() {
        CharSequence queryHint = getQueryHint();
        CharSequence charSequence = queryHint;
        if (queryHint == null) {
            charSequence = "";
        }
        boolean z4 = this.f3898a0;
        SearchAutoComplete searchAutoComplete = this.f3876A;
        CharSequence charSequence2 = charSequence;
        if (z4) {
            Drawable drawable = this.f3890P;
            charSequence2 = charSequence;
            if (drawable != null) {
                int textSize = (int) (((double) searchAutoComplete.getTextSize()) * 1.25d);
                drawable.setBounds(0, 0, textSize, textSize);
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("   ");
                spannableStringBuilder.setSpan(new ImageSpan(drawable), 1, 2, 33);
                spannableStringBuilder.append(charSequence);
                charSequence2 = spannableStringBuilder;
            }
        }
        searchAutoComplete.setHint(charSequence2);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean requestFocus(int i, Rect rect) {
        if (this.f3904g0 || !isFocusable()) {
            return false;
        }
        if (this.f3899b0) {
            return super.requestFocus(i, rect);
        }
        boolean zRequestFocus = this.f3876A.requestFocus(i, rect);
        if (zRequestFocus) {
            u(false);
        }
        return zRequestFocus;
    }

    public final void s() {
        this.f3879D.setVisibility(((this.f3901d0 || this.f3906i0) && !this.f3899b0 && (this.f3881F.getVisibility() == 0 || this.f3883H.getVisibility() == 0)) ? 0 : 8);
    }

    public void setAppSearchData(Bundle bundle) {
        this.f3911n0 = bundle;
    }

    public void setIconified(boolean z4) {
        if (z4) {
            k();
            return;
        }
        u(false);
        SearchAutoComplete searchAutoComplete = this.f3876A;
        searchAutoComplete.requestFocus();
        searchAutoComplete.setImeVisibility(true);
        View.OnClickListener onClickListener = this.f3897W;
        if (onClickListener != null) {
            onClickListener.onClick(this);
        }
    }

    public void setIconifiedByDefault(boolean z4) {
        if (this.f3898a0 == z4) {
            return;
        }
        this.f3898a0 = z4;
        u(z4);
        r();
    }

    public void setImeOptions(int i) {
        this.f3876A.setImeOptions(i);
    }

    public void setInputType(int i) {
        this.f3876A.setInputType(i);
    }

    public void setMaxWidth(int i) {
        this.f3905h0 = i;
        requestLayout();
    }

    public void setOnQueryTextFocusChangeListener(View.OnFocusChangeListener onFocusChangeListener) {
        this.f3896V = onFocusChangeListener;
    }

    public void setOnSearchClickListener(View.OnClickListener onClickListener) {
        this.f3897W = onClickListener;
    }

    public void setQueryHint(CharSequence charSequence) {
        this.f3902e0 = charSequence;
        r();
    }

    public void setQueryRefinementEnabled(boolean z4) {
        this.f3903f0 = z4;
        J.c cVar = this.f3900c0;
        if (cVar instanceof D0) {
            ((D0) cVar).f8243A = z4 ? 2 : 1;
        }
    }

    public void setSearchableInfo(SearchableInfo searchableInfo) {
        this.f3910m0 = searchableInfo;
        Intent intent = null;
        SearchAutoComplete searchAutoComplete = this.f3876A;
        if (searchableInfo != null) {
            searchAutoComplete.setThreshold(searchableInfo.getSuggestThreshold());
            searchAutoComplete.setImeOptions(this.f3910m0.getImeOptions());
            int inputType = this.f3910m0.getInputType();
            if ((inputType & 15) == 1) {
                inputType &= -65537;
                if (this.f3910m0.getSuggestAuthority() != null) {
                    inputType |= 589824;
                }
            }
            searchAutoComplete.setInputType(inputType);
            J.c cVar = this.f3900c0;
            if (cVar != null) {
                cVar.b(null);
            }
            if (this.f3910m0.getSuggestAuthority() != null) {
                D0 d02 = new D0(getContext(), this, this.f3910m0, this.f3914q0);
                this.f3900c0 = d02;
                searchAutoComplete.setAdapter(d02);
                ((D0) this.f3900c0).f8243A = this.f3903f0 ? 2 : 1;
            }
            r();
        }
        SearchableInfo searchableInfo2 = this.f3910m0;
        boolean z4 = false;
        if (searchableInfo2 != null && searchableInfo2.getVoiceSearchEnabled()) {
            if (this.f3910m0.getVoiceSearchLaunchWebSearch()) {
                intent = this.f3893S;
            } else if (this.f3910m0.getVoiceSearchLaunchRecognizer()) {
                intent = this.f3894T;
            }
            if (intent != null) {
                z4 = getContext().getPackageManager().resolveActivity(intent, 65536) != null;
            }
        }
        this.f3906i0 = z4;
        if (z4) {
            searchAutoComplete.setPrivateImeOptions("nm");
        }
        u(this.f3899b0);
    }

    public void setSubmitButtonEnabled(boolean z4) {
        this.f3901d0 = z4;
        u(this.f3899b0);
    }

    public void setSuggestionsAdapter(J.c cVar) {
        this.f3900c0 = cVar;
        this.f3876A.setAdapter(cVar);
    }

    public final void t(boolean z4) {
        boolean z5 = this.f3901d0;
        this.f3881F.setVisibility((!z5 || !(z5 || this.f3906i0) || this.f3899b0 || !hasFocus() || (!z4 && this.f3906i0)) ? 8 : 0);
    }

    public final void u(boolean z4) {
        this.f3899b0 = z4;
        int i = 8;
        int i5 = z4 ? 0 : 8;
        boolean zIsEmpty = TextUtils.isEmpty(this.f3876A.getText());
        this.f3880E.setVisibility(i5);
        t(!zIsEmpty);
        this.f3877B.setVisibility(z4 ? 8 : 0);
        ImageView imageView = this.f3889O;
        imageView.setVisibility((imageView.getDrawable() == null || this.f3898a0) ? 8 : 0);
        p();
        if (this.f3906i0 && !this.f3899b0 && zIsEmpty) {
            this.f3881F.setVisibility(8);
            i = 0;
        }
        this.f3883H.setVisibility(i);
        s();
    }

    public SearchView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.searchViewStyle);
    }

    public SearchView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f3886K = new Rect();
        this.f3887L = new Rect();
        this.M = new int[2];
        this.f3888N = new int[2];
        this.f3912o0 = new RunnableC0612r0(this, 0);
        this.f3913p0 = new RunnableC0612r0(this, 1);
        this.f3914q0 = new WeakHashMap();
        a aVar = new a(this);
        b bVar = new b(this);
        C0618u0 c0618u0 = new C0618u0(this);
        C0620v0 c0620v0 = new C0620v0(this);
        Y y = new Y(this, 1);
        C0611q0 c0611q0 = new C0611q0(this);
        int[] iArr = AbstractC0441a.f5897q;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i, 0);
        s sVar = new s(context, typedArrayObtainStyledAttributes);
        I.c(this, context, iArr, attributeSet, typedArrayObtainStyledAttributes, i);
        LayoutInflater.from(context).inflate(typedArrayObtainStyledAttributes.getResourceId(9, R.layout.abc_search_view), (ViewGroup) this, true);
        SearchAutoComplete searchAutoComplete = (SearchAutoComplete) findViewById(R.id.search_src_text);
        this.f3876A = searchAutoComplete;
        searchAutoComplete.setSearchView(this);
        this.f3877B = findViewById(R.id.search_edit_frame);
        View viewFindViewById = findViewById(R.id.search_plate);
        this.f3878C = viewFindViewById;
        View viewFindViewById2 = findViewById(R.id.submit_area);
        this.f3879D = viewFindViewById2;
        ImageView imageView = (ImageView) findViewById(R.id.search_button);
        this.f3880E = imageView;
        ImageView imageView2 = (ImageView) findViewById(R.id.search_go_btn);
        this.f3881F = imageView2;
        ImageView imageView3 = (ImageView) findViewById(R.id.search_close_btn);
        this.f3882G = imageView3;
        ImageView imageView4 = (ImageView) findViewById(R.id.search_voice_btn);
        this.f3883H = imageView4;
        ImageView imageView5 = (ImageView) findViewById(R.id.search_mag_icon);
        this.f3889O = imageView5;
        viewFindViewById.setBackground(sVar.D(10));
        viewFindViewById2.setBackground(sVar.D(14));
        imageView.setImageDrawable(sVar.D(13));
        imageView2.setImageDrawable(sVar.D(7));
        imageView3.setImageDrawable(sVar.D(4));
        imageView4.setImageDrawable(sVar.D(16));
        imageView5.setImageDrawable(sVar.D(13));
        this.f3890P = sVar.D(12);
        AbstractC0149a.E(imageView, getResources().getString(R.string.abc_searchview_description_search));
        this.f3891Q = typedArrayObtainStyledAttributes.getResourceId(15, R.layout.abc_search_dropdown_item_icons_2line);
        this.f3892R = typedArrayObtainStyledAttributes.getResourceId(5, 0);
        imageView.setOnClickListener(aVar);
        imageView3.setOnClickListener(aVar);
        imageView2.setOnClickListener(aVar);
        imageView4.setOnClickListener(aVar);
        searchAutoComplete.setOnClickListener(aVar);
        searchAutoComplete.addTextChangedListener(c0611q0);
        searchAutoComplete.setOnEditorActionListener(c0618u0);
        searchAutoComplete.setOnItemClickListener(c0620v0);
        searchAutoComplete.setOnItemSelectedListener(y);
        searchAutoComplete.setOnKeyListener(bVar);
        searchAutoComplete.setOnFocusChangeListener(new ViewOnFocusChangeListenerC0614s0(this));
        setIconifiedByDefault(typedArrayObtainStyledAttributes.getBoolean(8, true));
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(1, -1);
        if (dimensionPixelSize != -1) {
            setMaxWidth(dimensionPixelSize);
        }
        this.f3895U = typedArrayObtainStyledAttributes.getText(6);
        this.f3902e0 = typedArrayObtainStyledAttributes.getText(11);
        int i5 = typedArrayObtainStyledAttributes.getInt(3, -1);
        if (i5 != -1) {
            setImeOptions(i5);
        }
        int i6 = typedArrayObtainStyledAttributes.getInt(2, -1);
        if (i6 != -1) {
            setInputType(i6);
        }
        setFocusable(typedArrayObtainStyledAttributes.getBoolean(0, true));
        sVar.O();
        Intent intent = new Intent("android.speech.action.WEB_SEARCH");
        this.f3893S = intent;
        intent.addFlags(268435456);
        intent.putExtra("android.speech.extra.LANGUAGE_MODEL", "web_search");
        Intent intent2 = new Intent("android.speech.action.RECOGNIZE_SPEECH");
        this.f3894T = intent2;
        intent2.addFlags(268435456);
        View viewFindViewById3 = findViewById(searchAutoComplete.getDropDownAnchor());
        this.f3884I = viewFindViewById3;
        if (viewFindViewById3 != null) {
            viewFindViewById3.addOnLayoutChangeListener(new ViewOnLayoutChangeListenerC0616t0(this));
        }
        u(this.f3898a0);
        r();
    }

    public void setOnCloseListener(InterfaceC0622w0 interfaceC0622w0) {
    }

    public void setOnQueryTextListener(InterfaceC0624x0 interfaceC0624x0) {
    }

    public void setOnSuggestionListener(InterfaceC0626y0 interfaceC0626y0) {
    }
}

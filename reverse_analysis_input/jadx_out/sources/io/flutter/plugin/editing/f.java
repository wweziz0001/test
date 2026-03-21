package io.flutter.plugin.editing;

import android.text.Selection;
import android.text.SpannableStringBuilder;
import android.util.Log;
import android.view.View;
import android.view.inputmethod.BaseInputConnection;
import java.util.ArrayList;
import m3.C0680n;

/* JADX INFO: loaded from: classes.dex */
public final class f extends SpannableStringBuilder {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f6694l = 0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f6695m = 0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final ArrayList f6696n = new ArrayList();

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final ArrayList f6697o = new ArrayList();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final ArrayList f6698p = new ArrayList();

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public String f6699q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public String f6700r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f6701s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f6702t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f6703u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f6704v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final d f6705w;

    public f(C0680n c0680n, View view) {
        this.f6705w = new d(view, this);
        if (c0680n != null) {
            f(c0680n);
        }
    }

    public final void a(e eVar) {
        if (this.f6695m > 0) {
            Log.e("ListenableEditingState", "adding a listener " + eVar.toString() + " in a listener callback");
        }
        if (this.f6694l <= 0) {
            this.f6696n.add(eVar);
        } else {
            Log.w("ListenableEditingState", "a listener was added to EditingState while a batch edit was in progress");
            this.f6697o.add(eVar);
        }
    }

    public final void b() {
        this.f6694l++;
        if (this.f6695m > 0) {
            Log.e("ListenableEditingState", "editing state should not be changed in a listener callback");
        }
        if (this.f6694l != 1 || this.f6696n.isEmpty()) {
            return;
        }
        this.f6700r = toString();
        this.f6701s = Selection.getSelectionStart(this);
        this.f6702t = Selection.getSelectionEnd(this);
        this.f6703u = BaseInputConnection.getComposingSpanStart(this);
        this.f6704v = BaseInputConnection.getComposingSpanEnd(this);
    }

    public final void c() {
        int i = this.f6694l;
        if (i == 0) {
            Log.e("ListenableEditingState", "endBatchEdit called without a matching beginBatchEdit");
            return;
        }
        ArrayList arrayList = this.f6696n;
        ArrayList<e> arrayList2 = this.f6697o;
        if (i == 1) {
            for (e eVar : arrayList2) {
                this.f6695m++;
                eVar.a(true);
                this.f6695m--;
            }
            if (!arrayList.isEmpty()) {
                String.valueOf(arrayList.size());
                d(!toString().equals(this.f6700r), (this.f6701s == Selection.getSelectionStart(this) && this.f6702t == Selection.getSelectionEnd(this)) ? false : true, (this.f6703u == BaseInputConnection.getComposingSpanStart(this) && this.f6704v == BaseInputConnection.getComposingSpanEnd(this)) ? false : true);
            }
        }
        arrayList.addAll(arrayList2);
        arrayList2.clear();
        this.f6694l--;
    }

    public final void d(boolean z4, boolean z5, boolean z6) {
        if (z4 || z5 || z6) {
            for (e eVar : this.f6696n) {
                this.f6695m++;
                eVar.a(z4);
                this.f6695m--;
            }
        }
    }

    public final void e(e eVar) {
        if (this.f6695m > 0) {
            Log.e("ListenableEditingState", "removing a listener " + eVar.toString() + " in a listener callback");
        }
        this.f6696n.remove(eVar);
        if (this.f6694l > 0) {
            this.f6697o.remove(eVar);
        }
    }

    public final void f(C0680n c0680n) {
        int i;
        b();
        replace(0, length(), (CharSequence) c0680n.f8736a);
        int i5 = c0680n.f8737b;
        if (i5 >= 0) {
            Selection.setSelection(this, i5, c0680n.f8738c);
        } else {
            Selection.removeSelection(this);
        }
        int i6 = c0680n.f8739d;
        if (i6 < 0 || i6 >= (i = c0680n.f8740e)) {
            BaseInputConnection.removeComposingSpans(this);
        } else {
            this.f6705w.setComposingRegion(i6, i);
        }
        this.f6698p.clear();
        c();
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spannable
    public final void setSpan(Object obj, int i, int i5, int i6) {
        super.setSpan(obj, i, i5, i6);
        ArrayList arrayList = this.f6698p;
        String string = toString();
        int selectionStart = Selection.getSelectionStart(this);
        int selectionEnd = Selection.getSelectionEnd(this);
        int composingSpanStart = BaseInputConnection.getComposingSpanStart(this);
        int composingSpanEnd = BaseInputConnection.getComposingSpanEnd(this);
        h hVar = new h();
        hVar.f6714e = selectionStart;
        hVar.f6715f = selectionEnd;
        hVar.f6716g = composingSpanStart;
        hVar.f6717h = composingSpanEnd;
        hVar.f6710a = string;
        hVar.f6711b = "";
        hVar.f6712c = -1;
        hVar.f6713d = -1;
        arrayList.add(hVar);
    }

    @Override // android.text.SpannableStringBuilder, java.lang.CharSequence
    public final String toString() {
        String str = this.f6699q;
        if (str != null) {
            return str;
        }
        String string = super.toString();
        this.f6699q = string;
        return string;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final SpannableStringBuilder replace(int i, int i5, CharSequence charSequence, int i6, int i7) {
        if (this.f6695m > 0) {
            Log.e("ListenableEditingState", "editing state should not be changed in a listener callback");
        }
        String string = toString();
        int i8 = i5 - i;
        boolean z4 = i8 != i7 - i6;
        for (int i9 = 0; i9 < i8 && !z4; i9++) {
            z4 |= charAt(i + i9) != charSequence.charAt(i6 + i9);
        }
        if (z4) {
            this.f6699q = null;
        }
        int selectionStart = Selection.getSelectionStart(this);
        int selectionEnd = Selection.getSelectionEnd(this);
        int composingSpanStart = BaseInputConnection.getComposingSpanStart(this);
        int composingSpanEnd = BaseInputConnection.getComposingSpanEnd(this);
        SpannableStringBuilder spannableStringBuilderReplace = super.replace(i, i5, charSequence, i6, i7);
        ArrayList arrayList = this.f6698p;
        int selectionStart2 = Selection.getSelectionStart(this);
        int selectionEnd2 = Selection.getSelectionEnd(this);
        int composingSpanStart2 = BaseInputConnection.getComposingSpanStart(this);
        int composingSpanEnd2 = BaseInputConnection.getComposingSpanEnd(this);
        h hVar = new h();
        hVar.f6714e = selectionStart2;
        hVar.f6715f = selectionEnd2;
        hVar.f6716g = composingSpanStart2;
        hVar.f6717h = composingSpanEnd2;
        String string2 = charSequence.toString();
        hVar.f6710a = string;
        hVar.f6711b = string2;
        hVar.f6712c = i;
        hVar.f6713d = i5;
        arrayList.add(hVar);
        if (this.f6694l > 0) {
            return spannableStringBuilderReplace;
        }
        d(z4, (Selection.getSelectionStart(this) == selectionStart && Selection.getSelectionEnd(this) == selectionEnd) ? false : true, (BaseInputConnection.getComposingSpanStart(this) == composingSpanStart && BaseInputConnection.getComposingSpanEnd(this) == composingSpanEnd) ? false : true);
        return spannableStringBuilderReplace;
    }
}

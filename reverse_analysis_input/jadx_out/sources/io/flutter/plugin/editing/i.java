package io.flutter.plugin.editing;

import D.C0015o;
import android.graphics.Rect;
import android.os.Build;
import android.os.IBinder;
import android.util.SparseArray;
import android.view.View;
import android.view.autofill.AutofillManager;
import android.view.autofill.AutofillValue;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import androidx.lifecycle.E;
import io.flutter.embedding.android.B;
import io.flutter.plugin.platform.o;
import io.flutter.plugin.platform.p;
import m3.C0675i;
import m3.C0679m;
import m3.C0680n;
import n3.C0707q;

/* JADX INFO: loaded from: classes.dex */
public final class i implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View f6718a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InputMethodManager f6719b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AutofillManager f6720c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Z1.e f6721d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public C0015o f6722e = new C0015o(1, 0, 6);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public C0679m f6723f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public SparseArray f6724g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public f f6725h;
    public boolean i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public InputConnection f6726j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final p f6727k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final o f6728l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public Rect f6729m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final ImeSyncDeferringInsetsCallback f6730n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public C0680n f6731o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f6732p;

    public i(View view, Z1.e eVar, C0675i c0675i, p pVar, o oVar) {
        this.f6718a = view;
        this.f6725h = new f(null, view);
        this.f6719b = (InputMethodManager) view.getContext().getSystemService("input_method");
        int i = Build.VERSION.SDK_INT;
        if (i >= 26) {
            this.f6720c = B.a(view.getContext().getSystemService(B.f()));
        } else {
            this.f6720c = null;
        }
        if (i >= 30) {
            ImeSyncDeferringInsetsCallback imeSyncDeferringInsetsCallback = new ImeSyncDeferringInsetsCallback(view);
            this.f6730n = imeSyncDeferringInsetsCallback;
            imeSyncDeferringInsetsCallback.install();
        }
        this.f6721d = eVar;
        eVar.f3002n = new E(this, 8);
        ((C0707q) eVar.f3001m).a("TextInputClient.requestExistingInputState", null, null);
        this.f6727k = pVar;
        pVar.f6800g = this;
        this.f6728l = oVar;
        oVar.f6783f = this;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0086, code lost:
    
        if (r10 == r0.f8740e) goto L38;
     */
    @Override // io.flutter.plugin.editing.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(boolean r17) {
        /*
            Method dump skipped, instruction units count: 387
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.flutter.plugin.editing.i.a(boolean):void");
    }

    public final void b(int i) {
        C0015o c0015o = this.f6722e;
        int i5 = c0015o.f360b;
        if ((i5 == 3 || i5 == 4) && c0015o.f361c == i) {
            this.f6722e = new C0015o(1, 0, 6);
            d();
            View view = this.f6718a;
            IBinder applicationWindowToken = view.getApplicationWindowToken();
            InputMethodManager inputMethodManager = this.f6719b;
            inputMethodManager.hideSoftInputFromWindow(applicationWindowToken, 0);
            inputMethodManager.restartInput(view);
            this.i = false;
        }
    }

    public final void c() {
        this.f6727k.f6800g = null;
        this.f6728l.f6783f = null;
        this.f6721d.f3002n = null;
        d();
        this.f6725h.e(this);
        ImeSyncDeferringInsetsCallback imeSyncDeferringInsetsCallback = this.f6730n;
        if (imeSyncDeferringInsetsCallback != null) {
            imeSyncDeferringInsetsCallback.remove();
        }
    }

    public final void d() {
        AutofillManager autofillManager;
        C0679m c0679m;
        Z1.i iVar;
        if (Build.VERSION.SDK_INT < 26 || (autofillManager = this.f6720c) == null || (c0679m = this.f6723f) == null || (iVar = c0679m.f8732j) == null || this.f6724g == null) {
            return;
        }
        autofillManager.notifyViewExited(this.f6718a, ((String) iVar.f3012l).hashCode());
    }

    public final void e(C0679m c0679m) {
        Z1.i iVar;
        if (Build.VERSION.SDK_INT < 26) {
            return;
        }
        if (c0679m == null || (iVar = c0679m.f8732j) == null) {
            this.f6724g = null;
            return;
        }
        SparseArray sparseArray = new SparseArray();
        this.f6724g = sparseArray;
        C0679m[] c0679mArr = c0679m.f8734l;
        if (c0679mArr == null) {
            sparseArray.put(((String) iVar.f3012l).hashCode(), c0679m);
            return;
        }
        for (C0679m c0679m2 : c0679mArr) {
            Z1.i iVar2 = c0679m2.f8732j;
            if (iVar2 != null) {
                SparseArray sparseArray2 = this.f6724g;
                String str = (String) iVar2.f3012l;
                sparseArray2.put(str.hashCode(), c0679m2);
                this.f6720c.notifyValueChanged(this.f6718a, str.hashCode(), AutofillValue.forText(((C0680n) iVar2.f3014n).f8736a));
            }
        }
    }
}

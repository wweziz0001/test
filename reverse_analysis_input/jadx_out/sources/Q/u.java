package Q;

import android.text.Editable;
import android.text.SpanWatcher;
import android.text.Spannable;
import android.text.TextWatcher;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes.dex */
public final class u implements TextWatcher, SpanWatcher {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Object f1755l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final AtomicInteger f1756m = new AtomicInteger(0);

    public u(Object obj) {
        this.f1755l = obj;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        ((TextWatcher) this.f1755l).afterTextChanged(editable);
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i5, int i6) {
        ((TextWatcher) this.f1755l).beforeTextChanged(charSequence, i, i5, i6);
    }

    @Override // android.text.SpanWatcher
    public final void onSpanAdded(Spannable spannable, Object obj, int i, int i5) {
        if (this.f1756m.get() <= 0 || !(obj instanceof w)) {
            ((SpanWatcher) this.f1755l).onSpanAdded(spannable, obj, i, i5);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x001c A[PHI: r11
      0x001c: PHI (r11v1 int) = (r11v0 int), (r11v3 int) binds: [B:8:0x0011, B:12:0x0017] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // android.text.SpanWatcher
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onSpanChanged(android.text.Spannable r9, java.lang.Object r10, int r11, int r12, int r13, int r14) {
        /*
            r8 = this;
            java.util.concurrent.atomic.AtomicInteger r0 = r8.f1756m
            int r0 = r0.get()
            if (r0 <= 0) goto Ld
            boolean r0 = r10 instanceof Q.w
            if (r0 == 0) goto Ld
            return
        Ld:
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            if (r0 >= r1) goto L1c
            r0 = 0
            if (r11 <= r12) goto L17
            r11 = r0
        L17:
            if (r13 <= r14) goto L1c
            r4 = r11
            r6 = r0
            goto L1e
        L1c:
            r4 = r11
            r6 = r13
        L1e:
            java.lang.Object r11 = r8.f1755l
            r1 = r11
            android.text.SpanWatcher r1 = (android.text.SpanWatcher) r1
            r2 = r9
            r3 = r10
            r5 = r12
            r7 = r14
            r1.onSpanChanged(r2, r3, r4, r5, r6, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: Q.u.onSpanChanged(android.text.Spannable, java.lang.Object, int, int, int, int):void");
    }

    @Override // android.text.SpanWatcher
    public final void onSpanRemoved(Spannable spannable, Object obj, int i, int i5) {
        if (this.f1756m.get() <= 0 || !(obj instanceof w)) {
            ((SpanWatcher) this.f1755l).onSpanRemoved(spannable, obj, i, i5);
        }
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i5, int i6) {
        ((TextWatcher) this.f1755l).onTextChanged(charSequence, i, i5, i6);
    }
}

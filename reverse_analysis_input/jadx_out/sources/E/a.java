package E;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final class a extends ClickableSpan {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f621a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j f622b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f623c;

    public a(int i, j jVar, int i5) {
        this.f621a = i;
        this.f622b = jVar;
        this.f623c = i5;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        Bundle bundle = new Bundle();
        bundle.putInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", this.f621a);
        this.f622b.f631a.performAction(this.f623c, bundle);
    }
}

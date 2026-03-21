package io.flutter.plugin.platform;

import android.view.View;
import h0.RunnableC0454e;

/* JADX INFO: loaded from: classes.dex */
public final class e implements View.OnSystemUiVisibilityChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ View f6752a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f f6753b;

    public e(f fVar, View view) {
        this.f6753b = fVar;
        this.f6752a = view;
    }

    @Override // android.view.View.OnSystemUiVisibilityChangeListener
    public final void onSystemUiVisibilityChange(int i) {
        this.f6752a.post(new RunnableC0454e(i, 2, this));
    }
}

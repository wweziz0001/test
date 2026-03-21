package io.flutter.plugin.platform;

import android.os.Build;

/* JADX INFO: loaded from: classes.dex */
public final class v implements io.flutter.view.o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ w f6827a;

    public v(w wVar) {
        this.f6827a = wVar;
    }

    @Override // io.flutter.view.o
    public final void onTrimMemory(int i) {
        if (i != 80 || Build.VERSION.SDK_INT < 29) {
            return;
        }
        this.f6827a.f6833f = true;
    }
}

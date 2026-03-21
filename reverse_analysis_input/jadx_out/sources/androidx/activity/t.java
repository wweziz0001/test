package androidx.activity;

import android.window.OnBackInvokedCallback;

/* JADX INFO: loaded from: classes.dex */
public final class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final t f3767a = new t();

    public final OnBackInvokedCallback a(M3.l lVar, M3.l lVar2, M3.a aVar, M3.a aVar2) {
        N3.h.e(lVar, "onBackStarted");
        N3.h.e(lVar2, "onBackProgressed");
        N3.h.e(aVar, "onBackInvoked");
        N3.h.e(aVar2, "onBackCancelled");
        return new s(lVar, lVar2, aVar, aVar2);
    }
}

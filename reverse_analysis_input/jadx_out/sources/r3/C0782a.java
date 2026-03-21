package r3;

import android.app.Activity;
import android.os.Build;
import android.view.View;
import b3.AbstractC0307a;
import m3.C0675i;

/* JADX INFO: renamed from: r3.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0782a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Activity f9550a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f9551b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C0675i f9552c;

    public C0782a(int i, Activity activity, C0675i c0675i) {
        this.f9550a = activity;
        this.f9551b = i;
        this.f9552c = c0675i;
        c0675i.f8712m = this;
    }

    public final int a() {
        if (Build.VERSION.SDK_INT < 35) {
            return 2;
        }
        Activity activity = this.f9550a;
        int i = this.f9551b;
        View viewFindViewById = activity.findViewById(i);
        if (viewFindViewById != null) {
            return viewFindViewById.getContentSensitivity();
        }
        throw new IllegalArgumentException(AbstractC0307a.h(i, "FlutterView with ID ", "not found"));
    }

    public final void b(int i) {
        if (Build.VERSION.SDK_INT < 35) {
            throw new IllegalStateException("isSupported() should be called before attempting to set content sensitivity as it is not supported on this device.");
        }
        Activity activity = this.f9550a;
        int i5 = this.f9551b;
        View viewFindViewById = activity.findViewById(i5);
        if (viewFindViewById == null) {
            throw new IllegalArgumentException(AbstractC0307a.h(i5, "FlutterView with ID ", "not found"));
        }
        if (viewFindViewById.getContentSensitivity() == i) {
            return;
        }
        viewFindViewById.setContentSensitivity(i);
        viewFindViewById.invalidate();
    }
}

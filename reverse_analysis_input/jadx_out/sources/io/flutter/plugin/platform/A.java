package io.flutter.plugin.platform;

import android.app.Activity;
import android.hardware.display.VirtualDisplay;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final class A {
    public static final x i = new x();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public SingleViewPresentation f6733a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Activity f6734b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C0504a f6735c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f6736d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f6737e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final h f6738f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final k f6739g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public VirtualDisplay f6740h;

    public A(Activity activity, C0504a c0504a, VirtualDisplay virtualDisplay, g gVar, h hVar, k kVar, int i5) {
        this.f6734b = activity;
        this.f6735c = c0504a;
        this.f6738f = hVar;
        this.f6739g = kVar;
        this.f6737e = i5;
        this.f6740h = virtualDisplay;
        this.f6736d = activity.getResources().getDisplayMetrics().densityDpi;
        SingleViewPresentation singleViewPresentation = new SingleViewPresentation(activity, this.f6740h.getDisplay(), gVar, c0504a, i5, kVar);
        this.f6733a = singleViewPresentation;
        singleViewPresentation.show();
    }

    public final View a() {
        SingleViewPresentation singleViewPresentation = this.f6733a;
        if (singleViewPresentation == null) {
            return null;
        }
        return singleViewPresentation.getView().getView();
    }
}

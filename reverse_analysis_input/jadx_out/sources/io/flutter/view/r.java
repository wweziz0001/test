package io.flutter.view;

import D0.t;
import android.hardware.display.DisplayManager;
import io.flutter.embedding.engine.FlutterJNI;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class r {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static r f6962e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static t f6963f;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final FlutterJNI f6965b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f6964a = -1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public q f6966c = new q(this, 0);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final a f6967d = new a(this);

    public r(FlutterJNI flutterJNI) {
        this.f6965b = flutterJNI;
    }

    public static r a(DisplayManager displayManager, FlutterJNI flutterJNI) {
        if (f6962e == null) {
            f6962e = new r(flutterJNI);
        }
        if (f6963f == null) {
            r rVar = f6962e;
            Objects.requireNonNull(rVar);
            t tVar = new t(rVar, displayManager, 1);
            f6963f = tVar;
            displayManager.registerDisplayListener(tVar, null);
        }
        if (f6962e.f6964a == -1) {
            float refreshRate = displayManager.getDisplay(0).getRefreshRate();
            f6962e.f6964a = (long) (1.0E9d / ((double) refreshRate));
            flutterJNI.setRefreshRateFPS(refreshRate);
        }
        return f6962e;
    }
}

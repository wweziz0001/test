package M1;

import D.P;
import D.S;
import D.T;
import D.b0;
import K1.l;
import K1.m;
import K1.o;
import N3.h;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Point;
import android.graphics.Rect;
import android.inputmethodservice.InputMethodService;
import android.os.Build;
import android.view.Display;
import android.view.WindowManager;
import androidx.window.extensions.layout.FoldingFeature;
import androidx.window.extensions.layout.WindowLayoutInfo;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class e {
    public static K1.c a(m mVar, FoldingFeature foldingFeature) {
        K1.b bVar;
        K1.b bVar2;
        int type = foldingFeature.getType();
        if (type == 1) {
            bVar = K1.b.f1234r;
        } else {
            if (type != 2) {
                return null;
            }
            bVar = K1.b.f1235s;
        }
        int state = foldingFeature.getState();
        if (state == 1) {
            bVar2 = K1.b.f1232p;
        } else {
            if (state != 2) {
                return null;
            }
            bVar2 = K1.b.f1233q;
        }
        Rect bounds = foldingFeature.getBounds();
        h.d(bounds, "oemFeature.bounds");
        H1.b bVar3 = new H1.b(bounds);
        Rect rectC = mVar.f1261a.c();
        if (bVar3.a() == 0 && bVar3.b() == 0) {
            return null;
        }
        if (bVar3.b() != rectC.width() && bVar3.a() != rectC.height()) {
            return null;
        }
        if (bVar3.b() < rectC.width() && bVar3.a() < rectC.height()) {
            return null;
        }
        if (bVar3.b() == rectC.width() && bVar3.a() == rectC.height()) {
            return null;
        }
        Rect bounds2 = foldingFeature.getBounds();
        h.d(bounds2, "oemFeature.bounds");
        return new K1.c(new H1.b(bounds2), bVar, bVar2);
    }

    public static l b(m mVar, WindowLayoutInfo windowLayoutInfo) {
        K1.c cVarA;
        h.e(windowLayoutInfo, "info");
        List<FoldingFeature> displayFeatures = windowLayoutInfo.getDisplayFeatures();
        h.d(displayFeatures, "info.displayFeatures");
        ArrayList arrayList = new ArrayList();
        for (FoldingFeature foldingFeature : displayFeatures) {
            if (foldingFeature instanceof FoldingFeature) {
                h.d(foldingFeature, "feature");
                cVarA = a(mVar, foldingFeature);
            } else {
                cVarA = null;
            }
            if (cVarA != null) {
                arrayList.add(cVarA);
            }
        }
        return new l(arrayList);
    }

    public static l c(Context context, WindowLayoutInfo windowLayoutInfo) throws Exception {
        m mVar;
        h.e(windowLayoutInfo, "info");
        int i = Build.VERSION.SDK_INT;
        if (i < 30) {
            if (i < 29 || !(context instanceof Activity)) {
                throw new UnsupportedOperationException("Display Features are only supported after Q. Display features for non-Activity contexts are not expected to be reported on devices running Q.");
            }
            int i5 = o.f1264b;
            return b(o.a((Activity) context), windowLayoutInfo);
        }
        int i6 = o.f1264b;
        if (i < 30) {
            Context baseContext = context;
            while (baseContext instanceof ContextWrapper) {
                boolean z4 = baseContext instanceof Activity;
                if (!z4 && !(baseContext instanceof InputMethodService)) {
                    ContextWrapper contextWrapper = (ContextWrapper) baseContext;
                    if (contextWrapper.getBaseContext() != null) {
                        baseContext = contextWrapper.getBaseContext();
                        h.d(baseContext, "iterator.baseContext");
                    }
                }
                if (z4) {
                    mVar = o.a((Activity) context);
                } else {
                    if (!(baseContext instanceof InputMethodService)) {
                        throw new IllegalArgumentException(context + " is not a UiContext");
                    }
                    Object systemService = context.getSystemService("window");
                    h.c(systemService, "null cannot be cast to non-null type android.view.WindowManager");
                    Display defaultDisplay = ((WindowManager) systemService).getDefaultDisplay();
                    h.d(defaultDisplay, "wm.defaultDisplay");
                    Point point = new Point();
                    defaultDisplay.getRealSize(point);
                    Rect rect = new Rect(0, 0, point.x, point.y);
                    int i7 = Build.VERSION.SDK_INT;
                    b0 b0VarB = (i7 >= 30 ? new T() : i7 >= 29 ? new S() : new P()).b();
                    h.d(b0VarB, "Builder().build()");
                    mVar = new m(rect, b0VarB);
                }
            }
            throw new IllegalArgumentException("Context " + context + " is not a UiContext");
        }
        WindowManager windowManager = (WindowManager) context.getSystemService(WindowManager.class);
        b0 b0VarC = b0.c(windowManager.getCurrentWindowMetrics().getWindowInsets(), null);
        Rect bounds = windowManager.getCurrentWindowMetrics().getBounds();
        h.d(bounds, "wm.currentWindowMetrics.bounds");
        mVar = new m(bounds, b0VarC);
        return b(mVar, windowLayoutInfo);
    }
}

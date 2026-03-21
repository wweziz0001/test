package io.flutter.plugin.platform;

import D.c0;
import D.d0;
import D.e0;
import android.app.Activity;
import android.os.Build;
import android.view.Window;
import io.flutter.embedding.android.InterfaceC0491j;

/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Activity f6754a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Z1.l f6755b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f6756c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public T2.i f6757d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f6758e;

    public f(Activity activity, Z1.l lVar, InterfaceC0491j interfaceC0491j) {
        m mVar = new m(this, 1);
        this.f6754a = activity;
        this.f6755b = lVar;
        lVar.f3021m = mVar;
        this.f6756c = interfaceC0491j;
        this.f6758e = 1280;
    }

    public final void a(T2.i iVar) {
        Window window = this.f6754a.getWindow();
        window.getDecorView();
        int i = Build.VERSION.SDK_INT;
        Z1.f e0Var = i >= 30 ? new e0(window) : i >= 26 ? new d0(window) : new c0(window);
        int i5 = Build.VERSION.SDK_INT;
        if (i5 < 30) {
            window.addFlags(Integer.MIN_VALUE);
            window.clearFlags(201326592);
        }
        int i6 = iVar.f2213l;
        if (i6 != 0) {
            int iB = O.i.b(i6);
            if (iB == 0) {
                e0Var.J(false);
            } else if (iB == 1) {
                e0Var.J(true);
            }
        }
        Integer num = (Integer) iVar.f2215n;
        if (num != null) {
            window.setStatusBarColor(num.intValue());
        }
        Boolean bool = (Boolean) iVar.f2216o;
        if (bool != null && i5 >= 29) {
            window.setStatusBarContrastEnforced(bool.booleanValue());
        }
        if (i5 >= 26) {
            int i7 = iVar.f2214m;
            if (i7 != 0) {
                int iB2 = O.i.b(i7);
                if (iB2 == 0) {
                    e0Var.I(false);
                } else if (iB2 == 1) {
                    e0Var.I(true);
                }
            }
            Integer num2 = (Integer) iVar.f2217p;
            if (num2 != null) {
                window.setNavigationBarColor(num2.intValue());
            }
        }
        Integer num3 = (Integer) iVar.f2218q;
        if (num3 != null && i5 >= 28) {
            window.setNavigationBarDividerColor(num3.intValue());
        }
        Boolean bool2 = (Boolean) iVar.f2219r;
        if (bool2 != null && i5 >= 29) {
            window.setNavigationBarContrastEnforced(bool2.booleanValue());
        }
        this.f6757d = iVar;
    }

    public final void b() {
        this.f6754a.getWindow().getDecorView().setSystemUiVisibility(this.f6758e);
        T2.i iVar = this.f6757d;
        if (iVar != null) {
            a(iVar);
        }
    }
}

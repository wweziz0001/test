package androidx.fragment.app;

import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import androidx.lifecycle.AbstractC0274p;
import androidx.lifecycle.C0280w;
import androidx.lifecycle.EnumC0272n;
import androidx.lifecycle.InterfaceC0268j;
import java.util.LinkedHashMap;
import v1.C0916f;
import v1.C0917g;
import v1.InterfaceC0918h;

/* JADX INFO: loaded from: classes.dex */
public final class V implements InterfaceC0268j, InterfaceC0918h, androidx.lifecycle.Z {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final r f4318l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final androidx.lifecycle.Y f4319m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final RunnableC0247n f4320n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public C0280w f4321o = null;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public C0917g f4322p = null;

    public V(r rVar, androidx.lifecycle.Y y, RunnableC0247n runnableC0247n) {
        this.f4318l = rVar;
        this.f4319m = y;
        this.f4320n = runnableC0247n;
    }

    public final void a(EnumC0272n enumC0272n) {
        this.f4321o.e(enumC0272n);
    }

    public final void b() {
        if (this.f4321o == null) {
            this.f4321o = new C0280w(this);
            C0917g c0917g = new C0917g(this);
            this.f4322p = c0917g;
            c0917g.a();
            this.f4320n.run();
        }
    }

    @Override // androidx.lifecycle.InterfaceC0268j
    public final W.b getDefaultViewModelCreationExtras() {
        Application application;
        r rVar = this.f4318l;
        Context applicationContext = rVar.n().getApplicationContext();
        while (true) {
            if (!(applicationContext instanceof ContextWrapper)) {
                application = null;
                break;
            }
            if (applicationContext instanceof Application) {
                application = (Application) applicationContext;
                break;
            }
            applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
        }
        W.c cVar = new W.c();
        LinkedHashMap linkedHashMap = cVar.f2458a;
        if (application != null) {
            linkedHashMap.put(androidx.lifecycle.U.f4516a, application);
        }
        linkedHashMap.put(androidx.lifecycle.M.f4495a, rVar);
        linkedHashMap.put(androidx.lifecycle.M.f4496b, this);
        Bundle bundle = rVar.f4444q;
        if (bundle != null) {
            linkedHashMap.put(androidx.lifecycle.M.f4497c, bundle);
        }
        return cVar;
    }

    @Override // androidx.lifecycle.InterfaceC0278u
    public final AbstractC0274p getLifecycle() {
        b();
        return this.f4321o;
    }

    @Override // v1.InterfaceC0918h
    public final C0916f getSavedStateRegistry() {
        b();
        return this.f4322p.f10355b;
    }

    @Override // androidx.lifecycle.Z
    public final androidx.lifecycle.Y getViewModelStore() {
        b();
        return this.f4319m;
    }
}

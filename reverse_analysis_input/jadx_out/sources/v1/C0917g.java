package v1;

import android.os.Bundle;
import androidx.lifecycle.AbstractC0274p;
import androidx.lifecycle.C0280w;
import androidx.lifecycle.EnumC0272n;
import androidx.lifecycle.EnumC0273o;
import androidx.lifecycle.InterfaceC0276s;
import androidx.lifecycle.InterfaceC0278u;
import java.util.Map;
import o.C0713d;
import o.C0715f;

/* JADX INFO: renamed from: v1.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0917g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f10354a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C0916f f10355b = new C0916f();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f10356c;

    public C0917g(InterfaceC0918h interfaceC0918h) {
        this.f10354a = interfaceC0918h;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [androidx.lifecycle.u, java.lang.Object] */
    public final void a() {
        ?? r02 = this.f10354a;
        AbstractC0274p lifecycle = r02.getLifecycle();
        if (((C0280w) lifecycle).f4545c != EnumC0273o.f4535m) {
            throw new IllegalStateException("Restarter must be created only during owner's initialization stage");
        }
        lifecycle.a(new C0912b(r02, 0));
        final C0916f c0916f = this.f10355b;
        c0916f.getClass();
        if (c0916f.f10349b) {
            throw new IllegalStateException("SavedStateRegistry was already attached.");
        }
        lifecycle.a(new InterfaceC0276s() { // from class: v1.c
            @Override // androidx.lifecycle.InterfaceC0276s
            public final void b(InterfaceC0278u interfaceC0278u, EnumC0272n enumC0272n) {
                C0916f c0916f2 = c0916f;
                N3.h.e(c0916f2, "this$0");
                if (enumC0272n == EnumC0272n.ON_START) {
                    c0916f2.f10353f = true;
                } else if (enumC0272n == EnumC0272n.ON_STOP) {
                    c0916f2.f10353f = false;
                }
            }
        });
        c0916f.f10349b = true;
        this.f10356c = true;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.u, java.lang.Object] */
    public final void b(Bundle bundle) {
        if (!this.f10356c) {
            a();
        }
        C0280w c0280w = (C0280w) this.f10354a.getLifecycle();
        if (c0280w.f4545c.compareTo(EnumC0273o.f4537o) >= 0) {
            throw new IllegalStateException(("performRestore cannot be called when owner is " + c0280w.f4545c).toString());
        }
        C0916f c0916f = this.f10355b;
        if (!c0916f.f10349b) {
            throw new IllegalStateException("You must call performAttach() before calling performRestore(Bundle).");
        }
        if (c0916f.f10351d) {
            throw new IllegalStateException("SavedStateRegistry was already restored.");
        }
        c0916f.f10350c = bundle != null ? bundle.getBundle("androidx.lifecycle.BundlableSavedStateRegistry.key") : null;
        c0916f.f10351d = true;
    }

    public final void c(Bundle bundle) {
        N3.h.e(bundle, "outBundle");
        C0916f c0916f = this.f10355b;
        c0916f.getClass();
        Bundle bundle2 = new Bundle();
        Bundle bundle3 = c0916f.f10350c;
        if (bundle3 != null) {
            bundle2.putAll(bundle3);
        }
        C0715f c0715f = c0916f.f10348a;
        c0715f.getClass();
        C0713d c0713d = new C0713d(c0715f);
        c0715f.f8963n.put(c0713d, Boolean.FALSE);
        while (c0713d.hasNext()) {
            Map.Entry entry = (Map.Entry) c0713d.next();
            bundle2.putBundle((String) entry.getKey(), ((InterfaceC0915e) entry.getValue()).a());
        }
        if (bundle2.isEmpty()) {
            return;
        }
        bundle.putBundle("androidx.lifecycle.BundlableSavedStateRegistry.key", bundle2);
    }
}

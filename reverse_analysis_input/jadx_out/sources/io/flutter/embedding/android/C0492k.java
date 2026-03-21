package io.flutter.embedding.android;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Trace;
import android.util.Log;
import androidx.lifecycle.AbstractC0274p;
import b3.AbstractC0307a;
import e3.C0394c;
import e3.C0396e;
import e3.C0397f;
import e3.C0398g;
import f3.C0433a;
import io.flutter.embedding.engine.FlutterJNI;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import k3.InterfaceC0541a;
import m3.C0667a;
import m3.C0668b;
import m3.C0669c;
import m3.C0676j;
import n3.InterfaceC0709s;
import r3.C0782a;
import z3.AbstractC1068a;

/* JADX INFO: renamed from: io.flutter.embedding.android.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0492k implements InterfaceC0483b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public InterfaceC0491j f6572a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public C0394c f6573b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public D f6574c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public io.flutter.plugin.platform.f f6575d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public C0782a f6576e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ViewTreeObserverOnPreDrawListenerC0490i f6577f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f6578g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f6579h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f6580j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Integer f6581k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final C0489h f6582l = new C0489h(this, 0);
    public boolean i = false;

    public C0492k(InterfaceC0491j interfaceC0491j) {
        this.f6572a = interfaceC0491j;
    }

    public final void a(C0396e c0396e) {
        String appBundlePath = this.f6572a.getAppBundlePath();
        if (appBundlePath == null || appBundlePath.isEmpty()) {
            appBundlePath = ((h3.f) Z1.m.z().f3024m).f6324d.f6308b;
        }
        C0433a c0433a = new C0433a(appBundlePath, this.f6572a.getDartEntrypointFunctionName());
        String initialRoute = this.f6572a.getInitialRoute();
        if (initialRoute == null && (initialRoute = d(this.f6572a.getActivity().getIntent())) == null) {
            initialRoute = "/";
        }
        c0396e.f5632o = c0433a;
        c0396e.f5633p = initialRoute;
        c0396e.f5634q = this.f6572a.getDartEntrypointArgs();
    }

    public final void b() {
        if (!this.f6572a.shouldDestroyEngineWithHost()) {
            this.f6572a.detachFromFlutterEngine();
            return;
        }
        throw new AssertionError("The internal FlutterEngine created by " + this.f6572a + " has been attached to by another activity. To persist a FlutterEngine beyond the ownership of this activity, explicitly create a FlutterEngine");
    }

    public final void c() {
        if (this.f6572a == null) {
            throw new IllegalStateException("Cannot execute method on a destroyed FlutterActivityAndFragmentDelegate.");
        }
    }

    public final String d(Intent intent) {
        Uri data;
        if (!this.f6572a.shouldHandleDeeplinking() || (data = intent.getData()) == null) {
            return null;
        }
        return data.toString();
    }

    public final void e(int i, int i5, Intent intent) {
        c();
        if (this.f6573b == null) {
            Log.w("FlutterActivityAndFragmentDelegate", "onActivityResult() invoked before FlutterFragment was attached to an Activity.");
            return;
        }
        Objects.toString(intent);
        D0.k kVar = this.f6573b.f5608d;
        if (!kVar.f()) {
            Log.e("FlutterEngineCxnRegstry", "Attempted to notify ActivityAware plugins of onActivityResult, but no Activity was attached.");
            return;
        }
        AbstractC1068a.b("FlutterEngineConnectionRegistry#onActivityResult");
        try {
            y2.n nVar = (y2.n) kVar.f456g;
            nVar.getClass();
            Iterator it = new HashSet((HashSet) nVar.f10956c).iterator();
            while (true) {
                boolean z4 = false;
                while (it.hasNext()) {
                    if (((InterfaceC0709s) it.next()).onActivityResult(i, i5, intent) || z4) {
                        z4 = true;
                    }
                }
                Trace.endSection();
                return;
            }
        } catch (Throwable th) {
            try {
                Trace.endSection();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final void f() {
        c();
        if (this.f6573b == null) {
            String cachedEngineId = this.f6572a.getCachedEngineId();
            if (cachedEngineId != null) {
                C0394c c0394c = (C0394c) C0398g.a().f5638a.get(cachedEngineId);
                this.f6573b = c0394c;
                this.f6578g = true;
                if (c0394c == null) {
                    throw new IllegalStateException(AbstractC0307a.k("The requested cached FlutterEngine did not exist in the FlutterEngineCache: '", cachedEngineId, "'"));
                }
            } else {
                InterfaceC0491j interfaceC0491j = this.f6572a;
                C0394c c0394cProvideFlutterEngine = interfaceC0491j.provideFlutterEngine(interfaceC0491j.getContext());
                this.f6573b = c0394cProvideFlutterEngine;
                if (c0394cProvideFlutterEngine != null) {
                    this.f6578g = true;
                } else {
                    String cachedEngineGroupId = this.f6572a.getCachedEngineGroupId();
                    if (cachedEngineGroupId != null) {
                        if (C0398g.f5636b == null) {
                            synchronized (C0398g.class) {
                                try {
                                    if (C0398g.f5636b == null) {
                                        C0398g.f5636b = new C0398g(0);
                                    }
                                } finally {
                                }
                            }
                        }
                        C0397f c0397f = (C0397f) C0398g.f5636b.f5638a.get(cachedEngineGroupId);
                        if (c0397f == null) {
                            throw new IllegalStateException(AbstractC0307a.k("The requested cached FlutterEngineGroup did not exist in the FlutterEngineGroupCache: '", cachedEngineGroupId, "'"));
                        }
                        C0396e c0396e = new C0396e(this.f6572a.getContext());
                        a(c0396e);
                        this.f6573b = c0397f.a(c0396e);
                        this.f6578g = false;
                    } else {
                        Context context = this.f6572a.getContext();
                        HashSet hashSet = this.f6572a.getFlutterShellArgs().f5640a;
                        C0397f c0397f2 = new C0397f(context, (String[]) hashSet.toArray(new String[hashSet.size()]));
                        C0396e c0396e2 = new C0396e(this.f6572a.getContext());
                        c0396e2.f5629l = false;
                        c0396e2.f5630m = this.f6572a.shouldRestoreAndSaveState();
                        a(c0396e2);
                        this.f6573b = c0397f2.a(c0396e2);
                        this.f6578g = false;
                    }
                }
            }
        }
        if (this.f6572a.shouldAttachEngineToActivity()) {
            D0.k kVar = this.f6573b.f5608d;
            AbstractC0274p lifecycle = this.f6572a.getLifecycle();
            kVar.getClass();
            AbstractC1068a.b("FlutterEngineConnectionRegistry#attachToActivity");
            try {
                C0492k c0492k = (C0492k) kVar.f455f;
                if (c0492k != null) {
                    c0492k.b();
                }
                kVar.e();
                kVar.f455f = this;
                Activity activity = this.f6572a.getActivity();
                if (activity == null) {
                    throw new AssertionError("FlutterActivityAndFragmentDelegate's getAppComponent should only be queried after onAttach, when the host's activity should always be non-null");
                }
                kVar.b(activity, lifecycle);
                Trace.endSection();
            } catch (Throwable th) {
                try {
                    Trace.endSection();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        Activity activity2 = this.f6572a.getActivity();
        this.f6575d = this.f6572a.providePlatformPlugin(activity2, this.f6573b);
        this.f6576e = this.f6572a.provideSensitiveContentPlugin(activity2, this.f6573b);
        this.f6572a.configureFlutterEngine(this.f6573b);
        this.f6580j = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x01d0 A[LOOP:0: B:35:0x01c8->B:37:0x01d0, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x01e7 A[LOOP:1: B:39:0x01df->B:41:0x01e7, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x01fe A[LOOP:2: B:43:0x01f6->B:45:0x01fe, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0217 A[LOOP:3: B:47:0x020f->B:49:0x0217, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x022d A[LOOP:4: B:50:0x0225->B:52:0x022d, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0245  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x024d  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01de A[EDGE_INSN: B:74:0x01de->B:38:0x01de BREAK  A[LOOP:0: B:35:0x01c8->B:37:0x01d0], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01f5 A[EDGE_INSN: B:75:0x01f5->B:42:0x01f5 BREAK  A[LOOP:1: B:39:0x01df->B:41:0x01e7], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x020a A[EDGE_INSN: B:76:0x020a->B:46:0x020a BREAK  A[LOOP:2: B:43:0x01f6->B:45:0x01fe], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0225 A[EDGE_INSN: B:77:0x0225->B:50:0x0225 BREAK  A[LOOP:3: B:47:0x020f->B:49:0x0217], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0239 A[EDGE_INSN: B:78:0x0239->B:53:0x0239 BREAK  A[LOOP:4: B:50:0x0225->B:52:0x022d], SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r5v5, types: [android.view.View, io.flutter.embedding.engine.renderer.n] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final io.flutter.embedding.android.D g(int r14, boolean r15) {
        /*
            Method dump skipped, instruction units count: 660
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.flutter.embedding.android.C0492k.g(int, boolean):io.flutter.embedding.android.D");
    }

    public final void h() {
        c();
        if (this.f6577f != null) {
            this.f6574c.getViewTreeObserver().removeOnPreDrawListener(this.f6577f);
            this.f6577f = null;
        }
        D d5 = this.f6574c;
        if (d5 != null) {
            d5.a();
            D d6 = this.f6574c;
            d6.f6510q.remove(this.f6582l);
        }
    }

    public final void i() {
        C0394c c0394c;
        if (this.f6580j) {
            c();
            this.f6572a.cleanUpFlutterEngine(this.f6573b);
            if (this.f6572a.shouldAttachEngineToActivity()) {
                if (this.f6572a.getActivity().isChangingConfigurations()) {
                    D0.k kVar = this.f6573b.f5608d;
                    if (kVar.f()) {
                        AbstractC1068a.b("FlutterEngineConnectionRegistry#detachFromActivityForConfigChanges");
                        try {
                            kVar.f450a = true;
                            Iterator it = ((HashMap) kVar.f454e).values().iterator();
                            while (it.hasNext()) {
                                ((InterfaceC0541a) it.next()).onDetachedFromActivityForConfigChanges();
                            }
                            kVar.d();
                            Trace.endSection();
                        } catch (Throwable th) {
                            try {
                                Trace.endSection();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                            throw th;
                        }
                    } else {
                        Log.e("FlutterEngineCxnRegstry", "Attempted to detach plugins from an Activity when no Activity was attached.");
                    }
                } else {
                    this.f6573b.f5608d.c();
                }
            }
            io.flutter.plugin.platform.f fVar = this.f6575d;
            if (fVar != null) {
                fVar.f6755b.f3021m = null;
                this.f6575d = null;
            }
            C0782a c0782a = this.f6576e;
            if (c0782a != null) {
                c0782a.f9552c.f8712m = null;
                c0782a.f9550a = null;
                this.f6576e = null;
            }
            if (this.f6572a.shouldDispatchAppLifecycleState() && (c0394c = this.f6573b) != null) {
                C0669c c0669c = c0394c.f5611g;
                c0669c.e(1, c0669c.f8676c);
            }
            if (this.f6572a.shouldDestroyEngineWithHost()) {
                this.f6573b.a();
                if (this.f6572a.getCachedEngineId() != null) {
                    C0398g.a().b(this.f6572a.getCachedEngineId(), null);
                }
                this.f6573b = null;
            }
            this.f6580j = false;
        }
    }

    public final void j(Intent intent) {
        c();
        C0394c c0394c = this.f6573b;
        if (c0394c == null) {
            Log.w("FlutterActivityAndFragmentDelegate", "onNewIntent() invoked before FlutterFragment was attached to an Activity.");
            return;
        }
        D0.k kVar = c0394c.f5608d;
        if (kVar.f()) {
            AbstractC1068a.b("FlutterEngineConnectionRegistry#onNewIntent");
            try {
                Iterator it = ((HashSet) ((y2.n) kVar.f456g).f10957d).iterator();
                while (it.hasNext()) {
                    ((n3.t) it.next()).onNewIntent(intent);
                }
                Trace.endSection();
            } catch (Throwable th) {
                try {
                    Trace.endSection();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } else {
            Log.e("FlutterEngineCxnRegstry", "Attempted to notify ActivityAware plugins of onNewIntent, but no Activity was attached.");
        }
        String strD = d(intent);
        if (strD == null || strD.isEmpty()) {
            return;
        }
        C0667a c0667a = this.f6573b.i;
        c0667a.getClass();
        HashMap map = new HashMap();
        map.put("location", strD);
        c0667a.f8672a.a("pushRouteInformation", map, null);
    }

    public final void k(int i, String[] strArr, int[] iArr) {
        c();
        if (this.f6573b == null) {
            Log.w("FlutterActivityAndFragmentDelegate", "onRequestPermissionResult() invoked before FlutterFragment was attached to an Activity.");
            return;
        }
        Arrays.toString(strArr);
        Arrays.toString(iArr);
        D0.k kVar = this.f6573b.f5608d;
        if (!kVar.f()) {
            Log.e("FlutterEngineCxnRegstry", "Attempted to notify ActivityAware plugins of onRequestPermissionsResult, but no Activity was attached.");
            return;
        }
        AbstractC1068a.b("FlutterEngineConnectionRegistry#onRequestPermissionsResult");
        try {
            Iterator it = ((HashSet) ((y2.n) kVar.f456g).f10955b).iterator();
            while (true) {
                boolean z4 = false;
                while (it.hasNext()) {
                    if (((n3.u) it.next()).onRequestPermissionsResult(i, strArr, iArr) || z4) {
                        z4 = true;
                    }
                }
                Trace.endSection();
                return;
            }
        } catch (Throwable th) {
            try {
                Trace.endSection();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final void l(Bundle bundle) {
        byte[] byteArray;
        c();
        if (bundle != null) {
            bundle.getBundle("plugins");
            byteArray = bundle.getByteArray("framework");
        } else {
            byteArray = null;
        }
        if (this.f6572a.shouldRestoreAndSaveState()) {
            C0676j c0676j = this.f6573b.f5614k;
            c0676j.f8717e = true;
            P2.c cVar = c0676j.f8716d;
            if (cVar != null) {
                cVar.success(C0676j.a(byteArray));
                c0676j.f8716d = null;
                c0676j.f8714b = byteArray;
            } else if (c0676j.f8718f) {
                c0676j.f8715c.a("push", C0676j.a(byteArray), new P2.c(c0676j, 1, byteArray));
            } else {
                c0676j.f8714b = byteArray;
            }
        }
        if (this.f6572a.shouldAttachEngineToActivity()) {
            D0.k kVar = this.f6573b.f5608d;
            if (!kVar.f()) {
                Log.e("FlutterEngineCxnRegstry", "Attempted to notify ActivityAware plugins of onRestoreInstanceState, but no Activity was attached.");
                return;
            }
            AbstractC1068a.b("FlutterEngineConnectionRegistry#onRestoreInstanceState");
            try {
                Iterator it = ((HashSet) ((y2.n) kVar.f456g).f10959f).iterator();
                if (!it.hasNext()) {
                    Trace.endSection();
                } else {
                    if (it.next() != null) {
                        throw new ClassCastException();
                    }
                    throw null;
                }
            } catch (Throwable th) {
                try {
                    Trace.endSection();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
    }

    public final void m(Bundle bundle) {
        c();
        if (this.f6572a.shouldRestoreAndSaveState()) {
            bundle.putByteArray("framework", this.f6573b.f5614k.f8714b);
        }
        if (this.f6572a.shouldAttachEngineToActivity()) {
            Bundle bundle2 = new Bundle();
            D0.k kVar = this.f6573b.f5608d;
            if (kVar.f()) {
                AbstractC1068a.b("FlutterEngineConnectionRegistry#onSaveInstanceState");
                try {
                    Iterator it = ((HashSet) ((y2.n) kVar.f456g).f10959f).iterator();
                    if (it.hasNext()) {
                        if (it.next() != null) {
                            throw new ClassCastException();
                        }
                        throw null;
                    }
                    Trace.endSection();
                } catch (Throwable th) {
                    try {
                        Trace.endSection();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } else {
                Log.e("FlutterEngineCxnRegstry", "Attempted to notify ActivityAware plugins of onSaveInstanceState, but no Activity was attached.");
            }
            bundle.putBundle("plugins", bundle2);
        }
        if (this.f6572a.getCachedEngineId() == null || this.f6572a.shouldDestroyEngineWithHost()) {
            return;
        }
        bundle.putBoolean("enableOnBackInvokedCallbackState", this.f6572a.getBackCallbackState());
    }

    public final void n() {
        c();
        if (this.f6572a.getCachedEngineId() == null && !this.f6573b.f5607c.f5752q) {
            String initialRoute = this.f6572a.getInitialRoute();
            if (initialRoute == null && (initialRoute = d(this.f6572a.getActivity().getIntent())) == null) {
                initialRoute = "/";
            }
            String dartEntrypointLibraryUri = this.f6572a.getDartEntrypointLibraryUri();
            this.f6572a.getDartEntrypointFunctionName();
            this.f6573b.i.f8672a.a("setInitialRoute", initialRoute, null);
            String appBundlePath = this.f6572a.getAppBundlePath();
            if (appBundlePath == null || appBundlePath.isEmpty()) {
                appBundlePath = ((h3.f) Z1.m.z().f3024m).f6324d.f6308b;
            }
            this.f6573b.f5607c.b(dartEntrypointLibraryUri == null ? new C0433a(appBundlePath, this.f6572a.getDartEntrypointFunctionName()) : new C0433a(appBundlePath, dartEntrypointLibraryUri, this.f6572a.getDartEntrypointFunctionName()), this.f6572a.getDartEntrypointArgs());
        }
        Integer num = this.f6581k;
        if (num != null) {
            this.f6574c.setVisibility(num.intValue());
        }
    }

    public final void o() {
        C0394c c0394c;
        c();
        if (this.f6572a.shouldDispatchAppLifecycleState() && (c0394c = this.f6573b) != null) {
            C0669c c0669c = c0394c.f5611g;
            c0669c.e(5, c0669c.f8676c);
        }
        this.f6581k = Integer.valueOf(this.f6574c.getVisibility());
        this.f6574c.setVisibility(8);
        C0394c c0394c2 = this.f6573b;
        if (c0394c2 != null) {
            c0394c2.f5606b.f(40);
        }
    }

    public final void p(int i) {
        c();
        C0394c c0394c = this.f6573b;
        if (c0394c != null) {
            if (this.i && i >= 10) {
                FlutterJNI flutterJNI = c0394c.f5607c.f5747l;
                if (flutterJNI.isAttached()) {
                    flutterJNI.notifyLowMemoryWarning();
                }
                C0668b c0668b = this.f6573b.f5620q;
                c0668b.getClass();
                HashMap map = new HashMap(1);
                map.put("type", "memoryPressure");
                c0668b.f8673a.D(map, null);
            }
            this.f6573b.f5606b.f(i);
            io.flutter.plugin.platform.p pVar = this.f6573b.f5622s;
            if (i < 40) {
                pVar.getClass();
                return;
            }
            Iterator it = pVar.f6802j.values().iterator();
            while (it.hasNext()) {
                ((io.flutter.plugin.platform.A) it.next()).f6740h.setSurface(null);
            }
        }
    }

    public final void q() {
        c();
        C0394c c0394c = this.f6573b;
        if (c0394c == null) {
            Log.w("FlutterActivityAndFragmentDelegate", "onUserLeaveHint() invoked before FlutterFragment was attached to an Activity.");
            return;
        }
        D0.k kVar = c0394c.f5608d;
        if (!kVar.f()) {
            Log.e("FlutterEngineCxnRegstry", "Attempted to notify ActivityAware plugins of onUserLeaveHint, but no Activity was attached.");
            return;
        }
        AbstractC1068a.b("FlutterEngineConnectionRegistry#onUserLeaveHint");
        try {
            Iterator it = ((HashSet) ((y2.n) kVar.f456g).f10958e).iterator();
            if (!it.hasNext()) {
                Trace.endSection();
            } else {
                if (it.next() != null) {
                    throw new ClassCastException();
                }
                throw null;
            }
        } catch (Throwable th) {
            try {
                Trace.endSection();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final void r(boolean z4) {
        C0394c c0394c;
        c();
        if (!this.f6572a.shouldDispatchAppLifecycleState() || (c0394c = this.f6573b) == null) {
            return;
        }
        C0669c c0669c = c0394c.f5611g;
        if (z4) {
            c0669c.e(c0669c.f8674a, true);
        } else {
            c0669c.e(c0669c.f8674a, false);
        }
    }
}

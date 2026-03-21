package D0;

import android.app.Activity;
import android.content.Context;
import android.os.Trace;
import android.util.Log;
import android.view.Surface;
import androidx.lifecycle.AbstractC0274p;
import androidx.lifecycle.E;
import d0.InterfaceC0348a;
import e3.C0394c;
import io.flutter.embedding.android.C0492k;
import j0.C0522b;
import j3.C0524a;
import java.util.HashMap;
import java.util.Iterator;
import k3.InterfaceC0541a;
import m2.C0640G;
import m2.I;
import m2.b0;
import n3.C0707q;
import z3.AbstractC1068a;

/* JADX INFO: loaded from: classes.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f450a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f451b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f452c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f453d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Object f454e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Object f455f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Object f456g;

    public k(Context context, C0394c c0394c, h3.f fVar) {
        this.f451b = new HashMap();
        this.f454e = new HashMap();
        this.f450a = false;
        new HashMap();
        new HashMap();
        new HashMap();
        this.f452c = c0394c;
        this.f453d = new C0524a(context, c0394c, c0394c.f5607c, c0394c.f5606b, c0394c.f5622s.f6794a, new E(fVar, 1));
    }

    public void a(j3.b bVar) {
        AbstractC1068a.b("FlutterEngineConnectionRegistry#add ".concat(bVar.getClass().getSimpleName()));
        try {
            Class<?> cls = bVar.getClass();
            HashMap map = (HashMap) this.f451b;
            if (map.containsKey(cls)) {
                Log.w("FlutterEngineCxnRegstry", "Attempted to register plugin (" + bVar + ") but it was already registered with this FlutterEngine (" + ((C0394c) this.f452c) + ").");
                Trace.endSection();
                return;
            }
            bVar.toString();
            map.put(bVar.getClass(), bVar);
            bVar.onAttachedToEngine((C0524a) this.f453d);
            if (bVar instanceof InterfaceC0541a) {
                InterfaceC0541a interfaceC0541a = (InterfaceC0541a) bVar;
                ((HashMap) this.f454e).put(bVar.getClass(), interfaceC0541a);
                if (f()) {
                    interfaceC0541a.onAttachedToActivity((y2.n) this.f456g);
                }
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
    }

    public void b(Activity activity, AbstractC0274p abstractC0274p) {
        this.f456g = new y2.n(activity, abstractC0274p);
        boolean booleanExtra = activity.getIntent() != null ? activity.getIntent().getBooleanExtra("enable-software-rendering", false) : false;
        C0394c c0394c = (C0394c) this.f452c;
        io.flutter.plugin.platform.p pVar = c0394c.f5622s;
        pVar.f6814v = booleanExtra;
        if (pVar.f6796c != null) {
            throw new AssertionError("A PlatformViewsController can only be attached to a single output target.\nattach was called while the PlatformViewsController was already attached.");
        }
        pVar.f6796c = activity;
        pVar.f6799f = c0394c.f5606b;
        f3.b bVar = c0394c.f5607c;
        Z1.e eVar = new Z1.e(bVar, 16);
        pVar.f6801h = eVar;
        eVar.f3002n = pVar.f6815w;
        io.flutter.plugin.platform.o oVar = c0394c.f5623t;
        if (oVar.f6780c != null) {
            throw new AssertionError("A PlatformViewsController can only be attached to a single output target.\nattach was called while the PlatformViewsController was already attached.");
        }
        oVar.f6780c = activity;
        Z1.c cVar = new Z1.c();
        E e5 = new E(cVar, 29);
        C0707q c0707q = new C0707q(bVar, "flutter/platform_views_2", n3.x.f8947a, null);
        cVar.f2996l = c0707q;
        c0707q.b(e5);
        oVar.f6784g = cVar;
        cVar.f2997m = oVar.f6792p;
        for (InterfaceC0541a interfaceC0541a : ((HashMap) this.f454e).values()) {
            if (this.f450a) {
                interfaceC0541a.onReattachedToActivityForConfigChanges((y2.n) this.f456g);
            } else {
                interfaceC0541a.onAttachedToActivity((y2.n) this.f456g);
            }
        }
        this.f450a = false;
    }

    public void c() {
        if (!f()) {
            Log.e("FlutterEngineCxnRegstry", "Attempted to detach plugins from an Activity when no Activity was attached.");
            return;
        }
        AbstractC1068a.b("FlutterEngineConnectionRegistry#detachFromActivity");
        try {
            Iterator it = ((HashMap) this.f454e).values().iterator();
            while (it.hasNext()) {
                ((InterfaceC0541a) it.next()).onDetachedFromActivity();
            }
            d();
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

    public void d() {
        C0394c c0394c = (C0394c) this.f452c;
        io.flutter.plugin.platform.p pVar = c0394c.f5622s;
        Z1.e eVar = pVar.f6801h;
        if (eVar != null) {
            eVar.f3002n = null;
        }
        pVar.c();
        pVar.f6801h = null;
        pVar.f6796c = null;
        pVar.f6799f = null;
        io.flutter.plugin.platform.o oVar = c0394c.f5623t;
        Z1.c cVar = oVar.f6784g;
        if (cVar != null) {
            cVar.f2997m = null;
        }
        Surface surface = oVar.f6790n;
        if (surface != null) {
            surface.release();
            oVar.f6790n = null;
            oVar.f6791o = null;
        }
        oVar.f6784g = null;
        oVar.f6780c = null;
        this.f455f = null;
        this.f456g = null;
    }

    public void e() {
        if (f()) {
            c();
        }
    }

    public boolean f() {
        return ((C0492k) this.f455f) != null;
    }

    public k(Context context, s sVar) {
        this.f451b = context.getApplicationContext();
        this.f452c = sVar;
        C0640G c0640g = I.f8549m;
        this.f455f = b0.f8583p;
        this.f456g = InterfaceC0348a.f5270a;
    }

    public k(Context context) {
        this.f451b = context;
        this.f452c = C0522b.f7250c;
        this.f454e = j0.w.f7410a;
        this.f455f = j0.w.f7411b;
    }
}

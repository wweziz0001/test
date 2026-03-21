package e3;

import Z1.m;
import a0.C0200z;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.AssetManager;
import android.os.Trace;
import android.util.SparseArray;
import androidx.lifecycle.E;
import io.flutter.embedding.engine.FlutterJNI;
import io.flutter.embedding.engine.renderer.l;
import io.flutter.plugin.platform.o;
import io.flutter.plugin.platform.p;
import j3.C0524a;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import k3.InterfaceC0541a;
import m3.C0667a;
import m3.C0668b;
import m3.C0669c;
import m3.C0675i;
import m3.C0676j;
import m3.C0678l;
import n3.C0702l;
import n3.C0707q;
import n3.x;
import o3.C0721a;
import q3.C0745a;
import z3.AbstractC1068a;
import z3.InterfaceC1069b;

/* JADX INFO: renamed from: e3.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0394c implements InterfaceC1069b {

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static long f5604x = 1;
    public static final HashMap y = new HashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FlutterJNI f5605a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l f5606b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final f3.b f5607c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final D0.k f5608d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final C0721a f5609e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final m f5610f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final C0669c f5611g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final E f5612h;
    public final C0667a i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final C0667a f5613j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final C0676j f5614k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Z1.l f5615l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final C0675i f5616m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final C0675i f5617n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final C0678l f5618o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final C0675i f5619p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final C0668b f5620q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final Z1.e f5621r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final p f5622s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final o f5623t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final HashSet f5624u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final long f5625v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final C0392a f5626w;

    public C0394c(Context context) {
        this(context, null, new p(), true, false);
    }

    public final void a() {
        Iterator it = this.f5624u.iterator();
        while (it.hasNext()) {
            ((InterfaceC0393b) it.next()).onEngineWillDestroy();
        }
        D0.k kVar = this.f5608d;
        kVar.e();
        HashMap map = (HashMap) kVar.f451b;
        for (Class cls : new HashSet(map.keySet())) {
            j3.b bVar = (j3.b) map.get(cls);
            if (bVar != null) {
                AbstractC1068a.b("FlutterEngineConnectionRegistry#remove ".concat(cls.getSimpleName()));
                try {
                    if (bVar instanceof InterfaceC0541a) {
                        if (kVar.f()) {
                            ((InterfaceC0541a) bVar).onDetachedFromActivity();
                        }
                        ((HashMap) kVar.f454e).remove(cls);
                    }
                    bVar.onDetachedFromEngine((C0524a) kVar.f453d);
                    map.remove(cls);
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
        }
        map.clear();
        while (true) {
            p pVar = this.f5622s;
            SparseArray sparseArray = pVar.f6804l;
            if (sparseArray.size() <= 0) {
                break;
            }
            pVar.f6815w.e(sparseArray.keyAt(0));
        }
        while (true) {
            o oVar = this.f5623t;
            SparseArray sparseArray2 = oVar.i;
            if (sparseArray2.size() <= 0) {
                this.f5607c.f5747l.setPlatformMessageHandler(null);
                FlutterJNI flutterJNI = this.f5605a;
                flutterJNI.removeEngineLifecycleListener(this.f5626w);
                flutterJNI.setDeferredComponentManager(null);
                flutterJNI.detachFromNativeAndReleaseResources();
                m.z().getClass();
                y.remove(Long.valueOf(this.f5625v));
                return;
            }
            oVar.f6792p.e(sparseArray2.keyAt(0));
        }
    }

    public C0394c(Context context, FlutterJNI flutterJNI, p pVar, boolean z4, boolean z5) {
        AssetManager assets;
        this.f5624u = new HashSet();
        this.f5626w = new C0392a(this);
        long j5 = f5604x;
        f5604x = 1 + j5;
        this.f5625v = j5;
        y.put(Long.valueOf(j5), this);
        try {
            assets = context.createPackageContext(context.getPackageName(), 0).getAssets();
        } catch (PackageManager.NameNotFoundException unused) {
            assets = context.getAssets();
        }
        m mVarZ = m.z();
        if (flutterJNI == null) {
            ((C0200z) mVarZ.f3025n).getClass();
            flutterJNI = new FlutterJNI();
        }
        this.f5605a = flutterJNI;
        f3.b bVar = new f3.b(flutterJNI, assets, this.f5625v);
        this.f5607c = bVar;
        flutterJNI.setPlatformMessageHandler(bVar.f5750o);
        m.z().getClass();
        this.f5610f = new m(bVar, flutterJNI);
        new C0200z(bVar);
        this.f5611g = new C0669c(bVar);
        Z1.e eVar = new Z1.e(bVar, 15);
        this.f5612h = new E(bVar);
        this.i = new C0667a(bVar, 1);
        this.f5613j = new C0667a(bVar, 0);
        Z1.l lVar = new Z1.l();
        E e5 = new E(lVar, 27);
        C0707q c0707q = new C0707q(bVar, "flutter/platform", C0702l.f8937a, null);
        lVar.f3020l = c0707q;
        c0707q.b(e5);
        this.f5615l = lVar;
        PackageManager packageManager = context.getPackageManager();
        Z1.l lVar2 = new Z1.l();
        C0675i c0675i = new C0675i(lVar2, 0);
        lVar2.f3020l = packageManager;
        new C0707q(bVar, "flutter/processtext", x.f8947a, null).b(c0675i);
        this.f5614k = new C0676j(bVar, z5);
        this.f5616m = new C0675i(bVar, 3);
        this.f5617n = new C0675i(bVar, 5);
        this.f5618o = new C0678l(bVar);
        this.f5619p = new C0675i(bVar, 7);
        this.f5620q = new C0668b(bVar);
        this.f5621r = new Z1.e(bVar, 17);
        C0721a c0721a = new C0721a(context, eVar);
        this.f5609e = c0721a;
        h3.f fVar = (h3.f) mVarZ.f3024m;
        if (!flutterJNI.isAttached()) {
            fVar.c(context.getApplicationContext());
            fVar.a(context, null);
        }
        o oVar = new o();
        oVar.f6778a = pVar.f6794a;
        oVar.f6782e = flutterJNI;
        pVar.f6798e = flutterJNI;
        flutterJNI.addEngineLifecycleListener(this.f5626w);
        flutterJNI.setPlatformViewsController(pVar);
        flutterJNI.setPlatformViewsController2(oVar);
        flutterJNI.setLocalizationPlugin(c0721a);
        mVarZ.getClass();
        flutterJNI.setDeferredComponentManager(null);
        if (!flutterJNI.isAttached()) {
            flutterJNI.attachToNative();
            if (!flutterJNI.isAttached()) {
                throw new RuntimeException("FlutterEngine failed to attach to its native Object reference.");
            }
        }
        this.f5606b = new l(flutterJNI);
        this.f5622s = pVar;
        this.f5623t = oVar;
        D0.k kVar = new D0.k(context.getApplicationContext(), this, fVar);
        this.f5608d = kVar;
        c0721a.b(context.getResources().getConfiguration());
        if (z4 && fVar.f6324d.f6311e) {
            Z1.f.H(this);
        }
        i4.a.e(context, this);
        kVar.a(new C0745a(lVar2));
    }
}

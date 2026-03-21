package io.flutter.plugin.platform;

import android.app.Activity;
import android.util.SparseArray;
import android.view.Surface;
import android.view.SurfaceControl;
import android.view.View;
import io.flutter.embedding.android.C0482a;
import io.flutter.embedding.android.D;
import io.flutter.embedding.engine.FlutterJNI;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public m f6778a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public C0482a f6779b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Activity f6780c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public D f6781d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public io.flutter.plugin.editing.i f6783f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Z1.c f6784g;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Z1.c f6787k;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public FlutterJNI f6782e = null;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public Surface f6790n = null;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public SurfaceControl f6791o = null;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final m f6792p = new m(this, 3);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final C0504a f6785h = new C0504a();
    public final SparseArray i = new SparseArray();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final SparseArray f6786j = new SparseArray();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final ArrayList f6788l = new ArrayList();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final ArrayList f6789m = new ArrayList();

    public o() {
        if (Z1.c.f2994n == null) {
            Z1.c.f2994n = new Z1.c(11);
        }
        this.f6787k = Z1.c.f2994n;
    }

    public final void a() {
        this.f6785h.f6743a = null;
    }

    public final View b(int i) {
        g gVar = (g) this.i.get(i);
        if (gVar == null) {
            return null;
        }
        return gVar.getView();
    }
}

package io.flutter.plugin.platform;

import android.app.Activity;
import android.content.MutableContextWrapper;
import android.hardware.display.DisplayManager;
import android.os.Build;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.SurfaceView;
import android.view.View;
import b3.AbstractC0307a;
import e3.C0394c;
import io.flutter.embedding.android.C0482a;
import io.flutter.embedding.android.C0503w;
import io.flutter.embedding.android.D;
import io.flutter.embedding.android.Q;
import io.flutter.embedding.engine.FlutterJNI;
import io.flutter.view.TextureRegistry$SurfaceProducer;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import m.B0;
import m3.C0672f;
import m3.C0674h;
import w3.C0949b;

/* JADX INFO: loaded from: classes.dex */
public final class p {

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final Class[] f6793x = {SurfaceView.class};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public C0482a f6795b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Activity f6796c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public D f6797d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public io.flutter.embedding.engine.renderer.l f6799f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public io.flutter.plugin.editing.i f6800g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Z1.e f6801h;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final Z1.c f6813u;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public FlutterJNI f6798e = null;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f6808p = 0;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f6809q = false;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f6810r = true;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f6814v = false;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final m f6815w = new m(this, 0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m f6794a = new m(2);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final HashMap f6802j = new HashMap();
    public final C0504a i = new C0504a();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final HashMap f6803k = new HashMap();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final SparseArray f6806n = new SparseArray();

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final HashSet f6811s = new HashSet();

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final HashSet f6812t = new HashSet();

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final SparseArray f6807o = new SparseArray();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final SparseArray f6804l = new SparseArray();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final SparseArray f6805m = new SparseArray();

    public p() {
        if (Z1.c.f2994n == null) {
            Z1.c.f2994n = new Z1.c(11);
        }
        this.f6813u = Z1.c.f2994n;
    }

    public static void a(p pVar, C0672f c0672f) {
        pVar.getClass();
        int i = c0672f.f8691g;
        if (i != 0 && i != 1) {
            throw new IllegalStateException(AbstractC0307a.l(B0.j(i, "Trying to create a view with unknown direction value: ", "(view id: "), c0672f.f8685a, ")"));
        }
    }

    public static void e(int i) {
        int i5 = Build.VERSION.SDK_INT;
        if (i5 < i) {
            throw new IllegalStateException(AbstractC0307a.g(i5, i, "Trying to use platform views with API ", ", required API level is: "));
        }
    }

    public static h j(io.flutter.embedding.engine.renderer.l lVar) {
        int i = Build.VERSION.SDK_INT;
        if (i < 29) {
            return i >= 29 ? new c(lVar.c()) : new w(lVar.e());
        }
        TextureRegistry$SurfaceProducer textureRegistry$SurfaceProducerD = lVar.d(i <= 34 ? 2 : 1);
        m mVar = new m(4);
        mVar.f6777b = textureRegistry$SurfaceProducerD;
        return mVar;
    }

    public final g b(C0672f c0672f, boolean z4) {
        HashMap map = (HashMap) this.f6794a.f6777b;
        String str = c0672f.f8686b;
        C0949b c0949b = (C0949b) map.get(str);
        if (c0949b == null) {
            throw new IllegalStateException("Trying to create a platform view of unregistered type: " + str);
        }
        ByteBuffer byteBuffer = c0672f.i;
        g gVarA = c0949b.a(z4 ? new MutableContextWrapper(this.f6796c) : this.f6796c, byteBuffer != null ? c0949b.f10507a.a(byteBuffer) : null);
        View view = gVarA.getView();
        if (view == null) {
            throw new IllegalStateException("PlatformView#getView() returned null, but an Android view reference was expected.");
        }
        view.setLayoutDirection(c0672f.f8691g);
        this.f6804l.put(c0672f.f8685a, gVarA);
        return gVarA;
    }

    public final void c() {
        int i = 0;
        while (true) {
            SparseArray sparseArray = this.f6806n;
            if (i >= sparseArray.size()) {
                return;
            }
            d dVar = (d) sparseArray.valueAt(i);
            dVar.c();
            dVar.f6611l.close();
            i++;
        }
    }

    public final void d() {
        this.i.f6743a = null;
    }

    public final void f(boolean z4) {
        int i = 0;
        while (true) {
            SparseArray sparseArray = this.f6806n;
            if (i >= sparseArray.size()) {
                break;
            }
            int iKeyAt = sparseArray.keyAt(i);
            d dVar = (d) sparseArray.valueAt(i);
            if (this.f6811s.contains(Integer.valueOf(iKeyAt))) {
                C0394c c0394c = this.f6797d.f6512s;
                if (c0394c != null) {
                    dVar.b(c0394c.f5606b);
                }
                z4 &= dVar.e();
            } else {
                if (!this.f6809q) {
                    dVar.c();
                }
                dVar.setVisibility(8);
                this.f6797d.removeView(dVar);
            }
            i++;
        }
        int i5 = 0;
        while (true) {
            SparseArray sparseArray2 = this.f6805m;
            if (i5 >= sparseArray2.size()) {
                return;
            }
            int iKeyAt2 = sparseArray2.keyAt(i5);
            View view = (View) sparseArray2.get(iKeyAt2);
            if (!this.f6812t.contains(Integer.valueOf(iKeyAt2)) || (!z4 && this.f6810r)) {
                view.setVisibility(8);
            } else {
                view.setVisibility(0);
            }
            i5++;
        }
    }

    public final float g() {
        return this.f6796c.getResources().getDisplayMetrics().density;
    }

    public final View h(int i) {
        if (n(i)) {
            return ((A) this.f6802j.get(Integer.valueOf(i))).a();
        }
        g gVar = (g) this.f6804l.get(i);
        if (gVar == null) {
            return null;
        }
        return gVar.getView();
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [android.view.View, io.flutter.embedding.engine.renderer.n] */
    public final void i() {
        if (!this.f6810r || this.f6809q) {
            return;
        }
        D d5 = this.f6797d;
        d5.f6508o.a();
        C0503w c0503w = d5.f6507n;
        if (c0503w == null) {
            C0503w c0503w2 = new C0503w(d5.getContext(), d5.getWidth(), d5.getHeight(), 1);
            d5.f6507n = c0503w2;
            d5.addView(c0503w2);
        } else {
            c0503w.g(d5.getWidth(), d5.getHeight());
        }
        d5.f6509p = d5.f6508o;
        C0503w c0503w3 = d5.f6507n;
        d5.f6508o = c0503w3;
        C0394c c0394c = d5.f6512s;
        if (c0394c != null) {
            c0503w3.b(c0394c.f5606b);
        }
        this.f6809q = true;
    }

    public final void k() {
        for (A a5 : this.f6802j.values()) {
            int width = a5.f6738f.getWidth();
            h hVar = a5.f6738f;
            int height = hVar.getHeight();
            boolean zIsFocused = a5.a().isFocused();
            u uVarDetachState = a5.f6733a.detachState();
            a5.f6740h.setSurface(null);
            a5.f6740h.release();
            a5.f6740h = ((DisplayManager) a5.f6734b.getSystemService("display")).createVirtualDisplay("flutter-vd#" + a5.f6737e, width, height, a5.f6736d, hVar.getSurface(), 0, A.i, null);
            SingleViewPresentation singleViewPresentation = new SingleViewPresentation(a5.f6734b, a5.f6740h.getDisplay(), a5.f6735c, uVarDetachState, a5.f6739g, zIsFocused);
            singleViewPresentation.show();
            a5.f6733a.cancel();
            a5.f6733a = singleViewPresentation;
        }
    }

    public final MotionEvent l(float f2, C0674h c0674h, boolean z4) {
        MotionEvent motionEventK = this.f6813u.k(new Q(c0674h.f8710p));
        List<List> list = (List) c0674h.f8702g;
        ArrayList arrayList = new ArrayList();
        for (List list2 : list) {
            MotionEvent.PointerCoords pointerCoords = new MotionEvent.PointerCoords();
            pointerCoords.orientation = (float) ((Double) list2.get(0)).doubleValue();
            pointerCoords.pressure = (float) ((Double) list2.get(1)).doubleValue();
            pointerCoords.size = (float) ((Double) list2.get(2)).doubleValue();
            double d5 = f2;
            pointerCoords.toolMajor = (float) (((Double) list2.get(3)).doubleValue() * d5);
            pointerCoords.toolMinor = (float) (((Double) list2.get(4)).doubleValue() * d5);
            pointerCoords.touchMajor = (float) (((Double) list2.get(5)).doubleValue() * d5);
            pointerCoords.touchMinor = (float) (((Double) list2.get(6)).doubleValue() * d5);
            pointerCoords.x = (float) (((Double) list2.get(7)).doubleValue() * d5);
            pointerCoords.y = (float) (((Double) list2.get(8)).doubleValue() * d5);
            arrayList.add(pointerCoords);
        }
        int i = c0674h.f8700e;
        MotionEvent.PointerCoords[] pointerCoordsArr = (MotionEvent.PointerCoords[]) arrayList.toArray(new MotionEvent.PointerCoords[i]);
        if (!z4 && motionEventK != null) {
            if (pointerCoordsArr.length >= 1) {
                motionEventK.offsetLocation(pointerCoordsArr[0].x - motionEventK.getX(), pointerCoordsArr[0].y - motionEventK.getY());
            }
            return motionEventK;
        }
        List<List> list3 = (List) c0674h.f8701f;
        ArrayList arrayList2 = new ArrayList();
        for (List list4 : list3) {
            MotionEvent.PointerProperties pointerProperties = new MotionEvent.PointerProperties();
            pointerProperties.id = ((Integer) list4.get(0)).intValue();
            pointerProperties.toolType = ((Integer) list4.get(1)).intValue();
            arrayList2.add(pointerProperties);
        }
        return MotionEvent.obtain(c0674h.f8697b.longValue(), c0674h.f8698c.longValue(), c0674h.f8699d, c0674h.f8700e, (MotionEvent.PointerProperties[]) arrayList2.toArray(new MotionEvent.PointerProperties[i]), pointerCoordsArr, c0674h.f8703h, c0674h.i, c0674h.f8704j, c0674h.f8705k, c0674h.f8706l, c0674h.f8707m, c0674h.f8708n, c0674h.f8709o);
    }

    public final int m(double d5) {
        return (int) Math.round(d5 * ((double) g()));
    }

    public final boolean n(int i) {
        return this.f6802j.containsKey(Integer.valueOf(i));
    }
}

package io.flutter.plugin.platform;

import android.app.Activity;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.res.AssetFileDescriptor;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.hardware.display.DisplayManager;
import android.hardware.display.VirtualDisplay;
import android.net.Uri;
import android.os.Build;
import android.util.DisplayMetrics;
import android.util.Log;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.Surface;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import b3.AbstractC0307a;
import i3.ViewTreeObserverOnGlobalFocusChangeListenerC0481a;
import io.flutter.embedding.android.Q;
import io.flutter.view.TextureRegistry$SurfaceProducer;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import m3.C0672f;
import m3.C0673g;
import m3.C0674h;
import m3.EnumC0670d;
import m3.EnumC0671e;
import n3.C0707q;
import y3.C1051v;

/* JADX INFO: loaded from: classes.dex */
public final class m implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6776a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f6777b;

    public /* synthetic */ m(Object obj, int i) {
        this.f6776a = i;
        this.f6777b = obj;
    }

    @Override // io.flutter.plugin.platform.h
    public long a() {
        return ((TextureRegistry$SurfaceProducer) this.f6777b).id();
    }

    @Override // io.flutter.plugin.platform.h
    public void b(int i, int i5) {
        ((TextureRegistry$SurfaceProducer) this.f6777b).setSize(i, i5);
    }

    public void c(int i) {
        View view;
        switch (this.f6776a) {
            case 0:
                p pVar = (p) this.f6777b;
                if (pVar.n(i)) {
                    view = ((A) pVar.f6802j.get(Integer.valueOf(i))).a();
                } else {
                    g gVar = (g) pVar.f6804l.get(i);
                    if (gVar == null) {
                        Log.e("PlatformViewsController", "Clearing focus on an unknown view with id: " + i);
                    } else {
                        view = gVar.getView();
                    }
                }
                if (view != null) {
                    view.clearFocus();
                } else {
                    Log.e("PlatformViewsController", "Clearing focus on a null view with id: " + i);
                }
                break;
            default:
                g gVar2 = (g) ((o) this.f6777b).i.get(i);
                if (gVar2 != null) {
                    View view2 = gVar2.getView();
                    if (view2 != null) {
                        view2.clearFocus();
                    } else {
                        Log.e("PlatformViewsController2", "Clearing focus on a null view with id: " + i);
                    }
                } else {
                    Log.e("PlatformViewsController2", "Clearing focus on an unknown view with id: " + i);
                }
                break;
        }
    }

    /* JADX WARN: Type inference failed for: r12v5, types: [io.flutter.plugin.platform.k] */
    public long d(final C0672f c0672f) {
        i iVar;
        long j5;
        final int i = 0;
        final int i5 = 1;
        final p pVar = (p) this.f6777b;
        p.a(pVar, c0672f);
        SparseArray sparseArray = pVar.f6807o;
        int i6 = c0672f.f8685a;
        if (sparseArray.get(i6) != null) {
            throw new IllegalStateException(AbstractC0307a.i("Trying to create an already created platform view, view id: ", i6));
        }
        if (pVar.f6799f == null) {
            throw new IllegalStateException(AbstractC0307a.i("Texture registry is null. This means that platform views controller was detached, view id: ", i6));
        }
        if (pVar.f6797d == null) {
            throw new IllegalStateException(AbstractC0307a.i("Flutter view is null. This means the platform views controller doesn't have an attached view, view id: ", i6));
        }
        g gVarB = pVar.b(c0672f, true);
        View view = gVarB.getView();
        if (view.getParent() != null) {
            throw new IllegalStateException("The Android view returned from PlatformView#getView() was already added to a parent view.");
        }
        boolean zA0 = i4.a.a0(view, new C1051v(p.f6793x, 29));
        double d5 = c0672f.f8688d;
        double d6 = c0672f.f8687c;
        if (zA0) {
            if (c0672f.f8692h == 2) {
                p.e(19);
                if (pVar.f6798e.IsSurfaceControlEnabled()) {
                    throw new IllegalStateException("Trying to create a Hybrid Composition view with HC++ enabled.");
                }
                return -2L;
            }
            if (!pVar.f6814v) {
                p.e(20);
                h hVarJ = p.j(pVar.f6799f);
                int iM = pVar.m(d6);
                int iM2 = pVar.m(d5);
                Activity activity = pVar.f6796c;
                ?? r12 = new View.OnFocusChangeListener() { // from class: io.flutter.plugin.platform.k
                    @Override // android.view.View.OnFocusChangeListener
                    public final void onFocusChange(View view2, boolean z4) {
                        switch (i5) {
                            case 0:
                                C0672f c0672f2 = c0672f;
                                p pVar2 = pVar;
                                int i7 = c0672f2.f8685a;
                                if (!z4) {
                                    io.flutter.plugin.editing.i iVar2 = pVar2.f6800g;
                                    if (iVar2 != null) {
                                        iVar2.b(i7);
                                    }
                                    break;
                                } else {
                                    C0707q c0707q = (C0707q) pVar2.f6801h.f3001m;
                                    if (c0707q != null) {
                                        c0707q.a("viewFocused", Integer.valueOf(i7), null);
                                        break;
                                    }
                                }
                                break;
                            default:
                                p pVar3 = pVar;
                                if (!z4) {
                                    pVar3.getClass();
                                    break;
                                } else {
                                    Z1.e eVar = pVar3.f6801h;
                                    C0672f c0672f3 = c0672f;
                                    C0707q c0707q2 = (C0707q) eVar.f3001m;
                                    if (c0707q2 != null) {
                                        c0707q2.a("viewFocused", Integer.valueOf(c0672f3.f8685a), null);
                                        break;
                                    }
                                }
                                break;
                        }
                    }
                };
                x xVar = A.i;
                A a5 = null;
                if (iM != 0 && iM2 != 0) {
                    DisplayManager displayManager = (DisplayManager) activity.getSystemService("display");
                    DisplayMetrics displayMetrics = activity.getResources().getDisplayMetrics();
                    hVarJ.b(iM, iM2);
                    StringBuilder sb = new StringBuilder("flutter-vd#");
                    int i7 = c0672f.f8685a;
                    sb.append(i7);
                    VirtualDisplay virtualDisplayCreateVirtualDisplay = displayManager.createVirtualDisplay(sb.toString(), iM, iM2, displayMetrics.densityDpi, hVarJ.getSurface(), 0, A.i, null);
                    if (virtualDisplayCreateVirtualDisplay != null) {
                        a5 = new A(activity, pVar.i, virtualDisplayCreateVirtualDisplay, gVarB, hVarJ, r12, i7);
                    }
                }
                if (a5 != null) {
                    pVar.f6802j.put(Integer.valueOf(i6), a5);
                    View view2 = gVarB.getView();
                    pVar.f6803k.put(view2.getContext(), view2);
                    return hVarJ.a();
                }
                throw new IllegalStateException("Failed creating virtual display for a " + c0672f.f8686b + " with id: " + i6);
            }
        }
        p.e(23);
        int iM3 = pVar.m(d6);
        int iM4 = pVar.m(d5);
        if (pVar.f6814v) {
            iVar = new i(pVar.f6796c);
            j5 = -1;
        } else {
            h hVarJ2 = p.j(pVar.f6799f);
            i iVar2 = new i(pVar.f6796c);
            iVar2.f6764q = hVarJ2;
            Surface surface = hVarJ2.getSurface();
            if (surface != null) {
                Canvas canvasLockHardwareCanvas = surface.lockHardwareCanvas();
                try {
                    canvasLockHardwareCanvas.drawColor(0, PorterDuff.Mode.CLEAR);
                } finally {
                    surface.unlockCanvasAndPost(canvasLockHardwareCanvas);
                }
            }
            long jA = hVarJ2.a();
            iVar = iVar2;
            j5 = jA;
        }
        iVar.setTouchProcessor(pVar.f6795b);
        h hVar = iVar.f6764q;
        if (hVar != null) {
            hVar.b(iM3, iM4);
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(iM3, iM4);
        int iM5 = pVar.m(c0672f.f8689e);
        int iM6 = pVar.m(c0672f.f8690f);
        layoutParams.topMargin = iM5;
        layoutParams.leftMargin = iM6;
        iVar.setLayoutParams(layoutParams);
        View view3 = gVarB.getView();
        view3.setLayoutParams(new FrameLayout.LayoutParams(iM3, iM4));
        view3.setImportantForAccessibility(4);
        iVar.addView(view3);
        iVar.setOnDescendantFocusChangeListener(new View.OnFocusChangeListener() { // from class: io.flutter.plugin.platform.k
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view22, boolean z4) {
                switch (i) {
                    case 0:
                        C0672f c0672f2 = c0672f;
                        p pVar2 = pVar;
                        int i72 = c0672f2.f8685a;
                        if (!z4) {
                            io.flutter.plugin.editing.i iVar22 = pVar2.f6800g;
                            if (iVar22 != null) {
                                iVar22.b(i72);
                            }
                            break;
                        } else {
                            C0707q c0707q = (C0707q) pVar2.f6801h.f3001m;
                            if (c0707q != null) {
                                c0707q.a("viewFocused", Integer.valueOf(i72), null);
                                break;
                            }
                        }
                        break;
                    default:
                        p pVar3 = pVar;
                        if (!z4) {
                            pVar3.getClass();
                            break;
                        } else {
                            Z1.e eVar = pVar3.f6801h;
                            C0672f c0672f3 = c0672f;
                            C0707q c0707q2 = (C0707q) eVar.f3001m;
                            if (c0707q2 != null) {
                                c0707q2.a("viewFocused", Integer.valueOf(c0672f3.f8685a), null);
                                break;
                            }
                        }
                        break;
                }
            }
        });
        pVar.f6797d.addView(iVar);
        sparseArray.append(i6, iVar);
        return j5;
    }

    public void e(int i) {
        ViewTreeObserverOnGlobalFocusChangeListenerC0481a viewTreeObserverOnGlobalFocusChangeListenerC0481a;
        switch (this.f6776a) {
            case 0:
                p pVar = (p) this.f6777b;
                g gVar = (g) pVar.f6804l.get(i);
                if (gVar != null) {
                    if (gVar.getView() != null) {
                        View view = gVar.getView();
                        ViewGroup viewGroup = (ViewGroup) view.getParent();
                        if (viewGroup != null) {
                            viewGroup.removeView(view);
                        }
                    }
                    pVar.f6804l.remove(i);
                    try {
                        gVar.b();
                    } catch (RuntimeException e5) {
                        Log.e("PlatformViewsController", "Disposing platform view threw an exception", e5);
                    }
                    if (!pVar.n(i)) {
                        SparseArray sparseArray = pVar.f6807o;
                        i iVar = (i) sparseArray.get(i);
                        if (iVar == null) {
                            SparseArray sparseArray2 = pVar.f6805m;
                            i3.b bVar = (i3.b) sparseArray2.get(i);
                            if (bVar != null) {
                                bVar.removeAllViews();
                                bVar.a();
                                ViewGroup viewGroup2 = (ViewGroup) bVar.getParent();
                                if (viewGroup2 != null) {
                                    viewGroup2.removeView(bVar);
                                }
                                sparseArray2.remove(i);
                            }
                        } else {
                            iVar.removeAllViews();
                            h hVar = iVar.f6764q;
                            if (hVar != null) {
                                hVar.release();
                                iVar.f6764q = null;
                            }
                            ViewTreeObserver viewTreeObserver = iVar.getViewTreeObserver();
                            if (viewTreeObserver.isAlive() && (viewTreeObserverOnGlobalFocusChangeListenerC0481a = iVar.f6765r) != null) {
                                iVar.f6765r = null;
                                viewTreeObserver.removeOnGlobalFocusChangeListener(viewTreeObserverOnGlobalFocusChangeListenerC0481a);
                            }
                            ViewGroup viewGroup3 = (ViewGroup) iVar.getParent();
                            if (viewGroup3 != null) {
                                viewGroup3.removeView(iVar);
                            }
                            sparseArray.remove(i);
                        }
                    } else {
                        HashMap map = pVar.f6802j;
                        A a5 = (A) map.get(Integer.valueOf(i));
                        View viewA = a5.a();
                        if (viewA != null) {
                            pVar.f6803k.remove(viewA.getContext());
                        }
                        a5.f6733a.cancel();
                        a5.f6733a.detachState();
                        a5.f6740h.release();
                        a5.f6738f.release();
                        map.remove(Integer.valueOf(i));
                    }
                } else {
                    Log.e("PlatformViewsController", "Disposing unknown platform view with id: " + i);
                }
                break;
            default:
                o oVar = (o) this.f6777b;
                g gVar2 = (g) oVar.i.get(i);
                if (gVar2 != null) {
                    if (gVar2.getView() != null) {
                        View view2 = gVar2.getView();
                        ViewGroup viewGroup4 = (ViewGroup) view2.getParent();
                        if (viewGroup4 != null) {
                            viewGroup4.removeView(view2);
                        }
                    }
                    oVar.i.remove(i);
                    try {
                        gVar2.b();
                    } catch (RuntimeException e6) {
                        Log.e("PlatformViewsController2", "Disposing platform view threw an exception", e6);
                    }
                    SparseArray sparseArray3 = oVar.f6786j;
                    i3.b bVar2 = (i3.b) sparseArray3.get(i);
                    if (bVar2 != null) {
                        bVar2.removeAllViews();
                        bVar2.a();
                        ViewGroup viewGroup5 = (ViewGroup) bVar2.getParent();
                        if (viewGroup5 != null) {
                            viewGroup5.removeView(bVar2);
                        }
                        sparseArray3.remove(i);
                    }
                } else {
                    Log.e("PlatformViewsController2", "Disposing unknown platform view with id: " + i);
                }
                break;
        }
    }

    public CharSequence f(EnumC0670d enumC0670d) {
        Activity activity = ((f) this.f6777b).f6754a;
        ClipboardManager clipboardManager = (ClipboardManager) activity.getSystemService("clipboard");
        CharSequence charSequence = null;
        if (!clipboardManager.hasPrimaryClip()) {
            return null;
        }
        try {
            try {
                ClipData primaryClip = clipboardManager.getPrimaryClip();
                if (primaryClip == null) {
                    return null;
                }
                if (enumC0670d != null && enumC0670d != EnumC0670d.f8678m) {
                    return null;
                }
                ClipData.Item itemAt = primaryClip.getItemAt(0);
                CharSequence text = itemAt.getText();
                if (text != null) {
                    return text;
                }
                try {
                    Uri uri = itemAt.getUri();
                    if (uri == null) {
                        Log.w("PlatformPlugin", "Clipboard item contained no textual content nor a URI to retrieve it from.");
                    } else {
                        String scheme = uri.getScheme();
                        if (scheme.equals("content")) {
                            AssetFileDescriptor assetFileDescriptorOpenTypedAssetFileDescriptor = activity.getContentResolver().openTypedAssetFileDescriptor(uri, "text/*", null);
                            CharSequence charSequenceCoerceToText = itemAt.coerceToText(activity);
                            if (assetFileDescriptorOpenTypedAssetFileDescriptor != null) {
                                try {
                                    assetFileDescriptorOpenTypedAssetFileDescriptor.close();
                                } catch (IOException e5) {
                                    charSequence = charSequenceCoerceToText;
                                    e = e5;
                                }
                            }
                            charSequence = charSequenceCoerceToText;
                        } else {
                            Log.w("PlatformPlugin", "Clipboard item contains a Uri with scheme '" + scheme + "'that is unhandled.");
                        }
                    }
                    return charSequence;
                } catch (IOException e6) {
                    e = e6;
                    charSequence = text;
                }
            } catch (IOException e7) {
                e = e7;
            }
            Log.w("PlatformPlugin", "Failed to close AssetFileDescriptor while trying to read text from URI.", e);
            return charSequence;
        } catch (FileNotFoundException unused) {
            Log.w("PlatformPlugin", "Clipboard text was unable to be received from content URI.");
            return null;
        } catch (SecurityException e8) {
            Log.w("PlatformPlugin", "Attempted to get clipboard data that requires additional permission(s).\nSee the exception details for which permission(s) are required, and consider adding them to your Android Manifest as described in:\nhttps://developer.android.com/guide/topics/permissions/overview", e8);
            return null;
        }
    }

    public void g(int i, double d5, double d6) {
        p pVar = (p) this.f6777b;
        if (pVar.n(i)) {
            return;
        }
        i iVar = (i) pVar.f6807o.get(i);
        if (iVar == null) {
            Log.e("PlatformViewsController", "Setting offset for unknown platform view with id: " + i);
        } else {
            int iM = pVar.m(d5);
            int iM2 = pVar.m(d6);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) iVar.getLayoutParams();
            layoutParams.topMargin = iM;
            layoutParams.leftMargin = iM2;
            iVar.setLayoutParams(layoutParams);
        }
    }

    @Override // io.flutter.plugin.platform.h
    public int getHeight() {
        return ((TextureRegistry$SurfaceProducer) this.f6777b).getHeight();
    }

    @Override // io.flutter.plugin.platform.h
    public Surface getSurface() {
        return ((TextureRegistry$SurfaceProducer) this.f6777b).getSurface();
    }

    @Override // io.flutter.plugin.platform.h
    public int getWidth() {
        return ((TextureRegistry$SurfaceProducer) this.f6777b).getWidth();
    }

    public void h(C0674h c0674h) {
        p pVar = (p) this.f6777b;
        float f2 = pVar.f6796c.getResources().getDisplayMetrics().density;
        int i = c0674h.f8696a;
        if (pVar.n(i)) {
            A a5 = (A) pVar.f6802j.get(Integer.valueOf(i));
            MotionEvent motionEventL = pVar.l(f2, c0674h, true);
            SingleViewPresentation singleViewPresentation = a5.f6733a;
            if (singleViewPresentation == null) {
                return;
            }
            singleViewPresentation.dispatchTouchEvent(motionEventL);
            return;
        }
        g gVar = (g) pVar.f6804l.get(i);
        if (gVar == null) {
            Log.e("PlatformViewsController", "Sending touch to an unknown view with id: " + i);
            return;
        }
        View view = gVar.getView();
        if (view != null) {
            view.dispatchTouchEvent(pVar.l(f2, c0674h, false));
            return;
        }
        Log.e("PlatformViewsController", "Sending touch to a null view with id: " + i);
    }

    public void i(C0674h c0674h) {
        o oVar = (o) this.f6777b;
        float f2 = oVar.f6780c.getResources().getDisplayMetrics().density;
        SparseArray sparseArray = oVar.i;
        int i = c0674h.f8696a;
        g gVar = (g) sparseArray.get(i);
        if (gVar == null) {
            Log.e("PlatformViewsController2", "Sending touch to an unknown view with id: " + i);
            return;
        }
        View view = gVar.getView();
        if (view == null) {
            Log.e("PlatformViewsController2", "Sending touch to a null view with id: " + i);
            return;
        }
        MotionEvent motionEventK = oVar.f6787k.k(new Q(c0674h.f8710p));
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
        int i5 = c0674h.f8700e;
        MotionEvent.PointerCoords[] pointerCoordsArr = (MotionEvent.PointerCoords[]) arrayList.toArray(new MotionEvent.PointerCoords[i5]);
        if (motionEventK == null) {
            List<List> list3 = (List) c0674h.f8701f;
            ArrayList arrayList2 = new ArrayList();
            for (List list4 : list3) {
                MotionEvent.PointerProperties pointerProperties = new MotionEvent.PointerProperties();
                pointerProperties.id = ((Integer) list4.get(0)).intValue();
                pointerProperties.toolType = ((Integer) list4.get(1)).intValue();
                arrayList2.add(pointerProperties);
            }
            motionEventK = MotionEvent.obtain(c0674h.f8697b.longValue(), c0674h.f8698c.longValue(), c0674h.f8699d, c0674h.f8700e, (MotionEvent.PointerProperties[]) arrayList2.toArray(new MotionEvent.PointerProperties[i5]), pointerCoordsArr, c0674h.f8703h, c0674h.i, c0674h.f8704j, c0674h.f8705k, c0674h.f8706l, c0674h.f8707m, c0674h.f8708n, c0674h.f8709o);
        } else if (pointerCoordsArr.length >= 1) {
            motionEventK.offsetLocation(pointerCoordsArr[0].x - motionEventK.getX(), pointerCoordsArr[0].y - motionEventK.getY());
        }
        view.dispatchTouchEvent(motionEventK);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v8, types: [io.flutter.plugin.platform.l, java.lang.Runnable] */
    public void j(C0673g c0673g, final I2.g gVar) {
        h hVar;
        p pVar = (p) this.f6777b;
        int iM = pVar.m(c0673g.f8694b);
        int iM2 = pVar.m(c0673g.f8695c);
        int i = c0673g.f8693a;
        if (!pVar.n(i)) {
            g gVar2 = (g) pVar.f6804l.get(i);
            i iVar = (i) pVar.f6807o.get(i);
            if (gVar2 == null || iVar == null) {
                Log.e("PlatformViewsController", "Resizing unknown platform view with id: " + i);
                return;
            }
            if ((iM > iVar.getRenderTargetWidth() || iM2 > iVar.getRenderTargetHeight()) && (hVar = iVar.f6764q) != null) {
                hVar.b(iM, iM2);
            }
            ViewGroup.LayoutParams layoutParams = iVar.getLayoutParams();
            layoutParams.width = iM;
            layoutParams.height = iM2;
            iVar.setLayoutParams(layoutParams);
            View view = gVar2.getView();
            if (view != null) {
                ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
                layoutParams2.width = iM;
                layoutParams2.height = iM2;
                view.setLayoutParams(layoutParams2);
            }
            int iRound = (int) Math.round(((double) iVar.getRenderTargetWidth()) / ((double) pVar.g()));
            int iRound2 = (int) Math.round(((double) iVar.getRenderTargetHeight()) / ((double) pVar.g()));
            P2.c cVar = (P2.c) gVar.f1034m;
            HashMap map = new HashMap();
            map.put("width", Double.valueOf(iRound));
            map.put("height", Double.valueOf(iRound2));
            cVar.success(map);
            return;
        }
        final float fG = pVar.g();
        final A a5 = (A) pVar.f6802j.get(Integer.valueOf(i));
        io.flutter.plugin.editing.i iVar2 = pVar.f6800g;
        if (iVar2 != null) {
            if (iVar2.f6722e.f360b == 3) {
                iVar2.f6732p = true;
            }
            SingleViewPresentation singleViewPresentation = a5.f6733a;
            if (singleViewPresentation != null && singleViewPresentation.getView() != null) {
                a5.f6733a.getView().getClass();
            }
        }
        ?? r32 = new Runnable() { // from class: io.flutter.plugin.platform.l
            @Override // java.lang.Runnable
            public final void run() {
                p pVar2 = (p) this.f6772l.f6777b;
                io.flutter.plugin.editing.i iVar3 = pVar2.f6800g;
                A a6 = a5;
                if (iVar3 != null) {
                    if (iVar3.f6722e.f360b == 3) {
                        iVar3.f6732p = false;
                    }
                    SingleViewPresentation singleViewPresentation2 = a6.f6733a;
                    if (singleViewPresentation2 != null && singleViewPresentation2.getView() != null) {
                        a6.f6733a.getView().getClass();
                    }
                }
                double dG = pVar2.f6796c == null ? fG : pVar2.g();
                int iRound3 = (int) Math.round(((double) a6.f6738f.getWidth()) / dG);
                int iRound4 = (int) Math.round(((double) a6.f6738f.getHeight()) / dG);
                P2.c cVar2 = (P2.c) gVar.f1034m;
                HashMap map2 = new HashMap();
                map2.put("width", Double.valueOf(iRound3));
                map2.put("height", Double.valueOf(iRound4));
                cVar2.success(map2);
            }
        };
        int width = a5.f6738f.getWidth();
        h hVar2 = a5.f6738f;
        if (iM == width && iM2 == hVar2.getHeight()) {
            a5.a().postDelayed(r32, 0L);
            return;
        }
        if (Build.VERSION.SDK_INT >= 31) {
            View viewA = a5.a();
            hVar2.b(iM, iM2);
            a5.f6740h.resize(iM, iM2, a5.f6736d);
            a5.f6740h.setSurface(hVar2.getSurface());
            viewA.postDelayed(r32, 0L);
            return;
        }
        boolean zIsFocused = a5.a().isFocused();
        u uVarDetachState = a5.f6733a.detachState();
        a5.f6740h.setSurface(null);
        a5.f6740h.release();
        DisplayManager displayManager = (DisplayManager) a5.f6734b.getSystemService("display");
        hVar2.b(iM, iM2);
        a5.f6740h = displayManager.createVirtualDisplay("flutter-vd#" + a5.f6737e, iM, iM2, a5.f6736d, hVar2.getSurface(), 0, A.i, null);
        View viewA2 = a5.a();
        viewA2.addOnAttachStateChangeListener(new N1.i(viewA2, (l) r32));
        SingleViewPresentation singleViewPresentation2 = new SingleViewPresentation(a5.f6734b, a5.f6740h.getDisplay(), a5.f6735c, uVarDetachState, a5.f6739g, zIsFocused);
        singleViewPresentation2.show();
        a5.f6733a.cancel();
        a5.f6733a = singleViewPresentation2;
    }

    public void k(int i, int i5) {
        View view;
        switch (this.f6776a) {
            case 0:
                if (i5 != 0 && i5 != 1) {
                    throw new IllegalStateException("Trying to set unknown direction value: " + i5 + "(view id: " + i + ")");
                }
                p pVar = (p) this.f6777b;
                if (pVar.n(i)) {
                    view = ((A) pVar.f6802j.get(Integer.valueOf(i))).a();
                } else {
                    g gVar = (g) pVar.f6804l.get(i);
                    if (gVar == null) {
                        Log.e("PlatformViewsController", "Setting direction to an unknown view with id: " + i);
                        return;
                    }
                    view = gVar.getView();
                }
                if (view != null) {
                    view.setLayoutDirection(i5);
                    return;
                }
                Log.e("PlatformViewsController", "Setting direction to a null view with id: " + i);
                return;
            default:
                g gVar2 = (g) ((o) this.f6777b).i.get(i);
                if (gVar2 == null) {
                    Log.e("PlatformViewsController2", "Setting direction to an unknown view with id: " + i);
                    return;
                }
                View view2 = gVar2.getView();
                if (view2 != null) {
                    view2.setLayoutDirection(i5);
                    return;
                }
                Log.e("PlatformViewsController2", "Setting direction to a null view with id: " + i);
                return;
        }
    }

    public void l(ArrayList arrayList) {
        f fVar = (f) this.f6777b;
        fVar.getClass();
        int i = arrayList.size() == 0 ? 5894 : 1798;
        for (int i5 = 0; i5 < arrayList.size(); i5++) {
            int iOrdinal = ((EnumC0671e) arrayList.get(i5)).ordinal();
            if (iOrdinal == 0) {
                i &= -5;
            } else if (iOrdinal == 1) {
                i &= -515;
            }
        }
        fVar.f6758e = i;
        fVar.b();
    }

    public void m(int i) {
        View decorView = ((f) this.f6777b).f6754a.getWindow().getDecorView();
        int iB = O.i.b(i);
        if (iB == 0) {
            decorView.performHapticFeedback(0);
            return;
        }
        if (iB == 1) {
            decorView.performHapticFeedback(1);
            return;
        }
        if (iB == 2) {
            decorView.performHapticFeedback(3);
        } else if (iB == 3) {
            decorView.performHapticFeedback(6);
        } else {
            if (iB != 4) {
                return;
            }
            decorView.performHapticFeedback(4);
        }
    }

    @Override // io.flutter.plugin.platform.h
    public void release() {
        ((TextureRegistry$SurfaceProducer) this.f6777b).release();
        this.f6777b = null;
    }

    @Override // io.flutter.plugin.platform.h
    public void scheduleFrame() {
        ((TextureRegistry$SurfaceProducer) this.f6777b).scheduleFrame();
    }

    public m(int i) {
        this.f6776a = i;
        switch (i) {
            case 4:
                break;
            default:
                this.f6777b = new HashMap();
                break;
        }
    }
}

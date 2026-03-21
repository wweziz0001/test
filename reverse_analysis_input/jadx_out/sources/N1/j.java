package N1;

import C3.n;
import K1.l;
import N1.f;
import N1.j;
import N3.h;
import Z1.m;
import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.os.IBinder;
import android.util.Log;
import androidx.window.layout.adapter.sidecar.DistinctElementSidecarCallback;
import androidx.window.sidecar.SidecarDeviceState;
import androidx.window.sidecar.SidecarDisplayFeature;
import androidx.window.sidecar.SidecarInterface;
import androidx.window.sidecar.SidecarWindowLayoutInfo;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SidecarInterface f1589a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f f1590b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LinkedHashMap f1591c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final LinkedHashMap f1592d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public m f1593e;

    public j(Context context) {
        N3.h.e(context, "context");
        SidecarInterface sidecarInterfaceB = h.b(context);
        f fVar = new f();
        this.f1589a = sidecarInterfaceB;
        this.f1590b = fVar;
        this.f1591c = new LinkedHashMap();
        this.f1592d = new LinkedHashMap();
    }

    public final SidecarInterface d() {
        return this.f1589a;
    }

    public final K1.l e(Activity activity) {
        SidecarDeviceState sidecarDeviceState;
        IBinder iBinderA = h.a(activity);
        if (iBinderA == null) {
            return new K1.l(n.f291l);
        }
        SidecarInterface sidecarInterface = this.f1589a;
        SidecarWindowLayoutInfo windowLayoutInfo = sidecarInterface != null ? sidecarInterface.getWindowLayoutInfo(iBinderA) : null;
        SidecarInterface sidecarInterface2 = this.f1589a;
        if (sidecarInterface2 == null || (sidecarDeviceState = sidecarInterface2.getDeviceState()) == null) {
            sidecarDeviceState = new SidecarDeviceState();
        }
        return this.f1590b.e(windowLayoutInfo, sidecarDeviceState);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void f(Activity activity) {
        SidecarInterface sidecarInterface;
        IBinder iBinderA = h.a(activity);
        if (iBinderA == null) {
            return;
        }
        SidecarInterface sidecarInterface2 = this.f1589a;
        if (sidecarInterface2 != null) {
            sidecarInterface2.onWindowLayoutChangeListenerRemoved(iBinderA);
        }
        LinkedHashMap linkedHashMap = this.f1592d;
        C.a aVar = (C.a) linkedHashMap.get(activity);
        if (aVar != null) {
            if (activity instanceof u.i) {
                ((u.i) activity).removeOnConfigurationChangedListener(aVar);
            }
            linkedHashMap.remove(activity);
        }
        m mVar = this.f1593e;
        if (mVar != null) {
            mVar.m(activity);
        }
        LinkedHashMap linkedHashMap2 = this.f1591c;
        boolean z4 = linkedHashMap2.size() == 1;
        linkedHashMap2.remove(iBinderA);
        if (!z4 || (sidecarInterface = this.f1589a) == null) {
            return;
        }
        sidecarInterface.onDeviceStateListenersChanged(true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void g(IBinder iBinder, final Activity activity) {
        SidecarInterface sidecarInterface;
        LinkedHashMap linkedHashMap = this.f1591c;
        linkedHashMap.put(iBinder, activity);
        SidecarInterface sidecarInterface2 = this.f1589a;
        if (sidecarInterface2 != null) {
            sidecarInterface2.onWindowLayoutChangeListenerAdded(iBinder);
        }
        if (linkedHashMap.size() == 1 && (sidecarInterface = this.f1589a) != null) {
            sidecarInterface.onDeviceStateListenersChanged(false);
        }
        m mVar = this.f1593e;
        if (mVar != null) {
            mVar.C(activity, e(activity));
        }
        LinkedHashMap linkedHashMap2 = this.f1592d;
        if (linkedHashMap2.get(activity) == null && (activity instanceof u.i)) {
            C.a aVar = new C.a() { // from class: N1.g
                @Override // C.a
                public final void accept(Object obj) {
                    j jVar = this.f1584a;
                    N3.h.e(jVar, "this$0");
                    Activity activity2 = activity;
                    N3.h.e(activity2, "$activity");
                    m mVar2 = jVar.f1593e;
                    if (mVar2 != null) {
                        mVar2.C(activity2, jVar.e(activity2));
                    }
                }
            };
            linkedHashMap2.put(activity, aVar);
            ((u.i) activity).addOnConfigurationChangedListener(aVar);
        }
    }

    public final void h(B0.d dVar) {
        this.f1593e = new m(dVar);
        SidecarInterface sidecarInterface = this.f1589a;
        if (sidecarInterface != null) {
            sidecarInterface.setSidecarCallback(new DistinctElementSidecarCallback(this.f1590b, new SidecarInterface.SidecarCallback() { // from class: androidx.window.layout.adapter.sidecar.SidecarCompat$TranslatingCallback
                public void onDeviceStateChanged(SidecarDeviceState sidecarDeviceState) {
                    SidecarInterface sidecarInterfaceD;
                    h.e(sidecarDeviceState, "newDeviceState");
                    Collection<Activity> collectionValues = this.f4772a.f1591c.values();
                    j jVar = this.f4772a;
                    for (Activity activity : collectionValues) {
                        IBinder iBinderA = N1.h.a(activity);
                        SidecarWindowLayoutInfo windowLayoutInfo = null;
                        if (iBinderA != null && (sidecarInterfaceD = jVar.d()) != null) {
                            windowLayoutInfo = sidecarInterfaceD.getWindowLayoutInfo(iBinderA);
                        }
                        m mVar = jVar.f1593e;
                        if (mVar != null) {
                            mVar.C(activity, jVar.f1590b.e(windowLayoutInfo, sidecarDeviceState));
                        }
                    }
                }

                public void onWindowLayoutChanged(IBinder iBinder, SidecarWindowLayoutInfo sidecarWindowLayoutInfo) {
                    SidecarDeviceState sidecarDeviceState;
                    h.e(iBinder, "windowToken");
                    h.e(sidecarWindowLayoutInfo, "newLayout");
                    Activity activity = (Activity) this.f4772a.f1591c.get(iBinder);
                    if (activity == null) {
                        Log.w("SidecarCompat", "Unable to resolve activity from window token. Missing a call to #onWindowLayoutChangeListenerAdded()?");
                        return;
                    }
                    f fVar = this.f4772a.f1590b;
                    SidecarInterface sidecarInterfaceD = this.f4772a.d();
                    if (sidecarInterfaceD == null || (sidecarDeviceState = sidecarInterfaceD.getDeviceState()) == null) {
                        sidecarDeviceState = new SidecarDeviceState();
                    }
                    l lVarE = fVar.e(sidecarWindowLayoutInfo, sidecarDeviceState);
                    m mVar = this.f4772a.f1593e;
                    if (mVar != null) {
                        mVar.C(activity, lVarE);
                    }
                }
            }));
        }
    }

    public final boolean i() {
        Class<?> cls;
        Class<?> cls2;
        Class<?> cls3;
        Class<?> cls4;
        try {
            SidecarInterface sidecarInterface = this.f1589a;
            Method method = (sidecarInterface == null || (cls4 = sidecarInterface.getClass()) == null) ? null : cls4.getMethod("setSidecarCallback", SidecarInterface.SidecarCallback.class);
            Class<?> returnType = method != null ? method.getReturnType() : null;
            Class cls5 = Void.TYPE;
            if (!N3.h.a(returnType, cls5)) {
                throw new NoSuchMethodException("Illegal return type for 'setSidecarCallback': " + returnType);
            }
            SidecarInterface sidecarInterface2 = this.f1589a;
            if (sidecarInterface2 != null) {
                sidecarInterface2.getDeviceState();
            }
            SidecarInterface sidecarInterface3 = this.f1589a;
            if (sidecarInterface3 != null) {
                sidecarInterface3.onDeviceStateListenersChanged(true);
            }
            SidecarInterface sidecarInterface4 = this.f1589a;
            Method method2 = (sidecarInterface4 == null || (cls3 = sidecarInterface4.getClass()) == null) ? null : cls3.getMethod("getWindowLayoutInfo", IBinder.class);
            Class<?> returnType2 = method2 != null ? method2.getReturnType() : null;
            if (!N3.h.a(returnType2, SidecarWindowLayoutInfo.class)) {
                throw new NoSuchMethodException("Illegal return type for 'getWindowLayoutInfo': " + returnType2);
            }
            SidecarInterface sidecarInterface5 = this.f1589a;
            Method method3 = (sidecarInterface5 == null || (cls2 = sidecarInterface5.getClass()) == null) ? null : cls2.getMethod("onWindowLayoutChangeListenerAdded", IBinder.class);
            Class<?> returnType3 = method3 != null ? method3.getReturnType() : null;
            if (!N3.h.a(returnType3, cls5)) {
                throw new NoSuchMethodException("Illegal return type for 'onWindowLayoutChangeListenerAdded': " + returnType3);
            }
            SidecarInterface sidecarInterface6 = this.f1589a;
            Method method4 = (sidecarInterface6 == null || (cls = sidecarInterface6.getClass()) == null) ? null : cls.getMethod("onWindowLayoutChangeListenerRemoved", IBinder.class);
            Class<?> returnType4 = method4 != null ? method4.getReturnType() : null;
            if (!N3.h.a(returnType4, cls5)) {
                throw new NoSuchMethodException("Illegal return type for 'onWindowLayoutChangeListenerRemoved': " + returnType4);
            }
            SidecarDeviceState sidecarDeviceState = new SidecarDeviceState();
            try {
                sidecarDeviceState.posture = 3;
            } catch (NoSuchFieldError unused) {
                SidecarDeviceState.class.getMethod("setPosture", Integer.TYPE).invoke(sidecarDeviceState, 3);
                Object objInvoke = SidecarDeviceState.class.getMethod("getPosture", null).invoke(sidecarDeviceState, null);
                N3.h.c(objInvoke, "null cannot be cast to non-null type kotlin.Int");
                if (((Integer) objInvoke).intValue() != 3) {
                    throw new Exception("Invalid device posture getter/setter");
                }
            }
            SidecarDisplayFeature sidecarDisplayFeature = new SidecarDisplayFeature();
            Rect rect = sidecarDisplayFeature.getRect();
            N3.h.d(rect, "displayFeature.rect");
            sidecarDisplayFeature.setRect(rect);
            sidecarDisplayFeature.getType();
            sidecarDisplayFeature.setType(1);
            SidecarWindowLayoutInfo sidecarWindowLayoutInfo = new SidecarWindowLayoutInfo();
            try {
                List list = sidecarWindowLayoutInfo.displayFeatures;
                return true;
            } catch (NoSuchFieldError unused2) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(sidecarDisplayFeature);
                SidecarWindowLayoutInfo.class.getMethod("setDisplayFeatures", List.class).invoke(sidecarWindowLayoutInfo, arrayList);
                Object objInvoke2 = SidecarWindowLayoutInfo.class.getMethod("getDisplayFeatures", null).invoke(sidecarWindowLayoutInfo, null);
                N3.h.c(objInvoke2, "null cannot be cast to non-null type kotlin.collections.List<androidx.window.sidecar.SidecarDisplayFeature>");
                if (N3.h.a(arrayList, (List) objInvoke2)) {
                    return true;
                }
                throw new Exception("Invalid display feature getter/setter");
            }
        } catch (Throwable unused3) {
            return false;
        }
    }
}

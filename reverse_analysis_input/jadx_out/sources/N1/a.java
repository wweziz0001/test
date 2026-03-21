package N1;

import C3.n;
import androidx.window.sidecar.SidecarDeviceState;
import androidx.window.sidecar.SidecarWindowLayoutInfo;
import java.lang.reflect.InvocationTargetException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {
    public static int a(SidecarDeviceState sidecarDeviceState) {
        N3.h.e(sidecarDeviceState, "sidecarDeviceState");
        try {
            try {
                return sidecarDeviceState.posture;
            } catch (NoSuchFieldError unused) {
                Object objInvoke = SidecarDeviceState.class.getMethod("getPosture", null).invoke(sidecarDeviceState, null);
                N3.h.c(objInvoke, "null cannot be cast to non-null type kotlin.Int");
                return ((Integer) objInvoke).intValue();
            }
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused2) {
            return 0;
        }
    }

    public static int b(SidecarDeviceState sidecarDeviceState) {
        N3.h.e(sidecarDeviceState, "sidecarDeviceState");
        int iA = a(sidecarDeviceState);
        if (iA < 0 || iA > 4) {
            return 0;
        }
        return iA;
    }

    public static List c(SidecarWindowLayoutInfo sidecarWindowLayoutInfo) {
        n nVar = n.f291l;
        N3.h.e(sidecarWindowLayoutInfo, "info");
        try {
            try {
                List list = sidecarWindowLayoutInfo.displayFeatures;
                return list == null ? nVar : list;
            } catch (NoSuchFieldError unused) {
                Object objInvoke = SidecarWindowLayoutInfo.class.getMethod("getDisplayFeatures", null).invoke(sidecarWindowLayoutInfo, null);
                N3.h.c(objInvoke, "null cannot be cast to non-null type kotlin.collections.List<androidx.window.sidecar.SidecarDisplayFeature>");
                return (List) objInvoke;
            }
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused2) {
            return nVar;
        }
    }

    public static void d(SidecarDeviceState sidecarDeviceState, int i) {
        try {
            try {
                sidecarDeviceState.posture = i;
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            }
        } catch (NoSuchFieldError unused2) {
            SidecarDeviceState.class.getMethod("setPosture", Integer.TYPE).invoke(sidecarDeviceState, Integer.valueOf(i));
        }
    }
}

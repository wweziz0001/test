package N1;

import C3.n;
import androidx.window.sidecar.SidecarDeviceState;
import androidx.window.sidecar.SidecarDisplayFeature;
import androidx.window.sidecar.SidecarWindowLayoutInfo;
import b3.AbstractC0307a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f1583a;

    public f() {
        AbstractC0307a.r("verificationMode", 3);
        this.f1583a = 3;
    }

    public static boolean a(SidecarDeviceState sidecarDeviceState, SidecarDeviceState sidecarDeviceState2) {
        if (N3.h.a(sidecarDeviceState, sidecarDeviceState2)) {
            return true;
        }
        return (sidecarDeviceState == null || sidecarDeviceState2 == null || a.b(sidecarDeviceState) != a.b(sidecarDeviceState2)) ? false : true;
    }

    public static boolean b(SidecarDisplayFeature sidecarDisplayFeature, SidecarDisplayFeature sidecarDisplayFeature2) {
        if (N3.h.a(sidecarDisplayFeature, sidecarDisplayFeature2)) {
            return true;
        }
        if (sidecarDisplayFeature == null || sidecarDisplayFeature2 == null || sidecarDisplayFeature.getType() != sidecarDisplayFeature2.getType()) {
            return false;
        }
        return N3.h.a(sidecarDisplayFeature.getRect(), sidecarDisplayFeature2.getRect());
    }

    public static boolean c(List list, List list2) {
        if (list == list2) {
            return true;
        }
        if (list.size() != list2.size()) {
            return false;
        }
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (!b((SidecarDisplayFeature) list.get(i), (SidecarDisplayFeature) list2.get(i))) {
                return false;
            }
        }
        return true;
    }

    public static boolean d(SidecarWindowLayoutInfo sidecarWindowLayoutInfo, SidecarWindowLayoutInfo sidecarWindowLayoutInfo2) {
        if (N3.h.a(sidecarWindowLayoutInfo, sidecarWindowLayoutInfo2)) {
            return true;
        }
        if (sidecarWindowLayoutInfo == null || sidecarWindowLayoutInfo2 == null) {
            return false;
        }
        return c(a.c(sidecarWindowLayoutInfo), a.c(sidecarWindowLayoutInfo2));
    }

    public final K1.l e(SidecarWindowLayoutInfo sidecarWindowLayoutInfo, SidecarDeviceState sidecarDeviceState) {
        N3.h.e(sidecarDeviceState, "state");
        if (sidecarWindowLayoutInfo == null) {
            return new K1.l(n.f291l);
        }
        SidecarDeviceState sidecarDeviceState2 = new SidecarDeviceState();
        a.d(sidecarDeviceState2, a.b(sidecarDeviceState));
        return new K1.l(f(a.c(sidecarWindowLayoutInfo), sidecarDeviceState2));
    }

    public final ArrayList f(List list, SidecarDeviceState sidecarDeviceState) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            K1.c cVarG = g((SidecarDisplayFeature) it.next(), sidecarDeviceState);
            if (cVarG != null) {
                arrayList.add(cVarG);
            }
        }
        return arrayList;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0055, code lost:
    
        if (r6 == 4) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final K1.c g(androidx.window.sidecar.SidecarDisplayFeature r5, androidx.window.sidecar.SidecarDeviceState r6) {
        /*
            r4 = this;
            java.lang.String r0 = "feature"
            N3.h.e(r5, r0)
            int r0 = r4.f1583a
            H1.h r0 = H1.a.a(r0, r5)
            N1.b r1 = N1.b.f1579m
            java.lang.String r2 = "Type must be either TYPE_FOLD or TYPE_HINGE"
            H1.g r0 = r0.d(r2, r1)
            N1.c r1 = N1.c.f1580m
            java.lang.String r2 = "Feature bounds must not be 0"
            H1.g r0 = r0.d(r2, r1)
            N1.d r1 = N1.d.f1581m
            java.lang.String r2 = "TYPE_FOLD must have 0 area"
            H1.g r0 = r0.d(r2, r1)
            N1.e r1 = N1.e.f1582m
            java.lang.String r2 = "Feature be pinned to either left or top"
            H1.g r0 = r0.d(r2, r1)
            java.lang.Object r0 = r0.a()
            androidx.window.sidecar.SidecarDisplayFeature r0 = (androidx.window.sidecar.SidecarDisplayFeature) r0
            r1 = 0
            if (r0 != 0) goto L35
            return r1
        L35:
            int r0 = r0.getType()
            r2 = 2
            r3 = 1
            if (r0 == r3) goto L43
            if (r0 == r2) goto L40
            return r1
        L40:
            K1.b r0 = K1.b.f1235s
            goto L45
        L43:
            K1.b r0 = K1.b.f1234r
        L45:
            int r6 = N1.a.b(r6)
            if (r6 == 0) goto L6e
            if (r6 == r3) goto L6e
            if (r6 == r2) goto L58
            K1.b r2 = K1.b.f1232p
            r3 = 3
            if (r6 == r3) goto L5a
            r3 = 4
            if (r6 == r3) goto L6e
            goto L5a
        L58:
            K1.b r2 = K1.b.f1233q
        L5a:
            K1.c r6 = new K1.c
            H1.b r1 = new H1.b
            android.graphics.Rect r5 = r5.getRect()
            java.lang.String r3 = "feature.rect"
            N3.h.d(r5, r3)
            r1.<init>(r5)
            r6.<init>(r1, r0, r2)
            return r6
        L6e:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: N1.f.g(androidx.window.sidecar.SidecarDisplayFeature, androidx.window.sidecar.SidecarDeviceState):K1.c");
    }
}

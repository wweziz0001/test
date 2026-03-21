package y3;

import a.AbstractC0149a;
import android.content.Context;
import android.hardware.display.DisplayManager;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: y3.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1039j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final A.e f11068a;

    public C1039j(A.e eVar, int i) {
        switch (i) {
            case 1:
                N3.h.e(eVar, "pigeonRegistrar");
                this.f11068a = eVar;
                break;
            case 2:
                N3.h.e(eVar, "pigeonRegistrar");
                this.f11068a = eVar;
                break;
            case 3:
                N3.h.e(eVar, "pigeonRegistrar");
                this.f11068a = eVar;
                break;
            case 4:
                N3.h.e(eVar, "pigeonRegistrar");
                this.f11068a = eVar;
                break;
            case 5:
                N3.h.e(eVar, "pigeonRegistrar");
                this.f11068a = eVar;
                break;
            case O.j.STRING_SET_FIELD_NUMBER /* 6 */:
                N3.h.e(eVar, "pigeonRegistrar");
                this.f11068a = eVar;
                break;
            case O.j.DOUBLE_FIELD_NUMBER /* 7 */:
                N3.h.e(eVar, "pigeonRegistrar");
                this.f11068a = eVar;
                break;
            case O.j.BYTES_FIELD_NUMBER /* 8 */:
                N3.h.e(eVar, "pigeonRegistrar");
                this.f11068a = eVar;
                break;
            case 9:
                N3.h.e(eVar, "pigeonRegistrar");
                this.f11068a = eVar;
                break;
            case 10:
                N3.h.e(eVar, "pigeonRegistrar");
                this.f11068a = eVar;
                break;
            case 11:
                N3.h.e(eVar, "pigeonRegistrar");
                this.f11068a = eVar;
                break;
            case 12:
                N3.h.e(eVar, "pigeonRegistrar");
                this.f11068a = eVar;
                break;
            case 13:
                N3.h.e(eVar, "pigeonRegistrar");
                this.f11068a = eVar;
                break;
            case 14:
                N3.h.e(eVar, "pigeonRegistrar");
                this.f11068a = eVar;
                break;
            default:
                N3.h.e(eVar, "pigeonRegistrar");
                this.f11068a = eVar;
                break;
        }
    }

    public Z a() {
        DisplayManager displayManager = (DisplayManager) ((Context) this.f11068a.f11p).getSystemService("display");
        ArrayList arrayListP = AbstractC0149a.P(displayManager);
        Z z4 = new Z(this);
        ArrayList arrayListP2 = AbstractC0149a.P(displayManager);
        arrayListP2.removeAll(arrayListP);
        if (!arrayListP2.isEmpty()) {
            Iterator it = arrayListP2.iterator();
            while (it.hasNext()) {
                displayManager.unregisterDisplayListener((DisplayManager.DisplayListener) it.next());
                displayManager.registerDisplayListener(new D0.t(arrayListP2, displayManager, 2), null);
            }
        }
        return z4;
    }
}

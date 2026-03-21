package e3;

import android.util.SparseArray;
import io.flutter.plugin.platform.o;
import io.flutter.plugin.platform.p;
import java.util.Iterator;

/* JADX INFO: renamed from: e3.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0392a implements InterfaceC0393b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C0394c f5603a;

    public C0392a(C0394c c0394c) {
        this.f5603a = c0394c;
    }

    @Override // e3.InterfaceC0393b
    public final void onPreEngineRestart() {
        C0394c c0394c = this.f5603a;
        Iterator it = c0394c.f5624u.iterator();
        while (it.hasNext()) {
            ((InterfaceC0393b) it.next()).onPreEngineRestart();
        }
        while (true) {
            p pVar = c0394c.f5622s;
            SparseArray sparseArray = pVar.f6804l;
            if (sparseArray.size() <= 0) {
                break;
            }
            pVar.f6815w.e(sparseArray.keyAt(0));
        }
        while (true) {
            o oVar = c0394c.f5623t;
            SparseArray sparseArray2 = oVar.i;
            if (sparseArray2.size() <= 0) {
                c0394c.f5614k.f8714b = null;
                return;
            } else {
                oVar.f6792p.e(sparseArray2.keyAt(0));
            }
        }
    }

    @Override // e3.InterfaceC0393b
    public final void onEngineWillDestroy() {
    }
}

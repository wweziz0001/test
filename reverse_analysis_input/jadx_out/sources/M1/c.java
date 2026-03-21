package M1;

import B3.g;
import C3.n;
import D0.j;
import K1.i;
import N3.q;
import android.app.Activity;
import android.content.Context;
import androidx.window.extensions.layout.WindowLayoutComponent;
import androidx.window.extensions.layout.WindowLayoutInfo;
import java.util.LinkedHashMap;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: loaded from: classes.dex */
public final class c implements L1.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WindowLayoutComponent f1491a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final G1.b f1492b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ReentrantLock f1493c = new ReentrantLock();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final LinkedHashMap f1494d = new LinkedHashMap();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final LinkedHashMap f1495e = new LinkedHashMap();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final LinkedHashMap f1496f = new LinkedHashMap();

    public c(WindowLayoutComponent windowLayoutComponent, G1.b bVar) {
        this.f1491a = windowLayoutComponent;
        this.f1492b = bVar;
    }

    @Override // L1.a
    public final void a(i iVar) {
        ReentrantLock reentrantLock = this.f1493c;
        reentrantLock.lock();
        LinkedHashMap linkedHashMap = this.f1495e;
        try {
            Context context = (Context) linkedHashMap.get(iVar);
            if (context == null) {
                return;
            }
            LinkedHashMap linkedHashMap2 = this.f1494d;
            f fVar = (f) linkedHashMap2.get(context);
            if (fVar == null) {
                return;
            }
            fVar.d(iVar);
            linkedHashMap.remove(iVar);
            if (fVar.f1504d.isEmpty()) {
                linkedHashMap2.remove(context);
                H1.d dVar = (H1.d) this.f1496f.remove(fVar);
                if (dVar != null) {
                    dVar.f965a.invoke(dVar.f966b, dVar.f967c);
                }
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // L1.a
    public final void b(Context context, j jVar, i iVar) {
        g gVar;
        ReentrantLock reentrantLock = this.f1493c;
        reentrantLock.lock();
        LinkedHashMap linkedHashMap = this.f1494d;
        try {
            f fVar = (f) linkedHashMap.get(context);
            LinkedHashMap linkedHashMap2 = this.f1495e;
            if (fVar != null) {
                fVar.b(iVar);
                linkedHashMap2.put(iVar, context);
                gVar = g.f275a;
            } else {
                gVar = null;
            }
            if (gVar == null) {
                f fVar2 = new f(context);
                linkedHashMap.put(context, fVar2);
                linkedHashMap2.put(iVar, context);
                fVar2.b(iVar);
                if (!(context instanceof Activity)) {
                    fVar2.accept(new WindowLayoutInfo(n.f291l));
                    reentrantLock.unlock();
                    return;
                } else {
                    this.f1496f.put(fVar2, this.f1492b.a(this.f1491a, q.a(WindowLayoutInfo.class), (Activity) context, new b(fVar2)));
                }
            }
            reentrantLock.unlock();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }
}

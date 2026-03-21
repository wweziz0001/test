package M1;

import B3.g;
import D0.j;
import K1.i;
import android.content.Context;
import androidx.window.extensions.layout.WindowLayoutComponent;
import java.util.LinkedHashMap;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: loaded from: classes.dex */
public final class d implements L1.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WindowLayoutComponent f1497a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ReentrantLock f1498b = new ReentrantLock();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LinkedHashMap f1499c = new LinkedHashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final LinkedHashMap f1500d = new LinkedHashMap();

    public d(WindowLayoutComponent windowLayoutComponent) {
        this.f1497a = windowLayoutComponent;
    }

    @Override // L1.a
    public final void a(i iVar) {
        ReentrantLock reentrantLock = this.f1498b;
        reentrantLock.lock();
        LinkedHashMap linkedHashMap = this.f1500d;
        try {
            Context context = (Context) linkedHashMap.get(iVar);
            if (context == null) {
                return;
            }
            LinkedHashMap linkedHashMap2 = this.f1499c;
            f fVar = (f) linkedHashMap2.get(context);
            if (fVar == null) {
                return;
            }
            fVar.d(iVar);
            linkedHashMap.remove(iVar);
            if (fVar.c()) {
                linkedHashMap2.remove(context);
                this.f1497a.removeWindowLayoutInfoListener(fVar);
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // L1.a
    public final void b(Context context, j jVar, i iVar) {
        g gVar;
        ReentrantLock reentrantLock = this.f1498b;
        reentrantLock.lock();
        LinkedHashMap linkedHashMap = this.f1499c;
        try {
            f fVar = (f) linkedHashMap.get(context);
            LinkedHashMap linkedHashMap2 = this.f1500d;
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
                this.f1497a.addWindowLayoutInfoListener(context, fVar2);
            }
            reentrantLock.unlock();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }
}

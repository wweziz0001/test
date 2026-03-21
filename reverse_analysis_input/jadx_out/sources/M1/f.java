package M1;

import K1.i;
import K1.l;
import N3.h;
import android.content.Context;
import androidx.window.extensions.core.util.function.Consumer;
import androidx.window.extensions.layout.WindowLayoutInfo;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: loaded from: classes.dex */
public final class f implements C.a, Consumer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f1501a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public l f1503c;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ReentrantLock f1502b = new ReentrantLock();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final LinkedHashSet f1504d = new LinkedHashSet();

    public f(Context context) {
        this.f1501a = context;
    }

    @Override // C.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final void accept(WindowLayoutInfo windowLayoutInfo) {
        h.e(windowLayoutInfo, "value");
        ReentrantLock reentrantLock = this.f1502b;
        reentrantLock.lock();
        try {
            this.f1503c = e.c(this.f1501a, windowLayoutInfo);
            Iterator it = this.f1504d.iterator();
            while (it.hasNext()) {
                ((C.a) it.next()).accept(this.f1503c);
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    public final void b(i iVar) {
        ReentrantLock reentrantLock = this.f1502b;
        reentrantLock.lock();
        try {
            l lVar = this.f1503c;
            if (lVar != null) {
                iVar.accept(lVar);
            }
            this.f1504d.add(iVar);
            reentrantLock.unlock();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public final boolean c() {
        return this.f1504d.isEmpty();
    }

    public final void d(i iVar) {
        ReentrantLock reentrantLock = this.f1502b;
        reentrantLock.lock();
        try {
            this.f1504d.remove(iVar);
        } finally {
            reentrantLock.unlock();
        }
    }
}

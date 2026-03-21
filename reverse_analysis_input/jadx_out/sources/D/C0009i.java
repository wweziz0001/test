package D;

import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: renamed from: D.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0009i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Runnable f351a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CopyOnWriteArrayList f352b = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HashMap f353c = new HashMap();

    public C0009i(Runnable runnable) {
        this.f351a = runnable;
    }

    public final boolean a() {
        Iterator it = this.f352b.iterator();
        while (it.hasNext()) {
            if (((androidx.fragment.app.E) ((InterfaceC0011k) it.next())).f4230a.p()) {
                return true;
            }
        }
        return false;
    }

    public final void b(InterfaceC0011k interfaceC0011k) {
        this.f352b.remove(interfaceC0011k);
        C0008h c0008h = (C0008h) this.f353c.remove(interfaceC0011k);
        if (c0008h != null) {
            c0008h.f349a.b(c0008h.f350b);
            c0008h.f350b = null;
        }
        this.f351a.run();
    }
}

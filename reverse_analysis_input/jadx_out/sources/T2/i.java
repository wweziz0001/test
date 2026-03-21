package T2;

import D0.y;
import android.os.HandlerThread;
import java.io.Serializable;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

/* JADX INFO: loaded from: classes.dex */
public final class i implements h {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f2213l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final int f2214m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Object f2215n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Serializable f2216o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final Serializable f2217p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final Serializable f2218q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final Serializable f2219r;

    public i(int i, int i5) {
        this.f2216o = new LinkedList();
        this.f2217p = new HashSet();
        this.f2218q = new HashSet();
        this.f2219r = new HashMap();
        this.f2215n = "Sqflite";
        this.f2213l = i;
        this.f2214m = i5;
    }

    @Override // T2.h
    public synchronized void b() {
        try {
            for (g gVar : (HashSet) this.f2217p) {
                synchronized (gVar) {
                    HandlerThread handlerThread = gVar.f2209c;
                    if (handlerThread != null) {
                        handlerThread.quit();
                        gVar.f2209c = null;
                        gVar.f2210d = null;
                    }
                }
            }
            for (g gVar2 : (HashSet) this.f2218q) {
                synchronized (gVar2) {
                    HandlerThread handlerThread2 = gVar2.f2209c;
                    if (handlerThread2 != null) {
                        handlerThread2.quit();
                        gVar2.f2209c = null;
                        gVar2.f2210d = null;
                    }
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // T2.h
    public synchronized void c(f fVar) {
        ((LinkedList) this.f2216o).add(fVar);
        Iterator it = new HashSet((HashSet) this.f2217p).iterator();
        while (it.hasNext()) {
            e((g) it.next());
        }
    }

    public synchronized f d(g gVar) {
        f fVar;
        g gVar2;
        try {
            ListIterator listIterator = ((LinkedList) this.f2216o).listIterator();
            do {
                if (!listIterator.hasNext()) {
                    return null;
                }
                fVar = (f) listIterator.next();
                gVar2 = fVar.a() != null ? (g) ((HashMap) this.f2219r).get(fVar.a()) : null;
                if (gVar2 == null) {
                    break;
                }
            } while (gVar2 != gVar);
            listIterator.remove();
            return fVar;
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized void e(g gVar) {
        try {
            f fVarD = d(gVar);
            if (fVarD != null) {
                ((HashSet) this.f2218q).add(gVar);
                ((HashSet) this.f2217p).remove(gVar);
                if (fVarD.a() != null) {
                    ((HashMap) this.f2219r).put(fVarD.a(), gVar);
                }
                gVar.f2210d.post(new y(gVar, 7, fVarD));
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // T2.h
    public synchronized void start() {
        for (int i = 0; i < this.f2213l; i++) {
            g gVar = new g(((String) this.f2215n) + i, this.f2214m);
            gVar.a(new y(this, 8, gVar));
            ((HashSet) this.f2217p).add(gVar);
        }
    }

    public i(Integer num, int i, Boolean bool, Integer num2, int i5, Integer num3, Boolean bool2) {
        this.f2215n = num;
        this.f2213l = i;
        this.f2216o = bool;
        this.f2217p = num2;
        this.f2214m = i5;
        this.f2218q = num3;
        this.f2219r = bool2;
    }
}

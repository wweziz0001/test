package androidx.work.impl;

import C3.n;
import C3.o;
import C3.p;
import N3.h;
import Z1.c;
import Z1.e;
import Z1.i;
import Z1.l;
import Z1.m;
import Z1.q;
import Z1.s;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.CancellationSignal;
import android.os.Looper;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import s1.C0786b;
import s1.InterfaceC0787c;
import s1.f;
import x1.InterfaceC0987c;
import x1.InterfaceC0989e;
import y1.C1002b;

/* JADX INFO: loaded from: classes.dex */
public abstract class WorkDatabase {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile C1002b f4783a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Executor f4784b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public InterfaceC0987c f4785c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f4787e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ArrayList f4788f;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final LinkedHashMap f4791j;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final f f4786d = d();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final LinkedHashMap f4789g = new LinkedHashMap();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ReentrantReadWriteLock f4790h = new ReentrantReadWriteLock();
    public final ThreadLocal i = new ThreadLocal();

    public WorkDatabase() {
        h.d(Collections.synchronizedMap(new LinkedHashMap()), "synchronizedMap(mutableMapOf())");
        this.f4791j = new LinkedHashMap();
    }

    public static Object q(Class cls, InterfaceC0987c interfaceC0987c) {
        if (cls.isInstance(interfaceC0987c)) {
            return interfaceC0987c;
        }
        if (interfaceC0987c instanceof InterfaceC0787c) {
            return q(cls, ((InterfaceC0787c) interfaceC0987c).a());
        }
        return null;
    }

    public final void a() {
        if (!this.f4787e && Looper.getMainLooper().getThread() == Thread.currentThread()) {
            throw new IllegalStateException("Cannot access database on the main thread since it may potentially lock the UI for a long period of time.");
        }
    }

    public final void b() {
        if (!h().j().n() && this.i.get() != null) {
            throw new IllegalStateException("Cannot access database on a different coroutine context inherited from a suspending transaction.");
        }
    }

    public final void c() {
        a();
        a();
        C1002b c1002bJ = h().j();
        this.f4786d.c(c1002bJ);
        if (c1002bJ.o()) {
            c1002bJ.b();
        } else {
            c1002bJ.a();
        }
    }

    public abstract f d();

    public abstract InterfaceC0987c e(C0786b c0786b);

    public abstract c f();

    public List g(LinkedHashMap linkedHashMap) {
        h.e(linkedHashMap, "autoMigrationSpecs");
        return n.f291l;
    }

    public final InterfaceC0987c h() {
        InterfaceC0987c interfaceC0987c = this.f4785c;
        if (interfaceC0987c != null) {
            return interfaceC0987c;
        }
        h.g("internalOpenHelper");
        throw null;
    }

    public Set i() {
        return p.f293l;
    }

    public Map j() {
        return o.f292l;
    }

    public final void k() {
        h().j().f();
        if (h().j().n()) {
            return;
        }
        f fVar = this.f4786d;
        if (fVar.f9575e.compareAndSet(false, true)) {
            Executor executor = fVar.f9571a.f4784b;
            if (executor != null) {
                executor.execute(fVar.f9581l);
            } else {
                h.g("internalQueryExecutor");
                throw null;
            }
        }
    }

    public abstract e l();

    public final Cursor m(InterfaceC0989e interfaceC0989e, CancellationSignal cancellationSignal) {
        a();
        b();
        if (cancellationSignal == null) {
            return h().j().q(interfaceC0989e);
        }
        C1002b c1002bJ = h().j();
        c1002bJ.getClass();
        String strA = interfaceC0989e.a();
        String[] strArr = C1002b.f10910o;
        h.b(cancellationSignal);
        T2.c cVar = new T2.c(interfaceC0989e, 1);
        SQLiteDatabase sQLiteDatabase = c1002bJ.f10911l;
        h.e(sQLiteDatabase, "sQLiteDatabase");
        h.e(strA, "sql");
        Cursor cursorRawQueryWithFactory = sQLiteDatabase.rawQueryWithFactory(cVar, strA, strArr, null, cancellationSignal);
        h.d(cursorRawQueryWithFactory, "sQLiteDatabase.rawQueryW…ationSignal\n            )");
        return cursorRawQueryWithFactory;
    }

    public final Object n(Callable callable) {
        c();
        try {
            Object objCall = callable.call();
            o();
            return objCall;
        } finally {
            k();
        }
    }

    public final void o() {
        h().j().r();
    }

    public abstract i p();

    public abstract l r();

    public abstract m s();

    public abstract q t();

    public abstract s u();
}

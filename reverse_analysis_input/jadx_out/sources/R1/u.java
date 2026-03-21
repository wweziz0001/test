package R1;

import Q1.C;
import Q1.C0118a;
import android.content.Context;
import android.database.Cursor;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.WorkDatabase_Impl;
import b3.AbstractC0307a;
import java.util.ArrayList;
import java.util.LinkedList;
import m.W0;

/* JADX INFO: loaded from: classes.dex */
public final class u implements Runnable {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public static final String f1936C = Q1.q.f("WorkerWrapper");

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Context f1939l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final String f1940m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Z1.p f1941n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public Q1.p f1942o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final Z1.i f1943p;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final C0118a f1945r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final Q1.r f1946s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final f f1947t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final WorkDatabase f1948u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final Z1.q f1949v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final Z1.c f1950w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final ArrayList f1951x;
    public String y;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public Q1.o f1944q = new Q1.l();

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final b2.k f1952z = new b2.k();

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final b2.k f1937A = new b2.k();

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public volatile int f1938B = -256;

    public u(W0 w02) {
        this.f1939l = w02.f8350a;
        this.f1943p = (Z1.i) w02.f8352c;
        this.f1947t = (f) w02.f8351b;
        Z1.p pVar = (Z1.p) w02.f8355f;
        this.f1941n = pVar;
        this.f1940m = pVar.f3046a;
        this.f1942o = null;
        C0118a c0118a = (C0118a) w02.f8353d;
        this.f1945r = c0118a;
        this.f1946s = (Q1.r) c0118a.f1801g;
        WorkDatabase workDatabase = (WorkDatabase) w02.f8354e;
        this.f1948u = workDatabase;
        this.f1949v = workDatabase.t();
        this.f1950w = workDatabase.f();
        this.f1951x = (ArrayList) w02.f8356g;
    }

    public final void a(Q1.o oVar) {
        boolean z4 = oVar instanceof Q1.n;
        Z1.p pVar = this.f1941n;
        String str = f1936C;
        if (!z4) {
            if (oVar instanceof Q1.m) {
                Q1.q.d().e(str, "Worker result RETRY for " + this.y);
                c();
                return;
            }
            Q1.q.d().e(str, "Worker result FAILURE for " + this.y);
            if (pVar.d()) {
                d();
                return;
            } else {
                g();
                return;
            }
        }
        Q1.q.d().e(str, "Worker result SUCCESS for " + this.y);
        if (pVar.d()) {
            d();
            return;
        }
        Z1.c cVar = this.f1950w;
        String str2 = this.f1940m;
        Z1.q qVar = this.f1949v;
        WorkDatabase workDatabase = this.f1948u;
        workDatabase.c();
        try {
            qVar.s(str2, 3);
            qVar.r(str2, ((Q1.n) this.f1944q).f1831a);
            this.f1946s.getClass();
            long jCurrentTimeMillis = System.currentTimeMillis();
            for (String str3 : cVar.g(str2)) {
                if (qVar.j(str3) == 5) {
                    s1.j jVarC = s1.j.c("SELECT COUNT(*)=0 FROM dependency WHERE work_spec_id=? AND prerequisite_id IN (SELECT id FROM workspec WHERE state!=2)", 1);
                    if (str3 == null) {
                        jVarC.g(1);
                    } else {
                        jVarC.h(str3, 1);
                    }
                    WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) cVar.f2996l;
                    workDatabase_Impl.b();
                    Cursor cursorL0 = C.l0(workDatabase_Impl, jVarC, false);
                    try {
                        if (cursorL0.moveToFirst() && cursorL0.getInt(0) != 0) {
                            Q1.q.d().e(str, "Setting status to enqueued for " + str3);
                            qVar.s(str3, 1);
                            qVar.q(str3, jCurrentTimeMillis);
                        }
                    } finally {
                        cursorL0.close();
                        jVarC.f();
                    }
                }
            }
            workDatabase.o();
            workDatabase.k();
            e(false);
        } catch (Throwable th) {
            workDatabase.k();
            e(false);
            throw th;
        }
    }

    public final void b() {
        if (h()) {
            return;
        }
        this.f1948u.c();
        try {
            int iJ = this.f1949v.j(this.f1940m);
            this.f1948u.s().n(this.f1940m);
            if (iJ == 0) {
                e(false);
            } else if (iJ == 2) {
                a(this.f1944q);
            } else if (!AbstractC0307a.b(iJ)) {
                this.f1938B = -512;
                c();
            }
            this.f1948u.o();
            this.f1948u.k();
        } catch (Throwable th) {
            this.f1948u.k();
            throw th;
        }
    }

    public final void c() {
        String str = this.f1940m;
        Z1.q qVar = this.f1949v;
        WorkDatabase workDatabase = this.f1948u;
        workDatabase.c();
        try {
            qVar.s(str, 1);
            this.f1946s.getClass();
            qVar.q(str, System.currentTimeMillis());
            qVar.p(str, this.f1941n.f3066v);
            qVar.o(str, -1L);
            workDatabase.o();
        } finally {
            workDatabase.k();
            e(true);
        }
    }

    public final void d() {
        String str = this.f1940m;
        Z1.q qVar = this.f1949v;
        WorkDatabase workDatabase = this.f1948u;
        workDatabase.c();
        try {
            this.f1946s.getClass();
            qVar.q(str, System.currentTimeMillis());
            qVar.s(str, 1);
            WorkDatabase_Impl workDatabase_Impl = qVar.f3068a;
            workDatabase_Impl.b();
            Z1.h hVar = qVar.f3077k;
            y1.h hVarA = hVar.a();
            if (str == null) {
                hVarA.g(1);
            } else {
                hVarA.h(str, 1);
            }
            workDatabase_Impl.c();
            try {
                hVarA.a();
                workDatabase_Impl.o();
                workDatabase_Impl.k();
                hVar.j(hVarA);
                qVar.p(str, this.f1941n.f3066v);
                workDatabase_Impl.b();
                Z1.h hVar2 = qVar.f3074g;
                y1.h hVarA2 = hVar2.a();
                if (str == null) {
                    hVarA2.g(1);
                } else {
                    hVarA2.h(str, 1);
                }
                workDatabase_Impl.c();
                try {
                    hVarA2.a();
                    workDatabase_Impl.o();
                    workDatabase_Impl.k();
                    hVar2.j(hVarA2);
                    qVar.o(str, -1L);
                    workDatabase.o();
                } catch (Throwable th) {
                    workDatabase_Impl.k();
                    hVar2.j(hVarA2);
                    throw th;
                }
            } catch (Throwable th2) {
                workDatabase_Impl.k();
                hVar.j(hVarA);
                throw th2;
            }
        } finally {
            workDatabase.k();
            e(false);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e(boolean r6) {
        /*
            r5 = this;
            androidx.work.impl.WorkDatabase r0 = r5.f1948u
            r0.c()
            androidx.work.impl.WorkDatabase r0 = r5.f1948u     // Catch: java.lang.Throwable -> L40
            Z1.q r0 = r0.t()     // Catch: java.lang.Throwable -> L40
            r0.getClass()     // Catch: java.lang.Throwable -> L40
            java.lang.String r1 = "SELECT COUNT(*) > 0 FROM workspec WHERE state NOT IN (2, 3, 5) LIMIT 1"
            r2 = 0
            s1.j r1 = s1.j.c(r1, r2)     // Catch: java.lang.Throwable -> L40
            androidx.work.impl.WorkDatabase_Impl r0 = r0.f3068a     // Catch: java.lang.Throwable -> L40
            r0.b()     // Catch: java.lang.Throwable -> L40
            android.database.Cursor r0 = Q1.C.l0(r0, r1, r2)     // Catch: java.lang.Throwable -> L40
            boolean r3 = r0.moveToFirst()     // Catch: java.lang.Throwable -> L2d
            r4 = 1
            if (r3 == 0) goto L2f
            int r3 = r0.getInt(r2)     // Catch: java.lang.Throwable -> L2d
            if (r3 == 0) goto L2f
            r3 = r4
            goto L30
        L2d:
            r6 = move-exception
            goto L71
        L2f:
            r3 = r2
        L30:
            r0.close()     // Catch: java.lang.Throwable -> L40
            r1.f()     // Catch: java.lang.Throwable -> L40
            if (r3 != 0) goto L42
            android.content.Context r0 = r5.f1939l     // Catch: java.lang.Throwable -> L40
            java.lang.Class<androidx.work.impl.background.systemalarm.RescheduleReceiver> r1 = androidx.work.impl.background.systemalarm.RescheduleReceiver.class
            a2.n.a(r0, r1, r2)     // Catch: java.lang.Throwable -> L40
            goto L42
        L40:
            r6 = move-exception
            goto L78
        L42:
            if (r6 == 0) goto L5d
            Z1.q r0 = r5.f1949v     // Catch: java.lang.Throwable -> L40
            java.lang.String r1 = r5.f1940m     // Catch: java.lang.Throwable -> L40
            r0.s(r1, r4)     // Catch: java.lang.Throwable -> L40
            Z1.q r0 = r5.f1949v     // Catch: java.lang.Throwable -> L40
            java.lang.String r1 = r5.f1940m     // Catch: java.lang.Throwable -> L40
            int r2 = r5.f1938B     // Catch: java.lang.Throwable -> L40
            r0.t(r1, r2)     // Catch: java.lang.Throwable -> L40
            Z1.q r0 = r5.f1949v     // Catch: java.lang.Throwable -> L40
            java.lang.String r1 = r5.f1940m     // Catch: java.lang.Throwable -> L40
            r2 = -1
            r0.o(r1, r2)     // Catch: java.lang.Throwable -> L40
        L5d:
            androidx.work.impl.WorkDatabase r0 = r5.f1948u     // Catch: java.lang.Throwable -> L40
            r0.o()     // Catch: java.lang.Throwable -> L40
            androidx.work.impl.WorkDatabase r0 = r5.f1948u
            r0.k()
            b2.k r0 = r5.f1952z
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r6)
            r0.j(r6)
            return
        L71:
            r0.close()     // Catch: java.lang.Throwable -> L40
            r1.f()     // Catch: java.lang.Throwable -> L40
            throw r6     // Catch: java.lang.Throwable -> L40
        L78:
            androidx.work.impl.WorkDatabase r0 = r5.f1948u
            r0.k()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: R1.u.e(boolean):void");
    }

    public final void f() {
        Z1.q qVar = this.f1949v;
        String str = this.f1940m;
        int iJ = qVar.j(str);
        String str2 = f1936C;
        if (iJ == 2) {
            Q1.q.d().a(str2, "Status for " + str + " is RUNNING; not doing any work and rescheduling for later execution");
            e(true);
            return;
        }
        Q1.q qVarD = Q1.q.d();
        StringBuilder sbM = AbstractC0307a.m("Status for ", str, " is ");
        sbM.append(AbstractC0307a.x(iJ));
        sbM.append(" ; not doing any work");
        qVarD.a(str2, sbM.toString());
        e(false);
    }

    public final void g() {
        String str = this.f1940m;
        WorkDatabase workDatabase = this.f1948u;
        workDatabase.c();
        try {
            LinkedList linkedList = new LinkedList();
            linkedList.add(str);
            while (true) {
                boolean zIsEmpty = linkedList.isEmpty();
                Z1.q qVar = this.f1949v;
                if (zIsEmpty) {
                    Q1.g gVar = ((Q1.l) this.f1944q).f1830a;
                    qVar.p(str, this.f1941n.f3066v);
                    qVar.r(str, gVar);
                    workDatabase.o();
                    return;
                }
                String str2 = (String) linkedList.remove();
                if (qVar.j(str2) != 6) {
                    qVar.s(str2, 4);
                }
                linkedList.addAll(this.f1950w.g(str2));
            }
        } finally {
            workDatabase.k();
            e(false);
        }
    }

    public final boolean h() {
        if (this.f1938B == -256) {
            return false;
        }
        Q1.q.d().a(f1936C, "Work interrupted for " + this.y);
        if (this.f1949v.j(this.f1940m) == 0) {
            e(false);
        } else {
            e(!AbstractC0307a.b(r0));
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01d0  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            Method dump skipped, instruction units count: 679
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: R1.u.run():void");
    }
}

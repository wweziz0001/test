package S1;

import A.n;
import Q1.C0118a;
import Q1.C0121d;
import Q1.q;
import Q1.r;
import R1.f;
import R1.h;
import R1.k;
import V1.e;
import V3.J;
import V3.P;
import Z1.i;
import Z1.j;
import Z1.l;
import Z1.p;
import a2.o;
import android.content.Context;
import android.os.Handler;
import android.text.TextUtils;
import java.util.HashMap;
import java.util.HashSet;

/* JADX INFO: loaded from: classes.dex */
public final class c implements h, e, R1.c {

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final String f2003z = q.f("GreedyScheduler");

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Context f2004l;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final a f2006n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f2007o;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final f f2010r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final l f2011s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final C0118a f2012t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public Boolean f2014v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final V1.h f2015w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final i f2016x;
    public final d y;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final HashMap f2005m = new HashMap();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final Object f2008p = new Object();

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final Z1.e f2009q = new Z1.e(5, (byte) 0);

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final HashMap f2013u = new HashMap();

    public c(Context context, C0118a c0118a, i iVar, f fVar, l lVar, i iVar2) {
        this.f2004l = context;
        r rVar = (r) c0118a.f1801g;
        B0.d dVar = (B0.d) c0118a.f1803j;
        this.f2006n = new a(this, dVar, rVar);
        this.y = new d(dVar, lVar);
        this.f2016x = iVar2;
        this.f2015w = new V1.h(iVar);
        this.f2012t = c0118a;
        this.f2010r = fVar;
        this.f2011s = lVar;
    }

    @Override // R1.h
    public final void a(String str) {
        Runnable runnable;
        if (this.f2014v == null) {
            this.f2014v = Boolean.valueOf(o.a(this.f2004l, this.f2012t));
        }
        boolean zBooleanValue = this.f2014v.booleanValue();
        String str2 = f2003z;
        if (!zBooleanValue) {
            q.d().e(str2, "Ignoring schedule request in non-main process");
            return;
        }
        if (!this.f2007o) {
            this.f2010r.a(this);
            this.f2007o = true;
        }
        q.d().a(str2, "Cancelling work ID " + str);
        a aVar = this.f2006n;
        if (aVar != null && (runnable = (Runnable) aVar.f2000d.remove(str)) != null) {
            ((Handler) aVar.f1998b.f190l).removeCallbacks(runnable);
        }
        for (k kVar : this.f2009q.u(str)) {
            this.y.a(kVar);
            l lVar = this.f2011s;
            lVar.getClass();
            lVar.e0(kVar, -512);
        }
    }

    @Override // R1.h
    public final void b(p... pVarArr) {
        long jMax;
        if (this.f2014v == null) {
            this.f2014v = Boolean.valueOf(o.a(this.f2004l, this.f2012t));
        }
        if (!this.f2014v.booleanValue()) {
            q.d().e(f2003z, "Ignoring schedule request in a secondary process");
            return;
        }
        int i = 1;
        if (!this.f2007o) {
            this.f2010r.a(this);
            this.f2007o = true;
        }
        HashSet<p> hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        int length = pVarArr.length;
        int i5 = 0;
        while (i5 < length) {
            p pVar = pVarArr[i5];
            if (!this.f2009q.g(D1.b.z(pVar))) {
                synchronized (this.f2008p) {
                    try {
                        j jVarZ = D1.b.z(pVar);
                        b bVar = (b) this.f2013u.get(jVarZ);
                        if (bVar == null) {
                            int i6 = pVar.f3055k;
                            ((r) this.f2012t.f1801g).getClass();
                            bVar = new b(System.currentTimeMillis(), i6);
                            this.f2013u.put(jVarZ, bVar);
                        }
                        jMax = (((long) Math.max((pVar.f3055k - bVar.f2001a) - 5, 0)) * 30000) + bVar.f2002b;
                    } finally {
                    }
                }
                long jMax2 = Math.max(pVar.a(), jMax);
                ((r) this.f2012t.f1801g).getClass();
                long jCurrentTimeMillis = System.currentTimeMillis();
                if (pVar.f3047b == i) {
                    if (jCurrentTimeMillis < jMax2) {
                        a aVar = this.f2006n;
                        if (aVar != null) {
                            HashMap map = aVar.f2000d;
                            Runnable runnable = (Runnable) map.remove(pVar.f3046a);
                            B0.d dVar = aVar.f1998b;
                            if (runnable != null) {
                                ((Handler) dVar.f190l).removeCallbacks(runnable);
                            }
                            A.a aVar2 = new A.a(aVar, pVar, 5, false);
                            map.put(pVar.f3046a, aVar2);
                            aVar.f1999c.getClass();
                            ((Handler) dVar.f190l).postDelayed(aVar2, jMax2 - System.currentTimeMillis());
                        }
                    } else if (pVar.c()) {
                        C0121d c0121d = pVar.f3054j;
                        if (c0121d.f1810c) {
                            q.d().a(f2003z, "Ignoring " + pVar + ". Requires device idle.");
                        } else if (c0121d.f1815h.isEmpty()) {
                            hashSet.add(pVar);
                            hashSet2.add(pVar.f3046a);
                        } else {
                            q.d().a(f2003z, "Ignoring " + pVar + ". Requires ContentUri triggers.");
                        }
                    } else if (!this.f2009q.g(D1.b.z(pVar))) {
                        q.d().a(f2003z, "Starting work for " + pVar.f3046a);
                        Z1.e eVar = this.f2009q;
                        eVar.getClass();
                        k kVarV = eVar.v(D1.b.z(pVar));
                        this.y.b(kVarV);
                        l lVar = this.f2011s;
                        ((i) lVar.f3021m).h(new n((f) lVar.f3020l, kVarV, (r) null));
                    }
                }
            }
            i5++;
            i = 1;
        }
        synchronized (this.f2008p) {
            try {
                if (!hashSet.isEmpty()) {
                    String strJoin = TextUtils.join(",", hashSet2);
                    q.d().a(f2003z, "Starting tracking for " + strJoin);
                    for (p pVar2 : hashSet) {
                        j jVarZ2 = D1.b.z(pVar2);
                        if (!this.f2005m.containsKey(jVarZ2)) {
                            this.f2005m.put(jVarZ2, V1.k.a(this.f2015w, pVar2, (J) this.f2016x.f3013m, this));
                        }
                    }
                }
            } finally {
            }
        }
    }

    @Override // R1.c
    public final void c(j jVar, boolean z4) {
        P p4;
        k kVarT = this.f2009q.t(jVar);
        if (kVarT != null) {
            this.y.a(kVarT);
        }
        synchronized (this.f2008p) {
            p4 = (P) this.f2005m.remove(jVar);
        }
        if (p4 != null) {
            q.d().a(f2003z, "Stopping tracking for " + jVar);
            p4.b(null);
        }
        if (z4) {
            return;
        }
        synchronized (this.f2008p) {
            this.f2013u.remove(jVar);
        }
    }

    @Override // R1.h
    public final boolean d() {
        return false;
    }

    @Override // V1.e
    public final void e(p pVar, V1.c cVar) {
        j jVarZ = D1.b.z(pVar);
        boolean z4 = cVar instanceof V1.a;
        l lVar = this.f2011s;
        d dVar = this.y;
        String str = f2003z;
        Z1.e eVar = this.f2009q;
        if (z4) {
            if (eVar.g(jVarZ)) {
                return;
            }
            q.d().a(str, "Constraints met: Scheduling work ID " + jVarZ);
            k kVarV = eVar.v(jVarZ);
            dVar.b(kVarV);
            ((i) lVar.f3021m).h(new n((f) lVar.f3020l, kVarV, (r) null));
            return;
        }
        q.d().a(str, "Constraints not met: Cancelling work ID " + jVarZ);
        k kVarT = eVar.t(jVarZ);
        if (kVarT != null) {
            dVar.a(kVarT);
            int i = ((V1.b) cVar).f2351a;
            lVar.getClass();
            lVar.e0(kVarT, i);
        }
    }
}

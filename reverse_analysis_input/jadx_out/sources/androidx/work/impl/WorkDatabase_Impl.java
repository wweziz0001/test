package androidx.work.impl;

import B0.d;
import Z1.b;
import Z1.c;
import Z1.e;
import Z1.h;
import Z1.i;
import Z1.l;
import Z1.m;
import Z1.q;
import Z1.s;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import s1.C0786b;
import s1.f;
import x1.C0985a;
import x1.InterfaceC0987c;

/* JADX INFO: loaded from: classes.dex */
public final class WorkDatabase_Impl extends WorkDatabase {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public volatile q f4792k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public volatile c f4793l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public volatile s f4794m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public volatile i f4795n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public volatile l f4796o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public volatile m f4797p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public volatile e f4798q;

    @Override // androidx.work.impl.WorkDatabase
    public final f d() {
        return new f(this, new HashMap(0), new HashMap(0), "Dependency", "WorkSpec", "WorkTag", "SystemIdInfo", "WorkName", "WorkProgress", "Preference");
    }

    @Override // androidx.work.impl.WorkDatabase
    public final InterfaceC0987c e(C0786b c0786b) {
        d dVar = new d(this);
        D0.d dVar2 = new D0.d(20, false);
        dVar2.f395m = c0786b;
        dVar2.f396n = dVar;
        return c0786b.f9558c.d(new C0985a(c0786b.f9556a, c0786b.f9557b, dVar2, false, false));
    }

    @Override // androidx.work.impl.WorkDatabase
    public final c f() {
        c cVar;
        if (this.f4793l != null) {
            return this.f4793l;
        }
        synchronized (this) {
            try {
                if (this.f4793l == null) {
                    c cVar2 = new c();
                    cVar2.f2996l = this;
                    cVar2.f2997m = new b(this, 0);
                    this.f4793l = cVar2;
                }
                cVar = this.f4793l;
            } catch (Throwable th) {
                throw th;
            }
        }
        return cVar;
    }

    @Override // androidx.work.impl.WorkDatabase
    public final List g(LinkedHashMap linkedHashMap) {
        int i = 14;
        int i5 = 13;
        int i6 = 17;
        int i7 = 18;
        return Arrays.asList(new R1.d(i5, i, 10), new R1.d(11), new R1.d(16, i6, 12), new R1.d(i6, i7, i5), new R1.d(i7, 19, i), new R1.d(15));
    }

    @Override // androidx.work.impl.WorkDatabase
    public final Set i() {
        return new HashSet();
    }

    @Override // androidx.work.impl.WorkDatabase
    public final Map j() {
        HashMap map = new HashMap();
        map.put(q.class, Collections.emptyList());
        map.put(c.class, Collections.emptyList());
        map.put(s.class, Collections.emptyList());
        map.put(i.class, Collections.emptyList());
        map.put(l.class, Collections.emptyList());
        map.put(m.class, Collections.emptyList());
        map.put(e.class, Collections.emptyList());
        map.put(Z1.f.class, Collections.emptyList());
        return map;
    }

    @Override // androidx.work.impl.WorkDatabase
    public final e l() {
        e eVar;
        if (this.f4798q != null) {
            return this.f4798q;
        }
        synchronized (this) {
            try {
                if (this.f4798q == null) {
                    this.f4798q = new e(this);
                }
                eVar = this.f4798q;
            } catch (Throwable th) {
                throw th;
            }
        }
        return eVar;
    }

    @Override // androidx.work.impl.WorkDatabase
    public final i p() {
        i iVar;
        if (this.f4795n != null) {
            return this.f4795n;
        }
        synchronized (this) {
            try {
                if (this.f4795n == null) {
                    i iVar2 = new i();
                    iVar2.f3012l = this;
                    iVar2.f3013m = new b(this, 2);
                    iVar2.f3014n = new h(this, 0);
                    iVar2.f3015o = new h(this, 1);
                    this.f4795n = iVar2;
                }
                iVar = this.f4795n;
            } catch (Throwable th) {
                throw th;
            }
        }
        return iVar;
    }

    @Override // androidx.work.impl.WorkDatabase
    public final l r() {
        l lVar;
        if (this.f4796o != null) {
            return this.f4796o;
        }
        synchronized (this) {
            try {
                if (this.f4796o == null) {
                    l lVar2 = new l();
                    lVar2.f3020l = this;
                    lVar2.f3021m = new b(this, 3);
                    this.f4796o = lVar2;
                }
                lVar = this.f4796o;
            } catch (Throwable th) {
                throw th;
            }
        }
        return lVar;
    }

    @Override // androidx.work.impl.WorkDatabase
    public final m s() {
        m mVar;
        if (this.f4797p != null) {
            return this.f4797p;
        }
        synchronized (this) {
            try {
                if (this.f4797p == null) {
                    this.f4797p = new m(this);
                }
                mVar = this.f4797p;
            } catch (Throwable th) {
                throw th;
            }
        }
        return mVar;
    }

    @Override // androidx.work.impl.WorkDatabase
    public final q t() {
        q qVar;
        if (this.f4792k != null) {
            return this.f4792k;
        }
        synchronized (this) {
            try {
                if (this.f4792k == null) {
                    this.f4792k = new q(this);
                }
                qVar = this.f4792k;
            } catch (Throwable th) {
                throw th;
            }
        }
        return qVar;
    }

    @Override // androidx.work.impl.WorkDatabase
    public final s u() {
        s sVar;
        if (this.f4794m != null) {
            return this.f4794m;
        }
        synchronized (this) {
            try {
                if (this.f4794m == null) {
                    this.f4794m = new s(this);
                }
                sVar = this.f4794m;
            } catch (Throwable th) {
                throw th;
            }
        }
        return sVar;
    }
}

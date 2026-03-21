package x0;

import a0.AbstractC0169U;
import a0.C0150A;
import a0.C0153D;
import a0.C0194t;
import a0.C0195u;
import a0.C0196v;
import a0.C0197w;
import a0.C0198x;
import android.net.Uri;
import android.os.Handler;
import android.util.Pair;
import d0.AbstractC0360m;
import d0.AbstractC0370w;
import d0.C0354g;
import f0.InterfaceC0403A;
import h0.AbstractC0450a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import m2.C0640G;

/* JADX INFO: renamed from: x0.s, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0977s extends AbstractC0970k {

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public static final C0150A f10783G;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final HashMap f10784A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final HashSet f10785B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final boolean f10786C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public boolean f10787D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public HashSet f10788E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public j0 f10789F;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final ArrayList f10790v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final HashSet f10791w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public Handler f10792x;
    public final ArrayList y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final IdentityHashMap f10793z;

    static {
        F0.u uVar = new F0.u();
        C0640G c0640g = m2.I.f8549m;
        m2.b0 b0Var = m2.b0.f8583p;
        List listEmptyList = Collections.emptyList();
        m2.b0 b0Var2 = m2.b0.f8583p;
        C0195u c0195u = new C0195u();
        C0198x c0198x = C0198x.f3466a;
        Uri uri = Uri.EMPTY;
        f10783G = new C0150A("", new C0194t(uVar), uri != null ? new C0197w(uri, null, null, listEmptyList, b0Var2, null, -9223372036854775807L) : null, new C0196v(c0195u), C0153D.f3185B, c0198x);
    }

    public C0977s(boolean z4, j0 j0Var, J... jArr) {
        for (J j5 : jArr) {
            j5.getClass();
        }
        i0 i0Var = (i0) j0Var;
        this.f10789F = i0Var.f10721b.length > 0 ? i0Var.a() : j0Var;
        this.f10793z = new IdentityHashMap();
        this.f10784A = new HashMap();
        ArrayList arrayList = new ArrayList();
        this.f10790v = arrayList;
        this.y = new ArrayList();
        this.f10788E = new HashSet();
        this.f10791w = new HashSet();
        this.f10785B = new HashSet();
        this.f10786C = z4;
        List listAsList = Arrays.asList(jArr);
        synchronized (this) {
            D(arrayList.size(), listAsList, null, null);
        }
    }

    public final synchronized void B(int i, List list, Handler handler, com.ryanheise.just_audio.a aVar) {
        D(i, list, handler, aVar);
    }

    public final void C(int i, Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            C0976q c0976q = (C0976q) it.next();
            int i5 = i + 1;
            ArrayList arrayList = this.y;
            if (i > 0) {
                C0976q c0976q2 = (C0976q) arrayList.get(i - 1);
                int iO = c0976q2.f10769a.f10530z.f10811b.o() + c0976q2.f10773e;
                c0976q.f10772d = i;
                c0976q.f10773e = iO;
                c0976q.f10774f = false;
                c0976q.f10771c.clear();
            } else {
                c0976q.f10772d = i;
                c0976q.f10773e = 0;
                c0976q.f10774f = false;
                c0976q.f10771c.clear();
            }
            E(i, 1, c0976q.f10769a.f10530z.f10811b.o());
            arrayList.add(i, c0976q);
            this.f10784A.put(c0976q.f10770b, c0976q);
            A(c0976q, c0976q.f10769a);
            if (this.f10635m.isEmpty() || !this.f10793z.isEmpty()) {
                C0969j c0969j = (C0969j) this.f10726s.get(c0976q);
                c0969j.getClass();
                ((AbstractC0960a) c0969j.f10723a).j(c0969j.f10724b);
            } else {
                this.f10785B.add(c0976q);
            }
            i = i5;
        }
    }

    public final void D(int i, List list, Handler handler, com.ryanheise.just_audio.a aVar) {
        AbstractC0360m.c((handler == null) == (aVar == null));
        Handler handler2 = this.f10792x;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((J) it.next()).getClass();
        }
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList.add(new C0976q((J) it2.next(), this.f10786C));
        }
        this.f10790v.addAll(i, arrayList);
        if (handler2 != null && !list.isEmpty()) {
            handler2.obtainMessage(1, new r(i, arrayList, F(handler, aVar))).sendToTarget();
        } else {
            if (aVar == null || handler == null) {
                return;
            }
            handler.post(aVar);
        }
    }

    public final void E(int i, int i5, int i6) {
        while (true) {
            ArrayList arrayList = this.y;
            if (i >= arrayList.size()) {
                return;
            }
            C0976q c0976q = (C0976q) arrayList.get(i);
            c0976q.f10772d += i5;
            c0976q.f10773e += i6;
            i++;
        }
    }

    public final C0975p F(Handler handler, Runnable runnable) {
        if (handler == null || runnable == null) {
            return null;
        }
        C0975p c0975p = new C0975p(handler, runnable);
        this.f10791w.add(c0975p);
        return c0975p;
    }

    public final void G() {
        Iterator it = this.f10785B.iterator();
        while (it.hasNext()) {
            C0976q c0976q = (C0976q) it.next();
            if (c0976q.f10771c.isEmpty()) {
                C0969j c0969j = (C0969j) this.f10726s.get(c0976q);
                c0969j.getClass();
                ((AbstractC0960a) c0969j.f10723a).j(c0969j.f10724b);
                it.remove();
            }
        }
    }

    public final synchronized void H(Set set) {
        try {
            Iterator it = set.iterator();
            while (it.hasNext()) {
                C0975p c0975p = (C0975p) it.next();
                c0975p.f10764a.post(c0975p.f10765b);
            }
            this.f10791w.removeAll(set);
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void I(int i, int i5, Handler handler, com.ryanheise.just_audio.a aVar) {
        AbstractC0360m.c(handler != null);
        Handler handler2 = this.f10792x;
        ArrayList arrayList = this.f10790v;
        arrayList.add(i5, (C0976q) arrayList.remove(i));
        if (handler2 != null) {
            handler2.obtainMessage(3, new r(i, Integer.valueOf(i5), F(handler, aVar))).sendToTarget();
        } else if (handler != null) {
            handler.post(aVar);
        }
    }

    public final synchronized void J(int i, int i5, Handler handler, com.ryanheise.just_audio.a aVar) {
        AbstractC0360m.c(handler != null);
        Handler handler2 = this.f10792x;
        AbstractC0370w.R(this.f10790v, i, i5);
        if (handler2 != null) {
            handler2.obtainMessage(2, new r(i, Integer.valueOf(i5), F(handler, aVar))).sendToTarget();
        } else if (handler != null) {
            handler.post(aVar);
        }
    }

    public final void K(C0975p c0975p) {
        if (!this.f10787D) {
            Handler handler = this.f10792x;
            handler.getClass();
            handler.obtainMessage(5).sendToTarget();
            this.f10787D = true;
        }
        if (c0975p != null) {
            this.f10788E.add(c0975p);
        }
    }

    public final void L(j0 j0Var) {
        int size;
        Handler handler = this.f10792x;
        if (handler == null) {
            i0 i0Var = (i0) j0Var;
            if (i0Var.f10721b.length > 0) {
                j0Var = i0Var.a();
            }
            this.f10789F = j0Var;
            return;
        }
        synchronized (this) {
            size = this.f10790v.size();
        }
        i0 i0Var2 = (i0) j0Var;
        if (i0Var2.f10721b.length != size) {
            j0Var = i0Var2.a().b(0, size);
        }
        handler.obtainMessage(4, new r(0, j0Var, null)).sendToTarget();
    }

    public final synchronized void M(j0 j0Var) {
        L(j0Var);
    }

    public final void N() {
        this.f10787D = false;
        HashSet hashSet = this.f10788E;
        this.f10788E = new HashSet();
        r(new C0973n(this.y, this.f10789F));
        Handler handler = this.f10792x;
        handler.getClass();
        handler.obtainMessage(6, hashSet).sendToTarget();
    }

    @Override // x0.J
    public final C0150A a() {
        return f10783G;
    }

    @Override // x0.J
    public final F c(H h2, B0.f fVar, long j5) {
        int i = AbstractC0450a.f6086d;
        Pair pair = (Pair) h2.f10531a;
        Object obj = pair.first;
        H hA = h2.a(pair.second);
        C0976q c0976q = (C0976q) this.f10784A.get(obj);
        if (c0976q == null) {
            c0976q = new C0976q(new C0974o(), this.f10786C);
            c0976q.f10774f = true;
            A(c0976q, c0976q.f10769a);
        }
        this.f10785B.add(c0976q);
        C0969j c0969j = (C0969j) this.f10726s.get(c0976q);
        c0969j.getClass();
        ((AbstractC0960a) c0969j.f10723a).l(c0969j.f10724b);
        c0976q.f10771c.add(hA);
        C0955A c0955aE = c0976q.f10769a.c(hA, fVar, j5);
        this.f10793z.put(c0955aE, c0976q);
        G();
        return c0955aE;
    }

    @Override // x0.J
    public final void d(F f2) {
        IdentityHashMap identityHashMap = this.f10793z;
        C0976q c0976q = (C0976q) identityHashMap.remove(f2);
        c0976q.getClass();
        c0976q.f10769a.d(f2);
        ArrayList arrayList = c0976q.f10771c;
        arrayList.remove(((C0955A) f2).f10513l);
        if (!identityHashMap.isEmpty()) {
            G();
        }
        if (c0976q.f10774f && arrayList.isEmpty()) {
            this.f10785B.remove(c0976q);
            C0969j c0969j = (C0969j) this.f10726s.remove(c0976q);
            c0969j.getClass();
            C0967h c0967h = c0969j.f10724b;
            AbstractC0960a abstractC0960a = (AbstractC0960a) c0969j.f10723a;
            abstractC0960a.s(c0967h);
            C0968i c0968i = c0969j.f10725c;
            abstractC0960a.v(c0968i);
            abstractC0960a.u(c0968i);
        }
    }

    @Override // x0.J
    public final synchronized AbstractC0169U g() {
        try {
        } catch (Throwable th) {
            throw th;
        }
        return new C0973n(this.f10790v, ((i0) this.f10789F).f10721b.length != this.f10790v.size() ? ((i0) this.f10789F).a().b(0, this.f10790v.size()) : this.f10789F);
    }

    @Override // x0.AbstractC0970k, x0.AbstractC0960a
    public final void k() {
        super.k();
        this.f10785B.clear();
    }

    @Override // x0.AbstractC0960a
    public final synchronized void p(InterfaceC0403A interfaceC0403A) {
        try {
            this.f10728u = interfaceC0403A;
            this.f10727t = AbstractC0370w.m(null);
            this.f10792x = new Handler(new C0354g(this, 1));
            if (this.f10790v.isEmpty()) {
                N();
            } else {
                this.f10789F = ((i0) this.f10789F).b(0, this.f10790v.size());
                C(0, this.f10790v);
                K(null);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // x0.AbstractC0970k, x0.AbstractC0960a
    public final synchronized void t() {
        try {
            super.t();
            this.y.clear();
            this.f10785B.clear();
            this.f10784A.clear();
            this.f10789F = ((i0) this.f10789F).a();
            Handler handler = this.f10792x;
            if (handler != null) {
                handler.removeCallbacksAndMessages(null);
                this.f10792x = null;
            }
            this.f10787D = false;
            this.f10788E.clear();
            H(this.f10791w);
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // x0.AbstractC0970k
    public final H w(Object obj, H h2) {
        C0976q c0976q = (C0976q) obj;
        for (int i = 0; i < c0976q.f10771c.size(); i++) {
            if (((H) c0976q.f10771c.get(i)).f10534d == h2.f10534d) {
                Object obj2 = c0976q.f10770b;
                int i5 = AbstractC0450a.f6086d;
                return h2.a(Pair.create(obj2, h2.f10531a));
            }
        }
        return null;
    }

    @Override // x0.AbstractC0970k
    public final int y(int i, Object obj) {
        return i + ((C0976q) obj).f10773e;
    }

    @Override // x0.AbstractC0970k
    public final void z(Object obj, AbstractC0960a abstractC0960a, AbstractC0169U abstractC0169U) {
        C0976q c0976q = (C0976q) obj;
        int i = c0976q.f10772d + 1;
        ArrayList arrayList = this.y;
        if (i < arrayList.size()) {
            int iO = abstractC0169U.o() - (((C0976q) arrayList.get(c0976q.f10772d + 1)).f10773e - c0976q.f10773e);
            if (iO != 0) {
                E(c0976q.f10772d + 1, 0, iO);
            }
        }
        K(null);
    }

    @Override // x0.AbstractC0970k, x0.AbstractC0960a
    public final void m() {
    }
}

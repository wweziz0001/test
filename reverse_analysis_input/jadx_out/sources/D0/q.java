package D0;

import a0.AbstractC0156G;
import a0.C0189o;
import a0.C0190p;
import a0.e0;
import android.content.Context;
import android.os.SystemClock;
import android.util.Pair;
import androidx.datastore.preferences.protobuf.C0219k;
import d0.AbstractC0360m;
import d0.AbstractC0370w;
import d0.C0365r;
import d0.C0367t;
import h0.C0446E;
import java.util.NoSuchElementException;
import java.util.concurrent.CopyOnWriteArraySet;
import m2.I;

/* JADX INFO: loaded from: classes.dex */
public final class q {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final j f474o = new j(0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m f475a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final s f476b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final w f477c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final p f478d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final I f479e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Z1.l f480f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final C0365r f481g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final CopyOnWriteArraySet f482h;
    public C0190p i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public C0446E f483j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public C0367t f484k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Pair f485l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f486m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f487n;

    public q(k kVar) {
        m mVar = new m(this, (Context) kVar.f451b);
        this.f475a = mVar;
        C0365r c0365r = (C0365r) kVar.f456g;
        this.f481g = c0365r;
        s sVar = (s) kVar.f452c;
        this.f476b = sVar;
        sVar.f499k = c0365r;
        w wVar = new w(new B0.d(this), sVar);
        this.f477c = wVar;
        p pVar = (p) kVar.f454e;
        AbstractC0360m.i(pVar);
        this.f478d = pVar;
        this.f479e = (I) kVar.f455f;
        Z1.l lVar = new Z1.l();
        lVar.f3020l = sVar;
        lVar.f3021m = wVar;
        new C0190p(new C0189o());
        this.f480f = lVar;
        CopyOnWriteArraySet copyOnWriteArraySet = new CopyOnWriteArraySet();
        this.f482h = copyOnWriteArraySet;
        this.f487n = 0;
        copyOnWriteArraySet.add(mVar);
    }

    public static void a(q qVar, long j5, long j6) {
        w wVar = qVar.f477c;
        C0219k c0219k = wVar.f529f;
        int i = c0219k.f4173c;
        if (i == 0) {
            return;
        }
        if (i == 0) {
            throw new NoSuchElementException();
        }
        long j7 = ((long[]) c0219k.f4175e)[c0219k.f4172b];
        Long l3 = (Long) wVar.f528e.g(j7);
        s sVar = wVar.f525b;
        if (l3 != null && l3.longValue() != wVar.i) {
            wVar.i = l3.longValue();
            sVar.d(2);
        }
        int iA = wVar.f525b.a(j7, j5, j6, wVar.i, false, wVar.f526c);
        q qVar2 = (q) wVar.f524a.f190l;
        if (iA != 0 && iA != 1) {
            if (iA != 2 && iA != 3 && iA != 4) {
                if (iA != 5) {
                    throw new IllegalStateException(String.valueOf(iA));
                }
                return;
            }
            wVar.f532j = j7;
            c0219k.P();
            for (m mVar : qVar2.f482h) {
                mVar.f470m.execute(new l(mVar, mVar.f469l, 2));
            }
            AbstractC0360m.i(null);
            throw null;
        }
        wVar.f532j = j7;
        long jP = c0219k.P();
        e0 e0Var = (e0) wVar.f527d.g(jP);
        if (e0Var != null && !e0Var.equals(e0.f3333d) && !e0Var.equals(wVar.f531h)) {
            wVar.f531h = e0Var;
            C0189o c0189o = new C0189o();
            c0189o.f3394t = e0Var.f3334a;
            c0189o.f3395u = e0Var.f3335b;
            c0189o.f3387m = AbstractC0156G.m("video/raw");
            qVar2.i = new C0190p(c0189o);
            for (m mVar2 : qVar2.f482h) {
                mVar2.f470m.execute(new l(mVar2, mVar2.f469l, e0Var));
            }
        }
        boolean z4 = sVar.f493d != 3;
        sVar.f493d = 3;
        sVar.f499k.getClass();
        sVar.f495f = AbstractC0370w.M(SystemClock.elapsedRealtime());
        if (z4 && qVar2.f485l != null) {
            for (m mVar3 : qVar2.f482h) {
                mVar3.f470m.execute(new l(mVar3, mVar3.f469l, 1));
            }
        }
        if (qVar2.f483j != null) {
            if (qVar2.i == null) {
                new C0189o().a();
            }
            C0446E c0446e = qVar2.f483j;
            qVar2.f481g.getClass();
            c0446e.c(jP, System.nanoTime());
        }
        AbstractC0360m.i(null);
        throw null;
    }
}

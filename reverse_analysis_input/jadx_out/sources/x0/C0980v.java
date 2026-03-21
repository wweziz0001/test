package x0;

import F0.C0067n;
import a0.AbstractC0156G;
import a0.C0150A;
import a0.C0189o;
import a0.C0190p;
import a0.C0192r;
import a0.C0195u;
import a0.C0196v;
import a0.C0197w;
import a0.C0198x;
import a0.C0199y;
import a0.C0200z;
import android.content.Context;
import android.net.Uri;
import d0.AbstractC0370w;
import f0.InterfaceC0412g;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArrayList;
import m2.C0640G;

/* JADX INFO: renamed from: x0.v, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0980v implements G {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C0979u f10803a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Z1.e f10804b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f10805c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f10806d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f10807e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final float f10808f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final float f10809g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f10810h;

    public C0980v(Context context) {
        this(new Z1.e(context, 9), new C0067n());
    }

    public static G d(Class cls, Z1.e eVar) {
        try {
            return (G) cls.getConstructor(InterfaceC0412g.class).newInstance(eVar);
        } catch (Exception e5) {
            throw new IllegalStateException(e5);
        }
    }

    @Override // x0.G
    public final J a(C0150A c0150a) {
        c0150a.f3154b.getClass();
        String scheme = c0150a.f3154b.f3460a.getScheme();
        if (scheme != null && scheme.equals("ssai")) {
            throw null;
        }
        if (Objects.equals(c0150a.f3154b.f3461b, "application/x-image-uri")) {
            long j5 = c0150a.f3154b.f3465f;
            int i = AbstractC0370w.f5326a;
            throw null;
        }
        C0197w c0197w = c0150a.f3154b;
        int iF = AbstractC0370w.F(c0197w.f3460a, c0197w.f3461b);
        if (c0150a.f3154b.f3465f != -9223372036854775807L) {
            C0067n c0067n = this.f10803a.f10797a;
            synchronized (c0067n) {
                c0067n.f812r = 1;
            }
        }
        try {
            C0979u c0979u = this.f10803a;
            HashMap map = c0979u.f10799c;
            G g5 = (G) map.get(Integer.valueOf(iF));
            if (g5 == null) {
                g5 = (G) c0979u.a(iF).get();
                g5.c(c0979u.f10802f);
                g5.b(c0979u.f10801e);
                map.put(Integer.valueOf(iF), g5);
            }
            C0195u c0195uA = c0150a.f3155c.a();
            C0196v c0196v = c0150a.f3155c;
            if (c0196v.f3455a == -9223372036854775807L) {
                c0195uA.f3450a = this.f10805c;
            }
            if (c0196v.f3458d == -3.4028235E38f) {
                c0195uA.f3453d = this.f10808f;
            }
            if (c0196v.f3459e == -3.4028235E38f) {
                c0195uA.f3454e = this.f10809g;
            }
            if (c0196v.f3456b == -9223372036854775807L) {
                c0195uA.f3451b = this.f10806d;
            }
            if (c0196v.f3457c == -9223372036854775807L) {
                c0195uA.f3452c = this.f10807e;
            }
            C0196v c0196v2 = new C0196v(c0195uA);
            if (!c0196v2.equals(c0150a.f3155c)) {
                C0192r c0192rA = c0150a.a();
                c0192rA.f3447k = c0196v2.a();
                c0150a = c0192rA.a();
            }
            J jA = g5.a(c0150a);
            m2.I i5 = c0150a.f3154b.f3463d;
            if (!i5.isEmpty()) {
                J[] jArr = new J[i5.size() + 1];
                jArr[0] = jA;
                if (i5.size() > 0) {
                    if (!this.f10810h) {
                        this.f10804b.getClass();
                        C0199y c0199y = (C0199y) i5.get(0);
                        new ArrayList(1);
                        new HashSet(1);
                        new CopyOnWriteArrayList();
                        new CopyOnWriteArrayList();
                        C0640G c0640g = m2.I.f8549m;
                        m2.b0 b0Var = m2.b0.f8583p;
                        Collections.emptyList();
                        m2.b0 b0Var2 = m2.b0.f8583p;
                        C0198x c0198x = C0198x.f3466a;
                        Uri uri = Uri.EMPTY;
                        c0199y.getClass();
                        throw null;
                    }
                    C0189o c0189o = new C0189o();
                    ((C0199y) i5.get(0)).getClass();
                    ArrayList arrayList = AbstractC0156G.f3213a;
                    c0189o.f3387m = null;
                    ((C0199y) i5.get(0)).getClass();
                    c0189o.f3379d = null;
                    ((C0199y) i5.get(0)).getClass();
                    c0189o.f3380e = 0;
                    ((C0199y) i5.get(0)).getClass();
                    c0189o.f3381f = 0;
                    ((C0199y) i5.get(0)).getClass();
                    c0189o.f3377b = null;
                    ((C0199y) i5.get(0)).getClass();
                    c0189o.f3376a = null;
                    new C0190p(c0189o);
                    ((C0199y) i5.get(0)).getClass();
                    throw null;
                }
                jA = new S(jArr);
            }
            J c0966g = jA;
            long j6 = c0150a.f3157e.f3449a;
            if (j6 != Long.MIN_VALUE) {
                c0966g = new C0966g(c0966g, 0L, j6, true);
            }
            c0150a.f3154b.getClass();
            c0150a.f3154b.getClass();
            return c0966g;
        } catch (ClassNotFoundException e5) {
            throw new IllegalStateException(e5);
        }
    }

    @Override // x0.G
    public final void b(boolean z4) {
        this.f10810h = z4;
        C0979u c0979u = this.f10803a;
        c0979u.f10801e = z4;
        C0067n c0067n = c0979u.f10797a;
        synchronized (c0067n) {
            c0067n.f810p = z4;
        }
        Iterator it = c0979u.f10799c.values().iterator();
        while (it.hasNext()) {
            ((G) it.next()).b(z4);
        }
    }

    @Override // x0.G
    public final void c(C0200z c0200z) {
        C0979u c0979u = this.f10803a;
        c0979u.f10802f = c0200z;
        C0067n c0067n = c0979u.f10797a;
        synchronized (c0067n) {
            c0067n.f811q = c0200z;
        }
        Iterator it = c0979u.f10799c.values().iterator();
        while (it.hasNext()) {
            ((G) it.next()).c(c0200z);
        }
    }

    public C0980v(Context context, C0067n c0067n) {
        this(new Z1.e(context, 9), c0067n);
    }

    public C0980v(Z1.e eVar, C0067n c0067n) {
        this.f10804b = eVar;
        C0979u c0979u = new C0979u(c0067n, new C0200z(7));
        this.f10803a = c0979u;
        if (eVar != c0979u.f10800d) {
            c0979u.f10800d = eVar;
            c0979u.f10798b.clear();
            c0979u.f10799c.clear();
        }
        this.f10805c = -9223372036854775807L;
        this.f10806d = -9223372036854775807L;
        this.f10807e = -9223372036854775807L;
        this.f10808f = -3.4028235E38f;
        this.f10809g = -3.4028235E38f;
        this.f10810h = true;
    }
}

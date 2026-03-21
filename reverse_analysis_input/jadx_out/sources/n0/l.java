package n0;

import B0.u;
import a0.AbstractC0151B;
import a0.C0150A;
import a0.C0196v;
import a0.C0197w;
import android.net.Uri;
import android.os.Looper;
import androidx.lifecycle.E;
import d0.AbstractC0360m;
import d0.AbstractC0370w;
import f0.InterfaceC0403A;
import f0.InterfaceC0412g;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import m2.I;
import m3.C0675i;
import x0.AbstractC0960a;
import x0.C0984z;
import x0.F;
import x0.H;

/* JADX INFO: loaded from: classes.dex */
public final class l extends AbstractC0960a {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final long f8837A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public C0196v f8838B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public InterfaceC0403A f8839C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public C0150A f8840D;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final C0687c f8841s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final C0675i f8842t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final p1.b f8843u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final m0.i f8844v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final A0.b f8845w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final boolean f8846x;
    public final int y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final o0.c f8847z;

    static {
        AbstractC0151B.a("media3.exoplayer.hls");
    }

    public l(C0150A c0150a, C0675i c0675i, C0687c c0687c, p1.b bVar, m0.i iVar, A0.b bVar2, o0.c cVar, long j5, boolean z4, int i) {
        this.f8840D = c0150a;
        this.f8838B = c0150a.f3155c;
        this.f8842t = c0675i;
        this.f8841s = c0687c;
        this.f8843u = bVar;
        this.f8844v = iVar;
        this.f8845w = bVar2;
        this.f8847z = cVar;
        this.f8837A = j5;
        this.f8846x = z4;
        this.y = i;
    }

    public static o0.d w(I i, long j5) {
        o0.d dVar = null;
        for (int i5 = 0; i5 < i.size(); i5++) {
            o0.d dVar2 = (o0.d) i.get(i5);
            long j6 = dVar2.f9003p;
            if (j6 > j5 || !dVar2.f8992w) {
                if (j6 > j5) {
                    break;
                }
            } else {
                dVar = dVar2;
            }
        }
        return dVar;
    }

    @Override // x0.J
    public final synchronized C0150A a() {
        return this.f8840D;
    }

    @Override // x0.J
    public final synchronized void b(C0150A c0150a) {
        this.f8840D = c0150a;
    }

    @Override // x0.J
    public final F c(H h2, B0.f fVar, long j5) {
        m0.e eVarH = h(h2);
        m0.e eVar = new m0.e(this.f10637o.f8498c, 0, h2);
        InterfaceC0403A interfaceC0403A = this.f8839C;
        i0.j jVar = this.f10640r;
        AbstractC0360m.i(jVar);
        return new k(this.f8841s, this.f8847z, this.f8842t, interfaceC0403A, this.f8844v, eVar, this.f8845w, eVarH, fVar, this.f8843u, this.f8846x, this.y, jVar);
    }

    @Override // x0.J
    public final void d(F f2) {
        k kVar = (k) f2;
        kVar.f8824m.f8983p.remove(kVar);
        for (q qVar : kVar.f8819E) {
            if (qVar.f8876O) {
                for (p pVar : qVar.f8869G) {
                    pVar.g();
                    E e5 = pVar.f10689h;
                    if (e5 != null) {
                        e5.I(pVar.f10686e);
                        pVar.f10689h = null;
                        pVar.f10688g = null;
                    }
                }
            }
            i iVar = qVar.f8900o;
            o0.b bVar = (o0.b) iVar.f8777g.f8982o.get(iVar.f8775e[iVar.f8786q.a()]);
            if (bVar != null) {
                bVar.f8976v = false;
            }
            iVar.f8783n = null;
            qVar.f8906u.e(qVar);
            qVar.f8865C.removeCallbacksAndMessages(null);
            qVar.f8880S = true;
            qVar.f8866D.clear();
        }
        kVar.f8816B = null;
    }

    @Override // x0.J
    public final void e() throws IOException {
        o0.c cVar = this.f8847z;
        B0.r rVar = cVar.f8985r;
        if (rVar != null) {
            rVar.a();
        }
        Uri uri = cVar.f8989v;
        if (uri != null) {
            o0.b bVar = (o0.b) cVar.f8982o.get(uri);
            bVar.f8967m.a();
            IOException iOException = bVar.f8975u;
            if (iOException != null) {
                throw iOException;
            }
        }
    }

    @Override // x0.AbstractC0960a
    public final void p(InterfaceC0403A interfaceC0403A) {
        this.f8839C = interfaceC0403A;
        Looper looperMyLooper = Looper.myLooper();
        looperMyLooper.getClass();
        i0.j jVar = this.f10640r;
        AbstractC0360m.i(jVar);
        m0.i iVar = this.f8844v;
        iVar.a(looperMyLooper, jVar);
        iVar.c();
        m0.e eVarH = h(null);
        C0197w c0197w = a().f3154b;
        c0197w.getClass();
        o0.c cVar = this.f8847z;
        cVar.getClass();
        cVar.f8986s = AbstractC0370w.m(null);
        cVar.f8984q = eVarH;
        cVar.f8987t = this;
        u uVar = new u(((InterfaceC0412g) cVar.f8979l.f8712m).a(), c0197w.f3460a, 4, cVar.f8980m.m());
        AbstractC0360m.h(cVar.f8985r == null);
        B0.r rVar = new B0.r("DefaultHlsPlaylistTracker:MultivariantPlaylist");
        cVar.f8985r = rVar;
        A0.b bVar = cVar.f8981n;
        int i = uVar.f247n;
        eVarH.h(new C0984z(uVar.f245l, uVar.f246m, rVar.f(uVar, cVar, bVar.o(i))), i, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
    }

    @Override // x0.AbstractC0960a
    public final void t() {
        o0.c cVar = this.f8847z;
        cVar.f8989v = null;
        cVar.f8990w = null;
        cVar.f8988u = null;
        cVar.y = -9223372036854775807L;
        cVar.f8985r.e(null);
        cVar.f8985r = null;
        HashMap map = cVar.f8982o;
        Iterator it = map.values().iterator();
        while (it.hasNext()) {
            ((o0.b) it.next()).f8967m.e(null);
        }
        cVar.f8986s.removeCallbacksAndMessages(null);
        cVar.f8986s = null;
        map.clear();
        this.f8844v.release();
    }

    /* JADX WARN: Removed duplicated region for block: B:79:0x016a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void x(o0.i r42) {
        /*
            Method dump skipped, instruction units count: 489
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: n0.l.x(o0.i):void");
    }
}

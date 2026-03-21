package k0;

import B0.r;
import B0.s;
import B0.t;
import B0.u;
import a0.AbstractC0151B;
import a0.C0150A;
import a0.C0196v;
import a0.C0197w;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.util.SparseArray;
import d0.AbstractC0360m;
import d0.AbstractC0370w;
import f0.InterfaceC0403A;
import f0.InterfaceC0412g;
import f0.InterfaceC0413h;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import l0.C0562a;
import l0.C0564c;
import x0.AbstractC0960a;
import x0.C0984z;
import x0.F;
import x0.H;
import y0.C1000h;

/* JADX INFO: loaded from: classes.dex */
public final class g extends AbstractC0960a {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final long f7562A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final m0.e f7563B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final t f7564C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public final d f7565D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public final Object f7566E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public final SparseArray f7567F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public final RunnableC0530c f7568G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public final RunnableC0530c f7569H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public final d f7570I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public final s f7571J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public InterfaceC0413h f7572K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public r f7573L;
    public InterfaceC0403A M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public K3.b f7574N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public Handler f7575O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public C0196v f7576P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public Uri f7577Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    public final Uri f7578R;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public C0564c f7579S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    public boolean f7580T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public long f7581U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public long f7582V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public long f7583W;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public int f7584X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public long f7585Y;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public int f7586Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public C0150A f7587a0;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final boolean f7588s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final InterfaceC0412g f7589t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final D0.d f7590u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final p1.b f7591v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final m0.i f7592w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final A0.b f7593x;
    public final Z1.i y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final long f7594z;

    static {
        AbstractC0151B.a("media3.exoplayer.dash");
    }

    /* JADX WARN: Type inference failed for: r2v11, types: [k0.c] */
    /* JADX WARN: Type inference failed for: r2v12, types: [k0.c] */
    public g(C0150A c0150a, InterfaceC0412g interfaceC0412g, t tVar, D0.d dVar, p1.b bVar, m0.i iVar, A0.b bVar2, long j5, long j6) {
        this.f7587a0 = c0150a;
        this.f7576P = c0150a.f3155c;
        C0197w c0197w = c0150a.f3154b;
        c0197w.getClass();
        Uri uri = c0197w.f3460a;
        this.f7577Q = uri;
        this.f7578R = uri;
        this.f7579S = null;
        this.f7589t = interfaceC0412g;
        this.f7564C = tVar;
        this.f7590u = dVar;
        this.f7592w = iVar;
        this.f7593x = bVar2;
        this.f7594z = j5;
        this.f7562A = j6;
        this.f7591v = bVar;
        this.y = new Z1.i(11);
        this.f7588s = false;
        this.f7563B = h(null);
        this.f7566E = new Object();
        this.f7567F = new SparseArray();
        this.f7570I = new d(this, 1);
        this.f7585Y = -9223372036854775807L;
        this.f7583W = -9223372036854775807L;
        this.f7565D = new d(this, 2);
        this.f7571J = new d(this, 3);
        final int i = 0;
        this.f7568G = new Runnable(this) { // from class: k0.c

            /* JADX INFO: renamed from: m, reason: collision with root package name */
            public final /* synthetic */ g f7549m;

            {
                this.f7549m = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i) {
                    case 0:
                        this.f7549m.B();
                        break;
                    default:
                        this.f7549m.A(false);
                        break;
                }
            }
        };
        final int i5 = 1;
        this.f7569H = new Runnable(this) { // from class: k0.c

            /* JADX INFO: renamed from: m, reason: collision with root package name */
            public final /* synthetic */ g f7549m;

            {
                this.f7549m = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i5) {
                    case 0:
                        this.f7549m.B();
                        break;
                    default:
                        this.f7549m.A(false);
                        break;
                }
            }
        };
    }

    public static boolean w(l0.h hVar) {
        int i = 0;
        while (true) {
            List list = hVar.f7855c;
            if (i >= list.size()) {
                return false;
            }
            int i5 = ((C0562a) list.get(i)).f7813b;
            if (i5 == 1 || i5 == 2) {
                break;
            }
            i++;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:122:0x028c  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x02f5  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x039d  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x03a4  */
    /* JADX WARN: Type inference failed for: r10v27 */
    /* JADX WARN: Type inference failed for: r10v28, types: [int] */
    /* JADX WARN: Type inference failed for: r10v30 */
    /* JADX WARN: Type inference failed for: r15v12 */
    /* JADX WARN: Type inference failed for: r15v13, types: [int] */
    /* JADX WARN: Type inference failed for: r15v15 */
    /* JADX WARN: Type inference failed for: r2v20, types: [A0.w] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A(boolean r41) {
        /*
            Method dump skipped, instruction units count: 1202
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: k0.g.A(boolean):void");
    }

    public final void B() {
        Uri uri;
        this.f7575O.removeCallbacks(this.f7568G);
        if (this.f7573L.c()) {
            return;
        }
        if (this.f7573L.d()) {
            this.f7580T = true;
            return;
        }
        synchronized (this.f7566E) {
            uri = this.f7577Q;
        }
        this.f7580T = false;
        u uVar = new u(this.f7572K, uri, 4, this.f7564C);
        d dVar = this.f7565D;
        this.f7593x.getClass();
        this.f7563B.h(new C0984z(uVar.f245l, uVar.f246m, this.f7573L.f(uVar, dVar, 3)), uVar.f247n, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
    }

    @Override // x0.J
    public final synchronized C0150A a() {
        return this.f7587a0;
    }

    @Override // x0.J
    public final synchronized void b(C0150A c0150a) {
        this.f7587a0 = c0150a;
    }

    @Override // x0.J
    public final F c(H h2, B0.f fVar, long j5) {
        int iIntValue = ((Integer) h2.f10531a).intValue() - this.f7586Z;
        m0.e eVarH = h(h2);
        m0.e eVar = new m0.e(this.f10637o.f8498c, 0, h2);
        int i = this.f7586Z + iIntValue;
        C0564c c0564c = this.f7579S;
        InterfaceC0403A interfaceC0403A = this.M;
        long j6 = this.f7583W;
        i0.j jVar = this.f10640r;
        AbstractC0360m.i(jVar);
        C0529b c0529b = new C0529b(i, c0564c, this.y, iIntValue, this.f7590u, interfaceC0403A, this.f7592w, eVar, this.f7593x, eVarH, j6, this.f7571J, fVar, this.f7591v, this.f7570I, jVar);
        this.f7567F.put(i, c0529b);
        return c0529b;
    }

    @Override // x0.J
    public final void d(F f2) {
        C0529b c0529b = (C0529b) f2;
        o oVar = c0529b.f7546x;
        oVar.f7639t = true;
        oVar.f7634o.removeCallbacksAndMessages(null);
        for (C1000h c1000h : c0529b.f7526C) {
            c1000h.A(c0529b);
        }
        c0529b.f7525B = null;
        this.f7567F.remove(c0529b.f7534l);
    }

    @Override // x0.J
    public final void e() {
        this.f7571J.a();
    }

    @Override // x0.AbstractC0960a
    public final void p(InterfaceC0403A interfaceC0403A) {
        this.M = interfaceC0403A;
        Looper looperMyLooper = Looper.myLooper();
        i0.j jVar = this.f10640r;
        AbstractC0360m.i(jVar);
        m0.i iVar = this.f7592w;
        iVar.a(looperMyLooper, jVar);
        iVar.c();
        if (this.f7588s) {
            A(false);
            return;
        }
        this.f7572K = this.f7589t.a();
        this.f7573L = new r("DashMediaSource");
        this.f7575O = AbstractC0370w.m(null);
        B();
    }

    @Override // x0.AbstractC0960a
    public final void t() {
        this.f7580T = false;
        this.f7572K = null;
        r rVar = this.f7573L;
        if (rVar != null) {
            rVar.e(null);
            this.f7573L = null;
        }
        this.f7581U = 0L;
        this.f7582V = 0L;
        this.f7577Q = this.f7578R;
        this.f7574N = null;
        Handler handler = this.f7575O;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
            this.f7575O = null;
        }
        this.f7583W = -9223372036854775807L;
        this.f7584X = 0;
        this.f7585Y = -9223372036854775807L;
        this.f7567F.clear();
        Z1.i iVar = this.y;
        ((HashMap) iVar.f3012l).clear();
        ((HashMap) iVar.f3013m).clear();
        ((HashMap) iVar.f3014n).clear();
        this.f7592w.release();
    }

    public final void x() {
        boolean z4;
        r rVar = this.f7573L;
        d dVar = new d(this, 0);
        synchronized (C0.b.f281b) {
            z4 = C0.b.f282c;
        }
        if (z4) {
            dVar.b();
            return;
        }
        if (rVar == null) {
            rVar = new r("SntpClient");
        }
        rVar.f(new A0.b(3), new B0.d(dVar), 1);
    }

    public final void y(u uVar, long j5, long j6) {
        long j7 = uVar.f245l;
        Uri uri = uVar.f248o.f5735n;
        C0984z c0984z = new C0984z(j6);
        this.f7593x.getClass();
        this.f7563B.c(c0984z, uVar.f247n, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
    }

    public final void z(IOException iOException) {
        AbstractC0360m.m("DashMediaSource", "Failed to resolve time offset.", iOException);
        this.f7583W = System.currentTimeMillis() - SystemClock.elapsedRealtime();
        A(true);
    }
}

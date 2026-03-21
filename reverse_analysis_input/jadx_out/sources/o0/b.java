package o0;

import B0.r;
import B0.u;
import D0.y;
import a0.C0157H;
import android.net.Uri;
import android.os.SystemClock;
import f0.InterfaceC0412g;
import f0.InterfaceC0413h;
import java.io.IOException;
import java.util.List;
import m2.I;
import x0.C0984z;

/* JADX INFO: loaded from: classes.dex */
public final class b implements B0.m {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Uri f8966l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final r f8967m = new r("DefaultHlsPlaylistTracker:MediaPlaylist");

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final InterfaceC0413h f8968n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public i f8969o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public long f8970p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public long f8971q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public long f8972r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public long f8973s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f8974t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public IOException f8975u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f8976v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ c f8977w;

    public b(c cVar, Uri uri) {
        this.f8977w = cVar;
        this.f8966l = uri;
        this.f8968n = ((InterfaceC0412g) cVar.f8979l.f8712m).a();
    }

    public static boolean a(b bVar, long j5) {
        bVar.f8973s = SystemClock.elapsedRealtime() + j5;
        c cVar = bVar.f8977w;
        if (!bVar.f8966l.equals(cVar.f8989v)) {
            return false;
        }
        List list = cVar.f8988u.f9044e;
        int size = list.size();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        for (int i = 0; i < size; i++) {
            b bVar2 = (b) cVar.f8982o.get(((k) list.get(i)).f9036a);
            bVar2.getClass();
            if (jElapsedRealtime > bVar2.f8973s) {
                Uri uri = bVar2.f8966l;
                cVar.f8989v = uri;
                bVar2.e(cVar.b(uri));
                return false;
            }
        }
        return true;
    }

    public final Uri b() {
        i iVar = this.f8969o;
        Uri uri = this.f8966l;
        if (iVar != null) {
            h hVar = iVar.f9032v;
            if (hVar.f9010a != -9223372036854775807L || hVar.f9014e) {
                Uri.Builder builderBuildUpon = uri.buildUpon();
                i iVar2 = this.f8969o;
                if (iVar2.f9032v.f9014e) {
                    builderBuildUpon.appendQueryParameter("_HLS_msn", String.valueOf(iVar2.f9021k + ((long) iVar2.f9028r.size())));
                    i iVar3 = this.f8969o;
                    if (iVar3.f9024n != -9223372036854775807L) {
                        I i = iVar3.f9029s;
                        int size = i.size();
                        if (!i.isEmpty() && ((d) m2.r.l(i)).f8993x) {
                            size--;
                        }
                        builderBuildUpon.appendQueryParameter("_HLS_part", String.valueOf(size));
                    }
                }
                h hVar2 = this.f8969o.f9032v;
                if (hVar2.f9010a != -9223372036854775807L) {
                    builderBuildUpon.appendQueryParameter("_HLS_skip", hVar2.f9011b ? "v2" : "YES");
                }
                return builderBuildUpon.build();
            }
        }
        return uri;
    }

    public final void c(boolean z4) {
        e(z4 ? b() : this.f8966l);
    }

    public final void d(Uri uri) {
        c cVar = this.f8977w;
        u uVar = new u(this.f8968n, uri, 4, cVar.f8980m.n(cVar.f8988u, this.f8969o));
        A0.b bVar = cVar.f8981n;
        int i = uVar.f247n;
        cVar.f8984q.h(new C0984z(uVar.f245l, uVar.f246m, this.f8967m.f(uVar, this, bVar.o(i))), i, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
    }

    public final void e(Uri uri) {
        this.f8973s = 0L;
        if (this.f8974t) {
            return;
        }
        r rVar = this.f8967m;
        if (rVar.d() || rVar.c()) {
            return;
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        long j5 = this.f8972r;
        if (jElapsedRealtime >= j5) {
            d(uri);
        } else {
            this.f8974t = true;
            this.f8977w.f8986s.postDelayed(new y(this, 19, uri), j5 - jElapsedRealtime);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x021a  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x022e  */
    /* JADX WARN: Removed duplicated region for block: B:111:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0211  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void f(o0.i r65, x0.C0984z r66) {
        /*
            Method dump skipped, instruction units count: 578
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o0.b.f(o0.i, x0.z):void");
    }

    @Override // B0.m
    public final void i(B0.o oVar, long j5, long j6) {
        u uVar = (u) oVar;
        m mVar = (m) uVar.f250q;
        Uri uri = uVar.f248o.f5735n;
        C0984z c0984z = new C0984z(j6);
        if (mVar instanceof i) {
            f((i) mVar, c0984z);
            this.f8977w.f8984q.d(c0984z, 4);
        } else {
            C0157H c0157hB = C0157H.b("Loaded playlist has unexpected type.", null);
            this.f8975u = c0157hB;
            this.f8977w.f8984q.g(c0984z, 4, c0157hB, true);
        }
        this.f8977w.f8981n.getClass();
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x003e  */
    @Override // B0.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final B0.k n(B0.o r8, long r9, long r11, java.io.IOException r13, int r14) {
        /*
            r7 = this;
            r9 = 1
            r10 = 0
            B0.u r8 = (B0.u) r8
            x0.z r0 = new x0.z
            long r1 = r8.f245l
            f0.z r1 = r8.f248o
            android.net.Uri r1 = r1.f5735n
            r0.<init>(r11)
            java.lang.String r11 = "_HLS_msn"
            java.lang.String r11 = r1.getQueryParameter(r11)
            if (r11 == 0) goto L19
            r11 = r9
            goto L1a
        L19:
            r11 = r10
        L1a:
            boolean r12 = r13 instanceof o0.n
            B0.k r1 = B0.r.f240p
            o0.c r2 = r7.f8977w
            int r8 = r8.f247n
            if (r11 != 0) goto L26
            if (r12 == 0) goto L3e
        L26:
            boolean r11 = r13 instanceof f0.C0427v
            if (r11 == 0) goto L30
            r11 = r13
            f0.v r11 = (f0.C0427v) r11
            int r11 = r11.f5724o
            goto L33
        L30:
            r11 = 2147483647(0x7fffffff, float:NaN)
        L33:
            if (r12 != 0) goto L8d
            r12 = 400(0x190, float:5.6E-43)
            if (r11 == r12) goto L8d
            r12 = 503(0x1f7, float:7.05E-43)
            if (r11 != r12) goto L3e
            goto L8d
        L3e:
            A.j r11 = new A.j
            r11.<init>(r13, r14)
            java.util.concurrent.CopyOnWriteArrayList r12 = r2.f8983p
            java.util.Iterator r12 = r12.iterator()
            r14 = r10
        L4a:
            boolean r3 = r12.hasNext()
            if (r3 == 0) goto L5f
            java.lang.Object r3 = r12.next()
            o0.q r3 = (o0.q) r3
            android.net.Uri r4 = r7.f8966l
            boolean r3 = r3.d(r4, r11, r10)
            r3 = r3 ^ r9
            r14 = r14 | r3
            goto L4a
        L5f:
            A0.b r12 = r2.f8981n
            if (r14 == 0) goto L7d
            r12.getClass()
            long r3 = A0.b.p(r11)
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r11 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r11 == 0) goto L7a
            B0.k r11 = new B0.k
            r11.<init>(r10, r3, r10)
            r1 = r11
            goto L7d
        L7a:
            B0.k r10 = B0.r.f241q
            r1 = r10
        L7d:
            boolean r10 = r1.a()
            r9 = r9 ^ r10
            m0.e r11 = r2.f8984q
            r11.g(r0, r8, r13, r9)
            if (r10 != 0) goto L9d
            r12.getClass()
            goto L9d
        L8d:
            long r11 = android.os.SystemClock.elapsedRealtime()
            r7.f8972r = r11
            r7.c(r10)
            m0.e r10 = r2.f8984q
            int r11 = d0.AbstractC0370w.f5326a
            r10.g(r0, r8, r13, r9)
        L9d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: o0.b.n(B0.o, long, long, java.io.IOException, int):B0.k");
    }

    @Override // B0.m
    public final void q(B0.o oVar, long j5, long j6, boolean z4) {
        u uVar = (u) oVar;
        long j7 = uVar.f245l;
        Uri uri = uVar.f248o.f5735n;
        C0984z c0984z = new C0984z(j6);
        c cVar = this.f8977w;
        cVar.f8981n.getClass();
        cVar.f8984q.c(c0984z, 4, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
    }
}

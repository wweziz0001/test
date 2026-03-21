package o0;

import B0.r;
import B0.u;
import a0.AbstractC0156G;
import a0.C0157H;
import a0.C0189o;
import a0.C0190p;
import android.net.Uri;
import android.os.Handler;
import android.os.SystemClock;
import d0.AbstractC0370w;
import f0.C0414i;
import f0.C0424s;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import m3.C0675i;
import x0.C0984z;

/* JADX INFO: loaded from: classes.dex */
public final class c implements B0.m {

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final B0.l f8978z = new B0.l(1);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final C0675i f8979l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final p f8980m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final A0.b f8981n;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public m0.e f8984q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public r f8985r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public Handler f8986s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public n0.l f8987t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public l f8988u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public Uri f8989v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public i f8990w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f8991x;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final CopyOnWriteArrayList f8983p = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final HashMap f8982o = new HashMap();
    public long y = -9223372036854775807L;

    public c(C0675i c0675i, A0.b bVar, p pVar) {
        this.f8979l = c0675i;
        this.f8980m = pVar;
        this.f8981n = bVar;
    }

    public final i a(boolean z4, Uri uri) {
        HashMap map = this.f8982o;
        i iVar = ((b) map.get(uri)).f8969o;
        if (iVar != null && z4) {
            if (!uri.equals(this.f8989v)) {
                List list = this.f8988u.f9044e;
                int i = 0;
                while (true) {
                    if (i >= list.size()) {
                        break;
                    }
                    if (uri.equals(((k) list.get(i)).f9036a)) {
                        i iVar2 = this.f8990w;
                        if (iVar2 == null || !iVar2.f9025o) {
                            this.f8989v = uri;
                            b bVar = (b) map.get(uri);
                            i iVar3 = bVar.f8969o;
                            if (iVar3 == null || !iVar3.f9025o) {
                                bVar.e(b(uri));
                            } else {
                                this.f8990w = iVar3;
                                this.f8987t.x(iVar3);
                            }
                        }
                    } else {
                        i++;
                    }
                }
            }
            b bVar2 = (b) map.get(uri);
            i iVar4 = bVar2.f8969o;
            if (!bVar2.f8976v) {
                bVar2.f8976v = true;
                if (iVar4 != null && !iVar4.f9025o) {
                    bVar2.c(true);
                }
            }
        }
        return iVar;
    }

    public final Uri b(Uri uri) {
        e eVar;
        i iVar = this.f8990w;
        if (iVar == null || !iVar.f9032v.f9014e || (eVar = (e) iVar.f9030t.get(uri)) == null) {
            return uri;
        }
        Uri.Builder builderBuildUpon = uri.buildUpon();
        builderBuildUpon.appendQueryParameter("_HLS_msn", String.valueOf(eVar.f8995b));
        int i = eVar.f8996c;
        if (i != -1) {
            builderBuildUpon.appendQueryParameter("_HLS_part", String.valueOf(i));
        }
        return builderBuildUpon.build();
    }

    public final boolean c(Uri uri) {
        int i;
        b bVar = (b) this.f8982o.get(uri);
        if (bVar.f8969o == null) {
            return false;
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        long jMax = Math.max(30000L, AbstractC0370w.Z(bVar.f8969o.f9031u));
        i iVar = bVar.f8969o;
        return iVar.f9025o || (i = iVar.f9015d) == 2 || i == 1 || bVar.f8970p + jMax > jElapsedRealtime;
    }

    @Override // B0.m
    public final void i(B0.o oVar, long j5, long j6) {
        l lVar;
        u uVar = (u) oVar;
        m mVar = (m) uVar.f250q;
        boolean z4 = mVar instanceof i;
        if (z4) {
            String str = mVar.f9050a;
            l lVar2 = l.f9042l;
            Uri uri = Uri.parse(str);
            C0189o c0189o = new C0189o();
            c0189o.f3376a = "0";
            c0189o.f3386l = AbstractC0156G.m("application/x-mpegURL");
            lVar = new l("", Collections.emptyList(), Collections.singletonList(new k(uri, new C0190p(c0189o), null, null, null, null)), Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), null, null, false, Collections.emptyMap(), Collections.emptyList());
        } else {
            lVar = (l) mVar;
        }
        this.f8988u = lVar;
        this.f8989v = ((k) lVar.f9044e.get(0)).f9036a;
        this.f8983p.add(new C0716a(this));
        List list = lVar.f9043d;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            Uri uri2 = (Uri) list.get(i);
            this.f8982o.put(uri2, new b(this, uri2));
        }
        Uri uri3 = uVar.f248o.f5735n;
        C0984z c0984z = new C0984z(j6);
        b bVar = (b) this.f8982o.get(this.f8989v);
        if (z4) {
            bVar.f((i) mVar, c0984z);
        } else {
            bVar.c(false);
        }
        this.f8981n.getClass();
        this.f8984q.d(c0984z, 4);
    }

    @Override // B0.m
    public final B0.k n(B0.o oVar, long j5, long j6, IOException iOException, int i) {
        long jMin;
        u uVar = (u) oVar;
        long j7 = uVar.f245l;
        Uri uri = uVar.f248o.f5735n;
        C0984z c0984z = new C0984z(j6);
        this.f8981n.getClass();
        if ((iOException instanceof C0157H) || (iOException instanceof FileNotFoundException) || (iOException instanceof C0424s) || (iOException instanceof B0.q)) {
            jMin = -9223372036854775807L;
            break;
        }
        int i5 = C0414i.f5672m;
        for (Throwable cause = iOException; cause != null; cause = cause.getCause()) {
            if ((cause instanceof C0414i) && ((C0414i) cause).f5673l == 2008) {
                jMin = -9223372036854775807L;
                break;
            }
        }
        jMin = Math.min((i - 1) * 1000, 5000);
        boolean z4 = jMin == -9223372036854775807L;
        this.f8984q.g(c0984z, uVar.f247n, iOException, z4);
        return z4 ? r.f241q : new B0.k(0, jMin, false);
    }

    @Override // B0.m
    public final void q(B0.o oVar, long j5, long j6, boolean z4) {
        u uVar = (u) oVar;
        long j7 = uVar.f245l;
        Uri uri = uVar.f248o.f5735n;
        C0984z c0984z = new C0984z(j6);
        this.f8981n.getClass();
        this.f8984q.c(c0984z, 4, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
    }
}

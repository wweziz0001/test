package k0;

import B0.q;
import B0.r;
import B0.s;
import B0.u;
import a0.C0157H;
import a0.C0200z;
import android.net.Uri;
import d0.AbstractC0360m;
import d0.AbstractC0370w;
import f0.C0414i;
import f0.C0424s;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Objects;
import l0.C0564c;
import x0.C0984z;

/* JADX INFO: loaded from: classes.dex */
public final class d implements B0.m, s {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f7550l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ g f7551m;

    public /* synthetic */ d(g gVar, int i) {
        this.f7550l = i;
        this.f7551m = gVar;
    }

    @Override // B0.s
    public void a() throws IOException {
        g gVar = this.f7551m;
        gVar.f7573L.a();
        K3.b bVar = gVar.f7574N;
        if (bVar != null) {
            throw bVar;
        }
    }

    public void b() {
        long j5;
        g gVar = this.f7551m;
        synchronized (C0.b.f281b) {
            try {
                j5 = C0.b.f282c ? C0.b.f283d : -9223372036854775807L;
            } catch (Throwable th) {
                throw th;
            }
        }
        gVar.f7583W = j5;
        gVar.A(true);
    }

    @Override // B0.m
    public void i(B0.o oVar, long j5, long j6) {
        switch (this.f7550l) {
            case 2:
                u uVar = (u) oVar;
                g gVar = this.f7551m;
                gVar.getClass();
                long j7 = uVar.f245l;
                Uri uri = uVar.f248o.f5735n;
                C0984z c0984z = new C0984z(j6);
                gVar.f7593x.getClass();
                gVar.f7563B.d(c0984z, uVar.f247n);
                C0564c c0564c = (C0564c) uVar.f250q;
                C0564c c0564c2 = gVar.f7579S;
                int size = c0564c2 == null ? 0 : c0564c2.f7833m.size();
                long j8 = c0564c.b(0).f7854b;
                int i = 0;
                while (i < size && gVar.f7579S.b(i).f7854b < j8) {
                    i++;
                }
                if (c0564c.f7825d) {
                    if (size - i > c0564c.f7833m.size()) {
                        AbstractC0360m.y("DashMediaSource", "Loaded out of sync manifest");
                    } else {
                        long j9 = gVar.f7585Y;
                        if (j9 == -9223372036854775807L || c0564c.f7829h * 1000 > j9) {
                            gVar.f7584X = 0;
                        } else {
                            AbstractC0360m.y("DashMediaSource", "Loaded stale dynamic manifest: " + c0564c.f7829h + ", " + gVar.f7585Y);
                        }
                    }
                    int i5 = gVar.f7584X;
                    gVar.f7584X = i5 + 1;
                    if (i5 < gVar.f7593x.o(uVar.f247n)) {
                        gVar.f7575O.postDelayed(gVar.f7568G, Math.min((gVar.f7584X - 1) * 1000, 5000));
                        return;
                    } else {
                        gVar.f7574N = new K3.b();
                        return;
                    }
                }
                gVar.f7579S = c0564c;
                gVar.f7580T &= c0564c.f7825d;
                gVar.f7581U = j5 - j6;
                gVar.f7582V = j5;
                gVar.f7586Z += i;
                synchronized (gVar.f7566E) {
                    try {
                        if (uVar.f246m.f5686a == gVar.f7577Q) {
                            Uri uri2 = gVar.f7579S.f7831k;
                            if (uri2 == null) {
                                uri2 = uVar.f248o.f5735n;
                            }
                            gVar.f7577Q = uri2;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                    break;
                }
                C0564c c0564c3 = gVar.f7579S;
                if (!c0564c3.f7825d || gVar.f7583W != -9223372036854775807L) {
                    gVar.A(true);
                    return;
                }
                Z1.e eVar = c0564c3.i;
                if (eVar == null) {
                    gVar.x();
                    return;
                }
                String str = (String) eVar.f3001m;
                int i6 = AbstractC0370w.f5326a;
                if (Objects.equals(str, "urn:mpeg:dash:utc:direct:2014") || Objects.equals(str, "urn:mpeg:dash:utc:direct:2012")) {
                    try {
                        gVar.f7583W = AbstractC0370w.P((String) eVar.f3002n) - gVar.f7582V;
                        gVar.A(true);
                        return;
                    } catch (C0157H e5) {
                        gVar.z(e5);
                        return;
                    }
                }
                if (Objects.equals(str, "urn:mpeg:dash:utc:http-iso:2014") || Objects.equals(str, "urn:mpeg:dash:utc:http-iso:2012")) {
                    u uVar2 = new u(gVar.f7572K, Uri.parse((String) eVar.f3002n), 5, new f());
                    gVar.f7563B.h(new C0984z(uVar2.f245l, uVar2.f246m, gVar.f7573L.f(uVar2, new d(gVar, 4), 1)), uVar2.f247n, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
                    return;
                } else if (Objects.equals(str, "urn:mpeg:dash:utc:http-xsdate:2014") || Objects.equals(str, "urn:mpeg:dash:utc:http-xsdate:2012")) {
                    u uVar3 = new u(gVar.f7572K, Uri.parse((String) eVar.f3002n), 5, new C0200z(18));
                    gVar.f7563B.h(new C0984z(uVar3.f245l, uVar3.f246m, gVar.f7573L.f(uVar3, new d(gVar, 4), 1)), uVar3.f247n, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
                    return;
                } else if (Objects.equals(str, "urn:mpeg:dash:utc:ntp:2014") || Objects.equals(str, "urn:mpeg:dash:utc:ntp:2012")) {
                    gVar.x();
                    return;
                } else {
                    gVar.z(new IOException("Unsupported UTC timing scheme"));
                    return;
                }
            default:
                u uVar4 = (u) oVar;
                g gVar2 = this.f7551m;
                gVar2.getClass();
                long j10 = uVar4.f245l;
                Uri uri3 = uVar4.f248o.f5735n;
                C0984z c0984z2 = new C0984z(j6);
                gVar2.f7593x.getClass();
                gVar2.f7563B.d(c0984z2, uVar4.f247n);
                gVar2.f7583W = ((Long) uVar4.f250q).longValue() - j5;
                gVar2.A(true);
                return;
        }
    }

    @Override // B0.m
    public B0.k n(B0.o oVar, long j5, long j6, IOException iOException, int i) {
        long jMin;
        g gVar = this.f7551m;
        switch (this.f7550l) {
            case 2:
                u uVar = (u) oVar;
                gVar.getClass();
                long j7 = uVar.f245l;
                Uri uri = uVar.f248o.f5735n;
                C0984z c0984z = new C0984z(j6);
                gVar.f7593x.getClass();
                if ((iOException instanceof C0157H) || (iOException instanceof FileNotFoundException) || (iOException instanceof C0424s) || (iOException instanceof q)) {
                    jMin = -9223372036854775807L;
                } else {
                    int i5 = C0414i.f5672m;
                    for (Throwable cause = iOException; cause != null; cause = cause.getCause()) {
                        if ((cause instanceof C0414i) && ((C0414i) cause).f5673l == 2008) {
                            jMin = -9223372036854775807L;
                        }
                    }
                    jMin = Math.min((i - 1) * 1000, 5000);
                }
                B0.k kVar = jMin == -9223372036854775807L ? r.f241q : new B0.k(0, jMin, false);
                gVar.f7563B.g(c0984z, uVar.f247n, iOException, true ^ kVar.a());
                return kVar;
            default:
                u uVar2 = (u) oVar;
                gVar.getClass();
                long j8 = uVar2.f245l;
                Uri uri2 = uVar2.f248o.f5735n;
                gVar.f7563B.g(new C0984z(j6), uVar2.f247n, iOException, true);
                gVar.f7593x.getClass();
                gVar.z(iOException);
                return r.f240p;
        }
    }

    @Override // B0.m
    public void q(B0.o oVar, long j5, long j6, boolean z4) {
        switch (this.f7550l) {
            case 2:
                this.f7551m.y((u) oVar, j5, j6);
                break;
            default:
                this.f7551m.y((u) oVar, j5, j6);
                break;
        }
    }
}

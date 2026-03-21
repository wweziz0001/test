package a1;

import F0.AbstractC0055b;
import F0.C0066m;
import F0.q;
import F0.r;
import F0.s;
import a0.C0157H;
import d0.AbstractC0370w;
import d0.C0363p;

/* JADX INFO: loaded from: classes.dex */
public final class d implements q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public s f3485a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public i f3486b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f3487c;

    public final boolean a(C0066m c0066m) {
        boolean z4;
        f fVar = new f();
        if (fVar.a(c0066m, true) && (fVar.f3493a & 2) == 2) {
            int iMin = Math.min(fVar.f3497e, 8);
            C0363p c0363p = new C0363p(iMin);
            c0066m.t(c0363p.f5313a, 0, iMin, false);
            c0363p.H(0);
            if (c0363p.a() >= 5 && c0363p.v() == 127 && c0363p.x() == 1179402563) {
                this.f3486b = new C0203c();
            } else {
                c0363p.H(0);
                try {
                    z4 = AbstractC0055b.z(1, c0363p, true);
                } catch (C0157H unused) {
                    z4 = false;
                }
                if (z4) {
                    this.f3486b = new k();
                } else {
                    c0363p.H(0);
                    if (h.e(c0363p, h.f3500o)) {
                        this.f3486b = new h();
                    }
                }
            }
            return true;
        }
        return false;
    }

    @Override // F0.q
    public final void b(long j5, long j6) {
        i iVar = this.f3486b;
        if (iVar != null) {
            e eVar = iVar.f3503a;
            f fVar = (f) eVar.f3491o;
            fVar.f3493a = 0;
            fVar.f3494b = 0L;
            fVar.f3495c = 0;
            fVar.f3496d = 0;
            fVar.f3497e = 0;
            ((C0363p) eVar.f3492p).E(0);
            eVar.f3488l = -1;
            eVar.f3490n = false;
            if (j5 == 0) {
                iVar.d(!iVar.f3513l);
                return;
            }
            if (iVar.f3510h != 0) {
                long j7 = (((long) iVar.i) * j6) / 1000000;
                iVar.f3507e = j7;
                g gVar = iVar.f3506d;
                int i = AbstractC0370w.f5326a;
                gVar.j(j7);
                iVar.f3510h = 2;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:67:0x0189  */
    @Override // F0.q
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int d(F0.r r21, F0.u r22) throws a0.C0157H {
        /*
            Method dump skipped, instruction units count: 410
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a1.d.d(F0.r, F0.u):int");
    }

    @Override // F0.q
    public final boolean e(r rVar) {
        try {
            return a((C0066m) rVar);
        } catch (C0157H unused) {
            return false;
        }
    }

    @Override // F0.q
    public final void j(s sVar) {
        this.f3485a = sVar;
    }

    @Override // F0.q
    public final void release() {
    }
}

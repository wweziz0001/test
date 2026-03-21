package c1;

import a0.C0200z;
import d0.AbstractC0360m;
import d0.C0363p;
import d0.InterfaceC0351d;
import d0.InterfaceC0356i;
import i0.C0477a;
import java.util.HashMap;
import x0.H;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class m implements InterfaceC0351d, InterfaceC0356i {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f5055l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ long f5056m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Object f5057n;

    public /* synthetic */ m(n nVar, long j5, int i) {
        this.f5057n = nVar;
        this.f5056m = j5;
        this.f5055l = i;
    }

    @Override // d0.InterfaceC0351d
    public void accept(Object obj) {
        C0318a c0318a = (C0318a) obj;
        n nVar = (n) this.f5057n;
        AbstractC0360m.i(nVar.f5065h);
        byte[] bArrQ = C0200z.q(c0318a.f5028a, c0318a.f5030c);
        C0363p c0363p = nVar.f5060c;
        c0363p.getClass();
        c0363p.F(bArrQ.length, bArrQ);
        nVar.f5058a.a(c0363p, bArrQ.length, 0);
        long j5 = c0318a.f5029b;
        long j6 = this.f5056m;
        if (j5 == -9223372036854775807L) {
            AbstractC0360m.h(nVar.f5065h.f3429s == Long.MAX_VALUE);
        } else {
            long j7 = nVar.f5065h.f3429s;
            j6 = j7 == Long.MAX_VALUE ? j6 + j5 : j5 + j7;
        }
        nVar.f5058a.b(j6, this.f5055l, bArrQ.length, 0, null);
    }

    @Override // d0.InterfaceC0356i
    public void c(Object obj) {
        i0.h hVar = (i0.h) obj;
        hVar.getClass();
        C0477a c0477a = (C0477a) this.f5057n;
        H h2 = c0477a.f6355d;
        if (h2 != null) {
            String strC = hVar.f6388b.c(c0477a.f6353b, h2);
            HashMap map = hVar.f6394h;
            Long l3 = (Long) map.get(strC);
            HashMap map2 = hVar.f6393g;
            Long l4 = (Long) map2.get(strC);
            map.put(strC, Long.valueOf((l3 == null ? 0L : l3.longValue()) + this.f5056m));
            map2.put(strC, Long.valueOf((l4 != null ? l4.longValue() : 0L) + ((long) this.f5055l)));
        }
    }

    public /* synthetic */ m(C0477a c0477a, int i, long j5, long j6) {
        this.f5057n = c0477a;
        this.f5055l = i;
        this.f5056m = j5;
    }
}

package h4;

import B3.g;
import M3.p;
import N3.i;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final class f extends i implements p {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ g4.p f6348m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ N3.p f6349n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ N3.p f6350o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ N3.p f6351p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(g4.p pVar, N3.p pVar2, N3.p pVar3, N3.p pVar4) {
        super(2);
        this.f6348m = pVar;
        this.f6349n = pVar2;
        this.f6350o = pVar3;
        this.f6351p = pVar4;
    }

    @Override // M3.p
    public final Object i(Object obj, Object obj2) throws IOException {
        int iIntValue = ((Number) obj).intValue();
        long jLongValue = ((Number) obj2).longValue();
        if (iIntValue == 21589) {
            if (jLongValue < 1) {
                throw new IOException("bad zip: extended timestamp extra too short");
            }
            g4.p pVar = this.f6348m;
            pVar.k(1L);
            byte bF = pVar.f5864m.f();
            boolean z4 = (bF & 1) == 1;
            boolean z5 = (bF & 2) == 2;
            boolean z6 = (bF & 4) == 4;
            long j5 = z4 ? 5L : 1L;
            if (z5) {
                j5 += 4;
            }
            if (z6) {
                j5 += 4;
            }
            if (jLongValue < j5) {
                throw new IOException("bad zip: extended timestamp extra too short");
            }
            if (z4) {
                this.f6349n.f1626l = Long.valueOf(((long) pVar.a()) * 1000);
            }
            if (z5) {
                this.f6350o.f1626l = Long.valueOf(((long) pVar.a()) * 1000);
            }
            if (z6) {
                this.f6351p.f1626l = Long.valueOf(((long) pVar.a()) * 1000);
            }
        }
        return g.f275a;
    }
}

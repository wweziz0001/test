package h4;

import B3.g;
import M3.p;
import N3.i;
import N3.m;
import N3.o;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final class e extends i implements p {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ m f6342m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ long f6343n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ o f6344o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ g4.p f6345p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ o f6346q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ o f6347r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(m mVar, long j5, o oVar, g4.p pVar, o oVar2, o oVar3) {
        super(2);
        this.f6342m = mVar;
        this.f6343n = j5;
        this.f6344o = oVar;
        this.f6345p = pVar;
        this.f6346q = oVar2;
        this.f6347r = oVar3;
    }

    @Override // M3.p
    public final Object i(Object obj, Object obj2) throws IOException {
        int iIntValue = ((Number) obj).intValue();
        long jLongValue = ((Number) obj2).longValue();
        if (iIntValue == 1) {
            m mVar = this.f6342m;
            if (mVar.f1623l) {
                throw new IOException("bad zip: zip64 extra repeated");
            }
            mVar.f1623l = true;
            if (jLongValue < this.f6343n) {
                throw new IOException("bad zip: zip64 extra too short");
            }
            o oVar = this.f6344o;
            long jB = oVar.f1625l;
            g4.p pVar = this.f6345p;
            if (jB == 4294967295L) {
                jB = pVar.b();
            }
            oVar.f1625l = jB;
            o oVar2 = this.f6346q;
            oVar2.f1625l = oVar2.f1625l == 4294967295L ? pVar.b() : 0L;
            o oVar3 = this.f6347r;
            oVar3.f1625l = oVar3.f1625l == 4294967295L ? pVar.b() : 0L;
        }
        return g.f275a;
    }
}

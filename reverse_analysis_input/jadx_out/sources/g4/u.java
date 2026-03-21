package g4;

import a.AbstractC0149a;
import a0.C0200z;
import java.io.IOException;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class u extends f {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final l f5878e;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l f5879b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final i f5880c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final LinkedHashMap f5881d;

    static {
        String str = l.f5856m;
        f5878e = C0200z.s("/", false);
    }

    public u(l lVar, i iVar, LinkedHashMap linkedHashMap) {
        N3.h.e(iVar, "fileSystem");
        this.f5879b = lVar;
        this.f5880c = iVar;
        this.f5881d = linkedHashMap;
    }

    @Override // g4.f
    public final e b(l lVar) throws Throwable {
        p pVarD;
        N3.h.e(lVar, "path");
        l lVar2 = f5878e;
        lVar2.getClass();
        h4.d dVar = (h4.d) this.f5881d.get(h4.b.b(lVar2, lVar, true));
        Throwable th = null;
        if (dVar == null) {
            return null;
        }
        boolean z4 = dVar.f6337b;
        e eVar = new e(!z4, z4, z4 ? null : Long.valueOf(dVar.f6338c), null, dVar.f6339d, null);
        long j5 = dVar.f6340e;
        if (j5 == -1) {
            return eVar;
        }
        h hVarE = this.f5880c.e(this.f5879b);
        try {
            pVarD = D1.b.d(hVarE.f(j5));
            try {
                hVarE.close();
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Throwable th3) {
            try {
                hVarE.close();
            } catch (Throwable th4) {
                AbstractC0149a.c(th3, th4);
            }
            pVarD = null;
            th = th3;
        }
        if (th != null) {
            throw th;
        }
        N3.h.b(pVarD);
        N3.p pVar = new N3.p();
        pVar.f1626l = eVar.f5845e;
        N3.p pVar2 = new N3.p();
        N3.p pVar3 = new N3.p();
        int iA = pVarD.a();
        if (iA != 67324752) {
            throw new IOException("bad zip: expected " + h4.a.b(67324752) + " but was " + h4.a.b(iA));
        }
        pVarD.l(2L);
        short sC = pVarD.c();
        int i = sC & 65535;
        if ((sC & 1) != 0) {
            throw new IOException("unsupported zip: general purpose bit flag=" + h4.a.b(i));
        }
        pVarD.l(18L);
        long jC = ((long) pVarD.c()) & 65535;
        int iC = pVarD.c() & 65535;
        pVarD.l(jC);
        h4.a.d(pVarD, iC, new h4.f(pVarD, pVar, pVar2, pVar3));
        e eVar2 = new e(eVar.f5841a, eVar.f5842b, eVar.f5843c, (Long) pVar3.f1626l, (Long) pVar.f1626l, (Long) pVar2.f1626l);
        N3.h.b(eVar2);
        return eVar2;
    }
}

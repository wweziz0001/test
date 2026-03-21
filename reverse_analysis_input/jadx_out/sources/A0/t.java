package A0;

import java.util.Objects;
import m2.AbstractC0666z;
import m2.Z;
import m2.i0;

/* JADX INFO: loaded from: classes.dex */
public final class t extends s {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final int f137A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final boolean f138B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final boolean f139C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public final int f140D;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final boolean f141p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final m f142q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final boolean f143r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final boolean f144s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final boolean f145t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final int f146u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final int f147v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final int f148w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final int f149x;
    public final boolean y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final boolean f150z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00e9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public t(int r8, a0.C0170V r9, int r10, A0.m r11, int r12, int r13, boolean r14) {
        /*
            Method dump skipped, instruction units count: 402
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: A0.t.<init>(int, a0.V, int, A0.m, int, int, boolean):void");
    }

    public static int c(t tVar, t tVar2) {
        AbstractC0666z abstractC0666zC = AbstractC0666z.f8669a.c(tVar.f144s, tVar2.f144s).a(tVar.f149x, tVar2.f149x).c(tVar.y, tVar2.y).c(tVar.f145t, tVar2.f145t).c(tVar.f141p, tVar2.f141p).c(tVar.f143r, tVar2.f143r);
        Integer numValueOf = Integer.valueOf(tVar.f148w);
        Integer numValueOf2 = Integer.valueOf(tVar2.f148w);
        Z.f8576l.getClass();
        AbstractC0666z abstractC0666zB = abstractC0666zC.b(numValueOf, numValueOf2, i0.f8623l);
        boolean z4 = tVar2.f138B;
        boolean z5 = tVar.f138B;
        AbstractC0666z abstractC0666zC2 = abstractC0666zB.c(z5, z4);
        boolean z6 = tVar2.f139C;
        boolean z7 = tVar.f139C;
        AbstractC0666z abstractC0666zC3 = abstractC0666zC2.c(z7, z6);
        if (z5 && z7) {
            abstractC0666zC3 = abstractC0666zC3.a(tVar.f140D, tVar2.f140D);
        }
        return abstractC0666zC3.e();
    }

    @Override // A0.s
    public final int a() {
        return this.f137A;
    }

    @Override // A0.s
    public final boolean b(s sVar) {
        t tVar = (t) sVar;
        if (this.f150z || Objects.equals(this.f136o.f3424n, tVar.f136o.f3424n)) {
            this.f142q.getClass();
            if (this.f138B == tVar.f138B && this.f139C == tVar.f139C) {
                return true;
            }
        }
        return false;
    }
}

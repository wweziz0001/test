package j0;

import a0.C0190p;
import d0.AbstractC0370w;
import h0.C0448G;
import h0.C0459j;
import h0.C0473y;
import h0.SurfaceHolderCallbackC0445D;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class f implements Runnable {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f7271l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Z1.c f7272m;

    public /* synthetic */ f(Z1.c cVar, int i, long j5, long j6) {
        this.f7271l = 9;
        this.f7272m = cVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = 15;
        Z1.c cVar = this.f7272m;
        int i5 = this.f7271l;
        cVar.getClass();
        switch (i5) {
            case 0:
                int i6 = AbstractC0370w.f5326a;
                C0448G c0448g = ((SurfaceHolderCallbackC0445D) ((h) cVar.f2997m)).f5909l;
                c0448g.getClass();
                i0.c cVar2 = c0448g.f5960r;
                cVar2.l(cVar2.k(), 1007, new i0.b(17));
                break;
            case 1:
                int i7 = AbstractC0370w.f5326a;
                i0.c cVar3 = ((SurfaceHolderCallbackC0445D) ((h) cVar.f2997m)).f5909l.f5960r;
                cVar3.l(cVar3.k(), 1031, new i0.b(14));
                break;
            case 2:
                int i8 = AbstractC0370w.f5326a;
                i0.c cVar4 = ((SurfaceHolderCallbackC0445D) ((h) cVar.f2997m)).f5909l.f5960r;
                cVar4.l(cVar4.k(), 1032, new i0.b(i));
                break;
            case 3:
                int i9 = AbstractC0370w.f5326a;
                i0.c cVar5 = ((SurfaceHolderCallbackC0445D) ((h) cVar.f2997m)).f5909l.f5960r;
                cVar5.l(cVar5.k(), 1029, new i0.b(3));
                break;
            case 4:
                int i10 = AbstractC0370w.f5326a;
                i0.c cVar6 = ((SurfaceHolderCallbackC0445D) ((h) cVar.f2997m)).f5909l.f5960r;
                cVar6.l(cVar6.k(), 1014, new i0.b(5));
                break;
            case 5:
                int i11 = AbstractC0370w.f5326a;
                C0448G c0448g2 = ((SurfaceHolderCallbackC0445D) ((h) cVar.f2997m)).f5909l;
                c0448g2.getClass();
                i0.c cVar7 = c0448g2.f5960r;
                cVar7.l(cVar7.k(), 1009, new C0473y(29));
                break;
            case O.j.STRING_SET_FIELD_NUMBER /* 6 */:
                int i12 = AbstractC0370w.f5326a;
                i0.c cVar8 = ((SurfaceHolderCallbackC0445D) ((h) cVar.f2997m)).f5909l.f5960r;
                cVar8.l(cVar8.k(), 1008, new C0473y(15));
                break;
            case O.j.DOUBLE_FIELD_NUMBER /* 7 */:
                int i13 = AbstractC0370w.f5326a;
                i0.c cVar9 = ((SurfaceHolderCallbackC0445D) ((h) cVar.f2997m)).f5909l.f5960r;
                cVar9.l(cVar9.k(), 1012, new i0.b(19));
                break;
            case O.j.BYTES_FIELD_NUMBER /* 8 */:
                int i14 = AbstractC0370w.f5326a;
                i0.c cVar10 = ((SurfaceHolderCallbackC0445D) ((h) cVar.f2997m)).f5909l.f5960r;
                cVar10.l(cVar10.k(), 1010, new C0473y(13));
                break;
            default:
                int i15 = AbstractC0370w.f5326a;
                i0.c cVar11 = ((SurfaceHolderCallbackC0445D) ((h) cVar.f2997m)).f5909l.f5960r;
                cVar11.l(cVar11.k(), 1011, new i0.b(9));
                break;
        }
    }

    public /* synthetic */ f(Z1.c cVar, long j5) {
        this.f7271l = 8;
        this.f7272m = cVar;
    }

    public /* synthetic */ f(Z1.c cVar, C0190p c0190p, C0459j c0459j) {
        this.f7271l = 5;
        this.f7272m = cVar;
    }

    public /* synthetic */ f(Z1.c cVar, Object obj, int i) {
        this.f7271l = i;
        this.f7272m = cVar;
    }

    public /* synthetic */ f(Z1.c cVar, String str, long j5, long j6) {
        this.f7271l = 6;
        this.f7272m = cVar;
    }
}

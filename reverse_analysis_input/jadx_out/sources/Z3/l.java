package Z3;

import V3.InterfaceC0143u;

/* JADX INFO: loaded from: classes.dex */
public final class l extends G3.f implements M3.p {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public X3.h f3123p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public byte[] f3124q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f3125r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f3126s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f3127t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public /* synthetic */ Object f3128u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Y3.g[] f3129v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ G1.a f3130w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ V1.g f3131x;
    public final /* synthetic */ Y3.h y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(Y3.g[] gVarArr, G1.a aVar, V1.g gVar, Y3.h hVar, E3.d dVar) {
        super(2, dVar);
        this.f3129v = gVarArr;
        this.f3130w = aVar;
        this.f3131x = gVar;
        this.y = hVar;
    }

    @Override // G3.b
    public final E3.d a(E3.d dVar, Object obj) {
        V1.g gVar = this.f3131x;
        l lVar = new l(this.f3129v, this.f3130w, gVar, this.y, dVar);
        lVar.f3128u = obj;
        return lVar;
    }

    @Override // M3.p
    public final Object i(Object obj, Object obj2) {
        return ((l) a((E3.d) obj2, (InterfaceC0143u) obj)).l(B3.g.f275a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x0090, code lost:
    
        if (r8 != 0) goto L20;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00b0 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00b1 A[LOOP:0: B:30:0x00b1->B:47:?, LOOP_START, PHI: r8 r12
      0x00b1: PHI (r8v3 int) = (r8v2 int), (r8v4 int) binds: [B:28:0x00ae, B:47:?] A[DONT_GENERATE, DONT_INLINE]
      0x00b1: PHI (r12v4 C3.q) = (r12v3 C3.q), (r12v10 C3.q) binds: [B:28:0x00ae, B:47:?] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00d5  */
    /* JADX WARN: Type inference failed for: r10v0, types: [X3.d] */
    /* JADX WARN: Type inference failed for: r10v1, types: [X3.h, X3.t] */
    /* JADX WARN: Type inference failed for: r10v2, types: [X3.h, X3.t] */
    /* JADX WARN: Type inference failed for: r10v4, types: [X3.h] */
    /* JADX WARN: Type inference failed for: r10v5, types: [X3.h] */
    /* JADX WARN: Type inference failed for: r10v6 */
    /* JADX WARN: Type inference failed for: r10v7 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:43:0x010a -> B:20:0x0090). Please report as a decompilation issue!!! */
    @Override // G3.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object l(java.lang.Object r20) {
        /*
            Method dump skipped, instruction units count: 269
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Z3.l.l(java.lang.Object):java.lang.Object");
    }
}

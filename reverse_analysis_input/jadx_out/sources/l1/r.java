package l1;

import F0.K;
import d0.AbstractC0360m;
import d0.AbstractC0370w;
import d0.C0363p;

/* JADX INFO: loaded from: classes.dex */
public final class r implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Z1.s f8101a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f8102b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public K f8103c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public q f8104d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f8105e;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long f8111l;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean[] f8106f = new boolean[3];

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final h0.K f8107g = new h0.K(32);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final h0.K f8108h = new h0.K(33);
    public final h0.K i = new h0.K(34);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final h0.K f8109j = new h0.K(39);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final h0.K f8110k = new h0.K(40);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public long f8112m = -9223372036854775807L;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final C0363p f8113n = new C0363p();

    public r(Z1.s sVar) {
        this.f8101a = sVar;
    }

    @Override // l1.h
    public final void a() {
        this.f8111l = 0L;
        this.f8112m = -9223372036854775807L;
        e0.n.a(this.f8106f);
        this.f8107g.d();
        this.f8108h.d();
        this.i.d();
        this.f8109j.d();
        this.f8110k.d();
        ((A0.y) this.f8101a.f3087o).c(0);
        q qVar = this.f8104d;
        if (qVar != null) {
            qVar.f8094f = false;
            qVar.f8095g = false;
            qVar.f8096h = false;
            qVar.i = false;
            qVar.f8097j = false;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:106:0x025a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0203  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0238  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0244  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x024b  */
    /* JADX WARN: Type inference failed for: r11v2, types: [h0.K] */
    /* JADX WARN: Type inference failed for: r1v3, types: [h0.K] */
    /* JADX WARN: Type inference failed for: r1v4, types: [h0.K] */
    /* JADX WARN: Type inference failed for: r27v0 */
    /* JADX WARN: Type inference failed for: r27v1 */
    /* JADX WARN: Type inference failed for: r27v2 */
    /* JADX WARN: Type inference failed for: r27v3 */
    /* JADX WARN: Type inference failed for: r27v4 */
    /* JADX WARN: Type inference failed for: r27v5 */
    /* JADX WARN: Type inference failed for: r28v0 */
    /* JADX WARN: Type inference failed for: r28v1 */
    /* JADX WARN: Type inference failed for: r28v2 */
    /* JADX WARN: Type inference failed for: r28v3 */
    /* JADX WARN: Type inference failed for: r28v4 */
    /* JADX WARN: Type inference failed for: r28v5 */
    /* JADX WARN: Type inference failed for: r29v0 */
    /* JADX WARN: Type inference failed for: r29v1 */
    /* JADX WARN: Type inference failed for: r29v2 */
    /* JADX WARN: Type inference failed for: r29v3 */
    /* JADX WARN: Type inference failed for: r29v4 */
    /* JADX WARN: Type inference failed for: r29v5 */
    /* JADX WARN: Type inference failed for: r2v3, types: [h0.K] */
    /* JADX WARN: Type inference failed for: r2v5, types: [h0.K] */
    /* JADX WARN: Type inference failed for: r3v13, types: [h0.K] */
    /* JADX WARN: Type inference failed for: r3v14, types: [h0.K] */
    /* JADX WARN: Type inference failed for: r3v15, types: [h0.K] */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6, types: [int] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // l1.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(d0.C0363p r38) {
        /*
            Method dump skipped, instruction units count: 624
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l1.r.b(d0.p):void");
    }

    @Override // l1.h
    public final void c(boolean z4) {
        AbstractC0360m.i(this.f8103c);
        int i = AbstractC0370w.f5326a;
        if (z4) {
            ((A0.y) this.f8101a.f3087o).c(0);
            q qVar = this.f8104d;
            long j5 = this.f8111l;
            qVar.f8100m = qVar.f8091c;
            qVar.a((int) (j5 - qVar.f8090b));
            qVar.f8098k = qVar.f8090b;
            qVar.f8090b = j5;
            qVar.a(0);
            qVar.i = false;
        }
    }

    @Override // l1.h
    public final void d(F0.s sVar, E e5) {
        e5.a();
        e5.c();
        this.f8102b = (String) e5.f7921e;
        e5.c();
        K k4 = sVar.k(e5.f7919c, 2);
        this.f8103c = k4;
        this.f8104d = new q(k4);
        this.f8101a.y(sVar, e5);
    }

    @Override // l1.h
    public final void e(long j5, int i) {
        this.f8112m = j5;
    }

    public final void f(byte[] bArr, int i, int i5) {
        q qVar = this.f8104d;
        if (qVar.f8094f) {
            int i6 = qVar.f8092d;
            int i7 = (i + 2) - i6;
            if (i7 < i5) {
                qVar.f8095g = (bArr[i7] & 128) != 0;
                qVar.f8094f = false;
            } else {
                qVar.f8092d = (i5 - i) + i6;
            }
        }
        if (!this.f8105e) {
            this.f8107g.a(bArr, i, i5);
            this.f8108h.a(bArr, i, i5);
            this.i.a(bArr, i, i5);
        }
        this.f8109j.a(bArr, i, i5);
        this.f8110k.a(bArr, i, i5);
    }
}

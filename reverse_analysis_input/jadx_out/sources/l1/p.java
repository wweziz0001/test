package l1;

import F0.K;
import d0.AbstractC0360m;
import d0.AbstractC0370w;
import d0.C0363p;

/* JADX INFO: loaded from: classes.dex */
public final class p implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Z1.s f8075a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f8076b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f8077c;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f8081g;
    public String i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public K f8083j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public o f8084k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f8085l;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f8087n;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean[] f8082h = new boolean[3];

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final h0.K f8078d = new h0.K(7);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final h0.K f8079e = new h0.K(8);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final h0.K f8080f = new h0.K(6);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public long f8086m = -9223372036854775807L;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final C0363p f8088o = new C0363p();

    public p(Z1.s sVar, boolean z4, boolean z5) {
        this.f8075a = sVar;
        this.f8076b = z4;
        this.f8077c = z5;
    }

    @Override // l1.h
    public final void a() {
        this.f8081g = 0L;
        this.f8087n = false;
        this.f8086m = -9223372036854775807L;
        e0.n.a(this.f8082h);
        this.f8078d.d();
        this.f8079e.d();
        this.f8080f.d();
        ((A0.y) this.f8075a.f3087o).c(0);
        o oVar = this.f8084k;
        if (oVar != null) {
            oVar.f8066k = false;
            oVar.f8070o = false;
            n nVar = oVar.f8069n;
            nVar.f8043b = false;
            nVar.f8042a = false;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:124:0x02f7  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x028a  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
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
    public final void b(d0.C0363p r33) {
        /*
            Method dump skipped, instruction units count: 787
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l1.p.b(d0.p):void");
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // l1.h
    public final void c(boolean z4) {
        AbstractC0360m.i(this.f8083j);
        int i = AbstractC0370w.f5326a;
        if (z4) {
            ((A0.y) this.f8075a.f3087o).c(0);
            o oVar = this.f8084k;
            long j5 = this.f8081g;
            oVar.a();
            oVar.f8065j = j5;
            long j6 = oVar.f8072q;
            if (j6 != -9223372036854775807L) {
                boolean z5 = oVar.f8073r;
                oVar.f8057a.b(j6, z5 ? 1 : 0, (int) (j5 - oVar.f8071p), 0, null);
            }
            oVar.f8070o = false;
        }
    }

    @Override // l1.h
    public final void d(F0.s sVar, E e5) {
        e5.a();
        e5.c();
        this.i = (String) e5.f7921e;
        e5.c();
        K k4 = sVar.k(e5.f7919c, 2);
        this.f8083j = k4;
        this.f8084k = new o(k4, this.f8076b, this.f8077c);
        this.f8075a.y(sVar, e5);
    }

    @Override // l1.h
    public final void e(long j5, int i) {
        this.f8086m = j5;
        this.f8087n |= (i & 2) != 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x013e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void f(byte[] r18, int r19, int r20) {
        /*
            Method dump skipped, instruction units count: 399
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l1.p.f(byte[], int, int):void");
    }
}

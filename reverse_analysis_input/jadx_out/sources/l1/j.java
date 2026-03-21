package l1;

import F0.K;
import d0.AbstractC0360m;
import d0.C0363p;

/* JADX INFO: loaded from: classes.dex */
public final class j implements h {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final double[] f8001q = {23.976023976023978d, 24.0d, 25.0d, 29.97002997002997d, 30.0d, 50.0d, 59.94005994005994d, 60.0d};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f8002a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public K f8003b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Z1.e f8004c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C0363p f8005d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final h0.K f8006e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean[] f8007f = new boolean[4];

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final i f8008g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f8009h;
    public boolean i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f8010j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long f8011k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long f8012l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public long f8013m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public long f8014n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f8015o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f8016p;

    public j(Z1.e eVar) {
        this.f8004c = eVar;
        i iVar = new i();
        iVar.f8000d = new byte[128];
        this.f8008g = iVar;
        if (eVar != null) {
            this.f8006e = new h0.K(178);
            this.f8005d = new C0363p();
        } else {
            this.f8006e = null;
            this.f8005d = null;
        }
        this.f8012l = -9223372036854775807L;
        this.f8014n = -9223372036854775807L;
    }

    @Override // l1.h
    public final void a() {
        e0.n.a(this.f8007f);
        i iVar = this.f8008g;
        iVar.f7997a = false;
        iVar.f7998b = 0;
        iVar.f7999c = 0;
        h0.K k4 = this.f8006e;
        if (k4 != null) {
            k4.d();
        }
        this.f8009h = 0L;
        this.i = false;
        this.f8012l = -9223372036854775807L;
        this.f8014n = -9223372036854775807L;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0194  */
    /* JADX WARN: Type inference failed for: r4v18 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4, types: [int] */
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
    public final void b(d0.C0363p r27) {
        /*
            Method dump skipped, instruction units count: 530
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l1.j.b(d0.p):void");
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
        AbstractC0360m.i(this.f8003b);
        if (z4) {
            boolean z5 = this.f8015o;
            this.f8003b.b(this.f8014n, z5 ? 1 : 0, (int) (this.f8009h - this.f8013m), 0, null);
        }
    }

    @Override // l1.h
    public final void d(F0.s sVar, E e5) {
        e5.a();
        e5.c();
        this.f8002a = (String) e5.f7921e;
        e5.c();
        this.f8003b = sVar.k(e5.f7919c, 2);
        Z1.e eVar = this.f8004c;
        if (eVar != null) {
            eVar.n(sVar, e5);
        }
    }

    @Override // l1.h
    public final void e(long j5, int i) {
        this.f8012l = j5;
    }
}

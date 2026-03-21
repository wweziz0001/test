package l1;

import F0.K;

/* JADX INFO: loaded from: classes.dex */
public final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final K f8089a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f8090b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f8091c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f8092d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f8093e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f8094f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f8095g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f8096h;
    public boolean i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f8097j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long f8098k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long f8099l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f8100m;

    public q(K k4) {
        this.f8089a = k4;
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
    public final void a(int i) {
        long j5 = this.f8099l;
        if (j5 == -9223372036854775807L) {
            return;
        }
        boolean z4 = this.f8100m;
        this.f8089a.b(j5, z4 ? 1 : 0, (int) (this.f8090b - this.f8098k), i, null);
    }
}

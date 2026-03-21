package l1;

import F0.K;
import d0.AbstractC0360m;

/* JADX INFO: loaded from: classes.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final K f8023a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f8024b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f8025c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f8026d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f8027e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f8028f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f8029g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f8030h;

    public l(K k4) {
        this.f8023a = k4;
    }

    public final void a(byte[] bArr, int i, int i5) {
        if (this.f8025c) {
            int i6 = this.f8028f;
            int i7 = (i + 1) - i6;
            if (i7 >= i5) {
                this.f8028f = (i5 - i) + i6;
            } else {
                this.f8026d = ((bArr[i7] & 192) >> 6) == 0;
                this.f8025c = false;
            }
        }
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
    public final void b(int i, long j5, boolean z4) {
        AbstractC0360m.h(this.f8030h != -9223372036854775807L);
        if (this.f8027e == 182 && z4 && this.f8024b) {
            this.f8023a.b(this.f8030h, this.f8026d ? 1 : 0, (int) (j5 - this.f8029g), i, null);
        }
        if (this.f8027e != 179) {
            this.f8029g = j5;
        }
    }
}

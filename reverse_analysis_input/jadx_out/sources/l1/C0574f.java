package l1;

import F0.C0054a;
import F0.K;
import a0.AbstractC0156G;
import a0.C0189o;
import a0.C0190p;
import d0.C0363p;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: l1.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0574f implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C0363p f7974a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f7976c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f7977d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f7978e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public K f7979f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f7981h;
    public int i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public long f7982j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public C0190p f7983k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f7984l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f7985m;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f7980g = 0;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public long f7988p = -9223372036854775807L;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AtomicInteger f7975b = new AtomicInteger();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f7986n = -1;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f7987o = -1;

    public C0574f(int i, String str, int i5) {
        this.f7974a = new C0363p(new byte[i5]);
        this.f7976c = str;
        this.f7977d = i;
    }

    @Override // l1.h
    public final void a() {
        this.f7980g = 0;
        this.f7981h = 0;
        this.i = 0;
        this.f7988p = -9223372036854775807L;
        this.f7975b.set(0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:181:0x046d  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x0476  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x04a0  */
    /* JADX WARN: Type inference failed for: r10v10 */
    /* JADX WARN: Type inference failed for: r10v8 */
    /* JADX WARN: Type inference failed for: r10v9 */
    /* JADX WARN: Type inference failed for: r15v0, types: [F0.K] */
    /* JADX WARN: Type inference failed for: r18v1 */
    /* JADX WARN: Type inference failed for: r18v2, types: [int] */
    /* JADX WARN: Type inference failed for: r18v3 */
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
    public final void b(d0.C0363p r38) throws a0.C0157H {
        /*
            Method dump skipped, instruction units count: 1402
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l1.C0574f.b(d0.p):void");
    }

    @Override // l1.h
    public final void d(F0.s sVar, E e5) {
        e5.a();
        e5.c();
        this.f7978e = (String) e5.f7921e;
        e5.c();
        this.f7979f = sVar.k(e5.f7919c, 1);
    }

    @Override // l1.h
    public final void e(long j5, int i) {
        this.f7988p = j5;
    }

    public final boolean f(C0363p c0363p, byte[] bArr, int i) {
        int iMin = Math.min(c0363p.a(), i - this.f7981h);
        c0363p.g(bArr, this.f7981h, iMin);
        int i5 = this.f7981h + iMin;
        this.f7981h = i5;
        return i5 == i;
    }

    public final void g(C0054a c0054a) {
        int i;
        int i5 = c0054a.f717b;
        if (i5 == -2147483647 || (i = c0054a.f718c) == -1) {
            return;
        }
        C0190p c0190p = this.f7983k;
        String str = c0054a.f716a;
        if (c0190p != null && i == c0190p.f3402C && i5 == c0190p.f3403D && str.equals(c0190p.f3424n)) {
            return;
        }
        C0190p c0190p2 = this.f7983k;
        C0189o c0189o = c0190p2 == null ? new C0189o() : c0190p2.a();
        c0189o.f3376a = this.f7978e;
        c0189o.f3387m = AbstractC0156G.m(str);
        c0189o.f3366B = i;
        c0189o.f3367C = i5;
        c0189o.f3379d = this.f7976c;
        c0189o.f3381f = this.f7977d;
        C0190p c0190p3 = new C0190p(c0189o);
        this.f7983k = c0190p3;
        this.f7979f.c(c0190p3);
    }

    @Override // l1.h
    public final void c(boolean z4) {
    }
}

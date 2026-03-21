package l1;

import F0.M;
import b3.AbstractC0307a;
import d0.AbstractC0360m;
import d0.C0363p;
import d0.C0368u;

/* JADX INFO: loaded from: classes.dex */
public final class w implements F {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h f8170a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final M f8171b = new M(10, new byte[10]);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f8172c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f8173d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public C0368u f8174e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f8175f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f8176g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f8177h;
    public int i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f8178j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f8179k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long f8180l;

    public w(h hVar) {
        this.f8170a = hVar;
    }

    @Override // l1.F
    public final void a() {
        this.f8172c = 0;
        this.f8173d = 0;
        this.f8177h = false;
        this.f8170a.a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0, types: [F0.M] */
    /* JADX WARN: Type inference failed for: r11v3, types: [int] */
    /* JADX WARN: Type inference failed for: r11v8 */
    /* JADX WARN: Type inference failed for: r11v9 */
    /* JADX WARN: Type inference failed for: r17v3 */
    /* JADX WARN: Type inference failed for: r18v0 */
    /* JADX WARN: Type inference failed for: r18v2 */
    /* JADX WARN: Type inference failed for: r3v0, types: [l1.h] */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r9v15 */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v5 */
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
    @Override // l1.F
    public final void b(int i, C0363p c0363p) {
        int i5;
        int i6;
        int i7;
        boolean z4;
        int i8;
        AbstractC0360m.i(this.f8174e);
        int i9 = i & 1;
        ?? r32 = this.f8170a;
        int i10 = -1;
        int i11 = 3;
        int i12 = 2;
        ?? r9 = 0;
        if (i9 != 0) {
            int i13 = this.f8172c;
            if (i13 != 0 && i13 != 1) {
                if (i13 == 2) {
                    AbstractC0360m.y("PesReader", "Unexpected start indicator reading extended header");
                } else {
                    if (i13 != 3) {
                        throw new IllegalStateException();
                    }
                    if (this.f8178j != -1) {
                        AbstractC0360m.y("PesReader", "Unexpected start indicator: expected " + this.f8178j + " more bytes");
                    }
                    r32.c(c0363p.f5315c == 0);
                }
            }
            this.f8172c = 1;
            this.f8173d = 0;
        }
        int i14 = i;
        while (c0363p.a() > 0) {
            int i15 = this.f8172c;
            if (i15 != 0) {
                ?? r11 = this.f8171b;
                if (i15 == 1) {
                    i6 = i11;
                    ?? r7 = r9;
                    if (d(c0363p, r11.f711b, 9)) {
                        r11.r(r7 == true ? 1 : 0);
                        int i16 = r11.i(24);
                        if (i16 != 1) {
                            AbstractC0307a.o(i16, "Unexpected start code prefix: ", "PesReader");
                            this.f8178j = -1;
                            i5 = -1;
                            i8 = 0;
                            i7 = 2;
                        } else {
                            r11.u(8);
                            int i17 = r11.i(16);
                            r11.u(5);
                            this.f8179k = r11.h();
                            i7 = 2;
                            r11.u(2);
                            this.f8175f = r11.h();
                            this.f8176g = r11.h();
                            r11.u(6);
                            int i18 = r11.i(8);
                            this.i = i18;
                            if (i17 == 0) {
                                this.f8178j = -1;
                                i5 = -1;
                            } else {
                                int i19 = (i17 - 3) - i18;
                                this.f8178j = i19;
                                if (i19 < 0) {
                                    AbstractC0360m.y("PesReader", "Found negative packet payload size: " + this.f8178j);
                                    i5 = -1;
                                    this.f8178j = -1;
                                } else {
                                    i5 = -1;
                                }
                            }
                            i8 = 2;
                        }
                        this.f8172c = i8;
                        z4 = false;
                        this.f8173d = 0;
                    } else {
                        z4 = r7 == true ? 1 : 0;
                        i5 = -1;
                        i7 = 2;
                    }
                } else if (i15 == i12) {
                    if (d(c0363p, r11.f711b, Math.min(10, this.i)) && d(c0363p, null, this.i)) {
                        r11.r(r9);
                        this.f8180l = -9223372036854775807L;
                        if (this.f8175f) {
                            r11.u(4);
                            long jI = ((long) r11.i(i11)) << 30;
                            r11.u(1);
                            long jI2 = jI | ((long) (r11.i(15) << 15));
                            r11.u(1);
                            long jI3 = jI2 | ((long) r11.i(15));
                            r11.u(1);
                            if (!this.f8177h && this.f8176g) {
                                r11.u(4);
                                long jI4 = ((long) r11.i(i11)) << 30;
                                r11.u(1);
                                long jI5 = ((long) (r11.i(15) << 15)) | jI4;
                                r11.u(1);
                                long jI6 = jI5 | ((long) r11.i(15));
                                r11.u(1);
                                this.f8174e.b(jI6);
                                this.f8177h = true;
                            }
                            this.f8180l = this.f8174e.b(jI3);
                        }
                        i14 |= this.f8179k ? 4 : 0;
                        r32.e(this.f8180l, i14);
                        this.f8172c = 3;
                        this.f8173d = 0;
                        r9 = 0;
                        i12 = 2;
                        i11 = 3;
                        i10 = -1;
                    } else {
                        i6 = i11;
                        i5 = -1;
                        ?? r17 = r9;
                        i7 = i12;
                        z4 = r17 == true ? 1 : 0;
                    }
                } else {
                    if (i15 != i11) {
                        throw new IllegalStateException();
                    }
                    int iA = c0363p.a();
                    int i20 = this.f8178j;
                    ?? r112 = i20 == i10 ? r9 : iA - i20;
                    if (r112 > 0) {
                        iA -= r112;
                        c0363p.G(c0363p.f5314b + iA);
                    }
                    r32.b(c0363p);
                    int i21 = this.f8178j;
                    if (i21 != i10) {
                        int i22 = i21 - iA;
                        this.f8178j = i22;
                        if (i22 == 0) {
                            r32.c(r9);
                            this.f8172c = 1;
                            this.f8173d = r9;
                        }
                    }
                    int i23 = i11;
                    i5 = i10;
                    i6 = i23;
                    ?? r18 = r9;
                    i7 = i12;
                    z4 = r18 == true ? 1 : 0;
                }
            } else {
                int i24 = i11;
                i5 = i10;
                i6 = i24;
                ?? r182 = r9;
                i7 = i12;
                z4 = r182 == true ? 1 : 0;
                c0363p.I(c0363p.a());
            }
            int i25 = i5;
            i11 = i6;
            i10 = i25;
            int i26 = i7;
            r9 = z4;
            i12 = i26;
        }
    }

    @Override // l1.F
    public final void c(C0368u c0368u, F0.s sVar, E e5) {
        this.f8174e = c0368u;
        this.f8170a.d(sVar, e5);
    }

    public final boolean d(C0363p c0363p, byte[] bArr, int i) {
        int iMin = Math.min(c0363p.a(), i - this.f8173d);
        if (iMin <= 0) {
            return true;
        }
        if (bArr == null) {
            c0363p.I(iMin);
        } else {
            c0363p.g(bArr, this.f8173d, iMin);
        }
        int i5 = this.f8173d + iMin;
        this.f8173d = i5;
        return i5 == i;
    }
}

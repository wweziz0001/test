package u0;

import F0.K;
import F0.s;
import a0.C0189o;
import a0.C0190p;
import d0.AbstractC0360m;
import d0.AbstractC0370w;
import d0.C0363p;
import java.util.Locale;
import m.B0;
import t0.C0851h;
import t0.C0853j;

/* JADX INFO: renamed from: u0.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0888d implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10170a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C0853j f10171b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public K f10172c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f10173d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f10174e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f10175f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f10176g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f10177h;
    public int i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f10178j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f10179k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f10180l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f10181m;

    public C0888d(C0853j c0853j, int i) {
        this.f10170a = i;
        switch (i) {
            case 1:
                this.f10171b = c0853j;
                this.f10173d = -9223372036854775807L;
                this.f10176g = -1;
                this.f10177h = -9223372036854775807L;
                this.f10174e = 0L;
                this.f10175f = -1;
                this.i = -1;
                this.f10178j = -1;
                break;
            default:
                this.f10171b = c0853j;
                this.f10173d = -9223372036854775807L;
                this.f10176g = -1;
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
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
    @Override // u0.i
    public final void a(C0363p c0363p, long j5, int i, boolean z4) {
        int i5;
        int i6;
        C0853j c0853j = this.f10171b;
        switch (this.f10170a) {
            case 0:
                AbstractC0360m.i(this.f10172c);
                int i7 = c0363p.f5314b;
                int iB = c0363p.B();
                Object[] objArr = (iB & 1024) > 0;
                if ((iB & 512) == 0 && (iB & 504) == 0 && (iB & 7) == 0) {
                    if (objArr == true) {
                        if (this.f10181m && this.f10175f > 0) {
                            K k4 = this.f10172c;
                            k4.getClass();
                            k4.b(this.f10177h, this.f10179k ? 1 : 0, this.f10175f, 0, null);
                            this.f10175f = 0;
                            this.f10177h = -9223372036854775807L;
                            this.f10179k = false;
                            this.f10181m = false;
                        }
                        this.f10181m = true;
                        if ((c0363p.f() & 252) < 128) {
                            AbstractC0360m.y("RtpH263Reader", "Picture start Code (PSC) missing, dropping packet.");
                        } else {
                            byte[] bArr = c0363p.f5313a;
                            bArr[i7] = 0;
                            bArr[i7 + 1] = 0;
                            c0363p.H(i7);
                        }
                    } else if (this.f10181m) {
                        int iA = C0851h.a(this.f10176g);
                        if (i < iA) {
                            int i8 = AbstractC0370w.f5326a;
                            Locale locale = Locale.US;
                            AbstractC0360m.y("RtpH263Reader", "Received RTP packet with unexpected sequence number. Expected: " + iA + "; received: " + i + ". Dropping packet.");
                        }
                    } else {
                        AbstractC0360m.y("RtpH263Reader", "First payload octet of the H263 packet is not the beginning of a new H263 partition, Dropping current packet.");
                    }
                    if (this.f10175f == 0) {
                        boolean z5 = this.f10180l;
                        int i9 = c0363p.f5314b;
                        if (((c0363p.x() >> 10) & 63) == 32) {
                            int iF = c0363p.f();
                            int i10 = (iF >> 1) & 1;
                            if (!z5 && i10 == 0) {
                                int i11 = (iF >> 2) & 7;
                                if (i11 == 1) {
                                    this.i = 128;
                                    this.f10178j = 96;
                                } else {
                                    int i12 = i11 - 2;
                                    this.i = 176 << i12;
                                    this.f10178j = 144 << i12;
                                }
                            }
                            c0363p.H(i9);
                            this.f10179k = i10 == 0;
                        } else {
                            c0363p.H(i9);
                            this.f10179k = false;
                        }
                        if (!this.f10180l && this.f10179k) {
                            int i13 = this.i;
                            C0190p c0190p = c0853j.f9904c;
                            if (i13 != c0190p.f3431u || this.f10178j != c0190p.f3432v) {
                                K k5 = this.f10172c;
                                C0189o c0189oA = c0190p.a();
                                c0189oA.f3394t = this.i;
                                c0189oA.f3395u = this.f10178j;
                                B0.k(c0189oA, k5);
                            }
                            this.f10180l = true;
                        }
                    }
                    int iA2 = c0363p.a();
                    this.f10172c.a(c0363p, iA2, 0);
                    this.f10175f += iA2;
                    this.f10177h = i4.a.Z(this.f10174e, j5, this.f10173d, 90000);
                    if (z4) {
                        K k6 = this.f10172c;
                        k6.getClass();
                        k6.b(this.f10177h, this.f10179k ? 1 : 0, this.f10175f, 0, null);
                        this.f10175f = 0;
                        this.f10177h = -9223372036854775807L;
                        this.f10179k = false;
                        this.f10181m = false;
                    }
                    this.f10176g = i;
                } else {
                    AbstractC0360m.y("RtpH263Reader", "Dropping packet: video reduncancy coding is not supported, packet header VRC, or PLEN or PEBIT is non-zero");
                }
                break;
            default:
                AbstractC0360m.i(this.f10172c);
                int iV = c0363p.v();
                if ((iV & 8) == 8) {
                    if (this.f10179k && this.f10176g > 0) {
                        K k7 = this.f10172c;
                        k7.getClass();
                        k7.b(this.f10177h, this.f10181m ? 1 : 0, this.f10176g, 0, null);
                        this.f10176g = -1;
                        this.f10177h = -9223372036854775807L;
                        this.f10179k = false;
                    }
                    this.f10179k = true;
                } else if (this.f10179k) {
                    int iA3 = C0851h.a(this.f10175f);
                    if (i < iA3) {
                        int i14 = AbstractC0370w.f5326a;
                        Locale locale2 = Locale.US;
                        AbstractC0360m.y("RtpVp9Reader", "Received RTP packet with unexpected sequence number. Expected: " + iA3 + "; received: " + i + ". Dropping packet.");
                    }
                } else {
                    AbstractC0360m.y("RtpVp9Reader", "First payload octet of the RTP packet is not the beginning of a new VP9 partition, Dropping current packet.");
                }
                if ((iV & 128) == 0 || (c0363p.v() & 128) == 0 || c0363p.a() >= 1) {
                    int i15 = iV & 16;
                    AbstractC0360m.b("VP9 flexible mode is not supported.", i15 == 0);
                    if ((iV & 32) != 0) {
                        c0363p.I(1);
                        if (c0363p.a() >= 1) {
                            if (i15 == 0) {
                                c0363p.I(1);
                            }
                        }
                    }
                    if ((iV & 2) != 0) {
                        int iV2 = c0363p.v();
                        int i16 = (iV2 >> 5) & 7;
                        if ((iV2 & 16) != 0) {
                            int i17 = i16 + 1;
                            if (c0363p.a() >= i17 * 4) {
                                for (int i18 = 0; i18 < i17; i18++) {
                                    this.i = c0363p.B();
                                    this.f10178j = c0363p.B();
                                }
                            }
                        }
                        if ((iV2 & 8) != 0) {
                            int iV3 = c0363p.v();
                            if (c0363p.a() >= iV3) {
                                for (int i19 = 0; i19 < iV3; i19++) {
                                    int iB2 = (c0363p.B() & 12) >> 2;
                                    if (c0363p.a() >= iB2) {
                                        c0363p.I(iB2);
                                    }
                                    break;
                                }
                            }
                        }
                    }
                    if (this.f10176g == -1 && this.f10179k) {
                        this.f10181m = (c0363p.f() & 4) == 0;
                    }
                    if (!this.f10180l && (i5 = this.i) != -1 && (i6 = this.f10178j) != -1) {
                        C0190p c0190p2 = c0853j.f9904c;
                        if (i5 != c0190p2.f3431u || i6 != c0190p2.f3432v) {
                            K k8 = this.f10172c;
                            C0189o c0189oA2 = c0190p2.a();
                            c0189oA2.f3394t = this.i;
                            c0189oA2.f3395u = this.f10178j;
                            B0.k(c0189oA2, k8);
                        }
                        this.f10180l = true;
                    }
                    int iA4 = c0363p.a();
                    this.f10172c.a(c0363p, iA4, 0);
                    int i20 = this.f10176g;
                    if (i20 == -1) {
                        this.f10176g = iA4;
                    } else {
                        this.f10176g = i20 + iA4;
                    }
                    this.f10177h = i4.a.Z(this.f10174e, j5, this.f10173d, 90000);
                    if (z4) {
                        K k9 = this.f10172c;
                        k9.getClass();
                        k9.b(this.f10177h, this.f10181m ? 1 : 0, this.f10176g, 0, null);
                        this.f10176g = -1;
                        this.f10177h = -9223372036854775807L;
                        this.f10179k = false;
                    }
                    this.f10175f = i;
                }
                break;
        }
    }

    @Override // u0.i
    public final void b(long j5, long j6) {
        switch (this.f10170a) {
            case 0:
                this.f10173d = j5;
                this.f10175f = 0;
                this.f10174e = j6;
                break;
            default:
                this.f10173d = j5;
                this.f10176g = -1;
                this.f10174e = j6;
                break;
        }
    }

    @Override // u0.i
    public final void c(long j5) {
        switch (this.f10170a) {
            case 0:
                AbstractC0360m.h(this.f10173d == -9223372036854775807L);
                this.f10173d = j5;
                break;
            default:
                AbstractC0360m.h(this.f10173d == -9223372036854775807L);
                this.f10173d = j5;
                break;
        }
    }

    @Override // u0.i
    public final void d(s sVar, int i) {
        switch (this.f10170a) {
            case 0:
                K k4 = sVar.k(i, 2);
                this.f10172c = k4;
                k4.c(this.f10171b.f9904c);
                break;
            default:
                K k5 = sVar.k(i, 2);
                this.f10172c = k5;
                k5.c(this.f10171b.f9904c);
                break;
        }
    }
}

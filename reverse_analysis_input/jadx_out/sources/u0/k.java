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

/* JADX INFO: loaded from: classes.dex */
public final class k implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C0853j f10218a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public K f10219b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f10220c = -9223372036854775807L;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f10221d = -1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f10222e = -1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f10223f = -9223372036854775807L;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f10224g = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f10225h;
    public boolean i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f10226j;

    public k(C0853j c0853j) {
        this.f10218a = c0853j;
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
    @Override // u0.i
    public final void a(C0363p c0363p, long j5, int i, boolean z4) {
        AbstractC0360m.i(this.f10219b);
        int iV = c0363p.v();
        if ((iV & 16) == 16 && (iV & 7) == 0) {
            if (this.f10225h && this.f10222e > 0) {
                K k4 = this.f10219b;
                k4.getClass();
                k4.b(this.f10223f, this.i ? 1 : 0, this.f10222e, 0, null);
                this.f10222e = -1;
                this.f10223f = -9223372036854775807L;
                this.f10225h = false;
            }
            this.f10225h = true;
        } else {
            if (!this.f10225h) {
                AbstractC0360m.y("RtpVP8Reader", "RTP packet is not the start of a new VP8 partition, skipping.");
                return;
            }
            int iA = C0851h.a(this.f10221d);
            if (i < iA) {
                int i5 = AbstractC0370w.f5326a;
                Locale locale = Locale.US;
                AbstractC0360m.y("RtpVP8Reader", "Received RTP packet with unexpected sequence number. Expected: " + iA + "; received: " + i + ". Dropping packet.");
                return;
            }
        }
        if ((iV & 128) != 0) {
            int iV2 = c0363p.v();
            if ((iV2 & 128) != 0 && (c0363p.v() & 128) != 0) {
                c0363p.I(1);
            }
            if ((iV2 & 64) != 0) {
                c0363p.I(1);
            }
            if ((iV2 & 32) != 0 || (16 & iV2) != 0) {
                c0363p.I(1);
            }
        }
        if (this.f10222e == -1 && this.f10225h) {
            this.i = (c0363p.f() & 1) == 0;
        }
        if (!this.f10226j) {
            int i6 = c0363p.f5314b;
            c0363p.H(i6 + 6);
            int iO = c0363p.o() & 16383;
            int iO2 = c0363p.o() & 16383;
            c0363p.H(i6);
            C0190p c0190p = this.f10218a.f9904c;
            if (iO != c0190p.f3431u || iO2 != c0190p.f3432v) {
                K k5 = this.f10219b;
                C0189o c0189oA = c0190p.a();
                c0189oA.f3394t = iO;
                c0189oA.f3395u = iO2;
                B0.k(c0189oA, k5);
            }
            this.f10226j = true;
        }
        int iA2 = c0363p.a();
        this.f10219b.a(c0363p, iA2, 0);
        int i7 = this.f10222e;
        if (i7 == -1) {
            this.f10222e = iA2;
        } else {
            this.f10222e = i7 + iA2;
        }
        this.f10223f = i4.a.Z(this.f10224g, j5, this.f10220c, 90000);
        if (z4) {
            K k6 = this.f10219b;
            k6.getClass();
            k6.b(this.f10223f, this.i ? 1 : 0, this.f10222e, 0, null);
            this.f10222e = -1;
            this.f10223f = -9223372036854775807L;
            this.f10225h = false;
        }
        this.f10221d = i;
    }

    @Override // u0.i
    public final void b(long j5, long j6) {
        this.f10220c = j5;
        this.f10222e = -1;
        this.f10224g = j6;
    }

    @Override // u0.i
    public final void c(long j5) {
        AbstractC0360m.h(this.f10220c == -9223372036854775807L);
        this.f10220c = j5;
    }

    @Override // u0.i
    public final void d(s sVar, int i) {
        K k4 = sVar.k(i, 2);
        this.f10219b = k4;
        k4.c(this.f10218a.f9904c);
    }
}

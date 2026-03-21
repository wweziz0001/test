package p0;

import a0.C0190p;
import android.graphics.Bitmap;
import android.os.Trace;
import com.google.crypto.tink.shaded.protobuf.C0324d;
import d0.AbstractC0360m;
import h0.AbstractC0457h;
import h0.C0464o;
import h0.q0;
import java.util.ArrayDeque;
import m3.C0675i;

/* JADX INFO: loaded from: classes.dex */
public final class g extends AbstractC0457h {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final C0675i f9145C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public final g0.e f9146D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public final ArrayDeque f9147E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public boolean f9148F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public boolean f9149G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public f f9150H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public long f9151I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public long f9152J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public int f9153K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public int f9154L;
    public C0190p M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public C0726b f9155N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public g0.e f9156O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public e f9157P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public Bitmap f9158Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    public boolean f9159R;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public C0324d f9160S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    public C0324d f9161T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public int f9162U;

    public g(C0675i c0675i) {
        super(4);
        this.f9145C = c0675i;
        this.f9157P = e.f9141a;
        this.f9146D = new g0.e(0);
        this.f9150H = f.f9142c;
        this.f9147E = new ArrayDeque();
        this.f9152J = -9223372036854775807L;
        this.f9151I = -9223372036854775807L;
        this.f9153K = 0;
        this.f9154L = 1;
    }

    @Override // h0.o0, h0.q0
    public final String getName() {
        return "ImageRenderer";
    }

    @Override // h0.AbstractC0457h, h0.k0
    public final void handleMessage(int i, Object obj) {
        if (i != 15) {
            return;
        }
        e eVar = obj instanceof e ? (e) obj : null;
        if (eVar == null) {
            eVar = e.f9141a;
        }
        this.f9157P = eVar;
    }

    @Override // h0.AbstractC0457h, h0.o0
    public final boolean isEnded() {
        return this.f9149G;
    }

    @Override // h0.o0
    public final boolean isReady() {
        int i = this.f9154L;
        return i == 3 || (i == 0 && this.f9159R);
    }

    @Override // h0.AbstractC0457h
    public final void j() {
        this.M = null;
        this.f9150H = f.f9142c;
        this.f9147E.clear();
        v();
        this.f9157P.getClass();
    }

    @Override // h0.AbstractC0457h
    public final void k(boolean z4, boolean z5) {
        this.f9154L = z5 ? 1 : 0;
    }

    @Override // h0.AbstractC0457h
    public final void l(long j5, boolean z4) {
        this.f9154L = Math.min(this.f9154L, 1);
        this.f9149G = false;
        this.f9148F = false;
        this.f9158Q = null;
        this.f9160S = null;
        this.f9161T = null;
        this.f9159R = false;
        this.f9156O = null;
        C0726b c0726b = this.f9155N;
        if (c0726b != null) {
            c0726b.flush();
        }
        this.f9147E.clear();
    }

    @Override // h0.AbstractC0457h
    public final void m() {
        v();
    }

    @Override // h0.AbstractC0457h
    public final void n() {
        v();
        this.f9154L = Math.min(this.f9154L, 1);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0023, code lost:
    
        if (r2 >= r6) goto L14;
     */
    @Override // h0.AbstractC0457h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void q(a0.C0190p[] r5, long r6, long r8, x0.H r10) {
        /*
            r4 = this;
            p0.f r5 = r4.f9150H
            long r5 = r5.f9144b
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r5 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r5 == 0) goto L31
            java.util.ArrayDeque r5 = r4.f9147E
            boolean r6 = r5.isEmpty()
            if (r6 == 0) goto L26
            long r6 = r4.f9152J
            int r10 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r10 == 0) goto L31
            long r2 = r4.f9151I
            int r10 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r10 == 0) goto L26
            int r6 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r6 < 0) goto L26
            goto L31
        L26:
            p0.f r6 = new p0.f
            long r0 = r4.f9152J
            r6.<init>(r0, r8)
            r5.add(r6)
            goto L38
        L31:
            p0.f r5 = new p0.f
            r5.<init>(r0, r8)
            r4.f9150H = r5
        L38:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p0.g.q(a0.p[], long, long, x0.H):void");
    }

    @Override // h0.o0
    public final void render(long j5, long j6) throws C0464o {
        if (this.f9149G) {
            return;
        }
        if (this.M == null) {
            Z1.e eVar = this.f6150n;
            eVar.c();
            g0.e eVar2 = this.f9146D;
            eVar2.f();
            int iR = r(eVar, eVar2, 2);
            if (iR != -5) {
                if (iR == -4) {
                    AbstractC0360m.h(eVar2.e(4));
                    this.f9148F = true;
                    this.f9149G = true;
                    return;
                }
                return;
            }
            C0190p c0190p = (C0190p) eVar.f3002n;
            AbstractC0360m.i(c0190p);
            this.M = c0190p;
            u();
        }
        try {
            Trace.beginSection("drainAndFeedDecoder");
            while (s(j5)) {
            }
            while (t(j5)) {
            }
            Trace.endSection();
        } catch (d e5) {
            throw i(e5, null, false, 4003);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:78:0x0143  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean s(long r13) throws h0.C0464o {
        /*
            Method dump skipped, instruction units count: 333
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p0.g.s(long):boolean");
    }

    @Override // h0.q0
    public final int supportsFormat(C0190p c0190p) {
        return this.f9145C.t(c0190p);
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0105  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean t(long r13) {
        /*
            Method dump skipped, instruction units count: 328
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p0.g.t(long):boolean");
    }

    public final void u() throws C0464o {
        C0190p c0190p = this.M;
        C0675i c0675i = this.f9145C;
        int iT = c0675i.t(c0190p);
        if (iT != q0.e(4, 0, 0, 0) && iT != q0.e(3, 0, 0, 0)) {
            throw i(new d("Provided decoder factory can't create decoder for format."), this.M, false, 4005);
        }
        C0726b c0726b = this.f9155N;
        if (c0726b != null) {
            c0726b.release();
        }
        this.f9155N = new C0726b((i0.b) c0675i.f8712m);
    }

    public final void v() {
        this.f9156O = null;
        this.f9153K = 0;
        this.f9152J = -9223372036854775807L;
        C0726b c0726b = this.f9155N;
        if (c0726b != null) {
            c0726b.release();
            this.f9155N = null;
        }
    }
}

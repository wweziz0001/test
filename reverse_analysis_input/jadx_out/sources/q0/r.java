package q0;

import Q1.C0118a;
import a0.C0190p;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaCryptoException;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.SystemClock;
import androidx.lifecycle.E;
import b0.InterfaceC0300d;
import d0.AbstractC0360m;
import d0.AbstractC0370w;
import g0.InterfaceC0435a;
import h0.AbstractC0457h;
import h0.C0449H;
import h0.C0458i;
import h0.C0459j;
import h0.C0464o;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import x0.f0;

/* JADX INFO: loaded from: classes.dex */
public abstract class r extends AbstractC0457h {
    public static final byte[] M0 = {0, 0, 1, 103, 66, -64, 11, -38, 37, -112, 0, 0, 1, 104, -50, 15, 19, 32, 0, 0, 1, 101, -120, -124, 13, -50, 113, 24, -96, 0, 47, -65, 28, 49, -61, 39, 93, 120};

    /* JADX INFO: renamed from: A0, reason: collision with root package name */
    public boolean f9305A0;

    /* JADX INFO: renamed from: B0, reason: collision with root package name */
    public long f9306B0;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final k f9307C;

    /* JADX INFO: renamed from: C0, reason: collision with root package name */
    public long f9308C0;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public final j f9309D;

    /* JADX INFO: renamed from: D0, reason: collision with root package name */
    public boolean f9310D0;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public final float f9311E;

    /* JADX INFO: renamed from: E0, reason: collision with root package name */
    public boolean f9312E0;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public final g0.e f9313F;

    /* JADX INFO: renamed from: F0, reason: collision with root package name */
    public boolean f9314F0;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public final g0.e f9315G;

    /* JADX INFO: renamed from: G0, reason: collision with root package name */
    public boolean f9316G0;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public final g0.e f9317H;

    /* JADX INFO: renamed from: H0, reason: collision with root package name */
    public C0464o f9318H0;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public final h f9319I;

    /* JADX INFO: renamed from: I0, reason: collision with root package name */
    public C0458i f9320I0;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public final MediaCodec.BufferInfo f9321J;

    /* JADX INFO: renamed from: J0, reason: collision with root package name */
    public q f9322J0;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public final ArrayDeque f9323K;

    /* JADX INFO: renamed from: K0, reason: collision with root package name */
    public long f9324K0;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public final j0.y f9325L;

    /* JADX INFO: renamed from: L0, reason: collision with root package name */
    public boolean f9326L0;
    public C0190p M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public C0190p f9327N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public E f9328O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public E f9329P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public C0449H f9330Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    public MediaCrypto f9331R;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public final long f9332S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    public float f9333T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public float f9334U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public l f9335V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public C0190p f9336W;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public MediaFormat f9337X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public boolean f9338Y;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public float f9339Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public ArrayDeque f9340a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public p f9341b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public o f9342c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public int f9343d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public boolean f9344e0;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public boolean f9345f0;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public boolean f9346g0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public boolean f9347h0;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public boolean f9348i0;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public boolean f9349j0;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public long f9350k0;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public long f9351l0;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    public int f9352m0;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public int f9353n0;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    public ByteBuffer f9354o0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public boolean f9355p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public boolean f9356q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public boolean f9357r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public boolean f9358s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public boolean f9359t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public boolean f9360u0;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public int f9361v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public int f9362w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public int f9363x0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public boolean f9364y0;

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    public boolean f9365z0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(int i, k kVar, float f2) {
        super(i);
        j jVar = j.f9286m;
        this.f9307C = kVar;
        this.f9309D = jVar;
        this.f9311E = f2;
        this.f9313F = new g0.e(0);
        this.f9315G = new g0.e(0);
        this.f9317H = new g0.e(2);
        h hVar = new h(2);
        hVar.f9283w = 32;
        this.f9319I = hVar;
        this.f9321J = new MediaCodec.BufferInfo();
        this.f9333T = 1.0f;
        this.f9334U = 1.0f;
        this.f9332S = -9223372036854775807L;
        this.f9323K = new ArrayDeque();
        this.f9322J0 = q.f9300e;
        hVar.j(0);
        hVar.f5787p.order(ByteOrder.nativeOrder());
        j0.y yVar = new j0.y();
        yVar.f7428a = InterfaceC0300d.f4834a;
        yVar.f7430c = 0;
        yVar.f7429b = 2;
        this.f9325L = yVar;
        this.f9339Z = -1.0f;
        this.f9343d0 = 0;
        this.f9361v0 = 0;
        this.f9352m0 = -1;
        this.f9353n0 = -1;
        this.f9351l0 = -9223372036854775807L;
        this.f9306B0 = -9223372036854775807L;
        this.f9308C0 = -9223372036854775807L;
        this.f9324K0 = -9223372036854775807L;
        this.f9350k0 = -9223372036854775807L;
        this.f9362w0 = 0;
        this.f9363x0 = 0;
        this.f9320I0 = new C0458i();
    }

    public final boolean A() {
        if (this.f9335V == null) {
            return false;
        }
        int i = this.f9363x0;
        if (i == 3 || ((this.f9344e0 && !this.f9305A0) || (this.f9345f0 && this.f9365z0))) {
            Z();
            return true;
        }
        if (i == 2) {
            int i5 = AbstractC0370w.f5326a;
            AbstractC0360m.h(i5 >= 23);
            if (i5 >= 23) {
                try {
                    k0();
                } catch (C0464o e5) {
                    AbstractC0360m.z("MediaCodecRenderer", "Failed to update the DRM session, releasing the codec instead.", e5);
                    Z();
                    return true;
                }
            }
        }
        z();
        return false;
    }

    public final List B(boolean z4) {
        C0190p c0190p = this.M;
        c0190p.getClass();
        j jVar = this.f9309D;
        ArrayList arrayListF = F(jVar, c0190p, z4);
        if (arrayListF.isEmpty() && z4) {
            arrayListF = F(jVar, c0190p, false);
            if (!arrayListF.isEmpty()) {
                AbstractC0360m.y("MediaCodecRenderer", "Drm session requires secure decoder for " + c0190p.f3424n + ", but no secure decoder available. Trying to proceed with " + arrayListF + ".");
            }
        }
        return arrayListF;
    }

    public int C(g0.e eVar) {
        return 0;
    }

    public boolean D() {
        return false;
    }

    public abstract float E(float f2, C0190p[] c0190pArr);

    public abstract ArrayList F(j jVar, C0190p c0190p, boolean z4);

    public abstract y2.n G(o oVar, C0190p c0190p, MediaCrypto mediaCrypto, float f2);

    public abstract void H(g0.e eVar);

    /* JADX WARN: Removed duplicated region for block: B:32:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0127  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void I(q0.o r13, android.media.MediaCrypto r14) {
        /*
            Method dump skipped, instruction units count: 486
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: q0.r.I(q0.o, android.media.MediaCrypto):void");
    }

    public final boolean J(long j5, long j6) {
        C0190p c0190p;
        return j6 < j5 && ((c0190p = this.f9327N) == null || !Objects.equals(c0190p.f3424n, "audio/opus") || j5 - j6 > 80000);
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00ce  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void K() {
        /*
            Method dump skipped, instruction units count: 235
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: q0.r.K():void");
    }

    public final void L(MediaCrypto mediaCrypto, boolean z4) throws p {
        C0190p c0190p = this.M;
        c0190p.getClass();
        if (this.f9340a0 == null) {
            try {
                List listB = B(z4);
                this.f9340a0 = new ArrayDeque();
                if (!listB.isEmpty()) {
                    this.f9340a0.add((o) listB.get(0));
                }
                this.f9341b0 = null;
            } catch (v e5) {
                throw new p(c0190p, e5, z4, -49998);
            }
        }
        if (this.f9340a0.isEmpty()) {
            throw new p(c0190p, null, z4, -49999);
        }
        ArrayDeque arrayDeque = this.f9340a0;
        arrayDeque.getClass();
        while (this.f9335V == null) {
            o oVar = (o) arrayDeque.peekFirst();
            oVar.getClass();
            if (!f0(oVar)) {
                return;
            }
            try {
                I(oVar, mediaCrypto);
            } catch (Exception e6) {
                AbstractC0360m.z("MediaCodecRenderer", "Failed to initialize decoder: " + oVar, e6);
                arrayDeque.removeFirst();
                p pVar = new p("Decoder init failed: " + oVar.f9288a + ", " + c0190p, e6, c0190p.f3424n, z4, oVar, e6 instanceof MediaCodec.CodecException ? ((MediaCodec.CodecException) e6).getDiagnosticInfo() : null);
                M(pVar);
                p pVar2 = this.f9341b0;
                if (pVar2 == null) {
                    this.f9341b0 = pVar;
                } else {
                    this.f9341b0 = new p(pVar2.getMessage(), pVar2.getCause(), pVar2.f9296l, pVar2.f9297m, pVar2.f9298n, pVar2.f9299o);
                }
                if (arrayDeque.isEmpty()) {
                    throw this.f9341b0;
                }
            }
        }
        this.f9340a0 = null;
    }

    public abstract void M(Exception exc);

    public abstract void N(long j5, long j6, String str);

    public abstract void O(String str);

    /* JADX WARN: Code restructure failed: missing block: B:62:0x00e3, code lost:
    
        if (r4.J(r3) != false) goto L134;
     */
    /* JADX WARN: Removed duplicated region for block: B:87:0x011f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public h0.C0459j P(Z1.e r14) {
        /*
            Method dump skipped, instruction units count: 452
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: q0.r.P(Z1.e):h0.j");
    }

    public abstract void Q(C0190p c0190p, MediaFormat mediaFormat);

    public void S(long j5) {
        this.f9324K0 = j5;
        while (true) {
            ArrayDeque arrayDeque = this.f9323K;
            if (arrayDeque.isEmpty() || j5 < ((q) arrayDeque.peek()).f9301a) {
                return;
            }
            q qVar = (q) arrayDeque.poll();
            qVar.getClass();
            e0(qVar);
            T();
        }
    }

    public abstract void T();

    public final void W() throws C0464o {
        int i = this.f9363x0;
        if (i == 1) {
            z();
            return;
        }
        if (i == 2) {
            z();
            k0();
        } else if (i != 3) {
            this.f9312E0 = true;
            a0();
        } else {
            Z();
            K();
        }
    }

    public abstract boolean X(long j5, long j6, l lVar, ByteBuffer byteBuffer, int i, int i5, int i6, long j7, boolean z4, boolean z5, C0190p c0190p);

    public final boolean Y(int i) throws C0464o {
        Z1.e eVar = this.f6150n;
        eVar.c();
        g0.e eVar2 = this.f9313F;
        eVar2.f();
        int iR = r(eVar, eVar2, i | 4);
        if (iR == -5) {
            P(eVar);
            return true;
        }
        if (iR != -4 || !eVar2.e(4)) {
            return false;
        }
        this.f9310D0 = true;
        W();
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void Z() {
        try {
            l lVar = this.f9335V;
            if (lVar != null) {
                lVar.release();
                this.f9320I0.f6163b++;
                o oVar = this.f9342c0;
                oVar.getClass();
                O(oVar.f9288a);
            }
            this.f9335V = null;
            try {
                MediaCrypto mediaCrypto = this.f9331R;
                if (mediaCrypto != null) {
                    mediaCrypto.release();
                }
            } finally {
            }
        } catch (Throwable th) {
            this.f9335V = null;
            try {
                MediaCrypto mediaCrypto2 = this.f9331R;
                if (mediaCrypto2 != null) {
                    mediaCrypto2.release();
                }
                throw th;
            } finally {
            }
        }
    }

    public void b0() {
        this.f9352m0 = -1;
        this.f9315G.f5787p = null;
        this.f9353n0 = -1;
        this.f9354o0 = null;
        this.f9351l0 = -9223372036854775807L;
        this.f9365z0 = false;
        this.f9350k0 = -9223372036854775807L;
        this.f9364y0 = false;
        this.f9347h0 = false;
        this.f9348i0 = false;
        this.f9355p0 = false;
        this.f9356q0 = false;
        this.f9306B0 = -9223372036854775807L;
        this.f9308C0 = -9223372036854775807L;
        this.f9324K0 = -9223372036854775807L;
        this.f9362w0 = 0;
        this.f9363x0 = 0;
        this.f9361v0 = this.f9360u0 ? 1 : 0;
    }

    public final void c0() {
        b0();
        this.f9318H0 = null;
        this.f9340a0 = null;
        this.f9342c0 = null;
        this.f9336W = null;
        this.f9337X = null;
        this.f9338Y = false;
        this.f9305A0 = false;
        this.f9339Z = -1.0f;
        this.f9343d0 = 0;
        this.f9344e0 = false;
        this.f9345f0 = false;
        this.f9346g0 = false;
        this.f9349j0 = false;
        this.f9360u0 = false;
        this.f9361v0 = 0;
    }

    public final void d0(E e5) {
        E e6 = this.f9328O;
        if (e6 != e5) {
            if (e5 != null) {
                e5.w(null);
            }
            if (e6 != null) {
                e6.I(null);
            }
        }
        this.f9328O = e5;
    }

    public final void e0(q qVar) {
        this.f9322J0 = qVar;
        if (qVar.f9303c != -9223372036854775807L) {
            this.f9326L0 = true;
            R();
        }
    }

    public boolean f0(o oVar) {
        return true;
    }

    public boolean g0(g0.e eVar) {
        return false;
    }

    public boolean h0(C0190p c0190p) {
        return false;
    }

    public abstract int i0(j jVar, C0190p c0190p);

    @Override // h0.o0
    public boolean isReady() {
        boolean zIsReady;
        if (this.M == null) {
            return false;
        }
        if (hasReadStreamToEnd()) {
            zIsReady = this.y;
        } else {
            f0 f0Var = this.f6156t;
            f0Var.getClass();
            zIsReady = f0Var.isReady();
        }
        if (!zIsReady) {
            if (!(this.f9353n0 >= 0)) {
                if (this.f9351l0 == -9223372036854775807L) {
                    return false;
                }
                this.f6154r.getClass();
                if (SystemClock.elapsedRealtime() >= this.f9351l0) {
                    return false;
                }
            }
        }
        return true;
    }

    @Override // h0.AbstractC0457h
    public void j() {
        this.M = null;
        e0(q.f9300e);
        this.f9323K.clear();
        A();
    }

    public final boolean j0(C0190p c0190p) {
        if (AbstractC0370w.f5326a >= 23 && this.f9335V != null && this.f9363x0 != 3 && this.f6155s != 0) {
            float f2 = this.f9334U;
            c0190p.getClass();
            C0190p[] c0190pArr = this.f6157u;
            c0190pArr.getClass();
            float fE = E(f2, c0190pArr);
            float f5 = this.f9339Z;
            if (f5 == fE) {
                return true;
            }
            if (fE == -1.0f) {
                if (this.f9364y0) {
                    this.f9362w0 = 1;
                    this.f9363x0 = 3;
                    return false;
                }
                Z();
                K();
                return false;
            }
            if (f5 == -1.0f && fE <= this.f9311E) {
                return true;
            }
            Bundle bundle = new Bundle();
            bundle.putFloat("operating-rate", fE);
            l lVar = this.f9335V;
            lVar.getClass();
            lVar.a(bundle);
            this.f9339Z = fE;
        }
        return true;
    }

    public final void k0() throws C0464o {
        E e5 = this.f9329P;
        e5.getClass();
        InterfaceC0435a interfaceC0435aY = e5.y();
        if (interfaceC0435aY instanceof m0.j) {
            try {
                MediaCrypto mediaCrypto = this.f9331R;
                mediaCrypto.getClass();
                ((m0.j) interfaceC0435aY).getClass();
                mediaCrypto.setMediaDrmSession(null);
            } catch (MediaCryptoException e6) {
                throw i(e6, this.M, false, 6006);
            }
        }
        d0(this.f9329P);
        this.f9362w0 = 0;
        this.f9363x0 = 0;
    }

    @Override // h0.AbstractC0457h
    public void l(long j5, boolean z4) {
        this.f9310D0 = false;
        this.f9312E0 = false;
        this.f9316G0 = false;
        if (this.f9357r0) {
            this.f9319I.f();
            this.f9317H.f();
            this.f9358s0 = false;
            j0.y yVar = this.f9325L;
            yVar.getClass();
            yVar.f7428a = InterfaceC0300d.f4834a;
            yVar.f7430c = 0;
            yVar.f7429b = 2;
        } else if (A()) {
            K();
        }
        if (this.f9322J0.f9304d.i() > 0) {
            this.f9314F0 = true;
        }
        this.f9322J0.f9304d.c();
        this.f9323K.clear();
    }

    public final void l0(long j5) {
        C0190p c0190p = (C0190p) this.f9322J0.f9304d.g(j5);
        if (c0190p == null && this.f9326L0 && this.f9337X != null) {
            c0190p = (C0190p) this.f9322J0.f9304d.f();
        }
        if (c0190p != null) {
            this.f9327N = c0190p;
        } else if (!this.f9338Y || this.f9327N == null) {
            return;
        }
        C0190p c0190p2 = this.f9327N;
        c0190p2.getClass();
        Q(c0190p2, this.f9337X);
        this.f9338Y = false;
        this.f9326L0 = false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0036, code lost:
    
        if (r7 >= r5) goto L13;
     */
    @Override // h0.AbstractC0457h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void q(a0.C0190p[] r13, long r14, long r16, x0.H r18) {
        /*
            r12 = this;
            r0 = r12
            q0.q r1 = r0.f9322J0
            long r1 = r1.f9303c
            r3 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 != 0) goto L20
            q0.q r1 = new q0.q
            r6 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r5 = r1
            r8 = r14
            r10 = r16
            r5.<init>(r6, r8, r10)
            r12.e0(r1)
            goto L63
        L20:
            java.util.ArrayDeque r1 = r0.f9323K
            boolean r2 = r1.isEmpty()
            if (r2 == 0) goto L55
            long r5 = r0.f9306B0
            int r2 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r2 == 0) goto L38
            long r7 = r0.f9324K0
            int r2 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r2 == 0) goto L55
            int r2 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r2 < 0) goto L55
        L38:
            q0.q r1 = new q0.q
            r6 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r5 = r1
            r8 = r14
            r10 = r16
            r5.<init>(r6, r8, r10)
            r12.e0(r1)
            q0.q r1 = r0.f9322J0
            long r1 = r1.f9303c
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 == 0) goto L63
            r12.T()
            goto L63
        L55:
            q0.q r9 = new q0.q
            long r3 = r0.f9306B0
            r2 = r9
            r5 = r14
            r7 = r16
            r2.<init>(r3, r5, r7)
            r1.add(r9)
        L63:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: q0.r.q(a0.p[], long, long, x0.H):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x0078 A[LOOP:1: B:31:0x0053->B:41:0x0078, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0099 A[LOOP:2: B:42:0x0079->B:52:0x0099, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0079 A[EDGE_INSN: B:87:0x0079->B:90:? BREAK  A[LOOP:1: B:31:0x0053->B:41:0x0078], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x009a A[EDGE_INSN: B:88:0x009a->B:53:0x009a BREAK  A[LOOP:2: B:42:0x0079->B:52:0x0099], SYNTHETIC] */
    @Override // h0.o0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void render(long r12, long r14) {
        /*
            Method dump skipped, instruction units count: 275
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: q0.r.render(long, long):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x00b0, code lost:
    
        r7 = r1;
        r1 = r2;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0302  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x030a  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x031a  */
    /* JADX WARN: Type inference failed for: r14v2, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r1v25 */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r26v0, types: [h0.h, q0.r] */
    /* JADX WARN: Type inference failed for: r6v20, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r6v31, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v22 */
    /* JADX WARN: Type inference failed for: r7v23 */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r8v14 */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v5, types: [int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean s(long r27, long r29) {
        /*
            Method dump skipped, instruction units count: 842
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: q0.r.s(long, long):boolean");
    }

    @Override // h0.o0
    public void setPlaybackSpeed(float f2, float f5) {
        this.f9333T = f2;
        this.f9334U = f5;
        j0(this.f9336W);
    }

    @Override // h0.q0
    public final int supportsFormat(C0190p c0190p) throws C0464o {
        try {
            return i0(this.f9309D, c0190p);
        } catch (v e5) {
            throw i(e5, c0190p, false, 4002);
        }
    }

    @Override // h0.AbstractC0457h, h0.q0
    public final int supportsMixedMimeTypeAdaptation() {
        return 8;
    }

    public abstract C0459j t(o oVar, C0190p c0190p, C0190p c0190p2);

    public n u(IllegalStateException illegalStateException, o oVar) {
        return new n(illegalStateException, oVar);
    }

    public final void v() {
        this.f9359t0 = false;
        this.f9319I.f();
        this.f9317H.f();
        this.f9358s0 = false;
        this.f9357r0 = false;
        j0.y yVar = this.f9325L;
        yVar.getClass();
        yVar.f7428a = InterfaceC0300d.f4834a;
        yVar.f7430c = 0;
        yVar.f7429b = 2;
    }

    public final boolean w() throws C0464o {
        if (this.f9364y0) {
            this.f9362w0 = 1;
            if (this.f9345f0) {
                this.f9363x0 = 3;
                return false;
            }
            this.f9363x0 = 2;
        } else {
            k0();
        }
        return true;
    }

    public final boolean x(long j5, long j6) throws C0464o {
        boolean z4;
        boolean z5;
        MediaCodec.BufferInfo bufferInfo;
        boolean zX;
        ByteBuffer byteBuffer;
        int i;
        int i5;
        long j7;
        boolean z6;
        boolean z7;
        C0190p c0190p;
        int iD;
        l lVar = this.f9335V;
        lVar.getClass();
        boolean z8 = this.f9353n0 >= 0;
        MediaCodec.BufferInfo bufferInfo2 = this.f9321J;
        if (!z8) {
            if (this.f9346g0 && this.f9365z0) {
                try {
                    iD = lVar.d(bufferInfo2);
                } catch (IllegalStateException unused) {
                    W();
                    if (this.f9312E0) {
                        Z();
                    }
                    return false;
                }
            } else {
                iD = lVar.d(bufferInfo2);
            }
            if (iD < 0) {
                if (iD == -2) {
                    this.f9305A0 = true;
                    l lVar2 = this.f9335V;
                    lVar2.getClass();
                    MediaFormat mediaFormatW = lVar2.w();
                    if (this.f9343d0 != 0 && mediaFormatW.getInteger("width") == 32 && mediaFormatW.getInteger("height") == 32) {
                        this.f9348i0 = true;
                    } else {
                        this.f9337X = mediaFormatW;
                        this.f9338Y = true;
                    }
                    return true;
                }
                if (this.f9349j0 && (this.f9310D0 || this.f9362w0 == 2)) {
                    W();
                }
                long j8 = this.f9350k0;
                if (j8 != -9223372036854775807L) {
                    long j9 = j8 + 100;
                    this.f6154r.getClass();
                    if (j9 < System.currentTimeMillis()) {
                        W();
                    }
                }
                return false;
            }
            if (this.f9348i0) {
                this.f9348i0 = false;
                lVar.k(iD);
                return true;
            }
            if (bufferInfo2.size == 0 && (bufferInfo2.flags & 4) != 0) {
                W();
                return false;
            }
            this.f9353n0 = iD;
            ByteBuffer byteBufferL = lVar.l(iD);
            this.f9354o0 = byteBufferL;
            if (byteBufferL != null) {
                byteBufferL.position(bufferInfo2.offset);
                this.f9354o0.limit(bufferInfo2.offset + bufferInfo2.size);
            }
            long j10 = bufferInfo2.presentationTimeUs;
            this.f9355p0 = j10 < this.f6159w;
            long j11 = this.f9308C0;
            this.f9356q0 = j11 != -9223372036854775807L && j11 <= j10;
            l0(j10);
        }
        if (this.f9346g0 && this.f9365z0) {
            try {
                byteBuffer = this.f9354o0;
                i = this.f9353n0;
                i5 = bufferInfo2.flags;
                j7 = bufferInfo2.presentationTimeUs;
                z6 = this.f9355p0;
                z7 = this.f9356q0;
                c0190p = this.f9327N;
                c0190p.getClass();
                z4 = true;
                z5 = false;
            } catch (IllegalStateException unused2) {
                z5 = false;
            }
            try {
                zX = X(j5, j6, lVar, byteBuffer, i, i5, 1, j7, z6, z7, c0190p);
                bufferInfo = bufferInfo2;
            } catch (IllegalStateException unused3) {
                W();
                if (this.f9312E0) {
                    Z();
                }
                return z5;
            }
        } else {
            z4 = true;
            z5 = false;
            ByteBuffer byteBuffer2 = this.f9354o0;
            int i6 = this.f9353n0;
            int i7 = bufferInfo2.flags;
            long j12 = bufferInfo2.presentationTimeUs;
            boolean z9 = this.f9355p0;
            boolean z10 = this.f9356q0;
            C0190p c0190p2 = this.f9327N;
            c0190p2.getClass();
            bufferInfo = bufferInfo2;
            zX = X(j5, j6, lVar, byteBuffer2, i6, i7, 1, j12, z9, z10, c0190p2);
        }
        if (zX) {
            S(bufferInfo.presentationTimeUs);
            boolean z11 = (bufferInfo.flags & 4) != 0 ? z4 : z5;
            if (!z11 && this.f9365z0 && this.f9356q0) {
                this.f6154r.getClass();
                this.f9350k0 = System.currentTimeMillis();
            }
            this.f9353n0 = -1;
            this.f9354o0 = null;
            if (!z11) {
                return z4;
            }
            W();
        }
        return z5;
    }

    public final boolean y() throws C0464o {
        l lVar = this.f9335V;
        if (lVar == null || this.f9362w0 == 2 || this.f9310D0) {
            return false;
        }
        int i = this.f9352m0;
        g0.e eVar = this.f9315G;
        if (i < 0) {
            int iP = lVar.p();
            this.f9352m0 = iP;
            if (iP < 0) {
                return false;
            }
            eVar.f5787p = lVar.i(iP);
            eVar.f();
        }
        if (this.f9362w0 == 1) {
            if (!this.f9349j0) {
                this.f9365z0 = true;
                lVar.c(this.f9352m0, 0, 0L, 4);
                this.f9352m0 = -1;
                eVar.f5787p = null;
            }
            this.f9362w0 = 2;
            return false;
        }
        if (this.f9347h0) {
            this.f9347h0 = false;
            ByteBuffer byteBuffer = eVar.f5787p;
            byteBuffer.getClass();
            byteBuffer.put(M0);
            lVar.c(this.f9352m0, 38, 0L, 0);
            this.f9352m0 = -1;
            eVar.f5787p = null;
            this.f9364y0 = true;
            return true;
        }
        if (this.f9361v0 == 1) {
            int i5 = 0;
            while (true) {
                C0190p c0190p = this.f9336W;
                c0190p.getClass();
                if (i5 >= c0190p.f3427q.size()) {
                    break;
                }
                byte[] bArr = (byte[]) this.f9336W.f3427q.get(i5);
                ByteBuffer byteBuffer2 = eVar.f5787p;
                byteBuffer2.getClass();
                byteBuffer2.put(bArr);
                i5++;
            }
            this.f9361v0 = 2;
        }
        ByteBuffer byteBuffer3 = eVar.f5787p;
        byteBuffer3.getClass();
        int iPosition = byteBuffer3.position();
        Z1.e eVar2 = this.f6150n;
        eVar2.c();
        try {
            int iR = r(eVar2, eVar, 0);
            if (iR == -3) {
                if (hasReadStreamToEnd()) {
                    this.f9308C0 = this.f9306B0;
                }
                return false;
            }
            if (iR == -5) {
                if (this.f9361v0 == 2) {
                    eVar.f();
                    this.f9361v0 = 1;
                }
                P(eVar2);
                return true;
            }
            if (eVar.e(4)) {
                this.f9308C0 = this.f9306B0;
                if (this.f9361v0 == 2) {
                    eVar.f();
                    this.f9361v0 = 1;
                }
                this.f9310D0 = true;
                if (!this.f9364y0) {
                    W();
                    return false;
                }
                if (!this.f9349j0) {
                    this.f9365z0 = true;
                    lVar.c(this.f9352m0, 0, 0L, 4);
                    this.f9352m0 = -1;
                    eVar.f5787p = null;
                }
                return false;
            }
            if (!this.f9364y0 && !eVar.e(1)) {
                eVar.f();
                if (this.f9361v0 == 2) {
                    this.f9361v0 = 1;
                }
                return true;
            }
            if (g0(eVar)) {
                eVar.f();
                this.f9320I0.f6165d++;
                return true;
            }
            boolean zE = eVar.e(1073741824);
            if (zE) {
                C0118a c0118a = eVar.f5786o;
                if (iPosition == 0) {
                    c0118a.getClass();
                } else {
                    if (((int[]) c0118a.f1801g) == null) {
                        int[] iArr = new int[1];
                        c0118a.f1801g = iArr;
                        ((MediaCodec.CryptoInfo) c0118a.i).numBytesOfClearData = iArr;
                    }
                    int[] iArr2 = (int[]) c0118a.f1801g;
                    iArr2[0] = iArr2[0] + iPosition;
                }
            }
            long j5 = eVar.f5789r;
            if (this.f9314F0) {
                ArrayDeque arrayDeque = this.f9323K;
                if (arrayDeque.isEmpty()) {
                    Z0.e eVar3 = this.f9322J0.f9304d;
                    C0190p c0190p2 = this.M;
                    c0190p2.getClass();
                    eVar3.a(j5, c0190p2);
                } else {
                    Z0.e eVar4 = ((q) arrayDeque.peekLast()).f9304d;
                    C0190p c0190p3 = this.M;
                    c0190p3.getClass();
                    eVar4.a(j5, c0190p3);
                }
                this.f9314F0 = false;
            }
            this.f9306B0 = Math.max(this.f9306B0, j5);
            if (hasReadStreamToEnd() || eVar.e(536870912)) {
                this.f9308C0 = this.f9306B0;
            }
            eVar.k();
            if (eVar.e(268435456)) {
                H(eVar);
            }
            U(eVar);
            int iC = C(eVar);
            if (zE) {
                lVar.b(this.f9352m0, eVar.f5786o, j5, iC);
            } else {
                int i6 = this.f9352m0;
                ByteBuffer byteBuffer4 = eVar.f5787p;
                byteBuffer4.getClass();
                lVar.c(i6, byteBuffer4.limit(), j5, iC);
            }
            this.f9352m0 = -1;
            eVar.f5787p = null;
            this.f9364y0 = true;
            this.f9361v0 = 0;
            this.f9320I0.f6164c++;
            return true;
        } catch (g0.d e5) {
            M(e5);
            Y(0);
            z();
            return true;
        }
    }

    public final void z() {
        try {
            l lVar = this.f9335V;
            AbstractC0360m.i(lVar);
            lVar.flush();
        } finally {
            b0();
        }
    }

    public void R() {
    }

    public void a0() {
    }

    public void U(g0.e eVar) {
    }

    public void V(C0190p c0190p) {
    }
}

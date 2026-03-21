package z0;

import B0.l;
import I2.g;
import a0.AbstractC0156G;
import a0.C0190p;
import a0.C0200z;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Parcel;
import c1.C0318a;
import c1.f;
import c1.i;
import d0.AbstractC0360m;
import h0.AbstractC0457h;
import h0.C0448G;
import h0.SurfaceHolderCallbackC0445D;
import h0.q0;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Objects;
import m2.C0639F;
import m2.I;
import m2.b0;
import r1.C0757H;
import x0.H;
import y3.C1038i;

/* JADX INFO: renamed from: z0.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1063e extends AbstractC0457h implements Handler.Callback {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final C0200z f11122C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public final g0.e f11123D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public InterfaceC1059a f11124E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public final C1038i f11125F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public boolean f11126G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public int f11127H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public c1.e f11128I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public i f11129J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public c1.c f11130K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public c1.c f11131L;
    public int M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public final Handler f11132N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public final InterfaceC1062d f11133O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public final Z1.e f11134P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public boolean f11135Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    public boolean f11136R;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public C0190p f11137S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    public long f11138T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public long f11139U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public IOException f11140V;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1063e(InterfaceC1062d interfaceC1062d, Looper looper) {
        super(3);
        C1038i c1038i = InterfaceC1061c.f11121a;
        interfaceC1062d.getClass();
        this.f11133O = interfaceC1062d;
        this.f11132N = looper == null ? null : new Handler(looper, this);
        this.f11125F = c1038i;
        this.f11122C = new C0200z(5);
        this.f11123D = new g0.e(1);
        this.f11134P = new Z1.e((char) 0, 10);
        this.f11139U = -9223372036854775807L;
        this.f11138T = -9223372036854775807L;
    }

    @Override // h0.o0, h0.q0
    public final String getName() {
        return "TextRenderer";
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (message.what != 1) {
            throw new IllegalStateException();
        }
        w((c0.c) message.obj);
        return true;
    }

    @Override // h0.AbstractC0457h, h0.o0
    public final boolean isEnded() {
        return this.f11136R;
    }

    @Override // h0.o0
    public final boolean isReady() {
        if (this.f11137S == null) {
            return true;
        }
        if (this.f11140V == null) {
            try {
                maybeThrowStreamError();
            } catch (IOException e5) {
                this.f11140V = e5;
            }
        }
        if (this.f11140V != null) {
            C0190p c0190p = this.f11137S;
            c0190p.getClass();
            if (Objects.equals(c0190p.f3424n, "application/x-media3-cues")) {
                InterfaceC1059a interfaceC1059a = this.f11124E;
                interfaceC1059a.getClass();
                return interfaceC1059a.c(this.f11138T) != Long.MIN_VALUE;
            }
            if (!this.f11136R) {
                if (this.f11135Q) {
                    c1.c cVar = this.f11130K;
                    long j5 = this.f11138T;
                    if (cVar == null || cVar.g(cVar.h() - 1) <= j5) {
                        c1.c cVar2 = this.f11131L;
                        long j6 = this.f11138T;
                        if ((cVar2 == null || cVar2.g(cVar2.h() - 1) <= j6) && this.f11129J != null) {
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    @Override // h0.AbstractC0457h
    public final void j() {
        this.f11137S = null;
        this.f11139U = -9223372036854775807L;
        b0 b0Var = b0.f8583p;
        u(this.f11138T);
        c0.c cVar = new c0.c(b0Var);
        Handler handler = this.f11132N;
        if (handler != null) {
            handler.obtainMessage(1, cVar).sendToTarget();
        } else {
            w(cVar);
        }
        this.f11138T = -9223372036854775807L;
        if (this.f11128I != null) {
            x();
            c1.e eVar = this.f11128I;
            eVar.getClass();
            eVar.release();
            this.f11128I = null;
            this.f11127H = 0;
        }
    }

    @Override // h0.AbstractC0457h
    public final void l(long j5, boolean z4) {
        this.f11138T = j5;
        InterfaceC1059a interfaceC1059a = this.f11124E;
        if (interfaceC1059a != null) {
            interfaceC1059a.clear();
        }
        b0 b0Var = b0.f8583p;
        u(this.f11138T);
        c0.c cVar = new c0.c(b0Var);
        Handler handler = this.f11132N;
        if (handler != null) {
            handler.obtainMessage(1, cVar).sendToTarget();
        } else {
            w(cVar);
        }
        this.f11135Q = false;
        this.f11136R = false;
        this.f11139U = -9223372036854775807L;
        C0190p c0190p = this.f11137S;
        if (c0190p == null || Objects.equals(c0190p.f3424n, "application/x-media3-cues")) {
            return;
        }
        if (this.f11127H == 0) {
            x();
            c1.e eVar = this.f11128I;
            eVar.getClass();
            eVar.flush();
            eVar.e(this.f6159w);
            return;
        }
        x();
        c1.e eVar2 = this.f11128I;
        eVar2.getClass();
        eVar2.release();
        this.f11128I = null;
        this.f11127H = 0;
        v();
    }

    @Override // h0.AbstractC0457h
    public final void q(C0190p[] c0190pArr, long j5, long j6, H h2) {
        InterfaceC1059a c1060b;
        C0190p c0190p = c0190pArr[0];
        this.f11137S = c0190p;
        if (!Objects.equals(c0190p.f3424n, "application/x-media3-cues")) {
            s();
            if (this.f11128I != null) {
                this.f11127H = 1;
                return;
            } else {
                v();
                return;
            }
        }
        if (this.f11137S.f3408I == 1) {
            c1060b = new C1060b();
        } else {
            C0757H c0757h = new C0757H();
            c0757h.f9437a = new ArrayList();
            c1060b = c0757h;
        }
        this.f11124E = c1060b;
    }

    @Override // h0.o0
    public final void render(long j5, long j6) {
        boolean z4;
        Z1.e eVar;
        boolean z5;
        long jG;
        if (this.y) {
            long j7 = this.f11139U;
            if (j7 != -9223372036854775807L && j5 >= j7) {
                x();
                this.f11136R = true;
            }
        }
        if (this.f11136R) {
            return;
        }
        C0190p c0190p = this.f11137S;
        c0190p.getClass();
        boolean zEquals = Objects.equals(c0190p.f3424n, "application/x-media3-cues");
        Handler handler = this.f11132N;
        boolean zD = false;
        zD = false;
        zD = false;
        Z1.e eVar2 = this.f11134P;
        if (zEquals) {
            this.f11124E.getClass();
            if (!this.f11135Q) {
                g0.e eVar3 = this.f11123D;
                if (r(eVar2, eVar3, 0) == -4) {
                    if (eVar3.e(4)) {
                        this.f11135Q = true;
                    } else {
                        eVar3.k();
                        ByteBuffer byteBuffer = eVar3.f5787p;
                        byteBuffer.getClass();
                        long j8 = eVar3.f5789r;
                        byte[] bArrArray = byteBuffer.array();
                        int iArrayOffset = byteBuffer.arrayOffset();
                        int iLimit = byteBuffer.limit();
                        this.f11122C.getClass();
                        Parcel parcelObtain = Parcel.obtain();
                        parcelObtain.unmarshall(bArrArray, iArrayOffset, iLimit);
                        parcelObtain.setDataPosition(0);
                        Bundle bundle = parcelObtain.readBundle(Bundle.class.getClassLoader());
                        parcelObtain.recycle();
                        ArrayList parcelableArrayList = bundle.getParcelableArrayList("c");
                        parcelableArrayList.getClass();
                        l lVar = new l(26);
                        C0639F c0639fN = I.n();
                        for (int i = 0; i < parcelableArrayList.size(); i++) {
                            Bundle bundle2 = (Bundle) parcelableArrayList.get(i);
                            bundle2.getClass();
                            c0639fN.a(lVar.apply(bundle2));
                        }
                        C0318a c0318a = new C0318a(c0639fN.g(), j8, bundle.getLong("d"));
                        eVar3.f();
                        zD = this.f11124E.d(c0318a, j5);
                    }
                }
            }
            long jC = this.f11124E.c(this.f11138T);
            if (jC == Long.MIN_VALUE && this.f11135Q && !zD) {
                this.f11136R = true;
            }
            if (jC != Long.MIN_VALUE && jC <= j5) {
                zD = true;
            }
            if (zD) {
                I iA = this.f11124E.a(j5);
                long jB = this.f11124E.b(j5);
                u(jB);
                c0.c cVar = new c0.c(iA);
                if (handler != null) {
                    handler.obtainMessage(1, cVar).sendToTarget();
                } else {
                    w(cVar);
                }
                this.f11124E.e(jB);
            }
            this.f11138T = j5;
            return;
        }
        s();
        this.f11138T = j5;
        if (this.f11131L == null) {
            c1.e eVar4 = this.f11128I;
            eVar4.getClass();
            eVar4.a(j5);
            try {
                c1.e eVar5 = this.f11128I;
                eVar5.getClass();
                this.f11131L = (c1.c) eVar5.b();
            } catch (f e5) {
                AbstractC0360m.m("TextRenderer", "Subtitle decoding failed. streamFormat=" + this.f11137S, e5);
                b0 b0Var = b0.f8583p;
                u(this.f11138T);
                c0.c cVar2 = new c0.c(b0Var);
                if (handler != null) {
                    handler.obtainMessage(1, cVar2).sendToTarget();
                } else {
                    w(cVar2);
                }
                x();
                c1.e eVar6 = this.f11128I;
                eVar6.getClass();
                eVar6.release();
                this.f11128I = null;
                this.f11127H = 0;
                v();
                return;
            }
        }
        if (this.f6155s != 2) {
            return;
        }
        if (this.f11130K != null) {
            long jT = t();
            z4 = false;
            while (jT <= j5) {
                this.M++;
                jT = t();
                z4 = true;
            }
        } else {
            z4 = false;
        }
        c1.c cVar3 = this.f11131L;
        if (cVar3 == null) {
            eVar = eVar2;
            z5 = z4;
        } else if (cVar3.e(4)) {
            if (!z4 && t() == Long.MAX_VALUE) {
                if (this.f11127H == 2) {
                    x();
                    c1.e eVar7 = this.f11128I;
                    eVar7.getClass();
                    eVar7.release();
                    this.f11128I = null;
                    this.f11127H = 0;
                    v();
                } else {
                    x();
                    this.f11136R = true;
                }
            }
            eVar = eVar2;
            z5 = z4;
        } else {
            eVar = eVar2;
            z5 = z4;
            if (cVar3.f5792n <= j5) {
                c1.c cVar4 = this.f11130K;
                if (cVar4 != null) {
                    cVar4.i();
                }
                this.M = cVar3.a(j5);
                this.f11130K = cVar3;
                this.f11131L = null;
                z5 = true;
            }
        }
        if (z5) {
            this.f11130K.getClass();
            int iA2 = this.f11130K.a(j5);
            if (iA2 == 0 || this.f11130K.h() == 0) {
                jG = this.f11130K.f5792n;
            } else if (iA2 == -1) {
                c1.c cVar5 = this.f11130K;
                jG = cVar5.g(cVar5.h() - 1);
            } else {
                jG = this.f11130K.g(iA2 - 1);
            }
            u(jG);
            c0.c cVar6 = new c0.c(this.f11130K.d(j5));
            if (handler != null) {
                handler.obtainMessage(1, cVar6).sendToTarget();
            } else {
                w(cVar6);
            }
        }
        if (this.f11127H == 2) {
            return;
        }
        while (!this.f11135Q) {
            try {
                i iVar = this.f11129J;
                if (iVar == null) {
                    c1.e eVar8 = this.f11128I;
                    eVar8.getClass();
                    iVar = (i) eVar8.c();
                    if (iVar == null) {
                        return;
                    } else {
                        this.f11129J = iVar;
                    }
                }
                if (this.f11127H == 1) {
                    iVar.f5494m = 4;
                    c1.e eVar9 = this.f11128I;
                    eVar9.getClass();
                    eVar9.d(iVar);
                    this.f11129J = null;
                    this.f11127H = 2;
                    return;
                }
                Z1.e eVar10 = eVar;
                int iR = r(eVar10, iVar, 0);
                if (iR == -4) {
                    if (iVar.e(4)) {
                        this.f11135Q = true;
                        this.f11126G = false;
                    } else {
                        C0190p c0190p2 = (C0190p) eVar10.f3002n;
                        if (c0190p2 == null) {
                            return;
                        }
                        iVar.f5050u = c0190p2.f3429s;
                        iVar.k();
                        this.f11126G &= !iVar.e(1);
                    }
                    if (!this.f11126G) {
                        c1.e eVar11 = this.f11128I;
                        eVar11.getClass();
                        eVar11.d(iVar);
                        this.f11129J = null;
                    }
                } else if (iR == -3) {
                    return;
                }
                eVar = eVar10;
            } catch (f e6) {
                AbstractC0360m.m("TextRenderer", "Subtitle decoding failed. streamFormat=" + this.f11137S, e6);
                b0 b0Var2 = b0.f8583p;
                u(this.f11138T);
                c0.c cVar7 = new c0.c(b0Var2);
                if (handler != null) {
                    handler.obtainMessage(1, cVar7).sendToTarget();
                } else {
                    w(cVar7);
                }
                x();
                c1.e eVar12 = this.f11128I;
                eVar12.getClass();
                eVar12.release();
                this.f11128I = null;
                this.f11127H = 0;
                v();
                return;
            }
        }
    }

    public final void s() {
        AbstractC0360m.g("Legacy decoding is disabled, can't handle " + this.f11137S.f3424n + " samples (expected application/x-media3-cues).", Objects.equals(this.f11137S.f3424n, "application/cea-608") || Objects.equals(this.f11137S.f3424n, "application/x-mp4-cea-608") || Objects.equals(this.f11137S.f3424n, "application/cea-708"));
    }

    @Override // h0.q0
    public final int supportsFormat(C0190p c0190p) {
        if (!Objects.equals(c0190p.f3424n, "application/x-media3-cues")) {
            C1038i c1038i = this.f11125F;
            c1038i.getClass();
            if (!((C0200z) c1038i.f11067b).supportsFormat(c0190p)) {
                String str = c0190p.f3424n;
                if (!Objects.equals(str, "application/cea-608") && !Objects.equals(str, "application/x-mp4-cea-608") && !Objects.equals(str, "application/cea-708")) {
                    return AbstractC0156G.k(str) ? q0.e(1, 0, 0, 0) : q0.e(0, 0, 0, 0);
                }
            }
        }
        return q0.e(c0190p.f3411L == 0 ? 4 : 2, 0, 0, 0);
    }

    public final long t() {
        if (this.M == -1) {
            return Long.MAX_VALUE;
        }
        this.f11130K.getClass();
        if (this.M >= this.f11130K.h()) {
            return Long.MAX_VALUE;
        }
        return this.f11130K.g(this.M);
    }

    public final long u(long j5) {
        AbstractC0360m.h(j5 != -9223372036854775807L);
        return j5 - this.f6158v;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x004d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void v() {
        /*
            r7 = this;
            r0 = 1
            r7.f11126G = r0
            a0.p r1 = r7.f11137S
            r1.getClass()
            y3.i r2 = r7.f11125F
            r2.getClass()
            java.lang.String r3 = r1.f3424n
            if (r3 == 0) goto L4d
            int r4 = r1.f3407H
            r5 = -1
            int r6 = r3.hashCode()
            switch(r6) {
                case 930165504: goto L31;
                case 1566015601: goto L28;
                case 1566016562: goto L1d;
                default: goto L1b;
            }
        L1b:
            r0 = r5
            goto L3b
        L1d:
            java.lang.String r0 = "application/cea-708"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L26
            goto L1b
        L26:
            r0 = 2
            goto L3b
        L28:
            java.lang.String r6 = "application/cea-608"
            boolean r6 = r3.equals(r6)
            if (r6 != 0) goto L3b
            goto L1b
        L31:
            java.lang.String r0 = "application/x-mp4-cea-608"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L3a
            goto L1b
        L3a:
            r0 = 0
        L3b:
            switch(r0) {
                case 0: goto L47;
                case 1: goto L47;
                case 2: goto L3f;
                default: goto L3e;
            }
        L3e:
            goto L4d
        L3f:
            d1.f r0 = new d1.f
            java.util.List r1 = r1.f3427q
            r0.<init>(r4, r1)
            goto L6e
        L47:
            d1.c r0 = new d1.c
            r0.<init>(r3, r4)
            goto L6e
        L4d:
            java.lang.Object r0 = r2.f11067b
            a0.z r0 = (a0.C0200z) r0
            boolean r2 = r0.supportsFormat(r1)
            if (r2 == 0) goto L76
            c1.l r0 = r0.a(r1)
            p0.b r1 = new p0.b
            java.lang.Class r2 = r0.getClass()
            java.lang.String r2 = r2.getSimpleName()
            java.lang.String r3 = "Decoder"
            r2.concat(r3)
            r1.<init>(r0)
            r0 = r1
        L6e:
            r7.f11128I = r0
            long r1 = r7.f6159w
            r0.e(r1)
            return
        L76:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Attempted to create decoder for unsupported MIME type: "
            java.lang.String r1 = b3.AbstractC0307a.j(r1, r3)
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: z0.C1063e.v():void");
    }

    public final void w(c0.c cVar) {
        I i = cVar.f5010a;
        InterfaceC1062d interfaceC1062d = this.f11133O;
        ((SurfaceHolderCallbackC0445D) interfaceC1062d).f5909l.f5954l.e(27, new g(i, 11));
        C0448G c0448g = ((SurfaceHolderCallbackC0445D) interfaceC1062d).f5909l;
        c0448g.getClass();
        c0448g.f5954l.e(27, new g(cVar, 8));
    }

    public final void x() {
        this.f11129J = null;
        this.M = -1;
        c1.c cVar = this.f11130K;
        if (cVar != null) {
            cVar.i();
            this.f11130K = null;
        }
        c1.c cVar2 = this.f11131L;
        if (cVar2 != null) {
            cVar2.i();
            this.f11131L = null;
        }
    }
}

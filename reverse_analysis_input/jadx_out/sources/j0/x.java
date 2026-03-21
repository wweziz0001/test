package j0;

import a0.C0159J;
import a0.C0177c;
import a0.C0178d;
import a0.C0190p;
import android.content.Context;
import android.media.AudioDeviceInfo;
import android.media.AudioManager;
import android.media.AudioTrack;
import android.media.LoudnessCodecController;
import android.media.MediaCodec;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import androidx.lifecycle.E;
import b0.C0302f;
import b0.C0303g;
import d0.AbstractC0360m;
import d0.AbstractC0370w;
import d0.C0365r;
import h0.C0449H;
import h0.C0458i;
import h0.C0459j;
import h0.C0464o;
import h0.U;
import h0.r0;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import q2.EnumC0743a;

/* JADX INFO: loaded from: classes.dex */
public final class x extends q0.r implements U {

    /* JADX INFO: renamed from: N0, reason: collision with root package name */
    public final Context f7412N0;

    /* JADX INFO: renamed from: O0, reason: collision with root package name */
    public final Z1.c f7413O0;

    /* JADX INFO: renamed from: P0, reason: collision with root package name */
    public final v f7414P0;

    /* JADX INFO: renamed from: Q0, reason: collision with root package name */
    public final Z1.s f7415Q0;

    /* JADX INFO: renamed from: R0, reason: collision with root package name */
    public int f7416R0;

    /* JADX INFO: renamed from: S0, reason: collision with root package name */
    public boolean f7417S0;

    /* JADX INFO: renamed from: T0, reason: collision with root package name */
    public boolean f7418T0;

    /* JADX INFO: renamed from: U0, reason: collision with root package name */
    public C0190p f7419U0;

    /* JADX INFO: renamed from: V0, reason: collision with root package name */
    public C0190p f7420V0;

    /* JADX INFO: renamed from: W0, reason: collision with root package name */
    public long f7421W0;

    /* JADX INFO: renamed from: X0, reason: collision with root package name */
    public boolean f7422X0;

    /* JADX INFO: renamed from: Y0, reason: collision with root package name */
    public boolean f7423Y0;

    /* JADX INFO: renamed from: Z0, reason: collision with root package name */
    public boolean f7424Z0;

    /* JADX INFO: renamed from: a1, reason: collision with root package name */
    public int f7425a1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(Context context, q0.k kVar, Handler handler, h hVar, v vVar) {
        super(1, kVar, 44100.0f);
        Z1.s sVar = AbstractC0370w.f5326a >= 35 ? new Z1.s(13) : null;
        this.f7412N0 = context.getApplicationContext();
        this.f7414P0 = vVar;
        this.f7415Q0 = sVar;
        this.f7425a1 = -1000;
        Z1.c cVar = new Z1.c();
        if (hVar != null) {
            handler.getClass();
        } else {
            handler = null;
        }
        cVar.f2996l = handler;
        cVar.f2997m = hVar;
        this.f7413O0 = cVar;
        vVar.f7402r = new E(this, 11);
    }

    @Override // q0.r
    public final float E(float f2, C0190p[] c0190pArr) {
        int iMax = -1;
        for (C0190p c0190p : c0190pArr) {
            int i = c0190p.f3403D;
            if (i != -1) {
                iMax = Math.max(iMax, i);
            }
        }
        if (iMax == -1) {
            return -1.0f;
        }
        return f2 * iMax;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x002b  */
    @Override // q0.r
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.ArrayList F(q0.j r4, a0.C0190p r5, boolean r6) {
        /*
            r3 = this;
            java.lang.String r0 = r5.f3424n
            if (r0 != 0) goto L7
            m2.b0 r4 = m2.b0.f8583p
            goto L2f
        L7:
            j0.v r0 = r3.f7414P0
            int r0 = r0.i(r5)
            r1 = 0
            if (r0 == 0) goto L2b
            java.lang.String r0 = "audio/raw"
            java.util.List r0 = q0.y.e(r0, r1, r1)
            boolean r2 = r0.isEmpty()
            if (r2 == 0) goto L1e
            r0 = 0
            goto L24
        L1e:
            java.lang.Object r0 = r0.get(r1)
            q0.o r0 = (q0.o) r0
        L24:
            if (r0 == 0) goto L2b
            m2.b0 r4 = m2.I.u(r0)
            goto L2f
        L2b:
            m2.b0 r4 = q0.y.g(r4, r5, r6, r1)
        L2f:
            java.util.HashMap r6 = q0.y.f9370a
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>(r4)
            I2.g r4 = new I2.g
            r0 = 22
            r4.<init>(r5, r0)
            q0.t r5 = new q0.t
            r5.<init>(r4)
            java.util.Collections.sort(r6, r5)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: j0.x.F(q0.j, a0.p, boolean):java.util.ArrayList");
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00d8  */
    @Override // q0.r
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final y2.n G(q0.o r13, a0.C0190p r14, android.media.MediaCrypto r15, float r16) {
        /*
            Method dump skipped, instruction units count: 343
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: j0.x.G(q0.o, a0.p, android.media.MediaCrypto, float):y2.n");
    }

    @Override // q0.r
    public final void H(g0.e eVar) {
        C0190p c0190p;
        p pVar;
        if (AbstractC0370w.f5326a < 29 || (c0190p = eVar.f5785n) == null || !Objects.equals(c0190p.f3424n, "audio/opus") || !this.f9357r0) {
            return;
        }
        ByteBuffer byteBuffer = eVar.f5790s;
        byteBuffer.getClass();
        C0190p c0190p2 = eVar.f5785n;
        c0190p2.getClass();
        if (byteBuffer.remaining() == 8) {
            int i = (int) ((byteBuffer.order(ByteOrder.LITTLE_ENDIAN).getLong() * 48000) / 1000000000);
            v vVar = this.f7414P0;
            AudioTrack audioTrack = vVar.f7406v;
            if (audioTrack == null || !v.p(audioTrack) || (pVar = vVar.f7404t) == null || !pVar.f7337k) {
                return;
            }
            vVar.f7406v.setOffloadDelayPadding(c0190p2.f3405F, i);
        }
    }

    @Override // q0.r
    public final void M(Exception exc) {
        AbstractC0360m.m("MediaCodecAudioRenderer", "Audio codec error", exc);
        Z1.c cVar = this.f7413O0;
        Handler handler = (Handler) cVar.f2996l;
        if (handler != null) {
            handler.post(new f(cVar, exc, 3));
        }
    }

    @Override // q0.r
    public final void N(long j5, long j6, String str) {
        Z1.c cVar = this.f7413O0;
        Handler handler = (Handler) cVar.f2996l;
        if (handler != null) {
            handler.post(new f(cVar, str, j5, j6));
        }
    }

    @Override // q0.r
    public final void O(String str) {
        Z1.c cVar = this.f7413O0;
        Handler handler = (Handler) cVar.f2996l;
        if (handler != null) {
            handler.post(new f(cVar, str, 7));
        }
    }

    @Override // q0.r
    public final C0459j P(Z1.e eVar) {
        C0190p c0190p = (C0190p) eVar.f3002n;
        c0190p.getClass();
        this.f7419U0 = c0190p;
        C0459j c0459jP = super.P(eVar);
        Z1.c cVar = this.f7413O0;
        Handler handler = (Handler) cVar.f2996l;
        if (handler != null) {
            handler.post(new f(cVar, c0190p, c0459jP));
        }
        return c0459jP;
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x0104 A[Catch: i -> 0x0102, TryCatch #0 {i -> 0x0102, blocks: (B:42:0x00d9, B:45:0x00e1, B:47:0x00e5, B:49:0x00ee, B:53:0x00fc, B:56:0x0104, B:60:0x010b, B:61:0x0110), top: B:65:0x00d9 }] */
    @Override // q0.r
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Q(a0.C0190p r14, android.media.MediaFormat r15) throws h0.C0464o {
        /*
            Method dump skipped, instruction units count: 340
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: j0.x.Q(a0.p, android.media.MediaFormat):void");
    }

    @Override // q0.r
    public final void R() {
        this.f7414P0.getClass();
    }

    @Override // q0.r
    public final void T() {
        this.f7414P0.f7363L = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0068  */
    @Override // q0.r
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean X(long r1, long r3, q0.l r5, java.nio.ByteBuffer r6, int r7, int r8, int r9, long r10, boolean r12, boolean r13, a0.C0190p r14) throws h0.C0464o {
        /*
            r0 = this;
            r6.getClass()
            a0.p r1 = r0.f7420V0
            r2 = 1
            if (r1 == 0) goto L13
            r1 = r8 & 2
            if (r1 == 0) goto L13
            r5.getClass()
            r5.k(r7)
            return r2
        L13:
            j0.v r1 = r0.f7414P0
            if (r12 == 0) goto L26
            if (r5 == 0) goto L1c
            r5.k(r7)
        L1c:
            h0.i r3 = r0.f9320I0
            int r4 = r3.f6167f
            int r4 = r4 + r9
            r3.f6167f = r4
            r1.f7363L = r2
            return r2
        L26:
            boolean r1 = r1.l(r10, r6, r9)     // Catch: j0.k -> L3b j0.j -> L55
            if (r1 == 0) goto L39
            if (r5 == 0) goto L31
            r5.k(r7)
        L31:
            h0.i r1 = r0.f9320I0
            int r3 = r1.f6166e
            int r3 = r3 + r9
            r1.f6166e = r3
            return r2
        L39:
            r1 = 0
            return r1
        L3b:
            r1 = move-exception
            boolean r2 = r0.f9357r0
            if (r2 == 0) goto L4c
            h0.r0 r2 = r0.f6151o
            r2.getClass()
            int r2 = r2.f6275a
            if (r2 == 0) goto L4c
            r2 = 5003(0x138b, float:7.01E-42)
            goto L4e
        L4c:
            r2 = 5002(0x138a, float:7.009E-42)
        L4e:
            boolean r3 = r1.f7279m
            h0.o r1 = r0.i(r1, r14, r3, r2)
            throw r1
        L55:
            r1 = move-exception
            a0.p r2 = r0.f7419U0
            boolean r3 = r0.f9357r0
            if (r3 == 0) goto L68
            h0.r0 r3 = r0.f6151o
            r3.getClass()
            int r3 = r3.f6275a
            if (r3 == 0) goto L68
            r3 = 5004(0x138c, float:7.012E-42)
            goto L6a
        L68:
            r3 = 5001(0x1389, float:7.008E-42)
        L6a:
            boolean r4 = r1.f7277m
            h0.o r1 = r0.i(r1, r2, r4, r3)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: j0.x.X(long, long, q0.l, java.nio.ByteBuffer, int, int, int, long, boolean, boolean, a0.p):boolean");
    }

    @Override // h0.U
    public final void a(C0159J c0159j) {
        v vVar = this.f7414P0;
        vVar.getClass();
        vVar.f7354C = new C0159J(AbstractC0370w.h(c0159j.f3220a, 0.1f, 8.0f), AbstractC0370w.h(c0159j.f3221b, 0.1f, 8.0f));
        if (vVar.x()) {
            vVar.v();
            return;
        }
        q qVar = new q(c0159j, -9223372036854775807L, -9223372036854775807L);
        if (vVar.o()) {
            vVar.f7352A = qVar;
        } else {
            vVar.f7353B = qVar;
        }
    }

    @Override // q0.r
    public final void a0() throws C0464o {
        try {
            v vVar = this.f7414P0;
            if (!vVar.f7369S && vVar.o() && vVar.f()) {
                vVar.s();
                vVar.f7369S = true;
            }
        } catch (k e5) {
            throw i(e5, e5.f7280n, e5.f7279m, this.f9357r0 ? 5003 : 5002);
        }
    }

    @Override // h0.U
    public final C0159J d() {
        return this.f7414P0.f7354C;
    }

    @Override // h0.U
    public final boolean f() {
        boolean z4 = this.f7424Z0;
        this.f7424Z0 = false;
        return z4;
    }

    @Override // h0.o0, h0.q0
    public final String getName() {
        return "MediaCodecAudioRenderer";
    }

    @Override // h0.U
    public final long h() {
        if (this.f6155s == 2) {
            o0();
        }
        return this.f7421W0;
    }

    @Override // q0.r
    public final boolean h0(C0190p c0190p) {
        r0 r0Var = this.f6151o;
        r0Var.getClass();
        if (r0Var.f6275a != 0) {
            int iM0 = m0(c0190p);
            if ((iM0 & 512) != 0) {
                r0 r0Var2 = this.f6151o;
                r0Var2.getClass();
                if (r0Var2.f6275a == 2 || (iM0 & 1024) != 0 || (c0190p.f3405F == 0 && c0190p.f3406G == 0)) {
                    return true;
                }
            }
        }
        return this.f7414P0.i(c0190p) != 0;
    }

    @Override // h0.AbstractC0457h, h0.k0
    public final void handleMessage(int i, Object obj) {
        E e5;
        Z1.s sVar;
        v vVar = this.f7414P0;
        if (i == 2) {
            obj.getClass();
            float fFloatValue = ((Float) obj).floatValue();
            if (vVar.f7365O != fFloatValue) {
                vVar.f7365O = fFloatValue;
                if (vVar.o()) {
                    vVar.f7406v.setVolume(vVar.f7365O);
                    return;
                }
                return;
            }
            return;
        }
        if (i == 3) {
            C0177c c0177c = (C0177c) obj;
            c0177c.getClass();
            if (vVar.f7409z.equals(c0177c)) {
                return;
            }
            vVar.f7409z = c0177c;
            if (vVar.f7378a0) {
                return;
            }
            d dVar = vVar.f7408x;
            if (dVar != null) {
                dVar.i = c0177c;
                dVar.a(C0522b.b(dVar.f7258a, c0177c, dVar.f7265h));
            }
            vVar.g();
            return;
        }
        if (i == 6) {
            C0178d c0178d = (C0178d) obj;
            c0178d.getClass();
            if (vVar.f7375Y.equals(c0178d)) {
                return;
            }
            if (vVar.f7406v != null) {
                vVar.f7375Y.getClass();
            }
            vVar.f7375Y = c0178d;
            return;
        }
        if (i == 12) {
            if (AbstractC0370w.f5326a >= 23) {
                AudioDeviceInfo audioDeviceInfo = (AudioDeviceInfo) obj;
                if (audioDeviceInfo == null) {
                    e5 = null;
                } else {
                    vVar.getClass();
                    e5 = new E(audioDeviceInfo, 9);
                }
                vVar.f7376Z = e5;
                d dVar2 = vVar.f7408x;
                if (dVar2 != null) {
                    dVar2.b(audioDeviceInfo);
                }
                AudioTrack audioTrack = vVar.f7406v;
                if (audioTrack != null) {
                    E e6 = vVar.f7376Z;
                    audioTrack.setPreferredDevice(e6 != null ? (AudioDeviceInfo) e6.f4474m : null);
                    return;
                }
                return;
            }
            return;
        }
        if (i == 16) {
            obj.getClass();
            this.f7425a1 = ((Integer) obj).intValue();
            q0.l lVar = this.f9335V;
            if (lVar != null && AbstractC0370w.f5326a >= 35) {
                Bundle bundle = new Bundle();
                bundle.putInt("importance", Math.max(0, -this.f7425a1));
                lVar.a(bundle);
                return;
            }
            return;
        }
        if (i == 9) {
            obj.getClass();
            vVar.f7355D = ((Boolean) obj).booleanValue();
            q qVar = new q(vVar.x() ? C0159J.f3219d : vVar.f7354C, -9223372036854775807L, -9223372036854775807L);
            if (vVar.o()) {
                vVar.f7352A = qVar;
                return;
            } else {
                vVar.f7353B = qVar;
                return;
            }
        }
        if (i != 10) {
            if (i == 11) {
                this.f9330Q = (C0449H) obj;
                return;
            }
            return;
        }
        obj.getClass();
        int iIntValue = ((Integer) obj).intValue();
        if (vVar.f7374X != iIntValue) {
            vVar.f7374X = iIntValue;
            vVar.f7373W = iIntValue != 0;
            vVar.g();
        }
        if (AbstractC0370w.f5326a < 35 || (sVar = this.f7415Q0) == null) {
            return;
        }
        LoudnessCodecController loudnessCodecController = (LoudnessCodecController) sVar.f3087o;
        if (loudnessCodecController != null) {
            loudnessCodecController.close();
            sVar.f3087o = null;
        }
        LoudnessCodecController loudnessCodecControllerCreate = LoudnessCodecController.create(iIntValue, EnumC0743a.f9372l, new q0.i(sVar));
        sVar.f3087o = loudnessCodecControllerCreate;
        Iterator it = ((HashSet) sVar.f3085m).iterator();
        while (it.hasNext()) {
            if (!loudnessCodecControllerCreate.addMediaCodec((MediaCodec) it.next())) {
                it.remove();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00ac  */
    @Override // q0.r
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int i0(q0.j r17, a0.C0190p r18) {
        /*
            Method dump skipped, instruction units count: 271
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: j0.x.i0(q0.j, a0.p):int");
    }

    @Override // h0.AbstractC0457h, h0.o0
    public final boolean isEnded() {
        if (this.f9312E0) {
            v vVar = this.f7414P0;
            if (!vVar.o() || (vVar.f7369S && !vVar.m())) {
                return true;
            }
        }
        return false;
    }

    @Override // q0.r, h0.o0
    public final boolean isReady() {
        return this.f7414P0.m() || super.isReady();
    }

    @Override // q0.r, h0.AbstractC0457h
    public final void j() {
        Z1.c cVar = this.f7413O0;
        this.f7423Y0 = true;
        this.f7419U0 = null;
        try {
            this.f7414P0.g();
            try {
                super.j();
            } finally {
            }
        } catch (Throwable th) {
            try {
                super.j();
                throw th;
            } finally {
            }
        }
    }

    @Override // h0.AbstractC0457h
    public final void k(boolean z4, boolean z5) {
        C0458i c0458i = new C0458i();
        this.f9320I0 = c0458i;
        Z1.c cVar = this.f7413O0;
        Handler handler = (Handler) cVar.f2996l;
        if (handler != null) {
            handler.post(new f(cVar, c0458i, 0));
        }
        r0 r0Var = this.f6151o;
        r0Var.getClass();
        boolean z6 = r0Var.f6276b;
        v vVar = this.f7414P0;
        if (z6) {
            AbstractC0360m.h(vVar.f7373W);
            if (!vVar.f7378a0) {
                vVar.f7378a0 = true;
                vVar.g();
            }
        } else if (vVar.f7378a0) {
            vVar.f7378a0 = false;
            vVar.g();
        }
        i0.j jVar = this.f6153q;
        jVar.getClass();
        vVar.f7401q = jVar;
        C0365r c0365r = this.f6154r;
        c0365r.getClass();
        vVar.f7389g.f7302I = c0365r;
    }

    @Override // q0.r, h0.AbstractC0457h
    public final void l(long j5, boolean z4) {
        super.l(j5, z4);
        this.f7414P0.g();
        this.f7421W0 = j5;
        this.f7424Z0 = false;
        this.f7422X0 = true;
    }

    @Override // h0.AbstractC0457h
    public final void m() {
        Z1.s sVar;
        S2.e eVar;
        d dVar = this.f7414P0.f7408x;
        if (dVar != null && dVar.f7266j) {
            dVar.f7264g = null;
            int i = AbstractC0370w.f5326a;
            Context context = dVar.f7258a;
            if (i >= 23 && (eVar = dVar.f7261d) != null) {
                AudioManager audioManager = (AudioManager) context.getSystemService("audio");
                audioManager.getClass();
                audioManager.unregisterAudioDeviceCallback(eVar);
            }
            context.unregisterReceiver(dVar.f7262e);
            c cVar = dVar.f7263f;
            if (cVar != null) {
                cVar.f7255a.unregisterContentObserver(cVar);
            }
            dVar.f7266j = false;
        }
        if (AbstractC0370w.f5326a < 35 || (sVar = this.f7415Q0) == null) {
            return;
        }
        ((HashSet) sVar.f3085m).clear();
        LoudnessCodecController loudnessCodecController = (LoudnessCodecController) sVar.f3087o;
        if (loudnessCodecController != null) {
            loudnessCodecController.close();
        }
    }

    public final int m0(C0190p c0190p) {
        e eVarH = this.f7414P0.h(c0190p);
        if (!eVarH.f7268a) {
            return 0;
        }
        int i = eVarH.f7269b ? 1536 : 512;
        return eVarH.f7270c ? i | 2048 : i;
    }

    @Override // h0.AbstractC0457h
    public final void n() {
        v vVar = this.f7414P0;
        this.f7424Z0 = false;
        try {
            try {
                v();
                Z();
                E e5 = this.f9329P;
                if (e5 != null) {
                    e5.I(null);
                }
                this.f9329P = null;
            } catch (Throwable th) {
                E e6 = this.f9329P;
                if (e6 != null) {
                    e6.I(null);
                }
                this.f9329P = null;
                throw th;
            }
        } finally {
            if (this.f7423Y0) {
                this.f7423Y0 = false;
                vVar.u();
            }
        }
    }

    public final int n0(q0.o oVar, C0190p c0190p) {
        int i;
        if (!"OMX.google.raw.decoder".equals(oVar.f9288a) || (i = AbstractC0370w.f5326a) >= 24 || (i == 23 && AbstractC0370w.K(this.f7412N0))) {
            return c0190p.f3425o;
        }
        return -1;
    }

    @Override // h0.AbstractC0457h
    public final void o() {
        this.f7414P0.r();
    }

    public final void o0() {
        long jMax;
        ArrayDeque arrayDeque;
        long j5;
        long jU;
        boolean zIsEnded = isEnded();
        v vVar = this.f7414P0;
        if (!vVar.o() || vVar.M) {
            jMax = Long.MIN_VALUE;
        } else {
            long jMin = Math.min(vVar.f7389g.a(zIsEnded), AbstractC0370w.S(vVar.k(), vVar.f7404t.f7332e));
            while (true) {
                arrayDeque = vVar.f7391h;
                if (arrayDeque.isEmpty() || jMin < ((q) arrayDeque.getFirst()).f7341c) {
                    break;
                } else {
                    vVar.f7353B = (q) arrayDeque.remove();
                }
            }
            q qVar = vVar.f7353B;
            long j6 = jMin - qVar.f7341c;
            long jX = AbstractC0370w.x(j6, qVar.f7339a.f3220a);
            boolean zIsEmpty = arrayDeque.isEmpty();
            Z1.s sVar = vVar.f7379b;
            if (zIsEmpty) {
                C0303g c0303g = (C0303g) sVar.f3087o;
                if (c0303g.a()) {
                    if (c0303g.f4876o >= 1024) {
                        long j7 = c0303g.f4875n;
                        C0302f c0302f = c0303g.f4871j;
                        c0302f.getClass();
                        long j8 = j7 - ((long) ((c0302f.f4851k * c0302f.f4843b) * 2));
                        int i = c0303g.f4870h.f4830a;
                        int i5 = c0303g.f4869g.f4830a;
                        jU = i == i5 ? AbstractC0370w.U(j6, j8, c0303g.f4876o, RoundingMode.DOWN) : AbstractC0370w.U(j6, j8 * ((long) i), c0303g.f4876o * ((long) i5), RoundingMode.DOWN);
                    } else {
                        jU = (long) (((double) c0303g.f4865c) * j6);
                    }
                    j6 = jU;
                }
                q qVar2 = vVar.f7353B;
                j5 = qVar2.f7340b + j6;
                qVar2.f7342d = j6 - jX;
            } else {
                q qVar3 = vVar.f7353B;
                j5 = qVar3.f7340b + jX + qVar3.f7342d;
            }
            long j9 = ((z) sVar.f3086n).f7438q;
            jMax = AbstractC0370w.S(j9, vVar.f7404t.f7332e) + j5;
            long j10 = vVar.f7390g0;
            if (j9 > j10) {
                long jS = AbstractC0370w.S(j9 - j10, vVar.f7404t.f7332e);
                vVar.f7390g0 = j9;
                vVar.f7392h0 += jS;
                if (vVar.f7393i0 == null) {
                    vVar.f7393i0 = new Handler(Looper.myLooper());
                }
                vVar.f7393i0.removeCallbacksAndMessages(null);
                vVar.f7393i0.postDelayed(new A3.c(vVar, 16), 100L);
            }
        }
        if (jMax != Long.MIN_VALUE) {
            if (!this.f7422X0) {
                jMax = Math.max(this.f7421W0, jMax);
            }
            this.f7421W0 = jMax;
            this.f7422X0 = false;
        }
    }

    @Override // h0.AbstractC0457h
    public final void p() {
        o0();
        v vVar = this.f7414P0;
        vVar.f7372V = false;
        if (vVar.o()) {
            n nVar = vVar.f7389g;
            nVar.d();
            if (nVar.f7325x == -9223372036854775807L) {
                m mVar = nVar.f7307e;
                mVar.getClass();
                mVar.a();
            } else {
                nVar.f7326z = nVar.b();
                if (!v.p(vVar.f7406v)) {
                    return;
                }
            }
            vVar.f7406v.pause();
        }
    }

    @Override // q0.r
    public final C0459j t(q0.o oVar, C0190p c0190p, C0190p c0190p2) {
        C0459j c0459jB = oVar.b(c0190p, c0190p2);
        boolean z4 = this.f9329P == null && h0(c0190p2);
        int i = c0459jB.f6197e;
        if (z4) {
            i |= 32768;
        }
        if (n0(oVar, c0190p2) > this.f7416R0) {
            i |= 64;
        }
        int i5 = i;
        return new C0459j(oVar.f9288a, c0190p, c0190p2, i5 == 0 ? c0459jB.f6196d : 0, i5);
    }

    @Override // h0.AbstractC0457h, h0.o0
    public final U getMediaClock() {
        return this;
    }
}

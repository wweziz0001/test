package j0;

import F0.C0057d;
import a0.AbstractC0156G;
import a0.C0159J;
import a0.C0177c;
import a0.C0178d;
import a0.C0190p;
import android.content.Context;
import android.content.IntentFilter;
import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.media.AudioTrack;
import android.media.PlaybackParams;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import androidx.lifecycle.E;
import b0.C0297a;
import b0.C0298b;
import b0.C0304h;
import b0.InterfaceC0300d;
import b3.AbstractC0307a;
import d0.AbstractC0360m;
import d0.AbstractC0370w;
import d0.ThreadFactoryC0369v;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import m2.C0640G;
import m2.I;
import m2.b0;

/* JADX INFO: loaded from: classes.dex */
public final class v {

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public static final Object f7349j0 = new Object();

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public static ScheduledExecutorService f7350k0;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public static int f7351l0;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public q f7352A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public q f7353B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public C0159J f7354C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public boolean f7355D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public ByteBuffer f7356E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public int f7357F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public long f7358G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public long f7359H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public long f7360I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public long f7361J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public int f7362K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public boolean f7363L;
    public boolean M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public long f7364N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public float f7365O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public ByteBuffer f7366P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public int f7367Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    public ByteBuffer f7368R;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public boolean f7369S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    public boolean f7370T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public boolean f7371U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public boolean f7372V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public boolean f7373W;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public int f7374X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public C0178d f7375Y;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public E f7376Z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f7377a;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public boolean f7378a0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Z1.s f7379b;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public long f7380b0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final o f7381c;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public long f7382c0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final B f7383d;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public boolean f7384d0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final b0 f7385e;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public boolean f7386e0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final b0 f7387f;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public Looper f7388f0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final n f7389g;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public long f7390g0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ArrayDeque f7391h;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public long f7392h0;
    public final boolean i;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public Handler f7393i0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f7394j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Z1.s f7395k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final s f7396l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final s f7397m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final w f7398n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Z1.e f7399o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final w f7400p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public i0.j f7401q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public E f7402r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public p f7403s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public p f7404t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public C0297a f7405u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public AudioTrack f7406v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public C0522b f7407w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public d f7408x;
    public Z1.m y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public C0177c f7409z;

    public v(D0.k kVar) {
        C0522b c0522bB;
        Context context = (Context) kVar.f451b;
        this.f7377a = context;
        C0177c c0177c = C0177c.f3322e;
        this.f7409z = c0177c;
        if (context != null) {
            C0522b c0522b = C0522b.f7250c;
            int i = AbstractC0370w.f5326a;
            c0522bB = C0522b.b(context, c0177c, null);
        } else {
            c0522bB = (C0522b) kVar.f452c;
        }
        this.f7407w = c0522bB;
        this.f7379b = (Z1.s) kVar.f453d;
        int i5 = AbstractC0370w.f5326a;
        this.i = false;
        this.f7394j = 0;
        this.f7398n = (w) kVar.f454e;
        Z1.e eVar = (Z1.e) kVar.f456g;
        eVar.getClass();
        this.f7399o = eVar;
        this.f7389g = new n(new E(this, 10));
        o oVar = new o();
        this.f7381c = oVar;
        B b4 = new B();
        b4.f7243m = AbstractC0370w.f5331f;
        this.f7383d = b4;
        this.f7385e = I.w(new C0304h(), oVar, b4);
        this.f7387f = I.u(new C0520A());
        this.f7365O = 1.0f;
        this.f7374X = 0;
        this.f7375Y = new C0178d();
        C0159J c0159j = C0159J.f3219d;
        this.f7353B = new q(c0159j, 0L, 0L);
        this.f7354C = c0159j;
        this.f7355D = false;
        this.f7391h = new ArrayDeque();
        this.f7396l = new s();
        this.f7397m = new s();
        this.f7400p = (w) kVar.f455f;
    }

    public static boolean p(AudioTrack audioTrack) {
        return AbstractC0370w.f5326a >= 29 && audioTrack.isOffloadedPlayback();
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0059  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(long r9) {
        /*
            r8 = this;
            boolean r0 = r8.x()
            Z1.s r1 = r8.f7379b
            if (r0 != 0) goto L3f
            boolean r0 = r8.f7378a0
            if (r0 != 0) goto L39
            j0.p r0 = r8.f7404t
            int r2 = r0.f7330c
            if (r2 != 0) goto L39
            a0.p r0 = r0.f7328a
            int r0 = r0.f3404E
            a0.J r0 = r8.f7354C
            r1.getClass()
            float r2 = r0.f3220a
            java.lang.Object r3 = r1.f3087o
            b0.g r3 = (b0.C0303g) r3
            float r4 = r3.f4865c
            int r4 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            r5 = 1
            if (r4 == 0) goto L2c
            r3.f4865c = r2
            r3.i = r5
        L2c:
            float r2 = r3.f4866d
            float r4 = r0.f3221b
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 == 0) goto L3b
            r3.f4866d = r4
            r3.i = r5
            goto L3b
        L39:
            a0.J r0 = a0.C0159J.f3219d
        L3b:
            r8.f7354C = r0
        L3d:
            r3 = r0
            goto L42
        L3f:
            a0.J r0 = a0.C0159J.f3219d
            goto L3d
        L42:
            boolean r0 = r8.f7378a0
            if (r0 != 0) goto L59
            j0.p r0 = r8.f7404t
            int r2 = r0.f7330c
            if (r2 != 0) goto L59
            a0.p r0 = r0.f7328a
            int r0 = r0.f3404E
            boolean r0 = r8.f7355D
            java.lang.Object r1 = r1.f3086n
            j0.z r1 = (j0.z) r1
            r1.f7436o = r0
            goto L5a
        L59:
            r0 = 0
        L5a:
            r8.f7355D = r0
            java.util.ArrayDeque r0 = r8.f7391h
            j0.q r1 = new j0.q
            r4 = 0
            long r4 = java.lang.Math.max(r4, r9)
            j0.p r9 = r8.f7404t
            long r6 = r8.k()
            int r9 = r9.f7332e
            long r6 = d0.AbstractC0370w.S(r6, r9)
            r2 = r1
            r2.<init>(r3, r4, r6)
            r0.add(r1)
            j0.p r9 = r8.f7404t
            b0.a r9 = r9.i
            r8.f7405u = r9
            r9.b()
            androidx.lifecycle.E r9 = r8.f7402r
            if (r9 == 0) goto L9c
            boolean r10 = r8.f7355D
            java.lang.Object r9 = r9.f4474m
            j0.x r9 = (j0.x) r9
            Z1.c r9 = r9.f7413O0
            java.lang.Object r0 = r9.f2996l
            android.os.Handler r0 = (android.os.Handler) r0
            if (r0 == 0) goto L9c
            j0.g r1 = new j0.g
            r1.<init>()
            r0.post(r1)
        L9c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: j0.v.a(long):void");
    }

    public final AudioTrack b(C0057d c0057d, C0177c c0177c, int i, C0190p c0190p) throws j {
        try {
            AudioTrack audioTrackA = this.f7400p.a(c0057d, c0177c, i);
            int state = audioTrackA.getState();
            if (state == 1) {
                return audioTrackA;
            }
            try {
                audioTrackA.release();
            } catch (Exception unused) {
            }
            throw new j(state, c0057d.f749b, c0057d.f750c, c0057d.f748a, c0190p, c0057d.f752e, null);
        } catch (IllegalArgumentException | UnsupportedOperationException e5) {
            throw new j(0, c0057d.f749b, c0057d.f750c, c0057d.f748a, c0190p, c0057d.f752e, e5);
        }
    }

    public final AudioTrack c(p pVar) throws j {
        try {
            return b(pVar.a(), this.f7409z, this.f7374X, pVar.f7328a);
        } catch (j e5) {
            E e6 = this.f7402r;
            if (e6 != null) {
                e6.G(e5);
            }
            throw e5;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0197  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d(a0.C0190p r27, int[] r28) {
        /*
            Method dump skipped, instruction units count: 668
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: j0.v.d(a0.p, int[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x00a9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e(long r13) throws java.lang.Exception {
        /*
            Method dump skipped, instruction units count: 364
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: j0.v.e(long):void");
    }

    public final boolean f() throws Exception {
        if (!this.f7405u.e()) {
            e(Long.MIN_VALUE);
            return this.f7368R == null;
        }
        C0297a c0297a = this.f7405u;
        if (c0297a.e() && !c0297a.f4828d) {
            c0297a.f4828d = true;
            ((InterfaceC0300d) c0297a.f4826b.get(0)).c();
        }
        t(Long.MIN_VALUE);
        if (!this.f7405u.d()) {
            return false;
        }
        ByteBuffer byteBuffer = this.f7368R;
        return byteBuffer == null || !byteBuffer.hasRemaining();
    }

    public final void g() {
        Z1.m mVar;
        if (o()) {
            this.f7358G = 0L;
            this.f7359H = 0L;
            this.f7360I = 0L;
            this.f7361J = 0L;
            this.f7386e0 = false;
            this.f7362K = 0;
            this.f7353B = new q(this.f7354C, 0L, 0L);
            this.f7364N = 0L;
            this.f7352A = null;
            this.f7391h.clear();
            this.f7366P = null;
            this.f7367Q = 0;
            this.f7368R = null;
            this.f7370T = false;
            this.f7369S = false;
            this.f7371U = false;
            this.f7356E = null;
            this.f7357F = 0;
            this.f7383d.f7245o = 0L;
            C0297a c0297a = this.f7404t.i;
            this.f7405u = c0297a;
            c0297a.b();
            AudioTrack audioTrack = this.f7389g.f7305c;
            audioTrack.getClass();
            if (audioTrack.getPlayState() == 3) {
                this.f7406v.pause();
            }
            if (p(this.f7406v)) {
                Z1.s sVar = this.f7395k;
                sVar.getClass();
                this.f7406v.unregisterStreamEventCallback((u) sVar.f3086n);
                ((Handler) sVar.f3085m).removeCallbacksAndMessages(null);
            }
            C0057d c0057dA = this.f7404t.a();
            p pVar = this.f7403s;
            if (pVar != null) {
                this.f7404t = pVar;
                this.f7403s = null;
            }
            n nVar = this.f7389g;
            nVar.d();
            nVar.f7305c = null;
            nVar.f7307e = null;
            if (AbstractC0370w.f5326a >= 24 && (mVar = this.y) != null) {
                r rVar = (r) mVar.f3026o;
                rVar.getClass();
                ((AudioTrack) mVar.f3024m).removeOnRoutingChangedListener(rVar);
                mVar.f3026o = null;
                this.y = null;
            }
            AudioTrack audioTrack2 = this.f7406v;
            E e5 = this.f7402r;
            Handler handler = new Handler(Looper.myLooper());
            synchronized (f7349j0) {
                try {
                    if (f7350k0 == null) {
                        f7350k0 = Executors.newSingleThreadScheduledExecutor(new ThreadFactoryC0369v());
                    }
                    f7351l0++;
                    f7350k0.schedule(new P2.b(audioTrack2, e5, handler, c0057dA, 2), 20L, TimeUnit.MILLISECONDS);
                } catch (Throwable th) {
                    throw th;
                }
            }
            this.f7406v = null;
        }
        s sVar2 = this.f7397m;
        sVar2.f7344a = null;
        sVar2.f7345b = -9223372036854775807L;
        sVar2.f7346c = -9223372036854775807L;
        s sVar3 = this.f7396l;
        sVar3.f7344a = null;
        sVar3.f7345b = -9223372036854775807L;
        sVar3.f7346c = -9223372036854775807L;
        this.f7390g0 = 0L;
        this.f7392h0 = 0L;
        Handler handler2 = this.f7393i0;
        if (handler2 != null) {
            handler2.removeCallbacksAndMessages(null);
        }
    }

    public final e h(C0190p c0190p) {
        int i;
        boolean zBooleanValue;
        AudioManager audioManager;
        if (this.f7384d0) {
            return e.f7267d;
        }
        C0177c c0177c = this.f7409z;
        Z1.e eVar = this.f7399o;
        eVar.getClass();
        c0190p.getClass();
        c0177c.getClass();
        int i5 = AbstractC0370w.f5326a;
        if (i5 < 29 || (i = c0190p.f3403D) == -1) {
            return e.f7267d;
        }
        Boolean bool = (Boolean) eVar.f3002n;
        boolean z4 = false;
        if (bool != null) {
            zBooleanValue = bool.booleanValue();
        } else {
            Context context = (Context) eVar.f3001m;
            if (context == null || (audioManager = (AudioManager) context.getSystemService("audio")) == null) {
                eVar.f3002n = Boolean.FALSE;
            } else {
                String parameters = audioManager.getParameters("offloadVariableRateSupported");
                eVar.f3002n = Boolean.valueOf(parameters != null && parameters.equals("offloadVariableRateSupported=1"));
            }
            zBooleanValue = ((Boolean) eVar.f3002n).booleanValue();
        }
        String str = c0190p.f3424n;
        str.getClass();
        int iC = AbstractC0156G.c(str, c0190p.f3421k);
        if (iC == 0 || i5 < AbstractC0370w.p(iC)) {
            return e.f7267d;
        }
        int iR = AbstractC0370w.r(c0190p.f3402C);
        if (iR == 0) {
            return e.f7267d;
        }
        try {
            AudioFormat audioFormatQ = AbstractC0370w.q(i, iR, iC);
            if (i5 < 31) {
                if (!AudioManager.isOffloadedPlaybackSupported(audioFormatQ, (AudioAttributes) c0177c.a().f190l)) {
                    return e.f7267d;
                }
                Z0.d dVar = new Z0.d();
                dVar.f2832a = true;
                dVar.f2834c = zBooleanValue;
                return dVar.a();
            }
            int playbackOffloadSupport = AudioManager.getPlaybackOffloadSupport(audioFormatQ, (AudioAttributes) c0177c.a().f190l);
            if (playbackOffloadSupport == 0) {
                return e.f7267d;
            }
            Z0.d dVar2 = new Z0.d();
            if (i5 > 32 && playbackOffloadSupport == 2) {
                z4 = true;
            }
            dVar2.f2832a = true;
            dVar2.f2833b = z4;
            dVar2.f2834c = zBooleanValue;
            return dVar2.a();
        } catch (IllegalArgumentException unused) {
            return e.f7267d;
        }
    }

    public final int i(C0190p c0190p) {
        q();
        if (!"audio/raw".equals(c0190p.f3424n)) {
            return this.f7407w.d(this.f7409z, c0190p) != null ? 2 : 0;
        }
        int i = c0190p.f3404E;
        if (AbstractC0370w.H(i)) {
            return i != 2 ? 1 : 2;
        }
        AbstractC0307a.o(i, "Invalid PCM encoding: ", "DefaultAudioSink");
        return 0;
    }

    public final long j() {
        p pVar = this.f7404t;
        return pVar.f7330c == 0 ? this.f7358G / ((long) pVar.f7329b) : this.f7359H;
    }

    public final long k() {
        p pVar = this.f7404t;
        if (pVar.f7330c != 0) {
            return this.f7361J;
        }
        long j5 = this.f7360I;
        long j6 = pVar.f7331d;
        int i = AbstractC0370w.f5326a;
        return ((j5 + j6) - 1) / j6;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x010d, code lost:
    
        if (r10.b() == 0) goto L72;
     */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0240  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0271  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0277  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0279  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean l(long r24, java.nio.ByteBuffer r26, int r27) throws java.lang.Exception {
        /*
            Method dump skipped, instruction units count: 1182
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: j0.v.l(long, java.nio.ByteBuffer, int):boolean");
    }

    public final boolean m() {
        return o() && !(AbstractC0370w.f5326a >= 29 && this.f7406v.isOffloadedPlayback() && this.f7371U) && this.f7389g.c(k());
    }

    /* JADX WARN: Removed duplicated region for block: B:4:0x000a  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:93:? A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean n() throws j0.j {
        /*
            Method dump skipped, instruction units count: 428
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: j0.v.n():boolean");
    }

    public final boolean o() {
        return this.f7406v != null;
    }

    public final void q() {
        Context context;
        C0522b c0522bC;
        S2.e eVar;
        if (this.f7408x != null || (context = this.f7377a) == null) {
            return;
        }
        this.f7388f0 = Looper.myLooper();
        d dVar = new d(context, new I2.g(this, 18), this.f7409z, this.f7376Z);
        this.f7408x = dVar;
        if (dVar.f7266j) {
            c0522bC = dVar.f7264g;
            c0522bC.getClass();
        } else {
            dVar.f7266j = true;
            c cVar = dVar.f7263f;
            if (cVar != null) {
                cVar.f7255a.registerContentObserver(cVar.f7256b, false, cVar);
            }
            int i = AbstractC0370w.f5326a;
            Handler handler = dVar.f7260c;
            Context context2 = dVar.f7258a;
            if (i >= 23 && (eVar = dVar.f7261d) != null) {
                AudioManager audioManager = (AudioManager) context2.getSystemService("audio");
                audioManager.getClass();
                audioManager.registerAudioDeviceCallback(eVar, handler);
            }
            c0522bC = C0522b.c(context2, context2.registerReceiver(dVar.f7262e, new IntentFilter("android.media.action.HDMI_AUDIO_PLUG"), null, handler), dVar.i, dVar.f7265h);
            dVar.f7264g = c0522bC;
        }
        this.f7407w = c0522bC;
    }

    public final void r() {
        this.f7372V = true;
        if (o()) {
            n nVar = this.f7389g;
            if (nVar.f7325x != -9223372036854775807L) {
                nVar.f7302I.getClass();
                nVar.f7325x = AbstractC0370w.M(SystemClock.elapsedRealtime());
            }
            m mVar = nVar.f7307e;
            mVar.getClass();
            mVar.a();
            this.f7406v.play();
        }
    }

    public final void s() {
        if (this.f7370T) {
            return;
        }
        this.f7370T = true;
        long jK = k();
        n nVar = this.f7389g;
        nVar.f7326z = nVar.b();
        nVar.f7302I.getClass();
        nVar.f7325x = AbstractC0370w.M(SystemClock.elapsedRealtime());
        nVar.f7294A = jK;
        if (p(this.f7406v)) {
            this.f7371U = false;
        }
        this.f7406v.stop();
        this.f7357F = 0;
    }

    public final void t(long j5) throws Exception {
        ByteBuffer byteBuffer;
        e(j5);
        if (this.f7368R != null) {
            return;
        }
        if (!this.f7405u.e()) {
            ByteBuffer byteBuffer2 = this.f7366P;
            if (byteBuffer2 != null) {
                w(byteBuffer2);
                e(j5);
                return;
            }
            return;
        }
        while (!this.f7405u.d()) {
            do {
                C0297a c0297a = this.f7405u;
                if (c0297a.e()) {
                    ByteBuffer byteBuffer3 = c0297a.f4827c[c0297a.c()];
                    if (byteBuffer3.hasRemaining()) {
                        byteBuffer = byteBuffer3;
                    } else {
                        c0297a.f(InterfaceC0300d.f4834a);
                        byteBuffer = c0297a.f4827c[c0297a.c()];
                    }
                } else {
                    byteBuffer = InterfaceC0300d.f4834a;
                }
                if (byteBuffer.hasRemaining()) {
                    w(byteBuffer);
                    e(j5);
                } else {
                    ByteBuffer byteBuffer4 = this.f7366P;
                    if (byteBuffer4 == null || !byteBuffer4.hasRemaining()) {
                        return;
                    }
                    C0297a c0297a2 = this.f7405u;
                    ByteBuffer byteBuffer5 = this.f7366P;
                    if (c0297a2.e() && !c0297a2.f4828d) {
                        c0297a2.f(byteBuffer5);
                    }
                }
            } while (this.f7368R == null);
            return;
        }
    }

    public final void u() {
        g();
        C0640G c0640gListIterator = this.f7385e.listIterator(0);
        while (c0640gListIterator.hasNext()) {
            ((InterfaceC0300d) c0640gListIterator.next()).reset();
        }
        C0640G c0640gListIterator2 = this.f7387f.listIterator(0);
        while (c0640gListIterator2.hasNext()) {
            ((InterfaceC0300d) c0640gListIterator2.next()).reset();
        }
        C0297a c0297a = this.f7405u;
        if (c0297a != null) {
            int i = 0;
            while (true) {
                b0 b0Var = c0297a.f4825a;
                if (i >= b0Var.size()) {
                    break;
                }
                InterfaceC0300d interfaceC0300d = (InterfaceC0300d) b0Var.get(i);
                interfaceC0300d.flush();
                interfaceC0300d.reset();
                i++;
            }
            c0297a.f4827c = new ByteBuffer[0];
            C0298b c0298b = C0298b.f4829e;
            c0297a.f4828d = false;
        }
        this.f7372V = false;
        this.f7384d0 = false;
    }

    public final void v() {
        if (o()) {
            try {
                this.f7406v.setPlaybackParams(new PlaybackParams().allowDefaults().setSpeed(this.f7354C.f3220a).setPitch(this.f7354C.f3221b).setAudioFallbackMode(2));
            } catch (IllegalArgumentException e5) {
                AbstractC0360m.z("DefaultAudioSink", "Failed to set playback params", e5);
            }
            C0159J c0159j = new C0159J(this.f7406v.getPlaybackParams().getSpeed(), this.f7406v.getPlaybackParams().getPitch());
            this.f7354C = c0159j;
            n nVar = this.f7389g;
            nVar.i = c0159j.f3220a;
            m mVar = nVar.f7307e;
            if (mVar != null) {
                mVar.a();
            }
            nVar.d();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0019  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01eb A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0055 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void w(java.nio.ByteBuffer r17) {
        /*
            Method dump skipped, instruction units count: 510
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: j0.v.w(java.nio.ByteBuffer):void");
    }

    public final boolean x() {
        p pVar = this.f7404t;
        return pVar != null && pVar.f7336j && AbstractC0370w.f5326a >= 23;
    }
}

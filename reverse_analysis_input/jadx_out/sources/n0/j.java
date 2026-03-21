package n0;

import F0.C0066m;
import a.AbstractC0149a;
import a0.C0186l;
import a0.C0190p;
import android.net.Uri;
import d0.AbstractC0360m;
import d0.C0363p;
import d0.C0368u;
import f0.C0417l;
import f0.InterfaceC0413h;
import java.io.EOFException;
import java.math.BigInteger;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import l1.C;
import m2.C0640G;
import m2.I;
import m2.b0;

/* JADX INFO: loaded from: classes.dex */
public final class j extends y0.l {

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public static final AtomicInteger f8789W = new AtomicInteger();

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final InterfaceC0413h f8790A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final C0417l f8791B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final C0686b f8792C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public final boolean f8793D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public final boolean f8794E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public final C0368u f8795F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public final C0687c f8796G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public final List f8797H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public final C0186l f8798I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public final T0.h f8799J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public final C0363p f8800K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public final boolean f8801L;
    public final boolean M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public C0686b f8802N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public q f8803O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public int f8804P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public boolean f8805Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    public volatile boolean f8806R;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public boolean f8807S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    public b0 f8808T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public boolean f8809U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public boolean f8810V;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final int f8811v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final int f8812w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final Uri f8813x;
    public final boolean y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final int f8814z;

    public j(C0687c c0687c, InterfaceC0413h interfaceC0413h, C0417l c0417l, C0190p c0190p, boolean z4, InterfaceC0413h interfaceC0413h2, C0417l c0417l2, boolean z5, Uri uri, List list, int i, Object obj, long j5, long j6, long j7, int i5, boolean z6, int i6, boolean z7, boolean z8, C0368u c0368u, C0186l c0186l, C0686b c0686b, T0.h hVar, C0363p c0363p, boolean z9, i0.j jVar) {
        super(interfaceC0413h, c0417l, c0190p, i, obj, j5, j6, j7);
        this.f8801L = z4;
        this.f8814z = i5;
        this.f8810V = z6;
        this.f8812w = i6;
        this.f8791B = c0417l2;
        this.f8790A = interfaceC0413h2;
        this.f8805Q = c0417l2 != null;
        this.M = z5;
        this.f8813x = uri;
        this.f8793D = z8;
        this.f8795F = c0368u;
        this.f8794E = z7;
        this.f8796G = c0687c;
        this.f8797H = list;
        this.f8798I = c0186l;
        this.f8792C = c0686b;
        this.f8799J = hVar;
        this.f8800K = c0363p;
        this.y = z9;
        C0640G c0640g = I.f8549m;
        this.f8808T = b0.f8583p;
        this.f8811v = f8789W.getAndIncrement();
    }

    public static byte[] d(String str) {
        if (AbstractC0149a.I(str).startsWith("0x")) {
            str = str.substring(2);
        }
        byte[] byteArray = new BigInteger(str, 16).toByteArray();
        byte[] bArr = new byte[16];
        int length = byteArray.length > 16 ? byteArray.length - 16 : 0;
        System.arraycopy(byteArray, length, bArr, (16 - byteArray.length) + length, byteArray.length - length);
        return bArr;
    }

    @Override // y0.l
    public final boolean b() {
        throw null;
    }

    public final void c(InterfaceC0413h interfaceC0413h, C0417l c0417l, boolean z4, boolean z5) {
        C0417l c0417lA;
        long j5;
        long j6;
        if (z4) {
            z = this.f8804P != 0;
            c0417lA = c0417l;
        } else {
            c0417lA = c0417l.a(this.f8804P);
        }
        try {
            C0066m c0066mH = h(interfaceC0413h, c0417lA, z5);
            if (z) {
                c0066mH.f(this.f8804P);
            }
            while (!this.f8806R) {
                try {
                    try {
                        if (this.f8802N.f8753a.d(c0066mH, C0686b.f8752f) != 0) {
                            break;
                        }
                    } catch (EOFException e5) {
                        if ((this.f10857o.f3417f & 16384) == 0) {
                            throw e5;
                        }
                        this.f8802N.f8753a.b(0L, 0L);
                        j5 = c0066mH.f799o;
                        j6 = c0417l.f5690e;
                    }
                } catch (Throwable th) {
                    this.f8804P = (int) (c0066mH.f799o - c0417l.f5690e);
                    throw th;
                }
            }
            j5 = c0066mH.f799o;
            j6 = c0417l.f5690e;
            this.f8804P = (int) (j5 - j6);
        } finally {
            Z1.f.g(interfaceC0413h);
        }
    }

    @Override // B0.o
    public final void e() {
        C0686b c0686b;
        this.f8803O.getClass();
        if (this.f8802N == null && (c0686b = this.f8792C) != null) {
            F0.q qVar = c0686b.f8753a;
            if ((qVar instanceof C) || (qVar instanceof Z0.m)) {
                this.f8802N = c0686b;
                this.f8805Q = false;
            }
        }
        if (this.f8805Q) {
            InterfaceC0413h interfaceC0413h = this.f8790A;
            interfaceC0413h.getClass();
            C0417l c0417l = this.f8791B;
            c0417l.getClass();
            c(interfaceC0413h, c0417l, this.M, false);
            this.f8804P = 0;
            this.f8805Q = false;
        }
        if (this.f8806R) {
            return;
        }
        if (!this.f8794E) {
            c(this.f10862t, this.f10855m, this.f8801L, true);
        }
        this.f8807S = !this.f8806R;
    }

    public final int f(int i) {
        AbstractC0360m.h(!this.y);
        if (i >= this.f8808T.size()) {
            return 0;
        }
        return ((Integer) this.f8808T.get(i)).intValue();
    }

    @Override // B0.o
    public final void g() {
        this.f8806R = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x0226  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x022a  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0276  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0278  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x027b  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0282  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x028a  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x028d  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x034c  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x034f  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0384  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x013a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final F0.C0066m h(f0.InterfaceC0413h r35, f0.C0417l r36, boolean r37) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 993
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: n0.j.h(f0.h, f0.l, boolean):F0.m");
    }
}

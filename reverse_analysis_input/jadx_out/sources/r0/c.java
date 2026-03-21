package r0;

import Q1.C;
import Z1.e;
import a0.C0155F;
import a0.C0190p;
import a0.InterfaceC0154E;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import d0.AbstractC0360m;
import d0.AbstractC0370w;
import h0.AbstractC0457h;
import h0.q0;
import java.util.ArrayList;
import x0.H;

/* JADX INFO: loaded from: classes.dex */
public final class c extends AbstractC0457h implements Handler.Callback {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final C0748a f9409C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public final InterfaceC0749b f9410D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public final Handler f9411E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public final O0.a f9412F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public C f9413G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public boolean f9414H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public boolean f9415I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public long f9416J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public C0155F f9417K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public long f9418L;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(InterfaceC0749b interfaceC0749b, Looper looper) {
        super(5);
        C0748a c0748a = C0748a.f9408a;
        interfaceC0749b.getClass();
        this.f9410D = interfaceC0749b;
        this.f9411E = looper == null ? null : new Handler(looper, this);
        this.f9409C = c0748a;
        this.f9412F = new O0.a(1);
        this.f9418L = -9223372036854775807L;
    }

    @Override // h0.o0, h0.q0
    public final String getName() {
        return "MetadataRenderer";
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (message.what != 1) {
            throw new IllegalStateException();
        }
        this.f9410D.onMetadata((C0155F) message.obj);
        return true;
    }

    @Override // h0.AbstractC0457h, h0.o0
    public final boolean isEnded() {
        return this.f9415I;
    }

    @Override // h0.o0
    public final boolean isReady() {
        return true;
    }

    @Override // h0.AbstractC0457h
    public final void j() {
        this.f9417K = null;
        this.f9413G = null;
        this.f9418L = -9223372036854775807L;
    }

    @Override // h0.AbstractC0457h
    public final void l(long j5, boolean z4) {
        this.f9417K = null;
        this.f9414H = false;
        this.f9415I = false;
    }

    @Override // h0.AbstractC0457h
    public final void q(C0190p[] c0190pArr, long j5, long j6, H h2) {
        this.f9413G = this.f9409C.a(c0190pArr[0]);
        C0155F c0155f = this.f9417K;
        if (c0155f != null) {
            long j7 = this.f9418L;
            long j8 = c0155f.f3212m;
            long j9 = (j7 + j8) - j6;
            if (j8 != j9) {
                c0155f = new C0155F(j9, c0155f.f3211l);
            }
            this.f9417K = c0155f;
        }
        this.f9418L = j6;
    }

    @Override // h0.o0
    public final void render(long j5, long j6) {
        boolean z4 = true;
        while (z4) {
            if (!this.f9414H && this.f9417K == null) {
                O0.a aVar = this.f9412F;
                aVar.f();
                e eVar = this.f6150n;
                eVar.c();
                int iR = r(eVar, aVar, 0);
                if (iR == -4) {
                    if (aVar.e(4)) {
                        this.f9414H = true;
                    } else if (aVar.f5789r >= this.f6159w) {
                        aVar.f1635u = this.f9416J;
                        aVar.k();
                        C c5 = this.f9413G;
                        int i = AbstractC0370w.f5326a;
                        C0155F c0155fM = c5.m(aVar);
                        if (c0155fM != null) {
                            ArrayList arrayList = new ArrayList(c0155fM.f3211l.length);
                            s(c0155fM, arrayList);
                            if (!arrayList.isEmpty()) {
                                this.f9417K = new C0155F(t(aVar.f5789r), (InterfaceC0154E[]) arrayList.toArray(new InterfaceC0154E[0]));
                            }
                        }
                    }
                } else if (iR == -5) {
                    C0190p c0190p = (C0190p) eVar.f3002n;
                    c0190p.getClass();
                    this.f9416J = c0190p.f3429s;
                }
            }
            C0155F c0155f = this.f9417K;
            if (c0155f == null || c0155f.f3212m > t(j5)) {
                z4 = false;
            } else {
                C0155F c0155f2 = this.f9417K;
                Handler handler = this.f9411E;
                if (handler != null) {
                    handler.obtainMessage(1, c0155f2).sendToTarget();
                } else {
                    this.f9410D.onMetadata(c0155f2);
                }
                this.f9417K = null;
                z4 = true;
            }
            if (this.f9414H && this.f9417K == null) {
                this.f9415I = true;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x003e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void s(a0.C0155F r6, java.util.ArrayList r7) {
        /*
            r5 = this;
            r0 = 0
        L1:
            a0.E[] r1 = r6.f3211l
            int r2 = r1.length
            if (r0 >= r2) goto L46
            r2 = r1[r0]
            a0.p r2 = r2.c()
            if (r2 == 0) goto L3e
            r0.a r3 = r5.f9409C
            boolean r4 = r3.b(r2)
            if (r4 == 0) goto L3e
            Q1.C r2 = r3.a(r2)
            r1 = r1[r0]
            byte[] r1 = r1.a()
            r1.getClass()
            O0.a r3 = r5.f9412F
            r3.f()
            int r4 = r1.length
            r3.j(r4)
            java.nio.ByteBuffer r4 = r3.f5787p
            r4.put(r1)
            r3.k()
            a0.F r1 = r2.m(r3)
            if (r1 == 0) goto L43
            r5.s(r1, r7)
            goto L43
        L3e:
            r1 = r1[r0]
            r7.add(r1)
        L43:
            int r0 = r0 + 1
            goto L1
        L46:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: r0.c.s(a0.F, java.util.ArrayList):void");
    }

    @Override // h0.q0
    public final int supportsFormat(C0190p c0190p) {
        if (this.f9409C.b(c0190p)) {
            return q0.e(c0190p.f3411L == 0 ? 4 : 2, 0, 0, 0);
        }
        return q0.e(0, 0, 0, 0);
    }

    public final long t(long j5) {
        AbstractC0360m.h(j5 != -9223372036854775807L);
        AbstractC0360m.h(this.f9418L != -9223372036854775807L);
        return j5 - this.f9418L;
    }
}

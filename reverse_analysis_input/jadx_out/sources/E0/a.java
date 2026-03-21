package E0;

import a0.C0190p;
import d0.AbstractC0370w;
import d0.C0363p;
import g0.e;
import h0.AbstractC0457h;
import h0.C0446E;
import h0.q0;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public final class a extends AbstractC0457h {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final e f632C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public final C0363p f633D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public C0446E f634E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public long f635F;

    public a() {
        super(6);
        this.f632C = new e(1);
        this.f633D = new C0363p();
    }

    @Override // h0.o0, h0.q0
    public final String getName() {
        return "CameraMotionRenderer";
    }

    @Override // h0.AbstractC0457h, h0.k0
    public final void handleMessage(int i, Object obj) {
        if (i == 8) {
            this.f634E = (C0446E) obj;
        }
    }

    @Override // h0.o0
    public final boolean isReady() {
        return true;
    }

    @Override // h0.AbstractC0457h
    public final void j() {
        C0446E c0446e = this.f634E;
        if (c0446e != null) {
            c0446e.b();
        }
    }

    @Override // h0.AbstractC0457h
    public final void l(long j5, boolean z4) {
        this.f635F = Long.MIN_VALUE;
        C0446E c0446e = this.f634E;
        if (c0446e != null) {
            c0446e.b();
        }
    }

    @Override // h0.o0
    public final void render(long j5, long j6) {
        float[] fArr;
        while (!hasReadStreamToEnd() && this.f635F < 100000 + j5) {
            e eVar = this.f632C;
            eVar.f();
            Z1.e eVar2 = this.f6150n;
            eVar2.c();
            if (r(eVar2, eVar, 0) != -4 || eVar.e(4)) {
                return;
            }
            long j7 = eVar.f5789r;
            this.f635F = j7;
            boolean z4 = j7 < this.f6159w;
            if (this.f634E != null && !z4) {
                eVar.k();
                ByteBuffer byteBuffer = eVar.f5787p;
                int i = AbstractC0370w.f5326a;
                if (byteBuffer.remaining() != 16) {
                    fArr = null;
                } else {
                    byte[] bArrArray = byteBuffer.array();
                    int iLimit = byteBuffer.limit();
                    C0363p c0363p = this.f633D;
                    c0363p.F(iLimit, bArrArray);
                    c0363p.H(byteBuffer.arrayOffset() + 4);
                    float[] fArr2 = new float[3];
                    for (int i5 = 0; i5 < 3; i5++) {
                        fArr2[i5] = Float.intBitsToFloat(c0363p.k());
                    }
                    fArr = fArr2;
                }
                if (fArr != null) {
                    this.f634E.a(this.f635F - this.f6158v, fArr);
                }
            }
        }
    }

    @Override // h0.q0
    public final int supportsFormat(C0190p c0190p) {
        return "application/x-camera-motion".equals(c0190p.f3424n) ? q0.e(4, 0, 0, 0) : q0.e(0, 0, 0, 0);
    }
}

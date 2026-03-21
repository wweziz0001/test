package m1;

import F0.C0066m;
import F0.K;
import F0.q;
import F0.r;
import F0.s;

/* JADX INFO: renamed from: m1.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0632d implements q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public s f8523a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public K f8524b;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public InterfaceC0630b f8527e;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f8525c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f8526d = -1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f8528f = -1;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f8529g = -1;

    @Override // F0.q
    public final void b(long j5, long j6) {
        this.f8525c = j5 == 0 ? 0 : 4;
        InterfaceC0630b interfaceC0630b = this.f8527e;
        if (interfaceC0630b != null) {
            interfaceC0630b.b(j6);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:60:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01b9  */
    @Override // F0.q
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int d(F0.r r25, F0.u r26) throws a0.C0157H, java.io.EOFException, java.io.InterruptedIOException {
        /*
            Method dump skipped, instruction units count: 578
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: m1.C0632d.d(F0.r, F0.u):int");
    }

    @Override // F0.q
    public final boolean e(r rVar) {
        return i4.a.l((C0066m) rVar);
    }

    @Override // F0.q
    public final void j(s sVar) {
        this.f8523a = sVar;
        this.f8524b = sVar.k(0, 1);
        sVar.j();
    }

    @Override // F0.q
    public final void release() {
    }
}

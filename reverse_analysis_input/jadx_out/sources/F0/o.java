package F0;

import a0.C0190p;
import a0.InterfaceC0182h;
import d0.C0363p;
import java.io.EOFException;

/* JADX INFO: loaded from: classes.dex */
public final class o implements K {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f813a = new byte[4096];

    @Override // F0.K
    public final void a(C0363p c0363p, int i, int i5) {
        c0363p.I(i);
    }

    @Override // F0.K
    public final int d(InterfaceC0182h interfaceC0182h, int i, boolean z4) throws EOFException {
        byte[] bArr = this.f813a;
        int i5 = interfaceC0182h.read(bArr, 0, Math.min(bArr.length, i));
        if (i5 != -1) {
            return i5;
        }
        if (z4) {
            return -1;
        }
        throw new EOFException();
    }

    @Override // F0.K
    public final void c(C0190p c0190p) {
    }

    @Override // F0.K
    public final void b(long j5, int i, int i5, int i6, J j6) {
    }
}

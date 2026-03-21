package n0;

import java.util.Arrays;
import y0.AbstractC0997e;

/* JADX INFO: renamed from: n0.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0689e extends AbstractC0997e {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public byte[] f8761u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public volatile boolean f8762v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public byte[] f8763w;

    @Override // B0.o
    public final void e() {
        try {
            this.f10862t.p(this.f10855m);
            int i = 0;
            int i5 = 0;
            while (i != -1 && !this.f8762v) {
                byte[] bArr = this.f8761u;
                if (bArr.length < i5 + 16384) {
                    this.f8761u = Arrays.copyOf(bArr, bArr.length + 16384);
                }
                i = this.f10862t.read(this.f8761u, i5, 16384);
                if (i != -1) {
                    i5 += i;
                }
            }
            if (!this.f8762v) {
                this.f8763w = Arrays.copyOf(this.f8761u, i5);
            }
            Z1.f.g(this.f10862t);
        } catch (Throwable th) {
            Z1.f.g(this.f10862t);
            throw th;
        }
    }

    @Override // B0.o
    public final void g() {
        this.f8762v = true;
    }
}

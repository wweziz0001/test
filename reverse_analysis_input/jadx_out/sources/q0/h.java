package q0;

import d0.AbstractC0360m;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public final class h extends g0.e {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public long f9281u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f9282v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f9283w;

    @Override // g0.e
    public final void f() {
        super.f();
        this.f9282v = 0;
    }

    public final boolean l(g0.e eVar) {
        ByteBuffer byteBuffer;
        AbstractC0360m.c(!eVar.e(1073741824));
        AbstractC0360m.c(!eVar.e(268435456));
        AbstractC0360m.c(!eVar.e(4));
        if (m()) {
            if (this.f9282v >= this.f9283w) {
                return false;
            }
            ByteBuffer byteBuffer2 = eVar.f5787p;
            if (byteBuffer2 != null && (byteBuffer = this.f5787p) != null) {
                if (byteBuffer2.remaining() + byteBuffer.position() > 3072000) {
                    return false;
                }
            }
        }
        int i = this.f9282v;
        this.f9282v = i + 1;
        if (i == 0) {
            this.f5789r = eVar.f5789r;
            if (eVar.e(1)) {
                this.f5494m = 1;
            }
        }
        ByteBuffer byteBuffer3 = eVar.f5787p;
        if (byteBuffer3 != null) {
            j(byteBuffer3.remaining());
            this.f5787p.put(byteBuffer3);
        }
        this.f9281u = eVar.f5789r;
        return true;
    }

    public final boolean m() {
        return this.f9282v > 0;
    }
}

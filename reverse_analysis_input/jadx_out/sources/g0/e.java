package g0;

import Q1.C0118a;
import a0.AbstractC0151B;
import a0.C0190p;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public class e extends e0.d {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public C0190p f5785n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final C0118a f5786o = new C0118a();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public ByteBuffer f5787p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f5788q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public long f5789r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public ByteBuffer f5790s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final int f5791t;

    static {
        AbstractC0151B.a("media3.decoder");
    }

    public e(int i) {
        this.f5791t = i;
    }

    public void f() {
        this.f5494m = 0;
        ByteBuffer byteBuffer = this.f5787p;
        if (byteBuffer != null) {
            byteBuffer.clear();
        }
        ByteBuffer byteBuffer2 = this.f5790s;
        if (byteBuffer2 != null) {
            byteBuffer2.clear();
        }
        this.f5788q = false;
    }

    public final ByteBuffer i(int i) {
        int i5 = this.f5791t;
        if (i5 == 1) {
            return ByteBuffer.allocate(i);
        }
        if (i5 == 2) {
            return ByteBuffer.allocateDirect(i);
        }
        ByteBuffer byteBuffer = this.f5787p;
        throw new d("Buffer too small (" + (byteBuffer == null ? 0 : byteBuffer.capacity()) + " < " + i + ")");
    }

    public final void j(int i) {
        ByteBuffer byteBuffer = this.f5787p;
        if (byteBuffer == null) {
            this.f5787p = i(i);
            return;
        }
        int iCapacity = byteBuffer.capacity();
        int iPosition = byteBuffer.position();
        int i5 = i + iPosition;
        if (iCapacity >= i5) {
            this.f5787p = byteBuffer;
            return;
        }
        ByteBuffer byteBufferI = i(i5);
        byteBufferI.order(byteBuffer.order());
        if (iPosition > 0) {
            byteBuffer.flip();
            byteBufferI.put(byteBuffer);
        }
        this.f5787p = byteBufferI;
    }

    public final void k() {
        ByteBuffer byteBuffer = this.f5787p;
        if (byteBuffer != null) {
            byteBuffer.flip();
        }
        ByteBuffer byteBuffer2 = this.f5790s;
        if (byteBuffer2 != null) {
            byteBuffer2.flip();
        }
    }
}

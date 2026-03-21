package b0;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ShortBuffer;

/* JADX INFO: renamed from: b0.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0303g implements InterfaceC0300d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f4864b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f4865c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f4866d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public C0298b f4867e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public C0298b f4868f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public C0298b f4869g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public C0298b f4870h;
    public boolean i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public C0302f f4871j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public ByteBuffer f4872k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public ShortBuffer f4873l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public ByteBuffer f4874m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public long f4875n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public long f4876o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f4877p;

    @Override // b0.InterfaceC0300d
    public final boolean a() {
        return this.f4868f.f4830a != -1 && (Math.abs(this.f4865c - 1.0f) >= 1.0E-4f || Math.abs(this.f4866d - 1.0f) >= 1.0E-4f || this.f4868f.f4830a != this.f4867e.f4830a);
    }

    @Override // b0.InterfaceC0300d
    public final ByteBuffer b() {
        C0302f c0302f = this.f4871j;
        if (c0302f != null) {
            int i = c0302f.f4853m;
            int i5 = c0302f.f4843b;
            int i6 = i * i5 * 2;
            if (i6 > 0) {
                if (this.f4872k.capacity() < i6) {
                    ByteBuffer byteBufferOrder = ByteBuffer.allocateDirect(i6).order(ByteOrder.nativeOrder());
                    this.f4872k = byteBufferOrder;
                    this.f4873l = byteBufferOrder.asShortBuffer();
                } else {
                    this.f4872k.clear();
                    this.f4873l.clear();
                }
                ShortBuffer shortBuffer = this.f4873l;
                int iMin = Math.min(shortBuffer.remaining() / i5, c0302f.f4853m);
                int i7 = iMin * i5;
                shortBuffer.put(c0302f.f4852l, 0, i7);
                int i8 = c0302f.f4853m - iMin;
                c0302f.f4853m = i8;
                short[] sArr = c0302f.f4852l;
                System.arraycopy(sArr, i7, sArr, 0, i8 * i5);
                this.f4876o += (long) i6;
                this.f4872k.limit(i6);
                this.f4874m = this.f4872k;
            }
        }
        ByteBuffer byteBuffer = this.f4874m;
        this.f4874m = InterfaceC0300d.f4834a;
        return byteBuffer;
    }

    @Override // b0.InterfaceC0300d
    public final void c() {
        C0302f c0302f = this.f4871j;
        if (c0302f != null) {
            int i = c0302f.f4851k;
            float f2 = c0302f.f4844c;
            float f5 = c0302f.f4845d;
            double d5 = f2 / f5;
            double d6 = c0302f.f4846e * f5;
            int i5 = c0302f.f4858r;
            int i6 = c0302f.f4853m + ((int) ((((((((double) (i - i5)) / d5) + ((double) i5)) + c0302f.f4863w) + ((double) c0302f.f4855o)) / d6) + 0.5d));
            c0302f.f4863w = 0.0d;
            short[] sArr = c0302f.f4850j;
            int i7 = c0302f.f4849h * 2;
            c0302f.f4850j = c0302f.c(sArr, i, i7 + i);
            int i8 = 0;
            while (true) {
                int i9 = c0302f.f4843b;
                if (i8 >= i7 * i9) {
                    break;
                }
                c0302f.f4850j[(i9 * i) + i8] = 0;
                i8++;
            }
            c0302f.f4851k = i7 + c0302f.f4851k;
            c0302f.f();
            if (c0302f.f4853m > i6) {
                c0302f.f4853m = i6;
            }
            c0302f.f4851k = 0;
            c0302f.f4858r = 0;
            c0302f.f4855o = 0;
        }
        this.f4877p = true;
    }

    @Override // b0.InterfaceC0300d
    public final void d(ByteBuffer byteBuffer) {
        if (byteBuffer.hasRemaining()) {
            C0302f c0302f = this.f4871j;
            c0302f.getClass();
            ShortBuffer shortBufferAsShortBuffer = byteBuffer.asShortBuffer();
            int iRemaining = byteBuffer.remaining();
            this.f4875n += (long) iRemaining;
            int iRemaining2 = shortBufferAsShortBuffer.remaining();
            int i = c0302f.f4843b;
            int i5 = iRemaining2 / i;
            short[] sArrC = c0302f.c(c0302f.f4850j, c0302f.f4851k, i5);
            c0302f.f4850j = sArrC;
            shortBufferAsShortBuffer.get(sArrC, c0302f.f4851k * i, ((i5 * i) * 2) / 2);
            c0302f.f4851k += i5;
            c0302f.f();
            byteBuffer.position(byteBuffer.position() + iRemaining);
        }
    }

    @Override // b0.InterfaceC0300d
    public final C0298b e(C0298b c0298b) throws C0299c {
        if (c0298b.f4832c != 2) {
            throw new C0299c(c0298b);
        }
        int i = this.f4864b;
        if (i == -1) {
            i = c0298b.f4830a;
        }
        this.f4867e = c0298b;
        C0298b c0298b2 = new C0298b(i, c0298b.f4831b, 2);
        this.f4868f = c0298b2;
        this.i = true;
        return c0298b2;
    }

    @Override // b0.InterfaceC0300d
    public final void flush() {
        if (a()) {
            C0298b c0298b = this.f4867e;
            this.f4869g = c0298b;
            C0298b c0298b2 = this.f4868f;
            this.f4870h = c0298b2;
            if (this.i) {
                this.f4871j = new C0302f(c0298b.f4830a, c0298b.f4831b, this.f4865c, this.f4866d, c0298b2.f4830a);
            } else {
                C0302f c0302f = this.f4871j;
                if (c0302f != null) {
                    c0302f.f4851k = 0;
                    c0302f.f4853m = 0;
                    c0302f.f4855o = 0;
                    c0302f.f4856p = 0;
                    c0302f.f4857q = 0;
                    c0302f.f4858r = 0;
                    c0302f.f4859s = 0;
                    c0302f.f4860t = 0;
                    c0302f.f4861u = 0;
                    c0302f.f4862v = 0;
                    c0302f.f4863w = 0.0d;
                }
            }
        }
        this.f4874m = InterfaceC0300d.f4834a;
        this.f4875n = 0L;
        this.f4876o = 0L;
        this.f4877p = false;
    }

    @Override // b0.InterfaceC0300d
    public final boolean isEnded() {
        C0302f c0302f;
        return this.f4877p && ((c0302f = this.f4871j) == null || (c0302f.f4853m * c0302f.f4843b) * 2 == 0);
    }

    @Override // b0.InterfaceC0300d
    public final void reset() {
        this.f4865c = 1.0f;
        this.f4866d = 1.0f;
        C0298b c0298b = C0298b.f4829e;
        this.f4867e = c0298b;
        this.f4868f = c0298b;
        this.f4869g = c0298b;
        this.f4870h = c0298b;
        ByteBuffer byteBuffer = InterfaceC0300d.f4834a;
        this.f4872k = byteBuffer;
        this.f4873l = byteBuffer.asShortBuffer();
        this.f4874m = byteBuffer;
        this.f4864b = -1;
        this.i = false;
        this.f4871j = null;
        this.f4875n = 0L;
        this.f4876o = 0L;
        this.f4877p = false;
    }
}

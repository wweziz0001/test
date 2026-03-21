package b0;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: renamed from: b0.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0301e implements InterfaceC0300d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public C0298b f4835b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public C0298b f4836c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public C0298b f4837d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public C0298b f4838e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ByteBuffer f4839f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ByteBuffer f4840g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f4841h;

    public AbstractC0301e() {
        ByteBuffer byteBuffer = InterfaceC0300d.f4834a;
        this.f4839f = byteBuffer;
        this.f4840g = byteBuffer;
        C0298b c0298b = C0298b.f4829e;
        this.f4837d = c0298b;
        this.f4838e = c0298b;
        this.f4835b = c0298b;
        this.f4836c = c0298b;
    }

    @Override // b0.InterfaceC0300d
    public boolean a() {
        return this.f4838e != C0298b.f4829e;
    }

    @Override // b0.InterfaceC0300d
    public ByteBuffer b() {
        ByteBuffer byteBuffer = this.f4840g;
        this.f4840g = InterfaceC0300d.f4834a;
        return byteBuffer;
    }

    @Override // b0.InterfaceC0300d
    public final void c() {
        this.f4841h = true;
        h();
    }

    @Override // b0.InterfaceC0300d
    public final C0298b e(C0298b c0298b) {
        this.f4837d = c0298b;
        this.f4838e = f(c0298b);
        return a() ? this.f4838e : C0298b.f4829e;
    }

    public abstract C0298b f(C0298b c0298b);

    @Override // b0.InterfaceC0300d
    public final void flush() {
        this.f4840g = InterfaceC0300d.f4834a;
        this.f4841h = false;
        this.f4835b = this.f4837d;
        this.f4836c = this.f4838e;
        g();
    }

    @Override // b0.InterfaceC0300d
    public boolean isEnded() {
        return this.f4841h && this.f4840g == InterfaceC0300d.f4834a;
    }

    public final ByteBuffer j(int i) {
        if (this.f4839f.capacity() < i) {
            this.f4839f = ByteBuffer.allocateDirect(i).order(ByteOrder.nativeOrder());
        } else {
            this.f4839f.clear();
        }
        ByteBuffer byteBuffer = this.f4839f;
        this.f4840g = byteBuffer;
        return byteBuffer;
    }

    @Override // b0.InterfaceC0300d
    public final void reset() {
        flush();
        this.f4839f = InterfaceC0300d.f4834a;
        C0298b c0298b = C0298b.f4829e;
        this.f4837d = c0298b;
        this.f4838e = c0298b;
        this.f4835b = c0298b;
        this.f4836c = c0298b;
        i();
    }

    public void g() {
    }

    public void h() {
    }

    public void i() {
    }
}

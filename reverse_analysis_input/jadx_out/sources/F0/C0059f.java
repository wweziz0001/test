package F0;

/* JADX INFO: renamed from: F0.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0059f implements E {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC0061h f765a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f766b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f767c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f768d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f769e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f770f;

    public C0059f(InterfaceC0061h interfaceC0061h, long j5, long j6, long j7, long j8, long j9) {
        this.f765a = interfaceC0061h;
        this.f766b = j5;
        this.f767c = j6;
        this.f768d = j7;
        this.f769e = j8;
        this.f770f = j9;
    }

    @Override // F0.E
    public final boolean c() {
        return true;
    }

    @Override // F0.E
    public final D g(long j5) {
        F f2 = new F(j5, C0060g.a(this.f765a.b(j5), 0L, this.f767c, this.f768d, this.f769e, this.f770f));
        return new D(f2, f2);
    }

    @Override // F0.E
    public final long i() {
        return this.f766b;
    }
}

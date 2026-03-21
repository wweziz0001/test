package J0;

import F0.G;
import F0.q;
import F0.r;
import F0.s;
import F0.u;

/* JADX INFO: loaded from: classes.dex */
public final class a implements q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1093a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final q f1094b;

    public a(int i, byte b4) {
        this.f1093a = i;
        switch (i) {
            case 1:
                this.f1094b = new G(35152, "image/png", 2);
                break;
            default:
                this.f1094b = new G(16973, "image/bmp", 2);
                break;
        }
    }

    @Override // F0.q
    public final void b(long j5, long j6) {
        switch (this.f1093a) {
            case 0:
                ((G) this.f1094b).b(j5, j6);
                break;
            case 1:
                ((G) this.f1094b).b(j5, j6);
                break;
            default:
                this.f1094b.b(j5, j6);
                break;
        }
    }

    @Override // F0.q
    public final int d(r rVar, u uVar) {
        switch (this.f1093a) {
            case 0:
                return ((G) this.f1094b).d(rVar, uVar);
            case 1:
                return ((G) this.f1094b).d(rVar, uVar);
            default:
                return this.f1094b.d(rVar, uVar);
        }
    }

    @Override // F0.q
    public final boolean e(r rVar) {
        switch (this.f1093a) {
            case 0:
                return ((G) this.f1094b).e(rVar);
            case 1:
                return ((G) this.f1094b).e(rVar);
            default:
                return this.f1094b.e(rVar);
        }
    }

    @Override // F0.q
    public final void j(s sVar) {
        switch (this.f1093a) {
            case 0:
                ((G) this.f1094b).j(sVar);
                break;
            case 1:
                ((G) this.f1094b).j(sVar);
                break;
            default:
                this.f1094b.j(sVar);
                break;
        }
    }

    @Override // F0.q
    public final void release() {
        switch (this.f1093a) {
            case 0:
            case 1:
                break;
            default:
                this.f1094b.release();
                break;
        }
    }

    public a(int i) {
        this.f1093a = 2;
        if ((i & 1) != 0) {
            this.f1094b = new G(65496, "image/jpeg", 2);
        } else {
            this.f1094b = new N0.a();
        }
    }

    private final void a() {
    }

    private final void c() {
    }
}

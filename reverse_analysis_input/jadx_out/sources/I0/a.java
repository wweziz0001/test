package I0;

import F0.C0066m;
import F0.G;
import F0.q;
import F0.r;
import F0.s;
import F0.u;
import d0.C0363p;
import java.io.EOFException;
import java.io.InterruptedIOException;

/* JADX INFO: loaded from: classes.dex */
public final class a implements q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1014a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C0363p f1015b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final G f1016c;

    public a(int i) {
        this.f1014a = i;
        switch (i) {
            case 1:
                this.f1015b = new C0363p(4);
                this.f1016c = new G(-1, "image/heif", -1);
                break;
            case 2:
                this.f1015b = new C0363p(4);
                this.f1016c = new G(-1, "image/webp", -1);
                break;
            default:
                this.f1015b = new C0363p(4);
                this.f1016c = new G(-1, "image/avif", -1);
                break;
        }
    }

    @Override // F0.q
    public final void b(long j5, long j6) {
        switch (this.f1014a) {
            case 0:
                this.f1016c.b(j5, j6);
                break;
            case 1:
                this.f1016c.b(j5, j6);
                break;
            default:
                this.f1016c.b(j5, j6);
                break;
        }
    }

    @Override // F0.q
    public final int d(r rVar, u uVar) {
        switch (this.f1014a) {
        }
        return this.f1016c.d(rVar, uVar);
    }

    @Override // F0.q
    public final boolean e(r rVar) throws EOFException, InterruptedIOException {
        switch (this.f1014a) {
            case 0:
                C0066m c0066m = (C0066m) rVar;
                c0066m.a(4, false);
                C0363p c0363p = this.f1015b;
                c0363p.E(4);
                c0066m.t(c0363p.f5313a, 0, 4, false);
                if (c0363p.x() == 1718909296) {
                    c0363p.E(4);
                    c0066m.t(c0363p.f5313a, 0, 4, false);
                    if (c0363p.x() == 1635150182) {
                    }
                }
                break;
            case 1:
                C0066m c0066m2 = (C0066m) rVar;
                c0066m2.a(4, false);
                C0363p c0363p2 = this.f1015b;
                c0363p2.E(4);
                c0066m2.t(c0363p2.f5313a, 0, 4, false);
                if (c0363p2.x() == 1718909296) {
                    c0363p2.E(4);
                    c0066m2.t(c0363p2.f5313a, 0, 4, false);
                    if (c0363p2.x() == 1751476579) {
                    }
                }
                break;
            default:
                C0363p c0363p3 = this.f1015b;
                c0363p3.E(4);
                C0066m c0066m3 = (C0066m) rVar;
                c0066m3.t(c0363p3.f5313a, 0, 4, false);
                if (c0363p3.x() == 1380533830) {
                    c0066m3.a(4, false);
                    c0363p3.E(4);
                    c0066m3.t(c0363p3.f5313a, 0, 4, false);
                    if (c0363p3.x() == 1464156752) {
                    }
                }
                break;
        }
        return false;
    }

    @Override // F0.q
    public final void j(s sVar) {
        switch (this.f1014a) {
            case 0:
                this.f1016c.j(sVar);
                break;
            case 1:
                this.f1016c.j(sVar);
                break;
            default:
                this.f1016c.j(sVar);
                break;
        }
    }

    @Override // F0.q
    public final void release() {
        int i = this.f1014a;
    }

    private final void a() {
    }

    private final void c() {
    }

    private final void f() {
    }
}

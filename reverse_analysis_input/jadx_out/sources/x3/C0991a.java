package x3;

import a0.C0190p;
import a0.e0;
import h0.C0448G;
import java.io.IOException;
import java.util.Objects;
import m.B0;
import v3.AbstractC0920a;

/* JADX INFO: renamed from: x3.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0991a extends AbstractC0920a {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f10829p;

    @Override // v3.AbstractC0920a
    public final void a() throws IOException {
        C0448G c0448g = (C0448G) this.f10361n;
        c0448g.d0();
        e0 e0Var = c0448g.f5941b0;
        int i = e0Var.f3334a;
        int iA = 1;
        int i5 = e0Var.f3335b;
        if (i != 0 && i5 != 0 && !this.f10829p) {
            c0448g.d0();
            C0190p c0190p = c0448g.M;
            Objects.requireNonNull(c0190p);
            try {
                iA = B0.a(c0190p.f3434x);
            } catch (IllegalArgumentException unused) {
            }
        }
        this.f10362o.a(i, i5, c0448g.B(), B0.g(iA));
    }
}

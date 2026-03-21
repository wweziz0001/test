package w3;

import a0.C0190p;
import h0.C0448G;
import java.io.IOException;
import java.util.Objects;
import m.B0;
import v3.AbstractC0920a;

/* JADX INFO: renamed from: w3.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0950c extends AbstractC0920a {
    @Override // v3.AbstractC0920a
    public final void a() throws IOException {
        int i;
        C0448G c0448g = (C0448G) this.f10361n;
        c0448g.d0();
        C0190p c0190p = c0448g.M;
        Objects.requireNonNull(c0190p);
        int iA = B0.a(c0190p.f3434x);
        int i5 = c0190p.f3431u;
        int i6 = c0190p.f3432v;
        if (iA == 2 || iA == 4) {
            iA = B0.a(0);
            i = i5;
            i5 = i6;
        } else {
            i = i6;
        }
        this.f10362o.a(i5, i, c0448g.B(), B0.g(iA));
    }
}

package androidx.activity;

import androidx.fragment.app.D;

/* JADX INFO: loaded from: classes.dex */
public final class v implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final D f3772a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ x f3773b;

    public v(x xVar, D d5) {
        N3.h.e(d5, "onBackPressedCallback");
        this.f3773b = xVar;
        this.f3772a = d5;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [M3.a, N3.g] */
    @Override // androidx.activity.c
    public final void cancel() {
        x xVar = this.f3773b;
        C3.d dVar = xVar.f3776b;
        D d5 = this.f3772a;
        dVar.remove(d5);
        if (N3.h.a(xVar.f3777c, d5)) {
            d5.a();
            xVar.f3777c = null;
        }
        d5.f4226b.remove(this);
        ?? r02 = d5.f4227c;
        if (r02 != 0) {
            r02.d();
        }
        d5.f4227c = null;
    }
}

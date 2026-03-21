package androidx.fragment.app;

import android.view.View;

/* JADX INFO: renamed from: androidx.fragment.app.p, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0249p extends Z1.f {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ r f4398q;

    public C0249p(r rVar) {
        super(14);
        this.f4398q = rVar;
    }

    @Override // Z1.f
    public final View D(int i) {
        r rVar = this.f4398q;
        io.flutter.embedding.android.D d5 = rVar.f4425Q;
        if (d5 != null) {
            return d5.findViewById(i);
        }
        throw new IllegalStateException("Fragment " + rVar + " does not have a view");
    }

    @Override // Z1.f
    public final boolean E() {
        return this.f4398q.f4425Q != null;
    }
}

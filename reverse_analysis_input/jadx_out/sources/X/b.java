package X;

import androidx.lifecycle.T;
import q.C0740j;

/* JADX INFO: loaded from: classes.dex */
public final class b extends T {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final A0.b f2483e = new A0.b(28);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C0740j f2484d = new C0740j();

    @Override // androidx.lifecycle.T
    public final void b() {
        C0740j c0740j = this.f2484d;
        int i = c0740j.f9241n;
        if (i > 0) {
            c0740j.f9240m[0].getClass();
            throw new ClassCastException();
        }
        Object[] objArr = c0740j.f9240m;
        for (int i5 = 0; i5 < i; i5++) {
            objArr[i5] = null;
        }
        c0740j.f9241n = 0;
    }
}

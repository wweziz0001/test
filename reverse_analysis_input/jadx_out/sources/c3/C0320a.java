package c3;

import a0.C0200z;
import j3.C0524a;
import j3.b;
import n3.C0707q;

/* JADX INFO: renamed from: c3.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0320a implements b {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public C0707q f5068l;

    @Override // j3.b
    public final void onAttachedToEngine(C0524a c0524a) {
        C0707q c0707q = new C0707q(c0524a.f7455c, "sqlite3_flutter_libs");
        this.f5068l = c0707q;
        c0707q.b(new C0200z(9));
    }

    @Override // j3.b
    public final void onDetachedFromEngine(C0524a c0524a) {
        C0707q c0707q = this.f5068l;
        if (c0707q != null) {
            c0707q.b(null);
            this.f5068l = null;
        }
    }
}

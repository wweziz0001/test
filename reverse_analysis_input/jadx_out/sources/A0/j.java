package A0;

import a0.C0170V;
import h0.q0;

/* JADX INFO: loaded from: classes.dex */
public final class j extends s implements Comparable {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final int f98p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final int f99q;

    public j(int i, C0170V c0170v, int i5, m mVar, int i6) {
        super(i, c0170v, i5);
        this.f98p = q0.g(i6, mVar.f116w) ? 1 : 0;
        this.f99q = this.f136o.b();
    }

    @Override // A0.s
    public final int a() {
        return this.f98p;
    }

    @Override // A0.s
    public final /* bridge */ /* synthetic */ boolean b(s sVar) {
        return false;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return Integer.compare(this.f99q, ((j) obj).f99q);
    }
}

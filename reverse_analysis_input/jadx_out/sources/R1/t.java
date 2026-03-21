package R1;

import Q1.z;
import a.AbstractC0149a;

/* JADX INFO: loaded from: classes.dex */
public final class t extends N3.i implements M3.a {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ z f1932m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ q f1933n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ String f1934o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ Z1.c f1935p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(z zVar, q qVar, String str, Z1.c cVar) {
        super(0);
        this.f1932m = zVar;
        this.f1933n = qVar;
        this.f1934o = str;
        this.f1935p = cVar;
    }

    @Override // M3.a
    public final Object d() {
        new a2.f(new l(this.f1933n, this.f1934o, 2, AbstractC0149a.y(this.f1932m)), this.f1935p).run();
        return B3.g.f275a;
    }
}

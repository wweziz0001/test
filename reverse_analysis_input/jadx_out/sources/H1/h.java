package H1;

import M3.l;
import b3.AbstractC0307a;

/* JADX INFO: loaded from: classes.dex */
public final class h extends g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f972a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f973b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a f974c;

    public h(Object obj, int i, a aVar) {
        N3.h.e(obj, "value");
        AbstractC0307a.r("verificationMode", i);
        this.f972a = obj;
        this.f973b = i;
        this.f974c = aVar;
    }

    @Override // H1.g
    public final Object a() {
        return this.f972a;
    }

    @Override // H1.g
    public final g d(String str, l lVar) {
        Object obj = this.f972a;
        return ((Boolean) lVar.c(obj)).booleanValue() ? this : new f(obj, str, this.f974c, this.f973b);
    }
}

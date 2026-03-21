package n0;

import java.util.List;
import y0.AbstractC0994b;

/* JADX INFO: loaded from: classes.dex */
public final class f extends AbstractC0994b {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final List f8764o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final long f8765p;

    public f(long j5, List list) {
        super(0L, list.size() - 1);
        this.f8765p = j5;
        this.f8764o = list;
    }

    @Override // y0.m
    public final long a() {
        b();
        o0.g gVar = (o0.g) this.f8764o.get((int) this.f10836n);
        return this.f8765p + gVar.f9003p + gVar.f9001n;
    }

    @Override // y0.m
    public final long g() {
        b();
        return this.f8765p + ((o0.g) this.f8764o.get((int) this.f10836n)).f9003p;
    }
}

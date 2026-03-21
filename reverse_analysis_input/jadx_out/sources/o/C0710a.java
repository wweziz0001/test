package o;

import java.util.HashMap;

/* JADX INFO: renamed from: o.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0710a extends C0715f {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final HashMap f8950p = new HashMap();

    @Override // o.C0715f
    public final C0712c f(Object obj) {
        return (C0712c) this.f8950p.get(obj);
    }

    @Override // o.C0715f
    public final Object g(Object obj) {
        Object objG = super.g(obj);
        this.f8950p.remove(obj);
        return objG;
    }
}

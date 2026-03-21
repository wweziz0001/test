package U3;

import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class c implements T3.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f2294a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f2295b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f2296c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final k f2297d;

    public c(String str, int i, int i5, k kVar) {
        this.f2294a = str;
        this.f2295b = i;
        this.f2296c = i5;
        this.f2297d = kVar;
    }

    @Override // T3.b
    public final Iterator iterator() {
        return new b(this);
    }
}

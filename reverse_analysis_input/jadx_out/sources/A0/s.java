package A0;

import a0.C0170V;
import a0.C0190p;

/* JADX INFO: loaded from: classes.dex */
public abstract class s {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f133l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final C0170V f134m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final int f135n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final C0190p f136o;

    public s(int i, C0170V c0170v, int i5) {
        this.f133l = i;
        this.f134m = c0170v;
        this.f135n = i5;
        this.f136o = c0170v.f3264d[i5];
    }

    public abstract int a();

    public abstract boolean b(s sVar);
}

package u1;

import N3.h;

/* JADX INFO: renamed from: u1.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0891c implements Comparable {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f10239l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final int f10240m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final String f10241n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final String f10242o;

    public C0891c(int i, int i5, String str, String str2) {
        this.f10239l = i;
        this.f10240m = i5;
        this.f10241n = str;
        this.f10242o = str2;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        C0891c c0891c = (C0891c) obj;
        h.e(c0891c, "other");
        int i = this.f10239l - c0891c.f10239l;
        return i == 0 ? this.f10240m - c0891c.f10240m : i;
    }
}

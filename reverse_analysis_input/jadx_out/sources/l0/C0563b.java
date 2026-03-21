package l0;

import java.util.Arrays;

/* JADX INFO: renamed from: l0.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0563b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f7818a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f7819b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f7820c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f7821d;

    public C0563b(int i, int i5, String str, String str2) {
        this.f7818a = str;
        this.f7819b = str2;
        this.f7820c = i;
        this.f7821d = i5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0563b)) {
            return false;
        }
        C0563b c0563b = (C0563b) obj;
        return this.f7820c == c0563b.f7820c && this.f7821d == c0563b.f7821d && i4.a.v(this.f7818a, c0563b.f7818a) && i4.a.v(this.f7819b, c0563b.f7819b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f7818a, this.f7819b, Integer.valueOf(this.f7820c), Integer.valueOf(this.f7821d)});
    }
}

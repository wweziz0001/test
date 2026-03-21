package w;

import android.graphics.Insets;

/* JADX INFO: renamed from: w.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0939c {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final C0939c f10401e = new C0939c(0, 0, 0, 0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f10402a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f10403b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f10404c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f10405d;

    public C0939c(int i, int i5, int i6, int i7) {
        this.f10402a = i;
        this.f10403b = i5;
        this.f10404c = i6;
        this.f10405d = i7;
    }

    public static C0939c a(int i, int i5, int i6, int i7) {
        return (i == 0 && i5 == 0 && i6 == 0 && i7 == 0) ? f10401e : new C0939c(i, i5, i6, i7);
    }

    public final Insets b() {
        return AbstractC0938b.a(this.f10402a, this.f10403b, this.f10404c, this.f10405d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0939c.class != obj.getClass()) {
            return false;
        }
        C0939c c0939c = (C0939c) obj;
        return this.f10405d == c0939c.f10405d && this.f10402a == c0939c.f10402a && this.f10404c == c0939c.f10404c && this.f10403b == c0939c.f10403b;
    }

    public final int hashCode() {
        return (((((this.f10402a * 31) + this.f10403b) * 31) + this.f10404c) * 31) + this.f10405d;
    }

    public final String toString() {
        return "Insets{left=" + this.f10402a + ", top=" + this.f10403b + ", right=" + this.f10404c + ", bottom=" + this.f10405d + '}';
    }
}

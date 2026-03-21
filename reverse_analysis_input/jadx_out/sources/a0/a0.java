package a0;

import d0.AbstractC0360m;
import d0.AbstractC0370w;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f3311a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C0170V f3312b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f3313c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int[] f3314d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean[] f3315e;

    static {
        AbstractC0370w.G(0);
        AbstractC0370w.G(1);
        AbstractC0370w.G(3);
        AbstractC0370w.G(4);
    }

    public a0(C0170V c0170v, boolean z4, int[] iArr, boolean[] zArr) {
        int i = c0170v.f3261a;
        this.f3311a = i;
        boolean z5 = false;
        AbstractC0360m.c(i == iArr.length && i == zArr.length);
        this.f3312b = c0170v;
        if (z4 && i > 1) {
            z5 = true;
        }
        this.f3313c = z5;
        this.f3314d = (int[]) iArr.clone();
        this.f3315e = (boolean[]) zArr.clone();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || a0.class != obj.getClass()) {
            return false;
        }
        a0 a0Var = (a0) obj;
        return this.f3313c == a0Var.f3313c && this.f3312b.equals(a0Var.f3312b) && Arrays.equals(this.f3314d, a0Var.f3314d) && Arrays.equals(this.f3315e, a0Var.f3315e);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f3315e) + ((Arrays.hashCode(this.f3314d) + (((this.f3312b.hashCode() * 31) + (this.f3313c ? 1 : 0)) * 31)) * 31);
    }
}

package t0;

import a0.C0190p;
import m2.g0;

/* JADX INFO: renamed from: t0.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0853j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f9902a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f9903b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C0190p f9904c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final g0 f9905d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f9906e;

    public C0853j(C0190p c0190p, int i, int i5, g0 g0Var, String str) {
        this.f9902a = i;
        this.f9903b = i5;
        this.f9904c = c0190p;
        this.f9905d = g0.a(g0Var);
        this.f9906e = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0853j.class != obj.getClass()) {
            return false;
        }
        C0853j c0853j = (C0853j) obj;
        if (this.f9902a == c0853j.f9902a && this.f9903b == c0853j.f9903b && this.f9904c.equals(c0853j.f9904c)) {
            g0 g0Var = this.f9905d;
            g0Var.getClass();
            if (m2.r.h(g0Var, c0853j.f9905d) && this.f9906e.equals(c0853j.f9906e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f9906e.hashCode() + ((this.f9905d.hashCode() + ((this.f9904c.hashCode() + ((((217 + this.f9902a) * 31) + this.f9903b) * 31)) * 31)) * 31);
    }
}

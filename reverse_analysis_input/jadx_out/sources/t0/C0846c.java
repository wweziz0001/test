package t0;

import b3.AbstractC0307a;
import d0.AbstractC0370w;
import java.util.Objects;
import m2.g0;

/* JADX INFO: renamed from: t0.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0846c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f9853a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f9854b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f9855c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f9856d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f9857e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f9858f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f9859g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f9860h;
    public final g0 i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final C0845b f9861j;

    public C0846c(C0844a c0844a, g0 g0Var, C0845b c0845b) {
        this.f9853a = c0844a.f9841a;
        this.f9854b = c0844a.f9842b;
        this.f9855c = c0844a.f9843c;
        this.f9856d = c0844a.f9844d;
        this.f9858f = c0844a.f9847g;
        this.f9859g = c0844a.f9848h;
        this.f9857e = c0844a.f9846f;
        this.f9860h = c0844a.i;
        this.i = g0Var;
        this.f9861j = c0845b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0846c.class != obj.getClass()) {
            return false;
        }
        C0846c c0846c = (C0846c) obj;
        if (this.f9853a.equals(c0846c.f9853a) && this.f9854b == c0846c.f9854b && this.f9855c.equals(c0846c.f9855c) && this.f9856d == c0846c.f9856d && this.f9857e == c0846c.f9857e) {
            g0 g0Var = this.i;
            g0Var.getClass();
            if (m2.r.h(g0Var, c0846c.i) && this.f9861j.equals(c0846c.f9861j)) {
                int i = AbstractC0370w.f5326a;
                if (Objects.equals(this.f9858f, c0846c.f9858f) && Objects.equals(this.f9859g, c0846c.f9859g) && Objects.equals(this.f9860h, c0846c.f9860h)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (this.f9861j.hashCode() + ((this.i.hashCode() + ((((AbstractC0307a.e((AbstractC0307a.e(217, this.f9853a, 31) + this.f9854b) * 31, this.f9855c, 31) + this.f9856d) * 31) + this.f9857e) * 31)) * 31)) * 31;
        String str = this.f9858f;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f9859g;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f9860h;
        return iHashCode3 + (str3 != null ? str3.hashCode() : 0);
    }
}

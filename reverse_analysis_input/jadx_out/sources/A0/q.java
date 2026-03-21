package A0;

import a0.C0170V;
import h0.q0;
import java.util.Comparator;
import m2.AbstractC0666z;
import m2.I;
import m2.Z;
import m2.b0;
import m2.i0;

/* JADX INFO: loaded from: classes.dex */
public final class q extends s implements Comparable {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final int f124p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final boolean f125q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final boolean f126r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final boolean f127s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final int f128t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final int f129u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final int f130v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final int f131w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final boolean f132x;

    public q(int i, C0170V c0170v, int i5, m mVar, int i6, String str) {
        int iC;
        super(i, c0170v, i5);
        int i7 = 0;
        this.f125q = q0.g(i6, false);
        int i8 = this.f136o.f3416e;
        mVar.getClass();
        this.f126r = (i8 & 1) != 0;
        this.f127s = (i8 & 2) != 0;
        b0 b0Var = mVar.f3301n;
        b0 b0VarU = b0Var.isEmpty() ? I.u("") : b0Var;
        int i9 = 0;
        while (true) {
            if (i9 >= b0VarU.size()) {
                i9 = Integer.MAX_VALUE;
                iC = 0;
                break;
            } else {
                iC = u.c(this.f136o, (String) b0VarU.get(i9), false);
                if (iC > 0) {
                    break;
                } else {
                    i9++;
                }
            }
        }
        this.f128t = i9;
        this.f129u = iC;
        int iB = u.b(this.f136o.f3417f, mVar.f3302o);
        this.f130v = iB;
        this.f132x = (this.f136o.f3417f & 1088) != 0;
        int iC2 = u.c(this.f136o, str, u.f(str) == null);
        this.f131w = iC2;
        boolean z4 = iC > 0 || (b0Var.isEmpty() && iB > 0) || this.f126r || (this.f127s && iC2 > 0);
        if (q0.g(i6, mVar.f116w) && z4) {
            i7 = 1;
        }
        this.f124p = i7;
    }

    @Override // A0.s
    public final int a() {
        return this.f124p;
    }

    @Override // A0.s
    public final /* bridge */ /* synthetic */ boolean b(s sVar) {
        return false;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public final int compareTo(q qVar) {
        AbstractC0666z abstractC0666zC = AbstractC0666z.f8669a.c(this.f125q, qVar.f125q);
        Integer numValueOf = Integer.valueOf(this.f128t);
        Integer numValueOf2 = Integer.valueOf(qVar.f128t);
        Comparator comparator = Z.f8576l;
        comparator.getClass();
        i0 i0Var = i0.f8623l;
        AbstractC0666z abstractC0666zB = abstractC0666zC.b(numValueOf, numValueOf2, i0Var);
        int i = this.f129u;
        AbstractC0666z abstractC0666zA = abstractC0666zB.a(i, qVar.f129u);
        int i5 = this.f130v;
        AbstractC0666z abstractC0666zC2 = abstractC0666zA.a(i5, qVar.f130v).c(this.f126r, qVar.f126r);
        Boolean boolValueOf = Boolean.valueOf(this.f127s);
        Boolean boolValueOf2 = Boolean.valueOf(qVar.f127s);
        if (i != 0) {
            comparator = i0Var;
        }
        AbstractC0666z abstractC0666zA2 = abstractC0666zC2.b(boolValueOf, boolValueOf2, comparator).a(this.f131w, qVar.f131w);
        if (i5 == 0) {
            abstractC0666zA2 = abstractC0666zA2.d(this.f132x, qVar.f132x);
        }
        return abstractC0666zA2.e();
    }
}

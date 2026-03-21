package A0;

import a0.C0190p;
import android.text.TextUtils;
import java.util.Objects;
import m2.AbstractC0666z;
import m2.Z;
import m2.a0;
import m2.i0;

/* JADX INFO: loaded from: classes.dex */
public final class i extends s implements Comparable {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final int f79A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final boolean f80B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final int f81C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public final int f82D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public final int f83E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public final int f84F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public final boolean f85G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public final boolean f86H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public final boolean f87I;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final int f88p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final boolean f89q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final String f90r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final m f91s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final boolean f92t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final int f93u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final int f94v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final int f95w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final boolean f96x;
    public final boolean y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final int f97z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Removed duplicated region for block: B:27:0x006e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public i(int r7, a0.C0170V r8, int r9, A0.m r10, int r11, boolean r12, A0.h r13, int r14) {
        /*
            Method dump skipped, instruction units count: 372
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: A0.i.<init>(int, a0.V, int, A0.m, int, boolean, A0.h, int):void");
    }

    @Override // A0.s
    public final int a() {
        return this.f88p;
    }

    @Override // A0.s
    public final boolean b(s sVar) {
        int i;
        String str;
        i iVar = (i) sVar;
        this.f91s.getClass();
        C0190p c0190p = this.f136o;
        int i5 = c0190p.f3402C;
        if (i5 != -1) {
            C0190p c0190p2 = iVar.f136o;
            if (i5 == c0190p2.f3402C && ((this.f96x || ((str = c0190p.f3424n) != null && TextUtils.equals(str, c0190p2.f3424n))) && (i = c0190p.f3403D) != -1 && i == c0190p2.f3403D)) {
                if (this.f85G == iVar.f85G && this.f86H == iVar.f86H) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public final int compareTo(i iVar) {
        boolean z4 = this.f92t;
        boolean z5 = this.f89q;
        a0 a0VarA = (z5 && z4) ? u.f151j : u.f151j.a();
        AbstractC0666z abstractC0666zC = AbstractC0666z.f8669a.c(z4, iVar.f92t);
        Integer numValueOf = Integer.valueOf(this.f94v);
        Integer numValueOf2 = Integer.valueOf(iVar.f94v);
        Z.f8576l.getClass();
        i0 i0Var = i0.f8623l;
        AbstractC0666z abstractC0666zB = abstractC0666zC.b(numValueOf, numValueOf2, i0Var).a(this.f93u, iVar.f93u).a(this.f95w, iVar.f95w).c(this.f80B, iVar.f80B).c(this.y, iVar.y).b(Integer.valueOf(this.f97z), Integer.valueOf(iVar.f97z), i0Var).a(this.f79A, iVar.f79A).c(z5, iVar.f89q).b(Integer.valueOf(this.f84F), Integer.valueOf(iVar.f84F), i0Var);
        this.f91s.getClass();
        AbstractC0666z abstractC0666zB2 = abstractC0666zB.c(this.f85G, iVar.f85G).c(this.f86H, iVar.f86H).c(this.f87I, iVar.f87I).b(Integer.valueOf(this.f81C), Integer.valueOf(iVar.f81C), a0VarA).b(Integer.valueOf(this.f82D), Integer.valueOf(iVar.f82D), a0VarA);
        if (Objects.equals(this.f90r, iVar.f90r)) {
            abstractC0666zB2 = abstractC0666zB2.b(Integer.valueOf(this.f83E), Integer.valueOf(iVar.f83E), a0VarA);
        }
        return abstractC0666zB2.e();
    }
}

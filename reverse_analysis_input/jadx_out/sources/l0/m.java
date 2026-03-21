package l0;

import a0.C0190p;
import d0.AbstractC0360m;
import d0.AbstractC0370w;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import m2.I;

/* JADX INFO: loaded from: classes.dex */
public abstract class m {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final C0190p f7869l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final I f7870m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final long f7871n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final List f7872o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final j f7873p;

    public m(C0190p c0190p, I i, s sVar, ArrayList arrayList) {
        AbstractC0360m.c(!i.isEmpty());
        this.f7869l = c0190p;
        this.f7870m = I.p(i);
        this.f7872o = arrayList == null ? Collections.emptyList() : Collections.unmodifiableList(arrayList);
        this.f7873p = sVar.a(this);
        int i5 = AbstractC0370w.f5326a;
        this.f7871n = AbstractC0370w.U(sVar.f7889c, 1000000L, sVar.f7888b, RoundingMode.DOWN);
    }

    public abstract String b();

    public abstract k0.h d();

    public abstract j e();
}

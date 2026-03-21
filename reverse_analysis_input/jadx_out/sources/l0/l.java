package l0;

import a0.C0190p;
import android.net.Uri;
import androidx.lifecycle.E;
import java.util.ArrayList;
import m2.I;

/* JADX INFO: loaded from: classes.dex */
public final class l extends m {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final j f7867q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final E f7868r;

    public l(long j5, C0190p c0190p, I i, r rVar, ArrayList arrayList) {
        super(c0190p, i, rVar, arrayList);
        Uri.parse(((C0563b) i.get(0)).f7818a);
        long j6 = rVar.f7886e;
        j jVar = j6 <= 0 ? null : new j(rVar.f7885d, j6, null);
        this.f7867q = jVar;
        this.f7868r = jVar == null ? new E(new j(0L, -1L, null), 13) : null;
    }

    @Override // l0.m
    public final String b() {
        return null;
    }

    @Override // l0.m
    public final k0.h d() {
        return this.f7868r;
    }

    @Override // l0.m
    public final j e() {
        return this.f7867q;
    }
}

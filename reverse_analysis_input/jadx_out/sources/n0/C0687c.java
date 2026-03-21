package n0;

import Q1.C;
import a0.AbstractC0156G;
import a0.C0189o;
import a0.C0190p;
import a0.C0200z;
import java.util.ArrayList;

/* JADX INFO: renamed from: n0.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0687c {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int[] f8758c = {8, 13, 11, 2, 0, 1, 7};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public C0200z f8759a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f8760b;

    public static void a(int i, ArrayList arrayList) {
        if (C.a0(i, 0, 7, f8758c) == -1 || arrayList.contains(Integer.valueOf(i))) {
            return;
        }
        arrayList.add(Integer.valueOf(i));
    }

    public final C0190p b(C0190p c0190p) {
        if (!this.f8760b || !this.f8759a.supportsFormat(c0190p)) {
            return c0190p;
        }
        C0189o c0189oA = c0190p.a();
        c0189oA.f3387m = AbstractC0156G.m("application/x-media3-cues");
        c0189oA.f3372H = this.f8759a.d(c0190p);
        StringBuilder sb = new StringBuilder();
        sb.append(c0190p.f3424n);
        String str = c0190p.f3421k;
        sb.append(str != null ? " ".concat(str) : "");
        c0189oA.f3384j = sb.toString();
        c0189oA.f3392r = Long.MAX_VALUE;
        return new C0190p(c0189oA);
    }
}

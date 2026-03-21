package w0;

import a0.C0190p;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f10427a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f10428b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f10429c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f10430d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f10431e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f10432f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f10433g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f10434h;
    public final String i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final C0190p[] f10435j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final int f10436k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final String f10437l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final String f10438m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final ArrayList f10439n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final long[] f10440o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final long f10441p;

    public b(String str, String str2, int i, String str3, long j5, String str4, int i5, int i6, int i7, int i8, String str5, C0190p[] c0190pArr, ArrayList arrayList, long[] jArr, long j6) {
        this.f10437l = str;
        this.f10438m = str2;
        this.f10427a = i;
        this.f10428b = str3;
        this.f10429c = j5;
        this.f10430d = str4;
        this.f10431e = i5;
        this.f10432f = i6;
        this.f10433g = i7;
        this.f10434h = i8;
        this.i = str5;
        this.f10435j = c0190pArr;
        this.f10439n = arrayList;
        this.f10440o = jArr;
        this.f10441p = j6;
        this.f10436k = arrayList.size();
    }

    public final b a(C0190p[] c0190pArr) {
        long[] jArr = this.f10440o;
        return new b(this.f10437l, this.f10438m, this.f10427a, this.f10428b, this.f10429c, this.f10430d, this.f10431e, this.f10432f, this.f10433g, this.f10434h, this.i, c0190pArr, this.f10439n, jArr, this.f10441p);
    }

    public final long b(int i) {
        if (i == this.f10436k - 1) {
            return this.f10441p;
        }
        long[] jArr = this.f10440o;
        return jArr[i + 1] - jArr[i];
    }
}

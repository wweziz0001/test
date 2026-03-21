package c1;

import F0.B;
import F0.C0066m;
import F0.K;
import F0.q;
import F0.r;
import F0.s;
import F0.u;
import Q1.C;
import a0.AbstractC0156G;
import a0.C0157H;
import a0.C0189o;
import a0.C0190p;
import d0.AbstractC0360m;
import d0.AbstractC0370w;
import d0.C0363p;
import java.io.EOFException;
import java.io.InterruptedIOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/* JADX INFO: loaded from: classes.dex */
public final class h implements q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l f5041a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C0190p f5042b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f5043c;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public K f5046f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f5047g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f5048h;
    public long[] i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public long f5049j;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public byte[] f5045e = AbstractC0370w.f5331f;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C0363p f5044d = new C0363p();

    public h(l lVar, C0190p c0190p) {
        this.f5041a = lVar;
        C0189o c0189oA = c0190p.a();
        c0189oA.f3387m = AbstractC0156G.m("application/x-media3-cues");
        c0189oA.f3384j = c0190p.f3424n;
        c0189oA.f3372H = lVar.o();
        this.f5042b = new C0190p(c0189oA);
        this.f5043c = new ArrayList();
        this.f5048h = 0;
        this.i = AbstractC0370w.f5332g;
        this.f5049j = -9223372036854775807L;
    }

    public final void a(g gVar) {
        AbstractC0360m.i(this.f5046f);
        byte[] bArr = gVar.f5040m;
        int length = bArr.length;
        C0363p c0363p = this.f5044d;
        c0363p.getClass();
        c0363p.F(bArr.length, bArr);
        this.f5046f.a(c0363p, length, 0);
        this.f5046f.b(gVar.f5039l, 1, length, 0, null);
    }

    @Override // F0.q
    public final void b(long j5, long j6) {
        int i = this.f5048h;
        AbstractC0360m.h((i == 0 || i == 5) ? false : true);
        this.f5049j = j6;
        if (this.f5048h == 2) {
            this.f5048h = 1;
        }
        if (this.f5048h == 4) {
            this.f5048h = 3;
        }
    }

    @Override // F0.q
    public final int d(r rVar, u uVar) throws C0157H, EOFException, InterruptedIOException {
        int i = this.f5048h;
        AbstractC0360m.h((i == 0 || i == 5) ? false : true);
        if (this.f5048h == 1) {
            int iG = ((C0066m) rVar).f798n != -1 ? C.g(((C0066m) rVar).f798n) : 1024;
            if (iG > this.f5045e.length) {
                this.f5045e = new byte[iG];
            }
            this.f5047g = 0;
            this.f5048h = 2;
        }
        int i5 = this.f5048h;
        ArrayList arrayList = this.f5043c;
        if (i5 == 2) {
            byte[] bArr = this.f5045e;
            if (bArr.length == this.f5047g) {
                this.f5045e = Arrays.copyOf(bArr, bArr.length + 1024);
            }
            byte[] bArr2 = this.f5045e;
            int i6 = this.f5047g;
            C0066m c0066m = (C0066m) rVar;
            int i7 = c0066m.read(bArr2, i6, bArr2.length - i6);
            if (i7 != -1) {
                this.f5047g += i7;
            }
            long j5 = c0066m.f798n;
            if ((j5 != -1 && this.f5047g == j5) || i7 == -1) {
                try {
                    long j6 = this.f5049j;
                    this.f5041a.x(this.f5045e, 0, this.f5047g, j6 != -9223372036854775807L ? new k(j6, true) : k.f5052c, new I2.g(this, 3));
                    Collections.sort(arrayList);
                    this.i = new long[arrayList.size()];
                    for (int i8 = 0; i8 < arrayList.size(); i8++) {
                        this.i[i8] = ((g) arrayList.get(i8)).f5039l;
                    }
                    this.f5045e = AbstractC0370w.f5331f;
                    this.f5048h = 4;
                } catch (RuntimeException e5) {
                    throw C0157H.a(e5, "SubtitleParser failed.");
                }
            }
        }
        if (this.f5048h == 3) {
            if (((C0066m) rVar).j(((C0066m) rVar).f798n != -1 ? C.g(((C0066m) rVar).f798n) : 1024) == -1) {
                long j7 = this.f5049j;
                for (int iE = j7 == -9223372036854775807L ? 0 : AbstractC0370w.e(this.i, j7, true); iE < arrayList.size(); iE++) {
                    a((g) arrayList.get(iE));
                }
                this.f5048h = 4;
            }
        }
        return this.f5048h == 4 ? -1 : 0;
    }

    @Override // F0.q
    public final boolean e(r rVar) {
        return true;
    }

    @Override // F0.q
    public final void j(s sVar) {
        AbstractC0360m.h(this.f5048h == 0);
        K k4 = sVar.k(0, 3);
        this.f5046f = k4;
        k4.c(this.f5042b);
        sVar.j();
        sVar.d(new B(-9223372036854775807L, new long[]{0}, new long[]{0}));
        this.f5048h = 1;
    }

    @Override // F0.q
    public final void release() {
        if (this.f5048h == 5) {
            return;
        }
        this.f5041a.reset();
        this.f5048h = 5;
    }
}

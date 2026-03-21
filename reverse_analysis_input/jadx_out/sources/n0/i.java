package n0;

import A0.w;
import Q1.C;
import a0.C0170V;
import a0.C0190p;
import android.net.Uri;
import android.util.Pair;
import d0.AbstractC0360m;
import d0.AbstractC0370w;
import f0.C0417l;
import f0.InterfaceC0403A;
import f0.InterfaceC0412g;
import f0.InterfaceC0413h;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import m2.I;
import m3.C0675i;
import x0.C0961b;

/* JADX INFO: loaded from: classes.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C0687c f8771a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InterfaceC0413h f8772b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final InterfaceC0413h f8773c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C0675i f8774d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Uri[] f8775e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final C0190p[] f8776f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final o0.c f8777g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final C0170V f8778h;
    public final List i;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final i0.j f8780k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f8781l;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public C0961b f8783n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public Uri f8784o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f8785p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public w f8786q;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f8788s;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final C0675i f8779j = new C0675i(10);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public byte[] f8782m = AbstractC0370w.f5331f;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public long f8787r = -9223372036854775807L;

    public i(C0687c c0687c, o0.c cVar, Uri[] uriArr, C0190p[] c0190pArr, C0675i c0675i, InterfaceC0403A interfaceC0403A, C0675i c0675i2, List list, i0.j jVar) {
        this.f8771a = c0687c;
        this.f8777g = cVar;
        this.f8775e = uriArr;
        this.f8776f = c0190pArr;
        this.f8774d = c0675i2;
        this.i = list;
        this.f8780k = jVar;
        InterfaceC0413h interfaceC0413hA = ((InterfaceC0412g) c0675i.f8712m).a();
        this.f8772b = interfaceC0413hA;
        if (interfaceC0403A != null) {
            interfaceC0413hA.b(interfaceC0403A);
        }
        this.f8773c = ((InterfaceC0412g) c0675i.f8712m).a();
        this.f8778h = new C0170V("", c0190pArr);
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < uriArr.length; i++) {
            if ((c0190pArr[i].f3417f & 16384) == 0) {
                arrayList.add(Integer.valueOf(i));
            }
        }
        C0170V c0170v = this.f8778h;
        int[] iArrX0 = C.x0(arrayList);
        g gVar = new g(c0170v, iArrX0);
        gVar.f8766g = gVar.p(c0170v.f3264d[iArrX0[0]]);
        this.f8786q = gVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00df  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final y0.m[] a(n0.j r20, long r21) {
        /*
            Method dump skipped, instruction units count: 239
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: n0.i.a(n0.j, long):y0.m[]");
    }

    public final int b(j jVar) {
        if (jVar.f8814z == -1) {
            return 1;
        }
        o0.i iVarA = this.f8777g.a(false, this.f8775e[this.f8778h.b(jVar.f10857o)]);
        iVarA.getClass();
        int i = (int) (jVar.f10902u - iVarA.f9021k);
        if (i < 0) {
            return 1;
        }
        I i5 = iVarA.f9028r;
        I i6 = i < i5.size() ? ((o0.f) i5.get(i)).f8998x : iVarA.f9029s;
        int size = i6.size();
        int i7 = jVar.f8814z;
        if (i7 >= size) {
            return 2;
        }
        o0.d dVar = (o0.d) i6.get(i7);
        if (dVar.f8993x) {
            return 0;
        }
        return Objects.equals(Uri.parse(AbstractC0360m.v(iVarA.f9050a, dVar.f8999l)), jVar.f10855m.f5686a) ? 1 : 2;
    }

    public final Pair c(j jVar, boolean z4, o0.i iVar, long j5, long j6) {
        boolean z5 = true;
        if (jVar != null && !z4) {
            boolean z6 = jVar.f8807S;
            long jA = jVar.f10902u;
            int i = jVar.f8814z;
            if (!z6) {
                return new Pair(Long.valueOf(jA), Integer.valueOf(i));
            }
            if (i == -1) {
                jA = jVar.a();
            }
            return new Pair(Long.valueOf(jA), Integer.valueOf(i != -1 ? i + 1 : -1));
        }
        long j7 = iVar.f9031u + j5;
        if (jVar != null && !this.f8785p) {
            j6 = jVar.f10860r;
        }
        boolean z7 = iVar.f9025o;
        long j8 = iVar.f9021k;
        I i5 = iVar.f9028r;
        if (!z7 && j6 >= j7) {
            return new Pair(Long.valueOf(j8 + ((long) i5.size())), -1);
        }
        long j9 = j6 - j5;
        Long lValueOf = Long.valueOf(j9);
        int i6 = 0;
        if (this.f8777g.f8991x && jVar != null) {
            z5 = false;
        }
        int iC = AbstractC0370w.c(i5, lValueOf, z5);
        long j10 = ((long) iC) + j8;
        if (iC >= 0) {
            o0.f fVar = (o0.f) i5.get(iC);
            long j11 = fVar.f9003p + fVar.f9001n;
            I i7 = iVar.f9029s;
            I i8 = j9 < j11 ? fVar.f8998x : i7;
            while (true) {
                if (i6 >= i8.size()) {
                    break;
                }
                o0.d dVar = (o0.d) i8.get(i6);
                if (j9 >= dVar.f9003p + dVar.f9001n) {
                    i6++;
                } else if (dVar.f8992w) {
                    j10 += i8 == i7 ? 1L : 0L;
                    i = i6;
                }
            }
        }
        return new Pair(Long.valueOf(j10), Integer.valueOf(i));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final C0689e d(Uri uri, int i, boolean z4) {
        if (uri == null) {
            return null;
        }
        C0675i c0675i = this.f8779j;
        byte[] bArr = (byte[]) ((C0688d) c0675i.f8712m).remove(uri);
        if (bArr != null) {
            return null;
        }
        C0417l c0417l = new C0417l(uri, 1, null, Collections.emptyMap(), 0L, -1L, null, 1);
        C0190p c0190p = this.f8776f[i];
        int iE = this.f8786q.e();
        Object objL = this.f8786q.l();
        byte[] bArr2 = this.f8782m;
        C0689e c0689e = new C0689e(this.f8773c, c0417l, 3, c0190p, iE, objL, -9223372036854775807L, -9223372036854775807L);
        if (bArr2 == null) {
            bArr2 = AbstractC0370w.f5331f;
        }
        c0689e.f8761u = bArr2;
        return c0689e;
    }
}

package F0;

import d0.AbstractC0360m;
import d0.AbstractC0370w;

/* JADX INFO: loaded from: classes.dex */
public class v implements E {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f818a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f819b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f820c;

    public /* synthetic */ v(Object obj, long j5, int i) {
        this.f818a = i;
        this.f820c = obj;
        this.f819b = j5;
    }

    @Override // F0.E
    public final boolean c() {
        switch (this.f818a) {
            case 0:
                return true;
            case 1:
                return false;
            default:
                return true;
        }
    }

    @Override // F0.E
    public final D g(long j5) {
        switch (this.f818a) {
            case 0:
                w wVar = (w) this.f820c;
                AbstractC0360m.i(wVar.f830k);
                Z1.l lVar = wVar.f830k;
                long[] jArr = (long[]) lVar.f3020l;
                int iE = AbstractC0370w.e(jArr, AbstractC0370w.j((((long) wVar.f825e) * j5) / 1000000, 0L, wVar.f829j - 1), false);
                long j6 = iE == -1 ? 0L : jArr[iE];
                long[] jArr2 = (long[]) lVar.f3021m;
                long j7 = iE != -1 ? jArr2[iE] : 0L;
                int i = wVar.f825e;
                long j8 = (j6 * 1000000) / ((long) i);
                long j9 = this.f819b;
                F f2 = new F(j8, j7 + j9);
                if (j8 == j5 || iE == jArr.length - 1) {
                    return new D(f2, f2);
                }
                int i5 = iE + 1;
                return new D(f2, new F((jArr[i5] * 1000000) / ((long) i), j9 + jArr2[i5]));
            case 1:
                return (D) this.f820c;
            default:
                H0.b bVar = (H0.b) this.f820c;
                D dB = bVar.i[0].b(j5);
                int i6 = 1;
                while (true) {
                    H0.e[] eVarArr = bVar.i;
                    if (i6 >= eVarArr.length) {
                        return dB;
                    }
                    D dB2 = eVarArr[i6].b(j5);
                    if (dB2.f687a.f691b < dB.f687a.f691b) {
                        dB = dB2;
                    }
                    i6++;
                }
                break;
        }
    }

    @Override // F0.E
    public final long i() {
        switch (this.f818a) {
        }
        return this.f819b;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public v(long j5) {
        this(j5, 0L);
        this.f818a = 1;
    }

    public v(long j5, long j6) {
        this.f818a = 1;
        this.f819b = j5;
        F f2 = j6 == 0 ? F.f689c : new F(0L, j6);
        this.f820c = new D(f2, f2);
    }
}

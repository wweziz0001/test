package a1;

import F0.C0066m;
import Z1.l;
import d0.AbstractC0360m;
import d0.C0363p;
import f0.C0421p;
import f0.InterfaceC0412g;
import f0.InterfaceC0413h;
import java.io.EOFException;
import java.io.InterruptedIOException;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class e implements InterfaceC0412g {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f3488l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f3489m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f3490n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Object f3491o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public Object f3492p;

    public e(int i) {
        switch (i) {
            case 1:
                this.f3491o = new l(9);
                this.f3488l = 8000;
                this.f3489m = 8000;
                break;
            default:
                this.f3491o = new f();
                this.f3492p = new C0363p(0, new byte[65025]);
                this.f3488l = -1;
                break;
        }
    }

    @Override // f0.InterfaceC0412g
    public InterfaceC0413h a() {
        return new C0421p((String) this.f3492p, this.f3488l, this.f3489m, this.f3490n, (l) this.f3491o);
    }

    public int b(int i) {
        int i5;
        int i6 = 0;
        this.f3489m = 0;
        do {
            int i7 = this.f3489m;
            int i8 = i + i7;
            f fVar = (f) this.f3491o;
            if (i8 >= fVar.f3495c) {
                break;
            }
            int[] iArr = fVar.f3498f;
            this.f3489m = i7 + 1;
            i5 = iArr[i7 + i];
            i6 += i5;
        } while (i5 == 255);
        return i6;
    }

    public boolean c(C0066m c0066m) throws InterruptedIOException {
        int i;
        AbstractC0360m.h(c0066m != null);
        boolean z4 = this.f3490n;
        C0363p c0363p = (C0363p) this.f3492p;
        if (z4) {
            this.f3490n = false;
            c0363p.E(0);
        }
        while (!this.f3490n) {
            int i5 = this.f3488l;
            f fVar = (f) this.f3491o;
            if (i5 < 0) {
                if (fVar.b(c0066m, -1L) && fVar.a(c0066m, true)) {
                    int iB = fVar.f3496d;
                    if ((fVar.f3493a & 1) == 1 && c0363p.f5315c == 0) {
                        iB += b(0);
                        i = this.f3489m;
                    } else {
                        i = 0;
                    }
                    try {
                        c0066m.f(iB);
                        this.f3488l = i;
                    } catch (EOFException unused) {
                    }
                }
                return false;
            }
            int iB2 = b(this.f3488l);
            int i6 = this.f3488l + this.f3489m;
            if (iB2 > 0) {
                c0363p.b(c0363p.f5315c + iB2);
                try {
                    c0066m.l(c0363p.f5313a, c0363p.f5315c, iB2, false);
                    c0363p.G(c0363p.f5315c + iB2);
                    this.f3490n = fVar.f3498f[i6 + (-1)] != 255;
                } catch (EOFException unused2) {
                    return false;
                }
            }
            if (i6 == fVar.f3495c) {
                i6 = -1;
            }
            this.f3488l = i6;
        }
        return true;
    }

    public void d(Map map) {
        l lVar = (l) this.f3491o;
        synchronized (lVar) {
            lVar.f3021m = null;
            ((HashMap) lVar.f3020l).clear();
            ((HashMap) lVar.f3020l).putAll(map);
        }
    }
}

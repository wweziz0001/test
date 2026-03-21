package n0;

import a0.C0155F;
import a0.C0186l;
import a0.C0189o;
import a0.C0190p;
import a0.InterfaceC0154E;
import java.util.Map;
import x0.e0;

/* JADX INFO: loaded from: classes.dex */
public final class p extends e0 {

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public final Map f8860H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public C0186l f8861I;

    public p(B0.f fVar, m0.i iVar, m0.e eVar, Map map) {
        super(fVar, iVar, eVar);
        this.f8860H = map;
    }

    @Override // x0.e0
    public final C0190p k(C0190p c0190p) {
        C0186l c0186l;
        C0186l c0186l2 = this.f8861I;
        if (c0186l2 == null) {
            c0186l2 = c0190p.f3428r;
        }
        if (c0186l2 != null && (c0186l = (C0186l) this.f8860H.get(c0186l2.f3360n)) != null) {
            c0186l2 = c0186l;
        }
        C0155F c0155f = c0190p.f3422l;
        C0155F c0155f2 = null;
        if (c0155f == null) {
            c0155f = c0155f2;
        } else {
            InterfaceC0154E[] interfaceC0154EArr = c0155f.f3211l;
            int length = interfaceC0154EArr.length;
            int i = 0;
            int i5 = 0;
            while (true) {
                if (i5 >= length) {
                    i5 = -1;
                    break;
                }
                InterfaceC0154E interfaceC0154E = interfaceC0154EArr[i5];
                if ((interfaceC0154E instanceof T0.m) && "com.apple.streaming.transportStreamTimestamp".equals(((T0.m) interfaceC0154E).f2134m)) {
                    break;
                }
                i5++;
            }
            if (i5 != -1) {
                if (length != 1) {
                    InterfaceC0154E[] interfaceC0154EArr2 = new InterfaceC0154E[length - 1];
                    while (i < length) {
                        if (i != i5) {
                            interfaceC0154EArr2[i < i5 ? i : i - 1] = interfaceC0154EArr[i];
                        }
                        i++;
                    }
                    c0155f2 = new C0155F(interfaceC0154EArr2);
                }
                c0155f = c0155f2;
            }
        }
        if (c0186l2 != c0190p.f3428r || c0155f != c0190p.f3422l) {
            C0189o c0189oA = c0190p.a();
            c0189oA.f3391q = c0186l2;
            c0189oA.f3385k = c0155f;
            c0190p = new C0190p(c0189oA);
        }
        return super.k(c0190p);
    }
}

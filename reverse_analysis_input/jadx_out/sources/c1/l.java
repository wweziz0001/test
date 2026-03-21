package c1;

import d0.InterfaceC0351d;
import m2.C0639F;
import m2.I;

/* JADX INFO: loaded from: classes.dex */
public interface l {
    int o();

    default d v(byte[] bArr, int i, int i5) {
        C0639F c0639fN = I.n();
        x(bArr, 0, i5, k.f5052c, new I2.g(c0639fN, 4));
        return new b(c0639fN.g());
    }

    void x(byte[] bArr, int i, int i5, k kVar, InterfaceC0351d interfaceC0351d);

    default void reset() {
    }
}

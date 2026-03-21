package n3;

import a0.C0200z;
import java.nio.ByteBuffer;

/* JADX INFO: renamed from: n3.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC0696f {
    void d(String str, InterfaceC0694d interfaceC0694d, C0200z c0200z);

    void h(String str, ByteBuffer byteBuffer, InterfaceC0695e interfaceC0695e);

    C0200z j(C0702l c0702l);

    void k(String str, InterfaceC0694d interfaceC0694d);

    void l(String str, ByteBuffer byteBuffer);

    default C0200z q() {
        return j(new C0702l());
    }
}

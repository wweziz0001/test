package h0;

import android.content.Context;
import android.os.Handler;
import b0.InterfaceC0300d;
import d0.AbstractC0360m;
import java.util.ArrayList;
import r0.InterfaceC0749b;
import z0.C1063e;
import z0.InterfaceC1062d;

/* JADX INFO: renamed from: h0.n, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0463n implements s0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f6237a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Q.n f6238b;

    public C0463n(Context context) {
        this.f6237a = context;
        this.f6238b = new Q.n(context, (byte) 0);
    }

    @Override // h0.s0
    public final o0[] a(Handler handler, D0.A a5, j0.h hVar, InterfaceC1062d interfaceC1062d, InterfaceC0749b interfaceC0749b) {
        ArrayList arrayList = new ArrayList();
        Q.n nVar = this.f6238b;
        Context context = this.f6237a;
        arrayList.add(new D0.g(context, nVar, handler, a5));
        D0.k kVar = new D0.k(context);
        AbstractC0360m.h(!kVar.f450a);
        kVar.f450a = true;
        if (((Z1.s) kVar.f453d) == null) {
            kVar.f453d = new Z1.s(new InterfaceC0300d[0]);
        }
        if (((Z1.e) kVar.f456g) == null) {
            kVar.f456g = new Z1.e(context, 12);
        }
        arrayList.add(new j0.x(this.f6237a, nVar, handler, hVar, new j0.v(kVar)));
        arrayList.add(new C1063e(interfaceC1062d, handler.getLooper()));
        arrayList.add(new r0.c(interfaceC0749b, handler.getLooper()));
        arrayList.add(new E0.a());
        arrayList.add(new p0.g(p0.c.i));
        return (o0[]) arrayList.toArray(new o0[0]);
    }
}

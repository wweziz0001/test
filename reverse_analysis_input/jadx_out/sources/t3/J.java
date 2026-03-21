package t3;

import V3.AbstractC0144v;
import android.content.Context;
import android.util.Log;
import j3.C0524a;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import n3.InterfaceC0696f;

/* JADX INFO: loaded from: classes.dex */
public final class J implements j3.b, InterfaceC0875f {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Context f10044l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public Z1.s f10045m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final p1.b f10046n = new p1.b(14);

    public static final Object d(J j5, String str, String str2, G3.f fVar) {
        j5.getClass();
        P.d dVar = new P.d(str);
        Context context = j5.f10044l;
        if (context != null) {
            Object objB = K.a(context).b(new P.f(new C0879j(dVar, str2, null), null), fVar);
            return objB == F3.a.f861l ? objB : B3.g.f275a;
        }
        N3.h.g("context");
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x00c5 -> B:36:0x00c8). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object j(t3.J r11, java.util.List r12, G3.b r13) {
        /*
            Method dump skipped, instruction units count: 234
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: t3.J.j(t3.J, java.util.List, G3.b):java.lang.Object");
    }

    @Override // t3.InterfaceC0875f
    public final void a(String str, List list, C0876g c0876g) throws Throwable {
        AbstractC0144v.m(new C0866C(this, str, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu".concat(this.f10046n.o(list)), null));
    }

    @Override // t3.InterfaceC0875f
    public final Map b(List list, C0876g c0876g) {
        return (Map) AbstractC0144v.m(new C0880k(this, list, null));
    }

    @Override // t3.InterfaceC0875f
    public final void c(String str, long j5, C0876g c0876g) throws Throwable {
        AbstractC0144v.m(new H(str, this, j5, null));
    }

    @Override // t3.InterfaceC0875f
    public final void e(String str, String str2, C0876g c0876g) throws Throwable {
        AbstractC0144v.m(new I(this, str, str2, null));
    }

    @Override // t3.InterfaceC0875f
    public final void f(List list, C0876g c0876g) throws Throwable {
        AbstractC0144v.m(new C0878i(this, list, null));
    }

    @Override // t3.InterfaceC0875f
    public final void g(String str, String str2, C0876g c0876g) throws Throwable {
        AbstractC0144v.m(new C0869F(this, str, str2, null));
    }

    @Override // t3.InterfaceC0875f
    public final void h(String str, double d5, C0876g c0876g) throws Throwable {
        AbstractC0144v.m(new C0868E(str, this, d5, null));
    }

    @Override // t3.InterfaceC0875f
    public final Long i(String str, C0876g c0876g) throws Throwable {
        N3.p pVar = new N3.p();
        AbstractC0144v.m(new t(str, this, pVar, null));
        return (Long) pVar.f1626l;
    }

    @Override // t3.InterfaceC0875f
    public final ArrayList l(String str, C0876g c0876g) throws Throwable {
        List list;
        String strP = p(str, c0876g);
        ArrayList arrayList = null;
        if (strP != null && !strP.startsWith("VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu!") && strP.startsWith("VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu") && (list = (List) K.c(strP, this.f10046n)) != null) {
            arrayList = new ArrayList();
            for (Object obj : list) {
                if (obj instanceof String) {
                    arrayList.add(obj);
                }
            }
        }
        return arrayList;
    }

    @Override // t3.InterfaceC0875f
    public final Double m(String str, C0876g c0876g) throws Throwable {
        N3.p pVar = new N3.p();
        AbstractC0144v.m(new r(str, this, pVar, null));
        return (Double) pVar.f1626l;
    }

    @Override // t3.InterfaceC0875f
    public final List n(List list, C0876g c0876g) {
        return C3.f.X(((Map) AbstractC0144v.m(new u(this, list, null))).keySet());
    }

    @Override // t3.InterfaceC0875f
    public final N o(String str, C0876g c0876g) throws Throwable {
        String strP = p(str, c0876g);
        if (strP == null) {
            return null;
        }
        if (strP.startsWith("VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu!")) {
            return new N(strP, L.f10051o);
        }
        return strP.startsWith("VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu") ? new N(null, L.f10050n) : new N(null, L.f10052p);
    }

    @Override // j3.b
    public final void onAttachedToEngine(C0524a c0524a) {
        N3.h.e(c0524a, "binding");
        InterfaceC0696f interfaceC0696f = c0524a.f7455c;
        N3.h.d(interfaceC0696f, "getBinaryMessenger(...)");
        Context context = c0524a.f7453a;
        N3.h.d(context, "getApplicationContext(...)");
        this.f10044l = context;
        try {
            InterfaceC0875f.f10067j.getClass();
            C0874e.b(interfaceC0696f, this, "data_store");
            this.f10045m = new Z1.s(interfaceC0696f, context, this.f10046n);
        } catch (Exception e5) {
            Log.e("SharedPreferencesPlugin", "Received exception while setting up SharedPreferencesPlugin", e5);
        }
        new C0870a().onAttachedToEngine(c0524a);
    }

    @Override // j3.b
    public final void onDetachedFromEngine(C0524a c0524a) {
        N3.h.e(c0524a, "binding");
        InterfaceC0696f interfaceC0696f = c0524a.f7455c;
        N3.h.d(interfaceC0696f, "getBinaryMessenger(...)");
        InterfaceC0875f.f10067j.getClass();
        C0874e.b(interfaceC0696f, null, "data_store");
        Z1.s sVar = this.f10045m;
        if (sVar != null) {
            C0874e.b((InterfaceC0696f) sVar.f3085m, null, "shared_preferences");
        }
        this.f10045m = null;
    }

    @Override // t3.InterfaceC0875f
    public final String p(String str, C0876g c0876g) throws Throwable {
        N3.p pVar = new N3.p();
        AbstractC0144v.m(new x(str, this, pVar, null));
        return (String) pVar.f1626l;
    }

    @Override // t3.InterfaceC0875f
    public final void q(String str, boolean z4, C0876g c0876g) throws Throwable {
        AbstractC0144v.m(new C0865B(str, this, z4, null));
    }

    @Override // t3.InterfaceC0875f
    public final Boolean r(String str, C0876g c0876g) throws Throwable {
        N3.p pVar = new N3.p();
        AbstractC0144v.m(new o(str, this, pVar, null));
        return (Boolean) pVar.f1626l;
    }
}

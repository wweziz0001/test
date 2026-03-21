package androidx.lifecycle;

import java.util.HashMap;
import java.util.List;
import v1.C0916f;

/* JADX INFO: renamed from: androidx.lifecycle.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0265g implements InterfaceC0276s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4530a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f4531b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f4532c;

    public /* synthetic */ C0265g(Object obj, int i, Object obj2) {
        this.f4530a = i;
        this.f4531b = obj;
        this.f4532c = obj2;
    }

    @Override // androidx.lifecycle.InterfaceC0276s
    public final void b(InterfaceC0278u interfaceC0278u, EnumC0272n enumC0272n) {
        switch (this.f4530a) {
            case 0:
                int i = AbstractC0264f.f4529a[enumC0272n.ordinal()];
                InterfaceC0263e interfaceC0263e = (InterfaceC0263e) this.f4531b;
                if (i == 3) {
                    interfaceC0263e.a();
                } else if (i == 7) {
                    throw new IllegalArgumentException("ON_ANY must not been send by anybody");
                }
                InterfaceC0276s interfaceC0276s = (InterfaceC0276s) this.f4532c;
                if (interfaceC0276s != null) {
                    interfaceC0276s.b(interfaceC0278u, enumC0272n);
                    return;
                }
                return;
            case 1:
                if (enumC0272n == EnumC0272n.ON_START) {
                    ((AbstractC0274p) this.f4531b).b(this);
                    ((C0916f) this.f4532c).d();
                    return;
                }
                return;
            default:
                HashMap map = ((C0260b) this.f4532c).f4522a;
                List list = (List) map.get(enumC0272n);
                InterfaceC0277t interfaceC0277t = (InterfaceC0277t) this.f4531b;
                C0260b.a(list, interfaceC0278u, enumC0272n, interfaceC0277t);
                C0260b.a((List) map.get(EnumC0272n.ON_ANY), interfaceC0278u, enumC0272n, interfaceC0277t);
                return;
        }
    }

    public C0265g(InterfaceC0277t interfaceC0277t) {
        this.f4530a = 2;
        this.f4531b = interfaceC0277t;
        C0262d c0262d = C0262d.f4526c;
        Class<?> cls = interfaceC0277t.getClass();
        C0260b c0260b = (C0260b) c0262d.f4527a.get(cls);
        this.f4532c = c0260b == null ? c0262d.a(cls, null) : c0260b;
    }
}

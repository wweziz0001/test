package e;

import android.os.Bundle;
import androidx.lifecycle.EnumC0272n;
import androidx.lifecycle.InterfaceC0276s;
import androidx.lifecycle.InterfaceC0278u;
import java.util.HashMap;

/* JADX INFO: renamed from: e.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0382d implements InterfaceC0276s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f5463a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0380b f5464b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ f.b f5465c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ AbstractC0387i f5466d;

    public C0382d(AbstractC0387i abstractC0387i, String str, InterfaceC0380b interfaceC0380b, f.b bVar) {
        this.f5466d = abstractC0387i;
        this.f5463a = str;
        this.f5464b = interfaceC0380b;
        this.f5465c = bVar;
    }

    @Override // androidx.lifecycle.InterfaceC0276s
    public final void b(InterfaceC0278u interfaceC0278u, EnumC0272n enumC0272n) {
        boolean zEquals = EnumC0272n.ON_START.equals(enumC0272n);
        String str = this.f5463a;
        AbstractC0387i abstractC0387i = this.f5466d;
        if (!zEquals) {
            if (EnumC0272n.ON_STOP.equals(enumC0272n)) {
                abstractC0387i.f5478e.remove(str);
                return;
            } else {
                if (EnumC0272n.ON_DESTROY.equals(enumC0272n)) {
                    abstractC0387i.e(str);
                    return;
                }
                return;
            }
        }
        HashMap map = abstractC0387i.f5478e;
        InterfaceC0380b interfaceC0380b = this.f5464b;
        f.b bVar = this.f5465c;
        map.put(str, new C0385g(bVar, interfaceC0380b));
        HashMap map2 = abstractC0387i.f5479f;
        if (map2.containsKey(str)) {
            Object obj = map2.get(str);
            map2.remove(str);
            interfaceC0380b.a(obj);
        }
        Bundle bundle = abstractC0387i.f5480g;
        C0379a c0379a = (C0379a) bundle.getParcelable(str);
        if (c0379a != null) {
            bundle.remove(str);
            interfaceC0380b.a(bVar.c(c0379a.f5462m, c0379a.f5461l));
        }
    }
}

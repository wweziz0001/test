package U2;

import Z1.f;
import Z1.i;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class a extends f {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final Map f2279q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final i f2280r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final boolean f2281s;

    public a(Map map, boolean z4) {
        super(10);
        this.f2280r = new i();
        this.f2279q = map;
        this.f2281s = z4;
    }

    public final void S(ArrayList arrayList) {
        if (this.f2281s) {
            return;
        }
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        i iVar = this.f2280r;
        map2.put("code", (String) iVar.f3013m);
        map2.put("message", (String) iVar.f3014n);
        map2.put("data", (HashMap) iVar.f3015o);
        map.put("error", map2);
        arrayList.add(map);
    }

    public final void T(ArrayList arrayList) {
        if (this.f2281s) {
            return;
        }
        HashMap map = new HashMap();
        map.put("result", (Serializable) this.f2280r.f3012l);
        arrayList.add(map);
    }

    @Override // Z1.f
    public final Object p(String str) {
        return this.f2279q.get(str);
    }

    @Override // Z1.f
    public final String q() {
        return (String) this.f2279q.get("method");
    }

    @Override // Z1.f
    public final boolean r() {
        return this.f2281s;
    }

    @Override // Z1.f
    public final d s() {
        return this.f2280r;
    }

    @Override // Z1.f
    public final boolean w() {
        return this.f2279q.containsKey("transactionId");
    }
}

package e;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import androidx.lifecycle.InterfaceC0276s;
import b3.AbstractC0307a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: renamed from: e.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0387i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f5474a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashMap f5475b = new HashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HashMap f5476c = new HashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ArrayList f5477d = new ArrayList();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final transient HashMap f5478e = new HashMap();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final HashMap f5479f = new HashMap();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Bundle f5480g = new Bundle();

    public final boolean a(int i, int i5, Intent intent) {
        InterfaceC0380b interfaceC0380b;
        String str = (String) this.f5474a.get(Integer.valueOf(i));
        if (str == null) {
            return false;
        }
        C0385g c0385g = (C0385g) this.f5478e.get(str);
        if (c0385g == null || (interfaceC0380b = c0385g.f5470a) == null || !this.f5477d.contains(str)) {
            this.f5479f.remove(str);
            this.f5480g.putParcelable(str, new C0379a(intent, i5));
            return true;
        }
        interfaceC0380b.a(c0385g.f5471b.c(intent, i5));
        this.f5477d.remove(str);
        return true;
    }

    public abstract void b(int i, f.b bVar, Parcelable parcelable);

    public final C0384f c(String str, f.b bVar, InterfaceC0380b interfaceC0380b) {
        d(str);
        this.f5478e.put(str, new C0385g(bVar, interfaceC0380b));
        HashMap map = this.f5479f;
        if (map.containsKey(str)) {
            Object obj = map.get(str);
            map.remove(str);
            interfaceC0380b.a(obj);
        }
        Bundle bundle = this.f5480g;
        C0379a c0379a = (C0379a) bundle.getParcelable(str);
        if (c0379a != null) {
            bundle.remove(str);
            interfaceC0380b.a(bVar.c(c0379a.f5462m, c0379a.f5461l));
        }
        return new C0384f(this, str, bVar);
    }

    public final void d(String str) {
        HashMap map = this.f5475b;
        if (((Integer) map.get(str)) != null) {
            return;
        }
        P3.d.f1700l.getClass();
        int iB = P3.d.f1701m.b(2147418112);
        while (true) {
            int i = iB + 65536;
            HashMap map2 = this.f5474a;
            if (!map2.containsKey(Integer.valueOf(i))) {
                map2.put(Integer.valueOf(i), str);
                map.put(str, Integer.valueOf(i));
                return;
            } else {
                P3.d.f1700l.getClass();
                iB = P3.d.f1701m.b(2147418112);
            }
        }
    }

    public final void e(String str) {
        Integer num;
        if (!this.f5477d.contains(str) && (num = (Integer) this.f5475b.remove(str)) != null) {
            this.f5474a.remove(num);
        }
        this.f5478e.remove(str);
        HashMap map = this.f5479f;
        if (map.containsKey(str)) {
            StringBuilder sbM = AbstractC0307a.m("Dropping pending result for request ", str, ": ");
            sbM.append(map.get(str));
            Log.w("ActivityResultRegistry", sbM.toString());
            map.remove(str);
        }
        Bundle bundle = this.f5480g;
        if (bundle.containsKey(str)) {
            StringBuilder sbM2 = AbstractC0307a.m("Dropping pending result for request ", str, ": ");
            sbM2.append(bundle.getParcelable(str));
            Log.w("ActivityResultRegistry", sbM2.toString());
            bundle.remove(str);
        }
        HashMap map2 = this.f5476c;
        C0386h c0386h = (C0386h) map2.get(str);
        if (c0386h != null) {
            ArrayList arrayList = c0386h.f5473b;
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                c0386h.f5472a.b((InterfaceC0276s) it.next());
            }
            arrayList.clear();
            map2.remove(str);
        }
    }
}

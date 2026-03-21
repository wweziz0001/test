package androidx.fragment.app;

import a0.C0200z;
import android.util.Log;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class O extends androidx.lifecycle.T {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final C0200z f4284j = new C0200z(3);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f4288g;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final HashMap f4285d = new HashMap();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final HashMap f4286e = new HashMap();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final HashMap f4287f = new HashMap();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f4289h = false;
    public boolean i = false;

    public O(boolean z4) {
        this.f4288g = z4;
    }

    @Override // androidx.lifecycle.T
    public final void b() {
        if (Log.isLoggable("FragmentManager", 3)) {
            Log.d("FragmentManager", "onCleared called for " + this);
        }
        this.f4289h = true;
    }

    public final void c(r rVar, boolean z4) {
        if (Log.isLoggable("FragmentManager", 3)) {
            Log.d("FragmentManager", "Clearing non-config state for " + rVar);
        }
        e(rVar.f4443p, z4);
    }

    public final void d(String str, boolean z4) {
        if (Log.isLoggable("FragmentManager", 3)) {
            Log.d("FragmentManager", "Clearing non-config state for saved state of Fragment " + str);
        }
        e(str, z4);
    }

    public final void e(String str, boolean z4) {
        HashMap map = this.f4286e;
        O o4 = (O) map.get(str);
        if (o4 != null) {
            if (z4) {
                ArrayList arrayList = new ArrayList();
                arrayList.addAll(o4.f4286e.keySet());
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    o4.d((String) it.next(), true);
                }
            }
            o4.b();
            map.remove(str);
        }
        HashMap map2 = this.f4287f;
        androidx.lifecycle.Y y = (androidx.lifecycle.Y) map2.get(str);
        if (y != null) {
            y.a();
            map2.remove(str);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || O.class != obj.getClass()) {
            return false;
        }
        O o4 = (O) obj;
        return this.f4285d.equals(o4.f4285d) && this.f4286e.equals(o4.f4286e) && this.f4287f.equals(o4.f4287f);
    }

    public final void f(r rVar) {
        if (this.i) {
            if (Log.isLoggable("FragmentManager", 2)) {
                Log.v("FragmentManager", "Ignoring removeRetainedFragment as the state is already saved");
            }
        } else {
            if (this.f4285d.remove(rVar.f4443p) == null || !Log.isLoggable("FragmentManager", 2)) {
                return;
            }
            Log.v("FragmentManager", "Updating retained Fragments: Removed " + rVar);
        }
    }

    public final int hashCode() {
        return this.f4287f.hashCode() + ((this.f4286e.hashCode() + (this.f4285d.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FragmentManagerViewModel{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("} Fragments (");
        Iterator it = this.f4285d.values().iterator();
        while (it.hasNext()) {
            sb.append(it.next());
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") Child Non Config (");
        Iterator it2 = this.f4286e.keySet().iterator();
        while (it2.hasNext()) {
            sb.append((String) it2.next());
            if (it2.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") ViewModelStores (");
        Iterator it3 = this.f4287f.keySet().iterator();
        while (it3.hasNext()) {
            sb.append((String) it3.next());
            if (it3.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(')');
        return sb.toString();
    }
}

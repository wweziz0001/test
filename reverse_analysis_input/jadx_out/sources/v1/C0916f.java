package v1;

import android.os.Bundle;
import androidx.lifecycle.C0269k;
import java.util.Iterator;
import java.util.Map;
import o.C0711b;
import o.C0712c;
import o.C0715f;

/* JADX INFO: renamed from: v1.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0916f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f10349b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Bundle f10350c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f10351d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public C0911a f10352e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C0715f f10348a = new C0715f();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f10353f = true;

    public final Bundle a(String str) {
        if (!this.f10351d) {
            throw new IllegalStateException("You can consumeRestoredStateForKey only after super.onCreate of corresponding component");
        }
        Bundle bundle = this.f10350c;
        if (bundle == null) {
            return null;
        }
        Bundle bundle2 = bundle.getBundle(str);
        Bundle bundle3 = this.f10350c;
        if (bundle3 != null) {
            bundle3.remove(str);
        }
        Bundle bundle4 = this.f10350c;
        if (bundle4 == null || bundle4.isEmpty()) {
            this.f10350c = null;
        }
        return bundle2;
    }

    public final InterfaceC0915e b() {
        String str;
        InterfaceC0915e interfaceC0915e;
        Iterator it = this.f10348a.iterator();
        do {
            C0711b c0711b = (C0711b) it;
            if (!c0711b.hasNext()) {
                return null;
            }
            Map.Entry entry = (Map.Entry) c0711b.next();
            N3.h.d(entry, "components");
            str = (String) entry.getKey();
            interfaceC0915e = (InterfaceC0915e) entry.getValue();
        } while (!N3.h.a(str, "androidx.lifecycle.internal.SavedStateHandlesProvider"));
        return interfaceC0915e;
    }

    public final void c(String str, InterfaceC0915e interfaceC0915e) {
        Object obj;
        N3.h.e(interfaceC0915e, "provider");
        C0715f c0715f = this.f10348a;
        C0712c c0712cF = c0715f.f(str);
        if (c0712cF != null) {
            obj = c0712cF.f8955m;
        } else {
            C0712c c0712c = new C0712c(str, interfaceC0915e);
            c0715f.f8964o++;
            C0712c c0712c2 = c0715f.f8962m;
            if (c0712c2 == null) {
                c0715f.f8961l = c0712c;
                c0715f.f8962m = c0712c;
            } else {
                c0712c2.f8956n = c0712c;
                c0712c.f8957o = c0712c2;
                c0715f.f8962m = c0712c;
            }
            obj = null;
        }
        if (((InterfaceC0915e) obj) != null) {
            throw new IllegalArgumentException("SavedStateProvider with the given key is already registered");
        }
    }

    public final void d() {
        if (!this.f10353f) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        }
        C0911a c0911a = this.f10352e;
        if (c0911a == null) {
            c0911a = new C0911a(this);
        }
        this.f10352e = c0911a;
        try {
            C0269k.class.getDeclaredConstructor(null);
            C0911a c0911a2 = this.f10352e;
            if (c0911a2 != null) {
                c0911a2.f10344a.add(C0269k.class.getName());
            }
        } catch (NoSuchMethodException e5) {
            throw new IllegalArgumentException("Class " + C0269k.class.getSimpleName() + " must have default constructor in order to be automatically recreated", e5);
        }
    }
}

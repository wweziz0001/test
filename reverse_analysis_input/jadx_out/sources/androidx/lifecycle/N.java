package androidx.lifecycle;

import android.os.Bundle;
import java.util.Map;
import v1.C0916f;
import v1.InterfaceC0915e;

/* JADX INFO: loaded from: classes.dex */
public final class N implements InterfaceC0915e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C0916f f4498a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f4499b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Bundle f4500c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final B3.e f4501d;

    public N(C0916f c0916f, Z z4) {
        N3.h.e(c0916f, "savedStateRegistry");
        this.f4498a = c0916f;
        this.f4501d = new B3.e(new G1.a(z4, 4));
    }

    @Override // v1.InterfaceC0915e
    public final Bundle a() {
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.f4500c;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
        for (Map.Entry entry : ((O) this.f4501d.a()).f4502d.entrySet()) {
            String str = (String) entry.getKey();
            Bundle bundleA = ((J) entry.getValue()).f4491e.a();
            if (!N3.h.a(bundleA, Bundle.EMPTY)) {
                bundle.putBundle(str, bundleA);
            }
        }
        this.f4499b = false;
        return bundle;
    }

    public final void b() {
        if (this.f4499b) {
            return;
        }
        Bundle bundleA = this.f4498a.a("androidx.lifecycle.internal.SavedStateHandlesProvider");
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.f4500c;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
        if (bundleA != null) {
            bundle.putAll(bundleA);
        }
        this.f4500c = bundle;
        this.f4499b = true;
    }
}

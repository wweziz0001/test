package androidx.fragment.app;

import android.os.Bundle;
import androidx.lifecycle.EnumC0272n;
import io.flutter.embedding.android.AbstractActivityC0502v;
import v1.InterfaceC0915e;

/* JADX INFO: renamed from: androidx.fragment.app.s, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0251s implements InterfaceC0915e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4453a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f4454b;

    public /* synthetic */ C0251s(Object obj, int i) {
        this.f4453a = i;
        this.f4454b = obj;
    }

    @Override // v1.InterfaceC0915e
    public final Bundle a() {
        switch (this.f4453a) {
            case 0:
                AbstractActivityC0502v abstractActivityC0502v = (AbstractActivityC0502v) this.f4454b;
                abstractActivityC0502v.markFragmentsCreated();
                abstractActivityC0502v.mFragmentLifecycleRegistry.e(EnumC0272n.ON_STOP);
                return new Bundle();
            default:
                return ((L) this.f4454b).U();
        }
    }
}

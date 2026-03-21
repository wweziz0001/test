package androidx.activity;

import android.os.Bundle;
import androidx.fragment.app.AbstractActivityC0255w;
import androidx.lifecycle.J;
import v1.InterfaceC0915e;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class d implements InterfaceC0915e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3740a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f3741b;

    public /* synthetic */ d(Object obj, int i) {
        this.f3740a = i;
        this.f3741b = obj;
    }

    @Override // v1.InterfaceC0915e
    public final Bundle a() {
        switch (this.f3740a) {
            case 0:
                return m.b((AbstractActivityC0255w) this.f3741b);
            default:
                return J.a((J) this.f3741b);
        }
    }
}

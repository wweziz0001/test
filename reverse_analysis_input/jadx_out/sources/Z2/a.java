package Z2;

import A.e;
import androidx.fragment.app.AbstractActivityC0255w;
import m.B0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements M3.a {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f3088l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Object f3089m;

    public /* synthetic */ a(Object obj, int i) {
        this.f3088l = i;
        this.f3089m = obj;
    }

    @Override // M3.a
    public final Object d() {
        switch (this.f3088l) {
            case 0:
                return B0.h(((e) this.f3089m).f().getPackageName(), ".flutter.share_provider");
            default:
                ((AbstractActivityC0255w) this.f3089m).reportFullyDrawn();
                return null;
        }
    }
}

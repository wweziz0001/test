package F1;

import Q1.C;

/* JADX INFO: loaded from: classes.dex */
public final class i extends b {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f855e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i(int i, String str, String str2) {
        super(2, str, str2);
        this.f855e = i;
    }

    @Override // F1.c
    public final boolean b() {
        switch (this.f855e) {
            case 0:
                if (!super.b() || !C.f0("MULTI_PROCESS")) {
                    return false;
                }
                int i = E1.a.f636a;
                if (j.f856a.b()) {
                    return l.f859a.getStatics().isMultiProcessEnabled();
                }
                throw new UnsupportedOperationException("This method is not supported by the current version of the framework and the current WebView APK");
            default:
                if (C.f0("MULTI_PROFILE")) {
                    return super.b();
                }
                return false;
        }
    }
}

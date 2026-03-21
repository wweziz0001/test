package h0;

import a0.InterfaceC0162M;
import d0.InterfaceC0356i;

/* JADX INFO: renamed from: h0.v, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0470v implements InterfaceC0356i {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f6290l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ boolean f6291m;

    public /* synthetic */ C0470v(int i, boolean z4) {
        this.f6290l = i;
        this.f6291m = z4;
    }

    @Override // d0.InterfaceC0356i
    public final void c(Object obj) {
        InterfaceC0162M interfaceC0162M = (InterfaceC0162M) obj;
        switch (this.f6290l) {
            case 0:
                interfaceC0162M.onSkipSilenceEnabledChanged(this.f6291m);
                break;
            case 1:
                interfaceC0162M.onShuffleModeEnabledChanged(this.f6291m);
                break;
            default:
                interfaceC0162M.onSkipSilenceEnabledChanged(this.f6291m);
                break;
        }
    }
}

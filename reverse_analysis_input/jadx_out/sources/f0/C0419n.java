package f0;

import java.util.Map;

/* JADX INFO: renamed from: f0.n, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0419n implements l2.e {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f5705l;

    @Override // l2.e
    public final boolean apply(Object obj) {
        switch (this.f5705l) {
            case 0:
                if (((Map.Entry) obj).getKey() != null) {
                }
                break;
            default:
                if (((String) obj) != null) {
                }
                break;
        }
        return false;
    }
}

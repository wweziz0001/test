package N1;

import androidx.window.sidecar.SidecarDisplayFeature;

/* JADX INFO: loaded from: classes.dex */
public final class d extends N3.i implements M3.l {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final d f1581m = new d(1);

    @Override // M3.l
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Boolean c(SidecarDisplayFeature sidecarDisplayFeature) {
        N3.h.e(sidecarDisplayFeature, "$this$require");
        boolean z4 = true;
        if (sidecarDisplayFeature.getType() == 1 && sidecarDisplayFeature.getRect().width() != 0 && sidecarDisplayFeature.getRect().height() != 0) {
            z4 = false;
        }
        return Boolean.valueOf(z4);
    }
}

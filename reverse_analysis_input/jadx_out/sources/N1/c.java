package N1;

import androidx.window.sidecar.SidecarDisplayFeature;

/* JADX INFO: loaded from: classes.dex */
public final class c extends N3.i implements M3.l {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final c f1580m = new c(1);

    @Override // M3.l
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Boolean c(SidecarDisplayFeature sidecarDisplayFeature) {
        N3.h.e(sidecarDisplayFeature, "$this$require");
        return Boolean.valueOf((sidecarDisplayFeature.getRect().width() == 0 && sidecarDisplayFeature.getRect().height() == 0) ? false : true);
    }
}

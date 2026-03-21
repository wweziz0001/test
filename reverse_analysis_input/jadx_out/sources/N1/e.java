package N1;

import androidx.window.sidecar.SidecarDisplayFeature;

/* JADX INFO: loaded from: classes.dex */
public final class e extends N3.i implements M3.l {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final e f1582m = new e(1);

    @Override // M3.l
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Boolean c(SidecarDisplayFeature sidecarDisplayFeature) {
        N3.h.e(sidecarDisplayFeature, "$this$require");
        return Boolean.valueOf(sidecarDisplayFeature.getRect().left == 0 || sidecarDisplayFeature.getRect().top == 0);
    }
}

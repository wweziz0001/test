package A0;

import android.media.Spatializer;
import android.media.Spatializer$OnSpatializerStateChangedListener;
import m2.a0;

/* JADX INFO: loaded from: classes.dex */
public final class o implements Spatializer$OnSpatializerStateChangedListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ u f119a;

    public o(u uVar) {
        this.f119a = uVar;
    }

    public final void onSpatializerAvailableChanged(Spatializer spatializer, boolean z4) {
        u uVar = this.f119a;
        a0 a0Var = u.f151j;
        uVar.e();
    }

    public final void onSpatializerEnabledChanged(Spatializer spatializer, boolean z4) {
        u uVar = this.f119a;
        a0 a0Var = u.f151j;
        uVar.e();
    }
}

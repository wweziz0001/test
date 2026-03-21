package A3;

import Z1.e;
import android.widget.Toast$Callback;

/* JADX INFO: loaded from: classes.dex */
public final class d extends Toast$Callback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ e f176a;

    public d(e eVar) {
        this.f176a = eVar;
    }

    public final void onToastHidden() {
        super.onToastHidden();
        this.f176a.f3002n = null;
    }
}

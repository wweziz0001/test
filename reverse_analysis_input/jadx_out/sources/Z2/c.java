package Z2;

import android.content.Intent;
import dev.fluttercommunity.plus.share.SharePlusPendingIntent;
import java.util.concurrent.atomic.AtomicBoolean;
import n3.InterfaceC0709s;

/* JADX INFO: loaded from: classes.dex */
public final class c implements InterfaceC0709s {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public P2.c f3093l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public AtomicBoolean f3094m;

    @Override // n3.InterfaceC0709s
    public final boolean onActivityResult(int i, int i5, Intent intent) {
        P2.c cVar;
        if (i != 22643) {
            return false;
        }
        String str = SharePlusPendingIntent.f5450a;
        if (this.f3094m.compareAndSet(false, true) && (cVar = this.f3093l) != null) {
            cVar.success(str);
            this.f3093l = null;
        }
        return true;
    }
}

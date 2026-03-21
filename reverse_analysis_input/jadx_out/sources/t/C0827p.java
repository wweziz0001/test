package t;

import android.app.Notification;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/* JADX INFO: renamed from: t.p, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0827p extends Q1.D {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f9759e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Object f9760f;

    public C0827p(int i) {
        this.f9759e = i;
        switch (i) {
            case 1:
                this.f9760f = new ArrayList();
                break;
        }
    }

    @Override // Q1.D
    public final void b(a1.j jVar) {
        switch (this.f9759e) {
            case 0:
                Notification.BigTextStyle bigTextStyleBigText = new Notification.BigTextStyle((Notification.Builder) jVar.f3517n).setBigContentTitle((CharSequence) this.f1789c).bigText((CharSequence) this.f9760f);
                if (this.f1787a) {
                    bigTextStyleBigText.setSummaryText((CharSequence) this.f1790d);
                }
                break;
            default:
                Notification.InboxStyle bigContentTitle = new Notification.InboxStyle((Notification.Builder) jVar.f3517n).setBigContentTitle((CharSequence) this.f1789c);
                if (this.f1787a) {
                    bigContentTitle.setSummaryText((CharSequence) this.f1790d);
                }
                Iterator it = ((ArrayList) this.f9760f).iterator();
                while (it.hasNext()) {
                    bigContentTitle.addLine((CharSequence) it.next());
                }
                break;
        }
    }

    @Override // Q1.D
    public final String e() {
        switch (this.f9759e) {
            case 0:
                return "androidx.core.app.NotificationCompat$BigTextStyle";
            default:
                return "androidx.core.app.NotificationCompat$InboxStyle";
        }
    }

    @Override // Q1.D
    public final void g(Bundle bundle) {
        switch (this.f9759e) {
            case 0:
                super.g(bundle);
                this.f9760f = bundle.getCharSequence("android.bigText");
                break;
            default:
                super.g(bundle);
                ArrayList arrayList = (ArrayList) this.f9760f;
                arrayList.clear();
                if (bundle.containsKey("android.textLines")) {
                    Collections.addAll(arrayList, bundle.getCharSequenceArray("android.textLines"));
                }
                break;
        }
    }
}

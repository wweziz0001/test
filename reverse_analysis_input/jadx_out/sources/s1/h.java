package s1;

import android.os.IInterface;
import android.os.RemoteCallbackList;
import androidx.room.MultiInstanceInvalidationService;

/* JADX INFO: loaded from: classes.dex */
public final class h extends RemoteCallbackList {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ MultiInstanceInvalidationService f9583a;

    public h(MultiInstanceInvalidationService multiInstanceInvalidationService) {
        this.f9583a = multiInstanceInvalidationService;
    }

    @Override // android.os.RemoteCallbackList
    public final void onCallbackDied(IInterface iInterface, Object obj) {
        N3.h.e((C0788d) iInterface, "callback");
        N3.h.e(obj, "cookie");
        this.f9583a.f4763m.remove((Integer) obj);
    }
}

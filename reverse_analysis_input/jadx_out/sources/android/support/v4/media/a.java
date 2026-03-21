package android.support.v4.media;

import android.os.BadParcelableException;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.Messenger;
import android.support.v4.media.session.y;
import android.util.Log;
import b3.AbstractC0307a;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
public final class a extends Handler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WeakReference f3656a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public WeakReference f3657b;

    public a(e eVar) {
        this.f3656a = new WeakReference(eVar);
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        WeakReference weakReference = this.f3657b;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        WeakReference weakReference2 = this.f3656a;
        if (weakReference2.get() == null) {
            return;
        }
        Bundle data = message.getData();
        y.a(data);
        e eVar = (e) weakReference2.get();
        Messenger messenger = (Messenger) this.f3657b.get();
        try {
            int i = message.what;
            if (i == 1) {
                y.a(data.getBundle("data_root_hints"));
                data.getString("data_media_item_id");
                eVar.getClass();
            } else if (i == 2) {
                eVar.getClass();
            } else if (i != 3) {
                Log.w("MediaBrowserCompat", "Unhandled message: " + message + "\n  Client version: 1\n  Service version: " + message.arg1);
            } else {
                y.a(data.getBundle("data_options"));
                y.a(data.getBundle("data_notify_children_changed_options"));
                String string = data.getString("data_media_item_id");
                data.getParcelableArrayList("data_media_item_list");
                if (eVar.f3665g == messenger) {
                    AbstractC0307a.q(eVar.f3663e.getOrDefault(string, null));
                    if (g.f3667b) {
                        Log.d("MediaBrowserCompat", "onLoadChildren for id that isn't subscribed id=" + string);
                    }
                }
            }
        } catch (BadParcelableException unused) {
            Log.e("MediaBrowserCompat", "Could not unparcel the data.");
            if (message.what == 1) {
                eVar.getClass();
            }
        }
    }
}

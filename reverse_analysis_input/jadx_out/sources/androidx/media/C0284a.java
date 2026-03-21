package androidx.media;

import android.media.AudioAttributes;
import android.media.browse.MediaBrowser;
import android.os.Bundle;
import android.os.Message;
import android.os.Messenger;
import android.os.Parcel;
import android.os.RemoteException;
import android.service.media.MediaBrowserService;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: androidx.media.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0284a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f4576a;

    public AudioAttributesImpl a() {
        return new AudioAttributesImplApi21(((AudioAttributes.Builder) this.f4576a).build());
    }

    public void b(String str, List list, Bundle bundle, Bundle bundle2) throws RemoteException {
        Bundle bundle3 = new Bundle();
        bundle3.putString("data_media_item_id", str);
        bundle3.putBundle("data_options", bundle);
        bundle3.putBundle("data_notify_children_changed_options", bundle2);
        if (list != null) {
            bundle3.putParcelableArrayList("data_media_item_list", list instanceof ArrayList ? (ArrayList) list : new ArrayList<>(list));
        }
        c(3, bundle3);
    }

    public void c(int i, Bundle bundle) throws RemoteException {
        Message messageObtain = Message.obtain();
        messageObtain.what = i;
        messageObtain.arg1 = 2;
        messageObtain.setData(bundle);
        ((Messenger) this.f4576a).send(messageObtain);
    }

    public void d(Object obj) {
        boolean z4 = obj instanceof List;
        ArrayList arrayList = null;
        MediaBrowserService.Result result = (MediaBrowserService.Result) this.f4576a;
        if (!z4) {
            if (!(obj instanceof Parcel)) {
                result.sendResult(null);
                return;
            }
            Parcel parcel = (Parcel) obj;
            parcel.setDataPosition(0);
            result.sendResult(MediaBrowser.MediaItem.CREATOR.createFromParcel(parcel));
            parcel.recycle();
            return;
        }
        List<Parcel> list = (List) obj;
        if (list != null) {
            arrayList = new ArrayList(list.size());
            for (Parcel parcel2 : list) {
                parcel2.setDataPosition(0);
                arrayList.add((MediaBrowser.MediaItem) MediaBrowser.MediaItem.CREATOR.createFromParcel(parcel2));
                parcel2.recycle();
            }
        }
        result.sendResult(arrayList);
    }

    public C0284a e(int i) {
        if (i == 16) {
            i = 12;
        }
        ((AudioAttributes.Builder) this.f4576a).setUsage(i);
        return this;
    }

    public /* bridge */ C0284a f(int i) {
        return e(i);
    }

    public C0284a() {
        this.f4576a = new AudioAttributes.Builder();
    }
}

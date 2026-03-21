package androidx.media;

import android.os.Bundle;
import android.os.Parcelable;
import android.os.RemoteException;
import android.support.v4.media.MediaBrowserCompat$MediaItem;
import c.InterfaceC0315b;
import java.util.List;

/* JADX INFO: renamed from: androidx.media.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0291h extends u {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f4590e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ c.d f4591f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0291h(String str, c.d dVar, int i) {
        super(str);
        this.f4590e = i;
        this.f4591f = dVar;
    }

    @Override // androidx.media.u
    public void c(Bundle bundle) {
        switch (this.f4590e) {
            case 2:
                InterfaceC0315b interfaceC0315b = this.f4591f.f4958l;
                if (interfaceC0315b != null) {
                    try {
                        interfaceC0315b.a0(-1, bundle);
                    } catch (RemoteException unused) {
                        return;
                    }
                }
                break;
            default:
                super.c(bundle);
                break;
        }
    }

    @Override // androidx.media.u
    public final void d(Object obj) {
        switch (this.f4590e) {
            case 0:
                Bundle bundle = new Bundle();
                bundle.putParcelable(A.KEY_MEDIA_ITEM, (MediaBrowserCompat$MediaItem) obj);
                InterfaceC0315b interfaceC0315b = this.f4591f.f4958l;
                if (interfaceC0315b != null) {
                    try {
                        interfaceC0315b.a0(0, bundle);
                    } catch (RemoteException unused) {
                        return;
                    }
                }
                break;
            case 1:
                List list = (List) obj;
                c.d dVar = this.f4591f;
                try {
                    if (list == null) {
                        InterfaceC0315b interfaceC0315b2 = dVar.f4958l;
                        if (interfaceC0315b2 != null) {
                            interfaceC0315b2.a0(-1, null);
                        }
                    } else {
                        Bundle bundle2 = new Bundle();
                        bundle2.putParcelableArray(A.KEY_SEARCH_RESULTS, (Parcelable[]) list.toArray(new MediaBrowserCompat$MediaItem[0]));
                        InterfaceC0315b interfaceC0315b3 = dVar.f4958l;
                        if (interfaceC0315b3 != null) {
                            interfaceC0315b3.a0(0, bundle2);
                        }
                    }
                } catch (RemoteException unused2) {
                    return;
                }
                break;
            default:
                Bundle bundle3 = (Bundle) obj;
                InterfaceC0315b interfaceC0315b4 = this.f4591f.f4958l;
                if (interfaceC0315b4 != null) {
                    try {
                        interfaceC0315b4.a0(0, bundle3);
                    } catch (RemoteException unused3) {
                        return;
                    }
                }
                break;
        }
    }
}

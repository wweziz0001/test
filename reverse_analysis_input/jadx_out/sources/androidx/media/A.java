package androidx.media;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Message;
import android.support.v4.media.MediaBrowserCompat$MediaItem;
import android.support.v4.media.session.MediaSessionCompat$Token;
import android.text.TextUtils;
import android.util.Log;
import b3.AbstractC0307a;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import q.C0735e;

/* JADX INFO: loaded from: classes.dex */
public abstract class A extends Service {
    private static final float EPSILON = 1.0E-5f;
    public static final String KEY_MEDIA_ITEM = "media_item";
    public static final String KEY_SEARCH_RESULTS = "search_results";
    public static final int RESULT_ERROR = -1;
    static final int RESULT_FLAG_ON_LOAD_ITEM_NOT_IMPLEMENTED = 2;
    static final int RESULT_FLAG_ON_SEARCH_NOT_IMPLEMENTED = 4;
    static final int RESULT_FLAG_OPTION_NOT_HANDLED = 1;
    public static final int RESULT_OK = 0;
    public static final int RESULT_PROGRESS_UPDATE = 1;
    public static final String SERVICE_INTERFACE = "android.media.browse.MediaBrowserService";
    k mCurConnection;
    final z mHandler;
    private l mImpl;
    MediaSessionCompat$Token mSession;
    static final String TAG = "MBServiceCompat";
    static final boolean DEBUG = Log.isLoggable(TAG, 3);
    private final y mServiceBinderImpl = new y(this);
    final k mConnectionFromFwk = new k(this, "android.media.session.MediaController", -1, -1, null, null);
    final ArrayList<k> mPendingConnections = new ArrayList<>();
    final C0735e mConnections = new C0735e();

    public A() {
        z zVar = new z();
        zVar.f4644a = this;
        this.mHandler = zVar;
    }

    public void addSubscription(String str, k kVar, IBinder iBinder, Bundle bundle) {
        List<C.b> arrayList = (List) kVar.f4601g.get(str);
        if (arrayList == null) {
            arrayList = new ArrayList();
        }
        for (C.b bVar : arrayList) {
            if (iBinder == bVar.f276a) {
                Bundle bundle2 = (Bundle) bVar.f277b;
                if (bundle == bundle2) {
                    return;
                }
                if (bundle == null) {
                    if (bundle2.getInt("android.media.browse.extra.PAGE", -1) == -1 && bundle2.getInt("android.media.browse.extra.PAGE_SIZE", -1) == -1) {
                        return;
                    }
                } else if (bundle2 == null) {
                    if (bundle.getInt("android.media.browse.extra.PAGE", -1) == -1 && bundle.getInt("android.media.browse.extra.PAGE_SIZE", -1) == -1) {
                        return;
                    }
                } else if (bundle.getInt("android.media.browse.extra.PAGE", -1) == bundle2.getInt("android.media.browse.extra.PAGE", -1) && bundle.getInt("android.media.browse.extra.PAGE_SIZE", -1) == bundle2.getInt("android.media.browse.extra.PAGE_SIZE", -1)) {
                    return;
                }
            }
        }
        arrayList.add(new C.b(iBinder, bundle));
        kVar.f4601g.put(str, arrayList);
        performLoadChildren(str, kVar, bundle, null);
        this.mCurConnection = kVar;
        onSubscribe(str, bundle);
        this.mCurConnection = null;
    }

    public List<MediaBrowserCompat$MediaItem> applyOptions(List<MediaBrowserCompat$MediaItem> list, Bundle bundle) {
        if (list == null) {
            return null;
        }
        int i = bundle.getInt("android.media.browse.extra.PAGE", -1);
        int i5 = bundle.getInt("android.media.browse.extra.PAGE_SIZE", -1);
        if (i == -1 && i5 == -1) {
            return list;
        }
        int i6 = i5 * i;
        int size = i6 + i5;
        if (i < 0 || i5 < 1 || i6 >= list.size()) {
            return Collections.emptyList();
        }
        if (size > list.size()) {
            size = list.size();
        }
        return list.subList(i6, size);
    }

    public void attachToBaseContext(Context context) {
        attachBaseContext(context);
    }

    @Override // android.app.Service
    public void dump(FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
    }

    public final Bundle getBrowserRootHints() {
        return this.mImpl.b();
    }

    public final B getCurrentBrowserInfo() {
        return this.mImpl.a();
    }

    public MediaSessionCompat$Token getSessionToken() {
        return this.mSession;
    }

    public void handleMessageInternal(Message message) {
        Bundle data = message.getData();
        switch (message.what) {
            case 1:
                Bundle bundle = data.getBundle("data_root_hints");
                android.support.v4.media.session.y.a(bundle);
                y yVar = this.mServiceBinderImpl;
                String string = data.getString("data_package_name");
                int i = data.getInt("data_calling_pid");
                int i5 = data.getInt("data_calling_uid");
                C0284a c0284a = new C0284a(message.replyTo);
                A a5 = yVar.f4643a;
                if (a5.isValidPackage(string, i5)) {
                    a5.mHandler.a(new v(yVar, c0284a, string, i, i5, bundle));
                    return;
                }
                throw new IllegalArgumentException("Package/uid mismatch: uid=" + i5 + " package=" + string);
            case 2:
                y yVar2 = this.mServiceBinderImpl;
                yVar2.f4643a.mHandler.a(new w(yVar2, 0, new C0284a(message.replyTo)));
                return;
            case 3:
                Bundle bundle2 = data.getBundle("data_options");
                android.support.v4.media.session.y.a(bundle2);
                y yVar3 = this.mServiceBinderImpl;
                yVar3.f4643a.mHandler.a(new x(yVar3, new C0284a(message.replyTo), data.getString("data_media_item_id"), data.getBinder("data_callback_token"), bundle2));
                return;
            case 4:
                y yVar4 = this.mServiceBinderImpl;
                yVar4.f4643a.mHandler.a(new o(yVar4, new C0284a(message.replyTo), data.getString("data_media_item_id"), data.getBinder("data_callback_token"), 1));
                return;
            case 5:
                y yVar5 = this.mServiceBinderImpl;
                String string2 = data.getString("data_media_item_id");
                c.d dVar = (c.d) data.getParcelable("data_result_receiver");
                C0284a c0284a2 = new C0284a(message.replyTo);
                yVar5.getClass();
                if (TextUtils.isEmpty(string2) || dVar == null) {
                    return;
                }
                yVar5.f4643a.mHandler.a(new o(yVar5, c0284a2, string2, dVar, 2));
                return;
            case O.j.STRING_SET_FIELD_NUMBER /* 6 */:
                Bundle bundle3 = data.getBundle("data_root_hints");
                android.support.v4.media.session.y.a(bundle3);
                y yVar6 = this.mServiceBinderImpl;
                yVar6.f4643a.mHandler.a(new v(yVar6, new C0284a(message.replyTo), data.getInt("data_calling_uid"), data.getString("data_package_name"), data.getInt("data_calling_pid"), bundle3));
                return;
            case O.j.DOUBLE_FIELD_NUMBER /* 7 */:
                y yVar7 = this.mServiceBinderImpl;
                yVar7.f4643a.mHandler.a(new w(yVar7, 1, new C0284a(message.replyTo)));
                return;
            case O.j.BYTES_FIELD_NUMBER /* 8 */:
                Bundle bundle4 = data.getBundle("data_search_extras");
                android.support.v4.media.session.y.a(bundle4);
                y yVar8 = this.mServiceBinderImpl;
                String string3 = data.getString("data_search_query");
                c.d dVar2 = (c.d) data.getParcelable("data_result_receiver");
                C0284a c0284a3 = new C0284a(message.replyTo);
                yVar8.getClass();
                if (TextUtils.isEmpty(string3) || dVar2 == null) {
                    return;
                }
                yVar8.f4643a.mHandler.a(new x(yVar8, c0284a3, string3, bundle4, dVar2, 0));
                return;
            case 9:
                Bundle bundle5 = data.getBundle("data_custom_action_extras");
                android.support.v4.media.session.y.a(bundle5);
                y yVar9 = this.mServiceBinderImpl;
                String string4 = data.getString("data_custom_action");
                c.d dVar3 = (c.d) data.getParcelable("data_result_receiver");
                C0284a c0284a4 = new C0284a(message.replyTo);
                yVar9.getClass();
                if (TextUtils.isEmpty(string4) || dVar3 == null) {
                    return;
                }
                yVar9.f4643a.mHandler.a(new x(yVar9, c0284a4, string4, bundle5, dVar3, 1));
                return;
            default:
                Log.w(TAG, "Unhandled message: " + message + "\n  Service version: 2\n  Client version: " + message.arg1);
                return;
        }
    }

    public boolean isValidPackage(String str, int i) {
        if (str == null) {
            return false;
        }
        for (String str2 : getPackageManager().getPackagesForUid(i)) {
            if (str2.equals(str)) {
                return true;
            }
        }
        return false;
    }

    public void notifyChildrenChanged(String str) {
        if (str == null) {
            throw new IllegalArgumentException("parentId cannot be null in notifyChildrenChanged");
        }
        this.mImpl.c(str, null);
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return ((q) this.mImpl).f4616b.onBind(intent);
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        int i = Build.VERSION.SDK_INT;
        if (i >= 28) {
            this.mImpl = new t(this);
        } else if (i >= 26) {
            this.mImpl = new s(this);
        } else {
            this.mImpl = new q(this);
        }
        this.mImpl.onCreate();
    }

    public void onCustomAction(String str, Bundle bundle, u uVar) {
        uVar.e(null);
    }

    @Override // android.app.Service
    public void onDestroy() {
        this.mHandler.f4644a = null;
    }

    public abstract C0292i onGetRoot(String str, int i, Bundle bundle);

    public abstract void onLoadChildren(String str, u uVar);

    public abstract void onLoadChildren(String str, u uVar, Bundle bundle);

    public abstract void onLoadItem(String str, u uVar);

    public abstract void onSearch(String str, Bundle bundle, u uVar);

    public void onSubscribe(String str, Bundle bundle) {
    }

    public void onUnsubscribe(String str) {
    }

    public void performCustomAction(String str, Bundle bundle, k kVar, c.d dVar) {
        C0291h c0291h = new C0291h(str, dVar, 2);
        this.mCurConnection = kVar;
        onCustomAction(str, bundle, c0291h);
        this.mCurConnection = null;
        if (c0291h.b()) {
            return;
        }
        throw new IllegalStateException("onCustomAction must call detach() or sendResult() or sendError() before returning for action=" + str + " extras=" + bundle);
    }

    public void performLoadChildren(String str, k kVar, Bundle bundle, Bundle bundle2) {
        C0290g c0290g = new C0290g(this, str, kVar, str, bundle, bundle2);
        this.mCurConnection = kVar;
        if (bundle == null) {
            onLoadChildren(str, c0290g);
        } else {
            onLoadChildren(str, c0290g, bundle);
        }
        this.mCurConnection = null;
        if (c0290g.b()) {
            return;
        }
        throw new IllegalStateException("onLoadChildren must call detach() or sendResult() before returning for package=" + kVar.f4595a + " id=" + str);
    }

    public void performLoadItem(String str, k kVar, c.d dVar) {
        C0291h c0291h = new C0291h(str, dVar, 0);
        this.mCurConnection = kVar;
        onLoadItem(str, c0291h);
        this.mCurConnection = null;
        if (!c0291h.b()) {
            throw new IllegalStateException(AbstractC0307a.j("onLoadItem must call detach() or sendResult() before returning for id=", str));
        }
    }

    public void performSearch(String str, Bundle bundle, k kVar, c.d dVar) {
        C0291h c0291h = new C0291h(str, dVar, 1);
        this.mCurConnection = kVar;
        onSearch(str, bundle, c0291h);
        this.mCurConnection = null;
        if (!c0291h.b()) {
            throw new IllegalStateException(AbstractC0307a.j("onSearch must call detach() or sendResult() before returning for query=", str));
        }
    }

    public boolean removeSubscription(String str, k kVar, IBinder iBinder) {
        boolean z4 = false;
        try {
            if (iBinder != null) {
                List list = (List) kVar.f4601g.get(str);
                if (list != null) {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        if (iBinder == ((C.b) it.next()).f276a) {
                            it.remove();
                            z4 = true;
                        }
                    }
                    if (list.size() == 0) {
                        kVar.f4601g.remove(str);
                    }
                }
            } else if (kVar.f4601g.remove(str) != null) {
                z4 = true;
            }
            return z4;
        } finally {
            this.mCurConnection = kVar;
            onUnsubscribe(str);
            this.mCurConnection = null;
        }
    }

    public void setSessionToken(MediaSessionCompat$Token mediaSessionCompat$Token) {
        if (mediaSessionCompat$Token == null) {
            throw new IllegalArgumentException("Session token may not be null");
        }
        if (this.mSession != null) {
            throw new IllegalStateException("The session token has already been set");
        }
        this.mSession = mediaSessionCompat$Token;
        this.mImpl.d(mediaSessionCompat$Token);
    }

    public void notifyChildrenChanged(String str, Bundle bundle) {
        if (str == null) {
            throw new IllegalArgumentException("parentId cannot be null in notifyChildrenChanged");
        }
        if (bundle != null) {
            this.mImpl.c(str, bundle);
            return;
        }
        throw new IllegalArgumentException("options cannot be null in notifyChildrenChanged");
    }

    public void notifyChildrenChanged(B b4, String str, Bundle bundle) {
        if (b4 == null) {
            throw new IllegalArgumentException("remoteUserInfo cannot be null in notifyChildrenChanged");
        }
        if (str == null) {
            throw new IllegalArgumentException("parentId cannot be null in notifyChildrenChanged");
        }
        if (bundle != null) {
            this.mImpl.e(b4, str, bundle);
            return;
        }
        throw new IllegalArgumentException("options cannot be null in notifyChildrenChanged");
    }
}

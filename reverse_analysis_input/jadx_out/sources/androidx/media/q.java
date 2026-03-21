package androidx.media;

import android.os.Bundle;
import android.os.Messenger;
import android.support.v4.media.session.MediaSessionCompat$Token;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class q implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f4615a = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public p f4616b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Messenger f4617c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ A f4618d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ A f4619e;

    public q(A a5) {
        this.f4619e = a5;
        this.f4618d = a5;
    }

    @Override // androidx.media.l
    public B a() {
        k kVar = this.f4618d.mCurConnection;
        if (kVar != null) {
            return kVar.f4598d;
        }
        throw new IllegalStateException("This should be called inside of onGetRoot, onLoadChildren, onLoadItem, onSearch, or onCustomAction methods");
    }

    @Override // androidx.media.l
    public Bundle b() {
        if (this.f4617c == null) {
            return null;
        }
        A a5 = this.f4618d;
        k kVar = a5.mCurConnection;
        if (kVar == null) {
            throw new IllegalStateException("This should be called inside of onGetRoot, onLoadChildren, onLoadItem, onSearch, or onCustomAction methods");
        }
        if (kVar.f4599e == null) {
            return null;
        }
        return new Bundle(a5.mCurConnection.f4599e);
    }

    @Override // androidx.media.l
    public final void c(String str, Bundle bundle) {
        g(str, bundle);
        this.f4618d.mHandler.post(new n(this, str, bundle));
    }

    @Override // androidx.media.l
    public final void d(MediaSessionCompat$Token mediaSessionCompat$Token) {
        this.f4618d.mHandler.a(new w(this, 2, mediaSessionCompat$Token));
    }

    @Override // androidx.media.l
    public final void e(B b4, String str, Bundle bundle) {
        this.f4618d.mHandler.post(new o(this, b4, str, bundle, 0));
    }

    public final void f(k kVar, String str, Bundle bundle) {
        int i;
        int i5;
        List<C.b> list = (List) kVar.f4601g.get(str);
        if (list != null) {
            for (C.b bVar : list) {
                Bundle bundle2 = (Bundle) bVar.f277b;
                int i6 = bundle == null ? -1 : bundle.getInt("android.media.browse.extra.PAGE", -1);
                int i7 = bundle2 == null ? -1 : bundle2.getInt("android.media.browse.extra.PAGE", -1);
                int i8 = bundle == null ? -1 : bundle.getInt("android.media.browse.extra.PAGE_SIZE", -1);
                int i9 = bundle2 == null ? -1 : bundle2.getInt("android.media.browse.extra.PAGE_SIZE", -1);
                int i10 = Integer.MAX_VALUE;
                int i11 = 0;
                if (i6 == -1 || i8 == -1) {
                    i = Integer.MAX_VALUE;
                    i5 = 0;
                } else {
                    i5 = i6 * i8;
                    i = (i8 + i5) - 1;
                }
                if (i7 != -1 && i9 != -1) {
                    i11 = i9 * i7;
                    i10 = (i9 + i11) - 1;
                }
                if (i >= i11 && i10 >= i5) {
                    this.f4618d.performLoadChildren(str, kVar, (Bundle) bVar.f277b, bundle);
                }
            }
        }
    }

    public void g(String str, Bundle bundle) {
        this.f4616b.notifyChildrenChanged(str);
    }

    @Override // androidx.media.l
    public void onCreate() {
        p pVar = new p(this, this.f4619e);
        this.f4616b = pVar;
        pVar.onCreate();
    }
}

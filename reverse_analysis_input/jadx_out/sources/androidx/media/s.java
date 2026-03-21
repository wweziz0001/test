package androidx.media;

import android.os.Bundle;

/* JADX INFO: loaded from: classes.dex */
public class s extends q {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ A f4621f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(A a5) {
        super(a5);
        this.f4621f = a5;
    }

    @Override // androidx.media.q, androidx.media.l
    public final Bundle b() {
        A a5 = this.f4621f;
        k kVar = a5.mCurConnection;
        if (kVar == null) {
            throw new IllegalStateException("This should be called inside of onGetRoot, onLoadChildren, onLoadItem, onSearch, or onCustomAction methods");
        }
        if (kVar == a5.mConnectionFromFwk) {
            return this.f4616b.getBrowserRootHints();
        }
        if (kVar.f4599e == null) {
            return null;
        }
        return new Bundle(a5.mCurConnection.f4599e);
    }

    @Override // androidx.media.q
    public final void g(String str, Bundle bundle) {
        if (bundle != null) {
            this.f4616b.notifyChildrenChanged(str, bundle);
        } else {
            super.g(str, bundle);
        }
    }

    @Override // androidx.media.q, androidx.media.l
    public final void onCreate() {
        r rVar = new r(this, this.f4621f);
        this.f4616b = rVar;
        rVar.onCreate();
    }
}

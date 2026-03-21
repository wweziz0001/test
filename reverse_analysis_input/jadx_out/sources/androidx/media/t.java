package androidx.media;

/* JADX INFO: loaded from: classes.dex */
public final class t extends s {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ A f4622g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(A a5) {
        super(a5);
        this.f4622g = a5;
    }

    @Override // androidx.media.q, androidx.media.l
    public final B a() {
        A a5 = this.f4622g;
        k kVar = a5.mCurConnection;
        if (kVar != null) {
            return kVar == a5.mConnectionFromFwk ? new B(this.f4616b.getCurrentBrowserInfo()) : kVar.f4598d;
        }
        throw new IllegalStateException("This should be called inside of onGetRoot, onLoadChildren, onLoadItem, onSearch, or onCustomAction methods");
    }
}

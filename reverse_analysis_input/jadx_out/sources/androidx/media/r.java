package androidx.media;

import android.content.Context;
import android.os.Bundle;
import android.service.media.MediaBrowserService;

/* JADX INFO: loaded from: classes.dex */
public final class r extends p {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ s f4620n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(s sVar, Context context) {
        super(sVar, context);
        this.f4620n = sVar;
    }

    @Override // android.service.media.MediaBrowserService
    public final void onLoadChildren(String str, MediaBrowserService.Result result, Bundle bundle) {
        android.support.v4.media.session.y.a(bundle);
        s sVar = this.f4620n;
        A a5 = sVar.f4621f;
        k kVar = a5.mConnectionFromFwk;
        m mVar = new m(sVar, str, new C0284a(result), bundle);
        a5.mCurConnection = kVar;
        a5.onLoadChildren(str, mVar, bundle);
        a5.mCurConnection = null;
        sVar.f4621f.mCurConnection = null;
    }
}

package j0;

import android.content.ContentResolver;
import android.database.ContentObserver;
import android.net.Uri;
import android.os.Handler;

/* JADX INFO: loaded from: classes.dex */
public final class c extends ContentObserver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ContentResolver f7255a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Uri f7256b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ d f7257c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(d dVar, Handler handler, ContentResolver contentResolver, Uri uri) {
        super(handler);
        this.f7257c = dVar;
        this.f7255a = contentResolver;
        this.f7256b = uri;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z4) {
        d dVar = this.f7257c;
        dVar.a(C0522b.b(dVar.f7258a, dVar.i, dVar.f7265h));
    }
}

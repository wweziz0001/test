package androidx.media;

import android.os.Messenger;

/* JADX INFO: renamed from: androidx.media.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC0293j implements Runnable {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ k f4594l;

    public RunnableC0293j(k kVar) {
        this.f4594l = kVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        k kVar = this.f4594l;
        kVar.i.mConnections.remove(((Messenger) kVar.f4600f.f4576a).getBinder());
    }
}

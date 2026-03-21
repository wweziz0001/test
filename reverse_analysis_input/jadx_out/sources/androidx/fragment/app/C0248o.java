package androidx.fragment.app;

import android.os.Bundle;

/* JADX INFO: renamed from: androidx.fragment.app.o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0248o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ io.flutter.embedding.android.r f4397a;

    public C0248o(io.flutter.embedding.android.r rVar) {
        this.f4397a = rVar;
    }

    public final void a() {
        io.flutter.embedding.android.r rVar = this.f4397a;
        rVar.f4436b0.a();
        androidx.lifecycle.M.e(rVar);
        Bundle bundle = rVar.f4440m;
        rVar.f4436b0.b(bundle != null ? bundle.getBundle("registryState") : null);
    }
}

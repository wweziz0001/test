package androidx.lifecycle;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

/* JADX INFO: renamed from: androidx.lifecycle.x, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractServiceC0281x extends Service implements InterfaceC0278u {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Z1.s f4551l = new Z1.s(this);

    @Override // androidx.lifecycle.InterfaceC0278u
    public final AbstractC0274p getLifecycle() {
        return (C0280w) this.f4551l.f3085m;
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        N3.h.e(intent, "intent");
        this.f4551l.N(EnumC0272n.ON_START);
        return null;
    }

    @Override // android.app.Service
    public void onCreate() {
        this.f4551l.N(EnumC0272n.ON_CREATE);
        super.onCreate();
    }

    @Override // android.app.Service
    public void onDestroy() {
        EnumC0272n enumC0272n = EnumC0272n.ON_STOP;
        Z1.s sVar = this.f4551l;
        sVar.N(enumC0272n);
        sVar.N(EnumC0272n.ON_DESTROY);
        super.onDestroy();
    }

    @Override // android.app.Service
    public final void onStart(Intent intent, int i) {
        this.f4551l.N(EnumC0272n.ON_START);
        super.onStart(intent, i);
    }
}

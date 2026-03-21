package h0;

import F0.C0067n;
import android.content.Context;
import android.media.AudioManager;
import x0.C0980v;

/* JADX INFO: renamed from: h0.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0453d implements l2.h {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f6110l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Context f6111m;

    public /* synthetic */ C0453d(Context context, int i) {
        this.f6110l = i;
        this.f6111m = context;
    }

    @Override // l2.h
    public final Object get() {
        B0.i iVar;
        switch (this.f6110l) {
            case 0:
                AudioManager audioManager = (AudioManager) this.f6111m.getApplicationContext().getSystemService("audio");
                audioManager.getClass();
                return audioManager;
            case 1:
                return new C0980v(this.f6111m, new C0067n());
            case 2:
                return new A0.u(this.f6111m);
            case 3:
                Context context = this.f6111m;
                m2.b0 b0Var = B0.i.f203n;
                synchronized (B0.i.class) {
                    try {
                        if (B0.i.f209t == null) {
                            B0.h hVar = new B0.h(context);
                            B0.i.f209t = new B0.i(hVar.f198a, hVar.f199b, hVar.f200c, hVar.f201d, hVar.f202e);
                        }
                        iVar = B0.i.f209t;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return iVar;
            case 4:
                return new C0463n(this.f6111m);
            default:
                return new C0980v(this.f6111m, new C0067n());
        }
    }
}

package h3;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import b3.RunnableC0308b;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class c implements Runnable {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f6312l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ f f6313m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Context f6314n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Handler f6315o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ RunnableC0308b f6316p;

    public /* synthetic */ c(f fVar, Context context, Handler handler, RunnableC0308b runnableC0308b, int i) {
        this.f6312l = i;
        this.f6313m = fVar;
        this.f6314n = context;
        this.f6315o = handler;
        this.f6316p = runnableC0308b;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f6312l) {
            case 0:
                f fVar = this.f6313m;
                fVar.getClass();
                try {
                    Looper mainLooper = Looper.getMainLooper();
                    (Build.VERSION.SDK_INT >= 28 ? Handler.createAsync(mainLooper) : new Handler(mainLooper)).post(new c(fVar, this.f6314n, this.f6315o, this.f6316p, 1));
                    return;
                } catch (Exception e5) {
                    Log.e("FlutterLoader", "Flutter initialization failed.", e5);
                    throw new RuntimeException(e5);
                }
            default:
                f fVar2 = this.f6313m;
                fVar2.getClass();
                fVar2.a(this.f6314n.getApplicationContext(), null);
                this.f6315o.post(this.f6316p);
                return;
        }
    }
}

package Q;

import a0.AbstractC0156G;
import a0.C0190p;
import android.content.Context;
import d0.AbstractC0360m;
import d0.AbstractC0370w;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import n3.InterfaceC0705o;

/* JADX INFO: loaded from: classes.dex */
public final class n implements i, InterfaceC0705o, q0.k {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Context f1730l;

    public /* synthetic */ n(Context context, byte b4) {
        this.f1730l = context;
    }

    @Override // Q.i
    public void a(i4.a aVar) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), new a("EmojiCompatInitializer", 0));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        threadPoolExecutor.execute(new l(this, aVar, threadPoolExecutor, 0));
    }

    @Override // q0.k
    public q0.l i(y2.n nVar) {
        Context context;
        int i = AbstractC0370w.f5326a;
        if (i < 23 || (i < 31 && ((context = this.f1730l) == null || i < 28 || !context.getPackageManager().hasSystemFeature("com.amazon.hardware.tv_screen")))) {
            return new p1.b(4).i(nVar);
        }
        int iH = AbstractC0156G.h(((C0190p) nVar.f10956c).f3424n);
        AbstractC0360m.p("DMCodecAdapterFactory", "Creating an asynchronous MediaCodec adapter for track type " + AbstractC0370w.E(iH));
        return new Z1.e(iH).i(nVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:70:0x0207  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0228  */
    @Override // n3.InterfaceC0705o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onMethodCall(n3.C0704n r35, n3.InterfaceC0706p r36) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1352
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Q.n.onMethodCall(n3.n, n3.p):void");
    }

    public n(Context context, int i) {
        switch (i) {
            case 1:
                N3.h.e(context, "ctx");
                this.f1730l = context;
                break;
            default:
                this.f1730l = context.getApplicationContext();
                break;
        }
    }
}

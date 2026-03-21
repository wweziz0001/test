package dev.fluttercommunity.workmanager;

import B3.b;
import C3.r;
import P3.d;
import Q1.l;
import Q1.n;
import Q1.o;
import Q1.p;
import U3.e;
import Z1.m;
import a0.C0200z;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import androidx.work.WorkerParameters;
import b3.AbstractC0307a;
import b3.AbstractC0311e;
import b3.C0309c;
import b3.RunnableC0308b;
import e3.C0394c;
import h3.c;
import h3.f;
import io.flutter.embedding.engine.FlutterJNI;
import java.text.DateFormat;
import java.util.Date;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import n3.C0704n;
import n3.C0707q;
import n3.InterfaceC0705o;
import n3.InterfaceC0706p;
import q2.InterfaceFutureC0744b;
import r.C0747b;
import r.g;
import r.h;
import r.i;
import r.j;
import r.k;

/* JADX INFO: loaded from: classes.dex */
public final class BackgroundWorker extends p implements InterfaceC0705o {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final f f5451w;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final WorkerParameters f5452p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public C0707q f5453q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final int f5454r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public C0394c f5455s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public long f5456t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final h f5457u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final j f5458v;

    static {
        ((C0200z) m.z().f3025n).getClass();
        f5451w = new f(new FlutterJNI(), (ExecutorService) m.z().f3026o);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BackgroundWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        N3.h.e(context, "applicationContext");
        N3.h.e(workerParameters, "workerParams");
        this.f5452p = workerParameters;
        this.f5454r = new Random().nextInt();
        h hVar = new h();
        hVar.f9403c = new k();
        j jVar = new j(hVar);
        hVar.f9402b = jVar;
        hVar.f9401a = AbstractC0307a.class;
        try {
            this.f5457u = hVar;
        } catch (Exception e5) {
            i iVar = jVar.f9407b;
            iVar.getClass();
            if (g.f9396f.i(iVar, null, new C0747b(e5))) {
                g.c(iVar);
            }
        }
        this.f5458v = jVar;
    }

    @Override // Q1.p
    public final void b() {
        f(null);
    }

    @Override // Q1.p
    public final InterfaceFutureC0744b c() {
        this.f5456t = System.currentTimeMillis();
        Context context = this.f1832l;
        this.f5455s = new C0394c(context);
        f fVar = f5451w;
        if (!fVar.f6321a) {
            fVar.c(context);
        }
        Handler handler = new Handler(Looper.getMainLooper());
        RunnableC0308b runnableC0308b = new RunnableC0308b(this, 1);
        if (Looper.myLooper() != Looper.getMainLooper()) {
            throw new IllegalStateException("ensureInitializationComplete must be called on the main thread");
        }
        if (fVar.f6322b == null) {
            throw new IllegalStateException("ensureInitializationComplete must be called after startInitialization");
        }
        if (fVar.f6321a) {
            handler.post(runnableC0308b);
        } else {
            fVar.f6326f.execute(new c(fVar, this.f1832l, handler, runnableC0308b, 0));
        }
        return this.f5458v;
    }

    public final void f(o oVar) {
        h hVar;
        long jCurrentTimeMillis = System.currentTimeMillis() - this.f5456t;
        WorkerParameters workerParameters = this.f5452p;
        Object obj = workerParameters.f4779b.f1824a.get("be.tramckrijte.workmanager.IS_IN_DEBUG_MODE_KEY");
        if (obj instanceof Boolean ? ((Boolean) obj).booleanValue() : false) {
            DateFormat dateFormat = AbstractC0311e.f4915a;
            Context context = this.f1832l;
            N3.h.d(context, "getApplicationContext(...)");
            Object obj2 = workerParameters.f4779b.f1824a.get("be.tramckrijte.workmanager.DART_TASK");
            String str = obj2 instanceof String ? (String) obj2 : null;
            N3.h.b(str);
            Object obj3 = workerParameters.f4779b.f1824a.get("be.tramckrijte.workmanager.INPUT_DATA");
            String str2 = obj3 instanceof String ? (String) obj3 : null;
            o lVar = oVar == null ? new l() : oVar;
            StringBuilder sb = new StringBuilder();
            List listQ = C3.g.Q("👷\u200d♀️", "👷\u200d♂️");
            N3.h.e(d.f1700l, "random");
            if (listQ.isEmpty()) {
                throw new NoSuchElementException("Collection is empty.");
            }
            sb.append((String) listQ.get(d.f1701m.b(listQ.size())));
            sb.append(' ');
            sb.append(AbstractC0311e.f4915a.format(new Date()));
            String string = sb.toString();
            StringBuilder sb2 = new StringBuilder("\n            • Result: ");
            sb2.append(lVar instanceof n ? "🎉" : "🔥");
            sb2.append(' ');
            sb2.append(lVar.getClass().getSimpleName());
            sb2.append("\n            • dartTask: ");
            sb2.append(str);
            sb2.append("\n            • inputData: ");
            if (str2 == null) {
                str2 = "not found";
            }
            sb2.append(str2);
            sb2.append("\n            • Elapsed time: ");
            sb2.append(TimeUnit.MILLISECONDS.toSeconds(jCurrentTimeMillis) + " seconds.");
            sb2.append("\n            ");
            AbstractC0311e.a(context, this.f5454r, string, e.b0(sb2.toString()));
        }
        if (oVar != null && (hVar = this.f5457u) != null) {
            boolean z4 = true;
            hVar.f9404d = true;
            j jVar = hVar.f9402b;
            if (jVar != null) {
                i iVar = jVar.f9407b;
                iVar.getClass();
                if (g.f9396f.i(iVar, null, oVar)) {
                    g.c(iVar);
                } else {
                    z4 = false;
                }
                if (z4) {
                    hVar.f9401a = null;
                    hVar.f9402b = null;
                    hVar.f9403c = null;
                }
            }
        }
        new Handler(Looper.getMainLooper()).post(new RunnableC0308b(this, 0));
    }

    @Override // n3.InterfaceC0705o
    public final void onMethodCall(C0704n c0704n, InterfaceC0706p interfaceC0706p) {
        N3.h.e(c0704n, "call");
        if (N3.h.a(c0704n.f8938a, "backgroundChannelInitialized")) {
            C0707q c0707q = this.f5453q;
            if (c0707q == null) {
                N3.h.g("backgroundChannel");
                throw null;
            }
            WorkerParameters workerParameters = this.f5452p;
            Object obj = workerParameters.f4779b.f1824a.get("be.tramckrijte.workmanager.DART_TASK");
            String str = obj instanceof String ? (String) obj : null;
            N3.h.b(str);
            b bVar = new b("be.tramckrijte.workmanager.DART_TASK", str);
            Object obj2 = workerParameters.f4779b.f1824a.get("be.tramckrijte.workmanager.INPUT_DATA");
            c0707q.a("onResultSend", r.c0(bVar, new b("be.tramckrijte.workmanager.INPUT_DATA", obj2 instanceof String ? (String) obj2 : null)), new C0309c(this));
        }
    }
}

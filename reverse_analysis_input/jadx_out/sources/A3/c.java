package A3;

import D0.y;
import N3.h;
import N3.s;
import O.j;
import Q1.F;
import Q1.l;
import Q1.m;
import Q1.p;
import Q1.q;
import V3.J;
import V3.T;
import Z1.e;
import Z1.i;
import a.AbstractC0149a;
import a0.C0200z;
import a2.r;
import android.content.Context;
import android.graphics.Typeface;
import android.net.ConnectivityManager;
import android.os.HandlerThread;
import android.os.Trace;
import android.util.Log;
import android.widget.Toast;
import androidx.fragment.app.AbstractActivityC0255w;
import androidx.lifecycle.C0280w;
import androidx.lifecycle.EnumC0272n;
import androidx.work.CoroutineWorker;
import androidx.work.WorkerParameters;
import androidx.work.impl.workers.ConstraintTrackingWorker;
import b2.C0305a;
import b2.k;
import b3.AbstractC0307a;
import com.ryanheise.just_audio.AudioPlayer;
import d2.AbstractC0376a;
import j0.v;
import j0.x;
import java.nio.MappedByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import m3.C0675i;
import n3.C0698h;
import n3.InterfaceC0703m;
import q0.g;
import q2.InterfaceFutureC0744b;
import v0.C0910c;
import w.f;
import y3.C1031b;
import y3.C1032c;
import y3.C1034e;
import y3.C1037h;
import y3.C1038i;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class c implements Runnable {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f174l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Object f175m;

    public /* synthetic */ c(Object obj, int i) {
        this.f174l = i;
        this.f175m = obj;
    }

    private final void a() {
        ConstraintTrackingWorker constraintTrackingWorker = (ConstraintTrackingWorker) this.f175m;
        h.e(constraintTrackingWorker, "this$0");
        if (constraintTrackingWorker.f4819s.f4903a instanceof C0305a) {
            return;
        }
        Object obj = constraintTrackingWorker.f1833m.f4779b.f1824a.get("androidx.work.impl.workers.ConstraintTrackingWorker.ARGUMENT_CLASS_NAME");
        String str = obj instanceof String ? (String) obj : null;
        q qVarD = q.d();
        h.d(qVarD, "get()");
        if (str == null || str.length() == 0) {
            qVarD.b(AbstractC0376a.f5425a, "No worker to delegate to.");
            k kVar = constraintTrackingWorker.f4819s;
            h.d(kVar, "future");
            kVar.j(new l());
            return;
        }
        F f2 = constraintTrackingWorker.f1833m.f4782e;
        Context context = constraintTrackingWorker.f1832l;
        WorkerParameters workerParameters = constraintTrackingWorker.f4816p;
        f2.getClass();
        p pVarA = F.a(context, str, workerParameters);
        constraintTrackingWorker.f4820t = pVarA;
        if (pVarA == null) {
            qVarD.a(AbstractC0376a.f5425a, "No worker to delegate to.");
            k kVar2 = constraintTrackingWorker.f4819s;
            h.d(kVar2, "future");
            kVar2.j(new l());
            return;
        }
        R1.q qVarE0 = R1.q.E0(constraintTrackingWorker.f1832l);
        Z1.q qVarT = qVarE0.f1912e.t();
        String string = constraintTrackingWorker.f1833m.f4778a.toString();
        h.d(string, "id.toString()");
        Z1.p pVarM = qVarT.m(string);
        if (pVarM == null) {
            k kVar3 = constraintTrackingWorker.f4819s;
            h.d(kVar3, "future");
            String str2 = AbstractC0376a.f5425a;
            kVar3.j(new l());
            return;
        }
        i iVar = qVarE0.f1918l;
        h.d(iVar, "workManagerImpl.trackers");
        V1.h hVar = new V1.h(iVar);
        J j5 = (J) qVarE0.f1913f.f3013m;
        h.d(j5, "workManagerImpl.workTask…r.taskCoroutineDispatcher");
        constraintTrackingWorker.f4819s.a(new c(V1.k.a(hVar, pVarM, j5, constraintTrackingWorker), 12), new r());
        if (!hVar.b(pVarM)) {
            qVarD.a(AbstractC0376a.f5425a, "Constraints not met for delegate " + str + ". Requesting retry.");
            k kVar4 = constraintTrackingWorker.f4819s;
            h.d(kVar4, "future");
            kVar4.j(new m());
            return;
        }
        qVarD.a(AbstractC0376a.f5425a, "Constraints met for delegate ".concat(str));
        try {
            p pVar = constraintTrackingWorker.f4820t;
            h.b(pVar);
            InterfaceFutureC0744b interfaceFutureC0744bC = pVar.c();
            h.d(interfaceFutureC0744bC, "delegate!!.startWork()");
            interfaceFutureC0744bC.a(new y(constraintTrackingWorker, 13, interfaceFutureC0744bC), constraintTrackingWorker.f1833m.f4780c);
        } catch (Throwable th) {
            String str3 = AbstractC0376a.f5425a;
            String strK = AbstractC0307a.k("Delegated worker ", str, " threw exception in startWork.");
            if (qVarD.f1838a <= 3) {
                Log.d(str3, strK, th);
            }
            synchronized (constraintTrackingWorker.f4817q) {
                try {
                    if (!constraintTrackingWorker.f4818r) {
                        k kVar5 = constraintTrackingWorker.f4819s;
                        h.d(kVar5, "future");
                        kVar5.j(new l());
                    } else {
                        qVarD.a(str3, "Constraints were unmet, Retrying.");
                        k kVar6 = constraintTrackingWorker.f4819s;
                        h.d(kVar6, "future");
                        kVar6.j(new m());
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    private final void b() {
        g gVar = (g) this.f175m;
        synchronized (gVar.f9267a) {
            try {
                if (gVar.f9278m) {
                    return;
                }
                long j5 = gVar.f9277l - 1;
                gVar.f9277l = j5;
                if (j5 > 0) {
                    return;
                }
                if (j5 >= 0) {
                    gVar.a();
                    return;
                }
                IllegalStateException illegalStateException = new IllegalStateException();
                synchronized (gVar.f9267a) {
                    gVar.f9279n = illegalStateException;
                }
            } finally {
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f174l) {
            case 0:
                Toast toast = (Toast) ((e) this.f175m).f3002n;
                if (toast != null) {
                    toast.show();
                    return;
                }
                return;
            case 1:
                ((D0.q) this.f175m).f486m--;
                return;
            case 2:
                ((P2.c) this.f175m).notImplemented();
                return;
            case 3:
                Q.r rVar = (Q.r) this.f175m;
                synchronized (rVar.f1744o) {
                    try {
                        if (rVar.f1748s == null) {
                            return;
                        }
                        try {
                            A.k kVarC = rVar.c();
                            int i = kVarC.f32e;
                            if (i == 2) {
                                synchronized (rVar.f1744o) {
                                }
                            }
                            if (i != 0) {
                                throw new RuntimeException("fetchFonts result is not OK. (" + i + ")");
                            }
                            try {
                                int i5 = z.d.f11118a;
                                Trace.beginSection("EmojiCompat.FontRequestEmojiCompatConfig.buildTypeface");
                                A0.b bVar = rVar.f1743n;
                                Context context = rVar.f1741l;
                                bVar.getClass();
                                Typeface typefaceK = f.f10407a.k(context, new A.k[]{kVarC}, 0);
                                MappedByteBuffer mappedByteBufferZ = AbstractC0149a.z(rVar.f1741l, kVarC.f28a);
                                if (mappedByteBufferZ == null || typefaceK == null) {
                                    throw new RuntimeException("Unable to open file.");
                                }
                                try {
                                    Trace.beginSection("EmojiCompat.MetadataRepo.create");
                                    i iVar = new i(typefaceK, D1.b.N(mappedByteBufferZ));
                                    Trace.endSection();
                                    Trace.endSection();
                                    synchronized (rVar.f1744o) {
                                        try {
                                            i4.a aVar = rVar.f1748s;
                                            if (aVar != null) {
                                                aVar.J(iVar);
                                            }
                                        } finally {
                                        }
                                        break;
                                    }
                                    rVar.b();
                                    return;
                                } finally {
                                    int i6 = z.d.f11118a;
                                    Trace.endSection();
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                            break;
                        } catch (Throwable th2) {
                            synchronized (rVar.f1744o) {
                                try {
                                    i4.a aVar2 = rVar.f1748s;
                                    if (aVar2 != null) {
                                        aVar2.I(th2);
                                    }
                                    rVar.b();
                                    return;
                                } finally {
                                }
                            }
                        }
                    } finally {
                    }
                }
            case 4:
                CoroutineWorker coroutineWorker = (CoroutineWorker) this.f175m;
                h.e(coroutineWorker, "this$0");
                if (coroutineWorker.f4774q.f4903a instanceof C0305a) {
                    coroutineWorker.f4773p.b(null);
                    return;
                }
                return;
            case 5:
                break;
            case j.STRING_SET_FIELD_NUMBER /* 6 */:
                W2.b bVar2 = (W2.b) this.f175m;
                C0698h c0698h = bVar2.f2473m;
                ConnectivityManager connectivityManager = (ConnectivityManager) bVar2.f2472l.f190l;
                c0698h.success(B0.d.j(connectivityManager.getNetworkCapabilities(connectivityManager.getActiveNetwork())));
                return;
            case j.DOUBLE_FIELD_NUMBER /* 7 */:
                ((AbstractActivityC0255w) this.f175m).invalidateMenu();
                return;
            case j.BYTES_FIELD_NUMBER /* 8 */:
                androidx.activity.l lVar = (androidx.activity.l) this.f175m;
                Runnable runnable = lVar.f3750m;
                if (runnable != null) {
                    runnable.run();
                    lVar.f3750m = null;
                    return;
                }
                return;
            case 9:
                androidx.lifecycle.F f2 = (androidx.lifecycle.F) this.f175m;
                h.e(f2, "this$0");
                int i7 = f2.f4477m;
                C0280w c0280w = f2.f4481q;
                if (i7 == 0) {
                    f2.f4478n = true;
                    c0280w.e(EnumC0272n.ON_PAUSE);
                }
                if (f2.f4476l == 0 && f2.f4478n) {
                    c0280w.e(EnumC0272n.ON_STOP);
                    f2.f4479o = true;
                    return;
                }
                return;
            case 10:
                ((AudioPlayer.ObserverRenderer) this.f175m).lambda$render$0();
                return;
            case 11:
                a();
                return;
            case 12:
                ((T) this.f175m).b(null);
                return;
            case 13:
                ((h3.d) this.f175m).f6318b.f6325e.prefetchDefaultFontManager();
                return;
            case 14:
                i0.c cVar = (i0.c) this.f175m;
                cVar.l(cVar.g(), 1028, new i0.b(8));
                cVar.f6367q.d();
                return;
            case 15:
                ((io.flutter.plugin.platform.p) this.f175m).f(false);
                return;
            case 16:
                v vVar = (v) this.f175m;
                if (vVar.f7392h0 >= 300000) {
                    ((x) vVar.f7402r.f4474m).f7424Z0 = true;
                    vVar.f7392h0 = 0L;
                    return;
                }
                return;
            case 17:
                ((C0675i) this.f175m).r();
                return;
            case 18:
                b();
                return;
            case 19:
                ((HandlerThread) this.f175m).quit();
                return;
            case 20:
                ((Z0.e) this.f175m).getClass();
                return;
            case 21:
                ((C0910c) this.f175m).x();
                return;
            default:
                C1032c c1032c = (C1032c) this.f175m;
                if (c1032c.f11057j) {
                    return;
                }
                while (true) {
                    C1031b c1031b = (C1031b) c1032c.f11053e.poll();
                    if (c1031b == null) {
                        c1032c.f11055g.postDelayed(c1032c.f11056h, c1032c.f11058k);
                        return;
                    }
                    HashMap map = c1032c.f11054f;
                    if ((map instanceof O3.a) && !(map instanceof O3.b)) {
                        s.c(map, "kotlin.collections.MutableMap");
                        throw null;
                    }
                    Long l3 = (Long) map.remove(c1031b);
                    if (l3 != null) {
                        c1032c.f11051c.remove(l3);
                        c1032c.f11052d.remove(l3);
                        long jLongValue = l3.longValue();
                        C1038i c1038i = c1032c.f11049a;
                        C1037h c1037h = new C1037h(jLongValue);
                        new i(((C1034e) c1038i.f11067b).f11062a, "dev.flutter.pigeon.webview_flutter_android.PigeonInternalInstanceManager.removeStrongReference", (InterfaceC0703m) C1034e.f11061b.a(), (C0200z) null).D(AbstractC0149a.y(l3), new I2.g(c1037h, 27));
                    }
                }
                break;
        }
        while (true) {
            T2.e eVar = (T2.e) this.f175m;
            ArrayList arrayList = eVar.f2198f;
            if (arrayList.isEmpty() || eVar.f2203l != null) {
                return;
            }
            ((U2.e) arrayList.get(0)).f2286a.run();
            arrayList.remove(0);
        }
    }
}

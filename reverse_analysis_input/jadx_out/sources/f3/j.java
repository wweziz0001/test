package f3;

import Z1.m;
import a0.C0200z;
import android.os.Build;
import android.os.Trace;
import android.util.Log;
import androidx.lifecycle.E;
import io.flutter.embedding.engine.FlutterJNI;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.List;
import java.util.WeakHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;
import n3.C0702l;
import n3.InterfaceC0694d;
import n3.InterfaceC0695e;
import n3.InterfaceC0696f;
import z3.AbstractC1068a;

/* JADX INFO: loaded from: classes.dex */
public final class j implements InterfaceC0696f, k {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final FlutterJNI f5772l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final HashMap f5773m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final HashMap f5774n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Object f5775o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final AtomicBoolean f5776p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final HashMap f5777q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f5778r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final l f5779s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final WeakHashMap f5780t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final E f5781u;

    public j(FlutterJNI flutterJNI) {
        E e5 = new E();
        e5.f4474m = (ExecutorService) m.z().f3026o;
        this.f5773m = new HashMap();
        this.f5774n = new HashMap();
        this.f5775o = new Object();
        this.f5776p = new AtomicBoolean(false);
        this.f5777q = new HashMap();
        this.f5778r = 1;
        this.f5779s = new l();
        this.f5780t = new WeakHashMap();
        this.f5772l = flutterJNI;
        this.f5781u = e5;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [f3.c] */
    public final void a(final String str, final f fVar, final ByteBuffer byteBuffer, final int i, final long j5) {
        e eVar = fVar != null ? fVar.f5763b : null;
        String strA = AbstractC1068a.a("PlatformChannel ScheduleHandler on " + str);
        if (Build.VERSION.SDK_INT >= 29) {
            B1.a.a(Z1.f.N(strA), i);
        } else {
            String strN = Z1.f.N(strA);
            try {
                if (Z1.f.f3005o == null) {
                    Z1.f.f3005o = Trace.class.getMethod("asyncTraceBegin", Long.TYPE, String.class, Integer.TYPE);
                }
                Z1.f.f3005o.invoke(null, Long.valueOf(Z1.f.f3003m), strN, Integer.valueOf(i));
            } catch (Exception e5) {
                Z1.f.v("asyncTraceBegin", e5);
            }
        }
        ?? r02 = new Runnable() { // from class: f3.c
            @Override // java.lang.Runnable
            public final void run() {
                long j6 = j5;
                FlutterJNI flutterJNI = this.f5753l.f5772l;
                StringBuilder sb = new StringBuilder("PlatformChannel ScheduleHandler on ");
                String str2 = str;
                sb.append(str2);
                String strA2 = AbstractC1068a.a(sb.toString());
                int i5 = Build.VERSION.SDK_INT;
                int i6 = i;
                if (i5 >= 29) {
                    B1.a.b(Z1.f.N(strA2), i6);
                } else {
                    String strN2 = Z1.f.N(strA2);
                    try {
                        if (Z1.f.f3006p == null) {
                            Z1.f.f3006p = Trace.class.getMethod("asyncTraceEnd", Long.TYPE, String.class, Integer.TYPE);
                        }
                        Z1.f.f3006p.invoke(null, Long.valueOf(Z1.f.f3003m), strN2, Integer.valueOf(i6));
                    } catch (Exception e6) {
                        Z1.f.v("asyncTraceEnd", e6);
                    }
                }
                try {
                    AbstractC1068a.b("DartMessenger#handleMessageFromDart on " + str2);
                    f fVar2 = fVar;
                    ByteBuffer byteBuffer2 = byteBuffer;
                    try {
                        if (fVar2 != null) {
                            try {
                                try {
                                    fVar2.f5762a.e(byteBuffer2, new g(flutterJNI, i6));
                                } catch (Exception e7) {
                                    Log.e("DartMessenger", "Uncaught exception in binary message listener", e7);
                                    flutterJNI.invokePlatformMessageEmptyResponseCallback(i6);
                                }
                            } catch (Error e8) {
                                Thread threadCurrentThread = Thread.currentThread();
                                if (threadCurrentThread.getUncaughtExceptionHandler() == null) {
                                    throw e8;
                                }
                                threadCurrentThread.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread, e8);
                            }
                        } else {
                            flutterJNI.invokePlatformMessageEmptyResponseCallback(i6);
                        }
                        if (byteBuffer2 != null && byteBuffer2.isDirect()) {
                            byteBuffer2.limit(0);
                        }
                        Trace.endSection();
                    } finally {
                    }
                } finally {
                    flutterJNI.cleanupMessageData(j6);
                }
            }
        };
        e eVar2 = eVar;
        if (eVar == null) {
            eVar2 = this.f5779s;
        }
        eVar2.a(r02);
    }

    @Override // n3.InterfaceC0696f
    public final void d(String str, InterfaceC0694d interfaceC0694d, C0200z c0200z) {
        e eVar;
        if (interfaceC0694d == null) {
            synchronized (this.f5775o) {
                this.f5773m.remove(str);
            }
            return;
        }
        if (c0200z != null) {
            eVar = (e) this.f5780t.get(c0200z);
            if (eVar == null) {
                throw new IllegalArgumentException("Unrecognized TaskQueue, use BinaryMessenger to create your TaskQueue (ex makeBackgroundTaskQueue).");
            }
        } else {
            eVar = null;
        }
        synchronized (this.f5775o) {
            try {
                this.f5773m.put(str, new f(interfaceC0694d, eVar));
                List<d> list = (List) this.f5774n.remove(str);
                if (list == null) {
                    return;
                }
                for (d dVar : list) {
                    a(str, (f) this.f5773m.get(str), dVar.f5759a, dVar.f5760b, dVar.f5761c);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // n3.InterfaceC0696f
    public final void h(String str, ByteBuffer byteBuffer, InterfaceC0695e interfaceC0695e) {
        AbstractC1068a.b("DartMessenger#send on " + str);
        try {
            int i = this.f5778r;
            this.f5778r = i + 1;
            if (interfaceC0695e != null) {
                this.f5777q.put(Integer.valueOf(i), interfaceC0695e);
            }
            FlutterJNI flutterJNI = this.f5772l;
            if (byteBuffer == null) {
                flutterJNI.dispatchEmptyPlatformMessage(str, i);
            } else {
                flutterJNI.dispatchPlatformMessage(str, byteBuffer, byteBuffer.position(), i);
            }
            Trace.endSection();
        } catch (Throwable th) {
            try {
                Trace.endSection();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // n3.InterfaceC0696f
    public final C0200z j(C0702l c0702l) {
        E e5 = this.f5781u;
        e5.getClass();
        i iVar = new i((ExecutorService) e5.f4474m);
        C0200z c0200z = new C0200z(11);
        this.f5780t.put(c0200z, iVar);
        return c0200z;
    }

    @Override // n3.InterfaceC0696f
    public final void k(String str, InterfaceC0694d interfaceC0694d) {
        d(str, interfaceC0694d, null);
    }

    @Override // n3.InterfaceC0696f
    public final void l(String str, ByteBuffer byteBuffer) {
        h(str, byteBuffer, null);
    }
}

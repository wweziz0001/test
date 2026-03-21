package T2;

import android.content.Context;
import android.os.Build;
import android.util.Log;
import j3.C0524a;
import java.io.File;
import java.util.HashMap;
import java.util.Map;
import n3.C0704n;
import n3.C0707q;
import n3.InterfaceC0696f;
import n3.InterfaceC0705o;
import n3.InterfaceC0706p;
import n3.x;

/* JADX INFO: loaded from: classes.dex */
public class n implements j3.b, InterfaceC0705o {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static String f2245s;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static h f2249w;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Context f2250l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public C0707q f2251m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final HashMap f2240n = new HashMap();

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final HashMap f2241o = new HashMap();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final Object f2242p = new Object();

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final Object f2243q = new Object();

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static int f2244r = 0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static int f2246t = 0;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static int f2247u = 1;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static int f2248v = 0;

    public static void a(n nVar, e eVar) {
        nVar.getClass();
        try {
            if (a.a(eVar.f2196d)) {
                Log.d("Sqflite", eVar.h() + "closing database ");
            }
            eVar.a();
        } catch (Exception e5) {
            Log.e("Sqflite", "error " + e5 + " while closing database " + f2248v);
        }
        synchronized (f2242p) {
            try {
                if (f2241o.isEmpty() && f2249w != null) {
                    if (a.a(eVar.f2196d)) {
                        Log.d("Sqflite", eVar.h() + "stopping thread");
                    }
                    f2249w.b();
                    f2249w = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static e b(C0704n c0704n, P2.c cVar) {
        Integer num = (Integer) c0704n.a("id");
        int iIntValue = num.intValue();
        e eVar = (e) f2241o.get(num);
        if (eVar != null) {
            return eVar;
        }
        cVar.error("sqlite_error", "database_closed " + iIntValue, null);
        return null;
    }

    public static HashMap c(int i, boolean z4, boolean z5) {
        HashMap map = new HashMap();
        map.put("id", Integer.valueOf(i));
        if (z4) {
            map.put("recovered", Boolean.TRUE);
        }
        if (z5) {
            map.put("recoveredInTransaction", Boolean.TRUE);
        }
        return map;
    }

    @Override // j3.b
    public final void onAttachedToEngine(C0524a c0524a) {
        this.f2250l = c0524a.f7453a;
        x xVar = x.f8947a;
        InterfaceC0696f interfaceC0696f = c0524a.f7455c;
        C0707q c0707q = new C0707q(interfaceC0696f, "com.tekartik.sqflite", xVar, interfaceC0696f.q());
        this.f2251m = c0707q;
        c0707q.b(this);
    }

    @Override // j3.b
    public final void onDetachedFromEngine(C0524a c0524a) {
        this.f2250l = null;
        this.f2251m.b(null);
        this.f2251m = null;
    }

    @Override // n3.InterfaceC0705o
    public final void onMethodCall(final C0704n c0704n, InterfaceC0706p interfaceC0706p) {
        e eVar;
        boolean zExists;
        final int i;
        e eVar2;
        e eVar3;
        String str = c0704n.f8938a;
        str.getClass();
        eVar = null;
        zExists = false;
        switch (str) {
            case "execute":
                P2.c cVar = (P2.c) interfaceC0706p;
                e eVarB = b(c0704n, cVar);
                if (eVarB == null) {
                    return;
                }
                f2249w.a(eVarB, new k(c0704n, cVar, eVarB, 4));
                return;
            case "closeDatabase":
                Integer num = (Integer) c0704n.a("id");
                int iIntValue = num.intValue();
                P2.c cVar2 = (P2.c) interfaceC0706p;
                e eVarB2 = b(c0704n, cVar2);
                if (eVarB2 == null) {
                    return;
                }
                if (a.a(eVarB2.f2196d)) {
                    Log.d("Sqflite", eVarB2.h() + "closing " + iIntValue + " " + eVarB2.f2194b);
                }
                String str2 = eVarB2.f2194b;
                synchronized (f2242p) {
                    try {
                        f2241o.remove(num);
                        if (eVarB2.f2193a) {
                            f2240n.remove(str2);
                        }
                    } finally {
                    }
                    break;
                }
                f2249w.a(eVarB2, new A.n(this, eVarB2, cVar2, 3));
                return;
            case "options":
                Object objA = c0704n.a("androidThreadPriority");
                if (objA != null) {
                    f2246t = ((Integer) objA).intValue();
                }
                Object objA2 = c0704n.a("androidThreadCount");
                if (objA2 != null && !objA2.equals(Integer.valueOf(f2247u))) {
                    f2247u = ((Integer) objA2).intValue();
                    h hVar = f2249w;
                    if (hVar != null) {
                        hVar.b();
                        f2249w = null;
                    }
                }
                Integer num2 = (Integer) c0704n.a("logLevel");
                if (num2 != null) {
                    f2244r = num2.intValue();
                }
                ((P2.c) interfaceC0706p).success(null);
                return;
            case "insert":
                P2.c cVar3 = (P2.c) interfaceC0706p;
                e eVarB3 = b(c0704n, cVar3);
                if (eVarB3 == null) {
                    return;
                }
                f2249w.a(eVarB3, new k(c0704n, cVar3, eVarB3, 1));
                return;
            case "update":
                P2.c cVar4 = (P2.c) interfaceC0706p;
                e eVarB4 = b(c0704n, cVar4);
                if (eVarB4 == null) {
                    return;
                }
                f2249w.a(eVarB4, new k(c0704n, cVar4, eVarB4, 5));
                return;
            case "androidSetLocale":
                P2.c cVar5 = (P2.c) interfaceC0706p;
                e eVarB5 = b(c0704n, cVar5);
                if (eVarB5 == null) {
                    return;
                }
                f2249w.a(eVarB5, new k(c0704n, eVarB5, cVar5));
                return;
            case "deleteDatabase":
                String str3 = (String) c0704n.a("path");
                synchronized (f2242p) {
                    try {
                        if (a.b(f2244r)) {
                            Log.d("Sqflite", "Look for " + str3 + " in " + f2240n.keySet());
                        }
                        HashMap map = f2240n;
                        Integer num3 = (Integer) map.get(str3);
                        if (num3 != null) {
                            HashMap map2 = f2241o;
                            e eVar4 = (e) map2.get(num3);
                            if (eVar4 != null && eVar4.i.isOpen()) {
                                if (a.b(f2244r)) {
                                    StringBuilder sb = new StringBuilder();
                                    sb.append(eVar4.h());
                                    sb.append("found single instance ");
                                    sb.append(eVar4.j() ? "(in transaction) " : "");
                                    sb.append(num3);
                                    sb.append(" ");
                                    sb.append(str3);
                                    Log.d("Sqflite", sb.toString());
                                }
                                map2.remove(num3);
                                map.remove(str3);
                                eVar = eVar4;
                            }
                        }
                    } finally {
                    }
                    break;
                }
                m mVar = new m(this, eVar, str3, (P2.c) interfaceC0706p, 0);
                h hVar2 = f2249w;
                if (hVar2 != null) {
                    hVar2.a(eVar, mVar);
                    return;
                } else {
                    mVar.run();
                    return;
                }
            case "debugMode":
                boolean zEquals = Boolean.TRUE.equals(c0704n.f8939b);
                if (!zEquals) {
                    f2244r = 0;
                } else if (zEquals) {
                    f2244r = 1;
                }
                ((P2.c) interfaceC0706p).success(null);
                return;
            case "openDatabase":
                final String str4 = (String) c0704n.a("path");
                final Boolean bool = (Boolean) c0704n.a("readOnly");
                boolean z4 = str4 == null || str4.equals(":memory:");
                boolean z5 = (Boolean.FALSE.equals(c0704n.a("singleInstance")) || z4) ? false : true;
                if (z5) {
                    synchronized (f2242p) {
                        try {
                            if (a.b(f2244r)) {
                                Log.d("Sqflite", "Look for " + str4 + " in " + f2240n.keySet());
                            }
                            Integer num4 = (Integer) f2240n.get(str4);
                            if (num4 != null && (eVar3 = (e) f2241o.get(num4)) != null) {
                                if (eVar3.i.isOpen()) {
                                    if (a.b(f2244r)) {
                                        StringBuilder sb2 = new StringBuilder();
                                        sb2.append(eVar3.h());
                                        sb2.append("re-opened single instance ");
                                        sb2.append(eVar3.j() ? "(in transaction) " : "");
                                        sb2.append(num4);
                                        sb2.append(" ");
                                        sb2.append(str4);
                                        Log.d("Sqflite", sb2.toString());
                                    }
                                    ((P2.c) interfaceC0706p).success(c(num4.intValue(), true, eVar3.j()));
                                    return;
                                }
                                if (a.b(f2244r)) {
                                    Log.d("Sqflite", eVar3.h() + "single instance database of " + str4 + " not opened");
                                }
                            }
                        } finally {
                        }
                    }
                }
                Object obj = f2242p;
                synchronized (obj) {
                    i = f2248v + 1;
                    f2248v = i;
                    break;
                }
                e eVar5 = new e(this.f2250l, str4, i, z5, f2244r);
                synchronized (obj) {
                    try {
                        if (f2249w == null) {
                            int i5 = f2247u;
                            int i6 = f2246t;
                            h dVar = i5 == 1 ? new D0.d(i6, false) : new i(i5, i6);
                            f2249w = dVar;
                            dVar.start();
                            eVar2 = eVar5;
                            if (a.a(eVar2.f2196d)) {
                                Log.d("Sqflite", eVar2.h() + "starting worker pool with priority " + f2246t);
                            }
                        } else {
                            eVar2 = eVar5;
                        }
                        eVar2.f2200h = f2249w;
                        if (a.a(eVar2.f2196d)) {
                            Log.d("Sqflite", eVar2.h() + "opened " + i + " " + str4);
                        }
                        final P2.c cVar6 = (P2.c) interfaceC0706p;
                        final boolean z6 = z4;
                        final e eVar6 = eVar2;
                        final boolean z7 = z5;
                        f2249w.a(eVar2, new Runnable() { // from class: T2.l
                            /* JADX WARN: Removed duplicated region for block: B:19:0x0057 A[Catch: all -> 0x004c, Exception -> 0x00bd, TryCatch #0 {Exception -> 0x00bd, blocks: (B:17:0x004f, B:19:0x0057, B:20:0x0066), top: B:42:0x004f, outer: #2 }] */
                            /* JADX WARN: Removed duplicated region for block: B:20:0x0066 A[Catch: all -> 0x004c, Exception -> 0x00bd, TRY_LEAVE, TryCatch #0 {Exception -> 0x00bd, blocks: (B:17:0x004f, B:19:0x0057, B:20:0x0066), top: B:42:0x004f, outer: #2 }] */
                            /* JADX WARN: Removed duplicated region for block: B:23:0x006c  */
                            @Override // java.lang.Runnable
                            /*
                                Code decompiled incorrectly, please refer to instructions dump.
                                To view partially-correct add '--show-bad-code' argument
                            */
                            public final void run() {
                                /*
                                    Method dump skipped, instruction units count: 202
                                    To view this dump add '--comments-level debug' option
                                */
                                throw new UnsupportedOperationException("Method not decompiled: T2.l.run():void");
                            }
                        });
                    } finally {
                    }
                    break;
                }
                return;
            case "batch":
                P2.c cVar7 = (P2.c) interfaceC0706p;
                e eVarB6 = b(c0704n, cVar7);
                if (eVarB6 == null) {
                    return;
                }
                f2249w.a(eVarB6, new k(eVarB6, c0704n, cVar7));
                return;
            case "debug":
                String str5 = (String) c0704n.a("cmd");
                HashMap map3 = new HashMap();
                if ("get".equals(str5)) {
                    int i7 = f2244r;
                    if (i7 > 0) {
                        map3.put("logLevel", Integer.valueOf(i7));
                    }
                    HashMap map4 = f2241o;
                    if (!map4.isEmpty()) {
                        HashMap map5 = new HashMap();
                        for (Map.Entry entry : map4.entrySet()) {
                            e eVar7 = (e) entry.getValue();
                            HashMap map6 = new HashMap();
                            map6.put("path", eVar7.f2194b);
                            map6.put("singleInstance", Boolean.valueOf(eVar7.f2193a));
                            int i8 = eVar7.f2196d;
                            if (i8 > 0) {
                                map6.put("logLevel", Integer.valueOf(i8));
                            }
                            map5.put(((Integer) entry.getKey()).toString(), map6);
                        }
                        map3.put("databases", map5);
                    }
                }
                ((P2.c) interfaceC0706p).success(map3);
                return;
            case "query":
                P2.c cVar8 = (P2.c) interfaceC0706p;
                e eVarB7 = b(c0704n, cVar8);
                if (eVarB7 == null) {
                    return;
                }
                f2249w.a(eVarB7, new k(c0704n, cVar8, eVarB7, 2));
                return;
            case "databaseExists":
                try {
                    zExists = new File((String) c0704n.a("path")).exists();
                    break;
                } catch (Exception unused) {
                }
                ((P2.c) interfaceC0706p).success(Boolean.valueOf(zExists));
                return;
            case "queryCursorNext":
                P2.c cVar9 = (P2.c) interfaceC0706p;
                e eVarB8 = b(c0704n, cVar9);
                if (eVarB8 == null) {
                    return;
                }
                f2249w.a(eVarB8, new k(c0704n, cVar9, eVarB8, 0));
                return;
            case "getPlatformVersion":
                ((P2.c) interfaceC0706p).success("Android " + Build.VERSION.RELEASE);
                return;
            case "getDatabasesPath":
                if (f2245s == null) {
                    f2245s = this.f2250l.getDatabasePath("tekartik_sqflite.db").getParent();
                }
                ((P2.c) interfaceC0706p).success(f2245s);
                return;
            default:
                ((P2.c) interfaceC0706p).notImplemented();
                return;
        }
    }
}

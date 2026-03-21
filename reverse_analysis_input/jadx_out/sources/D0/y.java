package D0;

import F0.C0057d;
import a0.AbstractC0169U;
import a0.C0157H;
import a0.C0167S;
import a0.C0190p;
import a0.C0200z;
import a0.e0;
import android.content.Context;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import androidx.lifecycle.E;
import androidx.profileinstaller.ProfileInstallerInitializer;
import androidx.work.impl.workers.ConstraintTrackingWorker;
import b2.C0305a;
import d0.AbstractC0360m;
import d0.AbstractC0370w;
import d0.C0362o;
import d0.InterfaceC0351d;
import d2.AbstractC0376a;
import h0.C0444C;
import h0.C0447F;
import h0.C0448G;
import h0.C0458i;
import h0.C0464o;
import h0.C0473y;
import h0.K;
import h0.N;
import h0.SurfaceHolderCallbackC0445D;
import h0.i0;
import h0.l0;
import h0.n0;
import i0.C0477a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import m.B0;
import m2.C0639F;
import m2.I;
import m2.J;
import m2.b0;
import m2.q0;
import m3.C0675i;
import n3.InterfaceC0696f;
import q2.InterfaceFutureC0744b;
import t0.AbstractC0841E;
import t0.C0837A;
import t0.C0838B;
import t0.C0855l;
import t0.C0856m;
import x0.H;
import x0.Y;
import y3.C1032c;
import y3.C1039j;
import y3.C1044o;
import y3.C1048s;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class y implements Runnable {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f535l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Object f536m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Object f537n;

    public /* synthetic */ y(Object obj, int i, Object obj2) {
        this.f535l = i;
        this.f536m = obj;
        this.f537n = obj2;
    }

    private final void a() {
        l0 l0Var = (l0) this.f537n;
        ((N) this.f536m).getClass();
        try {
            synchronized (l0Var) {
            }
            try {
                l0Var.f6218a.handleMessage(l0Var.f6221d, l0Var.f6222e);
            } finally {
                l0Var.b(true);
            }
        } catch (C0464o e5) {
            AbstractC0360m.m("ExoPlayerImplInternal", "Unexpected error delivering message on external thread.", e5);
            throw new RuntimeException(e5);
        }
    }

    private final void b() {
        Z1.c cVar = (Z1.c) this.f536m;
        C0458i c0458i = (C0458i) this.f537n;
        cVar.getClass();
        synchronized (c0458i) {
        }
        j0.h hVar = (j0.h) cVar.f2997m;
        int i = AbstractC0370w.f5326a;
        i0.c cVar2 = ((SurfaceHolderCallbackC0445D) hVar).f5909l.f5960r;
        cVar2.l(cVar2.i((H) cVar2.f6365o.f10958e), 1013, new C0473y(25));
    }

    private final void c() {
        String str;
        b0 b0VarS;
        Z1.l lVar = (Z1.l) this.f536m;
        I i = (I) this.f537n;
        C0855l c0855l = (C0855l) lVar.f3021m;
        c0855l.getClass();
        Pattern pattern = t0.y.f9989a;
        if (!t0.y.f9990b.matcher((CharSequence) i.get(0)).matches()) {
            Matcher matcher = t0.y.f9989a.matcher((CharSequence) i.get(0));
            AbstractC0360m.c(matcher.matches());
            String strGroup = matcher.group(1);
            strGroup.getClass();
            t0.y.a(strGroup);
            String strGroup2 = matcher.group(2);
            strGroup2.getClass();
            Uri.parse(strGroup2);
            int iIndexOf = i.indexOf("");
            AbstractC0360m.c(iIndexOf > 0);
            List listSubList = i.subList(1, iIndexOf);
            C0675i c0675i = new C0675i(21);
            c0675i.e(listSubList);
            C0856m c0856mJ = c0675i.j();
            new F0.p(t0.y.f9996h, 2).d(i.subList(iIndexOf + 1, i.size()));
            String strC = c0856mJ.c("CSeq");
            strC.getClass();
            int i5 = Integer.parseInt(strC);
            d dVar = c0855l.f9921r;
            C0855l c0855l2 = (C0855l) dVar.f396n;
            d dVar2 = new d(405, new C0675i(i5, c0855l2.f9917n, c0855l2.f9925v).j(), "");
            C0856m c0856m = (C0856m) dVar2.f395m;
            AbstractC0360m.c(c0856m.c("CSeq") != null);
            C0639F c0639f = new C0639F();
            int i6 = dVar2.f394l;
            Integer numValueOf = Integer.valueOf(i6);
            if (i6 == 200) {
                str = "OK";
            } else if (i6 == 461) {
                str = "Unsupported Transport";
            } else if (i6 == 500) {
                str = "Internal Server Error";
            } else if (i6 == 505) {
                str = "RTSP Version Not Supported";
            } else if (i6 == 301) {
                str = "Move Permanently";
            } else if (i6 == 302) {
                str = "Move Temporarily";
            } else if (i6 == 400) {
                str = "Bad Request";
            } else if (i6 == 401) {
                str = "Unauthorized";
            } else if (i6 == 404) {
                str = "Not Found";
            } else if (i6 != 405) {
                switch (i6) {
                    case 454:
                        str = "Session Not Found";
                        break;
                    case 455:
                        str = "Method Not Valid In This State";
                        break;
                    case 456:
                        str = "Header Field Not Valid";
                        break;
                    case 457:
                        str = "Invalid Range";
                        break;
                    default:
                        throw new IllegalArgumentException();
                }
            } else {
                str = "Method Not Allowed";
            }
            c0639f.c(AbstractC0370w.n("%s %s %s", "RTSP/1.0", numValueOf, str));
            J jA = c0856m.a();
            q0 it = jA.e().iterator();
            while (it.hasNext()) {
                String str2 = (String) it.next();
                I iD = jA.d(str2);
                for (int i7 = 0; i7 < iD.size(); i7++) {
                    c0639f.c(AbstractC0370w.n("%s: %s", str2, iD.get(i7)));
                }
            }
            c0639f.c("");
            c0639f.c((String) dVar2.f396n);
            c0855l2.f9923t.b(c0639f.g());
            dVar.f394l = Math.max(dVar.f394l, i5 + 1);
            return;
        }
        Matcher matcher2 = t0.y.f9990b.matcher((CharSequence) i.get(0));
        AbstractC0360m.c(matcher2.matches());
        String strGroup3 = matcher2.group(1);
        strGroup3.getClass();
        int i8 = Integer.parseInt(strGroup3);
        int iIndexOf2 = i.indexOf("");
        AbstractC0360m.c(iIndexOf2 > 0);
        List listSubList2 = i.subList(1, iIndexOf2);
        C0675i c0675i2 = new C0675i(21);
        c0675i2.e(listSubList2);
        d dVar3 = new d(i8, new C0856m(c0675i2), new F0.p(t0.y.f9996h, 2).d(i.subList(iIndexOf2 + 1, i.size())));
        C0856m c0856m2 = (C0856m) dVar3.f395m;
        String strC2 = c0856m2.c("CSeq");
        AbstractC0360m.f(strC2);
        int i9 = Integer.parseInt(strC2);
        t0.z zVar = (t0.z) c0855l.f9920q.get(i9);
        if (zVar == null) {
            return;
        }
        c0855l.f9920q.remove(i9);
        int i10 = dVar3.f394l;
        int i11 = zVar.f9998b;
        try {
            try {
                if (i10 == 200) {
                    switch (i11) {
                        case 1:
                        case 3:
                        case O.j.DOUBLE_FIELD_NUMBER /* 7 */:
                        case O.j.BYTES_FIELD_NUMBER /* 8 */:
                        case 9:
                        case 11:
                        case 12:
                            return;
                        case 2:
                            lVar.W(new Z1.c(c0856m2, AbstractC0841E.a((String) dVar3.f396n)));
                            return;
                        case 4:
                            lVar.X(new C0675i(t0.y.b(c0856m2.c("Public"))));
                            return;
                        case 5:
                            lVar.Y();
                            return;
                        case O.j.STRING_SET_FIELD_NUMBER /* 6 */:
                            String strC3 = c0856m2.c("Range");
                            C0837A c0837aA = strC3 == null ? C0837A.f9802c : C0837A.a(strC3);
                            try {
                                String strC4 = c0856m2.c("RTP-Info");
                                b0VarS = strC4 == null ? I.s() : C0838B.a(c0855l.f9922s, strC4);
                            } catch (C0157H unused) {
                                b0VarS = I.s();
                            }
                            Z1.c cVar = new Z1.c();
                            cVar.f2996l = c0837aA;
                            cVar.f2997m = I.p(b0VarS);
                            lVar.Z(cVar);
                            return;
                        case 10:
                            String strC5 = c0856m2.c("Session");
                            String strC6 = c0856m2.c("Transport");
                            if (strC5 == null || strC6 == null) {
                                throw C0157H.b("Missing mandatory session or transport header", null);
                            }
                            lVar.a0(new C0675i(t0.y.c(strC5), 26));
                            return;
                        default:
                            throw new IllegalStateException();
                    }
                }
                if (i10 == 401) {
                    if (c0855l.f9924u == null || c0855l.f9912B) {
                        C0855l.c(c0855l, new K3.b(t0.y.h(i11) + " " + i10));
                        return;
                    }
                    c0856m2.getClass();
                    I iD2 = c0856m2.f9929a.d(C0856m.b("WWW-Authenticate"));
                    if (iD2.isEmpty()) {
                        throw C0157H.b("Missing WWW-Authenticate header in a 401 response.", null);
                    }
                    for (int i12 = 0; i12 < iD2.size(); i12++) {
                        c0855l.y = t0.y.e((String) iD2.get(i12));
                        if (c0855l.y.f5306l == 2) {
                            break;
                        }
                    }
                    c0855l.f9921r.p();
                    c0855l.f9912B = true;
                    return;
                }
                if (i10 == 461) {
                    String str3 = t0.y.h(i11) + " " + i10;
                    String strC7 = zVar.f9999c.c("Transport");
                    AbstractC0360m.f(strC7);
                    C0855l.c(c0855l, (i11 != 10 || strC7.contains("TCP")) ? new K3.b(str3) : new t0.s(str3));
                    return;
                }
                if (i10 != 301 && i10 != 302) {
                    C0855l.c(c0855l, new K3.b(t0.y.h(i11) + " " + i10));
                    return;
                }
                if (c0855l.f9928z != -1) {
                    c0855l.f9928z = 0;
                }
                String strC8 = c0856m2.c("Location");
                if (strC8 == null) {
                    c0855l.f9915l.s("Redirection without new location.", null);
                    return;
                }
                Uri uri = Uri.parse(strC8);
                c0855l.f9922s = t0.y.f(uri);
                c0855l.f9924u = t0.y.d(uri);
                c0855l.f9921r.q(c0855l.f9922s, c0855l.f9925v);
            } catch (IllegalArgumentException e5) {
                e = e5;
                C0855l.c(c0855l, new K3.b(e));
            }
        } catch (C0157H e6) {
            e = e6;
            C0855l.c(c0855l, new K3.b(e));
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        B0.d dVar;
        long j5;
        boolean z4;
        long j6;
        int i = 0;
        boolean z5 = true;
        switch (this.f535l) {
            case 0:
                Z1.c cVar = (Z1.c) this.f536m;
                cVar.getClass();
                int i5 = AbstractC0370w.f5326a;
                C0448G c0448g = ((SurfaceHolderCallbackC0445D) ((A) cVar.f2997m)).f5909l;
                e0 e0Var = (e0) this.f537n;
                c0448g.f5941b0 = e0Var;
                c0448g.f5954l.e(25, new C0444C(e0Var));
                return;
            case 1:
                Z1.c cVar2 = (Z1.c) this.f536m;
                cVar2.getClass();
                int i6 = AbstractC0370w.f5326a;
                C0448G c0448g2 = ((SurfaceHolderCallbackC0445D) ((A) cVar2.f2997m)).f5909l;
                c0448g2.M = (C0190p) this.f537n;
                i0.c cVar3 = c0448g2.f5960r;
                cVar3.l(cVar3.k(), 1017, new C0473y(27));
                return;
            case 2:
                Z1.c cVar4 = (Z1.c) this.f536m;
                C0458i c0458i = (C0458i) this.f537n;
                cVar4.getClass();
                synchronized (c0458i) {
                }
                A a5 = (A) cVar4.f2997m;
                int i7 = AbstractC0370w.f5326a;
                C0448G c0448g3 = ((SurfaceHolderCallbackC0445D) a5).f5909l;
                i0.c cVar5 = c0448g3.f5960r;
                C0477a c0477aI = cVar5.i((H) cVar5.f6365o.f10958e);
                cVar5.l(c0477aI, 1020, new I2.g(c0477aI, (Object) c0458i, 13));
                c0448g3.M = null;
                return;
            case 3:
                ((P2.c) ((P2.c) this.f536m).f1693b).success(this.f537n);
                return;
            case 4:
                R1.f fVar = (R1.f) this.f536m;
                Z1.j jVar = (Z1.j) this.f537n;
                synchronized (fVar.f1886k) {
                    try {
                        Iterator it = fVar.f1885j.iterator();
                        while (it.hasNext()) {
                            ((R1.c) it.next()).c(jVar, false);
                        }
                    } finally {
                    }
                    break;
                }
                return;
            case 5:
                R1.u uVar = (R1.u) this.f536m;
                b2.k kVar = (b2.k) this.f537n;
                if (uVar.f1937A.f4903a instanceof C0305a) {
                    kVar.cancel(true);
                    return;
                }
                return;
            case O.j.STRING_SET_FIELD_NUMBER /* 6 */:
                S1.d dVar2 = (S1.d) this.f536m;
                N3.h.e(dVar2, "this$0");
                R1.k kVar2 = (R1.k) this.f537n;
                N3.h.e(kVar2, "$token");
                dVar2.f2018b.e0(kVar2, 3);
                return;
            case O.j.DOUBLE_FIELD_NUMBER /* 7 */:
                T2.g gVar = (T2.g) this.f536m;
                gVar.getClass();
                T2.f fVar2 = (T2.f) this.f537n;
                fVar2.f2206b.run();
                gVar.f2212f = fVar2;
                gVar.f2211e.run();
                return;
            case O.j.BYTES_FIELD_NUMBER /* 8 */:
                T2.i iVar = (T2.i) this.f536m;
                T2.g gVar2 = (T2.g) this.f537n;
                synchronized (iVar) {
                    HashSet hashSet = new HashSet((HashSet) iVar.f2217p);
                    ((HashSet) iVar.f2218q).remove(gVar2);
                    ((HashSet) iVar.f2217p).add(gVar2);
                    T2.f fVar3 = gVar2.f2212f;
                    if (fVar3 == null || (dVar = fVar3.f2205a) == null || !((T2.e) dVar.f190l).j()) {
                        T2.f fVar4 = gVar2.f2212f;
                        if ((fVar4 != null ? fVar4.a() : null) != null) {
                            HashMap map = (HashMap) iVar.f2219r;
                            T2.f fVar5 = gVar2.f2212f;
                            map.remove(fVar5 != null ? fVar5.a() : null);
                        }
                    }
                    iVar.e(gVar2);
                    Iterator it2 = hashSet.iterator();
                    while (it2.hasNext()) {
                        iVar.e((T2.g) it2.next());
                        break;
                    }
                }
                return;
            case 9:
                ((W2.b) this.f536m).f2473m.success((ArrayList) this.f537n);
                return;
            case 10:
                List list = (List) this.f536m;
                N3.h.e(list, "$listenersList");
                X1.f fVar6 = (X1.f) this.f537n;
                N3.h.e(fVar6, "this$0");
                Iterator it3 = list.iterator();
                while (it3.hasNext()) {
                    ((W1.b) it3.next()).a(fVar6.f2618e);
                }
                return;
            case 11:
                a2.u uVar2 = (a2.u) this.f536m;
                b2.k kVar3 = (b2.k) this.f537n;
                if (uVar2.f3566l.f4903a instanceof C0305a) {
                    kVar3.cancel(true);
                    return;
                } else {
                    kVar3.l(uVar2.f3569o.a());
                    return;
                }
            case 12:
                ((B0.g) this.f537n).a(((C0362o) this.f536m).d());
                return;
            case 13:
                ConstraintTrackingWorker constraintTrackingWorker = (ConstraintTrackingWorker) this.f536m;
                InterfaceFutureC0744b interfaceFutureC0744b = (InterfaceFutureC0744b) this.f537n;
                N3.h.e(constraintTrackingWorker, "this$0");
                synchronized (constraintTrackingWorker.f4817q) {
                    try {
                        if (constraintTrackingWorker.f4818r) {
                            b2.k kVar4 = constraintTrackingWorker.f4819s;
                            N3.h.d(kVar4, "future");
                            String str = AbstractC0376a.f5425a;
                            kVar4.j(new Q1.m());
                        } else {
                            constraintTrackingWorker.f4819s.l(interfaceFutureC0744b);
                        }
                    } finally {
                    }
                }
                return;
            case 14:
                C0448G c0448g4 = (C0448G) this.f536m;
                K k4 = (K) this.f537n;
                int i8 = c0448g4.f5918E - k4.f5977a;
                c0448g4.f5918E = i8;
                if (k4.f5979c) {
                    c0448g4.f5919F = k4.f5980d;
                    c0448g4.f5920G = true;
                }
                if (i8 == 0) {
                    AbstractC0169U abstractC0169U = ((i0) k4.f5981e).f6174a;
                    if (!c0448g4.f5945d0.f6174a.p() && abstractC0169U.p()) {
                        c0448g4.f5947e0 = -1;
                        c0448g4.f5949f0 = 0L;
                    }
                    if (!abstractC0169U.p()) {
                        List listAsList = Arrays.asList(((n0) abstractC0169U).i);
                        AbstractC0360m.h(listAsList.size() == c0448g4.f5957o.size());
                        for (int i9 = 0; i9 < listAsList.size(); i9++) {
                            ((C0447F) c0448g4.f5957o.get(i9)).f5913b = (AbstractC0169U) listAsList.get(i9);
                        }
                    }
                    if (c0448g4.f5920G) {
                        if (((i0) k4.f5981e).f6175b.equals(c0448g4.f5945d0.f6175b) && ((i0) k4.f5981e).f6177d == c0448g4.f5945d0.f6191s) {
                            z5 = false;
                        }
                        if (z5) {
                            if (abstractC0169U.p() || ((i0) k4.f5981e).f6175b.b()) {
                                j6 = ((i0) k4.f5981e).f6177d;
                            } else {
                                i0 i0Var = (i0) k4.f5981e;
                                H h2 = i0Var.f6175b;
                                long j7 = i0Var.f6177d;
                                Object obj = h2.f10531a;
                                C0167S c0167s = c0448g4.f5956n;
                                abstractC0169U.g(obj, c0167s);
                                j6 = j7 + c0167s.f3240e;
                            }
                            z4 = z5;
                            j5 = j6;
                        } else {
                            j5 = -9223372036854775807L;
                            z4 = z5;
                        }
                    } else {
                        j5 = -9223372036854775807L;
                        z4 = false;
                    }
                    c0448g4.f5920G = false;
                    c0448g4.b0((i0) k4.f5981e, 1, z4, c0448g4.f5919F, j5, -1, false);
                    return;
                }
                return;
            case 15:
                a();
                return;
            case 16:
                b();
                return;
            case 17:
                C0057d c0057d = (C0057d) this.f537n;
                Z1.c cVar6 = ((j0.x) ((E) this.f536m).f4474m).f7413O0;
                Handler handler = (Handler) cVar6.f2996l;
                if (handler != null) {
                    handler.post(new j0.f(cVar6, c0057d, 2));
                    return;
                }
                return;
            case 18:
                ((o0.b) ((n0.k) ((n0.q) this.f536m).f8899n.f8712m).f8824m.f8982o.get(((n0.j) this.f537n).f8813x)).c(true);
                return;
            case 19:
                o0.b bVar = (o0.b) this.f536m;
                bVar.f8974t = false;
                bVar.d((Uri) this.f537n);
                return;
            case 20:
                ((ProfileInstallerInitializer) this.f536m).getClass();
                (Build.VERSION.SDK_INT >= 28 ? p1.h.a(Looper.getMainLooper()) : new Handler(Looper.getMainLooper())).postDelayed(new p1.e((Context) this.f537n, i), new Random().nextInt(Math.max(1000, 1)) + 5000);
                return;
            case 21:
                c();
                return;
            case 22:
                t0.w wVar = (t0.w) this.f536m;
                byte[] bArr = (byte[]) this.f537n;
                wVar.getClass();
                try {
                    wVar.f9978l.write(bArr);
                    return;
                } catch (Exception unused) {
                    if (wVar.f9981o.f9988q) {
                        return;
                    }
                    Z1.l lVar = wVar.f9981o.f9983l;
                    return;
                }
            case 23:
                ((Z0.e) this.f536m).e((Typeface) this.f537n);
                return;
            case 24:
                ((InterfaceC0351d) this.f536m).accept(this.f537n);
                return;
            case 25:
                ((Y) this.f536m).D((F0.E) this.f537n);
                return;
            default:
                C1044o c1044o = new C1044o(i);
                C1048s c1048s = (C1048s) this.f536m;
                C1039j c1039j = c1048s.f11099b;
                String str2 = (String) this.f537n;
                N3.h.e(str2, "messageArg");
                A.e eVar = c1039j.f11068a;
                eVar.getClass();
                if (((C1032c) eVar.f9n).d(c1048s)) {
                    new Z1.i((InterfaceC0696f) eVar.f8m, "dev.flutter.pigeon.webview_flutter_android.JavaScriptChannel.postMessage", eVar.e(), (C0200z) null).D(C3.g.Q(c1048s, str2), new s2.l(c1044o, 17));
                    return;
                } else {
                    B0.l("missing-instance-error", "Callback to `JavaScriptChannel.postMessage` failed because native instance was not in the instance manager.", "");
                    return;
                }
        }
    }

    public /* synthetic */ y(Object obj, Object obj2, Object obj3, int i) {
        this.f535l = i;
        this.f536m = obj;
        this.f537n = obj2;
    }
}

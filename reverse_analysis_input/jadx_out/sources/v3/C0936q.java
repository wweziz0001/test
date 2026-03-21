package v3;

import F0.N;
import Q1.C;
import a0.C0200z;
import android.content.Context;
import android.util.Log;
import android.util.LongSparseArray;
import b3.AbstractC0307a;
import j3.C0524a;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Objects;
import m.B0;
import n3.InterfaceC0692b;
import n3.InterfaceC0696f;
import w3.C0949b;

/* JADX INFO: renamed from: v3.q, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0936q implements j3.b {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public A.e f10397m;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final LongSparseArray f10396l = new LongSparseArray();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final N f10398n = new N();

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public Long f10399o = Long.MAX_VALUE;

    public static void d(InterfaceC0696f interfaceC0696f, final C0936q c0936q) {
        String strJ = AbstractC0307a.j("dev.flutter.pigeon.video_player_android.AndroidVideoPlayerApi.initialize", "");
        C0925f c0925f = C0925f.f10374d;
        Z1.i iVar = new Z1.i(interfaceC0696f, strJ, c0925f, (C0200z) null);
        if (c0936q != null) {
            final int i = 0;
            iVar.E(new InterfaceC0692b(c0936q) { // from class: v3.d

                /* JADX INFO: renamed from: m, reason: collision with root package name */
                public final /* synthetic */ C0936q f10368m;

                {
                    this.f10368m = c0936q;
                }

                @Override // n3.InterfaceC0692b
                public final void t(Object obj, Z1.l lVar) {
                    switch (i) {
                        case 0:
                            C0936q c0936q2 = this.f10368m;
                            ArrayList arrayList = new ArrayList();
                            int i5 = 0;
                            while (true) {
                                try {
                                    LongSparseArray longSparseArray = c0936q2.f10396l;
                                    if (i5 >= longSparseArray.size()) {
                                        longSparseArray.clear();
                                        arrayList.add(0, null);
                                    } else {
                                        ((AbstractC0934o) longSparseArray.valueAt(i5)).b();
                                        i5++;
                                    }
                                } catch (Throwable th) {
                                    arrayList = C.C0(th);
                                }
                                lVar.u(arrayList);
                                break;
                            }
                            break;
                        case 1:
                            C0936q c0936q3 = this.f10368m;
                            ArrayList arrayList2 = new ArrayList();
                            try {
                                arrayList2.add(0, c0936q3.a((C0924e) ((ArrayList) obj).get(0)));
                            } catch (Throwable th2) {
                                arrayList2 = C.C0(th2);
                            }
                            lVar.u(arrayList2);
                            break;
                        case 2:
                            C0936q c0936q4 = this.f10368m;
                            ArrayList arrayList3 = new ArrayList();
                            try {
                                c0936q4.b((Long) ((ArrayList) obj).get(0));
                                arrayList3.add(0, null);
                            } catch (Throwable th3) {
                                arrayList3 = C.C0(th3);
                            }
                            lVar.u(arrayList3);
                            break;
                        case 3:
                            C0936q c0936q5 = this.f10368m;
                            ArrayList arrayList4 = new ArrayList();
                            try {
                                c0936q5.f10398n.f715a = ((Boolean) ((ArrayList) obj).get(0)).booleanValue();
                                arrayList4.add(0, null);
                            } catch (Throwable th4) {
                                arrayList4 = C.C0(th4);
                            }
                            lVar.u(arrayList4);
                            break;
                        default:
                            C0936q c0936q6 = this.f10368m;
                            ArrayList arrayList5 = new ArrayList();
                            ArrayList arrayList6 = (ArrayList) obj;
                            try {
                                arrayList5.add(0, c0936q6.c((String) arrayList6.get(0), (String) arrayList6.get(1)));
                            } catch (Throwable th5) {
                                arrayList5 = C.C0(th5);
                            }
                            lVar.u(arrayList5);
                            break;
                    }
                }
            });
        } else {
            iVar.E(null);
        }
        Z1.i iVar2 = new Z1.i(interfaceC0696f, AbstractC0307a.j("dev.flutter.pigeon.video_player_android.AndroidVideoPlayerApi.create", ""), c0925f, (C0200z) null);
        if (c0936q != null) {
            final int i5 = 1;
            iVar2.E(new InterfaceC0692b(c0936q) { // from class: v3.d

                /* JADX INFO: renamed from: m, reason: collision with root package name */
                public final /* synthetic */ C0936q f10368m;

                {
                    this.f10368m = c0936q;
                }

                @Override // n3.InterfaceC0692b
                public final void t(Object obj, Z1.l lVar) {
                    switch (i5) {
                        case 0:
                            C0936q c0936q2 = this.f10368m;
                            ArrayList arrayList = new ArrayList();
                            int i52 = 0;
                            while (true) {
                                try {
                                    LongSparseArray longSparseArray = c0936q2.f10396l;
                                    if (i52 >= longSparseArray.size()) {
                                        longSparseArray.clear();
                                        arrayList.add(0, null);
                                    } else {
                                        ((AbstractC0934o) longSparseArray.valueAt(i52)).b();
                                        i52++;
                                    }
                                } catch (Throwable th) {
                                    arrayList = C.C0(th);
                                }
                                lVar.u(arrayList);
                                break;
                            }
                            break;
                        case 1:
                            C0936q c0936q3 = this.f10368m;
                            ArrayList arrayList2 = new ArrayList();
                            try {
                                arrayList2.add(0, c0936q3.a((C0924e) ((ArrayList) obj).get(0)));
                            } catch (Throwable th2) {
                                arrayList2 = C.C0(th2);
                            }
                            lVar.u(arrayList2);
                            break;
                        case 2:
                            C0936q c0936q4 = this.f10368m;
                            ArrayList arrayList3 = new ArrayList();
                            try {
                                c0936q4.b((Long) ((ArrayList) obj).get(0));
                                arrayList3.add(0, null);
                            } catch (Throwable th3) {
                                arrayList3 = C.C0(th3);
                            }
                            lVar.u(arrayList3);
                            break;
                        case 3:
                            C0936q c0936q5 = this.f10368m;
                            ArrayList arrayList4 = new ArrayList();
                            try {
                                c0936q5.f10398n.f715a = ((Boolean) ((ArrayList) obj).get(0)).booleanValue();
                                arrayList4.add(0, null);
                            } catch (Throwable th4) {
                                arrayList4 = C.C0(th4);
                            }
                            lVar.u(arrayList4);
                            break;
                        default:
                            C0936q c0936q6 = this.f10368m;
                            ArrayList arrayList5 = new ArrayList();
                            ArrayList arrayList6 = (ArrayList) obj;
                            try {
                                arrayList5.add(0, c0936q6.c((String) arrayList6.get(0), (String) arrayList6.get(1)));
                            } catch (Throwable th5) {
                                arrayList5 = C.C0(th5);
                            }
                            lVar.u(arrayList5);
                            break;
                    }
                }
            });
        } else {
            iVar2.E(null);
        }
        Z1.i iVar3 = new Z1.i(interfaceC0696f, AbstractC0307a.j("dev.flutter.pigeon.video_player_android.AndroidVideoPlayerApi.dispose", ""), c0925f, (C0200z) null);
        if (c0936q != null) {
            final int i6 = 2;
            iVar3.E(new InterfaceC0692b(c0936q) { // from class: v3.d

                /* JADX INFO: renamed from: m, reason: collision with root package name */
                public final /* synthetic */ C0936q f10368m;

                {
                    this.f10368m = c0936q;
                }

                @Override // n3.InterfaceC0692b
                public final void t(Object obj, Z1.l lVar) {
                    switch (i6) {
                        case 0:
                            C0936q c0936q2 = this.f10368m;
                            ArrayList arrayList = new ArrayList();
                            int i52 = 0;
                            while (true) {
                                try {
                                    LongSparseArray longSparseArray = c0936q2.f10396l;
                                    if (i52 >= longSparseArray.size()) {
                                        longSparseArray.clear();
                                        arrayList.add(0, null);
                                    } else {
                                        ((AbstractC0934o) longSparseArray.valueAt(i52)).b();
                                        i52++;
                                    }
                                } catch (Throwable th) {
                                    arrayList = C.C0(th);
                                }
                                lVar.u(arrayList);
                                break;
                            }
                            break;
                        case 1:
                            C0936q c0936q3 = this.f10368m;
                            ArrayList arrayList2 = new ArrayList();
                            try {
                                arrayList2.add(0, c0936q3.a((C0924e) ((ArrayList) obj).get(0)));
                            } catch (Throwable th2) {
                                arrayList2 = C.C0(th2);
                            }
                            lVar.u(arrayList2);
                            break;
                        case 2:
                            C0936q c0936q4 = this.f10368m;
                            ArrayList arrayList3 = new ArrayList();
                            try {
                                c0936q4.b((Long) ((ArrayList) obj).get(0));
                                arrayList3.add(0, null);
                            } catch (Throwable th3) {
                                arrayList3 = C.C0(th3);
                            }
                            lVar.u(arrayList3);
                            break;
                        case 3:
                            C0936q c0936q5 = this.f10368m;
                            ArrayList arrayList4 = new ArrayList();
                            try {
                                c0936q5.f10398n.f715a = ((Boolean) ((ArrayList) obj).get(0)).booleanValue();
                                arrayList4.add(0, null);
                            } catch (Throwable th4) {
                                arrayList4 = C.C0(th4);
                            }
                            lVar.u(arrayList4);
                            break;
                        default:
                            C0936q c0936q6 = this.f10368m;
                            ArrayList arrayList5 = new ArrayList();
                            ArrayList arrayList6 = (ArrayList) obj;
                            try {
                                arrayList5.add(0, c0936q6.c((String) arrayList6.get(0), (String) arrayList6.get(1)));
                            } catch (Throwable th5) {
                                arrayList5 = C.C0(th5);
                            }
                            lVar.u(arrayList5);
                            break;
                    }
                }
            });
        } else {
            iVar3.E(null);
        }
        Z1.i iVar4 = new Z1.i(interfaceC0696f, AbstractC0307a.j("dev.flutter.pigeon.video_player_android.AndroidVideoPlayerApi.setMixWithOthers", ""), c0925f, (C0200z) null);
        if (c0936q != null) {
            final int i7 = 3;
            iVar4.E(new InterfaceC0692b(c0936q) { // from class: v3.d

                /* JADX INFO: renamed from: m, reason: collision with root package name */
                public final /* synthetic */ C0936q f10368m;

                {
                    this.f10368m = c0936q;
                }

                @Override // n3.InterfaceC0692b
                public final void t(Object obj, Z1.l lVar) {
                    switch (i7) {
                        case 0:
                            C0936q c0936q2 = this.f10368m;
                            ArrayList arrayList = new ArrayList();
                            int i52 = 0;
                            while (true) {
                                try {
                                    LongSparseArray longSparseArray = c0936q2.f10396l;
                                    if (i52 >= longSparseArray.size()) {
                                        longSparseArray.clear();
                                        arrayList.add(0, null);
                                    } else {
                                        ((AbstractC0934o) longSparseArray.valueAt(i52)).b();
                                        i52++;
                                    }
                                } catch (Throwable th) {
                                    arrayList = C.C0(th);
                                }
                                lVar.u(arrayList);
                                break;
                            }
                            break;
                        case 1:
                            C0936q c0936q3 = this.f10368m;
                            ArrayList arrayList2 = new ArrayList();
                            try {
                                arrayList2.add(0, c0936q3.a((C0924e) ((ArrayList) obj).get(0)));
                            } catch (Throwable th2) {
                                arrayList2 = C.C0(th2);
                            }
                            lVar.u(arrayList2);
                            break;
                        case 2:
                            C0936q c0936q4 = this.f10368m;
                            ArrayList arrayList3 = new ArrayList();
                            try {
                                c0936q4.b((Long) ((ArrayList) obj).get(0));
                                arrayList3.add(0, null);
                            } catch (Throwable th3) {
                                arrayList3 = C.C0(th3);
                            }
                            lVar.u(arrayList3);
                            break;
                        case 3:
                            C0936q c0936q5 = this.f10368m;
                            ArrayList arrayList4 = new ArrayList();
                            try {
                                c0936q5.f10398n.f715a = ((Boolean) ((ArrayList) obj).get(0)).booleanValue();
                                arrayList4.add(0, null);
                            } catch (Throwable th4) {
                                arrayList4 = C.C0(th4);
                            }
                            lVar.u(arrayList4);
                            break;
                        default:
                            C0936q c0936q6 = this.f10368m;
                            ArrayList arrayList5 = new ArrayList();
                            ArrayList arrayList6 = (ArrayList) obj;
                            try {
                                arrayList5.add(0, c0936q6.c((String) arrayList6.get(0), (String) arrayList6.get(1)));
                            } catch (Throwable th5) {
                                arrayList5 = C.C0(th5);
                            }
                            lVar.u(arrayList5);
                            break;
                    }
                }
            });
        } else {
            iVar4.E(null);
        }
        Z1.i iVar5 = new Z1.i(interfaceC0696f, AbstractC0307a.j("dev.flutter.pigeon.video_player_android.AndroidVideoPlayerApi.getLookupKeyForAsset", ""), c0925f, (C0200z) null);
        if (c0936q == null) {
            iVar5.E(null);
        } else {
            final int i8 = 4;
            iVar5.E(new InterfaceC0692b(c0936q) { // from class: v3.d

                /* JADX INFO: renamed from: m, reason: collision with root package name */
                public final /* synthetic */ C0936q f10368m;

                {
                    this.f10368m = c0936q;
                }

                @Override // n3.InterfaceC0692b
                public final void t(Object obj, Z1.l lVar) {
                    switch (i8) {
                        case 0:
                            C0936q c0936q2 = this.f10368m;
                            ArrayList arrayList = new ArrayList();
                            int i52 = 0;
                            while (true) {
                                try {
                                    LongSparseArray longSparseArray = c0936q2.f10396l;
                                    if (i52 >= longSparseArray.size()) {
                                        longSparseArray.clear();
                                        arrayList.add(0, null);
                                    } else {
                                        ((AbstractC0934o) longSparseArray.valueAt(i52)).b();
                                        i52++;
                                    }
                                } catch (Throwable th) {
                                    arrayList = C.C0(th);
                                }
                                lVar.u(arrayList);
                                break;
                            }
                            break;
                        case 1:
                            C0936q c0936q3 = this.f10368m;
                            ArrayList arrayList2 = new ArrayList();
                            try {
                                arrayList2.add(0, c0936q3.a((C0924e) ((ArrayList) obj).get(0)));
                            } catch (Throwable th2) {
                                arrayList2 = C.C0(th2);
                            }
                            lVar.u(arrayList2);
                            break;
                        case 2:
                            C0936q c0936q4 = this.f10368m;
                            ArrayList arrayList3 = new ArrayList();
                            try {
                                c0936q4.b((Long) ((ArrayList) obj).get(0));
                                arrayList3.add(0, null);
                            } catch (Throwable th3) {
                                arrayList3 = C.C0(th3);
                            }
                            lVar.u(arrayList3);
                            break;
                        case 3:
                            C0936q c0936q5 = this.f10368m;
                            ArrayList arrayList4 = new ArrayList();
                            try {
                                c0936q5.f10398n.f715a = ((Boolean) ((ArrayList) obj).get(0)).booleanValue();
                                arrayList4.add(0, null);
                            } catch (Throwable th4) {
                                arrayList4 = C.C0(th4);
                            }
                            lVar.u(arrayList4);
                            break;
                        default:
                            C0936q c0936q6 = this.f10368m;
                            ArrayList arrayList5 = new ArrayList();
                            ArrayList arrayList6 = (ArrayList) obj;
                            try {
                                arrayList5.add(0, c0936q6.c((String) arrayList6.get(0), (String) arrayList6.get(1)));
                            } catch (Throwable th5) {
                                arrayList5 = C.C0(th5);
                            }
                            lVar.u(arrayList5);
                            break;
                    }
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0055  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Long a(v3.C0924e r13) {
        /*
            Method dump skipped, instruction units count: 329
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: v3.C0936q.a(v3.e):java.lang.Long");
    }

    public final void b(Long l3) {
        long jLongValue = l3.longValue();
        LongSparseArray longSparseArray = this.f10396l;
        AbstractC0934o abstractC0934o = (AbstractC0934o) longSparseArray.get(jLongValue);
        if (abstractC0934o != null) {
            abstractC0934o.b();
            longSparseArray.remove(l3.longValue());
            return;
        }
        String strH = "No player found with playerId <" + jLongValue + ">";
        if (longSparseArray.size() == 0) {
            strH = B0.h(strH, " and no active players created by the plugin.");
        }
        throw new IllegalStateException(strH);
    }

    public final String c(String str, String str2) {
        if (str2 == null) {
            return ((h3.f) ((I2.g) this.f10397m.f10o).f1034m).b(str);
        }
        h3.f fVar = (h3.f) ((I2.g) this.f10397m.f11p).f1034m;
        fVar.getClass();
        StringBuilder sb = new StringBuilder("packages");
        String str3 = File.separator;
        sb.append(str3);
        sb.append(str2);
        sb.append(str3);
        sb.append(str);
        return fVar.b(sb.toString());
    }

    @Override // j3.b
    public final void onAttachedToEngine(C0524a c0524a) {
        Z1.m mVarZ = Z1.m.z();
        Context context = c0524a.f7453a;
        h3.f fVar = (h3.f) mVarZ.f3024m;
        Objects.requireNonNull(fVar);
        I2.g gVar = new I2.g(fVar, 24);
        h3.f fVar2 = (h3.f) mVarZ.f3024m;
        Objects.requireNonNull(fVar2);
        I2.g gVar2 = new I2.g(fVar2, 24);
        io.flutter.embedding.engine.renderer.l lVar = c0524a.f7456d;
        InterfaceC0696f interfaceC0696f = c0524a.f7455c;
        this.f10397m = new A.e(context, interfaceC0696f, gVar, gVar2, lVar);
        d(interfaceC0696f, this);
        LongSparseArray longSparseArray = this.f10396l;
        Objects.requireNonNull(longSparseArray);
        C0949b c0949b = new C0949b(new I2.g(longSparseArray, 25));
        HashMap map = (HashMap) c0524a.f7457e.f6777b;
        if (map.containsKey("plugins.flutter.dev/video_player_android")) {
            return;
        }
        map.put("plugins.flutter.dev/video_player_android", c0949b);
    }

    @Override // j3.b
    public final void onDetachedFromEngine(C0524a c0524a) {
        if (this.f10397m == null) {
            Log.wtf("VideoPlayerPlugin", "Detached from the engine before registering to it.");
        }
        A.e eVar = this.f10397m;
        InterfaceC0696f interfaceC0696f = c0524a.f7455c;
        eVar.getClass();
        d(interfaceC0696f, null);
        this.f10397m = null;
        int i = 0;
        while (true) {
            LongSparseArray longSparseArray = this.f10396l;
            if (i >= longSparseArray.size()) {
                longSparseArray.clear();
                return;
            } else {
                ((AbstractC0934o) longSparseArray.valueAt(i)).b();
                i++;
            }
        }
    }
}

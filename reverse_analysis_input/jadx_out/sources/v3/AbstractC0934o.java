package v3;

import F0.N;
import Q1.C;
import a0.C0150A;
import a0.C0159J;
import a0.C0177c;
import a0.C0200z;
import android.content.Context;
import b3.AbstractC0307a;
import d0.AbstractC0360m;
import h0.C0448G;
import h0.C0465p;
import h0.C0466q;
import h0.InterfaceC0467s;
import io.flutter.view.TextureRegistry$SurfaceProducer;
import java.util.ArrayList;
import m2.I;
import m2.b0;
import n3.InterfaceC0692b;
import n3.InterfaceC0696f;
import w3.C0951d;
import x0.G;

/* JADX INFO: renamed from: v3.o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0934o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C0935p f10391a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextureRegistry$SurfaceProducer f10392b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public A0.g f10393c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final InterfaceC0467s f10394d;

    public AbstractC0934o(C0935p c0935p, C0150A c0150a, N n4, TextureRegistry$SurfaceProducer textureRegistry$SurfaceProducer, C0951d c0951d) {
        C0448G c0448gA;
        this.f10391a = c0935p;
        this.f10392b = textureRegistry$SurfaceProducer;
        switch (c0951d.f10510a) {
            case 0:
                Context context = c0951d.f10511b;
                C0466q c0466q = new C0466q(context);
                G g5 = c0951d.f10512c.g(context);
                AbstractC0360m.h(!c0466q.f6271s);
                c0466q.f6257d = new C0465p(g5, 2);
                c0448gA = c0466q.a();
                break;
            default:
                Context context2 = c0951d.f10511b;
                C0466q c0466q2 = new C0466q(context2);
                G g6 = c0951d.f10512c.g(context2);
                AbstractC0360m.h(!c0466q2.f6271s);
                c0466q2.f6257d = new C0465p(g6, 2);
                c0448gA = c0466q2.a();
                break;
        }
        C0448G c0448g = c0448gA;
        this.f10394d = c0448g;
        b0 b0VarU = I.u(c0150a);
        c0448g.d0();
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < b0VarU.f8585o; i++) {
            arrayList.add(c0448g.f5959q.a((C0150A) b0VarU.get(i)));
        }
        c0448g.d0();
        c0448g.Q(arrayList, -1, -9223372036854775807L, true);
        ((C0448G) this.f10394d).K();
        InterfaceC0467s interfaceC0467s = this.f10394d;
        AbstractC0920a abstractC0920aA = a(interfaceC0467s, textureRegistry$SurfaceProducer);
        C0448G c0448g2 = (C0448G) interfaceC0467s;
        c0448g2.getClass();
        c0448g2.f5954l.a(abstractC0920aA);
        ((C0448G) this.f10394d).P(new C0177c(3, 0, 1), true ^ n4.f715a);
    }

    public static void c(InterfaceC0696f interfaceC0696f, String str, final AbstractC0934o abstractC0934o) {
        String strConcat = str.isEmpty() ? "" : ".".concat(str);
        String strJ = AbstractC0307a.j("dev.flutter.pigeon.video_player_android.VideoPlayerInstanceApi.setLooping", strConcat);
        C0925f c0925f = C0925f.f10374d;
        Z1.i iVar = new Z1.i(interfaceC0696f, strJ, c0925f, (C0200z) null);
        if (abstractC0934o != null) {
            final int i = 0;
            iVar.E(new InterfaceC0692b(abstractC0934o) { // from class: v3.k

                /* JADX INFO: renamed from: m, reason: collision with root package name */
                public final /* synthetic */ AbstractC0934o f10384m;

                {
                    this.f10384m = abstractC0934o;
                }

                @Override // n3.InterfaceC0692b
                public final void t(Object obj, Z1.l lVar) {
                    switch (i) {
                        case 0:
                            AbstractC0934o abstractC0934o2 = this.f10384m;
                            ArrayList arrayList = new ArrayList();
                            Boolean bool = (Boolean) ((ArrayList) obj).get(0);
                            try {
                                abstractC0934o2.getClass();
                                ((C0448G) abstractC0934o2.f10394d).T(bool.booleanValue() ? 2 : 0);
                                arrayList.add(0, null);
                            } catch (Throwable th) {
                                arrayList = C.C0(th);
                            }
                            lVar.u(arrayList);
                            break;
                        case 1:
                            AbstractC0934o abstractC0934o3 = this.f10384m;
                            ArrayList arrayList2 = new ArrayList();
                            Double d5 = (Double) ((ArrayList) obj).get(0);
                            try {
                                abstractC0934o3.getClass();
                                ((C0448G) abstractC0934o3.f10394d).X((float) Math.max(0.0d, Math.min(1.0d, d5.doubleValue())));
                                arrayList2.add(0, null);
                            } catch (Throwable th2) {
                                arrayList2 = C.C0(th2);
                            }
                            lVar.u(arrayList2);
                            break;
                        case 2:
                            AbstractC0934o abstractC0934o4 = this.f10384m;
                            ArrayList arrayList3 = new ArrayList();
                            Double d6 = (Double) ((ArrayList) obj).get(0);
                            try {
                                abstractC0934o4.getClass();
                                ((C0448G) abstractC0934o4.f10394d).S(new C0159J(d6.floatValue()));
                                arrayList3.add(0, null);
                            } catch (Throwable th3) {
                                arrayList3 = C.C0(th3);
                            }
                            lVar.u(arrayList3);
                            break;
                        case 3:
                            AbstractC0934o abstractC0934o5 = this.f10384m;
                            ArrayList arrayList4 = new ArrayList();
                            try {
                                L0.e eVar = (L0.e) abstractC0934o5.f10394d;
                                eVar.getClass();
                                ((C0448G) eVar).R(true);
                                arrayList4.add(0, null);
                            } catch (Throwable th4) {
                                arrayList4 = C.C0(th4);
                            }
                            lVar.u(arrayList4);
                            break;
                        case 4:
                            AbstractC0934o abstractC0934o6 = this.f10384m;
                            ArrayList arrayList5 = new ArrayList();
                            try {
                                L0.e eVar2 = (L0.e) abstractC0934o6.f10394d;
                                eVar2.getClass();
                                ((C0448G) eVar2).R(false);
                                arrayList5.add(0, null);
                            } catch (Throwable th5) {
                                arrayList5 = C.C0(th5);
                            }
                            lVar.u(arrayList5);
                            break;
                        case 5:
                            AbstractC0934o abstractC0934o7 = this.f10384m;
                            ArrayList arrayList6 = new ArrayList();
                            Long l3 = (Long) ((ArrayList) obj).get(0);
                            try {
                                abstractC0934o7.getClass();
                                long jLongValue = l3.longValue();
                                L0.e eVar3 = (L0.e) abstractC0934o7.f10394d;
                                eVar3.getClass();
                                eVar3.n(((C0448G) eVar3).w(), jLongValue, false);
                                arrayList6.add(0, null);
                            } catch (Throwable th6) {
                                arrayList6 = C.C0(th6);
                            }
                            lVar.u(arrayList6);
                            break;
                        default:
                            AbstractC0934o abstractC0934o8 = this.f10384m;
                            ArrayList arrayList7 = new ArrayList();
                            try {
                                InterfaceC0467s interfaceC0467s = abstractC0934o8.f10394d;
                                Long lValueOf = Long.valueOf(((C0448G) interfaceC0467s).x());
                                Long lValueOf2 = Long.valueOf(((C0448G) interfaceC0467s).s());
                                C0929j c0929j = new C0929j();
                                c0929j.f10381a = lValueOf;
                                c0929j.f10382b = lValueOf2;
                                arrayList7.add(0, c0929j);
                            } catch (Throwable th7) {
                                arrayList7 = C.C0(th7);
                            }
                            lVar.u(arrayList7);
                            break;
                    }
                }
            });
        } else {
            iVar.E(null);
        }
        Z1.i iVar2 = new Z1.i(interfaceC0696f, AbstractC0307a.j("dev.flutter.pigeon.video_player_android.VideoPlayerInstanceApi.setVolume", strConcat), c0925f, (C0200z) null);
        if (abstractC0934o != null) {
            final int i5 = 1;
            iVar2.E(new InterfaceC0692b(abstractC0934o) { // from class: v3.k

                /* JADX INFO: renamed from: m, reason: collision with root package name */
                public final /* synthetic */ AbstractC0934o f10384m;

                {
                    this.f10384m = abstractC0934o;
                }

                @Override // n3.InterfaceC0692b
                public final void t(Object obj, Z1.l lVar) {
                    switch (i5) {
                        case 0:
                            AbstractC0934o abstractC0934o2 = this.f10384m;
                            ArrayList arrayList = new ArrayList();
                            Boolean bool = (Boolean) ((ArrayList) obj).get(0);
                            try {
                                abstractC0934o2.getClass();
                                ((C0448G) abstractC0934o2.f10394d).T(bool.booleanValue() ? 2 : 0);
                                arrayList.add(0, null);
                            } catch (Throwable th) {
                                arrayList = C.C0(th);
                            }
                            lVar.u(arrayList);
                            break;
                        case 1:
                            AbstractC0934o abstractC0934o3 = this.f10384m;
                            ArrayList arrayList2 = new ArrayList();
                            Double d5 = (Double) ((ArrayList) obj).get(0);
                            try {
                                abstractC0934o3.getClass();
                                ((C0448G) abstractC0934o3.f10394d).X((float) Math.max(0.0d, Math.min(1.0d, d5.doubleValue())));
                                arrayList2.add(0, null);
                            } catch (Throwable th2) {
                                arrayList2 = C.C0(th2);
                            }
                            lVar.u(arrayList2);
                            break;
                        case 2:
                            AbstractC0934o abstractC0934o4 = this.f10384m;
                            ArrayList arrayList3 = new ArrayList();
                            Double d6 = (Double) ((ArrayList) obj).get(0);
                            try {
                                abstractC0934o4.getClass();
                                ((C0448G) abstractC0934o4.f10394d).S(new C0159J(d6.floatValue()));
                                arrayList3.add(0, null);
                            } catch (Throwable th3) {
                                arrayList3 = C.C0(th3);
                            }
                            lVar.u(arrayList3);
                            break;
                        case 3:
                            AbstractC0934o abstractC0934o5 = this.f10384m;
                            ArrayList arrayList4 = new ArrayList();
                            try {
                                L0.e eVar = (L0.e) abstractC0934o5.f10394d;
                                eVar.getClass();
                                ((C0448G) eVar).R(true);
                                arrayList4.add(0, null);
                            } catch (Throwable th4) {
                                arrayList4 = C.C0(th4);
                            }
                            lVar.u(arrayList4);
                            break;
                        case 4:
                            AbstractC0934o abstractC0934o6 = this.f10384m;
                            ArrayList arrayList5 = new ArrayList();
                            try {
                                L0.e eVar2 = (L0.e) abstractC0934o6.f10394d;
                                eVar2.getClass();
                                ((C0448G) eVar2).R(false);
                                arrayList5.add(0, null);
                            } catch (Throwable th5) {
                                arrayList5 = C.C0(th5);
                            }
                            lVar.u(arrayList5);
                            break;
                        case 5:
                            AbstractC0934o abstractC0934o7 = this.f10384m;
                            ArrayList arrayList6 = new ArrayList();
                            Long l3 = (Long) ((ArrayList) obj).get(0);
                            try {
                                abstractC0934o7.getClass();
                                long jLongValue = l3.longValue();
                                L0.e eVar3 = (L0.e) abstractC0934o7.f10394d;
                                eVar3.getClass();
                                eVar3.n(((C0448G) eVar3).w(), jLongValue, false);
                                arrayList6.add(0, null);
                            } catch (Throwable th6) {
                                arrayList6 = C.C0(th6);
                            }
                            lVar.u(arrayList6);
                            break;
                        default:
                            AbstractC0934o abstractC0934o8 = this.f10384m;
                            ArrayList arrayList7 = new ArrayList();
                            try {
                                InterfaceC0467s interfaceC0467s = abstractC0934o8.f10394d;
                                Long lValueOf = Long.valueOf(((C0448G) interfaceC0467s).x());
                                Long lValueOf2 = Long.valueOf(((C0448G) interfaceC0467s).s());
                                C0929j c0929j = new C0929j();
                                c0929j.f10381a = lValueOf;
                                c0929j.f10382b = lValueOf2;
                                arrayList7.add(0, c0929j);
                            } catch (Throwable th7) {
                                arrayList7 = C.C0(th7);
                            }
                            lVar.u(arrayList7);
                            break;
                    }
                }
            });
        } else {
            iVar2.E(null);
        }
        Z1.i iVar3 = new Z1.i(interfaceC0696f, AbstractC0307a.j("dev.flutter.pigeon.video_player_android.VideoPlayerInstanceApi.setPlaybackSpeed", strConcat), c0925f, (C0200z) null);
        if (abstractC0934o != null) {
            final int i6 = 2;
            iVar3.E(new InterfaceC0692b(abstractC0934o) { // from class: v3.k

                /* JADX INFO: renamed from: m, reason: collision with root package name */
                public final /* synthetic */ AbstractC0934o f10384m;

                {
                    this.f10384m = abstractC0934o;
                }

                @Override // n3.InterfaceC0692b
                public final void t(Object obj, Z1.l lVar) {
                    switch (i6) {
                        case 0:
                            AbstractC0934o abstractC0934o2 = this.f10384m;
                            ArrayList arrayList = new ArrayList();
                            Boolean bool = (Boolean) ((ArrayList) obj).get(0);
                            try {
                                abstractC0934o2.getClass();
                                ((C0448G) abstractC0934o2.f10394d).T(bool.booleanValue() ? 2 : 0);
                                arrayList.add(0, null);
                            } catch (Throwable th) {
                                arrayList = C.C0(th);
                            }
                            lVar.u(arrayList);
                            break;
                        case 1:
                            AbstractC0934o abstractC0934o3 = this.f10384m;
                            ArrayList arrayList2 = new ArrayList();
                            Double d5 = (Double) ((ArrayList) obj).get(0);
                            try {
                                abstractC0934o3.getClass();
                                ((C0448G) abstractC0934o3.f10394d).X((float) Math.max(0.0d, Math.min(1.0d, d5.doubleValue())));
                                arrayList2.add(0, null);
                            } catch (Throwable th2) {
                                arrayList2 = C.C0(th2);
                            }
                            lVar.u(arrayList2);
                            break;
                        case 2:
                            AbstractC0934o abstractC0934o4 = this.f10384m;
                            ArrayList arrayList3 = new ArrayList();
                            Double d6 = (Double) ((ArrayList) obj).get(0);
                            try {
                                abstractC0934o4.getClass();
                                ((C0448G) abstractC0934o4.f10394d).S(new C0159J(d6.floatValue()));
                                arrayList3.add(0, null);
                            } catch (Throwable th3) {
                                arrayList3 = C.C0(th3);
                            }
                            lVar.u(arrayList3);
                            break;
                        case 3:
                            AbstractC0934o abstractC0934o5 = this.f10384m;
                            ArrayList arrayList4 = new ArrayList();
                            try {
                                L0.e eVar = (L0.e) abstractC0934o5.f10394d;
                                eVar.getClass();
                                ((C0448G) eVar).R(true);
                                arrayList4.add(0, null);
                            } catch (Throwable th4) {
                                arrayList4 = C.C0(th4);
                            }
                            lVar.u(arrayList4);
                            break;
                        case 4:
                            AbstractC0934o abstractC0934o6 = this.f10384m;
                            ArrayList arrayList5 = new ArrayList();
                            try {
                                L0.e eVar2 = (L0.e) abstractC0934o6.f10394d;
                                eVar2.getClass();
                                ((C0448G) eVar2).R(false);
                                arrayList5.add(0, null);
                            } catch (Throwable th5) {
                                arrayList5 = C.C0(th5);
                            }
                            lVar.u(arrayList5);
                            break;
                        case 5:
                            AbstractC0934o abstractC0934o7 = this.f10384m;
                            ArrayList arrayList6 = new ArrayList();
                            Long l3 = (Long) ((ArrayList) obj).get(0);
                            try {
                                abstractC0934o7.getClass();
                                long jLongValue = l3.longValue();
                                L0.e eVar3 = (L0.e) abstractC0934o7.f10394d;
                                eVar3.getClass();
                                eVar3.n(((C0448G) eVar3).w(), jLongValue, false);
                                arrayList6.add(0, null);
                            } catch (Throwable th6) {
                                arrayList6 = C.C0(th6);
                            }
                            lVar.u(arrayList6);
                            break;
                        default:
                            AbstractC0934o abstractC0934o8 = this.f10384m;
                            ArrayList arrayList7 = new ArrayList();
                            try {
                                InterfaceC0467s interfaceC0467s = abstractC0934o8.f10394d;
                                Long lValueOf = Long.valueOf(((C0448G) interfaceC0467s).x());
                                Long lValueOf2 = Long.valueOf(((C0448G) interfaceC0467s).s());
                                C0929j c0929j = new C0929j();
                                c0929j.f10381a = lValueOf;
                                c0929j.f10382b = lValueOf2;
                                arrayList7.add(0, c0929j);
                            } catch (Throwable th7) {
                                arrayList7 = C.C0(th7);
                            }
                            lVar.u(arrayList7);
                            break;
                    }
                }
            });
        } else {
            iVar3.E(null);
        }
        Z1.i iVar4 = new Z1.i(interfaceC0696f, AbstractC0307a.j("dev.flutter.pigeon.video_player_android.VideoPlayerInstanceApi.play", strConcat), c0925f, (C0200z) null);
        if (abstractC0934o != null) {
            final int i7 = 3;
            iVar4.E(new InterfaceC0692b(abstractC0934o) { // from class: v3.k

                /* JADX INFO: renamed from: m, reason: collision with root package name */
                public final /* synthetic */ AbstractC0934o f10384m;

                {
                    this.f10384m = abstractC0934o;
                }

                @Override // n3.InterfaceC0692b
                public final void t(Object obj, Z1.l lVar) {
                    switch (i7) {
                        case 0:
                            AbstractC0934o abstractC0934o2 = this.f10384m;
                            ArrayList arrayList = new ArrayList();
                            Boolean bool = (Boolean) ((ArrayList) obj).get(0);
                            try {
                                abstractC0934o2.getClass();
                                ((C0448G) abstractC0934o2.f10394d).T(bool.booleanValue() ? 2 : 0);
                                arrayList.add(0, null);
                            } catch (Throwable th) {
                                arrayList = C.C0(th);
                            }
                            lVar.u(arrayList);
                            break;
                        case 1:
                            AbstractC0934o abstractC0934o3 = this.f10384m;
                            ArrayList arrayList2 = new ArrayList();
                            Double d5 = (Double) ((ArrayList) obj).get(0);
                            try {
                                abstractC0934o3.getClass();
                                ((C0448G) abstractC0934o3.f10394d).X((float) Math.max(0.0d, Math.min(1.0d, d5.doubleValue())));
                                arrayList2.add(0, null);
                            } catch (Throwable th2) {
                                arrayList2 = C.C0(th2);
                            }
                            lVar.u(arrayList2);
                            break;
                        case 2:
                            AbstractC0934o abstractC0934o4 = this.f10384m;
                            ArrayList arrayList3 = new ArrayList();
                            Double d6 = (Double) ((ArrayList) obj).get(0);
                            try {
                                abstractC0934o4.getClass();
                                ((C0448G) abstractC0934o4.f10394d).S(new C0159J(d6.floatValue()));
                                arrayList3.add(0, null);
                            } catch (Throwable th3) {
                                arrayList3 = C.C0(th3);
                            }
                            lVar.u(arrayList3);
                            break;
                        case 3:
                            AbstractC0934o abstractC0934o5 = this.f10384m;
                            ArrayList arrayList4 = new ArrayList();
                            try {
                                L0.e eVar = (L0.e) abstractC0934o5.f10394d;
                                eVar.getClass();
                                ((C0448G) eVar).R(true);
                                arrayList4.add(0, null);
                            } catch (Throwable th4) {
                                arrayList4 = C.C0(th4);
                            }
                            lVar.u(arrayList4);
                            break;
                        case 4:
                            AbstractC0934o abstractC0934o6 = this.f10384m;
                            ArrayList arrayList5 = new ArrayList();
                            try {
                                L0.e eVar2 = (L0.e) abstractC0934o6.f10394d;
                                eVar2.getClass();
                                ((C0448G) eVar2).R(false);
                                arrayList5.add(0, null);
                            } catch (Throwable th5) {
                                arrayList5 = C.C0(th5);
                            }
                            lVar.u(arrayList5);
                            break;
                        case 5:
                            AbstractC0934o abstractC0934o7 = this.f10384m;
                            ArrayList arrayList6 = new ArrayList();
                            Long l3 = (Long) ((ArrayList) obj).get(0);
                            try {
                                abstractC0934o7.getClass();
                                long jLongValue = l3.longValue();
                                L0.e eVar3 = (L0.e) abstractC0934o7.f10394d;
                                eVar3.getClass();
                                eVar3.n(((C0448G) eVar3).w(), jLongValue, false);
                                arrayList6.add(0, null);
                            } catch (Throwable th6) {
                                arrayList6 = C.C0(th6);
                            }
                            lVar.u(arrayList6);
                            break;
                        default:
                            AbstractC0934o abstractC0934o8 = this.f10384m;
                            ArrayList arrayList7 = new ArrayList();
                            try {
                                InterfaceC0467s interfaceC0467s = abstractC0934o8.f10394d;
                                Long lValueOf = Long.valueOf(((C0448G) interfaceC0467s).x());
                                Long lValueOf2 = Long.valueOf(((C0448G) interfaceC0467s).s());
                                C0929j c0929j = new C0929j();
                                c0929j.f10381a = lValueOf;
                                c0929j.f10382b = lValueOf2;
                                arrayList7.add(0, c0929j);
                            } catch (Throwable th7) {
                                arrayList7 = C.C0(th7);
                            }
                            lVar.u(arrayList7);
                            break;
                    }
                }
            });
        } else {
            iVar4.E(null);
        }
        Z1.i iVar5 = new Z1.i(interfaceC0696f, AbstractC0307a.j("dev.flutter.pigeon.video_player_android.VideoPlayerInstanceApi.pause", strConcat), c0925f, (C0200z) null);
        if (abstractC0934o != null) {
            final int i8 = 4;
            iVar5.E(new InterfaceC0692b(abstractC0934o) { // from class: v3.k

                /* JADX INFO: renamed from: m, reason: collision with root package name */
                public final /* synthetic */ AbstractC0934o f10384m;

                {
                    this.f10384m = abstractC0934o;
                }

                @Override // n3.InterfaceC0692b
                public final void t(Object obj, Z1.l lVar) {
                    switch (i8) {
                        case 0:
                            AbstractC0934o abstractC0934o2 = this.f10384m;
                            ArrayList arrayList = new ArrayList();
                            Boolean bool = (Boolean) ((ArrayList) obj).get(0);
                            try {
                                abstractC0934o2.getClass();
                                ((C0448G) abstractC0934o2.f10394d).T(bool.booleanValue() ? 2 : 0);
                                arrayList.add(0, null);
                            } catch (Throwable th) {
                                arrayList = C.C0(th);
                            }
                            lVar.u(arrayList);
                            break;
                        case 1:
                            AbstractC0934o abstractC0934o3 = this.f10384m;
                            ArrayList arrayList2 = new ArrayList();
                            Double d5 = (Double) ((ArrayList) obj).get(0);
                            try {
                                abstractC0934o3.getClass();
                                ((C0448G) abstractC0934o3.f10394d).X((float) Math.max(0.0d, Math.min(1.0d, d5.doubleValue())));
                                arrayList2.add(0, null);
                            } catch (Throwable th2) {
                                arrayList2 = C.C0(th2);
                            }
                            lVar.u(arrayList2);
                            break;
                        case 2:
                            AbstractC0934o abstractC0934o4 = this.f10384m;
                            ArrayList arrayList3 = new ArrayList();
                            Double d6 = (Double) ((ArrayList) obj).get(0);
                            try {
                                abstractC0934o4.getClass();
                                ((C0448G) abstractC0934o4.f10394d).S(new C0159J(d6.floatValue()));
                                arrayList3.add(0, null);
                            } catch (Throwable th3) {
                                arrayList3 = C.C0(th3);
                            }
                            lVar.u(arrayList3);
                            break;
                        case 3:
                            AbstractC0934o abstractC0934o5 = this.f10384m;
                            ArrayList arrayList4 = new ArrayList();
                            try {
                                L0.e eVar = (L0.e) abstractC0934o5.f10394d;
                                eVar.getClass();
                                ((C0448G) eVar).R(true);
                                arrayList4.add(0, null);
                            } catch (Throwable th4) {
                                arrayList4 = C.C0(th4);
                            }
                            lVar.u(arrayList4);
                            break;
                        case 4:
                            AbstractC0934o abstractC0934o6 = this.f10384m;
                            ArrayList arrayList5 = new ArrayList();
                            try {
                                L0.e eVar2 = (L0.e) abstractC0934o6.f10394d;
                                eVar2.getClass();
                                ((C0448G) eVar2).R(false);
                                arrayList5.add(0, null);
                            } catch (Throwable th5) {
                                arrayList5 = C.C0(th5);
                            }
                            lVar.u(arrayList5);
                            break;
                        case 5:
                            AbstractC0934o abstractC0934o7 = this.f10384m;
                            ArrayList arrayList6 = new ArrayList();
                            Long l3 = (Long) ((ArrayList) obj).get(0);
                            try {
                                abstractC0934o7.getClass();
                                long jLongValue = l3.longValue();
                                L0.e eVar3 = (L0.e) abstractC0934o7.f10394d;
                                eVar3.getClass();
                                eVar3.n(((C0448G) eVar3).w(), jLongValue, false);
                                arrayList6.add(0, null);
                            } catch (Throwable th6) {
                                arrayList6 = C.C0(th6);
                            }
                            lVar.u(arrayList6);
                            break;
                        default:
                            AbstractC0934o abstractC0934o8 = this.f10384m;
                            ArrayList arrayList7 = new ArrayList();
                            try {
                                InterfaceC0467s interfaceC0467s = abstractC0934o8.f10394d;
                                Long lValueOf = Long.valueOf(((C0448G) interfaceC0467s).x());
                                Long lValueOf2 = Long.valueOf(((C0448G) interfaceC0467s).s());
                                C0929j c0929j = new C0929j();
                                c0929j.f10381a = lValueOf;
                                c0929j.f10382b = lValueOf2;
                                arrayList7.add(0, c0929j);
                            } catch (Throwable th7) {
                                arrayList7 = C.C0(th7);
                            }
                            lVar.u(arrayList7);
                            break;
                    }
                }
            });
        } else {
            iVar5.E(null);
        }
        Z1.i iVar6 = new Z1.i(interfaceC0696f, AbstractC0307a.j("dev.flutter.pigeon.video_player_android.VideoPlayerInstanceApi.seekTo", strConcat), c0925f, (C0200z) null);
        if (abstractC0934o != null) {
            final int i9 = 5;
            iVar6.E(new InterfaceC0692b(abstractC0934o) { // from class: v3.k

                /* JADX INFO: renamed from: m, reason: collision with root package name */
                public final /* synthetic */ AbstractC0934o f10384m;

                {
                    this.f10384m = abstractC0934o;
                }

                @Override // n3.InterfaceC0692b
                public final void t(Object obj, Z1.l lVar) {
                    switch (i9) {
                        case 0:
                            AbstractC0934o abstractC0934o2 = this.f10384m;
                            ArrayList arrayList = new ArrayList();
                            Boolean bool = (Boolean) ((ArrayList) obj).get(0);
                            try {
                                abstractC0934o2.getClass();
                                ((C0448G) abstractC0934o2.f10394d).T(bool.booleanValue() ? 2 : 0);
                                arrayList.add(0, null);
                            } catch (Throwable th) {
                                arrayList = C.C0(th);
                            }
                            lVar.u(arrayList);
                            break;
                        case 1:
                            AbstractC0934o abstractC0934o3 = this.f10384m;
                            ArrayList arrayList2 = new ArrayList();
                            Double d5 = (Double) ((ArrayList) obj).get(0);
                            try {
                                abstractC0934o3.getClass();
                                ((C0448G) abstractC0934o3.f10394d).X((float) Math.max(0.0d, Math.min(1.0d, d5.doubleValue())));
                                arrayList2.add(0, null);
                            } catch (Throwable th2) {
                                arrayList2 = C.C0(th2);
                            }
                            lVar.u(arrayList2);
                            break;
                        case 2:
                            AbstractC0934o abstractC0934o4 = this.f10384m;
                            ArrayList arrayList3 = new ArrayList();
                            Double d6 = (Double) ((ArrayList) obj).get(0);
                            try {
                                abstractC0934o4.getClass();
                                ((C0448G) abstractC0934o4.f10394d).S(new C0159J(d6.floatValue()));
                                arrayList3.add(0, null);
                            } catch (Throwable th3) {
                                arrayList3 = C.C0(th3);
                            }
                            lVar.u(arrayList3);
                            break;
                        case 3:
                            AbstractC0934o abstractC0934o5 = this.f10384m;
                            ArrayList arrayList4 = new ArrayList();
                            try {
                                L0.e eVar = (L0.e) abstractC0934o5.f10394d;
                                eVar.getClass();
                                ((C0448G) eVar).R(true);
                                arrayList4.add(0, null);
                            } catch (Throwable th4) {
                                arrayList4 = C.C0(th4);
                            }
                            lVar.u(arrayList4);
                            break;
                        case 4:
                            AbstractC0934o abstractC0934o6 = this.f10384m;
                            ArrayList arrayList5 = new ArrayList();
                            try {
                                L0.e eVar2 = (L0.e) abstractC0934o6.f10394d;
                                eVar2.getClass();
                                ((C0448G) eVar2).R(false);
                                arrayList5.add(0, null);
                            } catch (Throwable th5) {
                                arrayList5 = C.C0(th5);
                            }
                            lVar.u(arrayList5);
                            break;
                        case 5:
                            AbstractC0934o abstractC0934o7 = this.f10384m;
                            ArrayList arrayList6 = new ArrayList();
                            Long l3 = (Long) ((ArrayList) obj).get(0);
                            try {
                                abstractC0934o7.getClass();
                                long jLongValue = l3.longValue();
                                L0.e eVar3 = (L0.e) abstractC0934o7.f10394d;
                                eVar3.getClass();
                                eVar3.n(((C0448G) eVar3).w(), jLongValue, false);
                                arrayList6.add(0, null);
                            } catch (Throwable th6) {
                                arrayList6 = C.C0(th6);
                            }
                            lVar.u(arrayList6);
                            break;
                        default:
                            AbstractC0934o abstractC0934o8 = this.f10384m;
                            ArrayList arrayList7 = new ArrayList();
                            try {
                                InterfaceC0467s interfaceC0467s = abstractC0934o8.f10394d;
                                Long lValueOf = Long.valueOf(((C0448G) interfaceC0467s).x());
                                Long lValueOf2 = Long.valueOf(((C0448G) interfaceC0467s).s());
                                C0929j c0929j = new C0929j();
                                c0929j.f10381a = lValueOf;
                                c0929j.f10382b = lValueOf2;
                                arrayList7.add(0, c0929j);
                            } catch (Throwable th7) {
                                arrayList7 = C.C0(th7);
                            }
                            lVar.u(arrayList7);
                            break;
                    }
                }
            });
        } else {
            iVar6.E(null);
        }
        Z1.i iVar7 = new Z1.i(interfaceC0696f, AbstractC0307a.j("dev.flutter.pigeon.video_player_android.VideoPlayerInstanceApi.getPlaybackState", strConcat), c0925f, (C0200z) null);
        if (abstractC0934o == null) {
            iVar7.E(null);
        } else {
            final int i10 = 6;
            iVar7.E(new InterfaceC0692b(abstractC0934o) { // from class: v3.k

                /* JADX INFO: renamed from: m, reason: collision with root package name */
                public final /* synthetic */ AbstractC0934o f10384m;

                {
                    this.f10384m = abstractC0934o;
                }

                @Override // n3.InterfaceC0692b
                public final void t(Object obj, Z1.l lVar) {
                    switch (i10) {
                        case 0:
                            AbstractC0934o abstractC0934o2 = this.f10384m;
                            ArrayList arrayList = new ArrayList();
                            Boolean bool = (Boolean) ((ArrayList) obj).get(0);
                            try {
                                abstractC0934o2.getClass();
                                ((C0448G) abstractC0934o2.f10394d).T(bool.booleanValue() ? 2 : 0);
                                arrayList.add(0, null);
                            } catch (Throwable th) {
                                arrayList = C.C0(th);
                            }
                            lVar.u(arrayList);
                            break;
                        case 1:
                            AbstractC0934o abstractC0934o3 = this.f10384m;
                            ArrayList arrayList2 = new ArrayList();
                            Double d5 = (Double) ((ArrayList) obj).get(0);
                            try {
                                abstractC0934o3.getClass();
                                ((C0448G) abstractC0934o3.f10394d).X((float) Math.max(0.0d, Math.min(1.0d, d5.doubleValue())));
                                arrayList2.add(0, null);
                            } catch (Throwable th2) {
                                arrayList2 = C.C0(th2);
                            }
                            lVar.u(arrayList2);
                            break;
                        case 2:
                            AbstractC0934o abstractC0934o4 = this.f10384m;
                            ArrayList arrayList3 = new ArrayList();
                            Double d6 = (Double) ((ArrayList) obj).get(0);
                            try {
                                abstractC0934o4.getClass();
                                ((C0448G) abstractC0934o4.f10394d).S(new C0159J(d6.floatValue()));
                                arrayList3.add(0, null);
                            } catch (Throwable th3) {
                                arrayList3 = C.C0(th3);
                            }
                            lVar.u(arrayList3);
                            break;
                        case 3:
                            AbstractC0934o abstractC0934o5 = this.f10384m;
                            ArrayList arrayList4 = new ArrayList();
                            try {
                                L0.e eVar = (L0.e) abstractC0934o5.f10394d;
                                eVar.getClass();
                                ((C0448G) eVar).R(true);
                                arrayList4.add(0, null);
                            } catch (Throwable th4) {
                                arrayList4 = C.C0(th4);
                            }
                            lVar.u(arrayList4);
                            break;
                        case 4:
                            AbstractC0934o abstractC0934o6 = this.f10384m;
                            ArrayList arrayList5 = new ArrayList();
                            try {
                                L0.e eVar2 = (L0.e) abstractC0934o6.f10394d;
                                eVar2.getClass();
                                ((C0448G) eVar2).R(false);
                                arrayList5.add(0, null);
                            } catch (Throwable th5) {
                                arrayList5 = C.C0(th5);
                            }
                            lVar.u(arrayList5);
                            break;
                        case 5:
                            AbstractC0934o abstractC0934o7 = this.f10384m;
                            ArrayList arrayList6 = new ArrayList();
                            Long l3 = (Long) ((ArrayList) obj).get(0);
                            try {
                                abstractC0934o7.getClass();
                                long jLongValue = l3.longValue();
                                L0.e eVar3 = (L0.e) abstractC0934o7.f10394d;
                                eVar3.getClass();
                                eVar3.n(((C0448G) eVar3).w(), jLongValue, false);
                                arrayList6.add(0, null);
                            } catch (Throwable th6) {
                                arrayList6 = C.C0(th6);
                            }
                            lVar.u(arrayList6);
                            break;
                        default:
                            AbstractC0934o abstractC0934o8 = this.f10384m;
                            ArrayList arrayList7 = new ArrayList();
                            try {
                                InterfaceC0467s interfaceC0467s = abstractC0934o8.f10394d;
                                Long lValueOf = Long.valueOf(((C0448G) interfaceC0467s).x());
                                Long lValueOf2 = Long.valueOf(((C0448G) interfaceC0467s).s());
                                C0929j c0929j = new C0929j();
                                c0929j.f10381a = lValueOf;
                                c0929j.f10382b = lValueOf2;
                                arrayList7.add(0, c0929j);
                            } catch (Throwable th7) {
                                arrayList7 = C.C0(th7);
                            }
                            lVar.u(arrayList7);
                            break;
                    }
                }
            });
        }
    }

    public abstract AbstractC0920a a(InterfaceC0467s interfaceC0467s, TextureRegistry$SurfaceProducer textureRegistry$SurfaceProducer);

    public void b() {
        A0.g gVar = this.f10393c;
        if (gVar != null) {
            c((InterfaceC0696f) gVar.f76m, (String) gVar.f77n, null);
        }
        ((C0448G) this.f10394d).L();
    }
}

package Z1;

import V3.AbstractC0124a;
import V3.AbstractC0141s;
import a.AbstractC0149a;
import a0.AbstractC0156G;
import a0.C0200z;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Build;
import android.os.Trace;
import android.util.Log;
import android.view.View;
import android.webkit.HttpAuthHandler;
import android.webkit.WebSettings;
import d0.C0363p;
import e3.C0394c;
import f0.InterfaceC0413h;
import io.flutter.plugins.GeneratedPluginRegistrant;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import n3.InterfaceC0692b;
import n3.InterfaceC0696f;
import n3.InterfaceC0703m;
import y3.C1030a;
import y3.C1039j;

/* JADX INFO: loaded from: classes.dex */
public abstract class f implements U2.d {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static long f3003m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static Method f3004n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static Method f3005o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static Method f3006p;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f3007l;

    public /* synthetic */ f(int i) {
        this.f3007l = i;
    }

    public static E3.d A(E3.d dVar) {
        N3.h.e(dVar, "<this>");
        G3.b bVar = dVar instanceof G3.b ? (G3.b) dVar : null;
        if (bVar == null) {
            return dVar;
        }
        E3.d dVar2 = bVar.f915n;
        if (dVar2 != null) {
            return dVar2;
        }
        E3.f fVar = (E3.f) bVar.getContext().l(E3.e.f674l);
        E3.d hVar = fVar != null ? new a4.h((AbstractC0141s) fVar, bVar) : bVar;
        bVar.f915n = hVar;
        return hVar;
    }

    public static boolean B() {
        if (Build.VERSION.SDK_INT >= 29) {
            return B1.a.c();
        }
        try {
            if (f3004n == null) {
                f3003m = Trace.class.getField("TRACE_TAG_APP").getLong(null);
                f3004n = Trace.class.getMethod("isTagEnabled", Long.TYPE);
            }
            return ((Boolean) f3004n.invoke(null, Long.valueOf(f3003m))).booleanValue();
        } catch (Exception e5) {
            v("isTagEnabled", e5);
            return false;
        }
    }

    public static boolean C(double d5) {
        return Math.getExponent(d5) <= 1023;
    }

    public static Long F(Object obj) {
        if (obj instanceof Integer) {
            return Long.valueOf(((Integer) obj).longValue());
        }
        if (obj instanceof Long) {
            return (Long) obj;
        }
        return null;
    }

    public static long G(C0363p c0363p, int i, int i5) {
        c0363p.H(i);
        if (c0363p.a() < 5) {
            return -9223372036854775807L;
        }
        int i6 = c0363p.i();
        if ((8388608 & i6) != 0 || ((2096896 & i6) >> 8) != i5 || (i6 & 32) == 0 || c0363p.v() < 7 || c0363p.a() < 7 || (c0363p.v() & 16) != 16) {
            return -9223372036854775807L;
        }
        byte[] bArr = new byte[6];
        c0363p.g(bArr, 0, 6);
        return ((((long) bArr[0]) & 255) << 25) | ((((long) bArr[1]) & 255) << 17) | ((((long) bArr[2]) & 255) << 9) | ((((long) bArr[3]) & 255) << 1) | ((((long) bArr[4]) & 255) >> 7);
    }

    public static void H(C0394c c0394c) {
        try {
            GeneratedPluginRegistrant.class.getDeclaredMethod("registerWith", C0394c.class).invoke(null, c0394c);
        } catch (Exception e5) {
            Log.e("GeneratedPluginsRegister", "Tried to automatically register plugins with FlutterEngine (" + c0394c + ") but could not find or invoke the GeneratedPluginRegistrant.");
            Log.e("GeneratedPluginsRegister", "Received exception while registering", e5);
        }
    }

    public static void K(InterfaceC0696f interfaceC0696f, final C1039j c1039j) {
        A.e eVar;
        N3.h.e(interfaceC0696f, "binaryMessenger");
        InterfaceC0703m gVar = (c1039j == null || (eVar = c1039j.f11068a) == null) ? new defpackage.g(1) : eVar.e();
        i iVar = new i(interfaceC0696f, "dev.flutter.pigeon.webview_flutter_android.HttpAuthHandler.useHttpAuthUsernamePassword", gVar, (C0200z) null);
        if (c1039j != null) {
            final int i = 0;
            iVar.E(new InterfaceC0692b() { // from class: y3.A
                @Override // n3.InterfaceC0692b
                public final void t(Object obj, Z1.l lVar) {
                    List listQ;
                    List listQ2;
                    List listQ3;
                    switch (i) {
                        case 0:
                            C1039j c1039j2 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj2 = ((List) obj).get(0);
                            N3.h.c(obj2, "null cannot be cast to non-null type android.webkit.HttpAuthHandler");
                            HttpAuthHandler httpAuthHandler = (HttpAuthHandler) obj2;
                            try {
                                c1039j2.getClass();
                                listQ = AbstractC0149a.y(Boolean.valueOf(httpAuthHandler.useHttpAuthUsernamePassword()));
                            } catch (Throwable th) {
                                listQ = Z1.f.Q(th);
                            }
                            lVar.u(listQ);
                            break;
                        case 1:
                            C1039j c1039j3 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj3 = ((List) obj).get(0);
                            N3.h.c(obj3, "null cannot be cast to non-null type android.webkit.HttpAuthHandler");
                            HttpAuthHandler httpAuthHandler2 = (HttpAuthHandler) obj3;
                            try {
                                c1039j3.getClass();
                                httpAuthHandler2.cancel();
                                listQ2 = AbstractC0149a.y(null);
                            } catch (Throwable th2) {
                                listQ2 = Z1.f.Q(th2);
                            }
                            lVar.u(listQ2);
                            break;
                        default:
                            C1039j c1039j4 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj4 = list.get(0);
                            N3.h.c(obj4, "null cannot be cast to non-null type android.webkit.HttpAuthHandler");
                            HttpAuthHandler httpAuthHandler3 = (HttpAuthHandler) obj4;
                            Object obj5 = list.get(1);
                            N3.h.c(obj5, "null cannot be cast to non-null type kotlin.String");
                            String str = (String) obj5;
                            Object obj6 = list.get(2);
                            N3.h.c(obj6, "null cannot be cast to non-null type kotlin.String");
                            String str2 = (String) obj6;
                            try {
                                c1039j4.getClass();
                                httpAuthHandler3.proceed(str, str2);
                                listQ3 = AbstractC0149a.y(null);
                            } catch (Throwable th3) {
                                listQ3 = Z1.f.Q(th3);
                            }
                            lVar.u(listQ3);
                            break;
                    }
                }
            });
        } else {
            iVar.E(null);
        }
        i iVar2 = new i(interfaceC0696f, "dev.flutter.pigeon.webview_flutter_android.HttpAuthHandler.cancel", gVar, (C0200z) null);
        if (c1039j != null) {
            final int i5 = 1;
            iVar2.E(new InterfaceC0692b() { // from class: y3.A
                @Override // n3.InterfaceC0692b
                public final void t(Object obj, Z1.l lVar) {
                    List listQ;
                    List listQ2;
                    List listQ3;
                    switch (i5) {
                        case 0:
                            C1039j c1039j2 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj2 = ((List) obj).get(0);
                            N3.h.c(obj2, "null cannot be cast to non-null type android.webkit.HttpAuthHandler");
                            HttpAuthHandler httpAuthHandler = (HttpAuthHandler) obj2;
                            try {
                                c1039j2.getClass();
                                listQ = AbstractC0149a.y(Boolean.valueOf(httpAuthHandler.useHttpAuthUsernamePassword()));
                            } catch (Throwable th) {
                                listQ = Z1.f.Q(th);
                            }
                            lVar.u(listQ);
                            break;
                        case 1:
                            C1039j c1039j3 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj3 = ((List) obj).get(0);
                            N3.h.c(obj3, "null cannot be cast to non-null type android.webkit.HttpAuthHandler");
                            HttpAuthHandler httpAuthHandler2 = (HttpAuthHandler) obj3;
                            try {
                                c1039j3.getClass();
                                httpAuthHandler2.cancel();
                                listQ2 = AbstractC0149a.y(null);
                            } catch (Throwable th2) {
                                listQ2 = Z1.f.Q(th2);
                            }
                            lVar.u(listQ2);
                            break;
                        default:
                            C1039j c1039j4 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj4 = list.get(0);
                            N3.h.c(obj4, "null cannot be cast to non-null type android.webkit.HttpAuthHandler");
                            HttpAuthHandler httpAuthHandler3 = (HttpAuthHandler) obj4;
                            Object obj5 = list.get(1);
                            N3.h.c(obj5, "null cannot be cast to non-null type kotlin.String");
                            String str = (String) obj5;
                            Object obj6 = list.get(2);
                            N3.h.c(obj6, "null cannot be cast to non-null type kotlin.String");
                            String str2 = (String) obj6;
                            try {
                                c1039j4.getClass();
                                httpAuthHandler3.proceed(str, str2);
                                listQ3 = AbstractC0149a.y(null);
                            } catch (Throwable th3) {
                                listQ3 = Z1.f.Q(th3);
                            }
                            lVar.u(listQ3);
                            break;
                    }
                }
            });
        } else {
            iVar2.E(null);
        }
        i iVar3 = new i(interfaceC0696f, "dev.flutter.pigeon.webview_flutter_android.HttpAuthHandler.proceed", gVar, (C0200z) null);
        if (c1039j == null) {
            iVar3.E(null);
        } else {
            final int i6 = 2;
            iVar3.E(new InterfaceC0692b() { // from class: y3.A
                @Override // n3.InterfaceC0692b
                public final void t(Object obj, Z1.l lVar) {
                    List listQ;
                    List listQ2;
                    List listQ3;
                    switch (i6) {
                        case 0:
                            C1039j c1039j2 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj2 = ((List) obj).get(0);
                            N3.h.c(obj2, "null cannot be cast to non-null type android.webkit.HttpAuthHandler");
                            HttpAuthHandler httpAuthHandler = (HttpAuthHandler) obj2;
                            try {
                                c1039j2.getClass();
                                listQ = AbstractC0149a.y(Boolean.valueOf(httpAuthHandler.useHttpAuthUsernamePassword()));
                            } catch (Throwable th) {
                                listQ = Z1.f.Q(th);
                            }
                            lVar.u(listQ);
                            break;
                        case 1:
                            C1039j c1039j3 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj3 = ((List) obj).get(0);
                            N3.h.c(obj3, "null cannot be cast to non-null type android.webkit.HttpAuthHandler");
                            HttpAuthHandler httpAuthHandler2 = (HttpAuthHandler) obj3;
                            try {
                                c1039j3.getClass();
                                httpAuthHandler2.cancel();
                                listQ2 = AbstractC0149a.y(null);
                            } catch (Throwable th2) {
                                listQ2 = Z1.f.Q(th2);
                            }
                            lVar.u(listQ2);
                            break;
                        default:
                            C1039j c1039j4 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj4 = list.get(0);
                            N3.h.c(obj4, "null cannot be cast to non-null type android.webkit.HttpAuthHandler");
                            HttpAuthHandler httpAuthHandler3 = (HttpAuthHandler) obj4;
                            Object obj5 = list.get(1);
                            N3.h.c(obj5, "null cannot be cast to non-null type kotlin.String");
                            String str = (String) obj5;
                            Object obj6 = list.get(2);
                            N3.h.c(obj6, "null cannot be cast to non-null type kotlin.String");
                            String str2 = (String) obj6;
                            try {
                                c1039j4.getClass();
                                httpAuthHandler3.proceed(str, str2);
                                listQ3 = AbstractC0149a.y(null);
                            } catch (Throwable th3) {
                                listQ3 = Z1.f.Q(th3);
                            }
                            lVar.u(listQ3);
                            break;
                    }
                }
            });
        }
    }

    public static void L(InterfaceC0696f interfaceC0696f, final C1039j c1039j) {
        A.e eVar;
        N3.h.e(interfaceC0696f, "binaryMessenger");
        InterfaceC0703m gVar = (c1039j == null || (eVar = c1039j.f11068a) == null) ? new defpackage.g(1) : eVar.e();
        i iVar = new i(interfaceC0696f, "dev.flutter.pigeon.webview_flutter_android.WebSettings.setDomStorageEnabled", gVar, (C0200z) null);
        if (c1039j != null) {
            final int i = 0;
            iVar.E(new InterfaceC0692b() { // from class: y3.G
                @Override // n3.InterfaceC0692b
                public final void t(Object obj, Z1.l lVar) {
                    List listQ;
                    List listQ2;
                    List listQ3;
                    List listQ4;
                    List listQ5;
                    List listQ6;
                    List listQ7;
                    List listQ8;
                    List listQ9;
                    List listQ10;
                    List listQ11;
                    List listQ12;
                    List listQ13;
                    List listQ14;
                    List listQ15;
                    List listQ16;
                    List listQ17;
                    switch (i) {
                        case 0:
                            C1039j c1039j2 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj2 = list.get(0);
                            N3.h.c(obj2, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings = (WebSettings) obj2;
                            Object obj3 = list.get(1);
                            N3.h.c(obj3, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue = ((Boolean) obj3).booleanValue();
                            try {
                                c1039j2.getClass();
                                webSettings.setDomStorageEnabled(zBooleanValue);
                                listQ = AbstractC0149a.y(null);
                            } catch (Throwable th) {
                                listQ = Z1.f.Q(th);
                            }
                            lVar.u(listQ);
                            break;
                        case 1:
                            C1039j c1039j3 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj;
                            Object obj4 = list2.get(0);
                            N3.h.c(obj4, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings2 = (WebSettings) obj4;
                            Object obj5 = list2.get(1);
                            N3.h.c(obj5, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue2 = ((Boolean) obj5).booleanValue();
                            try {
                                c1039j3.getClass();
                                webSettings2.setJavaScriptEnabled(zBooleanValue2);
                                listQ2 = AbstractC0149a.y(null);
                            } catch (Throwable th2) {
                                listQ2 = Z1.f.Q(th2);
                            }
                            lVar.u(listQ2);
                            break;
                        case 2:
                            C1039j c1039j4 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj;
                            Object obj6 = list3.get(0);
                            N3.h.c(obj6, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings3 = (WebSettings) obj6;
                            String str = (String) list3.get(1);
                            try {
                                c1039j4.getClass();
                                webSettings3.setUserAgentString(str);
                                listQ3 = AbstractC0149a.y(null);
                            } catch (Throwable th3) {
                                listQ3 = Z1.f.Q(th3);
                            }
                            lVar.u(listQ3);
                            break;
                        case 3:
                            C1039j c1039j5 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj;
                            Object obj7 = list4.get(0);
                            N3.h.c(obj7, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings4 = (WebSettings) obj7;
                            Object obj8 = list4.get(1);
                            N3.h.c(obj8, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue3 = ((Boolean) obj8).booleanValue();
                            try {
                                c1039j5.getClass();
                                webSettings4.setMediaPlaybackRequiresUserGesture(zBooleanValue3);
                                listQ4 = AbstractC0149a.y(null);
                            } catch (Throwable th4) {
                                listQ4 = Z1.f.Q(th4);
                            }
                            lVar.u(listQ4);
                            break;
                        case 4:
                            C1039j c1039j6 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj;
                            Object obj9 = list5.get(0);
                            N3.h.c(obj9, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings5 = (WebSettings) obj9;
                            Object obj10 = list5.get(1);
                            N3.h.c(obj10, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue4 = ((Boolean) obj10).booleanValue();
                            try {
                                c1039j6.getClass();
                                webSettings5.setSupportZoom(zBooleanValue4);
                                listQ5 = AbstractC0149a.y(null);
                            } catch (Throwable th5) {
                                listQ5 = Z1.f.Q(th5);
                            }
                            lVar.u(listQ5);
                            break;
                        case 5:
                            C1039j c1039j7 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj;
                            Object obj11 = list6.get(0);
                            N3.h.c(obj11, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings6 = (WebSettings) obj11;
                            Object obj12 = list6.get(1);
                            N3.h.c(obj12, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue5 = ((Boolean) obj12).booleanValue();
                            try {
                                c1039j7.getClass();
                                webSettings6.setLoadWithOverviewMode(zBooleanValue5);
                                listQ6 = AbstractC0149a.y(null);
                            } catch (Throwable th6) {
                                listQ6 = Z1.f.Q(th6);
                            }
                            lVar.u(listQ6);
                            break;
                        case O.j.STRING_SET_FIELD_NUMBER /* 6 */:
                            C1039j c1039j8 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj;
                            Object obj13 = list7.get(0);
                            N3.h.c(obj13, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings7 = (WebSettings) obj13;
                            Object obj14 = list7.get(1);
                            N3.h.c(obj14, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue6 = ((Boolean) obj14).booleanValue();
                            try {
                                c1039j8.getClass();
                                webSettings7.setUseWideViewPort(zBooleanValue6);
                                listQ7 = AbstractC0149a.y(null);
                            } catch (Throwable th7) {
                                listQ7 = Z1.f.Q(th7);
                            }
                            lVar.u(listQ7);
                            break;
                        case O.j.DOUBLE_FIELD_NUMBER /* 7 */:
                            C1039j c1039j9 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj;
                            Object obj15 = list8.get(0);
                            N3.h.c(obj15, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings8 = (WebSettings) obj15;
                            Object obj16 = list8.get(1);
                            N3.h.c(obj16, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue7 = ((Boolean) obj16).booleanValue();
                            try {
                                c1039j9.getClass();
                                webSettings8.setDisplayZoomControls(zBooleanValue7);
                                listQ8 = AbstractC0149a.y(null);
                            } catch (Throwable th8) {
                                listQ8 = Z1.f.Q(th8);
                            }
                            lVar.u(listQ8);
                            break;
                        case O.j.BYTES_FIELD_NUMBER /* 8 */:
                            C1039j c1039j10 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj;
                            Object obj17 = list9.get(0);
                            N3.h.c(obj17, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings9 = (WebSettings) obj17;
                            Object obj18 = list9.get(1);
                            N3.h.c(obj18, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue8 = ((Boolean) obj18).booleanValue();
                            try {
                                c1039j10.getClass();
                                webSettings9.setBuiltInZoomControls(zBooleanValue8);
                                listQ9 = AbstractC0149a.y(null);
                            } catch (Throwable th9) {
                                listQ9 = Z1.f.Q(th9);
                            }
                            lVar.u(listQ9);
                            break;
                        case 9:
                            C1039j c1039j11 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj;
                            Object obj19 = list10.get(0);
                            N3.h.c(obj19, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings10 = (WebSettings) obj19;
                            Object obj20 = list10.get(1);
                            N3.h.c(obj20, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue9 = ((Boolean) obj20).booleanValue();
                            try {
                                c1039j11.getClass();
                                webSettings10.setAllowFileAccess(zBooleanValue9);
                                listQ10 = AbstractC0149a.y(null);
                            } catch (Throwable th10) {
                                listQ10 = Z1.f.Q(th10);
                            }
                            lVar.u(listQ10);
                            break;
                        case 10:
                            C1039j c1039j12 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj;
                            Object obj21 = list11.get(0);
                            N3.h.c(obj21, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings11 = (WebSettings) obj21;
                            Object obj22 = list11.get(1);
                            N3.h.c(obj22, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue10 = ((Boolean) obj22).booleanValue();
                            try {
                                c1039j12.getClass();
                                webSettings11.setAllowContentAccess(zBooleanValue10);
                                listQ11 = AbstractC0149a.y(null);
                            } catch (Throwable th11) {
                                listQ11 = Z1.f.Q(th11);
                            }
                            lVar.u(listQ11);
                            break;
                        case 11:
                            C1039j c1039j13 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list12 = (List) obj;
                            Object obj23 = list12.get(0);
                            N3.h.c(obj23, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings12 = (WebSettings) obj23;
                            Object obj24 = list12.get(1);
                            N3.h.c(obj24, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue11 = ((Boolean) obj24).booleanValue();
                            try {
                                c1039j13.getClass();
                                webSettings12.setGeolocationEnabled(zBooleanValue11);
                                listQ12 = AbstractC0149a.y(null);
                            } catch (Throwable th12) {
                                listQ12 = Z1.f.Q(th12);
                            }
                            lVar.u(listQ12);
                            break;
                        case 12:
                            C1039j c1039j14 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj;
                            Object obj25 = list13.get(0);
                            N3.h.c(obj25, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings13 = (WebSettings) obj25;
                            Object obj26 = list13.get(1);
                            N3.h.c(obj26, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue = ((Long) obj26).longValue();
                            try {
                                c1039j14.getClass();
                                webSettings13.setTextZoom((int) jLongValue);
                                listQ13 = AbstractC0149a.y(null);
                            } catch (Throwable th13) {
                                listQ13 = Z1.f.Q(th13);
                            }
                            lVar.u(listQ13);
                            break;
                        case 13:
                            C1039j c1039j15 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj27 = ((List) obj).get(0);
                            N3.h.c(obj27, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings14 = (WebSettings) obj27;
                            try {
                                c1039j15.getClass();
                                listQ14 = AbstractC0149a.y(webSettings14.getUserAgentString());
                            } catch (Throwable th14) {
                                listQ14 = Z1.f.Q(th14);
                            }
                            lVar.u(listQ14);
                            break;
                        case 14:
                            C1039j c1039j16 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list14 = (List) obj;
                            Object obj28 = list14.get(0);
                            N3.h.c(obj28, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings15 = (WebSettings) obj28;
                            Object obj29 = list14.get(1);
                            N3.h.c(obj29, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.MixedContentMode");
                            EnumC1049t enumC1049t = (EnumC1049t) obj29;
                            try {
                                c1039j16.getClass();
                                int iOrdinal = enumC1049t.ordinal();
                                if (iOrdinal == 0) {
                                    webSettings15.setMixedContentMode(0);
                                } else if (iOrdinal == 1) {
                                    webSettings15.setMixedContentMode(2);
                                } else if (iOrdinal == 2) {
                                    webSettings15.setMixedContentMode(1);
                                }
                                listQ15 = AbstractC0149a.y(null);
                            } catch (Throwable th15) {
                                listQ15 = Z1.f.Q(th15);
                            }
                            lVar.u(listQ15);
                            break;
                        case 15:
                            C1039j c1039j17 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list15 = (List) obj;
                            Object obj30 = list15.get(0);
                            N3.h.c(obj30, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings16 = (WebSettings) obj30;
                            Object obj31 = list15.get(1);
                            N3.h.c(obj31, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue12 = ((Boolean) obj31).booleanValue();
                            try {
                                c1039j17.getClass();
                                webSettings16.setJavaScriptCanOpenWindowsAutomatically(zBooleanValue12);
                                listQ16 = AbstractC0149a.y(null);
                            } catch (Throwable th16) {
                                listQ16 = Z1.f.Q(th16);
                            }
                            lVar.u(listQ16);
                            break;
                        default:
                            C1039j c1039j18 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list16 = (List) obj;
                            Object obj32 = list16.get(0);
                            N3.h.c(obj32, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings17 = (WebSettings) obj32;
                            Object obj33 = list16.get(1);
                            N3.h.c(obj33, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue13 = ((Boolean) obj33).booleanValue();
                            try {
                                c1039j18.getClass();
                                webSettings17.setSupportMultipleWindows(zBooleanValue13);
                                listQ17 = AbstractC0149a.y(null);
                            } catch (Throwable th17) {
                                listQ17 = Z1.f.Q(th17);
                            }
                            lVar.u(listQ17);
                            break;
                    }
                }
            });
        } else {
            iVar.E(null);
        }
        i iVar2 = new i(interfaceC0696f, "dev.flutter.pigeon.webview_flutter_android.WebSettings.setJavaScriptCanOpenWindowsAutomatically", gVar, (C0200z) null);
        if (c1039j != null) {
            final int i5 = 15;
            iVar2.E(new InterfaceC0692b() { // from class: y3.G
                @Override // n3.InterfaceC0692b
                public final void t(Object obj, Z1.l lVar) {
                    List listQ;
                    List listQ2;
                    List listQ3;
                    List listQ4;
                    List listQ5;
                    List listQ6;
                    List listQ7;
                    List listQ8;
                    List listQ9;
                    List listQ10;
                    List listQ11;
                    List listQ12;
                    List listQ13;
                    List listQ14;
                    List listQ15;
                    List listQ16;
                    List listQ17;
                    switch (i5) {
                        case 0:
                            C1039j c1039j2 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj2 = list.get(0);
                            N3.h.c(obj2, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings = (WebSettings) obj2;
                            Object obj3 = list.get(1);
                            N3.h.c(obj3, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue = ((Boolean) obj3).booleanValue();
                            try {
                                c1039j2.getClass();
                                webSettings.setDomStorageEnabled(zBooleanValue);
                                listQ = AbstractC0149a.y(null);
                            } catch (Throwable th) {
                                listQ = Z1.f.Q(th);
                            }
                            lVar.u(listQ);
                            break;
                        case 1:
                            C1039j c1039j3 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj;
                            Object obj4 = list2.get(0);
                            N3.h.c(obj4, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings2 = (WebSettings) obj4;
                            Object obj5 = list2.get(1);
                            N3.h.c(obj5, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue2 = ((Boolean) obj5).booleanValue();
                            try {
                                c1039j3.getClass();
                                webSettings2.setJavaScriptEnabled(zBooleanValue2);
                                listQ2 = AbstractC0149a.y(null);
                            } catch (Throwable th2) {
                                listQ2 = Z1.f.Q(th2);
                            }
                            lVar.u(listQ2);
                            break;
                        case 2:
                            C1039j c1039j4 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj;
                            Object obj6 = list3.get(0);
                            N3.h.c(obj6, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings3 = (WebSettings) obj6;
                            String str = (String) list3.get(1);
                            try {
                                c1039j4.getClass();
                                webSettings3.setUserAgentString(str);
                                listQ3 = AbstractC0149a.y(null);
                            } catch (Throwable th3) {
                                listQ3 = Z1.f.Q(th3);
                            }
                            lVar.u(listQ3);
                            break;
                        case 3:
                            C1039j c1039j5 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj;
                            Object obj7 = list4.get(0);
                            N3.h.c(obj7, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings4 = (WebSettings) obj7;
                            Object obj8 = list4.get(1);
                            N3.h.c(obj8, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue3 = ((Boolean) obj8).booleanValue();
                            try {
                                c1039j5.getClass();
                                webSettings4.setMediaPlaybackRequiresUserGesture(zBooleanValue3);
                                listQ4 = AbstractC0149a.y(null);
                            } catch (Throwable th4) {
                                listQ4 = Z1.f.Q(th4);
                            }
                            lVar.u(listQ4);
                            break;
                        case 4:
                            C1039j c1039j6 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj;
                            Object obj9 = list5.get(0);
                            N3.h.c(obj9, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings5 = (WebSettings) obj9;
                            Object obj10 = list5.get(1);
                            N3.h.c(obj10, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue4 = ((Boolean) obj10).booleanValue();
                            try {
                                c1039j6.getClass();
                                webSettings5.setSupportZoom(zBooleanValue4);
                                listQ5 = AbstractC0149a.y(null);
                            } catch (Throwable th5) {
                                listQ5 = Z1.f.Q(th5);
                            }
                            lVar.u(listQ5);
                            break;
                        case 5:
                            C1039j c1039j7 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj;
                            Object obj11 = list6.get(0);
                            N3.h.c(obj11, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings6 = (WebSettings) obj11;
                            Object obj12 = list6.get(1);
                            N3.h.c(obj12, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue5 = ((Boolean) obj12).booleanValue();
                            try {
                                c1039j7.getClass();
                                webSettings6.setLoadWithOverviewMode(zBooleanValue5);
                                listQ6 = AbstractC0149a.y(null);
                            } catch (Throwable th6) {
                                listQ6 = Z1.f.Q(th6);
                            }
                            lVar.u(listQ6);
                            break;
                        case O.j.STRING_SET_FIELD_NUMBER /* 6 */:
                            C1039j c1039j8 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj;
                            Object obj13 = list7.get(0);
                            N3.h.c(obj13, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings7 = (WebSettings) obj13;
                            Object obj14 = list7.get(1);
                            N3.h.c(obj14, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue6 = ((Boolean) obj14).booleanValue();
                            try {
                                c1039j8.getClass();
                                webSettings7.setUseWideViewPort(zBooleanValue6);
                                listQ7 = AbstractC0149a.y(null);
                            } catch (Throwable th7) {
                                listQ7 = Z1.f.Q(th7);
                            }
                            lVar.u(listQ7);
                            break;
                        case O.j.DOUBLE_FIELD_NUMBER /* 7 */:
                            C1039j c1039j9 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj;
                            Object obj15 = list8.get(0);
                            N3.h.c(obj15, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings8 = (WebSettings) obj15;
                            Object obj16 = list8.get(1);
                            N3.h.c(obj16, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue7 = ((Boolean) obj16).booleanValue();
                            try {
                                c1039j9.getClass();
                                webSettings8.setDisplayZoomControls(zBooleanValue7);
                                listQ8 = AbstractC0149a.y(null);
                            } catch (Throwable th8) {
                                listQ8 = Z1.f.Q(th8);
                            }
                            lVar.u(listQ8);
                            break;
                        case O.j.BYTES_FIELD_NUMBER /* 8 */:
                            C1039j c1039j10 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj;
                            Object obj17 = list9.get(0);
                            N3.h.c(obj17, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings9 = (WebSettings) obj17;
                            Object obj18 = list9.get(1);
                            N3.h.c(obj18, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue8 = ((Boolean) obj18).booleanValue();
                            try {
                                c1039j10.getClass();
                                webSettings9.setBuiltInZoomControls(zBooleanValue8);
                                listQ9 = AbstractC0149a.y(null);
                            } catch (Throwable th9) {
                                listQ9 = Z1.f.Q(th9);
                            }
                            lVar.u(listQ9);
                            break;
                        case 9:
                            C1039j c1039j11 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj;
                            Object obj19 = list10.get(0);
                            N3.h.c(obj19, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings10 = (WebSettings) obj19;
                            Object obj20 = list10.get(1);
                            N3.h.c(obj20, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue9 = ((Boolean) obj20).booleanValue();
                            try {
                                c1039j11.getClass();
                                webSettings10.setAllowFileAccess(zBooleanValue9);
                                listQ10 = AbstractC0149a.y(null);
                            } catch (Throwable th10) {
                                listQ10 = Z1.f.Q(th10);
                            }
                            lVar.u(listQ10);
                            break;
                        case 10:
                            C1039j c1039j12 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj;
                            Object obj21 = list11.get(0);
                            N3.h.c(obj21, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings11 = (WebSettings) obj21;
                            Object obj22 = list11.get(1);
                            N3.h.c(obj22, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue10 = ((Boolean) obj22).booleanValue();
                            try {
                                c1039j12.getClass();
                                webSettings11.setAllowContentAccess(zBooleanValue10);
                                listQ11 = AbstractC0149a.y(null);
                            } catch (Throwable th11) {
                                listQ11 = Z1.f.Q(th11);
                            }
                            lVar.u(listQ11);
                            break;
                        case 11:
                            C1039j c1039j13 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list12 = (List) obj;
                            Object obj23 = list12.get(0);
                            N3.h.c(obj23, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings12 = (WebSettings) obj23;
                            Object obj24 = list12.get(1);
                            N3.h.c(obj24, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue11 = ((Boolean) obj24).booleanValue();
                            try {
                                c1039j13.getClass();
                                webSettings12.setGeolocationEnabled(zBooleanValue11);
                                listQ12 = AbstractC0149a.y(null);
                            } catch (Throwable th12) {
                                listQ12 = Z1.f.Q(th12);
                            }
                            lVar.u(listQ12);
                            break;
                        case 12:
                            C1039j c1039j14 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj;
                            Object obj25 = list13.get(0);
                            N3.h.c(obj25, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings13 = (WebSettings) obj25;
                            Object obj26 = list13.get(1);
                            N3.h.c(obj26, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue = ((Long) obj26).longValue();
                            try {
                                c1039j14.getClass();
                                webSettings13.setTextZoom((int) jLongValue);
                                listQ13 = AbstractC0149a.y(null);
                            } catch (Throwable th13) {
                                listQ13 = Z1.f.Q(th13);
                            }
                            lVar.u(listQ13);
                            break;
                        case 13:
                            C1039j c1039j15 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj27 = ((List) obj).get(0);
                            N3.h.c(obj27, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings14 = (WebSettings) obj27;
                            try {
                                c1039j15.getClass();
                                listQ14 = AbstractC0149a.y(webSettings14.getUserAgentString());
                            } catch (Throwable th14) {
                                listQ14 = Z1.f.Q(th14);
                            }
                            lVar.u(listQ14);
                            break;
                        case 14:
                            C1039j c1039j16 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list14 = (List) obj;
                            Object obj28 = list14.get(0);
                            N3.h.c(obj28, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings15 = (WebSettings) obj28;
                            Object obj29 = list14.get(1);
                            N3.h.c(obj29, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.MixedContentMode");
                            EnumC1049t enumC1049t = (EnumC1049t) obj29;
                            try {
                                c1039j16.getClass();
                                int iOrdinal = enumC1049t.ordinal();
                                if (iOrdinal == 0) {
                                    webSettings15.setMixedContentMode(0);
                                } else if (iOrdinal == 1) {
                                    webSettings15.setMixedContentMode(2);
                                } else if (iOrdinal == 2) {
                                    webSettings15.setMixedContentMode(1);
                                }
                                listQ15 = AbstractC0149a.y(null);
                            } catch (Throwable th15) {
                                listQ15 = Z1.f.Q(th15);
                            }
                            lVar.u(listQ15);
                            break;
                        case 15:
                            C1039j c1039j17 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list15 = (List) obj;
                            Object obj30 = list15.get(0);
                            N3.h.c(obj30, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings16 = (WebSettings) obj30;
                            Object obj31 = list15.get(1);
                            N3.h.c(obj31, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue12 = ((Boolean) obj31).booleanValue();
                            try {
                                c1039j17.getClass();
                                webSettings16.setJavaScriptCanOpenWindowsAutomatically(zBooleanValue12);
                                listQ16 = AbstractC0149a.y(null);
                            } catch (Throwable th16) {
                                listQ16 = Z1.f.Q(th16);
                            }
                            lVar.u(listQ16);
                            break;
                        default:
                            C1039j c1039j18 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list16 = (List) obj;
                            Object obj32 = list16.get(0);
                            N3.h.c(obj32, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings17 = (WebSettings) obj32;
                            Object obj33 = list16.get(1);
                            N3.h.c(obj33, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue13 = ((Boolean) obj33).booleanValue();
                            try {
                                c1039j18.getClass();
                                webSettings17.setSupportMultipleWindows(zBooleanValue13);
                                listQ17 = AbstractC0149a.y(null);
                            } catch (Throwable th17) {
                                listQ17 = Z1.f.Q(th17);
                            }
                            lVar.u(listQ17);
                            break;
                    }
                }
            });
        } else {
            iVar2.E(null);
        }
        i iVar3 = new i(interfaceC0696f, "dev.flutter.pigeon.webview_flutter_android.WebSettings.setSupportMultipleWindows", gVar, (C0200z) null);
        if (c1039j != null) {
            final int i6 = 16;
            iVar3.E(new InterfaceC0692b() { // from class: y3.G
                @Override // n3.InterfaceC0692b
                public final void t(Object obj, Z1.l lVar) {
                    List listQ;
                    List listQ2;
                    List listQ3;
                    List listQ4;
                    List listQ5;
                    List listQ6;
                    List listQ7;
                    List listQ8;
                    List listQ9;
                    List listQ10;
                    List listQ11;
                    List listQ12;
                    List listQ13;
                    List listQ14;
                    List listQ15;
                    List listQ16;
                    List listQ17;
                    switch (i6) {
                        case 0:
                            C1039j c1039j2 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj2 = list.get(0);
                            N3.h.c(obj2, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings = (WebSettings) obj2;
                            Object obj3 = list.get(1);
                            N3.h.c(obj3, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue = ((Boolean) obj3).booleanValue();
                            try {
                                c1039j2.getClass();
                                webSettings.setDomStorageEnabled(zBooleanValue);
                                listQ = AbstractC0149a.y(null);
                            } catch (Throwable th) {
                                listQ = Z1.f.Q(th);
                            }
                            lVar.u(listQ);
                            break;
                        case 1:
                            C1039j c1039j3 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj;
                            Object obj4 = list2.get(0);
                            N3.h.c(obj4, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings2 = (WebSettings) obj4;
                            Object obj5 = list2.get(1);
                            N3.h.c(obj5, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue2 = ((Boolean) obj5).booleanValue();
                            try {
                                c1039j3.getClass();
                                webSettings2.setJavaScriptEnabled(zBooleanValue2);
                                listQ2 = AbstractC0149a.y(null);
                            } catch (Throwable th2) {
                                listQ2 = Z1.f.Q(th2);
                            }
                            lVar.u(listQ2);
                            break;
                        case 2:
                            C1039j c1039j4 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj;
                            Object obj6 = list3.get(0);
                            N3.h.c(obj6, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings3 = (WebSettings) obj6;
                            String str = (String) list3.get(1);
                            try {
                                c1039j4.getClass();
                                webSettings3.setUserAgentString(str);
                                listQ3 = AbstractC0149a.y(null);
                            } catch (Throwable th3) {
                                listQ3 = Z1.f.Q(th3);
                            }
                            lVar.u(listQ3);
                            break;
                        case 3:
                            C1039j c1039j5 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj;
                            Object obj7 = list4.get(0);
                            N3.h.c(obj7, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings4 = (WebSettings) obj7;
                            Object obj8 = list4.get(1);
                            N3.h.c(obj8, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue3 = ((Boolean) obj8).booleanValue();
                            try {
                                c1039j5.getClass();
                                webSettings4.setMediaPlaybackRequiresUserGesture(zBooleanValue3);
                                listQ4 = AbstractC0149a.y(null);
                            } catch (Throwable th4) {
                                listQ4 = Z1.f.Q(th4);
                            }
                            lVar.u(listQ4);
                            break;
                        case 4:
                            C1039j c1039j6 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj;
                            Object obj9 = list5.get(0);
                            N3.h.c(obj9, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings5 = (WebSettings) obj9;
                            Object obj10 = list5.get(1);
                            N3.h.c(obj10, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue4 = ((Boolean) obj10).booleanValue();
                            try {
                                c1039j6.getClass();
                                webSettings5.setSupportZoom(zBooleanValue4);
                                listQ5 = AbstractC0149a.y(null);
                            } catch (Throwable th5) {
                                listQ5 = Z1.f.Q(th5);
                            }
                            lVar.u(listQ5);
                            break;
                        case 5:
                            C1039j c1039j7 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj;
                            Object obj11 = list6.get(0);
                            N3.h.c(obj11, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings6 = (WebSettings) obj11;
                            Object obj12 = list6.get(1);
                            N3.h.c(obj12, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue5 = ((Boolean) obj12).booleanValue();
                            try {
                                c1039j7.getClass();
                                webSettings6.setLoadWithOverviewMode(zBooleanValue5);
                                listQ6 = AbstractC0149a.y(null);
                            } catch (Throwable th6) {
                                listQ6 = Z1.f.Q(th6);
                            }
                            lVar.u(listQ6);
                            break;
                        case O.j.STRING_SET_FIELD_NUMBER /* 6 */:
                            C1039j c1039j8 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj;
                            Object obj13 = list7.get(0);
                            N3.h.c(obj13, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings7 = (WebSettings) obj13;
                            Object obj14 = list7.get(1);
                            N3.h.c(obj14, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue6 = ((Boolean) obj14).booleanValue();
                            try {
                                c1039j8.getClass();
                                webSettings7.setUseWideViewPort(zBooleanValue6);
                                listQ7 = AbstractC0149a.y(null);
                            } catch (Throwable th7) {
                                listQ7 = Z1.f.Q(th7);
                            }
                            lVar.u(listQ7);
                            break;
                        case O.j.DOUBLE_FIELD_NUMBER /* 7 */:
                            C1039j c1039j9 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj;
                            Object obj15 = list8.get(0);
                            N3.h.c(obj15, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings8 = (WebSettings) obj15;
                            Object obj16 = list8.get(1);
                            N3.h.c(obj16, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue7 = ((Boolean) obj16).booleanValue();
                            try {
                                c1039j9.getClass();
                                webSettings8.setDisplayZoomControls(zBooleanValue7);
                                listQ8 = AbstractC0149a.y(null);
                            } catch (Throwable th8) {
                                listQ8 = Z1.f.Q(th8);
                            }
                            lVar.u(listQ8);
                            break;
                        case O.j.BYTES_FIELD_NUMBER /* 8 */:
                            C1039j c1039j10 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj;
                            Object obj17 = list9.get(0);
                            N3.h.c(obj17, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings9 = (WebSettings) obj17;
                            Object obj18 = list9.get(1);
                            N3.h.c(obj18, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue8 = ((Boolean) obj18).booleanValue();
                            try {
                                c1039j10.getClass();
                                webSettings9.setBuiltInZoomControls(zBooleanValue8);
                                listQ9 = AbstractC0149a.y(null);
                            } catch (Throwable th9) {
                                listQ9 = Z1.f.Q(th9);
                            }
                            lVar.u(listQ9);
                            break;
                        case 9:
                            C1039j c1039j11 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj;
                            Object obj19 = list10.get(0);
                            N3.h.c(obj19, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings10 = (WebSettings) obj19;
                            Object obj20 = list10.get(1);
                            N3.h.c(obj20, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue9 = ((Boolean) obj20).booleanValue();
                            try {
                                c1039j11.getClass();
                                webSettings10.setAllowFileAccess(zBooleanValue9);
                                listQ10 = AbstractC0149a.y(null);
                            } catch (Throwable th10) {
                                listQ10 = Z1.f.Q(th10);
                            }
                            lVar.u(listQ10);
                            break;
                        case 10:
                            C1039j c1039j12 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj;
                            Object obj21 = list11.get(0);
                            N3.h.c(obj21, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings11 = (WebSettings) obj21;
                            Object obj22 = list11.get(1);
                            N3.h.c(obj22, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue10 = ((Boolean) obj22).booleanValue();
                            try {
                                c1039j12.getClass();
                                webSettings11.setAllowContentAccess(zBooleanValue10);
                                listQ11 = AbstractC0149a.y(null);
                            } catch (Throwable th11) {
                                listQ11 = Z1.f.Q(th11);
                            }
                            lVar.u(listQ11);
                            break;
                        case 11:
                            C1039j c1039j13 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list12 = (List) obj;
                            Object obj23 = list12.get(0);
                            N3.h.c(obj23, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings12 = (WebSettings) obj23;
                            Object obj24 = list12.get(1);
                            N3.h.c(obj24, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue11 = ((Boolean) obj24).booleanValue();
                            try {
                                c1039j13.getClass();
                                webSettings12.setGeolocationEnabled(zBooleanValue11);
                                listQ12 = AbstractC0149a.y(null);
                            } catch (Throwable th12) {
                                listQ12 = Z1.f.Q(th12);
                            }
                            lVar.u(listQ12);
                            break;
                        case 12:
                            C1039j c1039j14 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj;
                            Object obj25 = list13.get(0);
                            N3.h.c(obj25, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings13 = (WebSettings) obj25;
                            Object obj26 = list13.get(1);
                            N3.h.c(obj26, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue = ((Long) obj26).longValue();
                            try {
                                c1039j14.getClass();
                                webSettings13.setTextZoom((int) jLongValue);
                                listQ13 = AbstractC0149a.y(null);
                            } catch (Throwable th13) {
                                listQ13 = Z1.f.Q(th13);
                            }
                            lVar.u(listQ13);
                            break;
                        case 13:
                            C1039j c1039j15 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj27 = ((List) obj).get(0);
                            N3.h.c(obj27, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings14 = (WebSettings) obj27;
                            try {
                                c1039j15.getClass();
                                listQ14 = AbstractC0149a.y(webSettings14.getUserAgentString());
                            } catch (Throwable th14) {
                                listQ14 = Z1.f.Q(th14);
                            }
                            lVar.u(listQ14);
                            break;
                        case 14:
                            C1039j c1039j16 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list14 = (List) obj;
                            Object obj28 = list14.get(0);
                            N3.h.c(obj28, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings15 = (WebSettings) obj28;
                            Object obj29 = list14.get(1);
                            N3.h.c(obj29, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.MixedContentMode");
                            EnumC1049t enumC1049t = (EnumC1049t) obj29;
                            try {
                                c1039j16.getClass();
                                int iOrdinal = enumC1049t.ordinal();
                                if (iOrdinal == 0) {
                                    webSettings15.setMixedContentMode(0);
                                } else if (iOrdinal == 1) {
                                    webSettings15.setMixedContentMode(2);
                                } else if (iOrdinal == 2) {
                                    webSettings15.setMixedContentMode(1);
                                }
                                listQ15 = AbstractC0149a.y(null);
                            } catch (Throwable th15) {
                                listQ15 = Z1.f.Q(th15);
                            }
                            lVar.u(listQ15);
                            break;
                        case 15:
                            C1039j c1039j17 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list15 = (List) obj;
                            Object obj30 = list15.get(0);
                            N3.h.c(obj30, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings16 = (WebSettings) obj30;
                            Object obj31 = list15.get(1);
                            N3.h.c(obj31, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue12 = ((Boolean) obj31).booleanValue();
                            try {
                                c1039j17.getClass();
                                webSettings16.setJavaScriptCanOpenWindowsAutomatically(zBooleanValue12);
                                listQ16 = AbstractC0149a.y(null);
                            } catch (Throwable th16) {
                                listQ16 = Z1.f.Q(th16);
                            }
                            lVar.u(listQ16);
                            break;
                        default:
                            C1039j c1039j18 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list16 = (List) obj;
                            Object obj32 = list16.get(0);
                            N3.h.c(obj32, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings17 = (WebSettings) obj32;
                            Object obj33 = list16.get(1);
                            N3.h.c(obj33, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue13 = ((Boolean) obj33).booleanValue();
                            try {
                                c1039j18.getClass();
                                webSettings17.setSupportMultipleWindows(zBooleanValue13);
                                listQ17 = AbstractC0149a.y(null);
                            } catch (Throwable th17) {
                                listQ17 = Z1.f.Q(th17);
                            }
                            lVar.u(listQ17);
                            break;
                    }
                }
            });
        } else {
            iVar3.E(null);
        }
        i iVar4 = new i(interfaceC0696f, "dev.flutter.pigeon.webview_flutter_android.WebSettings.setJavaScriptEnabled", gVar, (C0200z) null);
        if (c1039j != null) {
            final int i7 = 1;
            iVar4.E(new InterfaceC0692b() { // from class: y3.G
                @Override // n3.InterfaceC0692b
                public final void t(Object obj, Z1.l lVar) {
                    List listQ;
                    List listQ2;
                    List listQ3;
                    List listQ4;
                    List listQ5;
                    List listQ6;
                    List listQ7;
                    List listQ8;
                    List listQ9;
                    List listQ10;
                    List listQ11;
                    List listQ12;
                    List listQ13;
                    List listQ14;
                    List listQ15;
                    List listQ16;
                    List listQ17;
                    switch (i7) {
                        case 0:
                            C1039j c1039j2 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj2 = list.get(0);
                            N3.h.c(obj2, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings = (WebSettings) obj2;
                            Object obj3 = list.get(1);
                            N3.h.c(obj3, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue = ((Boolean) obj3).booleanValue();
                            try {
                                c1039j2.getClass();
                                webSettings.setDomStorageEnabled(zBooleanValue);
                                listQ = AbstractC0149a.y(null);
                            } catch (Throwable th) {
                                listQ = Z1.f.Q(th);
                            }
                            lVar.u(listQ);
                            break;
                        case 1:
                            C1039j c1039j3 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj;
                            Object obj4 = list2.get(0);
                            N3.h.c(obj4, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings2 = (WebSettings) obj4;
                            Object obj5 = list2.get(1);
                            N3.h.c(obj5, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue2 = ((Boolean) obj5).booleanValue();
                            try {
                                c1039j3.getClass();
                                webSettings2.setJavaScriptEnabled(zBooleanValue2);
                                listQ2 = AbstractC0149a.y(null);
                            } catch (Throwable th2) {
                                listQ2 = Z1.f.Q(th2);
                            }
                            lVar.u(listQ2);
                            break;
                        case 2:
                            C1039j c1039j4 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj;
                            Object obj6 = list3.get(0);
                            N3.h.c(obj6, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings3 = (WebSettings) obj6;
                            String str = (String) list3.get(1);
                            try {
                                c1039j4.getClass();
                                webSettings3.setUserAgentString(str);
                                listQ3 = AbstractC0149a.y(null);
                            } catch (Throwable th3) {
                                listQ3 = Z1.f.Q(th3);
                            }
                            lVar.u(listQ3);
                            break;
                        case 3:
                            C1039j c1039j5 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj;
                            Object obj7 = list4.get(0);
                            N3.h.c(obj7, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings4 = (WebSettings) obj7;
                            Object obj8 = list4.get(1);
                            N3.h.c(obj8, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue3 = ((Boolean) obj8).booleanValue();
                            try {
                                c1039j5.getClass();
                                webSettings4.setMediaPlaybackRequiresUserGesture(zBooleanValue3);
                                listQ4 = AbstractC0149a.y(null);
                            } catch (Throwable th4) {
                                listQ4 = Z1.f.Q(th4);
                            }
                            lVar.u(listQ4);
                            break;
                        case 4:
                            C1039j c1039j6 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj;
                            Object obj9 = list5.get(0);
                            N3.h.c(obj9, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings5 = (WebSettings) obj9;
                            Object obj10 = list5.get(1);
                            N3.h.c(obj10, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue4 = ((Boolean) obj10).booleanValue();
                            try {
                                c1039j6.getClass();
                                webSettings5.setSupportZoom(zBooleanValue4);
                                listQ5 = AbstractC0149a.y(null);
                            } catch (Throwable th5) {
                                listQ5 = Z1.f.Q(th5);
                            }
                            lVar.u(listQ5);
                            break;
                        case 5:
                            C1039j c1039j7 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj;
                            Object obj11 = list6.get(0);
                            N3.h.c(obj11, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings6 = (WebSettings) obj11;
                            Object obj12 = list6.get(1);
                            N3.h.c(obj12, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue5 = ((Boolean) obj12).booleanValue();
                            try {
                                c1039j7.getClass();
                                webSettings6.setLoadWithOverviewMode(zBooleanValue5);
                                listQ6 = AbstractC0149a.y(null);
                            } catch (Throwable th6) {
                                listQ6 = Z1.f.Q(th6);
                            }
                            lVar.u(listQ6);
                            break;
                        case O.j.STRING_SET_FIELD_NUMBER /* 6 */:
                            C1039j c1039j8 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj;
                            Object obj13 = list7.get(0);
                            N3.h.c(obj13, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings7 = (WebSettings) obj13;
                            Object obj14 = list7.get(1);
                            N3.h.c(obj14, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue6 = ((Boolean) obj14).booleanValue();
                            try {
                                c1039j8.getClass();
                                webSettings7.setUseWideViewPort(zBooleanValue6);
                                listQ7 = AbstractC0149a.y(null);
                            } catch (Throwable th7) {
                                listQ7 = Z1.f.Q(th7);
                            }
                            lVar.u(listQ7);
                            break;
                        case O.j.DOUBLE_FIELD_NUMBER /* 7 */:
                            C1039j c1039j9 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj;
                            Object obj15 = list8.get(0);
                            N3.h.c(obj15, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings8 = (WebSettings) obj15;
                            Object obj16 = list8.get(1);
                            N3.h.c(obj16, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue7 = ((Boolean) obj16).booleanValue();
                            try {
                                c1039j9.getClass();
                                webSettings8.setDisplayZoomControls(zBooleanValue7);
                                listQ8 = AbstractC0149a.y(null);
                            } catch (Throwable th8) {
                                listQ8 = Z1.f.Q(th8);
                            }
                            lVar.u(listQ8);
                            break;
                        case O.j.BYTES_FIELD_NUMBER /* 8 */:
                            C1039j c1039j10 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj;
                            Object obj17 = list9.get(0);
                            N3.h.c(obj17, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings9 = (WebSettings) obj17;
                            Object obj18 = list9.get(1);
                            N3.h.c(obj18, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue8 = ((Boolean) obj18).booleanValue();
                            try {
                                c1039j10.getClass();
                                webSettings9.setBuiltInZoomControls(zBooleanValue8);
                                listQ9 = AbstractC0149a.y(null);
                            } catch (Throwable th9) {
                                listQ9 = Z1.f.Q(th9);
                            }
                            lVar.u(listQ9);
                            break;
                        case 9:
                            C1039j c1039j11 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj;
                            Object obj19 = list10.get(0);
                            N3.h.c(obj19, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings10 = (WebSettings) obj19;
                            Object obj20 = list10.get(1);
                            N3.h.c(obj20, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue9 = ((Boolean) obj20).booleanValue();
                            try {
                                c1039j11.getClass();
                                webSettings10.setAllowFileAccess(zBooleanValue9);
                                listQ10 = AbstractC0149a.y(null);
                            } catch (Throwable th10) {
                                listQ10 = Z1.f.Q(th10);
                            }
                            lVar.u(listQ10);
                            break;
                        case 10:
                            C1039j c1039j12 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj;
                            Object obj21 = list11.get(0);
                            N3.h.c(obj21, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings11 = (WebSettings) obj21;
                            Object obj22 = list11.get(1);
                            N3.h.c(obj22, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue10 = ((Boolean) obj22).booleanValue();
                            try {
                                c1039j12.getClass();
                                webSettings11.setAllowContentAccess(zBooleanValue10);
                                listQ11 = AbstractC0149a.y(null);
                            } catch (Throwable th11) {
                                listQ11 = Z1.f.Q(th11);
                            }
                            lVar.u(listQ11);
                            break;
                        case 11:
                            C1039j c1039j13 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list12 = (List) obj;
                            Object obj23 = list12.get(0);
                            N3.h.c(obj23, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings12 = (WebSettings) obj23;
                            Object obj24 = list12.get(1);
                            N3.h.c(obj24, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue11 = ((Boolean) obj24).booleanValue();
                            try {
                                c1039j13.getClass();
                                webSettings12.setGeolocationEnabled(zBooleanValue11);
                                listQ12 = AbstractC0149a.y(null);
                            } catch (Throwable th12) {
                                listQ12 = Z1.f.Q(th12);
                            }
                            lVar.u(listQ12);
                            break;
                        case 12:
                            C1039j c1039j14 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj;
                            Object obj25 = list13.get(0);
                            N3.h.c(obj25, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings13 = (WebSettings) obj25;
                            Object obj26 = list13.get(1);
                            N3.h.c(obj26, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue = ((Long) obj26).longValue();
                            try {
                                c1039j14.getClass();
                                webSettings13.setTextZoom((int) jLongValue);
                                listQ13 = AbstractC0149a.y(null);
                            } catch (Throwable th13) {
                                listQ13 = Z1.f.Q(th13);
                            }
                            lVar.u(listQ13);
                            break;
                        case 13:
                            C1039j c1039j15 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj27 = ((List) obj).get(0);
                            N3.h.c(obj27, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings14 = (WebSettings) obj27;
                            try {
                                c1039j15.getClass();
                                listQ14 = AbstractC0149a.y(webSettings14.getUserAgentString());
                            } catch (Throwable th14) {
                                listQ14 = Z1.f.Q(th14);
                            }
                            lVar.u(listQ14);
                            break;
                        case 14:
                            C1039j c1039j16 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list14 = (List) obj;
                            Object obj28 = list14.get(0);
                            N3.h.c(obj28, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings15 = (WebSettings) obj28;
                            Object obj29 = list14.get(1);
                            N3.h.c(obj29, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.MixedContentMode");
                            EnumC1049t enumC1049t = (EnumC1049t) obj29;
                            try {
                                c1039j16.getClass();
                                int iOrdinal = enumC1049t.ordinal();
                                if (iOrdinal == 0) {
                                    webSettings15.setMixedContentMode(0);
                                } else if (iOrdinal == 1) {
                                    webSettings15.setMixedContentMode(2);
                                } else if (iOrdinal == 2) {
                                    webSettings15.setMixedContentMode(1);
                                }
                                listQ15 = AbstractC0149a.y(null);
                            } catch (Throwable th15) {
                                listQ15 = Z1.f.Q(th15);
                            }
                            lVar.u(listQ15);
                            break;
                        case 15:
                            C1039j c1039j17 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list15 = (List) obj;
                            Object obj30 = list15.get(0);
                            N3.h.c(obj30, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings16 = (WebSettings) obj30;
                            Object obj31 = list15.get(1);
                            N3.h.c(obj31, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue12 = ((Boolean) obj31).booleanValue();
                            try {
                                c1039j17.getClass();
                                webSettings16.setJavaScriptCanOpenWindowsAutomatically(zBooleanValue12);
                                listQ16 = AbstractC0149a.y(null);
                            } catch (Throwable th16) {
                                listQ16 = Z1.f.Q(th16);
                            }
                            lVar.u(listQ16);
                            break;
                        default:
                            C1039j c1039j18 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list16 = (List) obj;
                            Object obj32 = list16.get(0);
                            N3.h.c(obj32, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings17 = (WebSettings) obj32;
                            Object obj33 = list16.get(1);
                            N3.h.c(obj33, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue13 = ((Boolean) obj33).booleanValue();
                            try {
                                c1039j18.getClass();
                                webSettings17.setSupportMultipleWindows(zBooleanValue13);
                                listQ17 = AbstractC0149a.y(null);
                            } catch (Throwable th17) {
                                listQ17 = Z1.f.Q(th17);
                            }
                            lVar.u(listQ17);
                            break;
                    }
                }
            });
        } else {
            iVar4.E(null);
        }
        i iVar5 = new i(interfaceC0696f, "dev.flutter.pigeon.webview_flutter_android.WebSettings.setUserAgentString", gVar, (C0200z) null);
        if (c1039j != null) {
            final int i8 = 2;
            iVar5.E(new InterfaceC0692b() { // from class: y3.G
                @Override // n3.InterfaceC0692b
                public final void t(Object obj, Z1.l lVar) {
                    List listQ;
                    List listQ2;
                    List listQ3;
                    List listQ4;
                    List listQ5;
                    List listQ6;
                    List listQ7;
                    List listQ8;
                    List listQ9;
                    List listQ10;
                    List listQ11;
                    List listQ12;
                    List listQ13;
                    List listQ14;
                    List listQ15;
                    List listQ16;
                    List listQ17;
                    switch (i8) {
                        case 0:
                            C1039j c1039j2 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj2 = list.get(0);
                            N3.h.c(obj2, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings = (WebSettings) obj2;
                            Object obj3 = list.get(1);
                            N3.h.c(obj3, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue = ((Boolean) obj3).booleanValue();
                            try {
                                c1039j2.getClass();
                                webSettings.setDomStorageEnabled(zBooleanValue);
                                listQ = AbstractC0149a.y(null);
                            } catch (Throwable th) {
                                listQ = Z1.f.Q(th);
                            }
                            lVar.u(listQ);
                            break;
                        case 1:
                            C1039j c1039j3 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj;
                            Object obj4 = list2.get(0);
                            N3.h.c(obj4, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings2 = (WebSettings) obj4;
                            Object obj5 = list2.get(1);
                            N3.h.c(obj5, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue2 = ((Boolean) obj5).booleanValue();
                            try {
                                c1039j3.getClass();
                                webSettings2.setJavaScriptEnabled(zBooleanValue2);
                                listQ2 = AbstractC0149a.y(null);
                            } catch (Throwable th2) {
                                listQ2 = Z1.f.Q(th2);
                            }
                            lVar.u(listQ2);
                            break;
                        case 2:
                            C1039j c1039j4 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj;
                            Object obj6 = list3.get(0);
                            N3.h.c(obj6, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings3 = (WebSettings) obj6;
                            String str = (String) list3.get(1);
                            try {
                                c1039j4.getClass();
                                webSettings3.setUserAgentString(str);
                                listQ3 = AbstractC0149a.y(null);
                            } catch (Throwable th3) {
                                listQ3 = Z1.f.Q(th3);
                            }
                            lVar.u(listQ3);
                            break;
                        case 3:
                            C1039j c1039j5 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj;
                            Object obj7 = list4.get(0);
                            N3.h.c(obj7, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings4 = (WebSettings) obj7;
                            Object obj8 = list4.get(1);
                            N3.h.c(obj8, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue3 = ((Boolean) obj8).booleanValue();
                            try {
                                c1039j5.getClass();
                                webSettings4.setMediaPlaybackRequiresUserGesture(zBooleanValue3);
                                listQ4 = AbstractC0149a.y(null);
                            } catch (Throwable th4) {
                                listQ4 = Z1.f.Q(th4);
                            }
                            lVar.u(listQ4);
                            break;
                        case 4:
                            C1039j c1039j6 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj;
                            Object obj9 = list5.get(0);
                            N3.h.c(obj9, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings5 = (WebSettings) obj9;
                            Object obj10 = list5.get(1);
                            N3.h.c(obj10, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue4 = ((Boolean) obj10).booleanValue();
                            try {
                                c1039j6.getClass();
                                webSettings5.setSupportZoom(zBooleanValue4);
                                listQ5 = AbstractC0149a.y(null);
                            } catch (Throwable th5) {
                                listQ5 = Z1.f.Q(th5);
                            }
                            lVar.u(listQ5);
                            break;
                        case 5:
                            C1039j c1039j7 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj;
                            Object obj11 = list6.get(0);
                            N3.h.c(obj11, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings6 = (WebSettings) obj11;
                            Object obj12 = list6.get(1);
                            N3.h.c(obj12, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue5 = ((Boolean) obj12).booleanValue();
                            try {
                                c1039j7.getClass();
                                webSettings6.setLoadWithOverviewMode(zBooleanValue5);
                                listQ6 = AbstractC0149a.y(null);
                            } catch (Throwable th6) {
                                listQ6 = Z1.f.Q(th6);
                            }
                            lVar.u(listQ6);
                            break;
                        case O.j.STRING_SET_FIELD_NUMBER /* 6 */:
                            C1039j c1039j8 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj;
                            Object obj13 = list7.get(0);
                            N3.h.c(obj13, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings7 = (WebSettings) obj13;
                            Object obj14 = list7.get(1);
                            N3.h.c(obj14, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue6 = ((Boolean) obj14).booleanValue();
                            try {
                                c1039j8.getClass();
                                webSettings7.setUseWideViewPort(zBooleanValue6);
                                listQ7 = AbstractC0149a.y(null);
                            } catch (Throwable th7) {
                                listQ7 = Z1.f.Q(th7);
                            }
                            lVar.u(listQ7);
                            break;
                        case O.j.DOUBLE_FIELD_NUMBER /* 7 */:
                            C1039j c1039j9 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj;
                            Object obj15 = list8.get(0);
                            N3.h.c(obj15, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings8 = (WebSettings) obj15;
                            Object obj16 = list8.get(1);
                            N3.h.c(obj16, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue7 = ((Boolean) obj16).booleanValue();
                            try {
                                c1039j9.getClass();
                                webSettings8.setDisplayZoomControls(zBooleanValue7);
                                listQ8 = AbstractC0149a.y(null);
                            } catch (Throwable th8) {
                                listQ8 = Z1.f.Q(th8);
                            }
                            lVar.u(listQ8);
                            break;
                        case O.j.BYTES_FIELD_NUMBER /* 8 */:
                            C1039j c1039j10 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj;
                            Object obj17 = list9.get(0);
                            N3.h.c(obj17, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings9 = (WebSettings) obj17;
                            Object obj18 = list9.get(1);
                            N3.h.c(obj18, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue8 = ((Boolean) obj18).booleanValue();
                            try {
                                c1039j10.getClass();
                                webSettings9.setBuiltInZoomControls(zBooleanValue8);
                                listQ9 = AbstractC0149a.y(null);
                            } catch (Throwable th9) {
                                listQ9 = Z1.f.Q(th9);
                            }
                            lVar.u(listQ9);
                            break;
                        case 9:
                            C1039j c1039j11 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj;
                            Object obj19 = list10.get(0);
                            N3.h.c(obj19, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings10 = (WebSettings) obj19;
                            Object obj20 = list10.get(1);
                            N3.h.c(obj20, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue9 = ((Boolean) obj20).booleanValue();
                            try {
                                c1039j11.getClass();
                                webSettings10.setAllowFileAccess(zBooleanValue9);
                                listQ10 = AbstractC0149a.y(null);
                            } catch (Throwable th10) {
                                listQ10 = Z1.f.Q(th10);
                            }
                            lVar.u(listQ10);
                            break;
                        case 10:
                            C1039j c1039j12 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj;
                            Object obj21 = list11.get(0);
                            N3.h.c(obj21, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings11 = (WebSettings) obj21;
                            Object obj22 = list11.get(1);
                            N3.h.c(obj22, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue10 = ((Boolean) obj22).booleanValue();
                            try {
                                c1039j12.getClass();
                                webSettings11.setAllowContentAccess(zBooleanValue10);
                                listQ11 = AbstractC0149a.y(null);
                            } catch (Throwable th11) {
                                listQ11 = Z1.f.Q(th11);
                            }
                            lVar.u(listQ11);
                            break;
                        case 11:
                            C1039j c1039j13 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list12 = (List) obj;
                            Object obj23 = list12.get(0);
                            N3.h.c(obj23, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings12 = (WebSettings) obj23;
                            Object obj24 = list12.get(1);
                            N3.h.c(obj24, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue11 = ((Boolean) obj24).booleanValue();
                            try {
                                c1039j13.getClass();
                                webSettings12.setGeolocationEnabled(zBooleanValue11);
                                listQ12 = AbstractC0149a.y(null);
                            } catch (Throwable th12) {
                                listQ12 = Z1.f.Q(th12);
                            }
                            lVar.u(listQ12);
                            break;
                        case 12:
                            C1039j c1039j14 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj;
                            Object obj25 = list13.get(0);
                            N3.h.c(obj25, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings13 = (WebSettings) obj25;
                            Object obj26 = list13.get(1);
                            N3.h.c(obj26, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue = ((Long) obj26).longValue();
                            try {
                                c1039j14.getClass();
                                webSettings13.setTextZoom((int) jLongValue);
                                listQ13 = AbstractC0149a.y(null);
                            } catch (Throwable th13) {
                                listQ13 = Z1.f.Q(th13);
                            }
                            lVar.u(listQ13);
                            break;
                        case 13:
                            C1039j c1039j15 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj27 = ((List) obj).get(0);
                            N3.h.c(obj27, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings14 = (WebSettings) obj27;
                            try {
                                c1039j15.getClass();
                                listQ14 = AbstractC0149a.y(webSettings14.getUserAgentString());
                            } catch (Throwable th14) {
                                listQ14 = Z1.f.Q(th14);
                            }
                            lVar.u(listQ14);
                            break;
                        case 14:
                            C1039j c1039j16 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list14 = (List) obj;
                            Object obj28 = list14.get(0);
                            N3.h.c(obj28, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings15 = (WebSettings) obj28;
                            Object obj29 = list14.get(1);
                            N3.h.c(obj29, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.MixedContentMode");
                            EnumC1049t enumC1049t = (EnumC1049t) obj29;
                            try {
                                c1039j16.getClass();
                                int iOrdinal = enumC1049t.ordinal();
                                if (iOrdinal == 0) {
                                    webSettings15.setMixedContentMode(0);
                                } else if (iOrdinal == 1) {
                                    webSettings15.setMixedContentMode(2);
                                } else if (iOrdinal == 2) {
                                    webSettings15.setMixedContentMode(1);
                                }
                                listQ15 = AbstractC0149a.y(null);
                            } catch (Throwable th15) {
                                listQ15 = Z1.f.Q(th15);
                            }
                            lVar.u(listQ15);
                            break;
                        case 15:
                            C1039j c1039j17 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list15 = (List) obj;
                            Object obj30 = list15.get(0);
                            N3.h.c(obj30, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings16 = (WebSettings) obj30;
                            Object obj31 = list15.get(1);
                            N3.h.c(obj31, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue12 = ((Boolean) obj31).booleanValue();
                            try {
                                c1039j17.getClass();
                                webSettings16.setJavaScriptCanOpenWindowsAutomatically(zBooleanValue12);
                                listQ16 = AbstractC0149a.y(null);
                            } catch (Throwable th16) {
                                listQ16 = Z1.f.Q(th16);
                            }
                            lVar.u(listQ16);
                            break;
                        default:
                            C1039j c1039j18 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list16 = (List) obj;
                            Object obj32 = list16.get(0);
                            N3.h.c(obj32, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings17 = (WebSettings) obj32;
                            Object obj33 = list16.get(1);
                            N3.h.c(obj33, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue13 = ((Boolean) obj33).booleanValue();
                            try {
                                c1039j18.getClass();
                                webSettings17.setSupportMultipleWindows(zBooleanValue13);
                                listQ17 = AbstractC0149a.y(null);
                            } catch (Throwable th17) {
                                listQ17 = Z1.f.Q(th17);
                            }
                            lVar.u(listQ17);
                            break;
                    }
                }
            });
        } else {
            iVar5.E(null);
        }
        i iVar6 = new i(interfaceC0696f, "dev.flutter.pigeon.webview_flutter_android.WebSettings.setMediaPlaybackRequiresUserGesture", gVar, (C0200z) null);
        if (c1039j != null) {
            final int i9 = 3;
            iVar6.E(new InterfaceC0692b() { // from class: y3.G
                @Override // n3.InterfaceC0692b
                public final void t(Object obj, Z1.l lVar) {
                    List listQ;
                    List listQ2;
                    List listQ3;
                    List listQ4;
                    List listQ5;
                    List listQ6;
                    List listQ7;
                    List listQ8;
                    List listQ9;
                    List listQ10;
                    List listQ11;
                    List listQ12;
                    List listQ13;
                    List listQ14;
                    List listQ15;
                    List listQ16;
                    List listQ17;
                    switch (i9) {
                        case 0:
                            C1039j c1039j2 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj2 = list.get(0);
                            N3.h.c(obj2, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings = (WebSettings) obj2;
                            Object obj3 = list.get(1);
                            N3.h.c(obj3, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue = ((Boolean) obj3).booleanValue();
                            try {
                                c1039j2.getClass();
                                webSettings.setDomStorageEnabled(zBooleanValue);
                                listQ = AbstractC0149a.y(null);
                            } catch (Throwable th) {
                                listQ = Z1.f.Q(th);
                            }
                            lVar.u(listQ);
                            break;
                        case 1:
                            C1039j c1039j3 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj;
                            Object obj4 = list2.get(0);
                            N3.h.c(obj4, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings2 = (WebSettings) obj4;
                            Object obj5 = list2.get(1);
                            N3.h.c(obj5, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue2 = ((Boolean) obj5).booleanValue();
                            try {
                                c1039j3.getClass();
                                webSettings2.setJavaScriptEnabled(zBooleanValue2);
                                listQ2 = AbstractC0149a.y(null);
                            } catch (Throwable th2) {
                                listQ2 = Z1.f.Q(th2);
                            }
                            lVar.u(listQ2);
                            break;
                        case 2:
                            C1039j c1039j4 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj;
                            Object obj6 = list3.get(0);
                            N3.h.c(obj6, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings3 = (WebSettings) obj6;
                            String str = (String) list3.get(1);
                            try {
                                c1039j4.getClass();
                                webSettings3.setUserAgentString(str);
                                listQ3 = AbstractC0149a.y(null);
                            } catch (Throwable th3) {
                                listQ3 = Z1.f.Q(th3);
                            }
                            lVar.u(listQ3);
                            break;
                        case 3:
                            C1039j c1039j5 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj;
                            Object obj7 = list4.get(0);
                            N3.h.c(obj7, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings4 = (WebSettings) obj7;
                            Object obj8 = list4.get(1);
                            N3.h.c(obj8, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue3 = ((Boolean) obj8).booleanValue();
                            try {
                                c1039j5.getClass();
                                webSettings4.setMediaPlaybackRequiresUserGesture(zBooleanValue3);
                                listQ4 = AbstractC0149a.y(null);
                            } catch (Throwable th4) {
                                listQ4 = Z1.f.Q(th4);
                            }
                            lVar.u(listQ4);
                            break;
                        case 4:
                            C1039j c1039j6 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj;
                            Object obj9 = list5.get(0);
                            N3.h.c(obj9, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings5 = (WebSettings) obj9;
                            Object obj10 = list5.get(1);
                            N3.h.c(obj10, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue4 = ((Boolean) obj10).booleanValue();
                            try {
                                c1039j6.getClass();
                                webSettings5.setSupportZoom(zBooleanValue4);
                                listQ5 = AbstractC0149a.y(null);
                            } catch (Throwable th5) {
                                listQ5 = Z1.f.Q(th5);
                            }
                            lVar.u(listQ5);
                            break;
                        case 5:
                            C1039j c1039j7 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj;
                            Object obj11 = list6.get(0);
                            N3.h.c(obj11, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings6 = (WebSettings) obj11;
                            Object obj12 = list6.get(1);
                            N3.h.c(obj12, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue5 = ((Boolean) obj12).booleanValue();
                            try {
                                c1039j7.getClass();
                                webSettings6.setLoadWithOverviewMode(zBooleanValue5);
                                listQ6 = AbstractC0149a.y(null);
                            } catch (Throwable th6) {
                                listQ6 = Z1.f.Q(th6);
                            }
                            lVar.u(listQ6);
                            break;
                        case O.j.STRING_SET_FIELD_NUMBER /* 6 */:
                            C1039j c1039j8 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj;
                            Object obj13 = list7.get(0);
                            N3.h.c(obj13, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings7 = (WebSettings) obj13;
                            Object obj14 = list7.get(1);
                            N3.h.c(obj14, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue6 = ((Boolean) obj14).booleanValue();
                            try {
                                c1039j8.getClass();
                                webSettings7.setUseWideViewPort(zBooleanValue6);
                                listQ7 = AbstractC0149a.y(null);
                            } catch (Throwable th7) {
                                listQ7 = Z1.f.Q(th7);
                            }
                            lVar.u(listQ7);
                            break;
                        case O.j.DOUBLE_FIELD_NUMBER /* 7 */:
                            C1039j c1039j9 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj;
                            Object obj15 = list8.get(0);
                            N3.h.c(obj15, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings8 = (WebSettings) obj15;
                            Object obj16 = list8.get(1);
                            N3.h.c(obj16, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue7 = ((Boolean) obj16).booleanValue();
                            try {
                                c1039j9.getClass();
                                webSettings8.setDisplayZoomControls(zBooleanValue7);
                                listQ8 = AbstractC0149a.y(null);
                            } catch (Throwable th8) {
                                listQ8 = Z1.f.Q(th8);
                            }
                            lVar.u(listQ8);
                            break;
                        case O.j.BYTES_FIELD_NUMBER /* 8 */:
                            C1039j c1039j10 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj;
                            Object obj17 = list9.get(0);
                            N3.h.c(obj17, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings9 = (WebSettings) obj17;
                            Object obj18 = list9.get(1);
                            N3.h.c(obj18, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue8 = ((Boolean) obj18).booleanValue();
                            try {
                                c1039j10.getClass();
                                webSettings9.setBuiltInZoomControls(zBooleanValue8);
                                listQ9 = AbstractC0149a.y(null);
                            } catch (Throwable th9) {
                                listQ9 = Z1.f.Q(th9);
                            }
                            lVar.u(listQ9);
                            break;
                        case 9:
                            C1039j c1039j11 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj;
                            Object obj19 = list10.get(0);
                            N3.h.c(obj19, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings10 = (WebSettings) obj19;
                            Object obj20 = list10.get(1);
                            N3.h.c(obj20, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue9 = ((Boolean) obj20).booleanValue();
                            try {
                                c1039j11.getClass();
                                webSettings10.setAllowFileAccess(zBooleanValue9);
                                listQ10 = AbstractC0149a.y(null);
                            } catch (Throwable th10) {
                                listQ10 = Z1.f.Q(th10);
                            }
                            lVar.u(listQ10);
                            break;
                        case 10:
                            C1039j c1039j12 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj;
                            Object obj21 = list11.get(0);
                            N3.h.c(obj21, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings11 = (WebSettings) obj21;
                            Object obj22 = list11.get(1);
                            N3.h.c(obj22, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue10 = ((Boolean) obj22).booleanValue();
                            try {
                                c1039j12.getClass();
                                webSettings11.setAllowContentAccess(zBooleanValue10);
                                listQ11 = AbstractC0149a.y(null);
                            } catch (Throwable th11) {
                                listQ11 = Z1.f.Q(th11);
                            }
                            lVar.u(listQ11);
                            break;
                        case 11:
                            C1039j c1039j13 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list12 = (List) obj;
                            Object obj23 = list12.get(0);
                            N3.h.c(obj23, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings12 = (WebSettings) obj23;
                            Object obj24 = list12.get(1);
                            N3.h.c(obj24, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue11 = ((Boolean) obj24).booleanValue();
                            try {
                                c1039j13.getClass();
                                webSettings12.setGeolocationEnabled(zBooleanValue11);
                                listQ12 = AbstractC0149a.y(null);
                            } catch (Throwable th12) {
                                listQ12 = Z1.f.Q(th12);
                            }
                            lVar.u(listQ12);
                            break;
                        case 12:
                            C1039j c1039j14 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj;
                            Object obj25 = list13.get(0);
                            N3.h.c(obj25, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings13 = (WebSettings) obj25;
                            Object obj26 = list13.get(1);
                            N3.h.c(obj26, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue = ((Long) obj26).longValue();
                            try {
                                c1039j14.getClass();
                                webSettings13.setTextZoom((int) jLongValue);
                                listQ13 = AbstractC0149a.y(null);
                            } catch (Throwable th13) {
                                listQ13 = Z1.f.Q(th13);
                            }
                            lVar.u(listQ13);
                            break;
                        case 13:
                            C1039j c1039j15 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj27 = ((List) obj).get(0);
                            N3.h.c(obj27, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings14 = (WebSettings) obj27;
                            try {
                                c1039j15.getClass();
                                listQ14 = AbstractC0149a.y(webSettings14.getUserAgentString());
                            } catch (Throwable th14) {
                                listQ14 = Z1.f.Q(th14);
                            }
                            lVar.u(listQ14);
                            break;
                        case 14:
                            C1039j c1039j16 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list14 = (List) obj;
                            Object obj28 = list14.get(0);
                            N3.h.c(obj28, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings15 = (WebSettings) obj28;
                            Object obj29 = list14.get(1);
                            N3.h.c(obj29, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.MixedContentMode");
                            EnumC1049t enumC1049t = (EnumC1049t) obj29;
                            try {
                                c1039j16.getClass();
                                int iOrdinal = enumC1049t.ordinal();
                                if (iOrdinal == 0) {
                                    webSettings15.setMixedContentMode(0);
                                } else if (iOrdinal == 1) {
                                    webSettings15.setMixedContentMode(2);
                                } else if (iOrdinal == 2) {
                                    webSettings15.setMixedContentMode(1);
                                }
                                listQ15 = AbstractC0149a.y(null);
                            } catch (Throwable th15) {
                                listQ15 = Z1.f.Q(th15);
                            }
                            lVar.u(listQ15);
                            break;
                        case 15:
                            C1039j c1039j17 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list15 = (List) obj;
                            Object obj30 = list15.get(0);
                            N3.h.c(obj30, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings16 = (WebSettings) obj30;
                            Object obj31 = list15.get(1);
                            N3.h.c(obj31, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue12 = ((Boolean) obj31).booleanValue();
                            try {
                                c1039j17.getClass();
                                webSettings16.setJavaScriptCanOpenWindowsAutomatically(zBooleanValue12);
                                listQ16 = AbstractC0149a.y(null);
                            } catch (Throwable th16) {
                                listQ16 = Z1.f.Q(th16);
                            }
                            lVar.u(listQ16);
                            break;
                        default:
                            C1039j c1039j18 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list16 = (List) obj;
                            Object obj32 = list16.get(0);
                            N3.h.c(obj32, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings17 = (WebSettings) obj32;
                            Object obj33 = list16.get(1);
                            N3.h.c(obj33, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue13 = ((Boolean) obj33).booleanValue();
                            try {
                                c1039j18.getClass();
                                webSettings17.setSupportMultipleWindows(zBooleanValue13);
                                listQ17 = AbstractC0149a.y(null);
                            } catch (Throwable th17) {
                                listQ17 = Z1.f.Q(th17);
                            }
                            lVar.u(listQ17);
                            break;
                    }
                }
            });
        } else {
            iVar6.E(null);
        }
        i iVar7 = new i(interfaceC0696f, "dev.flutter.pigeon.webview_flutter_android.WebSettings.setSupportZoom", gVar, (C0200z) null);
        if (c1039j != null) {
            final int i10 = 4;
            iVar7.E(new InterfaceC0692b() { // from class: y3.G
                @Override // n3.InterfaceC0692b
                public final void t(Object obj, Z1.l lVar) {
                    List listQ;
                    List listQ2;
                    List listQ3;
                    List listQ4;
                    List listQ5;
                    List listQ6;
                    List listQ7;
                    List listQ8;
                    List listQ9;
                    List listQ10;
                    List listQ11;
                    List listQ12;
                    List listQ13;
                    List listQ14;
                    List listQ15;
                    List listQ16;
                    List listQ17;
                    switch (i10) {
                        case 0:
                            C1039j c1039j2 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj2 = list.get(0);
                            N3.h.c(obj2, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings = (WebSettings) obj2;
                            Object obj3 = list.get(1);
                            N3.h.c(obj3, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue = ((Boolean) obj3).booleanValue();
                            try {
                                c1039j2.getClass();
                                webSettings.setDomStorageEnabled(zBooleanValue);
                                listQ = AbstractC0149a.y(null);
                            } catch (Throwable th) {
                                listQ = Z1.f.Q(th);
                            }
                            lVar.u(listQ);
                            break;
                        case 1:
                            C1039j c1039j3 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj;
                            Object obj4 = list2.get(0);
                            N3.h.c(obj4, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings2 = (WebSettings) obj4;
                            Object obj5 = list2.get(1);
                            N3.h.c(obj5, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue2 = ((Boolean) obj5).booleanValue();
                            try {
                                c1039j3.getClass();
                                webSettings2.setJavaScriptEnabled(zBooleanValue2);
                                listQ2 = AbstractC0149a.y(null);
                            } catch (Throwable th2) {
                                listQ2 = Z1.f.Q(th2);
                            }
                            lVar.u(listQ2);
                            break;
                        case 2:
                            C1039j c1039j4 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj;
                            Object obj6 = list3.get(0);
                            N3.h.c(obj6, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings3 = (WebSettings) obj6;
                            String str = (String) list3.get(1);
                            try {
                                c1039j4.getClass();
                                webSettings3.setUserAgentString(str);
                                listQ3 = AbstractC0149a.y(null);
                            } catch (Throwable th3) {
                                listQ3 = Z1.f.Q(th3);
                            }
                            lVar.u(listQ3);
                            break;
                        case 3:
                            C1039j c1039j5 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj;
                            Object obj7 = list4.get(0);
                            N3.h.c(obj7, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings4 = (WebSettings) obj7;
                            Object obj8 = list4.get(1);
                            N3.h.c(obj8, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue3 = ((Boolean) obj8).booleanValue();
                            try {
                                c1039j5.getClass();
                                webSettings4.setMediaPlaybackRequiresUserGesture(zBooleanValue3);
                                listQ4 = AbstractC0149a.y(null);
                            } catch (Throwable th4) {
                                listQ4 = Z1.f.Q(th4);
                            }
                            lVar.u(listQ4);
                            break;
                        case 4:
                            C1039j c1039j6 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj;
                            Object obj9 = list5.get(0);
                            N3.h.c(obj9, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings5 = (WebSettings) obj9;
                            Object obj10 = list5.get(1);
                            N3.h.c(obj10, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue4 = ((Boolean) obj10).booleanValue();
                            try {
                                c1039j6.getClass();
                                webSettings5.setSupportZoom(zBooleanValue4);
                                listQ5 = AbstractC0149a.y(null);
                            } catch (Throwable th5) {
                                listQ5 = Z1.f.Q(th5);
                            }
                            lVar.u(listQ5);
                            break;
                        case 5:
                            C1039j c1039j7 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj;
                            Object obj11 = list6.get(0);
                            N3.h.c(obj11, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings6 = (WebSettings) obj11;
                            Object obj12 = list6.get(1);
                            N3.h.c(obj12, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue5 = ((Boolean) obj12).booleanValue();
                            try {
                                c1039j7.getClass();
                                webSettings6.setLoadWithOverviewMode(zBooleanValue5);
                                listQ6 = AbstractC0149a.y(null);
                            } catch (Throwable th6) {
                                listQ6 = Z1.f.Q(th6);
                            }
                            lVar.u(listQ6);
                            break;
                        case O.j.STRING_SET_FIELD_NUMBER /* 6 */:
                            C1039j c1039j8 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj;
                            Object obj13 = list7.get(0);
                            N3.h.c(obj13, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings7 = (WebSettings) obj13;
                            Object obj14 = list7.get(1);
                            N3.h.c(obj14, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue6 = ((Boolean) obj14).booleanValue();
                            try {
                                c1039j8.getClass();
                                webSettings7.setUseWideViewPort(zBooleanValue6);
                                listQ7 = AbstractC0149a.y(null);
                            } catch (Throwable th7) {
                                listQ7 = Z1.f.Q(th7);
                            }
                            lVar.u(listQ7);
                            break;
                        case O.j.DOUBLE_FIELD_NUMBER /* 7 */:
                            C1039j c1039j9 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj;
                            Object obj15 = list8.get(0);
                            N3.h.c(obj15, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings8 = (WebSettings) obj15;
                            Object obj16 = list8.get(1);
                            N3.h.c(obj16, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue7 = ((Boolean) obj16).booleanValue();
                            try {
                                c1039j9.getClass();
                                webSettings8.setDisplayZoomControls(zBooleanValue7);
                                listQ8 = AbstractC0149a.y(null);
                            } catch (Throwable th8) {
                                listQ8 = Z1.f.Q(th8);
                            }
                            lVar.u(listQ8);
                            break;
                        case O.j.BYTES_FIELD_NUMBER /* 8 */:
                            C1039j c1039j10 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj;
                            Object obj17 = list9.get(0);
                            N3.h.c(obj17, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings9 = (WebSettings) obj17;
                            Object obj18 = list9.get(1);
                            N3.h.c(obj18, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue8 = ((Boolean) obj18).booleanValue();
                            try {
                                c1039j10.getClass();
                                webSettings9.setBuiltInZoomControls(zBooleanValue8);
                                listQ9 = AbstractC0149a.y(null);
                            } catch (Throwable th9) {
                                listQ9 = Z1.f.Q(th9);
                            }
                            lVar.u(listQ9);
                            break;
                        case 9:
                            C1039j c1039j11 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj;
                            Object obj19 = list10.get(0);
                            N3.h.c(obj19, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings10 = (WebSettings) obj19;
                            Object obj20 = list10.get(1);
                            N3.h.c(obj20, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue9 = ((Boolean) obj20).booleanValue();
                            try {
                                c1039j11.getClass();
                                webSettings10.setAllowFileAccess(zBooleanValue9);
                                listQ10 = AbstractC0149a.y(null);
                            } catch (Throwable th10) {
                                listQ10 = Z1.f.Q(th10);
                            }
                            lVar.u(listQ10);
                            break;
                        case 10:
                            C1039j c1039j12 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj;
                            Object obj21 = list11.get(0);
                            N3.h.c(obj21, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings11 = (WebSettings) obj21;
                            Object obj22 = list11.get(1);
                            N3.h.c(obj22, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue10 = ((Boolean) obj22).booleanValue();
                            try {
                                c1039j12.getClass();
                                webSettings11.setAllowContentAccess(zBooleanValue10);
                                listQ11 = AbstractC0149a.y(null);
                            } catch (Throwable th11) {
                                listQ11 = Z1.f.Q(th11);
                            }
                            lVar.u(listQ11);
                            break;
                        case 11:
                            C1039j c1039j13 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list12 = (List) obj;
                            Object obj23 = list12.get(0);
                            N3.h.c(obj23, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings12 = (WebSettings) obj23;
                            Object obj24 = list12.get(1);
                            N3.h.c(obj24, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue11 = ((Boolean) obj24).booleanValue();
                            try {
                                c1039j13.getClass();
                                webSettings12.setGeolocationEnabled(zBooleanValue11);
                                listQ12 = AbstractC0149a.y(null);
                            } catch (Throwable th12) {
                                listQ12 = Z1.f.Q(th12);
                            }
                            lVar.u(listQ12);
                            break;
                        case 12:
                            C1039j c1039j14 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj;
                            Object obj25 = list13.get(0);
                            N3.h.c(obj25, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings13 = (WebSettings) obj25;
                            Object obj26 = list13.get(1);
                            N3.h.c(obj26, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue = ((Long) obj26).longValue();
                            try {
                                c1039j14.getClass();
                                webSettings13.setTextZoom((int) jLongValue);
                                listQ13 = AbstractC0149a.y(null);
                            } catch (Throwable th13) {
                                listQ13 = Z1.f.Q(th13);
                            }
                            lVar.u(listQ13);
                            break;
                        case 13:
                            C1039j c1039j15 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj27 = ((List) obj).get(0);
                            N3.h.c(obj27, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings14 = (WebSettings) obj27;
                            try {
                                c1039j15.getClass();
                                listQ14 = AbstractC0149a.y(webSettings14.getUserAgentString());
                            } catch (Throwable th14) {
                                listQ14 = Z1.f.Q(th14);
                            }
                            lVar.u(listQ14);
                            break;
                        case 14:
                            C1039j c1039j16 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list14 = (List) obj;
                            Object obj28 = list14.get(0);
                            N3.h.c(obj28, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings15 = (WebSettings) obj28;
                            Object obj29 = list14.get(1);
                            N3.h.c(obj29, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.MixedContentMode");
                            EnumC1049t enumC1049t = (EnumC1049t) obj29;
                            try {
                                c1039j16.getClass();
                                int iOrdinal = enumC1049t.ordinal();
                                if (iOrdinal == 0) {
                                    webSettings15.setMixedContentMode(0);
                                } else if (iOrdinal == 1) {
                                    webSettings15.setMixedContentMode(2);
                                } else if (iOrdinal == 2) {
                                    webSettings15.setMixedContentMode(1);
                                }
                                listQ15 = AbstractC0149a.y(null);
                            } catch (Throwable th15) {
                                listQ15 = Z1.f.Q(th15);
                            }
                            lVar.u(listQ15);
                            break;
                        case 15:
                            C1039j c1039j17 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list15 = (List) obj;
                            Object obj30 = list15.get(0);
                            N3.h.c(obj30, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings16 = (WebSettings) obj30;
                            Object obj31 = list15.get(1);
                            N3.h.c(obj31, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue12 = ((Boolean) obj31).booleanValue();
                            try {
                                c1039j17.getClass();
                                webSettings16.setJavaScriptCanOpenWindowsAutomatically(zBooleanValue12);
                                listQ16 = AbstractC0149a.y(null);
                            } catch (Throwable th16) {
                                listQ16 = Z1.f.Q(th16);
                            }
                            lVar.u(listQ16);
                            break;
                        default:
                            C1039j c1039j18 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list16 = (List) obj;
                            Object obj32 = list16.get(0);
                            N3.h.c(obj32, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings17 = (WebSettings) obj32;
                            Object obj33 = list16.get(1);
                            N3.h.c(obj33, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue13 = ((Boolean) obj33).booleanValue();
                            try {
                                c1039j18.getClass();
                                webSettings17.setSupportMultipleWindows(zBooleanValue13);
                                listQ17 = AbstractC0149a.y(null);
                            } catch (Throwable th17) {
                                listQ17 = Z1.f.Q(th17);
                            }
                            lVar.u(listQ17);
                            break;
                    }
                }
            });
        } else {
            iVar7.E(null);
        }
        i iVar8 = new i(interfaceC0696f, "dev.flutter.pigeon.webview_flutter_android.WebSettings.setLoadWithOverviewMode", gVar, (C0200z) null);
        if (c1039j != null) {
            final int i11 = 5;
            iVar8.E(new InterfaceC0692b() { // from class: y3.G
                @Override // n3.InterfaceC0692b
                public final void t(Object obj, Z1.l lVar) {
                    List listQ;
                    List listQ2;
                    List listQ3;
                    List listQ4;
                    List listQ5;
                    List listQ6;
                    List listQ7;
                    List listQ8;
                    List listQ9;
                    List listQ10;
                    List listQ11;
                    List listQ12;
                    List listQ13;
                    List listQ14;
                    List listQ15;
                    List listQ16;
                    List listQ17;
                    switch (i11) {
                        case 0:
                            C1039j c1039j2 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj2 = list.get(0);
                            N3.h.c(obj2, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings = (WebSettings) obj2;
                            Object obj3 = list.get(1);
                            N3.h.c(obj3, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue = ((Boolean) obj3).booleanValue();
                            try {
                                c1039j2.getClass();
                                webSettings.setDomStorageEnabled(zBooleanValue);
                                listQ = AbstractC0149a.y(null);
                            } catch (Throwable th) {
                                listQ = Z1.f.Q(th);
                            }
                            lVar.u(listQ);
                            break;
                        case 1:
                            C1039j c1039j3 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj;
                            Object obj4 = list2.get(0);
                            N3.h.c(obj4, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings2 = (WebSettings) obj4;
                            Object obj5 = list2.get(1);
                            N3.h.c(obj5, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue2 = ((Boolean) obj5).booleanValue();
                            try {
                                c1039j3.getClass();
                                webSettings2.setJavaScriptEnabled(zBooleanValue2);
                                listQ2 = AbstractC0149a.y(null);
                            } catch (Throwable th2) {
                                listQ2 = Z1.f.Q(th2);
                            }
                            lVar.u(listQ2);
                            break;
                        case 2:
                            C1039j c1039j4 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj;
                            Object obj6 = list3.get(0);
                            N3.h.c(obj6, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings3 = (WebSettings) obj6;
                            String str = (String) list3.get(1);
                            try {
                                c1039j4.getClass();
                                webSettings3.setUserAgentString(str);
                                listQ3 = AbstractC0149a.y(null);
                            } catch (Throwable th3) {
                                listQ3 = Z1.f.Q(th3);
                            }
                            lVar.u(listQ3);
                            break;
                        case 3:
                            C1039j c1039j5 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj;
                            Object obj7 = list4.get(0);
                            N3.h.c(obj7, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings4 = (WebSettings) obj7;
                            Object obj8 = list4.get(1);
                            N3.h.c(obj8, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue3 = ((Boolean) obj8).booleanValue();
                            try {
                                c1039j5.getClass();
                                webSettings4.setMediaPlaybackRequiresUserGesture(zBooleanValue3);
                                listQ4 = AbstractC0149a.y(null);
                            } catch (Throwable th4) {
                                listQ4 = Z1.f.Q(th4);
                            }
                            lVar.u(listQ4);
                            break;
                        case 4:
                            C1039j c1039j6 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj;
                            Object obj9 = list5.get(0);
                            N3.h.c(obj9, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings5 = (WebSettings) obj9;
                            Object obj10 = list5.get(1);
                            N3.h.c(obj10, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue4 = ((Boolean) obj10).booleanValue();
                            try {
                                c1039j6.getClass();
                                webSettings5.setSupportZoom(zBooleanValue4);
                                listQ5 = AbstractC0149a.y(null);
                            } catch (Throwable th5) {
                                listQ5 = Z1.f.Q(th5);
                            }
                            lVar.u(listQ5);
                            break;
                        case 5:
                            C1039j c1039j7 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj;
                            Object obj11 = list6.get(0);
                            N3.h.c(obj11, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings6 = (WebSettings) obj11;
                            Object obj12 = list6.get(1);
                            N3.h.c(obj12, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue5 = ((Boolean) obj12).booleanValue();
                            try {
                                c1039j7.getClass();
                                webSettings6.setLoadWithOverviewMode(zBooleanValue5);
                                listQ6 = AbstractC0149a.y(null);
                            } catch (Throwable th6) {
                                listQ6 = Z1.f.Q(th6);
                            }
                            lVar.u(listQ6);
                            break;
                        case O.j.STRING_SET_FIELD_NUMBER /* 6 */:
                            C1039j c1039j8 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj;
                            Object obj13 = list7.get(0);
                            N3.h.c(obj13, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings7 = (WebSettings) obj13;
                            Object obj14 = list7.get(1);
                            N3.h.c(obj14, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue6 = ((Boolean) obj14).booleanValue();
                            try {
                                c1039j8.getClass();
                                webSettings7.setUseWideViewPort(zBooleanValue6);
                                listQ7 = AbstractC0149a.y(null);
                            } catch (Throwable th7) {
                                listQ7 = Z1.f.Q(th7);
                            }
                            lVar.u(listQ7);
                            break;
                        case O.j.DOUBLE_FIELD_NUMBER /* 7 */:
                            C1039j c1039j9 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj;
                            Object obj15 = list8.get(0);
                            N3.h.c(obj15, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings8 = (WebSettings) obj15;
                            Object obj16 = list8.get(1);
                            N3.h.c(obj16, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue7 = ((Boolean) obj16).booleanValue();
                            try {
                                c1039j9.getClass();
                                webSettings8.setDisplayZoomControls(zBooleanValue7);
                                listQ8 = AbstractC0149a.y(null);
                            } catch (Throwable th8) {
                                listQ8 = Z1.f.Q(th8);
                            }
                            lVar.u(listQ8);
                            break;
                        case O.j.BYTES_FIELD_NUMBER /* 8 */:
                            C1039j c1039j10 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj;
                            Object obj17 = list9.get(0);
                            N3.h.c(obj17, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings9 = (WebSettings) obj17;
                            Object obj18 = list9.get(1);
                            N3.h.c(obj18, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue8 = ((Boolean) obj18).booleanValue();
                            try {
                                c1039j10.getClass();
                                webSettings9.setBuiltInZoomControls(zBooleanValue8);
                                listQ9 = AbstractC0149a.y(null);
                            } catch (Throwable th9) {
                                listQ9 = Z1.f.Q(th9);
                            }
                            lVar.u(listQ9);
                            break;
                        case 9:
                            C1039j c1039j11 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj;
                            Object obj19 = list10.get(0);
                            N3.h.c(obj19, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings10 = (WebSettings) obj19;
                            Object obj20 = list10.get(1);
                            N3.h.c(obj20, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue9 = ((Boolean) obj20).booleanValue();
                            try {
                                c1039j11.getClass();
                                webSettings10.setAllowFileAccess(zBooleanValue9);
                                listQ10 = AbstractC0149a.y(null);
                            } catch (Throwable th10) {
                                listQ10 = Z1.f.Q(th10);
                            }
                            lVar.u(listQ10);
                            break;
                        case 10:
                            C1039j c1039j12 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj;
                            Object obj21 = list11.get(0);
                            N3.h.c(obj21, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings11 = (WebSettings) obj21;
                            Object obj22 = list11.get(1);
                            N3.h.c(obj22, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue10 = ((Boolean) obj22).booleanValue();
                            try {
                                c1039j12.getClass();
                                webSettings11.setAllowContentAccess(zBooleanValue10);
                                listQ11 = AbstractC0149a.y(null);
                            } catch (Throwable th11) {
                                listQ11 = Z1.f.Q(th11);
                            }
                            lVar.u(listQ11);
                            break;
                        case 11:
                            C1039j c1039j13 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list12 = (List) obj;
                            Object obj23 = list12.get(0);
                            N3.h.c(obj23, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings12 = (WebSettings) obj23;
                            Object obj24 = list12.get(1);
                            N3.h.c(obj24, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue11 = ((Boolean) obj24).booleanValue();
                            try {
                                c1039j13.getClass();
                                webSettings12.setGeolocationEnabled(zBooleanValue11);
                                listQ12 = AbstractC0149a.y(null);
                            } catch (Throwable th12) {
                                listQ12 = Z1.f.Q(th12);
                            }
                            lVar.u(listQ12);
                            break;
                        case 12:
                            C1039j c1039j14 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj;
                            Object obj25 = list13.get(0);
                            N3.h.c(obj25, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings13 = (WebSettings) obj25;
                            Object obj26 = list13.get(1);
                            N3.h.c(obj26, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue = ((Long) obj26).longValue();
                            try {
                                c1039j14.getClass();
                                webSettings13.setTextZoom((int) jLongValue);
                                listQ13 = AbstractC0149a.y(null);
                            } catch (Throwable th13) {
                                listQ13 = Z1.f.Q(th13);
                            }
                            lVar.u(listQ13);
                            break;
                        case 13:
                            C1039j c1039j15 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj27 = ((List) obj).get(0);
                            N3.h.c(obj27, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings14 = (WebSettings) obj27;
                            try {
                                c1039j15.getClass();
                                listQ14 = AbstractC0149a.y(webSettings14.getUserAgentString());
                            } catch (Throwable th14) {
                                listQ14 = Z1.f.Q(th14);
                            }
                            lVar.u(listQ14);
                            break;
                        case 14:
                            C1039j c1039j16 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list14 = (List) obj;
                            Object obj28 = list14.get(0);
                            N3.h.c(obj28, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings15 = (WebSettings) obj28;
                            Object obj29 = list14.get(1);
                            N3.h.c(obj29, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.MixedContentMode");
                            EnumC1049t enumC1049t = (EnumC1049t) obj29;
                            try {
                                c1039j16.getClass();
                                int iOrdinal = enumC1049t.ordinal();
                                if (iOrdinal == 0) {
                                    webSettings15.setMixedContentMode(0);
                                } else if (iOrdinal == 1) {
                                    webSettings15.setMixedContentMode(2);
                                } else if (iOrdinal == 2) {
                                    webSettings15.setMixedContentMode(1);
                                }
                                listQ15 = AbstractC0149a.y(null);
                            } catch (Throwable th15) {
                                listQ15 = Z1.f.Q(th15);
                            }
                            lVar.u(listQ15);
                            break;
                        case 15:
                            C1039j c1039j17 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list15 = (List) obj;
                            Object obj30 = list15.get(0);
                            N3.h.c(obj30, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings16 = (WebSettings) obj30;
                            Object obj31 = list15.get(1);
                            N3.h.c(obj31, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue12 = ((Boolean) obj31).booleanValue();
                            try {
                                c1039j17.getClass();
                                webSettings16.setJavaScriptCanOpenWindowsAutomatically(zBooleanValue12);
                                listQ16 = AbstractC0149a.y(null);
                            } catch (Throwable th16) {
                                listQ16 = Z1.f.Q(th16);
                            }
                            lVar.u(listQ16);
                            break;
                        default:
                            C1039j c1039j18 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list16 = (List) obj;
                            Object obj32 = list16.get(0);
                            N3.h.c(obj32, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings17 = (WebSettings) obj32;
                            Object obj33 = list16.get(1);
                            N3.h.c(obj33, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue13 = ((Boolean) obj33).booleanValue();
                            try {
                                c1039j18.getClass();
                                webSettings17.setSupportMultipleWindows(zBooleanValue13);
                                listQ17 = AbstractC0149a.y(null);
                            } catch (Throwable th17) {
                                listQ17 = Z1.f.Q(th17);
                            }
                            lVar.u(listQ17);
                            break;
                    }
                }
            });
        } else {
            iVar8.E(null);
        }
        i iVar9 = new i(interfaceC0696f, "dev.flutter.pigeon.webview_flutter_android.WebSettings.setUseWideViewPort", gVar, (C0200z) null);
        if (c1039j != null) {
            final int i12 = 6;
            iVar9.E(new InterfaceC0692b() { // from class: y3.G
                @Override // n3.InterfaceC0692b
                public final void t(Object obj, Z1.l lVar) {
                    List listQ;
                    List listQ2;
                    List listQ3;
                    List listQ4;
                    List listQ5;
                    List listQ6;
                    List listQ7;
                    List listQ8;
                    List listQ9;
                    List listQ10;
                    List listQ11;
                    List listQ12;
                    List listQ13;
                    List listQ14;
                    List listQ15;
                    List listQ16;
                    List listQ17;
                    switch (i12) {
                        case 0:
                            C1039j c1039j2 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj2 = list.get(0);
                            N3.h.c(obj2, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings = (WebSettings) obj2;
                            Object obj3 = list.get(1);
                            N3.h.c(obj3, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue = ((Boolean) obj3).booleanValue();
                            try {
                                c1039j2.getClass();
                                webSettings.setDomStorageEnabled(zBooleanValue);
                                listQ = AbstractC0149a.y(null);
                            } catch (Throwable th) {
                                listQ = Z1.f.Q(th);
                            }
                            lVar.u(listQ);
                            break;
                        case 1:
                            C1039j c1039j3 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj;
                            Object obj4 = list2.get(0);
                            N3.h.c(obj4, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings2 = (WebSettings) obj4;
                            Object obj5 = list2.get(1);
                            N3.h.c(obj5, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue2 = ((Boolean) obj5).booleanValue();
                            try {
                                c1039j3.getClass();
                                webSettings2.setJavaScriptEnabled(zBooleanValue2);
                                listQ2 = AbstractC0149a.y(null);
                            } catch (Throwable th2) {
                                listQ2 = Z1.f.Q(th2);
                            }
                            lVar.u(listQ2);
                            break;
                        case 2:
                            C1039j c1039j4 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj;
                            Object obj6 = list3.get(0);
                            N3.h.c(obj6, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings3 = (WebSettings) obj6;
                            String str = (String) list3.get(1);
                            try {
                                c1039j4.getClass();
                                webSettings3.setUserAgentString(str);
                                listQ3 = AbstractC0149a.y(null);
                            } catch (Throwable th3) {
                                listQ3 = Z1.f.Q(th3);
                            }
                            lVar.u(listQ3);
                            break;
                        case 3:
                            C1039j c1039j5 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj;
                            Object obj7 = list4.get(0);
                            N3.h.c(obj7, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings4 = (WebSettings) obj7;
                            Object obj8 = list4.get(1);
                            N3.h.c(obj8, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue3 = ((Boolean) obj8).booleanValue();
                            try {
                                c1039j5.getClass();
                                webSettings4.setMediaPlaybackRequiresUserGesture(zBooleanValue3);
                                listQ4 = AbstractC0149a.y(null);
                            } catch (Throwable th4) {
                                listQ4 = Z1.f.Q(th4);
                            }
                            lVar.u(listQ4);
                            break;
                        case 4:
                            C1039j c1039j6 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj;
                            Object obj9 = list5.get(0);
                            N3.h.c(obj9, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings5 = (WebSettings) obj9;
                            Object obj10 = list5.get(1);
                            N3.h.c(obj10, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue4 = ((Boolean) obj10).booleanValue();
                            try {
                                c1039j6.getClass();
                                webSettings5.setSupportZoom(zBooleanValue4);
                                listQ5 = AbstractC0149a.y(null);
                            } catch (Throwable th5) {
                                listQ5 = Z1.f.Q(th5);
                            }
                            lVar.u(listQ5);
                            break;
                        case 5:
                            C1039j c1039j7 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj;
                            Object obj11 = list6.get(0);
                            N3.h.c(obj11, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings6 = (WebSettings) obj11;
                            Object obj12 = list6.get(1);
                            N3.h.c(obj12, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue5 = ((Boolean) obj12).booleanValue();
                            try {
                                c1039j7.getClass();
                                webSettings6.setLoadWithOverviewMode(zBooleanValue5);
                                listQ6 = AbstractC0149a.y(null);
                            } catch (Throwable th6) {
                                listQ6 = Z1.f.Q(th6);
                            }
                            lVar.u(listQ6);
                            break;
                        case O.j.STRING_SET_FIELD_NUMBER /* 6 */:
                            C1039j c1039j8 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj;
                            Object obj13 = list7.get(0);
                            N3.h.c(obj13, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings7 = (WebSettings) obj13;
                            Object obj14 = list7.get(1);
                            N3.h.c(obj14, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue6 = ((Boolean) obj14).booleanValue();
                            try {
                                c1039j8.getClass();
                                webSettings7.setUseWideViewPort(zBooleanValue6);
                                listQ7 = AbstractC0149a.y(null);
                            } catch (Throwable th7) {
                                listQ7 = Z1.f.Q(th7);
                            }
                            lVar.u(listQ7);
                            break;
                        case O.j.DOUBLE_FIELD_NUMBER /* 7 */:
                            C1039j c1039j9 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj;
                            Object obj15 = list8.get(0);
                            N3.h.c(obj15, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings8 = (WebSettings) obj15;
                            Object obj16 = list8.get(1);
                            N3.h.c(obj16, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue7 = ((Boolean) obj16).booleanValue();
                            try {
                                c1039j9.getClass();
                                webSettings8.setDisplayZoomControls(zBooleanValue7);
                                listQ8 = AbstractC0149a.y(null);
                            } catch (Throwable th8) {
                                listQ8 = Z1.f.Q(th8);
                            }
                            lVar.u(listQ8);
                            break;
                        case O.j.BYTES_FIELD_NUMBER /* 8 */:
                            C1039j c1039j10 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj;
                            Object obj17 = list9.get(0);
                            N3.h.c(obj17, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings9 = (WebSettings) obj17;
                            Object obj18 = list9.get(1);
                            N3.h.c(obj18, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue8 = ((Boolean) obj18).booleanValue();
                            try {
                                c1039j10.getClass();
                                webSettings9.setBuiltInZoomControls(zBooleanValue8);
                                listQ9 = AbstractC0149a.y(null);
                            } catch (Throwable th9) {
                                listQ9 = Z1.f.Q(th9);
                            }
                            lVar.u(listQ9);
                            break;
                        case 9:
                            C1039j c1039j11 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj;
                            Object obj19 = list10.get(0);
                            N3.h.c(obj19, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings10 = (WebSettings) obj19;
                            Object obj20 = list10.get(1);
                            N3.h.c(obj20, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue9 = ((Boolean) obj20).booleanValue();
                            try {
                                c1039j11.getClass();
                                webSettings10.setAllowFileAccess(zBooleanValue9);
                                listQ10 = AbstractC0149a.y(null);
                            } catch (Throwable th10) {
                                listQ10 = Z1.f.Q(th10);
                            }
                            lVar.u(listQ10);
                            break;
                        case 10:
                            C1039j c1039j12 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj;
                            Object obj21 = list11.get(0);
                            N3.h.c(obj21, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings11 = (WebSettings) obj21;
                            Object obj22 = list11.get(1);
                            N3.h.c(obj22, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue10 = ((Boolean) obj22).booleanValue();
                            try {
                                c1039j12.getClass();
                                webSettings11.setAllowContentAccess(zBooleanValue10);
                                listQ11 = AbstractC0149a.y(null);
                            } catch (Throwable th11) {
                                listQ11 = Z1.f.Q(th11);
                            }
                            lVar.u(listQ11);
                            break;
                        case 11:
                            C1039j c1039j13 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list12 = (List) obj;
                            Object obj23 = list12.get(0);
                            N3.h.c(obj23, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings12 = (WebSettings) obj23;
                            Object obj24 = list12.get(1);
                            N3.h.c(obj24, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue11 = ((Boolean) obj24).booleanValue();
                            try {
                                c1039j13.getClass();
                                webSettings12.setGeolocationEnabled(zBooleanValue11);
                                listQ12 = AbstractC0149a.y(null);
                            } catch (Throwable th12) {
                                listQ12 = Z1.f.Q(th12);
                            }
                            lVar.u(listQ12);
                            break;
                        case 12:
                            C1039j c1039j14 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj;
                            Object obj25 = list13.get(0);
                            N3.h.c(obj25, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings13 = (WebSettings) obj25;
                            Object obj26 = list13.get(1);
                            N3.h.c(obj26, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue = ((Long) obj26).longValue();
                            try {
                                c1039j14.getClass();
                                webSettings13.setTextZoom((int) jLongValue);
                                listQ13 = AbstractC0149a.y(null);
                            } catch (Throwable th13) {
                                listQ13 = Z1.f.Q(th13);
                            }
                            lVar.u(listQ13);
                            break;
                        case 13:
                            C1039j c1039j15 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj27 = ((List) obj).get(0);
                            N3.h.c(obj27, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings14 = (WebSettings) obj27;
                            try {
                                c1039j15.getClass();
                                listQ14 = AbstractC0149a.y(webSettings14.getUserAgentString());
                            } catch (Throwable th14) {
                                listQ14 = Z1.f.Q(th14);
                            }
                            lVar.u(listQ14);
                            break;
                        case 14:
                            C1039j c1039j16 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list14 = (List) obj;
                            Object obj28 = list14.get(0);
                            N3.h.c(obj28, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings15 = (WebSettings) obj28;
                            Object obj29 = list14.get(1);
                            N3.h.c(obj29, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.MixedContentMode");
                            EnumC1049t enumC1049t = (EnumC1049t) obj29;
                            try {
                                c1039j16.getClass();
                                int iOrdinal = enumC1049t.ordinal();
                                if (iOrdinal == 0) {
                                    webSettings15.setMixedContentMode(0);
                                } else if (iOrdinal == 1) {
                                    webSettings15.setMixedContentMode(2);
                                } else if (iOrdinal == 2) {
                                    webSettings15.setMixedContentMode(1);
                                }
                                listQ15 = AbstractC0149a.y(null);
                            } catch (Throwable th15) {
                                listQ15 = Z1.f.Q(th15);
                            }
                            lVar.u(listQ15);
                            break;
                        case 15:
                            C1039j c1039j17 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list15 = (List) obj;
                            Object obj30 = list15.get(0);
                            N3.h.c(obj30, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings16 = (WebSettings) obj30;
                            Object obj31 = list15.get(1);
                            N3.h.c(obj31, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue12 = ((Boolean) obj31).booleanValue();
                            try {
                                c1039j17.getClass();
                                webSettings16.setJavaScriptCanOpenWindowsAutomatically(zBooleanValue12);
                                listQ16 = AbstractC0149a.y(null);
                            } catch (Throwable th16) {
                                listQ16 = Z1.f.Q(th16);
                            }
                            lVar.u(listQ16);
                            break;
                        default:
                            C1039j c1039j18 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list16 = (List) obj;
                            Object obj32 = list16.get(0);
                            N3.h.c(obj32, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings17 = (WebSettings) obj32;
                            Object obj33 = list16.get(1);
                            N3.h.c(obj33, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue13 = ((Boolean) obj33).booleanValue();
                            try {
                                c1039j18.getClass();
                                webSettings17.setSupportMultipleWindows(zBooleanValue13);
                                listQ17 = AbstractC0149a.y(null);
                            } catch (Throwable th17) {
                                listQ17 = Z1.f.Q(th17);
                            }
                            lVar.u(listQ17);
                            break;
                    }
                }
            });
        } else {
            iVar9.E(null);
        }
        i iVar10 = new i(interfaceC0696f, "dev.flutter.pigeon.webview_flutter_android.WebSettings.setDisplayZoomControls", gVar, (C0200z) null);
        if (c1039j != null) {
            final int i13 = 7;
            iVar10.E(new InterfaceC0692b() { // from class: y3.G
                @Override // n3.InterfaceC0692b
                public final void t(Object obj, Z1.l lVar) {
                    List listQ;
                    List listQ2;
                    List listQ3;
                    List listQ4;
                    List listQ5;
                    List listQ6;
                    List listQ7;
                    List listQ8;
                    List listQ9;
                    List listQ10;
                    List listQ11;
                    List listQ12;
                    List listQ13;
                    List listQ14;
                    List listQ15;
                    List listQ16;
                    List listQ17;
                    switch (i13) {
                        case 0:
                            C1039j c1039j2 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj2 = list.get(0);
                            N3.h.c(obj2, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings = (WebSettings) obj2;
                            Object obj3 = list.get(1);
                            N3.h.c(obj3, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue = ((Boolean) obj3).booleanValue();
                            try {
                                c1039j2.getClass();
                                webSettings.setDomStorageEnabled(zBooleanValue);
                                listQ = AbstractC0149a.y(null);
                            } catch (Throwable th) {
                                listQ = Z1.f.Q(th);
                            }
                            lVar.u(listQ);
                            break;
                        case 1:
                            C1039j c1039j3 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj;
                            Object obj4 = list2.get(0);
                            N3.h.c(obj4, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings2 = (WebSettings) obj4;
                            Object obj5 = list2.get(1);
                            N3.h.c(obj5, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue2 = ((Boolean) obj5).booleanValue();
                            try {
                                c1039j3.getClass();
                                webSettings2.setJavaScriptEnabled(zBooleanValue2);
                                listQ2 = AbstractC0149a.y(null);
                            } catch (Throwable th2) {
                                listQ2 = Z1.f.Q(th2);
                            }
                            lVar.u(listQ2);
                            break;
                        case 2:
                            C1039j c1039j4 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj;
                            Object obj6 = list3.get(0);
                            N3.h.c(obj6, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings3 = (WebSettings) obj6;
                            String str = (String) list3.get(1);
                            try {
                                c1039j4.getClass();
                                webSettings3.setUserAgentString(str);
                                listQ3 = AbstractC0149a.y(null);
                            } catch (Throwable th3) {
                                listQ3 = Z1.f.Q(th3);
                            }
                            lVar.u(listQ3);
                            break;
                        case 3:
                            C1039j c1039j5 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj;
                            Object obj7 = list4.get(0);
                            N3.h.c(obj7, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings4 = (WebSettings) obj7;
                            Object obj8 = list4.get(1);
                            N3.h.c(obj8, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue3 = ((Boolean) obj8).booleanValue();
                            try {
                                c1039j5.getClass();
                                webSettings4.setMediaPlaybackRequiresUserGesture(zBooleanValue3);
                                listQ4 = AbstractC0149a.y(null);
                            } catch (Throwable th4) {
                                listQ4 = Z1.f.Q(th4);
                            }
                            lVar.u(listQ4);
                            break;
                        case 4:
                            C1039j c1039j6 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj;
                            Object obj9 = list5.get(0);
                            N3.h.c(obj9, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings5 = (WebSettings) obj9;
                            Object obj10 = list5.get(1);
                            N3.h.c(obj10, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue4 = ((Boolean) obj10).booleanValue();
                            try {
                                c1039j6.getClass();
                                webSettings5.setSupportZoom(zBooleanValue4);
                                listQ5 = AbstractC0149a.y(null);
                            } catch (Throwable th5) {
                                listQ5 = Z1.f.Q(th5);
                            }
                            lVar.u(listQ5);
                            break;
                        case 5:
                            C1039j c1039j7 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj;
                            Object obj11 = list6.get(0);
                            N3.h.c(obj11, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings6 = (WebSettings) obj11;
                            Object obj12 = list6.get(1);
                            N3.h.c(obj12, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue5 = ((Boolean) obj12).booleanValue();
                            try {
                                c1039j7.getClass();
                                webSettings6.setLoadWithOverviewMode(zBooleanValue5);
                                listQ6 = AbstractC0149a.y(null);
                            } catch (Throwable th6) {
                                listQ6 = Z1.f.Q(th6);
                            }
                            lVar.u(listQ6);
                            break;
                        case O.j.STRING_SET_FIELD_NUMBER /* 6 */:
                            C1039j c1039j8 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj;
                            Object obj13 = list7.get(0);
                            N3.h.c(obj13, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings7 = (WebSettings) obj13;
                            Object obj14 = list7.get(1);
                            N3.h.c(obj14, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue6 = ((Boolean) obj14).booleanValue();
                            try {
                                c1039j8.getClass();
                                webSettings7.setUseWideViewPort(zBooleanValue6);
                                listQ7 = AbstractC0149a.y(null);
                            } catch (Throwable th7) {
                                listQ7 = Z1.f.Q(th7);
                            }
                            lVar.u(listQ7);
                            break;
                        case O.j.DOUBLE_FIELD_NUMBER /* 7 */:
                            C1039j c1039j9 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj;
                            Object obj15 = list8.get(0);
                            N3.h.c(obj15, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings8 = (WebSettings) obj15;
                            Object obj16 = list8.get(1);
                            N3.h.c(obj16, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue7 = ((Boolean) obj16).booleanValue();
                            try {
                                c1039j9.getClass();
                                webSettings8.setDisplayZoomControls(zBooleanValue7);
                                listQ8 = AbstractC0149a.y(null);
                            } catch (Throwable th8) {
                                listQ8 = Z1.f.Q(th8);
                            }
                            lVar.u(listQ8);
                            break;
                        case O.j.BYTES_FIELD_NUMBER /* 8 */:
                            C1039j c1039j10 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj;
                            Object obj17 = list9.get(0);
                            N3.h.c(obj17, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings9 = (WebSettings) obj17;
                            Object obj18 = list9.get(1);
                            N3.h.c(obj18, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue8 = ((Boolean) obj18).booleanValue();
                            try {
                                c1039j10.getClass();
                                webSettings9.setBuiltInZoomControls(zBooleanValue8);
                                listQ9 = AbstractC0149a.y(null);
                            } catch (Throwable th9) {
                                listQ9 = Z1.f.Q(th9);
                            }
                            lVar.u(listQ9);
                            break;
                        case 9:
                            C1039j c1039j11 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj;
                            Object obj19 = list10.get(0);
                            N3.h.c(obj19, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings10 = (WebSettings) obj19;
                            Object obj20 = list10.get(1);
                            N3.h.c(obj20, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue9 = ((Boolean) obj20).booleanValue();
                            try {
                                c1039j11.getClass();
                                webSettings10.setAllowFileAccess(zBooleanValue9);
                                listQ10 = AbstractC0149a.y(null);
                            } catch (Throwable th10) {
                                listQ10 = Z1.f.Q(th10);
                            }
                            lVar.u(listQ10);
                            break;
                        case 10:
                            C1039j c1039j12 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj;
                            Object obj21 = list11.get(0);
                            N3.h.c(obj21, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings11 = (WebSettings) obj21;
                            Object obj22 = list11.get(1);
                            N3.h.c(obj22, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue10 = ((Boolean) obj22).booleanValue();
                            try {
                                c1039j12.getClass();
                                webSettings11.setAllowContentAccess(zBooleanValue10);
                                listQ11 = AbstractC0149a.y(null);
                            } catch (Throwable th11) {
                                listQ11 = Z1.f.Q(th11);
                            }
                            lVar.u(listQ11);
                            break;
                        case 11:
                            C1039j c1039j13 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list12 = (List) obj;
                            Object obj23 = list12.get(0);
                            N3.h.c(obj23, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings12 = (WebSettings) obj23;
                            Object obj24 = list12.get(1);
                            N3.h.c(obj24, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue11 = ((Boolean) obj24).booleanValue();
                            try {
                                c1039j13.getClass();
                                webSettings12.setGeolocationEnabled(zBooleanValue11);
                                listQ12 = AbstractC0149a.y(null);
                            } catch (Throwable th12) {
                                listQ12 = Z1.f.Q(th12);
                            }
                            lVar.u(listQ12);
                            break;
                        case 12:
                            C1039j c1039j14 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj;
                            Object obj25 = list13.get(0);
                            N3.h.c(obj25, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings13 = (WebSettings) obj25;
                            Object obj26 = list13.get(1);
                            N3.h.c(obj26, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue = ((Long) obj26).longValue();
                            try {
                                c1039j14.getClass();
                                webSettings13.setTextZoom((int) jLongValue);
                                listQ13 = AbstractC0149a.y(null);
                            } catch (Throwable th13) {
                                listQ13 = Z1.f.Q(th13);
                            }
                            lVar.u(listQ13);
                            break;
                        case 13:
                            C1039j c1039j15 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj27 = ((List) obj).get(0);
                            N3.h.c(obj27, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings14 = (WebSettings) obj27;
                            try {
                                c1039j15.getClass();
                                listQ14 = AbstractC0149a.y(webSettings14.getUserAgentString());
                            } catch (Throwable th14) {
                                listQ14 = Z1.f.Q(th14);
                            }
                            lVar.u(listQ14);
                            break;
                        case 14:
                            C1039j c1039j16 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list14 = (List) obj;
                            Object obj28 = list14.get(0);
                            N3.h.c(obj28, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings15 = (WebSettings) obj28;
                            Object obj29 = list14.get(1);
                            N3.h.c(obj29, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.MixedContentMode");
                            EnumC1049t enumC1049t = (EnumC1049t) obj29;
                            try {
                                c1039j16.getClass();
                                int iOrdinal = enumC1049t.ordinal();
                                if (iOrdinal == 0) {
                                    webSettings15.setMixedContentMode(0);
                                } else if (iOrdinal == 1) {
                                    webSettings15.setMixedContentMode(2);
                                } else if (iOrdinal == 2) {
                                    webSettings15.setMixedContentMode(1);
                                }
                                listQ15 = AbstractC0149a.y(null);
                            } catch (Throwable th15) {
                                listQ15 = Z1.f.Q(th15);
                            }
                            lVar.u(listQ15);
                            break;
                        case 15:
                            C1039j c1039j17 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list15 = (List) obj;
                            Object obj30 = list15.get(0);
                            N3.h.c(obj30, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings16 = (WebSettings) obj30;
                            Object obj31 = list15.get(1);
                            N3.h.c(obj31, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue12 = ((Boolean) obj31).booleanValue();
                            try {
                                c1039j17.getClass();
                                webSettings16.setJavaScriptCanOpenWindowsAutomatically(zBooleanValue12);
                                listQ16 = AbstractC0149a.y(null);
                            } catch (Throwable th16) {
                                listQ16 = Z1.f.Q(th16);
                            }
                            lVar.u(listQ16);
                            break;
                        default:
                            C1039j c1039j18 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list16 = (List) obj;
                            Object obj32 = list16.get(0);
                            N3.h.c(obj32, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings17 = (WebSettings) obj32;
                            Object obj33 = list16.get(1);
                            N3.h.c(obj33, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue13 = ((Boolean) obj33).booleanValue();
                            try {
                                c1039j18.getClass();
                                webSettings17.setSupportMultipleWindows(zBooleanValue13);
                                listQ17 = AbstractC0149a.y(null);
                            } catch (Throwable th17) {
                                listQ17 = Z1.f.Q(th17);
                            }
                            lVar.u(listQ17);
                            break;
                    }
                }
            });
        } else {
            iVar10.E(null);
        }
        i iVar11 = new i(interfaceC0696f, "dev.flutter.pigeon.webview_flutter_android.WebSettings.setBuiltInZoomControls", gVar, (C0200z) null);
        if (c1039j != null) {
            final int i14 = 8;
            iVar11.E(new InterfaceC0692b() { // from class: y3.G
                @Override // n3.InterfaceC0692b
                public final void t(Object obj, Z1.l lVar) {
                    List listQ;
                    List listQ2;
                    List listQ3;
                    List listQ4;
                    List listQ5;
                    List listQ6;
                    List listQ7;
                    List listQ8;
                    List listQ9;
                    List listQ10;
                    List listQ11;
                    List listQ12;
                    List listQ13;
                    List listQ14;
                    List listQ15;
                    List listQ16;
                    List listQ17;
                    switch (i14) {
                        case 0:
                            C1039j c1039j2 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj2 = list.get(0);
                            N3.h.c(obj2, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings = (WebSettings) obj2;
                            Object obj3 = list.get(1);
                            N3.h.c(obj3, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue = ((Boolean) obj3).booleanValue();
                            try {
                                c1039j2.getClass();
                                webSettings.setDomStorageEnabled(zBooleanValue);
                                listQ = AbstractC0149a.y(null);
                            } catch (Throwable th) {
                                listQ = Z1.f.Q(th);
                            }
                            lVar.u(listQ);
                            break;
                        case 1:
                            C1039j c1039j3 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj;
                            Object obj4 = list2.get(0);
                            N3.h.c(obj4, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings2 = (WebSettings) obj4;
                            Object obj5 = list2.get(1);
                            N3.h.c(obj5, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue2 = ((Boolean) obj5).booleanValue();
                            try {
                                c1039j3.getClass();
                                webSettings2.setJavaScriptEnabled(zBooleanValue2);
                                listQ2 = AbstractC0149a.y(null);
                            } catch (Throwable th2) {
                                listQ2 = Z1.f.Q(th2);
                            }
                            lVar.u(listQ2);
                            break;
                        case 2:
                            C1039j c1039j4 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj;
                            Object obj6 = list3.get(0);
                            N3.h.c(obj6, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings3 = (WebSettings) obj6;
                            String str = (String) list3.get(1);
                            try {
                                c1039j4.getClass();
                                webSettings3.setUserAgentString(str);
                                listQ3 = AbstractC0149a.y(null);
                            } catch (Throwable th3) {
                                listQ3 = Z1.f.Q(th3);
                            }
                            lVar.u(listQ3);
                            break;
                        case 3:
                            C1039j c1039j5 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj;
                            Object obj7 = list4.get(0);
                            N3.h.c(obj7, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings4 = (WebSettings) obj7;
                            Object obj8 = list4.get(1);
                            N3.h.c(obj8, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue3 = ((Boolean) obj8).booleanValue();
                            try {
                                c1039j5.getClass();
                                webSettings4.setMediaPlaybackRequiresUserGesture(zBooleanValue3);
                                listQ4 = AbstractC0149a.y(null);
                            } catch (Throwable th4) {
                                listQ4 = Z1.f.Q(th4);
                            }
                            lVar.u(listQ4);
                            break;
                        case 4:
                            C1039j c1039j6 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj;
                            Object obj9 = list5.get(0);
                            N3.h.c(obj9, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings5 = (WebSettings) obj9;
                            Object obj10 = list5.get(1);
                            N3.h.c(obj10, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue4 = ((Boolean) obj10).booleanValue();
                            try {
                                c1039j6.getClass();
                                webSettings5.setSupportZoom(zBooleanValue4);
                                listQ5 = AbstractC0149a.y(null);
                            } catch (Throwable th5) {
                                listQ5 = Z1.f.Q(th5);
                            }
                            lVar.u(listQ5);
                            break;
                        case 5:
                            C1039j c1039j7 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj;
                            Object obj11 = list6.get(0);
                            N3.h.c(obj11, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings6 = (WebSettings) obj11;
                            Object obj12 = list6.get(1);
                            N3.h.c(obj12, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue5 = ((Boolean) obj12).booleanValue();
                            try {
                                c1039j7.getClass();
                                webSettings6.setLoadWithOverviewMode(zBooleanValue5);
                                listQ6 = AbstractC0149a.y(null);
                            } catch (Throwable th6) {
                                listQ6 = Z1.f.Q(th6);
                            }
                            lVar.u(listQ6);
                            break;
                        case O.j.STRING_SET_FIELD_NUMBER /* 6 */:
                            C1039j c1039j8 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj;
                            Object obj13 = list7.get(0);
                            N3.h.c(obj13, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings7 = (WebSettings) obj13;
                            Object obj14 = list7.get(1);
                            N3.h.c(obj14, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue6 = ((Boolean) obj14).booleanValue();
                            try {
                                c1039j8.getClass();
                                webSettings7.setUseWideViewPort(zBooleanValue6);
                                listQ7 = AbstractC0149a.y(null);
                            } catch (Throwable th7) {
                                listQ7 = Z1.f.Q(th7);
                            }
                            lVar.u(listQ7);
                            break;
                        case O.j.DOUBLE_FIELD_NUMBER /* 7 */:
                            C1039j c1039j9 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj;
                            Object obj15 = list8.get(0);
                            N3.h.c(obj15, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings8 = (WebSettings) obj15;
                            Object obj16 = list8.get(1);
                            N3.h.c(obj16, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue7 = ((Boolean) obj16).booleanValue();
                            try {
                                c1039j9.getClass();
                                webSettings8.setDisplayZoomControls(zBooleanValue7);
                                listQ8 = AbstractC0149a.y(null);
                            } catch (Throwable th8) {
                                listQ8 = Z1.f.Q(th8);
                            }
                            lVar.u(listQ8);
                            break;
                        case O.j.BYTES_FIELD_NUMBER /* 8 */:
                            C1039j c1039j10 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj;
                            Object obj17 = list9.get(0);
                            N3.h.c(obj17, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings9 = (WebSettings) obj17;
                            Object obj18 = list9.get(1);
                            N3.h.c(obj18, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue8 = ((Boolean) obj18).booleanValue();
                            try {
                                c1039j10.getClass();
                                webSettings9.setBuiltInZoomControls(zBooleanValue8);
                                listQ9 = AbstractC0149a.y(null);
                            } catch (Throwable th9) {
                                listQ9 = Z1.f.Q(th9);
                            }
                            lVar.u(listQ9);
                            break;
                        case 9:
                            C1039j c1039j11 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj;
                            Object obj19 = list10.get(0);
                            N3.h.c(obj19, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings10 = (WebSettings) obj19;
                            Object obj20 = list10.get(1);
                            N3.h.c(obj20, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue9 = ((Boolean) obj20).booleanValue();
                            try {
                                c1039j11.getClass();
                                webSettings10.setAllowFileAccess(zBooleanValue9);
                                listQ10 = AbstractC0149a.y(null);
                            } catch (Throwable th10) {
                                listQ10 = Z1.f.Q(th10);
                            }
                            lVar.u(listQ10);
                            break;
                        case 10:
                            C1039j c1039j12 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj;
                            Object obj21 = list11.get(0);
                            N3.h.c(obj21, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings11 = (WebSettings) obj21;
                            Object obj22 = list11.get(1);
                            N3.h.c(obj22, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue10 = ((Boolean) obj22).booleanValue();
                            try {
                                c1039j12.getClass();
                                webSettings11.setAllowContentAccess(zBooleanValue10);
                                listQ11 = AbstractC0149a.y(null);
                            } catch (Throwable th11) {
                                listQ11 = Z1.f.Q(th11);
                            }
                            lVar.u(listQ11);
                            break;
                        case 11:
                            C1039j c1039j13 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list12 = (List) obj;
                            Object obj23 = list12.get(0);
                            N3.h.c(obj23, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings12 = (WebSettings) obj23;
                            Object obj24 = list12.get(1);
                            N3.h.c(obj24, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue11 = ((Boolean) obj24).booleanValue();
                            try {
                                c1039j13.getClass();
                                webSettings12.setGeolocationEnabled(zBooleanValue11);
                                listQ12 = AbstractC0149a.y(null);
                            } catch (Throwable th12) {
                                listQ12 = Z1.f.Q(th12);
                            }
                            lVar.u(listQ12);
                            break;
                        case 12:
                            C1039j c1039j14 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj;
                            Object obj25 = list13.get(0);
                            N3.h.c(obj25, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings13 = (WebSettings) obj25;
                            Object obj26 = list13.get(1);
                            N3.h.c(obj26, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue = ((Long) obj26).longValue();
                            try {
                                c1039j14.getClass();
                                webSettings13.setTextZoom((int) jLongValue);
                                listQ13 = AbstractC0149a.y(null);
                            } catch (Throwable th13) {
                                listQ13 = Z1.f.Q(th13);
                            }
                            lVar.u(listQ13);
                            break;
                        case 13:
                            C1039j c1039j15 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj27 = ((List) obj).get(0);
                            N3.h.c(obj27, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings14 = (WebSettings) obj27;
                            try {
                                c1039j15.getClass();
                                listQ14 = AbstractC0149a.y(webSettings14.getUserAgentString());
                            } catch (Throwable th14) {
                                listQ14 = Z1.f.Q(th14);
                            }
                            lVar.u(listQ14);
                            break;
                        case 14:
                            C1039j c1039j16 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list14 = (List) obj;
                            Object obj28 = list14.get(0);
                            N3.h.c(obj28, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings15 = (WebSettings) obj28;
                            Object obj29 = list14.get(1);
                            N3.h.c(obj29, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.MixedContentMode");
                            EnumC1049t enumC1049t = (EnumC1049t) obj29;
                            try {
                                c1039j16.getClass();
                                int iOrdinal = enumC1049t.ordinal();
                                if (iOrdinal == 0) {
                                    webSettings15.setMixedContentMode(0);
                                } else if (iOrdinal == 1) {
                                    webSettings15.setMixedContentMode(2);
                                } else if (iOrdinal == 2) {
                                    webSettings15.setMixedContentMode(1);
                                }
                                listQ15 = AbstractC0149a.y(null);
                            } catch (Throwable th15) {
                                listQ15 = Z1.f.Q(th15);
                            }
                            lVar.u(listQ15);
                            break;
                        case 15:
                            C1039j c1039j17 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list15 = (List) obj;
                            Object obj30 = list15.get(0);
                            N3.h.c(obj30, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings16 = (WebSettings) obj30;
                            Object obj31 = list15.get(1);
                            N3.h.c(obj31, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue12 = ((Boolean) obj31).booleanValue();
                            try {
                                c1039j17.getClass();
                                webSettings16.setJavaScriptCanOpenWindowsAutomatically(zBooleanValue12);
                                listQ16 = AbstractC0149a.y(null);
                            } catch (Throwable th16) {
                                listQ16 = Z1.f.Q(th16);
                            }
                            lVar.u(listQ16);
                            break;
                        default:
                            C1039j c1039j18 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list16 = (List) obj;
                            Object obj32 = list16.get(0);
                            N3.h.c(obj32, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings17 = (WebSettings) obj32;
                            Object obj33 = list16.get(1);
                            N3.h.c(obj33, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue13 = ((Boolean) obj33).booleanValue();
                            try {
                                c1039j18.getClass();
                                webSettings17.setSupportMultipleWindows(zBooleanValue13);
                                listQ17 = AbstractC0149a.y(null);
                            } catch (Throwable th17) {
                                listQ17 = Z1.f.Q(th17);
                            }
                            lVar.u(listQ17);
                            break;
                    }
                }
            });
        } else {
            iVar11.E(null);
        }
        i iVar12 = new i(interfaceC0696f, "dev.flutter.pigeon.webview_flutter_android.WebSettings.setAllowFileAccess", gVar, (C0200z) null);
        if (c1039j != null) {
            final int i15 = 9;
            iVar12.E(new InterfaceC0692b() { // from class: y3.G
                @Override // n3.InterfaceC0692b
                public final void t(Object obj, Z1.l lVar) {
                    List listQ;
                    List listQ2;
                    List listQ3;
                    List listQ4;
                    List listQ5;
                    List listQ6;
                    List listQ7;
                    List listQ8;
                    List listQ9;
                    List listQ10;
                    List listQ11;
                    List listQ12;
                    List listQ13;
                    List listQ14;
                    List listQ15;
                    List listQ16;
                    List listQ17;
                    switch (i15) {
                        case 0:
                            C1039j c1039j2 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj2 = list.get(0);
                            N3.h.c(obj2, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings = (WebSettings) obj2;
                            Object obj3 = list.get(1);
                            N3.h.c(obj3, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue = ((Boolean) obj3).booleanValue();
                            try {
                                c1039j2.getClass();
                                webSettings.setDomStorageEnabled(zBooleanValue);
                                listQ = AbstractC0149a.y(null);
                            } catch (Throwable th) {
                                listQ = Z1.f.Q(th);
                            }
                            lVar.u(listQ);
                            break;
                        case 1:
                            C1039j c1039j3 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj;
                            Object obj4 = list2.get(0);
                            N3.h.c(obj4, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings2 = (WebSettings) obj4;
                            Object obj5 = list2.get(1);
                            N3.h.c(obj5, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue2 = ((Boolean) obj5).booleanValue();
                            try {
                                c1039j3.getClass();
                                webSettings2.setJavaScriptEnabled(zBooleanValue2);
                                listQ2 = AbstractC0149a.y(null);
                            } catch (Throwable th2) {
                                listQ2 = Z1.f.Q(th2);
                            }
                            lVar.u(listQ2);
                            break;
                        case 2:
                            C1039j c1039j4 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj;
                            Object obj6 = list3.get(0);
                            N3.h.c(obj6, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings3 = (WebSettings) obj6;
                            String str = (String) list3.get(1);
                            try {
                                c1039j4.getClass();
                                webSettings3.setUserAgentString(str);
                                listQ3 = AbstractC0149a.y(null);
                            } catch (Throwable th3) {
                                listQ3 = Z1.f.Q(th3);
                            }
                            lVar.u(listQ3);
                            break;
                        case 3:
                            C1039j c1039j5 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj;
                            Object obj7 = list4.get(0);
                            N3.h.c(obj7, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings4 = (WebSettings) obj7;
                            Object obj8 = list4.get(1);
                            N3.h.c(obj8, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue3 = ((Boolean) obj8).booleanValue();
                            try {
                                c1039j5.getClass();
                                webSettings4.setMediaPlaybackRequiresUserGesture(zBooleanValue3);
                                listQ4 = AbstractC0149a.y(null);
                            } catch (Throwable th4) {
                                listQ4 = Z1.f.Q(th4);
                            }
                            lVar.u(listQ4);
                            break;
                        case 4:
                            C1039j c1039j6 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj;
                            Object obj9 = list5.get(0);
                            N3.h.c(obj9, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings5 = (WebSettings) obj9;
                            Object obj10 = list5.get(1);
                            N3.h.c(obj10, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue4 = ((Boolean) obj10).booleanValue();
                            try {
                                c1039j6.getClass();
                                webSettings5.setSupportZoom(zBooleanValue4);
                                listQ5 = AbstractC0149a.y(null);
                            } catch (Throwable th5) {
                                listQ5 = Z1.f.Q(th5);
                            }
                            lVar.u(listQ5);
                            break;
                        case 5:
                            C1039j c1039j7 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj;
                            Object obj11 = list6.get(0);
                            N3.h.c(obj11, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings6 = (WebSettings) obj11;
                            Object obj12 = list6.get(1);
                            N3.h.c(obj12, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue5 = ((Boolean) obj12).booleanValue();
                            try {
                                c1039j7.getClass();
                                webSettings6.setLoadWithOverviewMode(zBooleanValue5);
                                listQ6 = AbstractC0149a.y(null);
                            } catch (Throwable th6) {
                                listQ6 = Z1.f.Q(th6);
                            }
                            lVar.u(listQ6);
                            break;
                        case O.j.STRING_SET_FIELD_NUMBER /* 6 */:
                            C1039j c1039j8 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj;
                            Object obj13 = list7.get(0);
                            N3.h.c(obj13, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings7 = (WebSettings) obj13;
                            Object obj14 = list7.get(1);
                            N3.h.c(obj14, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue6 = ((Boolean) obj14).booleanValue();
                            try {
                                c1039j8.getClass();
                                webSettings7.setUseWideViewPort(zBooleanValue6);
                                listQ7 = AbstractC0149a.y(null);
                            } catch (Throwable th7) {
                                listQ7 = Z1.f.Q(th7);
                            }
                            lVar.u(listQ7);
                            break;
                        case O.j.DOUBLE_FIELD_NUMBER /* 7 */:
                            C1039j c1039j9 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj;
                            Object obj15 = list8.get(0);
                            N3.h.c(obj15, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings8 = (WebSettings) obj15;
                            Object obj16 = list8.get(1);
                            N3.h.c(obj16, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue7 = ((Boolean) obj16).booleanValue();
                            try {
                                c1039j9.getClass();
                                webSettings8.setDisplayZoomControls(zBooleanValue7);
                                listQ8 = AbstractC0149a.y(null);
                            } catch (Throwable th8) {
                                listQ8 = Z1.f.Q(th8);
                            }
                            lVar.u(listQ8);
                            break;
                        case O.j.BYTES_FIELD_NUMBER /* 8 */:
                            C1039j c1039j10 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj;
                            Object obj17 = list9.get(0);
                            N3.h.c(obj17, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings9 = (WebSettings) obj17;
                            Object obj18 = list9.get(1);
                            N3.h.c(obj18, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue8 = ((Boolean) obj18).booleanValue();
                            try {
                                c1039j10.getClass();
                                webSettings9.setBuiltInZoomControls(zBooleanValue8);
                                listQ9 = AbstractC0149a.y(null);
                            } catch (Throwable th9) {
                                listQ9 = Z1.f.Q(th9);
                            }
                            lVar.u(listQ9);
                            break;
                        case 9:
                            C1039j c1039j11 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj;
                            Object obj19 = list10.get(0);
                            N3.h.c(obj19, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings10 = (WebSettings) obj19;
                            Object obj20 = list10.get(1);
                            N3.h.c(obj20, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue9 = ((Boolean) obj20).booleanValue();
                            try {
                                c1039j11.getClass();
                                webSettings10.setAllowFileAccess(zBooleanValue9);
                                listQ10 = AbstractC0149a.y(null);
                            } catch (Throwable th10) {
                                listQ10 = Z1.f.Q(th10);
                            }
                            lVar.u(listQ10);
                            break;
                        case 10:
                            C1039j c1039j12 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj;
                            Object obj21 = list11.get(0);
                            N3.h.c(obj21, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings11 = (WebSettings) obj21;
                            Object obj22 = list11.get(1);
                            N3.h.c(obj22, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue10 = ((Boolean) obj22).booleanValue();
                            try {
                                c1039j12.getClass();
                                webSettings11.setAllowContentAccess(zBooleanValue10);
                                listQ11 = AbstractC0149a.y(null);
                            } catch (Throwable th11) {
                                listQ11 = Z1.f.Q(th11);
                            }
                            lVar.u(listQ11);
                            break;
                        case 11:
                            C1039j c1039j13 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list12 = (List) obj;
                            Object obj23 = list12.get(0);
                            N3.h.c(obj23, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings12 = (WebSettings) obj23;
                            Object obj24 = list12.get(1);
                            N3.h.c(obj24, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue11 = ((Boolean) obj24).booleanValue();
                            try {
                                c1039j13.getClass();
                                webSettings12.setGeolocationEnabled(zBooleanValue11);
                                listQ12 = AbstractC0149a.y(null);
                            } catch (Throwable th12) {
                                listQ12 = Z1.f.Q(th12);
                            }
                            lVar.u(listQ12);
                            break;
                        case 12:
                            C1039j c1039j14 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj;
                            Object obj25 = list13.get(0);
                            N3.h.c(obj25, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings13 = (WebSettings) obj25;
                            Object obj26 = list13.get(1);
                            N3.h.c(obj26, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue = ((Long) obj26).longValue();
                            try {
                                c1039j14.getClass();
                                webSettings13.setTextZoom((int) jLongValue);
                                listQ13 = AbstractC0149a.y(null);
                            } catch (Throwable th13) {
                                listQ13 = Z1.f.Q(th13);
                            }
                            lVar.u(listQ13);
                            break;
                        case 13:
                            C1039j c1039j15 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj27 = ((List) obj).get(0);
                            N3.h.c(obj27, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings14 = (WebSettings) obj27;
                            try {
                                c1039j15.getClass();
                                listQ14 = AbstractC0149a.y(webSettings14.getUserAgentString());
                            } catch (Throwable th14) {
                                listQ14 = Z1.f.Q(th14);
                            }
                            lVar.u(listQ14);
                            break;
                        case 14:
                            C1039j c1039j16 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list14 = (List) obj;
                            Object obj28 = list14.get(0);
                            N3.h.c(obj28, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings15 = (WebSettings) obj28;
                            Object obj29 = list14.get(1);
                            N3.h.c(obj29, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.MixedContentMode");
                            EnumC1049t enumC1049t = (EnumC1049t) obj29;
                            try {
                                c1039j16.getClass();
                                int iOrdinal = enumC1049t.ordinal();
                                if (iOrdinal == 0) {
                                    webSettings15.setMixedContentMode(0);
                                } else if (iOrdinal == 1) {
                                    webSettings15.setMixedContentMode(2);
                                } else if (iOrdinal == 2) {
                                    webSettings15.setMixedContentMode(1);
                                }
                                listQ15 = AbstractC0149a.y(null);
                            } catch (Throwable th15) {
                                listQ15 = Z1.f.Q(th15);
                            }
                            lVar.u(listQ15);
                            break;
                        case 15:
                            C1039j c1039j17 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list15 = (List) obj;
                            Object obj30 = list15.get(0);
                            N3.h.c(obj30, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings16 = (WebSettings) obj30;
                            Object obj31 = list15.get(1);
                            N3.h.c(obj31, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue12 = ((Boolean) obj31).booleanValue();
                            try {
                                c1039j17.getClass();
                                webSettings16.setJavaScriptCanOpenWindowsAutomatically(zBooleanValue12);
                                listQ16 = AbstractC0149a.y(null);
                            } catch (Throwable th16) {
                                listQ16 = Z1.f.Q(th16);
                            }
                            lVar.u(listQ16);
                            break;
                        default:
                            C1039j c1039j18 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list16 = (List) obj;
                            Object obj32 = list16.get(0);
                            N3.h.c(obj32, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings17 = (WebSettings) obj32;
                            Object obj33 = list16.get(1);
                            N3.h.c(obj33, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue13 = ((Boolean) obj33).booleanValue();
                            try {
                                c1039j18.getClass();
                                webSettings17.setSupportMultipleWindows(zBooleanValue13);
                                listQ17 = AbstractC0149a.y(null);
                            } catch (Throwable th17) {
                                listQ17 = Z1.f.Q(th17);
                            }
                            lVar.u(listQ17);
                            break;
                    }
                }
            });
        } else {
            iVar12.E(null);
        }
        i iVar13 = new i(interfaceC0696f, "dev.flutter.pigeon.webview_flutter_android.WebSettings.setAllowContentAccess", gVar, (C0200z) null);
        if (c1039j != null) {
            final int i16 = 10;
            iVar13.E(new InterfaceC0692b() { // from class: y3.G
                @Override // n3.InterfaceC0692b
                public final void t(Object obj, Z1.l lVar) {
                    List listQ;
                    List listQ2;
                    List listQ3;
                    List listQ4;
                    List listQ5;
                    List listQ6;
                    List listQ7;
                    List listQ8;
                    List listQ9;
                    List listQ10;
                    List listQ11;
                    List listQ12;
                    List listQ13;
                    List listQ14;
                    List listQ15;
                    List listQ16;
                    List listQ17;
                    switch (i16) {
                        case 0:
                            C1039j c1039j2 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj2 = list.get(0);
                            N3.h.c(obj2, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings = (WebSettings) obj2;
                            Object obj3 = list.get(1);
                            N3.h.c(obj3, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue = ((Boolean) obj3).booleanValue();
                            try {
                                c1039j2.getClass();
                                webSettings.setDomStorageEnabled(zBooleanValue);
                                listQ = AbstractC0149a.y(null);
                            } catch (Throwable th) {
                                listQ = Z1.f.Q(th);
                            }
                            lVar.u(listQ);
                            break;
                        case 1:
                            C1039j c1039j3 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj;
                            Object obj4 = list2.get(0);
                            N3.h.c(obj4, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings2 = (WebSettings) obj4;
                            Object obj5 = list2.get(1);
                            N3.h.c(obj5, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue2 = ((Boolean) obj5).booleanValue();
                            try {
                                c1039j3.getClass();
                                webSettings2.setJavaScriptEnabled(zBooleanValue2);
                                listQ2 = AbstractC0149a.y(null);
                            } catch (Throwable th2) {
                                listQ2 = Z1.f.Q(th2);
                            }
                            lVar.u(listQ2);
                            break;
                        case 2:
                            C1039j c1039j4 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj;
                            Object obj6 = list3.get(0);
                            N3.h.c(obj6, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings3 = (WebSettings) obj6;
                            String str = (String) list3.get(1);
                            try {
                                c1039j4.getClass();
                                webSettings3.setUserAgentString(str);
                                listQ3 = AbstractC0149a.y(null);
                            } catch (Throwable th3) {
                                listQ3 = Z1.f.Q(th3);
                            }
                            lVar.u(listQ3);
                            break;
                        case 3:
                            C1039j c1039j5 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj;
                            Object obj7 = list4.get(0);
                            N3.h.c(obj7, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings4 = (WebSettings) obj7;
                            Object obj8 = list4.get(1);
                            N3.h.c(obj8, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue3 = ((Boolean) obj8).booleanValue();
                            try {
                                c1039j5.getClass();
                                webSettings4.setMediaPlaybackRequiresUserGesture(zBooleanValue3);
                                listQ4 = AbstractC0149a.y(null);
                            } catch (Throwable th4) {
                                listQ4 = Z1.f.Q(th4);
                            }
                            lVar.u(listQ4);
                            break;
                        case 4:
                            C1039j c1039j6 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj;
                            Object obj9 = list5.get(0);
                            N3.h.c(obj9, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings5 = (WebSettings) obj9;
                            Object obj10 = list5.get(1);
                            N3.h.c(obj10, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue4 = ((Boolean) obj10).booleanValue();
                            try {
                                c1039j6.getClass();
                                webSettings5.setSupportZoom(zBooleanValue4);
                                listQ5 = AbstractC0149a.y(null);
                            } catch (Throwable th5) {
                                listQ5 = Z1.f.Q(th5);
                            }
                            lVar.u(listQ5);
                            break;
                        case 5:
                            C1039j c1039j7 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj;
                            Object obj11 = list6.get(0);
                            N3.h.c(obj11, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings6 = (WebSettings) obj11;
                            Object obj12 = list6.get(1);
                            N3.h.c(obj12, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue5 = ((Boolean) obj12).booleanValue();
                            try {
                                c1039j7.getClass();
                                webSettings6.setLoadWithOverviewMode(zBooleanValue5);
                                listQ6 = AbstractC0149a.y(null);
                            } catch (Throwable th6) {
                                listQ6 = Z1.f.Q(th6);
                            }
                            lVar.u(listQ6);
                            break;
                        case O.j.STRING_SET_FIELD_NUMBER /* 6 */:
                            C1039j c1039j8 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj;
                            Object obj13 = list7.get(0);
                            N3.h.c(obj13, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings7 = (WebSettings) obj13;
                            Object obj14 = list7.get(1);
                            N3.h.c(obj14, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue6 = ((Boolean) obj14).booleanValue();
                            try {
                                c1039j8.getClass();
                                webSettings7.setUseWideViewPort(zBooleanValue6);
                                listQ7 = AbstractC0149a.y(null);
                            } catch (Throwable th7) {
                                listQ7 = Z1.f.Q(th7);
                            }
                            lVar.u(listQ7);
                            break;
                        case O.j.DOUBLE_FIELD_NUMBER /* 7 */:
                            C1039j c1039j9 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj;
                            Object obj15 = list8.get(0);
                            N3.h.c(obj15, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings8 = (WebSettings) obj15;
                            Object obj16 = list8.get(1);
                            N3.h.c(obj16, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue7 = ((Boolean) obj16).booleanValue();
                            try {
                                c1039j9.getClass();
                                webSettings8.setDisplayZoomControls(zBooleanValue7);
                                listQ8 = AbstractC0149a.y(null);
                            } catch (Throwable th8) {
                                listQ8 = Z1.f.Q(th8);
                            }
                            lVar.u(listQ8);
                            break;
                        case O.j.BYTES_FIELD_NUMBER /* 8 */:
                            C1039j c1039j10 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj;
                            Object obj17 = list9.get(0);
                            N3.h.c(obj17, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings9 = (WebSettings) obj17;
                            Object obj18 = list9.get(1);
                            N3.h.c(obj18, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue8 = ((Boolean) obj18).booleanValue();
                            try {
                                c1039j10.getClass();
                                webSettings9.setBuiltInZoomControls(zBooleanValue8);
                                listQ9 = AbstractC0149a.y(null);
                            } catch (Throwable th9) {
                                listQ9 = Z1.f.Q(th9);
                            }
                            lVar.u(listQ9);
                            break;
                        case 9:
                            C1039j c1039j11 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj;
                            Object obj19 = list10.get(0);
                            N3.h.c(obj19, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings10 = (WebSettings) obj19;
                            Object obj20 = list10.get(1);
                            N3.h.c(obj20, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue9 = ((Boolean) obj20).booleanValue();
                            try {
                                c1039j11.getClass();
                                webSettings10.setAllowFileAccess(zBooleanValue9);
                                listQ10 = AbstractC0149a.y(null);
                            } catch (Throwable th10) {
                                listQ10 = Z1.f.Q(th10);
                            }
                            lVar.u(listQ10);
                            break;
                        case 10:
                            C1039j c1039j12 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj;
                            Object obj21 = list11.get(0);
                            N3.h.c(obj21, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings11 = (WebSettings) obj21;
                            Object obj22 = list11.get(1);
                            N3.h.c(obj22, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue10 = ((Boolean) obj22).booleanValue();
                            try {
                                c1039j12.getClass();
                                webSettings11.setAllowContentAccess(zBooleanValue10);
                                listQ11 = AbstractC0149a.y(null);
                            } catch (Throwable th11) {
                                listQ11 = Z1.f.Q(th11);
                            }
                            lVar.u(listQ11);
                            break;
                        case 11:
                            C1039j c1039j13 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list12 = (List) obj;
                            Object obj23 = list12.get(0);
                            N3.h.c(obj23, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings12 = (WebSettings) obj23;
                            Object obj24 = list12.get(1);
                            N3.h.c(obj24, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue11 = ((Boolean) obj24).booleanValue();
                            try {
                                c1039j13.getClass();
                                webSettings12.setGeolocationEnabled(zBooleanValue11);
                                listQ12 = AbstractC0149a.y(null);
                            } catch (Throwable th12) {
                                listQ12 = Z1.f.Q(th12);
                            }
                            lVar.u(listQ12);
                            break;
                        case 12:
                            C1039j c1039j14 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj;
                            Object obj25 = list13.get(0);
                            N3.h.c(obj25, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings13 = (WebSettings) obj25;
                            Object obj26 = list13.get(1);
                            N3.h.c(obj26, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue = ((Long) obj26).longValue();
                            try {
                                c1039j14.getClass();
                                webSettings13.setTextZoom((int) jLongValue);
                                listQ13 = AbstractC0149a.y(null);
                            } catch (Throwable th13) {
                                listQ13 = Z1.f.Q(th13);
                            }
                            lVar.u(listQ13);
                            break;
                        case 13:
                            C1039j c1039j15 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj27 = ((List) obj).get(0);
                            N3.h.c(obj27, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings14 = (WebSettings) obj27;
                            try {
                                c1039j15.getClass();
                                listQ14 = AbstractC0149a.y(webSettings14.getUserAgentString());
                            } catch (Throwable th14) {
                                listQ14 = Z1.f.Q(th14);
                            }
                            lVar.u(listQ14);
                            break;
                        case 14:
                            C1039j c1039j16 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list14 = (List) obj;
                            Object obj28 = list14.get(0);
                            N3.h.c(obj28, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings15 = (WebSettings) obj28;
                            Object obj29 = list14.get(1);
                            N3.h.c(obj29, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.MixedContentMode");
                            EnumC1049t enumC1049t = (EnumC1049t) obj29;
                            try {
                                c1039j16.getClass();
                                int iOrdinal = enumC1049t.ordinal();
                                if (iOrdinal == 0) {
                                    webSettings15.setMixedContentMode(0);
                                } else if (iOrdinal == 1) {
                                    webSettings15.setMixedContentMode(2);
                                } else if (iOrdinal == 2) {
                                    webSettings15.setMixedContentMode(1);
                                }
                                listQ15 = AbstractC0149a.y(null);
                            } catch (Throwable th15) {
                                listQ15 = Z1.f.Q(th15);
                            }
                            lVar.u(listQ15);
                            break;
                        case 15:
                            C1039j c1039j17 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list15 = (List) obj;
                            Object obj30 = list15.get(0);
                            N3.h.c(obj30, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings16 = (WebSettings) obj30;
                            Object obj31 = list15.get(1);
                            N3.h.c(obj31, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue12 = ((Boolean) obj31).booleanValue();
                            try {
                                c1039j17.getClass();
                                webSettings16.setJavaScriptCanOpenWindowsAutomatically(zBooleanValue12);
                                listQ16 = AbstractC0149a.y(null);
                            } catch (Throwable th16) {
                                listQ16 = Z1.f.Q(th16);
                            }
                            lVar.u(listQ16);
                            break;
                        default:
                            C1039j c1039j18 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list16 = (List) obj;
                            Object obj32 = list16.get(0);
                            N3.h.c(obj32, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings17 = (WebSettings) obj32;
                            Object obj33 = list16.get(1);
                            N3.h.c(obj33, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue13 = ((Boolean) obj33).booleanValue();
                            try {
                                c1039j18.getClass();
                                webSettings17.setSupportMultipleWindows(zBooleanValue13);
                                listQ17 = AbstractC0149a.y(null);
                            } catch (Throwable th17) {
                                listQ17 = Z1.f.Q(th17);
                            }
                            lVar.u(listQ17);
                            break;
                    }
                }
            });
        } else {
            iVar13.E(null);
        }
        i iVar14 = new i(interfaceC0696f, "dev.flutter.pigeon.webview_flutter_android.WebSettings.setGeolocationEnabled", gVar, (C0200z) null);
        if (c1039j != null) {
            final int i17 = 11;
            iVar14.E(new InterfaceC0692b() { // from class: y3.G
                @Override // n3.InterfaceC0692b
                public final void t(Object obj, Z1.l lVar) {
                    List listQ;
                    List listQ2;
                    List listQ3;
                    List listQ4;
                    List listQ5;
                    List listQ6;
                    List listQ7;
                    List listQ8;
                    List listQ9;
                    List listQ10;
                    List listQ11;
                    List listQ12;
                    List listQ13;
                    List listQ14;
                    List listQ15;
                    List listQ16;
                    List listQ17;
                    switch (i17) {
                        case 0:
                            C1039j c1039j2 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj2 = list.get(0);
                            N3.h.c(obj2, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings = (WebSettings) obj2;
                            Object obj3 = list.get(1);
                            N3.h.c(obj3, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue = ((Boolean) obj3).booleanValue();
                            try {
                                c1039j2.getClass();
                                webSettings.setDomStorageEnabled(zBooleanValue);
                                listQ = AbstractC0149a.y(null);
                            } catch (Throwable th) {
                                listQ = Z1.f.Q(th);
                            }
                            lVar.u(listQ);
                            break;
                        case 1:
                            C1039j c1039j3 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj;
                            Object obj4 = list2.get(0);
                            N3.h.c(obj4, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings2 = (WebSettings) obj4;
                            Object obj5 = list2.get(1);
                            N3.h.c(obj5, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue2 = ((Boolean) obj5).booleanValue();
                            try {
                                c1039j3.getClass();
                                webSettings2.setJavaScriptEnabled(zBooleanValue2);
                                listQ2 = AbstractC0149a.y(null);
                            } catch (Throwable th2) {
                                listQ2 = Z1.f.Q(th2);
                            }
                            lVar.u(listQ2);
                            break;
                        case 2:
                            C1039j c1039j4 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj;
                            Object obj6 = list3.get(0);
                            N3.h.c(obj6, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings3 = (WebSettings) obj6;
                            String str = (String) list3.get(1);
                            try {
                                c1039j4.getClass();
                                webSettings3.setUserAgentString(str);
                                listQ3 = AbstractC0149a.y(null);
                            } catch (Throwable th3) {
                                listQ3 = Z1.f.Q(th3);
                            }
                            lVar.u(listQ3);
                            break;
                        case 3:
                            C1039j c1039j5 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj;
                            Object obj7 = list4.get(0);
                            N3.h.c(obj7, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings4 = (WebSettings) obj7;
                            Object obj8 = list4.get(1);
                            N3.h.c(obj8, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue3 = ((Boolean) obj8).booleanValue();
                            try {
                                c1039j5.getClass();
                                webSettings4.setMediaPlaybackRequiresUserGesture(zBooleanValue3);
                                listQ4 = AbstractC0149a.y(null);
                            } catch (Throwable th4) {
                                listQ4 = Z1.f.Q(th4);
                            }
                            lVar.u(listQ4);
                            break;
                        case 4:
                            C1039j c1039j6 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj;
                            Object obj9 = list5.get(0);
                            N3.h.c(obj9, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings5 = (WebSettings) obj9;
                            Object obj10 = list5.get(1);
                            N3.h.c(obj10, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue4 = ((Boolean) obj10).booleanValue();
                            try {
                                c1039j6.getClass();
                                webSettings5.setSupportZoom(zBooleanValue4);
                                listQ5 = AbstractC0149a.y(null);
                            } catch (Throwable th5) {
                                listQ5 = Z1.f.Q(th5);
                            }
                            lVar.u(listQ5);
                            break;
                        case 5:
                            C1039j c1039j7 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj;
                            Object obj11 = list6.get(0);
                            N3.h.c(obj11, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings6 = (WebSettings) obj11;
                            Object obj12 = list6.get(1);
                            N3.h.c(obj12, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue5 = ((Boolean) obj12).booleanValue();
                            try {
                                c1039j7.getClass();
                                webSettings6.setLoadWithOverviewMode(zBooleanValue5);
                                listQ6 = AbstractC0149a.y(null);
                            } catch (Throwable th6) {
                                listQ6 = Z1.f.Q(th6);
                            }
                            lVar.u(listQ6);
                            break;
                        case O.j.STRING_SET_FIELD_NUMBER /* 6 */:
                            C1039j c1039j8 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj;
                            Object obj13 = list7.get(0);
                            N3.h.c(obj13, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings7 = (WebSettings) obj13;
                            Object obj14 = list7.get(1);
                            N3.h.c(obj14, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue6 = ((Boolean) obj14).booleanValue();
                            try {
                                c1039j8.getClass();
                                webSettings7.setUseWideViewPort(zBooleanValue6);
                                listQ7 = AbstractC0149a.y(null);
                            } catch (Throwable th7) {
                                listQ7 = Z1.f.Q(th7);
                            }
                            lVar.u(listQ7);
                            break;
                        case O.j.DOUBLE_FIELD_NUMBER /* 7 */:
                            C1039j c1039j9 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj;
                            Object obj15 = list8.get(0);
                            N3.h.c(obj15, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings8 = (WebSettings) obj15;
                            Object obj16 = list8.get(1);
                            N3.h.c(obj16, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue7 = ((Boolean) obj16).booleanValue();
                            try {
                                c1039j9.getClass();
                                webSettings8.setDisplayZoomControls(zBooleanValue7);
                                listQ8 = AbstractC0149a.y(null);
                            } catch (Throwable th8) {
                                listQ8 = Z1.f.Q(th8);
                            }
                            lVar.u(listQ8);
                            break;
                        case O.j.BYTES_FIELD_NUMBER /* 8 */:
                            C1039j c1039j10 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj;
                            Object obj17 = list9.get(0);
                            N3.h.c(obj17, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings9 = (WebSettings) obj17;
                            Object obj18 = list9.get(1);
                            N3.h.c(obj18, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue8 = ((Boolean) obj18).booleanValue();
                            try {
                                c1039j10.getClass();
                                webSettings9.setBuiltInZoomControls(zBooleanValue8);
                                listQ9 = AbstractC0149a.y(null);
                            } catch (Throwable th9) {
                                listQ9 = Z1.f.Q(th9);
                            }
                            lVar.u(listQ9);
                            break;
                        case 9:
                            C1039j c1039j11 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj;
                            Object obj19 = list10.get(0);
                            N3.h.c(obj19, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings10 = (WebSettings) obj19;
                            Object obj20 = list10.get(1);
                            N3.h.c(obj20, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue9 = ((Boolean) obj20).booleanValue();
                            try {
                                c1039j11.getClass();
                                webSettings10.setAllowFileAccess(zBooleanValue9);
                                listQ10 = AbstractC0149a.y(null);
                            } catch (Throwable th10) {
                                listQ10 = Z1.f.Q(th10);
                            }
                            lVar.u(listQ10);
                            break;
                        case 10:
                            C1039j c1039j12 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj;
                            Object obj21 = list11.get(0);
                            N3.h.c(obj21, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings11 = (WebSettings) obj21;
                            Object obj22 = list11.get(1);
                            N3.h.c(obj22, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue10 = ((Boolean) obj22).booleanValue();
                            try {
                                c1039j12.getClass();
                                webSettings11.setAllowContentAccess(zBooleanValue10);
                                listQ11 = AbstractC0149a.y(null);
                            } catch (Throwable th11) {
                                listQ11 = Z1.f.Q(th11);
                            }
                            lVar.u(listQ11);
                            break;
                        case 11:
                            C1039j c1039j13 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list12 = (List) obj;
                            Object obj23 = list12.get(0);
                            N3.h.c(obj23, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings12 = (WebSettings) obj23;
                            Object obj24 = list12.get(1);
                            N3.h.c(obj24, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue11 = ((Boolean) obj24).booleanValue();
                            try {
                                c1039j13.getClass();
                                webSettings12.setGeolocationEnabled(zBooleanValue11);
                                listQ12 = AbstractC0149a.y(null);
                            } catch (Throwable th12) {
                                listQ12 = Z1.f.Q(th12);
                            }
                            lVar.u(listQ12);
                            break;
                        case 12:
                            C1039j c1039j14 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj;
                            Object obj25 = list13.get(0);
                            N3.h.c(obj25, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings13 = (WebSettings) obj25;
                            Object obj26 = list13.get(1);
                            N3.h.c(obj26, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue = ((Long) obj26).longValue();
                            try {
                                c1039j14.getClass();
                                webSettings13.setTextZoom((int) jLongValue);
                                listQ13 = AbstractC0149a.y(null);
                            } catch (Throwable th13) {
                                listQ13 = Z1.f.Q(th13);
                            }
                            lVar.u(listQ13);
                            break;
                        case 13:
                            C1039j c1039j15 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj27 = ((List) obj).get(0);
                            N3.h.c(obj27, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings14 = (WebSettings) obj27;
                            try {
                                c1039j15.getClass();
                                listQ14 = AbstractC0149a.y(webSettings14.getUserAgentString());
                            } catch (Throwable th14) {
                                listQ14 = Z1.f.Q(th14);
                            }
                            lVar.u(listQ14);
                            break;
                        case 14:
                            C1039j c1039j16 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list14 = (List) obj;
                            Object obj28 = list14.get(0);
                            N3.h.c(obj28, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings15 = (WebSettings) obj28;
                            Object obj29 = list14.get(1);
                            N3.h.c(obj29, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.MixedContentMode");
                            EnumC1049t enumC1049t = (EnumC1049t) obj29;
                            try {
                                c1039j16.getClass();
                                int iOrdinal = enumC1049t.ordinal();
                                if (iOrdinal == 0) {
                                    webSettings15.setMixedContentMode(0);
                                } else if (iOrdinal == 1) {
                                    webSettings15.setMixedContentMode(2);
                                } else if (iOrdinal == 2) {
                                    webSettings15.setMixedContentMode(1);
                                }
                                listQ15 = AbstractC0149a.y(null);
                            } catch (Throwable th15) {
                                listQ15 = Z1.f.Q(th15);
                            }
                            lVar.u(listQ15);
                            break;
                        case 15:
                            C1039j c1039j17 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list15 = (List) obj;
                            Object obj30 = list15.get(0);
                            N3.h.c(obj30, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings16 = (WebSettings) obj30;
                            Object obj31 = list15.get(1);
                            N3.h.c(obj31, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue12 = ((Boolean) obj31).booleanValue();
                            try {
                                c1039j17.getClass();
                                webSettings16.setJavaScriptCanOpenWindowsAutomatically(zBooleanValue12);
                                listQ16 = AbstractC0149a.y(null);
                            } catch (Throwable th16) {
                                listQ16 = Z1.f.Q(th16);
                            }
                            lVar.u(listQ16);
                            break;
                        default:
                            C1039j c1039j18 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list16 = (List) obj;
                            Object obj32 = list16.get(0);
                            N3.h.c(obj32, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings17 = (WebSettings) obj32;
                            Object obj33 = list16.get(1);
                            N3.h.c(obj33, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue13 = ((Boolean) obj33).booleanValue();
                            try {
                                c1039j18.getClass();
                                webSettings17.setSupportMultipleWindows(zBooleanValue13);
                                listQ17 = AbstractC0149a.y(null);
                            } catch (Throwable th17) {
                                listQ17 = Z1.f.Q(th17);
                            }
                            lVar.u(listQ17);
                            break;
                    }
                }
            });
        } else {
            iVar14.E(null);
        }
        i iVar15 = new i(interfaceC0696f, "dev.flutter.pigeon.webview_flutter_android.WebSettings.setTextZoom", gVar, (C0200z) null);
        if (c1039j != null) {
            final int i18 = 12;
            iVar15.E(new InterfaceC0692b() { // from class: y3.G
                @Override // n3.InterfaceC0692b
                public final void t(Object obj, Z1.l lVar) {
                    List listQ;
                    List listQ2;
                    List listQ3;
                    List listQ4;
                    List listQ5;
                    List listQ6;
                    List listQ7;
                    List listQ8;
                    List listQ9;
                    List listQ10;
                    List listQ11;
                    List listQ12;
                    List listQ13;
                    List listQ14;
                    List listQ15;
                    List listQ16;
                    List listQ17;
                    switch (i18) {
                        case 0:
                            C1039j c1039j2 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj2 = list.get(0);
                            N3.h.c(obj2, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings = (WebSettings) obj2;
                            Object obj3 = list.get(1);
                            N3.h.c(obj3, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue = ((Boolean) obj3).booleanValue();
                            try {
                                c1039j2.getClass();
                                webSettings.setDomStorageEnabled(zBooleanValue);
                                listQ = AbstractC0149a.y(null);
                            } catch (Throwable th) {
                                listQ = Z1.f.Q(th);
                            }
                            lVar.u(listQ);
                            break;
                        case 1:
                            C1039j c1039j3 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj;
                            Object obj4 = list2.get(0);
                            N3.h.c(obj4, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings2 = (WebSettings) obj4;
                            Object obj5 = list2.get(1);
                            N3.h.c(obj5, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue2 = ((Boolean) obj5).booleanValue();
                            try {
                                c1039j3.getClass();
                                webSettings2.setJavaScriptEnabled(zBooleanValue2);
                                listQ2 = AbstractC0149a.y(null);
                            } catch (Throwable th2) {
                                listQ2 = Z1.f.Q(th2);
                            }
                            lVar.u(listQ2);
                            break;
                        case 2:
                            C1039j c1039j4 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj;
                            Object obj6 = list3.get(0);
                            N3.h.c(obj6, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings3 = (WebSettings) obj6;
                            String str = (String) list3.get(1);
                            try {
                                c1039j4.getClass();
                                webSettings3.setUserAgentString(str);
                                listQ3 = AbstractC0149a.y(null);
                            } catch (Throwable th3) {
                                listQ3 = Z1.f.Q(th3);
                            }
                            lVar.u(listQ3);
                            break;
                        case 3:
                            C1039j c1039j5 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj;
                            Object obj7 = list4.get(0);
                            N3.h.c(obj7, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings4 = (WebSettings) obj7;
                            Object obj8 = list4.get(1);
                            N3.h.c(obj8, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue3 = ((Boolean) obj8).booleanValue();
                            try {
                                c1039j5.getClass();
                                webSettings4.setMediaPlaybackRequiresUserGesture(zBooleanValue3);
                                listQ4 = AbstractC0149a.y(null);
                            } catch (Throwable th4) {
                                listQ4 = Z1.f.Q(th4);
                            }
                            lVar.u(listQ4);
                            break;
                        case 4:
                            C1039j c1039j6 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj;
                            Object obj9 = list5.get(0);
                            N3.h.c(obj9, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings5 = (WebSettings) obj9;
                            Object obj10 = list5.get(1);
                            N3.h.c(obj10, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue4 = ((Boolean) obj10).booleanValue();
                            try {
                                c1039j6.getClass();
                                webSettings5.setSupportZoom(zBooleanValue4);
                                listQ5 = AbstractC0149a.y(null);
                            } catch (Throwable th5) {
                                listQ5 = Z1.f.Q(th5);
                            }
                            lVar.u(listQ5);
                            break;
                        case 5:
                            C1039j c1039j7 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj;
                            Object obj11 = list6.get(0);
                            N3.h.c(obj11, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings6 = (WebSettings) obj11;
                            Object obj12 = list6.get(1);
                            N3.h.c(obj12, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue5 = ((Boolean) obj12).booleanValue();
                            try {
                                c1039j7.getClass();
                                webSettings6.setLoadWithOverviewMode(zBooleanValue5);
                                listQ6 = AbstractC0149a.y(null);
                            } catch (Throwable th6) {
                                listQ6 = Z1.f.Q(th6);
                            }
                            lVar.u(listQ6);
                            break;
                        case O.j.STRING_SET_FIELD_NUMBER /* 6 */:
                            C1039j c1039j8 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj;
                            Object obj13 = list7.get(0);
                            N3.h.c(obj13, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings7 = (WebSettings) obj13;
                            Object obj14 = list7.get(1);
                            N3.h.c(obj14, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue6 = ((Boolean) obj14).booleanValue();
                            try {
                                c1039j8.getClass();
                                webSettings7.setUseWideViewPort(zBooleanValue6);
                                listQ7 = AbstractC0149a.y(null);
                            } catch (Throwable th7) {
                                listQ7 = Z1.f.Q(th7);
                            }
                            lVar.u(listQ7);
                            break;
                        case O.j.DOUBLE_FIELD_NUMBER /* 7 */:
                            C1039j c1039j9 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj;
                            Object obj15 = list8.get(0);
                            N3.h.c(obj15, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings8 = (WebSettings) obj15;
                            Object obj16 = list8.get(1);
                            N3.h.c(obj16, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue7 = ((Boolean) obj16).booleanValue();
                            try {
                                c1039j9.getClass();
                                webSettings8.setDisplayZoomControls(zBooleanValue7);
                                listQ8 = AbstractC0149a.y(null);
                            } catch (Throwable th8) {
                                listQ8 = Z1.f.Q(th8);
                            }
                            lVar.u(listQ8);
                            break;
                        case O.j.BYTES_FIELD_NUMBER /* 8 */:
                            C1039j c1039j10 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj;
                            Object obj17 = list9.get(0);
                            N3.h.c(obj17, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings9 = (WebSettings) obj17;
                            Object obj18 = list9.get(1);
                            N3.h.c(obj18, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue8 = ((Boolean) obj18).booleanValue();
                            try {
                                c1039j10.getClass();
                                webSettings9.setBuiltInZoomControls(zBooleanValue8);
                                listQ9 = AbstractC0149a.y(null);
                            } catch (Throwable th9) {
                                listQ9 = Z1.f.Q(th9);
                            }
                            lVar.u(listQ9);
                            break;
                        case 9:
                            C1039j c1039j11 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj;
                            Object obj19 = list10.get(0);
                            N3.h.c(obj19, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings10 = (WebSettings) obj19;
                            Object obj20 = list10.get(1);
                            N3.h.c(obj20, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue9 = ((Boolean) obj20).booleanValue();
                            try {
                                c1039j11.getClass();
                                webSettings10.setAllowFileAccess(zBooleanValue9);
                                listQ10 = AbstractC0149a.y(null);
                            } catch (Throwable th10) {
                                listQ10 = Z1.f.Q(th10);
                            }
                            lVar.u(listQ10);
                            break;
                        case 10:
                            C1039j c1039j12 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj;
                            Object obj21 = list11.get(0);
                            N3.h.c(obj21, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings11 = (WebSettings) obj21;
                            Object obj22 = list11.get(1);
                            N3.h.c(obj22, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue10 = ((Boolean) obj22).booleanValue();
                            try {
                                c1039j12.getClass();
                                webSettings11.setAllowContentAccess(zBooleanValue10);
                                listQ11 = AbstractC0149a.y(null);
                            } catch (Throwable th11) {
                                listQ11 = Z1.f.Q(th11);
                            }
                            lVar.u(listQ11);
                            break;
                        case 11:
                            C1039j c1039j13 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list12 = (List) obj;
                            Object obj23 = list12.get(0);
                            N3.h.c(obj23, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings12 = (WebSettings) obj23;
                            Object obj24 = list12.get(1);
                            N3.h.c(obj24, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue11 = ((Boolean) obj24).booleanValue();
                            try {
                                c1039j13.getClass();
                                webSettings12.setGeolocationEnabled(zBooleanValue11);
                                listQ12 = AbstractC0149a.y(null);
                            } catch (Throwable th12) {
                                listQ12 = Z1.f.Q(th12);
                            }
                            lVar.u(listQ12);
                            break;
                        case 12:
                            C1039j c1039j14 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj;
                            Object obj25 = list13.get(0);
                            N3.h.c(obj25, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings13 = (WebSettings) obj25;
                            Object obj26 = list13.get(1);
                            N3.h.c(obj26, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue = ((Long) obj26).longValue();
                            try {
                                c1039j14.getClass();
                                webSettings13.setTextZoom((int) jLongValue);
                                listQ13 = AbstractC0149a.y(null);
                            } catch (Throwable th13) {
                                listQ13 = Z1.f.Q(th13);
                            }
                            lVar.u(listQ13);
                            break;
                        case 13:
                            C1039j c1039j15 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj27 = ((List) obj).get(0);
                            N3.h.c(obj27, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings14 = (WebSettings) obj27;
                            try {
                                c1039j15.getClass();
                                listQ14 = AbstractC0149a.y(webSettings14.getUserAgentString());
                            } catch (Throwable th14) {
                                listQ14 = Z1.f.Q(th14);
                            }
                            lVar.u(listQ14);
                            break;
                        case 14:
                            C1039j c1039j16 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list14 = (List) obj;
                            Object obj28 = list14.get(0);
                            N3.h.c(obj28, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings15 = (WebSettings) obj28;
                            Object obj29 = list14.get(1);
                            N3.h.c(obj29, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.MixedContentMode");
                            EnumC1049t enumC1049t = (EnumC1049t) obj29;
                            try {
                                c1039j16.getClass();
                                int iOrdinal = enumC1049t.ordinal();
                                if (iOrdinal == 0) {
                                    webSettings15.setMixedContentMode(0);
                                } else if (iOrdinal == 1) {
                                    webSettings15.setMixedContentMode(2);
                                } else if (iOrdinal == 2) {
                                    webSettings15.setMixedContentMode(1);
                                }
                                listQ15 = AbstractC0149a.y(null);
                            } catch (Throwable th15) {
                                listQ15 = Z1.f.Q(th15);
                            }
                            lVar.u(listQ15);
                            break;
                        case 15:
                            C1039j c1039j17 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list15 = (List) obj;
                            Object obj30 = list15.get(0);
                            N3.h.c(obj30, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings16 = (WebSettings) obj30;
                            Object obj31 = list15.get(1);
                            N3.h.c(obj31, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue12 = ((Boolean) obj31).booleanValue();
                            try {
                                c1039j17.getClass();
                                webSettings16.setJavaScriptCanOpenWindowsAutomatically(zBooleanValue12);
                                listQ16 = AbstractC0149a.y(null);
                            } catch (Throwable th16) {
                                listQ16 = Z1.f.Q(th16);
                            }
                            lVar.u(listQ16);
                            break;
                        default:
                            C1039j c1039j18 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list16 = (List) obj;
                            Object obj32 = list16.get(0);
                            N3.h.c(obj32, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings17 = (WebSettings) obj32;
                            Object obj33 = list16.get(1);
                            N3.h.c(obj33, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue13 = ((Boolean) obj33).booleanValue();
                            try {
                                c1039j18.getClass();
                                webSettings17.setSupportMultipleWindows(zBooleanValue13);
                                listQ17 = AbstractC0149a.y(null);
                            } catch (Throwable th17) {
                                listQ17 = Z1.f.Q(th17);
                            }
                            lVar.u(listQ17);
                            break;
                    }
                }
            });
        } else {
            iVar15.E(null);
        }
        i iVar16 = new i(interfaceC0696f, "dev.flutter.pigeon.webview_flutter_android.WebSettings.getUserAgentString", gVar, (C0200z) null);
        if (c1039j != null) {
            final int i19 = 13;
            iVar16.E(new InterfaceC0692b() { // from class: y3.G
                @Override // n3.InterfaceC0692b
                public final void t(Object obj, Z1.l lVar) {
                    List listQ;
                    List listQ2;
                    List listQ3;
                    List listQ4;
                    List listQ5;
                    List listQ6;
                    List listQ7;
                    List listQ8;
                    List listQ9;
                    List listQ10;
                    List listQ11;
                    List listQ12;
                    List listQ13;
                    List listQ14;
                    List listQ15;
                    List listQ16;
                    List listQ17;
                    switch (i19) {
                        case 0:
                            C1039j c1039j2 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj2 = list.get(0);
                            N3.h.c(obj2, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings = (WebSettings) obj2;
                            Object obj3 = list.get(1);
                            N3.h.c(obj3, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue = ((Boolean) obj3).booleanValue();
                            try {
                                c1039j2.getClass();
                                webSettings.setDomStorageEnabled(zBooleanValue);
                                listQ = AbstractC0149a.y(null);
                            } catch (Throwable th) {
                                listQ = Z1.f.Q(th);
                            }
                            lVar.u(listQ);
                            break;
                        case 1:
                            C1039j c1039j3 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj;
                            Object obj4 = list2.get(0);
                            N3.h.c(obj4, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings2 = (WebSettings) obj4;
                            Object obj5 = list2.get(1);
                            N3.h.c(obj5, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue2 = ((Boolean) obj5).booleanValue();
                            try {
                                c1039j3.getClass();
                                webSettings2.setJavaScriptEnabled(zBooleanValue2);
                                listQ2 = AbstractC0149a.y(null);
                            } catch (Throwable th2) {
                                listQ2 = Z1.f.Q(th2);
                            }
                            lVar.u(listQ2);
                            break;
                        case 2:
                            C1039j c1039j4 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj;
                            Object obj6 = list3.get(0);
                            N3.h.c(obj6, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings3 = (WebSettings) obj6;
                            String str = (String) list3.get(1);
                            try {
                                c1039j4.getClass();
                                webSettings3.setUserAgentString(str);
                                listQ3 = AbstractC0149a.y(null);
                            } catch (Throwable th3) {
                                listQ3 = Z1.f.Q(th3);
                            }
                            lVar.u(listQ3);
                            break;
                        case 3:
                            C1039j c1039j5 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj;
                            Object obj7 = list4.get(0);
                            N3.h.c(obj7, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings4 = (WebSettings) obj7;
                            Object obj8 = list4.get(1);
                            N3.h.c(obj8, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue3 = ((Boolean) obj8).booleanValue();
                            try {
                                c1039j5.getClass();
                                webSettings4.setMediaPlaybackRequiresUserGesture(zBooleanValue3);
                                listQ4 = AbstractC0149a.y(null);
                            } catch (Throwable th4) {
                                listQ4 = Z1.f.Q(th4);
                            }
                            lVar.u(listQ4);
                            break;
                        case 4:
                            C1039j c1039j6 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj;
                            Object obj9 = list5.get(0);
                            N3.h.c(obj9, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings5 = (WebSettings) obj9;
                            Object obj10 = list5.get(1);
                            N3.h.c(obj10, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue4 = ((Boolean) obj10).booleanValue();
                            try {
                                c1039j6.getClass();
                                webSettings5.setSupportZoom(zBooleanValue4);
                                listQ5 = AbstractC0149a.y(null);
                            } catch (Throwable th5) {
                                listQ5 = Z1.f.Q(th5);
                            }
                            lVar.u(listQ5);
                            break;
                        case 5:
                            C1039j c1039j7 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj;
                            Object obj11 = list6.get(0);
                            N3.h.c(obj11, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings6 = (WebSettings) obj11;
                            Object obj12 = list6.get(1);
                            N3.h.c(obj12, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue5 = ((Boolean) obj12).booleanValue();
                            try {
                                c1039j7.getClass();
                                webSettings6.setLoadWithOverviewMode(zBooleanValue5);
                                listQ6 = AbstractC0149a.y(null);
                            } catch (Throwable th6) {
                                listQ6 = Z1.f.Q(th6);
                            }
                            lVar.u(listQ6);
                            break;
                        case O.j.STRING_SET_FIELD_NUMBER /* 6 */:
                            C1039j c1039j8 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj;
                            Object obj13 = list7.get(0);
                            N3.h.c(obj13, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings7 = (WebSettings) obj13;
                            Object obj14 = list7.get(1);
                            N3.h.c(obj14, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue6 = ((Boolean) obj14).booleanValue();
                            try {
                                c1039j8.getClass();
                                webSettings7.setUseWideViewPort(zBooleanValue6);
                                listQ7 = AbstractC0149a.y(null);
                            } catch (Throwable th7) {
                                listQ7 = Z1.f.Q(th7);
                            }
                            lVar.u(listQ7);
                            break;
                        case O.j.DOUBLE_FIELD_NUMBER /* 7 */:
                            C1039j c1039j9 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj;
                            Object obj15 = list8.get(0);
                            N3.h.c(obj15, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings8 = (WebSettings) obj15;
                            Object obj16 = list8.get(1);
                            N3.h.c(obj16, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue7 = ((Boolean) obj16).booleanValue();
                            try {
                                c1039j9.getClass();
                                webSettings8.setDisplayZoomControls(zBooleanValue7);
                                listQ8 = AbstractC0149a.y(null);
                            } catch (Throwable th8) {
                                listQ8 = Z1.f.Q(th8);
                            }
                            lVar.u(listQ8);
                            break;
                        case O.j.BYTES_FIELD_NUMBER /* 8 */:
                            C1039j c1039j10 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj;
                            Object obj17 = list9.get(0);
                            N3.h.c(obj17, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings9 = (WebSettings) obj17;
                            Object obj18 = list9.get(1);
                            N3.h.c(obj18, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue8 = ((Boolean) obj18).booleanValue();
                            try {
                                c1039j10.getClass();
                                webSettings9.setBuiltInZoomControls(zBooleanValue8);
                                listQ9 = AbstractC0149a.y(null);
                            } catch (Throwable th9) {
                                listQ9 = Z1.f.Q(th9);
                            }
                            lVar.u(listQ9);
                            break;
                        case 9:
                            C1039j c1039j11 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj;
                            Object obj19 = list10.get(0);
                            N3.h.c(obj19, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings10 = (WebSettings) obj19;
                            Object obj20 = list10.get(1);
                            N3.h.c(obj20, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue9 = ((Boolean) obj20).booleanValue();
                            try {
                                c1039j11.getClass();
                                webSettings10.setAllowFileAccess(zBooleanValue9);
                                listQ10 = AbstractC0149a.y(null);
                            } catch (Throwable th10) {
                                listQ10 = Z1.f.Q(th10);
                            }
                            lVar.u(listQ10);
                            break;
                        case 10:
                            C1039j c1039j12 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj;
                            Object obj21 = list11.get(0);
                            N3.h.c(obj21, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings11 = (WebSettings) obj21;
                            Object obj22 = list11.get(1);
                            N3.h.c(obj22, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue10 = ((Boolean) obj22).booleanValue();
                            try {
                                c1039j12.getClass();
                                webSettings11.setAllowContentAccess(zBooleanValue10);
                                listQ11 = AbstractC0149a.y(null);
                            } catch (Throwable th11) {
                                listQ11 = Z1.f.Q(th11);
                            }
                            lVar.u(listQ11);
                            break;
                        case 11:
                            C1039j c1039j13 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list12 = (List) obj;
                            Object obj23 = list12.get(0);
                            N3.h.c(obj23, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings12 = (WebSettings) obj23;
                            Object obj24 = list12.get(1);
                            N3.h.c(obj24, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue11 = ((Boolean) obj24).booleanValue();
                            try {
                                c1039j13.getClass();
                                webSettings12.setGeolocationEnabled(zBooleanValue11);
                                listQ12 = AbstractC0149a.y(null);
                            } catch (Throwable th12) {
                                listQ12 = Z1.f.Q(th12);
                            }
                            lVar.u(listQ12);
                            break;
                        case 12:
                            C1039j c1039j14 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj;
                            Object obj25 = list13.get(0);
                            N3.h.c(obj25, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings13 = (WebSettings) obj25;
                            Object obj26 = list13.get(1);
                            N3.h.c(obj26, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue = ((Long) obj26).longValue();
                            try {
                                c1039j14.getClass();
                                webSettings13.setTextZoom((int) jLongValue);
                                listQ13 = AbstractC0149a.y(null);
                            } catch (Throwable th13) {
                                listQ13 = Z1.f.Q(th13);
                            }
                            lVar.u(listQ13);
                            break;
                        case 13:
                            C1039j c1039j15 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj27 = ((List) obj).get(0);
                            N3.h.c(obj27, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings14 = (WebSettings) obj27;
                            try {
                                c1039j15.getClass();
                                listQ14 = AbstractC0149a.y(webSettings14.getUserAgentString());
                            } catch (Throwable th14) {
                                listQ14 = Z1.f.Q(th14);
                            }
                            lVar.u(listQ14);
                            break;
                        case 14:
                            C1039j c1039j16 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list14 = (List) obj;
                            Object obj28 = list14.get(0);
                            N3.h.c(obj28, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings15 = (WebSettings) obj28;
                            Object obj29 = list14.get(1);
                            N3.h.c(obj29, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.MixedContentMode");
                            EnumC1049t enumC1049t = (EnumC1049t) obj29;
                            try {
                                c1039j16.getClass();
                                int iOrdinal = enumC1049t.ordinal();
                                if (iOrdinal == 0) {
                                    webSettings15.setMixedContentMode(0);
                                } else if (iOrdinal == 1) {
                                    webSettings15.setMixedContentMode(2);
                                } else if (iOrdinal == 2) {
                                    webSettings15.setMixedContentMode(1);
                                }
                                listQ15 = AbstractC0149a.y(null);
                            } catch (Throwable th15) {
                                listQ15 = Z1.f.Q(th15);
                            }
                            lVar.u(listQ15);
                            break;
                        case 15:
                            C1039j c1039j17 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list15 = (List) obj;
                            Object obj30 = list15.get(0);
                            N3.h.c(obj30, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings16 = (WebSettings) obj30;
                            Object obj31 = list15.get(1);
                            N3.h.c(obj31, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue12 = ((Boolean) obj31).booleanValue();
                            try {
                                c1039j17.getClass();
                                webSettings16.setJavaScriptCanOpenWindowsAutomatically(zBooleanValue12);
                                listQ16 = AbstractC0149a.y(null);
                            } catch (Throwable th16) {
                                listQ16 = Z1.f.Q(th16);
                            }
                            lVar.u(listQ16);
                            break;
                        default:
                            C1039j c1039j18 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list16 = (List) obj;
                            Object obj32 = list16.get(0);
                            N3.h.c(obj32, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings17 = (WebSettings) obj32;
                            Object obj33 = list16.get(1);
                            N3.h.c(obj33, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue13 = ((Boolean) obj33).booleanValue();
                            try {
                                c1039j18.getClass();
                                webSettings17.setSupportMultipleWindows(zBooleanValue13);
                                listQ17 = AbstractC0149a.y(null);
                            } catch (Throwable th17) {
                                listQ17 = Z1.f.Q(th17);
                            }
                            lVar.u(listQ17);
                            break;
                    }
                }
            });
        } else {
            iVar16.E(null);
        }
        i iVar17 = new i(interfaceC0696f, "dev.flutter.pigeon.webview_flutter_android.WebSettings.setMixedContentMode", gVar, (C0200z) null);
        if (c1039j == null) {
            iVar17.E(null);
        } else {
            final int i20 = 14;
            iVar17.E(new InterfaceC0692b() { // from class: y3.G
                @Override // n3.InterfaceC0692b
                public final void t(Object obj, Z1.l lVar) {
                    List listQ;
                    List listQ2;
                    List listQ3;
                    List listQ4;
                    List listQ5;
                    List listQ6;
                    List listQ7;
                    List listQ8;
                    List listQ9;
                    List listQ10;
                    List listQ11;
                    List listQ12;
                    List listQ13;
                    List listQ14;
                    List listQ15;
                    List listQ16;
                    List listQ17;
                    switch (i20) {
                        case 0:
                            C1039j c1039j2 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj2 = list.get(0);
                            N3.h.c(obj2, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings = (WebSettings) obj2;
                            Object obj3 = list.get(1);
                            N3.h.c(obj3, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue = ((Boolean) obj3).booleanValue();
                            try {
                                c1039j2.getClass();
                                webSettings.setDomStorageEnabled(zBooleanValue);
                                listQ = AbstractC0149a.y(null);
                            } catch (Throwable th) {
                                listQ = Z1.f.Q(th);
                            }
                            lVar.u(listQ);
                            break;
                        case 1:
                            C1039j c1039j3 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj;
                            Object obj4 = list2.get(0);
                            N3.h.c(obj4, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings2 = (WebSettings) obj4;
                            Object obj5 = list2.get(1);
                            N3.h.c(obj5, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue2 = ((Boolean) obj5).booleanValue();
                            try {
                                c1039j3.getClass();
                                webSettings2.setJavaScriptEnabled(zBooleanValue2);
                                listQ2 = AbstractC0149a.y(null);
                            } catch (Throwable th2) {
                                listQ2 = Z1.f.Q(th2);
                            }
                            lVar.u(listQ2);
                            break;
                        case 2:
                            C1039j c1039j4 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj;
                            Object obj6 = list3.get(0);
                            N3.h.c(obj6, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings3 = (WebSettings) obj6;
                            String str = (String) list3.get(1);
                            try {
                                c1039j4.getClass();
                                webSettings3.setUserAgentString(str);
                                listQ3 = AbstractC0149a.y(null);
                            } catch (Throwable th3) {
                                listQ3 = Z1.f.Q(th3);
                            }
                            lVar.u(listQ3);
                            break;
                        case 3:
                            C1039j c1039j5 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj;
                            Object obj7 = list4.get(0);
                            N3.h.c(obj7, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings4 = (WebSettings) obj7;
                            Object obj8 = list4.get(1);
                            N3.h.c(obj8, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue3 = ((Boolean) obj8).booleanValue();
                            try {
                                c1039j5.getClass();
                                webSettings4.setMediaPlaybackRequiresUserGesture(zBooleanValue3);
                                listQ4 = AbstractC0149a.y(null);
                            } catch (Throwable th4) {
                                listQ4 = Z1.f.Q(th4);
                            }
                            lVar.u(listQ4);
                            break;
                        case 4:
                            C1039j c1039j6 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj;
                            Object obj9 = list5.get(0);
                            N3.h.c(obj9, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings5 = (WebSettings) obj9;
                            Object obj10 = list5.get(1);
                            N3.h.c(obj10, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue4 = ((Boolean) obj10).booleanValue();
                            try {
                                c1039j6.getClass();
                                webSettings5.setSupportZoom(zBooleanValue4);
                                listQ5 = AbstractC0149a.y(null);
                            } catch (Throwable th5) {
                                listQ5 = Z1.f.Q(th5);
                            }
                            lVar.u(listQ5);
                            break;
                        case 5:
                            C1039j c1039j7 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj;
                            Object obj11 = list6.get(0);
                            N3.h.c(obj11, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings6 = (WebSettings) obj11;
                            Object obj12 = list6.get(1);
                            N3.h.c(obj12, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue5 = ((Boolean) obj12).booleanValue();
                            try {
                                c1039j7.getClass();
                                webSettings6.setLoadWithOverviewMode(zBooleanValue5);
                                listQ6 = AbstractC0149a.y(null);
                            } catch (Throwable th6) {
                                listQ6 = Z1.f.Q(th6);
                            }
                            lVar.u(listQ6);
                            break;
                        case O.j.STRING_SET_FIELD_NUMBER /* 6 */:
                            C1039j c1039j8 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj;
                            Object obj13 = list7.get(0);
                            N3.h.c(obj13, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings7 = (WebSettings) obj13;
                            Object obj14 = list7.get(1);
                            N3.h.c(obj14, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue6 = ((Boolean) obj14).booleanValue();
                            try {
                                c1039j8.getClass();
                                webSettings7.setUseWideViewPort(zBooleanValue6);
                                listQ7 = AbstractC0149a.y(null);
                            } catch (Throwable th7) {
                                listQ7 = Z1.f.Q(th7);
                            }
                            lVar.u(listQ7);
                            break;
                        case O.j.DOUBLE_FIELD_NUMBER /* 7 */:
                            C1039j c1039j9 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj;
                            Object obj15 = list8.get(0);
                            N3.h.c(obj15, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings8 = (WebSettings) obj15;
                            Object obj16 = list8.get(1);
                            N3.h.c(obj16, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue7 = ((Boolean) obj16).booleanValue();
                            try {
                                c1039j9.getClass();
                                webSettings8.setDisplayZoomControls(zBooleanValue7);
                                listQ8 = AbstractC0149a.y(null);
                            } catch (Throwable th8) {
                                listQ8 = Z1.f.Q(th8);
                            }
                            lVar.u(listQ8);
                            break;
                        case O.j.BYTES_FIELD_NUMBER /* 8 */:
                            C1039j c1039j10 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj;
                            Object obj17 = list9.get(0);
                            N3.h.c(obj17, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings9 = (WebSettings) obj17;
                            Object obj18 = list9.get(1);
                            N3.h.c(obj18, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue8 = ((Boolean) obj18).booleanValue();
                            try {
                                c1039j10.getClass();
                                webSettings9.setBuiltInZoomControls(zBooleanValue8);
                                listQ9 = AbstractC0149a.y(null);
                            } catch (Throwable th9) {
                                listQ9 = Z1.f.Q(th9);
                            }
                            lVar.u(listQ9);
                            break;
                        case 9:
                            C1039j c1039j11 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj;
                            Object obj19 = list10.get(0);
                            N3.h.c(obj19, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings10 = (WebSettings) obj19;
                            Object obj20 = list10.get(1);
                            N3.h.c(obj20, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue9 = ((Boolean) obj20).booleanValue();
                            try {
                                c1039j11.getClass();
                                webSettings10.setAllowFileAccess(zBooleanValue9);
                                listQ10 = AbstractC0149a.y(null);
                            } catch (Throwable th10) {
                                listQ10 = Z1.f.Q(th10);
                            }
                            lVar.u(listQ10);
                            break;
                        case 10:
                            C1039j c1039j12 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj;
                            Object obj21 = list11.get(0);
                            N3.h.c(obj21, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings11 = (WebSettings) obj21;
                            Object obj22 = list11.get(1);
                            N3.h.c(obj22, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue10 = ((Boolean) obj22).booleanValue();
                            try {
                                c1039j12.getClass();
                                webSettings11.setAllowContentAccess(zBooleanValue10);
                                listQ11 = AbstractC0149a.y(null);
                            } catch (Throwable th11) {
                                listQ11 = Z1.f.Q(th11);
                            }
                            lVar.u(listQ11);
                            break;
                        case 11:
                            C1039j c1039j13 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list12 = (List) obj;
                            Object obj23 = list12.get(0);
                            N3.h.c(obj23, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings12 = (WebSettings) obj23;
                            Object obj24 = list12.get(1);
                            N3.h.c(obj24, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue11 = ((Boolean) obj24).booleanValue();
                            try {
                                c1039j13.getClass();
                                webSettings12.setGeolocationEnabled(zBooleanValue11);
                                listQ12 = AbstractC0149a.y(null);
                            } catch (Throwable th12) {
                                listQ12 = Z1.f.Q(th12);
                            }
                            lVar.u(listQ12);
                            break;
                        case 12:
                            C1039j c1039j14 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj;
                            Object obj25 = list13.get(0);
                            N3.h.c(obj25, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings13 = (WebSettings) obj25;
                            Object obj26 = list13.get(1);
                            N3.h.c(obj26, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue = ((Long) obj26).longValue();
                            try {
                                c1039j14.getClass();
                                webSettings13.setTextZoom((int) jLongValue);
                                listQ13 = AbstractC0149a.y(null);
                            } catch (Throwable th13) {
                                listQ13 = Z1.f.Q(th13);
                            }
                            lVar.u(listQ13);
                            break;
                        case 13:
                            C1039j c1039j15 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj27 = ((List) obj).get(0);
                            N3.h.c(obj27, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings14 = (WebSettings) obj27;
                            try {
                                c1039j15.getClass();
                                listQ14 = AbstractC0149a.y(webSettings14.getUserAgentString());
                            } catch (Throwable th14) {
                                listQ14 = Z1.f.Q(th14);
                            }
                            lVar.u(listQ14);
                            break;
                        case 14:
                            C1039j c1039j16 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list14 = (List) obj;
                            Object obj28 = list14.get(0);
                            N3.h.c(obj28, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings15 = (WebSettings) obj28;
                            Object obj29 = list14.get(1);
                            N3.h.c(obj29, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.MixedContentMode");
                            EnumC1049t enumC1049t = (EnumC1049t) obj29;
                            try {
                                c1039j16.getClass();
                                int iOrdinal = enumC1049t.ordinal();
                                if (iOrdinal == 0) {
                                    webSettings15.setMixedContentMode(0);
                                } else if (iOrdinal == 1) {
                                    webSettings15.setMixedContentMode(2);
                                } else if (iOrdinal == 2) {
                                    webSettings15.setMixedContentMode(1);
                                }
                                listQ15 = AbstractC0149a.y(null);
                            } catch (Throwable th15) {
                                listQ15 = Z1.f.Q(th15);
                            }
                            lVar.u(listQ15);
                            break;
                        case 15:
                            C1039j c1039j17 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list15 = (List) obj;
                            Object obj30 = list15.get(0);
                            N3.h.c(obj30, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings16 = (WebSettings) obj30;
                            Object obj31 = list15.get(1);
                            N3.h.c(obj31, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue12 = ((Boolean) obj31).booleanValue();
                            try {
                                c1039j17.getClass();
                                webSettings16.setJavaScriptCanOpenWindowsAutomatically(zBooleanValue12);
                                listQ16 = AbstractC0149a.y(null);
                            } catch (Throwable th16) {
                                listQ16 = Z1.f.Q(th16);
                            }
                            lVar.u(listQ16);
                            break;
                        default:
                            C1039j c1039j18 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list16 = (List) obj;
                            Object obj32 = list16.get(0);
                            N3.h.c(obj32, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings17 = (WebSettings) obj32;
                            Object obj33 = list16.get(1);
                            N3.h.c(obj33, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue13 = ((Boolean) obj33).booleanValue();
                            try {
                                c1039j18.getClass();
                                webSettings17.setSupportMultipleWindows(zBooleanValue13);
                                listQ17 = AbstractC0149a.y(null);
                            } catch (Throwable th17) {
                                listQ17 = Z1.f.Q(th17);
                            }
                            lVar.u(listQ17);
                            break;
                    }
                }
            });
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void M(M3.p pVar, AbstractC0124a abstractC0124a, AbstractC0124a abstractC0124a2) {
        try {
            a4.a.h(A(((G3.b) pVar).a(abstractC0124a2, abstractC0124a)), B3.g.f275a, null);
        } catch (Throwable th) {
            abstractC0124a2.j(i4.a.p(th));
            throw th;
        }
    }

    public static String N(String str) {
        return str.length() <= 127 ? str : str.substring(0, 127);
    }

    public static final boolean O(String str, M3.a aVar) {
        try {
            boolean zBooleanValue = ((Boolean) aVar.d()).booleanValue();
            if (!zBooleanValue && str != null) {
                Log.e("ReflectionGuard", str);
            }
            return zBooleanValue;
        } catch (ClassNotFoundException unused) {
            if (str == null) {
                str = "";
            }
            Log.e("ReflectionGuard", "ClassNotFound: ".concat(str));
            return false;
        } catch (NoSuchMethodException unused2) {
            if (str == null) {
                str = "";
            }
            Log.e("ReflectionGuard", "NoSuchMethod: ".concat(str));
            return false;
        }
    }

    public static ArrayList P(Throwable th) {
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(th.toString());
        arrayList.add(th.getClass().getSimpleName());
        arrayList.add("Cause: " + th.getCause() + ", Stacktrace: " + Log.getStackTraceString(th));
        return arrayList;
    }

    public static List Q(Throwable th) {
        if (th instanceof C1030a) {
            C1030a c1030a = (C1030a) th;
            return C3.g.Q(c1030a.f11045l, c1030a.f11046m, c1030a.f11047n);
        }
        return C3.g.Q(th.getClass().getSimpleName(), th.toString(), "Cause: " + th.getCause() + ", Stacktrace: " + Log.getStackTraceString(th));
    }

    public static final void c(int i, StringBuilder sb) {
        for (int i5 = 0; i5 < i; i5++) {
            sb.append("?");
            if (i5 < i - 1) {
                sb.append(",");
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object e(X3.r r4, M3.a r5, G3.b r6) {
        /*
            boolean r0 = r6 instanceof X3.p
            if (r0 == 0) goto L13
            r0 = r6
            X3.p r0 = (X3.p) r0
            int r1 = r0.f2675q
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f2675q = r1
            goto L18
        L13:
            X3.p r0 = new X3.p
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f2674p
            F3.a r1 = F3.a.f861l
            int r2 = r0.f2675q
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            M3.a r5 = r0.f2673o
            i4.a.Y(r6)     // Catch: java.lang.Throwable -> L29
            goto L65
        L29:
            r4 = move-exception
            goto L6b
        L2b:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L33:
            i4.a.Y(r6)
            E3.i r6 = r0.f914m
            N3.h.b(r6)
            V3.t r2 = V3.C0142t.f2444m
            E3.g r6 = r6.l(r2)
            if (r6 != r4) goto L6f
            r0.f2673o = r5     // Catch: java.lang.Throwable -> L29
            r0.f2675q = r3     // Catch: java.lang.Throwable -> L29
            V3.f r6 = new V3.f     // Catch: java.lang.Throwable -> L29
            E3.d r0 = A(r0)     // Catch: java.lang.Throwable -> L29
            r6.<init>(r3, r0)     // Catch: java.lang.Throwable -> L29
            r6.u()     // Catch: java.lang.Throwable -> L29
            L.K r0 = new L.K     // Catch: java.lang.Throwable -> L29
            r2 = 2
            r0.<init>(r6, r2)     // Catch: java.lang.Throwable -> L29
            X3.q r4 = (X3.q) r4     // Catch: java.lang.Throwable -> L29
            r4.Y(r0)     // Catch: java.lang.Throwable -> L29
            java.lang.Object r4 = r6.t()     // Catch: java.lang.Throwable -> L29
            if (r4 != r1) goto L65
            return r1
        L65:
            r5.d()
            B3.g r4 = B3.g.f275a
            return r4
        L6b:
            r5.d()
            throw r4
        L6f:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "awaitClose() can only be invoked from the producer context"
            r4.<init>(r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: Z1.f.e(X3.r, M3.a, G3.b):java.lang.Object");
    }

    public static final void f(Closeable closeable, Throwable th) throws IOException {
        if (closeable != null) {
            if (th == null) {
                closeable.close();
                return;
            }
            try {
                closeable.close();
            } catch (Throwable th2) {
                AbstractC0149a.c(th, th2);
            }
        }
    }

    public static void g(InterfaceC0413h interfaceC0413h) {
        if (interfaceC0413h != null) {
            try {
                interfaceC0413h.close();
            } catch (IOException unused) {
            }
        }
    }

    public static long h(long j5, long j6, long j7) {
        if (j6 <= j7) {
            return j5 < j6 ? j6 : j5 > j7 ? j7 : j5;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + j7 + " is less than minimum " + j6 + '.');
    }

    public static final void i(int i, int i5) {
        if (i <= i5) {
            return;
        }
        throw new IndexOutOfBoundsException("toIndex (" + i + ") is greater than size (" + i5 + ").");
    }

    public static boolean n(Method method, N3.e eVar) {
        Class clsA = eVar.a();
        N3.h.c(clsA, "null cannot be cast to non-null type java.lang.Class<T of kotlin.jvm.JvmClassMappingKt.<get-java>>");
        return method.getReturnType().equals(clsA);
    }

    public static long t(double d5) {
        if (!C(d5)) {
            throw new IllegalArgumentException("not a normal value");
        }
        int exponent = Math.getExponent(d5);
        long jDoubleToRawLongBits = Double.doubleToRawLongBits(d5) & 4503599627370495L;
        return exponent == -1023 ? jDoubleToRawLongBits << 1 : jDoubleToRawLongBits | 4503599627370496L;
    }

    public static String u(String str, String str2) {
        N3.h.e(str, "tableName");
        N3.h.e(str2, "triggerType");
        return "`room_table_modification_trigger_" + str + '_' + str2 + '`';
    }

    public static void v(String str, Exception exc) {
        if (exc instanceof InvocationTargetException) {
            Throwable cause = exc.getCause();
            if (!(cause instanceof RuntimeException)) {
                throw new RuntimeException(cause);
            }
            throw ((RuntimeException) cause);
        }
        Log.v("Trace", "Unable to call " + str + " via reflection", exc);
    }

    public static int x(long j5) {
        return (int) (j5 ^ (j5 >>> 32));
    }

    public static int y(String str) {
        if (str == null) {
            return -1;
        }
        String strM = AbstractC0156G.m(str);
        strM.getClass();
        switch (strM) {
        }
        return -1;
    }

    public static int z(Uri uri) {
        String lastPathSegment = uri.getLastPathSegment();
        if (lastPathSegment == null) {
            return -1;
        }
        if (lastPathSegment.endsWith(".ac3") || lastPathSegment.endsWith(".ec3")) {
            return 0;
        }
        if (lastPathSegment.endsWith(".ac4")) {
            return 1;
        }
        if (lastPathSegment.endsWith(".adts") || lastPathSegment.endsWith(".aac")) {
            return 2;
        }
        if (lastPathSegment.endsWith(".amr")) {
            return 3;
        }
        if (lastPathSegment.endsWith(".flac")) {
            return 4;
        }
        if (lastPathSegment.endsWith(".flv")) {
            return 5;
        }
        if (lastPathSegment.endsWith(".mid") || lastPathSegment.endsWith(".midi") || lastPathSegment.endsWith(".smf")) {
            return 15;
        }
        if (lastPathSegment.startsWith(".mk", lastPathSegment.length() - 4) || lastPathSegment.endsWith(".webm")) {
            return 6;
        }
        if (lastPathSegment.endsWith(".mp3")) {
            return 7;
        }
        if (lastPathSegment.endsWith(".mp4") || lastPathSegment.startsWith(".m4", lastPathSegment.length() - 4) || lastPathSegment.startsWith(".mp4", lastPathSegment.length() - 5) || lastPathSegment.startsWith(".cmf", lastPathSegment.length() - 5)) {
            return 8;
        }
        if (lastPathSegment.startsWith(".og", lastPathSegment.length() - 4) || lastPathSegment.endsWith(".opus")) {
            return 9;
        }
        if (lastPathSegment.endsWith(".ps") || lastPathSegment.endsWith(".mpeg") || lastPathSegment.endsWith(".mpg") || lastPathSegment.endsWith(".m2p")) {
            return 10;
        }
        if (lastPathSegment.endsWith(".ts") || lastPathSegment.startsWith(".ts", lastPathSegment.length() - 4)) {
            return 11;
        }
        if (lastPathSegment.endsWith(".wav") || lastPathSegment.endsWith(".wave")) {
            return 12;
        }
        if (lastPathSegment.endsWith(".vtt") || lastPathSegment.endsWith(".webvtt")) {
            return 13;
        }
        if (lastPathSegment.endsWith(".jpg") || lastPathSegment.endsWith(".jpeg")) {
            return 14;
        }
        if (lastPathSegment.endsWith(".avi")) {
            return 16;
        }
        if (lastPathSegment.endsWith(".png")) {
            return 17;
        }
        if (lastPathSegment.endsWith(".webp")) {
            return 18;
        }
        if (lastPathSegment.endsWith(".bmp") || lastPathSegment.endsWith(".dib")) {
            return 19;
        }
        if (lastPathSegment.endsWith(".heic") || lastPathSegment.endsWith(".heif")) {
            return 20;
        }
        return lastPathSegment.endsWith(".avif") ? 21 : -1;
    }

    public abstract View D(int i);

    public abstract boolean E();

    public abstract void J(boolean z4);

    public abstract void R(byte[] bArr, int i, int i5);

    @Override // U2.d
    public void b(String str, HashMap map) {
        s().b(str, map);
    }

    @Override // U2.d
    public void d(Serializable serializable) {
        s().d(serializable);
    }

    public abstract Typeface j(Context context, v.f fVar, Resources resources, int i);

    public abstract Typeface k(Context context, A.k[] kVarArr, int i);

    public Typeface l(Context context, InputStream inputStream) {
        File fileW = AbstractC0149a.w(context);
        if (fileW == null) {
            return null;
        }
        try {
            if (AbstractC0149a.l(fileW, inputStream)) {
                return Typeface.createFromFile(fileW.getPath());
            }
            return null;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            fileW.delete();
        }
    }

    public Typeface m(Context context, Resources resources, int i, String str, int i5) {
        File fileW = AbstractC0149a.w(context);
        if (fileW == null) {
            return null;
        }
        try {
            if (AbstractC0149a.k(fileW, resources, i)) {
                return Typeface.createFromFile(fileW.getPath());
            }
            return null;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            fileW.delete();
        }
    }

    public A.k o(A.k[] kVarArr, int i) {
        new p1.b(16);
        int i5 = (i & 1) == 0 ? 400 : 700;
        boolean z4 = (i & 2) != 0;
        A.k kVar = null;
        int i6 = Integer.MAX_VALUE;
        for (A.k kVar2 : kVarArr) {
            int iAbs = (Math.abs(kVar2.f30c - i5) * 2) + (kVar2.f31d == z4 ? 0 : 1);
            if (kVar == null || i6 > iAbs) {
                kVar = kVar2;
                i6 = iAbs;
            }
        }
        return kVar;
    }

    public abstract Object p(String str);

    public abstract String q();

    public boolean r() {
        return Boolean.TRUE.equals(p("noResult"));
    }

    public abstract U2.d s();

    public String toString() {
        switch (this.f3007l) {
            case 10:
                return q() + " " + ((String) p("sql")) + " " + ((List) p("arguments"));
            default:
                return super.toString();
        }
    }

    public abstract boolean w();

    public f() {
        this.f3007l = 26;
        new ConcurrentHashMap();
    }

    public void I(boolean z4) {
    }
}

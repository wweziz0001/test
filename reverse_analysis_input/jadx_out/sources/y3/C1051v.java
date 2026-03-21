package y3;

import a.AbstractC0149a;
import android.net.http.SslError;
import android.view.View;
import android.webkit.WebStorage;
import java.util.List;
import m.B0;
import n3.InterfaceC0692b;
import n3.InterfaceC0693c;
import z3.InterfaceC1070c;

/* JADX INFO: renamed from: y3.v, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1051v implements InterfaceC0693c, InterfaceC0692b, InterfaceC1070c {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f11107l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Object f11108m;

    public /* synthetic */ C1051v(Object obj, int i) {
        this.f11107l = i;
        this.f11108m = obj;
    }

    @Override // z3.InterfaceC1070c
    public boolean a(View view) {
        int i = 0;
        while (true) {
            Class[] clsArr = (Class[]) this.f11108m;
            if (i >= clsArr.length) {
                return false;
            }
            if (clsArr[i].isInstance(view)) {
                return true;
            }
            i++;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // n3.InterfaceC0692b
    public void t(Object obj, Z1.l lVar) {
        List listQ;
        List listQ2;
        List listQ3;
        List listQ4;
        List listQ5;
        switch (this.f11107l) {
            case 4:
                C1039j c1039j = (C1039j) this.f11108m;
                N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                Object obj2 = ((List) obj).get(0);
                N3.h.c(obj2, "null cannot be cast to non-null type kotlin.Long");
                try {
                    ((C1032c) c1039j.f11068a.f9n).a(((Long) obj2).longValue(), new C1045p(c1039j));
                    listQ = AbstractC0149a.y(null);
                    break;
                } catch (Throwable th) {
                    listQ = Z1.f.Q(th);
                }
                lVar.u(listQ);
                return;
            case 9:
                C1039j c1039j2 = (C1039j) this.f11108m;
                N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                List list = (List) obj;
                Object obj3 = list.get(0);
                N3.h.c(obj3, "null cannot be cast to non-null type kotlin.Long");
                long jLongValue = ((Long) obj3).longValue();
                Object obj4 = list.get(1);
                N3.h.c(obj4, "null cannot be cast to non-null type kotlin.String");
                try {
                    ((C1032c) c1039j2.f11068a.f9n).a(jLongValue, new C1048s((String) obj4, c1039j2));
                    listQ2 = AbstractC0149a.y(null);
                    break;
                } catch (Throwable th2) {
                    listQ2 = Z1.f.Q(th2);
                }
                lVar.u(listQ2);
                return;
            case 15:
                C1039j c1039j3 = (C1039j) this.f11108m;
                N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                List list2 = (List) obj;
                int i = 0;
                Object obj5 = list2.get(0);
                N3.h.c(obj5, "null cannot be cast to non-null type android.net.http.SslError");
                SslError sslError = (SslError) obj5;
                Object obj6 = list2.get(1);
                N3.h.c(obj6, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.SslErrorType");
                EnumC1017L enumC1017L = (EnumC1017L) obj6;
                try {
                } catch (Throwable th3) {
                    listQ3 = Z1.f.Q(th3);
                }
                switch (enumC1017L.ordinal()) {
                    case 0:
                        i = 4;
                        listQ3 = AbstractC0149a.y(Boolean.valueOf(sslError.hasError(i)));
                        lVar.u(listQ3);
                        return;
                    case 1:
                        i = 1;
                        listQ3 = AbstractC0149a.y(Boolean.valueOf(sslError.hasError(i)));
                        lVar.u(listQ3);
                        return;
                    case 2:
                        i = 2;
                        listQ3 = AbstractC0149a.y(Boolean.valueOf(sslError.hasError(i)));
                        lVar.u(listQ3);
                        return;
                    case 3:
                        i = 5;
                        listQ3 = AbstractC0149a.y(Boolean.valueOf(sslError.hasError(i)));
                        lVar.u(listQ3);
                        return;
                    case 4:
                        listQ3 = AbstractC0149a.y(Boolean.valueOf(sslError.hasError(i)));
                        lVar.u(listQ3);
                        return;
                    case 5:
                        i = 3;
                        listQ3 = AbstractC0149a.y(Boolean.valueOf(sslError.hasError(i)));
                        lVar.u(listQ3);
                        return;
                    case O.j.STRING_SET_FIELD_NUMBER /* 6 */:
                        c1039j3.f11068a.getClass();
                        throw new IllegalArgumentException(enumC1017L + " doesn't represent a native value.");
                    default:
                        i = -1;
                        listQ3 = AbstractC0149a.y(Boolean.valueOf(sslError.hasError(i)));
                        lVar.u(listQ3);
                        return;
                }
            case 23:
                C1039j c1039j4 = (C1039j) this.f11108m;
                N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                Object obj7 = ((List) obj).get(0);
                N3.h.c(obj7, "null cannot be cast to non-null type kotlin.Long");
                try {
                    ((C1032c) c1039j4.f11068a.f9n).a(((Long) obj7).longValue(), WebStorage.getInstance());
                    listQ4 = AbstractC0149a.y(null);
                    break;
                } catch (Throwable th4) {
                    listQ4 = Z1.f.Q(th4);
                }
                lVar.u(listQ4);
                return;
            default:
                C1039j c1039j5 = (C1039j) this.f11108m;
                N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                Object obj8 = ((List) obj).get(0);
                N3.h.c(obj8, "null cannot be cast to non-null type kotlin.Long");
                try {
                    ((C1032c) c1039j5.f11068a.f9n).a(((Long) obj8).longValue(), new C1026V(c1039j5));
                    listQ5 = AbstractC0149a.y(null);
                    break;
                } catch (Throwable th5) {
                    listQ5 = Z1.f.Q(th5);
                }
                lVar.u(listQ5);
                return;
        }
    }

    @Override // n3.InterfaceC0693c
    public void u(Object obj) {
        switch (this.f11107l) {
            case 0:
                boolean z4 = obj instanceof List;
                Object obj2 = ((C1035f) this.f11108m).f11064m;
                if (!z4) {
                    B0.m("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.ClientCertRequest.pigeon_newInstance'.", "", "ClientCertRequest", obj2);
                } else {
                    List list = (List) obj;
                    if (list.size() > 1) {
                        Object obj3 = list.get(0);
                        N3.h.c(obj3, "null cannot be cast to non-null type kotlin.String");
                        Object obj4 = list.get(1);
                        N3.h.c(obj4, "null cannot be cast to non-null type kotlin.String");
                        B0.n(new C1030a((String) obj3, (String) obj4, (String) list.get(2)), "ClientCertRequest", obj2);
                    }
                }
                break;
            case 1:
                boolean z5 = obj instanceof List;
                Object obj5 = ((C1035f) this.f11108m).f11064m;
                if (!z5) {
                    B0.m("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.ConsoleMessage.pigeon_newInstance'.", "", "ConsoleMessage", obj5);
                } else {
                    List list2 = (List) obj;
                    if (list2.size() > 1) {
                        Object obj6 = list2.get(0);
                        N3.h.c(obj6, "null cannot be cast to non-null type kotlin.String");
                        Object obj7 = list2.get(1);
                        N3.h.c(obj7, "null cannot be cast to non-null type kotlin.String");
                        B0.n(new C1030a((String) obj6, (String) obj7, (String) list2.get(2)), "ConsoleMessage", obj5);
                    }
                }
                break;
            case 2:
                boolean z6 = obj instanceof List;
                Object obj8 = ((C1035f) this.f11108m).f11064m;
                if (!z6) {
                    B0.m("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.CookieManager.pigeon_newInstance'.", "", "CookieManager", obj8);
                } else {
                    List list3 = (List) obj;
                    if (list3.size() > 1) {
                        Object obj9 = list3.get(0);
                        N3.h.c(obj9, "null cannot be cast to non-null type kotlin.String");
                        Object obj10 = list3.get(1);
                        N3.h.c(obj10, "null cannot be cast to non-null type kotlin.String");
                        B0.n(new C1030a((String) obj9, (String) obj10, (String) list3.get(2)), "CookieManager", obj8);
                    }
                }
                break;
            case 3:
                boolean z7 = obj instanceof List;
                Object obj11 = ((C1035f) this.f11108m).f11064m;
                if (!z7) {
                    B0.m("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.CustomViewCallback.pigeon_newInstance'.", "", "CustomViewCallback", obj11);
                } else {
                    List list4 = (List) obj;
                    if (list4.size() > 1) {
                        Object obj12 = list4.get(0);
                        N3.h.c(obj12, "null cannot be cast to non-null type kotlin.String");
                        Object obj13 = list4.get(1);
                        N3.h.c(obj13, "null cannot be cast to non-null type kotlin.String");
                        B0.n(new C1030a((String) obj12, (String) obj13, (String) list4.get(2)), "CustomViewCallback", obj11);
                    }
                }
                break;
            case 4:
            case 9:
            case 15:
            case 23:
            case 26:
            default:
                boolean z8 = obj instanceof List;
                Object obj14 = ((C1035f) this.f11108m).f11064m;
                if (!z8) {
                    B0.m("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.X509Certificate.pigeon_newInstance'.", "", "X509Certificate", obj14);
                } else {
                    List list5 = (List) obj;
                    if (list5.size() > 1) {
                        Object obj15 = list5.get(0);
                        N3.h.c(obj15, "null cannot be cast to non-null type kotlin.String");
                        Object obj16 = list5.get(1);
                        N3.h.c(obj16, "null cannot be cast to non-null type kotlin.String");
                        B0.n(new C1030a((String) obj15, (String) obj16, (String) list5.get(2)), "X509Certificate", obj14);
                    }
                }
                break;
            case 5:
                boolean z9 = obj instanceof List;
                Object obj17 = ((C1035f) this.f11108m).f11064m;
                if (!z9) {
                    B0.m("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.FileChooserParams.pigeon_newInstance'.", "", "FileChooserParams", obj17);
                } else {
                    List list6 = (List) obj;
                    if (list6.size() > 1) {
                        Object obj18 = list6.get(0);
                        N3.h.c(obj18, "null cannot be cast to non-null type kotlin.String");
                        Object obj19 = list6.get(1);
                        N3.h.c(obj19, "null cannot be cast to non-null type kotlin.String");
                        B0.n(new C1030a((String) obj18, (String) obj19, (String) list6.get(2)), "FileChooserParams", obj17);
                    }
                }
                break;
            case O.j.STRING_SET_FIELD_NUMBER /* 6 */:
                boolean z10 = obj instanceof List;
                Object obj20 = ((C1035f) this.f11108m).f11064m;
                if (!z10) {
                    B0.m("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.FlutterAssetManager.pigeon_newInstance'.", "", "FlutterAssetManager", obj20);
                } else {
                    List list7 = (List) obj;
                    if (list7.size() > 1) {
                        Object obj21 = list7.get(0);
                        N3.h.c(obj21, "null cannot be cast to non-null type kotlin.String");
                        Object obj22 = list7.get(1);
                        N3.h.c(obj22, "null cannot be cast to non-null type kotlin.String");
                        B0.n(new C1030a((String) obj21, (String) obj22, (String) list7.get(2)), "FlutterAssetManager", obj20);
                    }
                }
                break;
            case O.j.DOUBLE_FIELD_NUMBER /* 7 */:
                boolean z11 = obj instanceof List;
                Object obj23 = ((C1035f) this.f11108m).f11064m;
                if (!z11) {
                    B0.m("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.GeolocationPermissionsCallback.pigeon_newInstance'.", "", "GeolocationPermissionsCallback", obj23);
                } else {
                    List list8 = (List) obj;
                    if (list8.size() > 1) {
                        Object obj24 = list8.get(0);
                        N3.h.c(obj24, "null cannot be cast to non-null type kotlin.String");
                        Object obj25 = list8.get(1);
                        N3.h.c(obj25, "null cannot be cast to non-null type kotlin.String");
                        B0.n(new C1030a((String) obj24, (String) obj25, (String) list8.get(2)), "GeolocationPermissionsCallback", obj23);
                    }
                }
                break;
            case O.j.BYTES_FIELD_NUMBER /* 8 */:
                boolean z12 = obj instanceof List;
                Object obj26 = ((C1035f) this.f11108m).f11064m;
                if (!z12) {
                    B0.m("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.HttpAuthHandler.pigeon_newInstance'.", "", "HttpAuthHandler", obj26);
                } else {
                    List list9 = (List) obj;
                    if (list9.size() > 1) {
                        Object obj27 = list9.get(0);
                        N3.h.c(obj27, "null cannot be cast to non-null type kotlin.String");
                        Object obj28 = list9.get(1);
                        N3.h.c(obj28, "null cannot be cast to non-null type kotlin.String");
                        B0.n(new C1030a((String) obj27, (String) obj28, (String) list9.get(2)), "HttpAuthHandler", obj26);
                    }
                }
                break;
            case 10:
                boolean z13 = obj instanceof List;
                Object obj29 = ((C1035f) this.f11108m).f11064m;
                if (!z13) {
                    B0.m("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.PermissionRequest.pigeon_newInstance'.", "", "PermissionRequest", obj29);
                } else {
                    List list10 = (List) obj;
                    if (list10.size() > 1) {
                        Object obj30 = list10.get(0);
                        N3.h.c(obj30, "null cannot be cast to non-null type kotlin.String");
                        Object obj31 = list10.get(1);
                        N3.h.c(obj31, "null cannot be cast to non-null type kotlin.String");
                        B0.n(new C1030a((String) obj30, (String) obj31, (String) list10.get(2)), "PermissionRequest", obj29);
                    }
                }
                break;
            case 11:
                boolean z14 = obj instanceof List;
                Object obj32 = ((C1035f) this.f11108m).f11064m;
                if (!z14) {
                    B0.m("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.PrivateKey.pigeon_newInstance'.", "", "PrivateKey", obj32);
                } else {
                    List list11 = (List) obj;
                    if (list11.size() > 1) {
                        Object obj33 = list11.get(0);
                        N3.h.c(obj33, "null cannot be cast to non-null type kotlin.String");
                        Object obj34 = list11.get(1);
                        N3.h.c(obj34, "null cannot be cast to non-null type kotlin.String");
                        B0.n(new C1030a((String) obj33, (String) obj34, (String) list11.get(2)), "PrivateKey", obj32);
                    }
                }
                break;
            case 12:
                boolean z15 = obj instanceof List;
                Object obj35 = ((C1035f) this.f11108m).f11064m;
                if (!z15) {
                    B0.m("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.SslCertificate.pigeon_newInstance'.", "", "SslCertificate", obj35);
                } else {
                    List list12 = (List) obj;
                    if (list12.size() > 1) {
                        Object obj36 = list12.get(0);
                        N3.h.c(obj36, "null cannot be cast to non-null type kotlin.String");
                        Object obj37 = list12.get(1);
                        N3.h.c(obj37, "null cannot be cast to non-null type kotlin.String");
                        B0.n(new C1030a((String) obj36, (String) obj37, (String) list12.get(2)), "SslCertificate", obj35);
                    }
                }
                break;
            case 13:
                boolean z16 = obj instanceof List;
                Object obj38 = ((C1035f) this.f11108m).f11064m;
                if (!z16) {
                    B0.m("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.SslCertificateDName.pigeon_newInstance'.", "", "SslCertificateDName", obj38);
                } else {
                    List list13 = (List) obj;
                    if (list13.size() > 1) {
                        Object obj39 = list13.get(0);
                        N3.h.c(obj39, "null cannot be cast to non-null type kotlin.String");
                        Object obj40 = list13.get(1);
                        N3.h.c(obj40, "null cannot be cast to non-null type kotlin.String");
                        B0.n(new C1030a((String) obj39, (String) obj40, (String) list13.get(2)), "SslCertificateDName", obj38);
                    }
                }
                break;
            case 14:
                boolean z17 = obj instanceof List;
                Object obj41 = ((C1035f) this.f11108m).f11064m;
                if (!z17) {
                    B0.m("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.SslError.pigeon_newInstance'.", "", "SslError", obj41);
                } else {
                    List list14 = (List) obj;
                    if (list14.size() > 1) {
                        Object obj42 = list14.get(0);
                        N3.h.c(obj42, "null cannot be cast to non-null type kotlin.String");
                        Object obj43 = list14.get(1);
                        N3.h.c(obj43, "null cannot be cast to non-null type kotlin.String");
                        B0.n(new C1030a((String) obj42, (String) obj43, (String) list14.get(2)), "SslError", obj41);
                    }
                }
                break;
            case 16:
                boolean z18 = obj instanceof List;
                Object obj44 = ((C1035f) this.f11108m).f11064m;
                if (!z18) {
                    B0.m("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.SslErrorHandler.pigeon_newInstance'.", "", "SslErrorHandler", obj44);
                } else {
                    List list15 = (List) obj;
                    if (list15.size() > 1) {
                        Object obj45 = list15.get(0);
                        N3.h.c(obj45, "null cannot be cast to non-null type kotlin.String");
                        Object obj46 = list15.get(1);
                        N3.h.c(obj46, "null cannot be cast to non-null type kotlin.String");
                        B0.n(new C1030a((String) obj45, (String) obj46, (String) list15.get(2)), "SslErrorHandler", obj44);
                    }
                }
                break;
            case 17:
                boolean z19 = obj instanceof List;
                Object obj47 = ((C1035f) this.f11108m).f11064m;
                if (!z19) {
                    B0.m("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.View.pigeon_newInstance'.", "", "View", obj47);
                } else {
                    List list16 = (List) obj;
                    if (list16.size() > 1) {
                        Object obj48 = list16.get(0);
                        N3.h.c(obj48, "null cannot be cast to non-null type kotlin.String");
                        Object obj49 = list16.get(1);
                        N3.h.c(obj49, "null cannot be cast to non-null type kotlin.String");
                        B0.n(new C1030a((String) obj48, (String) obj49, (String) list16.get(2)), "View", obj47);
                    }
                }
                break;
            case 18:
                boolean z20 = obj instanceof List;
                Object obj50 = ((C1035f) this.f11108m).f11064m;
                if (!z20) {
                    B0.m("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.WebResourceError.pigeon_newInstance'.", "", "WebResourceError", obj50);
                } else {
                    List list17 = (List) obj;
                    if (list17.size() > 1) {
                        Object obj51 = list17.get(0);
                        N3.h.c(obj51, "null cannot be cast to non-null type kotlin.String");
                        Object obj52 = list17.get(1);
                        N3.h.c(obj52, "null cannot be cast to non-null type kotlin.String");
                        B0.n(new C1030a((String) obj51, (String) obj52, (String) list17.get(2)), "WebResourceError", obj50);
                    }
                }
                break;
            case 19:
                boolean z21 = obj instanceof List;
                Object obj53 = ((C1035f) this.f11108m).f11064m;
                if (!z21) {
                    B0.m("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.WebResourceRequest.pigeon_newInstance'.", "", "WebResourceRequest", obj53);
                } else {
                    List list18 = (List) obj;
                    if (list18.size() > 1) {
                        Object obj54 = list18.get(0);
                        N3.h.c(obj54, "null cannot be cast to non-null type kotlin.String");
                        Object obj55 = list18.get(1);
                        N3.h.c(obj55, "null cannot be cast to non-null type kotlin.String");
                        B0.n(new C1030a((String) obj54, (String) obj55, (String) list18.get(2)), "WebResourceRequest", obj53);
                    }
                }
                break;
            case 20:
                boolean z22 = obj instanceof List;
                Object obj56 = ((C1035f) this.f11108m).f11064m;
                if (!z22) {
                    B0.m("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.WebResourceResponse.pigeon_newInstance'.", "", "WebResourceResponse", obj56);
                } else {
                    List list19 = (List) obj;
                    if (list19.size() > 1) {
                        Object obj57 = list19.get(0);
                        N3.h.c(obj57, "null cannot be cast to non-null type kotlin.String");
                        Object obj58 = list19.get(1);
                        N3.h.c(obj58, "null cannot be cast to non-null type kotlin.String");
                        B0.n(new C1030a((String) obj57, (String) obj58, (String) list19.get(2)), "WebResourceResponse", obj56);
                    }
                }
                break;
            case 21:
                boolean z23 = obj instanceof List;
                Object obj59 = ((C1035f) this.f11108m).f11064m;
                if (!z23) {
                    B0.m("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.WebSettings.pigeon_newInstance'.", "", "WebSettings", obj59);
                } else {
                    List list20 = (List) obj;
                    if (list20.size() > 1) {
                        Object obj60 = list20.get(0);
                        N3.h.c(obj60, "null cannot be cast to non-null type kotlin.String");
                        Object obj61 = list20.get(1);
                        N3.h.c(obj61, "null cannot be cast to non-null type kotlin.String");
                        B0.n(new C1030a((String) obj60, (String) obj61, (String) list20.get(2)), "WebSettings", obj59);
                    }
                }
                break;
            case 22:
                boolean z24 = obj instanceof List;
                Object obj62 = ((C1035f) this.f11108m).f11064m;
                if (!z24) {
                    B0.m("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.WebStorage.pigeon_newInstance'.", "", "WebStorage", obj62);
                } else {
                    List list21 = (List) obj;
                    if (list21.size() > 1) {
                        Object obj63 = list21.get(0);
                        N3.h.c(obj63, "null cannot be cast to non-null type kotlin.String");
                        Object obj64 = list21.get(1);
                        N3.h.c(obj64, "null cannot be cast to non-null type kotlin.String");
                        B0.n(new C1030a((String) obj63, (String) obj64, (String) list21.get(2)), "WebStorage", obj62);
                    }
                }
                break;
            case 24:
                boolean z25 = obj instanceof List;
                Object obj65 = ((C1035f) this.f11108m).f11064m;
                if (!z25) {
                    B0.m("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.WebView.pigeon_newInstance'.", "", "WebView", obj65);
                } else {
                    List list22 = (List) obj;
                    if (list22.size() > 1) {
                        Object obj66 = list22.get(0);
                        N3.h.c(obj66, "null cannot be cast to non-null type kotlin.String");
                        Object obj67 = list22.get(1);
                        N3.h.c(obj67, "null cannot be cast to non-null type kotlin.String");
                        B0.n(new C1030a((String) obj66, (String) obj67, (String) list22.get(2)), "WebView", obj65);
                    }
                }
                break;
            case 25:
                boolean z26 = obj instanceof List;
                Object obj68 = ((C1035f) this.f11108m).f11064m;
                if (!z26) {
                    B0.m("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.WebViewClient.pigeon_newInstance'.", "", "WebViewClient", obj68);
                } else {
                    List list23 = (List) obj;
                    if (list23.size() > 1) {
                        Object obj69 = list23.get(0);
                        N3.h.c(obj69, "null cannot be cast to non-null type kotlin.String");
                        Object obj70 = list23.get(1);
                        N3.h.c(obj70, "null cannot be cast to non-null type kotlin.String");
                        B0.n(new C1030a((String) obj69, (String) obj70, (String) list23.get(2)), "WebViewClient", obj68);
                    }
                }
                break;
            case 27:
                boolean z27 = obj instanceof List;
                Object obj71 = ((C1035f) this.f11108m).f11064m;
                if (!z27) {
                    B0.m("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.WebViewPoint.pigeon_newInstance'.", "", "WebViewPoint", obj71);
                } else {
                    List list24 = (List) obj;
                    if (list24.size() > 1) {
                        Object obj72 = list24.get(0);
                        N3.h.c(obj72, "null cannot be cast to non-null type kotlin.String");
                        Object obj73 = list24.get(1);
                        N3.h.c(obj73, "null cannot be cast to non-null type kotlin.String");
                        B0.n(new C1030a((String) obj72, (String) obj73, (String) list24.get(2)), "WebViewPoint", obj71);
                    }
                }
                break;
        }
    }
}

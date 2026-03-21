package y3;

import D2.C0030b;
import D2.r0;
import a.AbstractC0149a;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebStorage;
import android.webkit.WebViewClient;
import b3.AbstractC0307a;
import c1.C0318a;
import com.google.crypto.tink.shaded.protobuf.AbstractC0329i;
import com.google.crypto.tink.shaded.protobuf.C0335o;
import java.security.GeneralSecurityException;
import java.util.List;
import m.B0;
import n3.InterfaceC0692b;
import n3.InterfaceC0693c;
import z3.InterfaceC1070c;

/* JADX INFO: renamed from: y3.H, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1013H implements InterfaceC0692b, InterfaceC0693c, l2.d, y2.b, InterfaceC1070c {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f10984l;

    public /* synthetic */ C1013H(int i) {
        this.f10984l = i;
    }

    @Override // z3.InterfaceC1070c
    public boolean a(View view) {
        return view.hasFocus();
    }

    @Override // l2.d
    public Object apply(Object obj) {
        C0318a c0318a = (C0318a) obj;
        switch (this.f10984l) {
            case 19:
                return Long.valueOf(c0318a.f5029b);
            default:
                return Long.valueOf(c0318a.f5030c);
        }
    }

    @Override // y2.b
    public r2.b b(y2.n nVar) throws GeneralSecurityException {
        switch (this.f10984l) {
            case 22:
                r2.o oVar = r2.o.f9548a;
                if (!((String) nVar.f10954a).equals("type.googleapis.com/google.crypto.tink.AesCmacKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to AesCmacParameters.parseParameters");
                }
                try {
                    C0030b c0030bF = C0030b.F((AbstractC0329i) nVar.f10956c, C0335o.a());
                    if (c0030bF.D() != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    Z1.m mVar = new Z1.m(20);
                    mVar.f3024m = null;
                    mVar.f3025n = null;
                    mVar.f3026o = z2.d.f11154f;
                    mVar.H(c0030bF.B().size());
                    int iA = c0030bF.C().A();
                    if (iA < 10 || 16 < iA) {
                        throw new GeneralSecurityException(AbstractC0307a.i("Invalid tag size for AesCmacParameters: ", iA));
                    }
                    mVar.f3025n = Integer.valueOf(iA);
                    mVar.f3026o = z2.f.a((r0) nVar.f10958e);
                    z2.e eVarK = mVar.k();
                    Z1.s sVar = new Z1.s(19, false);
                    sVar.f3086n = null;
                    sVar.f3087o = null;
                    sVar.f3085m = eVarK;
                    sVar.f3086n = B0.d.e(c0030bF.B().j(), oVar);
                    sVar.f3087o = (Integer) nVar.f10959f;
                    return sVar.u();
                } catch (com.google.crypto.tink.shaded.protobuf.C | IllegalArgumentException unused) {
                    throw new GeneralSecurityException("Parsing AesCmacKey failed");
                }
            default:
                r2.o oVar2 = r2.o.f9548a;
                if (!((String) nVar.f10954a).equals("type.googleapis.com/google.crypto.tink.HmacKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to HmacProtoSerialization.parseKey");
                }
                try {
                    D2.Q qG = D2.Q.G((AbstractC0329i) nVar.f10956c, C0335o.a());
                    if (qG.E() != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    Z1.i iVar = new Z1.i();
                    iVar.f3012l = null;
                    iVar.f3013m = null;
                    iVar.f3014n = null;
                    iVar.f3015o = z2.d.f11162o;
                    iVar.f3012l = Integer.valueOf(qG.C().size());
                    iVar.f3013m = Integer.valueOf(qG.D().C());
                    iVar.f3014n = z2.l.a(qG.D().B());
                    iVar.f3015o = z2.l.b((r0) nVar.f10958e);
                    z2.k kVarF = iVar.f();
                    Z1.s sVar2 = new Z1.s(20, false);
                    sVar2.f3086n = null;
                    sVar2.f3087o = null;
                    sVar2.f3085m = kVarF;
                    sVar2.f3086n = B0.d.e(qG.C().j(), oVar2);
                    sVar2.f3087o = (Integer) nVar.f10959f;
                    return sVar2.v();
                } catch (com.google.crypto.tink.shaded.protobuf.C | IllegalArgumentException unused2) {
                    throw new GeneralSecurityException("Parsing HmacKey failed");
                }
        }
    }

    @Override // n3.InterfaceC0692b
    public void t(Object obj, Z1.l lVar) {
        List listQ;
        List listQ2;
        List listQ3;
        List listQ4;
        switch (this.f10984l) {
            case 0:
                N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                List list = (List) obj;
                Object obj2 = list.get(0);
                N3.h.c(obj2, "null cannot be cast to non-null type android.webkit.WebSettings");
                WebSettings webSettings = (WebSettings) obj2;
                Object obj3 = list.get(1);
                N3.h.c(obj3, "null cannot be cast to non-null type kotlin.Boolean");
                try {
                    C1016K.a(webSettings, ((Boolean) obj3).booleanValue());
                    listQ = AbstractC0149a.y(null);
                    break;
                } catch (Throwable th) {
                    listQ = Z1.f.Q(th);
                }
                lVar.u(listQ);
                return;
            case 1:
                N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                Object obj4 = ((List) obj).get(0);
                N3.h.c(obj4, "null cannot be cast to non-null type android.webkit.WebStorage");
                try {
                    ((WebStorage) obj4).deleteAllData();
                    listQ2 = AbstractC0149a.y(null);
                    break;
                } catch (Throwable th2) {
                    listQ2 = Z1.f.Q(th2);
                }
                lVar.u(listQ2);
                return;
            case 17:
                N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                List list2 = (List) obj;
                Object obj5 = list2.get(0);
                N3.h.c(obj5, "null cannot be cast to non-null type android.webkit.WebViewClient");
                WebViewClient webViewClient = (WebViewClient) obj5;
                Object obj6 = list2.get(1);
                N3.h.c(obj6, "null cannot be cast to non-null type kotlin.Boolean");
                boolean zBooleanValue = ((Boolean) obj6).booleanValue();
                try {
                } catch (Throwable th3) {
                    listQ3 = Z1.f.Q(th3);
                }
                if (!(webViewClient instanceof C1026V)) {
                    throw new IllegalStateException("This WebViewClient doesn't support setting the returnValueForShouldOverrideUrlLoading.");
                }
                ((C1026V) webViewClient).f11031b = zBooleanValue;
                listQ3 = AbstractC0149a.y(null);
                lVar.u(listQ3);
                return;
            default:
                N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                Object obj7 = ((List) obj).get(0);
                N3.h.c(obj7, "null cannot be cast to non-null type kotlin.String");
                try {
                    listQ4 = AbstractC0149a.y(Boolean.valueOf(Q1.C.f0((String) obj7)));
                    break;
                } catch (Throwable th4) {
                    listQ4 = Z1.f.Q(th4);
                }
                lVar.u(listQ4);
                return;
        }
    }

    @Override // n3.InterfaceC0693c
    public void u(Object obj) {
        switch (this.f10984l) {
            case 2:
                if (!(obj instanceof List)) {
                    B0.l("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.WebView.onScrollChanged'.", "");
                    int i = Z.f11041o;
                } else {
                    List list = (List) obj;
                    if (list.size() <= 1) {
                        int i5 = Z.f11041o;
                    } else {
                        Object obj2 = list.get(0);
                        N3.h.c(obj2, "null cannot be cast to non-null type kotlin.String");
                        Object obj3 = list.get(1);
                        N3.h.c(obj3, "null cannot be cast to non-null type kotlin.String");
                        i4.a.p(new C1030a((String) obj2, (String) obj3, (String) list.get(2)));
                        int i6 = Z.f11041o;
                    }
                }
                break;
            case 3:
                if (!(obj instanceof List)) {
                    B0.l("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.WebViewClient.onReceivedHttpError'.", "");
                    int i7 = C1026V.f11029c;
                } else {
                    List list2 = (List) obj;
                    if (list2.size() <= 1) {
                        int i8 = C1026V.f11029c;
                    } else {
                        Object obj4 = list2.get(0);
                        N3.h.c(obj4, "null cannot be cast to non-null type kotlin.String");
                        Object obj5 = list2.get(1);
                        N3.h.c(obj5, "null cannot be cast to non-null type kotlin.String");
                        i4.a.p(new C1030a((String) obj4, (String) obj5, (String) list2.get(2)));
                        int i9 = C1026V.f11029c;
                    }
                }
                break;
            case 4:
                if (!(obj instanceof List)) {
                    B0.l("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.WebViewClient.onLoadResource'.", "");
                    int i10 = C1026V.f11029c;
                } else {
                    List list3 = (List) obj;
                    if (list3.size() <= 1) {
                        int i11 = C1026V.f11029c;
                    } else {
                        Object obj6 = list3.get(0);
                        N3.h.c(obj6, "null cannot be cast to non-null type kotlin.String");
                        Object obj7 = list3.get(1);
                        N3.h.c(obj7, "null cannot be cast to non-null type kotlin.String");
                        i4.a.p(new C1030a((String) obj6, (String) obj7, (String) list3.get(2)));
                        int i12 = C1026V.f11029c;
                    }
                }
                break;
            case 5:
                if (!(obj instanceof List)) {
                    B0.l("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.WebViewClient.onReceivedLoginRequest'.", "");
                    int i13 = C1026V.f11029c;
                } else {
                    List list4 = (List) obj;
                    if (list4.size() <= 1) {
                        int i14 = C1026V.f11029c;
                    } else {
                        Object obj8 = list4.get(0);
                        N3.h.c(obj8, "null cannot be cast to non-null type kotlin.String");
                        Object obj9 = list4.get(1);
                        N3.h.c(obj9, "null cannot be cast to non-null type kotlin.String");
                        i4.a.p(new C1030a((String) obj8, (String) obj9, (String) list4.get(2)));
                        int i15 = C1026V.f11029c;
                    }
                }
                break;
            case O.j.STRING_SET_FIELD_NUMBER /* 6 */:
                if (!(obj instanceof List)) {
                    B0.l("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.WebViewClient.onPageStarted'.", "");
                    int i16 = C1026V.f11029c;
                } else {
                    List list5 = (List) obj;
                    if (list5.size() <= 1) {
                        int i17 = C1026V.f11029c;
                    } else {
                        Object obj10 = list5.get(0);
                        N3.h.c(obj10, "null cannot be cast to non-null type kotlin.String");
                        Object obj11 = list5.get(1);
                        N3.h.c(obj11, "null cannot be cast to non-null type kotlin.String");
                        i4.a.p(new C1030a((String) obj10, (String) obj11, (String) list5.get(2)));
                        int i18 = C1026V.f11029c;
                    }
                }
                break;
            case O.j.DOUBLE_FIELD_NUMBER /* 7 */:
                if (!(obj instanceof List)) {
                    B0.l("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.WebViewClient.onReceivedClientCertRequest'.", "");
                    int i19 = C1026V.f11029c;
                } else {
                    List list6 = (List) obj;
                    if (list6.size() <= 1) {
                        int i20 = C1026V.f11029c;
                    } else {
                        Object obj12 = list6.get(0);
                        N3.h.c(obj12, "null cannot be cast to non-null type kotlin.String");
                        Object obj13 = list6.get(1);
                        N3.h.c(obj13, "null cannot be cast to non-null type kotlin.String");
                        i4.a.p(new C1030a((String) obj12, (String) obj13, (String) list6.get(2)));
                        int i21 = C1026V.f11029c;
                    }
                }
                break;
            case O.j.BYTES_FIELD_NUMBER /* 8 */:
                if (!(obj instanceof List)) {
                    B0.l("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.WebViewClient.requestLoading'.", "");
                    int i22 = C1026V.f11029c;
                } else {
                    List list7 = (List) obj;
                    if (list7.size() <= 1) {
                        int i23 = C1026V.f11029c;
                    } else {
                        Object obj14 = list7.get(0);
                        N3.h.c(obj14, "null cannot be cast to non-null type kotlin.String");
                        Object obj15 = list7.get(1);
                        N3.h.c(obj15, "null cannot be cast to non-null type kotlin.String");
                        i4.a.p(new C1030a((String) obj14, (String) obj15, (String) list7.get(2)));
                        int i24 = C1026V.f11029c;
                    }
                }
                break;
            case 9:
                if (!(obj instanceof List)) {
                    B0.l("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.WebViewClient.onPageCommitVisible'.", "");
                    int i25 = C1026V.f11029c;
                } else {
                    List list8 = (List) obj;
                    if (list8.size() <= 1) {
                        int i26 = C1026V.f11029c;
                    } else {
                        Object obj16 = list8.get(0);
                        N3.h.c(obj16, "null cannot be cast to non-null type kotlin.String");
                        Object obj17 = list8.get(1);
                        N3.h.c(obj17, "null cannot be cast to non-null type kotlin.String");
                        i4.a.p(new C1030a((String) obj16, (String) obj17, (String) list8.get(2)));
                        int i27 = C1026V.f11029c;
                    }
                }
                break;
            case 10:
                if (!(obj instanceof List)) {
                    B0.l("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.WebViewClient.onReceivedRequestError'.", "");
                    int i28 = C1026V.f11029c;
                } else {
                    List list9 = (List) obj;
                    if (list9.size() <= 1) {
                        int i29 = C1026V.f11029c;
                    } else {
                        Object obj18 = list9.get(0);
                        N3.h.c(obj18, "null cannot be cast to non-null type kotlin.String");
                        Object obj19 = list9.get(1);
                        N3.h.c(obj19, "null cannot be cast to non-null type kotlin.String");
                        i4.a.p(new C1030a((String) obj18, (String) obj19, (String) list9.get(2)));
                        int i30 = C1026V.f11029c;
                    }
                }
                break;
            case 11:
                if (!(obj instanceof List)) {
                    B0.l("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.WebViewClient.onPageFinished'.", "");
                    int i31 = C1026V.f11029c;
                } else {
                    List list10 = (List) obj;
                    if (list10.size() <= 1) {
                        int i32 = C1026V.f11029c;
                    } else {
                        Object obj20 = list10.get(0);
                        N3.h.c(obj20, "null cannot be cast to non-null type kotlin.String");
                        Object obj21 = list10.get(1);
                        N3.h.c(obj21, "null cannot be cast to non-null type kotlin.String");
                        i4.a.p(new C1030a((String) obj20, (String) obj21, (String) list10.get(2)));
                        int i33 = C1026V.f11029c;
                    }
                }
                break;
            case 12:
                if (!(obj instanceof List)) {
                    B0.l("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.WebViewClient.onReceivedHttpAuthRequest'.", "");
                    int i34 = C1026V.f11029c;
                } else {
                    List list11 = (List) obj;
                    if (list11.size() <= 1) {
                        int i35 = C1026V.f11029c;
                    } else {
                        Object obj22 = list11.get(0);
                        N3.h.c(obj22, "null cannot be cast to non-null type kotlin.String");
                        Object obj23 = list11.get(1);
                        N3.h.c(obj23, "null cannot be cast to non-null type kotlin.String");
                        i4.a.p(new C1030a((String) obj22, (String) obj23, (String) list11.get(2)));
                        int i36 = C1026V.f11029c;
                    }
                }
                break;
            case 13:
                if (!(obj instanceof List)) {
                    B0.l("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.WebViewClient.onFormResubmission'.", "");
                    int i37 = C1026V.f11029c;
                } else {
                    List list12 = (List) obj;
                    if (list12.size() <= 1) {
                        int i38 = C1026V.f11029c;
                    } else {
                        Object obj24 = list12.get(0);
                        N3.h.c(obj24, "null cannot be cast to non-null type kotlin.String");
                        Object obj25 = list12.get(1);
                        N3.h.c(obj25, "null cannot be cast to non-null type kotlin.String");
                        i4.a.p(new C1030a((String) obj24, (String) obj25, (String) list12.get(2)));
                        int i39 = C1026V.f11029c;
                    }
                }
                break;
            case 14:
                if (!(obj instanceof List)) {
                    B0.l("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.WebViewClient.onReceivedSslError'.", "");
                    int i40 = C1026V.f11029c;
                } else {
                    List list13 = (List) obj;
                    if (list13.size() <= 1) {
                        int i41 = C1026V.f11029c;
                    } else {
                        Object obj26 = list13.get(0);
                        N3.h.c(obj26, "null cannot be cast to non-null type kotlin.String");
                        Object obj27 = list13.get(1);
                        N3.h.c(obj27, "null cannot be cast to non-null type kotlin.String");
                        i4.a.p(new C1030a((String) obj26, (String) obj27, (String) list13.get(2)));
                        int i42 = C1026V.f11029c;
                    }
                }
                break;
            case 15:
                if (!(obj instanceof List)) {
                    B0.l("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.WebViewClient.onScaleChanged'.", "");
                    int i43 = C1026V.f11029c;
                } else {
                    List list14 = (List) obj;
                    if (list14.size() <= 1) {
                        int i44 = C1026V.f11029c;
                    } else {
                        Object obj28 = list14.get(0);
                        N3.h.c(obj28, "null cannot be cast to non-null type kotlin.String");
                        Object obj29 = list14.get(1);
                        N3.h.c(obj29, "null cannot be cast to non-null type kotlin.String");
                        i4.a.p(new C1030a((String) obj28, (String) obj29, (String) list14.get(2)));
                        int i45 = C1026V.f11029c;
                    }
                }
                break;
            default:
                if (!(obj instanceof List)) {
                    B0.l("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.WebViewClient.doUpdateVisitedHistory'.", "");
                    int i46 = C1026V.f11029c;
                } else {
                    List list15 = (List) obj;
                    if (list15.size() <= 1) {
                        int i47 = C1026V.f11029c;
                    } else {
                        Object obj30 = list15.get(0);
                        N3.h.c(obj30, "null cannot be cast to non-null type kotlin.String");
                        Object obj31 = list15.get(1);
                        N3.h.c(obj31, "null cannot be cast to non-null type kotlin.String");
                        i4.a.p(new C1030a((String) obj30, (String) obj31, (String) list15.get(2)));
                        int i48 = C1026V.f11029c;
                    }
                }
                break;
        }
    }

    public /* synthetic */ C1013H(Object obj, int i) {
        this.f10984l = i;
    }
}

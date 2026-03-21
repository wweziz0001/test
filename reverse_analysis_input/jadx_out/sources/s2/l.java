package s2;

import D2.C0036h;
import D2.C0051x;
import D2.J;
import D2.r0;
import D2.u0;
import a.AbstractC0149a;
import a0.C0170V;
import android.net.http.SslError;
import android.os.Message;
import android.webkit.GeolocationPermissions;
import android.webkit.PermissionRequest;
import android.webkit.SslErrorHandler;
import android.webkit.WebChromeClient;
import com.google.crypto.tink.shaded.protobuf.AbstractC0329i;
import com.google.crypto.tink.shaded.protobuf.C0335o;
import d0.InterfaceC0351d;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.cert.Certificate;
import java.security.cert.CertificateEncodingException;
import java.util.List;
import java.util.Map;
import m.B0;
import m2.I;
import n3.InterfaceC0692b;
import n3.InterfaceC0693c;
import w2.C0946b;
import w2.C0947c;
import x0.F;
import x0.c0;
import x0.q0;
import y0.C1000h;
import y3.C1022Q;
import y3.C1030a;
import y3.EnumC1017L;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class l implements y2.b, l2.d, InterfaceC0351d, InterfaceC0692b, InterfaceC0693c {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f9653l;

    public /* synthetic */ l(int i) {
        this.f9653l = i;
    }

    private final r2.b a(y2.n nVar) throws GeneralSecurityException {
        j jVar;
        r2.o oVar = r2.o.f9548a;
        if (!((String) nVar.f10954a).equals("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key")) {
            throw new IllegalArgumentException("Wrong type URL in call to XChaCha20Poly1305Parameters.parseParameters");
        }
        try {
            u0 u0VarD = u0.D((AbstractC0329i) nVar.f10956c, C0335o.a());
            if (u0VarD.B() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            r0 r0Var = (r0) nVar.f10958e;
            int iOrdinal = r0Var.ordinal();
            if (iOrdinal == 1) {
                jVar = j.f9644w;
            } else if (iOrdinal == 2) {
                jVar = j.f9645x;
            } else if (iOrdinal == 3) {
                jVar = j.y;
            } else {
                if (iOrdinal != 4) {
                    throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + r0Var.b());
                }
                jVar = j.f9645x;
            }
            return C0789A.b(jVar, B0.d.e(u0VarD.A().j(), oVar), (Integer) nVar.f10959f);
        } catch (com.google.crypto.tink.shaded.protobuf.C unused) {
            throw new GeneralSecurityException("Parsing XChaCha20Poly1305Key failed");
        }
    }

    @Override // d0.InterfaceC0351d
    public void accept(Object obj) {
        ((c0) obj).f10663b.getClass();
    }

    @Override // l2.d
    public Object apply(Object obj) {
        switch (this.f9653l) {
            case O.j.STRING_SET_FIELD_NUMBER /* 6 */:
                return I.u(Integer.valueOf(((C1000h) obj).f10878l));
            case O.j.DOUBLE_FIELD_NUMBER /* 7 */:
            default:
                return Integer.valueOf(((C0170V) obj).f3263c);
            case O.j.BYTES_FIELD_NUMBER /* 8 */:
                F0.q qVar = (F0.q) obj;
                qVar.getClass();
                return qVar.getClass().getSimpleName();
            case 9:
                q0 q0VarE = ((F) obj).e();
                return I.p(m2.r.w(q0VarE.f10777b, new l(11)));
        }
    }

    @Override // y2.b
    public r2.b b(y2.n nVar) throws GeneralSecurityException {
        j jVar;
        switch (this.f9653l) {
            case 0:
                r2.o oVar = r2.o.f9548a;
                if (!((String) nVar.f10954a).equals("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to AesCtrHmacAeadProtoSerialization.parseKey");
                }
                try {
                    C0036h c0036hF = C0036h.F((AbstractC0329i) nVar.f10956c, C0335o.a());
                    if (c0036hF.D() != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    A.e eVar = new A.e();
                    eVar.f8m = null;
                    eVar.f9n = null;
                    eVar.f10o = null;
                    eVar.f11p = null;
                    j jVar2 = j.f9631j;
                    eVar.f12q = jVar2;
                    int size = c0036hF.B().C().size();
                    if (size != 16 && size != 24 && size != 32) {
                        throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 16-byte, 24-byte and 32-byte AES keys are supported", Integer.valueOf(size)));
                    }
                    eVar.f8m = Integer.valueOf(size);
                    int size2 = c0036hF.C().C().size();
                    if (size2 < 16) {
                        throw new InvalidAlgorithmParameterException(String.format("Invalid key size in bytes %d; HMAC key must be at least 16 bytes", Integer.valueOf(size2)));
                    }
                    eVar.f9n = Integer.valueOf(size2);
                    int iC = c0036hF.C().D().C();
                    if (iC < 10) {
                        throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; must be at least 10 bytes", Integer.valueOf(iC)));
                    }
                    eVar.f10o = Integer.valueOf(iC);
                    eVar.f11p = m.a(c0036hF.C().D().B());
                    r0 r0Var = (r0) nVar.f10958e;
                    int iOrdinal = r0Var.ordinal();
                    if (iOrdinal == 1) {
                        jVar2 = j.f9630h;
                    } else if (iOrdinal == 2) {
                        jVar2 = j.i;
                    } else if (iOrdinal != 3) {
                        if (iOrdinal != 4) {
                            throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + r0Var.b());
                        }
                        jVar2 = j.i;
                    }
                    eVar.f12q = jVar2;
                    k kVarC = eVar.c();
                    Z1.i iVar = new Z1.i();
                    iVar.f3013m = null;
                    iVar.f3014n = null;
                    iVar.f3015o = null;
                    iVar.f3012l = kVarC;
                    iVar.f3013m = B0.d.e(c0036hF.B().C().j(), oVar);
                    iVar.f3014n = B0.d.e(c0036hF.C().C().j(), oVar);
                    iVar.f3015o = (Integer) nVar.f10959f;
                    return iVar.e();
                } catch (com.google.crypto.tink.shaded.protobuf.C unused) {
                    throw new GeneralSecurityException("Parsing AesCtrHmacAeadKey failed");
                }
            case 1:
                r2.o oVar2 = r2.o.f9548a;
                if (!((String) nVar.f10954a).equals("type.googleapis.com/google.crypto.tink.AesEaxKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to AesEaxParameters.parseParameters");
                }
                try {
                    D2.r rVarF = D2.r.F((AbstractC0329i) nVar.f10956c, C0335o.a());
                    if (rVarF.D() != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    j jVar3 = j.f9634m;
                    int size3 = rVarF.B().size();
                    if (size3 != 16 && size3 != 24 && size3 != 32) {
                        throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 16-byte, 24-byte and 32-byte AES keys are supported", Integer.valueOf(size3)));
                    }
                    int iA = rVarF.C().A();
                    if (iA != 12 && iA != 16) {
                        throw new GeneralSecurityException(String.format("Invalid IV size in bytes %d; acceptable values have 12 or 16 bytes", Integer.valueOf(iA)));
                    }
                    r0 r0Var2 = (r0) nVar.f10958e;
                    int iOrdinal2 = r0Var2.ordinal();
                    if (iOrdinal2 == 1) {
                        jVar3 = j.f9632k;
                    } else if (iOrdinal2 == 2) {
                        jVar3 = j.f9633l;
                    } else if (iOrdinal2 != 3) {
                        if (iOrdinal2 != 4) {
                            throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + r0Var2.b());
                        }
                        jVar3 = j.f9633l;
                    }
                    o oVar3 = new o(size3, iA, 16, jVar3);
                    Z1.m mVar = new Z1.m(16);
                    mVar.f3025n = null;
                    mVar.f3026o = null;
                    mVar.f3024m = oVar3;
                    mVar.f3025n = B0.d.e(rVarF.B().j(), oVar2);
                    mVar.f3026o = (Integer) nVar.f10959f;
                    return mVar.i();
                } catch (com.google.crypto.tink.shaded.protobuf.C unused2) {
                    throw new GeneralSecurityException("Parsing AesEaxcKey failed");
                }
            case 2:
                r2.o oVar4 = r2.o.f9548a;
                if (!((String) nVar.f10954a).equals("type.googleapis.com/google.crypto.tink.AesGcmKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to AesGcmParameters.parseParameters");
                }
                try {
                    C0051x c0051xD = C0051x.D((AbstractC0329i) nVar.f10956c, C0335o.a());
                    if (c0051xD.B() != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    j jVar4 = j.f9637p;
                    int size4 = c0051xD.A().size();
                    if (size4 != 16 && size4 != 24 && size4 != 32) {
                        throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 16-byte, 24-byte and 32-byte AES keys are supported", Integer.valueOf(size4)));
                    }
                    r0 r0Var3 = (r0) nVar.f10958e;
                    int iOrdinal3 = r0Var3.ordinal();
                    if (iOrdinal3 == 1) {
                        jVar4 = j.f9635n;
                    } else if (iOrdinal3 == 2) {
                        jVar4 = j.f9636o;
                    } else if (iOrdinal3 != 3) {
                        if (iOrdinal3 != 4) {
                            throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + r0Var3.b());
                        }
                        jVar4 = j.f9636o;
                    }
                    r rVar = new r(size4, 12, 16, jVar4);
                    Z1.s sVar = new Z1.s(16, false);
                    sVar.f3086n = null;
                    sVar.f3087o = null;
                    sVar.f3085m = rVar;
                    sVar.f3086n = B0.d.e(c0051xD.A().j(), oVar4);
                    sVar.f3087o = (Integer) nVar.f10959f;
                    return sVar.s();
                } catch (com.google.crypto.tink.shaded.protobuf.C unused3) {
                    throw new GeneralSecurityException("Parsing AesGcmKey failed");
                }
            case 3:
                r2.o oVar5 = r2.o.f9548a;
                if (!((String) nVar.f10954a).equals("type.googleapis.com/google.crypto.tink.AesGcmSivKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to AesGcmSivParameters.parseParameters");
                }
                try {
                    D2.B bD = D2.B.D((AbstractC0329i) nVar.f10956c, C0335o.a());
                    if (bD.B() != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    j jVar5 = j.f9640s;
                    int size5 = bD.A().size();
                    if (size5 != 16 && size5 != 32) {
                        throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 16-byte and 32-byte AES keys are supported", Integer.valueOf(size5)));
                    }
                    r0 r0Var4 = (r0) nVar.f10958e;
                    int iOrdinal4 = r0Var4.ordinal();
                    if (iOrdinal4 == 1) {
                        jVar5 = j.f9638q;
                    } else if (iOrdinal4 == 2) {
                        jVar5 = j.f9639r;
                    } else if (iOrdinal4 != 3) {
                        if (iOrdinal4 != 4) {
                            throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + r0Var4.b());
                        }
                        jVar5 = j.f9639r;
                    }
                    u uVar = new u(size5, jVar5);
                    Z1.m mVar2 = new Z1.m(17);
                    mVar2.f3025n = null;
                    mVar2.f3026o = null;
                    mVar2.f3024m = uVar;
                    mVar2.f3025n = B0.d.e(bD.A().j(), oVar5);
                    mVar2.f3026o = (Integer) nVar.f10959f;
                    return mVar2.j();
                } catch (com.google.crypto.tink.shaded.protobuf.C unused4) {
                    throw new GeneralSecurityException("Parsing AesGcmSivKey failed");
                }
            case 4:
                r2.o oVar6 = r2.o.f9548a;
                if (!((String) nVar.f10954a).equals("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key")) {
                    throw new IllegalArgumentException("Wrong type URL in call to ChaCha20Poly1305Parameters.parseParameters");
                }
                try {
                    J jD = J.D((AbstractC0329i) nVar.f10956c, C0335o.a());
                    if (jD.B() != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    r0 r0Var5 = (r0) nVar.f10958e;
                    int iOrdinal5 = r0Var5.ordinal();
                    if (iOrdinal5 == 1) {
                        jVar = j.f9641t;
                    } else if (iOrdinal5 == 2) {
                        jVar = j.f9642u;
                    } else if (iOrdinal5 == 3) {
                        jVar = j.f9643v;
                    } else {
                        if (iOrdinal5 != 4) {
                            throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + r0Var5.b());
                        }
                        jVar = j.f9642u;
                    }
                    return w.b(jVar, B0.d.e(jD.A().j(), oVar6), (Integer) nVar.f10959f);
                } catch (com.google.crypto.tink.shaded.protobuf.C unused5) {
                    throw new GeneralSecurityException("Parsing ChaCha20Poly1305Key failed");
                }
            case 5:
                return a(nVar);
            default:
                r2.o oVar7 = r2.o.f9548a;
                if (!((String) nVar.f10954a).equals("type.googleapis.com/google.crypto.tink.AesSivKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to AesSivParameters.parseParameters");
                }
                try {
                    D2.F fD = D2.F.D((AbstractC0329i) nVar.f10956c, C0335o.a());
                    if (fD.B() != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    int size6 = fD.A().size();
                    if (size6 != 32 && size6 != 48 && size6 != 64) {
                        throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 32-byte, 48-byte and 64-byte AES-SIV keys are supported", Integer.valueOf(size6)));
                    }
                    r0 r0Var6 = (r0) nVar.f10958e;
                    Map map = w2.d.f10499e;
                    if (!map.containsKey(r0Var6)) {
                        throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + r0Var6.b());
                    }
                    C0946b c0946b = (C0946b) map.get(r0Var6);
                    if (c0946b == null) {
                        throw new GeneralSecurityException("Variant is not set");
                    }
                    C0947c c0947c = new C0947c(size6, c0946b);
                    Z1.s sVar2 = new Z1.s(18, false);
                    sVar2.f3086n = null;
                    sVar2.f3087o = null;
                    sVar2.f3085m = c0947c;
                    sVar2.f3086n = B0.d.e(fD.A().j(), oVar7);
                    sVar2.f3087o = (Integer) nVar.f10959f;
                    return sVar2.t();
                } catch (com.google.crypto.tink.shaded.protobuf.C unused6) {
                    throw new GeneralSecurityException("Parsing AesSivKey failed");
                }
        }
    }

    @Override // n3.InterfaceC0692b
    public void t(Object obj, Z1.l lVar) {
        List listQ;
        List listQ2;
        List listQ3;
        List listQ4;
        List listQ5;
        List listQ6;
        List listQ7;
        List listQ8;
        List listQ9;
        switch (this.f9653l) {
            case 12:
                N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                Object obj2 = ((List) obj).get(0);
                N3.h.c(obj2, "null cannot be cast to non-null type android.os.Message");
                try {
                    ((Message) obj2).sendToTarget();
                    listQ = AbstractC0149a.y(null);
                    break;
                } catch (Throwable th) {
                    listQ = Z1.f.Q(th);
                }
                lVar.u(listQ);
                return;
            case 13:
                N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                Object obj3 = ((List) obj).get(0);
                N3.h.c(obj3, "null cannot be cast to non-null type java.security.cert.Certificate");
                try {
                    try {
                        listQ2 = AbstractC0149a.y(((Certificate) obj3).getEncoded());
                    } catch (CertificateEncodingException e5) {
                        throw new RuntimeException(e5);
                    }
                } catch (Throwable th2) {
                    listQ2 = Z1.f.Q(th2);
                }
                lVar.u(listQ2);
                return;
            case 14:
                N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                Object obj4 = ((List) obj).get(0);
                N3.h.c(obj4, "null cannot be cast to non-null type android.webkit.WebChromeClient.CustomViewCallback");
                try {
                    ((WebChromeClient.CustomViewCallback) obj4).onCustomViewHidden();
                    listQ3 = AbstractC0149a.y(null);
                    break;
                } catch (Throwable th3) {
                    listQ3 = Z1.f.Q(th3);
                }
                lVar.u(listQ3);
                return;
            case 15:
            case 17:
            default:
                N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                Object obj5 = ((List) obj).get(0);
                N3.h.c(obj5, "null cannot be cast to non-null type android.webkit.SslErrorHandler");
                try {
                    ((SslErrorHandler) obj5).proceed();
                    listQ9 = AbstractC0149a.y(null);
                    break;
                } catch (Throwable th4) {
                    listQ9 = Z1.f.Q(th4);
                }
                lVar.u(listQ9);
                return;
            case 16:
                N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                List list = (List) obj;
                Object obj6 = list.get(0);
                N3.h.c(obj6, "null cannot be cast to non-null type android.webkit.GeolocationPermissions.Callback");
                GeolocationPermissions.Callback callback = (GeolocationPermissions.Callback) obj6;
                Object obj7 = list.get(1);
                N3.h.c(obj7, "null cannot be cast to non-null type kotlin.String");
                String str = (String) obj7;
                Object obj8 = list.get(2);
                N3.h.c(obj8, "null cannot be cast to non-null type kotlin.Boolean");
                boolean zBooleanValue = ((Boolean) obj8).booleanValue();
                Object obj9 = list.get(3);
                N3.h.c(obj9, "null cannot be cast to non-null type kotlin.Boolean");
                try {
                    callback.invoke(str, zBooleanValue, ((Boolean) obj9).booleanValue());
                    listQ4 = AbstractC0149a.y(null);
                    break;
                } catch (Throwable th5) {
                    listQ4 = Z1.f.Q(th5);
                }
                lVar.u(listQ4);
                return;
            case 18:
                N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                List list2 = (List) obj;
                Object obj10 = list2.get(0);
                N3.h.c(obj10, "null cannot be cast to non-null type android.webkit.PermissionRequest");
                PermissionRequest permissionRequest = (PermissionRequest) obj10;
                Object obj11 = list2.get(1);
                N3.h.c(obj11, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
                try {
                    permissionRequest.grant((String[]) ((List) obj11).toArray(new String[0]));
                    listQ5 = AbstractC0149a.y(null);
                    break;
                } catch (Throwable th6) {
                    listQ5 = Z1.f.Q(th6);
                }
                lVar.u(listQ5);
                return;
            case 19:
                N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                Object obj12 = ((List) obj).get(0);
                N3.h.c(obj12, "null cannot be cast to non-null type android.webkit.PermissionRequest");
                try {
                    ((PermissionRequest) obj12).deny();
                    listQ6 = AbstractC0149a.y(null);
                    break;
                } catch (Throwable th7) {
                    listQ6 = Z1.f.Q(th7);
                }
                lVar.u(listQ6);
                return;
            case 20:
                N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                Object obj13 = ((List) obj).get(0);
                N3.h.c(obj13, "null cannot be cast to non-null type android.net.http.SslError");
                try {
                    int primaryError = ((SslError) obj13).getPrimaryError();
                    listQ7 = AbstractC0149a.y(primaryError != 0 ? primaryError != 1 ? primaryError != 2 ? primaryError != 3 ? primaryError != 4 ? primaryError != 5 ? EnumC1017L.f10998t : EnumC1017L.f10995q : EnumC1017L.f10992n : EnumC1017L.f10997s : EnumC1017L.f10994p : EnumC1017L.f10993o : EnumC1017L.f10996r);
                    break;
                } catch (Throwable th8) {
                    listQ7 = Z1.f.Q(th8);
                }
                lVar.u(listQ7);
                return;
            case 21:
                N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                Object obj14 = ((List) obj).get(0);
                N3.h.c(obj14, "null cannot be cast to non-null type android.webkit.SslErrorHandler");
                try {
                    ((SslErrorHandler) obj14).cancel();
                    listQ8 = AbstractC0149a.y(null);
                    break;
                } catch (Throwable th9) {
                    listQ8 = Z1.f.Q(th9);
                }
                lVar.u(listQ8);
                return;
        }
    }

    @Override // n3.InterfaceC0693c
    public void u(Object obj) {
        switch (this.f9653l) {
            case 15:
                if (!(obj instanceof List)) {
                    B0.l("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.DownloadListener.onDownloadStart'.", "");
                } else {
                    List list = (List) obj;
                    if (list.size() > 1) {
                        Object obj2 = list.get(0);
                        N3.h.c(obj2, "null cannot be cast to non-null type kotlin.String");
                        Object obj3 = list.get(1);
                        N3.h.c(obj3, "null cannot be cast to non-null type kotlin.String");
                        i4.a.p(new C1030a((String) obj2, (String) obj3, (String) list.get(2)));
                    }
                }
                break;
            case 16:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            default:
                if (!(obj instanceof List)) {
                    B0.l("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.WebChromeClient.onGeolocationPermissionsHidePrompt'.", "");
                    int i = C1022Q.f11010h;
                } else {
                    List list2 = (List) obj;
                    if (list2.size() <= 1) {
                        int i5 = C1022Q.f11010h;
                    } else {
                        Object obj4 = list2.get(0);
                        N3.h.c(obj4, "null cannot be cast to non-null type kotlin.String");
                        Object obj5 = list2.get(1);
                        N3.h.c(obj5, "null cannot be cast to non-null type kotlin.String");
                        i4.a.p(new C1030a((String) obj4, (String) obj5, (String) list2.get(2)));
                        int i6 = C1022Q.f11010h;
                    }
                }
                break;
            case 17:
                if (!(obj instanceof List)) {
                    B0.l("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.JavaScriptChannel.postMessage'.", "");
                } else {
                    List list3 = (List) obj;
                    if (list3.size() > 1) {
                        Object obj6 = list3.get(0);
                        N3.h.c(obj6, "null cannot be cast to non-null type kotlin.String");
                        Object obj7 = list3.get(1);
                        N3.h.c(obj7, "null cannot be cast to non-null type kotlin.String");
                        i4.a.p(new C1030a((String) obj6, (String) obj7, (String) list3.get(2)));
                    }
                }
                break;
            case 23:
                if (!(obj instanceof List)) {
                    B0.l("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.WebChromeClient.onHideCustomView'.", "");
                    int i7 = C1022Q.f11010h;
                } else {
                    List list4 = (List) obj;
                    if (list4.size() <= 1) {
                        int i8 = C1022Q.f11010h;
                    } else {
                        Object obj8 = list4.get(0);
                        N3.h.c(obj8, "null cannot be cast to non-null type kotlin.String");
                        Object obj9 = list4.get(1);
                        N3.h.c(obj9, "null cannot be cast to non-null type kotlin.String");
                        i4.a.p(new C1030a((String) obj8, (String) obj9, (String) list4.get(2)));
                        int i9 = C1022Q.f11010h;
                    }
                }
                break;
            case 24:
                if (!(obj instanceof List)) {
                    B0.l("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.WebChromeClient.onProgressChanged'.", "");
                    int i10 = C1022Q.f11010h;
                } else {
                    List list5 = (List) obj;
                    if (list5.size() <= 1) {
                        int i11 = C1022Q.f11010h;
                    } else {
                        Object obj10 = list5.get(0);
                        N3.h.c(obj10, "null cannot be cast to non-null type kotlin.String");
                        Object obj11 = list5.get(1);
                        N3.h.c(obj11, "null cannot be cast to non-null type kotlin.String");
                        i4.a.p(new C1030a((String) obj10, (String) obj11, (String) list5.get(2)));
                        int i12 = C1022Q.f11010h;
                    }
                }
                break;
            case 25:
                if (!(obj instanceof List)) {
                    B0.l("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.WebChromeClient.onPermissionRequest'.", "");
                    int i13 = C1022Q.f11010h;
                } else {
                    List list6 = (List) obj;
                    if (list6.size() <= 1) {
                        int i14 = C1022Q.f11010h;
                    } else {
                        Object obj12 = list6.get(0);
                        N3.h.c(obj12, "null cannot be cast to non-null type kotlin.String");
                        Object obj13 = list6.get(1);
                        N3.h.c(obj13, "null cannot be cast to non-null type kotlin.String");
                        i4.a.p(new C1030a((String) obj12, (String) obj13, (String) list6.get(2)));
                        int i15 = C1022Q.f11010h;
                    }
                }
                break;
            case 26:
                if (!(obj instanceof List)) {
                    B0.l("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.WebChromeClient.onShowCustomView'.", "");
                    int i16 = C1022Q.f11010h;
                } else {
                    List list7 = (List) obj;
                    if (list7.size() <= 1) {
                        int i17 = C1022Q.f11010h;
                    } else {
                        Object obj14 = list7.get(0);
                        N3.h.c(obj14, "null cannot be cast to non-null type kotlin.String");
                        Object obj15 = list7.get(1);
                        N3.h.c(obj15, "null cannot be cast to non-null type kotlin.String");
                        i4.a.p(new C1030a((String) obj14, (String) obj15, (String) list7.get(2)));
                        int i18 = C1022Q.f11010h;
                    }
                }
                break;
            case 27:
                if (!(obj instanceof List)) {
                    B0.l("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.WebChromeClient.onConsoleMessage'.", "");
                    int i19 = C1022Q.f11010h;
                } else {
                    List list8 = (List) obj;
                    if (list8.size() <= 1) {
                        int i20 = C1022Q.f11010h;
                    } else {
                        Object obj16 = list8.get(0);
                        N3.h.c(obj16, "null cannot be cast to non-null type kotlin.String");
                        Object obj17 = list8.get(1);
                        N3.h.c(obj17, "null cannot be cast to non-null type kotlin.String");
                        i4.a.p(new C1030a((String) obj16, (String) obj17, (String) list8.get(2)));
                        int i21 = C1022Q.f11010h;
                    }
                }
                break;
            case 28:
                if (!(obj instanceof List)) {
                    B0.l("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.WebChromeClient.onGeolocationPermissionsShowPrompt'.", "");
                    int i22 = C1022Q.f11010h;
                } else {
                    List list9 = (List) obj;
                    if (list9.size() <= 1) {
                        int i23 = C1022Q.f11010h;
                    } else {
                        Object obj18 = list9.get(0);
                        N3.h.c(obj18, "null cannot be cast to non-null type kotlin.String");
                        Object obj19 = list9.get(1);
                        N3.h.c(obj19, "null cannot be cast to non-null type kotlin.String");
                        i4.a.p(new C1030a((String) obj18, (String) obj19, (String) list9.get(2)));
                        int i24 = C1022Q.f11010h;
                    }
                }
                break;
        }
    }

    public /* synthetic */ l(Object obj, int i) {
        this.f9653l = i;
    }
}

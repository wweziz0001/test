package a;

import A.e;
import A0.b;
import M3.p;
import N3.h;
import N3.s;
import O.j;
import Q.r;
import R3.c;
import V3.AbstractC0144v;
import V3.C0137n;
import Z1.i;
import a.AbstractC0149a;
import a0.AbstractC0156G;
import a0.C0189o;
import a0.C0190p;
import a0.C0200z;
import a4.t;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.ResolveInfo;
import android.content.pm.Signature;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.hardware.display.DisplayManager;
import android.media.MediaCodecInfo;
import android.net.Uri;
import android.net.http.SslCertificate;
import android.os.Build;
import android.os.Bundle;
import android.os.ParcelFileDescriptor;
import android.os.Process;
import android.os.StrictMode;
import android.text.InputFilter;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.method.TransformationMethod;
import android.util.Log;
import android.view.Display;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.webkit.DownloadListener;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.datastore.preferences.protobuf.C0215g;
import b3.AbstractC0307a;
import com.google.crypto.tink.shaded.protobuf.AbstractC0329i;
import defpackage.g;
import io.flutter.embedding.android.D;
import io.flutter.plugin.platform.n;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.security.GeneralSecurityException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import m.B0;
import m.C0603m0;
import m.T0;
import m.V0;
import m2.b0;
import n3.InterfaceC0692b;
import n3.InterfaceC0696f;
import n3.InterfaceC0703m;
import q0.o;
import q0.v;
import q0.y;
import y3.C1039j;

/* JADX INFO: renamed from: a.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0149a {
    public static int A(int i) {
        int i5 = i % 65536;
        return i5 >= 0 ? i5 : i5 + 65536;
    }

    public static void D(EditorInfo editorInfo, CharSequence charSequence, int i, int i5) {
        if (editorInfo.extras == null) {
            editorInfo.extras = new Bundle();
        }
        editorInfo.extras.putCharSequence("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SURROUNDING_TEXT", charSequence != null ? new SpannableStringBuilder(charSequence) : null);
        editorInfo.extras.putInt("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SELECTION_HEAD", i);
        editorInfo.extras.putInt("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SELECTION_END", i5);
    }

    public static void E(View view, CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 26) {
            T0.a(view, charSequence);
            return;
        }
        V0 v02 = V0.f8338v;
        if (v02 != null && v02.f8340l == view) {
            V0.b(null);
        }
        if (!TextUtils.isEmpty(charSequence)) {
            new V0(view, charSequence);
            return;
        }
        V0 v03 = V0.f8339w;
        if (v03 != null && v03.f8340l == view) {
            v03.a();
        }
        view.setOnLongClickListener(null);
        view.setLongClickable(false);
        view.setOnHoverListener(null);
    }

    public static void F(InterfaceC0696f interfaceC0696f, final C1039j c1039j) {
        e eVar;
        h.e(interfaceC0696f, "binaryMessenger");
        InterfaceC0703m gVar = (c1039j == null || (eVar = c1039j.f11068a) == null) ? new g(1) : eVar.e();
        i iVar = new i(interfaceC0696f, "dev.flutter.pigeon.webview_flutter_android.SslCertificate.getIssuedBy", gVar, (C0200z) null);
        if (c1039j != null) {
            final int i = 0;
            iVar.E(new InterfaceC0692b() { // from class: y3.B
                @Override // n3.InterfaceC0692b
                public final void t(Object obj, Z1.l lVar) {
                    List listQ;
                    List listQ2;
                    List listQ3;
                    List listQ4;
                    List listQ5;
                    X509Certificate x509Certificate;
                    switch (i) {
                        case 0:
                            C1039j c1039j2 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj2 = ((List) obj).get(0);
                            N3.h.c(obj2, "null cannot be cast to non-null type android.net.http.SslCertificate");
                            SslCertificate sslCertificate = (SslCertificate) obj2;
                            try {
                                c1039j2.getClass();
                                listQ = AbstractC0149a.y(sslCertificate.getIssuedBy());
                            } catch (Throwable th) {
                                listQ = Z1.f.Q(th);
                            }
                            lVar.u(listQ);
                            break;
                        case 1:
                            C1039j c1039j3 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj3 = ((List) obj).get(0);
                            N3.h.c(obj3, "null cannot be cast to non-null type android.net.http.SslCertificate");
                            SslCertificate sslCertificate2 = (SslCertificate) obj3;
                            try {
                                c1039j3.getClass();
                                listQ2 = AbstractC0149a.y(sslCertificate2.getIssuedTo());
                            } catch (Throwable th2) {
                                listQ2 = Z1.f.Q(th2);
                            }
                            lVar.u(listQ2);
                            break;
                        case 2:
                            C1039j c1039j4 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj4 = ((List) obj).get(0);
                            N3.h.c(obj4, "null cannot be cast to non-null type android.net.http.SslCertificate");
                            SslCertificate sslCertificate3 = (SslCertificate) obj4;
                            try {
                                c1039j4.getClass();
                                Date validNotAfterDate = sslCertificate3.getValidNotAfterDate();
                                listQ3 = AbstractC0149a.y(validNotAfterDate != null ? Long.valueOf(validNotAfterDate.getTime()) : null);
                            } catch (Throwable th3) {
                                listQ3 = Z1.f.Q(th3);
                            }
                            lVar.u(listQ3);
                            break;
                        case 3:
                            C1039j c1039j5 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj5 = ((List) obj).get(0);
                            N3.h.c(obj5, "null cannot be cast to non-null type android.net.http.SslCertificate");
                            SslCertificate sslCertificate4 = (SslCertificate) obj5;
                            try {
                                c1039j5.getClass();
                                Date validNotBeforeDate = sslCertificate4.getValidNotBeforeDate();
                                listQ4 = AbstractC0149a.y(validNotBeforeDate != null ? Long.valueOf(validNotBeforeDate.getTime()) : null);
                            } catch (Throwable th4) {
                                listQ4 = Z1.f.Q(th4);
                            }
                            lVar.u(listQ4);
                            break;
                        default:
                            C1039j c1039j6 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj6 = ((List) obj).get(0);
                            N3.h.c(obj6, "null cannot be cast to non-null type android.net.http.SslCertificate");
                            SslCertificate sslCertificate5 = (SslCertificate) obj6;
                            try {
                                c1039j6.f11068a.getClass();
                                if (Build.VERSION.SDK_INT >= 29) {
                                    x509Certificate = sslCertificate5.getX509Certificate();
                                } else {
                                    Log.d("SslCertificateProxyApi", "SslCertificate.getX509Certificate requires Build.VERSION_CODES.Q.");
                                    x509Certificate = null;
                                }
                                listQ5 = AbstractC0149a.y(x509Certificate);
                            } catch (Throwable th5) {
                                listQ5 = Z1.f.Q(th5);
                            }
                            lVar.u(listQ5);
                            break;
                    }
                }
            });
        } else {
            iVar.E(null);
        }
        i iVar2 = new i(interfaceC0696f, "dev.flutter.pigeon.webview_flutter_android.SslCertificate.getIssuedTo", gVar, (C0200z) null);
        if (c1039j != null) {
            final int i5 = 1;
            iVar2.E(new InterfaceC0692b() { // from class: y3.B
                @Override // n3.InterfaceC0692b
                public final void t(Object obj, Z1.l lVar) {
                    List listQ;
                    List listQ2;
                    List listQ3;
                    List listQ4;
                    List listQ5;
                    X509Certificate x509Certificate;
                    switch (i5) {
                        case 0:
                            C1039j c1039j2 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj2 = ((List) obj).get(0);
                            N3.h.c(obj2, "null cannot be cast to non-null type android.net.http.SslCertificate");
                            SslCertificate sslCertificate = (SslCertificate) obj2;
                            try {
                                c1039j2.getClass();
                                listQ = AbstractC0149a.y(sslCertificate.getIssuedBy());
                            } catch (Throwable th) {
                                listQ = Z1.f.Q(th);
                            }
                            lVar.u(listQ);
                            break;
                        case 1:
                            C1039j c1039j3 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj3 = ((List) obj).get(0);
                            N3.h.c(obj3, "null cannot be cast to non-null type android.net.http.SslCertificate");
                            SslCertificate sslCertificate2 = (SslCertificate) obj3;
                            try {
                                c1039j3.getClass();
                                listQ2 = AbstractC0149a.y(sslCertificate2.getIssuedTo());
                            } catch (Throwable th2) {
                                listQ2 = Z1.f.Q(th2);
                            }
                            lVar.u(listQ2);
                            break;
                        case 2:
                            C1039j c1039j4 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj4 = ((List) obj).get(0);
                            N3.h.c(obj4, "null cannot be cast to non-null type android.net.http.SslCertificate");
                            SslCertificate sslCertificate3 = (SslCertificate) obj4;
                            try {
                                c1039j4.getClass();
                                Date validNotAfterDate = sslCertificate3.getValidNotAfterDate();
                                listQ3 = AbstractC0149a.y(validNotAfterDate != null ? Long.valueOf(validNotAfterDate.getTime()) : null);
                            } catch (Throwable th3) {
                                listQ3 = Z1.f.Q(th3);
                            }
                            lVar.u(listQ3);
                            break;
                        case 3:
                            C1039j c1039j5 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj5 = ((List) obj).get(0);
                            N3.h.c(obj5, "null cannot be cast to non-null type android.net.http.SslCertificate");
                            SslCertificate sslCertificate4 = (SslCertificate) obj5;
                            try {
                                c1039j5.getClass();
                                Date validNotBeforeDate = sslCertificate4.getValidNotBeforeDate();
                                listQ4 = AbstractC0149a.y(validNotBeforeDate != null ? Long.valueOf(validNotBeforeDate.getTime()) : null);
                            } catch (Throwable th4) {
                                listQ4 = Z1.f.Q(th4);
                            }
                            lVar.u(listQ4);
                            break;
                        default:
                            C1039j c1039j6 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj6 = ((List) obj).get(0);
                            N3.h.c(obj6, "null cannot be cast to non-null type android.net.http.SslCertificate");
                            SslCertificate sslCertificate5 = (SslCertificate) obj6;
                            try {
                                c1039j6.f11068a.getClass();
                                if (Build.VERSION.SDK_INT >= 29) {
                                    x509Certificate = sslCertificate5.getX509Certificate();
                                } else {
                                    Log.d("SslCertificateProxyApi", "SslCertificate.getX509Certificate requires Build.VERSION_CODES.Q.");
                                    x509Certificate = null;
                                }
                                listQ5 = AbstractC0149a.y(x509Certificate);
                            } catch (Throwable th5) {
                                listQ5 = Z1.f.Q(th5);
                            }
                            lVar.u(listQ5);
                            break;
                    }
                }
            });
        } else {
            iVar2.E(null);
        }
        i iVar3 = new i(interfaceC0696f, "dev.flutter.pigeon.webview_flutter_android.SslCertificate.getValidNotAfterMsSinceEpoch", gVar, (C0200z) null);
        if (c1039j != null) {
            final int i6 = 2;
            iVar3.E(new InterfaceC0692b() { // from class: y3.B
                @Override // n3.InterfaceC0692b
                public final void t(Object obj, Z1.l lVar) {
                    List listQ;
                    List listQ2;
                    List listQ3;
                    List listQ4;
                    List listQ5;
                    X509Certificate x509Certificate;
                    switch (i6) {
                        case 0:
                            C1039j c1039j2 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj2 = ((List) obj).get(0);
                            N3.h.c(obj2, "null cannot be cast to non-null type android.net.http.SslCertificate");
                            SslCertificate sslCertificate = (SslCertificate) obj2;
                            try {
                                c1039j2.getClass();
                                listQ = AbstractC0149a.y(sslCertificate.getIssuedBy());
                            } catch (Throwable th) {
                                listQ = Z1.f.Q(th);
                            }
                            lVar.u(listQ);
                            break;
                        case 1:
                            C1039j c1039j3 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj3 = ((List) obj).get(0);
                            N3.h.c(obj3, "null cannot be cast to non-null type android.net.http.SslCertificate");
                            SslCertificate sslCertificate2 = (SslCertificate) obj3;
                            try {
                                c1039j3.getClass();
                                listQ2 = AbstractC0149a.y(sslCertificate2.getIssuedTo());
                            } catch (Throwable th2) {
                                listQ2 = Z1.f.Q(th2);
                            }
                            lVar.u(listQ2);
                            break;
                        case 2:
                            C1039j c1039j4 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj4 = ((List) obj).get(0);
                            N3.h.c(obj4, "null cannot be cast to non-null type android.net.http.SslCertificate");
                            SslCertificate sslCertificate3 = (SslCertificate) obj4;
                            try {
                                c1039j4.getClass();
                                Date validNotAfterDate = sslCertificate3.getValidNotAfterDate();
                                listQ3 = AbstractC0149a.y(validNotAfterDate != null ? Long.valueOf(validNotAfterDate.getTime()) : null);
                            } catch (Throwable th3) {
                                listQ3 = Z1.f.Q(th3);
                            }
                            lVar.u(listQ3);
                            break;
                        case 3:
                            C1039j c1039j5 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj5 = ((List) obj).get(0);
                            N3.h.c(obj5, "null cannot be cast to non-null type android.net.http.SslCertificate");
                            SslCertificate sslCertificate4 = (SslCertificate) obj5;
                            try {
                                c1039j5.getClass();
                                Date validNotBeforeDate = sslCertificate4.getValidNotBeforeDate();
                                listQ4 = AbstractC0149a.y(validNotBeforeDate != null ? Long.valueOf(validNotBeforeDate.getTime()) : null);
                            } catch (Throwable th4) {
                                listQ4 = Z1.f.Q(th4);
                            }
                            lVar.u(listQ4);
                            break;
                        default:
                            C1039j c1039j6 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj6 = ((List) obj).get(0);
                            N3.h.c(obj6, "null cannot be cast to non-null type android.net.http.SslCertificate");
                            SslCertificate sslCertificate5 = (SslCertificate) obj6;
                            try {
                                c1039j6.f11068a.getClass();
                                if (Build.VERSION.SDK_INT >= 29) {
                                    x509Certificate = sslCertificate5.getX509Certificate();
                                } else {
                                    Log.d("SslCertificateProxyApi", "SslCertificate.getX509Certificate requires Build.VERSION_CODES.Q.");
                                    x509Certificate = null;
                                }
                                listQ5 = AbstractC0149a.y(x509Certificate);
                            } catch (Throwable th5) {
                                listQ5 = Z1.f.Q(th5);
                            }
                            lVar.u(listQ5);
                            break;
                    }
                }
            });
        } else {
            iVar3.E(null);
        }
        i iVar4 = new i(interfaceC0696f, "dev.flutter.pigeon.webview_flutter_android.SslCertificate.getValidNotBeforeMsSinceEpoch", gVar, (C0200z) null);
        if (c1039j != null) {
            final int i7 = 3;
            iVar4.E(new InterfaceC0692b() { // from class: y3.B
                @Override // n3.InterfaceC0692b
                public final void t(Object obj, Z1.l lVar) {
                    List listQ;
                    List listQ2;
                    List listQ3;
                    List listQ4;
                    List listQ5;
                    X509Certificate x509Certificate;
                    switch (i7) {
                        case 0:
                            C1039j c1039j2 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj2 = ((List) obj).get(0);
                            N3.h.c(obj2, "null cannot be cast to non-null type android.net.http.SslCertificate");
                            SslCertificate sslCertificate = (SslCertificate) obj2;
                            try {
                                c1039j2.getClass();
                                listQ = AbstractC0149a.y(sslCertificate.getIssuedBy());
                            } catch (Throwable th) {
                                listQ = Z1.f.Q(th);
                            }
                            lVar.u(listQ);
                            break;
                        case 1:
                            C1039j c1039j3 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj3 = ((List) obj).get(0);
                            N3.h.c(obj3, "null cannot be cast to non-null type android.net.http.SslCertificate");
                            SslCertificate sslCertificate2 = (SslCertificate) obj3;
                            try {
                                c1039j3.getClass();
                                listQ2 = AbstractC0149a.y(sslCertificate2.getIssuedTo());
                            } catch (Throwable th2) {
                                listQ2 = Z1.f.Q(th2);
                            }
                            lVar.u(listQ2);
                            break;
                        case 2:
                            C1039j c1039j4 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj4 = ((List) obj).get(0);
                            N3.h.c(obj4, "null cannot be cast to non-null type android.net.http.SslCertificate");
                            SslCertificate sslCertificate3 = (SslCertificate) obj4;
                            try {
                                c1039j4.getClass();
                                Date validNotAfterDate = sslCertificate3.getValidNotAfterDate();
                                listQ3 = AbstractC0149a.y(validNotAfterDate != null ? Long.valueOf(validNotAfterDate.getTime()) : null);
                            } catch (Throwable th3) {
                                listQ3 = Z1.f.Q(th3);
                            }
                            lVar.u(listQ3);
                            break;
                        case 3:
                            C1039j c1039j5 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj5 = ((List) obj).get(0);
                            N3.h.c(obj5, "null cannot be cast to non-null type android.net.http.SslCertificate");
                            SslCertificate sslCertificate4 = (SslCertificate) obj5;
                            try {
                                c1039j5.getClass();
                                Date validNotBeforeDate = sslCertificate4.getValidNotBeforeDate();
                                listQ4 = AbstractC0149a.y(validNotBeforeDate != null ? Long.valueOf(validNotBeforeDate.getTime()) : null);
                            } catch (Throwable th4) {
                                listQ4 = Z1.f.Q(th4);
                            }
                            lVar.u(listQ4);
                            break;
                        default:
                            C1039j c1039j6 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj6 = ((List) obj).get(0);
                            N3.h.c(obj6, "null cannot be cast to non-null type android.net.http.SslCertificate");
                            SslCertificate sslCertificate5 = (SslCertificate) obj6;
                            try {
                                c1039j6.f11068a.getClass();
                                if (Build.VERSION.SDK_INT >= 29) {
                                    x509Certificate = sslCertificate5.getX509Certificate();
                                } else {
                                    Log.d("SslCertificateProxyApi", "SslCertificate.getX509Certificate requires Build.VERSION_CODES.Q.");
                                    x509Certificate = null;
                                }
                                listQ5 = AbstractC0149a.y(x509Certificate);
                            } catch (Throwable th5) {
                                listQ5 = Z1.f.Q(th5);
                            }
                            lVar.u(listQ5);
                            break;
                    }
                }
            });
        } else {
            iVar4.E(null);
        }
        i iVar5 = new i(interfaceC0696f, "dev.flutter.pigeon.webview_flutter_android.SslCertificate.getX509Certificate", gVar, (C0200z) null);
        if (c1039j == null) {
            iVar5.E(null);
        } else {
            final int i8 = 4;
            iVar5.E(new InterfaceC0692b() { // from class: y3.B
                @Override // n3.InterfaceC0692b
                public final void t(Object obj, Z1.l lVar) {
                    List listQ;
                    List listQ2;
                    List listQ3;
                    List listQ4;
                    List listQ5;
                    X509Certificate x509Certificate;
                    switch (i8) {
                        case 0:
                            C1039j c1039j2 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj2 = ((List) obj).get(0);
                            N3.h.c(obj2, "null cannot be cast to non-null type android.net.http.SslCertificate");
                            SslCertificate sslCertificate = (SslCertificate) obj2;
                            try {
                                c1039j2.getClass();
                                listQ = AbstractC0149a.y(sslCertificate.getIssuedBy());
                            } catch (Throwable th) {
                                listQ = Z1.f.Q(th);
                            }
                            lVar.u(listQ);
                            break;
                        case 1:
                            C1039j c1039j3 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj3 = ((List) obj).get(0);
                            N3.h.c(obj3, "null cannot be cast to non-null type android.net.http.SslCertificate");
                            SslCertificate sslCertificate2 = (SslCertificate) obj3;
                            try {
                                c1039j3.getClass();
                                listQ2 = AbstractC0149a.y(sslCertificate2.getIssuedTo());
                            } catch (Throwable th2) {
                                listQ2 = Z1.f.Q(th2);
                            }
                            lVar.u(listQ2);
                            break;
                        case 2:
                            C1039j c1039j4 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj4 = ((List) obj).get(0);
                            N3.h.c(obj4, "null cannot be cast to non-null type android.net.http.SslCertificate");
                            SslCertificate sslCertificate3 = (SslCertificate) obj4;
                            try {
                                c1039j4.getClass();
                                Date validNotAfterDate = sslCertificate3.getValidNotAfterDate();
                                listQ3 = AbstractC0149a.y(validNotAfterDate != null ? Long.valueOf(validNotAfterDate.getTime()) : null);
                            } catch (Throwable th3) {
                                listQ3 = Z1.f.Q(th3);
                            }
                            lVar.u(listQ3);
                            break;
                        case 3:
                            C1039j c1039j5 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj5 = ((List) obj).get(0);
                            N3.h.c(obj5, "null cannot be cast to non-null type android.net.http.SslCertificate");
                            SslCertificate sslCertificate4 = (SslCertificate) obj5;
                            try {
                                c1039j5.getClass();
                                Date validNotBeforeDate = sslCertificate4.getValidNotBeforeDate();
                                listQ4 = AbstractC0149a.y(validNotBeforeDate != null ? Long.valueOf(validNotBeforeDate.getTime()) : null);
                            } catch (Throwable th4) {
                                listQ4 = Z1.f.Q(th4);
                            }
                            lVar.u(listQ4);
                            break;
                        default:
                            C1039j c1039j6 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj6 = ((List) obj).get(0);
                            N3.h.c(obj6, "null cannot be cast to non-null type android.net.http.SslCertificate");
                            SslCertificate sslCertificate5 = (SslCertificate) obj6;
                            try {
                                c1039j6.f11068a.getClass();
                                if (Build.VERSION.SDK_INT >= 29) {
                                    x509Certificate = sslCertificate5.getX509Certificate();
                                } else {
                                    Log.d("SslCertificateProxyApi", "SslCertificate.getX509Certificate requires Build.VERSION_CODES.Q.");
                                    x509Certificate = null;
                                }
                                listQ5 = AbstractC0149a.y(x509Certificate);
                            } catch (Throwable th5) {
                                listQ5 = Z1.f.Q(th5);
                            }
                            lVar.u(listQ5);
                            break;
                    }
                }
            });
        }
    }

    public static void G(InterfaceC0696f interfaceC0696f, final C1039j c1039j) {
        e eVar;
        h.e(interfaceC0696f, "binaryMessenger");
        InterfaceC0703m gVar = (c1039j == null || (eVar = c1039j.f11068a) == null) ? new g(1) : eVar.e();
        i iVar = new i(interfaceC0696f, "dev.flutter.pigeon.webview_flutter_android.WebView.pigeon_defaultConstructor", gVar, (C0200z) null);
        if (c1039j != null) {
            final int i = 0;
            iVar.E(new InterfaceC0692b() { // from class: y3.I
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
                    List listQ18;
                    List listQ19;
                    List listQ20;
                    List listQ21;
                    List listQ22;
                    switch (i) {
                        case 0:
                            C1039j c1039j2 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj2 = ((List) obj).get(0);
                            N3.h.c(obj2, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((C1032c) c1039j2.f11068a.f9n).a(((Long) obj2).longValue(), c1039j2.a());
                                listQ = AbstractC0149a.y(null);
                            } catch (Throwable th) {
                                listQ = Z1.f.Q(th);
                            }
                            lVar.u(listQ);
                            break;
                        case 1:
                            C1039j c1039j3 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj3 = list.get(0);
                            N3.h.c(obj3, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView = (WebView) obj3;
                            DownloadListener downloadListener = (DownloadListener) list.get(1);
                            try {
                                c1039j3.getClass();
                                webView.setDownloadListener(downloadListener);
                                listQ2 = AbstractC0149a.y(null);
                            } catch (Throwable th2) {
                                listQ2 = Z1.f.Q(th2);
                            }
                            lVar.u(listQ2);
                            break;
                        case 2:
                            C1039j c1039j4 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj;
                            Object obj4 = list2.get(0);
                            N3.h.c(obj4, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView2 = (WebView) obj4;
                            Object obj5 = list2.get(1);
                            N3.h.c(obj5, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((C1032c) c1039j4.f11068a.f9n).a(((Long) obj5).longValue(), webView2.getSettings());
                                listQ3 = AbstractC0149a.y(null);
                            } catch (Throwable th3) {
                                listQ3 = Z1.f.Q(th3);
                            }
                            lVar.u(listQ3);
                            break;
                        case 3:
                            C1039j c1039j5 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj;
                            Object obj6 = list3.get(0);
                            N3.h.c(obj6, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView3 = (WebView) obj6;
                            C1022Q c1022q = (C1022Q) list3.get(1);
                            try {
                                c1039j5.getClass();
                                webView3.setWebChromeClient(c1022q);
                                listQ4 = AbstractC0149a.y(null);
                            } catch (Throwable th4) {
                                listQ4 = Z1.f.Q(th4);
                            }
                            lVar.u(listQ4);
                            break;
                        case 4:
                            C1039j c1039j6 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj;
                            Object obj7 = list4.get(0);
                            N3.h.c(obj7, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView4 = (WebView) obj7;
                            Object obj8 = list4.get(1);
                            N3.h.c(obj8, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue = ((Long) obj8).longValue();
                            try {
                                c1039j6.getClass();
                                webView4.setBackgroundColor((int) jLongValue);
                                listQ5 = AbstractC0149a.y(null);
                            } catch (Throwable th5) {
                                listQ5 = Z1.f.Q(th5);
                            }
                            lVar.u(listQ5);
                            break;
                        case 5:
                            C1039j c1039j7 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj9 = ((List) obj).get(0);
                            N3.h.c(obj9, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView5 = (WebView) obj9;
                            try {
                                c1039j7.getClass();
                                webView5.destroy();
                                listQ6 = AbstractC0149a.y(null);
                            } catch (Throwable th6) {
                                listQ6 = Z1.f.Q(th6);
                            }
                            lVar.u(listQ6);
                            break;
                        case O.j.STRING_SET_FIELD_NUMBER /* 6 */:
                            C1039j c1039j8 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj;
                            Object obj10 = list5.get(0);
                            N3.h.c(obj10, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView6 = (WebView) obj10;
                            Object obj11 = list5.get(1);
                            N3.h.c(obj11, "null cannot be cast to non-null type kotlin.String");
                            String str = (String) obj11;
                            String str2 = (String) list5.get(2);
                            String str3 = (String) list5.get(3);
                            try {
                                c1039j8.getClass();
                                webView6.loadData(str, str2, str3);
                                listQ7 = AbstractC0149a.y(null);
                            } catch (Throwable th7) {
                                listQ7 = Z1.f.Q(th7);
                            }
                            lVar.u(listQ7);
                            break;
                        case O.j.DOUBLE_FIELD_NUMBER /* 7 */:
                            C1039j c1039j9 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj;
                            Object obj12 = list6.get(0);
                            N3.h.c(obj12, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView7 = (WebView) obj12;
                            String str4 = (String) list6.get(1);
                            Object obj13 = list6.get(2);
                            N3.h.c(obj13, "null cannot be cast to non-null type kotlin.String");
                            String str5 = (String) obj13;
                            String str6 = (String) list6.get(3);
                            String str7 = (String) list6.get(4);
                            String str8 = (String) list6.get(5);
                            try {
                                c1039j9.getClass();
                                webView7.loadDataWithBaseURL(str4, str5, str6, str7, str8);
                                listQ8 = AbstractC0149a.y(null);
                            } catch (Throwable th8) {
                                listQ8 = Z1.f.Q(th8);
                            }
                            lVar.u(listQ8);
                            break;
                        case O.j.BYTES_FIELD_NUMBER /* 8 */:
                            C1039j c1039j10 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj;
                            Object obj14 = list7.get(0);
                            N3.h.c(obj14, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView8 = (WebView) obj14;
                            Object obj15 = list7.get(1);
                            N3.h.c(obj15, "null cannot be cast to non-null type kotlin.String");
                            String str9 = (String) obj15;
                            Object obj16 = list7.get(2);
                            N3.h.c(obj16, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.String>");
                            Map<String, String> map = (Map) obj16;
                            try {
                                c1039j10.getClass();
                                webView8.loadUrl(str9, map);
                                listQ9 = AbstractC0149a.y(null);
                            } catch (Throwable th9) {
                                listQ9 = Z1.f.Q(th9);
                            }
                            lVar.u(listQ9);
                            break;
                        case 9:
                            C1039j c1039j11 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj;
                            Object obj17 = list8.get(0);
                            N3.h.c(obj17, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView9 = (WebView) obj17;
                            Object obj18 = list8.get(1);
                            N3.h.c(obj18, "null cannot be cast to non-null type kotlin.String");
                            String str10 = (String) obj18;
                            Object obj19 = list8.get(2);
                            N3.h.c(obj19, "null cannot be cast to non-null type kotlin.ByteArray");
                            byte[] bArr = (byte[]) obj19;
                            try {
                                c1039j11.getClass();
                                webView9.postUrl(str10, bArr);
                                listQ10 = AbstractC0149a.y(null);
                            } catch (Throwable th10) {
                                listQ10 = Z1.f.Q(th10);
                            }
                            lVar.u(listQ10);
                            break;
                        case 10:
                            C1039j c1039j12 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj20 = ((List) obj).get(0);
                            N3.h.c(obj20, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView10 = (WebView) obj20;
                            try {
                                c1039j12.getClass();
                                listQ11 = AbstractC0149a.y(webView10.getUrl());
                            } catch (Throwable th11) {
                                listQ11 = Z1.f.Q(th11);
                            }
                            lVar.u(listQ11);
                            break;
                        case 11:
                            C1039j c1039j13 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj21 = ((List) obj).get(0);
                            N3.h.c(obj21, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView11 = (WebView) obj21;
                            try {
                                c1039j13.getClass();
                                webView11.goForward();
                                listQ12 = AbstractC0149a.y(null);
                            } catch (Throwable th12) {
                                listQ12 = Z1.f.Q(th12);
                            }
                            lVar.u(listQ12);
                            break;
                        case 12:
                            C1039j c1039j14 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj22 = ((List) obj).get(0);
                            N3.h.c(obj22, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView12 = (WebView) obj22;
                            try {
                                c1039j14.getClass();
                                listQ13 = AbstractC0149a.y(Boolean.valueOf(webView12.canGoBack()));
                            } catch (Throwable th13) {
                                listQ13 = Z1.f.Q(th13);
                            }
                            lVar.u(listQ13);
                            break;
                        case 13:
                            C1039j c1039j15 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj23 = ((List) obj).get(0);
                            N3.h.c(obj23, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView13 = (WebView) obj23;
                            try {
                                c1039j15.getClass();
                                listQ14 = AbstractC0149a.y(Boolean.valueOf(webView13.canGoForward()));
                            } catch (Throwable th14) {
                                listQ14 = Z1.f.Q(th14);
                            }
                            lVar.u(listQ14);
                            break;
                        case 14:
                            C1039j c1039j16 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj24 = ((List) obj).get(0);
                            N3.h.c(obj24, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView14 = (WebView) obj24;
                            try {
                                c1039j16.getClass();
                                webView14.goBack();
                                listQ15 = AbstractC0149a.y(null);
                            } catch (Throwable th15) {
                                listQ15 = Z1.f.Q(th15);
                            }
                            lVar.u(listQ15);
                            break;
                        case 15:
                            C1039j c1039j17 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj25 = ((List) obj).get(0);
                            N3.h.c(obj25, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView15 = (WebView) obj25;
                            try {
                                c1039j17.getClass();
                                webView15.reload();
                                listQ16 = AbstractC0149a.y(null);
                            } catch (Throwable th16) {
                                listQ16 = Z1.f.Q(th16);
                            }
                            lVar.u(listQ16);
                            break;
                        case 16:
                            C1039j c1039j18 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj;
                            Object obj26 = list9.get(0);
                            N3.h.c(obj26, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView16 = (WebView) obj26;
                            Object obj27 = list9.get(1);
                            N3.h.c(obj27, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue = ((Boolean) obj27).booleanValue();
                            try {
                                c1039j18.getClass();
                                webView16.clearCache(zBooleanValue);
                                listQ17 = AbstractC0149a.y(null);
                            } catch (Throwable th17) {
                                listQ17 = Z1.f.Q(th17);
                            }
                            lVar.u(listQ17);
                            break;
                        case 17:
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj;
                            Object obj28 = list10.get(0);
                            N3.h.c(obj28, "null cannot be cast to non-null type android.webkit.WebView");
                            Object obj29 = list10.get(1);
                            N3.h.c(obj29, "null cannot be cast to non-null type kotlin.String");
                            C1054y c1054y = new C1054y(lVar, 1);
                            c1039j.getClass();
                            ((WebView) obj28).evaluateJavascript((String) obj29, new C1042m(1, c1054y));
                            break;
                        case 18:
                            C1039j c1039j19 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj30 = ((List) obj).get(0);
                            N3.h.c(obj30, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView17 = (WebView) obj30;
                            try {
                                c1039j19.getClass();
                                listQ18 = AbstractC0149a.y(webView17.getTitle());
                            } catch (Throwable th18) {
                                listQ18 = Z1.f.Q(th18);
                            }
                            lVar.u(listQ18);
                            break;
                        case 19:
                            C1039j c1039j20 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj31 = ((List) obj).get(0);
                            N3.h.c(obj31, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue2 = ((Boolean) obj31).booleanValue();
                            try {
                                c1039j20.getClass();
                                WebView.setWebContentsDebuggingEnabled(zBooleanValue2);
                                listQ19 = AbstractC0149a.y(null);
                            } catch (Throwable th19) {
                                listQ19 = Z1.f.Q(th19);
                            }
                            lVar.u(listQ19);
                            break;
                        case 20:
                            C1039j c1039j21 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj;
                            Object obj32 = list11.get(0);
                            N3.h.c(obj32, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView18 = (WebView) obj32;
                            WebViewClient webViewClient = (WebViewClient) list11.get(1);
                            try {
                                c1039j21.getClass();
                                webView18.setWebViewClient(webViewClient);
                                listQ20 = AbstractC0149a.y(null);
                            } catch (Throwable th20) {
                                listQ20 = Z1.f.Q(th20);
                            }
                            lVar.u(listQ20);
                            break;
                        case 21:
                            C1039j c1039j22 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list12 = (List) obj;
                            Object obj33 = list12.get(0);
                            N3.h.c(obj33, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView19 = (WebView) obj33;
                            Object obj34 = list12.get(1);
                            N3.h.c(obj34, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.JavaScriptChannel");
                            C1048s c1048s = (C1048s) obj34;
                            try {
                                c1039j22.getClass();
                                webView19.addJavascriptInterface(c1048s, c1048s.f11098a);
                                listQ21 = AbstractC0149a.y(null);
                            } catch (Throwable th21) {
                                listQ21 = Z1.f.Q(th21);
                            }
                            lVar.u(listQ21);
                            break;
                        default:
                            C1039j c1039j23 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj;
                            Object obj35 = list13.get(0);
                            N3.h.c(obj35, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView20 = (WebView) obj35;
                            Object obj36 = list13.get(1);
                            N3.h.c(obj36, "null cannot be cast to non-null type kotlin.String");
                            String str11 = (String) obj36;
                            try {
                                c1039j23.getClass();
                                webView20.removeJavascriptInterface(str11);
                                listQ22 = AbstractC0149a.y(null);
                            } catch (Throwable th22) {
                                listQ22 = Z1.f.Q(th22);
                            }
                            lVar.u(listQ22);
                            break;
                    }
                }
            });
        } else {
            iVar.E(null);
        }
        i iVar2 = new i(interfaceC0696f, "dev.flutter.pigeon.webview_flutter_android.WebView.settings", gVar, (C0200z) null);
        if (c1039j != null) {
            final int i5 = 2;
            iVar2.E(new InterfaceC0692b() { // from class: y3.I
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
                    List listQ18;
                    List listQ19;
                    List listQ20;
                    List listQ21;
                    List listQ22;
                    switch (i5) {
                        case 0:
                            C1039j c1039j2 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj2 = ((List) obj).get(0);
                            N3.h.c(obj2, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((C1032c) c1039j2.f11068a.f9n).a(((Long) obj2).longValue(), c1039j2.a());
                                listQ = AbstractC0149a.y(null);
                            } catch (Throwable th) {
                                listQ = Z1.f.Q(th);
                            }
                            lVar.u(listQ);
                            break;
                        case 1:
                            C1039j c1039j3 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj3 = list.get(0);
                            N3.h.c(obj3, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView = (WebView) obj3;
                            DownloadListener downloadListener = (DownloadListener) list.get(1);
                            try {
                                c1039j3.getClass();
                                webView.setDownloadListener(downloadListener);
                                listQ2 = AbstractC0149a.y(null);
                            } catch (Throwable th2) {
                                listQ2 = Z1.f.Q(th2);
                            }
                            lVar.u(listQ2);
                            break;
                        case 2:
                            C1039j c1039j4 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj;
                            Object obj4 = list2.get(0);
                            N3.h.c(obj4, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView2 = (WebView) obj4;
                            Object obj5 = list2.get(1);
                            N3.h.c(obj5, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((C1032c) c1039j4.f11068a.f9n).a(((Long) obj5).longValue(), webView2.getSettings());
                                listQ3 = AbstractC0149a.y(null);
                            } catch (Throwable th3) {
                                listQ3 = Z1.f.Q(th3);
                            }
                            lVar.u(listQ3);
                            break;
                        case 3:
                            C1039j c1039j5 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj;
                            Object obj6 = list3.get(0);
                            N3.h.c(obj6, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView3 = (WebView) obj6;
                            C1022Q c1022q = (C1022Q) list3.get(1);
                            try {
                                c1039j5.getClass();
                                webView3.setWebChromeClient(c1022q);
                                listQ4 = AbstractC0149a.y(null);
                            } catch (Throwable th4) {
                                listQ4 = Z1.f.Q(th4);
                            }
                            lVar.u(listQ4);
                            break;
                        case 4:
                            C1039j c1039j6 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj;
                            Object obj7 = list4.get(0);
                            N3.h.c(obj7, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView4 = (WebView) obj7;
                            Object obj8 = list4.get(1);
                            N3.h.c(obj8, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue = ((Long) obj8).longValue();
                            try {
                                c1039j6.getClass();
                                webView4.setBackgroundColor((int) jLongValue);
                                listQ5 = AbstractC0149a.y(null);
                            } catch (Throwable th5) {
                                listQ5 = Z1.f.Q(th5);
                            }
                            lVar.u(listQ5);
                            break;
                        case 5:
                            C1039j c1039j7 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj9 = ((List) obj).get(0);
                            N3.h.c(obj9, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView5 = (WebView) obj9;
                            try {
                                c1039j7.getClass();
                                webView5.destroy();
                                listQ6 = AbstractC0149a.y(null);
                            } catch (Throwable th6) {
                                listQ6 = Z1.f.Q(th6);
                            }
                            lVar.u(listQ6);
                            break;
                        case O.j.STRING_SET_FIELD_NUMBER /* 6 */:
                            C1039j c1039j8 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj;
                            Object obj10 = list5.get(0);
                            N3.h.c(obj10, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView6 = (WebView) obj10;
                            Object obj11 = list5.get(1);
                            N3.h.c(obj11, "null cannot be cast to non-null type kotlin.String");
                            String str = (String) obj11;
                            String str2 = (String) list5.get(2);
                            String str3 = (String) list5.get(3);
                            try {
                                c1039j8.getClass();
                                webView6.loadData(str, str2, str3);
                                listQ7 = AbstractC0149a.y(null);
                            } catch (Throwable th7) {
                                listQ7 = Z1.f.Q(th7);
                            }
                            lVar.u(listQ7);
                            break;
                        case O.j.DOUBLE_FIELD_NUMBER /* 7 */:
                            C1039j c1039j9 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj;
                            Object obj12 = list6.get(0);
                            N3.h.c(obj12, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView7 = (WebView) obj12;
                            String str4 = (String) list6.get(1);
                            Object obj13 = list6.get(2);
                            N3.h.c(obj13, "null cannot be cast to non-null type kotlin.String");
                            String str5 = (String) obj13;
                            String str6 = (String) list6.get(3);
                            String str7 = (String) list6.get(4);
                            String str8 = (String) list6.get(5);
                            try {
                                c1039j9.getClass();
                                webView7.loadDataWithBaseURL(str4, str5, str6, str7, str8);
                                listQ8 = AbstractC0149a.y(null);
                            } catch (Throwable th8) {
                                listQ8 = Z1.f.Q(th8);
                            }
                            lVar.u(listQ8);
                            break;
                        case O.j.BYTES_FIELD_NUMBER /* 8 */:
                            C1039j c1039j10 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj;
                            Object obj14 = list7.get(0);
                            N3.h.c(obj14, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView8 = (WebView) obj14;
                            Object obj15 = list7.get(1);
                            N3.h.c(obj15, "null cannot be cast to non-null type kotlin.String");
                            String str9 = (String) obj15;
                            Object obj16 = list7.get(2);
                            N3.h.c(obj16, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.String>");
                            Map<String, String> map = (Map) obj16;
                            try {
                                c1039j10.getClass();
                                webView8.loadUrl(str9, map);
                                listQ9 = AbstractC0149a.y(null);
                            } catch (Throwable th9) {
                                listQ9 = Z1.f.Q(th9);
                            }
                            lVar.u(listQ9);
                            break;
                        case 9:
                            C1039j c1039j11 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj;
                            Object obj17 = list8.get(0);
                            N3.h.c(obj17, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView9 = (WebView) obj17;
                            Object obj18 = list8.get(1);
                            N3.h.c(obj18, "null cannot be cast to non-null type kotlin.String");
                            String str10 = (String) obj18;
                            Object obj19 = list8.get(2);
                            N3.h.c(obj19, "null cannot be cast to non-null type kotlin.ByteArray");
                            byte[] bArr = (byte[]) obj19;
                            try {
                                c1039j11.getClass();
                                webView9.postUrl(str10, bArr);
                                listQ10 = AbstractC0149a.y(null);
                            } catch (Throwable th10) {
                                listQ10 = Z1.f.Q(th10);
                            }
                            lVar.u(listQ10);
                            break;
                        case 10:
                            C1039j c1039j12 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj20 = ((List) obj).get(0);
                            N3.h.c(obj20, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView10 = (WebView) obj20;
                            try {
                                c1039j12.getClass();
                                listQ11 = AbstractC0149a.y(webView10.getUrl());
                            } catch (Throwable th11) {
                                listQ11 = Z1.f.Q(th11);
                            }
                            lVar.u(listQ11);
                            break;
                        case 11:
                            C1039j c1039j13 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj21 = ((List) obj).get(0);
                            N3.h.c(obj21, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView11 = (WebView) obj21;
                            try {
                                c1039j13.getClass();
                                webView11.goForward();
                                listQ12 = AbstractC0149a.y(null);
                            } catch (Throwable th12) {
                                listQ12 = Z1.f.Q(th12);
                            }
                            lVar.u(listQ12);
                            break;
                        case 12:
                            C1039j c1039j14 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj22 = ((List) obj).get(0);
                            N3.h.c(obj22, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView12 = (WebView) obj22;
                            try {
                                c1039j14.getClass();
                                listQ13 = AbstractC0149a.y(Boolean.valueOf(webView12.canGoBack()));
                            } catch (Throwable th13) {
                                listQ13 = Z1.f.Q(th13);
                            }
                            lVar.u(listQ13);
                            break;
                        case 13:
                            C1039j c1039j15 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj23 = ((List) obj).get(0);
                            N3.h.c(obj23, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView13 = (WebView) obj23;
                            try {
                                c1039j15.getClass();
                                listQ14 = AbstractC0149a.y(Boolean.valueOf(webView13.canGoForward()));
                            } catch (Throwable th14) {
                                listQ14 = Z1.f.Q(th14);
                            }
                            lVar.u(listQ14);
                            break;
                        case 14:
                            C1039j c1039j16 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj24 = ((List) obj).get(0);
                            N3.h.c(obj24, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView14 = (WebView) obj24;
                            try {
                                c1039j16.getClass();
                                webView14.goBack();
                                listQ15 = AbstractC0149a.y(null);
                            } catch (Throwable th15) {
                                listQ15 = Z1.f.Q(th15);
                            }
                            lVar.u(listQ15);
                            break;
                        case 15:
                            C1039j c1039j17 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj25 = ((List) obj).get(0);
                            N3.h.c(obj25, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView15 = (WebView) obj25;
                            try {
                                c1039j17.getClass();
                                webView15.reload();
                                listQ16 = AbstractC0149a.y(null);
                            } catch (Throwable th16) {
                                listQ16 = Z1.f.Q(th16);
                            }
                            lVar.u(listQ16);
                            break;
                        case 16:
                            C1039j c1039j18 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj;
                            Object obj26 = list9.get(0);
                            N3.h.c(obj26, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView16 = (WebView) obj26;
                            Object obj27 = list9.get(1);
                            N3.h.c(obj27, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue = ((Boolean) obj27).booleanValue();
                            try {
                                c1039j18.getClass();
                                webView16.clearCache(zBooleanValue);
                                listQ17 = AbstractC0149a.y(null);
                            } catch (Throwable th17) {
                                listQ17 = Z1.f.Q(th17);
                            }
                            lVar.u(listQ17);
                            break;
                        case 17:
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj;
                            Object obj28 = list10.get(0);
                            N3.h.c(obj28, "null cannot be cast to non-null type android.webkit.WebView");
                            Object obj29 = list10.get(1);
                            N3.h.c(obj29, "null cannot be cast to non-null type kotlin.String");
                            C1054y c1054y = new C1054y(lVar, 1);
                            c1039j.getClass();
                            ((WebView) obj28).evaluateJavascript((String) obj29, new C1042m(1, c1054y));
                            break;
                        case 18:
                            C1039j c1039j19 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj30 = ((List) obj).get(0);
                            N3.h.c(obj30, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView17 = (WebView) obj30;
                            try {
                                c1039j19.getClass();
                                listQ18 = AbstractC0149a.y(webView17.getTitle());
                            } catch (Throwable th18) {
                                listQ18 = Z1.f.Q(th18);
                            }
                            lVar.u(listQ18);
                            break;
                        case 19:
                            C1039j c1039j20 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj31 = ((List) obj).get(0);
                            N3.h.c(obj31, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue2 = ((Boolean) obj31).booleanValue();
                            try {
                                c1039j20.getClass();
                                WebView.setWebContentsDebuggingEnabled(zBooleanValue2);
                                listQ19 = AbstractC0149a.y(null);
                            } catch (Throwable th19) {
                                listQ19 = Z1.f.Q(th19);
                            }
                            lVar.u(listQ19);
                            break;
                        case 20:
                            C1039j c1039j21 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj;
                            Object obj32 = list11.get(0);
                            N3.h.c(obj32, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView18 = (WebView) obj32;
                            WebViewClient webViewClient = (WebViewClient) list11.get(1);
                            try {
                                c1039j21.getClass();
                                webView18.setWebViewClient(webViewClient);
                                listQ20 = AbstractC0149a.y(null);
                            } catch (Throwable th20) {
                                listQ20 = Z1.f.Q(th20);
                            }
                            lVar.u(listQ20);
                            break;
                        case 21:
                            C1039j c1039j22 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list12 = (List) obj;
                            Object obj33 = list12.get(0);
                            N3.h.c(obj33, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView19 = (WebView) obj33;
                            Object obj34 = list12.get(1);
                            N3.h.c(obj34, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.JavaScriptChannel");
                            C1048s c1048s = (C1048s) obj34;
                            try {
                                c1039j22.getClass();
                                webView19.addJavascriptInterface(c1048s, c1048s.f11098a);
                                listQ21 = AbstractC0149a.y(null);
                            } catch (Throwable th21) {
                                listQ21 = Z1.f.Q(th21);
                            }
                            lVar.u(listQ21);
                            break;
                        default:
                            C1039j c1039j23 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj;
                            Object obj35 = list13.get(0);
                            N3.h.c(obj35, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView20 = (WebView) obj35;
                            Object obj36 = list13.get(1);
                            N3.h.c(obj36, "null cannot be cast to non-null type kotlin.String");
                            String str11 = (String) obj36;
                            try {
                                c1039j23.getClass();
                                webView20.removeJavascriptInterface(str11);
                                listQ22 = AbstractC0149a.y(null);
                            } catch (Throwable th22) {
                                listQ22 = Z1.f.Q(th22);
                            }
                            lVar.u(listQ22);
                            break;
                    }
                }
            });
        } else {
            iVar2.E(null);
        }
        i iVar3 = new i(interfaceC0696f, "dev.flutter.pigeon.webview_flutter_android.WebView.loadData", gVar, (C0200z) null);
        if (c1039j != null) {
            final int i6 = 6;
            iVar3.E(new InterfaceC0692b() { // from class: y3.I
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
                    List listQ18;
                    List listQ19;
                    List listQ20;
                    List listQ21;
                    List listQ22;
                    switch (i6) {
                        case 0:
                            C1039j c1039j2 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj2 = ((List) obj).get(0);
                            N3.h.c(obj2, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((C1032c) c1039j2.f11068a.f9n).a(((Long) obj2).longValue(), c1039j2.a());
                                listQ = AbstractC0149a.y(null);
                            } catch (Throwable th) {
                                listQ = Z1.f.Q(th);
                            }
                            lVar.u(listQ);
                            break;
                        case 1:
                            C1039j c1039j3 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj3 = list.get(0);
                            N3.h.c(obj3, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView = (WebView) obj3;
                            DownloadListener downloadListener = (DownloadListener) list.get(1);
                            try {
                                c1039j3.getClass();
                                webView.setDownloadListener(downloadListener);
                                listQ2 = AbstractC0149a.y(null);
                            } catch (Throwable th2) {
                                listQ2 = Z1.f.Q(th2);
                            }
                            lVar.u(listQ2);
                            break;
                        case 2:
                            C1039j c1039j4 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj;
                            Object obj4 = list2.get(0);
                            N3.h.c(obj4, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView2 = (WebView) obj4;
                            Object obj5 = list2.get(1);
                            N3.h.c(obj5, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((C1032c) c1039j4.f11068a.f9n).a(((Long) obj5).longValue(), webView2.getSettings());
                                listQ3 = AbstractC0149a.y(null);
                            } catch (Throwable th3) {
                                listQ3 = Z1.f.Q(th3);
                            }
                            lVar.u(listQ3);
                            break;
                        case 3:
                            C1039j c1039j5 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj;
                            Object obj6 = list3.get(0);
                            N3.h.c(obj6, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView3 = (WebView) obj6;
                            C1022Q c1022q = (C1022Q) list3.get(1);
                            try {
                                c1039j5.getClass();
                                webView3.setWebChromeClient(c1022q);
                                listQ4 = AbstractC0149a.y(null);
                            } catch (Throwable th4) {
                                listQ4 = Z1.f.Q(th4);
                            }
                            lVar.u(listQ4);
                            break;
                        case 4:
                            C1039j c1039j6 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj;
                            Object obj7 = list4.get(0);
                            N3.h.c(obj7, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView4 = (WebView) obj7;
                            Object obj8 = list4.get(1);
                            N3.h.c(obj8, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue = ((Long) obj8).longValue();
                            try {
                                c1039j6.getClass();
                                webView4.setBackgroundColor((int) jLongValue);
                                listQ5 = AbstractC0149a.y(null);
                            } catch (Throwable th5) {
                                listQ5 = Z1.f.Q(th5);
                            }
                            lVar.u(listQ5);
                            break;
                        case 5:
                            C1039j c1039j7 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj9 = ((List) obj).get(0);
                            N3.h.c(obj9, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView5 = (WebView) obj9;
                            try {
                                c1039j7.getClass();
                                webView5.destroy();
                                listQ6 = AbstractC0149a.y(null);
                            } catch (Throwable th6) {
                                listQ6 = Z1.f.Q(th6);
                            }
                            lVar.u(listQ6);
                            break;
                        case O.j.STRING_SET_FIELD_NUMBER /* 6 */:
                            C1039j c1039j8 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj;
                            Object obj10 = list5.get(0);
                            N3.h.c(obj10, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView6 = (WebView) obj10;
                            Object obj11 = list5.get(1);
                            N3.h.c(obj11, "null cannot be cast to non-null type kotlin.String");
                            String str = (String) obj11;
                            String str2 = (String) list5.get(2);
                            String str3 = (String) list5.get(3);
                            try {
                                c1039j8.getClass();
                                webView6.loadData(str, str2, str3);
                                listQ7 = AbstractC0149a.y(null);
                            } catch (Throwable th7) {
                                listQ7 = Z1.f.Q(th7);
                            }
                            lVar.u(listQ7);
                            break;
                        case O.j.DOUBLE_FIELD_NUMBER /* 7 */:
                            C1039j c1039j9 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj;
                            Object obj12 = list6.get(0);
                            N3.h.c(obj12, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView7 = (WebView) obj12;
                            String str4 = (String) list6.get(1);
                            Object obj13 = list6.get(2);
                            N3.h.c(obj13, "null cannot be cast to non-null type kotlin.String");
                            String str5 = (String) obj13;
                            String str6 = (String) list6.get(3);
                            String str7 = (String) list6.get(4);
                            String str8 = (String) list6.get(5);
                            try {
                                c1039j9.getClass();
                                webView7.loadDataWithBaseURL(str4, str5, str6, str7, str8);
                                listQ8 = AbstractC0149a.y(null);
                            } catch (Throwable th8) {
                                listQ8 = Z1.f.Q(th8);
                            }
                            lVar.u(listQ8);
                            break;
                        case O.j.BYTES_FIELD_NUMBER /* 8 */:
                            C1039j c1039j10 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj;
                            Object obj14 = list7.get(0);
                            N3.h.c(obj14, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView8 = (WebView) obj14;
                            Object obj15 = list7.get(1);
                            N3.h.c(obj15, "null cannot be cast to non-null type kotlin.String");
                            String str9 = (String) obj15;
                            Object obj16 = list7.get(2);
                            N3.h.c(obj16, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.String>");
                            Map<String, String> map = (Map) obj16;
                            try {
                                c1039j10.getClass();
                                webView8.loadUrl(str9, map);
                                listQ9 = AbstractC0149a.y(null);
                            } catch (Throwable th9) {
                                listQ9 = Z1.f.Q(th9);
                            }
                            lVar.u(listQ9);
                            break;
                        case 9:
                            C1039j c1039j11 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj;
                            Object obj17 = list8.get(0);
                            N3.h.c(obj17, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView9 = (WebView) obj17;
                            Object obj18 = list8.get(1);
                            N3.h.c(obj18, "null cannot be cast to non-null type kotlin.String");
                            String str10 = (String) obj18;
                            Object obj19 = list8.get(2);
                            N3.h.c(obj19, "null cannot be cast to non-null type kotlin.ByteArray");
                            byte[] bArr = (byte[]) obj19;
                            try {
                                c1039j11.getClass();
                                webView9.postUrl(str10, bArr);
                                listQ10 = AbstractC0149a.y(null);
                            } catch (Throwable th10) {
                                listQ10 = Z1.f.Q(th10);
                            }
                            lVar.u(listQ10);
                            break;
                        case 10:
                            C1039j c1039j12 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj20 = ((List) obj).get(0);
                            N3.h.c(obj20, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView10 = (WebView) obj20;
                            try {
                                c1039j12.getClass();
                                listQ11 = AbstractC0149a.y(webView10.getUrl());
                            } catch (Throwable th11) {
                                listQ11 = Z1.f.Q(th11);
                            }
                            lVar.u(listQ11);
                            break;
                        case 11:
                            C1039j c1039j13 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj21 = ((List) obj).get(0);
                            N3.h.c(obj21, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView11 = (WebView) obj21;
                            try {
                                c1039j13.getClass();
                                webView11.goForward();
                                listQ12 = AbstractC0149a.y(null);
                            } catch (Throwable th12) {
                                listQ12 = Z1.f.Q(th12);
                            }
                            lVar.u(listQ12);
                            break;
                        case 12:
                            C1039j c1039j14 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj22 = ((List) obj).get(0);
                            N3.h.c(obj22, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView12 = (WebView) obj22;
                            try {
                                c1039j14.getClass();
                                listQ13 = AbstractC0149a.y(Boolean.valueOf(webView12.canGoBack()));
                            } catch (Throwable th13) {
                                listQ13 = Z1.f.Q(th13);
                            }
                            lVar.u(listQ13);
                            break;
                        case 13:
                            C1039j c1039j15 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj23 = ((List) obj).get(0);
                            N3.h.c(obj23, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView13 = (WebView) obj23;
                            try {
                                c1039j15.getClass();
                                listQ14 = AbstractC0149a.y(Boolean.valueOf(webView13.canGoForward()));
                            } catch (Throwable th14) {
                                listQ14 = Z1.f.Q(th14);
                            }
                            lVar.u(listQ14);
                            break;
                        case 14:
                            C1039j c1039j16 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj24 = ((List) obj).get(0);
                            N3.h.c(obj24, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView14 = (WebView) obj24;
                            try {
                                c1039j16.getClass();
                                webView14.goBack();
                                listQ15 = AbstractC0149a.y(null);
                            } catch (Throwable th15) {
                                listQ15 = Z1.f.Q(th15);
                            }
                            lVar.u(listQ15);
                            break;
                        case 15:
                            C1039j c1039j17 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj25 = ((List) obj).get(0);
                            N3.h.c(obj25, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView15 = (WebView) obj25;
                            try {
                                c1039j17.getClass();
                                webView15.reload();
                                listQ16 = AbstractC0149a.y(null);
                            } catch (Throwable th16) {
                                listQ16 = Z1.f.Q(th16);
                            }
                            lVar.u(listQ16);
                            break;
                        case 16:
                            C1039j c1039j18 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj;
                            Object obj26 = list9.get(0);
                            N3.h.c(obj26, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView16 = (WebView) obj26;
                            Object obj27 = list9.get(1);
                            N3.h.c(obj27, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue = ((Boolean) obj27).booleanValue();
                            try {
                                c1039j18.getClass();
                                webView16.clearCache(zBooleanValue);
                                listQ17 = AbstractC0149a.y(null);
                            } catch (Throwable th17) {
                                listQ17 = Z1.f.Q(th17);
                            }
                            lVar.u(listQ17);
                            break;
                        case 17:
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj;
                            Object obj28 = list10.get(0);
                            N3.h.c(obj28, "null cannot be cast to non-null type android.webkit.WebView");
                            Object obj29 = list10.get(1);
                            N3.h.c(obj29, "null cannot be cast to non-null type kotlin.String");
                            C1054y c1054y = new C1054y(lVar, 1);
                            c1039j.getClass();
                            ((WebView) obj28).evaluateJavascript((String) obj29, new C1042m(1, c1054y));
                            break;
                        case 18:
                            C1039j c1039j19 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj30 = ((List) obj).get(0);
                            N3.h.c(obj30, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView17 = (WebView) obj30;
                            try {
                                c1039j19.getClass();
                                listQ18 = AbstractC0149a.y(webView17.getTitle());
                            } catch (Throwable th18) {
                                listQ18 = Z1.f.Q(th18);
                            }
                            lVar.u(listQ18);
                            break;
                        case 19:
                            C1039j c1039j20 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj31 = ((List) obj).get(0);
                            N3.h.c(obj31, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue2 = ((Boolean) obj31).booleanValue();
                            try {
                                c1039j20.getClass();
                                WebView.setWebContentsDebuggingEnabled(zBooleanValue2);
                                listQ19 = AbstractC0149a.y(null);
                            } catch (Throwable th19) {
                                listQ19 = Z1.f.Q(th19);
                            }
                            lVar.u(listQ19);
                            break;
                        case 20:
                            C1039j c1039j21 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj;
                            Object obj32 = list11.get(0);
                            N3.h.c(obj32, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView18 = (WebView) obj32;
                            WebViewClient webViewClient = (WebViewClient) list11.get(1);
                            try {
                                c1039j21.getClass();
                                webView18.setWebViewClient(webViewClient);
                                listQ20 = AbstractC0149a.y(null);
                            } catch (Throwable th20) {
                                listQ20 = Z1.f.Q(th20);
                            }
                            lVar.u(listQ20);
                            break;
                        case 21:
                            C1039j c1039j22 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list12 = (List) obj;
                            Object obj33 = list12.get(0);
                            N3.h.c(obj33, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView19 = (WebView) obj33;
                            Object obj34 = list12.get(1);
                            N3.h.c(obj34, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.JavaScriptChannel");
                            C1048s c1048s = (C1048s) obj34;
                            try {
                                c1039j22.getClass();
                                webView19.addJavascriptInterface(c1048s, c1048s.f11098a);
                                listQ21 = AbstractC0149a.y(null);
                            } catch (Throwable th21) {
                                listQ21 = Z1.f.Q(th21);
                            }
                            lVar.u(listQ21);
                            break;
                        default:
                            C1039j c1039j23 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj;
                            Object obj35 = list13.get(0);
                            N3.h.c(obj35, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView20 = (WebView) obj35;
                            Object obj36 = list13.get(1);
                            N3.h.c(obj36, "null cannot be cast to non-null type kotlin.String");
                            String str11 = (String) obj36;
                            try {
                                c1039j23.getClass();
                                webView20.removeJavascriptInterface(str11);
                                listQ22 = AbstractC0149a.y(null);
                            } catch (Throwable th22) {
                                listQ22 = Z1.f.Q(th22);
                            }
                            lVar.u(listQ22);
                            break;
                    }
                }
            });
        } else {
            iVar3.E(null);
        }
        i iVar4 = new i(interfaceC0696f, "dev.flutter.pigeon.webview_flutter_android.WebView.loadDataWithBaseUrl", gVar, (C0200z) null);
        if (c1039j != null) {
            final int i7 = 7;
            iVar4.E(new InterfaceC0692b() { // from class: y3.I
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
                    List listQ18;
                    List listQ19;
                    List listQ20;
                    List listQ21;
                    List listQ22;
                    switch (i7) {
                        case 0:
                            C1039j c1039j2 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj2 = ((List) obj).get(0);
                            N3.h.c(obj2, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((C1032c) c1039j2.f11068a.f9n).a(((Long) obj2).longValue(), c1039j2.a());
                                listQ = AbstractC0149a.y(null);
                            } catch (Throwable th) {
                                listQ = Z1.f.Q(th);
                            }
                            lVar.u(listQ);
                            break;
                        case 1:
                            C1039j c1039j3 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj3 = list.get(0);
                            N3.h.c(obj3, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView = (WebView) obj3;
                            DownloadListener downloadListener = (DownloadListener) list.get(1);
                            try {
                                c1039j3.getClass();
                                webView.setDownloadListener(downloadListener);
                                listQ2 = AbstractC0149a.y(null);
                            } catch (Throwable th2) {
                                listQ2 = Z1.f.Q(th2);
                            }
                            lVar.u(listQ2);
                            break;
                        case 2:
                            C1039j c1039j4 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj;
                            Object obj4 = list2.get(0);
                            N3.h.c(obj4, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView2 = (WebView) obj4;
                            Object obj5 = list2.get(1);
                            N3.h.c(obj5, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((C1032c) c1039j4.f11068a.f9n).a(((Long) obj5).longValue(), webView2.getSettings());
                                listQ3 = AbstractC0149a.y(null);
                            } catch (Throwable th3) {
                                listQ3 = Z1.f.Q(th3);
                            }
                            lVar.u(listQ3);
                            break;
                        case 3:
                            C1039j c1039j5 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj;
                            Object obj6 = list3.get(0);
                            N3.h.c(obj6, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView3 = (WebView) obj6;
                            C1022Q c1022q = (C1022Q) list3.get(1);
                            try {
                                c1039j5.getClass();
                                webView3.setWebChromeClient(c1022q);
                                listQ4 = AbstractC0149a.y(null);
                            } catch (Throwable th4) {
                                listQ4 = Z1.f.Q(th4);
                            }
                            lVar.u(listQ4);
                            break;
                        case 4:
                            C1039j c1039j6 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj;
                            Object obj7 = list4.get(0);
                            N3.h.c(obj7, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView4 = (WebView) obj7;
                            Object obj8 = list4.get(1);
                            N3.h.c(obj8, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue = ((Long) obj8).longValue();
                            try {
                                c1039j6.getClass();
                                webView4.setBackgroundColor((int) jLongValue);
                                listQ5 = AbstractC0149a.y(null);
                            } catch (Throwable th5) {
                                listQ5 = Z1.f.Q(th5);
                            }
                            lVar.u(listQ5);
                            break;
                        case 5:
                            C1039j c1039j7 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj9 = ((List) obj).get(0);
                            N3.h.c(obj9, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView5 = (WebView) obj9;
                            try {
                                c1039j7.getClass();
                                webView5.destroy();
                                listQ6 = AbstractC0149a.y(null);
                            } catch (Throwable th6) {
                                listQ6 = Z1.f.Q(th6);
                            }
                            lVar.u(listQ6);
                            break;
                        case O.j.STRING_SET_FIELD_NUMBER /* 6 */:
                            C1039j c1039j8 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj;
                            Object obj10 = list5.get(0);
                            N3.h.c(obj10, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView6 = (WebView) obj10;
                            Object obj11 = list5.get(1);
                            N3.h.c(obj11, "null cannot be cast to non-null type kotlin.String");
                            String str = (String) obj11;
                            String str2 = (String) list5.get(2);
                            String str3 = (String) list5.get(3);
                            try {
                                c1039j8.getClass();
                                webView6.loadData(str, str2, str3);
                                listQ7 = AbstractC0149a.y(null);
                            } catch (Throwable th7) {
                                listQ7 = Z1.f.Q(th7);
                            }
                            lVar.u(listQ7);
                            break;
                        case O.j.DOUBLE_FIELD_NUMBER /* 7 */:
                            C1039j c1039j9 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj;
                            Object obj12 = list6.get(0);
                            N3.h.c(obj12, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView7 = (WebView) obj12;
                            String str4 = (String) list6.get(1);
                            Object obj13 = list6.get(2);
                            N3.h.c(obj13, "null cannot be cast to non-null type kotlin.String");
                            String str5 = (String) obj13;
                            String str6 = (String) list6.get(3);
                            String str7 = (String) list6.get(4);
                            String str8 = (String) list6.get(5);
                            try {
                                c1039j9.getClass();
                                webView7.loadDataWithBaseURL(str4, str5, str6, str7, str8);
                                listQ8 = AbstractC0149a.y(null);
                            } catch (Throwable th8) {
                                listQ8 = Z1.f.Q(th8);
                            }
                            lVar.u(listQ8);
                            break;
                        case O.j.BYTES_FIELD_NUMBER /* 8 */:
                            C1039j c1039j10 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj;
                            Object obj14 = list7.get(0);
                            N3.h.c(obj14, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView8 = (WebView) obj14;
                            Object obj15 = list7.get(1);
                            N3.h.c(obj15, "null cannot be cast to non-null type kotlin.String");
                            String str9 = (String) obj15;
                            Object obj16 = list7.get(2);
                            N3.h.c(obj16, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.String>");
                            Map<String, String> map = (Map) obj16;
                            try {
                                c1039j10.getClass();
                                webView8.loadUrl(str9, map);
                                listQ9 = AbstractC0149a.y(null);
                            } catch (Throwable th9) {
                                listQ9 = Z1.f.Q(th9);
                            }
                            lVar.u(listQ9);
                            break;
                        case 9:
                            C1039j c1039j11 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj;
                            Object obj17 = list8.get(0);
                            N3.h.c(obj17, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView9 = (WebView) obj17;
                            Object obj18 = list8.get(1);
                            N3.h.c(obj18, "null cannot be cast to non-null type kotlin.String");
                            String str10 = (String) obj18;
                            Object obj19 = list8.get(2);
                            N3.h.c(obj19, "null cannot be cast to non-null type kotlin.ByteArray");
                            byte[] bArr = (byte[]) obj19;
                            try {
                                c1039j11.getClass();
                                webView9.postUrl(str10, bArr);
                                listQ10 = AbstractC0149a.y(null);
                            } catch (Throwable th10) {
                                listQ10 = Z1.f.Q(th10);
                            }
                            lVar.u(listQ10);
                            break;
                        case 10:
                            C1039j c1039j12 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj20 = ((List) obj).get(0);
                            N3.h.c(obj20, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView10 = (WebView) obj20;
                            try {
                                c1039j12.getClass();
                                listQ11 = AbstractC0149a.y(webView10.getUrl());
                            } catch (Throwable th11) {
                                listQ11 = Z1.f.Q(th11);
                            }
                            lVar.u(listQ11);
                            break;
                        case 11:
                            C1039j c1039j13 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj21 = ((List) obj).get(0);
                            N3.h.c(obj21, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView11 = (WebView) obj21;
                            try {
                                c1039j13.getClass();
                                webView11.goForward();
                                listQ12 = AbstractC0149a.y(null);
                            } catch (Throwable th12) {
                                listQ12 = Z1.f.Q(th12);
                            }
                            lVar.u(listQ12);
                            break;
                        case 12:
                            C1039j c1039j14 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj22 = ((List) obj).get(0);
                            N3.h.c(obj22, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView12 = (WebView) obj22;
                            try {
                                c1039j14.getClass();
                                listQ13 = AbstractC0149a.y(Boolean.valueOf(webView12.canGoBack()));
                            } catch (Throwable th13) {
                                listQ13 = Z1.f.Q(th13);
                            }
                            lVar.u(listQ13);
                            break;
                        case 13:
                            C1039j c1039j15 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj23 = ((List) obj).get(0);
                            N3.h.c(obj23, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView13 = (WebView) obj23;
                            try {
                                c1039j15.getClass();
                                listQ14 = AbstractC0149a.y(Boolean.valueOf(webView13.canGoForward()));
                            } catch (Throwable th14) {
                                listQ14 = Z1.f.Q(th14);
                            }
                            lVar.u(listQ14);
                            break;
                        case 14:
                            C1039j c1039j16 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj24 = ((List) obj).get(0);
                            N3.h.c(obj24, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView14 = (WebView) obj24;
                            try {
                                c1039j16.getClass();
                                webView14.goBack();
                                listQ15 = AbstractC0149a.y(null);
                            } catch (Throwable th15) {
                                listQ15 = Z1.f.Q(th15);
                            }
                            lVar.u(listQ15);
                            break;
                        case 15:
                            C1039j c1039j17 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj25 = ((List) obj).get(0);
                            N3.h.c(obj25, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView15 = (WebView) obj25;
                            try {
                                c1039j17.getClass();
                                webView15.reload();
                                listQ16 = AbstractC0149a.y(null);
                            } catch (Throwable th16) {
                                listQ16 = Z1.f.Q(th16);
                            }
                            lVar.u(listQ16);
                            break;
                        case 16:
                            C1039j c1039j18 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj;
                            Object obj26 = list9.get(0);
                            N3.h.c(obj26, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView16 = (WebView) obj26;
                            Object obj27 = list9.get(1);
                            N3.h.c(obj27, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue = ((Boolean) obj27).booleanValue();
                            try {
                                c1039j18.getClass();
                                webView16.clearCache(zBooleanValue);
                                listQ17 = AbstractC0149a.y(null);
                            } catch (Throwable th17) {
                                listQ17 = Z1.f.Q(th17);
                            }
                            lVar.u(listQ17);
                            break;
                        case 17:
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj;
                            Object obj28 = list10.get(0);
                            N3.h.c(obj28, "null cannot be cast to non-null type android.webkit.WebView");
                            Object obj29 = list10.get(1);
                            N3.h.c(obj29, "null cannot be cast to non-null type kotlin.String");
                            C1054y c1054y = new C1054y(lVar, 1);
                            c1039j.getClass();
                            ((WebView) obj28).evaluateJavascript((String) obj29, new C1042m(1, c1054y));
                            break;
                        case 18:
                            C1039j c1039j19 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj30 = ((List) obj).get(0);
                            N3.h.c(obj30, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView17 = (WebView) obj30;
                            try {
                                c1039j19.getClass();
                                listQ18 = AbstractC0149a.y(webView17.getTitle());
                            } catch (Throwable th18) {
                                listQ18 = Z1.f.Q(th18);
                            }
                            lVar.u(listQ18);
                            break;
                        case 19:
                            C1039j c1039j20 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj31 = ((List) obj).get(0);
                            N3.h.c(obj31, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue2 = ((Boolean) obj31).booleanValue();
                            try {
                                c1039j20.getClass();
                                WebView.setWebContentsDebuggingEnabled(zBooleanValue2);
                                listQ19 = AbstractC0149a.y(null);
                            } catch (Throwable th19) {
                                listQ19 = Z1.f.Q(th19);
                            }
                            lVar.u(listQ19);
                            break;
                        case 20:
                            C1039j c1039j21 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj;
                            Object obj32 = list11.get(0);
                            N3.h.c(obj32, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView18 = (WebView) obj32;
                            WebViewClient webViewClient = (WebViewClient) list11.get(1);
                            try {
                                c1039j21.getClass();
                                webView18.setWebViewClient(webViewClient);
                                listQ20 = AbstractC0149a.y(null);
                            } catch (Throwable th20) {
                                listQ20 = Z1.f.Q(th20);
                            }
                            lVar.u(listQ20);
                            break;
                        case 21:
                            C1039j c1039j22 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list12 = (List) obj;
                            Object obj33 = list12.get(0);
                            N3.h.c(obj33, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView19 = (WebView) obj33;
                            Object obj34 = list12.get(1);
                            N3.h.c(obj34, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.JavaScriptChannel");
                            C1048s c1048s = (C1048s) obj34;
                            try {
                                c1039j22.getClass();
                                webView19.addJavascriptInterface(c1048s, c1048s.f11098a);
                                listQ21 = AbstractC0149a.y(null);
                            } catch (Throwable th21) {
                                listQ21 = Z1.f.Q(th21);
                            }
                            lVar.u(listQ21);
                            break;
                        default:
                            C1039j c1039j23 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj;
                            Object obj35 = list13.get(0);
                            N3.h.c(obj35, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView20 = (WebView) obj35;
                            Object obj36 = list13.get(1);
                            N3.h.c(obj36, "null cannot be cast to non-null type kotlin.String");
                            String str11 = (String) obj36;
                            try {
                                c1039j23.getClass();
                                webView20.removeJavascriptInterface(str11);
                                listQ22 = AbstractC0149a.y(null);
                            } catch (Throwable th22) {
                                listQ22 = Z1.f.Q(th22);
                            }
                            lVar.u(listQ22);
                            break;
                    }
                }
            });
        } else {
            iVar4.E(null);
        }
        i iVar5 = new i(interfaceC0696f, "dev.flutter.pigeon.webview_flutter_android.WebView.loadUrl", gVar, (C0200z) null);
        if (c1039j != null) {
            final int i8 = 8;
            iVar5.E(new InterfaceC0692b() { // from class: y3.I
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
                    List listQ18;
                    List listQ19;
                    List listQ20;
                    List listQ21;
                    List listQ22;
                    switch (i8) {
                        case 0:
                            C1039j c1039j2 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj2 = ((List) obj).get(0);
                            N3.h.c(obj2, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((C1032c) c1039j2.f11068a.f9n).a(((Long) obj2).longValue(), c1039j2.a());
                                listQ = AbstractC0149a.y(null);
                            } catch (Throwable th) {
                                listQ = Z1.f.Q(th);
                            }
                            lVar.u(listQ);
                            break;
                        case 1:
                            C1039j c1039j3 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj3 = list.get(0);
                            N3.h.c(obj3, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView = (WebView) obj3;
                            DownloadListener downloadListener = (DownloadListener) list.get(1);
                            try {
                                c1039j3.getClass();
                                webView.setDownloadListener(downloadListener);
                                listQ2 = AbstractC0149a.y(null);
                            } catch (Throwable th2) {
                                listQ2 = Z1.f.Q(th2);
                            }
                            lVar.u(listQ2);
                            break;
                        case 2:
                            C1039j c1039j4 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj;
                            Object obj4 = list2.get(0);
                            N3.h.c(obj4, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView2 = (WebView) obj4;
                            Object obj5 = list2.get(1);
                            N3.h.c(obj5, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((C1032c) c1039j4.f11068a.f9n).a(((Long) obj5).longValue(), webView2.getSettings());
                                listQ3 = AbstractC0149a.y(null);
                            } catch (Throwable th3) {
                                listQ3 = Z1.f.Q(th3);
                            }
                            lVar.u(listQ3);
                            break;
                        case 3:
                            C1039j c1039j5 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj;
                            Object obj6 = list3.get(0);
                            N3.h.c(obj6, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView3 = (WebView) obj6;
                            C1022Q c1022q = (C1022Q) list3.get(1);
                            try {
                                c1039j5.getClass();
                                webView3.setWebChromeClient(c1022q);
                                listQ4 = AbstractC0149a.y(null);
                            } catch (Throwable th4) {
                                listQ4 = Z1.f.Q(th4);
                            }
                            lVar.u(listQ4);
                            break;
                        case 4:
                            C1039j c1039j6 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj;
                            Object obj7 = list4.get(0);
                            N3.h.c(obj7, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView4 = (WebView) obj7;
                            Object obj8 = list4.get(1);
                            N3.h.c(obj8, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue = ((Long) obj8).longValue();
                            try {
                                c1039j6.getClass();
                                webView4.setBackgroundColor((int) jLongValue);
                                listQ5 = AbstractC0149a.y(null);
                            } catch (Throwable th5) {
                                listQ5 = Z1.f.Q(th5);
                            }
                            lVar.u(listQ5);
                            break;
                        case 5:
                            C1039j c1039j7 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj9 = ((List) obj).get(0);
                            N3.h.c(obj9, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView5 = (WebView) obj9;
                            try {
                                c1039j7.getClass();
                                webView5.destroy();
                                listQ6 = AbstractC0149a.y(null);
                            } catch (Throwable th6) {
                                listQ6 = Z1.f.Q(th6);
                            }
                            lVar.u(listQ6);
                            break;
                        case O.j.STRING_SET_FIELD_NUMBER /* 6 */:
                            C1039j c1039j8 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj;
                            Object obj10 = list5.get(0);
                            N3.h.c(obj10, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView6 = (WebView) obj10;
                            Object obj11 = list5.get(1);
                            N3.h.c(obj11, "null cannot be cast to non-null type kotlin.String");
                            String str = (String) obj11;
                            String str2 = (String) list5.get(2);
                            String str3 = (String) list5.get(3);
                            try {
                                c1039j8.getClass();
                                webView6.loadData(str, str2, str3);
                                listQ7 = AbstractC0149a.y(null);
                            } catch (Throwable th7) {
                                listQ7 = Z1.f.Q(th7);
                            }
                            lVar.u(listQ7);
                            break;
                        case O.j.DOUBLE_FIELD_NUMBER /* 7 */:
                            C1039j c1039j9 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj;
                            Object obj12 = list6.get(0);
                            N3.h.c(obj12, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView7 = (WebView) obj12;
                            String str4 = (String) list6.get(1);
                            Object obj13 = list6.get(2);
                            N3.h.c(obj13, "null cannot be cast to non-null type kotlin.String");
                            String str5 = (String) obj13;
                            String str6 = (String) list6.get(3);
                            String str7 = (String) list6.get(4);
                            String str8 = (String) list6.get(5);
                            try {
                                c1039j9.getClass();
                                webView7.loadDataWithBaseURL(str4, str5, str6, str7, str8);
                                listQ8 = AbstractC0149a.y(null);
                            } catch (Throwable th8) {
                                listQ8 = Z1.f.Q(th8);
                            }
                            lVar.u(listQ8);
                            break;
                        case O.j.BYTES_FIELD_NUMBER /* 8 */:
                            C1039j c1039j10 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj;
                            Object obj14 = list7.get(0);
                            N3.h.c(obj14, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView8 = (WebView) obj14;
                            Object obj15 = list7.get(1);
                            N3.h.c(obj15, "null cannot be cast to non-null type kotlin.String");
                            String str9 = (String) obj15;
                            Object obj16 = list7.get(2);
                            N3.h.c(obj16, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.String>");
                            Map<String, String> map = (Map) obj16;
                            try {
                                c1039j10.getClass();
                                webView8.loadUrl(str9, map);
                                listQ9 = AbstractC0149a.y(null);
                            } catch (Throwable th9) {
                                listQ9 = Z1.f.Q(th9);
                            }
                            lVar.u(listQ9);
                            break;
                        case 9:
                            C1039j c1039j11 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj;
                            Object obj17 = list8.get(0);
                            N3.h.c(obj17, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView9 = (WebView) obj17;
                            Object obj18 = list8.get(1);
                            N3.h.c(obj18, "null cannot be cast to non-null type kotlin.String");
                            String str10 = (String) obj18;
                            Object obj19 = list8.get(2);
                            N3.h.c(obj19, "null cannot be cast to non-null type kotlin.ByteArray");
                            byte[] bArr = (byte[]) obj19;
                            try {
                                c1039j11.getClass();
                                webView9.postUrl(str10, bArr);
                                listQ10 = AbstractC0149a.y(null);
                            } catch (Throwable th10) {
                                listQ10 = Z1.f.Q(th10);
                            }
                            lVar.u(listQ10);
                            break;
                        case 10:
                            C1039j c1039j12 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj20 = ((List) obj).get(0);
                            N3.h.c(obj20, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView10 = (WebView) obj20;
                            try {
                                c1039j12.getClass();
                                listQ11 = AbstractC0149a.y(webView10.getUrl());
                            } catch (Throwable th11) {
                                listQ11 = Z1.f.Q(th11);
                            }
                            lVar.u(listQ11);
                            break;
                        case 11:
                            C1039j c1039j13 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj21 = ((List) obj).get(0);
                            N3.h.c(obj21, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView11 = (WebView) obj21;
                            try {
                                c1039j13.getClass();
                                webView11.goForward();
                                listQ12 = AbstractC0149a.y(null);
                            } catch (Throwable th12) {
                                listQ12 = Z1.f.Q(th12);
                            }
                            lVar.u(listQ12);
                            break;
                        case 12:
                            C1039j c1039j14 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj22 = ((List) obj).get(0);
                            N3.h.c(obj22, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView12 = (WebView) obj22;
                            try {
                                c1039j14.getClass();
                                listQ13 = AbstractC0149a.y(Boolean.valueOf(webView12.canGoBack()));
                            } catch (Throwable th13) {
                                listQ13 = Z1.f.Q(th13);
                            }
                            lVar.u(listQ13);
                            break;
                        case 13:
                            C1039j c1039j15 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj23 = ((List) obj).get(0);
                            N3.h.c(obj23, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView13 = (WebView) obj23;
                            try {
                                c1039j15.getClass();
                                listQ14 = AbstractC0149a.y(Boolean.valueOf(webView13.canGoForward()));
                            } catch (Throwable th14) {
                                listQ14 = Z1.f.Q(th14);
                            }
                            lVar.u(listQ14);
                            break;
                        case 14:
                            C1039j c1039j16 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj24 = ((List) obj).get(0);
                            N3.h.c(obj24, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView14 = (WebView) obj24;
                            try {
                                c1039j16.getClass();
                                webView14.goBack();
                                listQ15 = AbstractC0149a.y(null);
                            } catch (Throwable th15) {
                                listQ15 = Z1.f.Q(th15);
                            }
                            lVar.u(listQ15);
                            break;
                        case 15:
                            C1039j c1039j17 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj25 = ((List) obj).get(0);
                            N3.h.c(obj25, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView15 = (WebView) obj25;
                            try {
                                c1039j17.getClass();
                                webView15.reload();
                                listQ16 = AbstractC0149a.y(null);
                            } catch (Throwable th16) {
                                listQ16 = Z1.f.Q(th16);
                            }
                            lVar.u(listQ16);
                            break;
                        case 16:
                            C1039j c1039j18 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj;
                            Object obj26 = list9.get(0);
                            N3.h.c(obj26, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView16 = (WebView) obj26;
                            Object obj27 = list9.get(1);
                            N3.h.c(obj27, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue = ((Boolean) obj27).booleanValue();
                            try {
                                c1039j18.getClass();
                                webView16.clearCache(zBooleanValue);
                                listQ17 = AbstractC0149a.y(null);
                            } catch (Throwable th17) {
                                listQ17 = Z1.f.Q(th17);
                            }
                            lVar.u(listQ17);
                            break;
                        case 17:
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj;
                            Object obj28 = list10.get(0);
                            N3.h.c(obj28, "null cannot be cast to non-null type android.webkit.WebView");
                            Object obj29 = list10.get(1);
                            N3.h.c(obj29, "null cannot be cast to non-null type kotlin.String");
                            C1054y c1054y = new C1054y(lVar, 1);
                            c1039j.getClass();
                            ((WebView) obj28).evaluateJavascript((String) obj29, new C1042m(1, c1054y));
                            break;
                        case 18:
                            C1039j c1039j19 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj30 = ((List) obj).get(0);
                            N3.h.c(obj30, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView17 = (WebView) obj30;
                            try {
                                c1039j19.getClass();
                                listQ18 = AbstractC0149a.y(webView17.getTitle());
                            } catch (Throwable th18) {
                                listQ18 = Z1.f.Q(th18);
                            }
                            lVar.u(listQ18);
                            break;
                        case 19:
                            C1039j c1039j20 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj31 = ((List) obj).get(0);
                            N3.h.c(obj31, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue2 = ((Boolean) obj31).booleanValue();
                            try {
                                c1039j20.getClass();
                                WebView.setWebContentsDebuggingEnabled(zBooleanValue2);
                                listQ19 = AbstractC0149a.y(null);
                            } catch (Throwable th19) {
                                listQ19 = Z1.f.Q(th19);
                            }
                            lVar.u(listQ19);
                            break;
                        case 20:
                            C1039j c1039j21 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj;
                            Object obj32 = list11.get(0);
                            N3.h.c(obj32, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView18 = (WebView) obj32;
                            WebViewClient webViewClient = (WebViewClient) list11.get(1);
                            try {
                                c1039j21.getClass();
                                webView18.setWebViewClient(webViewClient);
                                listQ20 = AbstractC0149a.y(null);
                            } catch (Throwable th20) {
                                listQ20 = Z1.f.Q(th20);
                            }
                            lVar.u(listQ20);
                            break;
                        case 21:
                            C1039j c1039j22 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list12 = (List) obj;
                            Object obj33 = list12.get(0);
                            N3.h.c(obj33, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView19 = (WebView) obj33;
                            Object obj34 = list12.get(1);
                            N3.h.c(obj34, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.JavaScriptChannel");
                            C1048s c1048s = (C1048s) obj34;
                            try {
                                c1039j22.getClass();
                                webView19.addJavascriptInterface(c1048s, c1048s.f11098a);
                                listQ21 = AbstractC0149a.y(null);
                            } catch (Throwable th21) {
                                listQ21 = Z1.f.Q(th21);
                            }
                            lVar.u(listQ21);
                            break;
                        default:
                            C1039j c1039j23 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj;
                            Object obj35 = list13.get(0);
                            N3.h.c(obj35, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView20 = (WebView) obj35;
                            Object obj36 = list13.get(1);
                            N3.h.c(obj36, "null cannot be cast to non-null type kotlin.String");
                            String str11 = (String) obj36;
                            try {
                                c1039j23.getClass();
                                webView20.removeJavascriptInterface(str11);
                                listQ22 = AbstractC0149a.y(null);
                            } catch (Throwable th22) {
                                listQ22 = Z1.f.Q(th22);
                            }
                            lVar.u(listQ22);
                            break;
                    }
                }
            });
        } else {
            iVar5.E(null);
        }
        i iVar6 = new i(interfaceC0696f, "dev.flutter.pigeon.webview_flutter_android.WebView.postUrl", gVar, (C0200z) null);
        if (c1039j != null) {
            final int i9 = 9;
            iVar6.E(new InterfaceC0692b() { // from class: y3.I
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
                    List listQ18;
                    List listQ19;
                    List listQ20;
                    List listQ21;
                    List listQ22;
                    switch (i9) {
                        case 0:
                            C1039j c1039j2 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj2 = ((List) obj).get(0);
                            N3.h.c(obj2, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((C1032c) c1039j2.f11068a.f9n).a(((Long) obj2).longValue(), c1039j2.a());
                                listQ = AbstractC0149a.y(null);
                            } catch (Throwable th) {
                                listQ = Z1.f.Q(th);
                            }
                            lVar.u(listQ);
                            break;
                        case 1:
                            C1039j c1039j3 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj3 = list.get(0);
                            N3.h.c(obj3, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView = (WebView) obj3;
                            DownloadListener downloadListener = (DownloadListener) list.get(1);
                            try {
                                c1039j3.getClass();
                                webView.setDownloadListener(downloadListener);
                                listQ2 = AbstractC0149a.y(null);
                            } catch (Throwable th2) {
                                listQ2 = Z1.f.Q(th2);
                            }
                            lVar.u(listQ2);
                            break;
                        case 2:
                            C1039j c1039j4 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj;
                            Object obj4 = list2.get(0);
                            N3.h.c(obj4, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView2 = (WebView) obj4;
                            Object obj5 = list2.get(1);
                            N3.h.c(obj5, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((C1032c) c1039j4.f11068a.f9n).a(((Long) obj5).longValue(), webView2.getSettings());
                                listQ3 = AbstractC0149a.y(null);
                            } catch (Throwable th3) {
                                listQ3 = Z1.f.Q(th3);
                            }
                            lVar.u(listQ3);
                            break;
                        case 3:
                            C1039j c1039j5 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj;
                            Object obj6 = list3.get(0);
                            N3.h.c(obj6, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView3 = (WebView) obj6;
                            C1022Q c1022q = (C1022Q) list3.get(1);
                            try {
                                c1039j5.getClass();
                                webView3.setWebChromeClient(c1022q);
                                listQ4 = AbstractC0149a.y(null);
                            } catch (Throwable th4) {
                                listQ4 = Z1.f.Q(th4);
                            }
                            lVar.u(listQ4);
                            break;
                        case 4:
                            C1039j c1039j6 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj;
                            Object obj7 = list4.get(0);
                            N3.h.c(obj7, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView4 = (WebView) obj7;
                            Object obj8 = list4.get(1);
                            N3.h.c(obj8, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue = ((Long) obj8).longValue();
                            try {
                                c1039j6.getClass();
                                webView4.setBackgroundColor((int) jLongValue);
                                listQ5 = AbstractC0149a.y(null);
                            } catch (Throwable th5) {
                                listQ5 = Z1.f.Q(th5);
                            }
                            lVar.u(listQ5);
                            break;
                        case 5:
                            C1039j c1039j7 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj9 = ((List) obj).get(0);
                            N3.h.c(obj9, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView5 = (WebView) obj9;
                            try {
                                c1039j7.getClass();
                                webView5.destroy();
                                listQ6 = AbstractC0149a.y(null);
                            } catch (Throwable th6) {
                                listQ6 = Z1.f.Q(th6);
                            }
                            lVar.u(listQ6);
                            break;
                        case O.j.STRING_SET_FIELD_NUMBER /* 6 */:
                            C1039j c1039j8 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj;
                            Object obj10 = list5.get(0);
                            N3.h.c(obj10, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView6 = (WebView) obj10;
                            Object obj11 = list5.get(1);
                            N3.h.c(obj11, "null cannot be cast to non-null type kotlin.String");
                            String str = (String) obj11;
                            String str2 = (String) list5.get(2);
                            String str3 = (String) list5.get(3);
                            try {
                                c1039j8.getClass();
                                webView6.loadData(str, str2, str3);
                                listQ7 = AbstractC0149a.y(null);
                            } catch (Throwable th7) {
                                listQ7 = Z1.f.Q(th7);
                            }
                            lVar.u(listQ7);
                            break;
                        case O.j.DOUBLE_FIELD_NUMBER /* 7 */:
                            C1039j c1039j9 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj;
                            Object obj12 = list6.get(0);
                            N3.h.c(obj12, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView7 = (WebView) obj12;
                            String str4 = (String) list6.get(1);
                            Object obj13 = list6.get(2);
                            N3.h.c(obj13, "null cannot be cast to non-null type kotlin.String");
                            String str5 = (String) obj13;
                            String str6 = (String) list6.get(3);
                            String str7 = (String) list6.get(4);
                            String str8 = (String) list6.get(5);
                            try {
                                c1039j9.getClass();
                                webView7.loadDataWithBaseURL(str4, str5, str6, str7, str8);
                                listQ8 = AbstractC0149a.y(null);
                            } catch (Throwable th8) {
                                listQ8 = Z1.f.Q(th8);
                            }
                            lVar.u(listQ8);
                            break;
                        case O.j.BYTES_FIELD_NUMBER /* 8 */:
                            C1039j c1039j10 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj;
                            Object obj14 = list7.get(0);
                            N3.h.c(obj14, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView8 = (WebView) obj14;
                            Object obj15 = list7.get(1);
                            N3.h.c(obj15, "null cannot be cast to non-null type kotlin.String");
                            String str9 = (String) obj15;
                            Object obj16 = list7.get(2);
                            N3.h.c(obj16, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.String>");
                            Map<String, String> map = (Map) obj16;
                            try {
                                c1039j10.getClass();
                                webView8.loadUrl(str9, map);
                                listQ9 = AbstractC0149a.y(null);
                            } catch (Throwable th9) {
                                listQ9 = Z1.f.Q(th9);
                            }
                            lVar.u(listQ9);
                            break;
                        case 9:
                            C1039j c1039j11 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj;
                            Object obj17 = list8.get(0);
                            N3.h.c(obj17, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView9 = (WebView) obj17;
                            Object obj18 = list8.get(1);
                            N3.h.c(obj18, "null cannot be cast to non-null type kotlin.String");
                            String str10 = (String) obj18;
                            Object obj19 = list8.get(2);
                            N3.h.c(obj19, "null cannot be cast to non-null type kotlin.ByteArray");
                            byte[] bArr = (byte[]) obj19;
                            try {
                                c1039j11.getClass();
                                webView9.postUrl(str10, bArr);
                                listQ10 = AbstractC0149a.y(null);
                            } catch (Throwable th10) {
                                listQ10 = Z1.f.Q(th10);
                            }
                            lVar.u(listQ10);
                            break;
                        case 10:
                            C1039j c1039j12 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj20 = ((List) obj).get(0);
                            N3.h.c(obj20, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView10 = (WebView) obj20;
                            try {
                                c1039j12.getClass();
                                listQ11 = AbstractC0149a.y(webView10.getUrl());
                            } catch (Throwable th11) {
                                listQ11 = Z1.f.Q(th11);
                            }
                            lVar.u(listQ11);
                            break;
                        case 11:
                            C1039j c1039j13 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj21 = ((List) obj).get(0);
                            N3.h.c(obj21, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView11 = (WebView) obj21;
                            try {
                                c1039j13.getClass();
                                webView11.goForward();
                                listQ12 = AbstractC0149a.y(null);
                            } catch (Throwable th12) {
                                listQ12 = Z1.f.Q(th12);
                            }
                            lVar.u(listQ12);
                            break;
                        case 12:
                            C1039j c1039j14 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj22 = ((List) obj).get(0);
                            N3.h.c(obj22, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView12 = (WebView) obj22;
                            try {
                                c1039j14.getClass();
                                listQ13 = AbstractC0149a.y(Boolean.valueOf(webView12.canGoBack()));
                            } catch (Throwable th13) {
                                listQ13 = Z1.f.Q(th13);
                            }
                            lVar.u(listQ13);
                            break;
                        case 13:
                            C1039j c1039j15 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj23 = ((List) obj).get(0);
                            N3.h.c(obj23, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView13 = (WebView) obj23;
                            try {
                                c1039j15.getClass();
                                listQ14 = AbstractC0149a.y(Boolean.valueOf(webView13.canGoForward()));
                            } catch (Throwable th14) {
                                listQ14 = Z1.f.Q(th14);
                            }
                            lVar.u(listQ14);
                            break;
                        case 14:
                            C1039j c1039j16 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj24 = ((List) obj).get(0);
                            N3.h.c(obj24, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView14 = (WebView) obj24;
                            try {
                                c1039j16.getClass();
                                webView14.goBack();
                                listQ15 = AbstractC0149a.y(null);
                            } catch (Throwable th15) {
                                listQ15 = Z1.f.Q(th15);
                            }
                            lVar.u(listQ15);
                            break;
                        case 15:
                            C1039j c1039j17 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj25 = ((List) obj).get(0);
                            N3.h.c(obj25, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView15 = (WebView) obj25;
                            try {
                                c1039j17.getClass();
                                webView15.reload();
                                listQ16 = AbstractC0149a.y(null);
                            } catch (Throwable th16) {
                                listQ16 = Z1.f.Q(th16);
                            }
                            lVar.u(listQ16);
                            break;
                        case 16:
                            C1039j c1039j18 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj;
                            Object obj26 = list9.get(0);
                            N3.h.c(obj26, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView16 = (WebView) obj26;
                            Object obj27 = list9.get(1);
                            N3.h.c(obj27, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue = ((Boolean) obj27).booleanValue();
                            try {
                                c1039j18.getClass();
                                webView16.clearCache(zBooleanValue);
                                listQ17 = AbstractC0149a.y(null);
                            } catch (Throwable th17) {
                                listQ17 = Z1.f.Q(th17);
                            }
                            lVar.u(listQ17);
                            break;
                        case 17:
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj;
                            Object obj28 = list10.get(0);
                            N3.h.c(obj28, "null cannot be cast to non-null type android.webkit.WebView");
                            Object obj29 = list10.get(1);
                            N3.h.c(obj29, "null cannot be cast to non-null type kotlin.String");
                            C1054y c1054y = new C1054y(lVar, 1);
                            c1039j.getClass();
                            ((WebView) obj28).evaluateJavascript((String) obj29, new C1042m(1, c1054y));
                            break;
                        case 18:
                            C1039j c1039j19 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj30 = ((List) obj).get(0);
                            N3.h.c(obj30, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView17 = (WebView) obj30;
                            try {
                                c1039j19.getClass();
                                listQ18 = AbstractC0149a.y(webView17.getTitle());
                            } catch (Throwable th18) {
                                listQ18 = Z1.f.Q(th18);
                            }
                            lVar.u(listQ18);
                            break;
                        case 19:
                            C1039j c1039j20 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj31 = ((List) obj).get(0);
                            N3.h.c(obj31, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue2 = ((Boolean) obj31).booleanValue();
                            try {
                                c1039j20.getClass();
                                WebView.setWebContentsDebuggingEnabled(zBooleanValue2);
                                listQ19 = AbstractC0149a.y(null);
                            } catch (Throwable th19) {
                                listQ19 = Z1.f.Q(th19);
                            }
                            lVar.u(listQ19);
                            break;
                        case 20:
                            C1039j c1039j21 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj;
                            Object obj32 = list11.get(0);
                            N3.h.c(obj32, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView18 = (WebView) obj32;
                            WebViewClient webViewClient = (WebViewClient) list11.get(1);
                            try {
                                c1039j21.getClass();
                                webView18.setWebViewClient(webViewClient);
                                listQ20 = AbstractC0149a.y(null);
                            } catch (Throwable th20) {
                                listQ20 = Z1.f.Q(th20);
                            }
                            lVar.u(listQ20);
                            break;
                        case 21:
                            C1039j c1039j22 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list12 = (List) obj;
                            Object obj33 = list12.get(0);
                            N3.h.c(obj33, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView19 = (WebView) obj33;
                            Object obj34 = list12.get(1);
                            N3.h.c(obj34, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.JavaScriptChannel");
                            C1048s c1048s = (C1048s) obj34;
                            try {
                                c1039j22.getClass();
                                webView19.addJavascriptInterface(c1048s, c1048s.f11098a);
                                listQ21 = AbstractC0149a.y(null);
                            } catch (Throwable th21) {
                                listQ21 = Z1.f.Q(th21);
                            }
                            lVar.u(listQ21);
                            break;
                        default:
                            C1039j c1039j23 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj;
                            Object obj35 = list13.get(0);
                            N3.h.c(obj35, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView20 = (WebView) obj35;
                            Object obj36 = list13.get(1);
                            N3.h.c(obj36, "null cannot be cast to non-null type kotlin.String");
                            String str11 = (String) obj36;
                            try {
                                c1039j23.getClass();
                                webView20.removeJavascriptInterface(str11);
                                listQ22 = AbstractC0149a.y(null);
                            } catch (Throwable th22) {
                                listQ22 = Z1.f.Q(th22);
                            }
                            lVar.u(listQ22);
                            break;
                    }
                }
            });
        } else {
            iVar6.E(null);
        }
        i iVar7 = new i(interfaceC0696f, "dev.flutter.pigeon.webview_flutter_android.WebView.getUrl", gVar, (C0200z) null);
        if (c1039j != null) {
            final int i10 = 10;
            iVar7.E(new InterfaceC0692b() { // from class: y3.I
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
                    List listQ18;
                    List listQ19;
                    List listQ20;
                    List listQ21;
                    List listQ22;
                    switch (i10) {
                        case 0:
                            C1039j c1039j2 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj2 = ((List) obj).get(0);
                            N3.h.c(obj2, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((C1032c) c1039j2.f11068a.f9n).a(((Long) obj2).longValue(), c1039j2.a());
                                listQ = AbstractC0149a.y(null);
                            } catch (Throwable th) {
                                listQ = Z1.f.Q(th);
                            }
                            lVar.u(listQ);
                            break;
                        case 1:
                            C1039j c1039j3 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj3 = list.get(0);
                            N3.h.c(obj3, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView = (WebView) obj3;
                            DownloadListener downloadListener = (DownloadListener) list.get(1);
                            try {
                                c1039j3.getClass();
                                webView.setDownloadListener(downloadListener);
                                listQ2 = AbstractC0149a.y(null);
                            } catch (Throwable th2) {
                                listQ2 = Z1.f.Q(th2);
                            }
                            lVar.u(listQ2);
                            break;
                        case 2:
                            C1039j c1039j4 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj;
                            Object obj4 = list2.get(0);
                            N3.h.c(obj4, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView2 = (WebView) obj4;
                            Object obj5 = list2.get(1);
                            N3.h.c(obj5, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((C1032c) c1039j4.f11068a.f9n).a(((Long) obj5).longValue(), webView2.getSettings());
                                listQ3 = AbstractC0149a.y(null);
                            } catch (Throwable th3) {
                                listQ3 = Z1.f.Q(th3);
                            }
                            lVar.u(listQ3);
                            break;
                        case 3:
                            C1039j c1039j5 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj;
                            Object obj6 = list3.get(0);
                            N3.h.c(obj6, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView3 = (WebView) obj6;
                            C1022Q c1022q = (C1022Q) list3.get(1);
                            try {
                                c1039j5.getClass();
                                webView3.setWebChromeClient(c1022q);
                                listQ4 = AbstractC0149a.y(null);
                            } catch (Throwable th4) {
                                listQ4 = Z1.f.Q(th4);
                            }
                            lVar.u(listQ4);
                            break;
                        case 4:
                            C1039j c1039j6 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj;
                            Object obj7 = list4.get(0);
                            N3.h.c(obj7, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView4 = (WebView) obj7;
                            Object obj8 = list4.get(1);
                            N3.h.c(obj8, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue = ((Long) obj8).longValue();
                            try {
                                c1039j6.getClass();
                                webView4.setBackgroundColor((int) jLongValue);
                                listQ5 = AbstractC0149a.y(null);
                            } catch (Throwable th5) {
                                listQ5 = Z1.f.Q(th5);
                            }
                            lVar.u(listQ5);
                            break;
                        case 5:
                            C1039j c1039j7 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj9 = ((List) obj).get(0);
                            N3.h.c(obj9, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView5 = (WebView) obj9;
                            try {
                                c1039j7.getClass();
                                webView5.destroy();
                                listQ6 = AbstractC0149a.y(null);
                            } catch (Throwable th6) {
                                listQ6 = Z1.f.Q(th6);
                            }
                            lVar.u(listQ6);
                            break;
                        case O.j.STRING_SET_FIELD_NUMBER /* 6 */:
                            C1039j c1039j8 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj;
                            Object obj10 = list5.get(0);
                            N3.h.c(obj10, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView6 = (WebView) obj10;
                            Object obj11 = list5.get(1);
                            N3.h.c(obj11, "null cannot be cast to non-null type kotlin.String");
                            String str = (String) obj11;
                            String str2 = (String) list5.get(2);
                            String str3 = (String) list5.get(3);
                            try {
                                c1039j8.getClass();
                                webView6.loadData(str, str2, str3);
                                listQ7 = AbstractC0149a.y(null);
                            } catch (Throwable th7) {
                                listQ7 = Z1.f.Q(th7);
                            }
                            lVar.u(listQ7);
                            break;
                        case O.j.DOUBLE_FIELD_NUMBER /* 7 */:
                            C1039j c1039j9 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj;
                            Object obj12 = list6.get(0);
                            N3.h.c(obj12, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView7 = (WebView) obj12;
                            String str4 = (String) list6.get(1);
                            Object obj13 = list6.get(2);
                            N3.h.c(obj13, "null cannot be cast to non-null type kotlin.String");
                            String str5 = (String) obj13;
                            String str6 = (String) list6.get(3);
                            String str7 = (String) list6.get(4);
                            String str8 = (String) list6.get(5);
                            try {
                                c1039j9.getClass();
                                webView7.loadDataWithBaseURL(str4, str5, str6, str7, str8);
                                listQ8 = AbstractC0149a.y(null);
                            } catch (Throwable th8) {
                                listQ8 = Z1.f.Q(th8);
                            }
                            lVar.u(listQ8);
                            break;
                        case O.j.BYTES_FIELD_NUMBER /* 8 */:
                            C1039j c1039j10 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj;
                            Object obj14 = list7.get(0);
                            N3.h.c(obj14, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView8 = (WebView) obj14;
                            Object obj15 = list7.get(1);
                            N3.h.c(obj15, "null cannot be cast to non-null type kotlin.String");
                            String str9 = (String) obj15;
                            Object obj16 = list7.get(2);
                            N3.h.c(obj16, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.String>");
                            Map<String, String> map = (Map) obj16;
                            try {
                                c1039j10.getClass();
                                webView8.loadUrl(str9, map);
                                listQ9 = AbstractC0149a.y(null);
                            } catch (Throwable th9) {
                                listQ9 = Z1.f.Q(th9);
                            }
                            lVar.u(listQ9);
                            break;
                        case 9:
                            C1039j c1039j11 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj;
                            Object obj17 = list8.get(0);
                            N3.h.c(obj17, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView9 = (WebView) obj17;
                            Object obj18 = list8.get(1);
                            N3.h.c(obj18, "null cannot be cast to non-null type kotlin.String");
                            String str10 = (String) obj18;
                            Object obj19 = list8.get(2);
                            N3.h.c(obj19, "null cannot be cast to non-null type kotlin.ByteArray");
                            byte[] bArr = (byte[]) obj19;
                            try {
                                c1039j11.getClass();
                                webView9.postUrl(str10, bArr);
                                listQ10 = AbstractC0149a.y(null);
                            } catch (Throwable th10) {
                                listQ10 = Z1.f.Q(th10);
                            }
                            lVar.u(listQ10);
                            break;
                        case 10:
                            C1039j c1039j12 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj20 = ((List) obj).get(0);
                            N3.h.c(obj20, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView10 = (WebView) obj20;
                            try {
                                c1039j12.getClass();
                                listQ11 = AbstractC0149a.y(webView10.getUrl());
                            } catch (Throwable th11) {
                                listQ11 = Z1.f.Q(th11);
                            }
                            lVar.u(listQ11);
                            break;
                        case 11:
                            C1039j c1039j13 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj21 = ((List) obj).get(0);
                            N3.h.c(obj21, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView11 = (WebView) obj21;
                            try {
                                c1039j13.getClass();
                                webView11.goForward();
                                listQ12 = AbstractC0149a.y(null);
                            } catch (Throwable th12) {
                                listQ12 = Z1.f.Q(th12);
                            }
                            lVar.u(listQ12);
                            break;
                        case 12:
                            C1039j c1039j14 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj22 = ((List) obj).get(0);
                            N3.h.c(obj22, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView12 = (WebView) obj22;
                            try {
                                c1039j14.getClass();
                                listQ13 = AbstractC0149a.y(Boolean.valueOf(webView12.canGoBack()));
                            } catch (Throwable th13) {
                                listQ13 = Z1.f.Q(th13);
                            }
                            lVar.u(listQ13);
                            break;
                        case 13:
                            C1039j c1039j15 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj23 = ((List) obj).get(0);
                            N3.h.c(obj23, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView13 = (WebView) obj23;
                            try {
                                c1039j15.getClass();
                                listQ14 = AbstractC0149a.y(Boolean.valueOf(webView13.canGoForward()));
                            } catch (Throwable th14) {
                                listQ14 = Z1.f.Q(th14);
                            }
                            lVar.u(listQ14);
                            break;
                        case 14:
                            C1039j c1039j16 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj24 = ((List) obj).get(0);
                            N3.h.c(obj24, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView14 = (WebView) obj24;
                            try {
                                c1039j16.getClass();
                                webView14.goBack();
                                listQ15 = AbstractC0149a.y(null);
                            } catch (Throwable th15) {
                                listQ15 = Z1.f.Q(th15);
                            }
                            lVar.u(listQ15);
                            break;
                        case 15:
                            C1039j c1039j17 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj25 = ((List) obj).get(0);
                            N3.h.c(obj25, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView15 = (WebView) obj25;
                            try {
                                c1039j17.getClass();
                                webView15.reload();
                                listQ16 = AbstractC0149a.y(null);
                            } catch (Throwable th16) {
                                listQ16 = Z1.f.Q(th16);
                            }
                            lVar.u(listQ16);
                            break;
                        case 16:
                            C1039j c1039j18 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj;
                            Object obj26 = list9.get(0);
                            N3.h.c(obj26, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView16 = (WebView) obj26;
                            Object obj27 = list9.get(1);
                            N3.h.c(obj27, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue = ((Boolean) obj27).booleanValue();
                            try {
                                c1039j18.getClass();
                                webView16.clearCache(zBooleanValue);
                                listQ17 = AbstractC0149a.y(null);
                            } catch (Throwable th17) {
                                listQ17 = Z1.f.Q(th17);
                            }
                            lVar.u(listQ17);
                            break;
                        case 17:
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj;
                            Object obj28 = list10.get(0);
                            N3.h.c(obj28, "null cannot be cast to non-null type android.webkit.WebView");
                            Object obj29 = list10.get(1);
                            N3.h.c(obj29, "null cannot be cast to non-null type kotlin.String");
                            C1054y c1054y = new C1054y(lVar, 1);
                            c1039j.getClass();
                            ((WebView) obj28).evaluateJavascript((String) obj29, new C1042m(1, c1054y));
                            break;
                        case 18:
                            C1039j c1039j19 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj30 = ((List) obj).get(0);
                            N3.h.c(obj30, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView17 = (WebView) obj30;
                            try {
                                c1039j19.getClass();
                                listQ18 = AbstractC0149a.y(webView17.getTitle());
                            } catch (Throwable th18) {
                                listQ18 = Z1.f.Q(th18);
                            }
                            lVar.u(listQ18);
                            break;
                        case 19:
                            C1039j c1039j20 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj31 = ((List) obj).get(0);
                            N3.h.c(obj31, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue2 = ((Boolean) obj31).booleanValue();
                            try {
                                c1039j20.getClass();
                                WebView.setWebContentsDebuggingEnabled(zBooleanValue2);
                                listQ19 = AbstractC0149a.y(null);
                            } catch (Throwable th19) {
                                listQ19 = Z1.f.Q(th19);
                            }
                            lVar.u(listQ19);
                            break;
                        case 20:
                            C1039j c1039j21 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj;
                            Object obj32 = list11.get(0);
                            N3.h.c(obj32, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView18 = (WebView) obj32;
                            WebViewClient webViewClient = (WebViewClient) list11.get(1);
                            try {
                                c1039j21.getClass();
                                webView18.setWebViewClient(webViewClient);
                                listQ20 = AbstractC0149a.y(null);
                            } catch (Throwable th20) {
                                listQ20 = Z1.f.Q(th20);
                            }
                            lVar.u(listQ20);
                            break;
                        case 21:
                            C1039j c1039j22 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list12 = (List) obj;
                            Object obj33 = list12.get(0);
                            N3.h.c(obj33, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView19 = (WebView) obj33;
                            Object obj34 = list12.get(1);
                            N3.h.c(obj34, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.JavaScriptChannel");
                            C1048s c1048s = (C1048s) obj34;
                            try {
                                c1039j22.getClass();
                                webView19.addJavascriptInterface(c1048s, c1048s.f11098a);
                                listQ21 = AbstractC0149a.y(null);
                            } catch (Throwable th21) {
                                listQ21 = Z1.f.Q(th21);
                            }
                            lVar.u(listQ21);
                            break;
                        default:
                            C1039j c1039j23 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj;
                            Object obj35 = list13.get(0);
                            N3.h.c(obj35, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView20 = (WebView) obj35;
                            Object obj36 = list13.get(1);
                            N3.h.c(obj36, "null cannot be cast to non-null type kotlin.String");
                            String str11 = (String) obj36;
                            try {
                                c1039j23.getClass();
                                webView20.removeJavascriptInterface(str11);
                                listQ22 = AbstractC0149a.y(null);
                            } catch (Throwable th22) {
                                listQ22 = Z1.f.Q(th22);
                            }
                            lVar.u(listQ22);
                            break;
                    }
                }
            });
        } else {
            iVar7.E(null);
        }
        i iVar8 = new i(interfaceC0696f, "dev.flutter.pigeon.webview_flutter_android.WebView.canGoBack", gVar, (C0200z) null);
        if (c1039j != null) {
            final int i11 = 12;
            iVar8.E(new InterfaceC0692b() { // from class: y3.I
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
                    List listQ18;
                    List listQ19;
                    List listQ20;
                    List listQ21;
                    List listQ22;
                    switch (i11) {
                        case 0:
                            C1039j c1039j2 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj2 = ((List) obj).get(0);
                            N3.h.c(obj2, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((C1032c) c1039j2.f11068a.f9n).a(((Long) obj2).longValue(), c1039j2.a());
                                listQ = AbstractC0149a.y(null);
                            } catch (Throwable th) {
                                listQ = Z1.f.Q(th);
                            }
                            lVar.u(listQ);
                            break;
                        case 1:
                            C1039j c1039j3 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj3 = list.get(0);
                            N3.h.c(obj3, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView = (WebView) obj3;
                            DownloadListener downloadListener = (DownloadListener) list.get(1);
                            try {
                                c1039j3.getClass();
                                webView.setDownloadListener(downloadListener);
                                listQ2 = AbstractC0149a.y(null);
                            } catch (Throwable th2) {
                                listQ2 = Z1.f.Q(th2);
                            }
                            lVar.u(listQ2);
                            break;
                        case 2:
                            C1039j c1039j4 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj;
                            Object obj4 = list2.get(0);
                            N3.h.c(obj4, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView2 = (WebView) obj4;
                            Object obj5 = list2.get(1);
                            N3.h.c(obj5, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((C1032c) c1039j4.f11068a.f9n).a(((Long) obj5).longValue(), webView2.getSettings());
                                listQ3 = AbstractC0149a.y(null);
                            } catch (Throwable th3) {
                                listQ3 = Z1.f.Q(th3);
                            }
                            lVar.u(listQ3);
                            break;
                        case 3:
                            C1039j c1039j5 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj;
                            Object obj6 = list3.get(0);
                            N3.h.c(obj6, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView3 = (WebView) obj6;
                            C1022Q c1022q = (C1022Q) list3.get(1);
                            try {
                                c1039j5.getClass();
                                webView3.setWebChromeClient(c1022q);
                                listQ4 = AbstractC0149a.y(null);
                            } catch (Throwable th4) {
                                listQ4 = Z1.f.Q(th4);
                            }
                            lVar.u(listQ4);
                            break;
                        case 4:
                            C1039j c1039j6 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj;
                            Object obj7 = list4.get(0);
                            N3.h.c(obj7, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView4 = (WebView) obj7;
                            Object obj8 = list4.get(1);
                            N3.h.c(obj8, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue = ((Long) obj8).longValue();
                            try {
                                c1039j6.getClass();
                                webView4.setBackgroundColor((int) jLongValue);
                                listQ5 = AbstractC0149a.y(null);
                            } catch (Throwable th5) {
                                listQ5 = Z1.f.Q(th5);
                            }
                            lVar.u(listQ5);
                            break;
                        case 5:
                            C1039j c1039j7 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj9 = ((List) obj).get(0);
                            N3.h.c(obj9, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView5 = (WebView) obj9;
                            try {
                                c1039j7.getClass();
                                webView5.destroy();
                                listQ6 = AbstractC0149a.y(null);
                            } catch (Throwable th6) {
                                listQ6 = Z1.f.Q(th6);
                            }
                            lVar.u(listQ6);
                            break;
                        case O.j.STRING_SET_FIELD_NUMBER /* 6 */:
                            C1039j c1039j8 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj;
                            Object obj10 = list5.get(0);
                            N3.h.c(obj10, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView6 = (WebView) obj10;
                            Object obj11 = list5.get(1);
                            N3.h.c(obj11, "null cannot be cast to non-null type kotlin.String");
                            String str = (String) obj11;
                            String str2 = (String) list5.get(2);
                            String str3 = (String) list5.get(3);
                            try {
                                c1039j8.getClass();
                                webView6.loadData(str, str2, str3);
                                listQ7 = AbstractC0149a.y(null);
                            } catch (Throwable th7) {
                                listQ7 = Z1.f.Q(th7);
                            }
                            lVar.u(listQ7);
                            break;
                        case O.j.DOUBLE_FIELD_NUMBER /* 7 */:
                            C1039j c1039j9 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj;
                            Object obj12 = list6.get(0);
                            N3.h.c(obj12, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView7 = (WebView) obj12;
                            String str4 = (String) list6.get(1);
                            Object obj13 = list6.get(2);
                            N3.h.c(obj13, "null cannot be cast to non-null type kotlin.String");
                            String str5 = (String) obj13;
                            String str6 = (String) list6.get(3);
                            String str7 = (String) list6.get(4);
                            String str8 = (String) list6.get(5);
                            try {
                                c1039j9.getClass();
                                webView7.loadDataWithBaseURL(str4, str5, str6, str7, str8);
                                listQ8 = AbstractC0149a.y(null);
                            } catch (Throwable th8) {
                                listQ8 = Z1.f.Q(th8);
                            }
                            lVar.u(listQ8);
                            break;
                        case O.j.BYTES_FIELD_NUMBER /* 8 */:
                            C1039j c1039j10 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj;
                            Object obj14 = list7.get(0);
                            N3.h.c(obj14, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView8 = (WebView) obj14;
                            Object obj15 = list7.get(1);
                            N3.h.c(obj15, "null cannot be cast to non-null type kotlin.String");
                            String str9 = (String) obj15;
                            Object obj16 = list7.get(2);
                            N3.h.c(obj16, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.String>");
                            Map<String, String> map = (Map) obj16;
                            try {
                                c1039j10.getClass();
                                webView8.loadUrl(str9, map);
                                listQ9 = AbstractC0149a.y(null);
                            } catch (Throwable th9) {
                                listQ9 = Z1.f.Q(th9);
                            }
                            lVar.u(listQ9);
                            break;
                        case 9:
                            C1039j c1039j11 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj;
                            Object obj17 = list8.get(0);
                            N3.h.c(obj17, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView9 = (WebView) obj17;
                            Object obj18 = list8.get(1);
                            N3.h.c(obj18, "null cannot be cast to non-null type kotlin.String");
                            String str10 = (String) obj18;
                            Object obj19 = list8.get(2);
                            N3.h.c(obj19, "null cannot be cast to non-null type kotlin.ByteArray");
                            byte[] bArr = (byte[]) obj19;
                            try {
                                c1039j11.getClass();
                                webView9.postUrl(str10, bArr);
                                listQ10 = AbstractC0149a.y(null);
                            } catch (Throwable th10) {
                                listQ10 = Z1.f.Q(th10);
                            }
                            lVar.u(listQ10);
                            break;
                        case 10:
                            C1039j c1039j12 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj20 = ((List) obj).get(0);
                            N3.h.c(obj20, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView10 = (WebView) obj20;
                            try {
                                c1039j12.getClass();
                                listQ11 = AbstractC0149a.y(webView10.getUrl());
                            } catch (Throwable th11) {
                                listQ11 = Z1.f.Q(th11);
                            }
                            lVar.u(listQ11);
                            break;
                        case 11:
                            C1039j c1039j13 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj21 = ((List) obj).get(0);
                            N3.h.c(obj21, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView11 = (WebView) obj21;
                            try {
                                c1039j13.getClass();
                                webView11.goForward();
                                listQ12 = AbstractC0149a.y(null);
                            } catch (Throwable th12) {
                                listQ12 = Z1.f.Q(th12);
                            }
                            lVar.u(listQ12);
                            break;
                        case 12:
                            C1039j c1039j14 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj22 = ((List) obj).get(0);
                            N3.h.c(obj22, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView12 = (WebView) obj22;
                            try {
                                c1039j14.getClass();
                                listQ13 = AbstractC0149a.y(Boolean.valueOf(webView12.canGoBack()));
                            } catch (Throwable th13) {
                                listQ13 = Z1.f.Q(th13);
                            }
                            lVar.u(listQ13);
                            break;
                        case 13:
                            C1039j c1039j15 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj23 = ((List) obj).get(0);
                            N3.h.c(obj23, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView13 = (WebView) obj23;
                            try {
                                c1039j15.getClass();
                                listQ14 = AbstractC0149a.y(Boolean.valueOf(webView13.canGoForward()));
                            } catch (Throwable th14) {
                                listQ14 = Z1.f.Q(th14);
                            }
                            lVar.u(listQ14);
                            break;
                        case 14:
                            C1039j c1039j16 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj24 = ((List) obj).get(0);
                            N3.h.c(obj24, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView14 = (WebView) obj24;
                            try {
                                c1039j16.getClass();
                                webView14.goBack();
                                listQ15 = AbstractC0149a.y(null);
                            } catch (Throwable th15) {
                                listQ15 = Z1.f.Q(th15);
                            }
                            lVar.u(listQ15);
                            break;
                        case 15:
                            C1039j c1039j17 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj25 = ((List) obj).get(0);
                            N3.h.c(obj25, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView15 = (WebView) obj25;
                            try {
                                c1039j17.getClass();
                                webView15.reload();
                                listQ16 = AbstractC0149a.y(null);
                            } catch (Throwable th16) {
                                listQ16 = Z1.f.Q(th16);
                            }
                            lVar.u(listQ16);
                            break;
                        case 16:
                            C1039j c1039j18 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj;
                            Object obj26 = list9.get(0);
                            N3.h.c(obj26, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView16 = (WebView) obj26;
                            Object obj27 = list9.get(1);
                            N3.h.c(obj27, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue = ((Boolean) obj27).booleanValue();
                            try {
                                c1039j18.getClass();
                                webView16.clearCache(zBooleanValue);
                                listQ17 = AbstractC0149a.y(null);
                            } catch (Throwable th17) {
                                listQ17 = Z1.f.Q(th17);
                            }
                            lVar.u(listQ17);
                            break;
                        case 17:
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj;
                            Object obj28 = list10.get(0);
                            N3.h.c(obj28, "null cannot be cast to non-null type android.webkit.WebView");
                            Object obj29 = list10.get(1);
                            N3.h.c(obj29, "null cannot be cast to non-null type kotlin.String");
                            C1054y c1054y = new C1054y(lVar, 1);
                            c1039j.getClass();
                            ((WebView) obj28).evaluateJavascript((String) obj29, new C1042m(1, c1054y));
                            break;
                        case 18:
                            C1039j c1039j19 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj30 = ((List) obj).get(0);
                            N3.h.c(obj30, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView17 = (WebView) obj30;
                            try {
                                c1039j19.getClass();
                                listQ18 = AbstractC0149a.y(webView17.getTitle());
                            } catch (Throwable th18) {
                                listQ18 = Z1.f.Q(th18);
                            }
                            lVar.u(listQ18);
                            break;
                        case 19:
                            C1039j c1039j20 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj31 = ((List) obj).get(0);
                            N3.h.c(obj31, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue2 = ((Boolean) obj31).booleanValue();
                            try {
                                c1039j20.getClass();
                                WebView.setWebContentsDebuggingEnabled(zBooleanValue2);
                                listQ19 = AbstractC0149a.y(null);
                            } catch (Throwable th19) {
                                listQ19 = Z1.f.Q(th19);
                            }
                            lVar.u(listQ19);
                            break;
                        case 20:
                            C1039j c1039j21 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj;
                            Object obj32 = list11.get(0);
                            N3.h.c(obj32, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView18 = (WebView) obj32;
                            WebViewClient webViewClient = (WebViewClient) list11.get(1);
                            try {
                                c1039j21.getClass();
                                webView18.setWebViewClient(webViewClient);
                                listQ20 = AbstractC0149a.y(null);
                            } catch (Throwable th20) {
                                listQ20 = Z1.f.Q(th20);
                            }
                            lVar.u(listQ20);
                            break;
                        case 21:
                            C1039j c1039j22 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list12 = (List) obj;
                            Object obj33 = list12.get(0);
                            N3.h.c(obj33, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView19 = (WebView) obj33;
                            Object obj34 = list12.get(1);
                            N3.h.c(obj34, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.JavaScriptChannel");
                            C1048s c1048s = (C1048s) obj34;
                            try {
                                c1039j22.getClass();
                                webView19.addJavascriptInterface(c1048s, c1048s.f11098a);
                                listQ21 = AbstractC0149a.y(null);
                            } catch (Throwable th21) {
                                listQ21 = Z1.f.Q(th21);
                            }
                            lVar.u(listQ21);
                            break;
                        default:
                            C1039j c1039j23 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj;
                            Object obj35 = list13.get(0);
                            N3.h.c(obj35, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView20 = (WebView) obj35;
                            Object obj36 = list13.get(1);
                            N3.h.c(obj36, "null cannot be cast to non-null type kotlin.String");
                            String str11 = (String) obj36;
                            try {
                                c1039j23.getClass();
                                webView20.removeJavascriptInterface(str11);
                                listQ22 = AbstractC0149a.y(null);
                            } catch (Throwable th22) {
                                listQ22 = Z1.f.Q(th22);
                            }
                            lVar.u(listQ22);
                            break;
                    }
                }
            });
        } else {
            iVar8.E(null);
        }
        i iVar9 = new i(interfaceC0696f, "dev.flutter.pigeon.webview_flutter_android.WebView.canGoForward", gVar, (C0200z) null);
        if (c1039j != null) {
            final int i12 = 13;
            iVar9.E(new InterfaceC0692b() { // from class: y3.I
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
                    List listQ18;
                    List listQ19;
                    List listQ20;
                    List listQ21;
                    List listQ22;
                    switch (i12) {
                        case 0:
                            C1039j c1039j2 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj2 = ((List) obj).get(0);
                            N3.h.c(obj2, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((C1032c) c1039j2.f11068a.f9n).a(((Long) obj2).longValue(), c1039j2.a());
                                listQ = AbstractC0149a.y(null);
                            } catch (Throwable th) {
                                listQ = Z1.f.Q(th);
                            }
                            lVar.u(listQ);
                            break;
                        case 1:
                            C1039j c1039j3 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj3 = list.get(0);
                            N3.h.c(obj3, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView = (WebView) obj3;
                            DownloadListener downloadListener = (DownloadListener) list.get(1);
                            try {
                                c1039j3.getClass();
                                webView.setDownloadListener(downloadListener);
                                listQ2 = AbstractC0149a.y(null);
                            } catch (Throwable th2) {
                                listQ2 = Z1.f.Q(th2);
                            }
                            lVar.u(listQ2);
                            break;
                        case 2:
                            C1039j c1039j4 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj;
                            Object obj4 = list2.get(0);
                            N3.h.c(obj4, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView2 = (WebView) obj4;
                            Object obj5 = list2.get(1);
                            N3.h.c(obj5, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((C1032c) c1039j4.f11068a.f9n).a(((Long) obj5).longValue(), webView2.getSettings());
                                listQ3 = AbstractC0149a.y(null);
                            } catch (Throwable th3) {
                                listQ3 = Z1.f.Q(th3);
                            }
                            lVar.u(listQ3);
                            break;
                        case 3:
                            C1039j c1039j5 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj;
                            Object obj6 = list3.get(0);
                            N3.h.c(obj6, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView3 = (WebView) obj6;
                            C1022Q c1022q = (C1022Q) list3.get(1);
                            try {
                                c1039j5.getClass();
                                webView3.setWebChromeClient(c1022q);
                                listQ4 = AbstractC0149a.y(null);
                            } catch (Throwable th4) {
                                listQ4 = Z1.f.Q(th4);
                            }
                            lVar.u(listQ4);
                            break;
                        case 4:
                            C1039j c1039j6 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj;
                            Object obj7 = list4.get(0);
                            N3.h.c(obj7, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView4 = (WebView) obj7;
                            Object obj8 = list4.get(1);
                            N3.h.c(obj8, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue = ((Long) obj8).longValue();
                            try {
                                c1039j6.getClass();
                                webView4.setBackgroundColor((int) jLongValue);
                                listQ5 = AbstractC0149a.y(null);
                            } catch (Throwable th5) {
                                listQ5 = Z1.f.Q(th5);
                            }
                            lVar.u(listQ5);
                            break;
                        case 5:
                            C1039j c1039j7 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj9 = ((List) obj).get(0);
                            N3.h.c(obj9, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView5 = (WebView) obj9;
                            try {
                                c1039j7.getClass();
                                webView5.destroy();
                                listQ6 = AbstractC0149a.y(null);
                            } catch (Throwable th6) {
                                listQ6 = Z1.f.Q(th6);
                            }
                            lVar.u(listQ6);
                            break;
                        case O.j.STRING_SET_FIELD_NUMBER /* 6 */:
                            C1039j c1039j8 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj;
                            Object obj10 = list5.get(0);
                            N3.h.c(obj10, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView6 = (WebView) obj10;
                            Object obj11 = list5.get(1);
                            N3.h.c(obj11, "null cannot be cast to non-null type kotlin.String");
                            String str = (String) obj11;
                            String str2 = (String) list5.get(2);
                            String str3 = (String) list5.get(3);
                            try {
                                c1039j8.getClass();
                                webView6.loadData(str, str2, str3);
                                listQ7 = AbstractC0149a.y(null);
                            } catch (Throwable th7) {
                                listQ7 = Z1.f.Q(th7);
                            }
                            lVar.u(listQ7);
                            break;
                        case O.j.DOUBLE_FIELD_NUMBER /* 7 */:
                            C1039j c1039j9 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj;
                            Object obj12 = list6.get(0);
                            N3.h.c(obj12, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView7 = (WebView) obj12;
                            String str4 = (String) list6.get(1);
                            Object obj13 = list6.get(2);
                            N3.h.c(obj13, "null cannot be cast to non-null type kotlin.String");
                            String str5 = (String) obj13;
                            String str6 = (String) list6.get(3);
                            String str7 = (String) list6.get(4);
                            String str8 = (String) list6.get(5);
                            try {
                                c1039j9.getClass();
                                webView7.loadDataWithBaseURL(str4, str5, str6, str7, str8);
                                listQ8 = AbstractC0149a.y(null);
                            } catch (Throwable th8) {
                                listQ8 = Z1.f.Q(th8);
                            }
                            lVar.u(listQ8);
                            break;
                        case O.j.BYTES_FIELD_NUMBER /* 8 */:
                            C1039j c1039j10 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj;
                            Object obj14 = list7.get(0);
                            N3.h.c(obj14, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView8 = (WebView) obj14;
                            Object obj15 = list7.get(1);
                            N3.h.c(obj15, "null cannot be cast to non-null type kotlin.String");
                            String str9 = (String) obj15;
                            Object obj16 = list7.get(2);
                            N3.h.c(obj16, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.String>");
                            Map<String, String> map = (Map) obj16;
                            try {
                                c1039j10.getClass();
                                webView8.loadUrl(str9, map);
                                listQ9 = AbstractC0149a.y(null);
                            } catch (Throwable th9) {
                                listQ9 = Z1.f.Q(th9);
                            }
                            lVar.u(listQ9);
                            break;
                        case 9:
                            C1039j c1039j11 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj;
                            Object obj17 = list8.get(0);
                            N3.h.c(obj17, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView9 = (WebView) obj17;
                            Object obj18 = list8.get(1);
                            N3.h.c(obj18, "null cannot be cast to non-null type kotlin.String");
                            String str10 = (String) obj18;
                            Object obj19 = list8.get(2);
                            N3.h.c(obj19, "null cannot be cast to non-null type kotlin.ByteArray");
                            byte[] bArr = (byte[]) obj19;
                            try {
                                c1039j11.getClass();
                                webView9.postUrl(str10, bArr);
                                listQ10 = AbstractC0149a.y(null);
                            } catch (Throwable th10) {
                                listQ10 = Z1.f.Q(th10);
                            }
                            lVar.u(listQ10);
                            break;
                        case 10:
                            C1039j c1039j12 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj20 = ((List) obj).get(0);
                            N3.h.c(obj20, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView10 = (WebView) obj20;
                            try {
                                c1039j12.getClass();
                                listQ11 = AbstractC0149a.y(webView10.getUrl());
                            } catch (Throwable th11) {
                                listQ11 = Z1.f.Q(th11);
                            }
                            lVar.u(listQ11);
                            break;
                        case 11:
                            C1039j c1039j13 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj21 = ((List) obj).get(0);
                            N3.h.c(obj21, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView11 = (WebView) obj21;
                            try {
                                c1039j13.getClass();
                                webView11.goForward();
                                listQ12 = AbstractC0149a.y(null);
                            } catch (Throwable th12) {
                                listQ12 = Z1.f.Q(th12);
                            }
                            lVar.u(listQ12);
                            break;
                        case 12:
                            C1039j c1039j14 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj22 = ((List) obj).get(0);
                            N3.h.c(obj22, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView12 = (WebView) obj22;
                            try {
                                c1039j14.getClass();
                                listQ13 = AbstractC0149a.y(Boolean.valueOf(webView12.canGoBack()));
                            } catch (Throwable th13) {
                                listQ13 = Z1.f.Q(th13);
                            }
                            lVar.u(listQ13);
                            break;
                        case 13:
                            C1039j c1039j15 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj23 = ((List) obj).get(0);
                            N3.h.c(obj23, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView13 = (WebView) obj23;
                            try {
                                c1039j15.getClass();
                                listQ14 = AbstractC0149a.y(Boolean.valueOf(webView13.canGoForward()));
                            } catch (Throwable th14) {
                                listQ14 = Z1.f.Q(th14);
                            }
                            lVar.u(listQ14);
                            break;
                        case 14:
                            C1039j c1039j16 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj24 = ((List) obj).get(0);
                            N3.h.c(obj24, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView14 = (WebView) obj24;
                            try {
                                c1039j16.getClass();
                                webView14.goBack();
                                listQ15 = AbstractC0149a.y(null);
                            } catch (Throwable th15) {
                                listQ15 = Z1.f.Q(th15);
                            }
                            lVar.u(listQ15);
                            break;
                        case 15:
                            C1039j c1039j17 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj25 = ((List) obj).get(0);
                            N3.h.c(obj25, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView15 = (WebView) obj25;
                            try {
                                c1039j17.getClass();
                                webView15.reload();
                                listQ16 = AbstractC0149a.y(null);
                            } catch (Throwable th16) {
                                listQ16 = Z1.f.Q(th16);
                            }
                            lVar.u(listQ16);
                            break;
                        case 16:
                            C1039j c1039j18 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj;
                            Object obj26 = list9.get(0);
                            N3.h.c(obj26, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView16 = (WebView) obj26;
                            Object obj27 = list9.get(1);
                            N3.h.c(obj27, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue = ((Boolean) obj27).booleanValue();
                            try {
                                c1039j18.getClass();
                                webView16.clearCache(zBooleanValue);
                                listQ17 = AbstractC0149a.y(null);
                            } catch (Throwable th17) {
                                listQ17 = Z1.f.Q(th17);
                            }
                            lVar.u(listQ17);
                            break;
                        case 17:
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj;
                            Object obj28 = list10.get(0);
                            N3.h.c(obj28, "null cannot be cast to non-null type android.webkit.WebView");
                            Object obj29 = list10.get(1);
                            N3.h.c(obj29, "null cannot be cast to non-null type kotlin.String");
                            C1054y c1054y = new C1054y(lVar, 1);
                            c1039j.getClass();
                            ((WebView) obj28).evaluateJavascript((String) obj29, new C1042m(1, c1054y));
                            break;
                        case 18:
                            C1039j c1039j19 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj30 = ((List) obj).get(0);
                            N3.h.c(obj30, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView17 = (WebView) obj30;
                            try {
                                c1039j19.getClass();
                                listQ18 = AbstractC0149a.y(webView17.getTitle());
                            } catch (Throwable th18) {
                                listQ18 = Z1.f.Q(th18);
                            }
                            lVar.u(listQ18);
                            break;
                        case 19:
                            C1039j c1039j20 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj31 = ((List) obj).get(0);
                            N3.h.c(obj31, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue2 = ((Boolean) obj31).booleanValue();
                            try {
                                c1039j20.getClass();
                                WebView.setWebContentsDebuggingEnabled(zBooleanValue2);
                                listQ19 = AbstractC0149a.y(null);
                            } catch (Throwable th19) {
                                listQ19 = Z1.f.Q(th19);
                            }
                            lVar.u(listQ19);
                            break;
                        case 20:
                            C1039j c1039j21 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj;
                            Object obj32 = list11.get(0);
                            N3.h.c(obj32, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView18 = (WebView) obj32;
                            WebViewClient webViewClient = (WebViewClient) list11.get(1);
                            try {
                                c1039j21.getClass();
                                webView18.setWebViewClient(webViewClient);
                                listQ20 = AbstractC0149a.y(null);
                            } catch (Throwable th20) {
                                listQ20 = Z1.f.Q(th20);
                            }
                            lVar.u(listQ20);
                            break;
                        case 21:
                            C1039j c1039j22 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list12 = (List) obj;
                            Object obj33 = list12.get(0);
                            N3.h.c(obj33, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView19 = (WebView) obj33;
                            Object obj34 = list12.get(1);
                            N3.h.c(obj34, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.JavaScriptChannel");
                            C1048s c1048s = (C1048s) obj34;
                            try {
                                c1039j22.getClass();
                                webView19.addJavascriptInterface(c1048s, c1048s.f11098a);
                                listQ21 = AbstractC0149a.y(null);
                            } catch (Throwable th21) {
                                listQ21 = Z1.f.Q(th21);
                            }
                            lVar.u(listQ21);
                            break;
                        default:
                            C1039j c1039j23 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj;
                            Object obj35 = list13.get(0);
                            N3.h.c(obj35, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView20 = (WebView) obj35;
                            Object obj36 = list13.get(1);
                            N3.h.c(obj36, "null cannot be cast to non-null type kotlin.String");
                            String str11 = (String) obj36;
                            try {
                                c1039j23.getClass();
                                webView20.removeJavascriptInterface(str11);
                                listQ22 = AbstractC0149a.y(null);
                            } catch (Throwable th22) {
                                listQ22 = Z1.f.Q(th22);
                            }
                            lVar.u(listQ22);
                            break;
                    }
                }
            });
        } else {
            iVar9.E(null);
        }
        i iVar10 = new i(interfaceC0696f, "dev.flutter.pigeon.webview_flutter_android.WebView.goBack", gVar, (C0200z) null);
        if (c1039j != null) {
            final int i13 = 14;
            iVar10.E(new InterfaceC0692b() { // from class: y3.I
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
                    List listQ18;
                    List listQ19;
                    List listQ20;
                    List listQ21;
                    List listQ22;
                    switch (i13) {
                        case 0:
                            C1039j c1039j2 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj2 = ((List) obj).get(0);
                            N3.h.c(obj2, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((C1032c) c1039j2.f11068a.f9n).a(((Long) obj2).longValue(), c1039j2.a());
                                listQ = AbstractC0149a.y(null);
                            } catch (Throwable th) {
                                listQ = Z1.f.Q(th);
                            }
                            lVar.u(listQ);
                            break;
                        case 1:
                            C1039j c1039j3 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj3 = list.get(0);
                            N3.h.c(obj3, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView = (WebView) obj3;
                            DownloadListener downloadListener = (DownloadListener) list.get(1);
                            try {
                                c1039j3.getClass();
                                webView.setDownloadListener(downloadListener);
                                listQ2 = AbstractC0149a.y(null);
                            } catch (Throwable th2) {
                                listQ2 = Z1.f.Q(th2);
                            }
                            lVar.u(listQ2);
                            break;
                        case 2:
                            C1039j c1039j4 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj;
                            Object obj4 = list2.get(0);
                            N3.h.c(obj4, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView2 = (WebView) obj4;
                            Object obj5 = list2.get(1);
                            N3.h.c(obj5, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((C1032c) c1039j4.f11068a.f9n).a(((Long) obj5).longValue(), webView2.getSettings());
                                listQ3 = AbstractC0149a.y(null);
                            } catch (Throwable th3) {
                                listQ3 = Z1.f.Q(th3);
                            }
                            lVar.u(listQ3);
                            break;
                        case 3:
                            C1039j c1039j5 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj;
                            Object obj6 = list3.get(0);
                            N3.h.c(obj6, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView3 = (WebView) obj6;
                            C1022Q c1022q = (C1022Q) list3.get(1);
                            try {
                                c1039j5.getClass();
                                webView3.setWebChromeClient(c1022q);
                                listQ4 = AbstractC0149a.y(null);
                            } catch (Throwable th4) {
                                listQ4 = Z1.f.Q(th4);
                            }
                            lVar.u(listQ4);
                            break;
                        case 4:
                            C1039j c1039j6 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj;
                            Object obj7 = list4.get(0);
                            N3.h.c(obj7, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView4 = (WebView) obj7;
                            Object obj8 = list4.get(1);
                            N3.h.c(obj8, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue = ((Long) obj8).longValue();
                            try {
                                c1039j6.getClass();
                                webView4.setBackgroundColor((int) jLongValue);
                                listQ5 = AbstractC0149a.y(null);
                            } catch (Throwable th5) {
                                listQ5 = Z1.f.Q(th5);
                            }
                            lVar.u(listQ5);
                            break;
                        case 5:
                            C1039j c1039j7 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj9 = ((List) obj).get(0);
                            N3.h.c(obj9, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView5 = (WebView) obj9;
                            try {
                                c1039j7.getClass();
                                webView5.destroy();
                                listQ6 = AbstractC0149a.y(null);
                            } catch (Throwable th6) {
                                listQ6 = Z1.f.Q(th6);
                            }
                            lVar.u(listQ6);
                            break;
                        case O.j.STRING_SET_FIELD_NUMBER /* 6 */:
                            C1039j c1039j8 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj;
                            Object obj10 = list5.get(0);
                            N3.h.c(obj10, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView6 = (WebView) obj10;
                            Object obj11 = list5.get(1);
                            N3.h.c(obj11, "null cannot be cast to non-null type kotlin.String");
                            String str = (String) obj11;
                            String str2 = (String) list5.get(2);
                            String str3 = (String) list5.get(3);
                            try {
                                c1039j8.getClass();
                                webView6.loadData(str, str2, str3);
                                listQ7 = AbstractC0149a.y(null);
                            } catch (Throwable th7) {
                                listQ7 = Z1.f.Q(th7);
                            }
                            lVar.u(listQ7);
                            break;
                        case O.j.DOUBLE_FIELD_NUMBER /* 7 */:
                            C1039j c1039j9 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj;
                            Object obj12 = list6.get(0);
                            N3.h.c(obj12, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView7 = (WebView) obj12;
                            String str4 = (String) list6.get(1);
                            Object obj13 = list6.get(2);
                            N3.h.c(obj13, "null cannot be cast to non-null type kotlin.String");
                            String str5 = (String) obj13;
                            String str6 = (String) list6.get(3);
                            String str7 = (String) list6.get(4);
                            String str8 = (String) list6.get(5);
                            try {
                                c1039j9.getClass();
                                webView7.loadDataWithBaseURL(str4, str5, str6, str7, str8);
                                listQ8 = AbstractC0149a.y(null);
                            } catch (Throwable th8) {
                                listQ8 = Z1.f.Q(th8);
                            }
                            lVar.u(listQ8);
                            break;
                        case O.j.BYTES_FIELD_NUMBER /* 8 */:
                            C1039j c1039j10 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj;
                            Object obj14 = list7.get(0);
                            N3.h.c(obj14, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView8 = (WebView) obj14;
                            Object obj15 = list7.get(1);
                            N3.h.c(obj15, "null cannot be cast to non-null type kotlin.String");
                            String str9 = (String) obj15;
                            Object obj16 = list7.get(2);
                            N3.h.c(obj16, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.String>");
                            Map<String, String> map = (Map) obj16;
                            try {
                                c1039j10.getClass();
                                webView8.loadUrl(str9, map);
                                listQ9 = AbstractC0149a.y(null);
                            } catch (Throwable th9) {
                                listQ9 = Z1.f.Q(th9);
                            }
                            lVar.u(listQ9);
                            break;
                        case 9:
                            C1039j c1039j11 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj;
                            Object obj17 = list8.get(0);
                            N3.h.c(obj17, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView9 = (WebView) obj17;
                            Object obj18 = list8.get(1);
                            N3.h.c(obj18, "null cannot be cast to non-null type kotlin.String");
                            String str10 = (String) obj18;
                            Object obj19 = list8.get(2);
                            N3.h.c(obj19, "null cannot be cast to non-null type kotlin.ByteArray");
                            byte[] bArr = (byte[]) obj19;
                            try {
                                c1039j11.getClass();
                                webView9.postUrl(str10, bArr);
                                listQ10 = AbstractC0149a.y(null);
                            } catch (Throwable th10) {
                                listQ10 = Z1.f.Q(th10);
                            }
                            lVar.u(listQ10);
                            break;
                        case 10:
                            C1039j c1039j12 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj20 = ((List) obj).get(0);
                            N3.h.c(obj20, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView10 = (WebView) obj20;
                            try {
                                c1039j12.getClass();
                                listQ11 = AbstractC0149a.y(webView10.getUrl());
                            } catch (Throwable th11) {
                                listQ11 = Z1.f.Q(th11);
                            }
                            lVar.u(listQ11);
                            break;
                        case 11:
                            C1039j c1039j13 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj21 = ((List) obj).get(0);
                            N3.h.c(obj21, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView11 = (WebView) obj21;
                            try {
                                c1039j13.getClass();
                                webView11.goForward();
                                listQ12 = AbstractC0149a.y(null);
                            } catch (Throwable th12) {
                                listQ12 = Z1.f.Q(th12);
                            }
                            lVar.u(listQ12);
                            break;
                        case 12:
                            C1039j c1039j14 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj22 = ((List) obj).get(0);
                            N3.h.c(obj22, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView12 = (WebView) obj22;
                            try {
                                c1039j14.getClass();
                                listQ13 = AbstractC0149a.y(Boolean.valueOf(webView12.canGoBack()));
                            } catch (Throwable th13) {
                                listQ13 = Z1.f.Q(th13);
                            }
                            lVar.u(listQ13);
                            break;
                        case 13:
                            C1039j c1039j15 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj23 = ((List) obj).get(0);
                            N3.h.c(obj23, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView13 = (WebView) obj23;
                            try {
                                c1039j15.getClass();
                                listQ14 = AbstractC0149a.y(Boolean.valueOf(webView13.canGoForward()));
                            } catch (Throwable th14) {
                                listQ14 = Z1.f.Q(th14);
                            }
                            lVar.u(listQ14);
                            break;
                        case 14:
                            C1039j c1039j16 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj24 = ((List) obj).get(0);
                            N3.h.c(obj24, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView14 = (WebView) obj24;
                            try {
                                c1039j16.getClass();
                                webView14.goBack();
                                listQ15 = AbstractC0149a.y(null);
                            } catch (Throwable th15) {
                                listQ15 = Z1.f.Q(th15);
                            }
                            lVar.u(listQ15);
                            break;
                        case 15:
                            C1039j c1039j17 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj25 = ((List) obj).get(0);
                            N3.h.c(obj25, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView15 = (WebView) obj25;
                            try {
                                c1039j17.getClass();
                                webView15.reload();
                                listQ16 = AbstractC0149a.y(null);
                            } catch (Throwable th16) {
                                listQ16 = Z1.f.Q(th16);
                            }
                            lVar.u(listQ16);
                            break;
                        case 16:
                            C1039j c1039j18 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj;
                            Object obj26 = list9.get(0);
                            N3.h.c(obj26, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView16 = (WebView) obj26;
                            Object obj27 = list9.get(1);
                            N3.h.c(obj27, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue = ((Boolean) obj27).booleanValue();
                            try {
                                c1039j18.getClass();
                                webView16.clearCache(zBooleanValue);
                                listQ17 = AbstractC0149a.y(null);
                            } catch (Throwable th17) {
                                listQ17 = Z1.f.Q(th17);
                            }
                            lVar.u(listQ17);
                            break;
                        case 17:
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj;
                            Object obj28 = list10.get(0);
                            N3.h.c(obj28, "null cannot be cast to non-null type android.webkit.WebView");
                            Object obj29 = list10.get(1);
                            N3.h.c(obj29, "null cannot be cast to non-null type kotlin.String");
                            C1054y c1054y = new C1054y(lVar, 1);
                            c1039j.getClass();
                            ((WebView) obj28).evaluateJavascript((String) obj29, new C1042m(1, c1054y));
                            break;
                        case 18:
                            C1039j c1039j19 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj30 = ((List) obj).get(0);
                            N3.h.c(obj30, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView17 = (WebView) obj30;
                            try {
                                c1039j19.getClass();
                                listQ18 = AbstractC0149a.y(webView17.getTitle());
                            } catch (Throwable th18) {
                                listQ18 = Z1.f.Q(th18);
                            }
                            lVar.u(listQ18);
                            break;
                        case 19:
                            C1039j c1039j20 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj31 = ((List) obj).get(0);
                            N3.h.c(obj31, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue2 = ((Boolean) obj31).booleanValue();
                            try {
                                c1039j20.getClass();
                                WebView.setWebContentsDebuggingEnabled(zBooleanValue2);
                                listQ19 = AbstractC0149a.y(null);
                            } catch (Throwable th19) {
                                listQ19 = Z1.f.Q(th19);
                            }
                            lVar.u(listQ19);
                            break;
                        case 20:
                            C1039j c1039j21 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj;
                            Object obj32 = list11.get(0);
                            N3.h.c(obj32, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView18 = (WebView) obj32;
                            WebViewClient webViewClient = (WebViewClient) list11.get(1);
                            try {
                                c1039j21.getClass();
                                webView18.setWebViewClient(webViewClient);
                                listQ20 = AbstractC0149a.y(null);
                            } catch (Throwable th20) {
                                listQ20 = Z1.f.Q(th20);
                            }
                            lVar.u(listQ20);
                            break;
                        case 21:
                            C1039j c1039j22 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list12 = (List) obj;
                            Object obj33 = list12.get(0);
                            N3.h.c(obj33, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView19 = (WebView) obj33;
                            Object obj34 = list12.get(1);
                            N3.h.c(obj34, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.JavaScriptChannel");
                            C1048s c1048s = (C1048s) obj34;
                            try {
                                c1039j22.getClass();
                                webView19.addJavascriptInterface(c1048s, c1048s.f11098a);
                                listQ21 = AbstractC0149a.y(null);
                            } catch (Throwable th21) {
                                listQ21 = Z1.f.Q(th21);
                            }
                            lVar.u(listQ21);
                            break;
                        default:
                            C1039j c1039j23 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj;
                            Object obj35 = list13.get(0);
                            N3.h.c(obj35, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView20 = (WebView) obj35;
                            Object obj36 = list13.get(1);
                            N3.h.c(obj36, "null cannot be cast to non-null type kotlin.String");
                            String str11 = (String) obj36;
                            try {
                                c1039j23.getClass();
                                webView20.removeJavascriptInterface(str11);
                                listQ22 = AbstractC0149a.y(null);
                            } catch (Throwable th22) {
                                listQ22 = Z1.f.Q(th22);
                            }
                            lVar.u(listQ22);
                            break;
                    }
                }
            });
        } else {
            iVar10.E(null);
        }
        i iVar11 = new i(interfaceC0696f, "dev.flutter.pigeon.webview_flutter_android.WebView.goForward", gVar, (C0200z) null);
        if (c1039j != null) {
            final int i14 = 11;
            iVar11.E(new InterfaceC0692b() { // from class: y3.I
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
                    List listQ18;
                    List listQ19;
                    List listQ20;
                    List listQ21;
                    List listQ22;
                    switch (i14) {
                        case 0:
                            C1039j c1039j2 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj2 = ((List) obj).get(0);
                            N3.h.c(obj2, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((C1032c) c1039j2.f11068a.f9n).a(((Long) obj2).longValue(), c1039j2.a());
                                listQ = AbstractC0149a.y(null);
                            } catch (Throwable th) {
                                listQ = Z1.f.Q(th);
                            }
                            lVar.u(listQ);
                            break;
                        case 1:
                            C1039j c1039j3 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj3 = list.get(0);
                            N3.h.c(obj3, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView = (WebView) obj3;
                            DownloadListener downloadListener = (DownloadListener) list.get(1);
                            try {
                                c1039j3.getClass();
                                webView.setDownloadListener(downloadListener);
                                listQ2 = AbstractC0149a.y(null);
                            } catch (Throwable th2) {
                                listQ2 = Z1.f.Q(th2);
                            }
                            lVar.u(listQ2);
                            break;
                        case 2:
                            C1039j c1039j4 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj;
                            Object obj4 = list2.get(0);
                            N3.h.c(obj4, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView2 = (WebView) obj4;
                            Object obj5 = list2.get(1);
                            N3.h.c(obj5, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((C1032c) c1039j4.f11068a.f9n).a(((Long) obj5).longValue(), webView2.getSettings());
                                listQ3 = AbstractC0149a.y(null);
                            } catch (Throwable th3) {
                                listQ3 = Z1.f.Q(th3);
                            }
                            lVar.u(listQ3);
                            break;
                        case 3:
                            C1039j c1039j5 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj;
                            Object obj6 = list3.get(0);
                            N3.h.c(obj6, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView3 = (WebView) obj6;
                            C1022Q c1022q = (C1022Q) list3.get(1);
                            try {
                                c1039j5.getClass();
                                webView3.setWebChromeClient(c1022q);
                                listQ4 = AbstractC0149a.y(null);
                            } catch (Throwable th4) {
                                listQ4 = Z1.f.Q(th4);
                            }
                            lVar.u(listQ4);
                            break;
                        case 4:
                            C1039j c1039j6 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj;
                            Object obj7 = list4.get(0);
                            N3.h.c(obj7, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView4 = (WebView) obj7;
                            Object obj8 = list4.get(1);
                            N3.h.c(obj8, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue = ((Long) obj8).longValue();
                            try {
                                c1039j6.getClass();
                                webView4.setBackgroundColor((int) jLongValue);
                                listQ5 = AbstractC0149a.y(null);
                            } catch (Throwable th5) {
                                listQ5 = Z1.f.Q(th5);
                            }
                            lVar.u(listQ5);
                            break;
                        case 5:
                            C1039j c1039j7 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj9 = ((List) obj).get(0);
                            N3.h.c(obj9, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView5 = (WebView) obj9;
                            try {
                                c1039j7.getClass();
                                webView5.destroy();
                                listQ6 = AbstractC0149a.y(null);
                            } catch (Throwable th6) {
                                listQ6 = Z1.f.Q(th6);
                            }
                            lVar.u(listQ6);
                            break;
                        case O.j.STRING_SET_FIELD_NUMBER /* 6 */:
                            C1039j c1039j8 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj;
                            Object obj10 = list5.get(0);
                            N3.h.c(obj10, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView6 = (WebView) obj10;
                            Object obj11 = list5.get(1);
                            N3.h.c(obj11, "null cannot be cast to non-null type kotlin.String");
                            String str = (String) obj11;
                            String str2 = (String) list5.get(2);
                            String str3 = (String) list5.get(3);
                            try {
                                c1039j8.getClass();
                                webView6.loadData(str, str2, str3);
                                listQ7 = AbstractC0149a.y(null);
                            } catch (Throwable th7) {
                                listQ7 = Z1.f.Q(th7);
                            }
                            lVar.u(listQ7);
                            break;
                        case O.j.DOUBLE_FIELD_NUMBER /* 7 */:
                            C1039j c1039j9 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj;
                            Object obj12 = list6.get(0);
                            N3.h.c(obj12, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView7 = (WebView) obj12;
                            String str4 = (String) list6.get(1);
                            Object obj13 = list6.get(2);
                            N3.h.c(obj13, "null cannot be cast to non-null type kotlin.String");
                            String str5 = (String) obj13;
                            String str6 = (String) list6.get(3);
                            String str7 = (String) list6.get(4);
                            String str8 = (String) list6.get(5);
                            try {
                                c1039j9.getClass();
                                webView7.loadDataWithBaseURL(str4, str5, str6, str7, str8);
                                listQ8 = AbstractC0149a.y(null);
                            } catch (Throwable th8) {
                                listQ8 = Z1.f.Q(th8);
                            }
                            lVar.u(listQ8);
                            break;
                        case O.j.BYTES_FIELD_NUMBER /* 8 */:
                            C1039j c1039j10 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj;
                            Object obj14 = list7.get(0);
                            N3.h.c(obj14, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView8 = (WebView) obj14;
                            Object obj15 = list7.get(1);
                            N3.h.c(obj15, "null cannot be cast to non-null type kotlin.String");
                            String str9 = (String) obj15;
                            Object obj16 = list7.get(2);
                            N3.h.c(obj16, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.String>");
                            Map<String, String> map = (Map) obj16;
                            try {
                                c1039j10.getClass();
                                webView8.loadUrl(str9, map);
                                listQ9 = AbstractC0149a.y(null);
                            } catch (Throwable th9) {
                                listQ9 = Z1.f.Q(th9);
                            }
                            lVar.u(listQ9);
                            break;
                        case 9:
                            C1039j c1039j11 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj;
                            Object obj17 = list8.get(0);
                            N3.h.c(obj17, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView9 = (WebView) obj17;
                            Object obj18 = list8.get(1);
                            N3.h.c(obj18, "null cannot be cast to non-null type kotlin.String");
                            String str10 = (String) obj18;
                            Object obj19 = list8.get(2);
                            N3.h.c(obj19, "null cannot be cast to non-null type kotlin.ByteArray");
                            byte[] bArr = (byte[]) obj19;
                            try {
                                c1039j11.getClass();
                                webView9.postUrl(str10, bArr);
                                listQ10 = AbstractC0149a.y(null);
                            } catch (Throwable th10) {
                                listQ10 = Z1.f.Q(th10);
                            }
                            lVar.u(listQ10);
                            break;
                        case 10:
                            C1039j c1039j12 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj20 = ((List) obj).get(0);
                            N3.h.c(obj20, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView10 = (WebView) obj20;
                            try {
                                c1039j12.getClass();
                                listQ11 = AbstractC0149a.y(webView10.getUrl());
                            } catch (Throwable th11) {
                                listQ11 = Z1.f.Q(th11);
                            }
                            lVar.u(listQ11);
                            break;
                        case 11:
                            C1039j c1039j13 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj21 = ((List) obj).get(0);
                            N3.h.c(obj21, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView11 = (WebView) obj21;
                            try {
                                c1039j13.getClass();
                                webView11.goForward();
                                listQ12 = AbstractC0149a.y(null);
                            } catch (Throwable th12) {
                                listQ12 = Z1.f.Q(th12);
                            }
                            lVar.u(listQ12);
                            break;
                        case 12:
                            C1039j c1039j14 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj22 = ((List) obj).get(0);
                            N3.h.c(obj22, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView12 = (WebView) obj22;
                            try {
                                c1039j14.getClass();
                                listQ13 = AbstractC0149a.y(Boolean.valueOf(webView12.canGoBack()));
                            } catch (Throwable th13) {
                                listQ13 = Z1.f.Q(th13);
                            }
                            lVar.u(listQ13);
                            break;
                        case 13:
                            C1039j c1039j15 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj23 = ((List) obj).get(0);
                            N3.h.c(obj23, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView13 = (WebView) obj23;
                            try {
                                c1039j15.getClass();
                                listQ14 = AbstractC0149a.y(Boolean.valueOf(webView13.canGoForward()));
                            } catch (Throwable th14) {
                                listQ14 = Z1.f.Q(th14);
                            }
                            lVar.u(listQ14);
                            break;
                        case 14:
                            C1039j c1039j16 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj24 = ((List) obj).get(0);
                            N3.h.c(obj24, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView14 = (WebView) obj24;
                            try {
                                c1039j16.getClass();
                                webView14.goBack();
                                listQ15 = AbstractC0149a.y(null);
                            } catch (Throwable th15) {
                                listQ15 = Z1.f.Q(th15);
                            }
                            lVar.u(listQ15);
                            break;
                        case 15:
                            C1039j c1039j17 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj25 = ((List) obj).get(0);
                            N3.h.c(obj25, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView15 = (WebView) obj25;
                            try {
                                c1039j17.getClass();
                                webView15.reload();
                                listQ16 = AbstractC0149a.y(null);
                            } catch (Throwable th16) {
                                listQ16 = Z1.f.Q(th16);
                            }
                            lVar.u(listQ16);
                            break;
                        case 16:
                            C1039j c1039j18 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj;
                            Object obj26 = list9.get(0);
                            N3.h.c(obj26, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView16 = (WebView) obj26;
                            Object obj27 = list9.get(1);
                            N3.h.c(obj27, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue = ((Boolean) obj27).booleanValue();
                            try {
                                c1039j18.getClass();
                                webView16.clearCache(zBooleanValue);
                                listQ17 = AbstractC0149a.y(null);
                            } catch (Throwable th17) {
                                listQ17 = Z1.f.Q(th17);
                            }
                            lVar.u(listQ17);
                            break;
                        case 17:
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj;
                            Object obj28 = list10.get(0);
                            N3.h.c(obj28, "null cannot be cast to non-null type android.webkit.WebView");
                            Object obj29 = list10.get(1);
                            N3.h.c(obj29, "null cannot be cast to non-null type kotlin.String");
                            C1054y c1054y = new C1054y(lVar, 1);
                            c1039j.getClass();
                            ((WebView) obj28).evaluateJavascript((String) obj29, new C1042m(1, c1054y));
                            break;
                        case 18:
                            C1039j c1039j19 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj30 = ((List) obj).get(0);
                            N3.h.c(obj30, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView17 = (WebView) obj30;
                            try {
                                c1039j19.getClass();
                                listQ18 = AbstractC0149a.y(webView17.getTitle());
                            } catch (Throwable th18) {
                                listQ18 = Z1.f.Q(th18);
                            }
                            lVar.u(listQ18);
                            break;
                        case 19:
                            C1039j c1039j20 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj31 = ((List) obj).get(0);
                            N3.h.c(obj31, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue2 = ((Boolean) obj31).booleanValue();
                            try {
                                c1039j20.getClass();
                                WebView.setWebContentsDebuggingEnabled(zBooleanValue2);
                                listQ19 = AbstractC0149a.y(null);
                            } catch (Throwable th19) {
                                listQ19 = Z1.f.Q(th19);
                            }
                            lVar.u(listQ19);
                            break;
                        case 20:
                            C1039j c1039j21 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj;
                            Object obj32 = list11.get(0);
                            N3.h.c(obj32, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView18 = (WebView) obj32;
                            WebViewClient webViewClient = (WebViewClient) list11.get(1);
                            try {
                                c1039j21.getClass();
                                webView18.setWebViewClient(webViewClient);
                                listQ20 = AbstractC0149a.y(null);
                            } catch (Throwable th20) {
                                listQ20 = Z1.f.Q(th20);
                            }
                            lVar.u(listQ20);
                            break;
                        case 21:
                            C1039j c1039j22 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list12 = (List) obj;
                            Object obj33 = list12.get(0);
                            N3.h.c(obj33, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView19 = (WebView) obj33;
                            Object obj34 = list12.get(1);
                            N3.h.c(obj34, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.JavaScriptChannel");
                            C1048s c1048s = (C1048s) obj34;
                            try {
                                c1039j22.getClass();
                                webView19.addJavascriptInterface(c1048s, c1048s.f11098a);
                                listQ21 = AbstractC0149a.y(null);
                            } catch (Throwable th21) {
                                listQ21 = Z1.f.Q(th21);
                            }
                            lVar.u(listQ21);
                            break;
                        default:
                            C1039j c1039j23 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj;
                            Object obj35 = list13.get(0);
                            N3.h.c(obj35, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView20 = (WebView) obj35;
                            Object obj36 = list13.get(1);
                            N3.h.c(obj36, "null cannot be cast to non-null type kotlin.String");
                            String str11 = (String) obj36;
                            try {
                                c1039j23.getClass();
                                webView20.removeJavascriptInterface(str11);
                                listQ22 = AbstractC0149a.y(null);
                            } catch (Throwable th22) {
                                listQ22 = Z1.f.Q(th22);
                            }
                            lVar.u(listQ22);
                            break;
                    }
                }
            });
        } else {
            iVar11.E(null);
        }
        i iVar12 = new i(interfaceC0696f, "dev.flutter.pigeon.webview_flutter_android.WebView.reload", gVar, (C0200z) null);
        if (c1039j != null) {
            final int i15 = 15;
            iVar12.E(new InterfaceC0692b() { // from class: y3.I
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
                    List listQ18;
                    List listQ19;
                    List listQ20;
                    List listQ21;
                    List listQ22;
                    switch (i15) {
                        case 0:
                            C1039j c1039j2 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj2 = ((List) obj).get(0);
                            N3.h.c(obj2, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((C1032c) c1039j2.f11068a.f9n).a(((Long) obj2).longValue(), c1039j2.a());
                                listQ = AbstractC0149a.y(null);
                            } catch (Throwable th) {
                                listQ = Z1.f.Q(th);
                            }
                            lVar.u(listQ);
                            break;
                        case 1:
                            C1039j c1039j3 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj3 = list.get(0);
                            N3.h.c(obj3, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView = (WebView) obj3;
                            DownloadListener downloadListener = (DownloadListener) list.get(1);
                            try {
                                c1039j3.getClass();
                                webView.setDownloadListener(downloadListener);
                                listQ2 = AbstractC0149a.y(null);
                            } catch (Throwable th2) {
                                listQ2 = Z1.f.Q(th2);
                            }
                            lVar.u(listQ2);
                            break;
                        case 2:
                            C1039j c1039j4 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj;
                            Object obj4 = list2.get(0);
                            N3.h.c(obj4, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView2 = (WebView) obj4;
                            Object obj5 = list2.get(1);
                            N3.h.c(obj5, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((C1032c) c1039j4.f11068a.f9n).a(((Long) obj5).longValue(), webView2.getSettings());
                                listQ3 = AbstractC0149a.y(null);
                            } catch (Throwable th3) {
                                listQ3 = Z1.f.Q(th3);
                            }
                            lVar.u(listQ3);
                            break;
                        case 3:
                            C1039j c1039j5 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj;
                            Object obj6 = list3.get(0);
                            N3.h.c(obj6, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView3 = (WebView) obj6;
                            C1022Q c1022q = (C1022Q) list3.get(1);
                            try {
                                c1039j5.getClass();
                                webView3.setWebChromeClient(c1022q);
                                listQ4 = AbstractC0149a.y(null);
                            } catch (Throwable th4) {
                                listQ4 = Z1.f.Q(th4);
                            }
                            lVar.u(listQ4);
                            break;
                        case 4:
                            C1039j c1039j6 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj;
                            Object obj7 = list4.get(0);
                            N3.h.c(obj7, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView4 = (WebView) obj7;
                            Object obj8 = list4.get(1);
                            N3.h.c(obj8, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue = ((Long) obj8).longValue();
                            try {
                                c1039j6.getClass();
                                webView4.setBackgroundColor((int) jLongValue);
                                listQ5 = AbstractC0149a.y(null);
                            } catch (Throwable th5) {
                                listQ5 = Z1.f.Q(th5);
                            }
                            lVar.u(listQ5);
                            break;
                        case 5:
                            C1039j c1039j7 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj9 = ((List) obj).get(0);
                            N3.h.c(obj9, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView5 = (WebView) obj9;
                            try {
                                c1039j7.getClass();
                                webView5.destroy();
                                listQ6 = AbstractC0149a.y(null);
                            } catch (Throwable th6) {
                                listQ6 = Z1.f.Q(th6);
                            }
                            lVar.u(listQ6);
                            break;
                        case O.j.STRING_SET_FIELD_NUMBER /* 6 */:
                            C1039j c1039j8 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj;
                            Object obj10 = list5.get(0);
                            N3.h.c(obj10, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView6 = (WebView) obj10;
                            Object obj11 = list5.get(1);
                            N3.h.c(obj11, "null cannot be cast to non-null type kotlin.String");
                            String str = (String) obj11;
                            String str2 = (String) list5.get(2);
                            String str3 = (String) list5.get(3);
                            try {
                                c1039j8.getClass();
                                webView6.loadData(str, str2, str3);
                                listQ7 = AbstractC0149a.y(null);
                            } catch (Throwable th7) {
                                listQ7 = Z1.f.Q(th7);
                            }
                            lVar.u(listQ7);
                            break;
                        case O.j.DOUBLE_FIELD_NUMBER /* 7 */:
                            C1039j c1039j9 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj;
                            Object obj12 = list6.get(0);
                            N3.h.c(obj12, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView7 = (WebView) obj12;
                            String str4 = (String) list6.get(1);
                            Object obj13 = list6.get(2);
                            N3.h.c(obj13, "null cannot be cast to non-null type kotlin.String");
                            String str5 = (String) obj13;
                            String str6 = (String) list6.get(3);
                            String str7 = (String) list6.get(4);
                            String str8 = (String) list6.get(5);
                            try {
                                c1039j9.getClass();
                                webView7.loadDataWithBaseURL(str4, str5, str6, str7, str8);
                                listQ8 = AbstractC0149a.y(null);
                            } catch (Throwable th8) {
                                listQ8 = Z1.f.Q(th8);
                            }
                            lVar.u(listQ8);
                            break;
                        case O.j.BYTES_FIELD_NUMBER /* 8 */:
                            C1039j c1039j10 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj;
                            Object obj14 = list7.get(0);
                            N3.h.c(obj14, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView8 = (WebView) obj14;
                            Object obj15 = list7.get(1);
                            N3.h.c(obj15, "null cannot be cast to non-null type kotlin.String");
                            String str9 = (String) obj15;
                            Object obj16 = list7.get(2);
                            N3.h.c(obj16, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.String>");
                            Map<String, String> map = (Map) obj16;
                            try {
                                c1039j10.getClass();
                                webView8.loadUrl(str9, map);
                                listQ9 = AbstractC0149a.y(null);
                            } catch (Throwable th9) {
                                listQ9 = Z1.f.Q(th9);
                            }
                            lVar.u(listQ9);
                            break;
                        case 9:
                            C1039j c1039j11 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj;
                            Object obj17 = list8.get(0);
                            N3.h.c(obj17, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView9 = (WebView) obj17;
                            Object obj18 = list8.get(1);
                            N3.h.c(obj18, "null cannot be cast to non-null type kotlin.String");
                            String str10 = (String) obj18;
                            Object obj19 = list8.get(2);
                            N3.h.c(obj19, "null cannot be cast to non-null type kotlin.ByteArray");
                            byte[] bArr = (byte[]) obj19;
                            try {
                                c1039j11.getClass();
                                webView9.postUrl(str10, bArr);
                                listQ10 = AbstractC0149a.y(null);
                            } catch (Throwable th10) {
                                listQ10 = Z1.f.Q(th10);
                            }
                            lVar.u(listQ10);
                            break;
                        case 10:
                            C1039j c1039j12 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj20 = ((List) obj).get(0);
                            N3.h.c(obj20, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView10 = (WebView) obj20;
                            try {
                                c1039j12.getClass();
                                listQ11 = AbstractC0149a.y(webView10.getUrl());
                            } catch (Throwable th11) {
                                listQ11 = Z1.f.Q(th11);
                            }
                            lVar.u(listQ11);
                            break;
                        case 11:
                            C1039j c1039j13 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj21 = ((List) obj).get(0);
                            N3.h.c(obj21, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView11 = (WebView) obj21;
                            try {
                                c1039j13.getClass();
                                webView11.goForward();
                                listQ12 = AbstractC0149a.y(null);
                            } catch (Throwable th12) {
                                listQ12 = Z1.f.Q(th12);
                            }
                            lVar.u(listQ12);
                            break;
                        case 12:
                            C1039j c1039j14 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj22 = ((List) obj).get(0);
                            N3.h.c(obj22, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView12 = (WebView) obj22;
                            try {
                                c1039j14.getClass();
                                listQ13 = AbstractC0149a.y(Boolean.valueOf(webView12.canGoBack()));
                            } catch (Throwable th13) {
                                listQ13 = Z1.f.Q(th13);
                            }
                            lVar.u(listQ13);
                            break;
                        case 13:
                            C1039j c1039j15 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj23 = ((List) obj).get(0);
                            N3.h.c(obj23, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView13 = (WebView) obj23;
                            try {
                                c1039j15.getClass();
                                listQ14 = AbstractC0149a.y(Boolean.valueOf(webView13.canGoForward()));
                            } catch (Throwable th14) {
                                listQ14 = Z1.f.Q(th14);
                            }
                            lVar.u(listQ14);
                            break;
                        case 14:
                            C1039j c1039j16 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj24 = ((List) obj).get(0);
                            N3.h.c(obj24, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView14 = (WebView) obj24;
                            try {
                                c1039j16.getClass();
                                webView14.goBack();
                                listQ15 = AbstractC0149a.y(null);
                            } catch (Throwable th15) {
                                listQ15 = Z1.f.Q(th15);
                            }
                            lVar.u(listQ15);
                            break;
                        case 15:
                            C1039j c1039j17 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj25 = ((List) obj).get(0);
                            N3.h.c(obj25, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView15 = (WebView) obj25;
                            try {
                                c1039j17.getClass();
                                webView15.reload();
                                listQ16 = AbstractC0149a.y(null);
                            } catch (Throwable th16) {
                                listQ16 = Z1.f.Q(th16);
                            }
                            lVar.u(listQ16);
                            break;
                        case 16:
                            C1039j c1039j18 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj;
                            Object obj26 = list9.get(0);
                            N3.h.c(obj26, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView16 = (WebView) obj26;
                            Object obj27 = list9.get(1);
                            N3.h.c(obj27, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue = ((Boolean) obj27).booleanValue();
                            try {
                                c1039j18.getClass();
                                webView16.clearCache(zBooleanValue);
                                listQ17 = AbstractC0149a.y(null);
                            } catch (Throwable th17) {
                                listQ17 = Z1.f.Q(th17);
                            }
                            lVar.u(listQ17);
                            break;
                        case 17:
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj;
                            Object obj28 = list10.get(0);
                            N3.h.c(obj28, "null cannot be cast to non-null type android.webkit.WebView");
                            Object obj29 = list10.get(1);
                            N3.h.c(obj29, "null cannot be cast to non-null type kotlin.String");
                            C1054y c1054y = new C1054y(lVar, 1);
                            c1039j.getClass();
                            ((WebView) obj28).evaluateJavascript((String) obj29, new C1042m(1, c1054y));
                            break;
                        case 18:
                            C1039j c1039j19 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj30 = ((List) obj).get(0);
                            N3.h.c(obj30, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView17 = (WebView) obj30;
                            try {
                                c1039j19.getClass();
                                listQ18 = AbstractC0149a.y(webView17.getTitle());
                            } catch (Throwable th18) {
                                listQ18 = Z1.f.Q(th18);
                            }
                            lVar.u(listQ18);
                            break;
                        case 19:
                            C1039j c1039j20 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj31 = ((List) obj).get(0);
                            N3.h.c(obj31, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue2 = ((Boolean) obj31).booleanValue();
                            try {
                                c1039j20.getClass();
                                WebView.setWebContentsDebuggingEnabled(zBooleanValue2);
                                listQ19 = AbstractC0149a.y(null);
                            } catch (Throwable th19) {
                                listQ19 = Z1.f.Q(th19);
                            }
                            lVar.u(listQ19);
                            break;
                        case 20:
                            C1039j c1039j21 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj;
                            Object obj32 = list11.get(0);
                            N3.h.c(obj32, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView18 = (WebView) obj32;
                            WebViewClient webViewClient = (WebViewClient) list11.get(1);
                            try {
                                c1039j21.getClass();
                                webView18.setWebViewClient(webViewClient);
                                listQ20 = AbstractC0149a.y(null);
                            } catch (Throwable th20) {
                                listQ20 = Z1.f.Q(th20);
                            }
                            lVar.u(listQ20);
                            break;
                        case 21:
                            C1039j c1039j22 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list12 = (List) obj;
                            Object obj33 = list12.get(0);
                            N3.h.c(obj33, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView19 = (WebView) obj33;
                            Object obj34 = list12.get(1);
                            N3.h.c(obj34, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.JavaScriptChannel");
                            C1048s c1048s = (C1048s) obj34;
                            try {
                                c1039j22.getClass();
                                webView19.addJavascriptInterface(c1048s, c1048s.f11098a);
                                listQ21 = AbstractC0149a.y(null);
                            } catch (Throwable th21) {
                                listQ21 = Z1.f.Q(th21);
                            }
                            lVar.u(listQ21);
                            break;
                        default:
                            C1039j c1039j23 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj;
                            Object obj35 = list13.get(0);
                            N3.h.c(obj35, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView20 = (WebView) obj35;
                            Object obj36 = list13.get(1);
                            N3.h.c(obj36, "null cannot be cast to non-null type kotlin.String");
                            String str11 = (String) obj36;
                            try {
                                c1039j23.getClass();
                                webView20.removeJavascriptInterface(str11);
                                listQ22 = AbstractC0149a.y(null);
                            } catch (Throwable th22) {
                                listQ22 = Z1.f.Q(th22);
                            }
                            lVar.u(listQ22);
                            break;
                    }
                }
            });
        } else {
            iVar12.E(null);
        }
        i iVar13 = new i(interfaceC0696f, "dev.flutter.pigeon.webview_flutter_android.WebView.clearCache", gVar, (C0200z) null);
        if (c1039j != null) {
            final int i16 = 16;
            iVar13.E(new InterfaceC0692b() { // from class: y3.I
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
                    List listQ18;
                    List listQ19;
                    List listQ20;
                    List listQ21;
                    List listQ22;
                    switch (i16) {
                        case 0:
                            C1039j c1039j2 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj2 = ((List) obj).get(0);
                            N3.h.c(obj2, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((C1032c) c1039j2.f11068a.f9n).a(((Long) obj2).longValue(), c1039j2.a());
                                listQ = AbstractC0149a.y(null);
                            } catch (Throwable th) {
                                listQ = Z1.f.Q(th);
                            }
                            lVar.u(listQ);
                            break;
                        case 1:
                            C1039j c1039j3 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj3 = list.get(0);
                            N3.h.c(obj3, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView = (WebView) obj3;
                            DownloadListener downloadListener = (DownloadListener) list.get(1);
                            try {
                                c1039j3.getClass();
                                webView.setDownloadListener(downloadListener);
                                listQ2 = AbstractC0149a.y(null);
                            } catch (Throwable th2) {
                                listQ2 = Z1.f.Q(th2);
                            }
                            lVar.u(listQ2);
                            break;
                        case 2:
                            C1039j c1039j4 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj;
                            Object obj4 = list2.get(0);
                            N3.h.c(obj4, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView2 = (WebView) obj4;
                            Object obj5 = list2.get(1);
                            N3.h.c(obj5, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((C1032c) c1039j4.f11068a.f9n).a(((Long) obj5).longValue(), webView2.getSettings());
                                listQ3 = AbstractC0149a.y(null);
                            } catch (Throwable th3) {
                                listQ3 = Z1.f.Q(th3);
                            }
                            lVar.u(listQ3);
                            break;
                        case 3:
                            C1039j c1039j5 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj;
                            Object obj6 = list3.get(0);
                            N3.h.c(obj6, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView3 = (WebView) obj6;
                            C1022Q c1022q = (C1022Q) list3.get(1);
                            try {
                                c1039j5.getClass();
                                webView3.setWebChromeClient(c1022q);
                                listQ4 = AbstractC0149a.y(null);
                            } catch (Throwable th4) {
                                listQ4 = Z1.f.Q(th4);
                            }
                            lVar.u(listQ4);
                            break;
                        case 4:
                            C1039j c1039j6 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj;
                            Object obj7 = list4.get(0);
                            N3.h.c(obj7, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView4 = (WebView) obj7;
                            Object obj8 = list4.get(1);
                            N3.h.c(obj8, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue = ((Long) obj8).longValue();
                            try {
                                c1039j6.getClass();
                                webView4.setBackgroundColor((int) jLongValue);
                                listQ5 = AbstractC0149a.y(null);
                            } catch (Throwable th5) {
                                listQ5 = Z1.f.Q(th5);
                            }
                            lVar.u(listQ5);
                            break;
                        case 5:
                            C1039j c1039j7 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj9 = ((List) obj).get(0);
                            N3.h.c(obj9, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView5 = (WebView) obj9;
                            try {
                                c1039j7.getClass();
                                webView5.destroy();
                                listQ6 = AbstractC0149a.y(null);
                            } catch (Throwable th6) {
                                listQ6 = Z1.f.Q(th6);
                            }
                            lVar.u(listQ6);
                            break;
                        case O.j.STRING_SET_FIELD_NUMBER /* 6 */:
                            C1039j c1039j8 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj;
                            Object obj10 = list5.get(0);
                            N3.h.c(obj10, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView6 = (WebView) obj10;
                            Object obj11 = list5.get(1);
                            N3.h.c(obj11, "null cannot be cast to non-null type kotlin.String");
                            String str = (String) obj11;
                            String str2 = (String) list5.get(2);
                            String str3 = (String) list5.get(3);
                            try {
                                c1039j8.getClass();
                                webView6.loadData(str, str2, str3);
                                listQ7 = AbstractC0149a.y(null);
                            } catch (Throwable th7) {
                                listQ7 = Z1.f.Q(th7);
                            }
                            lVar.u(listQ7);
                            break;
                        case O.j.DOUBLE_FIELD_NUMBER /* 7 */:
                            C1039j c1039j9 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj;
                            Object obj12 = list6.get(0);
                            N3.h.c(obj12, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView7 = (WebView) obj12;
                            String str4 = (String) list6.get(1);
                            Object obj13 = list6.get(2);
                            N3.h.c(obj13, "null cannot be cast to non-null type kotlin.String");
                            String str5 = (String) obj13;
                            String str6 = (String) list6.get(3);
                            String str7 = (String) list6.get(4);
                            String str8 = (String) list6.get(5);
                            try {
                                c1039j9.getClass();
                                webView7.loadDataWithBaseURL(str4, str5, str6, str7, str8);
                                listQ8 = AbstractC0149a.y(null);
                            } catch (Throwable th8) {
                                listQ8 = Z1.f.Q(th8);
                            }
                            lVar.u(listQ8);
                            break;
                        case O.j.BYTES_FIELD_NUMBER /* 8 */:
                            C1039j c1039j10 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj;
                            Object obj14 = list7.get(0);
                            N3.h.c(obj14, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView8 = (WebView) obj14;
                            Object obj15 = list7.get(1);
                            N3.h.c(obj15, "null cannot be cast to non-null type kotlin.String");
                            String str9 = (String) obj15;
                            Object obj16 = list7.get(2);
                            N3.h.c(obj16, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.String>");
                            Map<String, String> map = (Map) obj16;
                            try {
                                c1039j10.getClass();
                                webView8.loadUrl(str9, map);
                                listQ9 = AbstractC0149a.y(null);
                            } catch (Throwable th9) {
                                listQ9 = Z1.f.Q(th9);
                            }
                            lVar.u(listQ9);
                            break;
                        case 9:
                            C1039j c1039j11 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj;
                            Object obj17 = list8.get(0);
                            N3.h.c(obj17, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView9 = (WebView) obj17;
                            Object obj18 = list8.get(1);
                            N3.h.c(obj18, "null cannot be cast to non-null type kotlin.String");
                            String str10 = (String) obj18;
                            Object obj19 = list8.get(2);
                            N3.h.c(obj19, "null cannot be cast to non-null type kotlin.ByteArray");
                            byte[] bArr = (byte[]) obj19;
                            try {
                                c1039j11.getClass();
                                webView9.postUrl(str10, bArr);
                                listQ10 = AbstractC0149a.y(null);
                            } catch (Throwable th10) {
                                listQ10 = Z1.f.Q(th10);
                            }
                            lVar.u(listQ10);
                            break;
                        case 10:
                            C1039j c1039j12 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj20 = ((List) obj).get(0);
                            N3.h.c(obj20, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView10 = (WebView) obj20;
                            try {
                                c1039j12.getClass();
                                listQ11 = AbstractC0149a.y(webView10.getUrl());
                            } catch (Throwable th11) {
                                listQ11 = Z1.f.Q(th11);
                            }
                            lVar.u(listQ11);
                            break;
                        case 11:
                            C1039j c1039j13 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj21 = ((List) obj).get(0);
                            N3.h.c(obj21, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView11 = (WebView) obj21;
                            try {
                                c1039j13.getClass();
                                webView11.goForward();
                                listQ12 = AbstractC0149a.y(null);
                            } catch (Throwable th12) {
                                listQ12 = Z1.f.Q(th12);
                            }
                            lVar.u(listQ12);
                            break;
                        case 12:
                            C1039j c1039j14 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj22 = ((List) obj).get(0);
                            N3.h.c(obj22, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView12 = (WebView) obj22;
                            try {
                                c1039j14.getClass();
                                listQ13 = AbstractC0149a.y(Boolean.valueOf(webView12.canGoBack()));
                            } catch (Throwable th13) {
                                listQ13 = Z1.f.Q(th13);
                            }
                            lVar.u(listQ13);
                            break;
                        case 13:
                            C1039j c1039j15 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj23 = ((List) obj).get(0);
                            N3.h.c(obj23, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView13 = (WebView) obj23;
                            try {
                                c1039j15.getClass();
                                listQ14 = AbstractC0149a.y(Boolean.valueOf(webView13.canGoForward()));
                            } catch (Throwable th14) {
                                listQ14 = Z1.f.Q(th14);
                            }
                            lVar.u(listQ14);
                            break;
                        case 14:
                            C1039j c1039j16 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj24 = ((List) obj).get(0);
                            N3.h.c(obj24, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView14 = (WebView) obj24;
                            try {
                                c1039j16.getClass();
                                webView14.goBack();
                                listQ15 = AbstractC0149a.y(null);
                            } catch (Throwable th15) {
                                listQ15 = Z1.f.Q(th15);
                            }
                            lVar.u(listQ15);
                            break;
                        case 15:
                            C1039j c1039j17 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj25 = ((List) obj).get(0);
                            N3.h.c(obj25, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView15 = (WebView) obj25;
                            try {
                                c1039j17.getClass();
                                webView15.reload();
                                listQ16 = AbstractC0149a.y(null);
                            } catch (Throwable th16) {
                                listQ16 = Z1.f.Q(th16);
                            }
                            lVar.u(listQ16);
                            break;
                        case 16:
                            C1039j c1039j18 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj;
                            Object obj26 = list9.get(0);
                            N3.h.c(obj26, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView16 = (WebView) obj26;
                            Object obj27 = list9.get(1);
                            N3.h.c(obj27, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue = ((Boolean) obj27).booleanValue();
                            try {
                                c1039j18.getClass();
                                webView16.clearCache(zBooleanValue);
                                listQ17 = AbstractC0149a.y(null);
                            } catch (Throwable th17) {
                                listQ17 = Z1.f.Q(th17);
                            }
                            lVar.u(listQ17);
                            break;
                        case 17:
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj;
                            Object obj28 = list10.get(0);
                            N3.h.c(obj28, "null cannot be cast to non-null type android.webkit.WebView");
                            Object obj29 = list10.get(1);
                            N3.h.c(obj29, "null cannot be cast to non-null type kotlin.String");
                            C1054y c1054y = new C1054y(lVar, 1);
                            c1039j.getClass();
                            ((WebView) obj28).evaluateJavascript((String) obj29, new C1042m(1, c1054y));
                            break;
                        case 18:
                            C1039j c1039j19 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj30 = ((List) obj).get(0);
                            N3.h.c(obj30, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView17 = (WebView) obj30;
                            try {
                                c1039j19.getClass();
                                listQ18 = AbstractC0149a.y(webView17.getTitle());
                            } catch (Throwable th18) {
                                listQ18 = Z1.f.Q(th18);
                            }
                            lVar.u(listQ18);
                            break;
                        case 19:
                            C1039j c1039j20 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj31 = ((List) obj).get(0);
                            N3.h.c(obj31, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue2 = ((Boolean) obj31).booleanValue();
                            try {
                                c1039j20.getClass();
                                WebView.setWebContentsDebuggingEnabled(zBooleanValue2);
                                listQ19 = AbstractC0149a.y(null);
                            } catch (Throwable th19) {
                                listQ19 = Z1.f.Q(th19);
                            }
                            lVar.u(listQ19);
                            break;
                        case 20:
                            C1039j c1039j21 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj;
                            Object obj32 = list11.get(0);
                            N3.h.c(obj32, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView18 = (WebView) obj32;
                            WebViewClient webViewClient = (WebViewClient) list11.get(1);
                            try {
                                c1039j21.getClass();
                                webView18.setWebViewClient(webViewClient);
                                listQ20 = AbstractC0149a.y(null);
                            } catch (Throwable th20) {
                                listQ20 = Z1.f.Q(th20);
                            }
                            lVar.u(listQ20);
                            break;
                        case 21:
                            C1039j c1039j22 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list12 = (List) obj;
                            Object obj33 = list12.get(0);
                            N3.h.c(obj33, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView19 = (WebView) obj33;
                            Object obj34 = list12.get(1);
                            N3.h.c(obj34, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.JavaScriptChannel");
                            C1048s c1048s = (C1048s) obj34;
                            try {
                                c1039j22.getClass();
                                webView19.addJavascriptInterface(c1048s, c1048s.f11098a);
                                listQ21 = AbstractC0149a.y(null);
                            } catch (Throwable th21) {
                                listQ21 = Z1.f.Q(th21);
                            }
                            lVar.u(listQ21);
                            break;
                        default:
                            C1039j c1039j23 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj;
                            Object obj35 = list13.get(0);
                            N3.h.c(obj35, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView20 = (WebView) obj35;
                            Object obj36 = list13.get(1);
                            N3.h.c(obj36, "null cannot be cast to non-null type kotlin.String");
                            String str11 = (String) obj36;
                            try {
                                c1039j23.getClass();
                                webView20.removeJavascriptInterface(str11);
                                listQ22 = AbstractC0149a.y(null);
                            } catch (Throwable th22) {
                                listQ22 = Z1.f.Q(th22);
                            }
                            lVar.u(listQ22);
                            break;
                    }
                }
            });
        } else {
            iVar13.E(null);
        }
        i iVar14 = new i(interfaceC0696f, "dev.flutter.pigeon.webview_flutter_android.WebView.evaluateJavascript", gVar, (C0200z) null);
        if (c1039j != null) {
            final int i17 = 17;
            iVar14.E(new InterfaceC0692b() { // from class: y3.I
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
                    List listQ18;
                    List listQ19;
                    List listQ20;
                    List listQ21;
                    List listQ22;
                    switch (i17) {
                        case 0:
                            C1039j c1039j2 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj2 = ((List) obj).get(0);
                            N3.h.c(obj2, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((C1032c) c1039j2.f11068a.f9n).a(((Long) obj2).longValue(), c1039j2.a());
                                listQ = AbstractC0149a.y(null);
                            } catch (Throwable th) {
                                listQ = Z1.f.Q(th);
                            }
                            lVar.u(listQ);
                            break;
                        case 1:
                            C1039j c1039j3 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj3 = list.get(0);
                            N3.h.c(obj3, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView = (WebView) obj3;
                            DownloadListener downloadListener = (DownloadListener) list.get(1);
                            try {
                                c1039j3.getClass();
                                webView.setDownloadListener(downloadListener);
                                listQ2 = AbstractC0149a.y(null);
                            } catch (Throwable th2) {
                                listQ2 = Z1.f.Q(th2);
                            }
                            lVar.u(listQ2);
                            break;
                        case 2:
                            C1039j c1039j4 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj;
                            Object obj4 = list2.get(0);
                            N3.h.c(obj4, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView2 = (WebView) obj4;
                            Object obj5 = list2.get(1);
                            N3.h.c(obj5, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((C1032c) c1039j4.f11068a.f9n).a(((Long) obj5).longValue(), webView2.getSettings());
                                listQ3 = AbstractC0149a.y(null);
                            } catch (Throwable th3) {
                                listQ3 = Z1.f.Q(th3);
                            }
                            lVar.u(listQ3);
                            break;
                        case 3:
                            C1039j c1039j5 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj;
                            Object obj6 = list3.get(0);
                            N3.h.c(obj6, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView3 = (WebView) obj6;
                            C1022Q c1022q = (C1022Q) list3.get(1);
                            try {
                                c1039j5.getClass();
                                webView3.setWebChromeClient(c1022q);
                                listQ4 = AbstractC0149a.y(null);
                            } catch (Throwable th4) {
                                listQ4 = Z1.f.Q(th4);
                            }
                            lVar.u(listQ4);
                            break;
                        case 4:
                            C1039j c1039j6 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj;
                            Object obj7 = list4.get(0);
                            N3.h.c(obj7, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView4 = (WebView) obj7;
                            Object obj8 = list4.get(1);
                            N3.h.c(obj8, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue = ((Long) obj8).longValue();
                            try {
                                c1039j6.getClass();
                                webView4.setBackgroundColor((int) jLongValue);
                                listQ5 = AbstractC0149a.y(null);
                            } catch (Throwable th5) {
                                listQ5 = Z1.f.Q(th5);
                            }
                            lVar.u(listQ5);
                            break;
                        case 5:
                            C1039j c1039j7 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj9 = ((List) obj).get(0);
                            N3.h.c(obj9, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView5 = (WebView) obj9;
                            try {
                                c1039j7.getClass();
                                webView5.destroy();
                                listQ6 = AbstractC0149a.y(null);
                            } catch (Throwable th6) {
                                listQ6 = Z1.f.Q(th6);
                            }
                            lVar.u(listQ6);
                            break;
                        case O.j.STRING_SET_FIELD_NUMBER /* 6 */:
                            C1039j c1039j8 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj;
                            Object obj10 = list5.get(0);
                            N3.h.c(obj10, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView6 = (WebView) obj10;
                            Object obj11 = list5.get(1);
                            N3.h.c(obj11, "null cannot be cast to non-null type kotlin.String");
                            String str = (String) obj11;
                            String str2 = (String) list5.get(2);
                            String str3 = (String) list5.get(3);
                            try {
                                c1039j8.getClass();
                                webView6.loadData(str, str2, str3);
                                listQ7 = AbstractC0149a.y(null);
                            } catch (Throwable th7) {
                                listQ7 = Z1.f.Q(th7);
                            }
                            lVar.u(listQ7);
                            break;
                        case O.j.DOUBLE_FIELD_NUMBER /* 7 */:
                            C1039j c1039j9 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj;
                            Object obj12 = list6.get(0);
                            N3.h.c(obj12, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView7 = (WebView) obj12;
                            String str4 = (String) list6.get(1);
                            Object obj13 = list6.get(2);
                            N3.h.c(obj13, "null cannot be cast to non-null type kotlin.String");
                            String str5 = (String) obj13;
                            String str6 = (String) list6.get(3);
                            String str7 = (String) list6.get(4);
                            String str8 = (String) list6.get(5);
                            try {
                                c1039j9.getClass();
                                webView7.loadDataWithBaseURL(str4, str5, str6, str7, str8);
                                listQ8 = AbstractC0149a.y(null);
                            } catch (Throwable th8) {
                                listQ8 = Z1.f.Q(th8);
                            }
                            lVar.u(listQ8);
                            break;
                        case O.j.BYTES_FIELD_NUMBER /* 8 */:
                            C1039j c1039j10 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj;
                            Object obj14 = list7.get(0);
                            N3.h.c(obj14, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView8 = (WebView) obj14;
                            Object obj15 = list7.get(1);
                            N3.h.c(obj15, "null cannot be cast to non-null type kotlin.String");
                            String str9 = (String) obj15;
                            Object obj16 = list7.get(2);
                            N3.h.c(obj16, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.String>");
                            Map<String, String> map = (Map) obj16;
                            try {
                                c1039j10.getClass();
                                webView8.loadUrl(str9, map);
                                listQ9 = AbstractC0149a.y(null);
                            } catch (Throwable th9) {
                                listQ9 = Z1.f.Q(th9);
                            }
                            lVar.u(listQ9);
                            break;
                        case 9:
                            C1039j c1039j11 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj;
                            Object obj17 = list8.get(0);
                            N3.h.c(obj17, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView9 = (WebView) obj17;
                            Object obj18 = list8.get(1);
                            N3.h.c(obj18, "null cannot be cast to non-null type kotlin.String");
                            String str10 = (String) obj18;
                            Object obj19 = list8.get(2);
                            N3.h.c(obj19, "null cannot be cast to non-null type kotlin.ByteArray");
                            byte[] bArr = (byte[]) obj19;
                            try {
                                c1039j11.getClass();
                                webView9.postUrl(str10, bArr);
                                listQ10 = AbstractC0149a.y(null);
                            } catch (Throwable th10) {
                                listQ10 = Z1.f.Q(th10);
                            }
                            lVar.u(listQ10);
                            break;
                        case 10:
                            C1039j c1039j12 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj20 = ((List) obj).get(0);
                            N3.h.c(obj20, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView10 = (WebView) obj20;
                            try {
                                c1039j12.getClass();
                                listQ11 = AbstractC0149a.y(webView10.getUrl());
                            } catch (Throwable th11) {
                                listQ11 = Z1.f.Q(th11);
                            }
                            lVar.u(listQ11);
                            break;
                        case 11:
                            C1039j c1039j13 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj21 = ((List) obj).get(0);
                            N3.h.c(obj21, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView11 = (WebView) obj21;
                            try {
                                c1039j13.getClass();
                                webView11.goForward();
                                listQ12 = AbstractC0149a.y(null);
                            } catch (Throwable th12) {
                                listQ12 = Z1.f.Q(th12);
                            }
                            lVar.u(listQ12);
                            break;
                        case 12:
                            C1039j c1039j14 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj22 = ((List) obj).get(0);
                            N3.h.c(obj22, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView12 = (WebView) obj22;
                            try {
                                c1039j14.getClass();
                                listQ13 = AbstractC0149a.y(Boolean.valueOf(webView12.canGoBack()));
                            } catch (Throwable th13) {
                                listQ13 = Z1.f.Q(th13);
                            }
                            lVar.u(listQ13);
                            break;
                        case 13:
                            C1039j c1039j15 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj23 = ((List) obj).get(0);
                            N3.h.c(obj23, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView13 = (WebView) obj23;
                            try {
                                c1039j15.getClass();
                                listQ14 = AbstractC0149a.y(Boolean.valueOf(webView13.canGoForward()));
                            } catch (Throwable th14) {
                                listQ14 = Z1.f.Q(th14);
                            }
                            lVar.u(listQ14);
                            break;
                        case 14:
                            C1039j c1039j16 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj24 = ((List) obj).get(0);
                            N3.h.c(obj24, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView14 = (WebView) obj24;
                            try {
                                c1039j16.getClass();
                                webView14.goBack();
                                listQ15 = AbstractC0149a.y(null);
                            } catch (Throwable th15) {
                                listQ15 = Z1.f.Q(th15);
                            }
                            lVar.u(listQ15);
                            break;
                        case 15:
                            C1039j c1039j17 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj25 = ((List) obj).get(0);
                            N3.h.c(obj25, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView15 = (WebView) obj25;
                            try {
                                c1039j17.getClass();
                                webView15.reload();
                                listQ16 = AbstractC0149a.y(null);
                            } catch (Throwable th16) {
                                listQ16 = Z1.f.Q(th16);
                            }
                            lVar.u(listQ16);
                            break;
                        case 16:
                            C1039j c1039j18 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj;
                            Object obj26 = list9.get(0);
                            N3.h.c(obj26, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView16 = (WebView) obj26;
                            Object obj27 = list9.get(1);
                            N3.h.c(obj27, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue = ((Boolean) obj27).booleanValue();
                            try {
                                c1039j18.getClass();
                                webView16.clearCache(zBooleanValue);
                                listQ17 = AbstractC0149a.y(null);
                            } catch (Throwable th17) {
                                listQ17 = Z1.f.Q(th17);
                            }
                            lVar.u(listQ17);
                            break;
                        case 17:
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj;
                            Object obj28 = list10.get(0);
                            N3.h.c(obj28, "null cannot be cast to non-null type android.webkit.WebView");
                            Object obj29 = list10.get(1);
                            N3.h.c(obj29, "null cannot be cast to non-null type kotlin.String");
                            C1054y c1054y = new C1054y(lVar, 1);
                            c1039j.getClass();
                            ((WebView) obj28).evaluateJavascript((String) obj29, new C1042m(1, c1054y));
                            break;
                        case 18:
                            C1039j c1039j19 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj30 = ((List) obj).get(0);
                            N3.h.c(obj30, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView17 = (WebView) obj30;
                            try {
                                c1039j19.getClass();
                                listQ18 = AbstractC0149a.y(webView17.getTitle());
                            } catch (Throwable th18) {
                                listQ18 = Z1.f.Q(th18);
                            }
                            lVar.u(listQ18);
                            break;
                        case 19:
                            C1039j c1039j20 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj31 = ((List) obj).get(0);
                            N3.h.c(obj31, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue2 = ((Boolean) obj31).booleanValue();
                            try {
                                c1039j20.getClass();
                                WebView.setWebContentsDebuggingEnabled(zBooleanValue2);
                                listQ19 = AbstractC0149a.y(null);
                            } catch (Throwable th19) {
                                listQ19 = Z1.f.Q(th19);
                            }
                            lVar.u(listQ19);
                            break;
                        case 20:
                            C1039j c1039j21 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj;
                            Object obj32 = list11.get(0);
                            N3.h.c(obj32, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView18 = (WebView) obj32;
                            WebViewClient webViewClient = (WebViewClient) list11.get(1);
                            try {
                                c1039j21.getClass();
                                webView18.setWebViewClient(webViewClient);
                                listQ20 = AbstractC0149a.y(null);
                            } catch (Throwable th20) {
                                listQ20 = Z1.f.Q(th20);
                            }
                            lVar.u(listQ20);
                            break;
                        case 21:
                            C1039j c1039j22 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list12 = (List) obj;
                            Object obj33 = list12.get(0);
                            N3.h.c(obj33, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView19 = (WebView) obj33;
                            Object obj34 = list12.get(1);
                            N3.h.c(obj34, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.JavaScriptChannel");
                            C1048s c1048s = (C1048s) obj34;
                            try {
                                c1039j22.getClass();
                                webView19.addJavascriptInterface(c1048s, c1048s.f11098a);
                                listQ21 = AbstractC0149a.y(null);
                            } catch (Throwable th21) {
                                listQ21 = Z1.f.Q(th21);
                            }
                            lVar.u(listQ21);
                            break;
                        default:
                            C1039j c1039j23 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj;
                            Object obj35 = list13.get(0);
                            N3.h.c(obj35, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView20 = (WebView) obj35;
                            Object obj36 = list13.get(1);
                            N3.h.c(obj36, "null cannot be cast to non-null type kotlin.String");
                            String str11 = (String) obj36;
                            try {
                                c1039j23.getClass();
                                webView20.removeJavascriptInterface(str11);
                                listQ22 = AbstractC0149a.y(null);
                            } catch (Throwable th22) {
                                listQ22 = Z1.f.Q(th22);
                            }
                            lVar.u(listQ22);
                            break;
                    }
                }
            });
        } else {
            iVar14.E(null);
        }
        i iVar15 = new i(interfaceC0696f, "dev.flutter.pigeon.webview_flutter_android.WebView.getTitle", gVar, (C0200z) null);
        if (c1039j != null) {
            final int i18 = 18;
            iVar15.E(new InterfaceC0692b() { // from class: y3.I
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
                    List listQ18;
                    List listQ19;
                    List listQ20;
                    List listQ21;
                    List listQ22;
                    switch (i18) {
                        case 0:
                            C1039j c1039j2 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj2 = ((List) obj).get(0);
                            N3.h.c(obj2, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((C1032c) c1039j2.f11068a.f9n).a(((Long) obj2).longValue(), c1039j2.a());
                                listQ = AbstractC0149a.y(null);
                            } catch (Throwable th) {
                                listQ = Z1.f.Q(th);
                            }
                            lVar.u(listQ);
                            break;
                        case 1:
                            C1039j c1039j3 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj3 = list.get(0);
                            N3.h.c(obj3, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView = (WebView) obj3;
                            DownloadListener downloadListener = (DownloadListener) list.get(1);
                            try {
                                c1039j3.getClass();
                                webView.setDownloadListener(downloadListener);
                                listQ2 = AbstractC0149a.y(null);
                            } catch (Throwable th2) {
                                listQ2 = Z1.f.Q(th2);
                            }
                            lVar.u(listQ2);
                            break;
                        case 2:
                            C1039j c1039j4 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj;
                            Object obj4 = list2.get(0);
                            N3.h.c(obj4, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView2 = (WebView) obj4;
                            Object obj5 = list2.get(1);
                            N3.h.c(obj5, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((C1032c) c1039j4.f11068a.f9n).a(((Long) obj5).longValue(), webView2.getSettings());
                                listQ3 = AbstractC0149a.y(null);
                            } catch (Throwable th3) {
                                listQ3 = Z1.f.Q(th3);
                            }
                            lVar.u(listQ3);
                            break;
                        case 3:
                            C1039j c1039j5 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj;
                            Object obj6 = list3.get(0);
                            N3.h.c(obj6, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView3 = (WebView) obj6;
                            C1022Q c1022q = (C1022Q) list3.get(1);
                            try {
                                c1039j5.getClass();
                                webView3.setWebChromeClient(c1022q);
                                listQ4 = AbstractC0149a.y(null);
                            } catch (Throwable th4) {
                                listQ4 = Z1.f.Q(th4);
                            }
                            lVar.u(listQ4);
                            break;
                        case 4:
                            C1039j c1039j6 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj;
                            Object obj7 = list4.get(0);
                            N3.h.c(obj7, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView4 = (WebView) obj7;
                            Object obj8 = list4.get(1);
                            N3.h.c(obj8, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue = ((Long) obj8).longValue();
                            try {
                                c1039j6.getClass();
                                webView4.setBackgroundColor((int) jLongValue);
                                listQ5 = AbstractC0149a.y(null);
                            } catch (Throwable th5) {
                                listQ5 = Z1.f.Q(th5);
                            }
                            lVar.u(listQ5);
                            break;
                        case 5:
                            C1039j c1039j7 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj9 = ((List) obj).get(0);
                            N3.h.c(obj9, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView5 = (WebView) obj9;
                            try {
                                c1039j7.getClass();
                                webView5.destroy();
                                listQ6 = AbstractC0149a.y(null);
                            } catch (Throwable th6) {
                                listQ6 = Z1.f.Q(th6);
                            }
                            lVar.u(listQ6);
                            break;
                        case O.j.STRING_SET_FIELD_NUMBER /* 6 */:
                            C1039j c1039j8 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj;
                            Object obj10 = list5.get(0);
                            N3.h.c(obj10, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView6 = (WebView) obj10;
                            Object obj11 = list5.get(1);
                            N3.h.c(obj11, "null cannot be cast to non-null type kotlin.String");
                            String str = (String) obj11;
                            String str2 = (String) list5.get(2);
                            String str3 = (String) list5.get(3);
                            try {
                                c1039j8.getClass();
                                webView6.loadData(str, str2, str3);
                                listQ7 = AbstractC0149a.y(null);
                            } catch (Throwable th7) {
                                listQ7 = Z1.f.Q(th7);
                            }
                            lVar.u(listQ7);
                            break;
                        case O.j.DOUBLE_FIELD_NUMBER /* 7 */:
                            C1039j c1039j9 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj;
                            Object obj12 = list6.get(0);
                            N3.h.c(obj12, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView7 = (WebView) obj12;
                            String str4 = (String) list6.get(1);
                            Object obj13 = list6.get(2);
                            N3.h.c(obj13, "null cannot be cast to non-null type kotlin.String");
                            String str5 = (String) obj13;
                            String str6 = (String) list6.get(3);
                            String str7 = (String) list6.get(4);
                            String str8 = (String) list6.get(5);
                            try {
                                c1039j9.getClass();
                                webView7.loadDataWithBaseURL(str4, str5, str6, str7, str8);
                                listQ8 = AbstractC0149a.y(null);
                            } catch (Throwable th8) {
                                listQ8 = Z1.f.Q(th8);
                            }
                            lVar.u(listQ8);
                            break;
                        case O.j.BYTES_FIELD_NUMBER /* 8 */:
                            C1039j c1039j10 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj;
                            Object obj14 = list7.get(0);
                            N3.h.c(obj14, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView8 = (WebView) obj14;
                            Object obj15 = list7.get(1);
                            N3.h.c(obj15, "null cannot be cast to non-null type kotlin.String");
                            String str9 = (String) obj15;
                            Object obj16 = list7.get(2);
                            N3.h.c(obj16, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.String>");
                            Map<String, String> map = (Map) obj16;
                            try {
                                c1039j10.getClass();
                                webView8.loadUrl(str9, map);
                                listQ9 = AbstractC0149a.y(null);
                            } catch (Throwable th9) {
                                listQ9 = Z1.f.Q(th9);
                            }
                            lVar.u(listQ9);
                            break;
                        case 9:
                            C1039j c1039j11 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj;
                            Object obj17 = list8.get(0);
                            N3.h.c(obj17, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView9 = (WebView) obj17;
                            Object obj18 = list8.get(1);
                            N3.h.c(obj18, "null cannot be cast to non-null type kotlin.String");
                            String str10 = (String) obj18;
                            Object obj19 = list8.get(2);
                            N3.h.c(obj19, "null cannot be cast to non-null type kotlin.ByteArray");
                            byte[] bArr = (byte[]) obj19;
                            try {
                                c1039j11.getClass();
                                webView9.postUrl(str10, bArr);
                                listQ10 = AbstractC0149a.y(null);
                            } catch (Throwable th10) {
                                listQ10 = Z1.f.Q(th10);
                            }
                            lVar.u(listQ10);
                            break;
                        case 10:
                            C1039j c1039j12 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj20 = ((List) obj).get(0);
                            N3.h.c(obj20, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView10 = (WebView) obj20;
                            try {
                                c1039j12.getClass();
                                listQ11 = AbstractC0149a.y(webView10.getUrl());
                            } catch (Throwable th11) {
                                listQ11 = Z1.f.Q(th11);
                            }
                            lVar.u(listQ11);
                            break;
                        case 11:
                            C1039j c1039j13 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj21 = ((List) obj).get(0);
                            N3.h.c(obj21, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView11 = (WebView) obj21;
                            try {
                                c1039j13.getClass();
                                webView11.goForward();
                                listQ12 = AbstractC0149a.y(null);
                            } catch (Throwable th12) {
                                listQ12 = Z1.f.Q(th12);
                            }
                            lVar.u(listQ12);
                            break;
                        case 12:
                            C1039j c1039j14 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj22 = ((List) obj).get(0);
                            N3.h.c(obj22, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView12 = (WebView) obj22;
                            try {
                                c1039j14.getClass();
                                listQ13 = AbstractC0149a.y(Boolean.valueOf(webView12.canGoBack()));
                            } catch (Throwable th13) {
                                listQ13 = Z1.f.Q(th13);
                            }
                            lVar.u(listQ13);
                            break;
                        case 13:
                            C1039j c1039j15 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj23 = ((List) obj).get(0);
                            N3.h.c(obj23, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView13 = (WebView) obj23;
                            try {
                                c1039j15.getClass();
                                listQ14 = AbstractC0149a.y(Boolean.valueOf(webView13.canGoForward()));
                            } catch (Throwable th14) {
                                listQ14 = Z1.f.Q(th14);
                            }
                            lVar.u(listQ14);
                            break;
                        case 14:
                            C1039j c1039j16 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj24 = ((List) obj).get(0);
                            N3.h.c(obj24, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView14 = (WebView) obj24;
                            try {
                                c1039j16.getClass();
                                webView14.goBack();
                                listQ15 = AbstractC0149a.y(null);
                            } catch (Throwable th15) {
                                listQ15 = Z1.f.Q(th15);
                            }
                            lVar.u(listQ15);
                            break;
                        case 15:
                            C1039j c1039j17 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj25 = ((List) obj).get(0);
                            N3.h.c(obj25, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView15 = (WebView) obj25;
                            try {
                                c1039j17.getClass();
                                webView15.reload();
                                listQ16 = AbstractC0149a.y(null);
                            } catch (Throwable th16) {
                                listQ16 = Z1.f.Q(th16);
                            }
                            lVar.u(listQ16);
                            break;
                        case 16:
                            C1039j c1039j18 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj;
                            Object obj26 = list9.get(0);
                            N3.h.c(obj26, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView16 = (WebView) obj26;
                            Object obj27 = list9.get(1);
                            N3.h.c(obj27, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue = ((Boolean) obj27).booleanValue();
                            try {
                                c1039j18.getClass();
                                webView16.clearCache(zBooleanValue);
                                listQ17 = AbstractC0149a.y(null);
                            } catch (Throwable th17) {
                                listQ17 = Z1.f.Q(th17);
                            }
                            lVar.u(listQ17);
                            break;
                        case 17:
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj;
                            Object obj28 = list10.get(0);
                            N3.h.c(obj28, "null cannot be cast to non-null type android.webkit.WebView");
                            Object obj29 = list10.get(1);
                            N3.h.c(obj29, "null cannot be cast to non-null type kotlin.String");
                            C1054y c1054y = new C1054y(lVar, 1);
                            c1039j.getClass();
                            ((WebView) obj28).evaluateJavascript((String) obj29, new C1042m(1, c1054y));
                            break;
                        case 18:
                            C1039j c1039j19 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj30 = ((List) obj).get(0);
                            N3.h.c(obj30, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView17 = (WebView) obj30;
                            try {
                                c1039j19.getClass();
                                listQ18 = AbstractC0149a.y(webView17.getTitle());
                            } catch (Throwable th18) {
                                listQ18 = Z1.f.Q(th18);
                            }
                            lVar.u(listQ18);
                            break;
                        case 19:
                            C1039j c1039j20 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj31 = ((List) obj).get(0);
                            N3.h.c(obj31, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue2 = ((Boolean) obj31).booleanValue();
                            try {
                                c1039j20.getClass();
                                WebView.setWebContentsDebuggingEnabled(zBooleanValue2);
                                listQ19 = AbstractC0149a.y(null);
                            } catch (Throwable th19) {
                                listQ19 = Z1.f.Q(th19);
                            }
                            lVar.u(listQ19);
                            break;
                        case 20:
                            C1039j c1039j21 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj;
                            Object obj32 = list11.get(0);
                            N3.h.c(obj32, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView18 = (WebView) obj32;
                            WebViewClient webViewClient = (WebViewClient) list11.get(1);
                            try {
                                c1039j21.getClass();
                                webView18.setWebViewClient(webViewClient);
                                listQ20 = AbstractC0149a.y(null);
                            } catch (Throwable th20) {
                                listQ20 = Z1.f.Q(th20);
                            }
                            lVar.u(listQ20);
                            break;
                        case 21:
                            C1039j c1039j22 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list12 = (List) obj;
                            Object obj33 = list12.get(0);
                            N3.h.c(obj33, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView19 = (WebView) obj33;
                            Object obj34 = list12.get(1);
                            N3.h.c(obj34, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.JavaScriptChannel");
                            C1048s c1048s = (C1048s) obj34;
                            try {
                                c1039j22.getClass();
                                webView19.addJavascriptInterface(c1048s, c1048s.f11098a);
                                listQ21 = AbstractC0149a.y(null);
                            } catch (Throwable th21) {
                                listQ21 = Z1.f.Q(th21);
                            }
                            lVar.u(listQ21);
                            break;
                        default:
                            C1039j c1039j23 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj;
                            Object obj35 = list13.get(0);
                            N3.h.c(obj35, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView20 = (WebView) obj35;
                            Object obj36 = list13.get(1);
                            N3.h.c(obj36, "null cannot be cast to non-null type kotlin.String");
                            String str11 = (String) obj36;
                            try {
                                c1039j23.getClass();
                                webView20.removeJavascriptInterface(str11);
                                listQ22 = AbstractC0149a.y(null);
                            } catch (Throwable th22) {
                                listQ22 = Z1.f.Q(th22);
                            }
                            lVar.u(listQ22);
                            break;
                    }
                }
            });
        } else {
            iVar15.E(null);
        }
        i iVar16 = new i(interfaceC0696f, "dev.flutter.pigeon.webview_flutter_android.WebView.setWebContentsDebuggingEnabled", gVar, (C0200z) null);
        if (c1039j != null) {
            final int i19 = 19;
            iVar16.E(new InterfaceC0692b() { // from class: y3.I
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
                    List listQ18;
                    List listQ19;
                    List listQ20;
                    List listQ21;
                    List listQ22;
                    switch (i19) {
                        case 0:
                            C1039j c1039j2 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj2 = ((List) obj).get(0);
                            N3.h.c(obj2, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((C1032c) c1039j2.f11068a.f9n).a(((Long) obj2).longValue(), c1039j2.a());
                                listQ = AbstractC0149a.y(null);
                            } catch (Throwable th) {
                                listQ = Z1.f.Q(th);
                            }
                            lVar.u(listQ);
                            break;
                        case 1:
                            C1039j c1039j3 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj3 = list.get(0);
                            N3.h.c(obj3, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView = (WebView) obj3;
                            DownloadListener downloadListener = (DownloadListener) list.get(1);
                            try {
                                c1039j3.getClass();
                                webView.setDownloadListener(downloadListener);
                                listQ2 = AbstractC0149a.y(null);
                            } catch (Throwable th2) {
                                listQ2 = Z1.f.Q(th2);
                            }
                            lVar.u(listQ2);
                            break;
                        case 2:
                            C1039j c1039j4 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj;
                            Object obj4 = list2.get(0);
                            N3.h.c(obj4, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView2 = (WebView) obj4;
                            Object obj5 = list2.get(1);
                            N3.h.c(obj5, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((C1032c) c1039j4.f11068a.f9n).a(((Long) obj5).longValue(), webView2.getSettings());
                                listQ3 = AbstractC0149a.y(null);
                            } catch (Throwable th3) {
                                listQ3 = Z1.f.Q(th3);
                            }
                            lVar.u(listQ3);
                            break;
                        case 3:
                            C1039j c1039j5 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj;
                            Object obj6 = list3.get(0);
                            N3.h.c(obj6, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView3 = (WebView) obj6;
                            C1022Q c1022q = (C1022Q) list3.get(1);
                            try {
                                c1039j5.getClass();
                                webView3.setWebChromeClient(c1022q);
                                listQ4 = AbstractC0149a.y(null);
                            } catch (Throwable th4) {
                                listQ4 = Z1.f.Q(th4);
                            }
                            lVar.u(listQ4);
                            break;
                        case 4:
                            C1039j c1039j6 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj;
                            Object obj7 = list4.get(0);
                            N3.h.c(obj7, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView4 = (WebView) obj7;
                            Object obj8 = list4.get(1);
                            N3.h.c(obj8, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue = ((Long) obj8).longValue();
                            try {
                                c1039j6.getClass();
                                webView4.setBackgroundColor((int) jLongValue);
                                listQ5 = AbstractC0149a.y(null);
                            } catch (Throwable th5) {
                                listQ5 = Z1.f.Q(th5);
                            }
                            lVar.u(listQ5);
                            break;
                        case 5:
                            C1039j c1039j7 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj9 = ((List) obj).get(0);
                            N3.h.c(obj9, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView5 = (WebView) obj9;
                            try {
                                c1039j7.getClass();
                                webView5.destroy();
                                listQ6 = AbstractC0149a.y(null);
                            } catch (Throwable th6) {
                                listQ6 = Z1.f.Q(th6);
                            }
                            lVar.u(listQ6);
                            break;
                        case O.j.STRING_SET_FIELD_NUMBER /* 6 */:
                            C1039j c1039j8 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj;
                            Object obj10 = list5.get(0);
                            N3.h.c(obj10, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView6 = (WebView) obj10;
                            Object obj11 = list5.get(1);
                            N3.h.c(obj11, "null cannot be cast to non-null type kotlin.String");
                            String str = (String) obj11;
                            String str2 = (String) list5.get(2);
                            String str3 = (String) list5.get(3);
                            try {
                                c1039j8.getClass();
                                webView6.loadData(str, str2, str3);
                                listQ7 = AbstractC0149a.y(null);
                            } catch (Throwable th7) {
                                listQ7 = Z1.f.Q(th7);
                            }
                            lVar.u(listQ7);
                            break;
                        case O.j.DOUBLE_FIELD_NUMBER /* 7 */:
                            C1039j c1039j9 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj;
                            Object obj12 = list6.get(0);
                            N3.h.c(obj12, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView7 = (WebView) obj12;
                            String str4 = (String) list6.get(1);
                            Object obj13 = list6.get(2);
                            N3.h.c(obj13, "null cannot be cast to non-null type kotlin.String");
                            String str5 = (String) obj13;
                            String str6 = (String) list6.get(3);
                            String str7 = (String) list6.get(4);
                            String str8 = (String) list6.get(5);
                            try {
                                c1039j9.getClass();
                                webView7.loadDataWithBaseURL(str4, str5, str6, str7, str8);
                                listQ8 = AbstractC0149a.y(null);
                            } catch (Throwable th8) {
                                listQ8 = Z1.f.Q(th8);
                            }
                            lVar.u(listQ8);
                            break;
                        case O.j.BYTES_FIELD_NUMBER /* 8 */:
                            C1039j c1039j10 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj;
                            Object obj14 = list7.get(0);
                            N3.h.c(obj14, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView8 = (WebView) obj14;
                            Object obj15 = list7.get(1);
                            N3.h.c(obj15, "null cannot be cast to non-null type kotlin.String");
                            String str9 = (String) obj15;
                            Object obj16 = list7.get(2);
                            N3.h.c(obj16, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.String>");
                            Map<String, String> map = (Map) obj16;
                            try {
                                c1039j10.getClass();
                                webView8.loadUrl(str9, map);
                                listQ9 = AbstractC0149a.y(null);
                            } catch (Throwable th9) {
                                listQ9 = Z1.f.Q(th9);
                            }
                            lVar.u(listQ9);
                            break;
                        case 9:
                            C1039j c1039j11 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj;
                            Object obj17 = list8.get(0);
                            N3.h.c(obj17, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView9 = (WebView) obj17;
                            Object obj18 = list8.get(1);
                            N3.h.c(obj18, "null cannot be cast to non-null type kotlin.String");
                            String str10 = (String) obj18;
                            Object obj19 = list8.get(2);
                            N3.h.c(obj19, "null cannot be cast to non-null type kotlin.ByteArray");
                            byte[] bArr = (byte[]) obj19;
                            try {
                                c1039j11.getClass();
                                webView9.postUrl(str10, bArr);
                                listQ10 = AbstractC0149a.y(null);
                            } catch (Throwable th10) {
                                listQ10 = Z1.f.Q(th10);
                            }
                            lVar.u(listQ10);
                            break;
                        case 10:
                            C1039j c1039j12 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj20 = ((List) obj).get(0);
                            N3.h.c(obj20, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView10 = (WebView) obj20;
                            try {
                                c1039j12.getClass();
                                listQ11 = AbstractC0149a.y(webView10.getUrl());
                            } catch (Throwable th11) {
                                listQ11 = Z1.f.Q(th11);
                            }
                            lVar.u(listQ11);
                            break;
                        case 11:
                            C1039j c1039j13 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj21 = ((List) obj).get(0);
                            N3.h.c(obj21, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView11 = (WebView) obj21;
                            try {
                                c1039j13.getClass();
                                webView11.goForward();
                                listQ12 = AbstractC0149a.y(null);
                            } catch (Throwable th12) {
                                listQ12 = Z1.f.Q(th12);
                            }
                            lVar.u(listQ12);
                            break;
                        case 12:
                            C1039j c1039j14 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj22 = ((List) obj).get(0);
                            N3.h.c(obj22, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView12 = (WebView) obj22;
                            try {
                                c1039j14.getClass();
                                listQ13 = AbstractC0149a.y(Boolean.valueOf(webView12.canGoBack()));
                            } catch (Throwable th13) {
                                listQ13 = Z1.f.Q(th13);
                            }
                            lVar.u(listQ13);
                            break;
                        case 13:
                            C1039j c1039j15 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj23 = ((List) obj).get(0);
                            N3.h.c(obj23, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView13 = (WebView) obj23;
                            try {
                                c1039j15.getClass();
                                listQ14 = AbstractC0149a.y(Boolean.valueOf(webView13.canGoForward()));
                            } catch (Throwable th14) {
                                listQ14 = Z1.f.Q(th14);
                            }
                            lVar.u(listQ14);
                            break;
                        case 14:
                            C1039j c1039j16 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj24 = ((List) obj).get(0);
                            N3.h.c(obj24, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView14 = (WebView) obj24;
                            try {
                                c1039j16.getClass();
                                webView14.goBack();
                                listQ15 = AbstractC0149a.y(null);
                            } catch (Throwable th15) {
                                listQ15 = Z1.f.Q(th15);
                            }
                            lVar.u(listQ15);
                            break;
                        case 15:
                            C1039j c1039j17 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj25 = ((List) obj).get(0);
                            N3.h.c(obj25, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView15 = (WebView) obj25;
                            try {
                                c1039j17.getClass();
                                webView15.reload();
                                listQ16 = AbstractC0149a.y(null);
                            } catch (Throwable th16) {
                                listQ16 = Z1.f.Q(th16);
                            }
                            lVar.u(listQ16);
                            break;
                        case 16:
                            C1039j c1039j18 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj;
                            Object obj26 = list9.get(0);
                            N3.h.c(obj26, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView16 = (WebView) obj26;
                            Object obj27 = list9.get(1);
                            N3.h.c(obj27, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue = ((Boolean) obj27).booleanValue();
                            try {
                                c1039j18.getClass();
                                webView16.clearCache(zBooleanValue);
                                listQ17 = AbstractC0149a.y(null);
                            } catch (Throwable th17) {
                                listQ17 = Z1.f.Q(th17);
                            }
                            lVar.u(listQ17);
                            break;
                        case 17:
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj;
                            Object obj28 = list10.get(0);
                            N3.h.c(obj28, "null cannot be cast to non-null type android.webkit.WebView");
                            Object obj29 = list10.get(1);
                            N3.h.c(obj29, "null cannot be cast to non-null type kotlin.String");
                            C1054y c1054y = new C1054y(lVar, 1);
                            c1039j.getClass();
                            ((WebView) obj28).evaluateJavascript((String) obj29, new C1042m(1, c1054y));
                            break;
                        case 18:
                            C1039j c1039j19 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj30 = ((List) obj).get(0);
                            N3.h.c(obj30, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView17 = (WebView) obj30;
                            try {
                                c1039j19.getClass();
                                listQ18 = AbstractC0149a.y(webView17.getTitle());
                            } catch (Throwable th18) {
                                listQ18 = Z1.f.Q(th18);
                            }
                            lVar.u(listQ18);
                            break;
                        case 19:
                            C1039j c1039j20 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj31 = ((List) obj).get(0);
                            N3.h.c(obj31, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue2 = ((Boolean) obj31).booleanValue();
                            try {
                                c1039j20.getClass();
                                WebView.setWebContentsDebuggingEnabled(zBooleanValue2);
                                listQ19 = AbstractC0149a.y(null);
                            } catch (Throwable th19) {
                                listQ19 = Z1.f.Q(th19);
                            }
                            lVar.u(listQ19);
                            break;
                        case 20:
                            C1039j c1039j21 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj;
                            Object obj32 = list11.get(0);
                            N3.h.c(obj32, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView18 = (WebView) obj32;
                            WebViewClient webViewClient = (WebViewClient) list11.get(1);
                            try {
                                c1039j21.getClass();
                                webView18.setWebViewClient(webViewClient);
                                listQ20 = AbstractC0149a.y(null);
                            } catch (Throwable th20) {
                                listQ20 = Z1.f.Q(th20);
                            }
                            lVar.u(listQ20);
                            break;
                        case 21:
                            C1039j c1039j22 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list12 = (List) obj;
                            Object obj33 = list12.get(0);
                            N3.h.c(obj33, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView19 = (WebView) obj33;
                            Object obj34 = list12.get(1);
                            N3.h.c(obj34, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.JavaScriptChannel");
                            C1048s c1048s = (C1048s) obj34;
                            try {
                                c1039j22.getClass();
                                webView19.addJavascriptInterface(c1048s, c1048s.f11098a);
                                listQ21 = AbstractC0149a.y(null);
                            } catch (Throwable th21) {
                                listQ21 = Z1.f.Q(th21);
                            }
                            lVar.u(listQ21);
                            break;
                        default:
                            C1039j c1039j23 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj;
                            Object obj35 = list13.get(0);
                            N3.h.c(obj35, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView20 = (WebView) obj35;
                            Object obj36 = list13.get(1);
                            N3.h.c(obj36, "null cannot be cast to non-null type kotlin.String");
                            String str11 = (String) obj36;
                            try {
                                c1039j23.getClass();
                                webView20.removeJavascriptInterface(str11);
                                listQ22 = AbstractC0149a.y(null);
                            } catch (Throwable th22) {
                                listQ22 = Z1.f.Q(th22);
                            }
                            lVar.u(listQ22);
                            break;
                    }
                }
            });
        } else {
            iVar16.E(null);
        }
        i iVar17 = new i(interfaceC0696f, "dev.flutter.pigeon.webview_flutter_android.WebView.setWebViewClient", gVar, (C0200z) null);
        if (c1039j != null) {
            final int i20 = 20;
            iVar17.E(new InterfaceC0692b() { // from class: y3.I
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
                    List listQ18;
                    List listQ19;
                    List listQ20;
                    List listQ21;
                    List listQ22;
                    switch (i20) {
                        case 0:
                            C1039j c1039j2 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj2 = ((List) obj).get(0);
                            N3.h.c(obj2, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((C1032c) c1039j2.f11068a.f9n).a(((Long) obj2).longValue(), c1039j2.a());
                                listQ = AbstractC0149a.y(null);
                            } catch (Throwable th) {
                                listQ = Z1.f.Q(th);
                            }
                            lVar.u(listQ);
                            break;
                        case 1:
                            C1039j c1039j3 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj3 = list.get(0);
                            N3.h.c(obj3, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView = (WebView) obj3;
                            DownloadListener downloadListener = (DownloadListener) list.get(1);
                            try {
                                c1039j3.getClass();
                                webView.setDownloadListener(downloadListener);
                                listQ2 = AbstractC0149a.y(null);
                            } catch (Throwable th2) {
                                listQ2 = Z1.f.Q(th2);
                            }
                            lVar.u(listQ2);
                            break;
                        case 2:
                            C1039j c1039j4 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj;
                            Object obj4 = list2.get(0);
                            N3.h.c(obj4, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView2 = (WebView) obj4;
                            Object obj5 = list2.get(1);
                            N3.h.c(obj5, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((C1032c) c1039j4.f11068a.f9n).a(((Long) obj5).longValue(), webView2.getSettings());
                                listQ3 = AbstractC0149a.y(null);
                            } catch (Throwable th3) {
                                listQ3 = Z1.f.Q(th3);
                            }
                            lVar.u(listQ3);
                            break;
                        case 3:
                            C1039j c1039j5 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj;
                            Object obj6 = list3.get(0);
                            N3.h.c(obj6, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView3 = (WebView) obj6;
                            C1022Q c1022q = (C1022Q) list3.get(1);
                            try {
                                c1039j5.getClass();
                                webView3.setWebChromeClient(c1022q);
                                listQ4 = AbstractC0149a.y(null);
                            } catch (Throwable th4) {
                                listQ4 = Z1.f.Q(th4);
                            }
                            lVar.u(listQ4);
                            break;
                        case 4:
                            C1039j c1039j6 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj;
                            Object obj7 = list4.get(0);
                            N3.h.c(obj7, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView4 = (WebView) obj7;
                            Object obj8 = list4.get(1);
                            N3.h.c(obj8, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue = ((Long) obj8).longValue();
                            try {
                                c1039j6.getClass();
                                webView4.setBackgroundColor((int) jLongValue);
                                listQ5 = AbstractC0149a.y(null);
                            } catch (Throwable th5) {
                                listQ5 = Z1.f.Q(th5);
                            }
                            lVar.u(listQ5);
                            break;
                        case 5:
                            C1039j c1039j7 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj9 = ((List) obj).get(0);
                            N3.h.c(obj9, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView5 = (WebView) obj9;
                            try {
                                c1039j7.getClass();
                                webView5.destroy();
                                listQ6 = AbstractC0149a.y(null);
                            } catch (Throwable th6) {
                                listQ6 = Z1.f.Q(th6);
                            }
                            lVar.u(listQ6);
                            break;
                        case O.j.STRING_SET_FIELD_NUMBER /* 6 */:
                            C1039j c1039j8 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj;
                            Object obj10 = list5.get(0);
                            N3.h.c(obj10, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView6 = (WebView) obj10;
                            Object obj11 = list5.get(1);
                            N3.h.c(obj11, "null cannot be cast to non-null type kotlin.String");
                            String str = (String) obj11;
                            String str2 = (String) list5.get(2);
                            String str3 = (String) list5.get(3);
                            try {
                                c1039j8.getClass();
                                webView6.loadData(str, str2, str3);
                                listQ7 = AbstractC0149a.y(null);
                            } catch (Throwable th7) {
                                listQ7 = Z1.f.Q(th7);
                            }
                            lVar.u(listQ7);
                            break;
                        case O.j.DOUBLE_FIELD_NUMBER /* 7 */:
                            C1039j c1039j9 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj;
                            Object obj12 = list6.get(0);
                            N3.h.c(obj12, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView7 = (WebView) obj12;
                            String str4 = (String) list6.get(1);
                            Object obj13 = list6.get(2);
                            N3.h.c(obj13, "null cannot be cast to non-null type kotlin.String");
                            String str5 = (String) obj13;
                            String str6 = (String) list6.get(3);
                            String str7 = (String) list6.get(4);
                            String str8 = (String) list6.get(5);
                            try {
                                c1039j9.getClass();
                                webView7.loadDataWithBaseURL(str4, str5, str6, str7, str8);
                                listQ8 = AbstractC0149a.y(null);
                            } catch (Throwable th8) {
                                listQ8 = Z1.f.Q(th8);
                            }
                            lVar.u(listQ8);
                            break;
                        case O.j.BYTES_FIELD_NUMBER /* 8 */:
                            C1039j c1039j10 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj;
                            Object obj14 = list7.get(0);
                            N3.h.c(obj14, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView8 = (WebView) obj14;
                            Object obj15 = list7.get(1);
                            N3.h.c(obj15, "null cannot be cast to non-null type kotlin.String");
                            String str9 = (String) obj15;
                            Object obj16 = list7.get(2);
                            N3.h.c(obj16, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.String>");
                            Map<String, String> map = (Map) obj16;
                            try {
                                c1039j10.getClass();
                                webView8.loadUrl(str9, map);
                                listQ9 = AbstractC0149a.y(null);
                            } catch (Throwable th9) {
                                listQ9 = Z1.f.Q(th9);
                            }
                            lVar.u(listQ9);
                            break;
                        case 9:
                            C1039j c1039j11 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj;
                            Object obj17 = list8.get(0);
                            N3.h.c(obj17, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView9 = (WebView) obj17;
                            Object obj18 = list8.get(1);
                            N3.h.c(obj18, "null cannot be cast to non-null type kotlin.String");
                            String str10 = (String) obj18;
                            Object obj19 = list8.get(2);
                            N3.h.c(obj19, "null cannot be cast to non-null type kotlin.ByteArray");
                            byte[] bArr = (byte[]) obj19;
                            try {
                                c1039j11.getClass();
                                webView9.postUrl(str10, bArr);
                                listQ10 = AbstractC0149a.y(null);
                            } catch (Throwable th10) {
                                listQ10 = Z1.f.Q(th10);
                            }
                            lVar.u(listQ10);
                            break;
                        case 10:
                            C1039j c1039j12 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj20 = ((List) obj).get(0);
                            N3.h.c(obj20, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView10 = (WebView) obj20;
                            try {
                                c1039j12.getClass();
                                listQ11 = AbstractC0149a.y(webView10.getUrl());
                            } catch (Throwable th11) {
                                listQ11 = Z1.f.Q(th11);
                            }
                            lVar.u(listQ11);
                            break;
                        case 11:
                            C1039j c1039j13 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj21 = ((List) obj).get(0);
                            N3.h.c(obj21, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView11 = (WebView) obj21;
                            try {
                                c1039j13.getClass();
                                webView11.goForward();
                                listQ12 = AbstractC0149a.y(null);
                            } catch (Throwable th12) {
                                listQ12 = Z1.f.Q(th12);
                            }
                            lVar.u(listQ12);
                            break;
                        case 12:
                            C1039j c1039j14 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj22 = ((List) obj).get(0);
                            N3.h.c(obj22, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView12 = (WebView) obj22;
                            try {
                                c1039j14.getClass();
                                listQ13 = AbstractC0149a.y(Boolean.valueOf(webView12.canGoBack()));
                            } catch (Throwable th13) {
                                listQ13 = Z1.f.Q(th13);
                            }
                            lVar.u(listQ13);
                            break;
                        case 13:
                            C1039j c1039j15 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj23 = ((List) obj).get(0);
                            N3.h.c(obj23, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView13 = (WebView) obj23;
                            try {
                                c1039j15.getClass();
                                listQ14 = AbstractC0149a.y(Boolean.valueOf(webView13.canGoForward()));
                            } catch (Throwable th14) {
                                listQ14 = Z1.f.Q(th14);
                            }
                            lVar.u(listQ14);
                            break;
                        case 14:
                            C1039j c1039j16 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj24 = ((List) obj).get(0);
                            N3.h.c(obj24, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView14 = (WebView) obj24;
                            try {
                                c1039j16.getClass();
                                webView14.goBack();
                                listQ15 = AbstractC0149a.y(null);
                            } catch (Throwable th15) {
                                listQ15 = Z1.f.Q(th15);
                            }
                            lVar.u(listQ15);
                            break;
                        case 15:
                            C1039j c1039j17 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj25 = ((List) obj).get(0);
                            N3.h.c(obj25, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView15 = (WebView) obj25;
                            try {
                                c1039j17.getClass();
                                webView15.reload();
                                listQ16 = AbstractC0149a.y(null);
                            } catch (Throwable th16) {
                                listQ16 = Z1.f.Q(th16);
                            }
                            lVar.u(listQ16);
                            break;
                        case 16:
                            C1039j c1039j18 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj;
                            Object obj26 = list9.get(0);
                            N3.h.c(obj26, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView16 = (WebView) obj26;
                            Object obj27 = list9.get(1);
                            N3.h.c(obj27, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue = ((Boolean) obj27).booleanValue();
                            try {
                                c1039j18.getClass();
                                webView16.clearCache(zBooleanValue);
                                listQ17 = AbstractC0149a.y(null);
                            } catch (Throwable th17) {
                                listQ17 = Z1.f.Q(th17);
                            }
                            lVar.u(listQ17);
                            break;
                        case 17:
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj;
                            Object obj28 = list10.get(0);
                            N3.h.c(obj28, "null cannot be cast to non-null type android.webkit.WebView");
                            Object obj29 = list10.get(1);
                            N3.h.c(obj29, "null cannot be cast to non-null type kotlin.String");
                            C1054y c1054y = new C1054y(lVar, 1);
                            c1039j.getClass();
                            ((WebView) obj28).evaluateJavascript((String) obj29, new C1042m(1, c1054y));
                            break;
                        case 18:
                            C1039j c1039j19 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj30 = ((List) obj).get(0);
                            N3.h.c(obj30, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView17 = (WebView) obj30;
                            try {
                                c1039j19.getClass();
                                listQ18 = AbstractC0149a.y(webView17.getTitle());
                            } catch (Throwable th18) {
                                listQ18 = Z1.f.Q(th18);
                            }
                            lVar.u(listQ18);
                            break;
                        case 19:
                            C1039j c1039j20 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj31 = ((List) obj).get(0);
                            N3.h.c(obj31, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue2 = ((Boolean) obj31).booleanValue();
                            try {
                                c1039j20.getClass();
                                WebView.setWebContentsDebuggingEnabled(zBooleanValue2);
                                listQ19 = AbstractC0149a.y(null);
                            } catch (Throwable th19) {
                                listQ19 = Z1.f.Q(th19);
                            }
                            lVar.u(listQ19);
                            break;
                        case 20:
                            C1039j c1039j21 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj;
                            Object obj32 = list11.get(0);
                            N3.h.c(obj32, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView18 = (WebView) obj32;
                            WebViewClient webViewClient = (WebViewClient) list11.get(1);
                            try {
                                c1039j21.getClass();
                                webView18.setWebViewClient(webViewClient);
                                listQ20 = AbstractC0149a.y(null);
                            } catch (Throwable th20) {
                                listQ20 = Z1.f.Q(th20);
                            }
                            lVar.u(listQ20);
                            break;
                        case 21:
                            C1039j c1039j22 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list12 = (List) obj;
                            Object obj33 = list12.get(0);
                            N3.h.c(obj33, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView19 = (WebView) obj33;
                            Object obj34 = list12.get(1);
                            N3.h.c(obj34, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.JavaScriptChannel");
                            C1048s c1048s = (C1048s) obj34;
                            try {
                                c1039j22.getClass();
                                webView19.addJavascriptInterface(c1048s, c1048s.f11098a);
                                listQ21 = AbstractC0149a.y(null);
                            } catch (Throwable th21) {
                                listQ21 = Z1.f.Q(th21);
                            }
                            lVar.u(listQ21);
                            break;
                        default:
                            C1039j c1039j23 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj;
                            Object obj35 = list13.get(0);
                            N3.h.c(obj35, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView20 = (WebView) obj35;
                            Object obj36 = list13.get(1);
                            N3.h.c(obj36, "null cannot be cast to non-null type kotlin.String");
                            String str11 = (String) obj36;
                            try {
                                c1039j23.getClass();
                                webView20.removeJavascriptInterface(str11);
                                listQ22 = AbstractC0149a.y(null);
                            } catch (Throwable th22) {
                                listQ22 = Z1.f.Q(th22);
                            }
                            lVar.u(listQ22);
                            break;
                    }
                }
            });
        } else {
            iVar17.E(null);
        }
        i iVar18 = new i(interfaceC0696f, "dev.flutter.pigeon.webview_flutter_android.WebView.addJavaScriptChannel", gVar, (C0200z) null);
        if (c1039j != null) {
            final int i21 = 21;
            iVar18.E(new InterfaceC0692b() { // from class: y3.I
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
                    List listQ18;
                    List listQ19;
                    List listQ20;
                    List listQ21;
                    List listQ22;
                    switch (i21) {
                        case 0:
                            C1039j c1039j2 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj2 = ((List) obj).get(0);
                            N3.h.c(obj2, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((C1032c) c1039j2.f11068a.f9n).a(((Long) obj2).longValue(), c1039j2.a());
                                listQ = AbstractC0149a.y(null);
                            } catch (Throwable th) {
                                listQ = Z1.f.Q(th);
                            }
                            lVar.u(listQ);
                            break;
                        case 1:
                            C1039j c1039j3 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj3 = list.get(0);
                            N3.h.c(obj3, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView = (WebView) obj3;
                            DownloadListener downloadListener = (DownloadListener) list.get(1);
                            try {
                                c1039j3.getClass();
                                webView.setDownloadListener(downloadListener);
                                listQ2 = AbstractC0149a.y(null);
                            } catch (Throwable th2) {
                                listQ2 = Z1.f.Q(th2);
                            }
                            lVar.u(listQ2);
                            break;
                        case 2:
                            C1039j c1039j4 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj;
                            Object obj4 = list2.get(0);
                            N3.h.c(obj4, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView2 = (WebView) obj4;
                            Object obj5 = list2.get(1);
                            N3.h.c(obj5, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((C1032c) c1039j4.f11068a.f9n).a(((Long) obj5).longValue(), webView2.getSettings());
                                listQ3 = AbstractC0149a.y(null);
                            } catch (Throwable th3) {
                                listQ3 = Z1.f.Q(th3);
                            }
                            lVar.u(listQ3);
                            break;
                        case 3:
                            C1039j c1039j5 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj;
                            Object obj6 = list3.get(0);
                            N3.h.c(obj6, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView3 = (WebView) obj6;
                            C1022Q c1022q = (C1022Q) list3.get(1);
                            try {
                                c1039j5.getClass();
                                webView3.setWebChromeClient(c1022q);
                                listQ4 = AbstractC0149a.y(null);
                            } catch (Throwable th4) {
                                listQ4 = Z1.f.Q(th4);
                            }
                            lVar.u(listQ4);
                            break;
                        case 4:
                            C1039j c1039j6 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj;
                            Object obj7 = list4.get(0);
                            N3.h.c(obj7, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView4 = (WebView) obj7;
                            Object obj8 = list4.get(1);
                            N3.h.c(obj8, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue = ((Long) obj8).longValue();
                            try {
                                c1039j6.getClass();
                                webView4.setBackgroundColor((int) jLongValue);
                                listQ5 = AbstractC0149a.y(null);
                            } catch (Throwable th5) {
                                listQ5 = Z1.f.Q(th5);
                            }
                            lVar.u(listQ5);
                            break;
                        case 5:
                            C1039j c1039j7 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj9 = ((List) obj).get(0);
                            N3.h.c(obj9, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView5 = (WebView) obj9;
                            try {
                                c1039j7.getClass();
                                webView5.destroy();
                                listQ6 = AbstractC0149a.y(null);
                            } catch (Throwable th6) {
                                listQ6 = Z1.f.Q(th6);
                            }
                            lVar.u(listQ6);
                            break;
                        case O.j.STRING_SET_FIELD_NUMBER /* 6 */:
                            C1039j c1039j8 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj;
                            Object obj10 = list5.get(0);
                            N3.h.c(obj10, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView6 = (WebView) obj10;
                            Object obj11 = list5.get(1);
                            N3.h.c(obj11, "null cannot be cast to non-null type kotlin.String");
                            String str = (String) obj11;
                            String str2 = (String) list5.get(2);
                            String str3 = (String) list5.get(3);
                            try {
                                c1039j8.getClass();
                                webView6.loadData(str, str2, str3);
                                listQ7 = AbstractC0149a.y(null);
                            } catch (Throwable th7) {
                                listQ7 = Z1.f.Q(th7);
                            }
                            lVar.u(listQ7);
                            break;
                        case O.j.DOUBLE_FIELD_NUMBER /* 7 */:
                            C1039j c1039j9 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj;
                            Object obj12 = list6.get(0);
                            N3.h.c(obj12, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView7 = (WebView) obj12;
                            String str4 = (String) list6.get(1);
                            Object obj13 = list6.get(2);
                            N3.h.c(obj13, "null cannot be cast to non-null type kotlin.String");
                            String str5 = (String) obj13;
                            String str6 = (String) list6.get(3);
                            String str7 = (String) list6.get(4);
                            String str8 = (String) list6.get(5);
                            try {
                                c1039j9.getClass();
                                webView7.loadDataWithBaseURL(str4, str5, str6, str7, str8);
                                listQ8 = AbstractC0149a.y(null);
                            } catch (Throwable th8) {
                                listQ8 = Z1.f.Q(th8);
                            }
                            lVar.u(listQ8);
                            break;
                        case O.j.BYTES_FIELD_NUMBER /* 8 */:
                            C1039j c1039j10 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj;
                            Object obj14 = list7.get(0);
                            N3.h.c(obj14, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView8 = (WebView) obj14;
                            Object obj15 = list7.get(1);
                            N3.h.c(obj15, "null cannot be cast to non-null type kotlin.String");
                            String str9 = (String) obj15;
                            Object obj16 = list7.get(2);
                            N3.h.c(obj16, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.String>");
                            Map<String, String> map = (Map) obj16;
                            try {
                                c1039j10.getClass();
                                webView8.loadUrl(str9, map);
                                listQ9 = AbstractC0149a.y(null);
                            } catch (Throwable th9) {
                                listQ9 = Z1.f.Q(th9);
                            }
                            lVar.u(listQ9);
                            break;
                        case 9:
                            C1039j c1039j11 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj;
                            Object obj17 = list8.get(0);
                            N3.h.c(obj17, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView9 = (WebView) obj17;
                            Object obj18 = list8.get(1);
                            N3.h.c(obj18, "null cannot be cast to non-null type kotlin.String");
                            String str10 = (String) obj18;
                            Object obj19 = list8.get(2);
                            N3.h.c(obj19, "null cannot be cast to non-null type kotlin.ByteArray");
                            byte[] bArr = (byte[]) obj19;
                            try {
                                c1039j11.getClass();
                                webView9.postUrl(str10, bArr);
                                listQ10 = AbstractC0149a.y(null);
                            } catch (Throwable th10) {
                                listQ10 = Z1.f.Q(th10);
                            }
                            lVar.u(listQ10);
                            break;
                        case 10:
                            C1039j c1039j12 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj20 = ((List) obj).get(0);
                            N3.h.c(obj20, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView10 = (WebView) obj20;
                            try {
                                c1039j12.getClass();
                                listQ11 = AbstractC0149a.y(webView10.getUrl());
                            } catch (Throwable th11) {
                                listQ11 = Z1.f.Q(th11);
                            }
                            lVar.u(listQ11);
                            break;
                        case 11:
                            C1039j c1039j13 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj21 = ((List) obj).get(0);
                            N3.h.c(obj21, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView11 = (WebView) obj21;
                            try {
                                c1039j13.getClass();
                                webView11.goForward();
                                listQ12 = AbstractC0149a.y(null);
                            } catch (Throwable th12) {
                                listQ12 = Z1.f.Q(th12);
                            }
                            lVar.u(listQ12);
                            break;
                        case 12:
                            C1039j c1039j14 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj22 = ((List) obj).get(0);
                            N3.h.c(obj22, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView12 = (WebView) obj22;
                            try {
                                c1039j14.getClass();
                                listQ13 = AbstractC0149a.y(Boolean.valueOf(webView12.canGoBack()));
                            } catch (Throwable th13) {
                                listQ13 = Z1.f.Q(th13);
                            }
                            lVar.u(listQ13);
                            break;
                        case 13:
                            C1039j c1039j15 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj23 = ((List) obj).get(0);
                            N3.h.c(obj23, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView13 = (WebView) obj23;
                            try {
                                c1039j15.getClass();
                                listQ14 = AbstractC0149a.y(Boolean.valueOf(webView13.canGoForward()));
                            } catch (Throwable th14) {
                                listQ14 = Z1.f.Q(th14);
                            }
                            lVar.u(listQ14);
                            break;
                        case 14:
                            C1039j c1039j16 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj24 = ((List) obj).get(0);
                            N3.h.c(obj24, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView14 = (WebView) obj24;
                            try {
                                c1039j16.getClass();
                                webView14.goBack();
                                listQ15 = AbstractC0149a.y(null);
                            } catch (Throwable th15) {
                                listQ15 = Z1.f.Q(th15);
                            }
                            lVar.u(listQ15);
                            break;
                        case 15:
                            C1039j c1039j17 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj25 = ((List) obj).get(0);
                            N3.h.c(obj25, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView15 = (WebView) obj25;
                            try {
                                c1039j17.getClass();
                                webView15.reload();
                                listQ16 = AbstractC0149a.y(null);
                            } catch (Throwable th16) {
                                listQ16 = Z1.f.Q(th16);
                            }
                            lVar.u(listQ16);
                            break;
                        case 16:
                            C1039j c1039j18 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj;
                            Object obj26 = list9.get(0);
                            N3.h.c(obj26, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView16 = (WebView) obj26;
                            Object obj27 = list9.get(1);
                            N3.h.c(obj27, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue = ((Boolean) obj27).booleanValue();
                            try {
                                c1039j18.getClass();
                                webView16.clearCache(zBooleanValue);
                                listQ17 = AbstractC0149a.y(null);
                            } catch (Throwable th17) {
                                listQ17 = Z1.f.Q(th17);
                            }
                            lVar.u(listQ17);
                            break;
                        case 17:
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj;
                            Object obj28 = list10.get(0);
                            N3.h.c(obj28, "null cannot be cast to non-null type android.webkit.WebView");
                            Object obj29 = list10.get(1);
                            N3.h.c(obj29, "null cannot be cast to non-null type kotlin.String");
                            C1054y c1054y = new C1054y(lVar, 1);
                            c1039j.getClass();
                            ((WebView) obj28).evaluateJavascript((String) obj29, new C1042m(1, c1054y));
                            break;
                        case 18:
                            C1039j c1039j19 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj30 = ((List) obj).get(0);
                            N3.h.c(obj30, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView17 = (WebView) obj30;
                            try {
                                c1039j19.getClass();
                                listQ18 = AbstractC0149a.y(webView17.getTitle());
                            } catch (Throwable th18) {
                                listQ18 = Z1.f.Q(th18);
                            }
                            lVar.u(listQ18);
                            break;
                        case 19:
                            C1039j c1039j20 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj31 = ((List) obj).get(0);
                            N3.h.c(obj31, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue2 = ((Boolean) obj31).booleanValue();
                            try {
                                c1039j20.getClass();
                                WebView.setWebContentsDebuggingEnabled(zBooleanValue2);
                                listQ19 = AbstractC0149a.y(null);
                            } catch (Throwable th19) {
                                listQ19 = Z1.f.Q(th19);
                            }
                            lVar.u(listQ19);
                            break;
                        case 20:
                            C1039j c1039j21 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj;
                            Object obj32 = list11.get(0);
                            N3.h.c(obj32, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView18 = (WebView) obj32;
                            WebViewClient webViewClient = (WebViewClient) list11.get(1);
                            try {
                                c1039j21.getClass();
                                webView18.setWebViewClient(webViewClient);
                                listQ20 = AbstractC0149a.y(null);
                            } catch (Throwable th20) {
                                listQ20 = Z1.f.Q(th20);
                            }
                            lVar.u(listQ20);
                            break;
                        case 21:
                            C1039j c1039j22 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list12 = (List) obj;
                            Object obj33 = list12.get(0);
                            N3.h.c(obj33, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView19 = (WebView) obj33;
                            Object obj34 = list12.get(1);
                            N3.h.c(obj34, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.JavaScriptChannel");
                            C1048s c1048s = (C1048s) obj34;
                            try {
                                c1039j22.getClass();
                                webView19.addJavascriptInterface(c1048s, c1048s.f11098a);
                                listQ21 = AbstractC0149a.y(null);
                            } catch (Throwable th21) {
                                listQ21 = Z1.f.Q(th21);
                            }
                            lVar.u(listQ21);
                            break;
                        default:
                            C1039j c1039j23 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj;
                            Object obj35 = list13.get(0);
                            N3.h.c(obj35, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView20 = (WebView) obj35;
                            Object obj36 = list13.get(1);
                            N3.h.c(obj36, "null cannot be cast to non-null type kotlin.String");
                            String str11 = (String) obj36;
                            try {
                                c1039j23.getClass();
                                webView20.removeJavascriptInterface(str11);
                                listQ22 = AbstractC0149a.y(null);
                            } catch (Throwable th22) {
                                listQ22 = Z1.f.Q(th22);
                            }
                            lVar.u(listQ22);
                            break;
                    }
                }
            });
        } else {
            iVar18.E(null);
        }
        i iVar19 = new i(interfaceC0696f, "dev.flutter.pigeon.webview_flutter_android.WebView.removeJavaScriptChannel", gVar, (C0200z) null);
        if (c1039j != null) {
            final int i22 = 22;
            iVar19.E(new InterfaceC0692b() { // from class: y3.I
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
                    List listQ18;
                    List listQ19;
                    List listQ20;
                    List listQ21;
                    List listQ22;
                    switch (i22) {
                        case 0:
                            C1039j c1039j2 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj2 = ((List) obj).get(0);
                            N3.h.c(obj2, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((C1032c) c1039j2.f11068a.f9n).a(((Long) obj2).longValue(), c1039j2.a());
                                listQ = AbstractC0149a.y(null);
                            } catch (Throwable th) {
                                listQ = Z1.f.Q(th);
                            }
                            lVar.u(listQ);
                            break;
                        case 1:
                            C1039j c1039j3 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj3 = list.get(0);
                            N3.h.c(obj3, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView = (WebView) obj3;
                            DownloadListener downloadListener = (DownloadListener) list.get(1);
                            try {
                                c1039j3.getClass();
                                webView.setDownloadListener(downloadListener);
                                listQ2 = AbstractC0149a.y(null);
                            } catch (Throwable th2) {
                                listQ2 = Z1.f.Q(th2);
                            }
                            lVar.u(listQ2);
                            break;
                        case 2:
                            C1039j c1039j4 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj;
                            Object obj4 = list2.get(0);
                            N3.h.c(obj4, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView2 = (WebView) obj4;
                            Object obj5 = list2.get(1);
                            N3.h.c(obj5, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((C1032c) c1039j4.f11068a.f9n).a(((Long) obj5).longValue(), webView2.getSettings());
                                listQ3 = AbstractC0149a.y(null);
                            } catch (Throwable th3) {
                                listQ3 = Z1.f.Q(th3);
                            }
                            lVar.u(listQ3);
                            break;
                        case 3:
                            C1039j c1039j5 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj;
                            Object obj6 = list3.get(0);
                            N3.h.c(obj6, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView3 = (WebView) obj6;
                            C1022Q c1022q = (C1022Q) list3.get(1);
                            try {
                                c1039j5.getClass();
                                webView3.setWebChromeClient(c1022q);
                                listQ4 = AbstractC0149a.y(null);
                            } catch (Throwable th4) {
                                listQ4 = Z1.f.Q(th4);
                            }
                            lVar.u(listQ4);
                            break;
                        case 4:
                            C1039j c1039j6 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj;
                            Object obj7 = list4.get(0);
                            N3.h.c(obj7, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView4 = (WebView) obj7;
                            Object obj8 = list4.get(1);
                            N3.h.c(obj8, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue = ((Long) obj8).longValue();
                            try {
                                c1039j6.getClass();
                                webView4.setBackgroundColor((int) jLongValue);
                                listQ5 = AbstractC0149a.y(null);
                            } catch (Throwable th5) {
                                listQ5 = Z1.f.Q(th5);
                            }
                            lVar.u(listQ5);
                            break;
                        case 5:
                            C1039j c1039j7 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj9 = ((List) obj).get(0);
                            N3.h.c(obj9, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView5 = (WebView) obj9;
                            try {
                                c1039j7.getClass();
                                webView5.destroy();
                                listQ6 = AbstractC0149a.y(null);
                            } catch (Throwable th6) {
                                listQ6 = Z1.f.Q(th6);
                            }
                            lVar.u(listQ6);
                            break;
                        case O.j.STRING_SET_FIELD_NUMBER /* 6 */:
                            C1039j c1039j8 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj;
                            Object obj10 = list5.get(0);
                            N3.h.c(obj10, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView6 = (WebView) obj10;
                            Object obj11 = list5.get(1);
                            N3.h.c(obj11, "null cannot be cast to non-null type kotlin.String");
                            String str = (String) obj11;
                            String str2 = (String) list5.get(2);
                            String str3 = (String) list5.get(3);
                            try {
                                c1039j8.getClass();
                                webView6.loadData(str, str2, str3);
                                listQ7 = AbstractC0149a.y(null);
                            } catch (Throwable th7) {
                                listQ7 = Z1.f.Q(th7);
                            }
                            lVar.u(listQ7);
                            break;
                        case O.j.DOUBLE_FIELD_NUMBER /* 7 */:
                            C1039j c1039j9 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj;
                            Object obj12 = list6.get(0);
                            N3.h.c(obj12, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView7 = (WebView) obj12;
                            String str4 = (String) list6.get(1);
                            Object obj13 = list6.get(2);
                            N3.h.c(obj13, "null cannot be cast to non-null type kotlin.String");
                            String str5 = (String) obj13;
                            String str6 = (String) list6.get(3);
                            String str7 = (String) list6.get(4);
                            String str8 = (String) list6.get(5);
                            try {
                                c1039j9.getClass();
                                webView7.loadDataWithBaseURL(str4, str5, str6, str7, str8);
                                listQ8 = AbstractC0149a.y(null);
                            } catch (Throwable th8) {
                                listQ8 = Z1.f.Q(th8);
                            }
                            lVar.u(listQ8);
                            break;
                        case O.j.BYTES_FIELD_NUMBER /* 8 */:
                            C1039j c1039j10 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj;
                            Object obj14 = list7.get(0);
                            N3.h.c(obj14, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView8 = (WebView) obj14;
                            Object obj15 = list7.get(1);
                            N3.h.c(obj15, "null cannot be cast to non-null type kotlin.String");
                            String str9 = (String) obj15;
                            Object obj16 = list7.get(2);
                            N3.h.c(obj16, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.String>");
                            Map<String, String> map = (Map) obj16;
                            try {
                                c1039j10.getClass();
                                webView8.loadUrl(str9, map);
                                listQ9 = AbstractC0149a.y(null);
                            } catch (Throwable th9) {
                                listQ9 = Z1.f.Q(th9);
                            }
                            lVar.u(listQ9);
                            break;
                        case 9:
                            C1039j c1039j11 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj;
                            Object obj17 = list8.get(0);
                            N3.h.c(obj17, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView9 = (WebView) obj17;
                            Object obj18 = list8.get(1);
                            N3.h.c(obj18, "null cannot be cast to non-null type kotlin.String");
                            String str10 = (String) obj18;
                            Object obj19 = list8.get(2);
                            N3.h.c(obj19, "null cannot be cast to non-null type kotlin.ByteArray");
                            byte[] bArr = (byte[]) obj19;
                            try {
                                c1039j11.getClass();
                                webView9.postUrl(str10, bArr);
                                listQ10 = AbstractC0149a.y(null);
                            } catch (Throwable th10) {
                                listQ10 = Z1.f.Q(th10);
                            }
                            lVar.u(listQ10);
                            break;
                        case 10:
                            C1039j c1039j12 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj20 = ((List) obj).get(0);
                            N3.h.c(obj20, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView10 = (WebView) obj20;
                            try {
                                c1039j12.getClass();
                                listQ11 = AbstractC0149a.y(webView10.getUrl());
                            } catch (Throwable th11) {
                                listQ11 = Z1.f.Q(th11);
                            }
                            lVar.u(listQ11);
                            break;
                        case 11:
                            C1039j c1039j13 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj21 = ((List) obj).get(0);
                            N3.h.c(obj21, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView11 = (WebView) obj21;
                            try {
                                c1039j13.getClass();
                                webView11.goForward();
                                listQ12 = AbstractC0149a.y(null);
                            } catch (Throwable th12) {
                                listQ12 = Z1.f.Q(th12);
                            }
                            lVar.u(listQ12);
                            break;
                        case 12:
                            C1039j c1039j14 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj22 = ((List) obj).get(0);
                            N3.h.c(obj22, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView12 = (WebView) obj22;
                            try {
                                c1039j14.getClass();
                                listQ13 = AbstractC0149a.y(Boolean.valueOf(webView12.canGoBack()));
                            } catch (Throwable th13) {
                                listQ13 = Z1.f.Q(th13);
                            }
                            lVar.u(listQ13);
                            break;
                        case 13:
                            C1039j c1039j15 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj23 = ((List) obj).get(0);
                            N3.h.c(obj23, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView13 = (WebView) obj23;
                            try {
                                c1039j15.getClass();
                                listQ14 = AbstractC0149a.y(Boolean.valueOf(webView13.canGoForward()));
                            } catch (Throwable th14) {
                                listQ14 = Z1.f.Q(th14);
                            }
                            lVar.u(listQ14);
                            break;
                        case 14:
                            C1039j c1039j16 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj24 = ((List) obj).get(0);
                            N3.h.c(obj24, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView14 = (WebView) obj24;
                            try {
                                c1039j16.getClass();
                                webView14.goBack();
                                listQ15 = AbstractC0149a.y(null);
                            } catch (Throwable th15) {
                                listQ15 = Z1.f.Q(th15);
                            }
                            lVar.u(listQ15);
                            break;
                        case 15:
                            C1039j c1039j17 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj25 = ((List) obj).get(0);
                            N3.h.c(obj25, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView15 = (WebView) obj25;
                            try {
                                c1039j17.getClass();
                                webView15.reload();
                                listQ16 = AbstractC0149a.y(null);
                            } catch (Throwable th16) {
                                listQ16 = Z1.f.Q(th16);
                            }
                            lVar.u(listQ16);
                            break;
                        case 16:
                            C1039j c1039j18 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj;
                            Object obj26 = list9.get(0);
                            N3.h.c(obj26, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView16 = (WebView) obj26;
                            Object obj27 = list9.get(1);
                            N3.h.c(obj27, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue = ((Boolean) obj27).booleanValue();
                            try {
                                c1039j18.getClass();
                                webView16.clearCache(zBooleanValue);
                                listQ17 = AbstractC0149a.y(null);
                            } catch (Throwable th17) {
                                listQ17 = Z1.f.Q(th17);
                            }
                            lVar.u(listQ17);
                            break;
                        case 17:
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj;
                            Object obj28 = list10.get(0);
                            N3.h.c(obj28, "null cannot be cast to non-null type android.webkit.WebView");
                            Object obj29 = list10.get(1);
                            N3.h.c(obj29, "null cannot be cast to non-null type kotlin.String");
                            C1054y c1054y = new C1054y(lVar, 1);
                            c1039j.getClass();
                            ((WebView) obj28).evaluateJavascript((String) obj29, new C1042m(1, c1054y));
                            break;
                        case 18:
                            C1039j c1039j19 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj30 = ((List) obj).get(0);
                            N3.h.c(obj30, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView17 = (WebView) obj30;
                            try {
                                c1039j19.getClass();
                                listQ18 = AbstractC0149a.y(webView17.getTitle());
                            } catch (Throwable th18) {
                                listQ18 = Z1.f.Q(th18);
                            }
                            lVar.u(listQ18);
                            break;
                        case 19:
                            C1039j c1039j20 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj31 = ((List) obj).get(0);
                            N3.h.c(obj31, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue2 = ((Boolean) obj31).booleanValue();
                            try {
                                c1039j20.getClass();
                                WebView.setWebContentsDebuggingEnabled(zBooleanValue2);
                                listQ19 = AbstractC0149a.y(null);
                            } catch (Throwable th19) {
                                listQ19 = Z1.f.Q(th19);
                            }
                            lVar.u(listQ19);
                            break;
                        case 20:
                            C1039j c1039j21 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj;
                            Object obj32 = list11.get(0);
                            N3.h.c(obj32, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView18 = (WebView) obj32;
                            WebViewClient webViewClient = (WebViewClient) list11.get(1);
                            try {
                                c1039j21.getClass();
                                webView18.setWebViewClient(webViewClient);
                                listQ20 = AbstractC0149a.y(null);
                            } catch (Throwable th20) {
                                listQ20 = Z1.f.Q(th20);
                            }
                            lVar.u(listQ20);
                            break;
                        case 21:
                            C1039j c1039j22 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list12 = (List) obj;
                            Object obj33 = list12.get(0);
                            N3.h.c(obj33, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView19 = (WebView) obj33;
                            Object obj34 = list12.get(1);
                            N3.h.c(obj34, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.JavaScriptChannel");
                            C1048s c1048s = (C1048s) obj34;
                            try {
                                c1039j22.getClass();
                                webView19.addJavascriptInterface(c1048s, c1048s.f11098a);
                                listQ21 = AbstractC0149a.y(null);
                            } catch (Throwable th21) {
                                listQ21 = Z1.f.Q(th21);
                            }
                            lVar.u(listQ21);
                            break;
                        default:
                            C1039j c1039j23 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj;
                            Object obj35 = list13.get(0);
                            N3.h.c(obj35, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView20 = (WebView) obj35;
                            Object obj36 = list13.get(1);
                            N3.h.c(obj36, "null cannot be cast to non-null type kotlin.String");
                            String str11 = (String) obj36;
                            try {
                                c1039j23.getClass();
                                webView20.removeJavascriptInterface(str11);
                                listQ22 = AbstractC0149a.y(null);
                            } catch (Throwable th22) {
                                listQ22 = Z1.f.Q(th22);
                            }
                            lVar.u(listQ22);
                            break;
                    }
                }
            });
        } else {
            iVar19.E(null);
        }
        i iVar20 = new i(interfaceC0696f, "dev.flutter.pigeon.webview_flutter_android.WebView.setDownloadListener", gVar, (C0200z) null);
        if (c1039j != null) {
            final int i23 = 1;
            iVar20.E(new InterfaceC0692b() { // from class: y3.I
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
                    List listQ18;
                    List listQ19;
                    List listQ20;
                    List listQ21;
                    List listQ22;
                    switch (i23) {
                        case 0:
                            C1039j c1039j2 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj2 = ((List) obj).get(0);
                            N3.h.c(obj2, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((C1032c) c1039j2.f11068a.f9n).a(((Long) obj2).longValue(), c1039j2.a());
                                listQ = AbstractC0149a.y(null);
                            } catch (Throwable th) {
                                listQ = Z1.f.Q(th);
                            }
                            lVar.u(listQ);
                            break;
                        case 1:
                            C1039j c1039j3 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj3 = list.get(0);
                            N3.h.c(obj3, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView = (WebView) obj3;
                            DownloadListener downloadListener = (DownloadListener) list.get(1);
                            try {
                                c1039j3.getClass();
                                webView.setDownloadListener(downloadListener);
                                listQ2 = AbstractC0149a.y(null);
                            } catch (Throwable th2) {
                                listQ2 = Z1.f.Q(th2);
                            }
                            lVar.u(listQ2);
                            break;
                        case 2:
                            C1039j c1039j4 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj;
                            Object obj4 = list2.get(0);
                            N3.h.c(obj4, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView2 = (WebView) obj4;
                            Object obj5 = list2.get(1);
                            N3.h.c(obj5, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((C1032c) c1039j4.f11068a.f9n).a(((Long) obj5).longValue(), webView2.getSettings());
                                listQ3 = AbstractC0149a.y(null);
                            } catch (Throwable th3) {
                                listQ3 = Z1.f.Q(th3);
                            }
                            lVar.u(listQ3);
                            break;
                        case 3:
                            C1039j c1039j5 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj;
                            Object obj6 = list3.get(0);
                            N3.h.c(obj6, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView3 = (WebView) obj6;
                            C1022Q c1022q = (C1022Q) list3.get(1);
                            try {
                                c1039j5.getClass();
                                webView3.setWebChromeClient(c1022q);
                                listQ4 = AbstractC0149a.y(null);
                            } catch (Throwable th4) {
                                listQ4 = Z1.f.Q(th4);
                            }
                            lVar.u(listQ4);
                            break;
                        case 4:
                            C1039j c1039j6 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj;
                            Object obj7 = list4.get(0);
                            N3.h.c(obj7, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView4 = (WebView) obj7;
                            Object obj8 = list4.get(1);
                            N3.h.c(obj8, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue = ((Long) obj8).longValue();
                            try {
                                c1039j6.getClass();
                                webView4.setBackgroundColor((int) jLongValue);
                                listQ5 = AbstractC0149a.y(null);
                            } catch (Throwable th5) {
                                listQ5 = Z1.f.Q(th5);
                            }
                            lVar.u(listQ5);
                            break;
                        case 5:
                            C1039j c1039j7 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj9 = ((List) obj).get(0);
                            N3.h.c(obj9, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView5 = (WebView) obj9;
                            try {
                                c1039j7.getClass();
                                webView5.destroy();
                                listQ6 = AbstractC0149a.y(null);
                            } catch (Throwable th6) {
                                listQ6 = Z1.f.Q(th6);
                            }
                            lVar.u(listQ6);
                            break;
                        case O.j.STRING_SET_FIELD_NUMBER /* 6 */:
                            C1039j c1039j8 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj;
                            Object obj10 = list5.get(0);
                            N3.h.c(obj10, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView6 = (WebView) obj10;
                            Object obj11 = list5.get(1);
                            N3.h.c(obj11, "null cannot be cast to non-null type kotlin.String");
                            String str = (String) obj11;
                            String str2 = (String) list5.get(2);
                            String str3 = (String) list5.get(3);
                            try {
                                c1039j8.getClass();
                                webView6.loadData(str, str2, str3);
                                listQ7 = AbstractC0149a.y(null);
                            } catch (Throwable th7) {
                                listQ7 = Z1.f.Q(th7);
                            }
                            lVar.u(listQ7);
                            break;
                        case O.j.DOUBLE_FIELD_NUMBER /* 7 */:
                            C1039j c1039j9 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj;
                            Object obj12 = list6.get(0);
                            N3.h.c(obj12, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView7 = (WebView) obj12;
                            String str4 = (String) list6.get(1);
                            Object obj13 = list6.get(2);
                            N3.h.c(obj13, "null cannot be cast to non-null type kotlin.String");
                            String str5 = (String) obj13;
                            String str6 = (String) list6.get(3);
                            String str7 = (String) list6.get(4);
                            String str8 = (String) list6.get(5);
                            try {
                                c1039j9.getClass();
                                webView7.loadDataWithBaseURL(str4, str5, str6, str7, str8);
                                listQ8 = AbstractC0149a.y(null);
                            } catch (Throwable th8) {
                                listQ8 = Z1.f.Q(th8);
                            }
                            lVar.u(listQ8);
                            break;
                        case O.j.BYTES_FIELD_NUMBER /* 8 */:
                            C1039j c1039j10 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj;
                            Object obj14 = list7.get(0);
                            N3.h.c(obj14, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView8 = (WebView) obj14;
                            Object obj15 = list7.get(1);
                            N3.h.c(obj15, "null cannot be cast to non-null type kotlin.String");
                            String str9 = (String) obj15;
                            Object obj16 = list7.get(2);
                            N3.h.c(obj16, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.String>");
                            Map<String, String> map = (Map) obj16;
                            try {
                                c1039j10.getClass();
                                webView8.loadUrl(str9, map);
                                listQ9 = AbstractC0149a.y(null);
                            } catch (Throwable th9) {
                                listQ9 = Z1.f.Q(th9);
                            }
                            lVar.u(listQ9);
                            break;
                        case 9:
                            C1039j c1039j11 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj;
                            Object obj17 = list8.get(0);
                            N3.h.c(obj17, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView9 = (WebView) obj17;
                            Object obj18 = list8.get(1);
                            N3.h.c(obj18, "null cannot be cast to non-null type kotlin.String");
                            String str10 = (String) obj18;
                            Object obj19 = list8.get(2);
                            N3.h.c(obj19, "null cannot be cast to non-null type kotlin.ByteArray");
                            byte[] bArr = (byte[]) obj19;
                            try {
                                c1039j11.getClass();
                                webView9.postUrl(str10, bArr);
                                listQ10 = AbstractC0149a.y(null);
                            } catch (Throwable th10) {
                                listQ10 = Z1.f.Q(th10);
                            }
                            lVar.u(listQ10);
                            break;
                        case 10:
                            C1039j c1039j12 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj20 = ((List) obj).get(0);
                            N3.h.c(obj20, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView10 = (WebView) obj20;
                            try {
                                c1039j12.getClass();
                                listQ11 = AbstractC0149a.y(webView10.getUrl());
                            } catch (Throwable th11) {
                                listQ11 = Z1.f.Q(th11);
                            }
                            lVar.u(listQ11);
                            break;
                        case 11:
                            C1039j c1039j13 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj21 = ((List) obj).get(0);
                            N3.h.c(obj21, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView11 = (WebView) obj21;
                            try {
                                c1039j13.getClass();
                                webView11.goForward();
                                listQ12 = AbstractC0149a.y(null);
                            } catch (Throwable th12) {
                                listQ12 = Z1.f.Q(th12);
                            }
                            lVar.u(listQ12);
                            break;
                        case 12:
                            C1039j c1039j14 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj22 = ((List) obj).get(0);
                            N3.h.c(obj22, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView12 = (WebView) obj22;
                            try {
                                c1039j14.getClass();
                                listQ13 = AbstractC0149a.y(Boolean.valueOf(webView12.canGoBack()));
                            } catch (Throwable th13) {
                                listQ13 = Z1.f.Q(th13);
                            }
                            lVar.u(listQ13);
                            break;
                        case 13:
                            C1039j c1039j15 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj23 = ((List) obj).get(0);
                            N3.h.c(obj23, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView13 = (WebView) obj23;
                            try {
                                c1039j15.getClass();
                                listQ14 = AbstractC0149a.y(Boolean.valueOf(webView13.canGoForward()));
                            } catch (Throwable th14) {
                                listQ14 = Z1.f.Q(th14);
                            }
                            lVar.u(listQ14);
                            break;
                        case 14:
                            C1039j c1039j16 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj24 = ((List) obj).get(0);
                            N3.h.c(obj24, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView14 = (WebView) obj24;
                            try {
                                c1039j16.getClass();
                                webView14.goBack();
                                listQ15 = AbstractC0149a.y(null);
                            } catch (Throwable th15) {
                                listQ15 = Z1.f.Q(th15);
                            }
                            lVar.u(listQ15);
                            break;
                        case 15:
                            C1039j c1039j17 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj25 = ((List) obj).get(0);
                            N3.h.c(obj25, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView15 = (WebView) obj25;
                            try {
                                c1039j17.getClass();
                                webView15.reload();
                                listQ16 = AbstractC0149a.y(null);
                            } catch (Throwable th16) {
                                listQ16 = Z1.f.Q(th16);
                            }
                            lVar.u(listQ16);
                            break;
                        case 16:
                            C1039j c1039j18 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj;
                            Object obj26 = list9.get(0);
                            N3.h.c(obj26, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView16 = (WebView) obj26;
                            Object obj27 = list9.get(1);
                            N3.h.c(obj27, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue = ((Boolean) obj27).booleanValue();
                            try {
                                c1039j18.getClass();
                                webView16.clearCache(zBooleanValue);
                                listQ17 = AbstractC0149a.y(null);
                            } catch (Throwable th17) {
                                listQ17 = Z1.f.Q(th17);
                            }
                            lVar.u(listQ17);
                            break;
                        case 17:
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj;
                            Object obj28 = list10.get(0);
                            N3.h.c(obj28, "null cannot be cast to non-null type android.webkit.WebView");
                            Object obj29 = list10.get(1);
                            N3.h.c(obj29, "null cannot be cast to non-null type kotlin.String");
                            C1054y c1054y = new C1054y(lVar, 1);
                            c1039j.getClass();
                            ((WebView) obj28).evaluateJavascript((String) obj29, new C1042m(1, c1054y));
                            break;
                        case 18:
                            C1039j c1039j19 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj30 = ((List) obj).get(0);
                            N3.h.c(obj30, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView17 = (WebView) obj30;
                            try {
                                c1039j19.getClass();
                                listQ18 = AbstractC0149a.y(webView17.getTitle());
                            } catch (Throwable th18) {
                                listQ18 = Z1.f.Q(th18);
                            }
                            lVar.u(listQ18);
                            break;
                        case 19:
                            C1039j c1039j20 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj31 = ((List) obj).get(0);
                            N3.h.c(obj31, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue2 = ((Boolean) obj31).booleanValue();
                            try {
                                c1039j20.getClass();
                                WebView.setWebContentsDebuggingEnabled(zBooleanValue2);
                                listQ19 = AbstractC0149a.y(null);
                            } catch (Throwable th19) {
                                listQ19 = Z1.f.Q(th19);
                            }
                            lVar.u(listQ19);
                            break;
                        case 20:
                            C1039j c1039j21 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj;
                            Object obj32 = list11.get(0);
                            N3.h.c(obj32, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView18 = (WebView) obj32;
                            WebViewClient webViewClient = (WebViewClient) list11.get(1);
                            try {
                                c1039j21.getClass();
                                webView18.setWebViewClient(webViewClient);
                                listQ20 = AbstractC0149a.y(null);
                            } catch (Throwable th20) {
                                listQ20 = Z1.f.Q(th20);
                            }
                            lVar.u(listQ20);
                            break;
                        case 21:
                            C1039j c1039j22 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list12 = (List) obj;
                            Object obj33 = list12.get(0);
                            N3.h.c(obj33, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView19 = (WebView) obj33;
                            Object obj34 = list12.get(1);
                            N3.h.c(obj34, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.JavaScriptChannel");
                            C1048s c1048s = (C1048s) obj34;
                            try {
                                c1039j22.getClass();
                                webView19.addJavascriptInterface(c1048s, c1048s.f11098a);
                                listQ21 = AbstractC0149a.y(null);
                            } catch (Throwable th21) {
                                listQ21 = Z1.f.Q(th21);
                            }
                            lVar.u(listQ21);
                            break;
                        default:
                            C1039j c1039j23 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj;
                            Object obj35 = list13.get(0);
                            N3.h.c(obj35, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView20 = (WebView) obj35;
                            Object obj36 = list13.get(1);
                            N3.h.c(obj36, "null cannot be cast to non-null type kotlin.String");
                            String str11 = (String) obj36;
                            try {
                                c1039j23.getClass();
                                webView20.removeJavascriptInterface(str11);
                                listQ22 = AbstractC0149a.y(null);
                            } catch (Throwable th22) {
                                listQ22 = Z1.f.Q(th22);
                            }
                            lVar.u(listQ22);
                            break;
                    }
                }
            });
        } else {
            iVar20.E(null);
        }
        i iVar21 = new i(interfaceC0696f, "dev.flutter.pigeon.webview_flutter_android.WebView.setWebChromeClient", gVar, (C0200z) null);
        if (c1039j != null) {
            final int i24 = 3;
            iVar21.E(new InterfaceC0692b() { // from class: y3.I
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
                    List listQ18;
                    List listQ19;
                    List listQ20;
                    List listQ21;
                    List listQ22;
                    switch (i24) {
                        case 0:
                            C1039j c1039j2 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj2 = ((List) obj).get(0);
                            N3.h.c(obj2, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((C1032c) c1039j2.f11068a.f9n).a(((Long) obj2).longValue(), c1039j2.a());
                                listQ = AbstractC0149a.y(null);
                            } catch (Throwable th) {
                                listQ = Z1.f.Q(th);
                            }
                            lVar.u(listQ);
                            break;
                        case 1:
                            C1039j c1039j3 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj3 = list.get(0);
                            N3.h.c(obj3, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView = (WebView) obj3;
                            DownloadListener downloadListener = (DownloadListener) list.get(1);
                            try {
                                c1039j3.getClass();
                                webView.setDownloadListener(downloadListener);
                                listQ2 = AbstractC0149a.y(null);
                            } catch (Throwable th2) {
                                listQ2 = Z1.f.Q(th2);
                            }
                            lVar.u(listQ2);
                            break;
                        case 2:
                            C1039j c1039j4 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj;
                            Object obj4 = list2.get(0);
                            N3.h.c(obj4, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView2 = (WebView) obj4;
                            Object obj5 = list2.get(1);
                            N3.h.c(obj5, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((C1032c) c1039j4.f11068a.f9n).a(((Long) obj5).longValue(), webView2.getSettings());
                                listQ3 = AbstractC0149a.y(null);
                            } catch (Throwable th3) {
                                listQ3 = Z1.f.Q(th3);
                            }
                            lVar.u(listQ3);
                            break;
                        case 3:
                            C1039j c1039j5 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj;
                            Object obj6 = list3.get(0);
                            N3.h.c(obj6, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView3 = (WebView) obj6;
                            C1022Q c1022q = (C1022Q) list3.get(1);
                            try {
                                c1039j5.getClass();
                                webView3.setWebChromeClient(c1022q);
                                listQ4 = AbstractC0149a.y(null);
                            } catch (Throwable th4) {
                                listQ4 = Z1.f.Q(th4);
                            }
                            lVar.u(listQ4);
                            break;
                        case 4:
                            C1039j c1039j6 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj;
                            Object obj7 = list4.get(0);
                            N3.h.c(obj7, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView4 = (WebView) obj7;
                            Object obj8 = list4.get(1);
                            N3.h.c(obj8, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue = ((Long) obj8).longValue();
                            try {
                                c1039j6.getClass();
                                webView4.setBackgroundColor((int) jLongValue);
                                listQ5 = AbstractC0149a.y(null);
                            } catch (Throwable th5) {
                                listQ5 = Z1.f.Q(th5);
                            }
                            lVar.u(listQ5);
                            break;
                        case 5:
                            C1039j c1039j7 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj9 = ((List) obj).get(0);
                            N3.h.c(obj9, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView5 = (WebView) obj9;
                            try {
                                c1039j7.getClass();
                                webView5.destroy();
                                listQ6 = AbstractC0149a.y(null);
                            } catch (Throwable th6) {
                                listQ6 = Z1.f.Q(th6);
                            }
                            lVar.u(listQ6);
                            break;
                        case O.j.STRING_SET_FIELD_NUMBER /* 6 */:
                            C1039j c1039j8 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj;
                            Object obj10 = list5.get(0);
                            N3.h.c(obj10, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView6 = (WebView) obj10;
                            Object obj11 = list5.get(1);
                            N3.h.c(obj11, "null cannot be cast to non-null type kotlin.String");
                            String str = (String) obj11;
                            String str2 = (String) list5.get(2);
                            String str3 = (String) list5.get(3);
                            try {
                                c1039j8.getClass();
                                webView6.loadData(str, str2, str3);
                                listQ7 = AbstractC0149a.y(null);
                            } catch (Throwable th7) {
                                listQ7 = Z1.f.Q(th7);
                            }
                            lVar.u(listQ7);
                            break;
                        case O.j.DOUBLE_FIELD_NUMBER /* 7 */:
                            C1039j c1039j9 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj;
                            Object obj12 = list6.get(0);
                            N3.h.c(obj12, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView7 = (WebView) obj12;
                            String str4 = (String) list6.get(1);
                            Object obj13 = list6.get(2);
                            N3.h.c(obj13, "null cannot be cast to non-null type kotlin.String");
                            String str5 = (String) obj13;
                            String str6 = (String) list6.get(3);
                            String str7 = (String) list6.get(4);
                            String str8 = (String) list6.get(5);
                            try {
                                c1039j9.getClass();
                                webView7.loadDataWithBaseURL(str4, str5, str6, str7, str8);
                                listQ8 = AbstractC0149a.y(null);
                            } catch (Throwable th8) {
                                listQ8 = Z1.f.Q(th8);
                            }
                            lVar.u(listQ8);
                            break;
                        case O.j.BYTES_FIELD_NUMBER /* 8 */:
                            C1039j c1039j10 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj;
                            Object obj14 = list7.get(0);
                            N3.h.c(obj14, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView8 = (WebView) obj14;
                            Object obj15 = list7.get(1);
                            N3.h.c(obj15, "null cannot be cast to non-null type kotlin.String");
                            String str9 = (String) obj15;
                            Object obj16 = list7.get(2);
                            N3.h.c(obj16, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.String>");
                            Map<String, String> map = (Map) obj16;
                            try {
                                c1039j10.getClass();
                                webView8.loadUrl(str9, map);
                                listQ9 = AbstractC0149a.y(null);
                            } catch (Throwable th9) {
                                listQ9 = Z1.f.Q(th9);
                            }
                            lVar.u(listQ9);
                            break;
                        case 9:
                            C1039j c1039j11 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj;
                            Object obj17 = list8.get(0);
                            N3.h.c(obj17, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView9 = (WebView) obj17;
                            Object obj18 = list8.get(1);
                            N3.h.c(obj18, "null cannot be cast to non-null type kotlin.String");
                            String str10 = (String) obj18;
                            Object obj19 = list8.get(2);
                            N3.h.c(obj19, "null cannot be cast to non-null type kotlin.ByteArray");
                            byte[] bArr = (byte[]) obj19;
                            try {
                                c1039j11.getClass();
                                webView9.postUrl(str10, bArr);
                                listQ10 = AbstractC0149a.y(null);
                            } catch (Throwable th10) {
                                listQ10 = Z1.f.Q(th10);
                            }
                            lVar.u(listQ10);
                            break;
                        case 10:
                            C1039j c1039j12 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj20 = ((List) obj).get(0);
                            N3.h.c(obj20, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView10 = (WebView) obj20;
                            try {
                                c1039j12.getClass();
                                listQ11 = AbstractC0149a.y(webView10.getUrl());
                            } catch (Throwable th11) {
                                listQ11 = Z1.f.Q(th11);
                            }
                            lVar.u(listQ11);
                            break;
                        case 11:
                            C1039j c1039j13 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj21 = ((List) obj).get(0);
                            N3.h.c(obj21, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView11 = (WebView) obj21;
                            try {
                                c1039j13.getClass();
                                webView11.goForward();
                                listQ12 = AbstractC0149a.y(null);
                            } catch (Throwable th12) {
                                listQ12 = Z1.f.Q(th12);
                            }
                            lVar.u(listQ12);
                            break;
                        case 12:
                            C1039j c1039j14 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj22 = ((List) obj).get(0);
                            N3.h.c(obj22, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView12 = (WebView) obj22;
                            try {
                                c1039j14.getClass();
                                listQ13 = AbstractC0149a.y(Boolean.valueOf(webView12.canGoBack()));
                            } catch (Throwable th13) {
                                listQ13 = Z1.f.Q(th13);
                            }
                            lVar.u(listQ13);
                            break;
                        case 13:
                            C1039j c1039j15 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj23 = ((List) obj).get(0);
                            N3.h.c(obj23, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView13 = (WebView) obj23;
                            try {
                                c1039j15.getClass();
                                listQ14 = AbstractC0149a.y(Boolean.valueOf(webView13.canGoForward()));
                            } catch (Throwable th14) {
                                listQ14 = Z1.f.Q(th14);
                            }
                            lVar.u(listQ14);
                            break;
                        case 14:
                            C1039j c1039j16 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj24 = ((List) obj).get(0);
                            N3.h.c(obj24, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView14 = (WebView) obj24;
                            try {
                                c1039j16.getClass();
                                webView14.goBack();
                                listQ15 = AbstractC0149a.y(null);
                            } catch (Throwable th15) {
                                listQ15 = Z1.f.Q(th15);
                            }
                            lVar.u(listQ15);
                            break;
                        case 15:
                            C1039j c1039j17 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj25 = ((List) obj).get(0);
                            N3.h.c(obj25, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView15 = (WebView) obj25;
                            try {
                                c1039j17.getClass();
                                webView15.reload();
                                listQ16 = AbstractC0149a.y(null);
                            } catch (Throwable th16) {
                                listQ16 = Z1.f.Q(th16);
                            }
                            lVar.u(listQ16);
                            break;
                        case 16:
                            C1039j c1039j18 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj;
                            Object obj26 = list9.get(0);
                            N3.h.c(obj26, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView16 = (WebView) obj26;
                            Object obj27 = list9.get(1);
                            N3.h.c(obj27, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue = ((Boolean) obj27).booleanValue();
                            try {
                                c1039j18.getClass();
                                webView16.clearCache(zBooleanValue);
                                listQ17 = AbstractC0149a.y(null);
                            } catch (Throwable th17) {
                                listQ17 = Z1.f.Q(th17);
                            }
                            lVar.u(listQ17);
                            break;
                        case 17:
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj;
                            Object obj28 = list10.get(0);
                            N3.h.c(obj28, "null cannot be cast to non-null type android.webkit.WebView");
                            Object obj29 = list10.get(1);
                            N3.h.c(obj29, "null cannot be cast to non-null type kotlin.String");
                            C1054y c1054y = new C1054y(lVar, 1);
                            c1039j.getClass();
                            ((WebView) obj28).evaluateJavascript((String) obj29, new C1042m(1, c1054y));
                            break;
                        case 18:
                            C1039j c1039j19 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj30 = ((List) obj).get(0);
                            N3.h.c(obj30, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView17 = (WebView) obj30;
                            try {
                                c1039j19.getClass();
                                listQ18 = AbstractC0149a.y(webView17.getTitle());
                            } catch (Throwable th18) {
                                listQ18 = Z1.f.Q(th18);
                            }
                            lVar.u(listQ18);
                            break;
                        case 19:
                            C1039j c1039j20 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj31 = ((List) obj).get(0);
                            N3.h.c(obj31, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue2 = ((Boolean) obj31).booleanValue();
                            try {
                                c1039j20.getClass();
                                WebView.setWebContentsDebuggingEnabled(zBooleanValue2);
                                listQ19 = AbstractC0149a.y(null);
                            } catch (Throwable th19) {
                                listQ19 = Z1.f.Q(th19);
                            }
                            lVar.u(listQ19);
                            break;
                        case 20:
                            C1039j c1039j21 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj;
                            Object obj32 = list11.get(0);
                            N3.h.c(obj32, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView18 = (WebView) obj32;
                            WebViewClient webViewClient = (WebViewClient) list11.get(1);
                            try {
                                c1039j21.getClass();
                                webView18.setWebViewClient(webViewClient);
                                listQ20 = AbstractC0149a.y(null);
                            } catch (Throwable th20) {
                                listQ20 = Z1.f.Q(th20);
                            }
                            lVar.u(listQ20);
                            break;
                        case 21:
                            C1039j c1039j22 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list12 = (List) obj;
                            Object obj33 = list12.get(0);
                            N3.h.c(obj33, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView19 = (WebView) obj33;
                            Object obj34 = list12.get(1);
                            N3.h.c(obj34, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.JavaScriptChannel");
                            C1048s c1048s = (C1048s) obj34;
                            try {
                                c1039j22.getClass();
                                webView19.addJavascriptInterface(c1048s, c1048s.f11098a);
                                listQ21 = AbstractC0149a.y(null);
                            } catch (Throwable th21) {
                                listQ21 = Z1.f.Q(th21);
                            }
                            lVar.u(listQ21);
                            break;
                        default:
                            C1039j c1039j23 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj;
                            Object obj35 = list13.get(0);
                            N3.h.c(obj35, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView20 = (WebView) obj35;
                            Object obj36 = list13.get(1);
                            N3.h.c(obj36, "null cannot be cast to non-null type kotlin.String");
                            String str11 = (String) obj36;
                            try {
                                c1039j23.getClass();
                                webView20.removeJavascriptInterface(str11);
                                listQ22 = AbstractC0149a.y(null);
                            } catch (Throwable th22) {
                                listQ22 = Z1.f.Q(th22);
                            }
                            lVar.u(listQ22);
                            break;
                    }
                }
            });
        } else {
            iVar21.E(null);
        }
        i iVar22 = new i(interfaceC0696f, "dev.flutter.pigeon.webview_flutter_android.WebView.setBackgroundColor", gVar, (C0200z) null);
        if (c1039j != null) {
            final int i25 = 4;
            iVar22.E(new InterfaceC0692b() { // from class: y3.I
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
                    List listQ18;
                    List listQ19;
                    List listQ20;
                    List listQ21;
                    List listQ22;
                    switch (i25) {
                        case 0:
                            C1039j c1039j2 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj2 = ((List) obj).get(0);
                            N3.h.c(obj2, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((C1032c) c1039j2.f11068a.f9n).a(((Long) obj2).longValue(), c1039j2.a());
                                listQ = AbstractC0149a.y(null);
                            } catch (Throwable th) {
                                listQ = Z1.f.Q(th);
                            }
                            lVar.u(listQ);
                            break;
                        case 1:
                            C1039j c1039j3 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj3 = list.get(0);
                            N3.h.c(obj3, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView = (WebView) obj3;
                            DownloadListener downloadListener = (DownloadListener) list.get(1);
                            try {
                                c1039j3.getClass();
                                webView.setDownloadListener(downloadListener);
                                listQ2 = AbstractC0149a.y(null);
                            } catch (Throwable th2) {
                                listQ2 = Z1.f.Q(th2);
                            }
                            lVar.u(listQ2);
                            break;
                        case 2:
                            C1039j c1039j4 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj;
                            Object obj4 = list2.get(0);
                            N3.h.c(obj4, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView2 = (WebView) obj4;
                            Object obj5 = list2.get(1);
                            N3.h.c(obj5, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((C1032c) c1039j4.f11068a.f9n).a(((Long) obj5).longValue(), webView2.getSettings());
                                listQ3 = AbstractC0149a.y(null);
                            } catch (Throwable th3) {
                                listQ3 = Z1.f.Q(th3);
                            }
                            lVar.u(listQ3);
                            break;
                        case 3:
                            C1039j c1039j5 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj;
                            Object obj6 = list3.get(0);
                            N3.h.c(obj6, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView3 = (WebView) obj6;
                            C1022Q c1022q = (C1022Q) list3.get(1);
                            try {
                                c1039j5.getClass();
                                webView3.setWebChromeClient(c1022q);
                                listQ4 = AbstractC0149a.y(null);
                            } catch (Throwable th4) {
                                listQ4 = Z1.f.Q(th4);
                            }
                            lVar.u(listQ4);
                            break;
                        case 4:
                            C1039j c1039j6 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj;
                            Object obj7 = list4.get(0);
                            N3.h.c(obj7, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView4 = (WebView) obj7;
                            Object obj8 = list4.get(1);
                            N3.h.c(obj8, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue = ((Long) obj8).longValue();
                            try {
                                c1039j6.getClass();
                                webView4.setBackgroundColor((int) jLongValue);
                                listQ5 = AbstractC0149a.y(null);
                            } catch (Throwable th5) {
                                listQ5 = Z1.f.Q(th5);
                            }
                            lVar.u(listQ5);
                            break;
                        case 5:
                            C1039j c1039j7 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj9 = ((List) obj).get(0);
                            N3.h.c(obj9, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView5 = (WebView) obj9;
                            try {
                                c1039j7.getClass();
                                webView5.destroy();
                                listQ6 = AbstractC0149a.y(null);
                            } catch (Throwable th6) {
                                listQ6 = Z1.f.Q(th6);
                            }
                            lVar.u(listQ6);
                            break;
                        case O.j.STRING_SET_FIELD_NUMBER /* 6 */:
                            C1039j c1039j8 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj;
                            Object obj10 = list5.get(0);
                            N3.h.c(obj10, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView6 = (WebView) obj10;
                            Object obj11 = list5.get(1);
                            N3.h.c(obj11, "null cannot be cast to non-null type kotlin.String");
                            String str = (String) obj11;
                            String str2 = (String) list5.get(2);
                            String str3 = (String) list5.get(3);
                            try {
                                c1039j8.getClass();
                                webView6.loadData(str, str2, str3);
                                listQ7 = AbstractC0149a.y(null);
                            } catch (Throwable th7) {
                                listQ7 = Z1.f.Q(th7);
                            }
                            lVar.u(listQ7);
                            break;
                        case O.j.DOUBLE_FIELD_NUMBER /* 7 */:
                            C1039j c1039j9 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj;
                            Object obj12 = list6.get(0);
                            N3.h.c(obj12, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView7 = (WebView) obj12;
                            String str4 = (String) list6.get(1);
                            Object obj13 = list6.get(2);
                            N3.h.c(obj13, "null cannot be cast to non-null type kotlin.String");
                            String str5 = (String) obj13;
                            String str6 = (String) list6.get(3);
                            String str7 = (String) list6.get(4);
                            String str8 = (String) list6.get(5);
                            try {
                                c1039j9.getClass();
                                webView7.loadDataWithBaseURL(str4, str5, str6, str7, str8);
                                listQ8 = AbstractC0149a.y(null);
                            } catch (Throwable th8) {
                                listQ8 = Z1.f.Q(th8);
                            }
                            lVar.u(listQ8);
                            break;
                        case O.j.BYTES_FIELD_NUMBER /* 8 */:
                            C1039j c1039j10 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj;
                            Object obj14 = list7.get(0);
                            N3.h.c(obj14, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView8 = (WebView) obj14;
                            Object obj15 = list7.get(1);
                            N3.h.c(obj15, "null cannot be cast to non-null type kotlin.String");
                            String str9 = (String) obj15;
                            Object obj16 = list7.get(2);
                            N3.h.c(obj16, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.String>");
                            Map<String, String> map = (Map) obj16;
                            try {
                                c1039j10.getClass();
                                webView8.loadUrl(str9, map);
                                listQ9 = AbstractC0149a.y(null);
                            } catch (Throwable th9) {
                                listQ9 = Z1.f.Q(th9);
                            }
                            lVar.u(listQ9);
                            break;
                        case 9:
                            C1039j c1039j11 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj;
                            Object obj17 = list8.get(0);
                            N3.h.c(obj17, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView9 = (WebView) obj17;
                            Object obj18 = list8.get(1);
                            N3.h.c(obj18, "null cannot be cast to non-null type kotlin.String");
                            String str10 = (String) obj18;
                            Object obj19 = list8.get(2);
                            N3.h.c(obj19, "null cannot be cast to non-null type kotlin.ByteArray");
                            byte[] bArr = (byte[]) obj19;
                            try {
                                c1039j11.getClass();
                                webView9.postUrl(str10, bArr);
                                listQ10 = AbstractC0149a.y(null);
                            } catch (Throwable th10) {
                                listQ10 = Z1.f.Q(th10);
                            }
                            lVar.u(listQ10);
                            break;
                        case 10:
                            C1039j c1039j12 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj20 = ((List) obj).get(0);
                            N3.h.c(obj20, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView10 = (WebView) obj20;
                            try {
                                c1039j12.getClass();
                                listQ11 = AbstractC0149a.y(webView10.getUrl());
                            } catch (Throwable th11) {
                                listQ11 = Z1.f.Q(th11);
                            }
                            lVar.u(listQ11);
                            break;
                        case 11:
                            C1039j c1039j13 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj21 = ((List) obj).get(0);
                            N3.h.c(obj21, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView11 = (WebView) obj21;
                            try {
                                c1039j13.getClass();
                                webView11.goForward();
                                listQ12 = AbstractC0149a.y(null);
                            } catch (Throwable th12) {
                                listQ12 = Z1.f.Q(th12);
                            }
                            lVar.u(listQ12);
                            break;
                        case 12:
                            C1039j c1039j14 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj22 = ((List) obj).get(0);
                            N3.h.c(obj22, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView12 = (WebView) obj22;
                            try {
                                c1039j14.getClass();
                                listQ13 = AbstractC0149a.y(Boolean.valueOf(webView12.canGoBack()));
                            } catch (Throwable th13) {
                                listQ13 = Z1.f.Q(th13);
                            }
                            lVar.u(listQ13);
                            break;
                        case 13:
                            C1039j c1039j15 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj23 = ((List) obj).get(0);
                            N3.h.c(obj23, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView13 = (WebView) obj23;
                            try {
                                c1039j15.getClass();
                                listQ14 = AbstractC0149a.y(Boolean.valueOf(webView13.canGoForward()));
                            } catch (Throwable th14) {
                                listQ14 = Z1.f.Q(th14);
                            }
                            lVar.u(listQ14);
                            break;
                        case 14:
                            C1039j c1039j16 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj24 = ((List) obj).get(0);
                            N3.h.c(obj24, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView14 = (WebView) obj24;
                            try {
                                c1039j16.getClass();
                                webView14.goBack();
                                listQ15 = AbstractC0149a.y(null);
                            } catch (Throwable th15) {
                                listQ15 = Z1.f.Q(th15);
                            }
                            lVar.u(listQ15);
                            break;
                        case 15:
                            C1039j c1039j17 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj25 = ((List) obj).get(0);
                            N3.h.c(obj25, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView15 = (WebView) obj25;
                            try {
                                c1039j17.getClass();
                                webView15.reload();
                                listQ16 = AbstractC0149a.y(null);
                            } catch (Throwable th16) {
                                listQ16 = Z1.f.Q(th16);
                            }
                            lVar.u(listQ16);
                            break;
                        case 16:
                            C1039j c1039j18 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj;
                            Object obj26 = list9.get(0);
                            N3.h.c(obj26, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView16 = (WebView) obj26;
                            Object obj27 = list9.get(1);
                            N3.h.c(obj27, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue = ((Boolean) obj27).booleanValue();
                            try {
                                c1039j18.getClass();
                                webView16.clearCache(zBooleanValue);
                                listQ17 = AbstractC0149a.y(null);
                            } catch (Throwable th17) {
                                listQ17 = Z1.f.Q(th17);
                            }
                            lVar.u(listQ17);
                            break;
                        case 17:
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj;
                            Object obj28 = list10.get(0);
                            N3.h.c(obj28, "null cannot be cast to non-null type android.webkit.WebView");
                            Object obj29 = list10.get(1);
                            N3.h.c(obj29, "null cannot be cast to non-null type kotlin.String");
                            C1054y c1054y = new C1054y(lVar, 1);
                            c1039j.getClass();
                            ((WebView) obj28).evaluateJavascript((String) obj29, new C1042m(1, c1054y));
                            break;
                        case 18:
                            C1039j c1039j19 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj30 = ((List) obj).get(0);
                            N3.h.c(obj30, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView17 = (WebView) obj30;
                            try {
                                c1039j19.getClass();
                                listQ18 = AbstractC0149a.y(webView17.getTitle());
                            } catch (Throwable th18) {
                                listQ18 = Z1.f.Q(th18);
                            }
                            lVar.u(listQ18);
                            break;
                        case 19:
                            C1039j c1039j20 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj31 = ((List) obj).get(0);
                            N3.h.c(obj31, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue2 = ((Boolean) obj31).booleanValue();
                            try {
                                c1039j20.getClass();
                                WebView.setWebContentsDebuggingEnabled(zBooleanValue2);
                                listQ19 = AbstractC0149a.y(null);
                            } catch (Throwable th19) {
                                listQ19 = Z1.f.Q(th19);
                            }
                            lVar.u(listQ19);
                            break;
                        case 20:
                            C1039j c1039j21 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj;
                            Object obj32 = list11.get(0);
                            N3.h.c(obj32, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView18 = (WebView) obj32;
                            WebViewClient webViewClient = (WebViewClient) list11.get(1);
                            try {
                                c1039j21.getClass();
                                webView18.setWebViewClient(webViewClient);
                                listQ20 = AbstractC0149a.y(null);
                            } catch (Throwable th20) {
                                listQ20 = Z1.f.Q(th20);
                            }
                            lVar.u(listQ20);
                            break;
                        case 21:
                            C1039j c1039j22 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list12 = (List) obj;
                            Object obj33 = list12.get(0);
                            N3.h.c(obj33, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView19 = (WebView) obj33;
                            Object obj34 = list12.get(1);
                            N3.h.c(obj34, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.JavaScriptChannel");
                            C1048s c1048s = (C1048s) obj34;
                            try {
                                c1039j22.getClass();
                                webView19.addJavascriptInterface(c1048s, c1048s.f11098a);
                                listQ21 = AbstractC0149a.y(null);
                            } catch (Throwable th21) {
                                listQ21 = Z1.f.Q(th21);
                            }
                            lVar.u(listQ21);
                            break;
                        default:
                            C1039j c1039j23 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj;
                            Object obj35 = list13.get(0);
                            N3.h.c(obj35, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView20 = (WebView) obj35;
                            Object obj36 = list13.get(1);
                            N3.h.c(obj36, "null cannot be cast to non-null type kotlin.String");
                            String str11 = (String) obj36;
                            try {
                                c1039j23.getClass();
                                webView20.removeJavascriptInterface(str11);
                                listQ22 = AbstractC0149a.y(null);
                            } catch (Throwable th22) {
                                listQ22 = Z1.f.Q(th22);
                            }
                            lVar.u(listQ22);
                            break;
                    }
                }
            });
        } else {
            iVar22.E(null);
        }
        i iVar23 = new i(interfaceC0696f, "dev.flutter.pigeon.webview_flutter_android.WebView.destroy", gVar, (C0200z) null);
        if (c1039j == null) {
            iVar23.E(null);
        } else {
            final int i26 = 5;
            iVar23.E(new InterfaceC0692b() { // from class: y3.I
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
                    List listQ18;
                    List listQ19;
                    List listQ20;
                    List listQ21;
                    List listQ22;
                    switch (i26) {
                        case 0:
                            C1039j c1039j2 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj2 = ((List) obj).get(0);
                            N3.h.c(obj2, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((C1032c) c1039j2.f11068a.f9n).a(((Long) obj2).longValue(), c1039j2.a());
                                listQ = AbstractC0149a.y(null);
                            } catch (Throwable th) {
                                listQ = Z1.f.Q(th);
                            }
                            lVar.u(listQ);
                            break;
                        case 1:
                            C1039j c1039j3 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj3 = list.get(0);
                            N3.h.c(obj3, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView = (WebView) obj3;
                            DownloadListener downloadListener = (DownloadListener) list.get(1);
                            try {
                                c1039j3.getClass();
                                webView.setDownloadListener(downloadListener);
                                listQ2 = AbstractC0149a.y(null);
                            } catch (Throwable th2) {
                                listQ2 = Z1.f.Q(th2);
                            }
                            lVar.u(listQ2);
                            break;
                        case 2:
                            C1039j c1039j4 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj;
                            Object obj4 = list2.get(0);
                            N3.h.c(obj4, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView2 = (WebView) obj4;
                            Object obj5 = list2.get(1);
                            N3.h.c(obj5, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((C1032c) c1039j4.f11068a.f9n).a(((Long) obj5).longValue(), webView2.getSettings());
                                listQ3 = AbstractC0149a.y(null);
                            } catch (Throwable th3) {
                                listQ3 = Z1.f.Q(th3);
                            }
                            lVar.u(listQ3);
                            break;
                        case 3:
                            C1039j c1039j5 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj;
                            Object obj6 = list3.get(0);
                            N3.h.c(obj6, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView3 = (WebView) obj6;
                            C1022Q c1022q = (C1022Q) list3.get(1);
                            try {
                                c1039j5.getClass();
                                webView3.setWebChromeClient(c1022q);
                                listQ4 = AbstractC0149a.y(null);
                            } catch (Throwable th4) {
                                listQ4 = Z1.f.Q(th4);
                            }
                            lVar.u(listQ4);
                            break;
                        case 4:
                            C1039j c1039j6 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj;
                            Object obj7 = list4.get(0);
                            N3.h.c(obj7, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView4 = (WebView) obj7;
                            Object obj8 = list4.get(1);
                            N3.h.c(obj8, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue = ((Long) obj8).longValue();
                            try {
                                c1039j6.getClass();
                                webView4.setBackgroundColor((int) jLongValue);
                                listQ5 = AbstractC0149a.y(null);
                            } catch (Throwable th5) {
                                listQ5 = Z1.f.Q(th5);
                            }
                            lVar.u(listQ5);
                            break;
                        case 5:
                            C1039j c1039j7 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj9 = ((List) obj).get(0);
                            N3.h.c(obj9, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView5 = (WebView) obj9;
                            try {
                                c1039j7.getClass();
                                webView5.destroy();
                                listQ6 = AbstractC0149a.y(null);
                            } catch (Throwable th6) {
                                listQ6 = Z1.f.Q(th6);
                            }
                            lVar.u(listQ6);
                            break;
                        case O.j.STRING_SET_FIELD_NUMBER /* 6 */:
                            C1039j c1039j8 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj;
                            Object obj10 = list5.get(0);
                            N3.h.c(obj10, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView6 = (WebView) obj10;
                            Object obj11 = list5.get(1);
                            N3.h.c(obj11, "null cannot be cast to non-null type kotlin.String");
                            String str = (String) obj11;
                            String str2 = (String) list5.get(2);
                            String str3 = (String) list5.get(3);
                            try {
                                c1039j8.getClass();
                                webView6.loadData(str, str2, str3);
                                listQ7 = AbstractC0149a.y(null);
                            } catch (Throwable th7) {
                                listQ7 = Z1.f.Q(th7);
                            }
                            lVar.u(listQ7);
                            break;
                        case O.j.DOUBLE_FIELD_NUMBER /* 7 */:
                            C1039j c1039j9 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj;
                            Object obj12 = list6.get(0);
                            N3.h.c(obj12, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView7 = (WebView) obj12;
                            String str4 = (String) list6.get(1);
                            Object obj13 = list6.get(2);
                            N3.h.c(obj13, "null cannot be cast to non-null type kotlin.String");
                            String str5 = (String) obj13;
                            String str6 = (String) list6.get(3);
                            String str7 = (String) list6.get(4);
                            String str8 = (String) list6.get(5);
                            try {
                                c1039j9.getClass();
                                webView7.loadDataWithBaseURL(str4, str5, str6, str7, str8);
                                listQ8 = AbstractC0149a.y(null);
                            } catch (Throwable th8) {
                                listQ8 = Z1.f.Q(th8);
                            }
                            lVar.u(listQ8);
                            break;
                        case O.j.BYTES_FIELD_NUMBER /* 8 */:
                            C1039j c1039j10 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj;
                            Object obj14 = list7.get(0);
                            N3.h.c(obj14, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView8 = (WebView) obj14;
                            Object obj15 = list7.get(1);
                            N3.h.c(obj15, "null cannot be cast to non-null type kotlin.String");
                            String str9 = (String) obj15;
                            Object obj16 = list7.get(2);
                            N3.h.c(obj16, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.String>");
                            Map<String, String> map = (Map) obj16;
                            try {
                                c1039j10.getClass();
                                webView8.loadUrl(str9, map);
                                listQ9 = AbstractC0149a.y(null);
                            } catch (Throwable th9) {
                                listQ9 = Z1.f.Q(th9);
                            }
                            lVar.u(listQ9);
                            break;
                        case 9:
                            C1039j c1039j11 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj;
                            Object obj17 = list8.get(0);
                            N3.h.c(obj17, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView9 = (WebView) obj17;
                            Object obj18 = list8.get(1);
                            N3.h.c(obj18, "null cannot be cast to non-null type kotlin.String");
                            String str10 = (String) obj18;
                            Object obj19 = list8.get(2);
                            N3.h.c(obj19, "null cannot be cast to non-null type kotlin.ByteArray");
                            byte[] bArr = (byte[]) obj19;
                            try {
                                c1039j11.getClass();
                                webView9.postUrl(str10, bArr);
                                listQ10 = AbstractC0149a.y(null);
                            } catch (Throwable th10) {
                                listQ10 = Z1.f.Q(th10);
                            }
                            lVar.u(listQ10);
                            break;
                        case 10:
                            C1039j c1039j12 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj20 = ((List) obj).get(0);
                            N3.h.c(obj20, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView10 = (WebView) obj20;
                            try {
                                c1039j12.getClass();
                                listQ11 = AbstractC0149a.y(webView10.getUrl());
                            } catch (Throwable th11) {
                                listQ11 = Z1.f.Q(th11);
                            }
                            lVar.u(listQ11);
                            break;
                        case 11:
                            C1039j c1039j13 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj21 = ((List) obj).get(0);
                            N3.h.c(obj21, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView11 = (WebView) obj21;
                            try {
                                c1039j13.getClass();
                                webView11.goForward();
                                listQ12 = AbstractC0149a.y(null);
                            } catch (Throwable th12) {
                                listQ12 = Z1.f.Q(th12);
                            }
                            lVar.u(listQ12);
                            break;
                        case 12:
                            C1039j c1039j14 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj22 = ((List) obj).get(0);
                            N3.h.c(obj22, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView12 = (WebView) obj22;
                            try {
                                c1039j14.getClass();
                                listQ13 = AbstractC0149a.y(Boolean.valueOf(webView12.canGoBack()));
                            } catch (Throwable th13) {
                                listQ13 = Z1.f.Q(th13);
                            }
                            lVar.u(listQ13);
                            break;
                        case 13:
                            C1039j c1039j15 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj23 = ((List) obj).get(0);
                            N3.h.c(obj23, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView13 = (WebView) obj23;
                            try {
                                c1039j15.getClass();
                                listQ14 = AbstractC0149a.y(Boolean.valueOf(webView13.canGoForward()));
                            } catch (Throwable th14) {
                                listQ14 = Z1.f.Q(th14);
                            }
                            lVar.u(listQ14);
                            break;
                        case 14:
                            C1039j c1039j16 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj24 = ((List) obj).get(0);
                            N3.h.c(obj24, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView14 = (WebView) obj24;
                            try {
                                c1039j16.getClass();
                                webView14.goBack();
                                listQ15 = AbstractC0149a.y(null);
                            } catch (Throwable th15) {
                                listQ15 = Z1.f.Q(th15);
                            }
                            lVar.u(listQ15);
                            break;
                        case 15:
                            C1039j c1039j17 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj25 = ((List) obj).get(0);
                            N3.h.c(obj25, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView15 = (WebView) obj25;
                            try {
                                c1039j17.getClass();
                                webView15.reload();
                                listQ16 = AbstractC0149a.y(null);
                            } catch (Throwable th16) {
                                listQ16 = Z1.f.Q(th16);
                            }
                            lVar.u(listQ16);
                            break;
                        case 16:
                            C1039j c1039j18 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj;
                            Object obj26 = list9.get(0);
                            N3.h.c(obj26, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView16 = (WebView) obj26;
                            Object obj27 = list9.get(1);
                            N3.h.c(obj27, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue = ((Boolean) obj27).booleanValue();
                            try {
                                c1039j18.getClass();
                                webView16.clearCache(zBooleanValue);
                                listQ17 = AbstractC0149a.y(null);
                            } catch (Throwable th17) {
                                listQ17 = Z1.f.Q(th17);
                            }
                            lVar.u(listQ17);
                            break;
                        case 17:
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj;
                            Object obj28 = list10.get(0);
                            N3.h.c(obj28, "null cannot be cast to non-null type android.webkit.WebView");
                            Object obj29 = list10.get(1);
                            N3.h.c(obj29, "null cannot be cast to non-null type kotlin.String");
                            C1054y c1054y = new C1054y(lVar, 1);
                            c1039j.getClass();
                            ((WebView) obj28).evaluateJavascript((String) obj29, new C1042m(1, c1054y));
                            break;
                        case 18:
                            C1039j c1039j19 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj30 = ((List) obj).get(0);
                            N3.h.c(obj30, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView17 = (WebView) obj30;
                            try {
                                c1039j19.getClass();
                                listQ18 = AbstractC0149a.y(webView17.getTitle());
                            } catch (Throwable th18) {
                                listQ18 = Z1.f.Q(th18);
                            }
                            lVar.u(listQ18);
                            break;
                        case 19:
                            C1039j c1039j20 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj31 = ((List) obj).get(0);
                            N3.h.c(obj31, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue2 = ((Boolean) obj31).booleanValue();
                            try {
                                c1039j20.getClass();
                                WebView.setWebContentsDebuggingEnabled(zBooleanValue2);
                                listQ19 = AbstractC0149a.y(null);
                            } catch (Throwable th19) {
                                listQ19 = Z1.f.Q(th19);
                            }
                            lVar.u(listQ19);
                            break;
                        case 20:
                            C1039j c1039j21 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj;
                            Object obj32 = list11.get(0);
                            N3.h.c(obj32, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView18 = (WebView) obj32;
                            WebViewClient webViewClient = (WebViewClient) list11.get(1);
                            try {
                                c1039j21.getClass();
                                webView18.setWebViewClient(webViewClient);
                                listQ20 = AbstractC0149a.y(null);
                            } catch (Throwable th20) {
                                listQ20 = Z1.f.Q(th20);
                            }
                            lVar.u(listQ20);
                            break;
                        case 21:
                            C1039j c1039j22 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list12 = (List) obj;
                            Object obj33 = list12.get(0);
                            N3.h.c(obj33, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView19 = (WebView) obj33;
                            Object obj34 = list12.get(1);
                            N3.h.c(obj34, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.JavaScriptChannel");
                            C1048s c1048s = (C1048s) obj34;
                            try {
                                c1039j22.getClass();
                                webView19.addJavascriptInterface(c1048s, c1048s.f11098a);
                                listQ21 = AbstractC0149a.y(null);
                            } catch (Throwable th21) {
                                listQ21 = Z1.f.Q(th21);
                            }
                            lVar.u(listQ21);
                            break;
                        default:
                            C1039j c1039j23 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj;
                            Object obj35 = list13.get(0);
                            N3.h.c(obj35, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView20 = (WebView) obj35;
                            Object obj36 = list13.get(1);
                            N3.h.c(obj36, "null cannot be cast to non-null type kotlin.String");
                            String str11 = (String) obj36;
                            try {
                                c1039j23.getClass();
                                webView20.removeJavascriptInterface(str11);
                                listQ22 = AbstractC0149a.y(null);
                            } catch (Throwable th22) {
                                listQ22 = Z1.f.Q(th22);
                            }
                            lVar.u(listQ22);
                            break;
                    }
                }
            });
        }
    }

    public static final Object H(t tVar, t tVar2, p pVar) throws Throwable {
        Object c0137n;
        Object objM;
        try {
            s.a(2, pVar);
            c0137n = pVar.i(tVar2, tVar);
        } catch (Throwable th) {
            c0137n = new C0137n(th, false);
        }
        F3.a aVar = F3.a.f861l;
        if (c0137n == aVar || (objM = tVar.M(c0137n)) == AbstractC0144v.f2448d) {
            return aVar;
        }
        if (objM instanceof C0137n) {
            throw ((C0137n) objM).f2433a;
        }
        return AbstractC0144v.o(objM);
    }

    public static String I(String str) {
        int length = str.length();
        int i = 0;
        while (i < length) {
            char cCharAt = str.charAt(i);
            if (cCharAt >= 'A' && cCharAt <= 'Z') {
                char[] charArray = str.toCharArray();
                while (i < length) {
                    char c5 = charArray[i];
                    if (c5 >= 'A' && c5 <= 'Z') {
                        charArray[i] = (char) (c5 ^ ' ');
                    }
                    i++;
                }
                return String.valueOf(charArray);
            }
            i++;
        }
        return str;
    }

    public static String J(String str) {
        int length = str.length();
        int i = 0;
        while (i < length) {
            char cCharAt = str.charAt(i);
            if (cCharAt >= 'a' && cCharAt <= 'z') {
                char[] charArray = str.toCharArray();
                while (i < length) {
                    char c5 = charArray[i];
                    if (c5 >= 'a' && c5 <= 'z') {
                        charArray[i] = (char) (c5 ^ ' ');
                    }
                    i++;
                }
                return String.valueOf(charArray);
            }
            i++;
        }
        return str;
    }

    public static ArrayList K(Throwable th) {
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(th.toString());
        arrayList.add(th.getClass().getSimpleName());
        arrayList.add("Cause: " + th.getCause() + ", Stacktrace: " + Log.getStackTraceString(th));
        return arrayList;
    }

    public static final void M(ByteBuffer byteBuffer, ByteBuffer byteBuffer2, ByteBuffer byteBuffer3, int i) {
        if (i < 0 || byteBuffer2.remaining() < i || byteBuffer3.remaining() < i || byteBuffer.remaining() < i) {
            throw new IllegalArgumentException("That combination of buffers, offsets and length to xor result in out-of-bond accesses.");
        }
        for (int i5 = 0; i5 < i; i5++) {
            byteBuffer.put((byte) (byteBuffer2.get() ^ byteBuffer3.get()));
        }
    }

    public static final byte[] N(int i, int i5, int i6, byte[] bArr, byte[] bArr2) {
        if (i6 < 0 || bArr.length - i6 < i || bArr2.length - i6 < i5) {
            throw new IllegalArgumentException("That combination of buffers, offsets and length to xor result in out-of-bond accesses.");
        }
        byte[] bArr3 = new byte[i6];
        for (int i7 = 0; i7 < i6; i7++) {
            bArr3[i7] = (byte) (bArr[i7 + i] ^ bArr2[i7 + i5]);
        }
        return bArr3;
    }

    public static final byte[] O(byte[] bArr, byte[] bArr2) {
        if (bArr.length == bArr2.length) {
            return N(0, 0, bArr.length, bArr, bArr2);
        }
        throw new IllegalArgumentException("The lengths of x and y should match.");
    }

    public static ArrayList P(DisplayManager displayManager) {
        if (Build.VERSION.SDK_INT >= 28) {
            return new ArrayList();
        }
        try {
            Field declaredField = DisplayManager.class.getDeclaredField("mGlobal");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(displayManager);
            Field declaredField2 = obj.getClass().getDeclaredField("mDisplayListeners");
            declaredField2.setAccessible(true);
            ArrayList arrayList = (ArrayList) declaredField2.get(obj);
            ArrayList arrayList2 = new ArrayList();
            Field field = null;
            for (Object obj2 : arrayList) {
                if (field == null) {
                    field = obj2.getClass().getField("mListener");
                    field.setAccessible(true);
                }
                arrayList2.add((DisplayManager.DisplayListener) field.get(obj2));
            }
            return arrayList2;
        } catch (IllegalAccessException e5) {
            e = e5;
            Log.w("DisplayListenerProxy", "Could not extract WebView's display listeners. " + e);
            return new ArrayList();
        } catch (NoSuchFieldException e6) {
            e = e6;
            Log.w("DisplayListenerProxy", "Could not extract WebView's display listeners. " + e);
            return new ArrayList();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x0082 -> B:25:0x0065). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x0085 -> B:25:0x0065). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(java.util.List r6, L.C0103k r7, G3.b r8) throws java.lang.Throwable {
        /*
            boolean r0 = r8 instanceof L.C0097e
            if (r0 == 0) goto L13
            r0 = r8
            L.e r0 = (L.C0097e) r0
            int r1 = r0.f1383r
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f1383r = r1
            goto L18
        L13:
            L.e r0 = new L.e
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f1382q
            F3.a r1 = F3.a.f861l
            int r2 = r0.f1383r
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L42
            if (r2 == r4) goto L3a
            if (r2 != r3) goto L32
            java.util.Iterator r6 = r0.f1381p
            java.io.Serializable r7 = r0.f1380o
            N3.p r7 = (N3.p) r7
            i4.a.Y(r8)     // Catch: java.lang.Throwable -> L30
            goto L65
        L30:
            r8 = move-exception
            goto L7e
        L32:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L3a:
            java.io.Serializable r6 = r0.f1380o
            java.util.List r6 = (java.util.List) r6
            i4.a.Y(r8)
            goto L5c
        L42:
            i4.a.Y(r8)
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            L.g r2 = new L.g
            r5 = 0
            r2.<init>(r6, r8, r5)
            r0.f1380o = r8
            r0.f1383r = r4
            java.lang.Object r6 = r7.a(r2, r0)
            if (r6 != r1) goto L5b
            goto L93
        L5b:
            r6 = r8
        L5c:
            N3.p r7 = new N3.p
            r7.<init>()
            java.util.Iterator r6 = r6.iterator()
        L65:
            boolean r8 = r6.hasNext()
            if (r8 == 0) goto L8b
            java.lang.Object r8 = r6.next()
            M3.l r8 = (M3.l) r8
            r0.f1380o = r7     // Catch: java.lang.Throwable -> L30
            r0.f1381p = r6     // Catch: java.lang.Throwable -> L30
            r0.f1383r = r3     // Catch: java.lang.Throwable -> L30
            java.lang.Object r8 = r8.c(r0)     // Catch: java.lang.Throwable -> L30
            if (r8 != r1) goto L65
            goto L93
        L7e:
            java.lang.Object r2 = r7.f1626l
            if (r2 != 0) goto L85
            r7.f1626l = r8
            goto L65
        L85:
            java.lang.Throwable r2 = (java.lang.Throwable) r2
            c(r2, r8)
            goto L65
        L8b:
            java.lang.Object r6 = r7.f1626l
            java.lang.Throwable r6 = (java.lang.Throwable) r6
            if (r6 != 0) goto L94
            B3.g r1 = B3.g.f275a
        L93:
            return r1
        L94:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: a.AbstractC0149a.a(java.util.List, L.k, G3.b):java.lang.Object");
    }

    public static final List b(Throwable th) {
        return C3.g.Q(th.getClass().getSimpleName(), th.toString(), "Cause: " + th.getCause() + ", Stacktrace: " + Log.getStackTraceString(th));
    }

    public static void c(Throwable th, Throwable th2) {
        h.e(th, "<this>");
        h.e(th2, "exception");
        if (th != th2) {
            Integer num = I3.a.f1080a;
            if (num == null || num.intValue() >= 19) {
                th.addSuppressed(th2);
                return;
            }
            Method method = H3.a.f981a;
            if (method != null) {
                method.invoke(th, th2);
            }
        }
    }

    public static final boolean d(int i, int i5, int i6, byte[] bArr, byte[] bArr2) {
        h.e(bArr, "a");
        h.e(bArr2, "b");
        for (int i7 = 0; i7 < i6; i7++) {
            if (bArr[i7 + i] != bArr2[i7 + i5]) {
                return false;
            }
        }
        return true;
    }

    public static int e(D d5) {
        h.e(d5, "<this>");
        if (d5.getAlpha() == 0.0f && d5.getVisibility() == 0) {
            return 4;
        }
        int visibility = d5.getVisibility();
        if (visibility == 0) {
            return 2;
        }
        if (visibility == 4) {
            return 4;
        }
        if (visibility == 8) {
            return 3;
        }
        throw new IllegalArgumentException(AbstractC0307a.i("Unknown visibility ", visibility));
    }

    public static final void f(long j5, long j6, long j7) {
        if ((j6 | j7) < 0 || j6 > j5 || j5 - j6 < j7) {
            throw new ArrayIndexOutOfBoundsException("size=" + j5 + " offset=" + j6 + " byteCount=" + j7);
        }
    }

    public static void g(int i) {
        if (2 > i || i >= 37) {
            StringBuilder sbJ = B0.j(i, "radix ", " was not in valid range ");
            sbJ.append(new c(2, 36, 1));
            throw new IllegalArgumentException(sbJ.toString());
        }
    }

    public static int h(int i, int i5) {
        long j5 = ((long) i) + ((long) i5);
        int i6 = (int) j5;
        if (j5 == ((long) i6)) {
            return i6;
        }
        throw new ArithmeticException("overflow: checkedAdd(" + i + ", " + i5 + ")");
    }

    public static void i(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    public static byte[] j(byte[]... bArr) throws GeneralSecurityException {
        int length = 0;
        for (byte[] bArr2 : bArr) {
            if (length > Integer.MAX_VALUE - bArr2.length) {
                throw new GeneralSecurityException("exceeded size limit");
            }
            length += bArr2.length;
        }
        byte[] bArr3 = new byte[length];
        int length2 = 0;
        for (byte[] bArr4 : bArr) {
            System.arraycopy(bArr4, 0, bArr3, length2, bArr4.length);
            length2 += bArr4.length;
        }
        return bArr3;
    }

    public static boolean k(File file, Resources resources, int i) throws Throwable {
        InputStream inputStreamOpenRawResource;
        try {
            inputStreamOpenRawResource = resources.openRawResource(i);
            try {
                boolean zL = l(file, inputStreamOpenRawResource);
                i(inputStreamOpenRawResource);
                return zL;
            } catch (Throwable th) {
                th = th;
                i(inputStreamOpenRawResource);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            inputStreamOpenRawResource = null;
        }
    }

    public static boolean l(File file, InputStream inputStream) throws Throwable {
        FileOutputStream fileOutputStream;
        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskWrites = StrictMode.allowThreadDiskWrites();
        FileOutputStream fileOutputStream2 = null;
        try {
            try {
                fileOutputStream = new FileOutputStream(file, false);
            } catch (IOException e5) {
                e = e5;
            }
        } catch (Throwable th) {
            th = th;
        }
        try {
            byte[] bArr = new byte[1024];
            while (true) {
                int i = inputStream.read(bArr);
                if (i == -1) {
                    i(fileOutputStream);
                    StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskWrites);
                    return true;
                }
                fileOutputStream.write(bArr, 0, i);
            }
        } catch (IOException e6) {
            e = e6;
            fileOutputStream2 = fileOutputStream;
            Log.e("TypefaceCompatUtil", "Error copying resource contents to temp file: " + e.getMessage());
            i(fileOutputStream2);
            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskWrites);
            return false;
        } catch (Throwable th2) {
            th = th2;
            fileOutputStream2 = fileOutputStream;
            i(fileOutputStream2);
            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskWrites);
            throw th;
        }
    }

    public static Q.s m(Context context) {
        ProviderInfo providerInfo;
        e eVar;
        ApplicationInfo applicationInfo;
        b cVar = Build.VERSION.SDK_INT >= 28 ? new Q.c(19) : new b(19);
        PackageManager packageManager = context.getPackageManager();
        D1.b.n(packageManager, "Package manager required to locate emoji font provider");
        Iterator<ResolveInfo> it = packageManager.queryIntentContentProviders(new Intent("androidx.content.action.LOAD_EMOJI_FONT"), 0).iterator();
        while (true) {
            if (!it.hasNext()) {
                providerInfo = null;
                break;
            }
            providerInfo = it.next().providerInfo;
            if (providerInfo != null && (applicationInfo = providerInfo.applicationInfo) != null && (applicationInfo.flags & 1) == 1) {
                break;
            }
        }
        if (providerInfo == null) {
            eVar = null;
        } else {
            try {
                String str = providerInfo.authority;
                String str2 = providerInfo.packageName;
                Signature[] signatureArrQ = cVar.q(packageManager, str2);
                ArrayList arrayList = new ArrayList();
                for (Signature signature : signatureArrQ) {
                    arrayList.add(signature.toByteArray());
                }
                eVar = new e(str, str2, "emojicompat-emoji-font", Collections.singletonList(arrayList));
            } catch (PackageManager.NameNotFoundException e5) {
                Log.wtf("emoji2.text.DefaultEmojiConfig", e5);
                eVar = null;
            }
        }
        if (eVar == null) {
            return null;
        }
        return new Q.s(new r(context, eVar));
    }

    public static boolean n(String str, String str2) {
        h.e(str, "current");
        if (str.equals(str2)) {
            return true;
        }
        if (str.length() != 0) {
            int i = 0;
            int i5 = 0;
            int i6 = 0;
            while (true) {
                if (i < str.length()) {
                    char cCharAt = str.charAt(i);
                    int i7 = i6 + 1;
                    if (i6 == 0 && cCharAt != '(') {
                        break;
                    }
                    if (cCharAt != '(') {
                        if (cCharAt == ')' && i5 - 1 == 0 && i6 != str.length() - 1) {
                            break;
                        }
                    } else {
                        i5++;
                    }
                    i++;
                    i6 = i7;
                } else if (i5 == 0) {
                    String strSubstring = str.substring(1, str.length() - 1);
                    h.d(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                    int length = strSubstring.length() - 1;
                    int i8 = 0;
                    boolean z4 = false;
                    while (i8 <= length) {
                        char cCharAt2 = strSubstring.charAt(!z4 ? i8 : length);
                        boolean z5 = Character.isWhitespace(cCharAt2) || Character.isSpaceChar(cCharAt2);
                        if (z4) {
                            if (!z5) {
                                break;
                            }
                            length--;
                        } else if (z5) {
                            i8++;
                        } else {
                            z4 = true;
                        }
                    }
                    return h.a(strSubstring.subSequence(i8, length + 1).toString(), str2);
                }
            }
        }
        return false;
    }

    public static boolean o(Context context) {
        DisplayManager displayManager = (DisplayManager) context.getSystemService("display");
        Display display = displayManager != null ? displayManager.getDisplay(0) : null;
        if (display == null || !display.isHdr()) {
            return false;
        }
        for (int i : display.getHdrCapabilities().getSupportedHdrTypes()) {
            if (i == 1) {
                return true;
            }
        }
        return false;
    }

    public static boolean p(String str, String str2) {
        char c5;
        int length = str.length();
        if (str == str2) {
            return true;
        }
        if (length != str2.length()) {
            return false;
        }
        for (int i = 0; i < length; i++) {
            if (str.charAt(i) != str2.charAt(i) && ((c5 = (char) ((r4 | ' ') - 97)) >= 26 || c5 != ((char) ((r5 | ' ') - 97)))) {
                return false;
            }
        }
        return true;
    }

    public static String q(C0215g c0215g) {
        StringBuilder sb = new StringBuilder(c0215g.size());
        for (int i = 0; i < c0215g.size(); i++) {
            byte bF = c0215g.f(i);
            if (bF == 34) {
                sb.append("\\\"");
            } else if (bF == 39) {
                sb.append("\\'");
            } else if (bF != 92) {
                switch (bF) {
                    case j.DOUBLE_FIELD_NUMBER /* 7 */:
                        sb.append("\\a");
                        break;
                    case j.BYTES_FIELD_NUMBER /* 8 */:
                        sb.append("\\b");
                        break;
                    case 9:
                        sb.append("\\t");
                        break;
                    case 10:
                        sb.append("\\n");
                        break;
                    case 11:
                        sb.append("\\v");
                        break;
                    case 12:
                        sb.append("\\f");
                        break;
                    case 13:
                        sb.append("\\r");
                        break;
                    default:
                        if (bF < 32 || bF > 126) {
                            sb.append('\\');
                            sb.append((char) (((bF >>> 6) & 3) + 48));
                            sb.append((char) (((bF >>> 3) & 7) + 48));
                            sb.append((char) ((bF & 7) + 48));
                        } else {
                            sb.append((char) bF);
                        }
                        break;
                }
            } else {
                sb.append("\\\\");
            }
        }
        return sb.toString();
    }

    public static String r(AbstractC0329i abstractC0329i) {
        StringBuilder sb = new StringBuilder(abstractC0329i.size());
        for (int i = 0; i < abstractC0329i.size(); i++) {
            byte bF = abstractC0329i.f(i);
            if (bF == 34) {
                sb.append("\\\"");
            } else if (bF == 39) {
                sb.append("\\'");
            } else if (bF != 92) {
                switch (bF) {
                    case j.DOUBLE_FIELD_NUMBER /* 7 */:
                        sb.append("\\a");
                        break;
                    case j.BYTES_FIELD_NUMBER /* 8 */:
                        sb.append("\\b");
                        break;
                    case 9:
                        sb.append("\\t");
                        break;
                    case 10:
                        sb.append("\\n");
                        break;
                    case 11:
                        sb.append("\\v");
                        break;
                    case 12:
                        sb.append("\\f");
                        break;
                    case 13:
                        sb.append("\\r");
                        break;
                    default:
                        if (bF < 32 || bF > 126) {
                            sb.append('\\');
                            sb.append((char) (((bF >>> 6) & 3) + 48));
                            sb.append((char) (((bF >>> 3) & 7) + 48));
                            sb.append((char) ((bF & 7) + 48));
                        } else {
                            sb.append((char) bF);
                        }
                        break;
                }
            } else {
                sb.append("\\\\");
            }
        }
        return sb.toString();
    }

    public static int s(boolean z4) {
        List supportedPerformancePoints;
        try {
            C0189o c0189o = new C0189o();
            c0189o.f3387m = AbstractC0156G.m("video/avc");
            C0190p c0190p = new C0190p(c0189o);
            if (c0190p.f3424n != null) {
                b0 b0VarG = y.g(q0.j.f9286m, c0190p, z4, false);
                for (int i = 0; i < b0VarG.f8585o; i++) {
                    if (((o) b0VarG.get(i)).f9291d != null && ((o) b0VarG.get(i)).f9291d.getVideoCapabilities() != null && (supportedPerformancePoints = ((o) b0VarG.get(i)).f9291d.getVideoCapabilities().getSupportedPerformancePoints()) != null && !supportedPerformancePoints.isEmpty()) {
                        n.l();
                        MediaCodecInfo.VideoCapabilities.PerformancePoint performancePointB = n.b();
                        for (int i5 = 0; i5 < supportedPerformancePoints.size(); i5++) {
                            if (n.d(supportedPerformancePoints.get(i5)).covers(performancePointB)) {
                                return 2;
                            }
                        }
                        return 1;
                    }
                }
            }
        } catch (v unused) {
        }
        return 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0047, code lost:
    
        if (r5.f10289c == r8.hashCode()) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.content.res.ColorStateList t(android.content.Context r8, int r9) {
        /*
            android.content.res.Resources r0 = r8.getResources()
            android.content.res.Resources$Theme r8 = r8.getTheme()
            v.k r1 = new v.k
            r1.<init>(r0, r8)
            java.lang.Object r2 = v.l.f10294c
            monitor-enter(r2)
            java.util.WeakHashMap r3 = v.l.f10293b     // Catch: java.lang.Throwable -> L3c
            java.lang.Object r3 = r3.get(r1)     // Catch: java.lang.Throwable -> L3c
            android.util.SparseArray r3 = (android.util.SparseArray) r3     // Catch: java.lang.Throwable -> L3c
            r4 = 0
            if (r3 == 0) goto L50
            int r5 = r3.size()     // Catch: java.lang.Throwable -> L3c
            if (r5 <= 0) goto L50
            java.lang.Object r5 = r3.get(r9)     // Catch: java.lang.Throwable -> L3c
            v.j r5 = (v.j) r5     // Catch: java.lang.Throwable -> L3c
            if (r5 == 0) goto L50
            android.content.res.Configuration r6 = r5.f10288b     // Catch: java.lang.Throwable -> L3c
            android.content.res.Configuration r7 = r0.getConfiguration()     // Catch: java.lang.Throwable -> L3c
            boolean r6 = r6.equals(r7)     // Catch: java.lang.Throwable -> L3c
            if (r6 == 0) goto L4d
            if (r8 != 0) goto L3f
            int r6 = r5.f10289c     // Catch: java.lang.Throwable -> L3c
            if (r6 == 0) goto L49
            goto L3f
        L3c:
            r8 = move-exception
            goto Lb9
        L3f:
            if (r8 == 0) goto L4d
            int r6 = r5.f10289c     // Catch: java.lang.Throwable -> L3c
            int r7 = r8.hashCode()     // Catch: java.lang.Throwable -> L3c
            if (r6 != r7) goto L4d
        L49:
            android.content.res.ColorStateList r3 = r5.f10287a     // Catch: java.lang.Throwable -> L3c
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L3c
            goto L52
        L4d:
            r3.remove(r9)     // Catch: java.lang.Throwable -> L3c
        L50:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L3c
            r3 = r4
        L52:
            if (r3 == 0) goto L55
            goto Lb8
        L55:
            java.lang.ThreadLocal r2 = v.l.f10292a
            java.lang.Object r3 = r2.get()
            android.util.TypedValue r3 = (android.util.TypedValue) r3
            if (r3 != 0) goto L67
            android.util.TypedValue r3 = new android.util.TypedValue
            r3.<init>()
            r2.set(r3)
        L67:
            r2 = 1
            r0.getValue(r9, r3, r2)
            int r2 = r3.type
            r3 = 28
            if (r2 < r3) goto L76
            r3 = 31
            if (r2 > r3) goto L76
            goto L87
        L76:
            android.content.res.XmlResourceParser r2 = r0.getXml(r9)
            android.content.res.ColorStateList r4 = v.AbstractC0906c.a(r0, r2, r8)     // Catch: java.lang.Exception -> L7f
            goto L87
        L7f:
            r2 = move-exception
            java.lang.String r3 = "ResourcesCompat"
            java.lang.String r5 = "Failed to inflate ColorStateList, leaving it to the framework"
            android.util.Log.w(r3, r5, r2)
        L87:
            if (r4 == 0) goto Lb4
            java.lang.Object r2 = v.l.f10294c
            monitor-enter(r2)
            java.util.WeakHashMap r0 = v.l.f10293b     // Catch: java.lang.Throwable -> L9f
            java.lang.Object r3 = r0.get(r1)     // Catch: java.lang.Throwable -> L9f
            android.util.SparseArray r3 = (android.util.SparseArray) r3     // Catch: java.lang.Throwable -> L9f
            if (r3 != 0) goto La1
            android.util.SparseArray r3 = new android.util.SparseArray     // Catch: java.lang.Throwable -> L9f
            r3.<init>()     // Catch: java.lang.Throwable -> L9f
            r0.put(r1, r3)     // Catch: java.lang.Throwable -> L9f
            goto La1
        L9f:
            r8 = move-exception
            goto Lb2
        La1:
            v.j r0 = new v.j     // Catch: java.lang.Throwable -> L9f
            android.content.res.Resources r1 = r1.f10290a     // Catch: java.lang.Throwable -> L9f
            android.content.res.Configuration r1 = r1.getConfiguration()     // Catch: java.lang.Throwable -> L9f
            r0.<init>(r4, r1, r8)     // Catch: java.lang.Throwable -> L9f
            r3.append(r9, r0)     // Catch: java.lang.Throwable -> L9f
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L9f
            r3 = r4
            goto Lb8
        Lb2:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L9f
            throw r8
        Lb4:
            android.content.res.ColorStateList r3 = v.i.b(r0, r9, r8)
        Lb8:
            return r3
        Lb9:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L3c
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: a.AbstractC0149a.t(android.content.Context, int):android.content.res.ColorStateList");
    }

    public static Drawable u(Context context, int i) {
        return C0603m0.b().c(context, i);
    }

    public static File w(Context context) {
        File cacheDir = context.getCacheDir();
        if (cacheDir == null) {
            return null;
        }
        String str = ".font" + Process.myPid() + "-" + Process.myTid() + "-";
        for (int i = 0; i < 100; i++) {
            File file = new File(cacheDir, str + i);
            if (file.createNewFile()) {
                return file;
            }
        }
        return null;
    }

    public static List y(Object obj) {
        List listSingletonList = Collections.singletonList(obj);
        h.d(listSingletonList, "singletonList(...)");
        return listSingletonList;
    }

    public static MappedByteBuffer z(Context context, Uri uri) {
        try {
            ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = context.getContentResolver().openFileDescriptor(uri, "r", null);
            if (parcelFileDescriptorOpenFileDescriptor == null) {
                if (parcelFileDescriptorOpenFileDescriptor != null) {
                    parcelFileDescriptorOpenFileDescriptor.close();
                }
                return null;
            }
            try {
                FileInputStream fileInputStream = new FileInputStream(parcelFileDescriptorOpenFileDescriptor.getFileDescriptor());
                try {
                    FileChannel channel = fileInputStream.getChannel();
                    MappedByteBuffer map = channel.map(FileChannel.MapMode.READ_ONLY, 0L, channel.size());
                    fileInputStream.close();
                    parcelFileDescriptorOpenFileDescriptor.close();
                    return map;
                } finally {
                }
            } finally {
            }
        } catch (IOException unused) {
            return null;
        }
    }

    public abstract void B(boolean z4);

    public abstract void C(boolean z4);

    public abstract TransformationMethod L(TransformationMethod transformationMethod);

    public abstract InputFilter[] v(InputFilter[] inputFilterArr);

    public abstract boolean x();
}

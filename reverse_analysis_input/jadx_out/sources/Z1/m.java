package Z1;

import D2.N;
import D2.f0;
import D2.g0;
import D2.r0;
import F0.C0066m;
import F0.K;
import Z1.l;
import Z1.m;
import a.AbstractC0149a;
import a0.AbstractC0156G;
import a0.C0187m;
import a0.C0189o;
import a0.C0190p;
import a0.C0200z;
import android.app.Activity;
import android.app.ActivityManager;
import android.app.ActivityOptions;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.media.AudioRouting;
import android.media.AudioTrack;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import android.view.KeyEvent;
import androidx.lifecycle.AbstractC0274p;
import androidx.lifecycle.M;
import androidx.lifecycle.P;
import androidx.lifecycle.T;
import androidx.lifecycle.U;
import androidx.lifecycle.W;
import androidx.lifecycle.Y;
import androidx.work.impl.WorkDatabase_Impl;
import c0.C0317b;
import com.google.crypto.tink.shaded.protobuf.C;
import com.google.crypto.tink.shaded.protobuf.C0335o;
import d0.AbstractC0360m;
import d0.AbstractC0370w;
import d0.C0363p;
import d0.C0368u;
import d3.ThreadFactoryC0378a;
import f0.InterfaceC0413h;
import io.flutter.embedding.android.D;
import io.flutter.embedding.android.J;
import io.flutter.embedding.android.L;
import io.flutter.embedding.engine.FlutterJNI;
import io.flutter.plugins.urllauncher.WebViewActivity;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.EOFException;
import java.io.IOException;
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.WeakHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.ReentrantLock;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import k1.C0533c;
import l1.E;
import l1.InterfaceC0568A;
import m.B0;
import m2.C0639F;
import m2.I;
import m2.b0;
import m3.C0668b;
import n3.C0698h;
import n3.C0704n;
import n3.InterfaceC0692b;
import n3.InterfaceC0694d;
import n3.InterfaceC0696f;
import n3.InterfaceC0697g;
import n3.InterfaceC0699i;
import n3.InterfaceC0705o;
import n3.w;
import n3.x;
import p.AbstractC0722a;
import p.AbstractC0723b;
import p.AbstractC0724c;
import r1.AbstractC0760a;
import s2.t;
import s2.u;
import u3.C0895a;
import u3.C0896b;
import u3.C0897c;
import u3.C0899e;
import v1.C0916f;

/* JADX INFO: loaded from: classes.dex */
public final class m implements C2.a, InterfaceC0705o, c1.d, InterfaceC0568A, InterfaceC0694d {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static m f3022p;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f3023l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public Object f3024m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public Object f3025n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public Object f3026o;

    public /* synthetic */ m(int i) {
        this.f3023l = i;
    }

    public static void E() {
        if (Build.VERSION.SDK_INT >= 29) {
            throw new UnsupportedClassVersionError("This function can only be used for API Level < 29.");
        }
    }

    public static final m F(r2.f fVar, x2.b bVar) throws GeneralSecurityException, IOException {
        byte[] bArr = new byte[0];
        ByteArrayInputStream byteArrayInputStream = (ByteArrayInputStream) fVar.f9531b;
        try {
            N nC = N.C(byteArrayInputStream, C0335o.a());
            byteArrayInputStream.close();
            if (nC.A().size() == 0) {
                throw new GeneralSecurityException("empty keyset");
            }
            try {
                g0 g0VarG = g0.G(bVar.b(nC.A().j(), bArr), C0335o.a());
                if (g0VarG.B() > 0) {
                    return s(g0VarG);
                }
                throw new GeneralSecurityException("empty keyset");
            } catch (C unused) {
                throw new GeneralSecurityException("invalid keyset, corrupted key material");
            }
        } catch (Throwable th) {
            byteArrayInputStream.close();
            throw th;
        }
    }

    public static void I(InterfaceC0696f interfaceC0696f, final m mVar) {
        C0897c c0897c = C0897c.f10256d;
        i iVar = new i(interfaceC0696f, "dev.flutter.pigeon.url_launcher_android.UrlLauncherApi.canLaunchUrl", c0897c, (C0200z) null);
        if (mVar != null) {
            final int i = 0;
            iVar.E(new InterfaceC0692b(mVar) { // from class: u3.d

                /* JADX INFO: renamed from: m, reason: collision with root package name */
                public final /* synthetic */ m f10258m;

                {
                    this.f10258m = mVar;
                }

                @Override // n3.InterfaceC0692b
                public final void t(Object obj, l lVar) {
                    Boolean bool;
                    switch (i) {
                        case 0:
                            m mVar2 = this.f10258m;
                            ArrayList arrayList = new ArrayList();
                            try {
                                arrayList.add(0, mVar2.l((String) ((ArrayList) obj).get(0)));
                                break;
                            } catch (Throwable th) {
                                arrayList = D1.b.V(th);
                            }
                            lVar.u(arrayList);
                            return;
                        case 1:
                            m mVar3 = this.f10258m;
                            ArrayList arrayList2 = new ArrayList();
                            ArrayList arrayList3 = (ArrayList) obj;
                            String str = (String) arrayList3.get(0);
                            Map map = (Map) arrayList3.get(1);
                            try {
                                if (((Activity) mVar3.f3026o) == null) {
                                    throw new C0896b();
                                }
                                try {
                                    ((Activity) mVar3.f3026o).startActivity(new Intent("android.intent.action.VIEW").setData(Uri.parse(str)).putExtra("com.android.browser.headers", m.q(map)));
                                    bool = Boolean.TRUE;
                                } catch (ActivityNotFoundException unused) {
                                    bool = Boolean.FALSE;
                                }
                                arrayList2.add(0, bool);
                            } catch (Throwable th2) {
                                arrayList2 = D1.b.V(th2);
                            }
                            lVar.u(arrayList2);
                            return;
                        case 2:
                            m mVar4 = this.f10258m;
                            ArrayList arrayList4 = new ArrayList();
                            ArrayList arrayList5 = (ArrayList) obj;
                            try {
                                arrayList4.add(0, mVar4.D((String) arrayList5.get(0), (Boolean) arrayList5.get(1), (C0899e) arrayList5.get(2), (C0895a) arrayList5.get(3)));
                                break;
                            } catch (Throwable th3) {
                                arrayList4 = D1.b.V(th3);
                            }
                            lVar.u(arrayList4);
                            return;
                        case 3:
                            m mVar5 = this.f10258m;
                            ArrayList arrayList6 = new ArrayList();
                            try {
                                arrayList6.add(0, mVar5.J());
                                break;
                            } catch (Throwable th4) {
                                arrayList6 = D1.b.V(th4);
                            }
                            lVar.u(arrayList6);
                            return;
                        default:
                            m mVar6 = this.f10258m;
                            ArrayList arrayList7 = new ArrayList();
                            try {
                                mVar6.getClass();
                                ((Context) mVar6.f3024m).sendBroadcast(new Intent("close action"));
                                arrayList7.add(0, null);
                                break;
                            } catch (Throwable th5) {
                                arrayList7 = D1.b.V(th5);
                            }
                            lVar.u(arrayList7);
                            return;
                    }
                }
            });
        } else {
            iVar.E(null);
        }
        i iVar2 = new i(interfaceC0696f, "dev.flutter.pigeon.url_launcher_android.UrlLauncherApi.launchUrl", c0897c, (C0200z) null);
        if (mVar != null) {
            final int i5 = 1;
            iVar2.E(new InterfaceC0692b(mVar) { // from class: u3.d

                /* JADX INFO: renamed from: m, reason: collision with root package name */
                public final /* synthetic */ m f10258m;

                {
                    this.f10258m = mVar;
                }

                @Override // n3.InterfaceC0692b
                public final void t(Object obj, l lVar) {
                    Boolean bool;
                    switch (i5) {
                        case 0:
                            m mVar2 = this.f10258m;
                            ArrayList arrayList = new ArrayList();
                            try {
                                arrayList.add(0, mVar2.l((String) ((ArrayList) obj).get(0)));
                                break;
                            } catch (Throwable th) {
                                arrayList = D1.b.V(th);
                            }
                            lVar.u(arrayList);
                            return;
                        case 1:
                            m mVar3 = this.f10258m;
                            ArrayList arrayList2 = new ArrayList();
                            ArrayList arrayList3 = (ArrayList) obj;
                            String str = (String) arrayList3.get(0);
                            Map map = (Map) arrayList3.get(1);
                            try {
                                if (((Activity) mVar3.f3026o) == null) {
                                    throw new C0896b();
                                }
                                try {
                                    ((Activity) mVar3.f3026o).startActivity(new Intent("android.intent.action.VIEW").setData(Uri.parse(str)).putExtra("com.android.browser.headers", m.q(map)));
                                    bool = Boolean.TRUE;
                                } catch (ActivityNotFoundException unused) {
                                    bool = Boolean.FALSE;
                                }
                                arrayList2.add(0, bool);
                            } catch (Throwable th2) {
                                arrayList2 = D1.b.V(th2);
                            }
                            lVar.u(arrayList2);
                            return;
                        case 2:
                            m mVar4 = this.f10258m;
                            ArrayList arrayList4 = new ArrayList();
                            ArrayList arrayList5 = (ArrayList) obj;
                            try {
                                arrayList4.add(0, mVar4.D((String) arrayList5.get(0), (Boolean) arrayList5.get(1), (C0899e) arrayList5.get(2), (C0895a) arrayList5.get(3)));
                                break;
                            } catch (Throwable th3) {
                                arrayList4 = D1.b.V(th3);
                            }
                            lVar.u(arrayList4);
                            return;
                        case 3:
                            m mVar5 = this.f10258m;
                            ArrayList arrayList6 = new ArrayList();
                            try {
                                arrayList6.add(0, mVar5.J());
                                break;
                            } catch (Throwable th4) {
                                arrayList6 = D1.b.V(th4);
                            }
                            lVar.u(arrayList6);
                            return;
                        default:
                            m mVar6 = this.f10258m;
                            ArrayList arrayList7 = new ArrayList();
                            try {
                                mVar6.getClass();
                                ((Context) mVar6.f3024m).sendBroadcast(new Intent("close action"));
                                arrayList7.add(0, null);
                                break;
                            } catch (Throwable th5) {
                                arrayList7 = D1.b.V(th5);
                            }
                            lVar.u(arrayList7);
                            return;
                    }
                }
            });
        } else {
            iVar2.E(null);
        }
        i iVar3 = new i(interfaceC0696f, "dev.flutter.pigeon.url_launcher_android.UrlLauncherApi.openUrlInApp", c0897c, (C0200z) null);
        if (mVar != null) {
            final int i6 = 2;
            iVar3.E(new InterfaceC0692b(mVar) { // from class: u3.d

                /* JADX INFO: renamed from: m, reason: collision with root package name */
                public final /* synthetic */ m f10258m;

                {
                    this.f10258m = mVar;
                }

                @Override // n3.InterfaceC0692b
                public final void t(Object obj, l lVar) {
                    Boolean bool;
                    switch (i6) {
                        case 0:
                            m mVar2 = this.f10258m;
                            ArrayList arrayList = new ArrayList();
                            try {
                                arrayList.add(0, mVar2.l((String) ((ArrayList) obj).get(0)));
                                break;
                            } catch (Throwable th) {
                                arrayList = D1.b.V(th);
                            }
                            lVar.u(arrayList);
                            return;
                        case 1:
                            m mVar3 = this.f10258m;
                            ArrayList arrayList2 = new ArrayList();
                            ArrayList arrayList3 = (ArrayList) obj;
                            String str = (String) arrayList3.get(0);
                            Map map = (Map) arrayList3.get(1);
                            try {
                                if (((Activity) mVar3.f3026o) == null) {
                                    throw new C0896b();
                                }
                                try {
                                    ((Activity) mVar3.f3026o).startActivity(new Intent("android.intent.action.VIEW").setData(Uri.parse(str)).putExtra("com.android.browser.headers", m.q(map)));
                                    bool = Boolean.TRUE;
                                } catch (ActivityNotFoundException unused) {
                                    bool = Boolean.FALSE;
                                }
                                arrayList2.add(0, bool);
                            } catch (Throwable th2) {
                                arrayList2 = D1.b.V(th2);
                            }
                            lVar.u(arrayList2);
                            return;
                        case 2:
                            m mVar4 = this.f10258m;
                            ArrayList arrayList4 = new ArrayList();
                            ArrayList arrayList5 = (ArrayList) obj;
                            try {
                                arrayList4.add(0, mVar4.D((String) arrayList5.get(0), (Boolean) arrayList5.get(1), (C0899e) arrayList5.get(2), (C0895a) arrayList5.get(3)));
                                break;
                            } catch (Throwable th3) {
                                arrayList4 = D1.b.V(th3);
                            }
                            lVar.u(arrayList4);
                            return;
                        case 3:
                            m mVar5 = this.f10258m;
                            ArrayList arrayList6 = new ArrayList();
                            try {
                                arrayList6.add(0, mVar5.J());
                                break;
                            } catch (Throwable th4) {
                                arrayList6 = D1.b.V(th4);
                            }
                            lVar.u(arrayList6);
                            return;
                        default:
                            m mVar6 = this.f10258m;
                            ArrayList arrayList7 = new ArrayList();
                            try {
                                mVar6.getClass();
                                ((Context) mVar6.f3024m).sendBroadcast(new Intent("close action"));
                                arrayList7.add(0, null);
                                break;
                            } catch (Throwable th5) {
                                arrayList7 = D1.b.V(th5);
                            }
                            lVar.u(arrayList7);
                            return;
                    }
                }
            });
        } else {
            iVar3.E(null);
        }
        i iVar4 = new i(interfaceC0696f, "dev.flutter.pigeon.url_launcher_android.UrlLauncherApi.supportsCustomTabs", c0897c, (C0200z) null);
        if (mVar != null) {
            final int i7 = 3;
            iVar4.E(new InterfaceC0692b(mVar) { // from class: u3.d

                /* JADX INFO: renamed from: m, reason: collision with root package name */
                public final /* synthetic */ m f10258m;

                {
                    this.f10258m = mVar;
                }

                @Override // n3.InterfaceC0692b
                public final void t(Object obj, l lVar) {
                    Boolean bool;
                    switch (i7) {
                        case 0:
                            m mVar2 = this.f10258m;
                            ArrayList arrayList = new ArrayList();
                            try {
                                arrayList.add(0, mVar2.l((String) ((ArrayList) obj).get(0)));
                                break;
                            } catch (Throwable th) {
                                arrayList = D1.b.V(th);
                            }
                            lVar.u(arrayList);
                            return;
                        case 1:
                            m mVar3 = this.f10258m;
                            ArrayList arrayList2 = new ArrayList();
                            ArrayList arrayList3 = (ArrayList) obj;
                            String str = (String) arrayList3.get(0);
                            Map map = (Map) arrayList3.get(1);
                            try {
                                if (((Activity) mVar3.f3026o) == null) {
                                    throw new C0896b();
                                }
                                try {
                                    ((Activity) mVar3.f3026o).startActivity(new Intent("android.intent.action.VIEW").setData(Uri.parse(str)).putExtra("com.android.browser.headers", m.q(map)));
                                    bool = Boolean.TRUE;
                                } catch (ActivityNotFoundException unused) {
                                    bool = Boolean.FALSE;
                                }
                                arrayList2.add(0, bool);
                            } catch (Throwable th2) {
                                arrayList2 = D1.b.V(th2);
                            }
                            lVar.u(arrayList2);
                            return;
                        case 2:
                            m mVar4 = this.f10258m;
                            ArrayList arrayList4 = new ArrayList();
                            ArrayList arrayList5 = (ArrayList) obj;
                            try {
                                arrayList4.add(0, mVar4.D((String) arrayList5.get(0), (Boolean) arrayList5.get(1), (C0899e) arrayList5.get(2), (C0895a) arrayList5.get(3)));
                                break;
                            } catch (Throwable th3) {
                                arrayList4 = D1.b.V(th3);
                            }
                            lVar.u(arrayList4);
                            return;
                        case 3:
                            m mVar5 = this.f10258m;
                            ArrayList arrayList6 = new ArrayList();
                            try {
                                arrayList6.add(0, mVar5.J());
                                break;
                            } catch (Throwable th4) {
                                arrayList6 = D1.b.V(th4);
                            }
                            lVar.u(arrayList6);
                            return;
                        default:
                            m mVar6 = this.f10258m;
                            ArrayList arrayList7 = new ArrayList();
                            try {
                                mVar6.getClass();
                                ((Context) mVar6.f3024m).sendBroadcast(new Intent("close action"));
                                arrayList7.add(0, null);
                                break;
                            } catch (Throwable th5) {
                                arrayList7 = D1.b.V(th5);
                            }
                            lVar.u(arrayList7);
                            return;
                    }
                }
            });
        } else {
            iVar4.E(null);
        }
        i iVar5 = new i(interfaceC0696f, "dev.flutter.pigeon.url_launcher_android.UrlLauncherApi.closeWebView", c0897c, (C0200z) null);
        if (mVar == null) {
            iVar5.E(null);
        } else {
            final int i8 = 4;
            iVar5.E(new InterfaceC0692b(mVar) { // from class: u3.d

                /* JADX INFO: renamed from: m, reason: collision with root package name */
                public final /* synthetic */ m f10258m;

                {
                    this.f10258m = mVar;
                }

                @Override // n3.InterfaceC0692b
                public final void t(Object obj, l lVar) {
                    Boolean bool;
                    switch (i8) {
                        case 0:
                            m mVar2 = this.f10258m;
                            ArrayList arrayList = new ArrayList();
                            try {
                                arrayList.add(0, mVar2.l((String) ((ArrayList) obj).get(0)));
                                break;
                            } catch (Throwable th) {
                                arrayList = D1.b.V(th);
                            }
                            lVar.u(arrayList);
                            return;
                        case 1:
                            m mVar3 = this.f10258m;
                            ArrayList arrayList2 = new ArrayList();
                            ArrayList arrayList3 = (ArrayList) obj;
                            String str = (String) arrayList3.get(0);
                            Map map = (Map) arrayList3.get(1);
                            try {
                                if (((Activity) mVar3.f3026o) == null) {
                                    throw new C0896b();
                                }
                                try {
                                    ((Activity) mVar3.f3026o).startActivity(new Intent("android.intent.action.VIEW").setData(Uri.parse(str)).putExtra("com.android.browser.headers", m.q(map)));
                                    bool = Boolean.TRUE;
                                } catch (ActivityNotFoundException unused) {
                                    bool = Boolean.FALSE;
                                }
                                arrayList2.add(0, bool);
                            } catch (Throwable th2) {
                                arrayList2 = D1.b.V(th2);
                            }
                            lVar.u(arrayList2);
                            return;
                        case 2:
                            m mVar4 = this.f10258m;
                            ArrayList arrayList4 = new ArrayList();
                            ArrayList arrayList5 = (ArrayList) obj;
                            try {
                                arrayList4.add(0, mVar4.D((String) arrayList5.get(0), (Boolean) arrayList5.get(1), (C0899e) arrayList5.get(2), (C0895a) arrayList5.get(3)));
                                break;
                            } catch (Throwable th3) {
                                arrayList4 = D1.b.V(th3);
                            }
                            lVar.u(arrayList4);
                            return;
                        case 3:
                            m mVar5 = this.f10258m;
                            ArrayList arrayList6 = new ArrayList();
                            try {
                                arrayList6.add(0, mVar5.J());
                                break;
                            } catch (Throwable th4) {
                                arrayList6 = D1.b.V(th4);
                            }
                            lVar.u(arrayList6);
                            return;
                        default:
                            m mVar6 = this.f10258m;
                            ArrayList arrayList7 = new ArrayList();
                            try {
                                mVar6.getClass();
                                ((Context) mVar6.f3024m).sendBroadcast(new Intent("close action"));
                                arrayList7.add(0, null);
                                break;
                            } catch (Throwable th5) {
                                arrayList7 = D1.b.V(th5);
                            }
                            lVar.u(arrayList7);
                            return;
                    }
                }
            });
        }
    }

    public static Bundle q(Map map) {
        Bundle bundle = new Bundle();
        for (String str : map.keySet()) {
            bundle.putString(str, (String) map.get(str));
        }
        return bundle;
    }

    public static final m s(g0 g0Var) throws GeneralSecurityException {
        if (g0Var.B() <= 0) {
            throw new GeneralSecurityException("empty keyset");
        }
        ArrayList arrayList = new ArrayList(g0Var.B());
        for (f0 f0Var : g0Var.C()) {
            f0Var.getClass();
            try {
                try {
                    r2.b bVarA = y2.h.f10944b.a(y2.n.d(f0Var.C().D(), f0Var.C().E(), f0Var.C().C(), f0Var.E(), f0Var.E() == r0.f580p ? null : Integer.valueOf(f0Var.D())));
                    int iOrdinal = f0Var.F().ordinal();
                    if (iOrdinal != 1 && iOrdinal != 2 && iOrdinal != 3) {
                        throw new GeneralSecurityException("Unknown key status");
                    }
                    arrayList.add(new r2.h(bVarA));
                } catch (GeneralSecurityException unused) {
                    arrayList.add(null);
                }
            } catch (GeneralSecurityException e5) {
                throw new A1.c("Creating a protokey serialization failed", e5);
            }
        }
        return new m(g0Var, Collections.unmodifiableList(arrayList));
    }

    public static m z() {
        if (f3022p == null) {
            C0200z c0200z = new C0200z(10);
            ThreadFactoryC0378a threadFactoryC0378a = new ThreadFactoryC0378a();
            threadFactoryC0378a.f5427a = 0;
            ExecutorService executorServiceNewCachedThreadPool = Executors.newCachedThreadPool(threadFactoryC0378a);
            h3.f fVar = new h3.f(new FlutterJNI(), executorServiceNewCachedThreadPool);
            m mVar = new m(5);
            mVar.f3024m = fVar;
            mVar.f3025n = c0200z;
            mVar.f3026o = executorServiceNewCachedThreadPool;
            f3022p = mVar;
        }
        return f3022p;
    }

    public String A() {
        if (!x()) {
            throw new NoSuchElementException();
        }
        String str = (String) this.f3026o;
        this.f3026o = null;
        return str;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0090  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void B(android.view.KeyEvent r9) {
        /*
            Method dump skipped, instruction units count: 235
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Z1.m.B(android.view.KeyEvent):void");
    }

    public void C(Activity activity, K1.l lVar) {
        N3.h.e(activity, "activity");
        ReentrantLock reentrantLock = (ReentrantLock) this.f3025n;
        reentrantLock.lock();
        WeakHashMap weakHashMap = (WeakHashMap) this.f3026o;
        try {
            if (lVar.equals((K1.l) weakHashMap.get(activity))) {
                return;
            }
            reentrantLock.unlock();
            for (N1.k kVar : ((N1.l) ((B0.d) this.f3024m).f190l).f1600b) {
                if (kVar.f1594a.equals(activity)) {
                    kVar.f1596c = lVar;
                    kVar.f1595b.accept(lVar);
                }
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    public Boolean D(String str, Boolean bool, C0899e c0899e, C0895a c0895a) {
        ActivityOptions activityOptionsA;
        if (((Activity) this.f3026o) == null) {
            throw new C0896b();
        }
        Bundle bundleQ = q(c0899e.f10261c);
        if (bool.booleanValue()) {
            Iterator it = c0899e.f10261c.keySet().iterator();
            while (true) {
                if (it.hasNext()) {
                    String lowerCase = ((String) it.next()).toLowerCase(Locale.US);
                    lowerCase.getClass();
                    switch (lowerCase) {
                    }
                } else {
                    Uri uri = Uri.parse(str);
                    Activity activity = (Activity) this.f3026o;
                    Intent intent = new Intent("android.intent.action.VIEW");
                    intent.putExtra("android.support.customtabs.extra.TITLE_VISIBILITY", c0895a.f10254a.booleanValue() ? 1 : 0);
                    if (!intent.hasExtra("android.support.customtabs.extra.SESSION")) {
                        Bundle bundle = new Bundle();
                        bundle.putBinder("android.support.customtabs.extra.SESSION", null);
                        intent.putExtras(bundle);
                    }
                    intent.putExtra("android.support.customtabs.extra.EXTRA_ENABLE_INSTANT_APPS", true);
                    intent.putExtras(new Bundle());
                    intent.putExtra("androidx.browser.customtabs.extra.SHARE_STATE", 0);
                    int i = Build.VERSION.SDK_INT;
                    String strA = AbstractC0723b.a();
                    if (!TextUtils.isEmpty(strA)) {
                        Bundle bundleExtra = intent.hasExtra("com.android.browser.headers") ? intent.getBundleExtra("com.android.browser.headers") : new Bundle();
                        if (!bundleExtra.containsKey("Accept-Language")) {
                            bundleExtra.putString("Accept-Language", strA);
                            intent.putExtra("com.android.browser.headers", bundleExtra);
                        }
                    }
                    if (i >= 34) {
                        activityOptionsA = AbstractC0722a.a();
                        AbstractC0724c.a(activityOptionsA, false);
                    } else {
                        activityOptionsA = null;
                    }
                    Bundle bundle2 = activityOptionsA != null ? activityOptionsA.toBundle() : null;
                    intent.putExtra("com.android.browser.headers", bundleQ);
                    try {
                        intent.setData(uri);
                        activity.startActivity(intent, bundle2);
                        return Boolean.TRUE;
                    } catch (ActivityNotFoundException unused) {
                    }
                }
            }
        }
        Activity activity2 = (Activity) this.f3026o;
        boolean zBooleanValue = c0899e.f10259a.booleanValue();
        boolean zBooleanValue2 = c0899e.f10260b.booleanValue();
        int i5 = WebViewActivity.f6838p;
        try {
            ((Activity) this.f3026o).startActivity(new Intent(activity2, (Class<?>) WebViewActivity.class).putExtra("url", str).putExtra("enableJavaScript", zBooleanValue).putExtra("enableDomStorage", zBooleanValue2).putExtra("com.android.browser.headers", bundleQ));
            return Boolean.TRUE;
        } catch (ActivityNotFoundException unused2) {
            return Boolean.FALSE;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0034, code lost:
    
        r4 = r3.f26l;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0037, code lost:
    
        if (r4 >= r6.length) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0039, code lost:
    
        r6[r4] = r2;
        r3.f26l = r4 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x003f, code lost:
    
        r1 = r1 + 1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void G(java.util.ArrayList r8) {
        /*
            r7 = this;
            int r0 = r8.size()
            r1 = 0
        L5:
            if (r1 >= r0) goto L42
            java.lang.Object r2 = r8.get(r1)
            r1.a r2 = (r1.AbstractC0760a) r2
            r2.getClass()
            java.lang.Object r3 = r7.f3024m
            A.j r3 = (A.j) r3
            r3.getClass()
            java.lang.String r4 = "instance"
            N3.h.e(r2, r4)
            int r4 = r3.f26l
            r5 = 0
        L1f:
            java.lang.Object r6 = r3.f27m
            java.lang.Object[] r6 = (java.lang.Object[]) r6
            if (r5 >= r4) goto L34
            r6 = r6[r5]
            if (r6 == r2) goto L2c
            int r5 = r5 + 1
            goto L1f
        L2c:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "Already in the pool!"
            r8.<init>(r0)
            throw r8
        L34:
            int r4 = r3.f26l
            int r5 = r6.length
            if (r4 >= r5) goto L3f
            r6[r4] = r2
            int r4 = r4 + 1
            r3.f26l = r4
        L3f:
            int r1 = r1 + 1
            goto L5
        L42:
            r8.clear()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: Z1.m.G(java.util.ArrayList):void");
    }

    public void H(int i) throws InvalidAlgorithmParameterException {
        if (i != 16 && i != 32) {
            throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 128-bit and 256-bit AES keys are supported", Integer.valueOf(i * 8)));
        }
        this.f3024m = Integer.valueOf(i);
    }

    public Boolean J() {
        String str;
        List listEmptyList = Collections.emptyList();
        PackageManager packageManager = ((Context) this.f3024m).getPackageManager();
        List arrayList = listEmptyList == null ? new ArrayList() : listEmptyList;
        ResolveInfo resolveInfoResolveActivity = packageManager.resolveActivity(new Intent("android.intent.action.VIEW", Uri.parse("http://")), 0);
        if (resolveInfoResolveActivity != null) {
            String str2 = resolveInfoResolveActivity.activityInfo.packageName;
            ArrayList arrayList2 = new ArrayList(arrayList.size() + 1);
            arrayList2.add(str2);
            if (listEmptyList != null) {
                arrayList2.addAll(listEmptyList);
            }
            arrayList = arrayList2;
        }
        Intent intent = new Intent("android.support.customtabs.action.CustomTabsService");
        Iterator it = arrayList.iterator();
        while (true) {
            if (it.hasNext()) {
                str = (String) it.next();
                intent.setPackage(str);
                if (packageManager.resolveService(intent, 0) != null) {
                    break;
                }
            } else {
                if (Build.VERSION.SDK_INT >= 30) {
                    Log.w("CustomTabsClient", "Unable to find any Custom Tabs packages, you may need to add a <queries> element to your manifest. See the docs for CustomTabsClient#getPackageName.");
                }
                str = null;
            }
        }
        return Boolean.valueOf(str != null);
    }

    @Override // c1.d
    public int a(long j5) {
        long[] jArr = (long[]) this.f3026o;
        int iA = AbstractC0370w.a(jArr, j5, false);
        if (iA < jArr.length) {
            return iA;
        }
        return -1;
    }

    @Override // l1.InterfaceC0568A
    public void b(C0363p c0363p) {
        long jD;
        long j5;
        AbstractC0360m.i((C0368u) this.f3025n);
        int i = AbstractC0370w.f5326a;
        C0368u c0368u = (C0368u) this.f3025n;
        synchronized (c0368u) {
            try {
                long j6 = c0368u.f5324c;
                jD = j6 != -9223372036854775807L ? j6 + c0368u.f5323b : c0368u.d();
            } finally {
            }
        }
        C0368u c0368u2 = (C0368u) this.f3025n;
        synchronized (c0368u2) {
            j5 = c0368u2.f5323b;
        }
        if (jD == -9223372036854775807L || j5 == -9223372036854775807L) {
            return;
        }
        C0190p c0190p = (C0190p) this.f3024m;
        if (j5 != c0190p.f3429s) {
            C0189o c0189oA = c0190p.a();
            c0189oA.f3392r = j5;
            C0190p c0190p2 = new C0190p(c0189oA);
            this.f3024m = c0190p2;
            ((K) this.f3026o).c(c0190p2);
        }
        int iA = c0363p.a();
        ((K) this.f3026o).a(c0363p, iA, 0);
        ((K) this.f3026o).b(jD, 1, iA, 0, null);
    }

    @Override // l1.InterfaceC0568A
    public void c(C0368u c0368u, F0.s sVar, E e5) {
        this.f3025n = c0368u;
        e5.a();
        e5.c();
        K k4 = sVar.k(e5.f7919c, 5);
        this.f3026o = k4;
        k4.c((C0190p) this.f3024m);
    }

    @Override // c1.d
    public List d(long j5) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int i = 0;
        while (true) {
            List list = (List) this.f3024m;
            if (i >= list.size()) {
                break;
            }
            int i5 = i * 2;
            long[] jArr = (long[]) this.f3025n;
            if (jArr[i5] <= j5 && j5 < jArr[i5 + 1]) {
                C0533c c0533c = (C0533c) list.get(i);
                C0317b c0317b = c0533c.f7660a;
                if (c0317b.f4997e == -3.4028235E38f) {
                    arrayList2.add(c0533c);
                } else {
                    arrayList.add(c0317b);
                }
            }
            i++;
        }
        Collections.sort(arrayList2, new A.c(14));
        for (int i6 = 0; i6 < arrayList2.size(); i6++) {
            C0317b c0317b2 = ((C0533c) arrayList2.get(i6)).f7660a;
            arrayList.add(new C0317b(c0317b2.f4993a, c0317b2.f4994b, c0317b2.f4995c, c0317b2.f4996d, (-1) - i6, 1, c0317b2.f4999g, c0317b2.f5000h, c0317b2.i, c0317b2.f5005n, c0317b2.f5006o, c0317b2.f5001j, c0317b2.f5002k, c0317b2.f5003l, c0317b2.f5004m, c0317b2.f5007p, c0317b2.f5008q));
        }
        return arrayList;
    }

    @Override // n3.InterfaceC0694d
    public void e(ByteBuffer byteBuffer, f3.g gVar) {
        s sVar = (s) this.f3026o;
        C0704n c0704nB = ((x) sVar.f3087o).b(byteBuffer);
        String str = c0704nB.f8938a;
        boolean zEquals = str.equals("listen");
        AtomicReference atomicReference = (AtomicReference) this.f3025n;
        String str2 = (String) sVar.f3086n;
        x xVar = (x) sVar.f3087o;
        InterfaceC0699i interfaceC0699i = (InterfaceC0699i) this.f3024m;
        Object obj = c0704nB.f8939b;
        if (!zEquals) {
            if (!str.equals("cancel")) {
                gVar.a(null);
                return;
            }
            if (((InterfaceC0697g) atomicReference.getAndSet(null)) == null) {
                gVar.a(xVar.f("error", "No active stream to cancel", null));
                return;
            }
            try {
                interfaceC0699i.onCancel(obj);
                gVar.a(xVar.a(null));
                return;
            } catch (RuntimeException e5) {
                Log.e("EventChannel#" + str2, "Failed to close event stream", e5);
                gVar.a(xVar.f("error", e5.getMessage(), null));
                return;
            }
        }
        C0698h c0698h = new C0698h(this);
        if (((InterfaceC0697g) atomicReference.getAndSet(c0698h)) != null) {
            try {
                interfaceC0699i.onCancel(null);
            } catch (RuntimeException e6) {
                Log.e("EventChannel#" + str2, "Failed to close existing event stream", e6);
            }
        }
        try {
            interfaceC0699i.onListen(obj, c0698h);
            gVar.a(xVar.a(null));
        } catch (RuntimeException e7) {
            atomicReference.set(null);
            Log.e("EventChannel#" + str2, "Failed to open event stream", e7);
            gVar.a(xVar.f("error", e7.getMessage(), null));
        }
    }

    @Override // C2.a
    public byte[] f(int i, byte[] bArr) throws GeneralSecurityException {
        byte[] bArrO;
        if (i > 16) {
            throw new InvalidAlgorithmParameterException("outputLength too large, max is 16 bytes");
        }
        if (!B0.e(1)) {
            throw new GeneralSecurityException("Can not use AES-CMAC in FIPS-mode.");
        }
        Cipher cipher = (Cipher) E2.j.f663b.f665a.a("AES/ECB/NoPadding");
        cipher.init(1, (SecretKeySpec) this.f3024m);
        int iMax = Math.max(1, (int) Math.ceil(((double) bArr.length) / 16.0d));
        if (iMax * 16 == bArr.length) {
            bArrO = AbstractC0149a.N((iMax - 1) * 16, 0, 16, bArr, (byte[]) this.f3025n);
        } else {
            byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, (iMax - 1) * 16, bArr.length);
            if (bArrCopyOfRange.length >= 16) {
                throw new IllegalArgumentException("x must be smaller than a block.");
            }
            byte[] bArrCopyOf = Arrays.copyOf(bArrCopyOfRange, 16);
            bArrCopyOf[bArrCopyOfRange.length] = -128;
            bArrO = AbstractC0149a.O(bArrCopyOf, (byte[]) this.f3026o);
        }
        byte[] bArrDoFinal = new byte[16];
        for (int i5 = 0; i5 < iMax - 1; i5++) {
            bArrDoFinal = cipher.doFinal(AbstractC0149a.N(0, i5 * 16, 16, bArrDoFinal, bArr));
        }
        return Arrays.copyOf(cipher.doFinal(AbstractC0149a.O(bArrO, bArrDoFinal)), i);
    }

    @Override // c1.d
    public long g(int i) {
        AbstractC0360m.c(i >= 0);
        long[] jArr = (long[]) this.f3026o;
        AbstractC0360m.c(i < jArr.length);
        return jArr[i];
    }

    @Override // c1.d
    public int h() {
        return ((long[]) this.f3026o).length;
    }

    public s2.n i() throws GeneralSecurityException {
        B0.d dVar;
        s2.o oVar = (s2.o) this.f3024m;
        if (oVar == null || (dVar = (B0.d) this.f3025n) == null) {
            throw new GeneralSecurityException("Cannot build without parameters and/or key material");
        }
        if (oVar.f9658b != ((F2.a) dVar.f190l).f860a.length) {
            throw new GeneralSecurityException("Key size mismatch");
        }
        s2.j jVar = s2.j.f9634m;
        s2.j jVar2 = oVar.f9661e;
        if (jVar2 != jVar && ((Integer) this.f3026o) == null) {
            throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
        }
        if (jVar2 == jVar && ((Integer) this.f3026o) != null) {
            throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
        }
        if (jVar2 == jVar) {
            F2.a.a(new byte[0]);
        } else if (jVar2 == s2.j.f9633l) {
            F2.a.a(ByteBuffer.allocate(5).put((byte) 0).putInt(((Integer) this.f3026o).intValue()).array());
        } else {
            if (jVar2 != s2.j.f9632k) {
                throw new IllegalStateException("Unknown AesEaxParameters.Variant: " + ((s2.o) this.f3024m).f9661e);
            }
            F2.a.a(ByteBuffer.allocate(5).put((byte) 1).putInt(((Integer) this.f3026o).intValue()).array());
        }
        return new s2.n();
    }

    public t j() throws GeneralSecurityException {
        B0.d dVar;
        u uVar = (u) this.f3024m;
        if (uVar == null || (dVar = (B0.d) this.f3025n) == null) {
            throw new GeneralSecurityException("Cannot build without parameters and/or key material");
        }
        if (uVar.f9674b != ((F2.a) dVar.f190l).f860a.length) {
            throw new GeneralSecurityException("Key size mismatch");
        }
        s2.j jVar = s2.j.f9640s;
        s2.j jVar2 = uVar.f9675c;
        if (jVar2 != jVar && ((Integer) this.f3026o) == null) {
            throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
        }
        if (jVar2 == jVar && ((Integer) this.f3026o) != null) {
            throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
        }
        if (jVar2 == jVar) {
            F2.a.a(new byte[0]);
        } else if (jVar2 == s2.j.f9639r) {
            F2.a.a(ByteBuffer.allocate(5).put((byte) 0).putInt(((Integer) this.f3026o).intValue()).array());
        } else {
            if (jVar2 != s2.j.f9638q) {
                throw new IllegalStateException("Unknown AesGcmSivParameters.Variant: " + ((u) this.f3024m).f9675c);
            }
            F2.a.a(ByteBuffer.allocate(5).put((byte) 1).putInt(((Integer) this.f3026o).intValue()).array());
        }
        return new t();
    }

    public z2.e k() throws GeneralSecurityException {
        Integer num = (Integer) this.f3024m;
        if (num == null) {
            throw new GeneralSecurityException("key size not set");
        }
        if (((Integer) this.f3025n) == null) {
            throw new GeneralSecurityException("tag size not set");
        }
        if (((z2.d) this.f3026o) != null) {
            return new z2.e(num.intValue(), ((Integer) this.f3025n).intValue(), (z2.d) this.f3026o);
        }
        throw new GeneralSecurityException("variant not set");
    }

    public Boolean l(String str) {
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(Uri.parse(str));
        ComponentName componentNameResolveActivity = intent.resolveActivity(((R1.m) this.f3025n).f1903l.getPackageManager());
        return (componentNameResolveActivity == null ? null : componentNameResolveActivity.toShortString()) == null ? Boolean.FALSE : Boolean.valueOf(!"{com.android.fallback/com.android.fallback.Fallback}".equals(r3));
    }

    public void m(Activity activity) {
        ReentrantLock reentrantLock = (ReentrantLock) this.f3025n;
        reentrantLock.lock();
        try {
            ((WeakHashMap) this.f3026o).put(activity, null);
        } finally {
            reentrantLock.unlock();
        }
    }

    public void n(String str) {
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f3024m;
        workDatabase_Impl.b();
        h hVar = (h) this.f3025n;
        y1.h hVarA = hVar.a();
        if (str == null) {
            hVarA.g(1);
        } else {
            hVarA.h(str, 1);
        }
        workDatabase_Impl.c();
        try {
            hVarA.a();
            workDatabase_Impl.o();
        } finally {
            workDatabase_Impl.k();
            hVar.j(hVarA);
        }
    }

    public void o(int i, io.flutter.view.d dVar) {
        ((FlutterJNI) this.f3025n).dispatchSemanticsAction(i, dVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0153  */
    @Override // n3.InterfaceC0705o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onMethodCall(n3.C0704n r12, n3.InterfaceC0706p r13) {
        /*
            Method dump skipped, instruction units count: 607
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Z1.m.onMethodCall(n3.n, n3.p):void");
    }

    public void p(int i, io.flutter.view.d dVar, Serializable serializable) {
        ((FlutterJNI) this.f3025n).dispatchSemanticsAction(i, dVar, serializable);
    }

    public int r(int i, int i5) {
        ArrayList arrayList = (ArrayList) this.f3026o;
        int size = arrayList.size();
        while (i5 < size) {
            ((AbstractC0760a) arrayList.get(i5)).getClass();
            i5++;
        }
        return i;
    }

    public T t(Class cls, String str) {
        T tC;
        N3.h.e(str, "key");
        Y y = (Y) this.f3024m;
        y.getClass();
        LinkedHashMap linkedHashMap = y.f4521a;
        T t4 = (T) linkedHashMap.get(str);
        boolean zIsInstance = cls.isInstance(t4);
        W w4 = (W) this.f3025n;
        if (!zIsInstance) {
            W.c cVar = new W.c((W.b) this.f3026o);
            cVar.f2458a.put(U.f4517b, str);
            try {
                tC = w4.i(cls, cVar);
            } catch (AbstractMethodError unused) {
                tC = w4.c(cls);
            }
            N3.h.e(tC, "viewModel");
            T t5 = (T) linkedHashMap.put(str, tC);
            if (t5 != null) {
                t5.b();
            }
            return tC;
        }
        P p4 = w4 instanceof P ? (P) w4 : null;
        if (p4 != null) {
            N3.h.b(t4);
            AbstractC0274p abstractC0274p = p4.f4506o;
            if (abstractC0274p != null) {
                C0916f c0916f = p4.f4507p;
                N3.h.b(c0916f);
                M.a(t4, c0916f, abstractC0274p);
            }
        }
        N3.h.c(t4, "null cannot be cast to non-null type T of androidx.lifecycle.ViewModelProvider.get");
        return t4;
    }

    public String toString() {
        switch (this.f3023l) {
            case 15:
                return r2.p.a((g0) this.f3024m).toString();
            default:
                return super.toString();
        }
    }

    public long u() {
        C0066m c0066m = (C0066m) this.f3026o;
        if (c0066m != null) {
            return c0066m.f799o;
        }
        return -1L;
    }

    /* JADX WARN: Removed duplicated region for block: B:72:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x016d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object v(java.lang.Class r15) throws java.security.GeneralSecurityException {
        /*
            Method dump skipped, instruction units count: 511
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Z1.m.v(java.lang.Class):java.lang.Object");
    }

    public boolean w(KeyEvent keyEvent) {
        if (((HashSet) this.f3025n).remove(keyEvent)) {
            return false;
        }
        L[] lArr = (L[]) this.f3024m;
        if (lArr.length <= 0) {
            B(keyEvent);
            return true;
        }
        io.flutter.embedding.android.K k4 = new io.flutter.embedding.android.K(this, keyEvent);
        for (L l3 : lArr) {
            C0187m c0187m = new C0187m();
            c0187m.f3363b = k4;
            c0187m.f3362a = false;
            l3.r(keyEvent, c0187m);
        }
        return true;
    }

    public boolean x() throws IOException {
        String strTrim;
        if (((String) this.f3026o) != null) {
            return true;
        }
        ArrayDeque arrayDeque = (ArrayDeque) this.f3025n;
        if (!arrayDeque.isEmpty()) {
            String str = (String) arrayDeque.poll();
            str.getClass();
            this.f3026o = str;
            return true;
        }
        do {
            String line = ((BufferedReader) this.f3024m).readLine();
            this.f3026o = line;
            if (line == null) {
                return false;
            }
            strTrim = line.trim();
            this.f3026o = strTrim;
        } while (strTrim.isEmpty());
        return true;
    }

    public void y(InterfaceC0413h interfaceC0413h, Uri uri, Map map, long j5, long j6, x0.Y y) throws L0.d {
        boolean z4;
        C0066m c0066m = new C0066m(interfaceC0413h, j5, j6);
        this.f3026o = c0066m;
        if (((F0.q) this.f3025n) != null) {
            return;
        }
        F0.q[] qVarArrA = ((F0.t) this.f3024m).a(uri, map);
        C0639F c0639fO = I.o(qVarArrA.length);
        boolean z5 = true;
        if (qVarArrA.length == 1) {
            this.f3025n = qVarArrA[0];
        } else {
            int length = qVarArrA.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                }
                F0.q qVar = qVarArrA[i];
                try {
                    if (qVar.e(c0066m)) {
                        this.f3025n = qVar;
                        c0066m.f801q = 0;
                        break;
                    } else {
                        c0639fO.d(qVar.k());
                        z4 = ((F0.q) this.f3025n) != null || c0066m.f799o == j5;
                    }
                } catch (EOFException unused) {
                    z4 = ((F0.q) this.f3025n) != null || c0066m.f799o == j5;
                } catch (Throwable th) {
                    if (((F0.q) this.f3025n) == null && c0066m.f799o != j5) {
                        z5 = false;
                    }
                    AbstractC0360m.h(z5);
                    c0066m.f801q = 0;
                    throw th;
                }
                AbstractC0360m.h(z4);
                c0066m.f801q = 0;
                i++;
            }
            if (((F0.q) this.f3025n) == null) {
                String str = "None of the available extractors (" + new F0.p(", ", 2).d(m2.r.w(I.q(qVarArrA), new s2.l(8))) + ") could read the stream.";
                uri.getClass();
                b0 b0VarG = c0639fO.g();
                L0.d dVar = new L0.d(str, null, false, 1);
                I.p(b0VarG);
                throw dVar;
            }
        }
        ((F0.q) this.f3025n).j(y);
    }

    public m(PackageManager packageManager, ActivityManager activityManager, ContentResolver contentResolver) {
        this.f3023l = 3;
        this.f3024m = packageManager;
        this.f3025n = activityManager;
        this.f3026o = contentResolver;
    }

    public m(WorkDatabase_Impl workDatabase_Impl) {
        this.f3023l = 0;
        this.f3024m = workDatabase_Impl;
        new b(workDatabase_Impl, 4);
        this.f3025n = new h(workDatabase_Impl, 2);
        this.f3026o = new h(workDatabase_Impl, 3);
    }

    public m(ArrayList arrayList) {
        this.f3023l = 8;
        this.f3024m = Collections.unmodifiableList(new ArrayList(arrayList));
        this.f3025n = new long[arrayList.size() * 2];
        for (int i = 0; i < arrayList.size(); i++) {
            C0533c c0533c = (C0533c) arrayList.get(i);
            int i5 = i * 2;
            long[] jArr = (long[]) this.f3025n;
            jArr[i5] = c0533c.f7661b;
            jArr[i5 + 1] = c0533c.f7662c;
        }
        long[] jArr2 = (long[]) this.f3025n;
        long[] jArrCopyOf = Arrays.copyOf(jArr2, jArr2.length);
        this.f3026o = jArrCopyOf;
        Arrays.sort(jArrCopyOf);
    }

    public m(Y y, W w4, W.b bVar) {
        this.f3023l = 4;
        N3.h.e(y, "store");
        N3.h.e(bVar, "defaultCreationExtras");
        this.f3024m = y;
        this.f3025n = w4;
        this.f3026o = bVar;
    }

    public m(String str) {
        this.f3023l = 9;
        C0189o c0189o = new C0189o();
        c0189o.f3387m = AbstractC0156G.m(str);
        this.f3024m = new C0190p(c0189o);
    }

    public m(Context context) {
        this.f3023l = 18;
        R1.m mVar = new R1.m(context);
        this.f3024m = context;
        this.f3025n = mVar;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public m(Y y, W w4) {
        this(y, w4, W.a.f2457b);
        this.f3023l = 4;
        N3.h.e(y, "store");
    }

    public m(byte[] bArr) throws GeneralSecurityException {
        this.f3023l = 1;
        E2.o.a(bArr.length);
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
        this.f3024m = secretKeySpec;
        if (B0.e(1)) {
            Cipher cipher = (Cipher) E2.j.f663b.f665a.a("AES/ECB/NoPadding");
            cipher.init(1, secretKeySpec);
            byte[] bArrL = Q1.C.l(cipher.doFinal(new byte[16]));
            this.f3025n = bArrL;
            this.f3026o = Q1.C.l(bArrL);
            return;
        }
        throw new GeneralSecurityException("Can not use AES-CMAC in FIPS-mode.");
    }

    public m(F0.t tVar) {
        this.f3023l = 19;
        this.f3024m = tVar;
    }

    public m(p1.b bVar) {
        this.f3023l = 14;
        this.f3024m = new A.j(30, 2);
        this.f3025n = new ArrayList();
        this.f3026o = new ArrayList();
        new p1.b(this, 6);
    }

    public m(f3.b bVar, FlutterJNI flutterJNI) {
        this.f3023l = 11;
        androidx.lifecycle.E e5 = new androidx.lifecycle.E(this, 21);
        i iVar = new i(bVar, "flutter/accessibility", w.f8944a, (C0200z) null);
        this.f3024m = iVar;
        iVar.E(e5);
        this.f3025n = flutterJNI;
    }

    public m(io.flutter.embedding.android.M m4) {
        this.f3023l = 6;
        this.f3025n = new HashSet();
        this.f3026o = m4;
        D d5 = (D) m4;
        J j5 = new J(d5.getBinaryMessenger());
        C0668b c0668b = new C0668b(d5.getBinaryMessenger());
        l lVar = new l();
        lVar.f3021m = new c4.i();
        lVar.f3020l = c0668b;
        this.f3024m = new L[]{j5, lVar};
        new androidx.lifecycle.E(d5.getBinaryMessenger()).f4474m = this;
    }

    public m(s sVar, InterfaceC0699i interfaceC0699i) {
        this.f3023l = 12;
        this.f3026o = sVar;
        this.f3025n = new AtomicReference(null);
        this.f3024m = interfaceC0699i;
    }

    public m(B0.d dVar) {
        this.f3023l = 2;
        this.f3024m = dVar;
        this.f3025n = new ReentrantLock();
        this.f3026o = new WeakHashMap();
    }

    public m(g0 g0Var, List list) {
        this.f3023l = 15;
        this.f3024m = g0Var;
        this.f3025n = list;
        this.f3026o = B2.a.f262b;
    }

    public m(ArrayDeque arrayDeque, BufferedReader bufferedReader) {
        this.f3023l = 13;
        this.f3025n = arrayDeque;
        this.f3024m = bufferedReader;
    }

    public m(AudioTrack audioTrack, j0.d dVar) {
        this.f3023l = 7;
        this.f3024m = audioTrack;
        this.f3025n = dVar;
        this.f3026o = new AudioRouting.OnRoutingChangedListener() { // from class: j0.r
            @Override // android.media.AudioRouting.OnRoutingChangedListener
            public final void onRoutingChanged(AudioRouting audioRouting) {
                Z1.m mVar = this.f7343a;
                if (((r) mVar.f3026o) == null || audioRouting.getRoutedDevice() == null) {
                    return;
                }
                ((d) mVar.f3025n).b(audioRouting.getRoutedDevice());
            }
        };
        audioTrack.addOnRoutingChangedListener((j0.r) this.f3026o, new Handler(Looper.myLooper()));
    }
}

package i4;

import B0.k;
import C3.e;
import C3.f;
import C3.n;
import C3.r;
import D.P;
import D.S;
import D.T;
import D.b0;
import F0.C0066m;
import I.b;
import I.c;
import M3.l;
import N3.h;
import Q1.C;
import Q1.C0118a;
import Q1.E;
import Q1.q;
import R1.o;
import Z1.i;
import a.AbstractC0149a;
import a0.C0157H;
import a0.C0200z;
import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.IntentFilter;
import android.database.Cursor;
import android.graphics.Point;
import android.graphics.Rect;
import android.media.AudioDeviceInfo;
import android.media.MicrophoneInfo;
import android.net.http.SslCertificate;
import android.os.Build;
import android.os.Process;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.webkit.ClientCertRequest;
import android.widget.EdgeEffect;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.WorkDatabase_Impl;
import b2.d;
import b3.AbstractC0307a;
import d0.AbstractC0360m;
import d0.AbstractC0370w;
import d0.C0363p;
import e3.C0394c;
import i1.g;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.math.RoundingMode;
import java.security.PrivateKey;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.TreeMap;
import m.B0;
import n3.InterfaceC0692b;
import n3.InterfaceC0696f;
import n3.InterfaceC0703m;
import s1.j;
import t.AbstractC0813b;
import t.InterfaceC0814c;
import t.O;
import t.V;
import u1.C0891c;
import u1.C0892d;
import y1.C1002b;
import y3.C1039j;
import z3.InterfaceC1069b;
import z3.InterfaceC1070c;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static Boolean f6488a;

    public static float A(EdgeEffect edgeEffect) {
        if (Build.VERSION.SDK_INT >= 31) {
            return c.b(edgeEffect);
        }
        return 0.0f;
    }

    public static Long B(Object obj) {
        Long l3 = obj instanceof Long ? (Long) obj : null;
        if (l3 != null) {
            return l3;
        }
        if ((obj instanceof Integer ? (Integer) obj : null) != null) {
            return Long.valueOf(r2.intValue());
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [C3.n] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.util.ArrayList] */
    public static ArrayList D(int[] iArr) {
        ?? Y4;
        int length = iArr.length;
        if (length != 0) {
            if (length != 1) {
                Y4 = new ArrayList(iArr.length);
                for (int i : iArr) {
                    Y4.add(Integer.valueOf(i));
                }
            } else {
                Y4 = AbstractC0149a.y(Integer.valueOf(iArr[0]));
            }
        } else {
            Y4 = n.f291l;
        }
        return new ArrayList((Collection) Y4);
    }

    public static boolean E(byte b4) {
        return b4 > -65;
    }

    public static boolean F(byte b4) {
        return b4 > -65;
    }

    public static final void H(Context context) {
        Map map;
        h.e(context, "context");
        File databasePath = context.getDatabasePath("androidx.work.workdb");
        h.d(databasePath, "context.getDatabasePath(WORK_DATABASE_NAME)");
        if (databasePath.exists()) {
            q.d().a(o.f1905a, "Migrating WorkDatabase to the no-backup directory");
            File databasePath2 = context.getDatabasePath("androidx.work.workdb");
            h.d(databasePath2, "context.getDatabasePath(WORK_DATABASE_NAME)");
            File file = new File(R1.a.f1861a.a(context), "androidx.work.workdb");
            String[] strArr = o.f1906b;
            int iB0 = r.b0(strArr.length);
            if (iB0 < 16) {
                iB0 = 16;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(iB0);
            for (String str : strArr) {
                linkedHashMap.put(new File(databasePath2.getPath() + str), new File(file.getPath() + str));
            }
            if (linkedHashMap.isEmpty()) {
                Map mapSingletonMap = Collections.singletonMap(databasePath2, file);
                h.d(mapSingletonMap, "singletonMap(...)");
                map = mapSingletonMap;
            } else {
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(linkedHashMap);
                linkedHashMap2.put(databasePath2, file);
                map = linkedHashMap2;
            }
            for (Map.Entry entry : map.entrySet()) {
                File file2 = (File) entry.getKey();
                File file3 = (File) entry.getValue();
                if (file2.exists()) {
                    if (file3.exists()) {
                        q.d().g(o.f1905a, "Over-writing contents of " + file3);
                    }
                    q.d().a(o.f1905a, file2.renameTo(file3) ? "Migrated " + file2 + "to " + file3 : "Renaming " + file2 + " to " + file3 + " failed");
                }
            }
        }
    }

    public static float K(EdgeEffect edgeEffect, float f2, float f5) {
        if (Build.VERSION.SDK_INT >= 31) {
            return c.c(edgeEffect, f2, f5);
        }
        b.a(edgeEffect, f2, f5);
        return f2;
    }

    public static final List N(Cursor cursor) {
        int columnIndex = cursor.getColumnIndex("id");
        int columnIndex2 = cursor.getColumnIndex("seq");
        int columnIndex3 = cursor.getColumnIndex("from");
        int columnIndex4 = cursor.getColumnIndex("to");
        D3.c cVar = new D3.c(10);
        while (cursor.moveToNext()) {
            int i = cursor.getInt(columnIndex);
            int i5 = cursor.getInt(columnIndex2);
            String string = cursor.getString(columnIndex3);
            h.d(string, "cursor.getString(fromColumnIndex)");
            String string2 = cursor.getString(columnIndex4);
            h.d(string2, "cursor.getString(toColumnIndex)");
            cVar.add(new C0891c(i, i5, string, string2));
        }
        cVar.k();
        cVar.f598n = true;
        if (cVar.f597m <= 0) {
            cVar = D3.c.f595o;
        }
        h.e(cVar, "<this>");
        if (cVar.f() <= 1) {
            return f.X(cVar);
        }
        Object[] array = cVar.toArray(new Comparable[0]);
        Comparable[] comparableArr = (Comparable[]) array;
        if (comparableArr.length > 1) {
            Arrays.sort(comparableArr);
        }
        return e.S(array);
    }

    public static final C0892d O(C1002b c1002b, String str, boolean z4) throws IOException {
        Cursor cursorP = c1002b.p("PRAGMA index_xinfo(`" + str + "`)");
        try {
            int columnIndex = cursorP.getColumnIndex("seqno");
            int columnIndex2 = cursorP.getColumnIndex("cid");
            int columnIndex3 = cursorP.getColumnIndex("name");
            int columnIndex4 = cursorP.getColumnIndex("desc");
            if (columnIndex != -1 && columnIndex2 != -1 && columnIndex3 != -1 && columnIndex4 != -1) {
                TreeMap treeMap = new TreeMap();
                TreeMap treeMap2 = new TreeMap();
                while (cursorP.moveToNext()) {
                    if (cursorP.getInt(columnIndex2) >= 0) {
                        int i = cursorP.getInt(columnIndex);
                        String string = cursorP.getString(columnIndex3);
                        String str2 = cursorP.getInt(columnIndex4) > 0 ? "DESC" : "ASC";
                        Integer numValueOf = Integer.valueOf(i);
                        h.d(string, "columnName");
                        treeMap.put(numValueOf, string);
                        treeMap2.put(Integer.valueOf(i), str2);
                    }
                }
                Collection collectionValues = treeMap.values();
                h.d(collectionValues, "columnsMap.values");
                List listX = f.X(collectionValues);
                Collection collectionValues2 = treeMap2.values();
                h.d(collectionValues2, "ordersMap.values");
                C0892d c0892d = new C0892d(str, z4, listX, f.X(collectionValues2));
                Z1.f.f(cursorP, null);
                return c0892d;
            }
            Z1.f.f(cursorP, null);
            return null;
        } finally {
        }
    }

    public static void P(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 33) {
            u.e.a(context, broadcastReceiver, intentFilter, null, null, 2);
        } else if (i >= 26) {
            u.c.a(context, broadcastReceiver, intentFilter, null, null, 2);
        } else {
            context.registerReceiver(broadcastReceiver, intentFilter, null, null);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void Q(Activity activity, String[] strArr, int i) {
        HashSet hashSet = new HashSet();
        for (int i5 = 0; i5 < strArr.length; i5++) {
            if (TextUtils.isEmpty(strArr[i5])) {
                throw new IllegalArgumentException(B0.i(new StringBuilder("Permission request for permissions "), Arrays.toString(strArr), " must not contain null or empty values"));
            }
            if (Build.VERSION.SDK_INT < 33 && TextUtils.equals(strArr[i5], "android.permission.POST_NOTIFICATIONS")) {
                hashSet.add(Integer.valueOf(i5));
            }
        }
        int size = hashSet.size();
        String[] strArr2 = size > 0 ? new String[strArr.length - size] : strArr;
        if (size > 0) {
            if (size == strArr.length) {
                return;
            }
            int i6 = 0;
            for (int i7 = 0; i7 < strArr.length; i7++) {
                if (!hashSet.contains(Integer.valueOf(i7))) {
                    strArr2[i6] = strArr[i7];
                    i6++;
                }
            }
        }
        if (activity instanceof InterfaceC0814c) {
            ((InterfaceC0814c) activity).validateRequestPermissionsRequestCode(i);
        }
        AbstractC0813b.b(activity, strArr, i);
    }

    public static final void R(Object[] objArr, int i, int i5) {
        h.e(objArr, "<this>");
        while (i < i5) {
            objArr[i] = null;
            i++;
        }
    }

    public static g S(g gVar, String[] strArr, Map map) {
        int i = 0;
        if (gVar == null) {
            if (strArr == null) {
                return null;
            }
            if (strArr.length == 1) {
                return (g) map.get(strArr[0]);
            }
            if (strArr.length > 1) {
                g gVar2 = new g();
                int length = strArr.length;
                while (i < length) {
                    gVar2.a((g) map.get(strArr[i]));
                    i++;
                }
                return gVar2;
            }
        } else {
            if (strArr != null && strArr.length == 1) {
                gVar.a((g) map.get(strArr[0]));
                return gVar;
            }
            if (strArr != null && strArr.length > 1) {
                int length2 = strArr.length;
                while (i < length2) {
                    gVar.a((g) map.get(strArr[i]));
                    i++;
                }
            }
        }
        return gVar;
    }

    public static long T(long j5, long j6) {
        int iNumberOfLeadingZeros = Long.numberOfLeadingZeros(~j6) + Long.numberOfLeadingZeros(j6) + Long.numberOfLeadingZeros(~j5) + Long.numberOfLeadingZeros(j5);
        if (iNumberOfLeadingZeros > 65) {
            return j5 * j6;
        }
        long j7 = ((j5 ^ j6) >>> 63) + Long.MAX_VALUE;
        if ((iNumberOfLeadingZeros < 64) || ((j6 == Long.MIN_VALUE) & (j5 < 0))) {
            return j7;
        }
        long j8 = j5 * j6;
        return (j5 == 0 || j8 / j5 == j6) ? j8 : j7;
    }

    public static void U(InterfaceC0696f interfaceC0696f, final C1039j c1039j) {
        A.e eVar;
        h.e(interfaceC0696f, "binaryMessenger");
        InterfaceC0703m gVar = (c1039j == null || (eVar = c1039j.f11068a) == null) ? new defpackage.g(1) : eVar.e();
        i iVar = new i(interfaceC0696f, "dev.flutter.pigeon.webview_flutter_android.ClientCertRequest.cancel", gVar, (C0200z) null);
        if (c1039j != null) {
            final int i = 0;
            iVar.E(new InterfaceC0692b() { // from class: y3.w
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
                            N3.h.c(obj2, "null cannot be cast to non-null type android.webkit.ClientCertRequest");
                            ClientCertRequest clientCertRequest = (ClientCertRequest) obj2;
                            try {
                                c1039j2.getClass();
                                clientCertRequest.cancel();
                                listQ = AbstractC0149a.y(null);
                            } catch (Throwable th) {
                                listQ = Z1.f.Q(th);
                            }
                            lVar.u(listQ);
                            break;
                        case 1:
                            C1039j c1039j3 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj3 = ((List) obj).get(0);
                            N3.h.c(obj3, "null cannot be cast to non-null type android.webkit.ClientCertRequest");
                            ClientCertRequest clientCertRequest2 = (ClientCertRequest) obj3;
                            try {
                                c1039j3.getClass();
                                clientCertRequest2.ignore();
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
                            N3.h.c(obj4, "null cannot be cast to non-null type android.webkit.ClientCertRequest");
                            ClientCertRequest clientCertRequest3 = (ClientCertRequest) obj4;
                            Object obj5 = list.get(1);
                            N3.h.c(obj5, "null cannot be cast to non-null type java.security.PrivateKey");
                            PrivateKey privateKey = (PrivateKey) obj5;
                            Object obj6 = list.get(2);
                            N3.h.c(obj6, "null cannot be cast to non-null type kotlin.collections.List<java.security.cert.X509Certificate>");
                            List list2 = (List) obj6;
                            try {
                                c1039j4.getClass();
                                clientCertRequest3.proceed(privateKey, (X509Certificate[]) list2.toArray(new X509Certificate[0]));
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
        i iVar2 = new i(interfaceC0696f, "dev.flutter.pigeon.webview_flutter_android.ClientCertRequest.ignore", gVar, (C0200z) null);
        if (c1039j != null) {
            final int i5 = 1;
            iVar2.E(new InterfaceC0692b() { // from class: y3.w
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
                            N3.h.c(obj2, "null cannot be cast to non-null type android.webkit.ClientCertRequest");
                            ClientCertRequest clientCertRequest = (ClientCertRequest) obj2;
                            try {
                                c1039j2.getClass();
                                clientCertRequest.cancel();
                                listQ = AbstractC0149a.y(null);
                            } catch (Throwable th) {
                                listQ = Z1.f.Q(th);
                            }
                            lVar.u(listQ);
                            break;
                        case 1:
                            C1039j c1039j3 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj3 = ((List) obj).get(0);
                            N3.h.c(obj3, "null cannot be cast to non-null type android.webkit.ClientCertRequest");
                            ClientCertRequest clientCertRequest2 = (ClientCertRequest) obj3;
                            try {
                                c1039j3.getClass();
                                clientCertRequest2.ignore();
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
                            N3.h.c(obj4, "null cannot be cast to non-null type android.webkit.ClientCertRequest");
                            ClientCertRequest clientCertRequest3 = (ClientCertRequest) obj4;
                            Object obj5 = list.get(1);
                            N3.h.c(obj5, "null cannot be cast to non-null type java.security.PrivateKey");
                            PrivateKey privateKey = (PrivateKey) obj5;
                            Object obj6 = list.get(2);
                            N3.h.c(obj6, "null cannot be cast to non-null type kotlin.collections.List<java.security.cert.X509Certificate>");
                            List list2 = (List) obj6;
                            try {
                                c1039j4.getClass();
                                clientCertRequest3.proceed(privateKey, (X509Certificate[]) list2.toArray(new X509Certificate[0]));
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
        i iVar3 = new i(interfaceC0696f, "dev.flutter.pigeon.webview_flutter_android.ClientCertRequest.proceed", gVar, (C0200z) null);
        if (c1039j == null) {
            iVar3.E(null);
        } else {
            final int i6 = 2;
            iVar3.E(new InterfaceC0692b() { // from class: y3.w
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
                            N3.h.c(obj2, "null cannot be cast to non-null type android.webkit.ClientCertRequest");
                            ClientCertRequest clientCertRequest = (ClientCertRequest) obj2;
                            try {
                                c1039j2.getClass();
                                clientCertRequest.cancel();
                                listQ = AbstractC0149a.y(null);
                            } catch (Throwable th) {
                                listQ = Z1.f.Q(th);
                            }
                            lVar.u(listQ);
                            break;
                        case 1:
                            C1039j c1039j3 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj3 = ((List) obj).get(0);
                            N3.h.c(obj3, "null cannot be cast to non-null type android.webkit.ClientCertRequest");
                            ClientCertRequest clientCertRequest2 = (ClientCertRequest) obj3;
                            try {
                                c1039j3.getClass();
                                clientCertRequest2.ignore();
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
                            N3.h.c(obj4, "null cannot be cast to non-null type android.webkit.ClientCertRequest");
                            ClientCertRequest clientCertRequest3 = (ClientCertRequest) obj4;
                            Object obj5 = list.get(1);
                            N3.h.c(obj5, "null cannot be cast to non-null type java.security.PrivateKey");
                            PrivateKey privateKey = (PrivateKey) obj5;
                            Object obj6 = list.get(2);
                            N3.h.c(obj6, "null cannot be cast to non-null type kotlin.collections.List<java.security.cert.X509Certificate>");
                            List list2 = (List) obj6;
                            try {
                                c1039j4.getClass();
                                clientCertRequest3.proceed(privateKey, (X509Certificate[]) list2.toArray(new X509Certificate[0]));
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

    public static void V(InterfaceC0696f interfaceC0696f, final C1039j c1039j) {
        A.e eVar;
        h.e(interfaceC0696f, "binaryMessenger");
        InterfaceC0703m gVar = (c1039j == null || (eVar = c1039j.f11068a) == null) ? new defpackage.g(1) : eVar.e();
        i iVar = new i(interfaceC0696f, "dev.flutter.pigeon.webview_flutter_android.SslCertificateDName.getCName", gVar, (C0200z) null);
        if (c1039j != null) {
            final int i = 0;
            iVar.E(new InterfaceC0692b() { // from class: y3.C
                @Override // n3.InterfaceC0692b
                public final void t(Object obj, Z1.l lVar) {
                    List listQ;
                    List listQ2;
                    List listQ3;
                    List listQ4;
                    switch (i) {
                        case 0:
                            C1039j c1039j2 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj2 = ((List) obj).get(0);
                            N3.h.c(obj2, "null cannot be cast to non-null type android.net.http.SslCertificate.DName");
                            SslCertificate.DName dName = (SslCertificate.DName) obj2;
                            try {
                                c1039j2.getClass();
                                listQ = AbstractC0149a.y(dName.getCName());
                            } catch (Throwable th) {
                                listQ = Z1.f.Q(th);
                            }
                            lVar.u(listQ);
                            break;
                        case 1:
                            C1039j c1039j3 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj3 = ((List) obj).get(0);
                            N3.h.c(obj3, "null cannot be cast to non-null type android.net.http.SslCertificate.DName");
                            SslCertificate.DName dName2 = (SslCertificate.DName) obj3;
                            try {
                                c1039j3.getClass();
                                listQ2 = AbstractC0149a.y(dName2.getDName());
                            } catch (Throwable th2) {
                                listQ2 = Z1.f.Q(th2);
                            }
                            lVar.u(listQ2);
                            break;
                        case 2:
                            C1039j c1039j4 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj4 = ((List) obj).get(0);
                            N3.h.c(obj4, "null cannot be cast to non-null type android.net.http.SslCertificate.DName");
                            SslCertificate.DName dName3 = (SslCertificate.DName) obj4;
                            try {
                                c1039j4.getClass();
                                listQ3 = AbstractC0149a.y(dName3.getOName());
                            } catch (Throwable th3) {
                                listQ3 = Z1.f.Q(th3);
                            }
                            lVar.u(listQ3);
                            break;
                        default:
                            C1039j c1039j5 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj5 = ((List) obj).get(0);
                            N3.h.c(obj5, "null cannot be cast to non-null type android.net.http.SslCertificate.DName");
                            SslCertificate.DName dName4 = (SslCertificate.DName) obj5;
                            try {
                                c1039j5.getClass();
                                listQ4 = AbstractC0149a.y(dName4.getUName());
                            } catch (Throwable th4) {
                                listQ4 = Z1.f.Q(th4);
                            }
                            lVar.u(listQ4);
                            break;
                    }
                }
            });
        } else {
            iVar.E(null);
        }
        i iVar2 = new i(interfaceC0696f, "dev.flutter.pigeon.webview_flutter_android.SslCertificateDName.getDName", gVar, (C0200z) null);
        if (c1039j != null) {
            final int i5 = 1;
            iVar2.E(new InterfaceC0692b() { // from class: y3.C
                @Override // n3.InterfaceC0692b
                public final void t(Object obj, Z1.l lVar) {
                    List listQ;
                    List listQ2;
                    List listQ3;
                    List listQ4;
                    switch (i5) {
                        case 0:
                            C1039j c1039j2 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj2 = ((List) obj).get(0);
                            N3.h.c(obj2, "null cannot be cast to non-null type android.net.http.SslCertificate.DName");
                            SslCertificate.DName dName = (SslCertificate.DName) obj2;
                            try {
                                c1039j2.getClass();
                                listQ = AbstractC0149a.y(dName.getCName());
                            } catch (Throwable th) {
                                listQ = Z1.f.Q(th);
                            }
                            lVar.u(listQ);
                            break;
                        case 1:
                            C1039j c1039j3 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj3 = ((List) obj).get(0);
                            N3.h.c(obj3, "null cannot be cast to non-null type android.net.http.SslCertificate.DName");
                            SslCertificate.DName dName2 = (SslCertificate.DName) obj3;
                            try {
                                c1039j3.getClass();
                                listQ2 = AbstractC0149a.y(dName2.getDName());
                            } catch (Throwable th2) {
                                listQ2 = Z1.f.Q(th2);
                            }
                            lVar.u(listQ2);
                            break;
                        case 2:
                            C1039j c1039j4 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj4 = ((List) obj).get(0);
                            N3.h.c(obj4, "null cannot be cast to non-null type android.net.http.SslCertificate.DName");
                            SslCertificate.DName dName3 = (SslCertificate.DName) obj4;
                            try {
                                c1039j4.getClass();
                                listQ3 = AbstractC0149a.y(dName3.getOName());
                            } catch (Throwable th3) {
                                listQ3 = Z1.f.Q(th3);
                            }
                            lVar.u(listQ3);
                            break;
                        default:
                            C1039j c1039j5 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj5 = ((List) obj).get(0);
                            N3.h.c(obj5, "null cannot be cast to non-null type android.net.http.SslCertificate.DName");
                            SslCertificate.DName dName4 = (SslCertificate.DName) obj5;
                            try {
                                c1039j5.getClass();
                                listQ4 = AbstractC0149a.y(dName4.getUName());
                            } catch (Throwable th4) {
                                listQ4 = Z1.f.Q(th4);
                            }
                            lVar.u(listQ4);
                            break;
                    }
                }
            });
        } else {
            iVar2.E(null);
        }
        i iVar3 = new i(interfaceC0696f, "dev.flutter.pigeon.webview_flutter_android.SslCertificateDName.getOName", gVar, (C0200z) null);
        if (c1039j != null) {
            final int i6 = 2;
            iVar3.E(new InterfaceC0692b() { // from class: y3.C
                @Override // n3.InterfaceC0692b
                public final void t(Object obj, Z1.l lVar) {
                    List listQ;
                    List listQ2;
                    List listQ3;
                    List listQ4;
                    switch (i6) {
                        case 0:
                            C1039j c1039j2 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj2 = ((List) obj).get(0);
                            N3.h.c(obj2, "null cannot be cast to non-null type android.net.http.SslCertificate.DName");
                            SslCertificate.DName dName = (SslCertificate.DName) obj2;
                            try {
                                c1039j2.getClass();
                                listQ = AbstractC0149a.y(dName.getCName());
                            } catch (Throwable th) {
                                listQ = Z1.f.Q(th);
                            }
                            lVar.u(listQ);
                            break;
                        case 1:
                            C1039j c1039j3 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj3 = ((List) obj).get(0);
                            N3.h.c(obj3, "null cannot be cast to non-null type android.net.http.SslCertificate.DName");
                            SslCertificate.DName dName2 = (SslCertificate.DName) obj3;
                            try {
                                c1039j3.getClass();
                                listQ2 = AbstractC0149a.y(dName2.getDName());
                            } catch (Throwable th2) {
                                listQ2 = Z1.f.Q(th2);
                            }
                            lVar.u(listQ2);
                            break;
                        case 2:
                            C1039j c1039j4 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj4 = ((List) obj).get(0);
                            N3.h.c(obj4, "null cannot be cast to non-null type android.net.http.SslCertificate.DName");
                            SslCertificate.DName dName3 = (SslCertificate.DName) obj4;
                            try {
                                c1039j4.getClass();
                                listQ3 = AbstractC0149a.y(dName3.getOName());
                            } catch (Throwable th3) {
                                listQ3 = Z1.f.Q(th3);
                            }
                            lVar.u(listQ3);
                            break;
                        default:
                            C1039j c1039j5 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj5 = ((List) obj).get(0);
                            N3.h.c(obj5, "null cannot be cast to non-null type android.net.http.SslCertificate.DName");
                            SslCertificate.DName dName4 = (SslCertificate.DName) obj5;
                            try {
                                c1039j5.getClass();
                                listQ4 = AbstractC0149a.y(dName4.getUName());
                            } catch (Throwable th4) {
                                listQ4 = Z1.f.Q(th4);
                            }
                            lVar.u(listQ4);
                            break;
                    }
                }
            });
        } else {
            iVar3.E(null);
        }
        i iVar4 = new i(interfaceC0696f, "dev.flutter.pigeon.webview_flutter_android.SslCertificateDName.getUName", gVar, (C0200z) null);
        if (c1039j == null) {
            iVar4.E(null);
        } else {
            final int i7 = 3;
            iVar4.E(new InterfaceC0692b() { // from class: y3.C
                @Override // n3.InterfaceC0692b
                public final void t(Object obj, Z1.l lVar) {
                    List listQ;
                    List listQ2;
                    List listQ3;
                    List listQ4;
                    switch (i7) {
                        case 0:
                            C1039j c1039j2 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj2 = ((List) obj).get(0);
                            N3.h.c(obj2, "null cannot be cast to non-null type android.net.http.SslCertificate.DName");
                            SslCertificate.DName dName = (SslCertificate.DName) obj2;
                            try {
                                c1039j2.getClass();
                                listQ = AbstractC0149a.y(dName.getCName());
                            } catch (Throwable th) {
                                listQ = Z1.f.Q(th);
                            }
                            lVar.u(listQ);
                            break;
                        case 1:
                            C1039j c1039j3 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj3 = ((List) obj).get(0);
                            N3.h.c(obj3, "null cannot be cast to non-null type android.net.http.SslCertificate.DName");
                            SslCertificate.DName dName2 = (SslCertificate.DName) obj3;
                            try {
                                c1039j3.getClass();
                                listQ2 = AbstractC0149a.y(dName2.getDName());
                            } catch (Throwable th2) {
                                listQ2 = Z1.f.Q(th2);
                            }
                            lVar.u(listQ2);
                            break;
                        case 2:
                            C1039j c1039j4 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj4 = ((List) obj).get(0);
                            N3.h.c(obj4, "null cannot be cast to non-null type android.net.http.SslCertificate.DName");
                            SslCertificate.DName dName3 = (SslCertificate.DName) obj4;
                            try {
                                c1039j4.getClass();
                                listQ3 = AbstractC0149a.y(dName3.getOName());
                            } catch (Throwable th3) {
                                listQ3 = Z1.f.Q(th3);
                            }
                            lVar.u(listQ3);
                            break;
                        default:
                            C1039j c1039j5 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj5 = ((List) obj).get(0);
                            N3.h.c(obj5, "null cannot be cast to non-null type android.net.http.SslCertificate.DName");
                            SslCertificate.DName dName4 = (SslCertificate.DName) obj5;
                            try {
                                c1039j5.getClass();
                                listQ4 = AbstractC0149a.y(dName4.getUName());
                            } catch (Throwable th4) {
                                listQ4 = Z1.f.Q(th4);
                            }
                            lVar.u(listQ4);
                            break;
                    }
                }
            });
        }
    }

    public static k W(int i, C0066m c0066m, C0363p c0363p) throws C0157H {
        k kVarB = k.b(c0066m, c0363p);
        while (true) {
            int i5 = kVarB.f226a;
            if (i5 == i) {
                return kVarB;
            }
            AbstractC0307a.o(i5, "Ignoring unknown WAV chunk: ", "WavHeaderReader");
            long j5 = kVarB.f227b;
            long j6 = 8 + j5;
            if (j5 % 2 != 0) {
                j6 = 9 + j5;
            }
            if (j6 > 2147483647L) {
                throw C0157H.c("Chunk is too large (~2GB+) to skip; id: " + i5);
            }
            c0066m.f((int) j6);
            kVarB = k.b(c0066m, c0363p);
        }
    }

    public static void X(Context context, Intent intent) {
        if (Build.VERSION.SDK_INT >= 26) {
            u.c.b(context, intent);
        } else {
            context.startService(intent);
        }
    }

    public static final void Y(Object obj) {
        if (obj instanceof B3.c) {
            throw ((B3.c) obj).f270l;
        }
    }

    public static long Z(long j5, long j6, long j7, int i) {
        int i5 = AbstractC0370w.f5326a;
        return j5 + AbstractC0370w.U(j6 - j7, 1000000L, i, RoundingMode.DOWN);
    }

    public static final boolean a(Object[] objArr, int i, int i5, List list) {
        if (i5 != list.size()) {
            return false;
        }
        for (int i6 = 0; i6 < i5; i6++) {
            if (!h.a(objArr[i + i6], list.get(i6))) {
                return false;
            }
        }
        return true;
    }

    public static boolean a0(View view, InterfaceC1070c interfaceC1070c) {
        if (view == null) {
            return false;
        }
        if (interfaceC1070c.a(view)) {
            return true;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                if (a0(viewGroup.getChildAt(i), interfaceC1070c)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static final String b(Object[] objArr, int i, int i5, C3.a aVar) {
        StringBuilder sb = new StringBuilder((i5 * 3) + 2);
        sb.append("[");
        for (int i6 = 0; i6 < i5; i6++) {
            if (i6 > 0) {
                sb.append(", ");
            }
            Object obj = objArr[i + i6];
            if (obj == aVar) {
                sb.append("(this Collection)");
            } else {
                sb.append(obj);
            }
        }
        sb.append("]");
        String string = sb.toString();
        h.d(string, "toString(...)");
        return string;
    }

    public static void c(SpannableStringBuilder spannableStringBuilder, Object obj, int i, int i5) {
        for (Object obj2 : spannableStringBuilder.getSpans(i, i5, obj.getClass())) {
            if (spannableStringBuilder.getSpanStart(obj2) == i && spannableStringBuilder.getSpanEnd(obj2) == i5 && spannableStringBuilder.getSpanFlags(obj2) == 33) {
                spannableStringBuilder.removeSpan(obj2);
            }
        }
        spannableStringBuilder.setSpan(obj, i, i5, 33);
    }

    public static void d(StringBuilder sb, Object obj, l lVar) {
        if (lVar != null) {
            sb.append((CharSequence) lVar.c(obj));
            return;
        }
        if (obj == null ? true : obj instanceof CharSequence) {
            sb.append((CharSequence) obj);
        } else if (obj instanceof Character) {
            sb.append(((Character) obj).charValue());
        } else {
            sb.append((CharSequence) obj.toString());
        }
    }

    public static void e(Context context, InterfaceC1069b interfaceC1069b) {
        Rect rect;
        b0 b0VarB;
        Activity activityY = y(context);
        if (activityY != null) {
            K1.n.f1263a.getClass();
            int i = K1.o.f1264b;
            int i5 = Build.VERSION.SDK_INT;
            if (i5 >= 30) {
                rect = ((WindowManager) activityY.getSystemService(WindowManager.class)).getMaximumWindowMetrics().getBounds();
                h.d(rect, "wm.maximumWindowMetrics.bounds");
            } else {
                Object systemService = activityY.getSystemService("window");
                h.c(systemService, "null cannot be cast to non-null type android.view.WindowManager");
                Display defaultDisplay = ((WindowManager) systemService).getDefaultDisplay();
                h.d(defaultDisplay, "display");
                Point point = new Point();
                defaultDisplay.getRealSize(point);
                rect = new Rect(0, 0, point.x, point.y);
            }
            if (i5 < 30) {
                b0VarB = (i5 >= 30 ? new T() : i5 >= 29 ? new S() : new P()).b();
                h.d(b0VarB, "{\n            WindowInse…ilder().build()\n        }");
            } else {
                if (i5 < 30) {
                    throw new Exception("Incompatible SDK version");
                }
                b0VarB = O1.a.f1636a.a(activityY);
            }
            int i6 = rect.left;
            int i7 = rect.top;
            int i8 = rect.right;
            int i9 = rect.bottom;
            if (i6 > i8) {
                throw new IllegalArgumentException(AbstractC0307a.g(i6, i8, "Left must be less than or equal to right, left: ", ", right: ").toString());
            }
            if (i7 > i9) {
                throw new IllegalArgumentException(AbstractC0307a.g(i7, i9, "top must be less than or equal to bottom, top: ", ", bottom: ").toString());
            }
            h.e(b0VarB, "_windowInsetsCompat");
            ((C0394c) interfaceC1069b).f5605a.updateDisplayMetrics(0, new Rect(i6, i7, i8, i9).width(), new Rect(i6, i7, i8, i9).height(), context.getResources().getDisplayMetrics().density);
        }
    }

    public static long f(boolean z4, int i, int i5, long j5, long j6, int i6, boolean z5, long j7, long j8, long j9, long j10) {
        AbstractC0307a.r("backoffPolicy", i5);
        if (j10 != Long.MAX_VALUE && z5) {
            if (i6 != 0) {
                long j11 = 900000 + j6;
                if (j10 < j11) {
                    return j11;
                }
            }
            return j10;
        }
        if (z4) {
            long jScalb = i5 == 2 ? ((long) i) * j5 : (long) Math.scalb(j5, i - 1);
            if (jScalb > 18000000) {
                jScalb = 18000000;
            }
            return jScalb + j6;
        }
        if (z5) {
            long j12 = i6 == 0 ? j6 + j7 : j6 + j9;
            return (j8 == j9 || i6 != 0) ? j12 : (j9 - j8) + j12;
        }
        if (j6 == -1) {
            return Long.MAX_VALUE;
        }
        return j6 + j7;
    }

    public static Object j(Class cls, InvocationHandler invocationHandler) {
        if (invocationHandler == null) {
            return null;
        }
        return cls.cast(Proxy.newProxyInstance(a.class.getClassLoader(), new Class[]{cls}, invocationHandler));
    }

    public static final void k(WorkDatabase workDatabase, C0118a c0118a, R1.l lVar) {
        int i;
        h.e(workDatabase, "workDatabase");
        h.e(c0118a, "configuration");
        h.e(lVar, "continuation");
        ArrayList arrayList = new ArrayList(new C3.c(new R1.l[]{lVar}, true));
        int i5 = 0;
        while (!arrayList.isEmpty()) {
            if (arrayList.isEmpty()) {
                throw new NoSuchElementException("List is empty.");
            }
            List list = ((R1.l) arrayList.remove(arrayList.size() - 1)).f1898d;
            h.d(list, "current.work");
            if (list.isEmpty()) {
                i = 0;
            } else {
                Iterator it = list.iterator();
                i = 0;
                while (it.hasNext()) {
                    if (!((E) it.next()).f1792b.f3054j.f1815h.isEmpty() && (i = i + 1) < 0) {
                        throw new ArithmeticException("Count overflow has happened.");
                    }
                }
            }
            i5 += i;
        }
        if (i5 == 0) {
            return;
        }
        Z1.q qVarT = workDatabase.t();
        qVarT.getClass();
        j jVarC = j.c("Select COUNT(*) FROM workspec WHERE LENGTH(content_uri_triggers)<>0 AND state NOT IN (2, 3, 5)", 0);
        WorkDatabase_Impl workDatabase_Impl = qVarT.f3068a;
        workDatabase_Impl.b();
        Cursor cursorL0 = C.l0(workDatabase_Impl, jVarC, false);
        try {
            int i6 = cursorL0.moveToFirst() ? cursorL0.getInt(0) : 0;
            cursorL0.close();
            jVarC.f();
            int i7 = i6 + i5;
            int i8 = c0118a.f1797c;
            if (i7 <= i8) {
                return;
            }
            StringBuilder sb = new StringBuilder("Too many workers with contentUriTriggers are enqueued:\ncontentUriTrigger workers limit: ");
            sb.append(i8);
            sb.append(";\nalready enqueued count: ");
            sb.append(i6);
            sb.append(";\ncurrent enqueue operation count: ");
            throw new IllegalArgumentException(AbstractC0307a.l(sb, i5, ".\nTo address this issue you can: \n1. enqueue less workers or batch some of workers with content uri triggers together;\n2. increase limit via Configuration.Builder.setContentUriTriggerWorkersLimit;\nPlease beware that workers with content uri triggers immediately occupy slots in JobScheduler so no updates to content uris are missed."));
        } catch (Throwable th) {
            cursorL0.close();
            jVarC.f();
            throw th;
        }
    }

    public static boolean l(C0066m c0066m) {
        C0363p c0363p = new C0363p(8);
        int i = k.b(c0066m, c0363p).f226a;
        if (i != 1380533830 && i != 1380333108) {
            return false;
        }
        c0066m.t(c0363p.f5313a, 0, 4, false);
        c0363p.H(0);
        int i5 = c0363p.i();
        if (i5 == 1463899717) {
            return true;
        }
        AbstractC0360m.l("WavHeaderReader", "Unsupported form type: " + i5);
        return false;
    }

    public static int m(Context context, String str) {
        if (str != null) {
            return (Build.VERSION.SDK_INT >= 33 || !TextUtils.equals("android.permission.POST_NOTIFICATIONS", str)) ? context.checkPermission(str, Process.myPid(), Process.myUid()) : O.a(new V(context).f9724b) ? 0 : -1;
        }
        throw new NullPointerException("permission must be non-null");
    }

    public static long n(long j5, long j6) {
        long j7 = j5 + j6;
        if (((j5 ^ j6) < 0) || ((j5 ^ j7) >= 0)) {
            return j7;
        }
        throw new ArithmeticException("overflow: checkedAdd(" + j5 + ", " + j6 + ")");
    }

    public static ArrayList o(MicrophoneInfo.Coordinate3F coordinate3F) {
        return new ArrayList(new C3.c(new Double[]{Double.valueOf(coordinate3F.x), Double.valueOf(coordinate3F.y), Double.valueOf(coordinate3F.z)}, true));
    }

    public static final B3.c p(Throwable th) {
        h.e(th, "exception");
        return new B3.c(th);
    }

    public static byte[] q(String str) {
        if (str.length() % 2 != 0) {
            throw new IllegalArgumentException("Expected a string of even length");
        }
        int length = str.length() / 2;
        byte[] bArr = new byte[length];
        for (int i = 0; i < length; i++) {
            int i5 = i * 2;
            int iDigit = Character.digit(str.charAt(i5), 16);
            int iDigit2 = Character.digit(str.charAt(i5 + 1), 16);
            if (iDigit == -1 || iDigit2 == -1) {
                throw new IllegalArgumentException("input is not hexadecimal");
            }
            bArr[i] = (byte) ((iDigit * 16) + iDigit2);
        }
        return bArr;
    }

    public static long r(long j5, long j6, RoundingMode roundingMode) {
        roundingMode.getClass();
        long j7 = j5 / j6;
        long j8 = j5 - (j6 * j7);
        if (j8 == 0) {
            return j7;
        }
        int i = ((int) ((j5 ^ j6) >> 63)) | 1;
        switch (o2.e.f9119a[roundingMode.ordinal()]) {
            case 1:
                if (j8 == 0) {
                    return j7;
                }
                throw new ArithmeticException("mode was UNNECESSARY, but rounding was necessary");
            case 2:
                return j7;
            case 3:
                if (i >= 0) {
                    return j7;
                }
                break;
            case 4:
                break;
            case 5:
                if (i <= 0) {
                    return j7;
                }
                break;
            case O.j.STRING_SET_FIELD_NUMBER /* 6 */:
            case O.j.DOUBLE_FIELD_NUMBER /* 7 */:
            case O.j.BYTES_FIELD_NUMBER /* 8 */:
                long jAbs = Math.abs(j8);
                long jAbs2 = jAbs - (Math.abs(j6) - jAbs);
                if (jAbs2 == 0) {
                    if (roundingMode != RoundingMode.HALF_UP && (roundingMode != RoundingMode.HALF_EVEN || (1 & j7) == 0)) {
                        return j7;
                    }
                } else if (jAbs2 <= 0) {
                    return j7;
                }
            default:
                throw new AssertionError();
        }
        return j7 + ((long) i);
    }

    public static String s(byte[] bArr) {
        StringBuilder sb = new StringBuilder(bArr.length * 2);
        for (byte b4 : bArr) {
            int i = b4 & 255;
            sb.append("0123456789abcdef".charAt(i / 16));
            sb.append("0123456789abcdef".charAt(i % 16));
        }
        return sb.toString();
    }

    public static Map t(AudioDeviceInfo audioDeviceInfo) {
        h.e(audioDeviceInfo, "device");
        String address = Build.VERSION.SDK_INT >= 28 ? audioDeviceInfo.getAddress() : null;
        B3.b bVar = new B3.b("id", Integer.valueOf(audioDeviceInfo.getId()));
        B3.b bVar2 = new B3.b("productName", audioDeviceInfo.getProductName());
        B3.b bVar3 = new B3.b("address", address);
        B3.b bVar4 = new B3.b("isSource", Boolean.valueOf(audioDeviceInfo.isSource()));
        B3.b bVar5 = new B3.b("isSink", Boolean.valueOf(audioDeviceInfo.isSink()));
        int[] sampleRates = audioDeviceInfo.getSampleRates();
        h.d(sampleRates, "getSampleRates(...)");
        B3.b bVar6 = new B3.b("sampleRates", D(sampleRates));
        int[] channelMasks = audioDeviceInfo.getChannelMasks();
        h.d(channelMasks, "getChannelMasks(...)");
        B3.b bVar7 = new B3.b("channelMasks", D(channelMasks));
        int[] channelIndexMasks = audioDeviceInfo.getChannelIndexMasks();
        h.d(channelIndexMasks, "getChannelIndexMasks(...)");
        B3.b bVar8 = new B3.b("channelIndexMasks", D(channelIndexMasks));
        int[] channelCounts = audioDeviceInfo.getChannelCounts();
        h.d(channelCounts, "getChannelCounts(...)");
        B3.b bVar9 = new B3.b("channelCounts", D(channelCounts));
        int[] encodings = audioDeviceInfo.getEncodings();
        h.d(encodings, "getEncodings(...)");
        return r.c0(bVar, bVar2, bVar3, bVar4, bVar5, bVar6, bVar7, bVar8, bVar9, new B3.b("encodings", D(encodings)), new B3.b("type", Integer.valueOf(audioDeviceInfo.getType())));
    }

    public static g4.b u(String str) {
        byte[] bytes = str.getBytes(U3.a.f2287a);
        h.d(bytes, "this as java.lang.String).getBytes(charset)");
        g4.b bVar = new g4.b(bytes);
        bVar.f5834n = str;
        return bVar;
    }

    public static boolean v(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    public static long w(long j5, long j6) {
        D1.b.m("a", j5);
        D1.b.m("b", j6);
        if (j5 == 0) {
            return j6;
        }
        if (j6 == 0) {
            return j5;
        }
        int iNumberOfTrailingZeros = Long.numberOfTrailingZeros(j5);
        long jNumberOfTrailingZeros = j5 >> iNumberOfTrailingZeros;
        int iNumberOfTrailingZeros2 = Long.numberOfTrailingZeros(j6);
        long j7 = j6 >> iNumberOfTrailingZeros2;
        while (jNumberOfTrailingZeros != j7) {
            long j8 = jNumberOfTrailingZeros - j7;
            long j9 = (j8 >> 63) & j8;
            long j10 = (j8 - j9) - j9;
            j7 += j9;
            jNumberOfTrailingZeros = j10 >> Long.numberOfTrailingZeros(j10);
        }
        return jNumberOfTrailingZeros << Math.min(iNumberOfTrailingZeros, iNumberOfTrailingZeros2);
    }

    public static Activity y(Context context) {
        if (context == null) {
            return null;
        }
        if (context instanceof Activity) {
            return (Activity) context;
        }
        if (context instanceof ContextWrapper) {
            return y(((ContextWrapper) context).getBaseContext());
        }
        return null;
    }

    public abstract String[] C(Class cls);

    public abstract boolean G(Class cls);

    public abstract void I(Throwable th);

    public abstract void J(i iVar);

    public abstract void L(b2.h hVar, b2.h hVar2);

    public abstract void M(b2.h hVar, Thread thread);

    public abstract boolean g(b2.i iVar, d dVar, d dVar2);

    public abstract boolean h(b2.i iVar, Object obj, Object obj2);

    public abstract boolean i(b2.i iVar, b2.h hVar, b2.h hVar2);

    public abstract Method x(Class cls, Field field);

    public abstract Constructor z(Class cls);
}

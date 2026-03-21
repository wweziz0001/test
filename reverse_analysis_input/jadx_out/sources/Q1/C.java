package Q1;

import D.H;
import D.I;
import F0.M;
import Q1.C0121d;
import a.AbstractC0149a;
import a0.C0155F;
import a0.C0157H;
import a0.C0200z;
import android.content.Context;
import android.content.res.TypedArray;
import android.database.AbstractWindowedCursor;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.media.metrics.LogSessionId;
import android.media.metrics.MediaMetricsManager;
import android.net.Uri;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.View;
import android.webkit.WebView;
import androidx.datastore.preferences.protobuf.AbstractC0218j;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.WorkDatabase_Impl;
import androidx.work.impl.workers.ConstraintTrackingWorker;
import b3.AbstractC0307a;
import com.example.hqp_mobile_app.R;
import com.google.crypto.tink.shaded.protobuf.AbstractC0325e;
import com.google.crypto.tink.shaded.protobuf.AbstractC0329i;
import com.google.crypto.tink.shaded.protobuf.AbstractC0333m;
import com.google.crypto.tink.shaded.protobuf.AbstractC0338s;
import com.google.crypto.tink.shaded.protobuf.AbstractC0343x;
import com.google.crypto.tink.shaded.protobuf.C0324d;
import com.google.crypto.tink.shaded.protobuf.InterfaceC0345z;
import com.google.crypto.tink.shaded.protobuf.J;
import com.google.crypto.tink.shaded.protobuf.T;
import com.google.crypto.tink.shaded.protobuf.c0;
import com.google.crypto.tink.shaded.protobuf.f0;
import com.google.crypto.tink.shaded.protobuf.r0;
import d0.AbstractC0360m;
import e3.C0398g;
import h0.C0448G;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.lang.ref.WeakReference;
import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.logging.Level;
import java.util.logging.Logger;
import m.B0;
import n3.InterfaceC0692b;
import n3.InterfaceC0696f;
import n3.InterfaceC0703m;
import org.json.JSONArray;
import org.json.JSONObject;
import p2.C0728b;
import r1.AbstractC0778s;
import r1.C0750A;
import r1.C0779t;
import y3.C1032c;
import y3.C1034e;
import y3.C1039j;

/* JADX INFO: loaded from: classes.dex */
public abstract class C {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static boolean f1785a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static Method f1786b;

    public static int A(c0 c0Var, int i, byte[] bArr, int i5, int i6, InterfaceC0345z interfaceC0345z, C0324d c0324d) {
        int i7 = (i & (-8)) | 4;
        Object objC = c0Var.c();
        int iI0 = i0(objC, c0Var, bArr, i5, i6, i7, c0324d);
        c0Var.d(objC);
        c0324d.f5189c = objC;
        interfaceC0345z.add(objC);
        while (iI0 < i6) {
            int iT = T(bArr, iI0, c0324d);
            if (i != c0324d.f5187a) {
                break;
            }
            Object objC2 = c0Var.c();
            int iI02 = i0(objC2, c0Var, bArr, iT, i6, i7, c0324d);
            c0Var.d(objC2);
            c0324d.f5189c = objC2;
            interfaceC0345z.add(objC2);
            iI0 = iI02;
        }
        return iI0;
    }

    public static final void A0(R1.f fVar, final WorkDatabase workDatabase, C0118a c0118a, final List list, final Z1.p pVar, final LinkedHashSet linkedHashSet) {
        Z1.q qVarT = workDatabase.t();
        final String str = pVar.f3046a;
        final Z1.p pVarM = qVarT.m(str);
        if (pVarM == null) {
            throw new IllegalArgumentException(AbstractC0307a.k("Worker with ", str, " doesn't exist"));
        }
        if (AbstractC0307a.b(pVarM.f3047b)) {
            return;
        }
        if (pVarM.d() ^ pVar.d()) {
            StringBuilder sb = new StringBuilder("Can't update ");
            sb.append(pVarM.d() ? "Periodic" : "OneTime");
            sb.append(" Worker to ");
            throw new UnsupportedOperationException(B0.i(sb, pVar.d() ? "Periodic" : "OneTime", " Worker. Update operation must preserve worker's type."));
        }
        final boolean zE = fVar.e(str);
        if (!zE) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((R1.h) it.next()).a(str);
            }
        }
        Runnable runnable = new Runnable() { // from class: R1.s
            @Override // java.lang.Runnable
            public final void run() throws Throwable {
                WorkDatabase workDatabase2 = workDatabase;
                N3.h.e(workDatabase2, "$workDatabase");
                Z1.p pVar2 = pVarM;
                Z1.p pVar3 = pVar;
                N3.h.e(list, "$schedulers");
                String str2 = str;
                N3.h.e(str2, "$workSpecId");
                LinkedHashSet linkedHashSet2 = linkedHashSet;
                N3.h.e(linkedHashSet2, "$tags");
                Z1.q qVarT2 = workDatabase2.t();
                Z1.s sVarU = workDatabase2.u();
                Z1.p pVarB = Z1.p.b(pVar3, null, pVar2.f3047b, null, null, pVar2.f3055k, pVar2.f3058n, pVar2.f3063s, pVar2.f3064t + 1, pVar2.f3065u, pVar2.f3066v, 4447229);
                if (pVar3.f3066v == 1) {
                    pVarB.f3065u = pVar3.f3065u;
                    pVarB.f3066v++;
                }
                if (Build.VERSION.SDK_INT < 26) {
                    C0121d c0121d = pVarB.f3054j;
                    String name = ConstraintTrackingWorker.class.getName();
                    String str3 = pVarB.f3048c;
                    if (!N3.h.a(str3, name) && (c0121d.f1811d || c0121d.f1812e)) {
                        C0398g c0398g = new C0398g(1);
                        c0398g.c(pVarB.f3050e.f1824a);
                        c0398g.f5638a.put("androidx.work.impl.workers.ConstraintTrackingWorker.ARGUMENT_CLASS_NAME", str3);
                        Q1.g gVar = new Q1.g(c0398g.f5638a);
                        Q1.g.b(gVar);
                        pVarB = Z1.p.b(pVarB, null, 0, ConstraintTrackingWorker.class.getName(), gVar, 0, 0L, 0, 0, 0L, 0, 8388587);
                    }
                }
                WorkDatabase_Impl workDatabase_Impl = qVarT2.f3068a;
                workDatabase_Impl.b();
                workDatabase_Impl.c();
                try {
                    Z1.h hVar = qVarT2.f3070c;
                    y1.h hVarA = hVar.a();
                    try {
                        hVar.l(hVarA, pVarB);
                        hVarA.a();
                        hVar.j(hVarA);
                        workDatabase_Impl.o();
                        workDatabase_Impl.k();
                        WorkDatabase_Impl workDatabase_Impl2 = (WorkDatabase_Impl) sVarU.f3085m;
                        workDatabase_Impl2.b();
                        Z1.h hVar2 = (Z1.h) sVarU.f3087o;
                        y1.h hVarA2 = hVar2.a();
                        hVarA2.h(str2, 1);
                        workDatabase_Impl2.c();
                        try {
                            hVarA2.a();
                            workDatabase_Impl2.o();
                            workDatabase_Impl2.k();
                            hVar2.j(hVarA2);
                            sVarU.L(str2, linkedHashSet2);
                            if (zE) {
                                return;
                            }
                            qVarT2.o(str2, -1L);
                            workDatabase2.s().n(str2);
                        } catch (Throwable th) {
                            workDatabase_Impl2.k();
                            hVar2.j(hVarA2);
                            throw th;
                        }
                    } catch (Throwable th2) {
                        hVar.j(hVarA);
                        throw th2;
                    }
                } catch (Throwable th3) {
                    workDatabase_Impl.k();
                    throw th3;
                }
            }
        };
        workDatabase.c();
        try {
            runnable.run();
            workDatabase.o();
            if (zE) {
                return;
            }
            R1.j.b(c0118a, workDatabase, list);
        } finally {
            workDatabase.k();
        }
    }

    public static int B(c0 c0Var, int i, byte[] bArr, int i5, int i6, InterfaceC0345z interfaceC0345z, C0324d c0324d) throws com.google.crypto.tink.shaded.protobuf.C {
        Object objC = c0Var.c();
        int iJ0 = j0(objC, c0Var, bArr, i5, i6, c0324d);
        c0Var.d(objC);
        c0324d.f5189c = objC;
        interfaceC0345z.add(objC);
        while (iJ0 < i6) {
            int iT = T(bArr, iJ0, c0324d);
            if (i != c0324d.f5187a) {
                break;
            }
            Object objC2 = c0Var.c();
            int iJ02 = j0(objC2, c0Var, bArr, iT, i6, c0324d);
            c0Var.d(objC2);
            c0324d.f5189c = objC2;
            interfaceC0345z.add(objC2);
            iJ0 = iJ02;
        }
        return iJ0;
    }

    public static Object B0(Object obj) {
        if (obj == null) {
            return JSONObject.NULL;
        }
        if ((obj instanceof JSONArray) || (obj instanceof JSONObject) || obj.equals(JSONObject.NULL)) {
            return obj;
        }
        if (obj instanceof Collection) {
            JSONArray jSONArray = new JSONArray();
            Iterator it = ((Collection) obj).iterator();
            while (it.hasNext()) {
                jSONArray.put(B0(it.next()));
            }
            return jSONArray;
        }
        if (obj.getClass().isArray()) {
            JSONArray jSONArray2 = new JSONArray();
            int length = Array.getLength(obj);
            for (int i = 0; i < length; i++) {
                jSONArray2.put(B0(Array.get(obj, i)));
            }
            return jSONArray2;
        }
        if (obj instanceof Map) {
            JSONObject jSONObject = new JSONObject();
            for (Map.Entry entry : ((Map) obj).entrySet()) {
                jSONObject.put((String) entry.getKey(), B0(entry.getValue()));
            }
            return jSONObject;
        }
        if (!(obj instanceof Boolean) && !(obj instanceof Byte) && !(obj instanceof Character) && !(obj instanceof Double) && !(obj instanceof Float) && !(obj instanceof Integer) && !(obj instanceof Long) && !(obj instanceof Short) && !(obj instanceof String)) {
            if (obj.getClass().getPackage().getName().startsWith("java.")) {
                return obj.toString();
            }
            return null;
        }
        return obj;
    }

    public static int C(byte[] bArr, int i, InterfaceC0345z interfaceC0345z, C0324d c0324d) throws com.google.crypto.tink.shaded.protobuf.C {
        AbstractC0325e abstractC0325e = (AbstractC0325e) interfaceC0345z;
        int iT = T(bArr, i, c0324d);
        int i5 = c0324d.f5187a + iT;
        while (iT < i5) {
            iT = V(bArr, iT, c0324d);
            abstractC0325e.h(c0324d.f5188b != 0);
        }
        if (iT == i5) {
            return iT;
        }
        throw com.google.crypto.tink.shaded.protobuf.C.g();
    }

    public static ArrayList C0(Throwable th) {
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(th.toString());
        arrayList.add(th.getClass().getSimpleName());
        arrayList.add("Cause: " + th.getCause() + ", Stacktrace: " + Log.getStackTraceString(th));
        return arrayList;
    }

    public static int D(byte[] bArr, int i, InterfaceC0345z interfaceC0345z, C0324d c0324d) throws com.google.crypto.tink.shaded.protobuf.C {
        AbstractC0333m abstractC0333m = (AbstractC0333m) interfaceC0345z;
        int iT = T(bArr, i, c0324d);
        int i5 = c0324d.f5187a + iT;
        while (iT < i5) {
            abstractC0333m.h(Double.longBitsToDouble(w(iT, bArr)));
            iT += 8;
        }
        if (iT == i5) {
            return iT;
        }
        throw com.google.crypto.tink.shaded.protobuf.C.g();
    }

    public static void D0(Parcel parcel, Parcelable parcelable, int i) {
        if (parcelable == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcelable.writeToParcel(parcel, i);
        }
    }

    public static int E(byte[] bArr, int i, InterfaceC0345z interfaceC0345z, C0324d c0324d) throws com.google.crypto.tink.shaded.protobuf.C {
        AbstractC0343x abstractC0343x = (AbstractC0343x) interfaceC0345z;
        int iT = T(bArr, i, c0324d);
        int i5 = c0324d.f5187a + iT;
        while (iT < i5) {
            abstractC0343x.h(u(iT, bArr));
            iT += 4;
        }
        if (iT == i5) {
            return iT;
        }
        throw com.google.crypto.tink.shaded.protobuf.C.g();
    }

    public static int F(byte[] bArr, int i, InterfaceC0345z interfaceC0345z, C0324d c0324d) throws com.google.crypto.tink.shaded.protobuf.C {
        J j5 = (J) interfaceC0345z;
        int iT = T(bArr, i, c0324d);
        int i5 = c0324d.f5187a + iT;
        while (iT < i5) {
            j5.h(w(iT, bArr));
            iT += 8;
        }
        if (iT == i5) {
            return iT;
        }
        throw com.google.crypto.tink.shaded.protobuf.C.g();
    }

    public static int G(byte[] bArr, int i, InterfaceC0345z interfaceC0345z, C0324d c0324d) throws com.google.crypto.tink.shaded.protobuf.C {
        AbstractC0338s abstractC0338s = (AbstractC0338s) interfaceC0345z;
        int iT = T(bArr, i, c0324d);
        int i5 = c0324d.f5187a + iT;
        while (iT < i5) {
            abstractC0338s.h(Float.intBitsToFloat(u(iT, bArr)));
            iT += 4;
        }
        if (iT == i5) {
            return iT;
        }
        throw com.google.crypto.tink.shaded.protobuf.C.g();
    }

    public static int H(byte[] bArr, int i, InterfaceC0345z interfaceC0345z, C0324d c0324d) throws com.google.crypto.tink.shaded.protobuf.C {
        AbstractC0343x abstractC0343x = (AbstractC0343x) interfaceC0345z;
        int iT = T(bArr, i, c0324d);
        int i5 = c0324d.f5187a + iT;
        while (iT < i5) {
            iT = T(bArr, iT, c0324d);
            abstractC0343x.h(AbstractC0218j.d(c0324d.f5187a));
        }
        if (iT == i5) {
            return iT;
        }
        throw com.google.crypto.tink.shaded.protobuf.C.g();
    }

    public static int I(byte[] bArr, int i, InterfaceC0345z interfaceC0345z, C0324d c0324d) throws com.google.crypto.tink.shaded.protobuf.C {
        J j5 = (J) interfaceC0345z;
        int iT = T(bArr, i, c0324d);
        int i5 = c0324d.f5187a + iT;
        while (iT < i5) {
            iT = V(bArr, iT, c0324d);
            j5.h(AbstractC0218j.e(c0324d.f5188b));
        }
        if (iT == i5) {
            return iT;
        }
        throw com.google.crypto.tink.shaded.protobuf.C.g();
    }

    public static int J(byte[] bArr, int i, InterfaceC0345z interfaceC0345z, C0324d c0324d) throws com.google.crypto.tink.shaded.protobuf.C {
        AbstractC0343x abstractC0343x = (AbstractC0343x) interfaceC0345z;
        int iT = T(bArr, i, c0324d);
        int i5 = c0324d.f5187a + iT;
        while (iT < i5) {
            iT = T(bArr, iT, c0324d);
            abstractC0343x.h(c0324d.f5187a);
        }
        if (iT == i5) {
            return iT;
        }
        throw com.google.crypto.tink.shaded.protobuf.C.g();
    }

    public static int K(byte[] bArr, int i, InterfaceC0345z interfaceC0345z, C0324d c0324d) throws com.google.crypto.tink.shaded.protobuf.C {
        J j5 = (J) interfaceC0345z;
        int iT = T(bArr, i, c0324d);
        int i5 = c0324d.f5187a + iT;
        while (iT < i5) {
            iT = V(bArr, iT, c0324d);
            j5.h(c0324d.f5188b);
        }
        if (iT == i5) {
            return iT;
        }
        throw com.google.crypto.tink.shaded.protobuf.C.g();
    }

    public static int L(int i, byte[] bArr, int i5, int i6, InterfaceC0345z interfaceC0345z, C0324d c0324d) {
        AbstractC0343x abstractC0343x = (AbstractC0343x) interfaceC0345z;
        int iT = T(bArr, i5, c0324d);
        abstractC0343x.h(AbstractC0218j.d(c0324d.f5187a));
        while (iT < i6) {
            int iT2 = T(bArr, iT, c0324d);
            if (i != c0324d.f5187a) {
                break;
            }
            iT = T(bArr, iT2, c0324d);
            abstractC0343x.h(AbstractC0218j.d(c0324d.f5187a));
        }
        return iT;
    }

    public static int M(int i, byte[] bArr, int i5, int i6, InterfaceC0345z interfaceC0345z, C0324d c0324d) {
        J j5 = (J) interfaceC0345z;
        int iV = V(bArr, i5, c0324d);
        j5.h(AbstractC0218j.e(c0324d.f5188b));
        while (iV < i6) {
            int iT = T(bArr, iV, c0324d);
            if (i != c0324d.f5187a) {
                break;
            }
            iV = V(bArr, iT, c0324d);
            j5.h(AbstractC0218j.e(c0324d.f5188b));
        }
        return iV;
    }

    public static int N(byte[] bArr, int i, C0324d c0324d) throws com.google.crypto.tink.shaded.protobuf.C {
        int iT = T(bArr, i, c0324d);
        int i5 = c0324d.f5187a;
        if (i5 < 0) {
            throw com.google.crypto.tink.shaded.protobuf.C.e();
        }
        if (i5 == 0) {
            c0324d.f5189c = "";
            return iT;
        }
        c0324d.f5189c = new String(bArr, iT, i5, com.google.crypto.tink.shaded.protobuf.A.f5128a);
        return iT + i5;
    }

    public static int O(int i, byte[] bArr, int i5, int i6, InterfaceC0345z interfaceC0345z, C0324d c0324d) throws com.google.crypto.tink.shaded.protobuf.C {
        int iT = T(bArr, i5, c0324d);
        int i7 = c0324d.f5187a;
        if (i7 < 0) {
            throw com.google.crypto.tink.shaded.protobuf.C.e();
        }
        if (i7 == 0) {
            interfaceC0345z.add("");
        } else {
            interfaceC0345z.add(new String(bArr, iT, i7, com.google.crypto.tink.shaded.protobuf.A.f5128a));
            iT += i7;
        }
        while (iT < i6) {
            int iT2 = T(bArr, iT, c0324d);
            if (i != c0324d.f5187a) {
                break;
            }
            iT = T(bArr, iT2, c0324d);
            int i8 = c0324d.f5187a;
            if (i8 < 0) {
                throw com.google.crypto.tink.shaded.protobuf.C.e();
            }
            if (i8 == 0) {
                interfaceC0345z.add("");
            } else {
                interfaceC0345z.add(new String(bArr, iT, i8, com.google.crypto.tink.shaded.protobuf.A.f5128a));
                iT += i8;
            }
        }
        return iT;
    }

    public static int P(int i, byte[] bArr, int i5, int i6, InterfaceC0345z interfaceC0345z, C0324d c0324d) throws com.google.crypto.tink.shaded.protobuf.C {
        int iT = T(bArr, i5, c0324d);
        int i7 = c0324d.f5187a;
        if (i7 < 0) {
            throw com.google.crypto.tink.shaded.protobuf.C.e();
        }
        if (i7 == 0) {
            interfaceC0345z.add("");
        } else {
            int i8 = iT + i7;
            if (r0.f5248a.J(bArr, iT, i8) != 0) {
                throw com.google.crypto.tink.shaded.protobuf.C.b();
            }
            interfaceC0345z.add(new String(bArr, iT, i7, com.google.crypto.tink.shaded.protobuf.A.f5128a));
            iT = i8;
        }
        while (iT < i6) {
            int iT2 = T(bArr, iT, c0324d);
            if (i != c0324d.f5187a) {
                break;
            }
            iT = T(bArr, iT2, c0324d);
            int i9 = c0324d.f5187a;
            if (i9 < 0) {
                throw com.google.crypto.tink.shaded.protobuf.C.e();
            }
            if (i9 == 0) {
                interfaceC0345z.add("");
            } else {
                int i10 = iT + i9;
                if (r0.f5248a.J(bArr, iT, i10) != 0) {
                    throw com.google.crypto.tink.shaded.protobuf.C.b();
                }
                interfaceC0345z.add(new String(bArr, iT, i9, com.google.crypto.tink.shaded.protobuf.A.f5128a));
                iT = i10;
            }
        }
        return iT;
    }

    public static int Q(byte[] bArr, int i, C0324d c0324d) throws com.google.crypto.tink.shaded.protobuf.C {
        int iT = T(bArr, i, c0324d);
        int i5 = c0324d.f5187a;
        if (i5 < 0) {
            throw com.google.crypto.tink.shaded.protobuf.C.e();
        }
        if (i5 == 0) {
            c0324d.f5189c = "";
            return iT;
        }
        c0324d.f5189c = r0.f5248a.t(bArr, iT, i5);
        return iT + i5;
    }

    public static int R(int i, byte[] bArr, int i5, int i6, f0 f0Var, C0324d c0324d) throws com.google.crypto.tink.shaded.protobuf.C {
        if ((i >>> 3) == 0) {
            throw com.google.crypto.tink.shaded.protobuf.C.a();
        }
        int i7 = i & 7;
        if (i7 == 0) {
            int iV = V(bArr, i5, c0324d);
            f0Var.d(i, Long.valueOf(c0324d.f5188b));
            return iV;
        }
        if (i7 == 1) {
            f0Var.d(i, Long.valueOf(w(i5, bArr)));
            return i5 + 8;
        }
        if (i7 == 2) {
            int iT = T(bArr, i5, c0324d);
            int i8 = c0324d.f5187a;
            if (i8 < 0) {
                throw com.google.crypto.tink.shaded.protobuf.C.e();
            }
            if (i8 > bArr.length - iT) {
                throw com.google.crypto.tink.shaded.protobuf.C.g();
            }
            if (i8 == 0) {
                f0Var.d(i, AbstractC0329i.f5205m);
            } else {
                f0Var.d(i, AbstractC0329i.h(bArr, iT, i8));
            }
            return iT + i8;
        }
        if (i7 != 3) {
            if (i7 != 5) {
                throw com.google.crypto.tink.shaded.protobuf.C.a();
            }
            f0Var.d(i, Integer.valueOf(u(i5, bArr)));
            return i5 + 4;
        }
        f0 f0VarC = f0.c();
        int i9 = (i & (-8)) | 4;
        int i10 = 0;
        while (true) {
            if (i5 >= i6) {
                break;
            }
            int iT2 = T(bArr, i5, c0324d);
            int i11 = c0324d.f5187a;
            if (i11 == i9) {
                i10 = i11;
                i5 = iT2;
                break;
            }
            i10 = i11;
            i5 = R(i11, bArr, iT2, i6, f0VarC, c0324d);
        }
        if (i5 > i6 || i10 != i9) {
            throw com.google.crypto.tink.shaded.protobuf.C.f();
        }
        f0Var.d(i, f0VarC);
        return i5;
    }

    public static int S(int i, byte[] bArr, int i5, C0324d c0324d) {
        int i6 = i & 127;
        int i7 = i5 + 1;
        byte b4 = bArr[i5];
        if (b4 >= 0) {
            c0324d.f5187a = i6 | (b4 << 7);
            return i7;
        }
        int i8 = i6 | ((b4 & 127) << 7);
        int i9 = i5 + 2;
        byte b5 = bArr[i7];
        if (b5 >= 0) {
            c0324d.f5187a = i8 | (b5 << 14);
            return i9;
        }
        int i10 = i8 | ((b5 & 127) << 14);
        int i11 = i5 + 3;
        byte b6 = bArr[i9];
        if (b6 >= 0) {
            c0324d.f5187a = i10 | (b6 << 21);
            return i11;
        }
        int i12 = i10 | ((b6 & 127) << 21);
        int i13 = i5 + 4;
        byte b7 = bArr[i11];
        if (b7 >= 0) {
            c0324d.f5187a = i12 | (b7 << 28);
            return i13;
        }
        int i14 = i12 | ((b7 & 127) << 28);
        while (true) {
            int i15 = i13 + 1;
            if (bArr[i13] >= 0) {
                c0324d.f5187a = i14;
                return i15;
            }
            i13 = i15;
        }
    }

    public static int T(byte[] bArr, int i, C0324d c0324d) {
        int i5 = i + 1;
        byte b4 = bArr[i];
        if (b4 < 0) {
            return S(b4, bArr, i5, c0324d);
        }
        c0324d.f5187a = b4;
        return i5;
    }

    public static int U(int i, byte[] bArr, int i5, int i6, InterfaceC0345z interfaceC0345z, C0324d c0324d) {
        AbstractC0343x abstractC0343x = (AbstractC0343x) interfaceC0345z;
        int iT = T(bArr, i5, c0324d);
        abstractC0343x.h(c0324d.f5187a);
        while (iT < i6) {
            int iT2 = T(bArr, iT, c0324d);
            if (i != c0324d.f5187a) {
                break;
            }
            iT = T(bArr, iT2, c0324d);
            abstractC0343x.h(c0324d.f5187a);
        }
        return iT;
    }

    public static int V(byte[] bArr, int i, C0324d c0324d) {
        int i5 = i + 1;
        long j5 = bArr[i];
        if (j5 >= 0) {
            c0324d.f5188b = j5;
            return i5;
        }
        int i6 = i + 2;
        byte b4 = bArr[i5];
        long j6 = (j5 & 127) | (((long) (b4 & 127)) << 7);
        int i7 = 7;
        while (b4 < 0) {
            int i8 = i6 + 1;
            byte b5 = bArr[i6];
            i7 += 7;
            j6 |= ((long) (b5 & 127)) << i7;
            b4 = b5;
            i6 = i8;
        }
        c0324d.f5188b = j6;
        return i6;
    }

    public static int W(int i, byte[] bArr, int i5, int i6, InterfaceC0345z interfaceC0345z, C0324d c0324d) {
        J j5 = (J) interfaceC0345z;
        int iV = V(bArr, i5, c0324d);
        j5.h(c0324d.f5188b);
        while (iV < i6) {
            int iT = T(bArr, iV, c0324d);
            if (i != c0324d.f5187a) {
                break;
            }
            iV = V(bArr, iT, c0324d);
            j5.h(c0324d.f5188b);
        }
        return iV;
    }

    public static boolean X(View view, KeyEvent keyEvent) {
        ArrayList arrayList;
        int size;
        int iIndexOfKey;
        Field field = I.f300a;
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        ArrayList arrayList2 = H.f296d;
        H h2 = (H) view.getTag(R.id.tag_unhandled_key_event_manager);
        WeakReference weakReference = null;
        if (h2 == null) {
            h2 = new H();
            h2.f297a = null;
            h2.f298b = null;
            h2.f299c = null;
            view.setTag(R.id.tag_unhandled_key_event_manager, h2);
        }
        WeakReference weakReference2 = h2.f299c;
        if (weakReference2 != null && weakReference2.get() == keyEvent) {
            return false;
        }
        h2.f299c = new WeakReference(keyEvent);
        if (h2.f298b == null) {
            h2.f298b = new SparseArray();
        }
        SparseArray sparseArray = h2.f298b;
        if (keyEvent.getAction() == 1 && (iIndexOfKey = sparseArray.indexOfKey(keyEvent.getKeyCode())) >= 0) {
            weakReference = (WeakReference) sparseArray.valueAt(iIndexOfKey);
            sparseArray.removeAt(iIndexOfKey);
        }
        if (weakReference == null) {
            weakReference = (WeakReference) sparseArray.get(keyEvent.getKeyCode());
        }
        if (weakReference == null) {
            return false;
        }
        View view2 = (View) weakReference.get();
        if (view2 == null || !view2.isAttachedToWindow() || (arrayList = (ArrayList) view2.getTag(R.id.tag_unhandled_key_listeners)) == null || (size = arrayList.size() - 1) < 0) {
            return true;
        }
        arrayList.get(size).getClass();
        throw new ClassCastException();
    }

    public static InvocationHandler Y() {
        ClassLoader classLoader;
        if (Build.VERSION.SDK_INT >= 28) {
            classLoader = WebView.getWebViewClassLoader();
        } else {
            try {
                Method declaredMethod = WebView.class.getDeclaredMethod("getFactory", null);
                declaredMethod.setAccessible(true);
                classLoader = declaredMethod.invoke(null, null).getClass().getClassLoader();
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException e5) {
                throw new RuntimeException(e5);
            }
        }
        return (InvocationHandler) Class.forName("org.chromium.support_lib_glue.SupportLibReflectionUtil", false, classLoader).getDeclaredMethod("createWebViewProviderFactory", null).invoke(null, null);
    }

    public static int Z(byte[] bArr) {
        boolean z4 = bArr.length >= 4;
        int length = bArr.length;
        if (!z4) {
            throw new IllegalArgumentException(g0("array too small: %s < %s", Integer.valueOf(length), 4));
        }
        return (bArr[3] & 255) | (bArr[0] << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8);
    }

    public static X3.d a(int i, int i5, int i6) {
        X3.d oVar;
        if ((i6 & 2) != 0) {
            i5 = 1;
        }
        if (i != -2) {
            if (i == -1) {
                if (i5 == 1) {
                    return new X3.o(1, 2, null);
                }
                throw new IllegalArgumentException("CONFLATED capacity cannot be used with non-default onBufferOverflow");
            }
            if (i != 0) {
                return i != Integer.MAX_VALUE ? i5 == 1 ? new X3.d(i, null) : new X3.o(i, i5, null) : new X3.d(Integer.MAX_VALUE, null);
            }
            oVar = i5 == 1 ? new X3.d(0, null) : new X3.o(1, i5, null);
        } else if (i5 == 1) {
            X3.h.f2666g.getClass();
            oVar = new X3.d(X3.g.f2665b, null);
        } else {
            oVar = new X3.o(1, i5, null);
        }
        return oVar;
    }

    public static int a0(int i, int i5, int i6, int[] iArr) {
        while (i5 < i6) {
            if (iArr[i5] == i) {
                return i5;
            }
            i5++;
        }
        return -1;
    }

    public static Object b(Parcel parcel, Parcelable.Creator creator) {
        if (parcel.readInt() != 0) {
            return creator.createFromParcel(parcel);
        }
        return null;
    }

    public static final int b0(int i) {
        if (i == 0) {
            return 1;
        }
        if (i == 1) {
            return 2;
        }
        throw new IllegalArgumentException(AbstractC0307a.h(i, "Could not convert ", " to BackoffPolicy"));
    }

    public static final ExecutorService c(boolean z4) {
        ExecutorService executorServiceNewFixedThreadPool = Executors.newFixedThreadPool(Math.max(2, Math.min(Runtime.getRuntime().availableProcessors() - 1, 4)), new ThreadFactoryC0119b(z4));
        N3.h.d(executorServiceNewFixedThreadPool, "newFixedThreadPool(\n    …)),\n        factory\n    )");
        return executorServiceNewFixedThreadPool;
    }

    public static final int c0(int i) {
        if (i == 0) {
            return 1;
        }
        int i5 = 2;
        if (i != 1) {
            if (i == 2) {
                return 3;
            }
            i5 = 4;
            if (i != 3) {
                if (i == 4) {
                    return 5;
                }
                if (Build.VERSION.SDK_INT < 30 || i != 5) {
                    throw new IllegalArgumentException(AbstractC0307a.h(i, "Could not convert ", " to NetworkType"));
                }
                return 6;
            }
        }
        return i5;
    }

    public static List d(int... iArr) {
        return iArr.length == 0 ? Collections.emptyList() : new C0728b(0, iArr.length, iArr);
    }

    public static final int d0(int i) {
        if (i == 0) {
            return 1;
        }
        if (i == 1) {
            return 2;
        }
        throw new IllegalArgumentException(AbstractC0307a.h(i, "Could not convert ", " to OutOfQuotaPolicy"));
    }

    public static final LinkedHashSet e(byte[] bArr) throws IOException {
        ObjectInputStream objectInputStream;
        N3.h.e(bArr, "bytes");
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        if (bArr.length == 0) {
            return linkedHashSet;
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        try {
            try {
                objectInputStream = new ObjectInputStream(byteArrayInputStream);
            } finally {
            }
        } catch (IOException e5) {
            e5.printStackTrace();
        }
        try {
            int i = objectInputStream.readInt();
            for (int i5 = 0; i5 < i; i5++) {
                Uri uri = Uri.parse(objectInputStream.readUTF());
                boolean z4 = objectInputStream.readBoolean();
                N3.h.d(uri, "uri");
                linkedHashSet.add(new C0120c(z4, uri));
            }
            Z1.f.f(objectInputStream, null);
            Z1.f.f(byteArrayInputStream, null);
            return linkedHashSet;
        } finally {
        }
    }

    public static final int e0(int i) {
        if (i == 0) {
            return 1;
        }
        int i5 = 2;
        if (i != 1) {
            if (i == 2) {
                return 3;
            }
            i5 = 4;
            if (i != 3) {
                if (i == 4) {
                    return 5;
                }
                if (i == 5) {
                    return 6;
                }
                throw new IllegalArgumentException(AbstractC0307a.h(i, "Could not convert ", " to State"));
            }
        }
        return i5;
    }

    public static void f(int i, int i5, int i6) {
        if (i >= 0 && i5 <= i6) {
            if (i > i5) {
                throw new IllegalArgumentException(AbstractC0307a.g(i, i5, "fromIndex: ", " > toIndex: "));
            }
            return;
        }
        throw new IndexOutOfBoundsException("fromIndex: " + i + ", toIndex: " + i5 + ", size: " + i6);
    }

    public static boolean f0(String str) {
        F1.b bVar = F1.j.f856a;
        Set<F1.d> setUnmodifiableSet = Collections.unmodifiableSet(F1.c.f849c);
        HashSet hashSet = new HashSet();
        for (F1.d dVar : setUnmodifiableSet) {
            if (((F1.c) dVar).f850a.equals(str)) {
                hashSet.add(dVar);
            }
        }
        if (hashSet.isEmpty()) {
            throw new RuntimeException("Unknown feature ".concat(str));
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            F1.c cVar = (F1.c) ((F1.d) it.next());
            if (cVar.a() || cVar.b()) {
                return true;
            }
        }
        return false;
    }

    public static int g(long j5) {
        int i = (int) j5;
        D1.b.k(((long) i) == j5, "Out of range: %s", j5);
        return i;
    }

    public static String g0(String str, Object... objArr) {
        int iIndexOf;
        String string;
        int i = 0;
        for (int i5 = 0; i5 < objArr.length; i5++) {
            Object obj = objArr[i5];
            if (obj == null) {
                string = "null";
            } else {
                try {
                    string = obj.toString();
                } catch (Exception e5) {
                    String str2 = obj.getClass().getName() + '@' + Integer.toHexString(System.identityHashCode(obj));
                    Logger.getLogger("com.google.common.base.Strings").log(Level.WARNING, "Exception during lenientFormat for " + str2, (Throwable) e5);
                    StringBuilder sbM = AbstractC0307a.m("<", str2, " threw ");
                    sbM.append(e5.getClass().getName());
                    sbM.append(">");
                    string = sbM.toString();
                }
            }
            objArr[i5] = string;
        }
        StringBuilder sb = new StringBuilder((objArr.length * 16) + str.length());
        int i6 = 0;
        while (i < objArr.length && (iIndexOf = str.indexOf("%s", i6)) != -1) {
            sb.append((CharSequence) str, i6, iIndexOf);
            sb.append(objArr[i]);
            i6 = iIndexOf + 2;
            i++;
        }
        sb.append((CharSequence) str, i6, str.length());
        if (i < objArr.length) {
            sb.append(" [");
            sb.append(objArr[i]);
            for (int i7 = i + 1; i7 < objArr.length; i7++) {
                sb.append(", ");
                sb.append(objArr[i7]);
            }
            sb.append(']');
        }
        return sb.toString();
    }

    public static byte[] h(byte[] bArr, byte[] bArr2) {
        if (bArr.length != 32) {
            throw new IllegalArgumentException("The key length in bytes must be 32.");
        }
        byte b4 = 0;
        long jH0 = h0(0, bArr) & 67108863;
        long jH02 = (h0(3, bArr) >> 2) & 67108611;
        long jH03 = (h0(6, bArr) >> 4) & 67092735;
        long jH04 = (h0(9, bArr) >> 6) & 66076671;
        long jH05 = (h0(12, bArr) >> 8) & 1048575;
        long j5 = jH02 * 5;
        long j6 = jH03 * 5;
        long j7 = jH04 * 5;
        long j8 = jH05 * 5;
        int i = 17;
        byte[] bArr3 = new byte[17];
        long j9 = 0;
        int i5 = 0;
        long j10 = 0;
        long j11 = 0;
        long j12 = 0;
        long j13 = 0;
        while (i5 < bArr2.length) {
            int iMin = Math.min(16, bArr2.length - i5);
            System.arraycopy(bArr2, i5, bArr3, b4, iMin);
            bArr3[iMin] = 1;
            if (iMin != 16) {
                Arrays.fill(bArr3, iMin + 1, i, b4);
            }
            long jH06 = j13 + (h0(b4, bArr3) & 67108863);
            long jH07 = j9 + ((h0(3, bArr3) >> 2) & 67108863);
            long jH08 = j10 + ((h0(6, bArr3) >> 4) & 67108863);
            long jH09 = j11 + ((h0(9, bArr3) >> 6) & 67108863);
            long jH010 = j12 + (((h0(12, bArr3) >> 8) & 67108863) | ((long) (bArr3[16] << 24)));
            long j14 = (jH010 * j5) + (jH09 * j6) + (jH08 * j7) + (jH07 * j8) + (jH06 * jH0);
            long j15 = (jH010 * j6) + (jH09 * j7) + (jH08 * j8) + (jH07 * jH0) + (jH06 * jH02);
            long j16 = (jH010 * j7) + (jH09 * j8) + (jH08 * jH0) + (jH07 * jH02) + (jH06 * jH03);
            long j17 = (jH010 * j8) + (jH09 * jH0) + (jH08 * jH02) + (jH07 * jH03) + (jH06 * jH04);
            long j18 = jH09 * jH02;
            long j19 = jH010 * jH0;
            long j20 = j15 + (j14 >> 26);
            long j21 = j16 + (j20 >> 26);
            long j22 = j17 + (j21 >> 26);
            long j23 = j19 + j18 + (jH08 * jH03) + (jH07 * jH04) + (jH06 * jH05) + (j22 >> 26);
            long j24 = j23 >> 26;
            j12 = j23 & 67108863;
            long j25 = (j24 * 5) + (j14 & 67108863);
            long j26 = j25 & 67108863;
            j9 = (j20 & 67108863) + (j25 >> 26);
            i5 += 16;
            j10 = j21 & 67108863;
            j11 = j22 & 67108863;
            b4 = 0;
            i = 17;
            j13 = j26;
        }
        long j27 = j10 + (j9 >> 26);
        long j28 = j27 & 67108863;
        long j29 = j11 + (j27 >> 26);
        long j30 = j29 & 67108863;
        long j31 = j12 + (j29 >> 26);
        long j32 = j31 & 67108863;
        long j33 = ((j31 >> 26) * 5) + j13;
        long j34 = j33 >> 26;
        long j35 = j33 & 67108863;
        long j36 = (j9 & 67108863) + j34;
        long j37 = j35 + 5;
        long j38 = j37 & 67108863;
        long j39 = j36 + (j37 >> 26);
        long j40 = j28 + (j39 >> 26);
        long j41 = j30 + (j40 >> 26);
        long j42 = (j32 + (j41 >> 26)) - 67108864;
        long j43 = j42 >> 63;
        long j44 = ~j43;
        long j45 = (j36 & j43) | (j39 & 67108863 & j44);
        long j46 = (j28 & j43) | (j40 & 67108863 & j44);
        long j47 = (j30 & j43) | (j41 & 67108863 & j44);
        long j48 = ((j35 & j43) | (j38 & j44) | (j45 << 26)) & 4294967295L;
        long j49 = ((j45 >> 6) | (j46 << 20)) & 4294967295L;
        long j50 = ((j46 >> 12) | (j47 << 14)) & 4294967295L;
        long j51 = ((((j42 & j44) | (j32 & j43)) << 8) | (j47 >> 18)) & 4294967295L;
        long jH011 = h0(16, bArr) + j48;
        long jH012 = h0(20, bArr) + j49 + (jH011 >> 32);
        long jH013 = h0(24, bArr) + j50 + (jH012 >> 32);
        long jH014 = (h0(28, bArr) + j51 + (jH013 >> 32)) & 4294967295L;
        byte[] bArr4 = new byte[16];
        y0(bArr4, jH011 & 4294967295L, 0);
        y0(bArr4, jH012 & 4294967295L, 4);
        y0(bArr4, jH013 & 4294967295L, 8);
        y0(bArr4, jH014, 12);
        return bArr4;
    }

    public static long h0(int i, byte[] bArr) {
        return ((long) (((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16))) & 4294967295L;
    }

    public static int i(C0750A c0750a, L0.e eVar, View view, View view2, AbstractC0778s abstractC0778s, boolean z4) {
        if (abstractC0778s.p() == 0 || c0750a.a() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (z4) {
            return Math.min(eVar.i(), eVar.c(view2) - eVar.d(view));
        }
        ((C0779t) view.getLayoutParams()).getClass();
        throw null;
    }

    public static int i0(Object obj, c0 c0Var, byte[] bArr, int i, int i5, int i6, C0324d c0324d) {
        int iJ = ((T) c0Var).J(obj, bArr, i, i5, i6, c0324d);
        c0324d.f5189c = obj;
        return iJ;
    }

    public static int j(C0750A c0750a, L0.e eVar, View view, View view2, AbstractC0778s abstractC0778s, boolean z4) {
        if (abstractC0778s.p() == 0 || c0750a.a() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z4) {
            return c0750a.a();
        }
        eVar.c(view2);
        eVar.d(view);
        ((C0779t) view.getLayoutParams()).getClass();
        throw null;
    }

    public static int j0(Object obj, c0 c0Var, byte[] bArr, int i, int i5, C0324d c0324d) throws com.google.crypto.tink.shaded.protobuf.C {
        int iS = i + 1;
        int i6 = bArr[i];
        if (i6 < 0) {
            iS = S(i6, bArr, iS, c0324d);
            i6 = c0324d.f5187a;
        }
        int i7 = iS;
        if (i6 < 0 || i6 > i5 - i7) {
            throw com.google.crypto.tink.shaded.protobuf.C.g();
        }
        int i8 = i6 + i7;
        c0Var.g(obj, bArr, i7, i8, c0324d);
        c0324d.f5189c = obj;
        return i8;
    }

    public static final long k(FileInputStream fileInputStream, OutputStream outputStream, int i) throws IOException {
        byte[] bArr = new byte[i];
        int i5 = fileInputStream.read(bArr);
        long j5 = 0;
        while (i5 >= 0) {
            outputStream.write(bArr, 0, i5);
            j5 += (long) i5;
            i5 = fileInputStream.read(bArr);
        }
        return j5;
    }

    public static final int k0(int i) {
        AbstractC0307a.r("networkType", i);
        int iB = O.i.b(i);
        if (iB == 0) {
            return 0;
        }
        if (iB == 1) {
            return 1;
        }
        if (iB == 2) {
            return 2;
        }
        if (iB == 3) {
            return 3;
        }
        if (iB == 4) {
            return 4;
        }
        if (Build.VERSION.SDK_INT >= 30 && i == 6) {
            return 5;
        }
        throw new IllegalArgumentException("Could not convert " + AbstractC0307a.v(i) + " to int");
    }

    public static byte[] l(byte[] bArr) {
        if (bArr.length != 16) {
            throw new IllegalArgumentException("value must be a block.");
        }
        byte[] bArr2 = new byte[16];
        for (int i = 0; i < 16; i++) {
            byte b4 = (byte) ((bArr[i] << 1) & 254);
            bArr2[i] = b4;
            if (i < 15) {
                bArr2[i] = (byte) (((byte) ((bArr[i + 1] >> 7) & 1)) | b4);
            }
        }
        bArr2[15] = (byte) (((byte) ((bArr[0] >> 7) & 135)) ^ bArr2[15]);
        return bArr2;
    }

    public static final Cursor l0(WorkDatabase workDatabase, s1.j jVar, boolean z4) {
        N3.h.e(workDatabase, "db");
        Cursor cursorM = workDatabase.m(jVar, null);
        if (z4 && (cursorM instanceof AbstractWindowedCursor)) {
            AbstractWindowedCursor abstractWindowedCursor = (AbstractWindowedCursor) cursorM;
            int count = abstractWindowedCursor.getCount();
            if ((abstractWindowedCursor.hasWindow() ? abstractWindowedCursor.getWindow().getNumRows() : count) < count) {
                N3.h.e(cursorM, "c");
                try {
                    MatrixCursor matrixCursor = new MatrixCursor(cursorM.getColumnNames(), cursorM.getCount());
                    while (cursorM.moveToNext()) {
                        Object[] objArr = new Object[cursorM.getColumnCount()];
                        int columnCount = cursorM.getColumnCount();
                        for (int i = 0; i < columnCount; i++) {
                            int type = cursorM.getType(i);
                            if (type == 0) {
                                objArr[i] = null;
                            } else if (type == 1) {
                                objArr[i] = Long.valueOf(cursorM.getLong(i));
                            } else if (type == 2) {
                                objArr[i] = Double.valueOf(cursorM.getDouble(i));
                            } else if (type == 3) {
                                objArr[i] = cursorM.getString(i);
                            } else {
                                if (type != 4) {
                                    throw new IllegalStateException();
                                }
                                objArr[i] = cursorM.getBlob(i);
                            }
                        }
                        matrixCursor.addRow(objArr);
                    }
                    Z1.f.f(cursorM, null);
                    return matrixCursor;
                } finally {
                }
            }
        }
        return cursorM;
    }

    public static int m0(M m4, int i, int i5, int i6) {
        AbstractC0360m.c(Math.max(Math.max(i, i5), i6) <= 31);
        int i7 = (1 << i) - 1;
        int i8 = (1 << i5) - 1;
        AbstractC0149a.h(AbstractC0149a.h(i7, i8), 1 << i6);
        if (m4.b() < i) {
            return -1;
        }
        int i9 = m4.i(i);
        if (i9 != i7) {
            return i9;
        }
        if (m4.b() < i5) {
            return -1;
        }
        int i10 = m4.i(i5);
        int i11 = i9 + i10;
        if (i10 != i8) {
            return i11;
        }
        if (m4.b() < i6) {
            return -1;
        }
        return i11 + m4.i(i6);
    }

    public static i0.j n0(Context context, C0448G c0448g, boolean z4, String str) {
        MediaMetricsManager mediaMetricsManagerE = S2.c.e(context.getSystemService("media_metrics"));
        i0.h hVar = mediaMetricsManagerE == null ? null : new i0.h(context, mediaMetricsManagerE.createPlaybackSession());
        if (hVar == null) {
            AbstractC0360m.y("ExoPlayerImpl", "MediaMetricsService unavailable.");
            return new i0.j(LogSessionId.LOG_SESSION_ID_NONE, str);
        }
        if (z4) {
            c0448g.getClass();
            i0.c cVar = c0448g.f5960r;
            cVar.getClass();
            cVar.f6367q.a(hVar);
        }
        return new i0.j(hVar.f6389c.getSessionId(), str);
    }

    public static Bitmap o(int i, byte[] bArr) throws IOException {
        int i5 = 0;
        Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, i, null);
        if (bitmapDecodeByteArray == null) {
            throw C0157H.a(new IllegalStateException(), "Could not decode image data");
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        try {
            T.g gVar = new T.g(byteArrayInputStream);
            byteArrayInputStream.close();
            T.c cVarC = gVar.c("Orientation");
            int iE = 1;
            if (cVarC != null) {
                try {
                    iE = cVarC.e(gVar.f2091f);
                } catch (NumberFormatException unused) {
                }
            }
            switch (iE) {
                case 3:
                case 4:
                    i5 = 180;
                    break;
                case 5:
                case O.j.BYTES_FIELD_NUMBER /* 8 */:
                    i5 = 270;
                    break;
                case O.j.STRING_SET_FIELD_NUMBER /* 6 */:
                case O.j.DOUBLE_FIELD_NUMBER /* 7 */:
                    i5 = 90;
                    break;
            }
            if (i5 == 0) {
                return bitmapDecodeByteArray;
            }
            Matrix matrix = new Matrix();
            matrix.postRotate(i5);
            return Bitmap.createBitmap(bitmapDecodeByteArray, 0, 0, bitmapDecodeByteArray.getWidth(), bitmapDecodeByteArray.getHeight(), matrix, false);
        } catch (Throwable th) {
            try {
                byteArrayInputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public static int o0(long j5) {
        if (j5 > 2147483647L) {
            return Integer.MAX_VALUE;
        }
        if (j5 < -2147483648L) {
            return Integer.MIN_VALUE;
        }
        return (int) j5;
    }

    public static int p(int i, byte[] bArr, int i5, int i6, InterfaceC0345z interfaceC0345z, C0324d c0324d) {
        AbstractC0325e abstractC0325e = (AbstractC0325e) interfaceC0345z;
        int iV = V(bArr, i5, c0324d);
        abstractC0325e.h(c0324d.f5188b != 0);
        while (iV < i6) {
            int iT = T(bArr, iV, c0324d);
            if (i != c0324d.f5187a) {
                break;
            }
            iV = V(bArr, iT, c0324d);
            abstractC0325e.h(c0324d.f5188b != 0);
        }
        return iV;
    }

    public static final byte[] p0(Set set) throws IOException {
        N3.h.e(set, "triggers");
        if (set.isEmpty()) {
            return new byte[0];
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
            try {
                objectOutputStream.writeInt(set.size());
                Iterator it = set.iterator();
                while (it.hasNext()) {
                    C0120c c0120c = (C0120c) it.next();
                    objectOutputStream.writeUTF(c0120c.f1806a.toString());
                    objectOutputStream.writeBoolean(c0120c.f1807b);
                }
                Z1.f.f(objectOutputStream, null);
                Z1.f.f(byteArrayOutputStream, null);
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                N3.h.d(byteArray, "outputStream.toByteArray()");
                return byteArray;
            } finally {
            }
        } finally {
        }
    }

    public static int q(byte[] bArr, int i, C0324d c0324d) throws com.google.crypto.tink.shaded.protobuf.C {
        int iT = T(bArr, i, c0324d);
        int i5 = c0324d.f5187a;
        if (i5 < 0) {
            throw com.google.crypto.tink.shaded.protobuf.C.e();
        }
        if (i5 > bArr.length - iT) {
            throw com.google.crypto.tink.shaded.protobuf.C.g();
        }
        if (i5 == 0) {
            c0324d.f5189c = AbstractC0329i.f5205m;
            return iT;
        }
        c0324d.f5189c = AbstractC0329i.h(bArr, iT, i5);
        return iT + i5;
    }

    public static void q0(InterfaceC0696f interfaceC0696f, final C1032c c1032c) {
        N3.h.e(interfaceC0696f, "binaryMessenger");
        B3.e eVar = C1034e.f11061b;
        Z1.i iVar = new Z1.i(interfaceC0696f, "dev.flutter.pigeon.webview_flutter_android.PigeonInternalInstanceManager.removeStrongReference", (InterfaceC0703m) eVar.a(), (C0200z) null);
        if (c1032c != null) {
            final int i = 0;
            iVar.E(new InterfaceC0692b() { // from class: y3.d
                @Override // n3.InterfaceC0692b
                public final void t(Object obj, Z1.l lVar) {
                    List listQ;
                    List listQ2;
                    switch (i) {
                        case 0:
                            C1032c c1032c2 = c1032c;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj2 = ((List) obj).get(0);
                            N3.h.c(obj2, "null cannot be cast to non-null type kotlin.Long");
                            Long l3 = (Long) obj2;
                            long jLongValue = l3.longValue();
                            try {
                                c1032c2.f();
                                Object objE = c1032c2.e(jLongValue);
                                if (objE instanceof Z) {
                                    ((Z) objE).destroy();
                                }
                                c1032c2.f11052d.remove(l3);
                                listQ = AbstractC0149a.y(null);
                            } catch (Throwable th) {
                                listQ = Z1.f.Q(th);
                            }
                            lVar.u(listQ);
                            break;
                        default:
                            C1032c c1032c3 = c1032c;
                            try {
                                c1032c3.f11050b.clear();
                                c1032c3.f11051c.clear();
                                c1032c3.f11052d.clear();
                                c1032c3.f11054f.clear();
                                listQ2 = AbstractC0149a.y(null);
                            } catch (Throwable th2) {
                                listQ2 = Z1.f.Q(th2);
                            }
                            lVar.u(listQ2);
                            break;
                    }
                }
            });
        } else {
            iVar.E(null);
        }
        Z1.i iVar2 = new Z1.i(interfaceC0696f, "dev.flutter.pigeon.webview_flutter_android.PigeonInternalInstanceManager.clear", (InterfaceC0703m) eVar.a(), (C0200z) null);
        if (c1032c == null) {
            iVar2.E(null);
        } else {
            final int i5 = 1;
            iVar2.E(new InterfaceC0692b() { // from class: y3.d
                @Override // n3.InterfaceC0692b
                public final void t(Object obj, Z1.l lVar) {
                    List listQ;
                    List listQ2;
                    switch (i5) {
                        case 0:
                            C1032c c1032c2 = c1032c;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj2 = ((List) obj).get(0);
                            N3.h.c(obj2, "null cannot be cast to non-null type kotlin.Long");
                            Long l3 = (Long) obj2;
                            long jLongValue = l3.longValue();
                            try {
                                c1032c2.f();
                                Object objE = c1032c2.e(jLongValue);
                                if (objE instanceof Z) {
                                    ((Z) objE).destroy();
                                }
                                c1032c2.f11052d.remove(l3);
                                listQ = AbstractC0149a.y(null);
                            } catch (Throwable th) {
                                listQ = Z1.f.Q(th);
                            }
                            lVar.u(listQ);
                            break;
                        default:
                            C1032c c1032c3 = c1032c;
                            try {
                                c1032c3.f11050b.clear();
                                c1032c3.f11051c.clear();
                                c1032c3.f11052d.clear();
                                c1032c3.f11054f.clear();
                                listQ2 = AbstractC0149a.y(null);
                            } catch (Throwable th2) {
                                listQ2 = Z1.f.Q(th2);
                            }
                            lVar.u(listQ2);
                            break;
                    }
                }
            });
        }
    }

    public static int r(int i, byte[] bArr, int i5, int i6, InterfaceC0345z interfaceC0345z, C0324d c0324d) throws com.google.crypto.tink.shaded.protobuf.C {
        int iT = T(bArr, i5, c0324d);
        int i7 = c0324d.f5187a;
        if (i7 < 0) {
            throw com.google.crypto.tink.shaded.protobuf.C.e();
        }
        if (i7 > bArr.length - iT) {
            throw com.google.crypto.tink.shaded.protobuf.C.g();
        }
        if (i7 == 0) {
            interfaceC0345z.add(AbstractC0329i.f5205m);
        } else {
            interfaceC0345z.add(AbstractC0329i.h(bArr, iT, i7));
            iT += i7;
        }
        while (iT < i6) {
            int iT2 = T(bArr, iT, c0324d);
            if (i != c0324d.f5187a) {
                break;
            }
            iT = T(bArr, iT2, c0324d);
            int i8 = c0324d.f5187a;
            if (i8 < 0) {
                throw com.google.crypto.tink.shaded.protobuf.C.e();
            }
            if (i8 > bArr.length - iT) {
                throw com.google.crypto.tink.shaded.protobuf.C.g();
            }
            if (i8 == 0) {
                interfaceC0345z.add(AbstractC0329i.f5205m);
            } else {
                interfaceC0345z.add(AbstractC0329i.h(bArr, iT, i8));
                iT += i8;
            }
        }
        return iT;
    }

    public static void r0(InterfaceC0696f interfaceC0696f, final C1039j c1039j) {
        A.e eVar;
        N3.h.e(interfaceC0696f, "binaryMessenger");
        InterfaceC0703m gVar = (c1039j == null || (eVar = c1039j.f11068a) == null) ? new defpackage.g(1) : eVar.e();
        Z1.i iVar = new Z1.i(interfaceC0696f, "dev.flutter.pigeon.webview_flutter_android.FlutterAssetManager.instance", gVar, (C0200z) null);
        if (c1039j != null) {
            final int i = 0;
            iVar.E(new InterfaceC0692b() { // from class: y3.z
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
                            N3.h.c(obj2, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue = ((Long) obj2).longValue();
                            try {
                                A.e eVar2 = c1039j2.f11068a;
                                ((C1032c) eVar2.f9n).a(jLongValue, (C1047r) eVar2.f12q);
                                listQ = AbstractC0149a.y(null);
                                break;
                            } catch (Throwable th) {
                                listQ = Z1.f.Q(th);
                            }
                            lVar.u(listQ);
                            return;
                        case 1:
                            C1039j c1039j3 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj3 = list.get(0);
                            N3.h.c(obj3, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.FlutterAssetManager");
                            C1047r c1047r = (C1047r) obj3;
                            Object obj4 = list.get(1);
                            N3.h.c(obj4, "null cannot be cast to non-null type kotlin.String");
                            String str = (String) obj4;
                            try {
                                c1039j3.getClass();
                                try {
                                    String[] list2 = c1047r.f11096a.list(str);
                                    listQ2 = AbstractC0149a.y(list2 == null ? new ArrayList() : Arrays.asList(list2));
                                } catch (IOException e5) {
                                    throw new RuntimeException(e5.getMessage());
                                }
                            } catch (Throwable th2) {
                                listQ2 = Z1.f.Q(th2);
                            }
                            lVar.u(listQ2);
                            return;
                        default:
                            C1039j c1039j4 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj;
                            Object obj5 = list3.get(0);
                            N3.h.c(obj5, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.FlutterAssetManager");
                            C1047r c1047r2 = (C1047r) obj5;
                            Object obj6 = list3.get(1);
                            N3.h.c(obj6, "null cannot be cast to non-null type kotlin.String");
                            String str2 = (String) obj6;
                            try {
                                c1039j4.getClass();
                                listQ3 = AbstractC0149a.y(((h3.f) c1047r2.f11097b.f4474m).b(str2));
                                break;
                            } catch (Throwable th3) {
                                listQ3 = Z1.f.Q(th3);
                            }
                            lVar.u(listQ3);
                            return;
                    }
                }
            });
        } else {
            iVar.E(null);
        }
        Z1.i iVar2 = new Z1.i(interfaceC0696f, "dev.flutter.pigeon.webview_flutter_android.FlutterAssetManager.list", gVar, (C0200z) null);
        if (c1039j != null) {
            final int i5 = 1;
            iVar2.E(new InterfaceC0692b() { // from class: y3.z
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
                            N3.h.c(obj2, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue = ((Long) obj2).longValue();
                            try {
                                A.e eVar2 = c1039j2.f11068a;
                                ((C1032c) eVar2.f9n).a(jLongValue, (C1047r) eVar2.f12q);
                                listQ = AbstractC0149a.y(null);
                                break;
                            } catch (Throwable th) {
                                listQ = Z1.f.Q(th);
                            }
                            lVar.u(listQ);
                            return;
                        case 1:
                            C1039j c1039j3 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj3 = list.get(0);
                            N3.h.c(obj3, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.FlutterAssetManager");
                            C1047r c1047r = (C1047r) obj3;
                            Object obj4 = list.get(1);
                            N3.h.c(obj4, "null cannot be cast to non-null type kotlin.String");
                            String str = (String) obj4;
                            try {
                                c1039j3.getClass();
                                try {
                                    String[] list2 = c1047r.f11096a.list(str);
                                    listQ2 = AbstractC0149a.y(list2 == null ? new ArrayList() : Arrays.asList(list2));
                                } catch (IOException e5) {
                                    throw new RuntimeException(e5.getMessage());
                                }
                            } catch (Throwable th2) {
                                listQ2 = Z1.f.Q(th2);
                            }
                            lVar.u(listQ2);
                            return;
                        default:
                            C1039j c1039j4 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj;
                            Object obj5 = list3.get(0);
                            N3.h.c(obj5, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.FlutterAssetManager");
                            C1047r c1047r2 = (C1047r) obj5;
                            Object obj6 = list3.get(1);
                            N3.h.c(obj6, "null cannot be cast to non-null type kotlin.String");
                            String str2 = (String) obj6;
                            try {
                                c1039j4.getClass();
                                listQ3 = AbstractC0149a.y(((h3.f) c1047r2.f11097b.f4474m).b(str2));
                                break;
                            } catch (Throwable th3) {
                                listQ3 = Z1.f.Q(th3);
                            }
                            lVar.u(listQ3);
                            return;
                    }
                }
            });
        } else {
            iVar2.E(null);
        }
        Z1.i iVar3 = new Z1.i(interfaceC0696f, "dev.flutter.pigeon.webview_flutter_android.FlutterAssetManager.getAssetFilePathByName", gVar, (C0200z) null);
        if (c1039j == null) {
            iVar3.E(null);
        } else {
            final int i6 = 2;
            iVar3.E(new InterfaceC0692b() { // from class: y3.z
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
                            N3.h.c(obj2, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue = ((Long) obj2).longValue();
                            try {
                                A.e eVar2 = c1039j2.f11068a;
                                ((C1032c) eVar2.f9n).a(jLongValue, (C1047r) eVar2.f12q);
                                listQ = AbstractC0149a.y(null);
                                break;
                            } catch (Throwable th) {
                                listQ = Z1.f.Q(th);
                            }
                            lVar.u(listQ);
                            return;
                        case 1:
                            C1039j c1039j3 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj3 = list.get(0);
                            N3.h.c(obj3, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.FlutterAssetManager");
                            C1047r c1047r = (C1047r) obj3;
                            Object obj4 = list.get(1);
                            N3.h.c(obj4, "null cannot be cast to non-null type kotlin.String");
                            String str = (String) obj4;
                            try {
                                c1039j3.getClass();
                                try {
                                    String[] list2 = c1047r.f11096a.list(str);
                                    listQ2 = AbstractC0149a.y(list2 == null ? new ArrayList() : Arrays.asList(list2));
                                } catch (IOException e5) {
                                    throw new RuntimeException(e5.getMessage());
                                }
                            } catch (Throwable th2) {
                                listQ2 = Z1.f.Q(th2);
                            }
                            lVar.u(listQ2);
                            return;
                        default:
                            C1039j c1039j4 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj;
                            Object obj5 = list3.get(0);
                            N3.h.c(obj5, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.FlutterAssetManager");
                            C1047r c1047r2 = (C1047r) obj5;
                            Object obj6 = list3.get(1);
                            N3.h.c(obj6, "null cannot be cast to non-null type kotlin.String");
                            String str2 = (String) obj6;
                            try {
                                c1039j4.getClass();
                                listQ3 = AbstractC0149a.y(((h3.f) c1047r2.f11097b.f4474m).b(str2));
                                break;
                            } catch (Throwable th3) {
                                listQ3 = Z1.f.Q(th3);
                            }
                            lVar.u(listQ3);
                            return;
                    }
                }
            });
        }
    }

    public static double s(int i, byte[] bArr) {
        return Double.longBitsToDouble(w(i, bArr));
    }

    public static void s0(InterfaceC0696f interfaceC0696f, final C1039j c1039j) {
        A.e eVar;
        N3.h.e(interfaceC0696f, "binaryMessenger");
        InterfaceC0703m gVar = (c1039j == null || (eVar = c1039j.f11068a) == null) ? new defpackage.g(1) : eVar.e();
        Z1.i iVar = new Z1.i(interfaceC0696f, "dev.flutter.pigeon.webview_flutter_android.WebChromeClient.pigeon_defaultConstructor", gVar, (C0200z) null);
        if (c1039j != null) {
            final int i = 0;
            iVar.E(new InterfaceC0692b() { // from class: y3.F
                @Override // n3.InterfaceC0692b
                public final void t(Object obj, Z1.l lVar) {
                    List listQ;
                    List listQ2;
                    List listQ3;
                    List listQ4;
                    List listQ5;
                    List listQ6;
                    switch (i) {
                        case 0:
                            C1039j c1039j2 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj2 = ((List) obj).get(0);
                            N3.h.c(obj2, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((C1032c) c1039j2.f11068a.f9n).a(((Long) obj2).longValue(), new C1022Q(c1039j2));
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
                            N3.h.c(obj3, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.WebChromeClientProxyApi.WebChromeClientImpl");
                            C1022Q c1022q = (C1022Q) obj3;
                            Object obj4 = list.get(1);
                            N3.h.c(obj4, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue = ((Boolean) obj4).booleanValue();
                            try {
                                c1039j3.getClass();
                                c1022q.f11012c = zBooleanValue;
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
                            Object obj5 = list2.get(0);
                            N3.h.c(obj5, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.WebChromeClientProxyApi.WebChromeClientImpl");
                            C1022Q c1022q2 = (C1022Q) obj5;
                            Object obj6 = list2.get(1);
                            N3.h.c(obj6, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue2 = ((Boolean) obj6).booleanValue();
                            try {
                                c1039j4.getClass();
                                c1022q2.f11013d = zBooleanValue2;
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
                            Object obj7 = list3.get(0);
                            N3.h.c(obj7, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.WebChromeClientProxyApi.WebChromeClientImpl");
                            C1022Q c1022q3 = (C1022Q) obj7;
                            Object obj8 = list3.get(1);
                            N3.h.c(obj8, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue3 = ((Boolean) obj8).booleanValue();
                            try {
                                c1039j5.getClass();
                                c1022q3.f11014e = zBooleanValue3;
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
                            Object obj9 = list4.get(0);
                            N3.h.c(obj9, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.WebChromeClientProxyApi.WebChromeClientImpl");
                            C1022Q c1022q4 = (C1022Q) obj9;
                            Object obj10 = list4.get(1);
                            N3.h.c(obj10, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue4 = ((Boolean) obj10).booleanValue();
                            try {
                                c1039j6.getClass();
                                c1022q4.f11015f = zBooleanValue4;
                                listQ5 = AbstractC0149a.y(null);
                            } catch (Throwable th5) {
                                listQ5 = Z1.f.Q(th5);
                            }
                            lVar.u(listQ5);
                            break;
                        default:
                            C1039j c1039j7 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj;
                            Object obj11 = list5.get(0);
                            N3.h.c(obj11, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.WebChromeClientProxyApi.WebChromeClientImpl");
                            C1022Q c1022q5 = (C1022Q) obj11;
                            Object obj12 = list5.get(1);
                            N3.h.c(obj12, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue5 = ((Boolean) obj12).booleanValue();
                            try {
                                c1039j7.getClass();
                                c1022q5.f11016g = zBooleanValue5;
                                listQ6 = AbstractC0149a.y(null);
                            } catch (Throwable th6) {
                                listQ6 = Z1.f.Q(th6);
                            }
                            lVar.u(listQ6);
                            break;
                    }
                }
            });
        } else {
            iVar.E(null);
        }
        Z1.i iVar2 = new Z1.i(interfaceC0696f, "dev.flutter.pigeon.webview_flutter_android.WebChromeClient.setSynchronousReturnValueForOnShowFileChooser", gVar, (C0200z) null);
        if (c1039j != null) {
            final int i5 = 1;
            iVar2.E(new InterfaceC0692b() { // from class: y3.F
                @Override // n3.InterfaceC0692b
                public final void t(Object obj, Z1.l lVar) {
                    List listQ;
                    List listQ2;
                    List listQ3;
                    List listQ4;
                    List listQ5;
                    List listQ6;
                    switch (i5) {
                        case 0:
                            C1039j c1039j2 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj2 = ((List) obj).get(0);
                            N3.h.c(obj2, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((C1032c) c1039j2.f11068a.f9n).a(((Long) obj2).longValue(), new C1022Q(c1039j2));
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
                            N3.h.c(obj3, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.WebChromeClientProxyApi.WebChromeClientImpl");
                            C1022Q c1022q = (C1022Q) obj3;
                            Object obj4 = list.get(1);
                            N3.h.c(obj4, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue = ((Boolean) obj4).booleanValue();
                            try {
                                c1039j3.getClass();
                                c1022q.f11012c = zBooleanValue;
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
                            Object obj5 = list2.get(0);
                            N3.h.c(obj5, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.WebChromeClientProxyApi.WebChromeClientImpl");
                            C1022Q c1022q2 = (C1022Q) obj5;
                            Object obj6 = list2.get(1);
                            N3.h.c(obj6, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue2 = ((Boolean) obj6).booleanValue();
                            try {
                                c1039j4.getClass();
                                c1022q2.f11013d = zBooleanValue2;
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
                            Object obj7 = list3.get(0);
                            N3.h.c(obj7, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.WebChromeClientProxyApi.WebChromeClientImpl");
                            C1022Q c1022q3 = (C1022Q) obj7;
                            Object obj8 = list3.get(1);
                            N3.h.c(obj8, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue3 = ((Boolean) obj8).booleanValue();
                            try {
                                c1039j5.getClass();
                                c1022q3.f11014e = zBooleanValue3;
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
                            Object obj9 = list4.get(0);
                            N3.h.c(obj9, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.WebChromeClientProxyApi.WebChromeClientImpl");
                            C1022Q c1022q4 = (C1022Q) obj9;
                            Object obj10 = list4.get(1);
                            N3.h.c(obj10, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue4 = ((Boolean) obj10).booleanValue();
                            try {
                                c1039j6.getClass();
                                c1022q4.f11015f = zBooleanValue4;
                                listQ5 = AbstractC0149a.y(null);
                            } catch (Throwable th5) {
                                listQ5 = Z1.f.Q(th5);
                            }
                            lVar.u(listQ5);
                            break;
                        default:
                            C1039j c1039j7 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj;
                            Object obj11 = list5.get(0);
                            N3.h.c(obj11, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.WebChromeClientProxyApi.WebChromeClientImpl");
                            C1022Q c1022q5 = (C1022Q) obj11;
                            Object obj12 = list5.get(1);
                            N3.h.c(obj12, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue5 = ((Boolean) obj12).booleanValue();
                            try {
                                c1039j7.getClass();
                                c1022q5.f11016g = zBooleanValue5;
                                listQ6 = AbstractC0149a.y(null);
                            } catch (Throwable th6) {
                                listQ6 = Z1.f.Q(th6);
                            }
                            lVar.u(listQ6);
                            break;
                    }
                }
            });
        } else {
            iVar2.E(null);
        }
        Z1.i iVar3 = new Z1.i(interfaceC0696f, "dev.flutter.pigeon.webview_flutter_android.WebChromeClient.setSynchronousReturnValueForOnConsoleMessage", gVar, (C0200z) null);
        if (c1039j != null) {
            final int i6 = 2;
            iVar3.E(new InterfaceC0692b() { // from class: y3.F
                @Override // n3.InterfaceC0692b
                public final void t(Object obj, Z1.l lVar) {
                    List listQ;
                    List listQ2;
                    List listQ3;
                    List listQ4;
                    List listQ5;
                    List listQ6;
                    switch (i6) {
                        case 0:
                            C1039j c1039j2 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj2 = ((List) obj).get(0);
                            N3.h.c(obj2, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((C1032c) c1039j2.f11068a.f9n).a(((Long) obj2).longValue(), new C1022Q(c1039j2));
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
                            N3.h.c(obj3, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.WebChromeClientProxyApi.WebChromeClientImpl");
                            C1022Q c1022q = (C1022Q) obj3;
                            Object obj4 = list.get(1);
                            N3.h.c(obj4, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue = ((Boolean) obj4).booleanValue();
                            try {
                                c1039j3.getClass();
                                c1022q.f11012c = zBooleanValue;
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
                            Object obj5 = list2.get(0);
                            N3.h.c(obj5, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.WebChromeClientProxyApi.WebChromeClientImpl");
                            C1022Q c1022q2 = (C1022Q) obj5;
                            Object obj6 = list2.get(1);
                            N3.h.c(obj6, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue2 = ((Boolean) obj6).booleanValue();
                            try {
                                c1039j4.getClass();
                                c1022q2.f11013d = zBooleanValue2;
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
                            Object obj7 = list3.get(0);
                            N3.h.c(obj7, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.WebChromeClientProxyApi.WebChromeClientImpl");
                            C1022Q c1022q3 = (C1022Q) obj7;
                            Object obj8 = list3.get(1);
                            N3.h.c(obj8, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue3 = ((Boolean) obj8).booleanValue();
                            try {
                                c1039j5.getClass();
                                c1022q3.f11014e = zBooleanValue3;
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
                            Object obj9 = list4.get(0);
                            N3.h.c(obj9, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.WebChromeClientProxyApi.WebChromeClientImpl");
                            C1022Q c1022q4 = (C1022Q) obj9;
                            Object obj10 = list4.get(1);
                            N3.h.c(obj10, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue4 = ((Boolean) obj10).booleanValue();
                            try {
                                c1039j6.getClass();
                                c1022q4.f11015f = zBooleanValue4;
                                listQ5 = AbstractC0149a.y(null);
                            } catch (Throwable th5) {
                                listQ5 = Z1.f.Q(th5);
                            }
                            lVar.u(listQ5);
                            break;
                        default:
                            C1039j c1039j7 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj;
                            Object obj11 = list5.get(0);
                            N3.h.c(obj11, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.WebChromeClientProxyApi.WebChromeClientImpl");
                            C1022Q c1022q5 = (C1022Q) obj11;
                            Object obj12 = list5.get(1);
                            N3.h.c(obj12, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue5 = ((Boolean) obj12).booleanValue();
                            try {
                                c1039j7.getClass();
                                c1022q5.f11016g = zBooleanValue5;
                                listQ6 = AbstractC0149a.y(null);
                            } catch (Throwable th6) {
                                listQ6 = Z1.f.Q(th6);
                            }
                            lVar.u(listQ6);
                            break;
                    }
                }
            });
        } else {
            iVar3.E(null);
        }
        Z1.i iVar4 = new Z1.i(interfaceC0696f, "dev.flutter.pigeon.webview_flutter_android.WebChromeClient.setSynchronousReturnValueForOnJsAlert", gVar, (C0200z) null);
        if (c1039j != null) {
            final int i7 = 3;
            iVar4.E(new InterfaceC0692b() { // from class: y3.F
                @Override // n3.InterfaceC0692b
                public final void t(Object obj, Z1.l lVar) {
                    List listQ;
                    List listQ2;
                    List listQ3;
                    List listQ4;
                    List listQ5;
                    List listQ6;
                    switch (i7) {
                        case 0:
                            C1039j c1039j2 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj2 = ((List) obj).get(0);
                            N3.h.c(obj2, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((C1032c) c1039j2.f11068a.f9n).a(((Long) obj2).longValue(), new C1022Q(c1039j2));
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
                            N3.h.c(obj3, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.WebChromeClientProxyApi.WebChromeClientImpl");
                            C1022Q c1022q = (C1022Q) obj3;
                            Object obj4 = list.get(1);
                            N3.h.c(obj4, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue = ((Boolean) obj4).booleanValue();
                            try {
                                c1039j3.getClass();
                                c1022q.f11012c = zBooleanValue;
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
                            Object obj5 = list2.get(0);
                            N3.h.c(obj5, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.WebChromeClientProxyApi.WebChromeClientImpl");
                            C1022Q c1022q2 = (C1022Q) obj5;
                            Object obj6 = list2.get(1);
                            N3.h.c(obj6, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue2 = ((Boolean) obj6).booleanValue();
                            try {
                                c1039j4.getClass();
                                c1022q2.f11013d = zBooleanValue2;
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
                            Object obj7 = list3.get(0);
                            N3.h.c(obj7, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.WebChromeClientProxyApi.WebChromeClientImpl");
                            C1022Q c1022q3 = (C1022Q) obj7;
                            Object obj8 = list3.get(1);
                            N3.h.c(obj8, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue3 = ((Boolean) obj8).booleanValue();
                            try {
                                c1039j5.getClass();
                                c1022q3.f11014e = zBooleanValue3;
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
                            Object obj9 = list4.get(0);
                            N3.h.c(obj9, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.WebChromeClientProxyApi.WebChromeClientImpl");
                            C1022Q c1022q4 = (C1022Q) obj9;
                            Object obj10 = list4.get(1);
                            N3.h.c(obj10, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue4 = ((Boolean) obj10).booleanValue();
                            try {
                                c1039j6.getClass();
                                c1022q4.f11015f = zBooleanValue4;
                                listQ5 = AbstractC0149a.y(null);
                            } catch (Throwable th5) {
                                listQ5 = Z1.f.Q(th5);
                            }
                            lVar.u(listQ5);
                            break;
                        default:
                            C1039j c1039j7 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj;
                            Object obj11 = list5.get(0);
                            N3.h.c(obj11, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.WebChromeClientProxyApi.WebChromeClientImpl");
                            C1022Q c1022q5 = (C1022Q) obj11;
                            Object obj12 = list5.get(1);
                            N3.h.c(obj12, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue5 = ((Boolean) obj12).booleanValue();
                            try {
                                c1039j7.getClass();
                                c1022q5.f11016g = zBooleanValue5;
                                listQ6 = AbstractC0149a.y(null);
                            } catch (Throwable th6) {
                                listQ6 = Z1.f.Q(th6);
                            }
                            lVar.u(listQ6);
                            break;
                    }
                }
            });
        } else {
            iVar4.E(null);
        }
        Z1.i iVar5 = new Z1.i(interfaceC0696f, "dev.flutter.pigeon.webview_flutter_android.WebChromeClient.setSynchronousReturnValueForOnJsConfirm", gVar, (C0200z) null);
        if (c1039j != null) {
            final int i8 = 4;
            iVar5.E(new InterfaceC0692b() { // from class: y3.F
                @Override // n3.InterfaceC0692b
                public final void t(Object obj, Z1.l lVar) {
                    List listQ;
                    List listQ2;
                    List listQ3;
                    List listQ4;
                    List listQ5;
                    List listQ6;
                    switch (i8) {
                        case 0:
                            C1039j c1039j2 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj2 = ((List) obj).get(0);
                            N3.h.c(obj2, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((C1032c) c1039j2.f11068a.f9n).a(((Long) obj2).longValue(), new C1022Q(c1039j2));
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
                            N3.h.c(obj3, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.WebChromeClientProxyApi.WebChromeClientImpl");
                            C1022Q c1022q = (C1022Q) obj3;
                            Object obj4 = list.get(1);
                            N3.h.c(obj4, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue = ((Boolean) obj4).booleanValue();
                            try {
                                c1039j3.getClass();
                                c1022q.f11012c = zBooleanValue;
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
                            Object obj5 = list2.get(0);
                            N3.h.c(obj5, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.WebChromeClientProxyApi.WebChromeClientImpl");
                            C1022Q c1022q2 = (C1022Q) obj5;
                            Object obj6 = list2.get(1);
                            N3.h.c(obj6, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue2 = ((Boolean) obj6).booleanValue();
                            try {
                                c1039j4.getClass();
                                c1022q2.f11013d = zBooleanValue2;
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
                            Object obj7 = list3.get(0);
                            N3.h.c(obj7, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.WebChromeClientProxyApi.WebChromeClientImpl");
                            C1022Q c1022q3 = (C1022Q) obj7;
                            Object obj8 = list3.get(1);
                            N3.h.c(obj8, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue3 = ((Boolean) obj8).booleanValue();
                            try {
                                c1039j5.getClass();
                                c1022q3.f11014e = zBooleanValue3;
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
                            Object obj9 = list4.get(0);
                            N3.h.c(obj9, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.WebChromeClientProxyApi.WebChromeClientImpl");
                            C1022Q c1022q4 = (C1022Q) obj9;
                            Object obj10 = list4.get(1);
                            N3.h.c(obj10, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue4 = ((Boolean) obj10).booleanValue();
                            try {
                                c1039j6.getClass();
                                c1022q4.f11015f = zBooleanValue4;
                                listQ5 = AbstractC0149a.y(null);
                            } catch (Throwable th5) {
                                listQ5 = Z1.f.Q(th5);
                            }
                            lVar.u(listQ5);
                            break;
                        default:
                            C1039j c1039j7 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj;
                            Object obj11 = list5.get(0);
                            N3.h.c(obj11, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.WebChromeClientProxyApi.WebChromeClientImpl");
                            C1022Q c1022q5 = (C1022Q) obj11;
                            Object obj12 = list5.get(1);
                            N3.h.c(obj12, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue5 = ((Boolean) obj12).booleanValue();
                            try {
                                c1039j7.getClass();
                                c1022q5.f11016g = zBooleanValue5;
                                listQ6 = AbstractC0149a.y(null);
                            } catch (Throwable th6) {
                                listQ6 = Z1.f.Q(th6);
                            }
                            lVar.u(listQ6);
                            break;
                    }
                }
            });
        } else {
            iVar5.E(null);
        }
        Z1.i iVar6 = new Z1.i(interfaceC0696f, "dev.flutter.pigeon.webview_flutter_android.WebChromeClient.setSynchronousReturnValueForOnJsPrompt", gVar, (C0200z) null);
        if (c1039j == null) {
            iVar6.E(null);
        } else {
            final int i9 = 5;
            iVar6.E(new InterfaceC0692b() { // from class: y3.F
                @Override // n3.InterfaceC0692b
                public final void t(Object obj, Z1.l lVar) {
                    List listQ;
                    List listQ2;
                    List listQ3;
                    List listQ4;
                    List listQ5;
                    List listQ6;
                    switch (i9) {
                        case 0:
                            C1039j c1039j2 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj2 = ((List) obj).get(0);
                            N3.h.c(obj2, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((C1032c) c1039j2.f11068a.f9n).a(((Long) obj2).longValue(), new C1022Q(c1039j2));
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
                            N3.h.c(obj3, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.WebChromeClientProxyApi.WebChromeClientImpl");
                            C1022Q c1022q = (C1022Q) obj3;
                            Object obj4 = list.get(1);
                            N3.h.c(obj4, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue = ((Boolean) obj4).booleanValue();
                            try {
                                c1039j3.getClass();
                                c1022q.f11012c = zBooleanValue;
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
                            Object obj5 = list2.get(0);
                            N3.h.c(obj5, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.WebChromeClientProxyApi.WebChromeClientImpl");
                            C1022Q c1022q2 = (C1022Q) obj5;
                            Object obj6 = list2.get(1);
                            N3.h.c(obj6, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue2 = ((Boolean) obj6).booleanValue();
                            try {
                                c1039j4.getClass();
                                c1022q2.f11013d = zBooleanValue2;
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
                            Object obj7 = list3.get(0);
                            N3.h.c(obj7, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.WebChromeClientProxyApi.WebChromeClientImpl");
                            C1022Q c1022q3 = (C1022Q) obj7;
                            Object obj8 = list3.get(1);
                            N3.h.c(obj8, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue3 = ((Boolean) obj8).booleanValue();
                            try {
                                c1039j5.getClass();
                                c1022q3.f11014e = zBooleanValue3;
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
                            Object obj9 = list4.get(0);
                            N3.h.c(obj9, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.WebChromeClientProxyApi.WebChromeClientImpl");
                            C1022Q c1022q4 = (C1022Q) obj9;
                            Object obj10 = list4.get(1);
                            N3.h.c(obj10, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue4 = ((Boolean) obj10).booleanValue();
                            try {
                                c1039j6.getClass();
                                c1022q4.f11015f = zBooleanValue4;
                                listQ5 = AbstractC0149a.y(null);
                            } catch (Throwable th5) {
                                listQ5 = Z1.f.Q(th5);
                            }
                            lVar.u(listQ5);
                            break;
                        default:
                            C1039j c1039j7 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj;
                            Object obj11 = list5.get(0);
                            N3.h.c(obj11, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.WebChromeClientProxyApi.WebChromeClientImpl");
                            C1022Q c1022q5 = (C1022Q) obj11;
                            Object obj12 = list5.get(1);
                            N3.h.c(obj12, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue5 = ((Boolean) obj12).booleanValue();
                            try {
                                c1039j7.getClass();
                                c1022q5.f11016g = zBooleanValue5;
                                listQ6 = AbstractC0149a.y(null);
                            } catch (Throwable th6) {
                                listQ6 = Z1.f.Q(th6);
                            }
                            lVar.u(listQ6);
                            break;
                    }
                }
            });
        }
    }

    public static int t(int i, byte[] bArr, int i5, int i6, InterfaceC0345z interfaceC0345z, C0324d c0324d) {
        AbstractC0333m abstractC0333m = (AbstractC0333m) interfaceC0345z;
        abstractC0333m.h(s(i5, bArr));
        int i7 = i5 + 8;
        while (i7 < i6) {
            int iT = T(bArr, i7, c0324d);
            if (i != c0324d.f5187a) {
                break;
            }
            abstractC0333m.h(Double.longBitsToDouble(w(iT, bArr)));
            i7 = iT + 8;
        }
        return i7;
    }

    public static void t0(M m4) {
        m4.u(3);
        m4.u(8);
        boolean zH = m4.h();
        boolean zH2 = m4.h();
        if (zH) {
            m4.u(5);
        }
        if (zH2) {
            m4.u(6);
        }
    }

    public static int u(int i, byte[] bArr) {
        return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
    }

    public static void u0(M m4) {
        int i;
        int i5 = m4.i(2);
        if (i5 == 0) {
            m4.u(6);
            return;
        }
        int iM0 = m0(m4, 5, 8, 16) + 1;
        if (i5 == 1) {
            m4.u(iM0 * 7);
            return;
        }
        if (i5 == 2) {
            boolean zH = m4.h();
            int i6 = zH ? 1 : 5;
            int i7 = zH ? 7 : 5;
            int i8 = zH ? 8 : 6;
            int i9 = 0;
            while (i9 < iM0) {
                if (m4.h()) {
                    m4.u(7);
                    i = 0;
                } else {
                    if (m4.i(2) == 3 && m4.i(i7) * i6 != 0) {
                        m4.t();
                    }
                    i = m4.i(i8) * i6;
                    if (i != 0 && i != 180) {
                        m4.t();
                    }
                    m4.t();
                }
                if (i != 0 && i != 180 && m4.h()) {
                    i9++;
                }
                i9++;
            }
        }
    }

    public static int v(int i, byte[] bArr, int i5, int i6, InterfaceC0345z interfaceC0345z, C0324d c0324d) {
        AbstractC0343x abstractC0343x = (AbstractC0343x) interfaceC0345z;
        abstractC0343x.h(u(i5, bArr));
        int i7 = i5 + 4;
        while (i7 < i6) {
            int iT = T(bArr, i7, c0324d);
            if (i != c0324d.f5187a) {
                break;
            }
            abstractC0343x.h(u(iT, bArr));
            i7 = iT + 4;
        }
        return i7;
    }

    public static final int v0(int i) {
        AbstractC0307a.r("state", i);
        int iB = O.i.b(i);
        if (iB == 0) {
            return 0;
        }
        if (iB == 1) {
            return 1;
        }
        if (iB == 2) {
            return 2;
        }
        if (iB == 3) {
            return 3;
        }
        if (iB == 4) {
            return 4;
        }
        if (iB == 5) {
            return 5;
        }
        throw new A1.c();
    }

    public static long w(int i, byte[] bArr) {
        return ((((long) bArr[i + 7]) & 255) << 56) | (((long) bArr[i]) & 255) | ((((long) bArr[i + 1]) & 255) << 8) | ((((long) bArr[i + 2]) & 255) << 16) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 4]) & 255) << 32) | ((((long) bArr[i + 5]) & 255) << 40) | ((((long) bArr[i + 6]) & 255) << 48);
    }

    public static int w0(Context context, int i) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(android.R.style.Animation.Activity, new int[]{i});
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, -1);
        typedArrayObtainStyledAttributes.recycle();
        return resourceId;
    }

    public static int x(int i, byte[] bArr, int i5, int i6, InterfaceC0345z interfaceC0345z, C0324d c0324d) {
        J j5 = (J) interfaceC0345z;
        j5.h(w(i5, bArr));
        int i7 = i5 + 8;
        while (i7 < i6) {
            int iT = T(bArr, i7, c0324d);
            if (i != c0324d.f5187a) {
                break;
            }
            j5.h(w(iT, bArr));
            i7 = iT + 8;
        }
        return i7;
    }

    public static int[] x0(Collection collection) {
        if (collection instanceof C0728b) {
            C0728b c0728b = (C0728b) collection;
            return Arrays.copyOfRange(c0728b.f9197l, c0728b.f9198m, c0728b.f9199n);
        }
        Object[] array = collection.toArray();
        int length = array.length;
        int[] iArr = new int[length];
        for (int i = 0; i < length; i++) {
            Object obj = array[i];
            obj.getClass();
            iArr[i] = ((Number) obj).intValue();
        }
        return iArr;
    }

    public static float y(int i, byte[] bArr) {
        return Float.intBitsToFloat(u(i, bArr));
    }

    public static void y0(byte[] bArr, long j5, int i) {
        int i5 = 0;
        while (i5 < 4) {
            bArr[i + i5] = (byte) (255 & j5);
            i5++;
            j5 >>= 8;
        }
    }

    public static int z(int i, byte[] bArr, int i5, int i6, InterfaceC0345z interfaceC0345z, C0324d c0324d) {
        AbstractC0338s abstractC0338s = (AbstractC0338s) interfaceC0345z;
        abstractC0338s.h(y(i5, bArr));
        int i7 = i5 + 4;
        while (i7 < i6) {
            int iT = T(bArr, i7, c0324d);
            if (i != c0324d.f5187a) {
                break;
            }
            abstractC0338s.h(Float.intBitsToFloat(u(iT, bArr)));
            i7 = iT + 4;
        }
        return i7;
    }

    /* JADX WARN: Removed duplicated region for block: B:4:0x000c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Integer z0(java.lang.String r20) {
        /*
            r0 = r20
            r1 = 1
            r20.getClass()
            boolean r2 = r20.isEmpty()
            if (r2 == 0) goto Lf
        Lc:
            r0 = 0
            goto L7d
        Lf:
            r2 = 0
            char r4 = r0.charAt(r2)
            r5 = 45
            if (r4 != r5) goto L19
            r2 = r1
        L19:
            int r4 = r20.length()
            if (r2 != r4) goto L20
            goto Lc
        L20:
            int r4 = r2 + 1
            char r5 = r0.charAt(r2)
            r6 = -1
            r7 = 128(0x80, float:1.8E-43)
            if (r5 >= r7) goto L30
            byte[] r8 = p2.AbstractC0729c.f9200a
            r5 = r8[r5]
            goto L33
        L30:
            byte[] r5 = p2.AbstractC0729c.f9200a
            r5 = r6
        L33:
            if (r5 < 0) goto Lc
            r8 = 10
            if (r5 < r8) goto L3a
            goto Lc
        L3a:
            int r5 = -r5
            long r9 = (long) r5
            long r11 = (long) r8
            r13 = -9223372036854775808
            long r15 = r13 / r11
        L41:
            int r5 = r20.length()
            if (r4 >= r5) goto L6c
            int r5 = r4 + 1
            char r4 = r0.charAt(r4)
            if (r4 >= r7) goto L54
            byte[] r17 = p2.AbstractC0729c.f9200a
            r4 = r17[r4]
            goto L57
        L54:
            byte[] r4 = p2.AbstractC0729c.f9200a
            r4 = r6
        L57:
            if (r4 < 0) goto Lc
            if (r4 >= r8) goto Lc
            int r17 = (r9 > r15 ? 1 : (r9 == r15 ? 0 : -1))
            if (r17 >= 0) goto L60
            goto Lc
        L60:
            long r9 = r9 * r11
            long r3 = (long) r4
            long r18 = r3 + r13
            int r18 = (r9 > r18 ? 1 : (r9 == r18 ? 0 : -1))
            if (r18 >= 0) goto L69
            goto Lc
        L69:
            long r9 = r9 - r3
            r4 = r5
            goto L41
        L6c:
            if (r2 == 0) goto L73
            java.lang.Long r0 = java.lang.Long.valueOf(r9)
            goto L7d
        L73:
            int r0 = (r9 > r13 ? 1 : (r9 == r13 ? 0 : -1))
            if (r0 != 0) goto L78
            goto Lc
        L78:
            long r0 = -r9
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
        L7d:
            if (r0 == 0) goto L96
            long r1 = r0.longValue()
            int r3 = r0.intValue()
            long r3 = (long) r3
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 == 0) goto L8d
            goto L96
        L8d:
            int r0 = r0.intValue()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r0)
            goto L97
        L96:
            r3 = 0
        L97:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: Q1.C.z0(java.lang.String):java.lang.Integer");
    }

    public C0155F m(O0.a aVar) {
        ByteBuffer byteBuffer = aVar.f5787p;
        byteBuffer.getClass();
        AbstractC0360m.c(byteBuffer.position() == 0 && byteBuffer.hasArray() && byteBuffer.arrayOffset() == 0);
        return n(aVar, byteBuffer);
    }

    public abstract C0155F n(O0.a aVar, ByteBuffer byteBuffer);
}

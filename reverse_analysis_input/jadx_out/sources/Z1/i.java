package Z1;

import Q.t;
import Q1.C;
import a0.C0200z;
import android.content.Context;
import android.database.Cursor;
import android.graphics.Typeface;
import android.os.Bundle;
import android.os.SystemClock;
import android.util.Log;
import android.util.Pair;
import androidx.fragment.app.O;
import androidx.fragment.app.T;
import androidx.work.impl.WorkDatabase_Impl;
import d0.C0363p;
import f1.C0432a;
import io.flutter.embedding.engine.FlutterJNI;
import java.io.File;
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Random;
import l0.C0563b;
import m2.C0640G;
import m2.I;
import m2.b0;
import n3.C0691a;
import n3.InterfaceC0692b;
import n3.InterfaceC0693c;
import n3.InterfaceC0696f;
import n3.InterfaceC0703m;
import s2.C0797f;
import y2.C1005a;

/* JADX INFO: loaded from: classes.dex */
public final class i implements U2.d, c1.l {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Object f3012l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public Object f3013m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public Object f3014n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public Object f3015o;

    public i(int i) {
        switch (i) {
            case 10:
                this.f3012l = new C0363p();
                this.f3013m = new C0363p();
                this.f3014n = new C0432a();
                break;
            case 11:
                Random random = new Random();
                this.f3014n = new HashMap();
                this.f3015o = random;
                this.f3012l = new HashMap();
                this.f3013m = new HashMap();
                break;
            case 12:
                C0200z c0200z = new C0200z(20);
                C0200z c0200z2 = new C0200z(19);
                this.f3012l = new HashSet();
                this.f3013m = c0200z;
                this.f3014n = c0200z2;
                break;
            case 17:
                this.f3012l = new HashMap();
                this.f3013m = new HashMap();
                this.f3014n = new HashMap();
                this.f3015o = new HashMap();
                break;
            default:
                this.f3012l = new ArrayList();
                this.f3013m = new HashMap();
                this.f3014n = new HashMap();
                break;
        }
    }

    public static void A(long j5, HashMap map) {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : map.entrySet()) {
            if (((Long) entry.getValue()).longValue() <= j5) {
                arrayList.add(entry.getKey());
            }
        }
        for (int i = 0; i < arrayList.size(); i++) {
            map.remove(arrayList.get(i));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object B(G3.b r8) throws java.lang.Throwable {
        /*
            r7 = this;
            boolean r0 = r8 instanceof L.U
            if (r0 == 0) goto L13
            r0 = r8
            L.U r0 = (L.U) r0
            int r1 = r0.f1353s
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f1353s = r1
            goto L18
        L13:
            L.U r0 = new L.U
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.f1351q
            F3.a r1 = F3.a.f861l
            int r2 = r0.f1353s
            B3.g r3 = B3.g.f275a
            r4 = 2
            r5 = 1
            r6 = 0
            if (r2 == 0) goto L44
            if (r2 == r5) goto L3b
            if (r2 != r4) goto L33
            d4.a r1 = r0.f1350p
            Z1.i r0 = r0.f1349o
            i4.a.Y(r8)     // Catch: java.lang.Throwable -> L31
            goto L87
        L31:
            r8 = move-exception
            goto L99
        L33:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L3b:
            d4.a r2 = r0.f1350p
            Z1.i r5 = r0.f1349o
            i4.a.Y(r8)
            r8 = r2
            goto L66
        L44:
            i4.a.Y(r8)
            java.lang.Object r8 = r7.f3013m
            V3.l r8 = (V3.C0135l) r8
            java.lang.Object r8 = r8.F()
            boolean r8 = r8 instanceof V3.L
            if (r8 != 0) goto L54
            return r3
        L54:
            r0.f1349o = r7
            java.lang.Object r8 = r7.f3012l
            d4.d r8 = (d4.d) r8
            r0.f1350p = r8
            r0.f1353s = r5
            java.lang.Object r2 = r8.c(r0)
            if (r2 != r1) goto L65
            return r1
        L65:
            r5 = r7
        L66:
            java.lang.Object r2 = r5.f3013m     // Catch: java.lang.Throwable -> L97
            V3.l r2 = (V3.C0135l) r2     // Catch: java.lang.Throwable -> L97
            java.lang.Object r2 = r2.F()     // Catch: java.lang.Throwable -> L97
            boolean r2 = r2 instanceof V3.L     // Catch: java.lang.Throwable -> L97
            if (r2 != 0) goto L78
            d4.d r8 = (d4.d) r8
            r8.e(r6)
            return r3
        L78:
            r0.f1349o = r5     // Catch: java.lang.Throwable -> L97
            r0.f1350p = r8     // Catch: java.lang.Throwable -> L97
            r0.f1353s = r4     // Catch: java.lang.Throwable -> L97
            java.lang.Object r0 = r5.g(r0)     // Catch: java.lang.Throwable -> L97
            if (r0 != r1) goto L85
            return r1
        L85:
            r1 = r8
            r0 = r5
        L87:
            java.lang.Object r8 = r0.f3013m     // Catch: java.lang.Throwable -> L31
            V3.l r8 = (V3.C0135l) r8     // Catch: java.lang.Throwable -> L31
            r8.L(r3)     // Catch: java.lang.Throwable -> L31
            d4.d r1 = (d4.d) r1
            r1.e(r6)
            return r3
        L94:
            r1 = r8
            r8 = r0
            goto L99
        L97:
            r0 = move-exception
            goto L94
        L99:
            d4.d r1 = (d4.d) r1
            r1.e(r6)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: Z1.i.B(G3.b):java.lang.Object");
    }

    public C0563b C(List list) {
        ArrayList arrayListC = c(list);
        if (arrayListC.size() < 2) {
            return (C0563b) m2.r.k(arrayListC, null);
        }
        Collections.sort(arrayListC, new A.c(12));
        ArrayList arrayList = new ArrayList();
        int i = 0;
        int i5 = ((C0563b) arrayListC.get(0)).f7820c;
        int i6 = 0;
        while (true) {
            if (i6 >= arrayListC.size()) {
                break;
            }
            C0563b c0563b = (C0563b) arrayListC.get(i6);
            if (i5 == c0563b.f7820c) {
                arrayList.add(new Pair(c0563b.f7819b, Integer.valueOf(c0563b.f7821d)));
                i6++;
            } else if (arrayList.size() == 1) {
                return (C0563b) arrayListC.get(0);
            }
        }
        HashMap map = (HashMap) this.f3014n;
        C0563b c0563b2 = (C0563b) map.get(arrayList);
        if (c0563b2 == null) {
            List listSubList = arrayListC.subList(0, arrayList.size());
            int i7 = 0;
            for (int i8 = 0; i8 < listSubList.size(); i8++) {
                i7 += ((C0563b) listSubList.get(i8)).f7821d;
            }
            int iNextInt = ((Random) this.f3015o).nextInt(i7);
            int i9 = 0;
            while (true) {
                if (i >= listSubList.size()) {
                    c0563b2 = (C0563b) m2.r.l(listSubList);
                    break;
                }
                C0563b c0563b3 = (C0563b) listSubList.get(i);
                i9 += c0563b3.f7821d;
                if (iNextInt < i9) {
                    c0563b2 = c0563b3;
                    break;
                }
                i++;
            }
            map.put(arrayList, c0563b2);
        }
        return c0563b2;
    }

    public void D(Object obj, InterfaceC0693c interfaceC0693c) {
        ((InterfaceC0696f) this.f3012l).h((String) this.f3013m, ((InterfaceC0703m) this.f3014n).b(obj), interfaceC0693c == null ? null : new C0691a(this, 0, interfaceC0693c));
    }

    public void E(InterfaceC0692b interfaceC0692b) {
        String str = (String) this.f3013m;
        InterfaceC0696f interfaceC0696f = (InterfaceC0696f) this.f3012l;
        C0200z c0200z = (C0200z) this.f3015o;
        if (c0200z != null) {
            interfaceC0696f.d(str, interfaceC0692b != null ? new c(this, interfaceC0692b, false) : null, c0200z);
        } else {
            interfaceC0696f.k(str, interfaceC0692b != null ? new c(this, interfaceC0692b, false) : null);
        }
    }

    public Bundle F(String str, Bundle bundle) {
        HashMap map = (HashMap) this.f3014n;
        return bundle != null ? (Bundle) map.put(str, bundle) : (Bundle) map.remove(str);
    }

    public void a(androidx.fragment.app.r rVar) {
        if (((ArrayList) this.f3012l).contains(rVar)) {
            throw new IllegalStateException("Fragment already added: " + rVar);
        }
        synchronized (((ArrayList) this.f3012l)) {
            ((ArrayList) this.f3012l).add(rVar);
        }
        rVar.f4449v = true;
    }

    @Override // U2.d
    public void b(String str, HashMap map) {
        this.f3013m = "sqlite_error";
        this.f3014n = str;
        this.f3015o = map;
    }

    public ArrayList c(List list) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        HashMap map = (HashMap) this.f3012l;
        A(jElapsedRealtime, map);
        HashMap map2 = (HashMap) this.f3013m;
        A(jElapsedRealtime, map2);
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            C0563b c0563b = (C0563b) list.get(i);
            if (!map.containsKey(c0563b.f7819b) && !map2.containsKey(Integer.valueOf(c0563b.f7820c))) {
                arrayList.add(c0563b);
            }
        }
        return arrayList;
    }

    @Override // U2.d
    public void d(Serializable serializable) {
        this.f3012l = serializable;
    }

    public C0797f e() throws GeneralSecurityException {
        B0.d dVar;
        s2.k kVar = (s2.k) this.f3012l;
        if (kVar == null) {
            throw new GeneralSecurityException("Cannot build without parameters");
        }
        B0.d dVar2 = (B0.d) this.f3013m;
        if (dVar2 == null || (dVar = (B0.d) this.f3014n) == null) {
            throw new GeneralSecurityException("Cannot build without key material");
        }
        if (kVar.f9648b != ((F2.a) dVar2.f190l).f860a.length) {
            throw new GeneralSecurityException("AES key size mismatch");
        }
        if (kVar.f9649c != ((F2.a) dVar.f190l).f860a.length) {
            throw new GeneralSecurityException("HMAC key size mismatch");
        }
        s2.j jVar = s2.j.f9631j;
        s2.j jVar2 = kVar.f9651e;
        if (jVar2 != jVar && ((Integer) this.f3015o) == null) {
            throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
        }
        if (jVar2 == jVar && ((Integer) this.f3015o) != null) {
            throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
        }
        if (jVar2 == jVar) {
            F2.a.a(new byte[0]);
        } else if (jVar2 == s2.j.i) {
            F2.a.a(ByteBuffer.allocate(5).put((byte) 0).putInt(((Integer) this.f3015o).intValue()).array());
        } else {
            if (jVar2 != s2.j.f9630h) {
                throw new IllegalStateException("Unknown AesCtrHmacAeadParameters.Variant: " + ((s2.k) this.f3012l).f9651e);
            }
            F2.a.a(ByteBuffer.allocate(5).put((byte) 1).putInt(((Integer) this.f3015o).intValue()).array());
        }
        return new C0797f();
    }

    public z2.k f() throws GeneralSecurityException {
        Integer num = (Integer) this.f3012l;
        if (num == null) {
            throw new GeneralSecurityException("key size is not set");
        }
        if (((Integer) this.f3013m) == null) {
            throw new GeneralSecurityException("tag size is not set");
        }
        if (((z2.d) this.f3014n) == null) {
            throw new GeneralSecurityException("hash type is not set");
        }
        if (((z2.d) this.f3015o) == null) {
            throw new GeneralSecurityException("variant is not set");
        }
        if (num.intValue() < 16) {
            throw new InvalidAlgorithmParameterException(String.format("Invalid key size in bytes %d; must be at least 16 bytes", (Integer) this.f3012l));
        }
        Integer num2 = (Integer) this.f3013m;
        int iIntValue = num2.intValue();
        z2.d dVar = (z2.d) this.f3014n;
        if (iIntValue < 10) {
            throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; must be at least 10 bytes", num2));
        }
        if (dVar == z2.d.f11155g) {
            if (iIntValue > 20) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 20 bytes for SHA1", num2));
            }
        } else if (dVar == z2.d.f11156h) {
            if (iIntValue > 28) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 28 bytes for SHA224", num2));
            }
        } else if (dVar == z2.d.i) {
            if (iIntValue > 32) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 32 bytes for SHA256", num2));
            }
        } else if (dVar == z2.d.f11157j) {
            if (iIntValue > 48) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 48 bytes for SHA384", num2));
            }
        } else {
            if (dVar != z2.d.f11158k) {
                throw new GeneralSecurityException("unknown hash type; must be SHA256, SHA384 or SHA512");
            }
            if (iIntValue > 64) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 64 bytes for SHA512", num2));
            }
        }
        return new z2.k(((Integer) this.f3012l).intValue(), ((Integer) this.f3013m).intValue(), (z2.d) this.f3015o, (z2.d) this.f3014n);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object g(G3.b r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof L.C0101i
            if (r0 == 0) goto L13
            r0 = r7
            L.i r0 = (L.C0101i) r0
            int r1 = r0.f1394r
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f1394r = r1
            goto L18
        L13:
            L.i r0 = new L.i
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.f1392p
            F3.a r1 = F3.a.f861l
            int r2 = r0.f1394r
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3a
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            Z1.i r0 = r0.f1391o
            i4.a.Y(r7)
            goto L64
        L2c:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L34:
            Z1.i r0 = r0.f1391o
            i4.a.Y(r7)
            goto L74
        L3a:
            i4.a.Y(r7)
            java.lang.Object r7 = r6.f3014n
            java.util.List r7 = (java.util.List) r7
            java.lang.Object r2 = r6.f3015o
            L.P r2 = (L.P) r2
            if (r7 == 0) goto L67
            boolean r7 = r7.isEmpty()
            if (r7 == 0) goto L4e
            goto L67
        L4e:
            L.Z r7 = r2.g()
            L.l r4 = new L.l
            r5 = 0
            r4.<init>(r2, r6, r5)
            r0.f1391o = r6
            r0.f1394r = r3
            java.lang.Object r7 = r7.b(r4, r0)
            if (r7 != r1) goto L63
            return r1
        L63:
            r0 = r6
        L64:
            L.c r7 = (L.C0095c) r7
            goto L76
        L67:
            r0.f1391o = r6
            r0.f1394r = r4
            r7 = 0
            java.lang.Object r7 = L.P.f(r2, r7, r0)
            if (r7 != r1) goto L73
            return r1
        L73:
            r0 = r6
        L74:
            L.c r7 = (L.C0095c) r7
        L76:
            java.lang.Object r0 = r0.f3015o
            L.P r0 = (L.P) r0
            B0.d r0 = r0.f1338s
            r0.u(r7)
            B3.g r7 = B3.g.f275a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: Z1.i.g(G3.b):java.lang.Object");
    }

    public void h(Runnable runnable) {
        ((a2.p) this.f3012l).execute(runnable);
    }

    public androidx.fragment.app.r i(String str) {
        T t4 = (T) ((HashMap) this.f3013m).get(str);
        if (t4 != null) {
            return t4.f4307c;
        }
        return null;
    }

    public androidx.fragment.app.r j(String str) {
        for (T t4 : ((HashMap) this.f3013m).values()) {
            if (t4 != null) {
                androidx.fragment.app.r rVarJ = t4.f4307c;
                if (!str.equals(rVarJ.f4443p)) {
                    rVarJ = rVarJ.f4415F.f4254c.j(str);
                }
                if (rVarJ != null) {
                    return rVarJ;
                }
            }
        }
        return null;
    }

    public ArrayList k() {
        ArrayList arrayList = new ArrayList();
        for (T t4 : ((HashMap) this.f3013m).values()) {
            if (t4 != null) {
                arrayList.add(t4);
            }
        }
        return arrayList;
    }

    public ArrayList l() {
        ArrayList arrayList = new ArrayList();
        for (T t4 : ((HashMap) this.f3013m).values()) {
            if (t4 != null) {
                arrayList.add(t4.f4307c);
            } else {
                arrayList.add(null);
            }
        }
        return arrayList;
    }

    public List m() {
        ArrayList arrayList;
        if (((ArrayList) this.f3012l).isEmpty()) {
            return Collections.emptyList();
        }
        synchronized (((ArrayList) this.f3012l)) {
            arrayList = new ArrayList((ArrayList) this.f3012l);
        }
        return arrayList;
    }

    public g n(j jVar) {
        s1.j jVarC = s1.j.c("SELECT * FROM SystemIdInfo WHERE work_spec_id=? AND generation=?", 2);
        String str = jVar.f3016a;
        if (str == null) {
            jVarC.g(1);
        } else {
            jVarC.h(str, 1);
        }
        jVarC.m(jVar.f3017b, 2);
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f3012l;
        workDatabase_Impl.b();
        Cursor cursorL0 = C.l0(workDatabase_Impl, jVarC, false);
        try {
            int iC = D1.b.C(cursorL0, "work_spec_id");
            int iC2 = D1.b.C(cursorL0, "generation");
            int iC3 = D1.b.C(cursorL0, "system_id");
            g gVar = null;
            String string = null;
            if (cursorL0.moveToFirst()) {
                if (!cursorL0.isNull(iC)) {
                    string = cursorL0.getString(iC);
                }
                gVar = new g(cursorL0.getInt(iC2), string, cursorL0.getInt(iC3));
            }
            return gVar;
        } finally {
            cursorL0.close();
            jVarC.f();
        }
    }

    @Override // c1.l
    public int o() {
        return 2;
    }

    public File p(Context context) {
        ((C0200z) this.f3013m).getClass();
        return new File(context.getDir("lib", 0), System.mapLibraryName("flutter"));
    }

    public void q(g gVar) {
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f3012l;
        workDatabase_Impl.b();
        workDatabase_Impl.c();
        try {
            ((b) this.f3013m).m(gVar);
            workDatabase_Impl.o();
        } finally {
            workDatabase_Impl.k();
        }
    }

    public void r(String str, Object... objArr) {
        String str2 = String.format(Locale.US, str, objArr);
        if (((B0.l) this.f3015o) != null) {
            FlutterJNI.lambda$loadLibrary$0(str2);
        }
    }

    public void s(T t4) {
        androidx.fragment.app.r rVar = t4.f4307c;
        String str = rVar.f4443p;
        HashMap map = (HashMap) this.f3013m;
        if (map.get(str) != null) {
            return;
        }
        map.put(rVar.f4443p, t4);
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "Added fragment to active set " + rVar);
        }
    }

    public void t(T t4) {
        androidx.fragment.app.r rVar = t4.f4307c;
        if (rVar.M) {
            ((O) this.f3015o).f(rVar);
        }
        HashMap map = (HashMap) this.f3013m;
        if (map.get(rVar.f4443p) == t4 && ((T) map.put(rVar.f4443p, null)) != null && Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "Removed fragment from active set " + rVar);
        }
    }

    public void u(C1005a c1005a) throws GeneralSecurityException {
        c1005a.getClass();
        y2.p pVar = new y2.p(y2.n.class, c1005a.f10934a);
        HashMap map = (HashMap) this.f3013m;
        if (!map.containsKey(pVar)) {
            map.put(pVar, c1005a);
            return;
        }
        C1005a c1005a2 = (C1005a) map.get(pVar);
        if (c1005a2.equals(c1005a) && c1005a.equals(c1005a2)) {
            return;
        }
        throw new GeneralSecurityException("Attempt to register non-equal parser for already existing object of type: " + pVar);
    }

    public void w(y2.c cVar) throws GeneralSecurityException {
        y2.q qVar = new y2.q(cVar.f10936a, y2.n.class);
        HashMap map = (HashMap) this.f3012l;
        if (!map.containsKey(qVar)) {
            map.put(qVar, cVar);
            return;
        }
        y2.c cVar2 = (y2.c) map.get(qVar);
        if (cVar2.equals(cVar) && cVar.equals(cVar2)) {
            return;
        }
        throw new GeneralSecurityException("Attempt to register non-equal serializer for already existing object of type: " + qVar);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0077, code lost:
    
        r8.G(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x007a, code lost:
    
        r9.reset();
        r6.F(r8.f5315c, r8.f5313a);
     */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00eb  */
    @Override // c1.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void x(byte[] r34, int r35, int r36, c1.k r37, d0.InterfaceC0351d r38) {
        /*
            Method dump skipped, instruction units count: 744
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Z1.i.x(byte[], int, int, c1.k, d0.d):void");
    }

    public void y(y2.i iVar) throws GeneralSecurityException {
        iVar.getClass();
        y2.p pVar = new y2.p(y2.o.class, iVar.f10946a);
        HashMap map = (HashMap) this.f3015o;
        if (!map.containsKey(pVar)) {
            map.put(pVar, iVar);
            return;
        }
        y2.i iVar2 = (y2.i) map.get(pVar);
        if (iVar2.equals(iVar) && iVar.equals(iVar2)) {
            return;
        }
        throw new GeneralSecurityException("Attempt to register non-equal parser for already existing object of type: " + pVar);
    }

    public void z(y2.j jVar) throws GeneralSecurityException {
        y2.q qVar = new y2.q(jVar.f10947a, y2.o.class);
        HashMap map = (HashMap) this.f3014n;
        if (!map.containsKey(qVar)) {
            map.put(qVar, jVar);
            return;
        }
        y2.j jVar2 = (y2.j) map.get(qVar);
        if (jVar2.equals(jVar) && jVar.equals(jVar2)) {
            return;
        }
        throw new GeneralSecurityException("Attempt to register non-equal serializer for already existing object of type: " + qVar);
    }

    public i(y2.r rVar) {
        this.f3012l = new HashMap(rVar.f10965a);
        this.f3013m = new HashMap(rVar.f10966b);
        this.f3014n = new HashMap(rVar.f10967c);
        this.f3015o = new HashMap(rVar.f10968d);
    }

    public i(InterfaceC0696f interfaceC0696f, String str, InterfaceC0703m interfaceC0703m, C0200z c0200z) {
        this.f3012l = interfaceC0696f;
        this.f3013m = str;
        this.f3014n = interfaceC0703m;
        this.f3015o = c0200z;
    }

    public i(Typeface typeface, R.b bVar) {
        int i;
        int i5;
        this.f3015o = typeface;
        this.f3012l = bVar;
        this.f3014n = new t(1024);
        int iA = bVar.a(6);
        if (iA != 0) {
            int i6 = iA + bVar.f373l;
            i = ((ByteBuffer) bVar.f376o).getInt(((ByteBuffer) bVar.f376o).getInt(i6) + i6);
        } else {
            i = 0;
        }
        this.f3013m = new char[i * 2];
        int iA2 = bVar.a(6);
        if (iA2 != 0) {
            int i7 = iA2 + bVar.f373l;
            i5 = ((ByteBuffer) bVar.f376o).getInt(((ByteBuffer) bVar.f376o).getInt(i7) + i7);
        } else {
            i5 = 0;
        }
        for (int i8 = 0; i8 < i5; i8++) {
            Q.p pVar = new Q.p(this, i8);
            R.a aVarC = pVar.c();
            int iA3 = aVarC.a(4);
            Character.toChars(iA3 != 0 ? ((ByteBuffer) aVarC.f376o).getInt(iA3 + aVarC.f373l) : 0, (char[]) this.f3013m, i8 * 2);
            if (pVar.b() > 0) {
                ((t) this.f3014n).a(pVar, 0, pVar.b() - 1);
            } else {
                throw new IllegalArgumentException("invalid metadata codepoint length");
            }
        }
    }

    public i(b0 b0Var, e eVar, l lVar, c cVar) {
        Object objP;
        if (b0Var != null) {
            objP = I.p(b0Var);
        } else {
            C0640G c0640g = I.f8549m;
            objP = b0.f8583p;
        }
        this.f3012l = objP;
        this.f3013m = eVar;
        this.f3014n = lVar;
        this.f3015o = cVar;
    }
}

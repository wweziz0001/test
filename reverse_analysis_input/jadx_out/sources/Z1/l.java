package Z1;

import F0.InterfaceC0063j;
import Q1.C0118a;
import a.AbstractC0149a;
import a0.C0157H;
import a0.C0187m;
import a0.C0200z;
import android.content.Context;
import android.content.res.Configuration;
import android.media.LoudnessCodecController;
import android.media.MediaCodec;
import android.media.MediaFormat;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.security.keystore.KeyGenParameterSpec;
import android.view.KeyEvent;
import android.view.Surface;
import android.view.View;
import androidx.fragment.app.AbstractActivityC0255w;
import b3.AbstractC0307a;
import d0.AbstractC0360m;
import d0.AbstractC0370w;
import d0.C0363p;
import io.flutter.embedding.android.D;
import io.flutter.embedding.android.L;
import java.io.IOException;
import java.math.BigInteger;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.security.Key;
import java.security.KeyPairGenerator;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.cert.CertificateException;
import java.security.spec.AlgorithmParameterSpec;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import javax.crypto.Cipher;
import javax.security.auth.x500.X500Principal;
import k1.C0531a;
import m.B0;
import m2.C0639F;
import m2.I;
import m2.b0;
import m3.C0668b;
import m3.C0675i;
import m3.EnumC0671e;
import n3.InterfaceC0693c;
import n3.InterfaceC0703m;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import q0.C0741a;
import t0.C0837A;
import t0.C0838B;
import t0.C0840D;
import t0.C0846c;
import t0.C0848e;
import t0.C0849f;
import t0.C0855l;
import t0.C0856m;
import t0.C0858o;
import t0.RunnableC0854k;
import t0.t;
import t0.u;

/* JADX INFO: loaded from: classes.dex */
public class l implements K1.h, L, c1.l, InterfaceC0063j, InterfaceC0693c, o0.p, q0.l {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Object f3020l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public Object f3021m;

    public /* synthetic */ l(Object obj, Object obj2) {
        this.f3020l = obj;
        this.f3021m = obj2;
    }

    public static int A(l lVar, String str) {
        String str2;
        lVar.getClass();
        for (int i : O.i.c(4)) {
            if (i == 1) {
                str2 = "SystemUiMode.leanBack";
            } else if (i == 2) {
                str2 = "SystemUiMode.immersive";
            } else if (i == 3) {
                str2 = "SystemUiMode.immersiveSticky";
            } else {
                if (i != 4) {
                    throw null;
                }
                str2 = "SystemUiMode.edgeToEdge";
            }
            if (str2.equals(str)) {
                int iB = O.i.b(i);
                if (iB == 0) {
                    return 1;
                }
                if (iB != 1) {
                    return iB != 2 ? 4 : 3;
                }
                return 2;
            }
        }
        throw new NoSuchFieldException(AbstractC0307a.j("No such SystemUiMode: ", str));
    }

    public static T2.i B(l lVar, JSONObject jSONObject) {
        lVar.getClass();
        return new T2.i(!jSONObject.isNull("statusBarColor") ? Integer.valueOf(jSONObject.getInt("statusBarColor")) : null, !jSONObject.isNull("statusBarIconBrightness") ? B0.b(jSONObject.getString("statusBarIconBrightness")) : 0, !jSONObject.isNull("systemStatusBarContrastEnforced") ? Boolean.valueOf(jSONObject.getBoolean("systemStatusBarContrastEnforced")) : null, !jSONObject.isNull("systemNavigationBarColor") ? Integer.valueOf(jSONObject.getInt("systemNavigationBarColor")) : null, !jSONObject.isNull("systemNavigationBarIconBrightness") ? B0.b(jSONObject.getString("systemNavigationBarIconBrightness")) : 0, !jSONObject.isNull("systemNavigationBarDividerColor") ? Integer.valueOf(jSONObject.getInt("systemNavigationBarDividerColor")) : null, jSONObject.isNull("systemNavigationBarContrastEnforced") ? null : Boolean.valueOf(jSONObject.getBoolean("systemNavigationBarContrastEnforced")));
    }

    /* JADX WARN: Code restructure failed: missing block: B:52:0x0088, code lost:
    
        if (r2 != 8) goto L53;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int y(Z1.l r11, org.json.JSONArray r12) throws org.json.JSONException, java.lang.NoSuchFieldException {
        /*
            r11.getClass()
            r11 = 0
            r0 = r11
            r1 = r0
            r2 = r1
        L7:
            int r3 = r12.length()
            r4 = 2
            r5 = 4
            r6 = 1
            if (r0 >= r3) goto L6b
            java.lang.String r3 = r12.getString(r0)
            int[] r5 = O.i.c(r5)
            int r7 = r5.length
            r8 = r11
        L1a:
            if (r8 >= r7) goto L5f
            r9 = r5[r8]
            r10 = 1
            if (r9 == r10) goto L35
            r10 = 2
            if (r9 == r10) goto L32
            r10 = 3
            if (r9 == r10) goto L2f
            r10 = 4
            if (r9 != r10) goto L2d
            java.lang.String r10 = "DeviceOrientation.landscapeRight"
            goto L37
        L2d:
            r11 = 0
            throw r11
        L2f:
            java.lang.String r10 = "DeviceOrientation.landscapeLeft"
            goto L37
        L32:
            java.lang.String r10 = "DeviceOrientation.portraitDown"
            goto L37
        L35:
            java.lang.String r10 = "DeviceOrientation.portraitUp"
        L37:
            boolean r10 = r10.equals(r3)
            if (r10 == 0) goto L5c
            int r3 = O.i.b(r9)
            if (r3 == 0) goto L54
            if (r3 == r6) goto L51
            if (r3 == r4) goto L4e
            r4 = 3
            if (r3 == r4) goto L4b
            goto L56
        L4b:
            r1 = r1 | 8
            goto L56
        L4e:
            r1 = r1 | 2
            goto L56
        L51:
            r1 = r1 | 4
            goto L56
        L54:
            r1 = r1 | 1
        L56:
            if (r2 != 0) goto L59
            r2 = r1
        L59:
            int r0 = r0 + 1
            goto L7
        L5c:
            int r8 = r8 + 1
            goto L1a
        L5f:
            java.lang.NoSuchFieldException r11 = new java.lang.NoSuchFieldException
            java.lang.String r12 = "No such DeviceOrientation: "
            java.lang.String r12 = b3.AbstractC0307a.j(r12, r3)
            r11.<init>(r12)
            throw r11
        L6b:
            if (r1 == 0) goto L8c
            r12 = 8
            r0 = 9
            switch(r1) {
                case 2: goto L8d;
                case 3: goto L84;
                case 4: goto L82;
                case 5: goto L7f;
                case 6: goto L84;
                case 7: goto L84;
                case 8: goto L7d;
                case 9: goto L84;
                case 10: goto L7a;
                case 11: goto L78;
                case 12: goto L84;
                case 13: goto L84;
                case 14: goto L84;
                case 15: goto L75;
                default: goto L74;
            }
        L74:
            goto L8a
        L75:
            r11 = 13
            goto L8d
        L78:
            r11 = r4
            goto L8d
        L7a:
            r11 = 11
            goto L8d
        L7d:
            r11 = r12
            goto L8d
        L7f:
            r11 = 12
            goto L8d
        L82:
            r11 = r0
            goto L8d
        L84:
            if (r2 == r4) goto L8d
            if (r2 == r5) goto L82
            if (r2 == r12) goto L7d
        L8a:
            r11 = r6
            goto L8d
        L8c:
            r11 = -1
        L8d:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: Z1.l.y(Z1.l, org.json.JSONArray):int");
    }

    public static ArrayList z(l lVar, JSONArray jSONArray) throws JSONException, NoSuchFieldException {
        lVar.getClass();
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < jSONArray.length(); i++) {
            String string = jSONArray.getString(i);
            for (EnumC0671e enumC0671e : EnumC0671e.values()) {
                if (enumC0671e.f8684l.equals(string)) {
                    int iOrdinal = enumC0671e.ordinal();
                    if (iOrdinal == 0) {
                        arrayList.add(EnumC0671e.f8681m);
                    } else if (iOrdinal == 1) {
                        arrayList.add(EnumC0671e.f8682n);
                    }
                }
            }
            throw new NoSuchFieldException(AbstractC0307a.j("No such SystemUiOverlay: ", string));
        }
        return arrayList;
    }

    public String C() {
        return ((Context) this.f3021m).getPackageName() + ".FlutterSecureStoragePluginKey";
    }

    public void D(androidx.fragment.app.r rVar, boolean z4) {
        N3.h.e(rVar, "f");
        androidx.fragment.app.r rVar2 = ((androidx.fragment.app.L) this.f3020l).f4274x;
        if (rVar2 != null) {
            rVar2.e().f4264n.D(rVar, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f3021m).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z4) {
                throw null;
            }
            throw null;
        }
    }

    public void E(androidx.fragment.app.r rVar, boolean z4) {
        N3.h.e(rVar, "f");
        androidx.fragment.app.L l3 = (androidx.fragment.app.L) this.f3020l;
        AbstractActivityC0255w abstractActivityC0255w = l3.f4272v.f4459r;
        androidx.fragment.app.r rVar2 = l3.f4274x;
        if (rVar2 != null) {
            rVar2.e().f4264n.E(rVar, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f3021m).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z4) {
                throw null;
            }
            throw null;
        }
    }

    public void F(androidx.fragment.app.r rVar, boolean z4) {
        N3.h.e(rVar, "f");
        androidx.fragment.app.r rVar2 = ((androidx.fragment.app.L) this.f3020l).f4274x;
        if (rVar2 != null) {
            rVar2.e().f4264n.F(rVar, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f3021m).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z4) {
                throw null;
            }
            throw null;
        }
    }

    public void G(androidx.fragment.app.r rVar, boolean z4) {
        N3.h.e(rVar, "f");
        androidx.fragment.app.r rVar2 = ((androidx.fragment.app.L) this.f3020l).f4274x;
        if (rVar2 != null) {
            rVar2.e().f4264n.G(rVar, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f3021m).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z4) {
                throw null;
            }
            throw null;
        }
    }

    public void H(androidx.fragment.app.r rVar, boolean z4) {
        N3.h.e(rVar, "f");
        androidx.fragment.app.r rVar2 = ((androidx.fragment.app.L) this.f3020l).f4274x;
        if (rVar2 != null) {
            rVar2.e().f4264n.H(rVar, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f3021m).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z4) {
                throw null;
            }
            throw null;
        }
    }

    public void I(androidx.fragment.app.r rVar, boolean z4) {
        N3.h.e(rVar, "f");
        androidx.fragment.app.r rVar2 = ((androidx.fragment.app.L) this.f3020l).f4274x;
        if (rVar2 != null) {
            rVar2.e().f4264n.I(rVar, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f3021m).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z4) {
                throw null;
            }
            throw null;
        }
    }

    public void J(androidx.fragment.app.r rVar, boolean z4) {
        N3.h.e(rVar, "f");
        androidx.fragment.app.L l3 = (androidx.fragment.app.L) this.f3020l;
        AbstractActivityC0255w abstractActivityC0255w = l3.f4272v.f4459r;
        androidx.fragment.app.r rVar2 = l3.f4274x;
        if (rVar2 != null) {
            rVar2.e().f4264n.J(rVar, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f3021m).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z4) {
                throw null;
            }
            throw null;
        }
    }

    public void K(androidx.fragment.app.r rVar, boolean z4) {
        N3.h.e(rVar, "f");
        androidx.fragment.app.r rVar2 = ((androidx.fragment.app.L) this.f3020l).f4274x;
        if (rVar2 != null) {
            rVar2.e().f4264n.K(rVar, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f3021m).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z4) {
                throw null;
            }
            throw null;
        }
    }

    public void L(androidx.fragment.app.r rVar, boolean z4) {
        N3.h.e(rVar, "f");
        androidx.fragment.app.r rVar2 = ((androidx.fragment.app.L) this.f3020l).f4274x;
        if (rVar2 != null) {
            rVar2.e().f4264n.L(rVar, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f3021m).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z4) {
                throw null;
            }
            throw null;
        }
    }

    public void M(androidx.fragment.app.r rVar, Bundle bundle, boolean z4) {
        N3.h.e(rVar, "f");
        androidx.fragment.app.r rVar2 = ((androidx.fragment.app.L) this.f3020l).f4274x;
        if (rVar2 != null) {
            rVar2.e().f4264n.M(rVar, bundle, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f3021m).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z4) {
                throw null;
            }
            throw null;
        }
    }

    public void N(androidx.fragment.app.r rVar, boolean z4) {
        N3.h.e(rVar, "f");
        androidx.fragment.app.r rVar2 = ((androidx.fragment.app.L) this.f3020l).f4274x;
        if (rVar2 != null) {
            rVar2.e().f4264n.N(rVar, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f3021m).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z4) {
                throw null;
            }
            throw null;
        }
    }

    public void O(androidx.fragment.app.r rVar, boolean z4) {
        N3.h.e(rVar, "f");
        androidx.fragment.app.r rVar2 = ((androidx.fragment.app.L) this.f3020l).f4274x;
        if (rVar2 != null) {
            rVar2.e().f4264n.O(rVar, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f3021m).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z4) {
                throw null;
            }
            throw null;
        }
    }

    public void P(androidx.fragment.app.r rVar, D d5, boolean z4) {
        N3.h.e(rVar, "f");
        N3.h.e(d5, "v");
        androidx.fragment.app.r rVar2 = ((androidx.fragment.app.L) this.f3020l).f4274x;
        if (rVar2 != null) {
            rVar2.e().f4264n.P(rVar, d5, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f3021m).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z4) {
                throw null;
            }
            throw null;
        }
    }

    public void Q(androidx.fragment.app.r rVar, boolean z4) {
        N3.h.e(rVar, "f");
        androidx.fragment.app.r rVar2 = ((androidx.fragment.app.L) this.f3020l).f4274x;
        if (rVar2 != null) {
            rVar2.e().f4264n.Q(rVar, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f3021m).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z4) {
                throw null;
            }
            throw null;
        }
    }

    public AlgorithmParameterSpec R() {
        return null;
    }

    public View S(int i) {
        io.flutter.plugin.platform.o oVar = (io.flutter.plugin.platform.o) this.f3021m;
        return oVar.b(i) != null ? oVar.b(i) : ((io.flutter.plugin.platform.p) this.f3020l).h(i);
    }

    public Cipher T() {
        return Cipher.getInstance("RSA/ECB/PKCS1Padding", "AndroidKeyStoreBCWorkaround");
    }

    public synchronized Map U() {
        try {
            if (((Map) this.f3021m) == null) {
                this.f3021m = Collections.unmodifiableMap(new HashMap((HashMap) this.f3020l));
            }
        } catch (Throwable th) {
            throw th;
        }
        return (Map) this.f3021m;
    }

    public KeyGenParameterSpec V(Calendar calendar, Calendar calendar2) {
        String str = (String) this.f3020l;
        return new KeyGenParameterSpec.Builder(str, 3).setCertificateSubject(new X500Principal(AbstractC0307a.j("CN=", str))).setDigests("SHA-256").setBlockModes("ECB").setEncryptionPaddings("PKCS1Padding").setCertificateSerialNumber(BigInteger.valueOf(1L)).setCertificateNotBefore(calendar.getTime()).setCertificateNotAfter(calendar2.getTime()).build();
    }

    public void W(c cVar) {
        boolean z4;
        C0837A c0837aA = C0837A.f9802c;
        String str = (String) ((C0840D) cVar.f2997m).f9820a.get("range");
        C0855l c0855l = (C0855l) this.f3021m;
        if (str != null) {
            try {
                c0837aA = C0837A.a(str);
            } catch (C0157H e5) {
                c0855l.f9915l.s("SDP format error.", e5);
                return;
            }
        }
        Uri uri = c0855l.f9922s;
        C0639F c0639f = new C0639F();
        int i = 0;
        while (true) {
            C0840D c0840d = (C0840D) cVar.f2997m;
            if (i < c0840d.f9821b.size()) {
                C0846c c0846c = (C0846c) c0840d.f9821b.get(i);
                String strJ = AbstractC0149a.J(c0846c.f9861j.f9850b);
                strJ.getClass();
                switch (strJ) {
                    case "MPEG4-GENERIC":
                    case "L8":
                    case "AC3":
                    case "AMR":
                    case "L16":
                    case "VP8":
                    case "VP9":
                    case "H264":
                    case "H265":
                    case "OPUS":
                    case "PCMA":
                    case "PCMU":
                    case "MP4A-LATM":
                    case "AMR-WB":
                    case "MP4V-ES":
                    case "H263-1998":
                    case "H263-2000":
                        z4 = true;
                        break;
                    default:
                        z4 = false;
                        break;
                }
                if (z4) {
                    c0639f.c(new u((C0856m) cVar.f2996l, c0846c, uri));
                }
                i++;
            } else {
                b0 b0VarG = c0639f.g();
                boolean zIsEmpty = b0VarG.isEmpty();
                C0675i c0675i = c0855l.f9915l;
                if (zIsEmpty) {
                    c0675i.s("No playable track.", null);
                    return;
                }
                c0675i.getClass();
                int i5 = 0;
                while (true) {
                    int size = b0VarG.size();
                    t0.q qVar = (t0.q) c0675i.f8712m;
                    if (i5 >= size) {
                        C0675i c0675i2 = qVar.f9955r;
                        c0675i2.getClass();
                        long j5 = c0837aA.f9804a;
                        long j6 = c0837aA.f9805b;
                        long jM = AbstractC0370w.M(j6 - j5);
                        t tVar = (t) c0675i2.f8712m;
                        tVar.f9969w = jM;
                        tVar.f9970x = !(j6 == -9223372036854775807L);
                        tVar.y = j6 == -9223372036854775807L;
                        tVar.f9971z = false;
                        tVar.w();
                        c0855l.f9911A = true;
                        return;
                    }
                    t0.p pVar = new t0.p(qVar, (u) b0VarG.get(i5), i5, qVar.f9956s);
                    qVar.f9953p.add(pVar);
                    pVar.b();
                    i5++;
                }
            }
        }
    }

    public void X(C0675i c0675i) {
        C0855l c0855l = (C0855l) this.f3021m;
        if (c0855l.f9927x != null) {
            return;
        }
        I i = (I) c0675i.f8712m;
        if (!i.isEmpty() && !i.contains(2)) {
            c0855l.f9915l.s("DESCRIBE not supported.", null);
            return;
        }
        c0855l.f9921r.q(c0855l.f9922s, c0855l.f9925v);
    }

    public void Y() {
        C0855l c0855l = (C0855l) this.f3021m;
        AbstractC0360m.h(c0855l.f9928z == 2);
        c0855l.f9928z = 1;
        c0855l.f9913C = false;
        long j5 = c0855l.f9914D;
        if (j5 != -9223372036854775807L) {
            c0855l.o(AbstractC0370w.Z(j5));
        }
    }

    public void Z(c cVar) {
        t0.q qVar;
        C0848e c0848e;
        C0855l c0855l = (C0855l) this.f3021m;
        int i = c0855l.f9928z;
        AbstractC0360m.h(i == 1 || i == 2);
        c0855l.f9928z = 2;
        if (c0855l.f9927x == null) {
            long j5 = c0855l.f9926w / 2;
            RunnableC0854k runnableC0854k = new RunnableC0854k(c0855l, j5);
            c0855l.f9927x = runnableC0854k;
            if (!runnableC0854k.f9909n) {
                runnableC0854k.f9909n = true;
                runnableC0854k.f9907l.postDelayed(runnableC0854k, j5);
            }
        }
        c0855l.f9914D = -9223372036854775807L;
        C0675i c0675i = c0855l.f9916m;
        long jM = AbstractC0370w.M(((C0837A) cVar.f2996l).f9804a);
        I i5 = (I) cVar.f2997m;
        c0675i.getClass();
        ArrayList arrayList = new ArrayList(i5.size());
        for (int i6 = 0; i6 < i5.size(); i6++) {
            String path = ((C0838B) i5.get(i6)).f9808c.getPath();
            AbstractC0360m.f(path);
            arrayList.add(path);
        }
        int i7 = 0;
        while (true) {
            qVar = (t0.q) c0675i.f8712m;
            if (i7 >= qVar.f9954q.size()) {
                break;
            }
            if (!arrayList.contains(((C0858o) qVar.f9954q.get(i7)).a().getPath())) {
                t tVar = (t) qVar.f9955r.f8712m;
                tVar.f9970x = false;
                tVar.w();
                if (t0.q.m(qVar)) {
                    qVar.f9943B = true;
                    qVar.y = -9223372036854775807L;
                    qVar.f9961x = -9223372036854775807L;
                    qVar.f9962z = -9223372036854775807L;
                }
            }
            i7++;
        }
        for (int i8 = 0; i8 < i5.size(); i8++) {
            C0838B c0838b = (C0838B) i5.get(i8);
            Uri uri = c0838b.f9808c;
            int i9 = 0;
            while (true) {
                ArrayList arrayList2 = qVar.f9953p;
                if (i9 >= arrayList2.size()) {
                    c0848e = null;
                    break;
                }
                if (!((t0.p) arrayList2.get(i9)).f9939d) {
                    C0858o c0858o = ((t0.p) arrayList2.get(i9)).f9936a;
                    if (c0858o.a().equals(uri)) {
                        c0848e = c0858o.f9933b;
                        break;
                    }
                }
                i9++;
            }
            if (c0848e != null) {
                long j6 = c0838b.f9806a;
                if (j6 != -9223372036854775807L) {
                    C0849f c0849f = c0848e.f9869s;
                    c0849f.getClass();
                    if (!c0849f.f9881h) {
                        c0848e.f9869s.i = j6;
                    }
                } else {
                    c0848e.getClass();
                }
                int i10 = c0838b.f9807b;
                C0849f c0849f2 = c0848e.f9869s;
                c0849f2.getClass();
                if (!c0849f2.f9881h) {
                    c0848e.f9869s.f9882j = i10;
                }
                if (t0.q.m(qVar) && qVar.y == qVar.f9961x) {
                    c0848e.f9872v = jM;
                    c0848e.f9873w = j6;
                }
            }
        }
        if (!t0.q.m(qVar)) {
            if (qVar.f9962z == -9223372036854775807L || !qVar.f9948G) {
                return;
            }
            qVar.o(qVar.f9962z);
            qVar.f9962z = -9223372036854775807L;
            return;
        }
        if (qVar.y == qVar.f9961x) {
            qVar.y = -9223372036854775807L;
            qVar.f9961x = -9223372036854775807L;
        } else {
            qVar.y = -9223372036854775807L;
            qVar.o(qVar.f9961x);
        }
    }

    @Override // q0.l
    public void a(Bundle bundle) {
        ((MediaCodec) this.f3020l).setParameters(bundle);
    }

    public void a0(C0675i c0675i) {
        C0855l c0855l = (C0855l) this.f3021m;
        AbstractC0360m.h(c0855l.f9928z != -1);
        c0855l.f9928z = 1;
        N0.c cVar = (N0.c) c0675i.f8712m;
        c0855l.f9925v = (String) cVar.f1573n;
        c0855l.f9926w = cVar.f1572m;
        c0855l.k();
    }

    @Override // q0.l
    public void b(int i, C0118a c0118a, long j5, int i5) {
        ((MediaCodec) this.f3020l).queueSecureInputBuffer(i, 0, (MediaCodec.CryptoInfo) c0118a.i, j5, i5);
    }

    public void b0(y2.k kVar) throws GeneralSecurityException {
        y2.l lVar = new y2.l(kVar.f10948a, z2.g.class);
        HashMap map = (HashMap) this.f3020l;
        if (!map.containsKey(lVar)) {
            map.put(lVar, kVar);
            return;
        }
        y2.k kVar2 = (y2.k) map.get(lVar);
        if (kVar2.equals(kVar) && kVar.equals(kVar2)) {
            return;
        }
        throw new GeneralSecurityException("Attempt to register non-equal PrimitiveConstructor object for already existing object of type: " + lVar);
    }

    @Override // q0.l
    public void c(int i, int i5, long j5, int i6) {
        ((MediaCodec) this.f3020l).queueInputBuffer(i, 0, i5, j5, i6);
    }

    public void c0(r2.m mVar) throws GeneralSecurityException {
        if (mVar == null) {
            throw new NullPointerException("wrapper must be non-null");
        }
        Class clsC = mVar.c();
        HashMap map = (HashMap) this.f3021m;
        if (!map.containsKey(clsC)) {
            map.put(clsC, mVar);
            return;
        }
        r2.m mVar2 = (r2.m) map.get(clsC);
        if (mVar2.equals(mVar) && mVar.equals(mVar2)) {
            return;
        }
        throw new GeneralSecurityException("Attempt to register non-equal PrimitiveWrapper object or input class object for already existing object of type" + clsC);
    }

    @Override // q0.l
    public int d(MediaCodec.BufferInfo bufferInfo) {
        int iDequeueOutputBuffer;
        do {
            iDequeueOutputBuffer = ((MediaCodec) this.f3020l).dequeueOutputBuffer(bufferInfo, 0L);
        } while (iDequeueOutputBuffer == -3);
        return iDequeueOutputBuffer;
    }

    public void d0(Locale locale) {
        Locale.setDefault(locale);
        Context context = (Context) this.f3021m;
        Configuration configuration = context.getResources().getConfiguration();
        configuration.setLocale(locale);
        context.createConfigurationContext(configuration);
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x011c A[EDGE_INSN: B:64:0x011c->B:50:0x011c BREAK  A[LOOP:1: B:36:0x00e3->B:49:0x010b], SYNTHETIC] */
    @Override // F0.InterfaceC0063j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public F0.C0062i e(F0.C0066m r17, long r18) {
        /*
            Method dump skipped, instruction units count: 306
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Z1.l.e(F0.m, long):F0.i");
    }

    public void e0(R1.k kVar, int i) {
        N3.h.e(kVar, "workSpecId");
        ((i) this.f3021m).h(new a2.q((R1.f) this.f3020l, kVar, false, i));
    }

    public Key f0(byte[] bArr) throws Exception {
        KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
        keyStore.load(null);
        String str = (String) this.f3020l;
        Key key = keyStore.getKey(str, null);
        if (key == null) {
            throw new Exception(AbstractC0307a.j("No key found under alias: ", str));
        }
        if (!(key instanceof PrivateKey)) {
            throw new Exception("Not an instance of a PrivateKey");
        }
        Cipher cipherT = T();
        cipherT.init(4, (PrivateKey) key, R());
        return cipherT.unwrap(bArr, "AES", 3);
    }

    @Override // q0.l
    public void flush() {
        ((MediaCodec) this.f3020l).flush();
    }

    @Override // q0.l
    public void g(long j5, int i) {
        ((MediaCodec) this.f3020l).releaseOutputBuffer(i, j5);
    }

    public boolean g0(int i) {
        io.flutter.plugin.platform.o oVar = (io.flutter.plugin.platform.o) this.f3021m;
        if (oVar.b(i) == null) {
            return ((io.flutter.plugin.platform.p) this.f3020l).n(i);
        }
        oVar.getClass();
        return false;
    }

    @Override // q0.l
    public void h() {
        ((MediaCodec) this.f3020l).detachOutputSurface();
    }

    @Override // q0.l
    public ByteBuffer i(int i) {
        return ((MediaCodec) this.f3020l).getInputBuffer(i);
    }

    @Override // q0.l
    public void j(Surface surface) {
        ((MediaCodec) this.f3020l).setOutputSurface(surface);
    }

    @Override // q0.l
    public void k(int i) {
        ((MediaCodec) this.f3020l).releaseOutputBuffer(i, false);
    }

    @Override // q0.l
    public ByteBuffer l(int i) {
        return ((MediaCodec) this.f3020l).getOutputBuffer(i);
    }

    @Override // o0.p
    public B0.t m() {
        return new e(((C0200z) this.f3020l).m(), 20, (List) this.f3021m);
    }

    @Override // o0.p
    public B0.t n(o0.l lVar, o0.i iVar) {
        ((C0200z) this.f3020l).getClass();
        return new e(new o0.o(lVar, iVar), 20, (List) this.f3021m);
    }

    @Override // c1.l
    public int o() {
        return 1;
    }

    @Override // q0.l
    public int p() {
        return ((MediaCodec) this.f3020l).dequeueInputBuffer(0L);
    }

    @Override // q0.l
    public void q(int i) {
        ((MediaCodec) this.f3020l).setVideoScalingMode(i);
    }

    @Override // io.flutter.embedding.android.L
    public void r(KeyEvent keyEvent, C0187m c0187m) {
        int action = keyEvent.getAction();
        if (action != 0 && action != 1) {
            c0187m.c(false);
            return;
        }
        Character chA = ((c4.i) this.f3021m).a(keyEvent.getUnicodeChar());
        boolean z4 = action != 0;
        I2.g gVar = new I2.g(c0187m, 17);
        C0668b c0668b = (C0668b) this.f3020l;
        HashMap map = new HashMap();
        map.put("type", z4 ? "keyup" : "keydown");
        map.put("keymap", "android");
        map.put("flags", Integer.valueOf(keyEvent.getFlags()));
        map.put("plainCodePoint", Integer.valueOf(keyEvent.getUnicodeChar(0)));
        map.put("codePoint", Integer.valueOf(keyEvent.getUnicodeChar()));
        map.put("keyCode", Integer.valueOf(keyEvent.getKeyCode()));
        map.put("scanCode", Integer.valueOf(keyEvent.getScanCode()));
        map.put("metaState", Integer.valueOf(keyEvent.getMetaState()));
        map.put("character", chA.toString());
        map.put("source", Integer.valueOf(keyEvent.getSource()));
        map.put("deviceId", Integer.valueOf(keyEvent.getDeviceId()));
        map.put("repeatCount", Integer.valueOf(keyEvent.getRepeatCount()));
        c0668b.f8673a.D(map, new I2.g(gVar, 20));
    }

    @Override // q0.l
    public void release() {
        s sVar = (s) this.f3021m;
        MediaCodec mediaCodec = (MediaCodec) this.f3020l;
        try {
            int i = AbstractC0370w.f5326a;
            if (i >= 30 && i < 33) {
                mediaCodec.stop();
            }
            if (i >= 35 && sVar != null) {
                sVar.P(mediaCodec);
            }
            mediaCodec.release();
        } catch (Throwable th) {
            if (AbstractC0370w.f5326a >= 35 && sVar != null) {
                sVar.P(mediaCodec);
            }
            mediaCodec.release();
            throw th;
        }
    }

    @Override // q0.l
    public void s(D0.f fVar, Handler handler) {
        ((MediaCodec) this.f3020l).setOnFrameRenderedListener(new C0741a(this, fVar, 1), handler);
    }

    @Override // F0.InterfaceC0063j
    public void t() {
        byte[] bArr = AbstractC0370w.f5331f;
        C0363p c0363p = (C0363p) this.f3021m;
        c0363p.getClass();
        c0363p.F(bArr.length, bArr);
    }

    @Override // n3.InterfaceC0693c
    public void u(Object obj) {
        ((f3.g) this.f3020l).a(((InterfaceC0703m) ((i) ((c) this.f3021m).f2997m).f3014n).b(obj));
    }

    @Override // q0.l
    public MediaFormat w() {
        return ((MediaCodec) this.f3020l).getOutputFormat();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0253  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x025f  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x036a  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x036f  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x0374  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x0387  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x0364 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00ae  */
    /* JADX WARN: Type inference failed for: r13v18 */
    /* JADX WARN: Type inference failed for: r13v19, types: [boolean] */
    /* JADX WARN: Type inference failed for: r13v20 */
    /* JADX WARN: Type inference failed for: r14v2 */
    /* JADX WARN: Type inference failed for: r14v3 */
    /* JADX WARN: Type inference failed for: r14v5 */
    /* JADX WARN: Type inference failed for: r2v25 */
    /* JADX WARN: Type inference failed for: r2v26 */
    /* JADX WARN: Type inference failed for: r2v30 */
    /* JADX WARN: Type inference failed for: r3v51 */
    /* JADX WARN: Type inference failed for: r3v52 */
    /* JADX WARN: Type inference failed for: r3v53 */
    /*  JADX ERROR: UnsupportedOperationException in pass: RegionMakerVisitor
        java.lang.UnsupportedOperationException
        	at java.base/java.util.Collections$UnmodifiableCollection.add(Collections.java:1093)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker$1.leaveRegion(SwitchRegionMaker.java:390)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:70)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:23)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.insertBreaksForCase(SwitchRegionMaker.java:370)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.insertBreaks(SwitchRegionMaker.java:85)
        	at jadx.core.dex.visitors.regions.PostProcessRegions.leaveRegion(PostProcessRegions.java:33)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:70)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1118)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1118)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1118)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1118)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1118)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1118)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1118)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1118)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1118)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1118)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1118)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1118)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1118)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1118)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1118)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1118)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1118)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1118)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1118)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1118)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1118)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1118)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1118)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:19)
        	at jadx.core.dex.visitors.regions.PostProcessRegions.process(PostProcessRegions.java:23)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:31)
        */
    @Override // c1.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void x(byte[] r20, int r21, int r22, c1.k r23, d0.InterfaceC0351d r24) {
        /*
            Method dump skipped, instruction units count: 1068
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Z1.l.x(byte[], int, int, c1.k, d0.d):void");
    }

    public l(Context context) throws NoSuchAlgorithmException, IOException, KeyStoreException, CertificateException {
        this.f3021m = context;
        String strC = C();
        this.f3020l = strC;
        KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
        keyStore.load(null);
        if (keyStore.getKey(strC, null) == null) {
            Locale locale = Locale.getDefault();
            try {
                d0(Locale.ENGLISH);
                Calendar calendar = Calendar.getInstance();
                Calendar calendar2 = Calendar.getInstance();
                calendar2.add(1, 25);
                KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance("RSA", "AndroidKeyStore");
                keyPairGenerator.initialize(V(calendar, calendar2));
                keyPairGenerator.generateKeyPair();
            } finally {
                d0(locale);
            }
        }
    }

    public l(y2.m mVar) {
        this.f3020l = new HashMap(mVar.f10952a);
        this.f3021m = new HashMap(mVar.f10953b);
    }

    public l(R1.f fVar, i iVar) {
        N3.h.e(fVar, "processor");
        N3.h.e(iVar, "workTaskExecutor");
        this.f3020l = fVar;
        this.f3021m = iVar;
    }

    public l(int i) {
        switch (i) {
            case 12:
                this.f3020l = new C0363p();
                this.f3021m = new C0531a();
                break;
            case 22:
                this.f3020l = new HashMap();
                this.f3021m = new HashMap();
                break;
            default:
                this.f3020l = new HashMap();
                break;
        }
    }

    public l(MediaCodec mediaCodec, s sVar) {
        this.f3020l = mediaCodec;
        this.f3021m = sVar;
        if (AbstractC0370w.f5326a < 35 || sVar == null) {
            return;
        }
        LoudnessCodecController loudnessCodecController = (LoudnessCodecController) sVar.f3087o;
        if (loudnessCodecController == null || loudnessCodecController.addMediaCodec(mediaCodec)) {
            AbstractC0360m.h(((HashSet) sVar.f3085m).add(mediaCodec));
        }
    }

    public l(C0855l c0855l) {
        this.f3021m = c0855l;
        this.f3020l = AbstractC0370w.m(null);
    }
}

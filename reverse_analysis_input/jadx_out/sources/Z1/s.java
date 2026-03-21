package Z1;

import D0.y;
import F0.E;
import Q1.C;
import a.AbstractC0149a;
import a0.AbstractC0156G;
import a0.C0189o;
import a0.C0190p;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.Cursor;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.media.LoudnessCodecController;
import android.media.MediaCodec;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.util.Base64;
import android.util.Log;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.View;
import androidx.lifecycle.AbstractServiceC0281x;
import androidx.lifecycle.C0280w;
import androidx.lifecycle.EnumC0272n;
import androidx.lifecycle.S;
import androidx.recyclerview.widget.RecyclerView;
import androidx.work.impl.WorkDatabase_Impl;
import b0.C0298b;
import b0.C0303g;
import b0.InterfaceC0300d;
import b3.AbstractC0307a;
import d0.AbstractC0360m;
import io.flutter.view.FlutterCallbackInformation;
import j0.u;
import j0.v;
import j0.z;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.KeyStore;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.cert.Certificate;
import java.security.spec.AlgorithmParameterSpec;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import m.B0;
import m3.C0675i;
import n3.InterfaceC0696f;
import n3.InterfaceC0699i;
import n3.x;
import org.xmlpull.v1.XmlPullParserException;
import t3.C0874e;
import t3.C0876g;
import t3.InterfaceC0875f;
import t3.K;
import t3.L;
import t3.N;
import v.AbstractC0905b;
import w2.C0945a;
import w2.C0946b;
import w2.C0947c;
import z2.C1065a;

/* JADX INFO: loaded from: classes.dex */
public class s implements F0.s, InterfaceC0875f {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f3084l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public Object f3085m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public Object f3086n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public Object f3087o;

    public /* synthetic */ s(int i, boolean z4) {
        this.f3084l = i;
    }

    public static s M(Context context, AttributeSet attributeSet, int[] iArr, int i) {
        return new s(context, context.obtainStyledAttributes(attributeSet, iArr, i, 0));
    }

    public String A() {
        return "VGhpcyBpcyB0aGUga2V5IGZvciBhIHNlY3VyZSBzdG9yYWdlIEFFUyBLZXkK";
    }

    public Cipher B() {
        return Cipher.getInstance("AES/CBC/PKCS7Padding");
    }

    public ColorStateList C(int i) {
        int resourceId;
        ColorStateList colorStateListT;
        TypedArray typedArray = (TypedArray) this.f3086n;
        return (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0 || (colorStateListT = AbstractC0149a.t((Context) this.f3085m, resourceId)) == null) ? typedArray.getColorStateList(i) : colorStateListT;
    }

    public Drawable D(int i) {
        int resourceId;
        TypedArray typedArray = (TypedArray) this.f3086n;
        return (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0) ? typedArray.getDrawable(i) : AbstractC0149a.u((Context) this.f3085m, resourceId);
    }

    public Typeface E(int i, int i5, Z0.e eVar) {
        int i6 = 23;
        int resourceId = ((TypedArray) this.f3086n).getResourceId(i, 0);
        if (resourceId == 0) {
            return null;
        }
        if (((TypedValue) this.f3087o) == null) {
            this.f3087o = new TypedValue();
        }
        TypedValue typedValue = (TypedValue) this.f3087o;
        ThreadLocal threadLocal = v.l.f10292a;
        Context context = (Context) this.f3085m;
        if (context.isRestricted()) {
            return null;
        }
        Resources resources = context.getResources();
        resources.getValue(resourceId, typedValue, true);
        CharSequence charSequence = typedValue.string;
        if (charSequence == null) {
            throw new Resources.NotFoundException("Resource \"" + resources.getResourceName(resourceId) + "\" (" + Integer.toHexString(resourceId) + ") is not a Font: " + typedValue);
        }
        String string = charSequence.toString();
        if (!string.startsWith("res/")) {
            eVar.b();
            return null;
        }
        int i7 = typedValue.assetCookie;
        Z0.g gVar = w.f.f10408b;
        Typeface typeface = (Typeface) gVar.d(w.f.b(resources, resourceId, string, i7, i5));
        if (typeface != null) {
            new Handler(Looper.getMainLooper()).post(new y(eVar, i6, typeface));
            return typeface;
        }
        try {
            if (string.toLowerCase().endsWith(".xml")) {
                v.e eVarE = AbstractC0905b.e(resources.getXml(resourceId), resources);
                if (eVarE != null) {
                    return w.f.a(context, eVarE, resources, resourceId, string, typedValue.assetCookie, i5, eVar);
                }
                Log.e("ResourcesCompat", "Failed to find font-family tag");
                eVar.b();
                return null;
            }
            int i8 = typedValue.assetCookie;
            Typeface typefaceM = w.f.f10407a.m(context, resources, resourceId, string, i5);
            if (typefaceM != null) {
                gVar.e(w.f.b(resources, resourceId, string, i8, i5), typefaceM);
            }
            if (typefaceM != null) {
                new Handler(Looper.getMainLooper()).post(new y(eVar, i6, typefaceM));
            } else {
                eVar.b();
            }
            return typefaceM;
        } catch (IOException e5) {
            Log.e("ResourcesCompat", "Failed to read xml resource ".concat(string), e5);
            eVar.b();
            return null;
        } catch (XmlPullParserException e6) {
            Log.e("ResourcesCompat", "Failed to parse xml resource ".concat(string), e6);
            eVar.b();
            return null;
        }
    }

    public int F() {
        return 16;
    }

    public AlgorithmParameterSpec G(byte[] bArr) {
        return new IvParameterSpec(bArr);
    }

    public List H(byte[] bArr) {
        List list = (List) ((ConcurrentHashMap) this.f3085m).get(new r2.l(bArr));
        return list != null ? list : Collections.emptyList();
    }

    public ArrayList I(String str) {
        s1.j jVarC = s1.j.c("SELECT DISTINCT tag FROM worktag WHERE work_spec_id=?", 1);
        if (str == null) {
            jVarC.g(1);
        } else {
            jVarC.h(str, 1);
        }
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f3085m;
        workDatabase_Impl.b();
        Cursor cursorL0 = C.l0(workDatabase_Impl, jVarC, false);
        try {
            ArrayList arrayList = new ArrayList(cursorL0.getCount());
            while (cursorL0.moveToNext()) {
                arrayList.add(cursorL0.isNull(0) ? null : cursorL0.getString(0));
            }
            return arrayList;
        } finally {
            cursorL0.close();
            jVarC.f();
        }
    }

    public View J(int i) {
        return ((RecyclerView) ((C0675i) this.f3085m).f8712m).getChildAt(i);
    }

    public int K() {
        return ((RecyclerView) ((C0675i) this.f3085m).f8712m).getChildCount();
    }

    public void L(String str, LinkedHashSet linkedHashSet) {
        N3.h.e(str, "id");
        N3.h.e(linkedHashSet, "tags");
        Iterator it = linkedHashSet.iterator();
        while (it.hasNext()) {
            r rVar = new r((String) it.next(), str);
            WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f3085m;
            workDatabase_Impl.b();
            workDatabase_Impl.c();
            try {
                ((b) this.f3086n).m(rVar);
                workDatabase_Impl.o();
            } finally {
                workDatabase_Impl.k();
            }
        }
    }

    public void N(EnumC0272n enumC0272n) {
        S s4 = (S) this.f3087o;
        if (s4 != null) {
            s4.run();
        }
        S s5 = new S((C0280w) this.f3085m, enumC0272n);
        this.f3087o = s5;
        ((Handler) this.f3086n).postAtFrontOfQueue(s5);
    }

    public void O() {
        ((TypedArray) this.f3086n).recycle();
    }

    public void P(MediaCodec mediaCodec) {
        LoudnessCodecController loudnessCodecController;
        if (!((HashSet) this.f3085m).remove(mediaCodec) || (loudnessCodecController = (LoudnessCodecController) this.f3087o) == null) {
            return;
        }
        loudnessCodecController.removeMediaCodec(mediaCodec);
    }

    public void Q(InterfaceC0699i interfaceC0699i) {
        ((InterfaceC0696f) this.f3085m).k((String) this.f3086n, interfaceC0699i == null ? null : new m(this, interfaceC0699i));
    }

    @Override // t3.InterfaceC0875f
    public void a(String str, List list, C0876g c0876g) {
        x(c0876g).edit().putString(str, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu".concat(((p1.b) this.f3087o).o(list))).apply();
    }

    @Override // t3.InterfaceC0875f
    public Map b(List list, C0876g c0876g) {
        Object value;
        Map<String, ?> all = x(c0876g).getAll();
        N3.h.d(all, "getAll(...)");
        HashMap map = new HashMap();
        for (Map.Entry<String, ?> entry : all.entrySet()) {
            if (K.b(entry.getKey(), entry.getValue(), list != null ? C3.f.Z(list) : null) && (value = entry.getValue()) != null) {
                String key = entry.getKey();
                Object objC = K.c(value, (p1.b) this.f3087o);
                N3.h.c(objC, "null cannot be cast to non-null type kotlin.Any");
                map.put(key, objC);
            }
        }
        return map;
    }

    @Override // t3.InterfaceC0875f
    public void c(String str, long j5, C0876g c0876g) {
        x(c0876g).edit().putLong(str, j5).apply();
    }

    @Override // F0.s
    public void d(E e5) {
        ((F0.s) this.f3085m).d(e5);
    }

    @Override // t3.InterfaceC0875f
    public void e(String str, String str2, C0876g c0876g) {
        x(c0876g).edit().putString(str, str2).apply();
    }

    @Override // t3.InterfaceC0875f
    public void f(List list, C0876g c0876g) {
        SharedPreferences sharedPreferencesX = x(c0876g);
        SharedPreferences.Editor editorEdit = sharedPreferencesX.edit();
        N3.h.d(editorEdit, "edit(...)");
        Map<String, ?> all = sharedPreferencesX.getAll();
        N3.h.d(all, "getAll(...)");
        ArrayList arrayList = new ArrayList();
        for (String str : all.keySet()) {
            if (K.b(str, all.get(str), list != null ? C3.f.Z(list) : null)) {
                arrayList.add(str);
            }
        }
        Iterator it = arrayList.iterator();
        N3.h.d(it, "iterator(...)");
        while (it.hasNext()) {
            Object next = it.next();
            N3.h.d(next, "next(...)");
            editorEdit.remove((String) next);
        }
        editorEdit.apply();
    }

    @Override // t3.InterfaceC0875f
    public void g(String str, String str2, C0876g c0876g) {
        x(c0876g).edit().putString(str, str2).apply();
    }

    @Override // t3.InterfaceC0875f
    public void h(String str, double d5, C0876g c0876g) {
        x(c0876g).edit().putString(str, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBEb3VibGUu" + d5).apply();
    }

    @Override // t3.InterfaceC0875f
    public Long i(String str, C0876g c0876g) {
        long j5;
        SharedPreferences sharedPreferencesX = x(c0876g);
        if (!sharedPreferencesX.contains(str)) {
            return null;
        }
        try {
            j5 = sharedPreferencesX.getLong(str, 0L);
        } catch (ClassCastException unused) {
            j5 = sharedPreferencesX.getInt(str, 0);
        }
        return Long.valueOf(j5);
    }

    @Override // F0.s
    public void j() {
        ((F0.s) this.f3085m).j();
    }

    @Override // F0.s
    public F0.K k(int i, int i5) {
        F0.s sVar = (F0.s) this.f3085m;
        if (i5 != 3) {
            return sVar.k(i, i5);
        }
        SparseArray sparseArray = (SparseArray) this.f3087o;
        c1.n nVar = (c1.n) sparseArray.get(i);
        if (nVar != null) {
            return nVar;
        }
        c1.n nVar2 = new c1.n(sVar.k(i, i5), (c1.j) this.f3086n);
        sparseArray.put(i, nVar2);
        return nVar2;
    }

    @Override // t3.InterfaceC0875f
    public ArrayList l(String str, C0876g c0876g) {
        List list;
        SharedPreferences sharedPreferencesX = x(c0876g);
        ArrayList arrayList = null;
        if (sharedPreferencesX.contains(str)) {
            String string = sharedPreferencesX.getString(str, "");
            N3.h.b(string);
            if (string.startsWith("VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu") && !string.startsWith("VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu!") && (list = (List) K.c(sharedPreferencesX.getString(str, ""), (p1.b) this.f3087o)) != null) {
                arrayList = new ArrayList();
                for (Object obj : list) {
                    if (obj instanceof String) {
                        arrayList.add(obj);
                    }
                }
            }
        }
        return arrayList;
    }

    @Override // t3.InterfaceC0875f
    public Double m(String str, C0876g c0876g) {
        SharedPreferences sharedPreferencesX = x(c0876g);
        if (!sharedPreferencesX.contains(str)) {
            return null;
        }
        Object objC = K.c(sharedPreferencesX.getString(str, ""), (p1.b) this.f3087o);
        N3.h.c(objC, "null cannot be cast to non-null type kotlin.Double");
        return (Double) objC;
    }

    @Override // t3.InterfaceC0875f
    public List n(List list, C0876g c0876g) {
        Map<String, ?> all = x(c0876g).getAll();
        N3.h.d(all, "getAll(...)");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, ?> entry : all.entrySet()) {
            String key = entry.getKey();
            N3.h.d(key, "<get-key>(...)");
            if (K.b(key, entry.getValue(), list != null ? C3.f.Z(list) : null)) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return C3.f.X(linkedHashMap.keySet());
    }

    @Override // t3.InterfaceC0875f
    public N o(String str, C0876g c0876g) {
        SharedPreferences sharedPreferencesX = x(c0876g);
        if (!sharedPreferencesX.contains(str)) {
            return null;
        }
        String string = sharedPreferencesX.getString(str, "");
        N3.h.b(string);
        return string.startsWith("VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu!") ? new N(string, L.f10051o) : string.startsWith("VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu") ? new N(null, L.f10050n) : new N(null, L.f10052p);
    }

    @Override // t3.InterfaceC0875f
    public String p(String str, C0876g c0876g) {
        SharedPreferences sharedPreferencesX = x(c0876g);
        if (sharedPreferencesX.contains(str)) {
            return sharedPreferencesX.getString(str, "");
        }
        return null;
    }

    @Override // t3.InterfaceC0875f
    public void q(String str, boolean z4, C0876g c0876g) {
        x(c0876g).edit().putBoolean(str, z4).apply();
    }

    @Override // t3.InterfaceC0875f
    public Boolean r(String str, C0876g c0876g) {
        SharedPreferences sharedPreferencesX = x(c0876g);
        if (sharedPreferencesX.contains(str)) {
            return Boolean.valueOf(sharedPreferencesX.getBoolean(str, true));
        }
        return null;
    }

    public s2.q s() throws GeneralSecurityException {
        B0.d dVar;
        s2.r rVar = (s2.r) this.f3085m;
        if (rVar == null || (dVar = (B0.d) this.f3086n) == null) {
            throw new GeneralSecurityException("Cannot build without parameters and/or key material");
        }
        if (rVar.f9666b != ((F2.a) dVar.f190l).f860a.length) {
            throw new GeneralSecurityException("Key size mismatch");
        }
        s2.j jVar = s2.j.f9637p;
        s2.j jVar2 = rVar.f9669e;
        if (jVar2 != jVar && ((Integer) this.f3087o) == null) {
            throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
        }
        if (jVar2 == jVar && ((Integer) this.f3087o) != null) {
            throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
        }
        if (jVar2 == jVar) {
            F2.a.a(new byte[0]);
        } else if (jVar2 == s2.j.f9636o) {
            F2.a.a(ByteBuffer.allocate(5).put((byte) 0).putInt(((Integer) this.f3087o).intValue()).array());
        } else {
            if (jVar2 != s2.j.f9635n) {
                throw new IllegalStateException("Unknown AesGcmParameters.Variant: " + ((s2.r) this.f3085m).f9669e);
            }
            F2.a.a(ByteBuffer.allocate(5).put((byte) 1).putInt(((Integer) this.f3087o).intValue()).array());
        }
        return new s2.q();
    }

    public C0945a t() throws GeneralSecurityException {
        B0.d dVar;
        C0947c c0947c = (C0947c) this.f3085m;
        if (c0947c == null || (dVar = (B0.d) this.f3086n) == null) {
            throw new IllegalArgumentException("Cannot build without parameters and/or key material");
        }
        if (c0947c.f10493b != ((F2.a) dVar.f190l).f860a.length) {
            throw new GeneralSecurityException("Key size mismatch");
        }
        C0946b c0946b = C0946b.f10491d;
        C0946b c0946b2 = c0947c.f10494c;
        if (c0946b2 != c0946b && ((Integer) this.f3087o) == null) {
            throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
        }
        if (c0946b2 == c0946b && ((Integer) this.f3087o) != null) {
            throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
        }
        if (c0946b2 == c0946b) {
            F2.a.a(new byte[0]);
        } else if (c0946b2 == C0946b.f10490c) {
            F2.a.a(ByteBuffer.allocate(5).put((byte) 0).putInt(((Integer) this.f3087o).intValue()).array());
        } else {
            if (c0946b2 != C0946b.f10489b) {
                throw new IllegalStateException("Unknown AesSivParameters.Variant: " + ((C0947c) this.f3085m).f10494c);
            }
            F2.a.a(ByteBuffer.allocate(5).put((byte) 1).putInt(((Integer) this.f3087o).intValue()).array());
        }
        return new C0945a();
    }

    public String toString() {
        switch (this.f3084l) {
            case 5:
                StringBuilder sb = new StringBuilder("DartCallback( bundle path: ");
                sb.append((String) this.f3086n);
                sb.append(", library path: ");
                FlutterCallbackInformation flutterCallbackInformation = (FlutterCallbackInformation) this.f3087o;
                sb.append(flutterCallbackInformation.callbackLibraryPath);
                sb.append(", function: ");
                return B0.i(sb, flutterCallbackInformation.callbackName, " )");
            case 14:
                return ((N0.c) this.f3086n).toString() + ", hidden list:" + ((ArrayList) this.f3087o).size();
            default:
                return super.toString();
        }
    }

    public C1065a u() throws GeneralSecurityException {
        B0.d dVar;
        F2.a aVarA;
        z2.e eVar = (z2.e) this.f3085m;
        if (eVar == null || (dVar = (B0.d) this.f3086n) == null) {
            throw new GeneralSecurityException("Cannot build without parameters and/or key material");
        }
        if (eVar.f11165b != ((F2.a) dVar.f190l).f860a.length) {
            throw new GeneralSecurityException("Key size mismatch");
        }
        z2.d dVar2 = z2.d.f11154f;
        z2.d dVar3 = eVar.f11167d;
        if (dVar3 != dVar2 && ((Integer) this.f3087o) == null) {
            throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
        }
        if (dVar3 == dVar2 && ((Integer) this.f3087o) != null) {
            throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
        }
        if (dVar3 == dVar2) {
            aVarA = F2.a.a(new byte[0]);
        } else if (dVar3 == z2.d.f11153e || dVar3 == z2.d.f11152d) {
            aVarA = F2.a.a(ByteBuffer.allocate(5).put((byte) 0).putInt(((Integer) this.f3087o).intValue()).array());
        } else {
            if (dVar3 != z2.d.f11151c) {
                throw new IllegalStateException("Unknown AesCmacParametersParameters.Variant: " + ((z2.e) this.f3085m).f11167d);
            }
            aVarA = F2.a.a(ByteBuffer.allocate(5).put((byte) 1).putInt(((Integer) this.f3087o).intValue()).array());
        }
        return new C1065a((z2.e) this.f3085m, aVarA);
    }

    public z2.j v() throws GeneralSecurityException {
        B0.d dVar;
        F2.a aVarA;
        z2.k kVar = (z2.k) this.f3085m;
        if (kVar == null || (dVar = (B0.d) this.f3086n) == null) {
            throw new GeneralSecurityException("Cannot build without parameters and/or key material");
        }
        if (kVar.f11175b != ((F2.a) dVar.f190l).f860a.length) {
            throw new GeneralSecurityException("Key size mismatch");
        }
        z2.d dVar2 = z2.d.f11162o;
        z2.d dVar3 = kVar.f11177d;
        if (dVar3 != dVar2 && ((Integer) this.f3087o) == null) {
            throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
        }
        if (dVar3 == dVar2 && ((Integer) this.f3087o) != null) {
            throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
        }
        if (dVar3 == dVar2) {
            aVarA = F2.a.a(new byte[0]);
        } else if (dVar3 == z2.d.f11161n || dVar3 == z2.d.f11160m) {
            aVarA = F2.a.a(ByteBuffer.allocate(5).put((byte) 0).putInt(((Integer) this.f3087o).intValue()).array());
        } else {
            if (dVar3 != z2.d.f11159l) {
                throw new IllegalStateException("Unknown HmacParameters.Variant: " + ((z2.k) this.f3085m).f11177d);
            }
            aVarA = F2.a.a(ByteBuffer.allocate(5).put((byte) 1).putInt(((Integer) this.f3087o).intValue()).array());
        }
        return new z2.j((z2.k) this.f3085m, aVarA);
    }

    public String w(String str, long j5, int i, long j6) {
        StringBuilder sb = new StringBuilder();
        int i5 = 0;
        while (true) {
            ArrayList arrayList = (ArrayList) this.f3086n;
            int size = arrayList.size();
            ArrayList arrayList2 = (ArrayList) this.f3085m;
            if (i5 >= size) {
                sb.append((String) arrayList2.get(arrayList.size()));
                return sb.toString();
            }
            sb.append((String) arrayList2.get(i5));
            if (((Integer) arrayList.get(i5)).intValue() == 1) {
                sb.append(str);
            } else {
                int iIntValue = ((Integer) arrayList.get(i5)).intValue();
                ArrayList arrayList3 = (ArrayList) this.f3087o;
                if (iIntValue == 2) {
                    sb.append(String.format(Locale.US, (String) arrayList3.get(i5), Long.valueOf(j5)));
                } else if (((Integer) arrayList.get(i5)).intValue() == 3) {
                    sb.append(String.format(Locale.US, (String) arrayList3.get(i5), Integer.valueOf(i)));
                } else if (((Integer) arrayList.get(i5)).intValue() == 4) {
                    sb.append(String.format(Locale.US, (String) arrayList3.get(i5), Long.valueOf(j6)));
                }
            }
            i5++;
        }
    }

    public SharedPreferences x(C0876g c0876g) {
        String str = c0876g.f10068a;
        Context context = (Context) this.f3086n;
        if (str != null) {
            SharedPreferences sharedPreferences = context.getSharedPreferences(str, 0);
            N3.h.b(sharedPreferences);
            return sharedPreferences;
        }
        SharedPreferences sharedPreferences2 = context.getSharedPreferences(context.getPackageName() + "_preferences", 0);
        N3.h.b(sharedPreferences2);
        return sharedPreferences2;
    }

    public void y(F0.s sVar, l1.E e5) {
        int i = 0;
        while (true) {
            F0.K[] kArr = (F0.K[]) this.f3086n;
            if (i >= kArr.length) {
                return;
            }
            e5.a();
            e5.c();
            F0.K k4 = sVar.k(e5.f7919c, 3);
            C0190p c0190p = (C0190p) ((List) this.f3085m).get(i);
            String str = c0190p.f3424n;
            AbstractC0360m.b("Invalid closed caption MIME type provided: " + str, "application/cea-608".equals(str) || "application/cea-708".equals(str));
            String str2 = c0190p.f3412a;
            if (str2 == null) {
                e5.c();
                str2 = (String) e5.f7921e;
            }
            C0189o c0189o = new C0189o();
            c0189o.f3376a = str2;
            c0189o.f3387m = AbstractC0156G.m(str);
            c0189o.f3380e = c0190p.f3416e;
            c0189o.f3379d = c0190p.f3415d;
            c0189o.f3371G = c0190p.f3407H;
            c0189o.f3390p = c0190p.f3427q;
            B0.k(c0189o, k4);
            kArr[i] = k4;
            i++;
        }
    }

    public byte[] z(byte[] bArr) throws BadPaddingException, IllegalBlockSizeException, InvalidKeyException, InvalidAlgorithmParameterException {
        int iF = F();
        byte[] bArr2 = new byte[iF];
        ((SecureRandom) this.f3086n).nextBytes(bArr2);
        AlgorithmParameterSpec algorithmParameterSpecG = G(bArr2);
        Key key = (Key) this.f3087o;
        Cipher cipher = (Cipher) this.f3085m;
        cipher.init(1, key, algorithmParameterSpecG);
        byte[] bArrDoFinal = cipher.doFinal(bArr);
        byte[] bArr3 = new byte[bArrDoFinal.length + iF];
        System.arraycopy(bArr2, 0, bArr3, 0, iF);
        System.arraycopy(bArrDoFinal, 0, bArr3, iF, bArrDoFinal.length);
        return bArr3;
    }

    public /* synthetic */ s(Object obj, Object obj2, Object obj3, int i) {
        this.f3084l = i;
        this.f3085m = obj;
        this.f3086n = obj2;
        this.f3087o = obj3;
    }

    public s(Context context, l lVar) throws Exception {
        this.f3084l = 2;
        this.f3086n = new SecureRandom();
        String strA = A();
        SharedPreferences sharedPreferences = context.getSharedPreferences("FlutterSecureKeyStorage", 0);
        SharedPreferences.Editor editorEdit = sharedPreferences.edit();
        String string = sharedPreferences.getString(strA, null);
        this.f3085m = B();
        if (string != null) {
            try {
                this.f3087o = lVar.f0(Base64.decode(string, 0));
                return;
            } catch (Exception e5) {
                Log.e("StorageCipher18Impl", "unwrap key failed", e5);
            }
        }
        byte[] bArr = new byte[16];
        ((SecureRandom) this.f3086n).nextBytes(bArr);
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
        this.f3087o = secretKeySpec;
        lVar.getClass();
        KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
        keyStore.load(null);
        String str = (String) lVar.f3020l;
        Certificate certificate = keyStore.getCertificate(str);
        if (certificate != null) {
            PublicKey publicKey = certificate.getPublicKey();
            if (publicKey != null) {
                Cipher cipherT = lVar.T();
                cipherT.init(3, publicKey, lVar.R());
                editorEdit.putString(strA, Base64.encodeToString(cipherT.wrap(secretKeySpec), 0));
                editorEdit.apply();
                return;
            }
            throw new Exception(AbstractC0307a.j("No key found under alias: ", str));
        }
        throw new Exception(AbstractC0307a.j("No certificate found under alias: ", str));
    }

    public s(AbstractServiceC0281x abstractServiceC0281x) {
        this.f3084l = 3;
        this.f3085m = new C0280w(abstractServiceC0281x);
        this.f3086n = new Handler();
    }

    public s(WorkDatabase_Impl workDatabase_Impl) {
        this.f3084l = 0;
        this.f3085m = workDatabase_Impl;
        this.f3086n = new b(workDatabase_Impl, 6);
        this.f3087o = new h(workDatabase_Impl, 20);
    }

    public s(List list) {
        this.f3084l = 9;
        this.f3085m = list;
        this.f3086n = new F0.K[list.size()];
        this.f3087o = new A0.y(new I2.g(this, 19));
    }

    public s(C0675i c0675i) {
        this.f3084l = 14;
        this.f3085m = c0675i;
        this.f3086n = new N0.c();
        this.f3087o = new ArrayList();
    }

    public s(InterfaceC0696f interfaceC0696f, String str) {
        this.f3084l = 12;
        x xVar = x.f8947a;
        this.f3085m = interfaceC0696f;
        this.f3086n = str;
        this.f3087o = xVar;
    }

    public s(F0.s sVar, c1.j jVar) {
        this.f3084l = 4;
        this.f3085m = sVar;
        this.f3086n = jVar;
        this.f3087o = new SparseArray();
    }

    public s(Context context, TypedArray typedArray) {
        this.f3084l = 10;
        this.f3085m = context;
        this.f3086n = typedArray;
    }

    public s(InterfaceC0300d[] interfaceC0300dArr) {
        this.f3084l = 6;
        z zVar = new z();
        C0303g c0303g = new C0303g();
        c0303g.f4865c = 1.0f;
        c0303g.f4866d = 1.0f;
        C0298b c0298b = C0298b.f4829e;
        c0303g.f4867e = c0298b;
        c0303g.f4868f = c0298b;
        c0303g.f4869g = c0298b;
        c0303g.f4870h = c0298b;
        ByteBuffer byteBuffer = InterfaceC0300d.f4834a;
        c0303g.f4872k = byteBuffer;
        c0303g.f4873l = byteBuffer.asShortBuffer();
        c0303g.f4874m = byteBuffer;
        c0303g.f4864b = -1;
        InterfaceC0300d[] interfaceC0300dArr2 = new InterfaceC0300d[interfaceC0300dArr.length + 2];
        this.f3085m = interfaceC0300dArr2;
        System.arraycopy(interfaceC0300dArr, 0, interfaceC0300dArr2, 0, interfaceC0300dArr.length);
        this.f3086n = zVar;
        this.f3087o = c0303g;
        interfaceC0300dArr2[interfaceC0300dArr.length] = zVar;
        interfaceC0300dArr2[interfaceC0300dArr.length + 1] = c0303g;
    }

    public s(int i) {
        this.f3084l = i;
        switch (i) {
            case 13:
                q0.j jVar = q0.j.f9285l;
                this.f3085m = new HashSet();
                this.f3086n = jVar;
                break;
            default:
                this.f3085m = new ConcurrentLinkedQueue();
                break;
        }
    }

    public s(ConcurrentHashMap concurrentHashMap, r2.k kVar, B2.a aVar, Class cls) {
        this.f3084l = 15;
        this.f3085m = concurrentHashMap;
        this.f3086n = kVar;
        this.f3087o = aVar;
    }

    public s(InterfaceC0696f interfaceC0696f, Context context, p1.b bVar) {
        this.f3084l = 17;
        N3.h.e(interfaceC0696f, "messenger");
        N3.h.e(context, "context");
        this.f3085m = interfaceC0696f;
        this.f3086n = context;
        this.f3087o = bVar;
        try {
            InterfaceC0875f.f10067j.getClass();
            C0874e.b(interfaceC0696f, this, "shared_preferences");
        } catch (Exception e5) {
            Log.e("SharedPreferencesPlugin", "Received exception while setting up SharedPreferencesBackend", e5);
        }
    }

    public s(v vVar) {
        this.f3084l = 7;
        this.f3087o = vVar;
        this.f3085m = new Handler(Looper.myLooper());
        this.f3086n = new u(this);
    }
}

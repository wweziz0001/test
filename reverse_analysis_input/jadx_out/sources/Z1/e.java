package Z1;

import B0.t;
import F0.AbstractC0055b;
import F0.K;
import Q1.C;
import a0.AbstractC0156G;
import a0.C0189o;
import a0.C0190p;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.app.Activity;
import android.content.Context;
import android.content.res.AssetManager;
import android.database.Cursor;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.net.Uri;
import android.os.Build;
import android.os.HandlerThread;
import android.os.Trace;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Surface;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.inputmethod.InputMethodManager;
import android.widget.TextView;
import android.widget.Toast;
import androidx.work.impl.WorkDatabase_Impl;
import b3.AbstractC0307a;
import com.example.hqp_mobile_app.R;
import d0.AbstractC0360m;
import d0.AbstractC0370w;
import d0.C0363p;
import dev.fluttercommunity.plus.share.SharePlusPendingIntent;
import f0.C0415j;
import f0.C0418m;
import f0.InterfaceC0412g;
import f0.InterfaceC0413h;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collection;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ConcurrentNavigableMap;
import java.util.concurrent.atomic.AtomicBoolean;
import l1.E;
import m.B0;
import m2.I;
import m2.b0;
import m3.C0675i;
import n3.C0702l;
import n3.C0704n;
import n3.C0707q;
import n3.InterfaceC0694d;
import n3.InterfaceC0705o;
import n3.InterfaceC0706p;
import n3.x;
import s0.InterfaceC0784a;
import t0.RunnableC0857n;
import x0.e0;

/* JADX INFO: loaded from: classes.dex */
public final class e implements InterfaceC0705o, InterfaceC0412g, InterfaceC0694d, q0.k, t, F0.s {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f3000l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public Object f3001m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public Object f3002n;

    public static String b(Class cls) {
        int modifiers = cls.getModifiers();
        if (Modifier.isInterface(modifiers)) {
            return "Interfaces can't be instantiated! Register an InstanceCreator or a TypeAdapter for this type. Interface name: ".concat(cls.getName());
        }
        if (!Modifier.isAbstract(modifiers)) {
            return null;
        }
        return "Abstract classes can't be instantiated! Adjust the R8 configuration or register an InstanceCreator or a TypeAdapter for this type. Class name: " + cls.getName() + "\nSee " + "https://github.com/google/gson/blob/main/Troubleshooting.md#".concat("r8-abstract-class");
    }

    public static HashMap m(String str, int i, int i5, int i6, int i7) {
        HashMap map = new HashMap();
        map.put("text", str);
        AbstractC0307a.p(i, map, "selectionBase", i5, "selectionExtent");
        AbstractC0307a.p(i6, map, "composingBase", i7, "composingExtent");
        return map;
    }

    @Override // f0.InterfaceC0412g
    public InterfaceC0413h a() {
        return new C0418m((Context) this.f3001m, ((a1.e) this.f3002n).a());
    }

    public void c() {
        this.f3001m = null;
        this.f3002n = null;
    }

    @Override // n3.InterfaceC0694d
    public void e(ByteBuffer byteBuffer, f3.g gVar) {
        C0707q c0707q = (C0707q) this.f3002n;
        try {
            ((InterfaceC0705o) this.f3001m).onMethodCall(c0707q.f8942c.b(byteBuffer), new P2.c(this, 2, gVar));
        } catch (RuntimeException e5) {
            Log.e("MethodChannel#" + c0707q.f8941b, "Failed to handle method call", e5);
            gVar.a(c0707q.f8942c.e(e5.getMessage(), Log.getStackTraceString(e5)));
        }
    }

    public void f(long j5, C0363p c0363p) {
        if (c0363p.a() < 9) {
            return;
        }
        int i = c0363p.i();
        int i5 = c0363p.i();
        int iV = c0363p.v();
        if (i == 434 && i5 == 1195456820 && iV == 3) {
            AbstractC0055b.g(j5, c0363p, (K[]) this.f3002n);
        }
    }

    public boolean g(j jVar) {
        boolean zContainsKey;
        synchronized (this.f3001m) {
            zContainsKey = ((LinkedHashMap) this.f3002n).containsKey(jVar);
        }
        return zContainsKey;
    }

    @Override // q0.k
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public q0.c i(y2.n nVar) throws Exception {
        MediaCodec mediaCodecCreateByCodecName;
        String str = ((q0.o) nVar.f10954a).f9288a;
        q0.c cVar = null;
        try {
            Trace.beginSection("createCodec:" + str);
            mediaCodecCreateByCodecName = MediaCodec.createByCodecName(str);
            try {
                q0.c cVar2 = new q0.c(mediaCodecCreateByCodecName, (HandlerThread) ((q0.b) this.f3001m).get(), new q0.f(mediaCodecCreateByCodecName, (HandlerThread) ((q0.b) this.f3002n).get()), (s) nVar.f10959f);
                try {
                    Trace.endSection();
                    Surface surface = (Surface) nVar.f10957d;
                    q0.c.e(cVar2, (MediaFormat) nVar.f10955b, surface, (MediaCrypto) nVar.f10958e, (surface == null && ((q0.o) nVar.f10954a).f9295h && AbstractC0370w.f5326a >= 35) ? 8 : 0);
                    return cVar2;
                } catch (Exception e5) {
                    e = e5;
                    cVar = cVar2;
                    if (cVar != null) {
                        cVar.release();
                    } else if (mediaCodecCreateByCodecName != null) {
                        mediaCodecCreateByCodecName.release();
                    }
                    throw e;
                }
            } catch (Exception e6) {
                e = e6;
            }
        } catch (Exception e7) {
            e = e7;
            mediaCodecCreateByCodecName = null;
        }
    }

    @Override // F0.s
    public void j() {
        t0.q qVar = (t0.q) this.f3002n;
        qVar.f9950m.post(new RunnableC0857n(qVar, 0));
    }

    @Override // F0.s
    public K k(int i, int i5) {
        return (e0) this.f3001m;
    }

    @Override // B0.t
    public Object l(Uri uri, C0415j c0415j) {
        InterfaceC0784a interfaceC0784a = (InterfaceC0784a) ((t) this.f3001m).l(uri, c0415j);
        List list = (List) this.f3002n;
        return (list == null || list.isEmpty()) ? interfaceC0784a : (InterfaceC0784a) interfaceC0784a.a(list);
    }

    public void n(F0.s sVar, E e5) {
        int i = 0;
        while (true) {
            K[] kArr = (K[]) this.f3002n;
            if (i >= kArr.length) {
                return;
            }
            e5.a();
            e5.c();
            K k4 = sVar.k(e5.f7919c, 3);
            C0190p c0190p = (C0190p) ((List) this.f3001m).get(i);
            String str = c0190p.f3424n;
            AbstractC0360m.b("Invalid closed caption MIME type provided: " + str, "application/cea-608".equals(str) || "application/cea-708".equals(str));
            C0189o c0189o = new C0189o();
            e5.c();
            c0189o.f3376a = (String) e5.f7921e;
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

    public byte[] o(Q0.a aVar) {
        ByteArrayOutputStream byteArrayOutputStream = (ByteArrayOutputStream) this.f3001m;
        byteArrayOutputStream.reset();
        DataOutputStream dataOutputStream = (DataOutputStream) this.f3002n;
        try {
            dataOutputStream.writeBytes(aVar.f1766l);
            dataOutputStream.writeByte(0);
            String str = aVar.f1767m;
            if (str == null) {
                str = "";
            }
            dataOutputStream.writeBytes(str);
            dataOutputStream.writeByte(0);
            dataOutputStream.writeLong(aVar.f1768n);
            dataOutputStream.writeLong(aVar.f1769o);
            dataOutputStream.write(aVar.f1770p);
            dataOutputStream.flush();
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e5) {
            throw new RuntimeException(e5);
        }
    }

    @Override // n3.InterfaceC0705o
    public void onMethodCall(C0704n c0704n, InterfaceC0706p interfaceC0706p) {
        Toast toast;
        P2.c cVar;
        switch (this.f3000l) {
            case 1:
                N3.h.e(c0704n, "call");
                String str = c0704n.f8938a;
                if (!N3.h.a(str, "showToast")) {
                    if (!N3.h.a(str, "cancel")) {
                        ((P2.c) interfaceC0706p).notImplemented();
                        return;
                    }
                    Toast toast2 = (Toast) this.f3002n;
                    if (toast2 != null) {
                        toast2.cancel();
                        this.f3002n = null;
                    }
                    ((P2.c) interfaceC0706p).success(Boolean.TRUE);
                    return;
                }
                String strValueOf = String.valueOf(c0704n.a("msg"));
                String strValueOf2 = String.valueOf(c0704n.a("length"));
                String strValueOf3 = String.valueOf(c0704n.a("gravity"));
                Number number = (Number) c0704n.a("bgcolor");
                Number number2 = (Number) c0704n.a("textcolor");
                Number number3 = (Number) c0704n.a("fontSize");
                String str2 = (String) c0704n.a("fontAsset");
                int i = strValueOf3.equals("top") ? 48 : strValueOf3.equals("center") ? 17 : 80;
                boolean zEquals = strValueOf2.equals("long");
                Context context = (Context) this.f3001m;
                if (number != null) {
                    Object systemService = context.getSystemService("layout_inflater");
                    N3.h.c(systemService, "null cannot be cast to non-null type android.view.LayoutInflater");
                    View viewInflate = ((LayoutInflater) systemService).inflate(R.layout.toast_custom, (ViewGroup) null);
                    TextView textView = (TextView) viewInflate.findViewById(R.id.text);
                    textView.setText(strValueOf);
                    Drawable drawable = context.getDrawable(R.drawable.corner);
                    N3.h.b(drawable);
                    drawable.setColorFilter(number.intValue(), PorterDuff.Mode.SRC_IN);
                    textView.setBackground(drawable);
                    if (number3 != null) {
                        textView.setTextSize(number3.floatValue());
                    }
                    if (number2 != null) {
                        textView.setTextColor(number2.intValue());
                    }
                    Toast toast3 = new Toast(context);
                    this.f3002n = toast3;
                    toast3.setDuration(zEquals ? 1 : 0);
                    if (str2 != null) {
                        AssetManager assets = context.getAssets();
                        N3.h.d(assets, "getAssets(...)");
                        String strB = ((h3.f) m.z().f3024m).b(str2);
                        N3.h.d(strB, "getLookupKeyForAsset(...)");
                        textView.setTypeface(Typeface.createFromAsset(assets, strB));
                    }
                    Toast toast4 = (Toast) this.f3002n;
                    if (toast4 != null) {
                        toast4.setView(viewInflate);
                    }
                } else {
                    Toast toastMakeText = Toast.makeText(context, strValueOf, zEquals ? 1 : 0);
                    this.f3002n = toastMakeText;
                    if (Build.VERSION.SDK_INT < 30) {
                        View view = toastMakeText != null ? toastMakeText.getView() : null;
                        N3.h.b(view);
                        View viewFindViewById = view.findViewById(android.R.id.message);
                        N3.h.d(viewFindViewById, "findViewById(...)");
                        TextView textView2 = (TextView) viewFindViewById;
                        if (number3 != null) {
                            textView2.setTextSize(number3.floatValue());
                        }
                        if (number2 != null) {
                            textView2.setTextColor(number2.intValue());
                        }
                        if (str2 != null) {
                            AssetManager assets2 = context.getAssets();
                            N3.h.d(assets2, "getAssets(...)");
                            String strB2 = ((h3.f) m.z().f3024m).b(str2);
                            N3.h.d(strB2, "getLookupKeyForAsset(...)");
                            textView2.setTypeface(Typeface.createFromAsset(assets2, strB2));
                        }
                    }
                }
                if (number != null) {
                    try {
                        if (i == 17) {
                            Toast toast5 = (Toast) this.f3002n;
                            if (toast5 != null) {
                                toast5.setGravity(i, 0, 0);
                            }
                        } else if (i != 48) {
                            Toast toast6 = (Toast) this.f3002n;
                            if (toast6 != null) {
                                toast6.setGravity(i, 0, 100);
                            }
                        } else {
                            Toast toast7 = (Toast) this.f3002n;
                            if (toast7 != null) {
                                toast7.setGravity(i, 0, 100);
                            }
                        }
                        break;
                    } catch (Exception unused) {
                    }
                }
                if (context instanceof Activity) {
                    N3.h.c(context, "null cannot be cast to non-null type android.app.Activity");
                    ((Activity) context).runOnUiThread(new A3.c(this, 0));
                } else {
                    Toast toast8 = (Toast) this.f3002n;
                    if (toast8 != null) {
                        toast8.show();
                    }
                }
                if (Build.VERSION.SDK_INT >= 30 && (toast = (Toast) this.f3002n) != null) {
                    toast.addCallback(new A3.d(this));
                }
                ((P2.c) interfaceC0706p).success(Boolean.TRUE);
                return;
            default:
                N3.h.e(c0704n, "call");
                Object obj = c0704n.f8939b;
                if (!(obj instanceof Map)) {
                    throw new IllegalArgumentException("Map arguments expected");
                }
                Z2.c cVar2 = (Z2.c) this.f3002n;
                cVar2.getClass();
                AtomicBoolean atomicBoolean = cVar2.f3094m;
                if (!atomicBoolean.compareAndSet(true, false) && (cVar = cVar2.f3093l) != null) {
                    cVar.success("dev.fluttercommunity.plus/share/unavailable");
                }
                SharePlusPendingIntent.f5450a = "";
                atomicBoolean.set(false);
                cVar2.f3093l = (P2.c) interfaceC0706p;
                try {
                    if (!N3.h.a(c0704n.f8938a, "share")) {
                        ((P2.c) interfaceC0706p).notImplemented();
                        return;
                    }
                    A.e eVar = (A.e) this.f3001m;
                    N3.h.b(obj);
                    eVar.m((Map) obj);
                    return;
                } catch (Throwable th) {
                    cVar2.f3094m.set(true);
                    cVar2.f3093l = null;
                    ((P2.c) interfaceC0706p).error("Share failed", th.getMessage(), th);
                    return;
                }
        }
    }

    public I2.q p(N2.a aVar) {
        final String str;
        I2.q gVar;
        final int i = 1;
        final int i5 = 0;
        final Type type = aVar.f1602b;
        HashMap map = (HashMap) this.f3001m;
        if (map.get(type) != null) {
            throw new ClassCastException();
        }
        Class cls = aVar.f1601a;
        if (map.get(cls) != null) {
            throw new ClassCastException();
        }
        B0.l lVar = null;
        I2.q qVar = EnumSet.class.isAssignableFrom(cls) ? new I2.q() { // from class: I2.f
            @Override // I2.q
            public final Object e() {
                switch (i5) {
                    case 0:
                        Type type2 = type;
                        if (!(type2 instanceof ParameterizedType)) {
                            throw new G2.h("Invalid EnumSet type: " + type2.toString());
                        }
                        Type type3 = ((ParameterizedType) type2).getActualTypeArguments()[0];
                        if (type3 instanceof Class) {
                            return EnumSet.noneOf((Class) type3);
                        }
                        throw new G2.h("Invalid EnumSet type: " + type2.toString());
                    default:
                        Type type4 = type;
                        if (!(type4 instanceof ParameterizedType)) {
                            throw new G2.h("Invalid EnumMap type: " + type4.toString());
                        }
                        Type type5 = ((ParameterizedType) type4).getActualTypeArguments()[0];
                        if (type5 instanceof Class) {
                            return new EnumMap((Class) type5);
                        }
                        throw new G2.h("Invalid EnumMap type: " + type4.toString());
                }
            }
        } : cls == EnumMap.class ? new I2.q() { // from class: I2.f
            @Override // I2.q
            public final Object e() {
                switch (i) {
                    case 0:
                        Type type2 = type;
                        if (!(type2 instanceof ParameterizedType)) {
                            throw new G2.h("Invalid EnumSet type: " + type2.toString());
                        }
                        Type type3 = ((ParameterizedType) type2).getActualTypeArguments()[0];
                        if (type3 instanceof Class) {
                            return EnumSet.noneOf((Class) type3);
                        }
                        throw new G2.h("Invalid EnumSet type: " + type2.toString());
                    default:
                        Type type4 = type;
                        if (!(type4 instanceof ParameterizedType)) {
                            throw new G2.h("Invalid EnumMap type: " + type4.toString());
                        }
                        Type type5 = ((ParameterizedType) type4).getActualTypeArguments()[0];
                        if (type5 instanceof Class) {
                            return new EnumMap((Class) type5);
                        }
                        throw new G2.h("Invalid EnumMap type: " + type4.toString());
                }
            }
        } : null;
        if (qVar != null) {
            return qVar;
        }
        I2.d.f((ArrayList) this.f3002n);
        if (Modifier.isAbstract(cls.getModifiers())) {
            gVar = null;
        } else {
            try {
                Constructor declaredConstructor = cls.getDeclaredConstructor(null);
                i4.a aVar2 = L2.c.f1490a;
                try {
                    declaredConstructor.setAccessible(true);
                    str = null;
                } catch (Exception e5) {
                    str = "Failed making constructor '" + L2.c.b(declaredConstructor) + "' accessible; either increase its visibility or write a custom InstanceCreator or TypeAdapter for its declaring type: " + e5.getMessage() + L2.c.e(e5);
                }
                gVar = str != null ? new I2.q() { // from class: I2.e
                    @Override // I2.q
                    public final Object e() {
                        switch (i) {
                            case 0:
                                throw new G2.h(str);
                            default:
                                throw new G2.h(str);
                        }
                    }
                } : new I2.g(declaredConstructor, i5);
            } catch (NoSuchMethodException unused) {
                gVar = null;
            }
        }
        if (gVar != null) {
            return gVar;
        }
        if (Collection.class.isAssignableFrom(cls)) {
            lVar = SortedSet.class.isAssignableFrom(cls) ? new B0.l(6) : Set.class.isAssignableFrom(cls) ? new B0.l(7) : Queue.class.isAssignableFrom(cls) ? new B0.l(8) : new B0.l(9);
        } else if (Map.class.isAssignableFrom(cls)) {
            lVar = ConcurrentNavigableMap.class.isAssignableFrom(cls) ? new B0.l(10) : ConcurrentMap.class.isAssignableFrom(cls) ? new B0.l(11) : SortedMap.class.isAssignableFrom(cls) ? new B0.l(12) : (!(type instanceof ParameterizedType) || String.class.isAssignableFrom(new N2.a(((ParameterizedType) type).getActualTypeArguments()[0]).f1601a)) ? new B0.l(5) : new B0.l(13);
        }
        if (lVar != null) {
            return lVar;
        }
        final String strB = b(cls);
        return strB != null ? new I2.q() { // from class: I2.e
            @Override // I2.q
            public final Object e() {
                switch (i5) {
                    case 0:
                        throw new G2.h(strB);
                    default:
                        throw new G2.h(strB);
                }
            }
        } : new I2.g(cls, i);
    }

    public F0.q q(Object... objArr) {
        Constructor constructorF;
        synchronized (((AtomicBoolean) this.f3002n)) {
            if (!((AtomicBoolean) this.f3002n).get()) {
                try {
                    constructorF = ((B0.l) this.f3001m).f();
                } catch (ClassNotFoundException unused) {
                    ((AtomicBoolean) this.f3002n).set(true);
                    constructorF = null;
                } catch (Exception e5) {
                    throw new RuntimeException("Error instantiating extension", e5);
                }
            }
            constructorF = null;
        }
        if (constructorF == null) {
            return null;
        }
        try {
            return (F0.q) constructorF.newInstance(objArr);
        } catch (Exception e6) {
            throw new IllegalStateException("Unexpected error creating extractor", e6);
        }
    }

    public Long r(String str) {
        s1.j jVarC = s1.j.c("SELECT long_value FROM Preference where `key`=?", 1);
        jVarC.h(str, 1);
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f3001m;
        workDatabase_Impl.b();
        Cursor cursorL0 = C.l0(workDatabase_Impl, jVarC, false);
        try {
            Long lValueOf = null;
            if (cursorL0.moveToFirst() && !cursorL0.isNull(0)) {
                lValueOf = Long.valueOf(cursorL0.getLong(0));
            }
            return lValueOf;
        } finally {
            cursorL0.close();
            jVarC.f();
        }
    }

    public void s(d dVar) {
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f3001m;
        workDatabase_Impl.b();
        workDatabase_Impl.c();
        try {
            ((b) this.f3002n).m(dVar);
            workDatabase_Impl.o();
        } finally {
            workDatabase_Impl.k();
        }
    }

    public R1.k t(j jVar) {
        R1.k kVar;
        synchronized (this.f3001m) {
            kVar = (R1.k) ((LinkedHashMap) this.f3002n).remove(jVar);
        }
        return kVar;
    }

    public String toString() {
        switch (this.f3000l) {
            case 3:
                return ((HashMap) this.f3001m).toString();
            case 13:
                return ((String) this.f3001m) + ", " + ((String) this.f3002n);
            default:
                return super.toString();
        }
    }

    public List u(String str) {
        List listX;
        N3.h.e(str, "workSpecId");
        synchronized (this.f3001m) {
            try {
                LinkedHashMap linkedHashMap = (LinkedHashMap) this.f3002n;
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                for (Map.Entry entry : linkedHashMap.entrySet()) {
                    if (N3.h.a(((j) entry.getKey()).f3016a, str)) {
                        linkedHashMap2.put(entry.getKey(), entry.getValue());
                    }
                }
                Iterator it = linkedHashMap2.keySet().iterator();
                while (it.hasNext()) {
                    ((LinkedHashMap) this.f3002n).remove((j) it.next());
                }
                listX = C3.f.X(linkedHashMap2.values());
            } catch (Throwable th) {
                throw th;
            }
        }
        return listX;
    }

    public R1.k v(j jVar) {
        R1.k kVar;
        synchronized (this.f3001m) {
            try {
                LinkedHashMap linkedHashMap = (LinkedHashMap) this.f3002n;
                Object kVar2 = linkedHashMap.get(jVar);
                if (kVar2 == null) {
                    kVar2 = new R1.k(jVar);
                    linkedHashMap.put(jVar, kVar2);
                }
                kVar = (R1.k) kVar2;
            } catch (Throwable th) {
                throw th;
            }
        }
        return kVar;
    }

    public K w(int i) {
        int i5 = 0;
        while (true) {
            int[] iArr = (int[]) this.f3001m;
            if (i5 >= iArr.length) {
                AbstractC0360m.l("BaseMediaChunkOutput", "Unmatched track of type: " + i);
                return new F0.o();
            }
            if (i == iArr[i5]) {
                return ((e0[]) this.f3002n)[i5];
            }
            i5++;
        }
    }

    public /* synthetic */ e(Object obj, int i, Object obj2) {
        this.f3000l = i;
        this.f3001m = obj;
        this.f3002n = obj2;
    }

    public /* synthetic */ e(Object obj, Object obj2, int i, boolean z4) {
        this.f3000l = i;
        this.f3002n = obj;
        this.f3001m = obj2;
    }

    public e(A.e eVar, Z2.c cVar) {
        this.f3000l = 6;
        N3.h.e(cVar, "manager");
        this.f3001m = eVar;
        this.f3002n = cVar;
    }

    public e(WorkDatabase_Impl workDatabase_Impl) {
        this.f3000l = 0;
        this.f3001m = workDatabase_Impl;
        this.f3002n = new b(workDatabase_Impl, 1);
    }

    public e(int i, byte b4) {
        this.f3000l = i;
        switch (i) {
            case 5:
                this.f3001m = new Object();
                this.f3002n = new LinkedHashMap();
                break;
            default:
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(512);
                this.f3001m = byteArrayOutputStream;
                this.f3002n = new DataOutputStream(byteArrayOutputStream);
                break;
        }
    }

    public e(View view, InputMethodManager inputMethodManager, C0675i c0675i) {
        this.f3000l = 11;
        if (Build.VERSION.SDK_INT >= 33) {
            view.setAutoHandwritingEnabled(false);
        }
        this.f3002n = view;
        this.f3001m = inputMethodManager;
        c0675i.f8712m = this;
    }

    public e(List list) {
        this.f3000l = 14;
        this.f3001m = list;
        this.f3002n = new K[list.size()];
    }

    public e(f3.b bVar, int i) {
        this.f3000l = i;
        switch (i) {
            case 16:
                androidx.lifecycle.E e5 = new androidx.lifecycle.E(this, 28);
                C0707q c0707q = new C0707q(bVar, "flutter/platform_views", x.f8947a, null);
                this.f3001m = c0707q;
                c0707q.b(e5);
                break;
            case 17:
                C0675i c0675i = new C0675i(this, 8);
                C0707q c0707q2 = new C0707q(bVar, "flutter/textinput", C0702l.f8937a, null);
                this.f3001m = c0707q2;
                c0707q2.b(c0675i);
                break;
            default:
                androidx.lifecycle.E e6 = new androidx.lifecycle.E(this, 24);
                C0707q c0707q3 = new C0707q(bVar, "flutter/localization", C0702l.f8937a, null);
                this.f3001m = c0707q3;
                c0707q3.b(e6);
                break;
        }
    }

    public e(int i) {
        this.f3000l = 19;
        q0.b bVar = new q0.b(i, 0);
        q0.b bVar2 = new q0.b(i, 1);
        this.f3001m = bVar;
        this.f3002n = bVar2;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public e(Context context, int i) {
        this(context, new a1.e(1));
        this.f3000l = i;
        switch (i) {
            case 12:
                this.f3001m = context;
                break;
            default:
                break;
        }
    }

    public e(Context context, a1.e eVar) {
        this.f3000l = 9;
        this.f3001m = context.getApplicationContext();
        this.f3002n = eVar;
    }

    public e(Animation animation) {
        this.f3000l = 7;
        this.f3001m = animation;
        this.f3002n = null;
    }

    public e(Animator animator) {
        this.f3000l = 7;
        this.f3001m = null;
        AnimatorSet animatorSet = new AnimatorSet();
        this.f3002n = animatorSet;
        animatorSet.play(animator);
    }

    @Override // F0.s
    public void d(F0.E e5) {
    }

    public e(b0 b0Var, int[] iArr) {
        this.f3000l = 8;
        this.f3001m = I.p(b0Var);
        this.f3002n = iArr;
    }

    public e(B0.l lVar) {
        this.f3000l = 2;
        this.f3001m = lVar;
        this.f3002n = new AtomicBoolean(false);
    }
}

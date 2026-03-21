package r2;

import D2.Y;
import D2.a0;
import D2.b0;
import D2.r0;
import com.google.crypto.tink.shaded.protobuf.AbstractC0321a;
import com.google.crypto.tink.shaded.protobuf.AbstractC0329i;
import com.google.crypto.tink.shaded.protobuf.C;
import com.google.crypto.tink.shaded.protobuf.C0328h;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Logger;
import m.B0;

/* JADX INFO: loaded from: classes.dex */
public abstract class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final AtomicReference f9544a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final ConcurrentHashMap f9545b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final ConcurrentHashMap f9546c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final ConcurrentHashMap f9547d;

    static {
        Logger.getLogger(n.class.getName());
        f9544a = new AtomicReference(new e());
        f9545b = new ConcurrentHashMap();
        f9546c = new ConcurrentHashMap();
        new ConcurrentHashMap();
        f9547d = new ConcurrentHashMap();
    }

    public static synchronized void a(String str, Map map, boolean z4) {
        if (z4) {
            try {
                ConcurrentHashMap concurrentHashMap = f9546c;
                if (concurrentHashMap.containsKey(str) && !((Boolean) concurrentHashMap.get(str)).booleanValue()) {
                    throw new GeneralSecurityException("New keys are already disallowed for key type " + str);
                }
            } finally {
            }
        }
        if (z4) {
            if (((e) f9544a.get()).f9526a.containsKey(str)) {
                for (Map.Entry entry : map.entrySet()) {
                    if (!f9547d.containsKey(entry.getKey())) {
                        throw new GeneralSecurityException("Attempted to register a new key template " + ((String) entry.getKey()) + " from an existing key manager of type " + str);
                    }
                }
            } else {
                for (Map.Entry entry2 : map.entrySet()) {
                    if (f9547d.containsKey(entry2.getKey())) {
                        throw new GeneralSecurityException("Attempted overwrite of a registered key template " + ((String) entry2.getKey()));
                    }
                }
            }
        }
    }

    public static Object b(b bVar, Class cls) throws GeneralSecurityException {
        A2.a aVar;
        y2.m mVar = (y2.m) y2.g.f10942b.f10943a.get();
        mVar.getClass();
        y2.l lVar = new y2.l(bVar.getClass(), cls);
        HashMap map = mVar.f10952a;
        if (!map.containsKey(lVar)) {
            throw new GeneralSecurityException("No PrimitiveConstructor for " + lVar + " available");
        }
        switch (((y2.k) map.get(lVar)).f10949b.f10984l) {
            case 21:
                aVar = new A2.a();
                if (!B0.e(1)) {
                    throw new GeneralSecurityException("Can not use AES-CMAC in FIPS-mode.");
                }
                return aVar;
            default:
                aVar = new A2.a();
                if (!B0.f(2)) {
                    throw new GeneralSecurityException("Can not use HMAC in FIPS-mode, as BoringCrypto module is not available.");
                }
                return aVar;
        }
    }

    public static Object c(String str, AbstractC0329i abstractC0329i, Class cls) throws GeneralSecurityException {
        e eVar = (e) f9544a.get();
        eVar.getClass();
        d dVarA = eVar.a(str);
        boolean zContains = ((Map) dVarA.f9524a.f9609b).keySet().contains(cls);
        s1.l lVar = dVarA.f9524a;
        if (!zContains) {
            StringBuilder sb = new StringBuilder("Primitive type ");
            sb.append(cls.getName());
            sb.append(" not supported by key manager of type ");
            sb.append(lVar.getClass());
            sb.append(", supported primitives: ");
            Set<Class> setKeySet = ((Map) lVar.f9609b).keySet();
            StringBuilder sb2 = new StringBuilder();
            boolean z4 = true;
            for (Class cls2 : setKeySet) {
                if (!z4) {
                    sb2.append(", ");
                }
                sb2.append(cls2.getCanonicalName());
                z4 = false;
            }
            sb.append(sb2.toString());
            throw new GeneralSecurityException(sb.toString());
        }
        try {
            if (!((Map) lVar.f9609b).keySet().contains(cls) && !Void.class.equals(cls)) {
                throw new IllegalArgumentException("Given internalKeyMananger " + lVar.toString() + " does not support primitive class " + cls.getName());
            }
            try {
                AbstractC0321a abstractC0321aI = lVar.i(abstractC0329i);
                if (Void.class.equals(cls)) {
                    throw new GeneralSecurityException("Cannot create a primitive for Void");
                }
                lVar.k(abstractC0321aI);
                return lVar.f(abstractC0321aI, cls);
            } catch (C e5) {
                throw new GeneralSecurityException("Failures parsing proto of type ".concat(((Class) lVar.f9608a).getName()), e5);
            }
        } catch (IllegalArgumentException e6) {
            throw new GeneralSecurityException("Primitive type not supported", e6);
        }
    }

    public static Object d(String str, byte[] bArr) {
        C0328h c0328h = AbstractC0329i.f5205m;
        return c(str, AbstractC0329i.h(bArr, 0, bArr.length), InterfaceC0781a.class);
    }

    public static synchronized Y e(b0 b0Var) {
        f fVar;
        s1.l lVar = ((e) f9544a.get()).a(b0Var.D()).f9524a;
        fVar = new f(lVar, (Class) lVar.f9610c);
        if (!((Boolean) f9546c.get(b0Var.D())).booleanValue()) {
            throw new GeneralSecurityException("newKey-operation not permitted for key type " + b0Var.D());
        }
        return fVar.e(b0Var.E());
    }

    public static synchronized void f(s1.l lVar, boolean z4) {
        try {
            AtomicReference atomicReference = f9544a;
            e eVar = new e((e) atomicReference.get());
            eVar.b(lVar);
            String strE = lVar.e();
            a(strE, z4 ? lVar.g().k() : Collections.emptyMap(), z4);
            if (!((e) atomicReference.get()).f9526a.containsKey(strE)) {
                f9545b.put(strE, new o());
                if (z4) {
                    g(strE, lVar.g().k());
                }
            }
            f9546c.put(strE, Boolean.valueOf(z4));
            atomicReference.set(eVar);
        } catch (Throwable th) {
            throw th;
        }
    }

    public static void g(String str, Map map) {
        r0 r0Var;
        for (Map.Entry entry : map.entrySet()) {
            ConcurrentHashMap concurrentHashMap = f9547d;
            String str2 = (String) entry.getKey();
            byte[] bArrE = ((y2.d) entry.getValue()).f10937a.e();
            int i = ((y2.d) entry.getValue()).f10938b;
            a0 a0VarF = b0.F();
            a0VarF.e();
            b0.y((b0) a0VarF.f5252m, str);
            C0328h c0328hH = AbstractC0329i.h(bArrE, 0, bArrE.length);
            a0VarF.e();
            b0.z((b0) a0VarF.f5252m, c0328hH);
            int iB = O.i.b(i);
            if (iB == 0) {
                r0Var = r0.f578n;
            } else if (iB == 1) {
                r0Var = r0.f579o;
            } else if (iB == 2) {
                r0Var = r0.f580p;
            } else {
                if (iB != 3) {
                    throw new IllegalArgumentException("Unknown output prefix type");
                }
                r0Var = r0.f581q;
            }
            a0VarF.e();
            b0.A((b0) a0VarF.f5252m, r0Var);
            concurrentHashMap.put(str2, new g((b0) a0VarF.b()));
        }
    }

    public static synchronized void h(m mVar) {
        y2.g gVar = y2.g.f10942b;
        synchronized (gVar) {
            Z1.l lVar = new Z1.l((y2.m) gVar.f10943a.get());
            lVar.c0(mVar);
            gVar.f10943a.set(new y2.m(lVar));
        }
    }
}

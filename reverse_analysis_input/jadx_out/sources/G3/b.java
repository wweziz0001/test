package G3;

import E3.g;
import E3.i;
import N3.h;
import V3.C0129f;
import Z1.s;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: loaded from: classes.dex */
public abstract class b implements E3.d, c, Serializable {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final E3.d f913l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final i f914m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public transient E3.d f915n;

    public b(E3.d dVar, i iVar) {
        this.f913l = dVar;
        this.f914m = iVar;
    }

    public E3.d a(E3.d dVar, Object obj) {
        throw new UnsupportedOperationException("create(Any?;Continuation) has not been overridden");
    }

    public StackTraceElement b() {
        int iIntValue;
        String strC;
        Method method;
        Object objInvoke;
        Method method2;
        Object objInvoke2;
        d dVar = (d) getClass().getAnnotation(d.class);
        String str = null;
        if (dVar == null) {
            return null;
        }
        int iV = dVar.v();
        if (iV > 1) {
            throw new IllegalStateException(("Debug metadata version mismatch. Expected: 1, got " + iV + ". Please update the Kotlin standard library.").toString());
        }
        try {
            Field declaredField = getClass().getDeclaredField("label");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(this);
            Integer num = obj instanceof Integer ? (Integer) obj : null;
            iIntValue = (num != null ? num.intValue() : 0) - 1;
        } catch (Exception unused) {
            iIntValue = -1;
        }
        int i = iIntValue >= 0 ? dVar.l()[iIntValue] : -1;
        s sVar = e.f917b;
        s sVar2 = e.f916a;
        if (sVar == null) {
            try {
                s sVar3 = new s(Class.class.getDeclaredMethod("getModule", null), getClass().getClassLoader().loadClass("java.lang.Module").getDeclaredMethod("getDescriptor", null), getClass().getClassLoader().loadClass("java.lang.module.ModuleDescriptor").getDeclaredMethod("name", null), 1);
                e.f917b = sVar3;
                sVar = sVar3;
            } catch (Exception unused2) {
                e.f917b = sVar2;
                sVar = sVar2;
            }
        }
        if (sVar != sVar2 && (method = (Method) sVar.f3085m) != null && (objInvoke = method.invoke(getClass(), null)) != null && (method2 = (Method) sVar.f3086n) != null && (objInvoke2 = method2.invoke(objInvoke, null)) != null) {
            Method method3 = (Method) sVar.f3087o;
            Object objInvoke3 = method3 != null ? method3.invoke(objInvoke2, null) : null;
            if (objInvoke3 instanceof String) {
                str = (String) objInvoke3;
            }
        }
        if (str == null) {
            strC = dVar.c();
        } else {
            strC = str + '/' + dVar.c();
        }
        return new StackTraceElement(strC, dVar.m(), dVar.f(), i);
    }

    @Override // G3.c
    public c f() {
        E3.d dVar = this.f913l;
        if (dVar instanceof c) {
            return (c) dVar;
        }
        return null;
    }

    @Override // E3.d
    public i getContext() {
        i iVar = this.f914m;
        h.b(iVar);
        return iVar;
    }

    @Override // E3.d
    public final void j(Object obj) {
        E3.d dVar = this;
        while (true) {
            b bVar = (b) dVar;
            E3.d dVar2 = bVar.f913l;
            h.b(dVar2);
            try {
                obj = bVar.l(obj);
                if (obj == F3.a.f861l) {
                    return;
                }
            } catch (Throwable th) {
                obj = i4.a.p(th);
            }
            bVar.m();
            if (!(dVar2 instanceof b)) {
                dVar2.j(obj);
                return;
            }
            dVar = dVar2;
        }
    }

    public abstract Object l(Object obj);

    public void m() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        E3.d dVar = this.f915n;
        if (dVar != null && dVar != this) {
            g gVarL = getContext().l(E3.e.f674l);
            h.b(gVarL);
            a4.h hVar = (a4.h) dVar;
            do {
                atomicReferenceFieldUpdater = a4.h.f3596s;
            } while (atomicReferenceFieldUpdater.get(hVar) == a4.a.f3586d);
            Object obj = atomicReferenceFieldUpdater.get(hVar);
            C0129f c0129f = obj instanceof C0129f ? (C0129f) obj : null;
            if (c0129f != null) {
                c0129f.q();
            }
        }
        this.f915n = a.f912l;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Continuation at ");
        Object objB = b();
        if (objB == null) {
            objB = getClass().getName();
        }
        sb.append(objB);
        return sb.toString();
    }

    public b(E3.d dVar) {
        this(dVar, dVar != null ? dVar.getContext() : null);
    }
}

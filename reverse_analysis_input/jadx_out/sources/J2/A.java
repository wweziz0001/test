package J2;

import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.lang.reflect.Member;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import m.B0;

/* JADX INFO: loaded from: classes.dex */
public final class A implements G2.s {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Z1.e f1095l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final I2.i f1096m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final C0079l f1097n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final ArrayList f1098o;

    public A(Z1.e eVar, I2.i iVar, C0079l c0079l, ArrayList arrayList) {
        this.f1095l = eVar;
        this.f1096m = iVar;
        this.f1097n = c0079l;
        this.f1098o = arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void a(Object obj, AccessibleObject accessibleObject) {
        if (Modifier.isStatic(((Member) accessibleObject).getModifiers())) {
            obj = null;
        }
        if (!I2.t.f1073a.a(obj, accessibleObject)) {
            throw new G2.h(B0.h(L2.c.d(accessibleObject, true), " is not accessible and ReflectionAccessFilter does not permit making it accessible. Register a TypeAdapter for the declaring type, adjust the access filter or increase the visibility of the element and its declaring type."));
        }
    }

    public static void b(Class cls, String str, Field field, Field field2) {
        throw new IllegalArgumentException("Class " + cls.getName() + " declares multiple JSON fields named '" + str + "'; conflict is caused by fields " + L2.c.c(field) + " and " + L2.c.c(field2) + "\nSee " + "https://github.com/google/gson/blob/main/Troubleshooting.md#".concat("duplicate-fields"));
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x01a9 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0198  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final J2.C0091y c(G2.e r32, N2.a r33, java.lang.Class r34, boolean r35) {
        /*
            Method dump skipped, instruction units count: 470
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: J2.A.c(G2.e, N2.a, java.lang.Class, boolean):J2.y");
    }

    @Override // G2.s
    public final G2.r create(G2.e eVar, N2.a aVar) {
        Class cls = aVar.f1601a;
        if (!Object.class.isAssignableFrom(cls)) {
            return null;
        }
        i4.a aVar2 = L2.c.f1490a;
        if (!Modifier.isStatic(cls.getModifiers()) && (cls.isAnonymousClass() || cls.isLocalClass())) {
            return new G2.b(2);
        }
        I2.d.f(this.f1098o);
        return L2.c.f1490a.G(cls) ? new C0092z(cls, c(eVar, aVar, cls, true)) : new C0090x(this.f1095l.p(aVar), c(eVar, aVar, cls, false));
    }

    public final boolean d(Field field, boolean z4) {
        boolean z5;
        I2.i iVar = this.f1096m;
        iVar.getClass();
        if ((field.getModifiers() & 136) != 0 || field.isSynthetic() || iVar.a(field.getType(), z4)) {
            z5 = true;
        } else {
            List list = z4 ? iVar.f1042l : iVar.f1043m;
            if (!list.isEmpty()) {
                Iterator it = list.iterator();
                if (it.hasNext()) {
                    it.next().getClass();
                    throw new ClassCastException();
                }
            }
            z5 = false;
        }
        return !z5;
    }
}

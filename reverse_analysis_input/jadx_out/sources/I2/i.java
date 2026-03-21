package I2;

import java.lang.reflect.Modifier;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class i implements G2.s, Cloneable {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final i f1041n = new i();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final List f1042l = Collections.emptyList();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final List f1043m = Collections.emptyList();

    public final boolean a(Class cls, boolean z4) {
        if (!z4 && !Enum.class.isAssignableFrom(cls)) {
            i4.a aVar = L2.c.f1490a;
            if (!Modifier.isStatic(cls.getModifiers()) && (cls.isAnonymousClass() || cls.isLocalClass())) {
                return true;
            }
        }
        Iterator it = (z4 ? this.f1042l : this.f1043m).iterator();
        if (!it.hasNext()) {
            return false;
        }
        it.next().getClass();
        throw new ClassCastException();
    }

    public final Object clone() {
        try {
            return (i) super.clone();
        } catch (CloneNotSupportedException e5) {
            throw new AssertionError(e5);
        }
    }

    @Override // G2.s
    public final G2.r create(G2.e eVar, N2.a aVar) {
        Class cls = aVar.f1601a;
        boolean zA = a(cls, true);
        boolean zA2 = a(cls, false);
        if (zA || zA2) {
            return new h(this, zA2, zA, eVar, aVar);
        }
        return null;
    }
}

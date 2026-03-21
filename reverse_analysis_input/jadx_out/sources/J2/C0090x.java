package J2;

import b3.AbstractC0307a;
import java.lang.reflect.Field;

/* JADX INFO: renamed from: J2.x, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0090x extends AbstractC0089w {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final I2.q f1196b;

    public C0090x(I2.q qVar, C0091y c0091y) {
        super(c0091y);
        this.f1196b = qVar;
    }

    @Override // J2.AbstractC0089w
    public final Object d() {
        return this.f1196b.e();
    }

    @Override // J2.AbstractC0089w
    public final void f(Object obj, O2.a aVar, C0088v c0088v) throws IllegalAccessException {
        Object objB = c0088v.f1193g.b(aVar);
        if (objB == null && c0088v.f1194h) {
            return;
        }
        Field field = c0088v.f1188b;
        if (c0088v.f1190d) {
            A.a(obj, field);
        } else if (c0088v.i) {
            throw new G2.h(AbstractC0307a.j("Cannot set value of 'static final' ", L2.c.d(field, false)));
        }
        field.set(obj, objB);
    }

    @Override // J2.AbstractC0089w
    public final Object e(Object obj) {
        return obj;
    }
}

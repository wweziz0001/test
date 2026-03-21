package J2;

import b3.AbstractC0307a;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: J2.v, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0088v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f1187a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Field f1188b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f1189c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f1190d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Method f1191e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ G2.r f1192f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ G2.r f1193g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f1194h;
    public final /* synthetic */ boolean i;

    public C0088v(String str, Field field, boolean z4, Method method, G2.r rVar, G2.r rVar2, boolean z5, boolean z6) {
        this.f1190d = z4;
        this.f1191e = method;
        this.f1192f = rVar;
        this.f1193g = rVar2;
        this.f1194h = z5;
        this.i = z6;
        this.f1187a = str;
        this.f1188b = field;
        this.f1189c = field.getName();
    }

    public final void a(O2.b bVar, Object obj) throws IllegalAccessException {
        Object objInvoke;
        Field field = this.f1188b;
        boolean z4 = this.f1190d;
        Method method = this.f1191e;
        if (z4) {
            if (method == null) {
                A.a(obj, field);
            } else {
                A.a(obj, method);
            }
        }
        if (method != null) {
            try {
                objInvoke = method.invoke(obj, null);
            } catch (InvocationTargetException e5) {
                throw new G2.h(AbstractC0307a.k("Accessor ", L2.c.d(method, false), " threw exception"), e5.getCause());
            }
        } else {
            objInvoke = field.get(obj);
        }
        if (objInvoke == obj) {
            return;
        }
        bVar.n(this.f1187a);
        this.f1192f.c(bVar, objInvoke);
    }
}

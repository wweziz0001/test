package J2;

import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;

/* JADX INFO: renamed from: J2.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0069b extends G2.r {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final C0068a f1115c = new C0068a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Class f1116a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final E f1117b;

    public C0069b(G2.e eVar, G2.r rVar, Class cls) {
        this.f1117b = new E(eVar, rVar, cls);
        this.f1116a = cls;
    }

    @Override // G2.r
    public final Object b(O2.a aVar) throws IOException {
        if (aVar.E() == 9) {
            aVar.A();
            return null;
        }
        ArrayList arrayList = new ArrayList();
        aVar.a();
        while (aVar.r()) {
            arrayList.add(((G2.r) this.f1117b.f1110c).b(aVar));
        }
        aVar.k();
        int size = arrayList.size();
        Class cls = this.f1116a;
        if (!cls.isPrimitive()) {
            return arrayList.toArray((Object[]) Array.newInstance((Class<?>) cls, size));
        }
        Object objNewInstance = Array.newInstance((Class<?>) cls, size);
        for (int i = 0; i < size; i++) {
            Array.set(objNewInstance, i, arrayList.get(i));
        }
        return objNewInstance;
    }

    @Override // G2.r
    public final void c(O2.b bVar, Object obj) throws IOException {
        if (obj == null) {
            bVar.p();
            return;
        }
        bVar.b();
        int length = Array.getLength(obj);
        for (int i = 0; i < length; i++) {
            this.f1117b.c(bVar, Array.get(obj, i));
        }
        bVar.k();
    }
}

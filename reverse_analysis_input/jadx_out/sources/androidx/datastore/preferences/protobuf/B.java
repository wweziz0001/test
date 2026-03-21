package androidx.datastore.preferences.protobuf;

/* JADX INFO: loaded from: classes.dex */
public final class B {
    public static void a(long j5, Object obj) {
        AbstractC0210b abstractC0210b = (AbstractC0210b) ((InterfaceC0230w) i0.f4163b.h(j5, obj));
        if (abstractC0210b.f4127l) {
            abstractC0210b.f4127l = false;
        }
    }

    public static InterfaceC0230w b(long j5, Object obj) {
        InterfaceC0230w interfaceC0230w = (InterfaceC0230w) i0.f4163b.h(j5, obj);
        if (((AbstractC0210b) interfaceC0230w).f4127l) {
            return interfaceC0230w;
        }
        T t4 = (T) interfaceC0230w;
        int i = t4.f4104n;
        T tH = t4.h(i == 0 ? 10 : i * 2);
        i0.o(j5, obj, tH);
        return tH;
    }
}

package T2;

/* JADX INFO: loaded from: classes.dex */
public interface h {
    default void a(e eVar, Runnable runnable) {
        c(new f(eVar == null ? null : new B0.d(eVar), runnable));
    }

    void b();

    void c(f fVar);

    void start();
}

package androidx.lifecycle;

/* JADX INFO: loaded from: classes.dex */
public interface W {
    default T c(Class cls) {
        throw new UnsupportedOperationException("Factory.create(String) is unsupported.  This Factory requires `CreationExtras` to be passed into `create` method.");
    }

    default T i(Class cls, W.c cVar) {
        return c(cls);
    }
}

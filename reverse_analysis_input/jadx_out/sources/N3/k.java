package N3;

/* JADX INFO: loaded from: classes.dex */
public final class k extends l implements S3.c, M3.l {
    @Override // N3.c
    public final S3.a a() {
        q.f1627a.getClass();
        return this;
    }

    @Override // M3.l
    public final Object c(Object obj) {
        g();
        throw null;
    }

    public final void g() {
        if (this.f1622r) {
            throw new UnsupportedOperationException("Kotlin reflection is not yet supported for synthetic Java properties. Please follow/upvote https://youtrack.jetbrains.com/issue/KT-55980");
        }
        S3.a aVarF = f();
        if (aVarF == this) {
            throw new L3.a("Kotlin reflection implementation is not found at runtime. Make sure you have kotlin-reflect.jar in the classpath");
        }
        ((k) ((S3.c) aVarF)).g();
    }
}

package g4;

import a0.C0200z;

/* JADX INFO: loaded from: classes.dex */
public abstract class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final i f5848a;

    static {
        i iVar;
        try {
            Class.forName("java.nio.file.Files");
            iVar = new j();
        } catch (ClassNotFoundException unused) {
            iVar = new i();
        }
        f5848a = iVar;
        String str = l.f5856m;
        String property = System.getProperty("java.io.tmpdir");
        N3.h.d(property, "getProperty(\"java.io.tmpdir\")");
        C0200z.s(property, false);
        ClassLoader classLoader = h4.c.class.getClassLoader();
        N3.h.d(classLoader, "ResourceFileSystem::class.java.classLoader");
        new h4.c(classLoader);
    }

    public final boolean a(l lVar) {
        N3.h.e(lVar, "path");
        return b(lVar) != null;
    }

    public abstract e b(l lVar);
}

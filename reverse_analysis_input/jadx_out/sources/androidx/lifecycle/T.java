package androidx.lifecycle;

import java.io.Closeable;
import java.io.IOException;
import java.util.HashMap;
import java.util.LinkedHashSet;

/* JADX INFO: loaded from: classes.dex */
public abstract class T {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f4513a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LinkedHashSet f4514b = new LinkedHashSet();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile boolean f4515c = false;

    public static void a(Object obj) {
        if (obj instanceof Closeable) {
            try {
                ((Closeable) obj).close();
            } catch (IOException e5) {
                throw new RuntimeException(e5);
            }
        }
    }

    public void b() {
    }
}

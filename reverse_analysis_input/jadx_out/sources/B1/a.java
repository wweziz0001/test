package B1;

import android.os.Trace;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {
    public static void a(String str, int i) {
        Trace.beginAsyncSection(str, i);
    }

    public static void b(String str, int i) {
        Trace.endAsyncSection(str, i);
    }

    public static boolean c() {
        return Trace.isEnabled();
    }
}

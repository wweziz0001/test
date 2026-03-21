package z3;

import Z1.f;
import android.os.Trace;

/* JADX INFO: renamed from: z3.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1068a implements AutoCloseable {
    public static String a(String str) {
        if (str.length() < 124) {
            return str;
        }
        return str.substring(0, 124) + "...";
    }

    public static void b(String str) {
        Trace.beginSection(f.N(a(str)));
    }
}

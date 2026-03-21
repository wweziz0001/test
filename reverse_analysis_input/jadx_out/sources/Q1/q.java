package Q1;

import android.util.Log;

/* JADX INFO: loaded from: classes.dex */
public final class q {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Object f1836b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static volatile q f1837c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f1838a;

    public q(int i) {
        this.f1838a = i;
    }

    public static q d() {
        q qVar;
        synchronized (f1836b) {
            try {
                if (f1837c == null) {
                    f1837c = new q(3);
                }
                qVar = f1837c;
            } catch (Throwable th) {
                throw th;
            }
        }
        return qVar;
    }

    public static String f(String str) {
        int length = str.length();
        StringBuilder sb = new StringBuilder(23);
        sb.append("WM-");
        if (length >= 20) {
            sb.append(str.substring(0, 20));
        } else {
            sb.append(str);
        }
        return sb.toString();
    }

    public final void a(String str, String str2) {
        if (this.f1838a <= 3) {
            Log.d(str, str2);
        }
    }

    public final void b(String str, String str2) {
        if (this.f1838a <= 6) {
            Log.e(str, str2);
        }
    }

    public final void c(String str, String str2, Throwable th) {
        if (this.f1838a <= 6) {
            Log.e(str, str2, th);
        }
    }

    public final void e(String str, String str2) {
        if (this.f1838a <= 4) {
            Log.i(str, str2);
        }
    }

    public final void g(String str, String str2) {
        if (this.f1838a <= 5) {
            Log.w(str, str2);
        }
    }
}

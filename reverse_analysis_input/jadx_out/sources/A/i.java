package A;

import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Typeface;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import q.C0739i;

/* JADX INFO: loaded from: classes.dex */
public abstract class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Z0.g f22a = new Z0.g(16);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final ThreadPoolExecutor f23b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Object f24c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final C0739i f25d;

    static {
        m mVar = new m();
        mVar.f34a = "fonts-androidx";
        mVar.f35b = 10;
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 10000, TimeUnit.MILLISECONDS, new LinkedBlockingDeque(), mVar);
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        f23b = threadPoolExecutor;
        f24c = new Object();
        f25d = new C0739i();
    }

    public static h a(String str, Context context, e eVar, int i) {
        Z0.g gVar = f22a;
        Typeface typeface = (Typeface) gVar.d(str);
        if (typeface != null) {
            return new h(typeface);
        }
        try {
            j jVarA = d.a(context, eVar);
            int i5 = 1;
            k[] kVarArr = (k[]) jVarA.f27m;
            int i6 = jVarA.f26l;
            if (i6 != 0) {
                i5 = i6 != 1 ? -3 : -2;
            } else if (kVarArr != null && kVarArr.length != 0) {
                int length = kVarArr.length;
                i5 = 0;
                int i7 = 0;
                while (true) {
                    if (i7 >= length) {
                        break;
                    }
                    int i8 = kVarArr[i7].f32e;
                    if (i8 == 0) {
                        i7++;
                    } else if (i8 >= 0) {
                        i5 = i8;
                    }
                }
            }
            if (i5 != 0) {
                return new h(i5);
            }
            Typeface typefaceK = w.f.f10407a.k(context, kVarArr, i);
            if (typefaceK == null) {
                return new h(-3);
            }
            gVar.e(str, typefaceK);
            return new h(typefaceK);
        } catch (PackageManager.NameNotFoundException unused) {
            return new h(-1);
        }
    }
}

package Z0;

import D.I;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.widget.TextView;
import d0.AbstractC0360m;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.Arrays;
import m.AbstractC0621w;
import m.C0623x;

/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f2835a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f2836b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f2837c = new long[10];

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f2838d = new Object[10];

    public synchronized void a(long j5, Object obj) {
        if (this.f2836b > 0) {
            if (j5 <= ((long[]) this.f2837c)[((this.f2835a + r0) - 1) % ((Object[]) this.f2838d).length]) {
                c();
            }
        }
        d();
        int i = this.f2835a;
        int i5 = this.f2836b;
        Object[] objArr = (Object[]) this.f2838d;
        int length = (i + i5) % objArr.length;
        ((long[]) this.f2837c)[length] = j5;
        objArr[length] = obj;
        this.f2836b = i5 + 1;
    }

    public void b() {
        new Handler(Looper.getMainLooper()).post(new A3.c(this, 20));
    }

    public synchronized void c() {
        this.f2835a = 0;
        this.f2836b = 0;
        Arrays.fill((Object[]) this.f2838d, (Object) null);
    }

    public void d() {
        int length = ((Object[]) this.f2838d).length;
        if (this.f2836b < length) {
            return;
        }
        int i = length * 2;
        long[] jArr = new long[i];
        Object[] objArr = new Object[i];
        int i5 = this.f2835a;
        int i6 = length - i5;
        System.arraycopy((long[]) this.f2837c, i5, jArr, 0, i6);
        System.arraycopy((Object[]) this.f2838d, this.f2835a, objArr, 0, i6);
        int i7 = this.f2835a;
        if (i7 > 0) {
            System.arraycopy((long[]) this.f2837c, 0, jArr, i6, i7);
            System.arraycopy((Object[]) this.f2838d, 0, objArr, i6, this.f2835a);
        }
        this.f2837c = jArr;
        this.f2838d = objArr;
        this.f2835a = 0;
    }

    public void e(Typeface typeface) {
        int i;
        if (Build.VERSION.SDK_INT >= 28 && (i = this.f2835a) != -1) {
            typeface = AbstractC0621w.a(typeface, i, (this.f2836b & 2) != 0);
        }
        C0623x c0623x = (C0623x) this.f2838d;
        if (c0623x.f8491m) {
            c0623x.f8490l = typeface;
            TextView textView = (TextView) ((WeakReference) this.f2837c).get();
            if (textView != null) {
                Field field = I.f300a;
                if (textView.isAttachedToWindow()) {
                    textView.post(new T1.i(textView, typeface, c0623x.f8488j, 4));
                } else {
                    textView.setTypeface(typeface, c0623x.f8488j);
                }
            }
        }
    }

    public synchronized Object f() {
        return this.f2836b == 0 ? null : h();
    }

    public synchronized Object g(long j5) {
        Object objH;
        objH = null;
        while (this.f2836b > 0 && j5 - ((long[]) this.f2837c)[this.f2835a] >= 0) {
            objH = h();
        }
        return objH;
    }

    public Object h() {
        AbstractC0360m.h(this.f2836b > 0);
        Object[] objArr = (Object[]) this.f2838d;
        int i = this.f2835a;
        Object obj = objArr[i];
        objArr[i] = null;
        this.f2835a = (i + 1) % objArr.length;
        this.f2836b--;
        return obj;
    }

    public synchronized int i() {
        return this.f2836b;
    }
}

package D;

import android.os.Build;
import android.view.View;
import java.nio.ByteBuffer;
import java.util.ConcurrentModificationException;

/* JADX INFO: renamed from: D.w, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0022w {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f373l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f374m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f375n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public Object f376o;

    public AbstractC0022w() {
        if (A0.b.f48n == null) {
            A0.b.f48n = new A0.b(23);
        }
    }

    public int a(int i) {
        if (i < this.f375n) {
            return ((ByteBuffer) this.f376o).getShort(this.f374m + i);
        }
        return 0;
    }

    public void b() {
        if (((D3.f) this.f376o).f610s != this.f375n) {
            throw new ConcurrentModificationException();
        }
    }

    public abstract Object c(View view);

    public abstract void d(View view, CharSequence charSequence);

    public void e() {
        while (true) {
            int i = this.f373l;
            D3.f fVar = (D3.f) this.f376o;
            if (i >= fVar.f608q || fVar.f605n[i] >= 0) {
                return;
            } else {
                this.f373l = i + 1;
            }
        }
    }

    public void f(View view, CharSequence charSequence) {
        Object tag;
        if (Build.VERSION.SDK_INT >= this.f374m) {
            d(view, charSequence);
            return;
        }
        if (Build.VERSION.SDK_INT >= this.f374m) {
            tag = c(view);
        } else {
            tag = view.getTag(this.f373l);
            if (!((Class) this.f376o).isInstance(tag)) {
                tag = null;
            }
        }
        if (g(tag, charSequence)) {
            View.AccessibilityDelegate accessibilityDelegateA = I.a(view);
            C0002b c0002b = accessibilityDelegateA == null ? null : accessibilityDelegateA instanceof C0001a ? ((C0001a) accessibilityDelegateA).f324a : new C0002b(accessibilityDelegateA);
            if (c0002b == null) {
                c0002b = new C0002b();
            }
            I.d(view, c0002b);
            view.setTag(this.f373l, charSequence);
            I.b(view, this.f375n);
        }
    }

    public abstract boolean g(Object obj, CharSequence charSequence);

    public boolean hasNext() {
        return this.f373l < ((D3.f) this.f376o).f608q;
    }

    public void remove() {
        b();
        if (this.f374m == -1) {
            throw new IllegalStateException("Call next() before removing element from the iterator.");
        }
        D3.f fVar = (D3.f) this.f376o;
        fVar.c();
        fVar.l(this.f374m);
        this.f374m = -1;
        this.f375n = fVar.f610s;
    }
}

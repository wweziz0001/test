package m2;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: m2.C, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0636C {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object[] f8537a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f8538b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f8539c;

    public AbstractC0636C(int i) {
        r.e("initialCapacity", i);
        this.f8537a = new Object[i];
        this.f8538b = 0;
    }

    public static int f(int i, int i5) {
        if (i5 < 0) {
            throw new IllegalArgumentException("cannot store more than MAX_VALUE elements");
        }
        if (i5 <= i) {
            return i;
        }
        int iHighestOneBit = i + (i >> 1) + 1;
        if (iHighestOneBit < i5) {
            iHighestOneBit = Integer.highestOneBit(i5 - 1) << 1;
        }
        if (iHighestOneBit < 0) {
            return Integer.MAX_VALUE;
        }
        return iHighestOneBit;
    }

    public final void a(Object obj) {
        obj.getClass();
        e(1);
        Object[] objArr = this.f8537a;
        int i = this.f8538b;
        this.f8538b = i + 1;
        objArr[i] = obj;
    }

    public abstract AbstractC0636C b(Object obj);

    public void c(Object obj) {
        a(obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void d(List list) {
        if (list != 0) {
            e(list.size());
            if (list instanceof AbstractC0637D) {
                this.f8538b = ((AbstractC0637D) list).g(this.f8538b, this.f8537a);
                return;
            }
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            b(it.next());
        }
    }

    public final void e(int i) {
        Object[] objArr = this.f8537a;
        int iF = f(objArr.length, this.f8538b + i);
        if (iF > objArr.length || this.f8539c) {
            this.f8537a = Arrays.copyOf(this.f8537a, iF);
            this.f8539c = false;
        }
    }
}

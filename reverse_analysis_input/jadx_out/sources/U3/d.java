package U3;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes.dex */
public final class d implements Iterator, O3.a {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final String f2298l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f2299m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f2300n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f2301o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f2302p;

    public d(String str) {
        N3.h.e(str, "string");
        this.f2298l = str;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i;
        int i5;
        int i6 = this.f2299m;
        if (i6 != 0) {
            return i6 == 1;
        }
        if (this.f2302p < 0) {
            this.f2299m = 2;
            return false;
        }
        String str = this.f2298l;
        int length = str.length();
        int length2 = str.length();
        for (int i7 = this.f2300n; i7 < length2; i7++) {
            char cCharAt = str.charAt(i7);
            if (cCharAt == '\n' || cCharAt == '\r') {
                i = (cCharAt == '\r' && (i5 = i7 + 1) < str.length() && str.charAt(i5) == '\n') ? 2 : 1;
                length = i7;
                this.f2299m = 1;
                this.f2302p = i;
                this.f2301o = length;
                return true;
            }
        }
        i = -1;
        this.f2299m = 1;
        this.f2302p = i;
        this.f2301o = length;
        return true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.f2299m = 0;
        int i = this.f2301o;
        int i5 = this.f2300n;
        this.f2300n = this.f2302p + i;
        return this.f2298l.subSequence(i5, i).toString();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}

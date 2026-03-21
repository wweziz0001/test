package l2;

import androidx.lifecycle.E;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes.dex */
public final class g implements Iterator {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public String f8210m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final CharSequence f8211n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final C0577c f8212o;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f8214q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ E f8215r;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f8209l = 2;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f8213p = 0;

    public g(E e5, D0.d dVar, CharSequence charSequence) {
        this.f8215r = e5;
        this.f8212o = (C0577c) dVar.f395m;
        this.f8214q = dVar.f394l;
        this.f8211n = charSequence;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        String string;
        int i = this.f8209l;
        if (i == 4) {
            throw new IllegalStateException();
        }
        int iB = O.i.b(i);
        if (iB == 0) {
            return true;
        }
        if (iB == 2) {
            return false;
        }
        this.f8209l = 4;
        int i5 = this.f8213p;
        while (true) {
            int length = this.f8213p;
            if (length == -1) {
                this.f8209l = 3;
                string = null;
                break;
            }
            C0576b c0576b = (C0576b) this.f8215r.f4474m;
            CharSequence charSequence = this.f8211n;
            int length2 = charSequence.length();
            D1.b.o(length, length2);
            while (true) {
                if (length >= length2) {
                    length = -1;
                    break;
                }
                if (c0576b.a(charSequence.charAt(length))) {
                    break;
                }
                length++;
            }
            if (length == -1) {
                length = charSequence.length();
                this.f8213p = -1;
            } else {
                this.f8213p = length + 1;
            }
            int i6 = this.f8213p;
            if (i6 == i5) {
                int i7 = i6 + 1;
                this.f8213p = i7;
                if (i7 > charSequence.length()) {
                    this.f8213p = -1;
                }
            } else {
                C0577c c0577c = this.f8212o;
                if (i5 < length) {
                    charSequence.charAt(i5);
                    c0577c.getClass();
                }
                if (length > i5) {
                    charSequence.charAt(length - 1);
                    c0577c.getClass();
                }
                int i8 = this.f8214q;
                if (i8 == 1) {
                    length = charSequence.length();
                    this.f8213p = -1;
                    if (length > i5) {
                        charSequence.charAt(length - 1);
                        c0577c.getClass();
                    }
                } else {
                    this.f8214q = i8 - 1;
                }
                string = charSequence.subSequence(i5, length).toString();
            }
        }
        this.f8210m = string;
        if (this.f8209l == 3) {
            return false;
        }
        this.f8209l = 1;
        return true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.f8209l = 2;
        String str = this.f8210m;
        this.f8210m = null;
        return str;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}

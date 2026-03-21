package q;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: q.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0731a implements Iterator {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f9201l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f9202m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f9203n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f9204o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ Object f9205p;

    public C0731a(int i) {
        this.f9201l = i;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f9202m < this.f9201l;
    }

    @Override // java.util.Iterator
    public final Object next() {
        Object objG;
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i = this.f9202m;
        switch (this.f9204o) {
            case 0:
                objG = ((C0735e) this.f9205p).g(i);
                break;
            case 1:
                objG = ((C0735e) this.f9205p).i(i);
                break;
            default:
                objG = ((C0736f) this.f9205p).f9222m[i];
                break;
        }
        this.f9202m++;
        this.f9203n = true;
        return objG;
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.f9203n) {
            throw new IllegalStateException();
        }
        int i = this.f9202m - 1;
        this.f9202m = i;
        switch (this.f9204o) {
            case 0:
                ((C0735e) this.f9205p).h(i);
                break;
            case 1:
                ((C0735e) this.f9205p).h(i);
                break;
            default:
                ((C0736f) this.f9205p).j(i);
                break;
        }
        this.f9201l--;
        this.f9203n = false;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C0731a(C0735e c0735e, int i) {
        this(c0735e.f9237n);
        this.f9204o = i;
        switch (i) {
            case 1:
                this.f9205p = c0735e;
                this(c0735e.f9237n);
                break;
            default:
                this.f9205p = c0735e;
                break;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C0731a(C0736f c0736f) {
        this(c0736f.f9223n);
        this.f9204o = 2;
        this.f9205p = c0736f;
    }
}

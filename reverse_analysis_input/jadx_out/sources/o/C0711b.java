package o;

import java.util.Iterator;

/* JADX INFO: renamed from: o.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0711b extends AbstractC0714e implements Iterator {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public C0712c f8951l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public C0712c f8952m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f8953n;

    public C0711b(C0712c c0712c, C0712c c0712c2, int i) {
        this.f8953n = i;
        this.f8951l = c0712c2;
        this.f8952m = c0712c;
    }

    @Override // o.AbstractC0714e
    public final void a(C0712c c0712c) {
        C0712c c0712c2;
        C0712c c0712cB = null;
        if (this.f8951l == c0712c && c0712c == this.f8952m) {
            this.f8952m = null;
            this.f8951l = null;
        }
        C0712c c0712c3 = this.f8951l;
        if (c0712c3 == c0712c) {
            switch (this.f8953n) {
                case 0:
                    c0712c2 = c0712c3.f8957o;
                    break;
                default:
                    c0712c2 = c0712c3.f8956n;
                    break;
            }
            this.f8951l = c0712c2;
        }
        C0712c c0712c4 = this.f8952m;
        if (c0712c4 == c0712c) {
            C0712c c0712c5 = this.f8951l;
            if (c0712c4 != c0712c5 && c0712c5 != null) {
                c0712cB = b(c0712c4);
            }
            this.f8952m = c0712cB;
        }
    }

    public final C0712c b(C0712c c0712c) {
        switch (this.f8953n) {
            case 0:
                return c0712c.f8956n;
            default:
                return c0712c.f8957o;
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f8952m != null;
    }

    @Override // java.util.Iterator
    public final Object next() {
        C0712c c0712c = this.f8952m;
        C0712c c0712c2 = this.f8951l;
        this.f8952m = (c0712c == c0712c2 || c0712c2 == null) ? null : b(c0712c);
        return c0712c;
    }
}

package o;

import java.util.Iterator;

/* JADX INFO: renamed from: o.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0713d extends AbstractC0714e implements Iterator {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public C0712c f8958l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f8959m = true;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ C0715f f8960n;

    public C0713d(C0715f c0715f) {
        this.f8960n = c0715f;
    }

    @Override // o.AbstractC0714e
    public final void a(C0712c c0712c) {
        C0712c c0712c2 = this.f8958l;
        if (c0712c == c0712c2) {
            C0712c c0712c3 = c0712c2.f8957o;
            this.f8958l = c0712c3;
            this.f8959m = c0712c3 == null;
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f8959m) {
            return this.f8960n.f8961l != null;
        }
        C0712c c0712c = this.f8958l;
        return (c0712c == null || c0712c.f8956n == null) ? false : true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.f8959m) {
            this.f8959m = false;
            this.f8958l = this.f8960n.f8961l;
        } else {
            C0712c c0712c = this.f8958l;
            this.f8958l = c0712c != null ? c0712c.f8956n : null;
        }
        return this.f8958l;
    }
}

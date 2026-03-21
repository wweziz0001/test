package androidx.datastore.preferences.protobuf;

import com.google.crypto.tink.shaded.protobuf.C0328h;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0212d implements Iterator {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f4136l = 0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f4137m = 0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final int f4138n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Object f4139o;

    public C0212d(C0215g c0215g) {
        this.f4139o = c0215g;
        this.f4138n = c0215g.size();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f4136l) {
            case 0:
                if (this.f4137m < this.f4138n) {
                }
                break;
            default:
                if (this.f4137m < this.f4138n) {
                }
                break;
        }
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f4136l) {
            case 0:
                int i = this.f4137m;
                if (i >= this.f4138n) {
                    throw new NoSuchElementException();
                }
                this.f4137m = i + 1;
                return Byte.valueOf(((C0215g) this.f4139o).k(i));
            default:
                int i5 = this.f4137m;
                if (i5 >= this.f4138n) {
                    throw new NoSuchElementException();
                }
                this.f4137m = i5 + 1;
                return Byte.valueOf(((C0328h) this.f4139o).l(i5));
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f4136l) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    public C0212d(C0328h c0328h) {
        this.f4139o = c0328h;
        this.f4138n = c0328h.size();
    }
}

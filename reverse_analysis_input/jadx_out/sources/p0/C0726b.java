package p0;

import c1.i;
import c1.l;
import d0.AbstractC0360m;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;

/* JADX INFO: renamed from: p0.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0726b implements c1.e, g0.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g0.g f9127a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f9128b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayDeque f9129c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayDeque f9130d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final g0.e[] f9131e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final g0.f[] f9132f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f9133g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f9134h;
    public g0.e i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public g0.c f9135j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f9136k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f9137l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public long f9138m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f9139n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Object f9140o;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C0726b(l lVar) {
        this(new i[2], new c1.c[2]);
        this.f9139n = 1;
        int i = this.f9133g;
        g0.e[] eVarArr = this.f9131e;
        AbstractC0360m.h(i == eVarArr.length);
        for (g0.e eVar : eVarArr) {
            eVar.j(1024);
        }
        this.f9140o = lVar;
    }

    @Override // g0.b
    public final Object c() {
        g0.e eVar;
        synchronized (this.f9128b) {
            try {
                g0.c cVar = this.f9135j;
                if (cVar != null) {
                    throw cVar;
                }
                AbstractC0360m.h(this.i == null);
                int i = this.f9133g;
                if (i == 0) {
                    eVar = null;
                } else {
                    g0.e[] eVarArr = this.f9131e;
                    int i5 = i - 1;
                    this.f9133g = i5;
                    eVar = eVarArr[i5];
                }
                this.i = eVar;
            } catch (Throwable th) {
                throw th;
            }
        }
        return eVar;
    }

    @Override // g0.b
    public final void e(long j5) {
        synchronized (this.f9128b) {
            try {
                AbstractC0360m.h(this.f9133g == this.f9131e.length || this.f9136k);
                this.f9138m = j5;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final g0.c f(Throwable th) {
        switch (this.f9139n) {
            case 0:
                return new d("Unexpected decode error", th);
            default:
                return new c1.f("Unexpected decode error", th);
        }
    }

    @Override // g0.b
    public final void flush() {
        synchronized (this.f9128b) {
            try {
                this.f9136k = true;
                g0.e eVar = this.i;
                if (eVar != null) {
                    eVar.f();
                    int i = this.f9133g;
                    this.f9133g = i + 1;
                    this.f9131e[i] = eVar;
                    this.i = null;
                }
                while (!this.f9129c.isEmpty()) {
                    g0.e eVar2 = (g0.e) this.f9129c.removeFirst();
                    eVar2.f();
                    int i5 = this.f9133g;
                    this.f9133g = i5 + 1;
                    this.f9131e[i5] = eVar2;
                }
                while (!this.f9130d.isEmpty()) {
                    ((g0.f) this.f9130d.removeFirst()).i();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final g0.c g(g0.e eVar, g0.f fVar, boolean z4) {
        switch (this.f9139n) {
            case 0:
                C0725a c0725a = (C0725a) fVar;
                try {
                    ByteBuffer byteBuffer = eVar.f5787p;
                    byteBuffer.getClass();
                    AbstractC0360m.h(byteBuffer.hasArray());
                    AbstractC0360m.c(byteBuffer.arrayOffset() == 0);
                    i0.b bVar = (i0.b) this.f9140o;
                    byte[] bArrArray = byteBuffer.array();
                    int iRemaining = byteBuffer.remaining();
                    bVar.getClass();
                    c0725a.f9125p = i0.b.d(iRemaining, bArrArray);
                    c0725a.f5792n = eVar.f5789r;
                    return null;
                } catch (d e5) {
                    return e5;
                }
            default:
                i iVar = (i) eVar;
                c1.c cVar = (c1.c) fVar;
                try {
                    ByteBuffer byteBuffer2 = iVar.f5787p;
                    byteBuffer2.getClass();
                    byte[] bArrArray2 = byteBuffer2.array();
                    int iLimit = byteBuffer2.limit();
                    l lVar = (l) this.f9140o;
                    if (z4) {
                        lVar.reset();
                    }
                    c1.d dVarV = lVar.v(bArrArray2, 0, iLimit);
                    long j5 = iVar.f5789r;
                    long j6 = iVar.f5050u;
                    cVar.f5792n = j5;
                    cVar.f5035p = dVarV;
                    if (j6 != Long.MAX_VALUE) {
                        j5 = j6;
                    }
                    cVar.f5036q = j5;
                    cVar.f5793o = false;
                    return null;
                } catch (c1.f e6) {
                    return e6;
                }
        }
    }

    public final boolean h() {
        boolean z4;
        g0.c cVarF;
        synchronized (this.f9128b) {
            while (!this.f9137l) {
                try {
                    if (!this.f9129c.isEmpty() && this.f9134h > 0) {
                        break;
                    }
                    this.f9128b.wait();
                } finally {
                }
            }
            if (this.f9137l) {
                return false;
            }
            g0.e eVar = (g0.e) this.f9129c.removeFirst();
            g0.f[] fVarArr = this.f9132f;
            int i = this.f9134h - 1;
            this.f9134h = i;
            g0.f fVar = fVarArr[i];
            boolean z5 = this.f9136k;
            this.f9136k = false;
            if (eVar.e(4)) {
                fVar.b(4);
            } else {
                fVar.f5792n = eVar.f5789r;
                if (eVar.e(134217728)) {
                    fVar.b(134217728);
                }
                long j5 = eVar.f5789r;
                synchronized (this.f9128b) {
                    long j6 = this.f9138m;
                    z4 = j6 == -9223372036854775807L || j5 >= j6;
                }
                if (!z4) {
                    fVar.f5793o = true;
                }
                try {
                    cVarF = g(eVar, fVar, z5);
                } catch (OutOfMemoryError e5) {
                    cVarF = f(e5);
                } catch (RuntimeException e6) {
                    cVarF = f(e6);
                }
                if (cVarF != null) {
                    synchronized (this.f9128b) {
                        this.f9135j = cVarF;
                    }
                    return false;
                }
            }
            synchronized (this.f9128b) {
                try {
                    if (this.f9136k || fVar.f5793o) {
                        fVar.i();
                    } else {
                        this.f9130d.addLast(fVar);
                    }
                    eVar.f();
                    int i5 = this.f9133g;
                    this.f9133g = i5 + 1;
                    this.f9131e[i5] = eVar;
                } finally {
                }
            }
            return true;
        }
    }

    @Override // g0.b
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public final g0.f b() {
        synchronized (this.f9128b) {
            try {
                g0.c cVar = this.f9135j;
                if (cVar != null) {
                    throw cVar;
                }
                if (this.f9130d.isEmpty()) {
                    return null;
                }
                return (g0.f) this.f9130d.removeFirst();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // g0.b
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public final void d(g0.e eVar) {
        synchronized (this.f9128b) {
            try {
                g0.c cVar = this.f9135j;
                if (cVar != null) {
                    throw cVar;
                }
                AbstractC0360m.c(eVar == this.i);
                this.f9129c.addLast(eVar);
                if (!this.f9129c.isEmpty() && this.f9134h > 0) {
                    this.f9128b.notify();
                }
                this.i = null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void k(g0.f fVar) {
        synchronized (this.f9128b) {
            fVar.f();
            int i = this.f9134h;
            this.f9134h = i + 1;
            this.f9132f[i] = fVar;
            if (!this.f9129c.isEmpty() && this.f9134h > 0) {
                this.f9128b.notify();
            }
        }
    }

    @Override // g0.b
    public final void release() {
        synchronized (this.f9128b) {
            this.f9137l = true;
            this.f9128b.notify();
        }
        try {
            this.f9127a.join();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        }
    }

    public C0726b(g0.e[] eVarArr, g0.f[] fVarArr) {
        g0.f c0725a;
        g0.e eVar;
        this.f9128b = new Object();
        this.f9138m = -9223372036854775807L;
        this.f9129c = new ArrayDeque();
        this.f9130d = new ArrayDeque();
        this.f9131e = eVarArr;
        this.f9133g = eVarArr.length;
        for (int i = 0; i < this.f9133g; i++) {
            g0.e[] eVarArr2 = this.f9131e;
            switch (this.f9139n) {
                case 0:
                    eVar = new g0.e(1);
                    break;
                default:
                    eVar = new i(1);
                    break;
            }
            eVarArr2[i] = eVar;
        }
        this.f9132f = fVarArr;
        this.f9134h = fVarArr.length;
        for (int i5 = 0; i5 < this.f9134h; i5++) {
            g0.f[] fVarArr2 = this.f9132f;
            switch (this.f9139n) {
                case 0:
                    c0725a = new C0725a(this);
                    break;
                default:
                    c0725a = new c1.c(this);
                    break;
            }
            fVarArr2[i5] = c0725a;
        }
        g0.g gVar = new g0.g(this);
        this.f9127a = gVar;
        gVar.start();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C0726b(i0.b bVar) {
        this(new g0.e[1], new C0725a[1]);
        this.f9139n = 0;
        this.f9140o = bVar;
    }

    @Override // c1.e
    public void a(long j5) {
    }
}

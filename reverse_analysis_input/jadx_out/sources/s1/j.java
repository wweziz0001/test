package s1;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import x1.InterfaceC0988d;
import x1.InterfaceC0989e;

/* JADX INFO: loaded from: classes.dex */
public final class j implements InterfaceC0989e, InterfaceC0988d {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final TreeMap f9599t = new TreeMap();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f9600l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public volatile String f9601m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final long[] f9602n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final double[] f9603o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final String[] f9604p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final byte[][] f9605q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final int[] f9606r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f9607s;

    public j(int i) {
        this.f9600l = i;
        int i5 = i + 1;
        this.f9606r = new int[i5];
        this.f9602n = new long[i5];
        this.f9603o = new double[i5];
        this.f9604p = new String[i5];
        this.f9605q = new byte[i5][];
    }

    public static final j c(String str, int i) {
        N3.h.e(str, "query");
        TreeMap treeMap = f9599t;
        synchronized (treeMap) {
            Map.Entry entryCeilingEntry = treeMap.ceilingEntry(Integer.valueOf(i));
            if (entryCeilingEntry == null) {
                j jVar = new j(i);
                jVar.f9601m = str;
                jVar.f9607s = i;
                return jVar;
            }
            treeMap.remove(entryCeilingEntry.getKey());
            j jVar2 = (j) entryCeilingEntry.getValue();
            jVar2.getClass();
            jVar2.f9601m = str;
            jVar2.f9607s = i;
            return jVar2;
        }
    }

    @Override // x1.InterfaceC0989e
    public final String a() {
        String str = this.f9601m;
        if (str != null) {
            return str;
        }
        throw new IllegalStateException("Required value was null.");
    }

    @Override // x1.InterfaceC0989e
    public final void b(InterfaceC0988d interfaceC0988d) {
        int i = this.f9607s;
        if (1 > i) {
            return;
        }
        int i5 = 1;
        while (true) {
            int i6 = this.f9606r[i5];
            if (i6 == 1) {
                interfaceC0988d.g(i5);
            } else if (i6 == 2) {
                interfaceC0988d.m(this.f9602n[i5], i5);
            } else if (i6 == 3) {
                interfaceC0988d.i(i5, this.f9603o[i5]);
            } else if (i6 == 4) {
                String str = this.f9604p[i5];
                if (str == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                interfaceC0988d.h(str, i5);
            } else if (i6 == 5) {
                byte[] bArr = this.f9605q[i5];
                if (bArr == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                interfaceC0988d.e(i5, bArr);
            }
            if (i5 == i) {
                return;
            } else {
                i5++;
            }
        }
    }

    @Override // x1.InterfaceC0988d
    public final void e(int i, byte[] bArr) {
        this.f9606r[i] = 5;
        this.f9605q[i] = bArr;
    }

    public final void f() {
        TreeMap treeMap = f9599t;
        synchronized (treeMap) {
            treeMap.put(Integer.valueOf(this.f9600l), this);
            if (treeMap.size() > 15) {
                int size = treeMap.size() - 10;
                Iterator it = treeMap.descendingKeySet().iterator();
                N3.h.d(it, "queryPool.descendingKeySet().iterator()");
                while (true) {
                    int i = size - 1;
                    if (size <= 0) {
                        break;
                    }
                    it.next();
                    it.remove();
                    size = i;
                }
            }
        }
    }

    @Override // x1.InterfaceC0988d
    public final void g(int i) {
        this.f9606r[i] = 1;
    }

    @Override // x1.InterfaceC0988d
    public final void h(String str, int i) {
        N3.h.e(str, "value");
        this.f9606r[i] = 4;
        this.f9604p[i] = str;
    }

    @Override // x1.InterfaceC0988d
    public final void i(int i, double d5) {
        this.f9606r[i] = 3;
        this.f9603o[i] = d5;
    }

    @Override // x1.InterfaceC0988d
    public final void m(long j5, int i) {
        this.f9606r[i] = 2;
        this.f9602n[i] = j5;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}

package Z0;

import d0.C0363p;
import java.util.LinkedHashMap;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public class g implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2842a = 2;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f2843b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f2844c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f2845d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f2846e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Object f2847f;

    public g(int i) {
        if (i <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        }
        this.f2844c = i;
        this.f2847f = new LinkedHashMap(0, 0.75f, true);
    }

    @Override // Z0.c
    public int a() {
        return -1;
    }

    @Override // Z0.c
    public int b() {
        return this.f2843b;
    }

    @Override // Z0.c
    public int c() {
        C0363p c0363p = (C0363p) this.f2847f;
        int i = this.f2844c;
        if (i == 8) {
            return c0363p.v();
        }
        if (i == 16) {
            return c0363p.B();
        }
        int i5 = this.f2845d;
        this.f2845d = i5 + 1;
        if (i5 % 2 != 0) {
            return this.f2846e & 15;
        }
        int iV = c0363p.v();
        this.f2846e = iV;
        return (iV & 240) >> 4;
    }

    public Object d(Object obj) {
        if (obj == null) {
            throw new NullPointerException("key == null");
        }
        synchronized (this) {
            try {
                Object obj2 = ((LinkedHashMap) this.f2847f).get(obj);
                if (obj2 != null) {
                    this.f2845d++;
                    return obj2;
                }
                this.f2846e++;
                return null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x008d, code lost:
    
        throw new java.lang.IllegalStateException(getClass().getName() + ".sizeOf() is reporting inconsistent results!");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object e(java.lang.Object r3, java.lang.Object r4) {
        /*
            r2 = this;
            if (r3 == 0) goto L92
            monitor-enter(r2)
            int r0 = r2.f2843b     // Catch: java.lang.Throwable -> L1a
            int r0 = r0 + 1
            r2.f2843b = r0     // Catch: java.lang.Throwable -> L1a
            java.lang.Object r0 = r2.f2847f     // Catch: java.lang.Throwable -> L1a
            java.util.LinkedHashMap r0 = (java.util.LinkedHashMap) r0     // Catch: java.lang.Throwable -> L1a
            java.lang.Object r3 = r0.put(r3, r4)     // Catch: java.lang.Throwable -> L1a
            if (r3 == 0) goto L1d
            int r4 = r2.f2843b     // Catch: java.lang.Throwable -> L1a
            int r4 = r4 + (-1)
            r2.f2843b = r4     // Catch: java.lang.Throwable -> L1a
            goto L1d
        L1a:
            r3 = move-exception
            goto L90
        L1d:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L1a
            int r4 = r2.f2844c
        L20:
            monitor-enter(r2)
            int r0 = r2.f2843b     // Catch: java.lang.Throwable -> L34
            if (r0 < 0) goto L6f
            java.lang.Object r0 = r2.f2847f     // Catch: java.lang.Throwable -> L34
            java.util.LinkedHashMap r0 = (java.util.LinkedHashMap) r0     // Catch: java.lang.Throwable -> L34
            boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> L34
            if (r0 == 0) goto L36
            int r0 = r2.f2843b     // Catch: java.lang.Throwable -> L34
            if (r0 != 0) goto L6f
            goto L36
        L34:
            r3 = move-exception
            goto L8e
        L36:
            int r0 = r2.f2843b     // Catch: java.lang.Throwable -> L34
            if (r0 <= r4) goto L6d
            java.lang.Object r0 = r2.f2847f     // Catch: java.lang.Throwable -> L34
            java.util.LinkedHashMap r0 = (java.util.LinkedHashMap) r0     // Catch: java.lang.Throwable -> L34
            boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> L34
            if (r0 == 0) goto L45
            goto L6d
        L45:
            java.lang.Object r0 = r2.f2847f     // Catch: java.lang.Throwable -> L34
            java.util.LinkedHashMap r0 = (java.util.LinkedHashMap) r0     // Catch: java.lang.Throwable -> L34
            java.util.Set r0 = r0.entrySet()     // Catch: java.lang.Throwable -> L34
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L34
            java.lang.Object r0 = r0.next()     // Catch: java.lang.Throwable -> L34
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0     // Catch: java.lang.Throwable -> L34
            java.lang.Object r1 = r0.getKey()     // Catch: java.lang.Throwable -> L34
            r0.getValue()     // Catch: java.lang.Throwable -> L34
            java.lang.Object r0 = r2.f2847f     // Catch: java.lang.Throwable -> L34
            java.util.LinkedHashMap r0 = (java.util.LinkedHashMap) r0     // Catch: java.lang.Throwable -> L34
            r0.remove(r1)     // Catch: java.lang.Throwable -> L34
            int r0 = r2.f2843b     // Catch: java.lang.Throwable -> L34
            int r0 = r0 + (-1)
            r2.f2843b = r0     // Catch: java.lang.Throwable -> L34
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L34
            goto L20
        L6d:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L34
            return r3
        L6f:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L34
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L34
            r4.<init>()     // Catch: java.lang.Throwable -> L34
            java.lang.Class r0 = r2.getClass()     // Catch: java.lang.Throwable -> L34
            java.lang.String r0 = r0.getName()     // Catch: java.lang.Throwable -> L34
            r4.append(r0)     // Catch: java.lang.Throwable -> L34
            java.lang.String r0 = ".sizeOf() is reporting inconsistent results!"
            r4.append(r0)     // Catch: java.lang.Throwable -> L34
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Throwable -> L34
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L34
            throw r3     // Catch: java.lang.Throwable -> L34
        L8e:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L34
            throw r3
        L90:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L1a
            throw r3
        L92:
            java.lang.NullPointerException r3 = new java.lang.NullPointerException
            java.lang.String r4 = "key == null || value == null"
            r3.<init>(r4)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: Z0.g.e(java.lang.Object, java.lang.Object):java.lang.Object");
    }

    public synchronized String toString() {
        String str;
        switch (this.f2842a) {
            case 2:
                synchronized (this) {
                    try {
                        int i = this.f2845d;
                        int i5 = this.f2846e;
                        int i6 = i + i5;
                        int i7 = i6 != 0 ? (i * 100) / i6 : 0;
                        Locale locale = Locale.US;
                        str = "LruCache[maxSize=" + this.f2844c + ",hits=" + i + ",misses=" + i5 + ",hitRate=" + i7 + "%]";
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return str;
            default:
                return super.toString();
        }
    }

    public g(int i, int i5, int i6, int i7, int i8, byte[] bArr) {
        this.f2843b = i5;
        this.f2844c = i6;
        this.f2845d = i7;
        this.f2846e = i8;
        this.f2847f = bArr;
    }

    public g(e0.c cVar) {
        C0363p c0363p = cVar.f5492n;
        this.f2847f = c0363p;
        c0363p.H(12);
        this.f2844c = c0363p.z() & 255;
        this.f2843b = c0363p.z();
    }
}

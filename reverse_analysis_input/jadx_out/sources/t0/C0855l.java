package t0;

import android.net.Uri;
import android.util.SparseArray;
import d0.AbstractC0360m;
import d0.AbstractC0370w;
import d0.C0362o;
import java.io.Closeable;
import java.net.Socket;
import java.util.ArrayDeque;
import java.util.Locale;
import javax.net.SocketFactory;
import m2.g0;
import m3.C0675i;

/* JADX INFO: renamed from: t0.l, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0855l implements Closeable {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public boolean f9911A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public boolean f9912B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public boolean f9913C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public long f9914D;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final C0675i f9915l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final C0675i f9916m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final String f9917n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final SocketFactory f9918o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final ArrayDeque f9919p = new ArrayDeque();

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final SparseArray f9920q = new SparseArray();

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final D0.d f9921r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public Uri f9922s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public x f9923t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public Z1.l f9924u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public String f9925v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public long f9926w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public RunnableC0854k f9927x;
    public C0362o y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public int f9928z;

    public C0855l(C0675i c0675i, C0675i c0675i2, String str, Uri uri, SocketFactory socketFactory) {
        this.f9915l = c0675i;
        this.f9916m = c0675i2;
        this.f9917n = str;
        this.f9918o = socketFactory;
        D0.d dVar = new D0.d();
        dVar.f396n = this;
        this.f9921r = dVar;
        this.f9922s = y.f(uri);
        this.f9923t = new x(new Z1.l(this));
        this.f9926w = 60000L;
        this.f9924u = y.d(uri);
        this.f9914D = -9223372036854775807L;
        this.f9928z = -1;
    }

    public static void c(C0855l c0855l, K3.b bVar) {
        c0855l.getClass();
        if (c0855l.f9911A) {
            c0855l.f9916m.p(bVar);
            return;
        }
        String message = bVar.getMessage();
        if (message == null) {
            message = "";
        }
        c0855l.f9915l.s(message, bVar);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        RunnableC0854k runnableC0854k = this.f9927x;
        if (runnableC0854k != null) {
            runnableC0854k.close();
            this.f9927x = null;
            Uri uri = this.f9922s;
            String str = this.f9925v;
            str.getClass();
            D0.d dVar = this.f9921r;
            C0855l c0855l = (C0855l) dVar.f396n;
            int i = c0855l.f9928z;
            if (i != -1 && i != 0) {
                c0855l.f9928z = 0;
                dVar.r(dVar.i(12, str, g0.f8607r, uri));
            }
        }
        this.f9923t.close();
    }

    public final void k() {
        long jZ;
        C0858o c0858o = (C0858o) this.f9919p.pollFirst();
        if (c0858o == null) {
            q qVar = (q) this.f9916m.f8712m;
            long j5 = qVar.y;
            if (j5 != -9223372036854775807L) {
                jZ = AbstractC0370w.Z(j5);
            } else {
                long j6 = qVar.f9962z;
                jZ = j6 != -9223372036854775807L ? AbstractC0370w.Z(j6) : 0L;
            }
            qVar.f9952o.o(jZ);
            return;
        }
        Uri uriA = c0858o.a();
        AbstractC0360m.i(c0858o.f9934c);
        String str = c0858o.f9934c;
        String str2 = this.f9925v;
        D0.d dVar = this.f9921r;
        ((C0855l) dVar.f396n).f9928z = 0;
        m2.r.d("Transport", str);
        dVar.r(dVar.i(10, str2, g0.b(1, new Object[]{"Transport", str}, null), uriA));
    }

    public final Socket l(Uri uri) {
        AbstractC0360m.c(uri.getHost() != null);
        int port = uri.getPort() > 0 ? uri.getPort() : 554;
        String host = uri.getHost();
        host.getClass();
        return this.f9918o.createSocket(host, port);
    }

    public final void n(long j5) {
        if (this.f9928z == 2 && !this.f9913C) {
            Uri uri = this.f9922s;
            String str = this.f9925v;
            str.getClass();
            D0.d dVar = this.f9921r;
            C0855l c0855l = (C0855l) dVar.f396n;
            AbstractC0360m.h(c0855l.f9928z == 2);
            dVar.r(dVar.i(5, str, g0.f8607r, uri));
            c0855l.f9913C = true;
        }
        this.f9914D = j5;
    }

    public final void o(long j5) {
        Uri uri = this.f9922s;
        String str = this.f9925v;
        str.getClass();
        D0.d dVar = this.f9921r;
        int i = ((C0855l) dVar.f396n).f9928z;
        AbstractC0360m.h(i == 1 || i == 2);
        C0837A c0837a = C0837A.f9802c;
        Object[] objArr = {Double.valueOf(j5 / 1000.0d)};
        int i5 = AbstractC0370w.f5326a;
        dVar.r(dVar.i(6, str, g0.b(1, new Object[]{"Range", String.format(Locale.US, "npt=%.3f-", objArr)}, null), uri));
    }
}

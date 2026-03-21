package t0;

import d0.AbstractC0360m;
import java.io.Closeable;
import java.net.Socket;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import m2.b0;
import m3.C0675i;

/* JADX INFO: loaded from: classes.dex */
public final class x implements Closeable {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final Charset f9982r = StandardCharsets.UTF_8;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Z1.l f9983l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final B0.r f9984m = new B0.r("ExoPlayer:RtspMessageChannel:ReceiverLoader");

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Map f9985n = Collections.synchronizedMap(new HashMap());

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public w f9986o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public Socket f9987p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public volatile boolean f9988q;

    public x(Z1.l lVar) {
        this.f9983l = lVar;
    }

    public final void a(Socket socket) {
        this.f9987p = socket;
        this.f9986o = new w(this, socket.getOutputStream());
        this.f9984m.f(new v(this, socket.getInputStream()), new C0675i(this, 24), 0);
    }

    public final void b(b0 b0Var) {
        AbstractC0360m.i(this.f9986o);
        w wVar = this.f9986o;
        wVar.getClass();
        wVar.f9980n.post(new D0.y(wVar, new F0.p(y.f9996h, 2).d(b0Var).getBytes(f9982r), b0Var, 22));
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f9988q) {
            return;
        }
        try {
            w wVar = this.f9986o;
            if (wVar != null) {
                wVar.close();
            }
            this.f9984m.e(null);
            Socket socket = this.f9987p;
            if (socket != null) {
                socket.close();
            }
            this.f9988q = true;
        } catch (Throwable th) {
            this.f9988q = true;
            throw th;
        }
    }
}

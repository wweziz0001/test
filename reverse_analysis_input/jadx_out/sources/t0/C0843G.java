package t0;

import android.net.Uri;
import b3.AbstractC0307a;
import d0.AbstractC0360m;
import d0.AbstractC0370w;
import f0.C0404B;
import f0.C0405C;
import f0.C0417l;
import f0.InterfaceC0403A;
import java.net.DatagramSocket;
import java.util.Locale;

/* JADX INFO: renamed from: t0.G, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0843G implements InterfaceC0847d {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final C0405C f9839l = new C0405C(Q1.C.g(8000));

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public C0843G f9840m;

    @Override // f0.InterfaceC0413h
    public final void b(InterfaceC0403A interfaceC0403A) {
        this.f9839l.b(interfaceC0403A);
    }

    @Override // f0.InterfaceC0413h
    public final void close() {
        this.f9839l.close();
        C0843G c0843g = this.f9840m;
        if (c0843g != null) {
            c0843g.close();
        }
    }

    @Override // t0.InterfaceC0847d
    public final String g() {
        int iO = o();
        AbstractC0360m.h(iO != -1);
        int i = AbstractC0370w.f5326a;
        Locale locale = Locale.US;
        return AbstractC0307a.g(iO, 1 + iO, "RTP/AVP;unicast;client_port=", "-");
    }

    @Override // t0.InterfaceC0847d
    public final boolean h() {
        return true;
    }

    @Override // t0.InterfaceC0847d
    public final int o() {
        DatagramSocket datagramSocket = this.f9839l.f5648t;
        int localPort = datagramSocket == null ? -1 : datagramSocket.getLocalPort();
        if (localPort == -1) {
            return -1;
        }
        return localPort;
    }

    @Override // f0.InterfaceC0413h
    public final long p(C0417l c0417l) {
        this.f9839l.p(c0417l);
        return -1L;
    }

    @Override // f0.InterfaceC0413h
    public final Uri r() {
        return this.f9839l.f5647s;
    }

    @Override // a0.InterfaceC0182h
    public final int read(byte[] bArr, int i, int i5) throws C0404B {
        try {
            return this.f9839l.read(bArr, i, i5);
        } catch (C0404B e5) {
            if (e5.f5673l == 2002) {
                return -1;
            }
            throw e5;
        }
    }

    @Override // t0.InterfaceC0847d
    public final C0842F x() {
        return null;
    }
}

package f0;

import android.net.Uri;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.MulticastSocket;
import java.net.SocketTimeoutException;

/* JADX INFO: renamed from: f0.C, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0405C extends AbstractC0408c {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final int f5644p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final byte[] f5645q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final DatagramPacket f5646r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public Uri f5647s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public DatagramSocket f5648t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public MulticastSocket f5649u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public InetAddress f5650v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f5651w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f5652x;

    public C0405C(int i) {
        super(true);
        this.f5644p = i;
        byte[] bArr = new byte[2000];
        this.f5645q = bArr;
        this.f5646r = new DatagramPacket(bArr, 0, 2000);
    }

    @Override // f0.InterfaceC0413h
    public final void close() {
        this.f5647s = null;
        MulticastSocket multicastSocket = this.f5649u;
        if (multicastSocket != null) {
            try {
                InetAddress inetAddress = this.f5650v;
                inetAddress.getClass();
                multicastSocket.leaveGroup(inetAddress);
            } catch (IOException unused) {
            }
            this.f5649u = null;
        }
        DatagramSocket datagramSocket = this.f5648t;
        if (datagramSocket != null) {
            datagramSocket.close();
            this.f5648t = null;
        }
        this.f5650v = null;
        this.f5652x = 0;
        if (this.f5651w) {
            this.f5651w = false;
            c();
        }
    }

    @Override // f0.InterfaceC0413h
    public final long p(C0417l c0417l) {
        Uri uri = c0417l.f5686a;
        this.f5647s = uri;
        String host = uri.getHost();
        host.getClass();
        int port = this.f5647s.getPort();
        d();
        try {
            this.f5650v = InetAddress.getByName(host);
            InetSocketAddress inetSocketAddress = new InetSocketAddress(this.f5650v, port);
            if (this.f5650v.isMulticastAddress()) {
                MulticastSocket multicastSocket = new MulticastSocket(inetSocketAddress);
                this.f5649u = multicastSocket;
                multicastSocket.joinGroup(this.f5650v);
                this.f5648t = this.f5649u;
            } else {
                this.f5648t = new DatagramSocket(inetSocketAddress);
            }
            this.f5648t.setSoTimeout(this.f5644p);
            this.f5651w = true;
            i(c0417l);
            return -1L;
        } catch (IOException e5) {
            throw new C0404B(e5, 2001);
        } catch (SecurityException e6) {
            throw new C0404B(e6, 2006);
        }
    }

    @Override // f0.InterfaceC0413h
    public final Uri r() {
        return this.f5647s;
    }

    @Override // a0.InterfaceC0182h
    public final int read(byte[] bArr, int i, int i5) throws C0404B {
        if (i5 == 0) {
            return 0;
        }
        int i6 = this.f5652x;
        DatagramPacket datagramPacket = this.f5646r;
        if (i6 == 0) {
            try {
                DatagramSocket datagramSocket = this.f5648t;
                datagramSocket.getClass();
                datagramSocket.receive(datagramPacket);
                int length = datagramPacket.getLength();
                this.f5652x = length;
                a(length);
            } catch (SocketTimeoutException e5) {
                throw new C0404B(e5, 2002);
            } catch (IOException e6) {
                throw new C0404B(e6, 2001);
            }
        }
        int length2 = datagramPacket.getLength();
        int i7 = this.f5652x;
        int iMin = Math.min(i7, i5);
        System.arraycopy(this.f5645q, length2 - i7, bArr, i, iMin);
        this.f5652x -= iMin;
        return iMin;
    }
}

package C0;

import android.os.SystemClock;
import b3.AbstractC0307a;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketTimeoutException;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Object f280a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Object f281b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static boolean f282c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static long f283d;

    public static long a() throws Throwable {
        DatagramSocket datagramSocket;
        SocketTimeoutException socketTimeoutException;
        byte[] bArr;
        DatagramSocket datagramSocket2 = new DatagramSocket();
        try {
            Object obj = f281b;
            synchronized (obj) {
                try {
                    try {
                    } catch (Throwable th) {
                        th = th;
                        while (true) {
                            try {
                                throw th;
                            } catch (Throwable th2) {
                                th = th2;
                            }
                        }
                    }
                } catch (Throwable th3) {
                    th = th3;
                    Throwable th4 = th;
                    try {
                        datagramSocket.close();
                        throw th4;
                    } catch (Throwable th5) {
                        th4.addSuppressed(th5);
                        throw th4;
                    }
                }
            }
            datagramSocket2.setSoTimeout(1000);
            synchronized (obj) {
                try {
                } catch (Throwable th6) {
                    th = th6;
                    while (true) {
                        try {
                            throw th;
                        } catch (Throwable th7) {
                            th = th7;
                        }
                    }
                }
            }
            InetAddress[] allByName = InetAddress.getAllByName("time.android.com");
            int length = allByName.length;
            byte b4 = 0;
            SocketTimeoutException socketTimeoutException2 = null;
            int i = 0;
            int i5 = 0;
            while (true) {
                if (i >= length) {
                    break;
                }
                byte[] bArr2 = new byte[48];
                DatagramPacket datagramPacket = new DatagramPacket(bArr2, 48, allByName[i], 123);
                bArr2[b4] = 27;
                long jCurrentTimeMillis = System.currentTimeMillis();
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                if (jCurrentTimeMillis == 0) {
                    Arrays.fill(bArr2, 40, 48, b4);
                    socketTimeoutException = socketTimeoutException2;
                    bArr = bArr2;
                    datagramSocket = datagramSocket2;
                } else {
                    long j5 = jCurrentTimeMillis / 1000;
                    long j6 = jCurrentTimeMillis - (j5 * 1000);
                    socketTimeoutException = socketTimeoutException2;
                    long j7 = j5 + 2208988800L;
                    bArr = bArr2;
                    bArr[40] = (byte) (j7 >> 24);
                    bArr[41] = (byte) (j7 >> 16);
                    datagramSocket = datagramSocket2;
                    bArr[42] = (byte) (j7 >> 8);
                    bArr[43] = (byte) j7;
                    long j8 = (j6 * 4294967296L) / 1000;
                    bArr[44] = (byte) (j8 >> 24);
                    bArr[45] = (byte) (j8 >> 16);
                    bArr[46] = (byte) (j8 >> 8);
                    bArr[47] = (byte) (Math.random() * 255.0d);
                }
                datagramSocket.send(datagramPacket);
                byte[] bArr3 = bArr;
                try {
                    datagramSocket.receive(new DatagramPacket(bArr3, 48));
                    long jElapsedRealtime2 = SystemClock.elapsedRealtime();
                    long j9 = (jElapsedRealtime2 - jElapsedRealtime) + jCurrentTimeMillis;
                    byte b5 = bArr3[0];
                    int i6 = bArr3[1] & 255;
                    long jD = d(24, bArr3);
                    long jD2 = d(32, bArr3);
                    long jD3 = d(40, bArr3);
                    b((byte) ((b5 >> 6) & 3), (byte) (b5 & 7), i6, jD3);
                    long j10 = (j9 + (((jD3 - j9) + (jD2 - jD)) / 2)) - jElapsedRealtime2;
                    datagramSocket.close();
                    return j10;
                } catch (SocketTimeoutException e5) {
                    SocketTimeoutException socketTimeoutException3 = e5;
                    if (socketTimeoutException != null) {
                        SocketTimeoutException socketTimeoutException4 = socketTimeoutException;
                        socketTimeoutException4.addSuppressed(socketTimeoutException3);
                        socketTimeoutException3 = socketTimeoutException4;
                    }
                    int i7 = i5 + 1;
                    if (i5 >= 10) {
                        socketTimeoutException2 = socketTimeoutException3;
                        socketTimeoutException2.getClass();
                        throw socketTimeoutException2;
                    }
                    i++;
                    i5 = i7;
                    b4 = 0;
                    socketTimeoutException2 = socketTimeoutException3;
                    datagramSocket2 = datagramSocket;
                }
            }
        } catch (Throwable th8) {
            th = th8;
            datagramSocket = datagramSocket2;
        }
    }

    public static void b(byte b4, byte b5, int i, long j5) throws IOException {
        if (b4 == 3) {
            throw new IOException("SNTP: Unsynchronized server");
        }
        if (b5 != 4 && b5 != 5) {
            throw new IOException(AbstractC0307a.i("SNTP: Untrusted mode: ", b5));
        }
        if (i == 0 || i > 15) {
            throw new IOException(AbstractC0307a.i("SNTP: Untrusted stratum: ", i));
        }
        if (j5 == 0) {
            throw new IOException("SNTP: Zero transmitTime");
        }
    }

    public static long c(int i, byte[] bArr) {
        int i5 = bArr[i];
        int i6 = bArr[i + 1];
        int i7 = bArr[i + 2];
        int i8 = bArr[i + 3];
        if ((i5 & 128) == 128) {
            i5 = (i5 & 127) + 128;
        }
        if ((i6 & 128) == 128) {
            i6 = (i6 & 127) + 128;
        }
        if ((i7 & 128) == 128) {
            i7 = (i7 & 127) + 128;
        }
        if ((i8 & 128) == 128) {
            i8 = (i8 & 127) + 128;
        }
        return (((long) i5) << 24) + (((long) i6) << 16) + (((long) i7) << 8) + ((long) i8);
    }

    public static long d(int i, byte[] bArr) {
        long jC = c(i, bArr);
        long jC2 = c(i + 4, bArr);
        if (jC == 0 && jC2 == 0) {
            return 0L;
        }
        return ((jC2 * 1000) / 4294967296L) + ((jC - 2208988800L) * 1000);
    }
}

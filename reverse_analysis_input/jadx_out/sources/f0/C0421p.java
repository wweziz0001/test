package f0;

import android.net.Uri;
import b3.AbstractC0307a;
import d0.AbstractC0360m;
import d0.AbstractC0370w;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.NoRouteToHostException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Pattern;
import m2.g0;

/* JADX INFO: renamed from: f0.p, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0421p extends AbstractC0408c {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public long f5707A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public long f5708B;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final boolean f5709p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final int f5710q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final int f5711r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final String f5712s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final Z1.l f5713t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final Z1.l f5714u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public C0417l f5715v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public HttpURLConnection f5716w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public InputStream f5717x;
    public boolean y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public int f5718z;

    public C0421p(String str, int i, int i5, boolean z4, Z1.l lVar) {
        super(true);
        this.f5712s = str;
        this.f5710q = i;
        this.f5711r = i5;
        this.f5709p = z4;
        this.f5713t = lVar;
        this.f5714u = new Z1.l(9);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // f0.InterfaceC0413h
    public final void close() {
        try {
            InputStream inputStream = this.f5717x;
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e5) {
                    int i = AbstractC0370w.f5326a;
                    throw new C0425t(e5, 2000, 3);
                }
            }
        } finally {
            this.f5717x = null;
            j();
            if (this.y) {
                this.y = false;
                c();
            }
            this.f5716w = null;
            this.f5715v = null;
        }
    }

    public final void j() {
        HttpURLConnection httpURLConnection = this.f5716w;
        if (httpURLConnection != null) {
            try {
                httpURLConnection.disconnect();
            } catch (Exception e5) {
                AbstractC0360m.m("DefaultHttpDataSource", "Unexpected error while disconnecting", e5);
            }
        }
    }

    public final URL k(URL url, String str) throws C0425t {
        if (str == null) {
            throw new C0425t("Null location redirect", 2001);
        }
        try {
            URL url2 = new URL(url, str);
            String protocol = url2.getProtocol();
            if (!"https".equals(protocol) && !"http".equals(protocol)) {
                throw new C0425t(AbstractC0307a.j("Unsupported protocol redirect: ", protocol), 2001);
            }
            if (this.f5709p || protocol.equals(url.getProtocol())) {
                return url2;
            }
            throw new C0425t("Disallowed cross-protocol redirect (" + url.getProtocol() + " to " + protocol + ")", 2001);
        } catch (MalformedURLException e5) {
            throw new C0425t(e5, 2001, 1);
        }
    }

    public final HttpURLConnection m(C0417l c0417l) throws IOException {
        HttpURLConnection httpURLConnectionN;
        C0417l c0417l2 = c0417l;
        URL url = new URL(c0417l2.f5686a.toString());
        int i = 0;
        boolean z4 = (c0417l2.f5693h & 1) == 1;
        boolean z5 = this.f5709p;
        int i5 = c0417l2.f5687b;
        byte[] bArr = c0417l2.f5688c;
        long j5 = c0417l2.f5690e;
        long j6 = c0417l2.f5691f;
        if (!z5) {
            return n(url, i5, bArr, j5, j6, z4, true, c0417l2.f5689d);
        }
        URL urlK = url;
        int i6 = i5;
        byte[] bArr2 = bArr;
        while (true) {
            int i7 = i + 1;
            if (i > 20) {
                throw new C0425t(new NoRouteToHostException(AbstractC0307a.i("Too many redirects: ", i7)), 2001, 1);
            }
            Map map = c0417l2.f5689d;
            long j7 = j6;
            int i8 = i6;
            long j8 = j5;
            httpURLConnectionN = n(urlK, i6, bArr2, j5, j6, z4, false, map);
            int responseCode = httpURLConnectionN.getResponseCode();
            String headerField = httpURLConnectionN.getHeaderField("Location");
            if ((i8 == 1 || i8 == 3) && (responseCode == 300 || responseCode == 301 || responseCode == 302 || responseCode == 303 || responseCode == 307 || responseCode == 308)) {
                httpURLConnectionN.disconnect();
                urlK = k(urlK, headerField);
                i6 = i8;
            } else {
                if (i8 != 2 || (responseCode != 300 && responseCode != 301 && responseCode != 302 && responseCode != 303)) {
                    break;
                }
                httpURLConnectionN.disconnect();
                urlK = k(urlK, headerField);
                bArr2 = null;
                i6 = 1;
            }
            c0417l2 = c0417l;
            i = i7;
            j6 = j7;
            j5 = j8;
        }
        return httpURLConnectionN;
    }

    public final HttpURLConnection n(URL url, int i, byte[] bArr, long j5, long j6, boolean z4, boolean z5, Map map) throws IOException {
        String string;
        String str;
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
        httpURLConnection.setConnectTimeout(this.f5710q);
        httpURLConnection.setReadTimeout(this.f5711r);
        HashMap map2 = new HashMap();
        Z1.l lVar = this.f5713t;
        if (lVar != null) {
            map2.putAll(lVar.U());
        }
        map2.putAll(this.f5714u.U());
        map2.putAll(map);
        for (Map.Entry entry : map2.entrySet()) {
            httpURLConnection.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
        }
        Pattern pattern = AbstractC0428w.f5725a;
        if (j5 == 0 && j6 == -1) {
            string = null;
        } else {
            StringBuilder sb = new StringBuilder("bytes=");
            sb.append(j5);
            sb.append("-");
            if (j6 != -1) {
                sb.append((j5 + j6) - 1);
            }
            string = sb.toString();
        }
        if (string != null) {
            httpURLConnection.setRequestProperty("Range", string);
        }
        String str2 = this.f5712s;
        if (str2 != null) {
            httpURLConnection.setRequestProperty("User-Agent", str2);
        }
        httpURLConnection.setRequestProperty("Accept-Encoding", z4 ? "gzip" : "identity");
        httpURLConnection.setInstanceFollowRedirects(z5);
        httpURLConnection.setDoOutput(bArr != null);
        int i5 = C0417l.i;
        if (i == 1) {
            str = "GET";
        } else if (i == 2) {
            str = "POST";
        } else {
            if (i != 3) {
                throw new IllegalStateException();
            }
            str = "HEAD";
        }
        httpURLConnection.setRequestMethod(str);
        if (bArr != null) {
            httpURLConnection.setFixedLengthStreamingMode(bArr.length);
            httpURLConnection.connect();
            OutputStream outputStream = httpURLConnection.getOutputStream();
            outputStream.write(bArr);
            outputStream.close();
        } else {
            httpURLConnection.connect();
        }
        return httpURLConnection;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01a2  */
    @Override // f0.InterfaceC0413h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long p(f0.C0417l r24) throws f0.C0425t {
        /*
            Method dump skipped, instruction units count: 482
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: f0.C0421p.p(f0.l):long");
    }

    @Override // f0.InterfaceC0413h
    public final Uri r() {
        HttpURLConnection httpURLConnection = this.f5716w;
        if (httpURLConnection != null) {
            return Uri.parse(httpURLConnection.getURL().toString());
        }
        C0417l c0417l = this.f5715v;
        if (c0417l != null) {
            return c0417l.f5686a;
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0029 A[Catch: IOException -> 0x0033, TRY_LEAVE, TryCatch #0 {IOException -> 0x0033, blocks: (B:4:0x0004, B:6:0x000d, B:9:0x0018, B:10:0x001e, B:13:0x0029), top: B:18:0x0004 }] */
    @Override // a0.InterfaceC0182h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int read(byte[] r7, int r8, int r9) throws f0.C0425t {
        /*
            r6 = this;
            if (r9 != 0) goto L4
            r7 = 0
            goto L32
        L4:
            long r0 = r6.f5707A     // Catch: java.io.IOException -> L33
            r2 = -1
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            r3 = -1
            if (r2 == 0) goto L1e
            long r4 = r6.f5708B     // Catch: java.io.IOException -> L33
            long r0 = r0 - r4
            r4 = 0
            int r2 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r2 != 0) goto L18
        L16:
            r7 = r3
            goto L32
        L18:
            long r4 = (long) r9     // Catch: java.io.IOException -> L33
            long r0 = java.lang.Math.min(r4, r0)     // Catch: java.io.IOException -> L33
            int r9 = (int) r0     // Catch: java.io.IOException -> L33
        L1e:
            java.io.InputStream r0 = r6.f5717x     // Catch: java.io.IOException -> L33
            int r1 = d0.AbstractC0370w.f5326a     // Catch: java.io.IOException -> L33
            int r7 = r0.read(r7, r8, r9)     // Catch: java.io.IOException -> L33
            if (r7 != r3) goto L29
            goto L16
        L29:
            long r8 = r6.f5708B     // Catch: java.io.IOException -> L33
            long r0 = (long) r7     // Catch: java.io.IOException -> L33
            long r8 = r8 + r0
            r6.f5708B = r8     // Catch: java.io.IOException -> L33
            r6.a(r7)     // Catch: java.io.IOException -> L33
        L32:
            return r7
        L33:
            r7 = move-exception
            int r8 = d0.AbstractC0370w.f5326a
            r8 = 2
            f0.t r7 = f0.C0425t.b(r7, r8)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: f0.C0421p.read(byte[], int, int):int");
    }

    public final void s(long j5) throws IOException {
        if (j5 == 0) {
            return;
        }
        byte[] bArr = new byte[4096];
        while (j5 > 0) {
            int iMin = (int) Math.min(j5, 4096);
            InputStream inputStream = this.f5717x;
            int i = AbstractC0370w.f5326a;
            int i5 = inputStream.read(bArr, 0, iMin);
            if (Thread.currentThread().isInterrupted()) {
                throw new C0425t(new InterruptedIOException(), 2000, 1);
            }
            if (i5 == -1) {
                throw new C0425t();
            }
            j5 -= (long) i5;
            a(i5);
        }
    }

    @Override // f0.InterfaceC0413h
    public final Map y() {
        HttpURLConnection httpURLConnection = this.f5716w;
        return httpURLConnection == null ? g0.f8607r : new C0420o(httpURLConnection.getHeaderFields());
    }
}

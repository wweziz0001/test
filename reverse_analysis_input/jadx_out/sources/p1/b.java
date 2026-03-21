package p1;

import android.media.MediaCodec;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.os.Trace;
import android.util.Base64;
import android.util.Log;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import q.C0735e;
import q.C0738h;
import q0.o;
import q0.w;
import t0.C0842F;
import t0.C0843G;
import t0.InterfaceC0847d;
import t3.M;
import x1.C0985a;
import x1.InterfaceC0986b;
import x1.InterfaceC0987c;
import y0.m;
import y2.n;

/* JADX INFO: loaded from: classes.dex */
public final class b implements c, w, q0.k, m, InterfaceC0986b {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f9171l;

    public /* synthetic */ b(int i) {
        this.f9171l = i;
    }

    public static MediaCodec m(n nVar) throws IOException {
        o oVar = (o) nVar.f10954a;
        StringBuilder sb = new StringBuilder("createCodec:");
        String str = oVar.f9288a;
        sb.append(str);
        Trace.beginSection(sb.toString());
        MediaCodec mediaCodecCreateByCodecName = MediaCodec.createByCodecName(str);
        Trace.endSection();
        return mediaCodecCreateByCodecName;
    }

    @Override // y0.m
    public long a() {
        throw new NoSuchElementException();
    }

    @Override // q0.w
    public boolean b(String str, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return false;
    }

    @Override // q0.w
    public int c() {
        return MediaCodecList.getCodecCount();
    }

    @Override // x1.InterfaceC0986b
    public InterfaceC0987c d(C0985a c0985a) {
        return new y1.f(c0985a.f10819a, c0985a.f10820b, c0985a.f10821c, c0985a.f10822d, c0985a.f10823e);
    }

    @Override // q0.w
    public MediaCodecInfo e(int i) {
        return MediaCodecList.getCodecInfoAt(i);
    }

    @Override // p1.c
    public void f(int i, Serializable serializable) {
        String str;
        switch (i) {
            case 1:
                str = "RESULT_INSTALL_SUCCESS";
                break;
            case 2:
                str = "RESULT_ALREADY_INSTALLED";
                break;
            case 3:
                str = "RESULT_UNSUPPORTED_ART_VERSION";
                break;
            case 4:
                str = "RESULT_NOT_WRITABLE";
                break;
            case 5:
                str = "RESULT_DESIRED_FORMAT_UNSUPPORTED";
                break;
            case O.j.STRING_SET_FIELD_NUMBER /* 6 */:
                str = "RESULT_BASELINE_PROFILE_NOT_FOUND";
                break;
            case O.j.DOUBLE_FIELD_NUMBER /* 7 */:
                str = "RESULT_IO_EXCEPTION";
                break;
            case O.j.BYTES_FIELD_NUMBER /* 8 */:
                str = "RESULT_PARSE_EXCEPTION";
                break;
            case 9:
            default:
                str = "";
                break;
            case 10:
                str = "RESULT_INSTALL_SKIP_FILE_SUCCESS";
                break;
            case 11:
                str = "RESULT_DELETE_SKIP_FILE_SUCCESS";
                break;
        }
        if (i == 6 || i == 7 || i == 8) {
            Log.e("ProfileInstaller", str, (Throwable) serializable);
        } else {
            Log.d("ProfileInstaller", str);
        }
    }

    @Override // y0.m
    public long g() {
        throw new NoSuchElementException();
    }

    @Override // p1.c
    public void h() {
        Log.d("ProfileInstaller", "DIAGNOSTIC_PROFILE_IS_COMPRESSED");
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x004b  */
    @Override // q0.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public q0.l i(y2.n r6) throws java.lang.Throwable {
        /*
            r5 = this;
            r0 = 0
            android.media.MediaCodec r0 = m(r6)     // Catch: java.lang.RuntimeException -> L21 java.io.IOException -> L23
            java.lang.String r1 = "configureCodec"
            android.os.Trace.beginSection(r1)     // Catch: java.lang.RuntimeException -> L21 java.io.IOException -> L23
            java.lang.Object r1 = r6.f10957d     // Catch: java.lang.RuntimeException -> L21 java.io.IOException -> L23
            android.view.Surface r1 = (android.view.Surface) r1     // Catch: java.lang.RuntimeException -> L21 java.io.IOException -> L23
            if (r1 != 0) goto L25
            java.lang.Object r2 = r6.f10954a     // Catch: java.lang.RuntimeException -> L21 java.io.IOException -> L23
            q0.o r2 = (q0.o) r2     // Catch: java.lang.RuntimeException -> L21 java.io.IOException -> L23
            boolean r2 = r2.f9295h     // Catch: java.lang.RuntimeException -> L21 java.io.IOException -> L23
            if (r2 == 0) goto L25
            int r2 = d0.AbstractC0370w.f5326a     // Catch: java.lang.RuntimeException -> L21 java.io.IOException -> L23
            r3 = 35
            if (r2 < r3) goto L25
            r2 = 8
            goto L26
        L21:
            r6 = move-exception
            goto L49
        L23:
            r6 = move-exception
            goto L49
        L25:
            r2 = 0
        L26:
            java.lang.Object r3 = r6.f10955b     // Catch: java.lang.RuntimeException -> L21 java.io.IOException -> L23
            android.media.MediaFormat r3 = (android.media.MediaFormat) r3     // Catch: java.lang.RuntimeException -> L21 java.io.IOException -> L23
            java.lang.Object r4 = r6.f10958e     // Catch: java.lang.RuntimeException -> L21 java.io.IOException -> L23
            android.media.MediaCrypto r4 = (android.media.MediaCrypto) r4     // Catch: java.lang.RuntimeException -> L21 java.io.IOException -> L23
            r0.configure(r3, r1, r4, r2)     // Catch: java.lang.RuntimeException -> L21 java.io.IOException -> L23
            android.os.Trace.endSection()     // Catch: java.lang.RuntimeException -> L21 java.io.IOException -> L23
            java.lang.String r1 = "startCodec"
            android.os.Trace.beginSection(r1)     // Catch: java.lang.RuntimeException -> L21 java.io.IOException -> L23
            r0.start()     // Catch: java.lang.RuntimeException -> L21 java.io.IOException -> L23
            android.os.Trace.endSection()     // Catch: java.lang.RuntimeException -> L21 java.io.IOException -> L23
            Z1.l r1 = new Z1.l     // Catch: java.lang.RuntimeException -> L21 java.io.IOException -> L23
            java.lang.Object r6 = r6.f10959f     // Catch: java.lang.RuntimeException -> L21 java.io.IOException -> L23
            Z1.s r6 = (Z1.s) r6     // Catch: java.lang.RuntimeException -> L21 java.io.IOException -> L23
            r1.<init>(r0, r6)     // Catch: java.lang.RuntimeException -> L21 java.io.IOException -> L23
            return r1
        L49:
            if (r0 == 0) goto L4e
            r0.release()
        L4e:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p1.b.i(y2.n):q0.l");
    }

    @Override // q0.w
    public boolean j(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return "secure-playback".equals(str) && "video/avc".equals(str2);
    }

    public InterfaceC0847d k(int i) throws IOException {
        switch (this.f9171l) {
            case 11:
                C0842F c0842f = new C0842F();
                c0842f.p(D1.b.D(i * 2));
                return c0842f;
            default:
                C0843G c0843g = new C0843G();
                C0843G c0843g2 = new C0843G();
                try {
                    c0843g.f9839l.p(D1.b.D(0));
                    int iO = c0843g.o();
                    boolean z4 = iO % 2 == 0;
                    c0843g2.f9839l.p(D1.b.D(z4 ? iO + 1 : iO - 1));
                    if (z4) {
                        c0843g.f9840m = c0843g2;
                        return c0843g;
                    }
                    c0843g2.f9840m = c0843g;
                    return c0843g2;
                } catch (IOException e5) {
                    Z1.f.g(c0843g);
                    Z1.f.g(c0843g2);
                    throw e5;
                }
        }
    }

    @Override // q0.w
    public boolean l() {
        return false;
    }

    public List n(String str) throws ClassNotFoundException, IOException {
        switch (this.f9171l) {
            case 13:
                try {
                    return (List) new M(new ByteArrayInputStream(Base64.decode(str, 0))).readObject();
                } catch (IOException | ClassNotFoundException e5) {
                    throw new RuntimeException(e5);
                }
            default:
                N3.h.e(str, "listString");
                Object object = new M(new ByteArrayInputStream(Base64.decode(str, 0))).readObject();
                N3.h.c(object, "null cannot be cast to non-null type kotlin.collections.List<*>");
                ArrayList arrayList = new ArrayList();
                for (Object obj : (List) object) {
                    if (obj instanceof String) {
                        arrayList.add(obj);
                    }
                }
                return arrayList;
        }
    }

    @Override // y0.m
    public boolean next() {
        return false;
    }

    public String o(List list) throws IOException {
        switch (this.f9171l) {
            case 13:
                try {
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
                    objectOutputStream.writeObject(list);
                    objectOutputStream.flush();
                    return Base64.encodeToString(byteArrayOutputStream.toByteArray(), 0);
                } catch (IOException e5) {
                    throw new RuntimeException(e5);
                }
            default:
                N3.h.e(list, "list");
                ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
                ObjectOutputStream objectOutputStream2 = new ObjectOutputStream(byteArrayOutputStream2);
                objectOutputStream2.writeObject(list);
                objectOutputStream2.flush();
                String strEncodeToString = Base64.encodeToString(byteArrayOutputStream2.toByteArray(), 0);
                N3.h.d(strEncodeToString, "encodeToString(...)");
                return strEncodeToString;
        }
    }

    public /* synthetic */ b(Object obj, int i) {
        this.f9171l = i;
    }

    public b() {
        this.f9171l = 10;
        new C0735e();
        new C0738h();
    }
}

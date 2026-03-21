package d0;

import a0.C0157H;
import android.content.Context;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.util.Base64;
import b3.AbstractC0307a;
import java.lang.ref.WeakReference;
import java.nio.charset.Charset;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArrayList;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import m.B0;
import t0.x;
import t0.y;

/* JADX INFO: renamed from: d0.o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0362o implements C2.a {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static C0362o f5305p;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f5306l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public Object f5307m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public Object f5308n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Object f5309o;

    public C0362o(String str, SecretKeySpec secretKeySpec) throws GeneralSecurityException {
        E2.l lVar = new E2.l(this);
        this.f5307m = lVar;
        if (!B0.f(2)) {
            throw new GeneralSecurityException("Can not use HMAC in FIPS-mode, as BoringCrypto module is not available.");
        }
        this.f5308n = str;
        this.f5309o = secretKeySpec;
        if (secretKeySpec.getEncoded().length < 16) {
            throw new InvalidAlgorithmParameterException("key size too small, need at least 16 bytes");
        }
        switch (str) {
            case "HMACSHA1":
                this.f5306l = 20;
                break;
            case "HMACSHA224":
                this.f5306l = 28;
                break;
            case "HMACSHA256":
                this.f5306l = 32;
                break;
            case "HMACSHA384":
                this.f5306l = 48;
                break;
            case "HMACSHA512":
                this.f5306l = 64;
                break;
            default:
                throw new NoSuchAlgorithmException("unknown Hmac algorithm: ".concat(str));
        }
        lVar.get();
    }

    public static void a(int i, C0362o c0362o) {
        synchronized (c0362o.f5309o) {
            try {
                if (c0362o.f5306l == i) {
                    return;
                }
                c0362o.f5306l = i;
                for (WeakReference weakReference : (CopyOnWriteArrayList) c0362o.f5308n) {
                    B0.g gVar = (B0.g) weakReference.get();
                    if (gVar != null) {
                        gVar.a(i);
                    } else {
                        ((CopyOnWriteArrayList) c0362o.f5308n).remove(weakReference);
                    }
                }
            } finally {
            }
        }
    }

    public static synchronized C0362o c(Context context) {
        try {
            if (f5305p == null) {
                f5305p = new C0362o(context);
            }
        } catch (Throwable th) {
            throw th;
        }
        return f5305p;
    }

    public String b(Z1.l lVar, Uri uri, int i) throws C0157H {
        int i5 = this.f5306l;
        if (i5 == 1) {
            String strEncodeToString = Base64.encodeToString((((String) lVar.f3020l) + ":" + ((String) lVar.f3021m)).getBytes(x.f9982r), 0);
            int i6 = AbstractC0370w.f5326a;
            Locale locale = Locale.US;
            return AbstractC0307a.j("Basic ", strEncodeToString);
        }
        if (i5 != 2) {
            throw new C0157H(null, new UnsupportedOperationException(), false, 4);
        }
        String str = (String) this.f5308n;
        String str2 = (String) this.f5307m;
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            String strH = y.h(i);
            String str3 = ((String) lVar.f3020l) + ":" + str2 + ":" + ((String) lVar.f3021m);
            Charset charset = x.f9982r;
            String strY = AbstractC0370w.Y(messageDigest.digest((AbstractC0370w.Y(messageDigest.digest(str3.getBytes(charset))) + ":" + str + ":" + AbstractC0370w.Y(messageDigest.digest((strH + ":" + uri).getBytes(charset)))).getBytes(charset)));
            String str4 = (String) this.f5309o;
            if (str4.isEmpty()) {
                return String.format(Locale.US, "Digest username=\"%s\", realm=\"%s\", nonce=\"%s\", uri=\"%s\", response=\"%s\"", (String) lVar.f3020l, str2, str, uri, strY);
            }
            return String.format(Locale.US, "Digest username=\"%s\", realm=\"%s\", nonce=\"%s\", uri=\"%s\", response=\"%s\", opaque=\"%s\"", (String) lVar.f3020l, str2, str, uri, strY, str4);
        } catch (NoSuchAlgorithmException e5) {
            throw new C0157H(null, e5, false, 4);
        }
    }

    public int d() {
        int i;
        synchronized (this.f5309o) {
            i = this.f5306l;
        }
        return i;
    }

    public int e() {
        int i = this.f5306l;
        if (i != 2) {
            return i != 3 ? 0 : 512;
        }
        return 2048;
    }

    @Override // C2.a
    public byte[] f(int i, byte[] bArr) throws InvalidAlgorithmParameterException {
        if (i > this.f5306l) {
            throw new InvalidAlgorithmParameterException("tag size too big");
        }
        E2.l lVar = (E2.l) this.f5307m;
        ((Mac) lVar.get()).update(bArr);
        return Arrays.copyOf(((Mac) lVar.get()).doFinal(), i);
    }

    public void g() {
        HandlerThread handlerThread;
        synchronized (this.f5309o) {
            try {
                AbstractC0360m.h(this.f5306l > 0);
                int i = this.f5306l - 1;
                this.f5306l = i;
                if (i == 0 && (handlerThread = (HandlerThread) this.f5308n) != null) {
                    handlerThread.quit();
                    this.f5308n = null;
                    this.f5307m = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public C0362o() {
        this.f5309o = new Object();
        this.f5307m = null;
        this.f5308n = null;
        this.f5306l = 0;
    }

    public C0362o(int i, String str, String str2, String str3) {
        this.f5306l = i;
        this.f5307m = str;
        this.f5308n = str2;
        this.f5309o = str3;
    }

    public C0362o(Context context) {
        this.f5307m = new Handler(Looper.getMainLooper());
        this.f5308n = new CopyOnWriteArrayList();
        this.f5309o = new Object();
        this.f5306l = 0;
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
        context.registerReceiver(new X1.d(this, 1), intentFilter);
    }

    public C0362o(int i, String str, int i5, ArrayList arrayList, byte[] bArr) {
        List listUnmodifiableList;
        this.f5307m = str;
        this.f5306l = i5;
        if (arrayList == null) {
            listUnmodifiableList = Collections.emptyList();
        } else {
            listUnmodifiableList = Collections.unmodifiableList(arrayList);
        }
        this.f5308n = listUnmodifiableList;
        this.f5309o = bArr;
    }
}

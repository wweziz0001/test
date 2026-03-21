package m;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.util.Log;
import b3.AbstractC0307a;
import com.google.crypto.tink.shaded.protobuf.AbstractC0329i;
import com.google.crypto.tink.shaded.protobuf.C0328h;
import com.google.crypto.tink.shaded.protobuf.C0335o;
import java.io.ByteArrayInputStream;
import java.io.CharConversionException;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.security.KeyStoreException;
import java.security.ProviderException;
import x2.C0990a;

/* JADX INFO: loaded from: classes.dex */
public final class W0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Context f8350a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f8351b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f8352c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f8353d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Object f8354e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Object f8355f = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Object f8356g;

    public static byte[] c(Context context, String str, String str2) throws CharConversionException {
        if (str == null) {
            throw new IllegalArgumentException("keysetName cannot be null");
        }
        Context applicationContext = context.getApplicationContext();
        try {
            String string = (str2 == null ? PreferenceManager.getDefaultSharedPreferences(applicationContext) : applicationContext.getSharedPreferences(str2, 0)).getString(str, null);
            if (string == null) {
                return null;
            }
            return i4.a.q(string);
        } catch (ClassCastException | IllegalArgumentException unused) {
            throw new CharConversionException(AbstractC0307a.k("can't read keyset; the pref value ", str, " is not a valid hex string"));
        }
    }

    public static r2.f d(byte[] bArr) throws IOException {
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        try {
            D2.g0 g0VarF = D2.g0.F(byteArrayInputStream, C0335o.a());
            byteArrayInputStream.close();
            return new r2.f((D2.d0) ((D2.g0) Z1.m.s(g0VarF).f3024m).x(), 3);
        } catch (Throwable th) {
            byteArrayInputStream.close();
            throw th;
        }
    }

    public synchronized C0990a a() {
        C0990a c0990a;
        try {
            if (((String) this.f8351b) == null) {
                throw new IllegalArgumentException("keysetName cannot be null");
            }
            synchronized (C0990a.f10824b) {
                try {
                    byte[] bArrC = c(this.f8350a, (String) this.f8351b, (String) this.f8352c);
                    if (bArrC == null) {
                        if (((String) this.f8353d) != null) {
                            this.f8354e = f();
                        }
                        this.f8356g = b();
                    } else if (((String) this.f8353d) != null) {
                        this.f8356g = e(bArrC);
                    } else {
                        this.f8356g = d(bArrC);
                    }
                    c0990a = new C0990a(this);
                } finally {
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return c0990a;
    }

    public r2.f b() throws GeneralSecurityException, IOException {
        if (((r2.g) this.f8355f) == null) {
            throw new GeneralSecurityException("cannot read or generate keyset");
        }
        r2.f fVar = new r2.f(D2.g0.E(), 3);
        r2.g gVar = (r2.g) this.f8355f;
        synchronized (fVar) {
            fVar.a(gVar.f9532a);
        }
        int iC = r2.p.a((D2.g0) fVar.c().f3024m).A().C();
        synchronized (fVar) {
            for (int i = 0; i < ((D2.g0) ((D2.d0) fVar.f9531b).f5252m).B(); i++) {
                try {
                    D2.f0 f0VarA = ((D2.g0) ((D2.d0) fVar.f9531b).f5252m).A(i);
                    if (f0VarA.D() == iC) {
                        if (!f0VarA.F().equals(D2.Z.f571n)) {
                            throw new GeneralSecurityException("cannot set key as primary because it's not enabled: " + iC);
                        }
                        D2.d0 d0Var = (D2.d0) fVar.f9531b;
                        d0Var.e();
                        D2.g0.y((D2.g0) d0Var.f5252m, iC);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            throw new GeneralSecurityException("key not found: " + iC);
        }
        Context context = this.f8350a;
        String str = (String) this.f8351b;
        String str2 = (String) this.f8352c;
        if (str == null) {
            throw new IllegalArgumentException("keysetName cannot be null");
        }
        Context applicationContext = context.getApplicationContext();
        SharedPreferences.Editor editorEdit = str2 == null ? PreferenceManager.getDefaultSharedPreferences(applicationContext).edit() : applicationContext.getSharedPreferences(str2, 0).edit();
        if (((x2.b) this.f8354e) != null) {
            Z1.m mVarC = fVar.c();
            x2.b bVar = (x2.b) this.f8354e;
            byte[] bArr = new byte[0];
            D2.g0 g0Var = (D2.g0) mVarC.f3024m;
            byte[] bArrA = bVar.a(g0Var.e(), bArr);
            try {
                if (!D2.g0.G(bVar.b(bArrA, bArr), C0335o.a()).equals(g0Var)) {
                    throw new GeneralSecurityException("cannot encrypt keyset");
                }
                D2.M mB = D2.N.B();
                C0328h c0328hH = AbstractC0329i.h(bArrA, 0, bArrA.length);
                mB.e();
                D2.N.y((D2.N) mB.f5252m, c0328hH);
                D2.k0 k0VarA = r2.p.a(g0Var);
                mB.e();
                D2.N.z((D2.N) mB.f5252m, k0VarA);
                if (!editorEdit.putString(str, i4.a.s(((D2.N) mB.b()).e())).commit()) {
                    throw new IOException("Failed to write to SharedPreferences");
                }
            } catch (com.google.crypto.tink.shaded.protobuf.C unused) {
                throw new GeneralSecurityException("invalid keyset, corrupted key material");
            }
        } else if (!editorEdit.putString(str, i4.a.s(((D2.g0) fVar.c().f3024m).e())).commit()) {
            throw new IOException("Failed to write to SharedPreferences");
        }
        return fVar;
    }

    public r2.f e(byte[] bArr) {
        try {
            this.f8354e = new x2.c().c((String) this.f8353d);
            try {
                return new r2.f((D2.d0) ((D2.g0) Z1.m.F(new r2.f(new ByteArrayInputStream(bArr), 1), (x2.b) this.f8354e).f3024m).x(), 3);
            } catch (IOException | GeneralSecurityException e5) {
                try {
                    return d(bArr);
                } catch (IOException unused) {
                    throw e5;
                }
            }
        } catch (GeneralSecurityException | ProviderException e6) {
            try {
                r2.f fVarD = d(bArr);
                Log.w("a", "cannot use Android Keystore, it'll be disabled", e6);
                return fVarD;
            } catch (IOException unused2) {
                throw e6;
            }
        }
    }

    public x2.b f() throws KeyStoreException {
        x2.c cVar = new x2.c();
        try {
            boolean zA = x2.c.a((String) this.f8353d);
            try {
                return cVar.c((String) this.f8353d);
            } catch (GeneralSecurityException | ProviderException e5) {
                if (!zA) {
                    throw new KeyStoreException(AbstractC0307a.k("the master key ", (String) this.f8353d, " exists but is unusable"), e5);
                }
                Log.w("a", "cannot use Android Keystore, it'll be disabled", e5);
                return null;
            }
        } catch (GeneralSecurityException | ProviderException e6) {
            Log.w("a", "cannot use Android Keystore, it'll be disabled", e6);
            return null;
        }
    }
}

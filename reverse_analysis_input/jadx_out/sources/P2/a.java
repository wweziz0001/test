package P2;

import Z1.i;
import Z1.m;
import Z1.s;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.security.keystore.KeyGenParameterSpec;
import android.util.Base64;
import android.util.Log;
import b3.AbstractC0307a;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.security.GeneralSecurityException;
import java.security.Key;
import java.security.KeyStore;
import java.security.ProviderException;
import java.security.spec.AlgorithmParameterSpec;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import m.W0;
import r2.InterfaceC0781a;
import s2.AbstractC0792a;
import w1.AbstractC0943c;
import w1.AbstractC0944d;
import w1.SharedPreferencesC0942b;
import w1.SharedPreferencesEditorC0941a;
import w2.e;
import x2.C0990a;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f1680b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Map f1682d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public SharedPreferences f1684f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public s f1685g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public i f1686h;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f1681c = "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIHNlY3VyZSBzdG9yYWdlCg";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f1683e = "FlutterSecureStorage";
    public Boolean i = Boolean.FALSE;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Charset f1679a = StandardCharsets.UTF_8;

    public a(Context context, HashMap map) {
        this.f1682d = map;
        this.f1680b = context.getApplicationContext();
    }

    public final void a(SharedPreferences sharedPreferences, SharedPreferencesC0942b sharedPreferencesC0942b) {
        try {
            for (Map.Entry<String, ?> entry : sharedPreferences.getAll().entrySet()) {
                Object value = entry.getValue();
                String key = entry.getKey();
                if ((value instanceof String) && key.contains(this.f1681c)) {
                    String strB = b((String) value);
                    SharedPreferencesEditorC0941a sharedPreferencesEditorC0941a = (SharedPreferencesEditorC0941a) sharedPreferencesC0942b.edit();
                    sharedPreferencesEditorC0941a.putString(key, strB);
                    sharedPreferencesEditorC0941a.apply();
                    sharedPreferences.edit().remove(key).apply();
                }
            }
            SharedPreferences.Editor editorEdit = sharedPreferences.edit();
            this.f1686h.getClass();
            editorEdit.remove("FlutterSecureSAlgorithmKey");
            editorEdit.remove("FlutterSecureSAlgorithmStorage");
            editorEdit.apply();
        } catch (Exception e5) {
            Log.e("SecureStorageAndroid", "Data migration failed", e5);
        }
    }

    public final String b(String str) {
        if (str == null) {
            return null;
        }
        byte[] bArrDecode = Base64.decode(str, 0);
        s sVar = this.f1685g;
        int iF = sVar.F();
        byte[] bArr = new byte[iF];
        System.arraycopy(bArrDecode, 0, bArr, 0, iF);
        AlgorithmParameterSpec algorithmParameterSpecG = sVar.G(bArr);
        int length = bArrDecode.length - sVar.F();
        byte[] bArr2 = new byte[length];
        System.arraycopy(bArrDecode, iF, bArr2, 0, length);
        Key key = (Key) sVar.f3087o;
        Cipher cipher = (Cipher) sVar.f3085m;
        cipher.init(2, key, algorithmParameterSpecG);
        return new String(cipher.doFinal(bArr2), this.f1679a);
    }

    public final void c() {
        d();
        String str = this.f1683e;
        Context context = this.f1680b;
        SharedPreferences sharedPreferences = context.getSharedPreferences(str, 0);
        if (this.f1685g == null) {
            try {
                f(sharedPreferences);
            } catch (Exception e5) {
                Log.e("SecureStorageAndroid", "StorageCipher initialization failed", e5);
            }
        }
        if (!e()) {
            this.f1684f = sharedPreferences;
            return;
        }
        try {
            SharedPreferencesC0942b sharedPreferencesC0942bG = g(context);
            this.f1684f = sharedPreferencesC0942bG;
            a(sharedPreferences, sharedPreferencesC0942bG);
        } catch (Exception e6) {
            Log.e("SecureStorageAndroid", "EncryptedSharedPreferences initialization failed", e6);
            this.f1684f = sharedPreferences;
            this.i = Boolean.TRUE;
        }
    }

    public final void d() {
        if (this.f1682d.containsKey("sharedPreferencesName") && !((String) this.f1682d.get("sharedPreferencesName")).isEmpty()) {
            this.f1683e = (String) this.f1682d.get("sharedPreferencesName");
        }
        if (!this.f1682d.containsKey("preferencesKeyPrefix") || ((String) this.f1682d.get("preferencesKeyPrefix")).isEmpty()) {
            return;
        }
        this.f1681c = (String) this.f1682d.get("preferencesKeyPrefix");
    }

    public final boolean e() {
        return !this.i.booleanValue() && this.f1682d.containsKey("encryptedSharedPreferences") && this.f1682d.get("encryptedSharedPreferences").equals("true");
    }

    public final void f(SharedPreferences sharedPreferences) {
        Map map = this.f1682d;
        i iVar = new i();
        iVar.f3012l = Q2.a.valueOf(sharedPreferences.getString("FlutterSecureSAlgorithmKey", "RSA_ECB_PKCS1Padding"));
        iVar.f3013m = Q2.c.valueOf(sharedPreferences.getString("FlutterSecureSAlgorithmStorage", "AES_CBC_PKCS7Padding"));
        Object obj = map.get("keyCipherAlgorithm");
        Q2.a aVarValueOf = Q2.a.valueOf(obj != null ? obj.toString() : "RSA_ECB_PKCS1Padding");
        int i = aVarValueOf.f1846m;
        int i5 = Build.VERSION.SDK_INT;
        if (i > i5) {
            aVarValueOf = Q2.a.RSA_ECB_PKCS1Padding;
        }
        iVar.f3014n = aVarValueOf;
        Object obj2 = map.get("storageCipherAlgorithm");
        Q2.c cVarValueOf = Q2.c.valueOf(obj2 != null ? obj2.toString() : "AES_CBC_PKCS7Padding");
        if (cVarValueOf.f1850m > i5) {
            cVarValueOf = Q2.c.AES_CBC_PKCS7Padding;
        }
        iVar.f3015o = cVarValueOf;
        this.f1686h = iVar;
        boolean zE = e();
        Context context = this.f1680b;
        if (zE) {
            i iVar2 = this.f1686h;
            this.f1685g = ((Q2.c) iVar2.f3013m).f1849l.d(context, ((Q2.a) iVar2.f3012l).f1845l.c(context));
            return;
        }
        i iVar3 = this.f1686h;
        Q2.a aVar = (Q2.a) iVar3.f3012l;
        Q2.c cVar = (Q2.c) iVar3.f3013m;
        Q2.a aVar2 = (Q2.a) iVar3.f3014n;
        Q2.c cVar2 = (Q2.c) iVar3.f3015o;
        if (aVar == aVar2 && cVar == cVar2) {
            this.f1685g = cVar2.f1849l.d(context, aVar2.f1845l.c(context));
            return;
        }
        try {
            this.f1685g = cVar.f1849l.d(context, aVar.f1845l.c(context));
            HashMap map2 = new HashMap();
            for (Map.Entry<String, ?> entry : sharedPreferences.getAll().entrySet()) {
                Object value = entry.getValue();
                String key = entry.getKey();
                if ((value instanceof String) && key.contains(this.f1681c)) {
                    map2.put(key, b((String) value));
                }
            }
            this.f1685g = cVar2.f1849l.d(context, aVar2.f1845l.c(context));
            SharedPreferences.Editor editorEdit = sharedPreferences.edit();
            for (Map.Entry entry2 : map2.entrySet()) {
                editorEdit.putString((String) entry2.getKey(), Base64.encodeToString(this.f1685g.z(((String) entry2.getValue()).getBytes(this.f1679a)), 0));
            }
            editorEdit.putString("FlutterSecureSAlgorithmKey", aVar2.name());
            editorEdit.putString("FlutterSecureSAlgorithmStorage", cVar2.name());
            editorEdit.apply();
        } catch (Exception e5) {
            Log.e("SecureStorageAndroid", "re-encryption failed", e5);
            this.f1685g = cVar.f1849l.d(context, ((Q2.a) iVar3.f3012l).f1845l.c(context));
        }
    }

    public final SharedPreferencesC0942b g(Context context) {
        m mVarC;
        m mVarC2;
        context.getApplicationContext();
        KeyGenParameterSpec keyGenParameterSpecBuild = new KeyGenParameterSpec.Builder("_androidx_security_master_key_", 3).setEncryptionPaddings("NoPadding").setBlockModes("GCM").setKeySize(256).build();
        if (!"_androidx_security_master_key_".equals(AbstractC0943c.a(keyGenParameterSpecBuild))) {
            throw new IllegalArgumentException("KeyGenParamSpec's key alias does not match provided alias (_androidx_security_master_key_ vs " + AbstractC0943c.a(keyGenParameterSpecBuild));
        }
        if (keyGenParameterSpecBuild == null) {
            throw new IllegalArgumentException("build() called before setKeyGenParameterSpec or setKeyScheme.");
        }
        Object obj = AbstractC0944d.f10488a;
        if (keyGenParameterSpecBuild.getKeySize() != 256) {
            throw new IllegalArgumentException("invalid key size, want 256 bits got " + keyGenParameterSpecBuild.getKeySize() + " bits");
        }
        if (!Arrays.equals(keyGenParameterSpecBuild.getBlockModes(), new String[]{"GCM"})) {
            throw new IllegalArgumentException("invalid block mode, want GCM got " + Arrays.toString(keyGenParameterSpecBuild.getBlockModes()));
        }
        if (keyGenParameterSpecBuild.getPurposes() != 3) {
            throw new IllegalArgumentException("invalid purposes mode, want PURPOSE_ENCRYPT | PURPOSE_DECRYPT got " + keyGenParameterSpecBuild.getPurposes());
        }
        if (!Arrays.equals(keyGenParameterSpecBuild.getEncryptionPaddings(), new String[]{"NoPadding"})) {
            throw new IllegalArgumentException("invalid padding mode, want NoPadding got " + Arrays.toString(keyGenParameterSpecBuild.getEncryptionPaddings()));
        }
        if (keyGenParameterSpecBuild.isUserAuthenticationRequired() && keyGenParameterSpecBuild.getUserAuthenticationValidityDurationSeconds() < 1) {
            throw new IllegalArgumentException("per-operation authentication is not supported (UserAuthenticationValidityDurationSeconds must be >0)");
        }
        synchronized (AbstractC0944d.f10488a) {
            String keystoreAlias = keyGenParameterSpecBuild.getKeystoreAlias();
            KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
            keyStore.load(null);
            if (!keyStore.containsAlias(keystoreAlias)) {
                try {
                    KeyGenerator keyGenerator = KeyGenerator.getInstance("AES", "AndroidKeyStore");
                    keyGenerator.init(keyGenParameterSpecBuild);
                    keyGenerator.generateKey();
                } catch (ProviderException e5) {
                    throw new GeneralSecurityException(e5.getMessage(), e5);
                }
            }
        }
        String keystoreAlias2 = keyGenParameterSpecBuild.getKeystoreAlias();
        String str = this.f1683e;
        e.a();
        AbstractC0792a.a();
        Context applicationContext = context.getApplicationContext();
        W0 w02 = new W0();
        w02.f8355f = r2.b.a("AES256_SIV");
        if (applicationContext == null) {
            throw new IllegalArgumentException("need an Android context");
        }
        w02.f8350a = applicationContext;
        w02.f8351b = "__androidx_security_crypto_encrypted_prefs_key_keyset__";
        w02.f8352c = str;
        String strJ = AbstractC0307a.j("android-keystore://", keystoreAlias2);
        if (!strJ.startsWith("android-keystore://")) {
            throw new IllegalArgumentException("key URI must start with android-keystore://");
        }
        w02.f8353d = strJ;
        C0990a c0990aA = w02.a();
        synchronized (c0990aA) {
            mVarC = c0990aA.f10825a.c();
        }
        W0 w03 = new W0();
        w03.f8355f = r2.b.a("AES256_GCM");
        w03.f8350a = applicationContext;
        w03.f8351b = "__androidx_security_crypto_encrypted_prefs_value_keyset__";
        w03.f8352c = str;
        String strJ2 = AbstractC0307a.j("android-keystore://", keystoreAlias2);
        if (!strJ2.startsWith("android-keystore://")) {
            throw new IllegalArgumentException("key URI must start with android-keystore://");
        }
        w03.f8353d = strJ2;
        C0990a c0990aA2 = w03.a();
        synchronized (c0990aA2) {
            mVarC2 = c0990aA2.f10825a.c();
        }
        return new SharedPreferencesC0942b(str, applicationContext.getSharedPreferences(str, 0), (InterfaceC0781a) mVarC2.v(InterfaceC0781a.class), (r2.c) mVarC.v(r2.c.class));
    }

    public final HashMap h() {
        c();
        Map<String, ?> all = this.f1684f.getAll();
        HashMap map = new HashMap();
        for (Map.Entry<String, ?> entry : all.entrySet()) {
            if (entry.getKey().contains(this.f1681c)) {
                String strReplaceFirst = entry.getKey().replaceFirst(this.f1681c + '_', "");
                if (e()) {
                    map.put(strReplaceFirst, (String) entry.getValue());
                } else {
                    map.put(strReplaceFirst, b((String) entry.getValue()));
                }
            }
        }
        return map;
    }

    public final void i(String str, String str2) {
        c();
        SharedPreferences.Editor editorEdit = this.f1684f.edit();
        if (e()) {
            editorEdit.putString(str, str2);
        } else {
            editorEdit.putString(str, Base64.encodeToString(this.f1685g.z(str2.getBytes(this.f1679a)), 0));
        }
        editorEdit.apply();
    }
}

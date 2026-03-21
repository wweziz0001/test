package w1;

import E2.g;
import O.i;
import O.j;
import android.content.SharedPreferences;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import m.B0;
import q.C0736f;
import r2.InterfaceC0781a;

/* JADX INFO: renamed from: w1.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class SharedPreferencesC0942b implements SharedPreferences {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SharedPreferences f10483a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CopyOnWriteArrayList f10484b = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f10485c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final InterfaceC0781a f10486d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final r2.c f10487e;

    public SharedPreferencesC0942b(String str, SharedPreferences sharedPreferences, InterfaceC0781a interfaceC0781a, r2.c cVar) {
        this.f10485c = str;
        this.f10483a = sharedPreferences;
        this.f10486d = interfaceC0781a;
        this.f10487e = cVar;
    }

    public static boolean c(String str) {
        return "__androidx_security_crypto_encrypted_prefs_key_keyset__".equals(str) || "__androidx_security_crypto_encrypted_prefs_value_keyset__".equals(str);
    }

    public final String a(String str) {
        if (str == null) {
            str = "__NULL__";
        }
        try {
            try {
                return new String(g.b(this.f10487e.a(str.getBytes(StandardCharsets.UTF_8), this.f10485c.getBytes())), "US-ASCII");
            } catch (UnsupportedEncodingException e5) {
                throw new AssertionError(e5);
            }
        } catch (GeneralSecurityException e6) {
            throw new SecurityException("Could not encrypt key. " + e6.getMessage(), e6);
        }
    }

    public final Object b(String str) {
        String str2;
        if (c(str)) {
            throw new SecurityException(B0.h(str, " is a reserved key for the encryption keyset."));
        }
        if (str == null) {
            str = "__NULL__";
        }
        try {
            String strA = a(str);
            String string = this.f10483a.getString(strA, null);
            if (string == null) {
                return null;
            }
            byte[] bArrA = g.a(string);
            InterfaceC0781a interfaceC0781a = this.f10486d;
            Charset charset = StandardCharsets.UTF_8;
            ByteBuffer byteBufferWrap = ByteBuffer.wrap(interfaceC0781a.b(bArrA, strA.getBytes(charset)));
            byteBufferWrap.position(0);
            int i = byteBufferWrap.getInt();
            int i5 = i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? 0 : 6 : 5 : 4 : 3 : 2 : 1;
            if (i5 == 0) {
                throw new SecurityException("Unknown type ID for encrypted pref value: " + i);
            }
            int iB = i.b(i5);
            if (iB == 0) {
                int i6 = byteBufferWrap.getInt();
                ByteBuffer byteBufferSlice = byteBufferWrap.slice();
                byteBufferWrap.limit(i6);
                String string2 = charset.decode(byteBufferSlice).toString();
                if (string2.equals("__NULL__")) {
                    return null;
                }
                return string2;
            }
            if (iB == 1) {
                C0736f c0736f = new C0736f(0);
                while (byteBufferWrap.hasRemaining()) {
                    int i7 = byteBufferWrap.getInt();
                    ByteBuffer byteBufferSlice2 = byteBufferWrap.slice();
                    byteBufferSlice2.limit(i7);
                    byteBufferWrap.position(byteBufferWrap.position() + i7);
                    c0736f.add(StandardCharsets.UTF_8.decode(byteBufferSlice2).toString());
                }
                if (c0736f.f9223n == 1 && "__NULL__".equals(c0736f.f9222m[0])) {
                    return null;
                }
                return c0736f;
            }
            if (iB == 2) {
                return Integer.valueOf(byteBufferWrap.getInt());
            }
            if (iB == 3) {
                return Long.valueOf(byteBufferWrap.getLong());
            }
            if (iB == 4) {
                return Float.valueOf(byteBufferWrap.getFloat());
            }
            if (iB == 5) {
                return Boolean.valueOf(byteBufferWrap.get() != 0);
            }
            switch (i5) {
                case 1:
                    str2 = "STRING";
                    break;
                case 2:
                    str2 = "STRING_SET";
                    break;
                case 3:
                    str2 = "INT";
                    break;
                case 4:
                    str2 = "LONG";
                    break;
                case 5:
                    str2 = "FLOAT";
                    break;
                case j.STRING_SET_FIELD_NUMBER /* 6 */:
                    str2 = "BOOLEAN";
                    break;
                default:
                    str2 = "null";
                    break;
            }
            throw new SecurityException("Unhandled type for encrypted pref value: ".concat(str2));
        } catch (GeneralSecurityException e5) {
            throw new SecurityException("Could not decrypt value. " + e5.getMessage(), e5);
        }
    }

    @Override // android.content.SharedPreferences
    public final boolean contains(String str) {
        if (c(str)) {
            throw new SecurityException(B0.h(str, " is a reserved key for the encryption keyset."));
        }
        return this.f10483a.contains(a(str));
    }

    @Override // android.content.SharedPreferences
    public final SharedPreferences.Editor edit() {
        return new SharedPreferencesEditorC0941a(this, this.f10483a.edit());
    }

    @Override // android.content.SharedPreferences
    public final Map getAll() {
        HashMap map = new HashMap();
        for (Map.Entry<String, ?> entry : this.f10483a.getAll().entrySet()) {
            if (!c(entry.getKey())) {
                try {
                    String str = new String(this.f10487e.b(g.a(entry.getKey()), this.f10485c.getBytes()), StandardCharsets.UTF_8);
                    if (str.equals("__NULL__")) {
                        str = null;
                    }
                    map.put(str, b(str));
                } catch (GeneralSecurityException e5) {
                    throw new SecurityException("Could not decrypt key. " + e5.getMessage(), e5);
                }
            }
        }
        return map;
    }

    @Override // android.content.SharedPreferences
    public final boolean getBoolean(String str, boolean z4) {
        Object objB = b(str);
        return objB instanceof Boolean ? ((Boolean) objB).booleanValue() : z4;
    }

    @Override // android.content.SharedPreferences
    public final float getFloat(String str, float f2) {
        Object objB = b(str);
        return objB instanceof Float ? ((Float) objB).floatValue() : f2;
    }

    @Override // android.content.SharedPreferences
    public final int getInt(String str, int i) {
        Object objB = b(str);
        return objB instanceof Integer ? ((Integer) objB).intValue() : i;
    }

    @Override // android.content.SharedPreferences
    public final long getLong(String str, long j5) {
        Object objB = b(str);
        return objB instanceof Long ? ((Long) objB).longValue() : j5;
    }

    @Override // android.content.SharedPreferences
    public final String getString(String str, String str2) {
        Object objB = b(str);
        return objB instanceof String ? (String) objB : str2;
    }

    @Override // android.content.SharedPreferences
    public final Set getStringSet(String str, Set set) {
        Object objB = b(str);
        Set c0736f = objB instanceof Set ? (Set) objB : new C0736f(0);
        return c0736f.size() > 0 ? c0736f : set;
    }

    @Override // android.content.SharedPreferences
    public final void registerOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        this.f10484b.add(onSharedPreferenceChangeListener);
    }

    @Override // android.content.SharedPreferences
    public final void unregisterOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        this.f10484b.remove(onSharedPreferenceChangeListener);
    }
}

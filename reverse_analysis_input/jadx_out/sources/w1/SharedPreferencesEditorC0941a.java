package w1;

import E2.g;
import android.content.SharedPreferences;
import android.util.Pair;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import m.B0;
import q.C0736f;

/* JADX INFO: renamed from: w1.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class SharedPreferencesEditorC0941a implements SharedPreferences.Editor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SharedPreferencesC0942b f10479a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final SharedPreferences.Editor f10480b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AtomicBoolean f10482d = new AtomicBoolean(false);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final CopyOnWriteArrayList f10481c = new CopyOnWriteArrayList();

    public SharedPreferencesEditorC0941a(SharedPreferencesC0942b sharedPreferencesC0942b, SharedPreferences.Editor editor) {
        this.f10479a = sharedPreferencesC0942b;
        this.f10480b = editor;
    }

    public final void a() {
        if (this.f10482d.getAndSet(false)) {
            SharedPreferencesC0942b sharedPreferencesC0942b = this.f10479a;
            for (String str : ((HashMap) sharedPreferencesC0942b.getAll()).keySet()) {
                if (!this.f10481c.contains(str) && !SharedPreferencesC0942b.c(str)) {
                    this.f10480b.remove(sharedPreferencesC0942b.a(str));
                }
            }
        }
    }

    @Override // android.content.SharedPreferences.Editor
    public final void apply() {
        a();
        this.f10480b.apply();
        b();
        this.f10481c.clear();
    }

    public final void b() {
        SharedPreferencesC0942b sharedPreferencesC0942b = this.f10479a;
        for (SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener : sharedPreferencesC0942b.f10484b) {
            Iterator it = this.f10481c.iterator();
            while (it.hasNext()) {
                onSharedPreferenceChangeListener.onSharedPreferenceChanged(sharedPreferencesC0942b, (String) it.next());
            }
        }
    }

    public final void c(String str, byte[] bArr) {
        SharedPreferencesC0942b sharedPreferencesC0942b = this.f10479a;
        sharedPreferencesC0942b.getClass();
        if (SharedPreferencesC0942b.c(str)) {
            throw new SecurityException(B0.h(str, " is a reserved key for the encryption keyset."));
        }
        this.f10481c.add(str);
        if (str == null) {
            str = "__NULL__";
        }
        try {
            String strA = sharedPreferencesC0942b.a(str);
            try {
                Pair pair = new Pair(strA, new String(g.b(sharedPreferencesC0942b.f10486d.a(bArr, strA.getBytes(StandardCharsets.UTF_8))), "US-ASCII"));
                this.f10480b.putString((String) pair.first, (String) pair.second);
            } catch (UnsupportedEncodingException e5) {
                throw new AssertionError(e5);
            }
        } catch (GeneralSecurityException e6) {
            throw new SecurityException("Could not encrypt data: " + e6.getMessage(), e6);
        }
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor clear() {
        this.f10482d.set(true);
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final boolean commit() {
        CopyOnWriteArrayList copyOnWriteArrayList = this.f10481c;
        a();
        try {
            return this.f10480b.commit();
        } finally {
            b();
            copyOnWriteArrayList.clear();
        }
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor putBoolean(String str, boolean z4) {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(5);
        byteBufferAllocate.putInt(5);
        byteBufferAllocate.put(z4 ? (byte) 1 : (byte) 0);
        c(str, byteBufferAllocate.array());
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor putFloat(String str, float f2) {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(8);
        byteBufferAllocate.putInt(4);
        byteBufferAllocate.putFloat(f2);
        c(str, byteBufferAllocate.array());
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor putInt(String str, int i) {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(8);
        byteBufferAllocate.putInt(2);
        byteBufferAllocate.putInt(i);
        c(str, byteBufferAllocate.array());
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor putLong(String str, long j5) {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(12);
        byteBufferAllocate.putInt(3);
        byteBufferAllocate.putLong(j5);
        c(str, byteBufferAllocate.array());
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor putString(String str, String str2) {
        if (str2 == null) {
            str2 = "__NULL__";
        }
        byte[] bytes = str2.getBytes(StandardCharsets.UTF_8);
        int length = bytes.length;
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(length + 8);
        byteBufferAllocate.putInt(0);
        byteBufferAllocate.putInt(length);
        byteBufferAllocate.put(bytes);
        c(str, byteBufferAllocate.array());
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor putStringSet(String str, Set set) {
        if (set == null) {
            set = new C0736f(0);
            set.add("__NULL__");
        }
        ArrayList<byte[]> arrayList = new ArrayList(set.size());
        int size = set.size() * 4;
        Iterator it = set.iterator();
        while (it.hasNext()) {
            byte[] bytes = ((String) it.next()).getBytes(StandardCharsets.UTF_8);
            arrayList.add(bytes);
            size += bytes.length;
        }
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(size + 4);
        byteBufferAllocate.putInt(1);
        for (byte[] bArr : arrayList) {
            byteBufferAllocate.putInt(bArr.length);
            byteBufferAllocate.put(bArr);
        }
        c(str, byteBufferAllocate.array());
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor remove(String str) {
        SharedPreferencesC0942b sharedPreferencesC0942b = this.f10479a;
        sharedPreferencesC0942b.getClass();
        if (SharedPreferencesC0942b.c(str)) {
            throw new SecurityException(B0.h(str, " is a reserved key for the encryption keyset."));
        }
        this.f10480b.remove(sharedPreferencesC0942b.a(str));
        this.f10481c.add(str);
        return this;
    }
}

package com.google.crypto.tink.shaded.protobuf;

import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class M extends LinkedHashMap {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final M f5149m;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f5150l = true;

    static {
        M m4 = new M();
        f5149m = m4;
        m4.f5150l = false;
    }

    public static int a(Object obj) {
        if (!(obj instanceof byte[])) {
            if (obj instanceof InterfaceC0344y) {
                throw new UnsupportedOperationException();
            }
            return obj.hashCode();
        }
        byte[] bArr = (byte[]) obj;
        Charset charset = A.f5128a;
        int length = bArr.length;
        for (byte b4 : bArr) {
            length = (length * 31) + b4;
        }
        if (length == 0) {
            return 1;
        }
        return length;
    }

    public final void b() {
        if (!this.f5150l) {
            throw new UnsupportedOperationException();
        }
    }

    public final M c() {
        if (isEmpty()) {
            return new M();
        }
        M m4 = new M(this);
        m4.f5150l = true;
        return m4;
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void clear() {
        b();
        super.clear();
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        return isEmpty() ? Collections.emptySet() : super.entrySet();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        boolean z4;
        if (!(obj instanceof Map)) {
            return false;
        }
        Map map = (Map) obj;
        if (this != map) {
            if (size() == map.size()) {
                for (Map.Entry entry : entrySet()) {
                    if (map.containsKey(entry.getKey())) {
                        Object value = entry.getValue();
                        Object obj2 = map.get(entry.getKey());
                        if (!(((value instanceof byte[]) && (obj2 instanceof byte[])) ? Arrays.equals((byte[]) value, (byte[]) obj2) : value.equals(obj2))) {
                        }
                    }
                }
                z4 = true;
            }
            z4 = false;
            break;
        }
        z4 = true;
        return z4;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        int iA = 0;
        for (Map.Entry entry : entrySet()) {
            iA += a(entry.getValue()) ^ a(entry.getKey());
        }
        return iA;
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        b();
        Charset charset = A.f5128a;
        obj.getClass();
        obj2.getClass();
        return super.put(obj, obj2);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void putAll(Map map) {
        b();
        for (Object obj : map.keySet()) {
            Charset charset = A.f5128a;
            obj.getClass();
            map.get(obj).getClass();
        }
        super.putAll(map);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        b();
        return super.remove(obj);
    }
}

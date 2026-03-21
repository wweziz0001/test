package androidx.datastore.preferences.protobuf;

import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class H extends LinkedHashMap {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final H f4075m;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f4076l = true;

    static {
        H h2 = new H();
        f4075m = h2;
        h2.f4076l = false;
    }

    public final void a() {
        if (!this.f4076l) {
            throw new UnsupportedOperationException();
        }
    }

    public final H b() {
        if (isEmpty()) {
            return new H();
        }
        H h2 = new H(this);
        h2.f4076l = true;
        return h2;
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void clear() {
        a();
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
        int iHashCode;
        int iHashCode2;
        int i = 0;
        for (Map.Entry entry : entrySet()) {
            Object key = entry.getKey();
            if (key instanceof byte[]) {
                byte[] bArr = (byte[]) key;
                Charset charset = AbstractC0231x.f4217a;
                iHashCode = bArr.length;
                for (byte b4 : bArr) {
                    iHashCode = (iHashCode * 31) + b4;
                }
                if (iHashCode == 0) {
                    iHashCode = 1;
                }
            } else {
                iHashCode = key.hashCode();
            }
            Object value = entry.getValue();
            if (value instanceof byte[]) {
                byte[] bArr2 = (byte[]) value;
                Charset charset2 = AbstractC0231x.f4217a;
                iHashCode2 = bArr2.length;
                for (byte b5 : bArr2) {
                    iHashCode2 = (iHashCode2 * 31) + b5;
                }
                if (iHashCode2 == 0) {
                    iHashCode2 = 1;
                }
            } else {
                iHashCode2 = value.hashCode();
            }
            i += iHashCode ^ iHashCode2;
        }
        return i;
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        a();
        Charset charset = AbstractC0231x.f4217a;
        obj.getClass();
        obj2.getClass();
        return super.put(obj, obj2);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void putAll(Map map) {
        a();
        for (Object obj : map.keySet()) {
            Charset charset = AbstractC0231x.f4217a;
            obj.getClass();
            map.get(obj).getClass();
        }
        super.putAll(map);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        a();
        return super.remove(obj);
    }
}

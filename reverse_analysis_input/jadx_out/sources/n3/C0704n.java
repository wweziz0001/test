package n3;

import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: renamed from: n3.n, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0704n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f8938a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f8939b;

    public C0704n(Object obj, String str) {
        this.f8938a = str;
        this.f8939b = obj;
    }

    public final Object a(String str) {
        Object obj = this.f8939b;
        if (obj == null) {
            return null;
        }
        if (obj instanceof Map) {
            return ((Map) obj).get(str);
        }
        if (obj instanceof JSONObject) {
            return ((JSONObject) obj).opt(str);
        }
        throw new ClassCastException();
    }

    public final boolean b(String str) {
        Object obj = this.f8939b;
        if (obj == null) {
            return false;
        }
        if (obj instanceof Map) {
            return ((Map) obj).containsKey(str);
        }
        if (obj instanceof JSONObject) {
            return ((JSONObject) obj).has(str);
        }
        throw new ClassCastException();
    }
}

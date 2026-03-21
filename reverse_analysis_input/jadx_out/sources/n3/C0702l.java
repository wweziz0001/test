package n3;

import Q1.C;
import java.nio.ByteBuffer;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONTokener;

/* JADX INFO: renamed from: n3.l, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0702l implements InterfaceC0708r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C0702l f8937a = new C0702l();

    @Override // n3.InterfaceC0708r
    public ByteBuffer a(Object obj) {
        JSONArray jSONArrayPut = new JSONArray().put(C.B0(obj));
        if (jSONArrayPut == null) {
            return null;
        }
        Object objB0 = C.B0(jSONArrayPut);
        if (objB0 instanceof String) {
            y yVar = y.f8949b;
            String strQuote = JSONObject.quote((String) objB0);
            yVar.getClass();
            return y.d(strQuote);
        }
        y yVar2 = y.f8949b;
        String string = objB0.toString();
        yVar2.getClass();
        return y.d(string);
    }

    @Override // n3.InterfaceC0708r
    public C0704n b(ByteBuffer byteBuffer) {
        Object objNextValue;
        Object obj = null;
        try {
            if (byteBuffer == null) {
                objNextValue = null;
            } else {
                try {
                    y.f8949b.getClass();
                    JSONTokener jSONTokener = new JSONTokener(y.c(byteBuffer));
                    objNextValue = jSONTokener.nextValue();
                    if (jSONTokener.more()) {
                        throw new IllegalArgumentException("Invalid JSON");
                    }
                } catch (JSONException e5) {
                    throw new IllegalArgumentException("Invalid JSON", e5);
                }
            }
            if (objNextValue instanceof JSONObject) {
                JSONObject jSONObject = (JSONObject) objNextValue;
                Object obj2 = jSONObject.get("method");
                Object objOpt = jSONObject.opt("args");
                if (objOpt != JSONObject.NULL) {
                    obj = objOpt;
                }
                if (obj2 instanceof String) {
                    return new C0704n(obj, (String) obj2);
                }
            }
            throw new IllegalArgumentException("Invalid method call: " + objNextValue);
        } catch (JSONException e6) {
            throw new IllegalArgumentException("Invalid JSON", e6);
        }
    }

    @Override // n3.InterfaceC0708r
    public Object c(ByteBuffer byteBuffer) {
        Object objNextValue;
        Object obj = null;
        if (byteBuffer == null) {
            objNextValue = null;
        } else {
            try {
                try {
                    y.f8949b.getClass();
                    JSONTokener jSONTokener = new JSONTokener(y.c(byteBuffer));
                    objNextValue = jSONTokener.nextValue();
                    if (jSONTokener.more()) {
                        throw new IllegalArgumentException("Invalid JSON");
                    }
                } catch (JSONException e5) {
                    throw new IllegalArgumentException("Invalid JSON", e5);
                }
            } catch (JSONException e6) {
                throw new IllegalArgumentException("Invalid JSON", e6);
            }
        }
        if (objNextValue instanceof JSONArray) {
            JSONArray jSONArray = (JSONArray) objNextValue;
            if (jSONArray.length() == 1) {
                Object objOpt = jSONArray.opt(0);
                if (objOpt == JSONObject.NULL) {
                    return null;
                }
                return objOpt;
            }
            if (jSONArray.length() == 3) {
                Object obj2 = jSONArray.get(0);
                Object objOpt2 = jSONArray.opt(1);
                Object obj3 = JSONObject.NULL;
                if (objOpt2 == obj3) {
                    objOpt2 = null;
                }
                Object objOpt3 = jSONArray.opt(2);
                if (objOpt3 != obj3) {
                    obj = objOpt3;
                }
                if ((obj2 instanceof String) && (objOpt2 == null || (objOpt2 instanceof String))) {
                    throw new C0700j((String) obj2, (String) objOpt2, obj);
                }
            }
        }
        throw new IllegalArgumentException("Invalid envelope: " + objNextValue);
    }

    @Override // n3.InterfaceC0708r
    public ByteBuffer d(C0704n c0704n) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("method", c0704n.f8938a);
            jSONObject.put("args", C.B0(c0704n.f8939b));
            Object objB0 = C.B0(jSONObject);
            if (objB0 instanceof String) {
                y yVar = y.f8949b;
                String strQuote = JSONObject.quote((String) objB0);
                yVar.getClass();
                return y.d(strQuote);
            }
            y yVar2 = y.f8949b;
            String string = objB0.toString();
            yVar2.getClass();
            return y.d(string);
        } catch (JSONException e5) {
            throw new IllegalArgumentException("Invalid JSON", e5);
        }
    }

    @Override // n3.InterfaceC0708r
    public ByteBuffer e(String str, String str2) {
        JSONArray jSONArrayPut = new JSONArray().put("error").put(C.B0(str)).put(JSONObject.NULL).put(C.B0(str2));
        if (jSONArrayPut == null) {
            return null;
        }
        Object objB0 = C.B0(jSONArrayPut);
        if (objB0 instanceof String) {
            y yVar = y.f8949b;
            String strQuote = JSONObject.quote((String) objB0);
            yVar.getClass();
            return y.d(strQuote);
        }
        y yVar2 = y.f8949b;
        String string = objB0.toString();
        yVar2.getClass();
        return y.d(string);
    }

    @Override // n3.InterfaceC0708r
    public ByteBuffer f(String str, String str2, Object obj) {
        JSONArray jSONArrayPut = new JSONArray().put(str).put(C.B0(str2)).put(C.B0(obj));
        if (jSONArrayPut == null) {
            return null;
        }
        Object objB0 = C.B0(jSONArrayPut);
        if (objB0 instanceof String) {
            y yVar = y.f8949b;
            String strQuote = JSONObject.quote((String) objB0);
            yVar.getClass();
            return y.d(strQuote);
        }
        y yVar2 = y.f8949b;
        String string = objB0.toString();
        yVar2.getClass();
        return y.d(string);
    }
}

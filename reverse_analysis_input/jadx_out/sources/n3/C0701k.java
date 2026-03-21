package n3;

import Q1.C;
import java.nio.ByteBuffer;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONTokener;

/* JADX INFO: renamed from: n3.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0701k implements InterfaceC0703m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C0701k f8936a = new C0701k();

    @Override // n3.InterfaceC0703m
    public final Object a(ByteBuffer byteBuffer) {
        if (byteBuffer == null) {
            return null;
        }
        try {
            y.f8949b.getClass();
            JSONTokener jSONTokener = new JSONTokener(y.c(byteBuffer));
            Object objNextValue = jSONTokener.nextValue();
            if (jSONTokener.more()) {
                throw new IllegalArgumentException("Invalid JSON");
            }
            return objNextValue;
        } catch (JSONException e5) {
            throw new IllegalArgumentException("Invalid JSON", e5);
        }
    }

    @Override // n3.InterfaceC0703m
    public final ByteBuffer b(Object obj) {
        if (obj == null) {
            return null;
        }
        Object objB0 = C.B0(obj);
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

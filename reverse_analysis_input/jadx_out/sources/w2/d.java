package w2;

import D2.r0;
import java.util.Collections;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.Map;
import s2.l;
import y2.C1005a;
import y2.i;
import y2.j;
import y2.s;

/* JADX INFO: loaded from: classes.dex */
public abstract class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final j f10495a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final i f10496b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final y2.c f10497c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final C1005a f10498d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Map f10499e;

    static {
        F2.a aVarB = s.b("type.googleapis.com/google.crypto.tink.AesSivKey");
        f10495a = new j(C0947c.class);
        f10496b = new i(aVarB);
        f10497c = new y2.c(C0945a.class);
        f10498d = new C1005a(aVarB, new l(7));
        HashMap map = new HashMap();
        C0946b c0946b = C0946b.f10491d;
        r0 r0Var = r0.f580p;
        map.put(c0946b, r0Var);
        C0946b c0946b2 = C0946b.f10489b;
        r0 r0Var2 = r0.f578n;
        map.put(c0946b2, r0Var2);
        C0946b c0946b3 = C0946b.f10490c;
        r0 r0Var3 = r0.f581q;
        map.put(c0946b3, r0Var3);
        Collections.unmodifiableMap(map);
        EnumMap enumMap = new EnumMap(r0.class);
        enumMap.put(r0Var, c0946b);
        enumMap.put(r0Var2, c0946b2);
        enumMap.put(r0Var3, c0946b3);
        enumMap.put(r0.f579o, c0946b3);
        f10499e = Collections.unmodifiableMap(enumMap);
    }
}

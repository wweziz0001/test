package y2;

import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes.dex */
public abstract class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final p1.b f10960a = new p1.b(20);

    public static void a(Z1.s sVar) {
        r2.f fVar;
        ArrayList arrayList = new ArrayList();
        B2.a aVar = B2.a.f262b;
        Iterator it = ((ConcurrentHashMap) sVar.f3085m).values().iterator();
        while (it.hasNext()) {
            for (r2.k kVar : (List) it.next()) {
                int iOrdinal = kVar.f9538d.ordinal();
                if (iOrdinal == 1) {
                    fVar = r2.f.f9527c;
                } else if (iOrdinal == 2) {
                    fVar = r2.f.f9528d;
                } else {
                    if (iOrdinal != 3) {
                        throw new IllegalStateException("Unknown key status");
                    }
                    fVar = r2.f.f9529e;
                }
                String strSubstring = kVar.f9541g;
                if (strSubstring.startsWith("type.googleapis.com/google.crypto.")) {
                    strSubstring = strSubstring.substring(34);
                }
                arrayList.add(new B2.b(fVar, kVar.f9540f, strSubstring, kVar.f9539e.name()));
            }
        }
        r2.k kVar2 = (r2.k) sVar.f3086n;
        Integer numValueOf = kVar2 != null ? Integer.valueOf(kVar2.f9540f) : null;
        if (numValueOf != null) {
            try {
                int iIntValue = numValueOf.intValue();
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    if (((B2.b) it2.next()).f265b == iIntValue) {
                    }
                }
                throw new GeneralSecurityException("primary key ID is not present in entries");
            } catch (GeneralSecurityException e5) {
                throw new IllegalStateException(e5);
            }
        }
        Collections.unmodifiableList(arrayList);
    }
}

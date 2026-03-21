package H1;

import C3.n;
import M3.l;
import a.AbstractC0149a;
import android.util.Log;
import b3.AbstractC0307a;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class f extends g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f968a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f969b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f970c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final j f971d;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [C3.n] */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.util.ArrayList] */
    public f(Object obj, String str, a aVar, int i) {
        N3.h.e(obj, "value");
        AbstractC0307a.r("verificationMode", i);
        this.f968a = obj;
        this.f969b = str;
        this.f970c = i;
        String strB = g.b(obj, str);
        N3.h.e(strB, "message");
        j jVar = new j(strB);
        StackTraceElement[] stackTrace = jVar.getStackTrace();
        N3.h.d(stackTrace, "stackTrace");
        int length = stackTrace.length - 2;
        length = length < 0 ? 0 : length;
        if (length < 0) {
            throw new IllegalArgumentException(AbstractC0307a.h(length, "Requested element count ", " is less than zero.").toString());
        }
        ?? arrayList = n.f291l;
        if (length != 0) {
            int length2 = stackTrace.length;
            if (length >= length2) {
                int length3 = stackTrace.length;
                if (length3 != 0) {
                    arrayList = length3 != 1 ? C3.e.Z(stackTrace) : AbstractC0149a.y(stackTrace[0]);
                }
            } else if (length == 1) {
                arrayList = AbstractC0149a.y(stackTrace[length2 - 1]);
            } else {
                arrayList = new ArrayList(length);
                for (int i5 = length2 - length; i5 < length2; i5++) {
                    arrayList.add(stackTrace[i5]);
                }
            }
        }
        jVar.setStackTrace((StackTraceElement[]) arrayList.toArray(new StackTraceElement[0]));
        this.f971d = jVar;
    }

    @Override // H1.g
    public final Object a() throws j {
        int iB = O.i.b(this.f970c);
        if (iB == 0) {
            throw this.f971d;
        }
        if (iB != 1) {
            if (iB == 2) {
                return null;
            }
            throw new A1.c();
        }
        String strB = g.b(this.f968a, this.f969b);
        N3.h.e(strB, "message");
        Log.d("f", strB);
        return null;
    }

    @Override // H1.g
    public final g d(String str, l lVar) {
        return this;
    }
}

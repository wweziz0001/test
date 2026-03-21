package j$.time.format;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
final class o implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final j$.time.temporal.a f7091a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final A f7092b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final b f7093c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private volatile i f7094d;

    o(j$.time.temporal.a aVar, A a5, b bVar) {
        this.f7091a = aVar;
        this.f7092b = a5;
        this.f7093c = bVar;
    }

    @Override // j$.time.format.f
    public final boolean p(t tVar, StringBuilder sb) {
        String strA;
        Long lE = tVar.e(this.f7091a);
        if (lE == null) {
            return false;
        }
        j$.time.chrono.l lVar = (j$.time.chrono.l) tVar.d().a(j$.time.temporal.s.a());
        if (lVar == null || lVar == j$.time.chrono.s.f7036d) {
            long jLongValue = lE.longValue();
            A a5 = this.f7092b;
            tVar.c();
            strA = this.f7093c.f7063a.a(jLongValue, a5);
        } else {
            long jLongValue2 = lE.longValue();
            A a6 = this.f7092b;
            tVar.c();
            strA = this.f7093c.f7063a.a(jLongValue2, a6);
        }
        if (strA != null) {
            sb.append(strA);
            return true;
        }
        if (this.f7094d == null) {
            this.f7094d = new i(this.f7091a, 1, 19, z.NORMAL);
        }
        return this.f7094d.p(tVar, sb);
    }

    @Override // j$.time.format.f
    public final int r(q qVar, CharSequence charSequence, int i) {
        Iterator itB;
        int length = charSequence.length();
        if (i < 0 || i > length) {
            throw new IndexOutOfBoundsException();
        }
        A a5 = qVar.k() ? this.f7092b : null;
        j$.time.chrono.l lVarG = qVar.g();
        b bVar = this.f7093c;
        j$.time.temporal.a aVar = this.f7091a;
        if (lVarG == null || lVarG == j$.time.chrono.s.f7036d) {
            qVar.h();
            itB = bVar.f7063a.b(a5);
        } else {
            qVar.h();
            itB = bVar.f7063a.b(a5);
        }
        if (itB != null) {
            while (itB.hasNext()) {
                Map.Entry entry = (Map.Entry) itB.next();
                String str = (String) entry.getKey();
                if (qVar.r(str, 0, charSequence, i, str.length())) {
                    return qVar.n(this.f7091a, ((Long) entry.getValue()).longValue(), i, str.length() + i);
                }
            }
            if (aVar == j$.time.temporal.a.ERA && !qVar.k()) {
                Iterator it = lVarG.C().iterator();
                while (it.hasNext()) {
                    String string = ((j$.time.chrono.m) it.next()).toString();
                    if (qVar.r(string, 0, charSequence, i, string.length())) {
                        return qVar.n(this.f7091a, r1.p(), i, string.length() + i);
                    }
                }
            }
            if (qVar.k()) {
                return ~i;
            }
        }
        if (this.f7094d == null) {
            this.f7094d = new i(this.f7091a, 1, 19, z.NORMAL);
        }
        return this.f7094d.r(qVar, charSequence, i);
    }

    public final String toString() {
        A a5 = A.FULL;
        j$.time.temporal.a aVar = this.f7091a;
        A a6 = this.f7092b;
        if (a6 == a5) {
            return "Text(" + aVar + ")";
        }
        return "Text(" + aVar + "," + a6 + ")";
    }
}

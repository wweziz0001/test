package j$.time.format;

import j$.time.ZoneId;
import j$.time.temporal.TemporalAccessor;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private DateTimeFormatter f7101a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f7102b = true;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f7103c = true;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ArrayList f7104d;

    q(DateTimeFormatter dateTimeFormatter) {
        ArrayList arrayList = new ArrayList();
        this.f7104d = arrayList;
        this.f7101a = dateTimeFormatter;
        arrayList.add(new x());
    }

    final q c() {
        q qVar = new q(this.f7101a);
        qVar.f7102b = this.f7102b;
        qVar.f7103c = this.f7103c;
        return qVar;
    }

    final Locale h() {
        return this.f7101a.c();
    }

    final w f() {
        return this.f7101a.b();
    }

    final j$.time.chrono.l g() {
        j$.time.chrono.l lVar = d().f7117c;
        if (lVar != null) {
            return lVar;
        }
        j$.time.chrono.l lVarA = this.f7101a.a();
        return lVarA == null ? j$.time.chrono.s.f7036d : lVarA;
    }

    final boolean a(char c5, char c6) {
        if (this.f7102b) {
            return c5 == c6;
        }
        return b(c5, c6);
    }

    final boolean j() {
        return this.f7102b;
    }

    final void l(boolean z4) {
        this.f7102b = z4;
    }

    final boolean r(CharSequence charSequence, int i, CharSequence charSequence2, int i5, int i6) {
        if (i + i6 > charSequence.length() || i5 + i6 > charSequence2.length()) {
            return false;
        }
        if (this.f7102b) {
            for (int i7 = 0; i7 < i6; i7++) {
                if (charSequence.charAt(i + i7) != charSequence2.charAt(i5 + i7)) {
                    return false;
                }
            }
            return true;
        }
        for (int i8 = 0; i8 < i6; i8++) {
            char cCharAt = charSequence.charAt(i + i8);
            char cCharAt2 = charSequence2.charAt(i5 + i8);
            if (cCharAt != cCharAt2 && Character.toUpperCase(cCharAt) != Character.toUpperCase(cCharAt2) && Character.toLowerCase(cCharAt) != Character.toLowerCase(cCharAt2)) {
                return false;
            }
        }
        return true;
    }

    static boolean b(char c5, char c6) {
        return c5 == c6 || Character.toUpperCase(c5) == Character.toUpperCase(c6) || Character.toLowerCase(c5) == Character.toLowerCase(c6);
    }

    final boolean k() {
        return this.f7103c;
    }

    final void p(boolean z4) {
        this.f7103c = z4;
    }

    final void q() {
        ArrayList arrayList = this.f7104d;
        x xVarD = d();
        xVarD.getClass();
        x xVar = new x();
        xVar.f7115a.putAll(xVarD.f7115a);
        xVar.f7116b = xVarD.f7116b;
        xVar.f7117c = xVarD.f7117c;
        xVar.f7118d = xVarD.f7118d;
        arrayList.add(xVar);
    }

    final void e(boolean z4) {
        ArrayList arrayList = this.f7104d;
        if (z4) {
            arrayList.remove(arrayList.size() - 2);
        } else {
            arrayList.remove(arrayList.size() - 1);
        }
    }

    private x d() {
        return (x) this.f7104d.get(r0.size() - 1);
    }

    final TemporalAccessor s(y yVar) {
        x xVarD = d();
        xVarD.f7117c = g();
        ZoneId zoneId = xVarD.f7116b;
        if (zoneId == null) {
            this.f7101a.getClass();
            zoneId = null;
        }
        xVarD.f7116b = zoneId;
        xVarD.r(yVar);
        return xVarD;
    }

    final Long i(j$.time.temporal.a aVar) {
        return (Long) d().f7115a.get(aVar);
    }

    final int n(j$.time.temporal.r rVar, long j5, int i, int i5) {
        Objects.requireNonNull(rVar, "field");
        Long l3 = (Long) d().f7115a.put(rVar, Long.valueOf(j5));
        return (l3 == null || l3.longValue() == j5) ? i5 : ~i;
    }

    final void m(ZoneId zoneId) {
        Objects.requireNonNull(zoneId, "zone");
        d().f7116b = zoneId;
    }

    final void o() {
        d().f7118d = true;
    }

    public final String toString() {
        return d().toString();
    }
}

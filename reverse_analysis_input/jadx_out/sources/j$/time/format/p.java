package j$.time.format;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class p {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final C0518a f7095f = new C0518a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private p f7096a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final p f7097b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ArrayList f7098c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f7099d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f7100e;

    static {
        HashMap map = new HashMap();
        map.put('G', j$.time.temporal.a.ERA);
        map.put('y', j$.time.temporal.a.YEAR_OF_ERA);
        map.put('u', j$.time.temporal.a.YEAR);
        j$.time.temporal.r rVar = j$.time.temporal.j.f7168a;
        map.put('Q', rVar);
        map.put('q', rVar);
        j$.time.temporal.a aVar = j$.time.temporal.a.MONTH_OF_YEAR;
        map.put('M', aVar);
        map.put('L', aVar);
        map.put('D', j$.time.temporal.a.DAY_OF_YEAR);
        map.put('d', j$.time.temporal.a.DAY_OF_MONTH);
        map.put('F', j$.time.temporal.a.ALIGNED_DAY_OF_WEEK_IN_MONTH);
        j$.time.temporal.a aVar2 = j$.time.temporal.a.DAY_OF_WEEK;
        map.put('E', aVar2);
        map.put('c', aVar2);
        map.put('e', aVar2);
        map.put('a', j$.time.temporal.a.AMPM_OF_DAY);
        map.put('H', j$.time.temporal.a.HOUR_OF_DAY);
        map.put('k', j$.time.temporal.a.CLOCK_HOUR_OF_DAY);
        map.put('K', j$.time.temporal.a.HOUR_OF_AMPM);
        map.put('h', j$.time.temporal.a.CLOCK_HOUR_OF_AMPM);
        map.put('m', j$.time.temporal.a.MINUTE_OF_HOUR);
        map.put('s', j$.time.temporal.a.SECOND_OF_MINUTE);
        j$.time.temporal.a aVar3 = j$.time.temporal.a.NANO_OF_SECOND;
        map.put('S', aVar3);
        map.put('A', j$.time.temporal.a.MILLI_OF_DAY);
        map.put('n', aVar3);
        map.put('N', j$.time.temporal.a.NANO_OF_DAY);
        map.put('g', j$.time.temporal.l.f7175a);
    }

    public p() {
        this.f7096a = this;
        this.f7098c = new ArrayList();
        this.f7100e = -1;
        this.f7097b = null;
        this.f7099d = false;
    }

    private p(p pVar) {
        this.f7096a = this;
        this.f7098c = new ArrayList();
        this.f7100e = -1;
        this.f7097b = pVar;
        this.f7099d = true;
    }

    public final void q() {
        d(m.SENSITIVE);
    }

    public final void p() {
        d(m.INSENSITIVE);
    }

    public final void s() {
        d(m.STRICT);
    }

    public final void r() {
        d(m.LENIENT);
    }

    public final void k(j$.time.temporal.r rVar, int i) {
        Objects.requireNonNull(rVar, "field");
        if (i < 1 || i > 19) {
            throw new IllegalArgumentException("The width must be from 1 to 19 inclusive but was " + i);
        }
        j(new i(rVar, i, i, z.NOT_NEGATIVE));
    }

    public final void l(j$.time.temporal.r rVar, int i, int i5, z zVar) {
        if (i == i5 && zVar == z.NOT_NEGATIVE) {
            k(rVar, i5);
            return;
        }
        Objects.requireNonNull(rVar, "field");
        Objects.requireNonNull(zVar, "signStyle");
        if (i < 1 || i > 19) {
            throw new IllegalArgumentException("The minimum width must be from 1 to 19 inclusive but was " + i);
        }
        if (i5 < 1 || i5 > 19) {
            throw new IllegalArgumentException("The maximum width must be from 1 to 19 inclusive but was " + i5);
        }
        if (i5 < i) {
            throw new IllegalArgumentException("The maximum width must exceed or equal the minimum width but " + i5 + " < " + i);
        }
        j(new i(rVar, i, i5, zVar));
    }

    private void j(i iVar) {
        i iVarC;
        p pVar = this.f7096a;
        int i = pVar.f7100e;
        if (i >= 0) {
            i iVar2 = (i) pVar.f7098c.get(i);
            int i5 = iVar.f7071b;
            int i6 = iVar.f7072c;
            if (i5 == i6 && iVar.f7073d == z.NOT_NEGATIVE) {
                iVarC = iVar2.d(i6);
                d(iVar.c());
                this.f7096a.f7100e = i;
            } else {
                iVarC = iVar2.c();
                this.f7096a.f7100e = d(iVar);
            }
            this.f7096a.f7098c.set(i, iVarC);
            return;
        }
        pVar.f7100e = d(iVar);
    }

    public final void b(j$.time.temporal.a aVar) {
        g gVar = new g(aVar, 0, 9, true, 0);
        Objects.requireNonNull(aVar, "field");
        if (aVar.B().g()) {
            d(gVar);
        } else {
            throw new IllegalArgumentException("Field must have a fixed set of values: " + aVar);
        }
    }

    public final void i(j$.time.temporal.a aVar, HashMap map) {
        Objects.requireNonNull(aVar, "field");
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        A a5 = A.FULL;
        d(new o(aVar, a5, new b(new v(Collections.singletonMap(a5, linkedHashMap)))));
    }

    public final void c() {
        d(new h());
    }

    public final void h() {
        d(j.f7076e);
    }

    public final void g(String str, String str2) {
        d(new j(str, str2));
    }

    public final void m() {
        d(new n(f7095f, 1));
    }

    public final void e(char c5) {
        d(new d(c5));
    }

    public final void f(String str) {
        if (str.isEmpty()) {
            return;
        }
        if (str.length() == 1) {
            d(new d(str.charAt(0)));
        } else {
            d(new n(str, 0));
        }
    }

    public final void a(DateTimeFormatter dateTimeFormatter) {
        Objects.requireNonNull(dateTimeFormatter, "formatter");
        d(dateTimeFormatter.f());
    }

    public final void o() {
        p pVar = this.f7096a;
        pVar.f7100e = -1;
        this.f7096a = new p(pVar);
    }

    public final void n() {
        p pVar = this.f7096a;
        if (pVar.f7097b == null) {
            throw new IllegalStateException("Cannot call optionalEnd() as there was no previous call to optionalStart()");
        }
        if (pVar.f7098c.size() > 0) {
            p pVar2 = this.f7096a;
            e eVar = new e(pVar2.f7098c, pVar2.f7099d);
            this.f7096a = this.f7096a.f7097b;
            d(eVar);
            return;
        }
        this.f7096a = this.f7096a.f7097b;
    }

    private int d(f fVar) {
        Objects.requireNonNull(fVar, "pp");
        p pVar = this.f7096a;
        pVar.getClass();
        pVar.f7098c.add(fVar);
        this.f7096a.f7100e = -1;
        return r2.f7098c.size() - 1;
    }

    public final DateTimeFormatter t() {
        return v(Locale.getDefault(), y.SMART, null);
    }

    final DateTimeFormatter u(y yVar, j$.time.chrono.s sVar) {
        return v(Locale.getDefault(), yVar, sVar);
    }

    private DateTimeFormatter v(Locale locale, y yVar, j$.time.chrono.s sVar) {
        Objects.requireNonNull(locale, "locale");
        while (this.f7096a.f7097b != null) {
            n();
        }
        e eVar = new e(this.f7098c, false);
        w wVar = w.f7114a;
        return new DateTimeFormatter(eVar, locale, yVar, sVar);
    }
}

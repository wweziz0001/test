package j$.time.format;

import j$.time.ZoneId;
import j$.time.chrono.InterfaceC0509b;
import j$.time.temporal.TemporalAccessor;
import java.util.Locale;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
final class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private TemporalAccessor f7109a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private DateTimeFormatter f7110b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f7111c;

    t(TemporalAccessor temporalAccessor, DateTimeFormatter dateTimeFormatter) {
        j$.time.chrono.l lVarA = dateTimeFormatter.a();
        if (lVarA != null) {
            j$.time.chrono.l lVar = (j$.time.chrono.l) temporalAccessor.a(j$.time.temporal.s.a());
            ZoneId zoneId = (ZoneId) temporalAccessor.a(j$.time.temporal.s.g());
            InterfaceC0509b interfaceC0509bS = null;
            lVarA = Objects.equals(lVarA, lVar) ? null : lVarA;
            if (lVarA != null) {
                j$.time.chrono.l lVar2 = lVarA != null ? lVarA : lVar;
                if (lVarA != null) {
                    if (temporalAccessor.f(j$.time.temporal.a.EPOCH_DAY)) {
                        interfaceC0509bS = lVar2.s(temporalAccessor);
                    } else if (lVarA != j$.time.chrono.s.f7036d || lVar != null) {
                        for (j$.time.temporal.a aVar : j$.time.temporal.a.values()) {
                            if (aVar.S() && temporalAccessor.f(aVar)) {
                                throw new j$.time.c("Unable to apply override chronology '" + lVarA + "' because the temporal object being formatted contains date fields but does not represent a whole date: " + temporalAccessor);
                            }
                        }
                    }
                }
                temporalAccessor = new s(interfaceC0509bS, temporalAccessor, lVar2, zoneId);
            }
        }
        this.f7109a = temporalAccessor;
        this.f7110b = dateTimeFormatter;
    }

    final TemporalAccessor d() {
        return this.f7109a;
    }

    final Locale c() {
        return this.f7110b.c();
    }

    final w b() {
        return this.f7110b.b();
    }

    final void g() {
        this.f7111c++;
    }

    final void a() {
        this.f7111c--;
    }

    final Object f(C0518a c0518a) {
        TemporalAccessor temporalAccessor = this.f7109a;
        Object objA = temporalAccessor.a(c0518a);
        if (objA != null || this.f7111c != 0) {
            return objA;
        }
        throw new j$.time.c("Unable to extract " + c0518a + " from temporal " + temporalAccessor);
    }

    final Long e(j$.time.temporal.r rVar) {
        int i = this.f7111c;
        TemporalAccessor temporalAccessor = this.f7109a;
        if (i <= 0 || temporalAccessor.f(rVar)) {
            return Long.valueOf(temporalAccessor.g(rVar));
        }
        return null;
    }

    public final String toString() {
        return this.f7109a.toString();
    }
}

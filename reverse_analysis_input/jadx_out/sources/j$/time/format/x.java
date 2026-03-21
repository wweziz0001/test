package j$.time.format;

import j$.time.Instant;
import j$.time.ZoneId;
import j$.time.chrono.AbstractC0508a;
import j$.time.chrono.InterfaceC0509b;
import j$.time.temporal.TemporalAccessor;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
final class x implements TemporalAccessor {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    ZoneId f7116b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    j$.time.chrono.l f7117c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    boolean f7118d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private y f7119e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private InterfaceC0509b f7120f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private j$.time.l f7121g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final HashMap f7115a = new HashMap();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    j$.time.t f7122h = j$.time.t.f7154d;

    x() {
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final boolean f(j$.time.temporal.r rVar) {
        if (this.f7115a.containsKey(rVar)) {
            return true;
        }
        InterfaceC0509b interfaceC0509b = this.f7120f;
        if (interfaceC0509b != null && interfaceC0509b.f(rVar)) {
            return true;
        }
        j$.time.l lVar = this.f7121g;
        if (lVar == null || !lVar.f(rVar)) {
            return (rVar == null || (rVar instanceof j$.time.temporal.a) || !rVar.V(this)) ? false : true;
        }
        return true;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long g(j$.time.temporal.r rVar) {
        Objects.requireNonNull(rVar, "field");
        Long l3 = (Long) this.f7115a.get(rVar);
        if (l3 != null) {
            return l3.longValue();
        }
        InterfaceC0509b interfaceC0509b = this.f7120f;
        if (interfaceC0509b != null && interfaceC0509b.f(rVar)) {
            return this.f7120f.g(rVar);
        }
        j$.time.l lVar = this.f7121g;
        if (lVar != null && lVar.f(rVar)) {
            return this.f7121g.g(rVar);
        }
        if (rVar instanceof j$.time.temporal.a) {
            throw new j$.time.temporal.v(j$.time.d.a("Unsupported field: ", rVar));
        }
        return rVar.r(this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final Object a(j$.time.temporal.t tVar) {
        if (tVar == j$.time.temporal.s.g()) {
            return this.f7116b;
        }
        if (tVar == j$.time.temporal.s.a()) {
            return this.f7117c;
        }
        if (tVar == j$.time.temporal.s.b()) {
            InterfaceC0509b interfaceC0509b = this.f7120f;
            if (interfaceC0509b != null) {
                return j$.time.h.I(interfaceC0509b);
            }
            return null;
        }
        if (tVar == j$.time.temporal.s.c()) {
            return this.f7121g;
        }
        if (tVar == j$.time.temporal.s.d()) {
            Long l3 = (Long) this.f7115a.get(j$.time.temporal.a.OFFSET_SECONDS);
            if (l3 != null) {
                return j$.time.z.b0(l3.intValue());
            }
            ZoneId zoneId = this.f7116b;
            return zoneId instanceof j$.time.z ? zoneId : tVar.j(this);
        }
        if (tVar == j$.time.temporal.s.f()) {
            return tVar.j(this);
        }
        if (tVar == j$.time.temporal.s.e()) {
            return null;
        }
        return tVar.j(this);
    }

    /* JADX WARN: Removed duplicated region for block: B:73:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01cc  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    final void r(j$.time.format.y r24) {
        /*
            Method dump skipped, instruction units count: 748
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.time.format.x.r(j$.time.format.y):void");
    }

    private void C(j$.time.temporal.r rVar, j$.time.temporal.a aVar, Long l3) {
        Long l4 = (Long) this.f7115a.put(aVar, l3);
        if (l4 == null || l4.longValue() == l3.longValue()) {
            return;
        }
        throw new j$.time.c("Conflict found: " + aVar + " " + l4 + " differs from " + aVar + " " + l3 + " while resolving  " + rVar);
    }

    private void s() {
        HashMap map = this.f7115a;
        if (map.containsKey(j$.time.temporal.a.INSTANT_SECONDS)) {
            ZoneId zoneId = this.f7116b;
            if (zoneId != null) {
                v(zoneId);
                return;
            }
            Long l3 = (Long) map.get(j$.time.temporal.a.OFFSET_SECONDS);
            if (l3 != null) {
                v(j$.time.z.b0(l3.intValue()));
            }
        }
    }

    private void v(ZoneId zoneId) {
        HashMap map = this.f7115a;
        j$.time.temporal.a aVar = j$.time.temporal.a.INSTANT_SECONDS;
        B(this.f7117c.x(Instant.S(((Long) map.remove(aVar)).longValue()), zoneId).o());
        C(aVar, j$.time.temporal.a.SECOND_OF_DAY, Long.valueOf(r5.n().l0()));
    }

    private void B(InterfaceC0509b interfaceC0509b) {
        InterfaceC0509b interfaceC0509b2 = this.f7120f;
        if (interfaceC0509b2 != null) {
            if (interfaceC0509b == null || interfaceC0509b2.equals(interfaceC0509b)) {
                return;
            }
            throw new j$.time.c("Conflict found: Fields resolved to two different dates: " + this.f7120f + " " + interfaceC0509b);
        }
        if (interfaceC0509b != null) {
            if (!((AbstractC0508a) this.f7117c).equals(interfaceC0509b.h())) {
                throw new j$.time.c("ChronoLocalDate must use the effective parsed chronology: " + this.f7117c);
            }
            this.f7120f = interfaceC0509b;
        }
    }

    private void x() {
        HashMap map = this.f7115a;
        j$.time.temporal.a aVar = j$.time.temporal.a.CLOCK_HOUR_OF_DAY;
        if (map.containsKey(aVar)) {
            long jLongValue = ((Long) map.remove(aVar)).longValue();
            y yVar = this.f7119e;
            if (yVar == y.STRICT || (yVar == y.SMART && jLongValue != 0)) {
                aVar.Z(jLongValue);
            }
            j$.time.temporal.a aVar2 = j$.time.temporal.a.HOUR_OF_DAY;
            if (jLongValue == 24) {
                jLongValue = 0;
            }
            C(aVar, aVar2, Long.valueOf(jLongValue));
        }
        j$.time.temporal.a aVar3 = j$.time.temporal.a.CLOCK_HOUR_OF_AMPM;
        if (map.containsKey(aVar3)) {
            long jLongValue2 = ((Long) map.remove(aVar3)).longValue();
            y yVar2 = this.f7119e;
            if (yVar2 == y.STRICT || (yVar2 == y.SMART && jLongValue2 != 0)) {
                aVar3.Z(jLongValue2);
            }
            C(aVar3, j$.time.temporal.a.HOUR_OF_AMPM, Long.valueOf(jLongValue2 != 12 ? jLongValue2 : 0L));
        }
        j$.time.temporal.a aVar4 = j$.time.temporal.a.AMPM_OF_DAY;
        if (map.containsKey(aVar4)) {
            j$.time.temporal.a aVar5 = j$.time.temporal.a.HOUR_OF_AMPM;
            if (map.containsKey(aVar5)) {
                long jLongValue3 = ((Long) map.remove(aVar4)).longValue();
                long jLongValue4 = ((Long) map.remove(aVar5)).longValue();
                if (this.f7119e == y.LENIENT) {
                    C(aVar4, j$.time.temporal.a.HOUR_OF_DAY, Long.valueOf(Math.addExact(Math.multiplyExact(jLongValue3, 12), jLongValue4)));
                } else {
                    aVar4.Z(jLongValue3);
                    aVar5.Z(jLongValue3);
                    C(aVar4, j$.time.temporal.a.HOUR_OF_DAY, Long.valueOf((jLongValue3 * 12) + jLongValue4));
                }
            }
        }
        j$.time.temporal.a aVar6 = j$.time.temporal.a.NANO_OF_DAY;
        if (map.containsKey(aVar6)) {
            long jLongValue5 = ((Long) map.remove(aVar6)).longValue();
            if (this.f7119e != y.LENIENT) {
                aVar6.Z(jLongValue5);
            }
            C(aVar6, j$.time.temporal.a.HOUR_OF_DAY, Long.valueOf(jLongValue5 / 3600000000000L));
            C(aVar6, j$.time.temporal.a.MINUTE_OF_HOUR, Long.valueOf((jLongValue5 / 60000000000L) % 60));
            C(aVar6, j$.time.temporal.a.SECOND_OF_MINUTE, Long.valueOf((jLongValue5 / 1000000000) % 60));
            C(aVar6, j$.time.temporal.a.NANO_OF_SECOND, Long.valueOf(jLongValue5 % 1000000000));
        }
        j$.time.temporal.a aVar7 = j$.time.temporal.a.MICRO_OF_DAY;
        if (map.containsKey(aVar7)) {
            long jLongValue6 = ((Long) map.remove(aVar7)).longValue();
            if (this.f7119e != y.LENIENT) {
                aVar7.Z(jLongValue6);
            }
            C(aVar7, j$.time.temporal.a.SECOND_OF_DAY, Long.valueOf(jLongValue6 / 1000000));
            C(aVar7, j$.time.temporal.a.MICRO_OF_SECOND, Long.valueOf(jLongValue6 % 1000000));
        }
        j$.time.temporal.a aVar8 = j$.time.temporal.a.MILLI_OF_DAY;
        if (map.containsKey(aVar8)) {
            long jLongValue7 = ((Long) map.remove(aVar8)).longValue();
            if (this.f7119e != y.LENIENT) {
                aVar8.Z(jLongValue7);
            }
            C(aVar8, j$.time.temporal.a.SECOND_OF_DAY, Long.valueOf(jLongValue7 / 1000));
            C(aVar8, j$.time.temporal.a.MILLI_OF_SECOND, Long.valueOf(jLongValue7 % 1000));
        }
        j$.time.temporal.a aVar9 = j$.time.temporal.a.SECOND_OF_DAY;
        if (map.containsKey(aVar9)) {
            long jLongValue8 = ((Long) map.remove(aVar9)).longValue();
            if (this.f7119e != y.LENIENT) {
                aVar9.Z(jLongValue8);
            }
            C(aVar9, j$.time.temporal.a.HOUR_OF_DAY, Long.valueOf(jLongValue8 / 3600));
            C(aVar9, j$.time.temporal.a.MINUTE_OF_HOUR, Long.valueOf((jLongValue8 / 60) % 60));
            C(aVar9, j$.time.temporal.a.SECOND_OF_MINUTE, Long.valueOf(jLongValue8 % 60));
        }
        j$.time.temporal.a aVar10 = j$.time.temporal.a.MINUTE_OF_DAY;
        if (map.containsKey(aVar10)) {
            long jLongValue9 = ((Long) map.remove(aVar10)).longValue();
            if (this.f7119e != y.LENIENT) {
                aVar10.Z(jLongValue9);
            }
            C(aVar10, j$.time.temporal.a.HOUR_OF_DAY, Long.valueOf(jLongValue9 / 60));
            C(aVar10, j$.time.temporal.a.MINUTE_OF_HOUR, Long.valueOf(jLongValue9 % 60));
        }
        j$.time.temporal.a aVar11 = j$.time.temporal.a.NANO_OF_SECOND;
        if (map.containsKey(aVar11)) {
            long jLongValue10 = ((Long) map.get(aVar11)).longValue();
            y yVar3 = this.f7119e;
            y yVar4 = y.LENIENT;
            if (yVar3 != yVar4) {
                aVar11.Z(jLongValue10);
            }
            j$.time.temporal.a aVar12 = j$.time.temporal.a.MICRO_OF_SECOND;
            if (map.containsKey(aVar12)) {
                long jLongValue11 = ((Long) map.remove(aVar12)).longValue();
                if (this.f7119e != yVar4) {
                    aVar12.Z(jLongValue11);
                }
                jLongValue10 = (jLongValue10 % 1000) + (jLongValue11 * 1000);
                C(aVar12, aVar11, Long.valueOf(jLongValue10));
            }
            j$.time.temporal.a aVar13 = j$.time.temporal.a.MILLI_OF_SECOND;
            if (map.containsKey(aVar13)) {
                long jLongValue12 = ((Long) map.remove(aVar13)).longValue();
                if (this.f7119e != yVar4) {
                    aVar13.Z(jLongValue12);
                }
                C(aVar13, aVar11, Long.valueOf((jLongValue10 % 1000000) + (jLongValue12 * 1000000)));
            }
        }
        j$.time.temporal.a aVar14 = j$.time.temporal.a.HOUR_OF_DAY;
        if (map.containsKey(aVar14)) {
            j$.time.temporal.a aVar15 = j$.time.temporal.a.MINUTE_OF_HOUR;
            if (map.containsKey(aVar15)) {
                j$.time.temporal.a aVar16 = j$.time.temporal.a.SECOND_OF_MINUTE;
                if (map.containsKey(aVar16) && map.containsKey(aVar11)) {
                    w(((Long) map.remove(aVar14)).longValue(), ((Long) map.remove(aVar15)).longValue(), ((Long) map.remove(aVar16)).longValue(), ((Long) map.remove(aVar11)).longValue());
                }
            }
        }
    }

    private void w(long j5, long j6, long j7, long j8) {
        if (this.f7119e == y.LENIENT) {
            long jAddExact = Math.addExact(Math.addExact(Math.addExact(Math.multiplyExact(j5, 3600000000000L), Math.multiplyExact(j6, 60000000000L)), Math.multiplyExact(j7, 1000000000L)), j8);
            z(j$.time.l.c0(Math.floorMod(jAddExact, 86400000000000L)), j$.time.t.b((int) Math.floorDiv(jAddExact, 86400000000000L)));
            return;
        }
        int iY = j$.time.temporal.a.MINUTE_OF_HOUR.Y(j6);
        int iY2 = j$.time.temporal.a.NANO_OF_SECOND.Y(j8);
        if (this.f7119e == y.SMART && j5 == 24 && iY == 0 && j7 == 0 && iY2 == 0) {
            z(j$.time.l.f7137g, j$.time.t.b(1));
        } else {
            z(j$.time.l.b0(j$.time.temporal.a.HOUR_OF_DAY.Y(j5), iY, j$.time.temporal.a.SECOND_OF_MINUTE.Y(j7), iY2), j$.time.t.f7154d);
        }
    }

    private void z(j$.time.l lVar, j$.time.t tVar) {
        j$.time.l lVar2 = this.f7121g;
        if (lVar2 != null) {
            if (!lVar2.equals(lVar)) {
                throw new j$.time.c("Conflict found: Fields resolved to different times: " + this.f7121g + " " + lVar);
            }
            j$.time.t tVar2 = this.f7122h;
            tVar2.getClass();
            j$.time.t tVar3 = j$.time.t.f7154d;
            if (tVar2 != tVar3 && tVar != tVar3 && !this.f7122h.equals(tVar)) {
                throw new j$.time.c("Conflict found: Fields resolved to different excess periods: " + this.f7122h + " " + tVar);
            }
            this.f7122h = tVar;
            return;
        }
        this.f7121g = lVar;
        this.f7122h = tVar;
    }

    private void q(TemporalAccessor temporalAccessor) {
        Iterator it = this.f7115a.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            j$.time.temporal.r rVar = (j$.time.temporal.r) entry.getKey();
            if (temporalAccessor.f(rVar)) {
                try {
                    long jG = temporalAccessor.g(rVar);
                    long jLongValue = ((Long) entry.getValue()).longValue();
                    if (jG != jLongValue) {
                        throw new j$.time.c("Conflict found: Field " + rVar + " " + jG + " differs from " + rVar + " " + jLongValue + " derived from " + temporalAccessor);
                    }
                    it.remove();
                } catch (RuntimeException unused) {
                    continue;
                }
            }
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(64);
        sb.append(this.f7115a);
        sb.append(',');
        sb.append(this.f7117c);
        if (this.f7116b != null) {
            sb.append(',');
            sb.append(this.f7116b);
        }
        if (this.f7120f != null || this.f7121g != null) {
            sb.append(" resolved to ");
            InterfaceC0509b interfaceC0509b = this.f7120f;
            if (interfaceC0509b != null) {
                sb.append(interfaceC0509b);
                if (this.f7121g != null) {
                    sb.append('T');
                    sb.append(this.f7121g);
                }
            } else {
                sb.append(this.f7121g);
            }
        }
        return sb.toString();
    }
}

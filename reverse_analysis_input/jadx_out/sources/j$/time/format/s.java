package j$.time.format;

import j$.time.ZoneId;
import j$.time.chrono.InterfaceC0509b;
import j$.time.temporal.TemporalAccessor;

/* JADX INFO: loaded from: classes2.dex */
final class s implements TemporalAccessor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ InterfaceC0509b f7105a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ TemporalAccessor f7106b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ j$.time.chrono.l f7107c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ ZoneId f7108d;

    s(InterfaceC0509b interfaceC0509b, TemporalAccessor temporalAccessor, j$.time.chrono.l lVar, ZoneId zoneId) {
        this.f7105a = interfaceC0509b;
        this.f7106b = temporalAccessor;
        this.f7107c = lVar;
        this.f7108d = zoneId;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final boolean f(j$.time.temporal.r rVar) {
        InterfaceC0509b interfaceC0509b = this.f7105a;
        if (interfaceC0509b != null && rVar.S()) {
            return interfaceC0509b.f(rVar);
        }
        return this.f7106b.f(rVar);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final j$.time.temporal.w l(j$.time.temporal.r rVar) {
        InterfaceC0509b interfaceC0509b = this.f7105a;
        if (interfaceC0509b != null && rVar.S()) {
            return interfaceC0509b.l(rVar);
        }
        return this.f7106b.l(rVar);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long g(j$.time.temporal.r rVar) {
        InterfaceC0509b interfaceC0509b = this.f7105a;
        if (interfaceC0509b != null && rVar.S()) {
            return interfaceC0509b.g(rVar);
        }
        return this.f7106b.g(rVar);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final Object a(j$.time.temporal.t tVar) {
        if (tVar == j$.time.temporal.s.a()) {
            return this.f7107c;
        }
        if (tVar == j$.time.temporal.s.g()) {
            return this.f7108d;
        }
        if (tVar == j$.time.temporal.s.e()) {
            return this.f7106b.a(tVar);
        }
        return tVar.j(this);
    }

    public final String toString() {
        String str;
        String str2 = "";
        j$.time.chrono.l lVar = this.f7107c;
        if (lVar != null) {
            str = " with chronology " + lVar;
        } else {
            str = "";
        }
        ZoneId zoneId = this.f7108d;
        if (zoneId != null) {
            str2 = " with zone " + zoneId;
        }
        return this.f7106b + str + str2;
    }
}

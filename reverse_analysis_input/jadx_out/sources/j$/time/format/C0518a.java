package j$.time.format;

import j$.time.ZoneId;
import j$.time.temporal.TemporalAccessor;

/* JADX INFO: renamed from: j$.time.format.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C0518a implements j$.time.temporal.t {
    @Override // j$.time.temporal.t
    public final Object j(TemporalAccessor temporalAccessor) {
        ZoneId zoneId = (ZoneId) temporalAccessor.a(j$.time.temporal.s.g());
        if (zoneId == null || (zoneId instanceof j$.time.z)) {
            return null;
        }
        return zoneId;
    }
}

package j$.time.temporal;

import j$.time.format.y;
import java.util.HashMap;

/* JADX INFO: loaded from: classes2.dex */
public interface r {
    w B();

    w I(TemporalAccessor temporalAccessor);

    boolean S();

    boolean V(TemporalAccessor temporalAccessor);

    m p(m mVar, long j5);

    long r(TemporalAccessor temporalAccessor);

    default TemporalAccessor R(HashMap map, TemporalAccessor temporalAccessor, y yVar) {
        return null;
    }
}

package j$.time.temporal;

/* JADX INFO: loaded from: classes2.dex */
public interface m extends TemporalAccessor {
    m b(long j5, r rVar);

    m d(long j5, u uVar);

    /* JADX INFO: renamed from: j */
    m m(j$.time.h hVar);

    default m e(long j5, u uVar) {
        return j5 == Long.MIN_VALUE ? d(Long.MAX_VALUE, uVar).d(1L, uVar) : d(-j5, uVar);
    }
}

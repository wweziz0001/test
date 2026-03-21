package c1;

import java.util.List;
import m2.I;

/* JADX INFO: renamed from: c1.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0318a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final I f5028a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f5029b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f5030c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f5031d;

    public C0318a(List list, long j5, long j6) {
        this.f5028a = I.p(list);
        this.f5029b = j5;
        this.f5030c = j6;
        long j7 = -9223372036854775807L;
        if (j5 != -9223372036854775807L && j6 != -9223372036854775807L) {
            j7 = j5 + j6;
        }
        this.f5031d = j7;
    }
}

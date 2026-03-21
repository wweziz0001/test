package x0;

import d0.AbstractC0360m;
import java.io.IOException;

/* JADX INFO: renamed from: x0.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0965f extends IOException {
    public C0965f(int i) {
        this(i, -9223372036854775807L, -9223372036854775807L);
    }

    public C0965f(int i, long j5, long j6) {
        String str;
        StringBuilder sb = new StringBuilder("Illegal clipping: ");
        if (i != 0) {
            if (i == 1) {
                str = "not seekable to start";
            } else if (i != 2) {
                str = "unknown";
            } else {
                AbstractC0360m.h((j5 == -9223372036854775807L || j6 == -9223372036854775807L) ? false : true);
                str = "start exceeds end. Start time: " + j5 + ", End time: " + j6;
            }
        } else {
            str = "invalid period count";
        }
        sb.append(str);
        super(sb.toString());
    }
}

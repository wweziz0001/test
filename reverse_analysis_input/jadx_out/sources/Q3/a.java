package Q3;

import N3.h;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

/* JADX INFO: loaded from: classes.dex */
public final class a extends P3.a {
    @Override // P3.a
    public final Random a() {
        ThreadLocalRandom threadLocalRandomCurrent = ThreadLocalRandom.current();
        h.d(threadLocalRandomCurrent, "current(...)");
        return threadLocalRandomCurrent;
    }
}

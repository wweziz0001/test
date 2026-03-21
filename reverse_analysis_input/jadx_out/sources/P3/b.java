package P3;

import N3.h;
import java.util.Random;

/* JADX INFO: loaded from: classes.dex */
public final class b extends a {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final E2.a f1699n = new E2.a(4);

    @Override // P3.a
    public final Random a() {
        Object obj = this.f1699n.get();
        h.d(obj, "get(...)");
        return (Random) obj;
    }
}

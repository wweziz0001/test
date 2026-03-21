package E2;

import v2.AbstractC0919a;

/* JADX INFO: loaded from: classes.dex */
public final class j {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final j f663b = new j(new A0.b(6));

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final j f664c = new j(new A0.b(10));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i f665a;

    static {
        new j(new A0.b(12));
        new j(new A0.b(11));
        new j(new A0.b(7));
        new j(new A0.b(9));
        new j(new A0.b(8));
    }

    public j(A0.b bVar) {
        if (AbstractC0919a.f10358b.get()) {
            this.f665a = new i(bVar, 2);
        } else if ("The Android Project".equals(System.getProperty("java.vendor"))) {
            this.f665a = new i(bVar, 0);
        } else {
            this.f665a = new i(bVar, 1);
        }
    }
}

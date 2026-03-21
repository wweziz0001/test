package J2;

import java.util.Date;

/* JADX INFO: renamed from: J2.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0072e implements G2.s {
    @Override // G2.s
    public final G2.r create(G2.e eVar, N2.a aVar) {
        if (aVar.f1601a == Date.class) {
            return new C0075h(AbstractC0074g.f1126a);
        }
        return null;
    }

    public final String toString() {
        return "DefaultDateTypeAdapter#DEFAULT_STYLE_FACTORY";
    }
}

package L;

import java.util.LinkedHashSet;

/* JADX INFO: renamed from: L.m, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0105m extends N3.i implements M3.a {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f1416m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ P f1417n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0105m(P p4, int i) {
        super(0);
        this.f1416m = i;
        this.f1417n = p4;
    }

    @Override // M3.a
    public final Object d() {
        switch (this.f1416m) {
            case 0:
                return ((N.i) this.f1417n.f1340u.a()).f1549c;
            default:
                N.f fVar = this.f1417n.f1331l;
                String strN = ((g4.l) fVar.f1533d.a()).f5857l.n();
                synchronized (N.f.f1529f) {
                    LinkedHashSet linkedHashSet = N.f.f1528e;
                    if (linkedHashSet.contains(strN)) {
                        throw new IllegalStateException(("There are multiple DataStores active for the same file: " + strN + ". You should either maintain your DataStore as a singleton or confirm that there is no two DataStore's active on the same file (by confirming that the scope is cancelled).").toString());
                    }
                    linkedHashSet.add(strN);
                }
                return new N.i(fVar.f1530a, (g4.l) fVar.f1533d.a(), (Z) fVar.f1531b.i((g4.l) fVar.f1533d.a(), fVar.f1530a), new N.e(fVar, 1));
        }
    }
}

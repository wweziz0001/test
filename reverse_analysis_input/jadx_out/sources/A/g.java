package A;

import java.util.ArrayList;
import q.C0739i;

/* JADX INFO: loaded from: classes.dex */
public final class g implements C.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f19b;

    public /* synthetic */ g(Object obj, int i) {
        this.f18a = i;
        this.f19b = obj;
    }

    @Override // C.a
    public final void accept(Object obj) {
        switch (this.f18a) {
            case 0:
                h hVar = (h) obj;
                if (hVar == null) {
                    hVar = new h(-3);
                }
                ((Z1.c) this.f19b).j(hVar);
                return;
            default:
                h hVar2 = (h) obj;
                synchronized (i.f24c) {
                    try {
                        C0739i c0739i = i.f25d;
                        ArrayList arrayList = (ArrayList) c0739i.getOrDefault((String) this.f19b, null);
                        if (arrayList == null) {
                            return;
                        }
                        c0739i.remove((String) this.f19b);
                        for (int i = 0; i < arrayList.size(); i++) {
                            ((C.a) arrayList.get(i)).accept(hVar2);
                        }
                        return;
                    } finally {
                    }
                }
        }
    }
}

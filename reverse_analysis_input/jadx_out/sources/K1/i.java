package K1;

import X3.q;
import X3.r;
import io.flutter.embedding.android.D;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class i implements C.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1251a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f1252b;

    public /* synthetic */ i(Object obj, int i) {
        this.f1251a = i;
        this.f1252b = obj;
    }

    @Override // C.a
    public final void accept(Object obj) {
        switch (this.f1251a) {
            case 0:
                ((q) ((r) this.f1252b)).e((l) obj);
                break;
            default:
                ((D) this.f1252b).setWindowInfoListenerDisplayFeatures((l) obj);
                break;
        }
    }
}

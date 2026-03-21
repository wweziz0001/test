package W1;

import N3.h;
import Z1.p;
import android.os.Build;

/* JADX INFO: loaded from: classes.dex */
public final class a extends d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f2459b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f2460c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(X1.f fVar, int i) {
        super(fVar);
        this.f2459b = i;
        switch (i) {
            case 2:
                h.e(fVar, "tracker");
                super(fVar);
                this.f2460c = 7;
                break;
            case 3:
                h.e(fVar, "tracker");
                super(fVar);
                this.f2460c = 7;
                break;
            case 4:
                h.e(fVar, "tracker");
                super(fVar);
                this.f2460c = 9;
                break;
            default:
                h.e(fVar, "tracker");
                this.f2460c = 6;
                break;
        }
    }

    @Override // W1.d
    public final int a() {
        switch (this.f2459b) {
        }
        return this.f2460c;
    }

    @Override // W1.d
    public final boolean b(p pVar) {
        switch (this.f2459b) {
            case 0:
                return pVar.f3054j.f1809b;
            case 1:
                return pVar.f3054j.f1811d;
            case 2:
                return pVar.f3054j.f1808a == 2;
            case 3:
                int i = pVar.f3054j.f1808a;
                return i == 3 || (Build.VERSION.SDK_INT >= 30 && i == 6);
            default:
                return pVar.f3054j.f1812e;
        }
    }

    @Override // W1.d
    public final boolean c(Object obj) {
        switch (this.f2459b) {
            case 0:
                return !((Boolean) obj).booleanValue();
            case 1:
                return !((Boolean) obj).booleanValue();
            case 2:
                V1.d dVar = (V1.d) obj;
                h.e(dVar, "value");
                int i = Build.VERSION.SDK_INT;
                boolean z4 = dVar.f2352a;
                if (i >= 26) {
                    if (!z4 || !dVar.f2353b) {
                        return true;
                    }
                } else if (!z4) {
                    return true;
                }
                return false;
            case 3:
                V1.d dVar2 = (V1.d) obj;
                h.e(dVar2, "value");
                return !dVar2.f2352a || dVar2.f2354c;
            default:
                return !((Boolean) obj).booleanValue();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(X1.a aVar) {
        super(aVar);
        this.f2459b = 1;
        h.e(aVar, "tracker");
        this.f2460c = 5;
    }
}

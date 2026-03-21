package y3;

import a.AbstractC0149a;
import android.webkit.ValueCallback;

/* JADX INFO: renamed from: y3.m, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1042m implements ValueCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11079a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ M3.l f11080b;

    public /* synthetic */ C1042m(int i, M3.l lVar) {
        this.f11079a = i;
        this.f11080b = lVar;
    }

    @Override // android.webkit.ValueCallback
    public final void onReceiveValue(Object obj) {
        switch (this.f11079a) {
            case 0:
                Boolean bool = (Boolean) obj;
                C1054y c1054y = (C1054y) this.f11080b;
                N3.s.a(1, c1054y);
                Throwable thA = B3.d.a(bool);
                Z1.l lVar = (Z1.l) c1054y.f11114m;
                if (thA == null) {
                    lVar.u(AbstractC0149a.y(bool));
                } else {
                    lVar.u(Z1.f.Q(thA));
                }
                break;
            default:
                String str = (String) obj;
                C1054y c1054y2 = (C1054y) this.f11080b;
                N3.s.a(1, c1054y2);
                Throwable thA2 = B3.d.a(str);
                Z1.l lVar2 = (Z1.l) c1054y2.f11114m;
                if (thA2 == null) {
                    lVar2.u(AbstractC0149a.y(str));
                } else {
                    lVar2.u(Z1.f.Q(thA2));
                }
                break;
        }
    }
}

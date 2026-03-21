package J2;

import java.util.Calendar;
import java.util.GregorianCalendar;

/* JADX INFO: renamed from: J2.s, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0085s implements G2.s {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f1180l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Object f1181m;

    public /* synthetic */ C0085s(Object obj, int i) {
        this.f1180l = i;
        this.f1181m = obj;
    }

    @Override // G2.s
    public final G2.r create(G2.e eVar, N2.a aVar) {
        switch (this.f1180l) {
            case 0:
                if (aVar.f1601a == Number.class) {
                    return (C0086t) this.f1181m;
                }
                return null;
            case 1:
                if (aVar.f1601a == Object.class) {
                    return new C0087u(eVar, (G2.p) this.f1181m);
                }
                return null;
            default:
                Class cls = aVar.f1601a;
                if (cls == Calendar.class || cls == GregorianCalendar.class) {
                    return (X) this.f1181m;
                }
                return null;
        }
    }

    public String toString() {
        switch (this.f1180l) {
            case 2:
                return "Factory[type=" + Calendar.class.getName() + "+" + GregorianCalendar.class.getName() + ",adapter=" + ((X) this.f1181m) + "]";
            default:
                return super.toString();
        }
    }
}

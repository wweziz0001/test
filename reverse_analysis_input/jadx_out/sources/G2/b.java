package G2;

import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final class b extends r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f891a;

    @Override // G2.r
    public final Object b(O2.a aVar) throws IOException {
        switch (this.f891a) {
            case 0:
                if (aVar.E() != 9) {
                    return Double.valueOf(aVar.v());
                }
                aVar.A();
                return null;
            case 1:
                if (aVar.E() != 9) {
                    return Float.valueOf((float) aVar.v());
                }
                aVar.A();
                return null;
            default:
                aVar.K();
                return null;
        }
    }

    @Override // G2.r
    public final void c(O2.b bVar, Object obj) throws IOException {
        switch (this.f891a) {
            case 0:
                Number number = (Number) obj;
                if (number != null) {
                    double dDoubleValue = number.doubleValue();
                    e.a(dDoubleValue);
                    bVar.u(dDoubleValue);
                } else {
                    bVar.p();
                }
                break;
            case 1:
                Number numberValueOf = (Number) obj;
                if (numberValueOf != null) {
                    float fFloatValue = numberValueOf.floatValue();
                    e.a(fFloatValue);
                    if (!(numberValueOf instanceof Float)) {
                        numberValueOf = Float.valueOf(fFloatValue);
                    }
                    bVar.x(numberValueOf);
                } else {
                    bVar.p();
                }
                break;
            default:
                bVar.p();
                break;
        }
    }

    public String toString() {
        switch (this.f891a) {
            case 2:
                return "AnonymousOrNonStaticLocalClassAdapter";
            default:
                return super.toString();
        }
    }
}

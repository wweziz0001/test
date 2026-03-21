package J2;

import com.dexterous.flutterlocalnotifications.models.ScheduleMode;
import g2.C0439b;
import java.lang.reflect.Type;

/* JADX INFO: loaded from: classes.dex */
public final class D extends B {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C0439b f1102a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final G2.e f1103b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final N2.a f1104c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final G2.s f1105d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f1106e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public volatile G2.r f1107f;

    public D(C0439b c0439b, G2.e eVar, N2.a aVar, G2.s sVar, boolean z4) {
        this.f1102a = c0439b;
        this.f1103b = eVar;
        this.f1104c = aVar;
        this.f1105d = sVar;
        this.f1106e = z4;
    }

    @Override // G2.r
    public final Object b(O2.a aVar) {
        C0439b c0439b = this.f1102a;
        if (c0439b == null) {
            return e().b(aVar);
        }
        G2.g gVarI = I2.d.i(aVar);
        if (this.f1106e) {
            gVarI.getClass();
            if (gVarI instanceof G2.i) {
                return null;
            }
        }
        Type type = this.f1104c.f1602b;
        c0439b.getClass();
        try {
            return ScheduleMode.valueOf(gVarI.h());
        } catch (Exception unused) {
            return gVarI.f() ? ScheduleMode.exactAllowWhileIdle : ScheduleMode.exact;
        }
    }

    @Override // G2.r
    public final void c(O2.b bVar, Object obj) {
        e().c(bVar, obj);
    }

    @Override // J2.B
    public final G2.r d() {
        return e();
    }

    public final G2.r e() {
        G2.r rVar = this.f1107f;
        if (rVar != null) {
            return rVar;
        }
        G2.r rVarD = this.f1103b.d(this.f1105d, this.f1104c);
        this.f1107f = rVarD;
        return rVarD;
    }
}

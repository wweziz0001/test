package K1;

import android.content.Context;
import java.io.File;

/* JADX INFO: loaded from: classes.dex */
public final class j extends N3.i implements M3.a {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f1253m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Object f1254n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Object f1255o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j(Object obj, int i, Object obj2) {
        super(0);
        this.f1253m = i;
        this.f1254n = obj;
        this.f1255o = obj2;
    }

    @Override // M3.a
    public final Object d() {
        switch (this.f1253m) {
            case 0:
                ((L1.a) ((b) this.f1254n).f1237m).a((i) this.f1255o);
                return B3.g.f275a;
            case 1:
                Context context = (Context) this.f1254n;
                ((O.b) this.f1255o).getClass();
                String strConcat = "FlutterSharedPreferences".concat(".preferences_pb");
                N3.h.e(strConcat, "fileName");
                return new File(context.getApplicationContext().getFilesDir(), "datastore/".concat(strConcat));
            default:
                X1.f fVar = ((W1.d) this.f1254n).f2466a;
                W1.b bVar = (W1.b) this.f1255o;
                fVar.getClass();
                N3.h.e(bVar, "listener");
                synchronized (fVar.f2616c) {
                    if (fVar.f2617d.remove(bVar) && fVar.f2617d.isEmpty()) {
                        fVar.d();
                    }
                    break;
                }
                return B3.g.f275a;
        }
    }
}

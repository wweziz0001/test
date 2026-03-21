package G3;

import N3.h;
import N3.q;

/* JADX INFO: loaded from: classes.dex */
public abstract class f extends b implements N3.f {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final int f918o;

    public f(int i, E3.d dVar) {
        super(dVar);
        this.f918o = i;
    }

    @Override // N3.f
    public final int e() {
        return this.f918o;
    }

    @Override // G3.b
    public final String toString() {
        if (this.f913l != null) {
            return super.toString();
        }
        q.f1627a.getClass();
        String string = getClass().getGenericInterfaces()[0].toString();
        if (string.startsWith("kotlin.jvm.functions.")) {
            string = string.substring(21);
        }
        h.d(string, "renderLambdaToString(...)");
        return string;
    }
}

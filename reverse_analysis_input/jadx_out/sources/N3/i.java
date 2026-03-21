package N3;

import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public abstract class i implements f, Serializable {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f1620l;

    public i(int i) {
        this.f1620l = i;
    }

    @Override // N3.f
    public final int e() {
        return this.f1620l;
    }

    public final String toString() {
        q.f1627a.getClass();
        String string = getClass().getGenericInterfaces()[0].toString();
        if (string.startsWith("kotlin.jvm.functions.")) {
            string = string.substring(21);
        }
        h.d(string, "renderLambdaToString(...)");
        return string;
    }
}

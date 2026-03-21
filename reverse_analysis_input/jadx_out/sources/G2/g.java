package G2;

import J2.C0080m;
import J2.j0;
import java.io.IOException;
import java.io.StringWriter;

/* JADX INFO: loaded from: classes.dex */
public abstract class g {
    public boolean f() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    public final j g() {
        if (this instanceof j) {
            return (j) this;
        }
        throw new IllegalStateException("Not a JSON Object: " + this);
    }

    public String h() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    public final String toString() {
        try {
            StringWriter stringWriter = new StringWriter();
            O2.b bVar = new O2.b(stringWriter);
            bVar.f1660s = 1;
            j0.f1159z.getClass();
            C0080m.e(bVar, this);
            return stringWriter.toString();
        } catch (IOException e5) {
            throw new AssertionError(e5);
        }
    }
}

package D;

import android.view.DisplayCutout;
import android.view.WindowInsets;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public class X extends W {
    public X(b0 b0Var, WindowInsets windowInsets) {
        super(b0Var, windowInsets);
    }

    @Override // D.a0
    public b0 a() {
        return b0.c(this.f319c.consumeDisplayCutout(), null);
    }

    @Override // D.a0
    public C0004d e() {
        DisplayCutout displayCutout = this.f319c.getDisplayCutout();
        if (displayCutout == null) {
            return null;
        }
        return new C0004d(displayCutout);
    }

    @Override // D.V, D.a0
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof X)) {
            return false;
        }
        X x4 = (X) obj;
        return Objects.equals(this.f319c, x4.f319c) && Objects.equals(this.f321e, x4.f321e);
    }

    @Override // D.a0
    public int hashCode() {
        return this.f319c.hashCode();
    }
}

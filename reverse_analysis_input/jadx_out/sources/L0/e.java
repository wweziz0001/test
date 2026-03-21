package L0;

import N3.h;
import a.AbstractC0149a;
import a0.AbstractC0169U;
import a0.C0150A;
import a0.C0168T;
import a0.InterfaceC0164O;
import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import androidx.fragment.app.Y;
import com.google.crypto.tink.shaded.protobuf.AbstractC0321a;
import com.google.crypto.tink.shaded.protobuf.AbstractC0329i;
import d0.AbstractC0360m;
import d0.AbstractC0370w;
import h0.C0448G;
import h0.J;
import h0.N;
import h0.i0;
import h0.n0;
import io.flutter.embedding.android.D;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import r1.AbstractC0778s;
import r1.C0771l;
import x0.G;
import x0.j0;

/* JADX INFO: loaded from: classes.dex */
public abstract class e implements InterfaceC0164O {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f1479a;

    public static e b(AbstractC0778s abstractC0778s, int i) {
        if (i == 0) {
            return new C0771l(abstractC0778s, 0);
        }
        if (i == 1) {
            return new C0771l(abstractC0778s, 1);
        }
        throw new IllegalArgumentException("invalid orientation");
    }

    public abstract AbstractC0321a a(AbstractC0321a abstractC0321a);

    public abstract int c(View view);

    public abstract int d(View view);

    public abstract int e();

    public abstract C0150A f();

    public abstract G g(Context context);

    public abstract int h();

    public abstract int i();

    public boolean j() {
        Y y = (Y) this.f1479a;
        D d5 = y.f4329c.f4425Q;
        int iE = d5 != null ? AbstractC0149a.e(d5) : 0;
        int i = y.f4327a;
        return iE == i || !(iE == 2 || i == 2);
    }

    public Map k() {
        return Collections.emptyMap();
    }

    public void l(int i, int i5) {
        if (i != i5) {
            int i6 = i + 1;
            C0448G c0448g = (C0448G) this;
            c0448g.d0();
            AbstractC0360m.c(i >= 0 && i <= i6 && i5 >= 0);
            ArrayList arrayList = c0448g.f5957o;
            int size = arrayList.size();
            int iMin = Math.min(i6, size);
            int iMin2 = Math.min(i5, size - (iMin - i));
            if (i >= size || i == iMin || i == iMin2) {
                return;
            }
            AbstractC0169U abstractC0169UZ = c0448g.z();
            c0448g.f5918E++;
            AbstractC0370w.L(arrayList, i, iMin, iMin2);
            n0 n0Var = new n0(arrayList, c0448g.f5922I);
            i0 i0Var = c0448g.f5945d0;
            i0 i0VarH = c0448g.H(i0Var, n0Var, c0448g.C(abstractC0169UZ, n0Var, c0448g.A(i0Var), c0448g.t(c0448g.f5945d0)));
            j0 j0Var = c0448g.f5922I;
            N n4 = c0448g.f5953k;
            n4.getClass();
            n4.f6032t.a(19, new J(i, iMin, iMin2, j0Var)).b();
            c0448g.b0(i0VarH, 0, false, 5, -9223372036854775807L, -1, false);
        }
    }

    public abstract AbstractC0321a m(AbstractC0329i abstractC0329i);

    public abstract void n(int i, long j5, boolean z4);

    public abstract void o(AbstractC0321a abstractC0321a);

    public e() {
        this.f1479a = new C0168T();
    }

    public e(AbstractC0778s abstractC0778s) {
        new Rect();
        this.f1479a = abstractC0778s;
    }

    public e(Y y) {
        h.e(y, "operation");
        this.f1479a = y;
    }
}
